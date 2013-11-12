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

extern jmethodID getDeclaringClass;

#define DECLARE_CALLBACK(NAME) \
	static jmethodID NAME##Invoke;

#define DECLARE_CALLBACK_STATIC(NAME) \
	static jclass NAME##Class; \
	DECLARE_CALLBACK(NAME)

#define CALLBACK_SETUP(CLASS, NAME) \
	EXTERN_C_ENTER \
	JNIEXPORT jlong JNICALL Java_##CLASS##_00024Util_setCallback(JNIEnv *env, jclass clazz, jobject method) { \
		UNUSED_PARAM(clazz) \
		NAME##Invoke = (*env)->FromReflectedMethod(env, method); \
		return (jlong)(intptr_t)&NAME##Proc; \
	} \
	EXTERN_C_EXIT

#define CALLBACK_SETUP_MULTI(CLASS, NAME, POSTFIX) \
	EXTERN_C_ENTER \
	JNIEXPORT jlong JNICALL Java_##CLASS##_00024Util_setCallback##POSTFIX(JNIEnv *env, jclass clazz, jobject method) { \
		UNUSED_PARAM(clazz) \
		NAME##POSTFIX##Invoke = (*env)->FromReflectedMethod(env, method); \
		return (jlong)(intptr_t)&NAME##POSTFIX##Proc; \
	} \
	EXTERN_C_EXIT

#define CALLBACK_SETUP_STATIC(CLASS, NAME) \
	EXTERN_C_ENTER \
	JNIEXPORT jlong JNICALL Java_##CLASS##_00024Util_setCallback(JNIEnv *env, jclass clazz, jobject method) { \
		jclass Method = (*env)->FindClass(env, "java/lang/reflect/Method"); \
		jmethodID getDeclaringClass = (*env)->GetMethodID(env, Method, "getDeclaringClass", "()Ljava/lang/Class;"); \
		UNUSED_PARAM(clazz) \
		NAME##Class = (*env)->CallObjectMethod(env, method, getDeclaringClass); \
		NAME##Invoke = (*env)->FromReflectedMethod(env, method); \
		return (jlong)(intptr_t)&NAME##Proc; \
	} \
	EXTERN_C_EXIT

#define CALLBACK_SETUP_STATIC_MULTI(CLASS, NAME, POSTFIX) \
	EXTERN_C_ENTER \
	JNIEXPORT jlong JNICALL Java_##CLASS##_00024Util_setCallback##POSTFIX(JNIEnv *env, jclass clazz, jobject method) { \
		jclass Method = (*env)->FindClass(env, "java/lang/reflect/Method"); \
		jmethodID getDeclaringClass = (*env)->GetMethodID(env, Method, "getDeclaringClass", "()Ljava/lang/Class;"); \
		UNUSED_PARAM(clazz) \
		NAME##POSTFIX##Class = (*env)->CallObjectMethod(env, method, getDeclaringClass); \
		NAME##POSTFIX##Invoke = (*env)->FromReflectedMethod(env, method); \
		return (jlong)(intptr_t)&NAME##POSTFIX##Proc; \
	} \
	EXTERN_C_EXIT

#endif
