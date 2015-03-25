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

fun project() {
	module("Templates", System.getProperty("org.lwjgl.templates.output")!!) {
		// Sources
		for ( source in listFiles("src/templates", FILTER_RECURSIVE) ) sources += source

		/*
		for ( source in listFiles("src/templates/org/lwjgl/generator", FILTER_RECURSIVE) ) sources += source
		//for ( source in listFiles("src/templates/org/lwjgl/openal", FILTER_RECURSIVE) ) sources += source
		//for ( source in listFiles("src/templates/org/lwjgl/opencl", FILTER_RECURSIVE) ) sources += source
		for ( source in listFiles("src/templates/org/lwjgl/opengl", FILTER_FILES_ONLY) ) sources += source
		//for ( source in listFiles("src/templates/org/lwjgl/opengl", FILTER_RECURSIVE) ) sources += source
		for ( source in listFiles("src/templates/org/lwjgl/glfw", FILTER_RECURSIVE) ) sources += source
		//for ( source in listFiles("src/templates/org/lwjgl/system/windows", FILTER_RECURSIVE) ) sources += source
		for ( source in listFiles("src/templates/org/lwjgl/system/linux", FILTER_RECURSIVE) ) sources += source
		*/

		// Boot classpath - this is needed if -noJdk is used.
		//val JAVA_HOME = System.getProperty("java.home")!!.replace('\\', '/')
		//val jdkJars = listFiles("$JAVA_HOME/lib", FILTER_JAR)
		//for ( jar in jdkJars )
			//classpath += jar

		// Compilation classpath
		classpath += "src/templates"
	}
}

private fun listFiles(path: String, filter: (File) -> Boolean): List<String> {
	val root = File(path)
	if ( !root.isDirectory() )
		throw IllegalArgumentException("Root path is not a directory: $path")

	val files = ArrayList<String>()

	listFiles(File(path), filter, files)

	return files
}

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