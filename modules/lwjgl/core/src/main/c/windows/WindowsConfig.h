/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

#include <stdint.h>

#ifdef __clang__
    #define DISABLE_WARNINGS() \
        _Pragma("GCC diagnostic push") \
        _Pragma("GCC diagnostic ignored \"-Wall\"") \
        _Pragma("GCC diagnostic ignored \"-Wextra\"")
        _Pragma("GCC diagnostic ignored \"-Wunused-value\"")
        _Pragma("GCC diagnostic ignored \"-Wunused-function\"")
        _Pragma("GCC diagnostic ignored \"-Wdeprecated-declarations\"")
        _Pragma("GCC diagnostic ignored \"-Wignored-attributes\"")

    #define ENABLE_WARNINGS() \
        _Pragma("GCC diagnostic pop")
#else
    #define DISABLE_WARNINGS() \
        __pragma(warning(push, 0))

    #define ENABLE_WARNINGS() \
        __pragma(warning(pop))

    #ifndef __cplusplus
        #define inline __forceinline
    #endif
#endif

// JNIEXPORT_CRITICAL & CRITICAL are used as a workaround for JDK-8167409 on applicable functions.
#define JNIEXPORT_CRITICAL JNIEXPORT
#define CRITICAL(function) JavaCritical_##function
