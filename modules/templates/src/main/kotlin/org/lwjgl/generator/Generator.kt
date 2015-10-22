/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.*
import java.lang.Math.max
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.nio.ByteBuffer
import java.util.*

/*
	A template will be generated in the following cases:

	- The target Java source does not exist.
	- The source template has a later timestamp than the target.
	- Any file in the source package has later timestamp than the target.
	- Any file in the generator itself has later timestamp than the target. (implies re-generation of all templates)

	Example template: /src/main/kotlin/org/lwjgl/opengl/templates/ARB_imaging.kt

	- Generator source      -> /src/main/kotlin/org/lwjgl/generator/
	- Source package        -> /src/main/kotlin/org/lwjgl/opengl/
	- Source template       -> /src/main/kotlin/org/lwjgl/opengl/templates/ARB_imaging.kt

	- Target source (Java)  -> modules/core/src/generated/java/org/lwjgl/opengl/ARBImaging.java
	- Target source (C)     -> modules/core/src/generated/c/opengl/org_lwjgl_opengl_ARBImaging.c
*/

enum class Binding(val key: String) {
	EGL("binding.egl"),
	GLFW("binding.glfw"),
	OPENAL("binding.openal"),
	OPENCL("binding.opencl"),
	OPENGL("binding.opengl"),
	OPENGLES("binding.opengles"),

	OVR("binding.ovr"),
	STB("binding.stb"),

	MACOSX_OBJC("binding.macosx.objc");

	val enabled: Boolean
		get() = System.getProperty(key, "false").toBoolean()
}

fun dependsOn(binding: Binding, init: () -> NativeClass): NativeClass? = if ( binding.enabled ) init() else null

fun main(args: Array<String>) {
	if ( args.size < 2 )
		throw IllegalArgumentException("The code Generator requires 2 paths as arguments: a) the template source path and b) the generation target path")

	val validateDirectory = { name: String, path: String ->
		if ( !File(path).isDirectory )
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

		generate("org.lwjgl.egl", Binding.EGL)
		generate("org.lwjgl.glfw", Binding.GLFW)
		generate("org.lwjgl.openal", Binding.OPENAL)
		generate("org.lwjgl.opencl", Binding.OPENCL)
		generate("org.lwjgl.opengl", Binding.OPENGL)
		generate("org.lwjgl.opengles", Binding.OPENGLES)
		generate("org.lwjgl.ovr", Binding.OVR)
		generate("org.lwjgl.stb", Binding.STB)

		generate("org.lwjgl.system.jemalloc")
		generate("org.lwjgl.system.libc")
		generate("org.lwjgl.system.libffi")
		generate("org.lwjgl.system.linux")
		generate("org.lwjgl.system.macosx")
		generate("org.lwjgl.system.simd")
		generate("org.lwjgl.system.windows")
		generate("org.lwjgl.system.xxhash")

		// Generate utility classes. These are auto-registered during the process above.
		generate("struct", Generator.structs)
		generate("callback", Generator.callbacks)
		generate("custom class", Generator.customClasses)

		generate(JNI)
	}
}

class Generator(
	val srcPath: String,
	val trgPath: String,
	generate: Generator.() -> Unit
) {

	companion object {
		val structs = ArrayList<Struct>()
		val callbacks = ArrayList<CallbackFunction>()
		val customClasses = ArrayList<CustomClass>()

		fun register(struct: Struct): Struct {
			structs.add(struct)
			return struct
		}

		fun register(callback: CallbackFunction) {
			callbacks.add(callback)
		}

		fun <T : CustomClass> register(customClass: T): T {
			customClasses.add(customClass)
			return customClass
		}
	}

	// TODO: add more, e.g. kotlinc
	private val GENERATOR_LAST_MODIFIED = getDirectoryLastModified("$srcPath/org/lwjgl/generator", true)

	init {
		generate()
	}

	private fun methodFilter(method: Method, javaClass: Class<*>) =
		// static
		method.modifiers and Modifier.STATIC != 0 &&
		// returns NativeClass
		method.returnType === javaClass &&
		// has no arguments
		method.parameterTypes.size == 0

	private fun apply(packagePath: String, packageName: String, consume: Sequence<Method>.() -> Unit) {
		val packageDirectory = File(packagePath)
		if ( !packageDirectory.isDirectory )
			return

		val classFiles = packageDirectory.listFiles {
			it.isFile && it.extension.equals("kt")
		}!!

		classFiles.forEach {
			try {
				Class
					.forName("$packageName.${it.nameWithoutExtension.upperCaseFirst}Kt")
					.methods
					.asSequence()
					.consume()
			} catch (e: ClassNotFoundException) {
				// ignore
			}
		}
	}

	fun generate(packageName: String, binding: Binding? = null) {
		val packagePath = "$srcPath/${packageName.replace('.', '/')}"

		val packageLastModified = getDirectoryLastModified(packagePath, false)
		packageLastModifiedMap[packageName] = packageLastModified

		if ( binding?.enabled == false )
			return

		// Find and run configuration methods
		//runConfiguration(packagePath, packageName)
		apply(packagePath, packageName) {
			this
				.filter { methodFilter(it, Void.TYPE) }
				.forEach { it.invoke(null) }
		}

		// Find the template methods
		val templates = TreeSet<Method>(object : Comparator<Method> {
			override fun compare(o1: Method, o2: Method): Int = o1.name.compareTo(o2.name)
		})
		apply("$packagePath/templates", "$packageName.templates") {
			this.filterTo(templates) {
				methodFilter(it, NativeClass::class.java)
			}
		}
		if ( templates.isEmpty() ) {
			println("*WARNING* No templates found in $packageName.templates package.")
			return
		}

		// Generate the template code
		for (template in templates) {
			val nativeClass = template.invoke(null) as NativeClass? ?: continue

			if ( !(nativeClass.packageName.equals(packageName)) )
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

		//println("GENERATING: ${nativeClass.packageName}.${nativeClass.className}")

		generateOutput(nativeClass, outputJava, touchTimestamp) {
			it.generateJava()
		}

		if ( nativeClass.functions.any() { it.hasCustomJNI } ) {
			generateNative(nativeClass) {
				generateOutput(nativeClass, it) {
					it.generateNative()
				}
			}
		} else
			nativeClass.nativeImportsWarning()
	}

	fun <T : GeneratorTarget> generate(typeName: String, targets: List<T>) {
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

		val touchTimestamp: Long?
		if ( target !== JNI ) {
			touchTimestamp = max(target.getLastModified("$srcPath/$packagePath"), max(packageLastModifiedMap[target.packageName]!!, GENERATOR_LAST_MODIFIED))
			if ( outputJava.exists() && touchTimestamp < outputJava.lastModified() ) {
				//println("SKIPPED: ${target.packageName}.${target.className}")
				return
			}
		} else
			touchTimestamp = null

		//println("GENERATING: ${target.packageName}.${target.className}")

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
		var subPackagePath = target.packageName.substring("org.lwjgl.".length).replace('.', '/')
		if ( !target.nativeSubPath.isEmpty() )
			subPackagePath = "$subPackagePath/${target.nativeSubPath}"

		generate(File("$trgPath/c/$subPackagePath/${target.nativeFileName}.c"))
	}

}

// File management

private val packageLastModifiedMap: MutableMap<String, Long> = HashMap()

fun getDirectoryLastModified(path: String, recursive: Boolean = false) = getDirectoryLastModified(File(path), recursive)
private fun getDirectoryLastModified(pck: File, recursive: Boolean): Long {
	if ( !pck.exists() || !pck.isDirectory )
		return 0

	val classes = pck.listFiles {
		(it.isDirectory && recursive) || (it.isFile && it.name.endsWith(".kt"))
	}

	if ( classes == null || classes.size == 0 )
		return 0

	return classes.map {
		if ( it.isDirectory )
			getDirectoryLastModified(it, true)
		else
			it.lastModified()
	}.fold(0.toLong()) { left, right ->
		max(left, right)
	}
}

private fun ensurePath(path: File) {
	val parent = path.parentFile ?: throw IllegalArgumentException("The given path has no parent directory.")

	if ( !parent.exists() ) {
		ensurePath(parent)
		println("\tMKDIR: $parent")
		parent.mkdir()
	}
}

private fun readFile(file: File): ByteBuffer {
	val channel = FileInputStream(file).channel
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
	/** If not null, the file timestamp will be updated if no change occured since last generation. */
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

			for (i in 0..before.limit() - 1) {
				if ( before.get(i) != after[i] )
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
		try {
			target.generate(writer)
		} catch(e: Exception) {
			file.deleteOnExit()
			throw e
		} finally {
			writer.close()
		}
	}
}

/** Returns true if the array was empty. */
inline fun <T> Array<out T>.forEachWithMore(apply: (T, Boolean) -> Unit): Boolean {
	for (i in 0..this.lastIndex)
		apply(this[i], 0 < i)
	return this.size == 0
}

/** Returns true if the collection was empty. */
fun <T> Collection<T>.forEachWithMore(moreOverride: Boolean = false, apply: (T, Boolean) -> Unit): Boolean {
	var more = moreOverride
	for (item in this) {
		apply(item, more)
		if ( !more )
			more = true
	}
	return more
}

/** Returns the string with the first letter uppercase. */
val String.upperCaseFirst: String
	get() = if ( this.length <= 1 )
		this.toUpperCase()
	else
		"${Character.toUpperCase(this[0])}${this.substring(1)}"