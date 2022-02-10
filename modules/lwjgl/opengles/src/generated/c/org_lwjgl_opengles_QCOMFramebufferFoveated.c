/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glFramebufferFoveationConfigQCOMPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glFramebufferFoveationParametersQCOMPROC) (jint, jint, jint, jfloat, jfloat, jfloat, jfloat, jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMFramebufferFoveated_nglFramebufferFoveationConfigQCOM__IIIIJ(JNIEnv *__env, jclass clazz, jint fbo, jint numLayers, jint focalPointsPerLayer, jint requestedFeatures, jlong providedFeaturesAddress) {
    glFramebufferFoveationConfigQCOMPROC glFramebufferFoveationConfigQCOM = (glFramebufferFoveationConfigQCOMPROC)tlsGetFunction(858);
    uintptr_t providedFeatures = (uintptr_t)providedFeaturesAddress;
    UNUSED_PARAM(clazz)
    glFramebufferFoveationConfigQCOM(fbo, numLayers, focalPointsPerLayer, requestedFeatures, providedFeatures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMFramebufferFoveated_glFramebufferFoveationParametersQCOM(JNIEnv *__env, jclass clazz, jint fbo, jint layer, jint focalPoint, jfloat focalX, jfloat focalY, jfloat gainX, jfloat gainY, jfloat foveaArea) {
    glFramebufferFoveationParametersQCOMPROC glFramebufferFoveationParametersQCOM = (glFramebufferFoveationParametersQCOMPROC)tlsGetFunction(859);
    UNUSED_PARAM(clazz)
    glFramebufferFoveationParametersQCOM(fbo, layer, focalPoint, focalX, focalY, gainX, gainY, foveaArea);
}

EXTERN_C_EXIT
