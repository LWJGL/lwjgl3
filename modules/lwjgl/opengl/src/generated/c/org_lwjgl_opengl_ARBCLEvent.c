/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef intptr_t (APIENTRY *glCreateSyncFromCLeventARBPROC) (intptr_t, intptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBCLEvent_nglCreateSyncFromCLeventARB(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong eventAddress, jint flags) {
    glCreateSyncFromCLeventARBPROC glCreateSyncFromCLeventARB = (glCreateSyncFromCLeventARBPROC)tlsGetFunction(1094);
    intptr_t context = (intptr_t)contextAddress;
    intptr_t event = (intptr_t)eventAddress;
    UNUSED_PARAM(clazz)
    return (jlong)glCreateSyncFromCLeventARB(context, event, flags);
}

EXTERN_C_EXIT
