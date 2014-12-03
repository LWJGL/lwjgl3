/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#ifndef __LWJGL_COMMON_TOOLS_H__
#define __LWJGL_COMMON_TOOLS_H__

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
#include <stdlib.h>
ENABLE_WARNINGS()

// Cached JNIEnv, using TLS. Will use attachCurrentThreadAsDaemon in foreign threads.
extern JNIEnv *getEnv(void);

// Sync
extern JNIEnv *getThreadEnv(void);

// Async
extern JNIEnv *attachCurrentThread(void);
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

#endif
