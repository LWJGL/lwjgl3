/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "clang-c/Rewrite.h"

typedef void (*clang_CXRewriter_insertTextBeforePROC) (intptr_t, CXSourceLocation, intptr_t);
typedef void (*clang_CXRewriter_replaceTextPROC) (intptr_t, CXSourceRange, intptr_t);
typedef void (*clang_CXRewriter_removeTextPROC) (intptr_t, CXSourceRange);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangRewrite_nclang_1CXRewriter_1insertTextBefore(JNIEnv *__env, jclass clazz, jlong RewAddress, jlong LocAddress, jlong InsertAddress, jlong __functionAddress) {
    clang_CXRewriter_insertTextBeforePROC clang_CXRewriter_insertTextBefore = (clang_CXRewriter_insertTextBeforePROC)(intptr_t)__functionAddress;
    intptr_t Rew = (intptr_t)RewAddress;
    CXSourceLocation *Loc = (CXSourceLocation *)(intptr_t)LocAddress;
    intptr_t Insert = (intptr_t)InsertAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_CXRewriter_insertTextBefore(Rew, *Loc, Insert);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangRewrite_nclang_1CXRewriter_1replaceText(JNIEnv *__env, jclass clazz, jlong RewAddress, jlong ToBeReplacedAddress, jlong ReplacementAddress, jlong __functionAddress) {
    clang_CXRewriter_replaceTextPROC clang_CXRewriter_replaceText = (clang_CXRewriter_replaceTextPROC)(intptr_t)__functionAddress;
    intptr_t Rew = (intptr_t)RewAddress;
    CXSourceRange *ToBeReplaced = (CXSourceRange *)(intptr_t)ToBeReplacedAddress;
    intptr_t Replacement = (intptr_t)ReplacementAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_CXRewriter_replaceText(Rew, *ToBeReplaced, Replacement);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangRewrite_nclang_1CXRewriter_1removeText(JNIEnv *__env, jclass clazz, jlong RewAddress, jlong ToBeRemovedAddress, jlong __functionAddress) {
    clang_CXRewriter_removeTextPROC clang_CXRewriter_removeText = (clang_CXRewriter_removeTextPROC)(intptr_t)__functionAddress;
    intptr_t Rew = (intptr_t)RewAddress;
    CXSourceRange *ToBeRemoved = (CXSourceRange *)(intptr_t)ToBeRemovedAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_CXRewriter_removeText(Rew, *ToBeRemoved);
}

EXTERN_C_EXIT
