/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "clang-c/Documentation.h"

typedef CXComment (*clang_Cursor_getParsedCommentPROC) (CXCursor);
typedef jint (*clang_Comment_getKindPROC) (CXComment);
typedef jint (*clang_Comment_getNumChildrenPROC) (CXComment);
typedef CXComment (*clang_Comment_getChildPROC) (CXComment, jint);
typedef jint (*clang_Comment_isWhitespacePROC) (CXComment);
typedef jint (*clang_InlineContentComment_hasTrailingNewlinePROC) (CXComment);
typedef CXString (*clang_TextComment_getTextPROC) (CXComment);
typedef CXString (*clang_InlineCommandComment_getCommandNamePROC) (CXComment);
typedef jint (*clang_InlineCommandComment_getRenderKindPROC) (CXComment);
typedef jint (*clang_InlineCommandComment_getNumArgsPROC) (CXComment);
typedef CXString (*clang_InlineCommandComment_getArgTextPROC) (CXComment, jint);
typedef CXString (*clang_HTMLTagComment_getTagNamePROC) (CXComment);
typedef jint (*clang_HTMLStartTagComment_isSelfClosingPROC) (CXComment);
typedef jint (*clang_HTMLStartTag_getNumAttrsPROC) (CXComment);
typedef CXString (*clang_HTMLStartTag_getAttrNamePROC) (CXComment, jint);
typedef CXString (*clang_HTMLStartTag_getAttrValuePROC) (CXComment, jint);
typedef CXString (*clang_BlockCommandComment_getCommandNamePROC) (CXComment);
typedef jint (*clang_BlockCommandComment_getNumArgsPROC) (CXComment);
typedef CXString (*clang_BlockCommandComment_getArgTextPROC) (CXComment, jint);
typedef CXComment (*clang_BlockCommandComment_getParagraphPROC) (CXComment);
typedef CXString (*clang_ParamCommandComment_getParamNamePROC) (CXComment);
typedef jint (*clang_ParamCommandComment_isParamIndexValidPROC) (CXComment);
typedef jint (*clang_ParamCommandComment_getParamIndexPROC) (CXComment);
typedef jint (*clang_ParamCommandComment_isDirectionExplicitPROC) (CXComment);
typedef jint (*clang_ParamCommandComment_getDirectionPROC) (CXComment);
typedef CXString (*clang_TParamCommandComment_getParamNamePROC) (CXComment);
typedef jint (*clang_TParamCommandComment_isParamPositionValidPROC) (CXComment);
typedef jint (*clang_TParamCommandComment_getDepthPROC) (CXComment);
typedef jint (*clang_TParamCommandComment_getIndexPROC) (CXComment, jint);
typedef CXString (*clang_VerbatimBlockLineComment_getTextPROC) (CXComment);
typedef CXString (*clang_VerbatimLineComment_getTextPROC) (CXComment);
typedef CXString (*clang_HTMLTagComment_getAsStringPROC) (CXComment);
typedef CXString (*clang_FullComment_getAsHTMLPROC) (CXComment);
typedef CXString (*clang_FullComment_getAsXMLPROC) (CXComment);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1Cursor_1getParsedComment(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getParsedCommentPROC clang_Cursor_getParsedComment = (clang_Cursor_getParsedCommentPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXComment*)(intptr_t)__result) = clang_Cursor_getParsedComment(*C);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1Comment_1getKind(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_Comment_getKindPROC clang_Comment_getKind = (clang_Comment_getKindPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Comment_getKind(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1Comment_1getNumChildren(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_Comment_getNumChildrenPROC clang_Comment_getNumChildren = (clang_Comment_getNumChildrenPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Comment_getNumChildren(*Comment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1Comment_1getChild(JNIEnv *__env, jclass clazz, jlong CommentAddress, jint ChildIdx, jlong __functionAddress, jlong __result) {
    clang_Comment_getChildPROC clang_Comment_getChild = (clang_Comment_getChildPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXComment*)(intptr_t)__result) = clang_Comment_getChild(*Comment, ChildIdx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1Comment_1isWhitespace(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_Comment_isWhitespacePROC clang_Comment_isWhitespace = (clang_Comment_isWhitespacePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_Comment_isWhitespace(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1InlineContentComment_1hasTrailingNewline(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_InlineContentComment_hasTrailingNewlinePROC clang_InlineContentComment_hasTrailingNewline = (clang_InlineContentComment_hasTrailingNewlinePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_InlineContentComment_hasTrailingNewline(*Comment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1TextComment_1getText(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_TextComment_getTextPROC clang_TextComment_getText = (clang_TextComment_getTextPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_TextComment_getText(*Comment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1InlineCommandComment_1getCommandName(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_InlineCommandComment_getCommandNamePROC clang_InlineCommandComment_getCommandName = (clang_InlineCommandComment_getCommandNamePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_InlineCommandComment_getCommandName(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1InlineCommandComment_1getRenderKind(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_InlineCommandComment_getRenderKindPROC clang_InlineCommandComment_getRenderKind = (clang_InlineCommandComment_getRenderKindPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_InlineCommandComment_getRenderKind(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1InlineCommandComment_1getNumArgs(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_InlineCommandComment_getNumArgsPROC clang_InlineCommandComment_getNumArgs = (clang_InlineCommandComment_getNumArgsPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_InlineCommandComment_getNumArgs(*Comment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1InlineCommandComment_1getArgText(JNIEnv *__env, jclass clazz, jlong CommentAddress, jint ArgIdx, jlong __functionAddress, jlong __result) {
    clang_InlineCommandComment_getArgTextPROC clang_InlineCommandComment_getArgText = (clang_InlineCommandComment_getArgTextPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_InlineCommandComment_getArgText(*Comment, ArgIdx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLTagComment_1getTagName(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_HTMLTagComment_getTagNamePROC clang_HTMLTagComment_getTagName = (clang_HTMLTagComment_getTagNamePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_HTMLTagComment_getTagName(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLStartTagComment_1isSelfClosing(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_HTMLStartTagComment_isSelfClosingPROC clang_HTMLStartTagComment_isSelfClosing = (clang_HTMLStartTagComment_isSelfClosingPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_HTMLStartTagComment_isSelfClosing(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLStartTag_1getNumAttrs(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_HTMLStartTag_getNumAttrsPROC clang_HTMLStartTag_getNumAttrs = (clang_HTMLStartTag_getNumAttrsPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_HTMLStartTag_getNumAttrs(*Comment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLStartTag_1getAttrName(JNIEnv *__env, jclass clazz, jlong CommentAddress, jint AttrIdx, jlong __functionAddress, jlong __result) {
    clang_HTMLStartTag_getAttrNamePROC clang_HTMLStartTag_getAttrName = (clang_HTMLStartTag_getAttrNamePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_HTMLStartTag_getAttrName(*Comment, AttrIdx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLStartTag_1getAttrValue(JNIEnv *__env, jclass clazz, jlong CommentAddress, jint AttrIdx, jlong __functionAddress, jlong __result) {
    clang_HTMLStartTag_getAttrValuePROC clang_HTMLStartTag_getAttrValue = (clang_HTMLStartTag_getAttrValuePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_HTMLStartTag_getAttrValue(*Comment, AttrIdx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1BlockCommandComment_1getCommandName(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_BlockCommandComment_getCommandNamePROC clang_BlockCommandComment_getCommandName = (clang_BlockCommandComment_getCommandNamePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_BlockCommandComment_getCommandName(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1BlockCommandComment_1getNumArgs(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_BlockCommandComment_getNumArgsPROC clang_BlockCommandComment_getNumArgs = (clang_BlockCommandComment_getNumArgsPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_BlockCommandComment_getNumArgs(*Comment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1BlockCommandComment_1getArgText(JNIEnv *__env, jclass clazz, jlong CommentAddress, jint ArgIdx, jlong __functionAddress, jlong __result) {
    clang_BlockCommandComment_getArgTextPROC clang_BlockCommandComment_getArgText = (clang_BlockCommandComment_getArgTextPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_BlockCommandComment_getArgText(*Comment, ArgIdx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1BlockCommandComment_1getParagraph(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_BlockCommandComment_getParagraphPROC clang_BlockCommandComment_getParagraph = (clang_BlockCommandComment_getParagraphPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXComment*)(intptr_t)__result) = clang_BlockCommandComment_getParagraph(*Comment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1ParamCommandComment_1getParamName(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_ParamCommandComment_getParamNamePROC clang_ParamCommandComment_getParamName = (clang_ParamCommandComment_getParamNamePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_ParamCommandComment_getParamName(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1ParamCommandComment_1isParamIndexValid(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_ParamCommandComment_isParamIndexValidPROC clang_ParamCommandComment_isParamIndexValid = (clang_ParamCommandComment_isParamIndexValidPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_ParamCommandComment_isParamIndexValid(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1ParamCommandComment_1getParamIndex(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_ParamCommandComment_getParamIndexPROC clang_ParamCommandComment_getParamIndex = (clang_ParamCommandComment_getParamIndexPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_ParamCommandComment_getParamIndex(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1ParamCommandComment_1isDirectionExplicit(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_ParamCommandComment_isDirectionExplicitPROC clang_ParamCommandComment_isDirectionExplicit = (clang_ParamCommandComment_isDirectionExplicitPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_ParamCommandComment_isDirectionExplicit(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1ParamCommandComment_1getDirection(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_ParamCommandComment_getDirectionPROC clang_ParamCommandComment_getDirection = (clang_ParamCommandComment_getDirectionPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_ParamCommandComment_getDirection(*Comment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1TParamCommandComment_1getParamName(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_TParamCommandComment_getParamNamePROC clang_TParamCommandComment_getParamName = (clang_TParamCommandComment_getParamNamePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_TParamCommandComment_getParamName(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1TParamCommandComment_1isParamPositionValid(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_TParamCommandComment_isParamPositionValidPROC clang_TParamCommandComment_isParamPositionValid = (clang_TParamCommandComment_isParamPositionValidPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_TParamCommandComment_isParamPositionValid(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1TParamCommandComment_1getDepth(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress) {
    clang_TParamCommandComment_getDepthPROC clang_TParamCommandComment_getDepth = (clang_TParamCommandComment_getDepthPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_TParamCommandComment_getDepth(*Comment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1TParamCommandComment_1getIndex(JNIEnv *__env, jclass clazz, jlong CommentAddress, jint Depth, jlong __functionAddress) {
    clang_TParamCommandComment_getIndexPROC clang_TParamCommandComment_getIndex = (clang_TParamCommandComment_getIndexPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)clang_TParamCommandComment_getIndex(*Comment, Depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1VerbatimBlockLineComment_1getText(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_VerbatimBlockLineComment_getTextPROC clang_VerbatimBlockLineComment_getText = (clang_VerbatimBlockLineComment_getTextPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_VerbatimBlockLineComment_getText(*Comment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1VerbatimLineComment_1getText(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_VerbatimLineComment_getTextPROC clang_VerbatimLineComment_getText = (clang_VerbatimLineComment_getTextPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_VerbatimLineComment_getText(*Comment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLTagComment_1getAsString(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_HTMLTagComment_getAsStringPROC clang_HTMLTagComment_getAsString = (clang_HTMLTagComment_getAsStringPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_HTMLTagComment_getAsString(*Comment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1FullComment_1getAsHTML(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_FullComment_getAsHTMLPROC clang_FullComment_getAsHTML = (clang_FullComment_getAsHTMLPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_FullComment_getAsHTML(*Comment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1FullComment_1getAsXML(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_FullComment_getAsXMLPROC clang_FullComment_getAsXML = (clang_FullComment_getAsXMLPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CXString*)(intptr_t)__result) = clang_FullComment_getAsXML(*Comment);
}

EXTERN_C_EXIT
