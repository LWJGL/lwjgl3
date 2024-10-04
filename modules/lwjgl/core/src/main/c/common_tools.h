/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#pragma once

#ifdef LWJGL_FREEBSD
    #include "FreeBSDConfig.h"
#endif
#ifdef LWJGL_LINUX
    #include "LinuxConfig.h"
#endif
#ifdef LWJGL_MACOS
    #include "macOSConfig.h"
#endif
#ifdef LWJGL_WINDOWS
    #include "WindowsConfig.h"
#endif

DISABLE_WARNINGS()
#include <jni.h>
#include <stdlib.h>
#include <stdio.h>
ENABLE_WARNINGS()

// Per-thread data, stored in a platform-specific thread-local.
// Present in threads that had Callback invocations or OpenGL(ES) contexts made current.
// Clean up is automatic via DllMain notifications (on Windows) or pthread destructors (on Linux/OSX).
typedef struct EnvData_ {
    // true if AttachCurrentThreadAsDaemon was used to attach to a foreign thread (on a callback invocation).
    jboolean async;
    char padding[sizeof(void *) - sizeof(jboolean)];
    // Cached JNIEnv* for the current thread. Faster than calling jvm->GetEnv.
    // NOTE: points to JavaThread::_jni_environment (jdk/src/hotspot/share/runtime/thread.hpp), which is itself a pointer to the JNINativeInterface struct.
    JNIEnv* env;
    // The JNIEnv copy for the current thread.
    // Not NULL in threads where an OpenGL(ES) context has been made current.
    //   * env->reserved3 points to the GL(ES)Capabilities function array.
    // This enables access to thread-local data without a TL lookup.
    // NOTE: Stored separately instead of dereferencing env, because JavaThread instances may already be corrupted on thread detach.
    JNIEnv envCopy;
} EnvData;

// Cached JNIEnv, using TLS. Will use attachCurrentThreadAsDaemon in foreign threads.
extern JNIEnv* getEnv(jboolean* async);

#if defined(LWJGL_WINDOWS) || (defined(LWJGL_MACOS) && defined(LWJGL_arm64))
    #define VA_LIST_CAST(param) (va_list)(uintptr_t)param##Address
#else
    #define VA_LIST_CAST(param) *(va_list *)(uintptr_t)param##Address
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
