/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include <string.h>
ENABLE_WARNINGS()

EXTERN_C_ENTER

// memAlloc(J)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_memAlloc(JNIEnv *env, jclass clazz, jlong size)
{
	UNUSED_PARAMS(env, clazz);
	return (jlong)(intptr_t)malloc((size_t)size);
}

// memFree(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_memFree(JNIEnv *env, jclass clazz, jlong ptr)
{
	UNUSED_PARAMS(env, clazz);
	free((void *)(intptr_t)ptr);
}

// memCalloc(JJ)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_memCalloc(JNIEnv *env, jclass clazz, jlong num, jlong size)
{
	UNUSED_PARAMS(env, clazz);
	return (jlong)(intptr_t)calloc((size_t)num, (size_t)size);
}

// memRealloc(JJ)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_memRealloc(JNIEnv *env, jclass clazz, jlong ptr, jlong size)
{
	UNUSED_PARAMS(env, clazz);
	return (jlong)(intptr_t)realloc((void *)(intptr_t)ptr, (size_t)size);
}

// memGlobalRefToObject(J)Ljava/lang/Object;
JNIEXPORT jobject JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefToObject(JNIEnv *env, jclass clazz,
	jlong globalRef
) {
	UNUSED_PARAMS(env, clazz)
	return (jobject)(intptr_t)globalRef;
}

// memNewGlobalRef(Ljava/lang/Object;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_memNewGlobalRef(JNIEnv *env, jclass clazz,
	jobject object
) {
	UNUSED_PARAM(clazz)
	return (jlong)(intptr_t)(*env)->NewGlobalRef(env, object);
}

// memDeleteGlobalRef(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_memDeleteGlobalRef(JNIEnv *env, jclass clazz,
	jlong globalRef
) {
	UNUSED_PARAM(clazz)
	(*env)->DeleteGlobalRef(env, (jobject)(intptr_t)globalRef);
}

// memNewWeakGlobalRef(Ljava/lang/Object;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_memNewWeakGlobalRef(JNIEnv *env, jclass clazz,
	jobject object
) {
	UNUSED_PARAM(clazz)
	return (jlong)(intptr_t)(*env)->NewWeakGlobalRef(env, object);
}

// memDeleteWeakGlobalRef(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_memDeleteWeakGlobalRef(JNIEnv *env, jclass clazz,
	jlong globalRef
) {
	UNUSED_PARAM(clazz)
	(*env)->DeleteWeakGlobalRef(env, (jweak)(intptr_t)globalRef);
}

EXTERN_C_EXIT
