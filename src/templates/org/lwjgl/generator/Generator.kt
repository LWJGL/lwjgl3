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
	// Makes sure we use \n during generation, even on Windows.
	System.setProperty("line.separator", "\n")

	// We discover templates reflectively.
	// For a package passed to the generate function, we
	// search for a <package>.templates.TemplatesPackage class file
	// and run any public static methods that return a NativeClass object.

	// Note: For a Kotlin package X.Y.Z, <Z>Package is the class Kotlin generates that contains
	// all top-level functions/properties in that package. Example:
	// org.lwjgl.opengl -> org.lwjgl.opengl.OpenglPackage (the first letter is capitalized)
	generate("org.lwjgl.openal")
	generate("org.lwjgl.opencl")
	generate("org.lwjgl.opengl")
	generate("org.lwjgl.system.linux")
	generate("org.lwjgl.system.macosx")
	generate("org.lwjgl.system.windows")
	generate("org.lwjgl.system.glfw")

	// Generate capabilities
	generateOutput(org.lwjgl.openal.FunctionProviderALC, File("generated/java/org/lwjgl/openal/ALCCapabilities.java")) { generateCapabilities(it) }
	generateOutput(org.lwjgl.openal.FunctionProviderAL, File("generated/java/org/lwjgl/openal/ALCapabilities.java")) { generateCapabilities(it) }
	generateOutput(org.lwjgl.opencl.FunctionProviderCL, File("generated/java/org/lwjgl/opencl/CLCapabilities.java")) { generateCapabilities(it) }
	generateOutput(org.lwjgl.opengl.FunctionProviderGL, File("generated/java/org/lwjgl/opengl/ContextCapabilities.java")) { generateCapabilities(it) }

	// Generate structs. These are auto-registered during the process above.
	StructRegistry.generate()
}

private fun generate(packageName: String) {
	val packageLastModified = getDirectoryLastModified("src/templates/${packageName.replace('.', '/')}")
	packageLastModifiedMap[packageName] = packageLastModified

	val config = discoverConfig(packageName)
	// Run the configuration method if it exists
	config?.invoke(null)

	// Find the template methods
	val templates = discoverTemplates("$packageName.templates.TemplatesPackage")
	if ( templates == null || templates.isEmpty() ) {
		println("*WARNING* No templates found in $packageName.templates package.")
		return
	}

	// Generate the template code
	for ( template in templates ) {
		val nativeClass = template.invoke(null) as NativeClass
		if ( !(nativeClass.packageName equals packageName) )
			throw IllegalStateException("NativeClass ${nativeClass.className} has invalid package [${nativeClass.packageName}]. Should be: [$packageName]")

		if ( nativeClass.hasBody )
			generate(nativeClass, max(packageLastModified, GENERATOR_LAST_MODIFIED))
	}
}

private fun methodFilter(method: Method, javaClass: Class<*>) =
	// static
	method.getModifiers() and Modifier.STATIC != 0 &&
	// returns NativeClass
	method.getReturnType() == javaClass &&
	// has no arguments
	method.getParameterTypes().size == 0

private fun discoverConfig(packageClassPath: String): Method? {
	val firstChar = packageClassPath.lastIndexOf('.') + 1
	val packageClass = "$packageClassPath.${Character.toUpperCase(packageClassPath[firstChar])}${packageClassPath.substring(firstChar + 1)}Package"

	try {
		return Class.forName(packageClass).getMethods().find { methodFilter(it, Void.TYPE) }
	} catch (e: ClassNotFoundException) {
		return null
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

	return methods
		.iterator()
		.filterTo(ArrayList<Method>(methods.size))
	{
		methodFilter(it, javaClass<NativeClass>())
	}
}

val HEADER = """/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
"""

class Preamble {

	class object {
		data class NativeDefine(
			val expression: String,
			val afterIncludes: Boolean
		)

		private val EMPTY_IMPORTS = ArrayList<String>(0)
		private val EMPTY_DEFINES = ArrayList<NativeDefine>(0)
	}

	private var javaImports: MutableList<String> = EMPTY_IMPORTS

	private var nativeImports: MutableList<String> = EMPTY_IMPORTS
	private var nativeDefines: MutableList<NativeDefine> = EMPTY_DEFINES

	fun javaImport(vararg classes: String) {
		if ( javaImports identityEquals EMPTY_IMPORTS )
			javaImports = ArrayList<String>(classes.size)

		classes.forEach {
			javaImports add it
		}
	}

	fun nativeImport(vararg files: String) {
		if ( nativeImports identityEquals EMPTY_IMPORTS )
			nativeImports = ArrayList<String>(files.size)

		files.forEach {
			nativeImports add if ( it.startsWith('<') )
				it
			else
				"\"$it\""
		}
	}

	fun nativeDefine(expression: String, afterIncludes: Boolean) {
		if ( nativeDefines identityEquals EMPTY_DEFINES )
			nativeDefines = ArrayList<NativeDefine>()

		nativeDefines.add(NativeDefine(expression, afterIncludes))
	}

	fun printJava(writer: PrintWriter) {
		if ( javaImports.isEmpty() )
			return

		javaImports.forEach {
			writer.println("import $it;")
		}

		writer.println()
	}

	fun printNative(writer: PrintWriter) {
		nativeDefines.filter { !it.afterIncludes }.forEach {
			writer.println("#define ${it.expression}")
		}

		nativeImports.forEach {
			writer.println("#include $it")
		}

		nativeDefines.filter { it.afterIncludes }.forEach {
			writer.println("#define ${it.expression}")
		}
	}

}

private val JNI_UNDERSCORE_ESCAPE_PATTERN = Pattern.compile("_")

val String.asJNIName: String
	get() = if ( this.indexOf('_') == -1 )
		this
	else
		this.replaceAll(JNI_UNDERSCORE_ESCAPE_PATTERN, "_1")

public abstract class GeneratorTarget(
	val packageName: String,
	val className: String,
	val nativeSubPath: String = ""
): TemplateElement() {

	class object {
		val DOT_PATTERN = Pattern.compile("[.]")
	}

	protected var documentation: String? = null

	val preamble = Preamble()

	val nativeFileName: String
		get() = "${packageName.replace('.', '_')}_$className"

	val nativeFileNameJNI: String
	{
		val fileName = StringBuilder(packageName.size + className.size + 4); // some extra room for escaping

		for ( subpackage in DOT_PATTERN.split(packageName) ) {
			fileName append subpackage.asJNIName
			fileName append '_'
		}

		fileName append className.asJNIName

		$nativeFileNameJNI = fileName.toString()
	}

	fun javaDoc(documentation: String) {
		this.documentation = documentation.toJavaDoc(indentation = "")
	}

	abstract fun generateJava(writer: PrintWriter)
	abstract fun generateNative(writer: PrintWriter)

}

fun <T: GeneratorTarget> T.javaImport(vararg classes: String): T {
	preamble.javaImport(*classes)
	return this
}

fun <T: GeneratorTarget> T.nativeDefine(expression: String, afterIncludes: Boolean = false): T {
	preamble.nativeDefine(expression, afterIncludes)
	return this
}

fun <T: GeneratorTarget> T.nativeImport(vararg files: String): T {
	preamble.nativeImport(*files)
	return this
}

private fun generate(nativeClass: NativeClass, packageLastModified: Long) {
	val packagePath = nativeClass.packageName.replace('.', '/')

	var input = File("src/templates/$packagePath/templates/${nativeClass.templateName}.kt")
	if ( !input.exists() ) {
		if ( !nativeClass.prefixTemplate.isEmpty() )
			input = File("src/templates/$packagePath/templates/${nativeClass.prefixTemplate}_${nativeClass.templateName}.kt")

		if ( !input.exists() )
			throw IllegalStateException("The source file for template ${nativeClass.templateName} does not exist. The source file that defines the template must be: ${input.getPath()}")
	}

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

	if ( nativeClass.functions.any { !it.has(Reuse) } ) {
		generateNative(nativeClass) {
			generateOutput(nativeClass, it) {
				generateNative(it)
			}
		}
	}
}

// Struct
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
	val parent = path.getParentFile()
	if ( parent == null )
		throw IllegalArgumentException("The given path has no parent directory.")

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