/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.util.ArrayList
import java.io.PrintWriter
import java.util.regex.Pattern


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

public enum class Access(internal val modifier: String) {
	PUBLIC : Access("public ")
	INTERNAL : Access("")
	PRIVATE : Access("private ")
}

public abstract class GeneratorTarget(
	val packageName: String,
	val className: String
): TemplateElement() {

	internal var access: Access = Access.PUBLIC
		set(access: Access) {
			if ( access == Access.PRIVATE )
				throw IllegalArgumentException("The private access modifier is illegal on top-level classes.")
			$access = access
		}

	internal var documentation: String? = null
		set(documentation: String?) {
			$documentation = documentation?.toJavaDoc(indentation = "")
		}

	val preamble = Preamble()

	abstract fun generateJava(writer: PrintWriter)

}

public abstract class GeneratorTargetNative(
	packageName: String,
	className: String,
	val nativeSubPath: String = ""
): GeneratorTarget(packageName, className) {

	class object {
		val DOT_PATTERN = Pattern.compile("[.]")
	}

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

// ------------------------------------

public class CustomClass(
	packageName: String,
	className: String,
	val printContent: PrintWriter.() -> Unit
): GeneratorTarget(packageName, className) {

	override fun generateJava(writer: PrintWriter): Unit = writer.generateJavaImpl()
	private fun PrintWriter.generateJavaImpl() {
		print(HEADER)
		println("package $packageName;\n")

		preamble.printJava(this)

		if ( documentation != null )
			println(documentation)

		printContent()
	}

}