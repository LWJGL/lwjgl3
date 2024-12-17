/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

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

fun String.toJavaDoc(indentation: String = t) =
    this
        .cleanup("$indentation * ")
        .layoutJavadoc(indentation)

// DSL extensions

private val HTML_ESCAPE_PATTERN = """[<>]=?|&(?!#|(?:amp|hellip|ge|gt|le|lt);)""".toRegex()

private val String.htmlEscaped: String
    get() = this.replace(HTML_ESCAPE_PATTERN) {
        when (it.value) {
            "<"  -> "&lt;"
            "<=" -> "&le;"
            ">"  -> "&gt;"
            ">=" -> "&ge;"
            "&"  -> "&amp;"
            else -> throw IllegalStateException()
        }
    }

/** Useful for simple expressions. HTML markup is allowed. */
fun code(code: String) = """{@code $code}"""

private val CODE_BLOCK_TRIM_PATTERN = """^\s*\n|\n\s*$""".toRegex() // first and/or last empty lines
private val CODE_BLOCK_ESCAPE_PATTERN = "^".toRegex(RegexOption.MULTILINE) // line starts
private val CODE_BLOCK_TAB_PATTERN = "\t".toRegex() // tabs

/** Useful for pre-formatted code blocks. HTML markup is not allowed and will be escaped. */
fun codeBlock(code: String) = """<pre>{@code
${
    code
        .htmlEscaped
        .replace(CODE_BLOCK_TRIM_PATTERN, "") // ...trim
        .replace(CODE_BLOCK_ESCAPE_PATTERN, "\uFFFF") // ...escape
        .replace(CODE_BLOCK_TAB_PATTERN, "    ") // ...replace with 4 spaces for consistent formatting.
}}</pre>"""

fun url(href: String, innerHTML: String = href) = """<a href="$href">$innerHTML</a>"""

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