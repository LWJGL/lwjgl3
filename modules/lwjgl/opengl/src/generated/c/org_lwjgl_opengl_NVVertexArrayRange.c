/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glVertexArrayRangeNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glFlushVertexArrayRangeNVPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexArrayRange_nglVertexArrayRangeNV(JNIEnv *__env, jclass clazz, jint length, jlong pointerAddress) {
    glVertexArrayRangeNVPROC glVertexArrayRangeNV = (glVertexArrayRangeNVPROC)tlsGetFunction(2175);
    uintptr_t pointer = (uintptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glVertexArrayRangeNV(length, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexArrayRange_glFlushVertexArrayRangeNV(JNIEnv *__env, jclass clazz) {
    glFlushVertexArrayRangeNVPROC glFlushVertexArrayRangeNV = (glFlushVertexArrayRangeNVPROC)tlsGetFunction(2176);
    UNUSED_PARAM(clazz)
    glFlushVertexArrayRangeNV();
}

EXTERN_C_EXIT
