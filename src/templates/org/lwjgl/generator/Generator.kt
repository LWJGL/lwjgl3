/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.*
import java.lang.Math.*
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.nio.ByteBuffer
import java.util.ArrayList
import java.util.HashMap

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
	if ( args.size < 2 )
		throw IllegalArgumentException("The code Generator requires 2 paths as arguments: a) the template source path and b) the generation target path")

	val validateDirectory = {(name: String, path: String) ->
		if ( File(path) let { !it.exists() || !it.isDirectory() } )
			throw IllegalArgumentException("Invalid $name path: $path")
	}

	validateDirectory("template source", args[0])
	validateDirectory("generation target", args[1])

	// Makes sure we use \n during generation, even on Windows.
	System.setProperty("line.separator", "\n")

	Generator(args[0], args[1]) {
		// We discover templates reflectively.
		// For a package passed to the generate function, we
		// search for a <package>.templates.TemplatesPackage class file
		// and run any public static methods that return a NativeClass object.

		// Note: For a Kotlin package X.Y.Z, <Z>Package is the class Kotlin generates that contains
		// all top-level functions/properties in that package. Example:
		// org.lwjgl.opengl -> org.lwjgl.opengl.OpenglPackage (the first letter is capitalized)

		// TODO: Move these to args[2] or a file in /config to enable build customization
		generate("org.lwjgl.openal")
		generate("org.lwjgl.opencl")
		generate("org.lwjgl.opengl")
		generate("org.lwjgl.system.libffi")
		generate("org.lwjgl.system.linux")
		generate("org.lwjgl.system.macosx")
		generate("org.lwjgl.system.windows")
		generate("org.lwjgl.system.glfw")

		// Generate utility classes. These are auto-registered during the process above.
		generate("struct", Generator.structs)
		generate("custom class", Generator.customClasses)
	}
}

class Generator(
	val srcPath: String,
	val trgPath: String,
	generate: Generator.() -> Unit
) {

	class object {
		val structs = ArrayList<Struct>()
		val customClasses = ArrayList<CustomClass>()

		fun register(struct: Struct): Struct {
			structs add struct
			return struct
		}

		fun <T: CustomClass> register(customClass: T): T {
			customClasses add customClass
			return customClass
		}
	}

	// TODO: add more, e.g. kotlinc
	private val GENERATOR_LAST_MODIFIED = getDirectoryLastModified("$srcPath/org/lwjgl/generator", true);

	{
		generate()
	}

	private fun methodFilter(method: Method, javaClass: Class<*>) =
		// static
		method.getModifiers() and Modifier.STATIC != 0 &&
			// returns NativeClass
			method.getReturnType() == javaClass &&
			// has no arguments
			method.getParameterTypes().size == 0

	private fun runConfiguration(cp: String) {
		val dot = cp.lastIndexOf('.')
		val packageClass = "$cp.${Character.toUpperCase(cp[dot + 1])}${cp.substring(dot + 2)}Package"

		try {
			Class.forName(packageClass)
				.getMethods()
				.filter { methodFilter(it, Void.TYPE) }
				.forEach { it.invoke(null) }
		} catch (e: ClassNotFoundException) {
			// ignore
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
			.stream()
			.filterTo(ArrayList<Method>(methods.size)) {
				methodFilter(it, javaClass<NativeClass>())
			}
	}

	fun generate(packageName: String) {
		val packageLastModified = getDirectoryLastModified("$srcPath/${packageName.replace('.', '/')}", false)
		packageLastModifiedMap[packageName] = packageLastModified

		// Find and run configuration methods
		runConfiguration(packageName)

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

	private fun generate(nativeClass: NativeClass, packageLastModified: Long) {
		val packagePath = nativeClass.packageName.replace('.', '/')

		val outputJava = File("$trgPath/java/$packagePath/${nativeClass.className}.java")

		val touchTimestamp = max(nativeClass.getLastModified("$srcPath/$packagePath/templates"), packageLastModified)
		if ( outputJava.exists() && touchTimestamp < outputJava.lastModified() ) {
			//println("SKIPPED: ${nativeClass.packageName}.${nativeClass.className}")
			return
		}

		println("GENERATING: ${nativeClass.packageName}.${nativeClass.className}")

		generateOutput(nativeClass, outputJava, touchTimestamp) {
			it.generateJava()
		}

		if ( nativeClass.functions.any { !it.has(Reuse) } ) {
			generateNative(nativeClass) {
				generateOutput(nativeClass, it) {
					it.generateNative()
				}
			}
		} else
			nativeClass.nativeImportsWarning()
	}

	fun <T: GeneratorTarget> generate(typeName: String, targets: List<T>) {
		targets.forEach {
			try {
				generate(it)
			} catch (e: Exception) {
				throw RuntimeException("Uncaught exception while generating $typeName: ${it.packageName}.${it.className}", e)
			}
		}
	}

	fun generate(target: GeneratorTarget) {
		val packagePath = target.packageName.replace('.', '/')

		val outputJava = File("$trgPath/java/$packagePath/${target.className}.java")

		val touchTimestamp = max(target.getLastModified("$srcPath/$packagePath"), max(packageLastModifiedMap[target.packageName]!!, GENERATOR_LAST_MODIFIED))
		if ( outputJava.exists() && touchTimestamp < outputJava.lastModified() ) {
			println("SKIPPED: ${target.packageName}.${target.className}")
			return
		}

		println("GENERATING: ${target.packageName}.${target.className}")

		generateOutput(target, outputJava, touchTimestamp) {
			it.generateJava()
		}

		if ( target is GeneratorTargetNative ) {
			generateNative(target) {
				generateOutput(target, it) {
					it.generateNative()
				}
			}
		}
	}

	private fun generateNative(target: GeneratorTargetNative, generate: (File) -> Unit) {
		var subPackagePath = target.packageName.substring("org.lwjgl.".size).replace('.', '/')
		if ( !target.nativeSubPath.isEmpty() )
			subPackagePath = "$subPackagePath/${target.nativeSubPath}"

		generate(File("$trgPath/native/$subPackagePath/${target.nativeFileName}.c"))
	}

}

// File management

private val packageLastModifiedMap: MutableMap<String, Long> = HashMap()

private fun getDirectoryLastModified(path: String, recursive: Boolean = false) = getDirectoryLastModified(File(path), recursive)
private fun getDirectoryLastModified(pck: File, recursive: Boolean): Long {
	if ( !pck.exists() || !pck.isDirectory() )
		return 0

	val classes = pck.listFiles {
		(it.isDirectory() && recursive) || (it.isFile() && it.getName().endsWith(".kt"))
	}

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

private fun readFile(file: File): ByteBuffer {
	val channel = FileInputStream(file).getChannel()
	val bytesTotal = channel.size().toInt()
	val buffer = ByteBuffer.allocateDirect(bytesTotal)

	var bytesRead = 0
	do {
		bytesRead += channel.read(buffer)
	} while ( bytesRead < bytesTotal )

	buffer.flip()
	channel.close()

	return buffer
}

private fun <T> generateOutput(
	target: T,
	file: File,
	/** If not null, the file timestamp will be updated if no changed occured since last generation. */
	touchTimestamp: Long? = null,
	generate: T.(PrintWriter) -> Unit
) {
	// TODO: Add error handling

	ensurePath(file)

	if ( file.exists() ) {
		// Generate in-memory
		val baos = ByteArrayOutputStream(4 * 1024)
		val writer = PrintWriter(OutputStreamWriter(baos, Charsets.UTF_8))
		target.generate(writer)
		writer.close()

		// Compare the existing file content with the generated content.
		val before = readFile(file)
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
		val writer = PrintWriter(BufferedWriter(OutputStreamWriter(FileOutputStream(file), Charsets.UTF_8)))
		target.generate(writer)
		writer.close();
	}
}

/** Returns true if the array was empty. */
fun <T> Array<T>.forEachWithMore(apply: (T, Boolean) -> Unit): Boolean {
	for ( i in 0..this.lastIndex )
		apply(this[i], 0 < i)
	return this.size == 0
}

/** Returns true if the stream was empty. */
fun <T> Stream<T>.forEachWithMore(apply: (T, Boolean) -> Unit): Boolean {
	var more = false
	for ( item in this ) {
		apply(item, more)
		if ( !more )
			more = true
	}
	return more
}

/** Returns true if the collection was empty. */
fun <T> Collection<T>.forEachWithMore(moreOverride: Boolean = false, apply: (T, Boolean) -> Unit): Boolean {
	var more = moreOverride
	for ( item in this ) {
		apply(item, more)
		if ( !more )
			more = true
	}
	return more
}