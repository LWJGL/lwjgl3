/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDrawArraysInstancedNVPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glDrawElementsInstancedNVPROC) (jint, jint, jint, uintptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVDrawInstanced_glDrawArraysInstancedNV(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint primcount) {
    glDrawArraysInstancedNVPROC glDrawArraysInstancedNV = (glDrawArraysInstancedNVPROC)tlsGetFunction(621);
    UNUSED_PARAM(clazz)
    glDrawArraysInstancedNV(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVDrawInstanced_nglDrawElementsInstancedNV(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount) {
    glDrawElementsInstancedNVPROC glDrawElementsInstancedNV = (glDrawElementsInstancedNVPROC)tlsGetFunction(622);
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedNV(mode, count, type, indices, primcount);
}

EXTERN_C_EXIT
