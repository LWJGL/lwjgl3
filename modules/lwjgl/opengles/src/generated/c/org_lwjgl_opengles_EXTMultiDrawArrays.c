/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glMultiDrawArraysEXTPROC) (jint, uintptr_t, uintptr_t, jint);
typedef void (APIENTRY *glMultiDrawElementsEXTPROC) (jint, uintptr_t, jint, uintptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiDrawArrays_nglMultiDrawArraysEXT__IJJI(JNIEnv *__env, jclass clazz, jint mode, jlong firstAddress, jlong countAddress, jint drawcount) {
    glMultiDrawArraysEXTPROC glMultiDrawArraysEXT = (glMultiDrawArraysEXTPROC)tlsGetFunction(463);
    uintptr_t first = (uintptr_t)firstAddress;
    uintptr_t count = (uintptr_t)countAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawArraysEXT(mode, first, count, drawcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiDrawArrays_nglMultiDrawElementsEXT__IJIJI(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint drawcount) {
    glMultiDrawElementsEXTPROC glMultiDrawElementsEXT = (glMultiDrawElementsEXTPROC)tlsGetFunction(464);
    uintptr_t count = (uintptr_t)countAddress;
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsEXT(mode, count, type, indices, drawcount);
}

EXTERN_C_EXIT
