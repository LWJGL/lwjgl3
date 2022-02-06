/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef uintptr_t (APIENTRY *glCreateSyncFromCLeventARBPROC) (uintptr_t, uintptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBCLEvent_nglCreateSyncFromCLeventARB(JNIEnv *__env, jclass clazz, jlong contextAddress, jlong eventAddress, jint flags) {
    glCreateSyncFromCLeventARBPROC glCreateSyncFromCLeventARB = (glCreateSyncFromCLeventARBPROC)tlsGetFunction(1128);
    uintptr_t context = (uintptr_t)contextAddress;
    uintptr_t event = (uintptr_t)eventAddress;
    UNUSED_PARAM(clazz)
    return (jlong)glCreateSyncFromCLeventARB(context, event, flags);
}

EXTERN_C_EXIT
