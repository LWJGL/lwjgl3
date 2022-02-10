/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glVertexAttribDivisorNVPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVInstancedArrays_glVertexAttribDivisorNV(JNIEnv *__env, jclass clazz, jint index, jint divisor) {
    glVertexAttribDivisorNVPROC glVertexAttribDivisorNV = (glVertexAttribDivisorNVPROC)tlsGetFunction(675);
    UNUSED_PARAM(clazz)
    glVertexAttribDivisorNV(index, divisor);
}

EXTERN_C_EXIT
