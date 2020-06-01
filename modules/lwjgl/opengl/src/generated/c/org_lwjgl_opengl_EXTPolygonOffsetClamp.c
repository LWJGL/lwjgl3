/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glPolygonOffsetClampEXTPROC) (jfloat, jfloat, jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTPolygonOffsetClamp_glPolygonOffsetClampEXT(JNIEnv *__env, jclass clazz, jfloat factor, jfloat units, jfloat clamp) {
    glPolygonOffsetClampEXTPROC glPolygonOffsetClampEXT = (glPolygonOffsetClampEXTPROC)tlsGetFunction(1815);
    UNUSED_PARAM(clazz)
    glPolygonOffsetClampEXT(factor, units, clamp);
}

EXTERN_C_EXIT
