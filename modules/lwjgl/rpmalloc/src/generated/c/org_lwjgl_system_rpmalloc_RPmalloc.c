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

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&rpmalloc;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpcalloc_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&rpcalloc;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rprealloc_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&rprealloc;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpfree_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&rpfree;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpaligned_1alloc_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&rpaligned_alloc;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1initialize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)rpmalloc_initialize();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1initialize_1config(JNIEnv *__env, jclass clazz, jlong configAddress) {
    rpmalloc_config_t const *config = (rpmalloc_config_t const *)(intptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)rpmalloc_initialize_config(config);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1config(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)rpmalloc_config();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1finalize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_finalize();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1thread_1initialize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_thread_initialize();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1thread_1finalize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_thread_finalize();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1thread_1collect(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_thread_collect();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1is_1thread_1initialized(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)rpmalloc_is_thread_initialized();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1thread_1statistics(JNIEnv *__env, jclass clazz, jlong statsAddress) {
    rpmalloc_thread_statistics_t *stats = (rpmalloc_thread_statistics_t *)(intptr_t)statsAddress;
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_thread_statistics(stats);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1global_1statistics(JNIEnv *__env, jclass clazz, jlong statsAddress) {
    rpmalloc_global_statistics_t *stats = (rpmalloc_global_statistics_t *)(intptr_t)statsAddress;
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_global_statistics(stats);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc(JNIEnv *__env, jclass clazz, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)rpmalloc((size_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpfree__J(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    rpfree(ptr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpcalloc(JNIEnv *__env, jclass clazz, jlong num, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)rpcalloc((size_t)num, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrprealloc(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong size) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)rprealloc(ptr, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpaligned_1realloc(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong alignment, jlong size, jlong oldsize, jint flags) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)rpaligned_realloc(ptr, (size_t)alignment, (size_t)size, (size_t)oldsize, (unsigned int)flags);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpaligned_1alloc(JNIEnv *__env, jclass clazz, jlong alignment, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)rpaligned_alloc((size_t)alignment, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmemalign(JNIEnv *__env, jclass clazz, jlong alignment, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)rpmemalign((size_t)alignment, (size_t)size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpposix_1memalign(JNIEnv *__env, jclass clazz, jlong memptrAddress, jlong alignment, jlong size) {
    void **memptr = (void **)(intptr_t)memptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)rpposix_memalign(memptr, (size_t)alignment, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1usable_1size__J(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)rpmalloc_usable_size(ptr);
}

EXTERN_C_EXIT
