/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.util.*
import java.util.regex.Pattern

private val BLOCK_NODE = "(?:h3|table|ul|ol|pre)" // TODO: add more here if necessary
private val BLOCK_PATTERN = Pattern.compile("\\s*^\\s*$\\s*|\\s*$\\s+(?=<$BLOCK_NODE)|(?<=</$BLOCK_NODE>)\\s+^\\s*", Pattern.MULTILINE)
private val NON_PARAGRAPH_PATTERN = Pattern.compile("^<$BLOCK_NODE")
private val CLEANUP_PATTERN = Pattern.compile("^[ \t]++(?![*])", Pattern.MULTILINE)
private val UNESCAPE_PATTERN = Pattern.compile("\uFFFF")

fun String.replaceAll(pattern: Pattern, replacement: String) = pattern.matcher(this).replaceAll(replacement)

private fun StringBuilder.appendBlock(linePrefix: String, text: String, start: Int, end: Int) {
	append('\n')
	append(linePrefix)
	append('\n')
	append(linePrefix)
	val p = !NON_PARAGRAPH_PATTERN.matcher(text.substring(start)).find()
	if ( p ) append("<p>")
	this.append(text, start, end)
	if ( p ) append("</p>")
}

private fun String.cleanup(linePrefix: String = "\t * "): String {
	val trimmed = trim()
	val matcher = BLOCK_PATTERN.matcher(trimmed)

	return if (matcher.find()) {
		StringBuilder(trimmed.length).run {
			append(trimmed, 0, matcher.start())

			var lastMatch = matcher.end()
			while ( matcher.find() ) {
				appendBlock(linePrefix, trimmed, lastMatch, matcher.start())
				lastMatch = matcher.end()
			}
			appendBlock(linePrefix, trimmed, lastMatch, trimmed.length)

			toString()
		}
	} else {
		trimmed
	}
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
fun GeneratorTarget.toJavaDoc(documentation: String, paramsIn: Sequence<Parameter>, returns: NativeType, returnDoc: String, since: String): String {
	if ( documentation.isEmpty() && returnDoc.isEmpty() && since.isEmpty() && paramsIn.none() { it.documentation.isNotEmpty() } )
		return ""

	// TODO: This is shit, optimize
	val hideAutoSizeResult = returns !is StructType && paramsIn.filter { it.isAutoSizeResultOut }.count() == 1
	val params = paramsIn.filterTo(ArrayList<Parameter>()) { !(it.isAutoSizeResultOut && hideAutoSizeResult) }
	if ( params.isEmpty() && returnDoc.isEmpty() )
		return documentation.toJavaDoc()

	return StringBuilder("\t/**\n\t * ${documentation.cleanup()}").run {
		val returnsStructValue = !returnDoc.isEmpty() && returns is StructType && !returns.includesPointer

		if ( !params.isEmpty() ) {
			// Find maximum param name length
			var alignment = params.map { it.name.length }.fold(0) { left, right -> Math.max(left, right) }
			if ( returnsStructValue )
				alignment = Math.max(alignment, RESULT.length)

			val multilineAligment = paramMultilineAligment(alignment)

			append("\n\t *")
			params.forEach {
				printParam(this, it.name, processDocumentation(it.documentation), alignment, multilineAligment)
			}
			if ( returnsStructValue )
				printParam(this, RESULT, processDocumentation(returnDoc), alignment, multilineAligment)
		}

		if ( !returnDoc.isEmpty() && !returnsStructValue ) {
			append("\n\t *")
			append("\n\t * @return ")
			append(processDocumentation(returnDoc).cleanup("\t *         "))
		}

		if ( !since.isEmpty() ) {
			append("\n\t *")
			append("\n\t * @since ")
			append(since)
		}

		append("\n\t */")

		toString()
	}
}

// Used for aligning parameter javadoc when it spans multiple lines.
private fun paramMultilineAligment(alignment: Int): String {
	val whitespace = " @param ".length + alignment + 1
	return StringBuilder("\t *".length + whitespace).run {
		append("\t *")
		for (i in 0..whitespace - 1)
			append(' ')

		toString()
	}
}

private fun printParam(builder: StringBuilder, name: String, documentation: String, alignment: Int, multilineAligment: String) {
	builder.append("\n\t * @param $name")

	// Align
	for (i in 0..(alignment - name.length))
		builder.append(' ')

	builder.append(documentation.cleanup(multilineAligment))
}

// DSL extensions

/** Useful for simple expressions. */
fun code(code: String) = """<code>$code</code>"""

private val CODE_BLOCK_TRIM_PATTERN = Pattern.compile("""^\s*\n|\n\s*$""") // first and/or last empty lines...
private val CODE_BLOCK_ESCAPE_PATTERN = Pattern.compile("^[ \t\n]", Pattern.MULTILINE) // leading space/tab in line, empty line
private val CODE_BLOCK_TAB_PATTERN = Pattern.compile("\t") // tabs

/** Useful for pre-formatted code blocks. */
fun codeBlock(code: String) = """<pre><code>${code
	.replaceAll(CODE_BLOCK_TRIM_PATTERN, "") // ...trim
	.replaceAll(CODE_BLOCK_ESCAPE_PATTERN, "\uFFFF$0") // ...escape
	.replaceAll(CODE_BLOCK_TAB_PATTERN, "    ") // ...replace with 4 spaces for consistent formatting.
}</code></pre>"""

fun url(href: String, innerHTML: String) = """<a href="$href">$innerHTML</a>"""

fun table(vararg rows: String, matrix: Boolean = false) = StringBuilder(512).run {
	append("<table class=${if ( matrix ) "\"lwjgl matrix\"" else "lwjgl"}>")
	for (row in rows) {
		append("\n\t")
		append(row)
	}
	append("\n\t</table>")

	toString()
}

fun tr(vararg columns: String) = StringBuilder().run {
	append("<tr>")
	for (column in columns)
		append(column)
	append("</tr>")

	toString()
}

fun th(content: String = "", colspan: Int = 1, rowspan: Int = 1) = td(content, colspan, rowspan, "th")
fun td(content: String = "", colspan: Int = 1, rowspan: Int = 1, tag: String = "td", className: String? = null) = StringBuilder().run {
	append("<$tag")
	if ( 1 < colspan )
		append(" colspan=$colspan")
	if ( 1 < rowspan )
		append(" rowspan=$rowspan")
	if ( className != null )
		append(" class=\"$className\"")
	append(">")
	append(content.trim())
	append("</$tag>")

	toString()
}

private fun htmlList(tag: String, attributes: String, vararg items: String) = StringBuilder(512).run {
	append("<$tag")
	if ( attributes.isNotEmpty() )
		append(" $attributes")
	append(">\n")
	for (li in items) {
		append("\t<li>")
		append(li.trim())
		append("</li>\n")
	}
	append("\t</$tag>")

	toString()
}

fun ul(vararg items: String) = htmlList("ul", "", *items)
fun ol(vararg items: String, marker: Char = '1') = htmlList("ol", if ( marker == '1' ) "" else "type=$marker", *items)