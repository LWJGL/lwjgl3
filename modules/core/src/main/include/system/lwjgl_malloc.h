/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#ifndef __LWJGL_MALLOC_H__
#define __LWJGL_MALLOC_H__

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

#endif
