/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glStartTilingQCOMPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glEndTilingQCOMPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMTiledRendering_glStartTilingQCOM(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint preserveMask) {
    glStartTilingQCOMPROC glStartTilingQCOM = (glStartTilingQCOMPROC)tlsGetFunction(864);
    UNUSED_PARAM(clazz)
    glStartTilingQCOM(x, y, width, height, preserveMask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMTiledRendering_glEndTilingQCOM(JNIEnv *__env, jclass clazz, jint preserveMask) {
    glEndTilingQCOMPROC glEndTilingQCOM = (glEndTilingQCOMPROC)tlsGetFunction(865);
    UNUSED_PARAM(clazz)
    glEndTilingQCOM(preserveMask);
}

EXTERN_C_EXIT
