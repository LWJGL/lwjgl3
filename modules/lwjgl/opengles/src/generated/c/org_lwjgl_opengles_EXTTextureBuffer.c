/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTexBufferEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexBufferRangeEXTPROC) (jint, jint, jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBuffer_glTexBufferEXT(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer) {
    glTexBufferEXTPROC glTexBufferEXT = (glTexBufferEXTPROC)tlsGetFunction(547);
    UNUSED_PARAM(clazz)
    glTexBufferEXT(target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureBuffer_glTexBufferRangeEXT(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong offset, jlong size) {
    glTexBufferRangeEXTPROC glTexBufferRangeEXT = (glTexBufferRangeEXTPROC)tlsGetFunction(548);
    UNUSED_PARAM(clazz)
    glTexBufferRangeEXT(target, internalformat, buffer, (intptr_t)offset, (intptr_t)size);
}

EXTERN_C_EXIT
