/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import kotlin.math.*

private val REDUNDANT_WHITESPACE = "^[ \\t]+$".toRegex(RegexOption.MULTILINE)
private const val BLOCK_NODE = "(?:div|h[1-6]|pre|table|thead|tfoot|tbody|td|tr|ul|li|ol|dl|dt|dd)" // TODO: add more here if necessary
private val FRAGMENT = "(</?$BLOCK_NODE(?:\\s[^>]+)?>|^)([\\s\\S]*?)(?=</?$BLOCK_NODE(?:\\s[^>]+)?>|$)".toRegex()
private val CHILD_NODE = "<(?:tr|thead|tfoot|tbody|li|dt|dd)>".toRegex()
private val PARAGRAPH_PATTERN = "\\n\\n(?:\\n?[ \\t]*[\\S][^\\n]*)+".toRegex(RegexOption.MULTILINE)
private val PREFIX_PATTERN = "^(?:\uFFFF|[ \t]++(?![*]))".toRegex(RegexOption.MULTILINE)

/*
Here we perform the following transformation:

<block>                 <block>
text                    text

text            =>      <p>text</p>

text                    <p>text</p>

    <div>                   <div>
    text                    text

    text                    <p>text</p>
    </div>                  </div>

text                    <p>text</p>
</block>                </block>

The first text sub-block is not wrapped in <p> because:
    a) It is not strictly necessary, renders fine in browsers and IDEs.
    b) It improves readability of the source javadoc.

For the purposes of this transformation, the javadoc root is an implicit block.
 */
private fun String.cleanup(linePrefix: String = "$t * "): String {
    val dom = trim().replace(REDUNDANT_WHITESPACE, "")
    return StringBuilder(dom.length)
        .layoutDOM(dom, linePrefix)
        .replace(PREFIX_PATTERN, linePrefix)
}

private fun StringBuilder.layoutDOM(dom: String, linePrefix: String): StringBuilder {
    FRAGMENT.findAll(dom).forEach { match ->
        val (tag, text) = match.destructured

        if (tag.isNotEmpty()) {
            if (startNewLine(dom, match.range.first)) {
                if (!tag.startsWith("</") && !tag.matches(CHILD_NODE)) {
                    append('\n')
                    append(linePrefix)
                }
                append('\n')
                append(linePrefix)
            }
            append(tag)
        }

        text.trim().let {
            if (it.isNotEmpty())
                layoutText(it, linePrefix, forceParagraph = tag.isNotEmpty() && tag.startsWith("</"))
        }
    }

    return this
}

private fun startNewLine(dom: String, index: Int): Boolean {
    if (index == 0)
        return false

    for (i in (index - 1) downTo 0) {
        if (dom[i] == '\n')
            return true

        if (!dom[i].isWhitespace())
            break
    }

    return false
}

private fun StringBuilder.layoutText(text: String, linePrefix: String, forceParagraph: Boolean = false) {
    var to: Int = -1

    PARAGRAPH_PATTERN.findAll(text).forEach { match ->
        val from = match.range.first
        if (to == -1 && from > 0)
            appendParagraphFirst(linePrefix, text, from, forceParagraph)

        to = match.range.last + 1
        appendParagraph(linePrefix, text, from, to)
    }

    if (to == -1)
        appendParagraphFirst(linePrefix, text, text.length, forceParagraph)
    else if (to < text.length)
        appendParagraph(linePrefix, text, to, text.length)
}

private fun StringBuilder.appendParagraphFirst(linePrefix: String, text: String, end: Int, forceParagraph: Boolean = false) {
    if (forceParagraph)
        appendParagraph(linePrefix, text, 0, end)
    else
        append(text, 0, end)
}

private fun StringBuilder.appendParagraph(linePrefix: String, text: String, start: Int, end: Int) {
    append('\n')
    append(linePrefix)
    append('\n')
    append(linePrefix)

    append("<p>")
    append(text.substring(start, end).trim())
    append("</p>")
}

private fun String.layoutJavadoc(indentation: String = t): String {
    return if (this.indexOf('\n') == -1)
        "$indentation/** $this */"
    else
        "$indentation/**\n$indentation * $this\n$indentation */"
}

fun String.toJavaDoc(indentation: String = t, see: Array<String>? = null, since: String = "") =
    if (see == null && since.isEmpty()) {
        this
            .cleanup("$indentation * ")
            .layoutJavadoc(indentation)
    } else {
        StringBuilder(if (this.isEmpty()) "" else this.cleanup("$indentation * "))
            .apply {
                if (see != null) {
                    if (isNotEmpty()) append("\n$indentation *")
                    see.forEach {
                        if (isNotEmpty()) append("\n$indentation * ")
                        append("@see ")
                        append(it)
                    }
                }

                if (since.isNotEmpty()) {
                    if (isNotEmpty()) append("\n$indentation *\n$indentation * ")
                    append("@since ")
                    append(since)
                }

            }
            .toString()
            .layoutJavadoc(indentation)
    }

/** Specialized formatting for methods. */
internal fun GeneratorTarget.toJavaDoc(
    documentation: String,
    params: Sequence<Parameter>,
    returns: NativeType,
    returnDoc: String,
    see: Array<String>?,
    since: String
): String {
    if (returnDoc.isEmpty() && see == null && since.isEmpty()) {
        if (documentation.isEmpty() && params.all { it.documentation == null })
            return ""

        if (params.none())
            return documentation.toJavaDoc()
    }

    return StringBuilder(if (documentation.isEmpty()) "" else documentation.cleanup())
        .apply {
            val paramsWithJavadoc = params.filter { it.documentation != null }
            val returnsStructValue = returnDoc.isNotEmpty() && returns is StructType

            if (paramsWithJavadoc.any() || returnsStructValue) {
                // Find maximum param name length
                var alignment = paramsWithJavadoc
                    .map { it.name.length }
                    .fold(0) { left, right -> max(left, right) }
                if (returnsStructValue)
                    alignment = max(alignment, RESULT.length)

                val multilineAligment = paramMultilineAligment(alignment)

                if (isNotEmpty()) append("\n$t *")
                paramsWithJavadoc
                    .forEach {
                        printParam(it.name, it.documentation.let { doc -> if (doc == null) "" else processDocumentation(doc()) }, alignment, multilineAligment)
                    }
                if (returnsStructValue)
                    printParam(RESULT, processDocumentation(returnDoc), alignment, multilineAligment)
            }

            if (returnDoc.isNotEmpty() && !returnsStructValue) {
                if (isNotEmpty()) append("\n$t *\n$t * ")
                append("@return ")
                append(processDocumentation(returnDoc).cleanup("$t *         "))
            }

            if (see != null) {
                if (isNotEmpty()) append("\n$t *")
                see.forEach {
                    if (isNotEmpty()) append("\n$t * ")
                    append("@see ")
                    append(it)
                }
            }

            if (since.isNotEmpty()) {
                if (isNotEmpty()) append("\n$t *\n$t * ")
                append("@since ")
                append(since)
            }
        }
        .toString()
        .layoutJavadoc()
}

// Used for aligning parameter javadoc when it spans multiple lines.
private fun paramMultilineAligment(alignment: Int): String {
    val whitespace = " @param ".length + alignment + 1
    return StringBuilder("$t *".length + whitespace).apply {
        append("$t *")
        for (i in 0 until whitespace)
            append(' ')
    }.toString()
}

private fun StringBuilder.printParam(name: String, documentation: String, alignment: Int, multilineAligment: String) {
    if (isNotEmpty()) append("\n$t * ")
    append("@param $name")

    // Align
    for (i in 0..(alignment - name.length))
        append(' ')

    append(documentation.cleanup(multilineAligment))
}

enum class LinkMode {
    SINGLE {
        override fun print(multi: Boolean): String = if (multi) "One of:" else "Must be:"
    },
    SINGLE_CNT {
        override fun print(multi: Boolean): String = if (multi) "one of:" else "must be:"
    },
    BITFIELD {
        override fun print(multi: Boolean): String = "One or more of:"
    },
    BITFIELD_CNT {
        override fun print(multi: Boolean): String = "one or more of:"
    };

    companion object {
        private val WHITESPACE = "\\s+".toRegex()
    }

    protected abstract fun print(multi: Boolean): String

    internal fun appendLinks(documentation: String, links: String): String {
        val trimmed = documentation.trim()
        val builder = StringBuilder(trimmed.length + 16 + links.length) // Rough estimate to reduce mallocs. TODO: validate

        val effectiveLinkMode: LinkMode
        if (trimmed.isEmpty()) {
            effectiveLinkMode = when (this) {
                SINGLE   -> SINGLE_CNT
                BITFIELD -> BITFIELD_CNT
                else     -> this
            }
        } else {
            effectiveLinkMode = this
            builder.append(trimmed)
            if (this == SINGLE || this == BITFIELD) {
                if (!trimmed.endsWith('.'))
                    builder.append('.')
            }
            builder.append(' ')
        }

        builder.append(effectiveLinkMode.print(links.any { Character.isWhitespace(it) }))
        builder.append("<br><table><tr>")

        val theLinks = WHITESPACE.split(links.trim()).asSequence()
        val columns = max(1, 80 / theLinks.map { it.length - it.indexOf('#') - 1 }.average().roundToInt())

        theLinks.forEachIndexed { i, link ->
            if (i > 0 && i % columns == 0)
                builder.append("</tr><tr>")

            builder
                .append("<td>")
                .append(link)
                .append("</td>")
        }
        builder.append("</tr></table>")

        return builder.toString()
    }
}

// DSL extensions

infix fun String.mergeLargeLiteral(other: String): String = this.plus(other)

private val HTML_ESCAPE_PATTERN = """[<>]|&(?![A-Za-z0-9#]+;)""".toRegex()

private val String.htmlEscaped: String
    get() = this.replace(HTML_ESCAPE_PATTERN) {
        when (it.value) {
            "<"  -> "&lt;"
            ">"  -> "&gt;"
            "&"  -> "&amp;"
            else -> throw IllegalStateException()
        }
    }

/** Useful for simple expressions. HTML markup is allowed. */
fun code(code: String) = """<code>$code</code>"""

private val CODE_BLOCK_TRIM_PATTERN = """^\s*\n|\n\s*$""".toRegex() // first and/or last empty lines
private val CODE_BLOCK_ESCAPE_PATTERN = "^".toRegex(RegexOption.MULTILINE) // line starts
private val CODE_BLOCK_TAB_PATTERN = "\t".toRegex() // tabs

/** Useful for pre-formatted code blocks. HTML markup is not allowed and will be escaped. */
fun codeBlock(code: String) = """<pre><code>
${code
    .htmlEscaped
    .replace(CODE_BLOCK_TRIM_PATTERN, "") // ...trim
    .replace(CODE_BLOCK_ESCAPE_PATTERN, "\uFFFF") // ...escape
    .replace(CODE_BLOCK_TAB_PATTERN, "    ") // ...replace with 4 spaces for consistent formatting.
}</code></pre>"""

fun note(content: String) = "<div style=\"margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;\"><h5>Note</h5>\n$content</div>"

fun url(href: String, innerHTML: String = href) = """<a target="_blank" href="$href">$innerHTML</a>"""

fun table(vararg rows: String) = StringBuilder(512).run {
    append("<table class=striped>")
    for (row in rows) {
        append("\n$t")
        append(row)
    }
    append("\n$t</table>")

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
    if (1 < colspan)
        append(" colspan=$colspan")
    if (1 < rowspan)
        append(" rowspan=$rowspan")
    if (className != null)
        append(" class=\"$className\"")
    append(">")
    append(content.trim())
    append("</$tag>")

    toString()
}

private fun htmlList(tag: String, attributes: String, vararg items: String) = StringBuilder(512).run {
    append("<$tag")
    if (attributes.isNotEmpty())
        append(" $attributes")
    append(">")
    for (li in items) {
        append("\n$t<li>")
        append(li.trim())
        append("</li>")
    }
    append("\n$t</$tag>")

    toString()
}

fun ul(vararg items: String) = htmlList("ul", "", *items)
fun ol(vararg items: String, marker: Char = '1') = htmlList("ol", if (marker == '1') "" else "type=$marker", *items)