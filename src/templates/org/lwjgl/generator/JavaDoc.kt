/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.util.ArrayList
import java.util.regex.Pattern

/** Can be used inside JavaDoc. Will be replaced by a \t character after laying out the output JavaDoc. */
public val tab: String = "#TAB"

private val PARAGRAPH_PATTERN = Pattern.compile("^\\s*$", Pattern.MULTILINE)
private val CLEANUP_PATTERN = Pattern.compile("^\\s+", Pattern.MULTILINE)
private val TAB_PATTERN = Pattern.compile(tab)

fun String.replaceAll(pattern: Pattern, replacement: String): String = pattern.matcher(this).replaceAll(replacement)

private fun String.cleanup(linePrefix: String = "\t * "): String = trim()
	.replaceAll(PARAGRAPH_PATTERN, " <p/>\n")
	.replaceAll(CLEANUP_PATTERN, linePrefix)
	.replaceAll(TAB_PATTERN, "\t")

fun String.toJavaDoc(indentation: String = "\t", allowSingleLine: Boolean = true): String {
	val clean = cleanup("$indentation * ")

	return if ( allowSingleLine && clean.indexOf('\n') == -1 )
		"$indentation/** $clean */"
	else
		"$indentation/**\n$indentation * $clean\n$indentation */"
}

/** Specialized conversion for methods. */
fun String.toJavaDoc(paramsIn: Iterator<Parameter>, returnDoc: String): String {
	// TODO: This is shit, optimize
	val params = paramsIn.filterTo(ArrayList<Parameter>()) { !it.isAutoSizeResultOut }
	if ( params.isEmpty() && returnDoc.isEmpty() )
		return this.toJavaDoc()

	val javaDoc = "\t/**\n\t * ${cleanup()}"

	val builder = StringBuilder(javaDoc)

	if ( !params.isEmpty() ) {
		// Find maximum param name length
		val alignment = params.map { it.name.size }.fold(0) {(left, right) -> Math.max(left, right) }

		val paramMultilineAligment = paramMultilineAligment(alignment)

		builder append "\n\t *"
		params.forEach {
			builder append "\n\t * @param ${it.name}"

			// Align
			for ( i in 0..(alignment - it.name.size) )
				builder append ' '

			builder append it.documentation.cleanup(paramMultilineAligment)
		}
	}

	if ( !returnDoc.isEmpty() ) {
		builder append "\n\t *"
		builder append "\n\t * @return "
		builder append returnDoc.cleanup("\t *         ")
	}

	builder append "\n\t */"

	return builder.toString()
}

// Used for aligning parameter javadoc when it spans multiple lines.
private fun paramMultilineAligment(alignment: Int): String {
	val whitespace = " @param ".size + alignment + 1
	val builder = StringBuilder("\t *".size + whitespace)

	builder append "\t *"
	for ( i in whitespace.indices )
		builder append ' '

	return builder.toString()
}

// DSL extensions

private val ESCAPE_TAB_PATTERN = Pattern.compile("\t|(?:^\\s*$)", Pattern.MULTILINE) // Tabs and empty-lines
private val CODE_BLOCK_CLEANUP_PATTERN = Pattern.compile("^", Pattern.MULTILINE)

/** Useful for simple expression with embedded markup. */
public fun code(code: String): String = "<code>$code</code>"

/** Useful for raw code blocks without markup. */
public fun codeBlock(code: String): String = "<pre><code>\n${code
	.trim()
	.replaceAll(ESCAPE_TAB_PATTERN, tab) // Replace tabs/empty-lines with the tab token
	.replaceAll(CODE_BLOCK_CLEANUP_PATTERN, "\t") // Add a \t so that the JavaDoc layout code above picks up new lines.
}</code></pre>"

public fun String.linkPlain(name: String): String = link(name, prefix = "")
public fun String.link(name: String, prefix: String = ""): String {
	val link =
		if ( name.endsWith(')') ) {
			// Method
			val parentheses = name.indexOf('(')
			if ( parentheses == -1 )
				throw IllegalStateException("Invalid method link: $this#$prefix$name")

			val simpleName = name.substring(0, parentheses)
			val hasParams = parentheses == name.size - 2
			"$this#$prefix${if ( hasParams ) simpleName else name}${if ( prefix.isEmpty() && !hasParams ) "" else " $simpleName"}"
		} else {
			// Field
			if ( this.isEmpty() && prefix.isEmpty() )
				"#$name"
			else
				"$this#$prefix$name $name"
		}

	return "{@link $link}"
}

val String.link: String
    get() {
        val hash = this.indexOf('#')
        return if ( hash == -1 ) "".link(this) else this.substring(0, hash).link(this.substring(hash + 1))
    }

public fun url(href: String, innerHTML: String): String = """<a href="$href">$innerHTML</a>"""

public fun table(vararg rows: String, matrix: Boolean = false): String {
	val builder = StringBuilder(512)
	builder append "<table border=1 cellspacing=0 cellpadding=2 class=${if ( matrix ) "\"lwjgl matrix\"" else "lwjgl"}>"
	for ( row in rows ) {
		builder append "\n\t"
		builder append row
	}
	builder append "\n\t</table>"

	return builder.toString()
}

public fun tr(vararg columns: String): String {
	val builder = StringBuilder()
	builder append "<tr>"
	for ( column in columns )
		builder append column
	builder append "</tr>"

	return builder.toString()
}

public fun th(content: String = "", colspan: Int = 1, rowspan: Int = 1): String = td(content, colspan, rowspan, "th")
public fun td(content: String = "", colspan: Int = 1, rowspan: Int = 1, tag: String = "td"): String {
	val builder = StringBuilder()
	builder append "<$tag"
	if ( 1 < colspan )
		builder append " colspan=$colspan"
	if ( 1 < rowspan )
		builder append " rowspan=$rowspan"
	builder append ">"
	builder append content.trim()
	builder append "</$tag>"

	return builder.toString()
}

private fun htmlList(tag: String, vararg items: String): String {
	val builder = StringBuilder(512)
	builder append "<$tag>\n"
	for ( li in items ) {
		builder append "\t<li>"
		builder append li.trim()
		builder append "</li>\n"
	}
	builder append "\t</$tag>"

	return builder.toString()
}

public fun ul(vararg items: String): String = htmlList("ul", *items)
public fun ol(vararg items: String): String = htmlList("ol", *items)