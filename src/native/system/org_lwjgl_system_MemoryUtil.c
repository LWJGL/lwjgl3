/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#ifdef LWJGL_LINUX
	#include <string.h>
#endif

// memPointerSize()I
JNIEXPORT jint JNICALL Java_org_lwjgl_system_MemoryUtil_memPointerSize(JNIEnv *env, jclass clazz)
{
	return (jint)sizeof(void *);
}

JNIEXPORT jobject JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefToObject(JNIEnv *env, jclass clazz,
	jlong globalRef
) {
	return (jobject)(intptr_t)globalRef;
}

// memGlobalRefNew(Ljava/lang/Object;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefNew(JNIEnv *env, jclass clazz,
	jobject object
) {
	return (jlong)(intptr_t)(*env)->NewGlobalRef(env, object);
}

// memGlobalRefDelete(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefDelete(JNIEnv *env, jclass clazz,
	jlong globalRef
) {
	(*env)->DeleteGlobalRef(env, (jobject)(intptr_t)globalRef);
}

// memGlobalRefNewWeak(Ljava/lang/Object;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefNewWeak(JNIEnv *env, jclass clazz,
	jobject object
) {
	return (jlong)(intptr_t)(*env)->NewWeakGlobalRef(env, object);
}

// memGlobalRefDeleteWeak(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefDeleteWeak(JNIEnv *env, jclass clazz,
	jlong globalRef
) {
	(*env)->DeleteWeakGlobalRef(env, (jweak)(intptr_t)globalRef);
}

// nMemSet(JIJ)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemSet(JNIEnv *env, jclass clazz,
	jlong address, jint value, jlong bytes
) {
	memset((void *)(intptr_t)address, value, (size_t)bytes);
}

// nMemSet(JJJ)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemCopy(JNIEnv *env, jclass clazz,
	jlong dst, jlong src, jlong bytes
) {
	memcpy((void *)(intptr_t)dst, (const void *)(intptr_t)src, (size_t)bytes);
}

// nMemGetByte(J)B
JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetByte(JNIEnv *env, jclass clazz, jlong ptr) { return *(jbyte *)(intptr_t)ptr; }

// nMemGetShort(J)S
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetShort(JNIEnv *env, jclass clazz, jlong ptr) { return *(jshort *)(intptr_t)ptr; }

// nMemGetInt(J)I
JNIEXPORT jint JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetInt(JNIEnv *env, jclass clazz, jlong ptr) { return *(jint *)(intptr_t)ptr; }

// nMemGetLong(J)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetLong(JNIEnv *env, jclass clazz, jlong ptr) { return *(jlong *)(intptr_t)ptr; }

// nMemGetFloat(J)F
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetFloat(JNIEnv *env, jclass clazz, jlong ptr) { return *(jfloat *)(intptr_t)ptr; }

// nMemGetDouble(J)D
JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetDouble(JNIEnv *env, jclass clazz, jlong ptr) { return *(jdouble *)(intptr_t)ptr; }

// nMemGetAddress(J)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetAddress(JNIEnv *env, jclass clazz, jlong ptr) { return (jlong)*(intptr_t *)(intptr_t)ptr; }

// nMemPutByte(JB)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutByte(JNIEnv *env, jclass clazz, jlong ptr, jbyte value) { *(jbyte *)(intptr_t)ptr = value; }

// nMemPutShort(JS)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutShort(JNIEnv *env, jclass clazz, jlong ptr, jshort value) { *(jshort *)(intptr_t)ptr = value; }

// nMemPutInt(JI)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutInt(JNIEnv *env, jclass clazz, jlong ptr, jint value) { *(jint *)(intptr_t)ptr = value; }

// nMemPutLong(JJ)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutLong(JNIEnv *env, jclass clazz, jlong ptr, jlong value) { *(jlong *)(intptr_t)ptr = value; }

// nMemPutFloat(JF)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutFloat(JNIEnv *env, jclass clazz, jlong ptr, jfloat value) { *(jfloat *)(intptr_t)ptr = value; }

// nMemPutDouble(JD)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutDouble(JNIEnv *env, jclass clazz, jlong ptr, jdouble value) { *(jdouble *)(intptr_t)ptr = value; }

// nMemPutAddress(JJ)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutAddress(JNIEnv *env, jclass clazz, jlong ptr, jlong value) { *(intptr_t *)(intptr_t)ptr = (intptr_t)value; }

// nGetAddress(Ljava/nio/Buffer;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_nGetAddress(JNIEnv *env, jclass clazz,
	jobject buffer
) {
	return (jlong)(intptr_t)(*env)->GetDirectBufferAddress(env, buffer);
}

// nNewBuffer(JJ)Ljava/nio/ByteBuffer;
JNIEXPORT jobject JNICALL Java_org_lwjgl_system_MemoryUtil_nNewBuffer(JNIEnv *env, jclass clazz,
	jlong address, jint capacity
) {
	return (*env)->NewDirectByteBuffer(env, (void *)(intptr_t)address, capacity);
}