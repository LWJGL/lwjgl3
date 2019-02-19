/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "clang-c/Index.h"

static jint delegate(void * context, CXCursor cursor, CXSourceRange range) {
    return ((enum CXVisitorResult (*)(CXCursor *, CXSourceRange *))(uintptr_t)context)(&cursor, &range);
}

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_llvm_CXCursorAndRangeVisit_getDelegate(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (intptr_t)delegate;
}

EXTERN_C_EXIT
