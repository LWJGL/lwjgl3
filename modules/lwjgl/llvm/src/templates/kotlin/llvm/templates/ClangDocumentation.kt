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
        "Comment_Null".enum("0"),
        "Comment_Text".enum,
        "Comment_InlineCommand".enum,
        "Comment_HTMLStartTag".enum,
        "Comment_HTMLEndTag".enum,
        "Comment_Paragraph".enum,
        "Comment_BlockCommand".enum,
        "Comment_ParamCommand".enum,
        "Comment_TParamCommand".enum,
        "Comment_VerbatimBlockCommand".enum,
        "Comment_VerbatimBlockLine".enum,
        "Comment_VerbatimLine".enum,
        "Comment_FullComment".enum
    )

    EnumConstant(
        "CommentInlineCommandRenderKind_Normal".enum("0"),
        "CommentInlineCommandRenderKind_Bold".enum,
        "CommentInlineCommandRenderKind_Monospaced".enum,
        "CommentInlineCommandRenderKind_Emphasized".enum,
        "CommentInlineCommandRenderKind_Anchor".enum
    )

    EnumConstant(
        "CommentParamPassDirection_In".enum("0"),
        "CommentParamPassDirection_Out".enum,
        "CommentParamPassDirection_InOut".enum
    )

    CXComment(
        "Cursor_getParsedComment",

        CXCursor("C")
    )

    CXCommentKind(
        "Comment_getKind",

        CXComment("Comment")
    )

    unsigned(
        "Comment_getNumChildren",

        CXComment("Comment")
    )

    CXComment(
        "Comment_getChild",

        CXComment("Comment"),
        unsigned("ChildIdx")
    )

    unsignedb(
        "Comment_isWhitespace",

        CXComment("Comment")
    )

    unsignedb(
        "InlineContentComment_hasTrailingNewline",

        CXComment("Comment")
    )

    CXString(
        "TextComment_getText",

        CXComment("Comment")
    )

    CXString(
        "InlineCommandComment_getCommandName",

        CXComment("Comment")
    )

    CXCommentInlineCommandRenderKind(
        "InlineCommandComment_getRenderKind",

        CXComment("Comment")
    )

    unsigned(
        "InlineCommandComment_getNumArgs",

        CXComment("Comment")
    )

    CXString(
        "InlineCommandComment_getArgText",

        CXComment("Comment"),
        unsigned("ArgIdx")
    )

    CXString(
        "HTMLTagComment_getTagName",

        CXComment("Comment")
    )

    unsignedb(
        "HTMLStartTagComment_isSelfClosing",

        CXComment("Comment")
    )

    unsigned(
        "HTMLStartTag_getNumAttrs",

        CXComment("Comment")
    )

    CXString(
        "HTMLStartTag_getAttrName",

        CXComment("Comment"),
        unsigned("AttrIdx")
    )

    CXString(
        "HTMLStartTag_getAttrValue",

        CXComment("Comment"),
        unsigned("AttrIdx")
    )

    CXString(
        "BlockCommandComment_getCommandName",

        CXComment("Comment")
    )

    unsigned(
        "BlockCommandComment_getNumArgs",

        CXComment("Comment")
    )

    CXString(
        "BlockCommandComment_getArgText",

        CXComment("Comment"),
        unsigned("ArgIdx")
    )

    CXComment(
        "BlockCommandComment_getParagraph",

        CXComment("Comment")
    )

    CXString(
        "ParamCommandComment_getParamName",

        CXComment("Comment")
    )

    unsignedb(
        "ParamCommandComment_isParamIndexValid",

        CXComment("Comment")
    )

    unsigned(
        "ParamCommandComment_getParamIndex",

        CXComment("Comment")
    )

    unsignedb(
        "ParamCommandComment_isDirectionExplicit",

        CXComment("Comment")
    )

    CXCommentParamPassDirection(
        "ParamCommandComment_getDirection",

        CXComment("Comment")
    )

    CXString(
        "TParamCommandComment_getParamName",

        CXComment("Comment")
    )

    unsignedb(
        "TParamCommandComment_isParamPositionValid",

        CXComment("Comment")
    )

    unsigned(
        "TParamCommandComment_getDepth",

        CXComment("Comment")
    )

    unsigned(
        "TParamCommandComment_getIndex",

        CXComment("Comment"),
        unsigned("Depth")
    )

    CXString(
        "VerbatimBlockLineComment_getText",

        CXComment("Comment")
    )

    CXString(
        "VerbatimLineComment_getText",

        CXComment("Comment")
    )

    CXString(
        "HTMLTagComment_getAsString",

        CXComment("Comment")
    )

    CXString(
        "FullComment_getAsHTML",

        CXComment("Comment")
    )

    CXString(
        "FullComment_getAsXML",

        CXComment("Comment")
    )

    IgnoreMissing..CXErrorCode(
        "createAPISet",

        CXTranslationUnit("tu"),
        Check(1)..CXAPISet.p("out_api")
    )

    IgnoreMissing..void(
        "disposeAPISet",

        CXAPISet("api")
    )

    IgnoreMissing..CXString(
        "getSymbolGraphForUSR",

        charUTF8.const.p("usr"),
        CXAPISet("api")
    )

    IgnoreMissing..CXString(
        "getSymbolGraphForCursor",

        CXCursor("cursor")
    )
}