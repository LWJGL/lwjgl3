/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#pragma once

#include <stddef.h>

#define LWJGL_MALLOC(function) org_lwjgl_##function

// Overridable memory management functions

typedef void* (*mallocPROC)         (size_t);
typedef void* (*callocPROC)         (size_t num, size_t size);
typedef void* (*reallocPROC)        (void *ptr, size_t size);
typedef void  (*freePROC)           (void *ptr);
typedef void* (*aligned_allocPROC)  (size_t alignment, size_t size);
typedef void  (*aligned_freePROC)   (void *ptr);

extern mallocPROC        org_lwjgl_malloc;
extern callocPROC        org_lwjgl_calloc;
extern reallocPROC       org_lwjgl_realloc;
extern freePROC          org_lwjgl_free;

extern aligned_allocPROC org_lwjgl_aligned_alloc;
extern aligned_freePROC  org_lwjgl_aligned_free;

#ifdef LWJGL_MALLOC_LIB
#define XSETUP_MALLOC(classPath) SETUP_MALLOC(classPath)
#define SETUP_MALLOC(classPath) \
JNIEXPORT void JNICALL Java_##classPath##_setupMalloc( \
    JNIEnv *env, jclass clazz, \
 \
    jlong malloc, \
    jlong calloc, \
    jlong realloc, \
    jlong free, \
 \
    jlong aligned_alloc, \
    jlong aligned_free \
) { \
    UNUSED_PARAMS(env, clazz) \
 \
    org_lwjgl_malloc = (mallocPROC)(uintptr_t)malloc; \
    org_lwjgl_calloc = (callocPROC)(uintptr_t)calloc; \
    org_lwjgl_realloc = (reallocPROC)(uintptr_t)realloc; \
    org_lwjgl_free = (freePROC)(uintptr_t)free; \
 \
    org_lwjgl_aligned_alloc = (aligned_allocPROC)(uintptr_t)aligned_alloc; \
    org_lwjgl_aligned_free = (aligned_freePROC)(uintptr_t)aligned_free; \
}

mallocPROC        org_lwjgl_malloc;
callocPROC        org_lwjgl_calloc;
reallocPROC       org_lwjgl_realloc;
freePROC          org_lwjgl_free;

aligned_allocPROC org_lwjgl_aligned_alloc;
aligned_freePROC  org_lwjgl_aligned_free;

EXTERN_C_ENTER

XSETUP_MALLOC(LWJGL_MALLOC_LIB)

EXTERN_C_EXIT
#endif
