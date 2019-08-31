/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "dyncall_callback.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbNewCallback(JNIEnv *__env, jclass clazz, jlong signatureAddress, jlong funcptrAddress, jlong userdataAddress) {
    char const *signature = (char const *)(intptr_t)signatureAddress;
    DCCallbackHandler *funcptr = (DCCallbackHandler *)(intptr_t)funcptrAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dcbNewCallback(signature, funcptr, userdata);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbInitCallback(JNIEnv *__env, jclass clazz, jlong pcbAddress, jlong signatureAddress, jlong handlerAddress, jlong userdataAddress) {
    DCCallback *pcb = (DCCallback *)(intptr_t)pcbAddress;
    char const *signature = (char const *)(intptr_t)signatureAddress;
    DCCallbackHandler *handler = (DCCallbackHandler *)(intptr_t)handlerAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    UNUSED_PARAMS(__env, clazz)
    dcbInitCallback(pcb, signature, handler, userdata);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbFreeCallback(JNIEnv *__env, jclass clazz, jlong pcbAddress) {
    DCCallback *pcb = (DCCallback *)(intptr_t)pcbAddress;
    UNUSED_PARAMS(__env, clazz)
    dcbFreeCallback(pcb);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbGetUserData(JNIEnv *__env, jclass clazz, jlong pcbAddress) {
    DCCallback *pcb = (DCCallback *)(intptr_t)pcbAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dcbGetUserData(pcb);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgBool(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)dcbArgBool(args);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgChar(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jbyte)dcbArgChar(args);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgShort(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jshort)dcbArgShort(args);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgInt(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)dcbArgInt(args);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgLong(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)dcbArgLong(args);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgLongLong(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)dcbArgLongLong(args);
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgUChar(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jbyte)dcbArgUChar(args);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgUShort(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jshort)dcbArgUShort(args);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgUInt(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)dcbArgUInt(args);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgULong(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)dcbArgULong(args);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgULongLong(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)dcbArgULongLong(args);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgFloat(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)dcbArgFloat(args);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgDouble(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jdouble)dcbArgDouble(args);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgPointer(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dcbArgPointer(args);
}

EXTERN_C_EXIT
