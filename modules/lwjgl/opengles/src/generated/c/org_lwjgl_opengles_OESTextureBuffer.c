/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTexBufferOESPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexBufferRangeOESPROC) (jint, jint, jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBuffer_glTexBufferOES(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer) {
    glTexBufferOESPROC glTexBufferOES = (glTexBufferOESPROC)tlsGetFunction(821);
    UNUSED_PARAM(clazz)
    glTexBufferOES(target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBuffer_glTexBufferRangeOES(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong offset, jlong size) {
    glTexBufferRangeOESPROC glTexBufferRangeOES = (glTexBufferRangeOESPROC)tlsGetFunction(822);
    UNUSED_PARAM(clazz)
    glTexBufferRangeOES(target, internalformat, buffer, (uintptr_t)offset, (uintptr_t)size);
}

EXTERN_C_EXIT
