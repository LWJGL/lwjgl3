/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glPolygonOffsetClampPROC) (jfloat, jfloat, jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBPolygonOffsetClamp_glPolygonOffsetClamp(JNIEnv *__env, jclass clazz, jfloat factor, jfloat units, jfloat clamp) {
    glPolygonOffsetClampPROC glPolygonOffsetClamp = (glPolygonOffsetClampPROC)tlsGetFunction(1046);
    UNUSED_PARAM(clazz)
    glPolygonOffsetClamp(factor, units, clamp);
}

EXTERN_C_EXIT
