/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindFragDataLocationIndexedPROC) (jint, jint, jint, intptr_t);
typedef jint (APIENTRY *glGetFragDataIndexPROC) (jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBlendFuncExtended_nglBindFragDataLocationIndexed(JNIEnv *__env, jclass clazz, jint program, jint colorNumber, jint index, jlong nameAddress) {
    glBindFragDataLocationIndexedPROC glBindFragDataLocationIndexed = (glBindFragDataLocationIndexedPROC)tlsGetFunction(666);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glBindFragDataLocationIndexed(program, colorNumber, index, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBBlendFuncExtended_nglGetFragDataIndex(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
    glGetFragDataIndexPROC glGetFragDataIndex = (glGetFragDataIndexPROC)tlsGetFunction(667);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetFragDataIndex(program, name);
}

EXTERN_C_EXIT
