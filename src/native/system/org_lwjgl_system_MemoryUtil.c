/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#ifndef LWJGL_WINDOWS
	DISABLE_WARNINGS()
	#include <string.h>
	ENABLE_WARNINGS()
#endif

EXTERN_C_ENTER

// memPointerSize()I
JNIEXPORT jint JNICALL Java_org_lwjgl_system_MemoryUtil_memPointerSize(JNIEnv *env, jclass clazz)
{
	UNUSED_PARAMS(env, clazz);
	return (jint)sizeof(void *);
}

JNIEXPORT jobject JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefToObject(JNIEnv *env, jclass clazz,
	jlong globalRef
) {
	UNUSED_PARAMS(env, clazz)
	return (jobject)(intptr_t)globalRef;
}

// memGlobalRefNew(Ljava/lang/Object;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefNew(JNIEnv *env, jclass clazz,
	jobject object
) {
	UNUSED_PARAM(clazz)
	return (jlong)(intptr_t)(*env)->NewGlobalRef(env, object);
}

// memGlobalRefDelete(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefDelete(JNIEnv *env, jclass clazz,
	jlong globalRef
) {
	UNUSED_PARAM(clazz)
	(*env)->DeleteGlobalRef(env, (jobject)(intptr_t)globalRef);
}

// memGlobalRefNewWeak(Ljava/lang/Object;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefNewWeak(JNIEnv *env, jclass clazz,
	jobject object
) {
	UNUSED_PARAM(clazz)
	return (jlong)(intptr_t)(*env)->NewWeakGlobalRef(env, object);
}

// memGlobalRefDeleteWeak(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefDeleteWeak(JNIEnv *env, jclass clazz,
	jlong globalRef
) {
	UNUSED_PARAM(clazz)
	(*env)->DeleteWeakGlobalRef(env, (jweak)(intptr_t)globalRef);
}

// nMemSet(JIJ)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemSet(JNIEnv *env, jclass clazz,
	jlong address, jint value, jlong bytes
) {
	UNUSED_PARAMS(env, clazz)
	memset((void *)(intptr_t)address, value, (size_t)bytes);
}

// nMemSet(JJJ)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemCopy(JNIEnv *env, jclass clazz,
	jlong dst, jlong src, jlong bytes
) {
	UNUSED_PARAMS(env, clazz)
	memcpy((void *)(intptr_t)dst, (const void *)(intptr_t)src, (size_t)bytes);
}

// nMemGetByte(J)B
JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetByte(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return *(jbyte *)(intptr_t)ptr;
}

// nMemGetShort(J)S
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetShort(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return *(jshort *)(intptr_t)ptr;
}

// nMemGetInt(J)I
JNIEXPORT jint JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetInt(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return *(jint *)(intptr_t)ptr;
}

// nMemGetLong(J)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetLong(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return *(jlong *)(intptr_t)ptr;
}

// nMemGetFloat(J)F
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetFloat(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return *(jfloat *)(intptr_t)ptr;
}

// nMemGetDouble(J)D
JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetDouble(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return *(jdouble *)(intptr_t)ptr;
}

// nMemGetAddress(J)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_nMemGetAddress(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return (jlong)*(intptr_t *)(intptr_t)ptr;
}

// nMemPutByte(JB)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutByte(JNIEnv *env, jclass clazz, jlong ptr, jbyte value) {
 	UNUSED_PARAMS(env, clazz)
 	*(jbyte *)(intptr_t)ptr = value;
 }

// nMemPutShort(JS)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutShort(JNIEnv *env, jclass clazz, jlong ptr, jshort value) {
	UNUSED_PARAMS(env, clazz)
	*(jshort *)(intptr_t)ptr = value;
}

// nMemPutInt(JI)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutInt(JNIEnv *env, jclass clazz, jlong ptr, jint value) {
	UNUSED_PARAMS(env, clazz)
	*(jint *)(intptr_t)ptr = value;
}

// nMemPutLong(JJ)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutLong(JNIEnv *env, jclass clazz, jlong ptr, jlong value) {
	UNUSED_PARAMS(env, clazz)
	*(jlong *)(intptr_t)ptr = value;
}

// nMemPutFloat(JF)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutFloat(JNIEnv *env, jclass clazz, jlong ptr, jfloat value) {
	UNUSED_PARAMS(env, clazz)
	*(jfloat *)(intptr_t)ptr = value;
}

// nMemPutDouble(JD)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutDouble(JNIEnv *env, jclass clazz, jlong ptr, jdouble value) {
	UNUSED_PARAMS(env, clazz)
	*(jdouble *)(intptr_t)ptr = value;
}

// nMemPutAddress(JJ)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryUtil_nMemPutAddress(JNIEnv *env, jclass clazz, jlong ptr, jlong value) {
	UNUSED_PARAMS(env, clazz)
	*(intptr_t *)(intptr_t)ptr = (intptr_t)value;
}

// nGetAddress(Ljava/nio/Buffer;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryUtil_nGetAddress(JNIEnv *env, jclass clazz,
	jobject buffer
) {
	UNUSED_PARAM(clazz)
	return (jlong)(intptr_t)(*env)->GetDirectBufferAddress(env, buffer);
}

// nNewBuffer(JJ)Ljava/nio/ByteBuffer;
JNIEXPORT jobject JNICALL Java_org_lwjgl_system_MemoryUtil_nNewBuffer(JNIEnv *env, jclass clazz,
	jlong address, jint capacity
) {
	UNUSED_PARAM(clazz)
	return (*env)->NewDirectByteBuffer(env, (void *)(intptr_t)address, capacity);
}

EXTERN_C_EXIT
