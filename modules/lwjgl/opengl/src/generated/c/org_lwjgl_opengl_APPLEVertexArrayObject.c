/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindVertexArrayAPPLEPROC) (jint);
typedef void (APIENTRY *glDeleteVertexArraysAPPLEPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGenVertexArraysAPPLEPROC) (jint, uintptr_t);
typedef jboolean (APIENTRY *glIsVertexArrayAPPLEPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEVertexArrayObject_glBindVertexArrayAPPLE(JNIEnv *__env, jclass clazz, jint array) {
    glBindVertexArrayAPPLEPROC glBindVertexArrayAPPLE = (glBindVertexArrayAPPLEPROC)tlsGetFunction(1131);
    UNUSED_PARAM(clazz)
    glBindVertexArrayAPPLE(array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEVertexArrayObject_nglDeleteVertexArraysAPPLE__IJ(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress) {
    glDeleteVertexArraysAPPLEPROC glDeleteVertexArraysAPPLE = (glDeleteVertexArraysAPPLEPROC)tlsGetFunction(1132);
    uintptr_t arrays = (uintptr_t)arraysAddress;
    UNUSED_PARAM(clazz)
    glDeleteVertexArraysAPPLE(n, arrays);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEVertexArrayObject_nglGenVertexArraysAPPLE__IJ(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress) {
    glGenVertexArraysAPPLEPROC glGenVertexArraysAPPLE = (glGenVertexArraysAPPLEPROC)tlsGetFunction(1133);
    uintptr_t arrays = (uintptr_t)arraysAddress;
    UNUSED_PARAM(clazz)
    glGenVertexArraysAPPLE(n, arrays);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_APPLEVertexArrayObject_glIsVertexArrayAPPLE(JNIEnv *__env, jclass clazz, jint array) {
    glIsVertexArrayAPPLEPROC glIsVertexArrayAPPLE = (glIsVertexArrayAPPLEPROC)tlsGetFunction(1134);
    UNUSED_PARAM(clazz)
    return glIsVertexArrayAPPLE(array);
}

EXTERN_C_EXIT
