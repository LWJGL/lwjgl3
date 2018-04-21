/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef intptr_t (APIENTRY *glFenceSyncPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsSyncPROC) (intptr_t);
typedef void (APIENTRY *glDeleteSyncPROC) (intptr_t);
typedef jint (APIENTRY *glClientWaitSyncPROC) (intptr_t, jint, jlong);
typedef void (APIENTRY *glWaitSyncPROC) (intptr_t, jint, jlong);
typedef void (APIENTRY *glGetInteger64vPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetSyncivPROC) (intptr_t, jint, jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBSync_glFenceSync(JNIEnv *__env, jclass clazz, jint condition, jint flags) {
    glFenceSyncPROC glFenceSync = (glFenceSyncPROC)tlsGetFunction(658);
    UNUSED_PARAM(clazz)
    return (jlong)glFenceSync(condition, flags);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBSync_nglIsSync(JNIEnv *__env, jclass clazz, jlong syncAddress) {
    glIsSyncPROC glIsSync = (glIsSyncPROC)tlsGetFunction(659);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    return (jboolean)glIsSync(sync);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSync_nglDeleteSync(JNIEnv *__env, jclass clazz, jlong syncAddress) {
    glDeleteSyncPROC glDeleteSync = (glDeleteSyncPROC)tlsGetFunction(660);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    glDeleteSync(sync);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBSync_nglClientWaitSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout) {
    glClientWaitSyncPROC glClientWaitSync = (glClientWaitSyncPROC)tlsGetFunction(661);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    return (jint)glClientWaitSync(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSync_nglWaitSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout) {
    glWaitSyncPROC glWaitSync = (glWaitSyncPROC)tlsGetFunction(662);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    glWaitSync(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSync_nglGetInteger64v__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetInteger64vPROC glGetInteger64v = (glGetInteger64vPROC)tlsGetFunction(663);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetInteger64v(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSync_nglGetSynciv__JIIJJ(JNIEnv *__env, jclass clazz, jlong syncAddress, jint pname, jint bufSize, jlong lengthAddress, jlong valuesAddress) {
    glGetSyncivPROC glGetSynciv = (glGetSyncivPROC)tlsGetFunction(665);
    intptr_t sync = (intptr_t)syncAddress;
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetSynciv(sync, pname, bufSize, length, values);
}

EXTERN_C_EXIT
