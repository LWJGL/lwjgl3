/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glPrimitiveBoundingBoxOESPROC) (jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESPrimitiveBoundingBox_glPrimitiveBoundingBoxOES(JNIEnv *__env, jclass clazz, jfloat minX, jfloat minY, jfloat minZ, jfloat minW, jfloat maxX, jfloat maxY, jfloat maxZ, jfloat maxW) {
    glPrimitiveBoundingBoxOESPROC glPrimitiveBoundingBoxOES = (glPrimitiveBoundingBoxOESPROC)tlsGetFunction(804);
    UNUSED_PARAM(clazz)
    glPrimitiveBoundingBoxOES(minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
}

EXTERN_C_EXIT
