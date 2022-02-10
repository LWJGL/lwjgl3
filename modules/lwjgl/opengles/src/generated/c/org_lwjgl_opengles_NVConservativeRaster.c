/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glSubpixelPrecisionBiasNVPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVConservativeRaster_glSubpixelPrecisionBiasNV(JNIEnv *__env, jclass clazz, jint xbits, jint ybits) {
    glSubpixelPrecisionBiasNVPROC glSubpixelPrecisionBiasNV = (glSubpixelPrecisionBiasNVPROC)tlsGetFunction(615);
    UNUSED_PARAM(clazz)
    glSubpixelPrecisionBiasNV(xbits, ybits);
}

EXTERN_C_EXIT
