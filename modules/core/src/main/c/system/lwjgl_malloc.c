/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "lwjgl_malloc.h"

// Overridable memory management functions

mallocPROC        lwjgl_malloc;
callocPROC        lwjgl_calloc;
reallocPROC       lwjgl_realloc;
freePROC          lwjgl_free;

aligned_allocPROC lwjgl_aligned_alloc;
aligned_freePROC  lwjgl_aligned_free;

EXTERN_C_ENTER

JNIEXPORT void lwjgl_setup_malloc(
	mallocPROC malloc,
	callocPROC calloc,
	reallocPROC realloc,
	freePROC free,

	aligned_allocPROC aligned_alloc,
	aligned_freePROC aligned_free
) {
	lwjgl_malloc = malloc;
	lwjgl_calloc = calloc;
	lwjgl_realloc = realloc;
	lwjgl_free = free;

	lwjgl_aligned_alloc = aligned_alloc;
	lwjgl_aligned_free = aligned_free;
}

EXTERN_C_EXIT
