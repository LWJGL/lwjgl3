/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glMultiDrawArraysIndirectEXTPROC) (jint, uintptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawElementsIndirectEXTPROC) (jint, jint, uintptr_t, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiDrawIndirect_nglMultiDrawArraysIndirectEXT__IJII(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jint drawcount, jint stride) {
    glMultiDrawArraysIndirectEXTPROC glMultiDrawArraysIndirectEXT = (glMultiDrawArraysIndirectEXTPROC)tlsGetFunction(465);
    uintptr_t indirect = (uintptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawArraysIndirectEXT(mode, indirect, drawcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiDrawIndirect_nglMultiDrawElementsIndirectEXT__IIJII(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jint drawcount, jint stride) {
    glMultiDrawElementsIndirectEXTPROC glMultiDrawElementsIndirectEXT = (glMultiDrawElementsIndirectEXTPROC)tlsGetFunction(466);
    uintptr_t indirect = (uintptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsIndirectEXT(mode, type, indirect, drawcount, stride);
}

EXTERN_C_EXIT
