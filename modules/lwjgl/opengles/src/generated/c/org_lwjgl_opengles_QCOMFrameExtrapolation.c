/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glExtrapolateTex2DQCOMPROC) (jint, jint, jint, jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMFrameExtrapolation_glExtrapolateTex2DQCOM(JNIEnv *__env, jclass clazz, jint src1, jint src2, jint output, jfloat scaleFactor) {
    glExtrapolateTex2DQCOMPROC glExtrapolateTex2DQCOM = (glExtrapolateTex2DQCOMPROC)tlsGetFunction(857);
    UNUSED_PARAM(clazz)
    glExtrapolateTex2DQCOM(src1, src2, output, scaleFactor);
}

EXTERN_C_EXIT
