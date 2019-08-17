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
#include "Remotery.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_RemoteryMetal_nrmt_1BindMetal(JNIEnv *__env, jclass clazz, jlong command_bufferAddress) {
    id command_buffer = (id)(intptr_t)command_bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_BindMetal(command_buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_RemoteryMetal_rmt_1UnbindMetal(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rmt_UnbindMetal();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_RemoteryMetal_nrmt_1BeginMetalSample(JNIEnv *__env, jclass clazz, jlong nameAddress, jlong hash_cacheAddress) {
    rmtPStr name = (rmtPStr)(intptr_t)nameAddress;
    rmtU32 *hash_cache = (rmtU32 *)(intptr_t)hash_cacheAddress;
    UNUSED_PARAMS(__env, clazz)
    _rmt_BeginMetalSample(name, hash_cache);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_RemoteryMetal_rmt_1EndMetalSample(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rmt_EndMetalSample();
}

EXTERN_C_EXIT
