// Templates module compilation script
import kotlin.modules.*
import java.util.ArrayList
import java.io.File
import java.io.FileFilter

fun project() {
	module("Templates") {
		// Sources
		val templateSources = listFiles("src/templates", ".kt")
		for ( source in templateSources )
			sources += source

		// Boot classpath - this is needed if -noJdk is used.
		//val JAVA_HOME = System.getProperty("java.home")!!.replace('\\', '/')
		//val jdkJars = listFiles("$JAVA_HOME/lib", ".jar")
		//for ( jar in jdkJars )
			//classpath += jar

		// Compilation classpath
		classpath += "libs/kotlinc/lib/kotlin-runtime.jar"
		classpath += "src/templates"

		// External annotations
		annotationsPath += "libs/kotlinc/lib/kotlin-jdk-annotations.jar"
		annotationsPath += "config/kotlin"
	}
}

private fun listFiles(path: String, ext: String): List<String> {
	val root = File(path)
	if ( !root.isDirectory() )
		throw IllegalArgumentException("Root path is not a directory: $path")

	val files = ArrayList<String>()
	val filter = object: FileFilter {
		public override fun accept(pathname: File): Boolean {
			return pathname.isDirectory() || pathname.getName().endsWith(ext)
		}
	}
	listFiles(File(path), filter, files)

	return files
}

private fun listFiles(dir: File, filter: FileFilter, output: MutableList<String>) {
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