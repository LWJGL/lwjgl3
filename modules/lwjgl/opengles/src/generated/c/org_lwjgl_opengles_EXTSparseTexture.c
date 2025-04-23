/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTexPageCommitmentEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSparseTexture_glTexPageCommitmentEXT(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jboolean commit) {
    glTexPageCommitmentEXTPROC glTexPageCommitmentEXT = (glTexPageCommitmentEXTPROC)tlsGetFunction(543);
    UNUSED_PARAM(clazz)
    glTexPageCommitmentEXT(target, level, xoffset, yoffset, zoffset, width, height, depth, commit);
}

EXTERN_C_EXIT
