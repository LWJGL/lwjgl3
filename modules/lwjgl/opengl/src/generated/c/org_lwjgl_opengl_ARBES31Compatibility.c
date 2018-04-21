/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glMemoryBarrierByRegionPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBES31Compatibility_glMemoryBarrierByRegion(JNIEnv *__env, jclass clazz, jint barriers) {
    glMemoryBarrierByRegionPROC glMemoryBarrierByRegion = (glMemoryBarrierByRegionPROC)tlsGetFunction(1020);
    UNUSED_PARAM(clazz)
    glMemoryBarrierByRegion(barriers);
}

EXTERN_C_EXIT
