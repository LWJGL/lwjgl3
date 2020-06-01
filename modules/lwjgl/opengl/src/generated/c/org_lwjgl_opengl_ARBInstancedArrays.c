/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glVertexAttribDivisorARBPROC) (jint, jint);
typedef void (APIENTRY *glVertexArrayVertexAttribDivisorEXTPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBInstancedArrays_glVertexAttribDivisorARB(JNIEnv *__env, jclass clazz, jint index, jint divisor) {
    glVertexAttribDivisorARBPROC glVertexAttribDivisorARB = (glVertexAttribDivisorARBPROC)tlsGetFunction(1239);
    UNUSED_PARAM(clazz)
    glVertexAttribDivisorARB(index, divisor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBInstancedArrays_glVertexArrayVertexAttribDivisorEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint divisor) {
    glVertexArrayVertexAttribDivisorEXTPROC glVertexArrayVertexAttribDivisorEXT = (glVertexArrayVertexAttribDivisorEXTPROC)tlsGetFunction(1240);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexAttribDivisorEXT(vaobj, index, divisor);
}

EXTERN_C_EXIT
