/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */

// Templates module compilation script
import kotlin.modules.*
import java.util.ArrayList
import java.io.File
import java.io.FileFilter

private val FILTER_RECURSIVE: (File) -> Boolean = { it.isDirectory() || it.getPath().endsWith(".kt") }
private val FILTER_FILES_ONLY: (File) -> Boolean = { it.isFile() && it.getPath().endsWith(".kt") }
//private val FILTER_JAR: (File) -> Boolean = { it.isDirectory() || it.getPath().endsWith(".jar") }

private val ROOT = "src/templates/org/lwjgl"

fun project() {
	module("Templates", System.getProperty("org.lwjgl.templates.output")!!) {
		fun addSources(path: String, filter: (File) -> Boolean) {
			val root = File(path)
			if ( !root.isDirectory() )
				throw IllegalArgumentException("Root path is not a directory: $path")

			val files = ArrayList<String>()

			listFiles(File(path), filter, files)

			files forEach {
				sources += it
			}
		}

		fun addOptionalModule(module: String, path: String, registerTypes: Boolean = false) {
			val active = hasModule(module)
			if ( !active && !registerTypes )
				return

			addSources("$ROOT/$path", if ( active ) FILTER_RECURSIVE else FILTER_FILES_ONLY)
		}

		// Sources
		addSources("$ROOT/generator", FILTER_RECURSIVE)

		addSources("$ROOT/system/libffi", FILTER_RECURSIVE)
		addSources("$ROOT/system/linux", FILTER_RECURSIVE)
		addSources("$ROOT/system/macosx", FILTER_RECURSIVE)
		addSources("$ROOT/system/windows", FILTER_RECURSIVE)

		addOptionalModule("build.stb", "stb")

		addOptionalModule("build.glfw", "glfw")
		addOptionalModule("build.openal", "openal")
		addOptionalModule("build.opencl", "opencl", registerTypes = hasModule("build.opengl"))
		addOptionalModule("build.opengl", "opengl", registerTypes = hasModule("build.opencl"))
		addOptionalModule("build.mantle", "mantle")
		addOptionalModule("build.ovr", "ovr")

		// Boot classpath - this is needed if -noJdk is used.
		//val JAVA_HOME = System.getProperty("java.home")!!.replace('\\', '/')
		//val jdkJars = listFiles("$JAVA_HOME/lib", FILTER_JAR)
		//for ( jar in jdkJars )
		//classpath += jar

		// Compilation classpath
		classpath += "src/templates"
	}
}

private fun hasModule(module: String) = System.getProperty(module, "false").toBoolean()

private fun listFiles(dir: File, filter: (File) -> Boolean, output: MutableList<String>) {
	val files = dir.listFiles(filter)
	if ( files == null )
		return

	for ( file in files ) {
		if ( file.isDirectory() )
			listFiles(file, filter, output)
		else
			output.add(file.getAbsolutePath())
	}
}