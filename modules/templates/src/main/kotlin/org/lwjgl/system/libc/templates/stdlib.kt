/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.libc.templates

import org.lwjgl.generator.*

val stdlib = "Stdlib".nativeClass(packageName = "org.lwjgl.system.libc") {
	nativeImport (
		"<stdlib.h>"
	)

	nativeDirective(
		"""#ifdef LWJGL_WINDOWS
	#define aligned_alloc(alignment, size) _aligned_malloc(size, alignment)
	#define aligned_free _aligned_free
#else
	#ifndef __USE_ISOC11
	inline void* aligned_alloc(size_t alignment, size_t size) {
		void *p;
		if ( !posix_memalign(&p, alignment, size) )
			return p;
		return NULL;
	}
	#endif
	#define aligned_free free
#endif""")

	documentation = "Native bindings to stdlib.h."

	void_p(
		"malloc",
		"""
		Allocates {@code size} bytes and returns a pointer to the allocated memory. The memory is not initialized. If {@code size} is 0, then malloc() returns
		either $NULL, or a unique pointer value that can later be successfully passed to #free().
		""",

		AutoSizeResult..size_t.IN("size", "the number of bytes to allocate")
	)

	void_p(
		"calloc",
		"""
		Allocates memory for an array of {@code nmemb} elements of {@code size} bytes each and returns a pointer to the allocated memory. The memory is set to
		zero. If {@code nmemb} or {@code size} is 0, then calloc() returns either $NULL, or a unique pointer value that can later be successfully passed to
		#free().
		""",

		AutoSizeResult..size_t.IN("nmemb", "the number of elements to allocate"),
		AutoSizeResult..size_t.IN("size", "the number of bytes to allocate per element")
	)

	void_p(
		"realloc",
		"""
		Changes the size of the memory block pointed to by {@code ptr} to {@code size} bytes  The contents will be unchanged in the range from the start of the
		region up to the minimum of the old and new sizes. If the new size is larger than the old size, the added memory will not be initialized. If
		{@code ptr} is $NULL, then the call is equivalent to {@code malloc(size)}, for all values of {@code size}; if {@code size} is equal to zero, and
		{@code ptr} is not $NULL, then the call is equivalent to {@code free(ptr)}. Unless {@code ptr} is $NULL, it must have been returned by an earlier call
		to #malloc(), #calloc() or #realloc(). If the area pointed to was moved, a {@code free(ptr)} is done.
		""",

		nullable..void_p.IN("ptr", "the memory block to reallocate"),
		AutoSizeResult..size_t.IN("size", "the new memory block size, in bytes")
	)

	void(
		"free",
		"""
		Frees the memory space pointed to by {@code ptr}, which must have been returned by a previous call to #malloc(), #calloc(), or #realloc(). Otherwise,
		or if {@code free(ptr)} has already been called before, undefined behavior occurs. If ptr is $NULL, no operation is performed.
		""",

		MultiType(
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT,
			PointerMapping.DATA_LONG,
			PointerMapping.DATA_FLOAT,
			PointerMapping.DATA_DOUBLE,
			PointerMapping.DATA_POINTER
		)..nullable..void_p.IN("ptr", "the memory space to free")
	)

	void_p(
		"aligned_alloc",
		"""
		Allocates {@code size} bytes of uninitialized storage whose alignment is specified by {@code alignment}. The size parameter must be an integral multiple
		of alignment. Memory allocated with aligned_alloc() must be freed with #aligned_free().
		""",

		size_t.IN("alignment", "the alignment. Must be a power of two value."),
		AutoSizeResult..size_t.IN("size", "the number of bytes to allocate. Must be a multiple of {@code alignment}.")
	)

	void(
		"aligned_free",
		"Frees a block of memory that was allocated with #aligned_alloc(). If ptr is $NULL, no operation is performed.",

		MultiType(
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT,
			PointerMapping.DATA_LONG,
			PointerMapping.DATA_FLOAT,
			PointerMapping.DATA_DOUBLE,
			PointerMapping.DATA_POINTER
		)..nullable..void_p.IN("ptr", "the aligned block of memory to free")
	)
}