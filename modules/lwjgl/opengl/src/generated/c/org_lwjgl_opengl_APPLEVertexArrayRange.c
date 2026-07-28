/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glVertexArrayRangeAPPLEPROC) (jint, uintptr_t);
typedef void (APIENTRY *glFlushVertexArrayRangeAPPLEPROC) (jint, uintptr_t);
typedef void (APIENTRY *glVertexArrayParameteriAPPLEPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEVertexArrayRange_nglVertexArrayRangeAPPLE(JNIEnv *__env, jclass clazz, jint length, jlong pointerAddress) {
    glVertexArrayRangeAPPLEPROC glVertexArrayRangeAPPLE = (glVertexArrayRangeAPPLEPROC)tlsGetFunction(1135);
    uintptr_t pointer = (uintptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glVertexArrayRangeAPPLE(length, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEVertexArrayRange_nglFlushVertexArrayRangeAPPLE(JNIEnv *__env, jclass clazz, jint length, jlong pointerAddress) {
    glFlushVertexArrayRangeAPPLEPROC glFlushVertexArrayRangeAPPLE = (glFlushVertexArrayRangeAPPLEPROC)tlsGetFunction(1136);
    uintptr_t pointer = (uintptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glFlushVertexArrayRangeAPPLE(length, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEVertexArrayRange_glVertexArrayParameteriAPPLE(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glVertexArrayParameteriAPPLEPROC glVertexArrayParameteriAPPLE = (glVertexArrayParameteriAPPLEPROC)tlsGetFunction(1137);
    UNUSED_PARAM(clazz)
    glVertexArrayParameteriAPPLE(pname, param);
}

EXTERN_C_EXIT
