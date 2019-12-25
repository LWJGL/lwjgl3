/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTexPageCommitmentARBPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSparseTexture_glTexPageCommitmentARB(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jboolean commit) {
    glTexPageCommitmentARBPROC glTexPageCommitmentARB = (glTexPageCommitmentARBPROC)tlsGetFunction(537);
    UNUSED_PARAM(clazz)
    glTexPageCommitmentARB(target, level, xoffset, yoffset, zoffset, width, height, depth, commit);
}

EXTERN_C_EXIT
