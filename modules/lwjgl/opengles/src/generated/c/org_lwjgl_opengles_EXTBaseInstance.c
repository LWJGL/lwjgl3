/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDrawArraysInstancedBaseInstanceEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseInstanceEXTPROC) (jint, jint, jint, uintptr_t, jint, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexBaseInstanceEXTPROC) (jint, jint, jint, uintptr_t, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTBaseInstance_glDrawArraysInstancedBaseInstanceEXT(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint instancecount, jint baseinstance) {
    glDrawArraysInstancedBaseInstanceEXTPROC glDrawArraysInstancedBaseInstanceEXT = (glDrawArraysInstancedBaseInstanceEXTPROC)tlsGetFunction(387);
    UNUSED_PARAM(clazz)
    glDrawArraysInstancedBaseInstanceEXT(mode, first, count, instancecount, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTBaseInstance_nglDrawElementsInstancedBaseInstanceEXT(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount, jint baseinstance) {
    glDrawElementsInstancedBaseInstanceEXTPROC glDrawElementsInstancedBaseInstanceEXT = (glDrawElementsInstancedBaseInstanceEXTPROC)tlsGetFunction(388);
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedBaseInstanceEXT(mode, count, type, indices, instancecount, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTBaseInstance_nglDrawElementsInstancedBaseVertexBaseInstanceEXT(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount, jint basevertex, jint baseinstance) {
    glDrawElementsInstancedBaseVertexBaseInstanceEXTPROC glDrawElementsInstancedBaseVertexBaseInstanceEXT = (glDrawElementsInstancedBaseVertexBaseInstanceEXTPROC)tlsGetFunction(389);
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, count, type, indices, instancecount, basevertex, baseinstance);
}

EXTERN_C_EXIT
