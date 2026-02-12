/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef jint (APIENTRY *glObjectPurgeableAPPLEPROC) (jint, jint, jint);
typedef jint (APIENTRY *glObjectUnpurgeableAPPLEPROC) (jint, jint, jint);
typedef void (APIENTRY *glGetObjectParameterivAPPLEPROC) (jint, jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_APPLEObjectPurgeable_glObjectPurgeableAPPLE(JNIEnv *__env, jclass clazz, jint objectType, jint name, jint option) {
    glObjectPurgeableAPPLEPROC glObjectPurgeableAPPLE = (glObjectPurgeableAPPLEPROC)tlsGetFunction(1126);
    UNUSED_PARAM(clazz)
    return glObjectPurgeableAPPLE(objectType, name, option);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_APPLEObjectPurgeable_glObjectUnpurgeableAPPLE(JNIEnv *__env, jclass clazz, jint objectType, jint name, jint option) {
    glObjectUnpurgeableAPPLEPROC glObjectUnpurgeableAPPLE = (glObjectUnpurgeableAPPLEPROC)tlsGetFunction(1127);
    UNUSED_PARAM(clazz)
    return glObjectUnpurgeableAPPLE(objectType, name, option);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEObjectPurgeable_nglGetObjectParameterivAPPLE__IIIJ(JNIEnv *__env, jclass clazz, jint objectType, jint name, jint pname, jlong paramsAddress) {
    glGetObjectParameterivAPPLEPROC glGetObjectParameterivAPPLE = (glGetObjectParameterivAPPLEPROC)tlsGetFunction(1128);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetObjectParameterivAPPLE(objectType, name, pname, params);
}

EXTERN_C_EXIT
