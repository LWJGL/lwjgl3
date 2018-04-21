/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glMultiDrawArraysIndirectPROC) (jint, intptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawElementsIndirectPROC) (jint, jint, intptr_t, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiDrawIndirect_nglMultiDrawArraysIndirect__IJII(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jint primcount, jint stride) {
    glMultiDrawArraysIndirectPROC glMultiDrawArraysIndirect = (glMultiDrawArraysIndirectPROC)tlsGetFunction(894);
    intptr_t indirect = (intptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawArraysIndirect(mode, indirect, primcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiDrawIndirect_nglMultiDrawElementsIndirect__IIJII(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jint primcount, jint stride) {
    glMultiDrawElementsIndirectPROC glMultiDrawElementsIndirect = (glMultiDrawElementsIndirectPROC)tlsGetFunction(895);
    intptr_t indirect = (intptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsIndirect(mode, type, indirect, primcount, stride);
}

EXTERN_C_EXIT
