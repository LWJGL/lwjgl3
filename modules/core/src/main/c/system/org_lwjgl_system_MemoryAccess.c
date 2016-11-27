/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#include "common_tools.h"
#include <string.h>

EXTERN_C_ENTER

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
