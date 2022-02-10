/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glPolygonModeNVPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVPolygonMode_glPolygonModeNV(JNIEnv *__env, jclass clazz, jint face, jint mode) {
    glPolygonModeNVPROC glPolygonModeNV = (glPolygonModeNVPROC)tlsGetFunction(753);
    UNUSED_PARAM(clazz)
    glPolygonModeNV(face, mode);
}

EXTERN_C_EXIT
