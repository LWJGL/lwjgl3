/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#ifndef __LWJGL_COMMON_TOOLS_H__
#define __LWJGL_COMMON_TOOLS_H__

#include <jni.h>
#include <stdlib.h>
#ifdef LWJGL_WINDOWS
	#include "WindowsConfig.h"
#endif
#ifdef LWJGL_LINUX
	#include "LinuxConfig.h"
#endif
#ifdef LWJGL_MACOSX
	#include "MacOSXConfig.h"
#endif

// getEnv and getThreadEnv should be used when a function is always called by a JVM thread.

// Fastest, uses TLS.
extern JNIEnv *getEnv(void);
// Fast.
extern void getThreadEnv(JNIEnv **);

// Async
extern JNIEnv *attachCurrentThread(void);
extern void detachCurrentThread(void);

// ENTER_ENV / EXIT_ENV should be used when a function may be called by both JVM and non-JVM threads.

#define ENTER_ENV() \
	jboolean async = JNI_FALSE; \
	JNIEnv *env = getEnv(); \
	if ( env == NULL ) { \
		async = JNI_TRUE; \
        env = attachCurrentThread(); \
    }

#define EXIT_ENV() \
	if ( async ) \
		detachCurrentThread();

// ATTACH_THREAD / DETACH_THREAD should be used when a function is always called by a non-JVM thread.

#define ATTACH_THREAD() \
	JNIEnv *env = attachCurrentThread();

#define DETACH_THREAD() \
	detachCurrentThread();

// -----------------------------------------------------

#define CALLBACK_SETUP(CLASS, NAME) \
	JNIEXPORT jlong JNICALL Java_##CLASS##_setCallback(JNIEnv *env, jclass clazz, \
		jobject method \
	) { \
		NAME##Invoke = (*env)->FromReflectedMethod(env, method); \
		return (jlong)(intptr_t)&NAME##Proc; \
	}

#define CALLBACK_SETUP_MULTI(CLASS, NAME, POSTFIX) \
	JNIEXPORT jlong JNICALL Java_##CLASS##_setCallback##POSTFIX(JNIEnv *env, jclass clazz, \
		jobject method \
	) { \
		NAME##POSTFIX##Invoke = (*env)->FromReflectedMethod(env, method); \
		return (jlong)(intptr_t)&NAME##POSTFIX##Proc; \
	}

#endif