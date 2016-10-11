/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#include "common_tools.h"
#include <string.h>

EXTERN_C_ENTER

// memset(JIJ)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccess_memset(JNIEnv *env, jclass clazz,
	jlong address, jint value, jlong bytes
) {
	UNUSED_PARAMS(env, clazz)
	memset((void *)(intptr_t)address, value, (size_t)bytes);
}

// memcpy(JJJ)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccess_memcpy(JNIEnv *env, jclass clazz,
	jlong dst, jlong src, jlong bytes
) {
	UNUSED_PARAMS(env, clazz)
	memcpy((void *)(intptr_t)dst, (const void *)(intptr_t)src, (size_t)bytes);
}

// getPointerSize()I
JNIEXPORT jint JNICALL Java_org_lwjgl_system_MemoryAccess_getPointerSize(JNIEnv *env, jclass clazz)
{
	UNUSED_PARAMS(env, clazz);
	return (jint)sizeof(void *);
}

// getDirectBufferAddress(Ljava/nio/Buffer;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccess_getDirectBufferAddress(JNIEnv *env, jclass clazz,
	jobject buffer
) {
	UNUSED_PARAM(clazz)
	return (jlong)(intptr_t)(*env)->GetDirectBufferAddress(env, buffer);
}

// newDirectByteBuffer(JJ)Ljava/nio/ByteBuffer;
JNIEXPORT jobject JNICALL Java_org_lwjgl_system_MemoryAccess_newDirectByteBuffer(JNIEnv *env, jclass clazz,
	jlong address, jint capacity
) {
	UNUSED_PARAM(clazz)
	return (*env)->NewDirectByteBuffer(env, (void *)(intptr_t)address, capacity);
}

EXTERN_C_EXIT
