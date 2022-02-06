/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "clang-c/Rewrite.h"

typedef void (*clang_CXRewriter_insertTextBeforePROC) (uintptr_t, CXSourceLocation, uintptr_t);
typedef void (*clang_CXRewriter_replaceTextPROC) (uintptr_t, CXSourceRange, uintptr_t);
typedef void (*clang_CXRewriter_removeTextPROC) (uintptr_t, CXSourceRange);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangRewrite_nclang_1CXRewriter_1insertTextBefore(JNIEnv *__env, jclass clazz, jlong RewAddress, jlong LocAddress, jlong InsertAddress, jlong __functionAddress) {
    clang_CXRewriter_insertTextBeforePROC clang_CXRewriter_insertTextBefore = (clang_CXRewriter_insertTextBeforePROC)(uintptr_t)__functionAddress;
    uintptr_t Rew = (uintptr_t)RewAddress;
    CXSourceLocation *Loc = (CXSourceLocation *)(uintptr_t)LocAddress;
    uintptr_t Insert = (uintptr_t)InsertAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_CXRewriter_insertTextBefore(Rew, *Loc, Insert);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangRewrite_nclang_1CXRewriter_1replaceText(JNIEnv *__env, jclass clazz, jlong RewAddress, jlong ToBeReplacedAddress, jlong ReplacementAddress, jlong __functionAddress) {
    clang_CXRewriter_replaceTextPROC clang_CXRewriter_replaceText = (clang_CXRewriter_replaceTextPROC)(uintptr_t)__functionAddress;
    uintptr_t Rew = (uintptr_t)RewAddress;
    CXSourceRange *ToBeReplaced = (CXSourceRange *)(uintptr_t)ToBeReplacedAddress;
    uintptr_t Replacement = (uintptr_t)ReplacementAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_CXRewriter_replaceText(Rew, *ToBeReplaced, Replacement);
}

JNIEXPORT void JNICALL Java_org_lwjgl_llvm_ClangRewrite_nclang_1CXRewriter_1removeText(JNIEnv *__env, jclass clazz, jlong RewAddress, jlong ToBeRemovedAddress, jlong __functionAddress) {
    clang_CXRewriter_removeTextPROC clang_CXRewriter_removeText = (clang_CXRewriter_removeTextPROC)(uintptr_t)__functionAddress;
    uintptr_t Rew = (uintptr_t)RewAddress;
    CXSourceRange *ToBeRemoved = (CXSourceRange *)(uintptr_t)ToBeRemovedAddress;
    UNUSED_PARAMS(__env, clazz)
    clang_CXRewriter_removeText(Rew, *ToBeRemoved);
}

EXTERN_C_EXIT
