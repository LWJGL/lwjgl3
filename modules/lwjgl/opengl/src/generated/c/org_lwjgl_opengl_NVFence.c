/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDeleteFencesNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGenFencesNVPROC) (jint, uintptr_t);
typedef jboolean (APIENTRY *glIsFenceNVPROC) (jint);
typedef jboolean (APIENTRY *glTestFenceNVPROC) (jint);
typedef void (APIENTRY *glGetFenceivNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glFinishFenceNVPROC) (jint);
typedef void (APIENTRY *glSetFenceNVPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFence_nglDeleteFencesNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong fencesAddress) {
    glDeleteFencesNVPROC glDeleteFencesNV = (glDeleteFencesNVPROC)tlsGetFunction(1962);
    uintptr_t fences = (uintptr_t)fencesAddress;
    UNUSED_PARAM(clazz)
    glDeleteFencesNV(n, fences);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFence_nglGenFencesNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong fencesAddress) {
    glGenFencesNVPROC glGenFencesNV = (glGenFencesNVPROC)tlsGetFunction(1963);
    uintptr_t fences = (uintptr_t)fencesAddress;
    UNUSED_PARAM(clazz)
    glGenFencesNV(n, fences);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVFence_glIsFenceNV(JNIEnv *__env, jclass clazz, jint fence) {
    glIsFenceNVPROC glIsFenceNV = (glIsFenceNVPROC)tlsGetFunction(1964);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsFenceNV(fence);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVFence_glTestFenceNV(JNIEnv *__env, jclass clazz, jint fence) {
    glTestFenceNVPROC glTestFenceNV = (glTestFenceNVPROC)tlsGetFunction(1965);
    UNUSED_PARAM(clazz)
    return (jboolean)glTestFenceNV(fence);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFence_nglGetFenceivNV__IIJ(JNIEnv *__env, jclass clazz, jint fence, jint pname, jlong paramsAddress) {
    glGetFenceivNVPROC glGetFenceivNV = (glGetFenceivNVPROC)tlsGetFunction(1966);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFenceivNV(fence, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFence_glFinishFenceNV(JNIEnv *__env, jclass clazz, jint fence) {
    glFinishFenceNVPROC glFinishFenceNV = (glFinishFenceNVPROC)tlsGetFunction(1967);
    UNUSED_PARAM(clazz)
    glFinishFenceNV(fence);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFence_glSetFenceNV(JNIEnv *__env, jclass clazz, jint fence, jint condition) {
    glSetFenceNVPROC glSetFenceNV = (glSetFenceNVPROC)tlsGetFunction(1968);
    UNUSED_PARAM(clazz)
    glSetFenceNV(fence, condition);
}

EXTERN_C_EXIT
