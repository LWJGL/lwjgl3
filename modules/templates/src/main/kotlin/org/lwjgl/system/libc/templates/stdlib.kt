/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.libc.templates

import org.lwjgl.generator.*
import org.lwjgl.system.libc.*

val stdlib = "LibCStdlib".nativeClass(packageName = LIBC_PACKAGE) {
    nativeImport(
        "<stdlib.h>"
    )

    nativeDirective(
        """#ifdef LWJGL_WINDOWS
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
#endif""")

    documentation = "Native bindings to stdlib.h."

    void_p(
        "malloc",
        """
        Allocates {@code size} bytes and returns a pointer to the allocated memory. The memory is not initialized. If {@code size} is 0, then malloc() returns
        either #NULL, or a unique pointer value that can later be successfully passed to #free().
        """,

        AutoSizeResult..size_t.IN("size", "the number of bytes to allocate")
    )

    void_p(
        "calloc",
        """
        Allocates memory for an array of {@code nmemb} elements of {@code size} bytes each and returns a pointer to the allocated memory. The memory is set to
        zero. If {@code nmemb} or {@code size} is 0, then calloc() returns either #NULL, or a unique pointer value that can later be successfully passed to
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
        {@code ptr} is #NULL, then the call is equivalent to {@code malloc(size)}, for all values of {@code size}; if {@code size} is equal to zero, and
        {@code ptr} is not #NULL, then the call is equivalent to {@code free(ptr)}. Unless {@code ptr} is #NULL, it must have been returned by an earlier call
        to #malloc(), #calloc() or #realloc(). If the area pointed to was moved, a {@code free(ptr)} is done.
        """,

        Unsafe..nullable..void_p.IN("ptr", "the memory block to reallocate"),
        AutoSizeResult..size_t.IN("size", "the new memory block size, in bytes")
    )

    OffHeapOnly..void(
        "free",
        """
        Frees the memory space pointed to by {@code ptr}, which must have been returned by a previous call to #malloc(), #calloc(), or #realloc(). Otherwise,
        or if {@code free(ptr)} has already been called before, undefined behavior occurs. If ptr is #NULL, no operation is performed.
        """,

        MultiTypeAll..Unsafe..nullable..void_p.IN("ptr", "the memory space to free")
    )

    Code(
        nativeCall = "${t}return (jlong)(intptr_t)__aligned_alloc((size_t)alignment, (size_t)size);"
    )..void_p(
        "aligned_alloc",
        """
        Allocates {@code size} bytes of uninitialized storage whose alignment is specified by {@code alignment}. The size parameter must be an integral multiple
        of alignment. Memory allocated with aligned_alloc() must be freed with #aligned_free().
        """,

        size_t.IN("alignment", "the alignment. Must be a power of two value."),
        AutoSizeResult..size_t.IN("size", "the number of bytes to allocate. Must be a multiple of {@code alignment}.")
    )

    Code(
        nativeCall = "${t}__aligned_free(ptr);"
    )..OffHeapOnly..void(
        "aligned_free",
        "Frees a block of memory that was allocated with #aligned_alloc(). If ptr is #NULL, no operation is performed.",

        Unsafe..MultiTypeAll..nullable..void_p.IN("ptr", "the aligned block of memory to free")
    )
}