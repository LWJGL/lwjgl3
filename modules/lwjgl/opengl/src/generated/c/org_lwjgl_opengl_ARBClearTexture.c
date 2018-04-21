/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glClearTexSubImagePROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glClearTexImagePROC) (jint, jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBClearTexture_nglClearTexSubImage__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong dataAddress) {
    glClearTexSubImagePROC glClearTexSubImage = (glClearTexSubImagePROC)tlsGetFunction(914);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBClearTexture_nglClearTexImage__IIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint format, jint type, jlong dataAddress) {
    glClearTexImagePROC glClearTexImage = (glClearTexImagePROC)tlsGetFunction(915);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearTexImage(texture, level, format, type, data);
}

EXTERN_C_EXIT
