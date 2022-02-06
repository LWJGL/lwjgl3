/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindShadingRateImageNVPROC) (jint);
typedef void (APIENTRY *glShadingRateImagePaletteNVPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetShadingRateImagePaletteNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glShadingRateImageBarrierNVPROC) (jboolean);
typedef void (APIENTRY *glShadingRateSampleOrderNVPROC) (jint);
typedef void (APIENTRY *glShadingRateSampleOrderCustomNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetShadingRateSampleLocationivNVPROC) (jint, jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShadingRateImage_glBindShadingRateImageNV(JNIEnv *__env, jclass clazz, jint texture) {
    glBindShadingRateImageNVPROC glBindShadingRateImageNV = (glBindShadingRateImageNVPROC)tlsGetFunction(2139);
    UNUSED_PARAM(clazz)
    glBindShadingRateImageNV(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShadingRateImage_nglShadingRateImagePaletteNV__IIIJ(JNIEnv *__env, jclass clazz, jint viewport, jint first, jint count, jlong ratesAddress) {
    glShadingRateImagePaletteNVPROC glShadingRateImagePaletteNV = (glShadingRateImagePaletteNVPROC)tlsGetFunction(2140);
    uintptr_t rates = (uintptr_t)ratesAddress;
    UNUSED_PARAM(clazz)
    glShadingRateImagePaletteNV(viewport, first, count, rates);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShadingRateImage_nglGetShadingRateImagePaletteNV__IIJ(JNIEnv *__env, jclass clazz, jint viewport, jint entry, jlong rateAddress) {
    glGetShadingRateImagePaletteNVPROC glGetShadingRateImagePaletteNV = (glGetShadingRateImagePaletteNVPROC)tlsGetFunction(2141);
    uintptr_t rate = (uintptr_t)rateAddress;
    UNUSED_PARAM(clazz)
    glGetShadingRateImagePaletteNV(viewport, entry, rate);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShadingRateImage_glShadingRateImageBarrierNV(JNIEnv *__env, jclass clazz, jboolean synchronize) {
    glShadingRateImageBarrierNVPROC glShadingRateImageBarrierNV = (glShadingRateImageBarrierNVPROC)tlsGetFunction(2142);
    UNUSED_PARAM(clazz)
    glShadingRateImageBarrierNV(synchronize);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShadingRateImage_glShadingRateSampleOrderNV(JNIEnv *__env, jclass clazz, jint order) {
    glShadingRateSampleOrderNVPROC glShadingRateSampleOrderNV = (glShadingRateSampleOrderNVPROC)tlsGetFunction(2143);
    UNUSED_PARAM(clazz)
    glShadingRateSampleOrderNV(order);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShadingRateImage_nglShadingRateSampleOrderCustomNV__IIJ(JNIEnv *__env, jclass clazz, jint rate, jint samples, jlong locationsAddress) {
    glShadingRateSampleOrderCustomNVPROC glShadingRateSampleOrderCustomNV = (glShadingRateSampleOrderCustomNVPROC)tlsGetFunction(2144);
    uintptr_t locations = (uintptr_t)locationsAddress;
    UNUSED_PARAM(clazz)
    glShadingRateSampleOrderCustomNV(rate, samples, locations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShadingRateImage_nglGetShadingRateSampleLocationivNV__IIIJ(JNIEnv *__env, jclass clazz, jint rate, jint samples, jint index, jlong locationAddress) {
    glGetShadingRateSampleLocationivNVPROC glGetShadingRateSampleLocationivNV = (glGetShadingRateSampleLocationivNVPROC)tlsGetFunction(2145);
    uintptr_t location = (uintptr_t)locationAddress;
    UNUSED_PARAM(clazz)
    glGetShadingRateSampleLocationivNV(rate, samples, index, location);
}

EXTERN_C_EXIT
