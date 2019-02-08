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
    #if defined(__USE_ISOC11) && !defined(LWJGL_LINUX)
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
static inline intptr_t getAddress(void *ptr) { return *(intptr_t *)ptr; }

// -----------

static inline void putByte(void *ptr, int8_t value) { *(int8_t *)ptr = value; }
static inline void putShort(void *ptr, int16_t value) { *(int16_t *)ptr = value; }
static inline void putInt(void *ptr, int32_t value) { *(int32_t *)ptr = value; }
static inline void putLong(void *ptr, int64_t value) { *(int64_t *)ptr = value; }
static inline void putFloat(void *ptr, float value) { *(float *)ptr = value; }
static inline void putDouble(void *ptr, double value) { *(double *)ptr = value; }
static inline void putAddress(void *ptr, intptr_t value) { *(intptr_t *)ptr = value; }

// -----------

EXTERN_C_ENTER

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_getPointerSize(void) {
    return (jint)sizeof(void *);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_MemoryAccessJNI_getPointerSize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_getPointerSize();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_malloc(void) {
    return (jlong)(intptr_t)&malloc;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_malloc(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_malloc();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_calloc(void) {
    return (jlong)(intptr_t)&calloc;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_calloc(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_calloc();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_realloc(void) {
    return (jlong)(intptr_t)&realloc;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_realloc(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_realloc();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_free(void) {
    return (jlong)(intptr_t)&free;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_free(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_free();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_aligned_1alloc(void) {
    return (jlong)(intptr_t)&__aligned_alloc;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_aligned_1alloc(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_aligned_1alloc();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_aligned_1free(void) {
    return (jlong)(intptr_t)&__aligned_free;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_aligned_1free(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_aligned_1free();
}

JNIEXPORT jbyte JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetByte(jlong ptrAddress) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    return (jbyte)getByte(ptr);
}
JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetByte(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetByte(ptrAddress);
}

JNIEXPORT jshort JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetShort(jlong ptrAddress) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    return (jshort)getShort(ptr);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetShort(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetShort(ptrAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetInt(jlong ptrAddress) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    return (jint)getInt(ptr);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetInt(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetInt(ptrAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetLong(jlong ptrAddress) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    return (jlong)getLong(ptr);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetLong(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetLong(ptrAddress);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetFloat(jlong ptrAddress) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    return (jfloat)getFloat(ptr);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetFloat(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetFloat(ptrAddress);
}

JNIEXPORT jdouble JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetDouble(jlong ptrAddress) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    return (jdouble)getDouble(ptr);
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetDouble(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetDouble(ptrAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetAddress(jlong ptrAddress) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    return (jlong)getAddress(ptr);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_MemoryAccessJNI_ngetAddress(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_MemoryAccessJNI_ngetAddress(ptrAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputByte(jlong ptrAddress, jbyte value) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    putByte(ptr, (int8_t)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputByte(JNIEnv *__env, jclass clazz, jlong ptrAddress, jbyte value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputByte(ptrAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputShort(jlong ptrAddress, jshort value) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    putShort(ptr, (int16_t)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputShort(JNIEnv *__env, jclass clazz, jlong ptrAddress, jshort value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputShort(ptrAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputInt(jlong ptrAddress, jint value) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    putInt(ptr, (int32_t)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputInt(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputInt(ptrAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputLong(jlong ptrAddress, jlong value) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    putLong(ptr, (int64_t)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputLong(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputLong(ptrAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputFloat(jlong ptrAddress, jfloat value) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    putFloat(ptr, value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputFloat(JNIEnv *__env, jclass clazz, jlong ptrAddress, jfloat value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputFloat(ptrAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputDouble(jlong ptrAddress, jdouble value) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    putDouble(ptr, value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputDouble(JNIEnv *__env, jclass clazz, jlong ptrAddress, jdouble value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputDouble(ptrAddress, value);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputAddress(jlong ptrAddress, jlong value) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    putAddress(ptr, (intptr_t)value);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_MemoryAccessJNI_nputAddress(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong value) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_MemoryAccessJNI_nputAddress(ptrAddress, value);
}

EXTERN_C_EXIT
