/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val ClangDocumentation = "ClangDocumentation".nativeClass(
    Module.LLVM,
    prefixConstant = "CX",
    prefixMethod = "clang_",
    binding = CLANG_BINDING_DELEGATE
) {
    nativeImport("clang-c/Documentation.h")

    EnumConstant(
        """
        Describes the type of the comment AST node ( {@code CXComment}). A comment node can be considered block content (e. g., paragraph), inline content
        (plain text) or neither (the root AST node).

        ({@code enum CXCommentKind})
        """,

        "Comment_Null".enum("Null comment.  No AST node is constructed at the requested location because there is no text or a syntax error.", "0"),
        "Comment_Text".enum("Plain text.  Inline content."),
        "Comment_InlineCommand".enum(
            """
            A command with word-like arguments that is considered inline content.

            For example: \c command.
            """
        ),
        "Comment_HTMLStartTag".enum(
            """
            HTML start tag with attributes (name-value pairs). Considered inline content.

            For example:

            ${codeBlock("""
 <br> <br /> <a href="http://example.org/">""")}
            """
        ),
        "Comment_HTMLEndTag".enum(
            """
            HTML end tag. Considered inline content.

            For example:

            ${codeBlock("""
 </a>""")}
            """
        ),
        "Comment_Paragraph".enum("A paragraph, contains inline comment.  The paragraph itself is block content."),
        "Comment_BlockCommand".enum(
            """
            A command that has zero or more word-like arguments (number of word-like arguments depends on command name) and a paragraph as an argument. Block
            command is block content.

            Paragraph argument is also a child of the block command.

            For example: has 0 word-like arguments and a paragraph argument.

            AST nodes of special kinds that parser knows about (e. g.,\param command) have their own node kinds.
            """
        ),
        "Comment_ParamCommand".enum(
            """
            A \param or \arg command that describes the function parameter (name, passing direction, description).

            For example: \param [in] ParamName description.
            """
        ),
        "Comment_TParamCommand".enum(
            """
            A \tparam command that describes a template parameter (name and description).

            For example: \tparam T description.
            """
        ),
        "Comment_VerbatimBlockCommand".enum(
            """
            A verbatim block command (e. g., preformatted code). Verbatim block has an opening and a closing command and contains multiple lines of text (
            #Comment_VerbatimBlockLine child nodes).

            For example: \verbatim aaa \endverbatim
            """
        ),
        "Comment_VerbatimBlockLine".enum("A line of text that is contained within a CXComment_VerbatimBlockCommand node."),
        "Comment_VerbatimLine".enum(
            """
            A verbatim line command. Verbatim line has an opening command, a single line of text (up to the newline after the opening command) and has no
            closing command.
            """
        ),
        "Comment_FullComment".enum("A full comment attached to a declaration, contains block content.")
    )

    EnumConstant(
        """
        The most appropriate rendering mode for an inline command, chosen on command semantics in Doxygen.

        ({@code enum CXCommentInlineCommandRenderKind})
        """,

        "CommentInlineCommandRenderKind_Normal".enum("Command argument should be rendered in a normal font.", "0"),
        "CommentInlineCommandRenderKind_Bold".enum("Command argument should be rendered in a bold font."),
        "CommentInlineCommandRenderKind_Monospaced".enum("Command argument should be rendered in a monospaced font."),
        "CommentInlineCommandRenderKind_Emphasized".enum("Command argument should be rendered emphasized (typically italic font)."),
        "CommentInlineCommandRenderKind_Anchor".enum("Command argument should not be rendered (since it only defines an anchor).")
    )

    EnumConstant(
        """
        Describes parameter passing direction for \param or \arg command.

        ({@code enum CXCommentParamPassDirection})
        """,

        "CommentParamPassDirection_In".enum("The parameter is an input parameter.", "0"),
        "CommentParamPassDirection_Out".enum("The parameter is an output parameter."),
        "CommentParamPassDirection_InOut".enum("The parameter is an input and output parameter.")
    )

    CXComment(
        "Cursor_getParsedComment",
        "Given a cursor that represents a documentable entity (e.g., declaration), return the associated parsed comment as a #Comment_FullComment AST node.",

        CXCursor("C", "")
    )

    CXCommentKind(
        "Comment_getKind",
        "",

        CXComment("Comment", "AST node of any kind"),

        returnDoc = "the type of the AST node"
    )

    unsigned(
        "Comment_getNumChildren",
        "",

        CXComment("Comment", "AST node of any kind"),

        returnDoc = "number of children of the AST node"
    )

    CXComment(
        "Comment_getChild",
        "",

        CXComment("Comment", "AST node of any kind"),
        unsigned("ChildIdx", "child index (zero-based)"),

        returnDoc = "the specified child of the AST node"
    )

    unsignedb(
        "Comment_isWhitespace",
        """
        A #Comment_Paragraph node is considered whitespace if it contains only #Comment_Text nodes that are empty or whitespace.

        Other AST nodes (except {@code CXComment_Paragraph} and {@code CXComment_Text}) are never considered whitespace.
        """,

        CXComment("Comment", ""),

        returnDoc = "non-zero if {@code Comment} is whitespace"
    )

    unsignedb(
        "InlineContentComment_hasTrailingNewline",
        "",

        CXComment("Comment", ""),

        returnDoc =
        """
        non-zero if {@code Comment} is inline content and has a newline immediately following it in the comment text. Newlines between paragraphs do not count.
        """
    )

    CXString(
        "TextComment_getText",
        "",

        CXComment("Comment", "a #Comment_Text AST node"),

        returnDoc = "text contained in the AST node"
    )

    CXString(
        "InlineCommandComment_getCommandName",
        "",

        CXComment("Comment", "a #Comment_InlineCommand AST node"),

        returnDoc = "name of the inline command"
    )

    CXCommentInlineCommandRenderKind(
        "InlineCommandComment_getRenderKind",
        "",

        CXComment("Comment", "a #Comment_InlineCommand AST node"),

        returnDoc = "the most appropriate rendering mode, chosen on command semantics in Doxygen"
    )

    unsigned(
        "InlineCommandComment_getNumArgs",
        "",

        CXComment("Comment", "a #Comment_InlineCommand AST node"),

        returnDoc = "number of command arguments"
    )

    CXString(
        "InlineCommandComment_getArgText",
        "",

        CXComment("Comment", "a #Comment_InlineCommand AST node"),
        unsigned("ArgIdx", "argument index (zero-based)"),

        returnDoc = "text of the specified argument"
    )

    CXString(
        "HTMLTagComment_getTagName",
        "",

        CXComment("Comment", "a #Comment_HTMLStartTag or #Comment_HTMLEndTag AST node"),

        returnDoc = "HTML tag name"
    )

    unsignedb(
        "HTMLStartTagComment_isSelfClosing",
        "",

        CXComment("Comment", "a #Comment_HTMLStartTag AST node"),

        returnDoc = "non-zero if tag is self-closing (for example, &lt;br /&gt; )"
    )

    unsigned(
        "HTMLStartTag_getNumAttrs",
        "",

        CXComment("Comment", "a #Comment_HTMLStartTag AST node"),

        returnDoc = "number of attributes (name-value pairs) attached to the start tag"
    )

    CXString(
        "HTMLStartTag_getAttrName",
        "",

        CXComment("Comment", "a #Comment_HTMLStartTag AST node"),
        unsigned("AttrIdx", "attribute index (zero-based)"),

        returnDoc = "name of the specified attribute"
    )

    CXString(
        "HTMLStartTag_getAttrValue",
        "",

        CXComment("Comment", "a #Comment_HTMLStartTag AST node"),
        unsigned("AttrIdx", "attribute index (zero-based)"),

        returnDoc = "value of the specified attribute"
    )

    CXString(
        "BlockCommandComment_getCommandName",
        "",

        CXComment("Comment", "a #Comment_BlockCommand AST node"),

        returnDoc = "name of the block command"
    )

    unsigned(
        "BlockCommandComment_getNumArgs",
        "",

        CXComment("Comment", "a #Comment_BlockCommand AST node"),

        returnDoc = "number of word-like arguments"
    )

    CXString(
        "BlockCommandComment_getArgText",
        "",

        CXComment("Comment", "a #Comment_BlockCommand AST node"),
        unsigned("ArgIdx", "argument index (zero-based)"),

        returnDoc = "text of the specified word-like argument"
    )

    CXComment(
        "BlockCommandComment_getParagraph",
        "",

        CXComment("Comment", "a #Comment_BlockCommand or #Comment_VerbatimBlockCommand AST node"),

        returnDoc = "paragraph argument of the block command"
    )

    CXString(
        "ParamCommandComment_getParamName",
        "",

        CXComment("Comment", "a #Comment_ParamCommand AST node"),

        returnDoc = "parameter name"
    )

    unsignedb(
        "ParamCommandComment_isParamIndexValid",
        "",

        CXComment("Comment", "a #Comment_ParamCommand AST node"),

        returnDoc =
        """
        non-zero if the parameter that this AST node represents was found in the function prototype and #ParamCommandComment_getParamIndex() function will
        return a meaningful value
        """
    )

    unsigned(
        "ParamCommandComment_getParamIndex",
        "",

        CXComment("Comment", "a #Comment_ParamCommand AST node"),

        returnDoc = "zero-based parameter index in function prototype"
    )

    unsignedb(
        "ParamCommandComment_isDirectionExplicit",
        "",

        CXComment("Comment", "a #Comment_ParamCommand AST node"),

        returnDoc = "non-zero if parameter passing direction was specified explicitly in the comment"
    )

    CXCommentParamPassDirection(
        "ParamCommandComment_getDirection",
        "",

        CXComment("Comment", "a #Comment_ParamCommand AST node"),

        returnDoc = "parameter passing direction"
    )

    CXString(
        "TParamCommandComment_getParamName",
        "",

        CXComment("Comment", "a #Comment_TParamCommand AST node"),

        returnDoc = "template parameter name"
    )

    unsignedb(
        "TParamCommandComment_isParamPositionValid",
        "",

        CXComment("Comment", "a #Comment_TParamCommand AST node"),

        returnDoc =
        """
        non-zero if the parameter that this AST node represents was found in the template parameter list and #TParamCommandComment_getDepth() and
        #TParamCommandComment_getIndex() functions will return a meaningful value
        """
    )

    unsigned(
        "TParamCommandComment_getDepth",
        """
        For example,

        ${codeBlock("""
     template<typename C, template<typename T> class TT>
     void test(TT<int> aaa);""")}

        for C and TT nesting depth is 0, for T nesting depth is 1.
        """,

        CXComment("Comment", "a #Comment_TParamCommand AST node"),

        returnDoc = "zero-based nesting depth of this parameter in the template parameter list"
    )

    unsigned(
        "TParamCommandComment_getIndex",
        """
        For example,

        ${codeBlock("""
     template<typename C, template<typename T> class TT>
     void test(TT<int> aaa);""")}

        for C and TT nesting depth is 0, so we can ask for index at depth 0: at depth 0 C's index is 0, TT's index is 1.

        For T nesting depth is 1, so we can ask for index at depth 0 and 1: at depth 0 T's index is 1 (same as TT's), at depth 1 T's index is 0.
        """,

        CXComment("Comment", "a #Comment_TParamCommand AST node"),
        unsigned("Depth", ""),

        returnDoc = "zero-based parameter index in the template parameter list at a given nesting depth"
    )

    CXString(
        "VerbatimBlockLineComment_getText",
        "",

        CXComment("Comment", "a #Comment_VerbatimBlockLine AST node"),

        returnDoc = "text contained in the AST node"
    )

    CXString(
        "VerbatimLineComment_getText",
        "",

        CXComment("Comment", "a #Comment_VerbatimLine AST node"),

        returnDoc = "text contained in the AST node"
    )

    CXString(
        "HTMLTagComment_getAsString",
        "Convert an HTML tag AST node to string.",

        CXComment("Comment", "a #Comment_HTMLStartTag or #Comment_HTMLEndTag AST node"),

        returnDoc = "string containing an HTML tag"
    )

    CXString(
        "FullComment_getAsHTML",
        """
        Convert a given full parsed comment to an HTML fragment.

        Specific details of HTML layout are subject to change. Don't try to parse this HTML back into an AST, use other APIs instead.

        Currently the following CSS classes are used:

        ${ul(
            "\"para-brief\" for \\paragraph and equivalent commands;",
            "\"para-returns\" for \\returns paragraph and equivalent commands;",
            "\"word-returns\" for the \"Returns\" word in \\returns paragraph."
        )}

        Function argument documentation is rendered as a &lt;dl&gt; list with arguments sorted in function prototype order. CSS classes used:

        ${ul(
            "\"param-name-index-NUMBER\" for parameter name ( &lt;dt&gt; );",
            "\"param-descr-index-NUMBER\" for parameter description ( &lt;dd&gt; );",
            "\"param-name-index-invalid\" and \"param-descr-index-invalid\" are used if parameter index is invalid."
        )}

        Template parameter documentation is rendered as a &lt;dl&gt; list with parameters sorted in template parameter list order. CSS classes used:

        ${ul(
            "\"tparam-name-index-NUMBER\" for parameter name ( &lt;dt&gt; );",
            "\"tparam-descr-index-NUMBER\" for parameter description ( &lt;dd&gt; );",
            "\"tparam-name-index-other\" and \"tparam-descr-index-other\" are used for names inside template template parameters;",
            "\"tparam-name-index-invalid\" and \"tparam-descr-index-invalid\" are used if parameter position is invalid."
        )}
        """,

        CXComment("Comment", "a #Comment_FullComment AST node"),

        returnDoc = "string containing an HTML fragment"
    )

    CXString(
        "FullComment_getAsXML",
        """
        Convert a given full parsed comment to an XML document.

        A Relax NG schema for the XML can be found in comment-xml-schema.rng file inside clang source tree.
        """,

        CXComment("Comment", "a #Comment_FullComment AST node"),

        returnDoc = "string containing an XML document"
    )
}