/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glReadBufferNVPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVReadBuffer_glReadBufferNV(JNIEnv *__env, jclass clazz, jint mode) {
    glReadBufferNVPROC glReadBufferNV = (glReadBufferNVPROC)tlsGetFunction(754);
    UNUSED_PARAM(clazz)
    glReadBufferNV(mode);
}

EXTERN_C_EXIT
