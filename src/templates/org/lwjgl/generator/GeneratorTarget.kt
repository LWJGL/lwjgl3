/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.util.*
import java.util.regex.Pattern
import java.io.*


val HEADER = """/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
"""

class Preamble {

	companion object {
		data class NativeDefine(
			val expression: String,
			val afterIncludes: Boolean
		)

		private val EMPTY_IMPORTS = ArrayList<String>(0)
		private val EMPTY_DIRECTIVES = ArrayList<NativeDefine>(0)
	}

	private var javaImports: MutableList<String> = EMPTY_IMPORTS

	private var nativeImports: MutableList<String> = EMPTY_IMPORTS
	private var nativeDirectives: MutableList<NativeDefine> = EMPTY_DIRECTIVES

	val hasNativeImports: Boolean get() = nativeImports.isNotEmpty()

	fun javaImport(vararg classes: String) {
		if ( javaImports === EMPTY_IMPORTS )
			javaImports = ArrayList(classes.size())

		classes.forEach {
			javaImports add it
		}
	}

	fun nativeImport(vararg files: String) {
		if ( nativeImports === EMPTY_IMPORTS )
			nativeImports = ArrayList(files.size())

		files.forEach {
			nativeImports add if ( it.startsWith('<') )
				it
			else
				"\"$it\""
		}
	}

	fun nativeDirective(expression: String, afterIncludes: Boolean) {
		if ( nativeDirectives === EMPTY_DIRECTIVES )
			nativeDirectives = ArrayList()

		nativeDirectives.add(NativeDefine(expression, afterIncludes))
	}

	fun printJava(writer: PrintWriter) {
		if ( javaImports.isEmpty() )
			return

		fun List<String>.print() = this.forEach { writer.println("import $it;") }

		val static = javaImports.filter { it.startsWith("static ") }
		if ( !static.isEmpty() && static.size() < javaImports.size() ) {
			// Separate plain from static imports
			javaImports.filter { !it.startsWith("static ") }.print()
			writer.println();
			static.print()
		} else
			javaImports.print()

		writer.println()
	}

	fun printNative(writer: PrintWriter) {
		nativeDirectives.filter { !it.afterIncludes }.forEach {
			writer.println("${it.expression}")
		}

		nativeImports.forEach {
			writer.println("#include $it")
		}

		nativeDirectives.filter { it.afterIncludes }.forEach {
			writer.println("${it.expression}")
		}
	}

}

private val JNI_UNDERSCORE_ESCAPE_PATTERN = Pattern.compile("_")

val String.asJNIName: String
	get() = if ( this.indexOf('_') == -1 )
		this
	else
		this.replaceAll(JNI_UNDERSCORE_ESCAPE_PATTERN, "_1")

enum class Access(internal val modifier: String) {
	PUBLIC: Access("public ")
	INTERNAL: Access("")
	PRIVATE: Access("private ")
}

abstract class GeneratorTarget(
	val packageName: String,
	val className: String
): TemplateElement() {

	companion object {
		private val LINKS: Pattern = {
			val JAVA = """\p{javaJavaIdentifierStart}\p{javaJavaIdentifierPart}*(?:\.\p{javaJavaIdentifierStart}\p{javaJavaIdentifierPart}*)*"""
			val NATIVE = """\p{javaJavaIdentifierPart}+""" // Must match tokens like GL_3_BYTES (the link is #3_BYTES)
			Pattern.compile("""($JAVA)?(?<!&)([@\\]?#{1,2})($NATIVE+(?:\((?:(?:, )?$JAVA)*\))?)""")
		}()
	}

	private fun getSourceFileName(): String {
		// Nasty hack to retrieve the source file that defines this template, without having to specify it explictly.
		// This enables incremental builds to work even with arbitrary file names or when multiple templates are bundled
		// in the same file (e.g. ExtensionFlags).
		try {
			throw RuntimeException()
		} catch (t: Throwable) {
			return t.getStackTrace().sequence()
				.map { it.getFileName() }
				.filterNotNull()
				.filter {
					it.endsWith(".kt")
						&& !it.startsWith("Generator")
						&& !it.equals("NativeClass.kt")
						&& !it.equals("Structs.kt")
						&& !it.equals("CallbackFunction.kt")
						&& !(this is NativeClass && it.startsWith("FunctionProvider"))
				}.first()
		}
	}

	private val sourceFile: String = getSourceFileName();
	open fun getLastModified(root: String): Long = File("$root/$sourceFile").let {
		if ( it.exists() ) it else
			throw IllegalStateException("The source file for template $packageName.$className does not exist ($it).")
	}.lastModified()

	var access = Access.PUBLIC
		set(access: Access) {
			if ( access === Access.PRIVATE )
				throw IllegalArgumentException("The private access modifier is illegal on top-level classes.")
			$access = access
		}

	var documentation: String? = null

	val preamble = Preamble()

	fun <T: GeneratorTarget> T.javaImport(vararg classes: String): T {
		preamble.javaImport(*classes)
		return this
	}

	fun <T: GeneratorTarget> T.nativeDirective(expression: String, afterIncludes: Boolean = false): T {
		preamble.nativeDirective(expression, afterIncludes)
		return this
	}

	fun <T: GeneratorTarget> T.nativeImport(vararg files: String): T {
		preamble.nativeImport(*files)
		return this
	}

	abstract fun PrintWriter.generateJava()

	open fun processDocumentation(documentation: String): String = processDocumentation(documentation, "", "")

	protected fun processDocumentation(documentation: String, prefixConstant: String, prefixMethod: String): String {
		val matcher = LINKS.matcher(documentation)
		if ( !matcher.find() )
			return documentation

		val buffer = StringBuilder(documentation.length() * 2)

		var lastEnd = 0
		do {
			buffer.append(documentation, lastEnd, matcher.start())

			/*
			# - normal link, apply prefix
			## - custom link, do not transform
			@# or @## - like above, but add "see " in front
			\# - escape, replace with #
			 */
			val linkMethod = matcher.group(2)!!
			if ( linkMethod[0] == '\\' ) {
				buffer append matcher.group().replace("\\#", "#")
			} else {
				if ( linkMethod[0] == '@' )
					buffer append "see "

				val className = matcher.group(1)
				val classElement = matcher.group(3)!!

				val link = if ( classElement.endsWith(')') ) LinkType.METHOD else LinkType.FIELD
				val prefix = if ( link === LinkType.FIELD ) prefixConstant else prefixMethod
				buffer append when ( linkMethod.count { it == '#' } ) {
					1    -> link.create(this.className, prefix, className, classElement, if ( this is NativeClass) this.postfix else "", custom = false)
					2    ->
						if ( className == null && link === LinkType.FIELD )
							"{@link $classElement}"
						else
							link.create(this.className, prefix, className, classElement, "", custom = true)
					else -> throw IllegalStateException("Unsupported link type: $link")
				}
			}

			lastEnd = matcher.end()
		} while ( matcher.find() )

		buffer.append(documentation, lastEnd, documentation.length())

		return buffer.toString()
	}

	protected enum class LinkType {
		FIELD: LinkType() {
			override fun create(sourceName: String, sourcePrefix: String, className: String?, classElement: String, postfix: String, custom: Boolean): String {
				val source = if ( className == null || className == sourceName ) "" else className
				val prefix = if ( custom ) "" else sourcePrefix

				return "{@link $source#$prefix$classElement${if ( prefix.isEmpty() ) "" else " $classElement"}}"
			}
		}
		METHOD: LinkType() {
			override fun create(sourceName: String, sourcePrefix: String, className: String?, classElement: String, postfix: String, custom: Boolean): String {
				val source = if ( className == null || className == sourceName ) "" else className
				val prefix = if ( custom ) "" else sourcePrefix

				val parentheses = classElement.indexOf('(')
				if ( parentheses == -1 )
					throw IllegalStateException("Invalid method link: $this#$prefix$classElement")

				val name = classElement.substring(0, parentheses)

				val hasParams = parentheses < classElement.length() - 2
				return "{@link $source#$prefix$name${if ( hasParams ) classElement.substring(parentheses) else ""}${if ( prefix.isEmpty() || hasParams || custom ) "" else " $name"}}"
			}
		}

		abstract fun create(sourceName: String, sourcePrefix: String, className: String?, classElement: String, postfix: String, custom: Boolean): String
	}

}

abstract class GeneratorTargetNative(
	packageName: String,
	className: String,
	val nativeSubPath: String = ""
): GeneratorTarget(packageName, className) {

	companion object {
		val DOT_PATTERN = Pattern.compile("[.]")
	}

	val nativeFileName: String
		get() = "${packageName.replace('.', '_')}_$className"

	val nativeFileNameJNI: String
	init {
		val fileName = StringBuilder(packageName.length() + className.length() + 4); // some extra room for escaping

		for ( subpackage in DOT_PATTERN.split(packageName) ) {
			fileName append subpackage.asJNIName
			fileName append '_'
		}

		fileName append className.asJNIName

		$nativeFileNameJNI = fileName.toString()
	}

	abstract fun PrintWriter.generateNative()

}

// ------------------------------------

abstract class CustomClass(
	packageName: String,
	className: String
): GeneratorTarget(packageName, className) {

	override fun PrintWriter.generateJava() {
		print(HEADER)
		println("package $packageName;\n")

		preamble.printJava(this)

		val documentation = this@CustomClass.documentation
		if ( documentation != null )
			println(processDocumentation(documentation).toJavaDoc(indentation = ""))

		generateContent()
	}

	protected abstract fun PrintWriter.generateContent(): Unit

}

fun CustomClass(
	packageName: String,
	className: String,
	init: (CustomClass.() -> Unit)? = null,
	printContent: PrintWriter.() -> Unit
): CustomClass {
	var cc = object: CustomClass(packageName, className) {
		override fun PrintWriter.generateContent() = printContent()
	}

	if ( init != null )
		cc.init()

	return cc
}