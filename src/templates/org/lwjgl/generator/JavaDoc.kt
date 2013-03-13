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

private fun String.cleanup(indentation: String = "\t"): String = trim()
	.replaceAll(PARAGRAPH_PATTERN, " <p/>\n")
	.replaceAll(CLEANUP_PATTERN, "$indentation * ")
	.replaceAll(TAB_PATTERN, "\t")

fun String.toJavaDoc(indentation: String = "\t", allowSingleLine: Boolean = true): String {
	val clean = cleanup(indentation)

	return if ( allowSingleLine && clean.indexOf('\n') == -1 )
		"$indentation/** $clean */"
	else
		"$indentation/**\n$indentation * $clean\n$indentation */"
}

/** Specialized conversion for methods. */
fun String.toJavaDoc(paramsIn: Iterator<Parameter>): String {
	// TODO: This is shit, optimize
	val params = paramsIn.filterTo(ArrayList<Parameter>()) { !(it has CallbackData.CLASS || it has autoSizeResult) }
	if ( params.isEmpty() )
		return this.toJavaDoc()

	val javaDoc = "\t/**\n\t * ${cleanup()}\n\t"

	val builder = StringBuilder(javaDoc)
	if ( javaDoc.indexOf('\n') == -1 )
		builder append "\n\t *"
	else
		builder append " *"

	// Find maximum param name length
	val alignment = params.map { it.name.size }.fold(0) {(left, right) -> Math.max(left, right) }

	val paramMultilineAligment = paramMultilineAligment(alignment)

	params.forEach {
		builder append "\n\t * @param ${it.name}"

		// Align
		for ( i in 0..(alignment - it.name.size - 1) )
			builder append ' '

		builder append " ${it.documentation.trim()
			.replaceAll(PARAGRAPH_PATTERN, " <p/>\n")
			.replaceAll(CLEANUP_PATTERN, paramMultilineAligment)
		}"
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
public fun codeBlock(code: String): String = "<pre>{@code\n${code
	.trim()
	.replaceAll(ESCAPE_TAB_PATTERN, tab) // Replace tabs/empty-lines with the tab token
	.replaceAll(CODE_BLOCK_CLEANUP_PATTERN, "\t") // Add a \t so that the JavaDoc layout code above picks up new lines.
}}</pre>"

public fun link(url: String, description: String): String = """<a href="$url">$description</a>"""

public fun table(vararg rows: String): String {
	val builder = StringBuilder(512)
	builder append """<table border="1" cellspacing="0" cellpadding="2">"""
	for ( row in rows ) {
		builder append "\n\t$tab"
		builder append row
	}
	builder append "\n\t</table>"

	return builder.toString()
}

public fun tr(vararg columns: String): String {
	val builder = StringBuilder()
	builder append "<tr align=\"center\">"
	for ( column in columns )
		builder append column
	builder append "</tr>"

	return builder.toString()
}

public fun td(content: String = "", colspan: Int = 1, rowspan: Int = 1): String {
	val builder = StringBuilder()
	builder append "<td"
	if ( 1 < colspan ) {
		builder append " colspan=\""
		builder append colspan
		builder append '\"'
	}
	if ( 1 < rowspan ) {
		builder append " rowspan=\""
		builder append rowspan
		builder append '\"'
	}
	builder append ">"
	builder append content.trim()
	builder append "</td>"

	return builder.toString()
}

private fun htmlList(tag: String, vararg items: String): String {
	val builder = StringBuilder(512)
	builder append "<$tag>\n"
	for ( li in items ) {
		builder append "\t$tab<li>"
		builder append li.trim()
		builder append "</li>\n"
	}
	builder append "\t</$tag>"

	return builder.toString()
}

public fun ul(vararg items: String): String = htmlList("ul", *items)
public fun ol(vararg items: String): String = htmlList("ol", *items)