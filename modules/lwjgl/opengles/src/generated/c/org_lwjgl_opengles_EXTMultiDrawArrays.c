/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glMultiDrawArraysEXTPROC) (jint, intptr_t, intptr_t, jint);
typedef void (APIENTRY *glMultiDrawElementsEXTPROC) (jint, intptr_t, jint, intptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiDrawArrays_nglMultiDrawArraysEXT__IJJI(JNIEnv *__env, jclass clazz, jint mode, jlong firstAddress, jlong countAddress, jint primcount) {
    glMultiDrawArraysEXTPROC glMultiDrawArraysEXT = (glMultiDrawArraysEXTPROC)tlsGetFunction(455);
    intptr_t first = (intptr_t)firstAddress;
    intptr_t count = (intptr_t)countAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawArraysEXT(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiDrawArrays_nglMultiDrawElementsEXT__IJIJI(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint primcount) {
    glMultiDrawElementsEXTPROC glMultiDrawElementsEXT = (glMultiDrawElementsEXTPROC)tlsGetFunction(456);
    intptr_t count = (intptr_t)countAddress;
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsEXT(mode, count, type, indices, primcount);
}

EXTERN_C_EXIT
