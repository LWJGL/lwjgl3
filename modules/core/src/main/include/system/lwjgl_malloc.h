/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#pragma once

// Overridable memory management functions

typedef void* (*mallocPROC)         (size_t);
typedef void* (*callocPROC)         (size_t num, size_t size);
typedef void* (*reallocPROC)        (void *ptr, size_t size);
typedef void  (*freePROC)           (void *ptr);
typedef void* (*aligned_allocPROC)  (size_t alignment, size_t size);
typedef void  (*aligned_freePROC)   (void *ptr);

extern mallocPROC        lwjgl_malloc;
extern callocPROC        lwjgl_calloc;
extern reallocPROC       lwjgl_realloc;
extern freePROC          lwjgl_free;

extern aligned_allocPROC lwjgl_aligned_alloc;
extern aligned_freePROC  lwjgl_aligned_free;

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
	lwjgl_malloc = (mallocPROC)(intptr_t)malloc; \
	lwjgl_calloc = (callocPROC)(intptr_t)calloc; \
	lwjgl_realloc = (reallocPROC)(intptr_t)realloc; \
	lwjgl_free = (freePROC)(intptr_t)free; \
 \
	lwjgl_aligned_alloc = (aligned_allocPROC)(intptr_t)aligned_alloc; \
	lwjgl_aligned_free = (aligned_freePROC)(intptr_t)aligned_free; \
}

mallocPROC        lwjgl_malloc;
callocPROC        lwjgl_calloc;
reallocPROC       lwjgl_realloc;
freePROC          lwjgl_free;

aligned_allocPROC lwjgl_aligned_alloc;
aligned_freePROC  lwjgl_aligned_free;

EXTERN_C_ENTER

XSETUP_MALLOC(LWJGL_MALLOC_LIB)

EXTERN_C_EXIT
#endif
