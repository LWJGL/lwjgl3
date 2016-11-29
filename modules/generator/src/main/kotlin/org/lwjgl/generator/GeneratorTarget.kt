/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*
import java.nio.file.*
import java.util.*
import java.util.regex.*


val HEADER = """/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
"""

class Preamble {

	companion object {
		data class NativeDefine(
			val expression: String,
			val beforeIncludes: Boolean
		)

		private val EMPTY_IMPORTS = ArrayList<String>(0)
		private val EMPTY_DIRECTIVES = ArrayList<NativeDefine>(0)
	}

	private var javaImports: MutableList<String> = EMPTY_IMPORTS

	private var nativeImports: MutableList<String> = EMPTY_IMPORTS
	private var nativeDirectives: MutableList<NativeDefine> = EMPTY_DIRECTIVES

	internal val hasNativeDirectives: Boolean get() = nativeImports.isNotEmpty() || nativeDirectives.isNotEmpty()

	fun javaImport(vararg classes: String) {
		if (javaImports === EMPTY_IMPORTS)
			javaImports = ArrayList(classes.size)

		classes.forEach {
			javaImports.add(it)
		}
	}

	fun nativeImport(vararg files: String) {
		if (nativeImports === EMPTY_IMPORTS)
			nativeImports = ArrayList(files.size)

		files.forEach {
			nativeImports.add(if (it.startsWith('<'))
				it
			else
				"\"$it\"")
		}
	}

	fun nativeDirective(expression: String, beforeIncludes: Boolean) {
		if (nativeDirectives === EMPTY_DIRECTIVES)
			nativeDirectives = ArrayList()

		nativeDirectives.add(NativeDefine(expression, beforeIncludes))
	}

	fun printJava(writer: PrintWriter) {
		if (javaImports.isEmpty())
			return

		fun List<String>.print() = this.forEach { writer.println("import $it;") }

		val static = javaImports.filter { it.startsWith("static ") }
		if (!static.isEmpty() && static.size < javaImports.size) {
			// Separate plain from static imports
			javaImports.filter { !it.startsWith("static ") }.print()
			writer.println()
			static.print()
		} else
			javaImports.print()

		writer.println()
	}

	internal fun printNative(writer: PrintWriter) {
		nativeDirectives.filter { it.beforeIncludes }.forEach {
			writer.println(it.expression)
		}

		writer.println("#include \"common_tools.h\"")
		nativeImports.forEach {
			writer.println("#include $it")
		}

		nativeDirectives.filter { !it.beforeIncludes }.forEach {
			writer.println(it.expression)
		}
	}

}

private val JNI_UNDERSCORE_ESCAPE_PATTERN = Pattern.compile("_")

internal val String.asJNIName: String
	get() = if (this.indexOf('_') == -1)
		this
	else
		this.replaceAll(JNI_UNDERSCORE_ESCAPE_PATTERN, "_1")

enum class Access(val modifier: String) {
	PUBLIC("public "),
	INTERNAL(""),
	PRIVATE("private ")
}

abstract class GeneratorTarget(
	val packageName: String,
	val className: String
) : TemplateElement() {

	companion object {
		private val LINKS: Pattern = {
			val JAVA = """\p{javaJavaIdentifierStart}\p{javaJavaIdentifierPart}*(?:\.\p{javaJavaIdentifierStart}\p{javaJavaIdentifierPart}*)*"""
			val NATIVE = """\p{javaJavaIdentifierPart}+""" // Must match tokens like GL_3_BYTES (the link is #3_BYTES)
			Pattern.compile("""($JAVA)?(?<!&)([@\\]?#{1,2})($NATIVE+(?:\((?:(?:, )?$JAVA)*\))?)""")
		}()
	}

	private fun getSourceFileName(): String? {
		// Nasty hack to retrieve the source file that defines this template, without having to specify it explictly.
		// This enables incremental builds to work even with arbitrary file names or when multiple templates are bundled
		// in the same file (e.g. ExtensionFlags).
		try {
			throw RuntimeException()
		} catch (t: Throwable) {
			return t.stackTrace.asSequence()
				.filter { !it.className.startsWith("org.lwjgl.generator.") }
				.mapNotNull { it.fileName }
				.filter { it.endsWith(".kt") && !(this is NativeClass && it.endsWith("Binding.kt")) }
				.firstOrNull()
		}
	}

	internal val sourceFile = getSourceFileName()
	internal open fun getLastModified(root: String): Long = Paths.get(root, sourceFile).let {
		if (Files.isRegularFile(it)) it else
			throw IllegalStateException("The source file for template $packageName.$className does not exist ($it).")
	}.lastModified

	var access = Access.PUBLIC
		set(access) {
			if (access === Access.PRIVATE)
				throw IllegalArgumentException("The private access modifier is illegal on top-level classes.")
			field = access
		}

	var documentation: String? = null

	internal val preamble = Preamble()

	fun <T : GeneratorTarget> T.javaImport(vararg classes: String): T {
		preamble.javaImport(*classes)
		return this
	}

	fun <T : GeneratorTarget> T.nativeDirective(expression: String, beforeIncludes: Boolean = false): T {
		preamble.nativeDirective(expression, beforeIncludes)
		return this
	}

	fun <T : GeneratorTarget> T.nativeImport(vararg files: String): T {
		preamble.nativeImport(*files)
		return this
	}

	fun NativeType.IN(name: String, javadoc: String, links: String = "", linkMode: LinkMode = LinkMode.SINGLE) = createParameter(name, ParameterType.IN, javadoc, links, linkMode)
	fun PointerType.OUT(name: String, javadoc: String, links: String = "", linkMode: LinkMode = LinkMode.SINGLE) = createParameter(name, ParameterType.OUT, javadoc, links, linkMode)
	fun PointerType.INOUT(name: String, javadoc: String, links: String = "", linkMode: LinkMode = LinkMode.SINGLE) = createParameter(name, ParameterType.INOUT, javadoc, links, linkMode)

	private fun NativeType.createParameter(
		name: String,
		paramType: ParameterType,
		javadoc: String,
		links: String,
		linkMode: LinkMode = LinkMode.SINGLE
	) = if (links.isEmpty() || !links.contains('+'))
		Parameter(this, name, paramType, javadoc, links, linkMode)
	else
		Parameter(this, name, paramType) { linkMode.appendLinks(javadoc, linksFromRegex(links)) }

	protected fun linksFromRegex(pattern: String) = pattern.toRegex().let { regex ->
		Generator.tokens[packageName]!!
			.asSequence()
			.mapNotNull { if (regex.matches(it.key)) it.key else null }
			.joinToString(" #", prefix = "#")
			.let {
				if (it.isEmpty())
					throw IllegalStateException("Failed to match any tokens with regex: $pattern")
				else
					it
			}
	}

	infix fun Int.x(other: Int) = this * other

	protected fun PrintWriter.generateJavaPreamble() {
		print(HEADER)
		println("package $packageName;\n")

		preamble.printJava(this)

		val documentation = this@GeneratorTarget.documentation
		if (documentation != null)
			println(processDocumentation(documentation).toJavaDoc(indentation = ""))
	}

	abstract fun PrintWriter.generateJava()

	open fun processDocumentation(documentation: String, forcePackage: Boolean = false): String = processDocumentation(documentation, "", "", forcePackage)

	open fun getFieldLink(field: String): String? = null
	open fun getMethodLink(method: String): String? = null

	protected fun processDocumentation(documentation: String, prefixConstant: String, prefixMethod: String, forcePackage: Boolean = false): String {
		val matcher = LINKS.matcher(documentation)
		if (!matcher.find())
			return documentation

		val buffer = StringBuilder(documentation.length * 2)

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
			if (linkMethod[0] == '\\') {
				buffer.append(matcher.group().replace("\\#", "#"))
			} else {
				if (linkMethod[0] == '@')
					buffer.append("see ")

				var className = matcher.group(1)
				var classElement = matcher.group(3)!!

				val linkType = if (classElement.endsWith(')')) LinkType.METHOD else LinkType.FIELD
				var prefix = if (linkType === LinkType.FIELD) prefixConstant else prefixMethod

				buffer.append(linkMethod.count { it == '#' }.let { hashes ->
					if (hashes == 1) {
						if (className == null) {
							val qualifiedLink = if (linkType === LinkType.FIELD)
								getFieldLink(classElement) ?: Generator.tokens[packageName]!![classElement]
							else
								classElement.substring(0, classElement.lastIndexOf('(')).let {
									getMethodLink(it) ?: Generator.functions[packageName]!![it]
								}

							if (qualifiedLink != null) {
								val hashIndex = qualifiedLink.indexOf('#')

								className = qualifiedLink.substring(0, hashIndex)
								if (forcePackage)
									className = "$packageName.$className"

								prefix = qualifiedLink.substring(hashIndex + 1, qualifiedLink.length - if (linkType === LinkType.FIELD)
									classElement.length
								else
									classElement.lastIndexOf('(') + 2
								)
							} else if (this.packageName != "org.lwjgl.vulkan")
								throw IllegalStateException("Failed to resolve link: ${matcher.group()} in ${this.className}")
						} else {
							if (classElement.startsWith(prefix))
								classElement = classElement.substring(prefix.length)
							else
								prefix = ""
						}
						linkType.create(this.className, prefix, className, classElement, if (this is NativeClass) this.postfix else "", custom = false)
					} else if (hashes == 2 && className == null && linkType === LinkType.FIELD)
						"{@link $classElement}"
					else
						throw IllegalStateException("Unsupported link syntax: ${matcher.group()} in ${this.className}")
				})
			}

			lastEnd = matcher.end()
		} while (matcher.find())

		buffer.append(documentation, lastEnd, documentation.length)

		return buffer.toString()
	}

	private enum class LinkType {
		FIELD {
			override fun create(sourceName: String, sourcePrefix: String, className: String?, classElement: String, postfix: String, custom: Boolean): String {
				val source = if (className == null || className == sourceName) "" else className
				val prefix = if (custom) "" else sourcePrefix

				return "{@link $source#$prefix$classElement${if (custom || prefix.isEmpty()) "" else " $classElement"}}"
			}
		},
		METHOD {
			override fun create(sourceName: String, sourcePrefix: String, className: String?, classElement: String, postfix: String, custom: Boolean): String {
				val source = if (className == null || className == sourceName) "" else className
				val prefix = if (custom) "" else sourcePrefix

				val parentheses = classElement.indexOf('(')
				if (parentheses == -1)
					throw IllegalStateException("Invalid method link: $this#$prefix$classElement")

				val name = classElement.substring(0, parentheses)

				val hasParams = parentheses < classElement.length - 2
				return "{@link $source#$prefix$name${if (hasParams) classElement.substring(parentheses) else ""}${when {
					hasParams || custom || prefix.isEmpty()
					     -> ""
					else -> " $name"
				}}}"
			}
		};

		abstract fun create(sourceName: String, sourcePrefix: String, className: String?, classElement: String, postfix: String, custom: Boolean): String
	}

}

abstract class GeneratorTargetNative(
	packageName: String,
	className: String,
	val nativeSubPath: String = ""
) : GeneratorTarget(packageName, className) {

	internal val nativeFileName: String
		get() = "${packageName.replace('.', '_')}_$className"

	internal val nativeFileNameJNI = packageName
		.splitToSequence('.')
		.plus(className)
		.map { it.asJNIName }
		.joinToString("_")

	open val skipNative: Boolean = false

	protected fun PrintWriter.generateNativePreamble() {
		print(HEADER)
		preamble.printNative(this)
	}

	abstract fun PrintWriter.generateNative()

}

// ------------------------------------

fun packageInfo(
	packageName: String,
	documentation: String
) {
	val pi = object : GeneratorTarget(packageName, "package-info") {
		override fun PrintWriter.generateJava() {
			print(HEADER)
			println()
			println(processDocumentation(documentation, forcePackage = true).toJavaDoc(indentation = ""))
			println("package $packageName;\n")
		}
	}

	Generator.register(pi)
}