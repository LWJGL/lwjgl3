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

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_RemoteryGL_rmt_1BindOpenGL(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rmt_BindOpenGL();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_RemoteryGL_rmt_1UnbindOpenGL(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rmt_UnbindOpenGL();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_RemoteryGL_nrmt_1BeginOpenGLSample(JNIEnv *__env, jclass clazz, jlong nameAddress, jlong hash_cacheAddress) {
    rmtPStr name = (rmtPStr)(intptr_t)nameAddress;
    rmtU32 *hash_cache = (rmtU32 *)(intptr_t)hash_cacheAddress;
    UNUSED_PARAMS(__env, clazz)
    _rmt_BeginOpenGLSample(name, hash_cache);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_RemoteryGL_rmt_1EndOpenGLSample(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rmt_EndOpenGLSample();
}

EXTERN_C_EXIT
