/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "dyncall_callback.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbNewCallback(jlong signatureAddress, jlong funcptrAddress, jlong userdataAddress) {
    char const *signature = (char const *)(intptr_t)signatureAddress;
    DCCallbackHandler *funcptr = (DCCallbackHandler *)(intptr_t)funcptrAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    return (jlong)(intptr_t)dcbNewCallback(signature, funcptr, userdata);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbNewCallback(JNIEnv *__env, jclass clazz, jlong signatureAddress, jlong funcptrAddress, jlong userdataAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbNewCallback(signatureAddress, funcptrAddress, userdataAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbInitCallback(jlong pcbAddress, jlong signatureAddress, jlong handlerAddress, jlong userdataAddress) {
    DCCallback *pcb = (DCCallback *)(intptr_t)pcbAddress;
    char const *signature = (char const *)(intptr_t)signatureAddress;
    DCCallbackHandler *handler = (DCCallbackHandler *)(intptr_t)handlerAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    dcbInitCallback(pcb, signature, handler, userdata);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbInitCallback(JNIEnv *__env, jclass clazz, jlong pcbAddress, jlong signatureAddress, jlong handlerAddress, jlong userdataAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbInitCallback(pcbAddress, signatureAddress, handlerAddress, userdataAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbFreeCallback(jlong pcbAddress) {
    DCCallback *pcb = (DCCallback *)(intptr_t)pcbAddress;
    dcbFreeCallback(pcb);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbFreeCallback(JNIEnv *__env, jclass clazz, jlong pcbAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbFreeCallback(pcbAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbGetUserData(jlong pcbAddress) {
    DCCallback *pcb = (DCCallback *)(intptr_t)pcbAddress;
    return (jlong)(intptr_t)dcbGetUserData(pcb);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbGetUserData(JNIEnv *__env, jclass clazz, jlong pcbAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbGetUserData(pcbAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgBool(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jint)dcbArgBool(args);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgBool(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgBool(argsAddress);
}

JNIEXPORT jbyte JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgChar(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jbyte)dcbArgChar(args);
}
JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgChar(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgChar(argsAddress);
}

JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgShort(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jshort)dcbArgShort(args);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgShort(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgShort(argsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgInt(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jint)dcbArgInt(args);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgInt(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgInt(argsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgLong(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jint)dcbArgLong(args);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgLong(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgLong(argsAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgLongLong(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jlong)dcbArgLongLong(args);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgLongLong(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgLongLong(argsAddress);
}

JNIEXPORT jbyte JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgUChar(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jbyte)dcbArgUChar(args);
}
JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgUChar(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgUChar(argsAddress);
}

JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgUShort(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jshort)dcbArgUShort(args);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgUShort(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgUShort(argsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgUInt(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jint)dcbArgUInt(args);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgUInt(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgUInt(argsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgULong(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jint)dcbArgULong(args);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgULong(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgULong(argsAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgULongLong(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jlong)dcbArgULongLong(args);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgULongLong(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgULongLong(argsAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgFloat(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jfloat)dcbArgFloat(args);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgFloat(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgFloat(argsAddress);
}

JNIEXPORT jdouble JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgDouble(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jdouble)dcbArgDouble(args);
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgDouble(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgDouble(argsAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgPointer(jlong argsAddress) {
    DCArgs *args = (DCArgs *)(intptr_t)argsAddress;
    return (jlong)(intptr_t)dcbArgPointer(args);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_dyncall_DynCallback_ndcbArgPointer(JNIEnv *__env, jclass clazz, jlong argsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_dyncall_DynCallback_ndcbArgPointer(argsAddress);
}

EXTERN_C_EXIT
