/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindImageTextureEXTPROC) (jint, jint, jint, jboolean, jint, jint, jint);
typedef void (APIENTRY *glMemoryBarrierEXTPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTShaderImageLoadStore_glBindImageTextureEXT(JNIEnv *__env, jclass clazz, jint index, jint texture, jint level, jboolean layered, jint layer, jint access, jint format) {
    glBindImageTextureEXTPROC glBindImageTextureEXT = (glBindImageTextureEXTPROC)tlsGetFunction(1849);
    UNUSED_PARAM(clazz)
    glBindImageTextureEXT(index, texture, level, layered, layer, access, format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTShaderImageLoadStore_glMemoryBarrierEXT(JNIEnv *__env, jclass clazz, jint barriers) {
    glMemoryBarrierEXTPROC glMemoryBarrierEXT = (glMemoryBarrierEXTPROC)tlsGetFunction(1850);
    UNUSED_PARAM(clazz)
    glMemoryBarrierEXT(barriers);
}

EXTERN_C_EXIT
