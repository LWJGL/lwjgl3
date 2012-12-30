/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.util.regex.Pattern

private val PARAGRAPH_PATTERN = Pattern.compile("^\\s*$", Pattern.MULTILINE)
private val CLEANUP_PATTERN = Pattern.compile("^\\s+", Pattern.MULTILINE)

private fun String.replaceAll(pattern: Pattern, replacement: String): String = pattern.matcher(this).replaceAll(replacement)

fun String.toJavaDoc(indentation: String = "\t", allowSingleLine: Boolean = true): String {
	val clean = trim()
		.replaceAll(PARAGRAPH_PATTERN, " <p/>\n")
		.replaceAll(CLEANUP_PATTERN, "$indentation * ")

	return if ( allowSingleLine && clean.indexOf('\n') == -1 )
		"$indentation/** $clean */"
	else
		"$indentation/**\n$indentation * $clean\n$indentation */"
}

/** Specialized conversion for methods. */
fun String.toJavaDoc(vararg params: Parameter): String {
	if ( params.isEmpty() )
		return this.toJavaDoc()

	val clean = trim()
		.replaceAll(PARAGRAPH_PATTERN, " <p/>\n")
		.replaceAll(CLEANUP_PATTERN, "\t * ")
	val javaDoc = "\t/**\n\t * $clean\n\t"

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

public fun code(code: String): String = "<code>$code</code>"

public fun link(url: String, description: String): String = """<a href="$url">$description</a>"""

public fun table(vararg rows: String): String {
	val builder = StringBuilder(512)
	builder append """<table border="1" cellspacing="0" cellpadding="2">\n"""
	for ( row in rows ) {
		builder append "\t\t"
		builder append row
		builder append '\n'
	}
	builder append "\t</table>"

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
	builder append content
	builder append "</td>"

	return builder.toString()
}

