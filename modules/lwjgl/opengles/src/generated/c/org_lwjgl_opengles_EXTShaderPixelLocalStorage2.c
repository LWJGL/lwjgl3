/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glFramebufferPixelLocalStorageSizeEXTPROC) (jint, jint);
typedef jint (APIENTRY *glGetFramebufferPixelLocalStorageSizeEXTPROC) (jint);
typedef void (APIENTRY *glClearPixelLocalStorageuiEXTPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTShaderPixelLocalStorage2_glFramebufferPixelLocalStorageSizeEXT(JNIEnv *__env, jclass clazz, jint target, jint size) {
    glFramebufferPixelLocalStorageSizeEXTPROC glFramebufferPixelLocalStorageSizeEXT = (glFramebufferPixelLocalStorageSizeEXTPROC)tlsGetFunction(534);
    UNUSED_PARAM(clazz)
    glFramebufferPixelLocalStorageSizeEXT(target, size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_EXTShaderPixelLocalStorage2_glGetFramebufferPixelLocalStorageSizeEXT(JNIEnv *__env, jclass clazz, jint target) {
    glGetFramebufferPixelLocalStorageSizeEXTPROC glGetFramebufferPixelLocalStorageSizeEXT = (glGetFramebufferPixelLocalStorageSizeEXTPROC)tlsGetFunction(535);
    UNUSED_PARAM(clazz)
    return (jint)glGetFramebufferPixelLocalStorageSizeEXT(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTShaderPixelLocalStorage2_nglClearPixelLocalStorageuiEXT__IIJ(JNIEnv *__env, jclass clazz, jint offset, jint n, jlong valuesAddress) {
    glClearPixelLocalStorageuiEXTPROC glClearPixelLocalStorageuiEXT = (glClearPixelLocalStorageuiEXTPROC)tlsGetFunction(536);
    uintptr_t values = (uintptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glClearPixelLocalStorageuiEXT(offset, n, values);
}

EXTERN_C_EXIT
