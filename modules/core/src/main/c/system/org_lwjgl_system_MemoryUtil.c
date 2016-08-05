/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#include "common_tools.h"

EXTERN_C_ENTER

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
