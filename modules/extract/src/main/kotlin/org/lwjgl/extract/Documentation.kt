/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.extract

import org.lwjgl.llvm.*
import org.lwjgl.llvm.ClangDocumentation.*
import org.lwjgl.system.MemoryStack.*
import java.util.regex.*

internal class Documentation(
    val doc: StringBuilder = StringBuilder(),
    val params: HashMap<String, StringBuilder> = HashMap(),
    val paramList: ArrayList<StringBuilder?> = ArrayList(),
    val returnDoc: StringBuilder = StringBuilder(),
    val see: ArrayList<StringBuilder> = ArrayList()
) {
    fun format(linePrefix: String, blockIndent: String = linePrefix, blockPrefix: String = "") =
        doc.formatDocumentation(linePrefix, blockIndent, blockPrefix)

    fun formatReturnDoc() =
        if (returnDoc.isEmpty())
            ""
        else
            ",\n\n$t${t}returnDoc = ${formatParamDoc(returnDoc).formatDocumentation("$t${t}returnDoc = ", "$t$t", "\n$t$t")}"

    fun formatParamDoc(doc: StringBuilder): String {
        return doc.toString().trim()
            .let { if (it.startsWith("-")) it.substring(1).trim() else it }
            .let {
                if (it.isEmpty()) {
                    ""
                } else {
                    "${it[0].let { f ->
                        if (it.length < 2 || !it[1].isUpperCase())
                            f.lowercase()
                        else
                            f
                    }}${it.substring(1, if (it.endsWith('.') && it.indexOf('.') == it.lastIndex) it.lastIndex else it.length)}"
                }
            }
    }
}

internal fun CXComment.parse(doc: Documentation = Documentation(), builder: StringBuilder = doc.doc) =
    parse(doc, builder, DocContext())

private class DocContext {
    var skipNextWhitespace = false

    val firstStack = Array(16) { false }

    private var firstIndex = -1

    val first: Boolean get() = firstStack[firstIndex]

    fun pushFirst(i: Int) {
        firstStack[++firstIndex] = i == 0
    }

    fun popFirst() {
        firstIndex--
    }
}

private fun CXComment.parseChildren(doc: Documentation, builder: StringBuilder, context: DocContext) {
    for (i in 0 until clang_Comment_getNumChildren(this)) {
        stackPush().use { frame ->
            context.pushFirst(i)
            clang_Comment_getChild(this, i, CXComment.malloc(frame)).parse(doc, builder, context)
            context.popFirst()
        }
    }
}

private fun CXComment.parse(doc: Documentation, builder: StringBuilder, context: DocContext): Documentation {
    stackPush().use { stack ->
        when (val kind = clang_Comment_getKind(this)) {
            CXComment_Null                 -> {
                if (clang_Comment_getNumChildren(this) != 0) {
                    TODO()
                }
            }
            CXComment_Text                 -> {
                if (clang_Comment_isWhitespace(this)) {
                    //builder.append(" ")
                } else {
                    when (val text = clang_TextComment_getText(this, stack.str).str.trim()) {
                        "\\" -> {
                            if (builder.isNotEmpty() && builder.last().let { it.isLetter() || it == ':' }) {
                                builder.append(" ")
                            }
                            builder.append("\\\\")
                            context.skipNextWhitespace = true
                        }
                        "#"  -> {
                            if (builder.isNotEmpty() && builder.last().isLetter()) {
                                builder.append(" ")
                            }
                            builder.append("\\#")
                            context.skipNextWhitespace = true
                        }
                        "<"  -> {
                            builder.append(" &lt;")
                            context.skipNextWhitespace = true
                        }
                        ">"  -> {
                            builder.append("&gt;")
                        }
                        else -> {
                            if (!context.first && builder.isNotEmpty() && text.isNotEmpty()) {
                                if (text[0].let { it == '-' || it == '*' }) {
                                    if (builder.last() == ':') {
                                        builder.append("\n")
                                    }
                                    builder.append("\n$t$t")
                                } else if (!context.skipNextWhitespace) {
                                    builder.append(" ")
                                }
                            }
                            builder.append(text.replace("\"", "\\\""))
                            context.skipNextWhitespace = false
                        }
                    }
                }
            }
            CXComment_InlineCommand        -> {
                when (clang_InlineCommandComment_getRenderKind(this)) {
                    CXCommentInlineCommandRenderKind_Normal     -> {
                        builder.append(" \\")
                        builder.append(clang_InlineCommandComment_getCommandName(this, stack.str).str)
                        /*for (i in 0 until clang_InlineCommandComment_getNumArgs(this)) {
                            builder.append(clang_InlineCommandComment_getArgText(this, i, stack.str).str)
                        }*/
                    }
                    CXCommentInlineCommandRenderKind_Bold       -> {
                        val index = builder.length
                        builder.append(" <b>")
                        closeInlineCommand(builder, index, "</b>")
                    }
                    CXCommentInlineCommandRenderKind_Monospaced -> {
                        if (clang_InlineCommandComment_getCommandName(this, stack.str).str.let { it != "c" && it != "p" }) {
                            println(clang_InlineCommandComment_getCommandName(this, stack.str).str)
                            TODO()
                        }
                        val index = builder.length
                        if (builder.isNotEmpty() && builder.last() != '(') {
                            builder.append(' ')
                        }
                        builder.append("{@code ")
                        closeInlineCommand(builder, index, "}")
                        if (builder.indexOf(" {@code NULL}", index) != -1) {
                            builder.replace(index, index + " {@code NULL}".length, " #NULL")
                        }
                    }
                    CXCommentInlineCommandRenderKind_Emphasized -> {
                        when (val cmd = clang_InlineCommandComment_getCommandName(this, stack.str).str) {
                            "a"  -> {
                                builder.append(" #")
                                for (i in 0 until clang_InlineCommandComment_getNumArgs(this)) {
                                    builder.append(clang_InlineCommandComment_getArgText(this, i, stack.str).str)
                                }
                            }
                            "e"  -> {
                                val index = builder.length
                                builder.append(" <em>")
                                closeInlineCommand(builder, index, "</em>")
                            }
                            else -> {
                                System.err.println("Unsupported CXCommentInlineCommandRenderKind_Emphasized command: $cmd")
                                TODO()
                            }
                        }
                    }
                    else                                        -> {
                        println("\trenderKind = " + clang_InlineCommandComment_getRenderKind(this))
                        println("\t" + clang_InlineCommandComment_getCommandName(this, stack.str).str)
                        var i = 0
                        val len = clang_InlineCommandComment_getNumArgs(this)
                        while (i < len) {
                            println("\t" + clang_InlineCommandComment_getArgText(this, i, stack.str).str)
                            i++
                        }
                        TODO()
                    }
                }
            }
            CXComment_HTMLStartTag         -> {
                // TODO:
                builder.append(clang_HTMLTagComment_getAsString(this, stack.str).str)
            }
            CXComment_HTMLEndTag           -> {
                // TODO:
                builder.append(clang_HTMLTagComment_getAsString(this, stack.str).str)
            }
            CXComment_Paragraph            -> {
                if (!clang_Comment_isWhitespace(this)) {
                    if (!context.first) {
                        builder.append("\n\n$t$t")
                    }
                    parseChildren(doc, builder, context)
                }
            }
            CXComment_BlockCommand         -> {
                when (clang_BlockCommandComment_getCommandName(this, stack.str).str) {
                    "brief"      -> {
                        parseChildren(doc, builder, context)
                    }
                    "deprecated" -> {
                        builder.append("Deprecated: ")
                        parseChildren(doc, builder, context)
                    }
                    "li"         -> {
                        if (!builder.endsWith("\n")) {
                            builder.append("\n\n")
                        }
                        builder.append("- ")
                        parseChildren(doc, builder, context)
                        builder.append("\n")
                    }
                    "note"       -> {
                        builder.append("\n\n$t$t\${note(\"\"\"")
                        parseChildren(doc, builder, context)
                        builder.append("\"\"\")}")
                    }
                    "par"        -> {
                        builder.append("<h3>")
                        parseChildren(doc, builder, context)
                        builder.append("</h3>")
                    }
                    "pre" -> {
                        builder.append("Precondition: ")
                        parseChildren(doc, builder, context)
                    }
                    "return",
                    "returns",
                    "result"     -> {
                        parseChildren(doc, doc.returnDoc, context)
                    }
                    "retval" -> {
                        doc.returnDoc.append(" {@code ")
                        parseChildren(doc, doc.returnDoc, context)
                        doc.returnDoc.append("}")
                    }
                    "sa"         -> {
                        for (i in 0 until clang_Comment_getNumChildren(this)) {
                            stack.push().use { frame ->
                                val saBuilder = StringBuilder()
                                doc.see.add(saBuilder)
                                context.pushFirst(i)
                                clang_Comment_getChild(this, i, CXComment.malloc(frame)).parse(doc, saBuilder, context)
                                context.popFirst()
                            }
                        }
                    }
                    "see",
                    "since"      -> {
                        // TODO: ignored for now
                    }
                    "todo"       -> {
                        builder.append("TODO: ")
                        parseChildren(doc, builder, context)
                    }
                    "warning" -> {
                        builder.append("Warning: ")
                        parseChildren(doc, builder, context)
                    }
                    else         -> {
                        println(clang_BlockCommandComment_getCommandName(this, stack.str).str)
                        TODO()
                    }
                }
            }
            CXComment_ParamCommand         -> {
                val paramBuilder = StringBuilder()
                if (clang_ParamCommandComment_isParamIndexValid(this)) {
                    doc.params[clang_ParamCommandComment_getParamName(this, stack.str).str] = paramBuilder
                    doc.paramList.add(null)
                } else {
                    doc.paramList.add(paramBuilder)
                }
                parseChildren(doc, paramBuilder, context)
            }
            CXComment_VerbatimBlockCommand -> {
                when (clang_BlockCommandComment_getCommandName(this, stack.str).str) {
                    "code",
                    "verbatim" -> {
                        builder.append("\n\n$t$t\${codeBlock(\"\"\"\n")
                        parseChildren(doc, builder, context)
                        builder.append("\"\"\")}")
                    }
                    else       -> {
                        builder.append("\n\n$t$t")
                        parseChildren(doc, builder, context)
                    }
                }

            }
            CXComment_VerbatimBlockLine    -> {
                if (!context.first) {
                    builder.append("\n")
                }
                val line = clang_VerbatimBlockLineComment_getText(this, stack.str).str
                if (!line.contains('\n')) { // sigh... libclang bug?
                    builder.append(line)
                }
            }
            CXComment_VerbatimLine         -> {
                builder.append(clang_VerbatimLineComment_getText(this, stack.str).str)
            }
            CXComment_FullComment          -> {
                parseChildren(doc, builder, context)
            }
            else                           -> {
                println("kind = $kind")
                TODO()
            }
        }
        Unit
    }
    return doc
}

private fun CXComment.closeInlineCommand(builder: StringBuilder, index: Int, text: String) {
    val stack = stackGet()
    for (i in 0 until clang_InlineCommandComment_getNumArgs(this)) {
        stack.push().use { frame ->
            builder.append(clang_InlineCommandComment_getArgText(this, i, frame.str).str)
        }
    }
    if (builder.subSequence(index, builder.length)
            .let {
                it.count { c -> c == '(' } < it.count { c -> c == ')' }
            }
    ) {
        builder.insert(builder.lastIndexOf(')'), text)
    } else {
        when (builder.last()) {
            '.',
            ','  -> builder.insert(builder.lastIndex, text)
            else -> builder.append(text)
        }
    }
}

internal fun CharSequence.formatDocumentation(linePrefix: String, blockIndent: String = linePrefix, blockPrefix: String = ""): String {
    if (this.indexOf('\n') == -1) {
        if (linePrefix.length + this.length + 2 < 160) {
            return "\"$this\""
        }
        if (blockPrefix.isNotEmpty() && blockPrefix.length - (blockPrefix.lastIndexOf('\n') + 1) + this.length + 2 < 160) {
            return "$blockPrefix\"$this\""
        }
    }
    return "$blockPrefix\"\"\"\n${formatDocumentation(this, blockIndent)}\n$blockIndent\"\"\""
}

private val PARAGRAPH = Pattern.compile("\\n(\\s*\\n)+\\s*")
private val WHITESPACE = Pattern.compile("\\s+|$")

private fun formatDocumentation(input: CharSequence, indent: String): String {
    val doc = input.trim()
    val builder = StringBuilder(doc.length)

    val paragraphMatcher = PARAGRAPH.matcher(doc)
    var lastParagraphMatch = 0
    while (paragraphMatcher.find()) {
        lastParagraphMatch = formatParagraph(doc, indent, lastParagraphMatch, paragraphMatcher, builder)
    }
    if (lastParagraphMatch < doc.length) {
        formatParagraph(doc, indent, lastParagraphMatch, paragraphMatcher, builder)
    }

    return builder.toString()
}

private fun formatParagraph(
    input: CharSequence,
    indent: String,
    lastParagraphMatch: Int,
    matcher: Matcher,
    builder: StringBuilder
): Int {
    if (builder.isNotEmpty()) {
        builder.append("\n\n")
    }

    val paragraph = input.substring(lastParagraphMatch, if (matcher.hitEnd()) input.length else matcher.start())
    if (paragraph.startsWith("\${codeBlock(\"\"\"")) {
        if (!matcher.hitEnd()) {
            var lastMatch = lastParagraphMatch
            while (matcher.start() - lastMatch < 5 || input.substring(matcher.start() - 5, matcher.start()) != "\"\"\")}") {
                lastMatch = matcher.end()
                if (!matcher.find()) {
                    break
                }
            }
        }
        builder
            .append(indent)
            .append(input, lastParagraphMatch, if (matcher.hitEnd()) input.length else matcher.start())
    } else if (paragraph.startsWith("<table")) {
        if (!matcher.hitEnd()) {
            var lastMatch = lastParagraphMatch
            while (matcher.start() - lastMatch < 8 || input.substring(matcher.start() - 8, matcher.start()) != "</table>") {
                lastMatch = matcher.end()
                if (!matcher.find()) {
                    break
                }
            }
        }
        builder
            .append(indent)
            .append(input, lastParagraphMatch, if (matcher.hitEnd()) input.length else matcher.start())
    } else if (paragraph[0].let { it == '-' || it == '*' }) {
        builder
            .append(indent)
            .append("\${ul(")

        val c = paragraph[0]
        """(?<=^|\n)\s*[$c]\s*(.+?)(?=\n\s*[$c]|$)"""
            .toRegex(RegexOption.DOT_MATCHES_ALL)
            .findAll(paragraph)
            .forEach {
                val comma = if (it.range.last < paragraph.lastIndex) "," else ""
                builder.append("\n$indent$t${it.groupValues[1].formatDocumentation("$indent$t$comma", "$indent$t")}$comma")
            }

        builder.append("\n$indent)}")
    } else {
        wordWrapParagraph(
            paragraph
                .replace("""\\([^\\#])""".toRegex(), "$1")
                .replace("\\\\", "\\"),
            indent,
            builder
        )
    }
    return if (matcher.hitEnd()) input.length else matcher.end()
}

private fun wordWrapParagraph(paragraph: String, indent: String, builder: StringBuilder) {
    val matcher = WHITESPACE.matcher(paragraph)

    var lineLen = indent.length
    var lastMatch = 0
    while (matcher.find()) {
        val wordLen = matcher.start() - lastMatch

        if (160 < lineLen + wordLen + 1) {
            builder.append("\n")
            lineLen = indent.length
        }

        builder.append(if (lineLen == indent.length) indent else " ")
        builder.append(paragraph, lastMatch, matcher.start())

        lineLen += wordLen + 1
        lastMatch = matcher.end()
    }
}