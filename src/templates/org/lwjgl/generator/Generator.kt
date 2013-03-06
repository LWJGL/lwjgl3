/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.BufferedOutputStream
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileFilter
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.OutputStreamWriter
import java.io.PrintWriter
import java.lang.Math.*
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.nio.Buffer
import java.nio.ByteBuffer
import java.nio.channels.FileChannel
import java.util.ArrayList
import java.util.HashMap
import java.util.regex.Pattern

/*
	A template will be generated in the following cases:

	- The target Java source does not exist.
	- The source template has a later timestamp than the target.
	- Any file in the source package has later timestamp than the target.
	- Any file in the generator itself has later timestamp than the target. (implies re-generation of all templates)

	Example template: src/templates/org/lwjgl/opengl/templates/ARB_copy_buffer.kt

	- Generator source -> src/templates/org/lwjgl/generator/
	- Source template -> src/templates/org/lwjgl/opengl/templates/ARB_copy_buffer.kt
	- Source package -> src/templates/org/lwjgl/opengl/
	- Target source -> generated/java/org/lwjgl/opengl/ARBCopyBuffer.java
*/

fun main(args: Array<String>) {
	// We discover templates reflectively.
	// For a package passed to the generate function, we
	// search for a <package>.templates.namespace class file
	// and run any public static methods that return a NativeClass object.

	// Note: namespace is a class Kotlin generates that contains
	// all top-level functions/properties in Kotlin package.
	generate("org.lwjgl.glfw")
	generate("org.lwjgl.openal")
	generate("org.lwjgl.opengl")
	generate("org.lwjgl.system.windows")

	// Generate capabilities
	generateOutput(org.lwjgl.openal.FunctionProviderALC, File("generated/java/org/lwjgl/openal/ALCCapabilities.java")) { generateCapabilities(it) }
	generateOutput(org.lwjgl.openal.FunctionProviderAL, File("generated/java/org/lwjgl/openal/ALCapabilities.java")) { generateCapabilities(it) }
	generateOutput(org.lwjgl.opengl.FunctionProviderGL, File("generated/java/org/lwjgl/opengl/ContextCapabilities.java")) { generateCapabilities(it) }

	// Generate structs and callback functions. These are auto-registered during the process above.
	StructRegistry.generate()
	CallbackRegistry.generate()
}

private fun generate(packageName: String) {
	val packageLastModified = getDirectoryLastModified("src/templates/${packageName.replace('.', '/')}")
	packageLastModifiedMap[packageName] = packageLastModified

	val templates = discoverTemplates("$packageName.templates.TemplatesPackage")
	if ( templates == null || templates.size == 0 ) {
		println("*WARNING* No templates found in $packageName.templates package.")
		return
	}

	for ( template in templates ) {
		val nativeClass = template.invoke(null) as NativeClass
		if ( !(nativeClass.packageName equals packageName) )
			throw IllegalStateException("NativeClass ${nativeClass.className} has invalid package [${nativeClass.packageName}]. Should be: [$packageName]")

		generate(nativeClass, max(packageLastModified, GENERATOR_LAST_MODIFIED))
	}
}

private fun discoverTemplates(packageClassPath: String): List<Method>? {
	val packageClass: Class<*>
	try {
		packageClass = Class.forName(packageClassPath)
	} catch (e: ClassNotFoundException) {
		return null
	}

	val methods = packageClass.getMethods()

	return methods.iterator().filterTo(ArrayList<Method>(methods.size)) {
		// static
		it.getModifiers() and Modifier.STATIC != 0 &&
		// returns NativeClass
		it.getReturnType() == javaClass<NativeClass>() &&
		// has no arguments
		it.getParameterTypes().size == 0
	}
}

val HEADER = """/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
"""

public trait GeneratorTargetJava {

	val packageName: String
	val className: String
	val nativeSubPath: String

	protected val documentation: String?

	fun generateJava(writer: PrintWriter)

}

public trait GeneratorTarget: GeneratorTargetJava {

	protected val nativeImports: List<String>

	fun generateNative(writer: PrintWriter)

}

// TODO: Kotlin bug: IncompatibleClassChangeError if we put this in the trait above
val GeneratorTarget.nativeFileName: String
	get() = "${packageName.replace('.', '_')}_$className"

abstract class AbstractGeneratorTarget(
	override val packageName: String,
	override val className: String,
	override val nativeSubPath: String = ""
): TemplateElement(), GeneratorTarget {

	class object {
		private val EMPTY_NATIVE_IMPORTS: MutableList<String> = ArrayList(0)
	}

	protected override var documentation: String? = null

	private var _nativeImports = EMPTY_NATIVE_IMPORTS;
	protected override val nativeImports: List<String>
		get() = _nativeImports

	fun nativeImport(vararg files: String) {
		_nativeImports = ArrayList(files.size)

		files.forEach {
			if ( it.startsWith('<') )
				_nativeImports add it
			else
				_nativeImports add "\"$it\""
		}
	}

	fun javaDoc(documentation: String) {
		this.documentation = documentation.toJavaDoc(indentation = "")
	}

}

private fun generate(nativeClass: NativeClass, packageLastModified: Long) {
	val packagePath = nativeClass.packageName.replace('.', '/')

	val input = File("src/templates/$packagePath/templates/${nativeClass.templateName}.kt")
	val outputJava = File("./generated/java/$packagePath/${nativeClass.className}.java")

	val touchTimestamp = max(input.lastModified(), packageLastModified)
	if ( outputJava.exists() && touchTimestamp < outputJava.lastModified() ) {
		println("SKIPPED: ${nativeClass.packageName}.${nativeClass.className}")
		return
	}

	println("GENERATING: ${nativeClass.packageName}.${nativeClass.className}")

	generateOutput(nativeClass, outputJava, touchTimestamp) {
		generateJava(it)
	}

	if ( nativeClass.hasNativeFunctions ) {
		generateNative(nativeClass) {
			generateOutput(nativeClass, it) {
				generateNative(it)
			}
		}
	}
}

// Struct & CallbackFunction
fun generate(target: GeneratorTarget) {
	val packageLastModified = packageLastModifiedMap[target.packageName]!!

	val outputJava = File("generated/java/${target.packageName.replace('.', '/')}/${target.className}.java")

	val touchTimestamp = max(packageLastModified, GENERATOR_LAST_MODIFIED)
	if ( outputJava.exists() && touchTimestamp < outputJava.lastModified() ) {
		println("SKIPPED: ${target.packageName}.${target.className}")
		return
	}

	println("GENERATING: ${target.packageName}.${target.className}")

	generateOutput(target, outputJava, touchTimestamp) {
		generateJava(it)
	}

	generateNative(target) {
		generateOutput(target, it) {
			generateNative(it)
		}
	}
}

private fun generateNative(target: GeneratorTarget, generate: (File) -> Unit) {
	var subPackagePath = target.packageName.substring("org.lwjgl.".size).replace('.', '/')
	if ( !target.nativeSubPath.isEmpty() )
		subPackagePath = "$subPackagePath/${target.nativeSubPath}"

	val outputNative: File = File("generated/native/$subPackagePath/${target.nativeFileName}.c")

	generate(outputNative)
}

private fun <T> generateOutput(
	target: T,
	file: File,
	/** If true, the file timestamp will be updated if no changed occured since last generation. */
	touchTimestamp: Long? = null,
	generate: T.(PrintWriter) -> Unit
) {
	// TODO: Add error handling

	ensurePath(file)

	if ( file.exists() ) {
		// Generate in-memory
		val baos = ByteArrayOutputStream(4 * 1024)
		val writer = PrintWriter(OutputStreamWriter(baos, "UTF8"))
		target.generate(writer)
		writer.close()

		// Compare the existing file content with the generated content.
		val before: ByteBuffer = readFile(file)
		val after = baos.toByteArray()

		fun somethingChanged(before: ByteBuffer, after: ByteArray): Boolean {
			if ( before.remaining() != after.size )
				return true

			for ( i in 0..before.limit() - 1 ) {
				if ( before[i] != after[i] )
					return true
			}

			return false
		}

		if ( somethingChanged(before, after) ) {
			println("\tUPDATING: $file")
			// Overwrite
			val bos = BufferedOutputStream(FileOutputStream(file))
			bos.write(after)
			bos.close()
		} else if ( touchTimestamp != null ) {
			// Update the file timestamp
			file.setLastModified(touchTimestamp + 1)
		}
	} else {
		println("\tWRITING: $file")
		// Generate to file
		val writer = PrintWriter(file, "UTF8")
		target.generate(writer)
		writer.close();
	}
}

private fun ensurePath(path: File) {
	val parent = path.getParentFile()!!
	if ( !parent.exists() ) {
		ensurePath(parent)
		println("\tMKDIR: $parent")
		parent.mkdir()
	}
}

// File management

private val GENERATOR_LAST_MODIFIED = getDirectoryLastModified("src/templates/org/lwjgl/generator", true)
private val packageLastModifiedMap = HashMap<String, Long>()

private fun getDirectoryLastModified(path: String, recursive: Boolean = false): Long = getDirectoryLastModified(File(path), recursive)
private fun getDirectoryLastModified(pck: File, recursive: Boolean): Long {
	if ( !pck.exists() || !pck.isDirectory() )
		return 0

	val classes = pck.listFiles(object : FileFilter {
		public override fun accept(pathname: File): Boolean {
			return (pathname.isDirectory() && recursive) || (pathname.isFile() && pathname.getName().endsWith(".kt"))
		}
	})

	if ( classes == null || classes.size == 0 )
		return 0

	return classes.map {
		if ( it.isDirectory() )
			getDirectoryLastModified(it, true)
		else
			it.lastModified()
	}.fold(0.toLong()) {(left, right) ->
		max(left, right)
	}
}

private fun readFile(file: File): ByteBuffer {
	val channel: FileChannel = FileInputStream(file).getChannel()
	val bytesTotal = channel.size().toInt()
	val buffer: ByteBuffer = ByteBuffer.allocateDirect(bytesTotal)

	var bytesRead = 0
	do {
		bytesRead += channel.read(buffer)
	} while ( bytesRead < bytesTotal )

	buffer.flip()
	channel.close()

	return buffer
}