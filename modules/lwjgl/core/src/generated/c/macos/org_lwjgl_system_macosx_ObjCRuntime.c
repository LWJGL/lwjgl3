/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <objc/objc-runtime.h>

typedef struct objc_method_description (*protocol_getMethodDescriptionPROC) (uintptr_t, uintptr_t, jboolean, jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_ObjCRuntime_nprotocol_1getMethodDescription(JNIEnv *__env, jclass clazz, jlong pAddress, jlong aSelAddress, jboolean isRequiredMethod, jboolean isInstanceMethod, jlong __functionAddress, jlong __result) {
    protocol_getMethodDescriptionPROC protocol_getMethodDescription = (protocol_getMethodDescriptionPROC)(uintptr_t)__functionAddress;
    uintptr_t p = (uintptr_t)pAddress;
    uintptr_t aSel = (uintptr_t)aSelAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct objc_method_description*)(uintptr_t)__result) = protocol_getMethodDescription(p, aSel, isRequiredMethod, isInstanceMethod);
}

EXTERN_C_EXIT
