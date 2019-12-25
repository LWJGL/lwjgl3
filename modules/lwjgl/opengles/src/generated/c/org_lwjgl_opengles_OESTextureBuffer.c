/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTexBufferOESPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexBufferRangeOESPROC) (jint, jint, jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBuffer_glTexBufferOES(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer) {
    glTexBufferOESPROC glTexBufferOES = (glTexBufferOESPROC)tlsGetFunction(810);
    UNUSED_PARAM(clazz)
    glTexBufferOES(target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBuffer_glTexBufferRangeOES(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong offset, jlong size) {
    glTexBufferRangeOESPROC glTexBufferRangeOES = (glTexBufferRangeOESPROC)tlsGetFunction(811);
    UNUSED_PARAM(clazz)
    glTexBufferRangeOES(target, internalformat, buffer, (intptr_t)offset, (intptr_t)size);
}

EXTERN_C_EXIT
