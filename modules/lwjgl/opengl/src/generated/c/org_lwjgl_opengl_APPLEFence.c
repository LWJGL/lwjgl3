/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGenFencesAPPLEPROC) (jint, uintptr_t);
typedef void (APIENTRY *glDeleteFencesAPPLEPROC) (jint, uintptr_t);
typedef void (APIENTRY *glSetFenceAPPLEPROC) (jint);
typedef jboolean (APIENTRY *glIsFenceAPPLEPROC) (jint);
typedef jboolean (APIENTRY *glTestFenceAPPLEPROC) (jint);
typedef void (APIENTRY *glFinishFenceAPPLEPROC) (jint);
typedef jboolean (APIENTRY *glTestObjectAPPLEPROC) (jint, jint);
typedef void (APIENTRY *glFinishObjectAPPLEPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEFence_nglGenFencesAPPLE__IJ(JNIEnv *__env, jclass clazz, jint n, jlong fencesAddress) {
    glGenFencesAPPLEPROC glGenFencesAPPLE = (glGenFencesAPPLEPROC)tlsGetFunction(1116);
    uintptr_t fences = (uintptr_t)fencesAddress;
    UNUSED_PARAM(clazz)
    glGenFencesAPPLE(n, fences);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEFence_nglDeleteFencesAPPLE__IJ(JNIEnv *__env, jclass clazz, jint n, jlong fencesAddress) {
    glDeleteFencesAPPLEPROC glDeleteFencesAPPLE = (glDeleteFencesAPPLEPROC)tlsGetFunction(1117);
    uintptr_t fences = (uintptr_t)fencesAddress;
    UNUSED_PARAM(clazz)
    glDeleteFencesAPPLE(n, fences);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEFence_glSetFenceAPPLE(JNIEnv *__env, jclass clazz, jint fence) {
    glSetFenceAPPLEPROC glSetFenceAPPLE = (glSetFenceAPPLEPROC)tlsGetFunction(1118);
    UNUSED_PARAM(clazz)
    glSetFenceAPPLE(fence);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_APPLEFence_glIsFenceAPPLE(JNIEnv *__env, jclass clazz, jint fence) {
    glIsFenceAPPLEPROC glIsFenceAPPLE = (glIsFenceAPPLEPROC)tlsGetFunction(1119);
    UNUSED_PARAM(clazz)
    return glIsFenceAPPLE(fence);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_APPLEFence_glTestFenceAPPLE(JNIEnv *__env, jclass clazz, jint fence) {
    glTestFenceAPPLEPROC glTestFenceAPPLE = (glTestFenceAPPLEPROC)tlsGetFunction(1120);
    UNUSED_PARAM(clazz)
    return glTestFenceAPPLE(fence);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEFence_glFinishFenceAPPLE(JNIEnv *__env, jclass clazz, jint fence) {
    glFinishFenceAPPLEPROC glFinishFenceAPPLE = (glFinishFenceAPPLEPROC)tlsGetFunction(1121);
    UNUSED_PARAM(clazz)
    glFinishFenceAPPLE(fence);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_APPLEFence_glTestObjectAPPLE(JNIEnv *__env, jclass clazz, jint object, jint name) {
    glTestObjectAPPLEPROC glTestObjectAPPLE = (glTestObjectAPPLEPROC)tlsGetFunction(1122);
    UNUSED_PARAM(clazz)
    return glTestObjectAPPLE(object, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEFence_glFinishObjectAPPLE(JNIEnv *__env, jclass clazz, jint object, jint name) {
    glFinishObjectAPPLEPROC glFinishObjectAPPLE = (glFinishObjectAPPLEPROC)tlsGetFunction(1123);
    UNUSED_PARAM(clazz)
    glFinishObjectAPPLE(object, name);
}

EXTERN_C_EXIT
