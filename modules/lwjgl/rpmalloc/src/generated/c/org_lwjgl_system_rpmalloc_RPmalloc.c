/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
//#define ENABLE_STATISTICS 1
#define RPMALLOC_CONFIGURABLE 1
#define RPMALLOC_FIRST_CLASS_HEAPS 1
#include "rpmalloc.c"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&rpmalloc;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpcalloc_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&rpcalloc;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rprealloc_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&rprealloc;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpfree_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&rpfree;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpaligned_1alloc_1address(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&rpaligned_alloc;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1initialize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)rpmalloc_initialize();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1initialize_1config(JNIEnv *__env, jclass clazz, jlong configAddress) {
    rpmalloc_config_t const *config = (rpmalloc_config_t const *)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)rpmalloc_initialize_config(config);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1config(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpmalloc_config();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1finalize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_finalize();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1thread_1initialize(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_thread_initialize();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1thread_1finalize(JNIEnv *__env, jclass clazz, jint release_caches) {
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_thread_finalize(release_caches);
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
    rpmalloc_thread_statistics_t *stats = (rpmalloc_thread_statistics_t *)(uintptr_t)statsAddress;
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_thread_statistics(stats);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1global_1statistics(JNIEnv *__env, jclass clazz, jlong statsAddress) {
    rpmalloc_global_statistics_t *stats = (rpmalloc_global_statistics_t *)(uintptr_t)statsAddress;
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_global_statistics(stats);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc(JNIEnv *__env, jclass clazz, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpmalloc((size_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpfree(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    rpfree(ptr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpcalloc(JNIEnv *__env, jclass clazz, jlong num, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpcalloc((size_t)num, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrprealloc(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong size) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rprealloc(ptr, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpaligned_1realloc(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong alignment, jlong size, jlong oldsize, jint flags) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpaligned_realloc(ptr, (size_t)alignment, (size_t)size, (size_t)oldsize, (unsigned int)flags);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpaligned_1alloc(JNIEnv *__env, jclass clazz, jlong alignment, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpaligned_alloc((size_t)alignment, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpaligned_1calloc(JNIEnv *__env, jclass clazz, jlong alignment, jlong num, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpaligned_calloc((size_t)alignment, (size_t)num, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmemalign(JNIEnv *__env, jclass clazz, jlong alignment, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpmemalign((size_t)alignment, (size_t)size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpposix_1memalign(JNIEnv *__env, jclass clazz, jlong memptrAddress, jlong alignment, jlong size) {
    void **memptr = (void **)(uintptr_t)memptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)rpposix_memalign(memptr, (size_t)alignment, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1usable_1size(JNIEnv *__env, jclass clazz, jlong ptrAddress) {
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)rpmalloc_usable_size(ptr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1heap_1acquire(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpmalloc_heap_acquire();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1heap_1release(JNIEnv *__env, jclass clazz, jlong heapAddress) {
    rpmalloc_heap_t *heap = (rpmalloc_heap_t *)(uintptr_t)heapAddress;
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_heap_release(heap);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1heap_1alloc(JNIEnv *__env, jclass clazz, jlong heapAddress, jlong size) {
    rpmalloc_heap_t *heap = (rpmalloc_heap_t *)(uintptr_t)heapAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpmalloc_heap_alloc(heap, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1heap_1aligned_1alloc(JNIEnv *__env, jclass clazz, jlong heapAddress, jlong alignment, jlong size) {
    rpmalloc_heap_t *heap = (rpmalloc_heap_t *)(uintptr_t)heapAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpmalloc_heap_aligned_alloc(heap, (size_t)alignment, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1heap_1calloc(JNIEnv *__env, jclass clazz, jlong heapAddress, jlong num, jlong size) {
    rpmalloc_heap_t *heap = (rpmalloc_heap_t *)(uintptr_t)heapAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpmalloc_heap_calloc(heap, (size_t)num, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1heap_1aligned_1calloc(JNIEnv *__env, jclass clazz, jlong heapAddress, jlong alignment, jlong num, jlong size) {
    rpmalloc_heap_t *heap = (rpmalloc_heap_t *)(uintptr_t)heapAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpmalloc_heap_aligned_calloc(heap, (size_t)alignment, (size_t)num, (size_t)size);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1heap_1realloc(JNIEnv *__env, jclass clazz, jlong heapAddress, jlong ptrAddress, jlong size, jint flags) {
    rpmalloc_heap_t *heap = (rpmalloc_heap_t *)(uintptr_t)heapAddress;
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpmalloc_heap_realloc(heap, ptr, (size_t)size, (unsigned int)flags);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1heap_1aligned_1realloc(JNIEnv *__env, jclass clazz, jlong heapAddress, jlong ptrAddress, jlong alignment, jlong size, jint flags) {
    rpmalloc_heap_t *heap = (rpmalloc_heap_t *)(uintptr_t)heapAddress;
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rpmalloc_heap_aligned_realloc(heap, ptr, (size_t)alignment, (size_t)size, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1heap_1free(JNIEnv *__env, jclass clazz, jlong heapAddress, jlong ptrAddress) {
    rpmalloc_heap_t *heap = (rpmalloc_heap_t *)(uintptr_t)heapAddress;
    void *ptr = (void *)(uintptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_heap_free(heap, ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_nrpmalloc_1heap_1free_1all(JNIEnv *__env, jclass clazz, jlong heapAddress) {
    rpmalloc_heap_t *heap = (rpmalloc_heap_t *)(uintptr_t)heapAddress;
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_heap_free_all(heap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_rpmalloc_RPmalloc_rpmalloc_1heap_1thread_1set_1current(JNIEnv *__env, jclass clazz, jlong heapAddress) {
    rpmalloc_heap_t *heap = (rpmalloc_heap_t *)(uintptr_t)heapAddress;
    UNUSED_PARAMS(__env, clazz)
    rpmalloc_heap_thread_set_current(heap);
}

EXTERN_C_EXIT
