/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include <string.h>
ENABLE_WARNINGS()

EXTERN_C_ENTER

// malloc()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccess_malloc(JNIEnv *env, jclass clazz)
{
	UNUSED_PARAMS(env, clazz)
	return (jlong)(intptr_t)&lwjgl_malloc;
}

// calloc()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccess_calloc(JNIEnv *env, jclass clazz)
{
	UNUSED_PARAMS(env, clazz)
	return (jlong)(intptr_t)&lwjgl_calloc;
}

// realloc()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccess_realloc(JNIEnv *env, jclass clazz)
{
	UNUSED_PARAMS(env, clazz)
	return (jlong)(intptr_t)&lwjgl_realloc;
}

// free()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccess_free(JNIEnv *env, jclass clazz)
{
	UNUSED_PARAMS(env, clazz)
	return (jlong)(intptr_t)&lwjgl_free;
}

// aligned_alloc()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccess_aligned_1alloc(JNIEnv *env, jclass clazz)
{
	UNUSED_PARAMS(env, clazz)
	return (jlong)(intptr_t)&lwjgl_aligned_alloc;
}

// aligned_free()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccess_aligned_1free(JNIEnv *env, jclass clazz)
{
	UNUSED_PARAMS(env, clazz)
	return (jlong)(intptr_t)&lwjgl_aligned_free;
}

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

// getByte(J)B
JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_MemoryAccess_getByte(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return *(jbyte *)(intptr_t)ptr;
}

// getShort(J)S
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_MemoryAccess_getShort(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return *(jshort *)(intptr_t)ptr;
}

// getInt(J)I
JNIEXPORT jint JNICALL Java_org_lwjgl_system_MemoryAccess_getInt(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return *(jint *)(intptr_t)ptr;
}

// getLong(J)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccess_getLong(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return *(jlong *)(intptr_t)ptr;
}

// getFloat(J)F
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_MemoryAccess_getFloat(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return *(jfloat *)(intptr_t)ptr;
}

// getDouble(J)D
JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_MemoryAccess_getDouble(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return *(jdouble *)(intptr_t)ptr;
}

// getAddress(J)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccess_getAddress(JNIEnv *env, jclass clazz, jlong ptr) {
	UNUSED_PARAMS(env, clazz)
	return (jlong)*(intptr_t *)(intptr_t)ptr;
}

// putByte(JB)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccess_putByte(JNIEnv *env, jclass clazz, jlong ptr, jbyte value) {
 	UNUSED_PARAMS(env, clazz)
 	*(jbyte *)(intptr_t)ptr = value;
 }

// putShort(JS)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccess_putShort(JNIEnv *env, jclass clazz, jlong ptr, jshort value) {
	UNUSED_PARAMS(env, clazz)
	*(jshort *)(intptr_t)ptr = value;
}

// putInt(JI)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccess_putInt(JNIEnv *env, jclass clazz, jlong ptr, jint value) {
	UNUSED_PARAMS(env, clazz)
	*(jint *)(intptr_t)ptr = value;
}

// putLong(JJ)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccess_putLong(JNIEnv *env, jclass clazz, jlong ptr, jlong value) {
	UNUSED_PARAMS(env, clazz)
	*(jlong *)(intptr_t)ptr = value;
}

// putFloat(JF)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccess_putFloat(JNIEnv *env, jclass clazz, jlong ptr, jfloat value) {
	UNUSED_PARAMS(env, clazz)
	*(jfloat *)(intptr_t)ptr = value;
}

// putDouble(JD)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccess_putDouble(JNIEnv *env, jclass clazz, jlong ptr, jdouble value) {
	UNUSED_PARAMS(env, clazz)
	*(jdouble *)(intptr_t)ptr = value;
}

// putAddress(JJ)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccess_putAddress(JNIEnv *env, jclass clazz, jlong ptr, jlong value) {
	UNUSED_PARAMS(env, clazz)
	*(intptr_t *)(intptr_t)ptr = (intptr_t)value;
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
