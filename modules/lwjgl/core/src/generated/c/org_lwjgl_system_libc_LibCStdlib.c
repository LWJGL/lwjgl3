/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stdlib.h>
#ifdef LWJGL_WINDOWS
    #define __aligned_alloc(alignment, size) _aligned_malloc(size, alignment)
    #define __aligned_free _aligned_free
#else
    #if defined(__USE_ISOC11) && !defined(LWJGL_LINUX)
        #define __aligned_alloc aligned_alloc
    #else
        inline void* __aligned_alloc(size_t alignment, size_t size) {
            void *p;
            return posix_memalign(&p, alignment, size) ? NULL : p;
        }
    #endif
    #define __aligned_free free
#endif

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCStdlib_nmalloc(jlong size) {
    return (jlong)(intptr_t)malloc((size_t)size);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdlib_nmalloc(JNIEnv *__env, jclass clazz, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCStdlib_nmalloc(size);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCStdlib_ncalloc(jlong nmemb, jlong size) {
    return (jlong)(intptr_t)calloc((size_t)nmemb, (size_t)size);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdlib_ncalloc(JNIEnv *__env, jclass clazz, jlong nmemb, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCStdlib_ncalloc(nmemb, size);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCStdlib_nrealloc(jlong ptrAddress, jlong size) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    return (jlong)(intptr_t)realloc(ptr, (size_t)size);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdlib_nrealloc(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCStdlib_nrealloc(ptrAddress, size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_libc_LibCStdlib_nfree(jlong ptrAddress) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    free(ptr);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_LibCStdlib_nfree(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_libc_LibCStdlib_nfree(ptrAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCStdlib_naligned_1alloc(jlong alignment, jlong size) {
    return (jlong)(intptr_t)__aligned_alloc((size_t)alignment, (size_t)size);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdlib_naligned_1alloc(JNIEnv *__env, jclass clazz, jlong alignment, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCStdlib_naligned_1alloc(alignment, size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_libc_LibCStdlib_naligned_1free(jlong ptrAddress) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    __aligned_free(ptr);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_libc_LibCStdlib_naligned_1free(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_libc_LibCStdlib_naligned_1free(ptrAddress);
}

EXTERN_C_EXIT
