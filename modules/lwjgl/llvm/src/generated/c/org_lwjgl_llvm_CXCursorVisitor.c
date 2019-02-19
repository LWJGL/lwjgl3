/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "clang-c/Index.h"

static jint delegate(CXCursor cursor, CXCursor parent, CXClientData client_data) {
    return ((enum CXChildVisitResult (*)(CXCursor *, CXCursor *))(uintptr_t)client_data)(&cursor, &parent);
}

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_CXCursorVisitor_getDelegate(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (intptr_t)delegate;
}

EXTERN_C_EXIT
