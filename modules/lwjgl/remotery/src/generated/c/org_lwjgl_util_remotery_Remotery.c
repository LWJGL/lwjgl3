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

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1Settings(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)rmt_Settings();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1CreateGlobalInstance(JNIEnv *__env, jclass clazz, jlong remoteryAddress) {
    Remotery **remotery = (Remotery **)(intptr_t)remoteryAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)rmt_CreateGlobalInstance(remotery);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1DestroyGlobalInstance(JNIEnv *__env, jclass clazz, jlong remoteryAddress) {
    Remotery *remotery = (Remotery *)(intptr_t)remoteryAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_DestroyGlobalInstance(remotery);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SetGlobalInstance(JNIEnv *__env, jclass clazz, jlong remoteryAddress) {
    Remotery *remotery = (Remotery *)(intptr_t)remoteryAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_SetGlobalInstance(remotery);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_rmt_1GetGlobalInstance(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)rmt_GetGlobalInstance();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SetCurrentThreadName(JNIEnv *__env, jclass clazz, jlong thread_nameAddress) {
    rmtPStr thread_name = (rmtPStr)(intptr_t)thread_nameAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_SetCurrentThreadName(thread_name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1LogText(JNIEnv *__env, jclass clazz, jlong textAddress) {
    rmtPStr text = (rmtPStr)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_LogText(text);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1BeginCPUSample(JNIEnv *__env, jclass clazz, jlong nameAddress, jint flags, jlong hash_cacheAddress) {
    rmtPStr name = (rmtPStr)(intptr_t)nameAddress;
    rmtU32 *hash_cache = (rmtU32 *)(intptr_t)hash_cacheAddress;
    UNUSED_PARAMS(__env, clazz)
    _rmt_BeginCPUSample(name, flags, hash_cache);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_rmt_1EndCPUSample(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rmt_EndCPUSample();
}

EXTERN_C_EXIT
