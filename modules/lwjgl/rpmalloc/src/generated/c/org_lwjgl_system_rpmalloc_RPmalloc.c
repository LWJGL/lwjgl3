/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
//#define ENABLE_STATISTICS 1
#include "rpmalloc.c"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1address(void) {
    return (jlong)(intptr_t)&rpmalloc;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1address();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpcalloc_1address(void) {
    return (jlong)(intptr_t)&rpcalloc;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpcalloc_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpcalloc_1address();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rprealloc_1address(void) {
    return (jlong)(intptr_t)&rprealloc;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rprealloc_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rprealloc_1address();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpfree_1address(void) {
    return (jlong)(intptr_t)&rpfree;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpfree_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpfree_1address();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpaligned_1alloc_1address(void) {
    return (jlong)(intptr_t)&rpaligned_alloc;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpaligned_1alloc_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpaligned_1alloc_1address();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1initialize(void) {
    return (jint)rpmalloc_initialize();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1initialize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1initialize();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1initialize_1config(jlong configAddress) {
    rpmalloc_config_t const *config = (rpmalloc_config_t const *)(intptr_t)configAddress;
    return (jint)rpmalloc_initialize_config(config);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1initialize_1config(JNIEnv *__env, jclass clazz, jlong configAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1initialize_1config(configAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1config(void) {
    return (jlong)(intptr_t)rpmalloc_config();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1config(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1config();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1finalize(void) {
    rpmalloc_finalize();
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1finalize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1finalize();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1thread_1initialize(void) {
    rpmalloc_thread_initialize();
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1thread_1initialize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1thread_1initialize();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1thread_1finalize(void) {
    rpmalloc_thread_finalize();
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1thread_1finalize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1thread_1finalize();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1thread_1collect(void) {
    rpmalloc_thread_collect();
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1thread_1collect(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1thread_1collect();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1is_1thread_1initialized(void) {
    return (jint)rpmalloc_is_thread_initialized();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1is_1thread_1initialized(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1is_1thread_1initialized();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1thread_1statistics(jlong statsAddress) {
    rpmalloc_thread_statistics_t *stats = (rpmalloc_thread_statistics_t *)(intptr_t)statsAddress;
    rpmalloc_thread_statistics(stats);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1thread_1statistics(JNIEnv *__env, jclass clazz, jlong statsAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1thread_1statistics(statsAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1global_1statistics(jlong statsAddress) {
    rpmalloc_global_statistics_t *stats = (rpmalloc_global_statistics_t *)(intptr_t)statsAddress;
    rpmalloc_global_statistics(stats);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1global_1statistics(JNIEnv *__env, jclass clazz, jlong statsAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1global_1statistics(statsAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc(jlong size) {
    return (jlong)(intptr_t)rpmalloc((size_t)size);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc(JNIEnv *__env, jclass clazz, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc(size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpfree__J(jlong ptrAddress) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    rpfree(ptr);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpfree__J(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpfree__J(ptrAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpcalloc(jlong num, jlong size) {
    return (jlong)(intptr_t)rpcalloc((size_t)num, (size_t)size);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpcalloc(JNIEnv *__env, jclass clazz, jlong num, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpcalloc(num, size);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrprealloc(jlong ptrAddress, jlong size) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    return (jlong)(intptr_t)rprealloc(ptr, (size_t)size);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrprealloc(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrprealloc(ptrAddress, size);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpaligned_1realloc(jlong ptrAddress, jlong alignment, jlong size, jlong oldsize, jint flags) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    return (jlong)(intptr_t)rpaligned_realloc(ptr, (size_t)alignment, (size_t)size, (size_t)oldsize, (unsigned int)flags);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpaligned_1realloc(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong alignment, jlong size, jlong oldsize, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpaligned_1realloc(ptrAddress, alignment, size, oldsize, flags);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpaligned_1alloc(jlong alignment, jlong size) {
    return (jlong)(intptr_t)rpaligned_alloc((size_t)alignment, (size_t)size);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpaligned_1alloc(JNIEnv *__env, jclass clazz, jlong alignment, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpaligned_1alloc(alignment, size);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmemalign(jlong alignment, jlong size) {
    return (jlong)(intptr_t)rpmemalign((size_t)alignment, (size_t)size);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmemalign(JNIEnv *__env, jclass clazz, jlong alignment, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmemalign(alignment, size);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpposix_1memalign(jlong memptrAddress, jlong alignment, jlong size) {
    void **memptr = (void **)(intptr_t)memptrAddress;
    return (jint)rpposix_memalign(memptr, (size_t)alignment, (size_t)size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpposix_1memalign(JNIEnv *__env, jclass clazz, jlong memptrAddress, jlong alignment, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpposix_1memalign(memptrAddress, alignment, size);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1usable_1size__J(jlong ptrAddress) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    return (jlong)rpmalloc_usable_size(ptr);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1usable_1size__J(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1usable_1size__J(ptrAddress);
}

EXTERN_C_EXIT
