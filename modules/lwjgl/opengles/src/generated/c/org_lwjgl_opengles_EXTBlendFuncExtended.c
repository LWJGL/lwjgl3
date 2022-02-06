/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glBindFragDataLocationIndexedEXTPROC) (jint, jint, jint, uintptr_t);
typedef jint (APIENTRY *glGetFragDataIndexEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glBindFragDataLocationEXTPROC) (jint, jint, uintptr_t);
typedef jint (APIENTRY *glGetProgramResourceLocationIndexEXTPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTBlendFuncExtended_nglBindFragDataLocationIndexedEXT(JNIEnv *__env, jclass clazz, jint program, jint colorNumber, jint index, jlong nameAddress) {
    glBindFragDataLocationIndexedEXTPROC glBindFragDataLocationIndexedEXT = (glBindFragDataLocationIndexedEXTPROC)tlsGetFunction(390);
    uintptr_t name = (uintptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glBindFragDataLocationIndexedEXT(program, colorNumber, index, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_EXTBlendFuncExtended_nglGetFragDataIndexEXT(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
    glGetFragDataIndexEXTPROC glGetFragDataIndexEXT = (glGetFragDataIndexEXTPROC)tlsGetFunction(391);
    uintptr_t name = (uintptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetFragDataIndexEXT(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTBlendFuncExtended_nglBindFragDataLocationEXT(JNIEnv *__env, jclass clazz, jint program, jint colorNumber, jlong nameAddress) {
    glBindFragDataLocationEXTPROC glBindFragDataLocationEXT = (glBindFragDataLocationEXTPROC)tlsGetFunction(392);
    uintptr_t name = (uintptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glBindFragDataLocationEXT(program, colorNumber, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_EXTBlendFuncExtended_nglGetProgramResourceLocationIndexEXT(JNIEnv *__env, jclass clazz, jint program, jint programInterface, jlong nameAddress) {
    glGetProgramResourceLocationIndexEXTPROC glGetProgramResourceLocationIndexEXT = (glGetProgramResourceLocationIndexEXTPROC)tlsGetFunction(393);
    uintptr_t name = (uintptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetProgramResourceLocationIndexEXT(program, programInterface, name);
}

EXTERN_C_EXIT
