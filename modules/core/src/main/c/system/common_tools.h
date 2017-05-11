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
#ifdef LWJGL_MACOSX
    #include "MacOSXConfig.h"
#endif

#ifndef DISABLE_WARNINGS
    #define DISABLE_WARNINGS()
#endif
#ifndef ENABLE_WARNINGS
    #define ENABLE_WARNINGS()
#endif

DISABLE_WARNINGS()
#include <jni.h>
ENABLE_WARNINGS()

// Cached JNIEnv, using TLS. Will use attachCurrentThreadAsDaemon in foreign threads.
extern JNIEnv *getEnv(jboolean *);
extern void saveErrno(void);
extern jint getErrno(void);
#ifdef LWJGL_WINDOWS
    extern void saveLastError(void);
    extern jint getLastError(void);

    #define VA_LIST_CAST &(va_list)
#else
    #define VA_LIST_CAST (va_list *)
#endif

// Sync
extern JNIEnv *getThreadEnv(void);

// Async
extern JNIEnv *attachCurrentThreadAsDaemon(void);
extern void detachCurrentThread(void);

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
