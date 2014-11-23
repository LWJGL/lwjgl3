/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.util.ArrayList
import java.util.regex.Pattern

private val PARAGRAPH_PATTERN = Pattern.compile("\\s*^\\s*$\\s*", Pattern.MULTILINE)
private val CLEANUP_PATTERN = Pattern.compile("^[ \t]++(?![*])", Pattern.MULTILINE)
private val UNESCAPE_PATTERN = Pattern.compile("\uFFFF")

fun String.replaceAll(pattern: Pattern, replacement: String) = pattern.matcher(this).replaceAll(replacement)

private fun String.cleanup(linePrefix: String = "\t * "): String {
	val trimmed = trim()
	val matcher = PARAGRAPH_PATTERN.matcher(trimmed)

	val result: String
	if ( matcher.find() ) {
		val builder = StringBuilder(trimmed.size)

		fun StringBuilder.appendParagraph(linePrefix: String, text: String, start: Int, end: Int) {
			this append '\n'
			this append linePrefix
			this append '\n'
			this append linePrefix
			val p = !text.startsWith("<h3>", start)
			if ( p ) this append "<p>"
			this.append(text, start, end)
			if ( p ) this append "</p>"
		}

		builder.append(trimmed, 0, matcher.start())

		var lastMatch = matcher.end()
		while ( matcher.find() ) {
			builder.appendParagraph(linePrefix, trimmed, lastMatch, matcher.start())
			lastMatch = matcher.end()
		}
		builder.appendParagraph(linePrefix, trimmed, lastMatch, trimmed.size)

		result = builder.toString()
	} else
		result = trimmed

	return result
		.replaceAll(CLEANUP_PATTERN, linePrefix)
		.replaceAll(UNESCAPE_PATTERN, "")
}

fun String.toJavaDoc(indentation: String = "\t", allowSingleLine: Boolean = true): String {
	val clean = cleanup("$indentation * ")

	return if ( allowSingleLine && clean.indexOf('\n') == -1 )
		"$indentation/** $clean */"
	else
		"$indentation/**\n$indentation * $clean\n$indentation */"
}

/** Specialized conversion for methods. */
fun NativeClass.toJavaDoc(documentation: String, paramsIn: Stream<Parameter>, returnDoc: String, since: String): String {
	// TODO: This is shit, optimize
	val params = paramsIn.filterTo(ArrayList<Parameter>()) { !it.isAutoSizeResultOut }
	if ( params.isEmpty() && returnDoc.isEmpty() )
		return documentation.toJavaDoc()

	val javaDoc = "\t/**\n\t * ${documentation.cleanup()}"

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

			builder append processDocumentation(it.documentation).cleanup(paramMultilineAligment)
		}
	}

	if ( !returnDoc.isEmpty() ) {
		builder append "\n\t *"
		builder append "\n\t * @return "
		builder append processDocumentation(returnDoc).cleanup("\t *         ")
	}

	if ( !since.isEmpty() ) {
		builder append "\n\t *"
		builder append "\n\t * @since "
		builder append since
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

/** Useful for simple expression with embedded markup. */
fun code(code: String) = """<code style="font-family: monospace">$code</code>"""

private val TRIM_PATTERN = Pattern.compile("""^\s*\n|\n\s*$""") // first and/or last empty lines...
private val ESCAPE_PATTERN = Pattern.compile("^[ \t\n]", Pattern.MULTILINE) // leading space/tab in line, empty line
private val CODE_BLOCK_CLEANUP_PATTERN = Pattern.compile("^", Pattern.MULTILINE) // to the start of all lines...

/** Useful for raw code blocks without markup. */
fun codeBlock(code: String) = """<pre><code style="font-family: monospace">
${code
	.replaceAll(TRIM_PATTERN, "") // ...trim (not lines with content)
	.replaceAll(ESCAPE_PATTERN, "\uFFFF$0") // ...escape
	.replaceAll(CODE_BLOCK_CLEANUP_PATTERN, "\t") // ...add a \t so that the JavaDoc layout code above picks up new lines.
}</code></pre>"""

fun url(href: String, innerHTML: String) = """<a href="$href">$innerHTML</a>"""

fun table(vararg rows: String, matrix: Boolean = false): String {
	val builder = StringBuilder(512)
	builder append "<table border=1 cellspacing=0 cellpadding=2 class=${if ( matrix ) "\"lwjgl matrix\"" else "lwjgl"}>"
	for ( row in rows ) {
		builder append "\n\t"
		builder append row
	}
	builder append "\n\t</table>"

	return builder.toString()
}

fun tr(vararg columns: String): String {
	val builder = StringBuilder()
	builder append "<tr>"
	for ( column in columns )
		builder append column
	builder append "</tr>"

	return builder.toString()
}

fun th(content: String = "", colspan: Int = 1, rowspan: Int = 1) = td(content, colspan, rowspan, "th")
fun td(content: String = "", colspan: Int = 1, rowspan: Int = 1, tag: String = "td"): String {
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

private fun htmlList(tag: String, attributes: String, vararg items: String): String {
	val builder = StringBuilder(512)
	builder append "<$tag"
	if ( attributes.isNotEmpty() )
		builder append " $attributes"
	builder append ">\n"
	for ( li in items ) {
		builder append "\t<li>"
		builder append li.trim()
		builder append "</li>\n"
	}
	builder append "\t</$tag>"

	return builder.toString()
}

fun ul(vararg items: String) = htmlList("ul", "", *items)
fun ol(vararg items: String, marker: Char = '1') = htmlList("ol", if ( marker == '1' ) "" else " type=$marker", *items)