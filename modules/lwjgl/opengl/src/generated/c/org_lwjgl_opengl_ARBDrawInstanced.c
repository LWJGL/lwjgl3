/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDrawArraysInstancedARBPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glDrawElementsInstancedARBPROC) (jint, jint, jint, uintptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawInstanced_glDrawArraysInstancedARB(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint primcount) {
    glDrawArraysInstancedARBPROC glDrawArraysInstancedARB = (glDrawArraysInstancedARBPROC)tlsGetFunction(1142);
    UNUSED_PARAM(clazz)
    glDrawArraysInstancedARB(mode, first, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawInstanced_nglDrawElementsInstancedARB(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount) {
    glDrawElementsInstancedARBPROC glDrawElementsInstancedARB = (glDrawElementsInstancedARBPROC)tlsGetFunction(1143);
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedARB(mode, count, type, indices, primcount);
}

EXTERN_C_EXIT
