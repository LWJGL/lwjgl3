/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glViewportPositionWScaleNVPROC) (jint, jfloat, jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVClipSpaceWScaling_glViewportPositionWScaleNV(JNIEnv *__env, jclass clazz, jint index, jfloat xcoeff, jfloat ycoeff) {
    glViewportPositionWScaleNVPROC glViewportPositionWScaleNV = (glViewportPositionWScaleNVPROC)tlsGetFunction(612);
    UNUSED_PARAM(clazz)
    glViewportPositionWScaleNV(index, xcoeff, ycoeff);
}

EXTERN_C_EXIT
