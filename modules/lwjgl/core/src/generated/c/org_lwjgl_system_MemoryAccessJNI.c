/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stdlib.h>
#include <stdint.h>
#ifdef LWJGL_WINDOWS
    static void* __aligned_alloc(size_t alignment, size_t size) {
        return _aligned_malloc(size, alignment);
    }
    #define __aligned_free _aligned_free
#else
    #if defined(__USE_ISOC11)
        #define __aligned_alloc aligned_alloc
    #else
        static void* __aligned_alloc(size_t alignment, size_t size) {
            void *p;
            return posix_memalign(&p, alignment, size) ? NULL : p;
        }
    #endif
    #define __aligned_free free
#endif

// -----------

static inline int8_t getByte(void *ptr) { return *(int8_t *)ptr; }
static inline int16_t getShort(void *ptr) { return *(int16_t *)ptr; }
static inline int32_t getInt(void *ptr) { return *(int32_t *)ptr; }
static inline int64_t getLong(void *ptr) { return *(int64_t *)ptr; }
static inline float getFloat(void *ptr) { return *(float *)ptr; }
static inline double getDouble(void *ptr) { return *(double *)ptr; }
static inline uintptr_t getAddress(void *ptr) { return *(uintptr_t *)ptr; }

// -----------

static inline void putByte(void *ptr, int8_t value) { *(int8_t *)ptr = value; }
static inline void putShort(void *ptr, int16_t value) { *(int16_t *)ptr = value; }
static inline void putInt(void *ptr, int32_t value) { *(int32_t *)ptr = value; }
static inline void putLong(void *ptr, int64_t value) { *(int64_t *)ptr = value; }
static inline void putFloat(void *ptr, float value) { *(float *)ptr = value; }
static inline void putDouble(void *ptr, double value) { *(double *)ptr = value; }
static inline void putAddress(void *ptr, uintptr_t value) { *(uintptr_t *)ptr = value; }

// -----------

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_MemoryAccessJNI_getPointerSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)sizeof(void *);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_malloc(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&malloc;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_calloc(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&calloc;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_realloc(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&realloc;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_free(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&free;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_aligned_1alloc(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&__aligned_alloc;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_aligned_1free(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&__aligned_free;
}

JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetByte(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jbyte)getByte(ptr);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetShort(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jshort)getShort(ptr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetInt(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)getInt(ptr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetLong(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)getLong(ptr);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetFloat(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)getFloat(ptr);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetDouble(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jdouble)getDouble(ptr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetAddress(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)getAddress(ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputByte(JNIEnv *__env, jclass clazz, jlong ptrAddress, jbyte value) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    putByte(ptr, (int8_t)value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputShort(JNIEnv *__env, jclass clazz, jlong ptrAddress, jshort value) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    putShort(ptr, (int16_t)value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputInt(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint value) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    putInt(ptr, (int32_t)value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputLong(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong value) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    putLong(ptr, (int64_t)value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputFloat(JNIEnv *__env, jclass clazz, jlong ptrAddress, jfloat value) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    putFloat(ptr, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputDouble(JNIEnv *__env, jclass clazz, jlong ptrAddress, jdouble value) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    putDouble(ptr, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputAddress(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong value) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    putAddress(ptr, (uintptr_t)value);
}

EXTERN_C_EXIT
