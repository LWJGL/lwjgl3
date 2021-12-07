/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#pragma once

#ifdef LWJGL_WINDOWS
    #include "WindowsConfig.h"
#endif
#ifdef LWJGL_LINUX
    #include "LinuxConfig.h"
#endif
#ifdef LWJGL_MACOS
    #include "macOSConfig.h"
#endif

DISABLE_WARNINGS()
#include <jni.h>
#include <stdlib.h>
#include <stdio.h>
ENABLE_WARNINGS()

// Per-thread data, stored in a platform-specific thread-local.
// Present in threads that had Callback invocations, saveErrno/saveLastError calls, OpenGL(ES) contexts made current.
// Clean up is automatic via DllMain notifications (on Windows) or pthread destructors (on Linux/OSX).
typedef struct EnvData_ {
    // true if AttachCurrentThreadAsDaemon was used to attach to a foreign thread (on a callback invocation).
    jboolean async;
    char padding[sizeof(void *) - sizeof(jboolean)];
    // Cached JNIEnv* for the current thread. Faster than calling jvm->GetEnv.
    // NOTE: points to JavaThread::_jni_environment (jdk/src/hotspot/share/runtime/thread.hpp), which is itself a pointer to the JNINativeInterface struct.
    JNIEnv* env;
    // The JNIEnv copy for the current thread.
    // Not NULL in threads where saveErrno/saveLastError has been called, or an OpenGL(ES) context has been made current.
    //   * env->reserved2 points to this EnvData instance.
    //   * env->reserved3 may point to the GL(ES)Capabilities function array.
    // The above two enable access to thread-local data without a TL lookup.
    // NOTE: Stored separately instead of dereferencing env, because JavaThread instances may already be corrupted on thread detach.
    JNIEnv envCopy;
    // errno for the current thread. Must be stored before a JNI function returns (may change between JNI method calls).
    jint errnum;
#ifdef LWJGL_WINDOWS
    // GetLastError() for the current thread. Must be stored before a JNI function returns (may change between JNI method calls).
    jint LastError;
#endif
} EnvData;

// Cached JNIEnv, using TLS. Will use attachCurrentThreadAsDaemon in foreign threads.
extern JNIEnv* getEnv(jboolean* async);

// Upcalls are used to create EnvData, because these macros will be used in non-core modules too.
/*
 * method (any module)                                             -> ThreadLocalUtil::setupEnvData upcall (core module)
 *  \                                                             /                                       \
 *   -> nfunction downcall (any module) -> saveErrno/saveLastError                                         -> nsetupEnvData downcall (core module)
 */
#define saveErrno() \
    jint errnum = errno; \
    EnvData *envData = (EnvData *)(*__env)->reserved2; \
    if (envData == NULL) { \
        jclass TLU = (*__env)->FindClass(__env, "org/lwjgl/system/ThreadLocalUtil"); \
        envData = (EnvData *)(uintptr_t)(*__env)->CallStaticLongMethod(__env, TLU, (*__env)->GetStaticMethodID(__env, TLU, "setupEnvData", "()J")); \
    } \
    envData->errnum = errnum;

#ifdef LWJGL_WINDOWS
    #define saveLastError() \
        jint LastError = (jint)GetLastError(); \
        EnvData *envData = (EnvData *)(*__env)->reserved2; \
        if (envData == NULL) { \
            jclass TLU = (*__env)->FindClass(__env, "org/lwjgl/system/ThreadLocalUtil"); \
            envData = (EnvData *)(uintptr_t)(*__env)->CallStaticLongMethod(__env, TLU, (*__env)->GetStaticMethodID(__env, TLU, "setupEnvData", "()J")); \
        } \
        envData->LastError = LastError;

    #define VA_LIST_CAST &(va_list)
#else
    #define VA_LIST_CAST (va_list *)
#endif

// -----------------------------------------------------

#ifdef __cplusplus
    #define EXTERN_C_ENTER extern "C" {
    #define EXTERN_C_EXIT }
#else
    #define EXTERN_C_ENTER
    #define EXTERN_C_EXIT
#endif

// -----------------------------------------------------

#define UNUSED_PARAM(param) \
    (void)(param);

#define UNUSED_PARAMS(a, b) \
    (void)(a); \
    (void)(b);

// -----------------------------------------------------
