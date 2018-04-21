/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glShaderStorageBlockBindingPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderStorageBufferObject_glShaderStorageBlockBinding(JNIEnv *__env, jclass clazz, jint program, jint storageBlockIndex, jint storageBlockBinding) {
    glShaderStorageBlockBindingPROC glShaderStorageBlockBinding = (glShaderStorageBlockBindingPROC)tlsGetFunction(902);
    UNUSED_PARAM(clazz)
    glShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding);
}

EXTERN_C_EXIT
