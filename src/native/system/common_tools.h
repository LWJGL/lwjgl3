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

// Cached JNIEnv, using TLS. Will use attachCurrentThreadAsDaemon in foreign threads.
extern JNIEnv *getEnv(void);

// Sync
extern JNIEnv *getThreadEnv(void);

// Async
extern JNIEnv *attachCurrentThread(void);
extern JNIEnv *attachCurrentThreadAsDaemon(void);
extern void detachCurrentThread(void);

// -----------------------------------------------------

extern jmethodID getDeclaringClass;

#define DECLARE_CALLBACK(NAME) \
	static jmethodID NAME##Invoke;

#define DECLARE_CALLBACK_STATIC(NAME) \
	static jclass NAME##Class; \
	DECLARE_CALLBACK(NAME)

#define CALLBACK_SETUP(CLASS, NAME) \
	JNIEXPORT jlong JNICALL Java_##CLASS##_00024Util_setCallback(JNIEnv *env, jclass clazz, jobject method) { \
		NAME##Invoke = (*env)->FromReflectedMethod(env, method); \
		return (jlong)(intptr_t)&NAME##Proc; \
	}

#define CALLBACK_SETUP_MULTI(CLASS, NAME, POSTFIX) \
	JNIEXPORT jlong JNICALL Java_##CLASS##_00024Util_setCallback##POSTFIX(JNIEnv *env, jclass clazz, jobject method) { \
		NAME##POSTFIX##Invoke = (*env)->FromReflectedMethod(env, method); \
		return (jlong)(intptr_t)&NAME##POSTFIX##Proc; \
	}

#define CALLBACK_SETUP_STATIC(CLASS, NAME) \
	JNIEXPORT jlong JNICALL Java_##CLASS##_00024Util_setCallback(JNIEnv *env, jclass clazz, jobject method) { \
		NAME##Class = (*env)->CallObjectMethod(env, method, getDeclaringClass); \
		NAME##Invoke = (*env)->FromReflectedMethod(env, method); \
		return (jlong)(intptr_t)&NAME##Proc; \
	}

#define CALLBACK_SETUP_STATIC_MULTI(CLASS, NAME, POSTFIX) \
	JNIEXPORT jlong JNICALL Java_##CLASS##_00024Util_setCallback##POSTFIX(JNIEnv *env, jclass clazz, jobject method) { \
		NAME##POSTFIX##Class = (*env)->CallObjectMethod(env, method, getDeclaringClass); \
		NAME##POSTFIX##Invoke = (*env)->FromReflectedMethod(env, method); \
		return (jlong)(intptr_t)&NAME##POSTFIX##Proc; \
	}

#endif