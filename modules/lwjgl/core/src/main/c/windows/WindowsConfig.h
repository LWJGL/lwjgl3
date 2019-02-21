/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

#define DISABLE_WARNINGS() \
    __pragma(warning(push, 0))

#define ENABLE_WARNINGS() \
    __pragma(warning(pop))

#ifndef __cplusplus
    #define inline __forceinline
#endif

// JNIEXPORT_CRITICAL & CRITICAL are used as a workaround for JDK-8167409 on applicable functions.
#define JNIEXPORT_CRITICAL JNIEXPORT
#define CRITICAL(function) JavaCritical_##function
