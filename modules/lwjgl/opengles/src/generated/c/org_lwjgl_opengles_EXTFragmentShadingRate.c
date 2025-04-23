/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glShadingRateEXTPROC) (jint);
typedef void (APIENTRY *glShadingRateCombinerOpsEXTPROC) (jint, jint);
typedef void (APIENTRY *glFramebufferShadingRateEXTPROC) (jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glGetFragmentShadingRatesEXTPROC) (jint, jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTFragmentShadingRate_glShadingRateEXT(JNIEnv *__env, jclass clazz, jint rate) {
    glShadingRateEXTPROC glShadingRateEXT = (glShadingRateEXTPROC)tlsGetFunction(439);
    UNUSED_PARAM(clazz)
    glShadingRateEXT(rate);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTFragmentShadingRate_glShadingRateCombinerOpsEXT(JNIEnv *__env, jclass clazz, jint combinerOp0, jint combinerOp1) {
    glShadingRateCombinerOpsEXTPROC glShadingRateCombinerOpsEXT = (glShadingRateCombinerOpsEXTPROC)tlsGetFunction(440);
    UNUSED_PARAM(clazz)
    glShadingRateCombinerOpsEXT(combinerOp0, combinerOp1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTFragmentShadingRate_glFramebufferShadingRateEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint baseLayer, jint numLayers, jint texelWidth, jint texelHeight) {
    glFramebufferShadingRateEXTPROC glFramebufferShadingRateEXT = (glFramebufferShadingRateEXTPROC)tlsGetFunction(441);
    UNUSED_PARAM(clazz)
    glFramebufferShadingRateEXT(target, attachment, texture, baseLayer, numLayers, texelWidth, texelHeight);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTFragmentShadingRate_nglGetFragmentShadingRatesEXT__IIJJ(JNIEnv *__env, jclass clazz, jint samples, jint maxCount, jlong countAddress, jlong shadingRatesAddress) {
    glGetFragmentShadingRatesEXTPROC glGetFragmentShadingRatesEXT = (glGetFragmentShadingRatesEXTPROC)tlsGetFunction(442);
    uintptr_t count = (uintptr_t)countAddress;
    uintptr_t shadingRates = (uintptr_t)shadingRatesAddress;
    UNUSED_PARAM(clazz)
    glGetFragmentShadingRatesEXT(samples, maxCount, count, shadingRates);
}

EXTERN_C_EXIT
