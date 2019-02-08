/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#define RMT_USE_OPENGL 1
#define RMT_ASSUME_LITTLE_ENDIAN 1
#ifdef LWJGL_LINUX
    #define RMT_USE_POSIX_THREADNAMES 1
#elif LWJGL_MACOS
    #define RMT_USE_METAL 1
#endif
#include "Remotery.c"
#ifdef LWJGL_MACOS
    #include "RemoteryMetal.mm"
#endif
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1Settings(void) {
    return (jlong)(intptr_t)rmt_Settings();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1Settings(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1Settings();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1CreateGlobalInstance(jlong remoteryAddress) {
    Remotery **remotery = (Remotery **)(intptr_t)remoteryAddress;
    return (jint)rmt_CreateGlobalInstance(remotery);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1CreateGlobalInstance(JNIEnv *__env, jclass clazz, jlong remoteryAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1CreateGlobalInstance(remoteryAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1DestroyGlobalInstance(jlong remoteryAddress) {
    Remotery *remotery = (Remotery *)(intptr_t)remoteryAddress;
    rmt_DestroyGlobalInstance(remotery);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1DestroyGlobalInstance(JNIEnv *__env, jclass clazz, jlong remoteryAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1DestroyGlobalInstance(remoteryAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1SetGlobalInstance(jlong remoteryAddress) {
    Remotery *remotery = (Remotery *)(intptr_t)remoteryAddress;
    rmt_SetGlobalInstance(remotery);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SetGlobalInstance(JNIEnv *__env, jclass clazz, jlong remoteryAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1SetGlobalInstance(remoteryAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_remotery_Remotery_rmt_1GetGlobalInstance(void) {
    return (jlong)(intptr_t)rmt_GetGlobalInstance();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_rmt_1GetGlobalInstance(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_remotery_Remotery_rmt_1GetGlobalInstance();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1SetCurrentThreadName(jlong thread_nameAddress) {
    rmtPStr thread_name = (rmtPStr)(intptr_t)thread_nameAddress;
    rmt_SetCurrentThreadName(thread_name);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SetCurrentThreadName(JNIEnv *__env, jclass clazz, jlong thread_nameAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1SetCurrentThreadName(thread_nameAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1LogText(jlong textAddress) {
    rmtPStr text = (rmtPStr)(intptr_t)textAddress;
    rmt_LogText(text);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1LogText(JNIEnv *__env, jclass clazz, jlong textAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1LogText(textAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1BeginCPUSample__JIJ(jlong nameAddress, jint flags, jlong hash_cacheAddress) {
    rmtPStr name = (rmtPStr)(intptr_t)nameAddress;
    rmtU32 *hash_cache = (rmtU32 *)(intptr_t)hash_cacheAddress;
    _rmt_BeginCPUSample(name, flags, hash_cache);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1BeginCPUSample__JIJ(JNIEnv *__env, jclass clazz, jlong nameAddress, jint flags, jlong hash_cacheAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_remotery_Remotery_nrmt_1BeginCPUSample__JIJ(nameAddress, flags, hash_cacheAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_remotery_Remotery_rmt_1EndCPUSample(void) {
    rmt_EndCPUSample();
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_rmt_1EndCPUSample(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_remotery_Remotery_rmt_1EndCPUSample();
}

EXTERN_C_EXIT
