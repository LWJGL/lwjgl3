/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glSyncTextureINTELPROC) (jint);
typedef void (APIENTRY *glUnmapTexture2DINTELPROC) (jint, jint);
typedef uintptr_t (APIENTRY *glMapTexture2DINTELPROC) (jint, jint, jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELMapTexture_glSyncTextureINTEL(JNIEnv *__env, jclass clazz, jint texture) {
    glSyncTextureINTELPROC glSyncTextureINTEL = (glSyncTextureINTELPROC)tlsGetFunction(1889);
    UNUSED_PARAM(clazz)
    glSyncTextureINTEL(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELMapTexture_glUnmapTexture2DINTEL(JNIEnv *__env, jclass clazz, jint texture, jint level) {
    glUnmapTexture2DINTELPROC glUnmapTexture2DINTEL = (glUnmapTexture2DINTELPROC)tlsGetFunction(1890);
    UNUSED_PARAM(clazz)
    glUnmapTexture2DINTEL(texture, level);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_INTELMapTexture_nglMapTexture2DINTEL__IIIJJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint access, jlong strideAddress, jlong layoutAddress) {
    glMapTexture2DINTELPROC glMapTexture2DINTEL = (glMapTexture2DINTELPROC)tlsGetFunction(1891);
    uintptr_t stride = (uintptr_t)strideAddress;
    uintptr_t layout = (uintptr_t)layoutAddress;
    UNUSED_PARAM(clazz)
    return (jlong)glMapTexture2DINTEL(texture, level, access, stride, layout);
}

EXTERN_C_EXIT
