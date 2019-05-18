/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "clang-c/Documentation.h"

typedef CXComment (*clang_Cursor_getParsedCommentPROC) (CXCursor);
typedef CXComment (*clang_Comment_getChildPROC) (CXComment, jint);
typedef CXString (*clang_TextComment_getTextPROC) (CXComment);
typedef CXString (*clang_InlineCommandComment_getCommandNamePROC) (CXComment);
typedef CXString (*clang_InlineCommandComment_getArgTextPROC) (CXComment, jint);
typedef CXString (*clang_HTMLTagComment_getTagNamePROC) (CXComment);
typedef CXString (*clang_HTMLStartTag_getAttrNamePROC) (CXComment, jint);
typedef CXString (*clang_HTMLStartTag_getAttrValuePROC) (CXComment, jint);
typedef CXString (*clang_BlockCommandComment_getCommandNamePROC) (CXComment);
typedef CXString (*clang_BlockCommandComment_getArgTextPROC) (CXComment, jint);
typedef CXComment (*clang_BlockCommandComment_getParagraphPROC) (CXComment);
typedef CXString (*clang_ParamCommandComment_getParamNamePROC) (CXComment);
typedef CXString (*clang_TParamCommandComment_getParamNamePROC) (CXComment);
typedef CXString (*clang_VerbatimBlockLineComment_getTextPROC) (CXComment);
typedef CXString (*clang_VerbatimLineComment_getTextPROC) (CXComment);
typedef CXString (*clang_HTMLTagComment_getAsStringPROC) (CXComment);
typedef CXString (*clang_FullComment_getAsHTMLPROC) (CXComment);
typedef CXString (*clang_FullComment_getAsXMLPROC) (CXComment);

EXTERN_C_ENTER

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1Cursor_1getParsedComment(jlong CAddress, jlong __functionAddress, jlong __result) {
    clang_Cursor_getParsedCommentPROC clang_Cursor_getParsedComment = (clang_Cursor_getParsedCommentPROC)(intptr_t)__functionAddress;
    CXCursor *C = (CXCursor *)(intptr_t)CAddress;
    *((CXComment*)(intptr_t)__result) = clang_Cursor_getParsedComment(*C);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1Cursor_1getParsedComment(JNIEnv *__env, jclass clazz, jlong CAddress, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1Cursor_1getParsedComment(CAddress, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1Comment_1getChild(jlong CommentAddress, jint ChildIdx, jlong __functionAddress, jlong __result) {
    clang_Comment_getChildPROC clang_Comment_getChild = (clang_Comment_getChildPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXComment*)(intptr_t)__result) = clang_Comment_getChild(*Comment, ChildIdx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1Comment_1getChild(JNIEnv *__env, jclass clazz, jlong CommentAddress, jint ChildIdx, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1Comment_1getChild(CommentAddress, ChildIdx, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1TextComment_1getText(jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_TextComment_getTextPROC clang_TextComment_getText = (clang_TextComment_getTextPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_TextComment_getText(*Comment);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1TextComment_1getText(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1TextComment_1getText(CommentAddress, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1InlineCommandComment_1getCommandName(jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_InlineCommandComment_getCommandNamePROC clang_InlineCommandComment_getCommandName = (clang_InlineCommandComment_getCommandNamePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_InlineCommandComment_getCommandName(*Comment);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1InlineCommandComment_1getCommandName(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1InlineCommandComment_1getCommandName(CommentAddress, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1InlineCommandComment_1getArgText(jlong CommentAddress, jint ArgIdx, jlong __functionAddress, jlong __result) {
    clang_InlineCommandComment_getArgTextPROC clang_InlineCommandComment_getArgText = (clang_InlineCommandComment_getArgTextPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_InlineCommandComment_getArgText(*Comment, ArgIdx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1InlineCommandComment_1getArgText(JNIEnv *__env, jclass clazz, jlong CommentAddress, jint ArgIdx, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1InlineCommandComment_1getArgText(CommentAddress, ArgIdx, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLTagComment_1getTagName(jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_HTMLTagComment_getTagNamePROC clang_HTMLTagComment_getTagName = (clang_HTMLTagComment_getTagNamePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_HTMLTagComment_getTagName(*Comment);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLTagComment_1getTagName(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLTagComment_1getTagName(CommentAddress, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLStartTag_1getAttrName(jlong CommentAddress, jint AttrIdx, jlong __functionAddress, jlong __result) {
    clang_HTMLStartTag_getAttrNamePROC clang_HTMLStartTag_getAttrName = (clang_HTMLStartTag_getAttrNamePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_HTMLStartTag_getAttrName(*Comment, AttrIdx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLStartTag_1getAttrName(JNIEnv *__env, jclass clazz, jlong CommentAddress, jint AttrIdx, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLStartTag_1getAttrName(CommentAddress, AttrIdx, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLStartTag_1getAttrValue(jlong CommentAddress, jint AttrIdx, jlong __functionAddress, jlong __result) {
    clang_HTMLStartTag_getAttrValuePROC clang_HTMLStartTag_getAttrValue = (clang_HTMLStartTag_getAttrValuePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_HTMLStartTag_getAttrValue(*Comment, AttrIdx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLStartTag_1getAttrValue(JNIEnv *__env, jclass clazz, jlong CommentAddress, jint AttrIdx, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLStartTag_1getAttrValue(CommentAddress, AttrIdx, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1BlockCommandComment_1getCommandName(jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_BlockCommandComment_getCommandNamePROC clang_BlockCommandComment_getCommandName = (clang_BlockCommandComment_getCommandNamePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_BlockCommandComment_getCommandName(*Comment);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1BlockCommandComment_1getCommandName(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1BlockCommandComment_1getCommandName(CommentAddress, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1BlockCommandComment_1getArgText(jlong CommentAddress, jint ArgIdx, jlong __functionAddress, jlong __result) {
    clang_BlockCommandComment_getArgTextPROC clang_BlockCommandComment_getArgText = (clang_BlockCommandComment_getArgTextPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_BlockCommandComment_getArgText(*Comment, ArgIdx);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1BlockCommandComment_1getArgText(JNIEnv *__env, jclass clazz, jlong CommentAddress, jint ArgIdx, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1BlockCommandComment_1getArgText(CommentAddress, ArgIdx, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1BlockCommandComment_1getParagraph(jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_BlockCommandComment_getParagraphPROC clang_BlockCommandComment_getParagraph = (clang_BlockCommandComment_getParagraphPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXComment*)(intptr_t)__result) = clang_BlockCommandComment_getParagraph(*Comment);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1BlockCommandComment_1getParagraph(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1BlockCommandComment_1getParagraph(CommentAddress, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1ParamCommandComment_1getParamName(jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_ParamCommandComment_getParamNamePROC clang_ParamCommandComment_getParamName = (clang_ParamCommandComment_getParamNamePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_ParamCommandComment_getParamName(*Comment);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1ParamCommandComment_1getParamName(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1ParamCommandComment_1getParamName(CommentAddress, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1TParamCommandComment_1getParamName(jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_TParamCommandComment_getParamNamePROC clang_TParamCommandComment_getParamName = (clang_TParamCommandComment_getParamNamePROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_TParamCommandComment_getParamName(*Comment);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1TParamCommandComment_1getParamName(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1TParamCommandComment_1getParamName(CommentAddress, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1VerbatimBlockLineComment_1getText(jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_VerbatimBlockLineComment_getTextPROC clang_VerbatimBlockLineComment_getText = (clang_VerbatimBlockLineComment_getTextPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_VerbatimBlockLineComment_getText(*Comment);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1VerbatimBlockLineComment_1getText(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1VerbatimBlockLineComment_1getText(CommentAddress, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1VerbatimLineComment_1getText(jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_VerbatimLineComment_getTextPROC clang_VerbatimLineComment_getText = (clang_VerbatimLineComment_getTextPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_VerbatimLineComment_getText(*Comment);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1VerbatimLineComment_1getText(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1VerbatimLineComment_1getText(CommentAddress, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLTagComment_1getAsString(jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_HTMLTagComment_getAsStringPROC clang_HTMLTagComment_getAsString = (clang_HTMLTagComment_getAsStringPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_HTMLTagComment_getAsString(*Comment);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLTagComment_1getAsString(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1HTMLTagComment_1getAsString(CommentAddress, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1FullComment_1getAsHTML(jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_FullComment_getAsHTMLPROC clang_FullComment_getAsHTML = (clang_FullComment_getAsHTMLPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_FullComment_getAsHTML(*Comment);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1FullComment_1getAsHTML(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1FullComment_1getAsHTML(CommentAddress, __functionAddress, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1FullComment_1getAsXML(jlong CommentAddress, jlong __functionAddress, jlong __result) {
    clang_FullComment_getAsXMLPROC clang_FullComment_getAsXML = (clang_FullComment_getAsXMLPROC)(intptr_t)__functionAddress;
    CXComment *Comment = (CXComment *)(intptr_t)CommentAddress;
    *((CXString*)(intptr_t)__result) = clang_FullComment_getAsXML(*Comment);
}
JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangDocumentation_nclang_1FullComment_1getAsXML(JNIEnv *__env, jclass clazz, jlong CommentAddress, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_llvm_ClangDocumentation_nclang_1FullComment_1getAsXML(CommentAddress, __functionAddress, __result);
}

EXTERN_C_EXIT
