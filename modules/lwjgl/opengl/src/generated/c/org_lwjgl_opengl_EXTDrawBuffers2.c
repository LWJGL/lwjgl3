/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glColorMaskIndexedEXTPROC) (jint, jboolean, jboolean, jboolean, jboolean);
typedef void (APIENTRY *glGetBooleanIndexedvEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetIntegerIndexedvEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glEnableIndexedEXTPROC) (jint, jint);
typedef void (APIENTRY *glDisableIndexedEXTPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsEnabledIndexedEXTPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDrawBuffers2_glColorMaskIndexedEXT(JNIEnv *__env, jclass clazz, jint index, jboolean r, jboolean g, jboolean b, jboolean a) {
    glColorMaskIndexedEXTPROC glColorMaskIndexedEXT = (glColorMaskIndexedEXTPROC)tlsGetFunction(1759);
    UNUSED_PARAM(clazz)
    glColorMaskIndexedEXT(index, r, g, b, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDrawBuffers2_nglGetBooleanIndexedvEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetBooleanIndexedvEXTPROC glGetBooleanIndexedvEXT = (glGetBooleanIndexedvEXTPROC)tlsGetFunction(1630);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetBooleanIndexedvEXT(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDrawBuffers2_nglGetIntegerIndexedvEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetIntegerIndexedvEXTPROC glGetIntegerIndexedvEXT = (glGetIntegerIndexedvEXTPROC)tlsGetFunction(1629);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetIntegerIndexedvEXT(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDrawBuffers2_glEnableIndexedEXT(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glEnableIndexedEXTPROC glEnableIndexedEXT = (glEnableIndexedEXTPROC)tlsGetFunction(1626);
    UNUSED_PARAM(clazz)
    glEnableIndexedEXT(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDrawBuffers2_glDisableIndexedEXT(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glDisableIndexedEXTPROC glDisableIndexedEXT = (glDisableIndexedEXTPROC)tlsGetFunction(1627);
    UNUSED_PARAM(clazz)
    glDisableIndexedEXT(target, index);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_EXTDrawBuffers2_glIsEnabledIndexedEXT(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glIsEnabledIndexedEXTPROC glIsEnabledIndexedEXT = (glIsEnabledIndexedEXTPROC)tlsGetFunction(1628);
    UNUSED_PARAM(clazz)
    return glIsEnabledIndexedEXT(target, index);
}

EXTERN_C_EXIT
