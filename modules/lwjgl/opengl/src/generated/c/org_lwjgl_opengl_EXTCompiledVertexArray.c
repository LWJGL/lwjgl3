/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glLockArraysEXTPROC) (jint, jint);
typedef void (APIENTRY *glUnlockArraysEXTPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTCompiledVertexArray_glLockArraysEXT(JNIEnv *__env, jclass clazz, jint first, jint count) {
    glLockArraysEXTPROC glLockArraysEXT = (glLockArraysEXTPROC)tlsGetFunction(1500);
    UNUSED_PARAM(clazz)
    glLockArraysEXT(first, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTCompiledVertexArray_glUnlockArraysEXT(JNIEnv *__env, jclass clazz) {
    glUnlockArraysEXTPROC glUnlockArraysEXT = (glUnlockArraysEXTPROC)tlsGetFunction(1501);
    UNUSED_PARAM(clazz)
    glUnlockArraysEXT();
}

EXTERN_C_EXIT
