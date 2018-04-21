/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glPatchParameteriPROC) (jint, jint);
typedef void (APIENTRY *glPatchParameterfvPROC) (jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTessellationShader_glPatchParameteri(JNIEnv *__env, jclass clazz, jint pname, jint value) {
    glPatchParameteriPROC glPatchParameteri = (glPatchParameteriPROC)tlsGetFunction(757);
    UNUSED_PARAM(clazz)
    glPatchParameteri(pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTessellationShader_nglPatchParameterfv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong valuesAddress) {
    glPatchParameterfvPROC glPatchParameterfv = (glPatchParameterfvPROC)tlsGetFunction(758);
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glPatchParameterfv(pname, values);
}

EXTERN_C_EXIT
