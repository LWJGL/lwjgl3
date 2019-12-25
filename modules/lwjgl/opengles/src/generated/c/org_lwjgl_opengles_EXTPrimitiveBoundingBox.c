/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glPrimitiveBoundingBoxEXTPROC) (jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTPrimitiveBoundingBox_glPrimitiveBoundingBoxEXT(JNIEnv *__env, jclass clazz, jfloat minX, jfloat minY, jfloat minZ, jfloat minW, jfloat maxX, jfloat maxY, jfloat maxZ, jfloat maxW) {
    glPrimitiveBoundingBoxEXTPROC glPrimitiveBoundingBoxEXT = (glPrimitiveBoundingBoxEXTPROC)tlsGetFunction(473);
    UNUSED_PARAM(clazz)
    glPrimitiveBoundingBoxEXT(minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
}

EXTERN_C_EXIT
