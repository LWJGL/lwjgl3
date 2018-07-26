/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef intptr_t (APIENTRY *glFenceSyncAPPLEPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsSyncAPPLEPROC) (intptr_t);
typedef void (APIENTRY *glDeleteSyncAPPLEPROC) (intptr_t);
typedef jint (APIENTRY *glClientWaitSyncAPPLEPROC) (intptr_t, jint, jlong);
typedef void (APIENTRY *glWaitSyncAPPLEPROC) (intptr_t, jint, jlong);
typedef void (APIENTRY *glGetInteger64vAPPLEPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetSyncivAPPLEPROC) (intptr_t, jint, jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_APPLESync_glFenceSyncAPPLE(JNIEnv *__env, jclass clazz, jint condition, jint flags) {
    glFenceSyncAPPLEPROC glFenceSyncAPPLE = (glFenceSyncAPPLEPROC)tlsGetFunction(380);
    UNUSED_PARAM(clazz)
    return (jlong)glFenceSyncAPPLE(condition, flags);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_APPLESync_nglIsSyncAPPLE(JNIEnv *__env, jclass clazz, jlong syncAddress) {
    glIsSyncAPPLEPROC glIsSyncAPPLE = (glIsSyncAPPLEPROC)tlsGetFunction(381);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    return (jboolean)glIsSyncAPPLE(sync);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLESync_nglDeleteSyncAPPLE(JNIEnv *__env, jclass clazz, jlong syncAddress) {
    glDeleteSyncAPPLEPROC glDeleteSyncAPPLE = (glDeleteSyncAPPLEPROC)tlsGetFunction(382);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    glDeleteSyncAPPLE(sync);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_APPLESync_nglClientWaitSyncAPPLE(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout) {
    glClientWaitSyncAPPLEPROC glClientWaitSyncAPPLE = (glClientWaitSyncAPPLEPROC)tlsGetFunction(383);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    return (jint)glClientWaitSyncAPPLE(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLESync_nglWaitSyncAPPLE(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout) {
    glWaitSyncAPPLEPROC glWaitSyncAPPLE = (glWaitSyncAPPLEPROC)tlsGetFunction(384);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    glWaitSyncAPPLE(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLESync_nglGetInteger64vAPPLE__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetInteger64vAPPLEPROC glGetInteger64vAPPLE = (glGetInteger64vAPPLEPROC)tlsGetFunction(385);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetInteger64vAPPLE(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_APPLESync_nglGetSyncivAPPLE__JIIJJ(JNIEnv *__env, jclass clazz, jlong syncAddress, jint pname, jint bufSize, jlong lengthAddress, jlong valuesAddress) {
    glGetSyncivAPPLEPROC glGetSyncivAPPLE = (glGetSyncivAPPLEPROC)tlsGetFunction(386);
    intptr_t sync = (intptr_t)syncAddress;
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetSyncivAPPLE(sync, pname, bufSize, length, values);
}

EXTERN_C_EXIT
