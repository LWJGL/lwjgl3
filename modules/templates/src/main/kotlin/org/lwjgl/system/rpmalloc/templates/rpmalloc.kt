/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.rpmalloc.templates

import org.lwjgl.generator.*
import org.lwjgl.system.rpmalloc.*

val RPMALLOC_LIBRARY = "LibRPmalloc.initialize();"

val rpmalloc = "RPmalloc".nativeClass(RPMALLOC_PACKAGE, prefix = "RP", prefixConstant = "RP", library = RPMALLOC_LIBRARY) {
    nativeDirective("""#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4711))
#endif

DISABLE_WARNINGS()
//#define ENABLE_STATISTICS 1
#include "rpmalloc.c"
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to the ${url("https://github.com/rampantpixels/rpmalloc", "rpmalloc")} library. rpmalloc is a public domain cross platform lock free
        thread caching 16-byte aligned memory allocator implemented in C.

        You are required to call these functions from your own code in order to initialize and finalize the allocator in your process and threads:
        ${ul(
            "#malloc_initialize(): Call at process start to initialize the allocator",
            "#malloc_finalize(): Call at process exit to finalize the allocator",
            "#malloc_thread_initialize(): Call at each thread start to initialize the thread local data for the allocator",
            "#malloc_thread_finalize(): Call at each thread exit to finalize and release thread cache back to global cache"
        )}

        Then simply use the #malloc()/#free() and the other malloc style replacement functions. Remember all allocations are 16-byte aligned, so no need to
        call the explicit #memalign()/#aligned_alloc()/#posix_memalign() functions unless you need greater alignment, they are simply wrappers to make it
        easier to replace in existing code.
        """

    IntConstant(
        "Flag to #aligned_realloc() to not preserve content in reallocation.",

        "MALLOC_NO_PRESERVE"..1
    )

    arrayOf(
        "malloc",
        "calloc",
        "realloc",
        "free",
        "aligned_alloc"
    ).forEach {
        Code(nativeCall = "    return (jlong)(intptr_t)&rp$it;")..internal..opaque_p(
            "${it}_address",
            "The #$it() function address."
        )
    }

    void(
        "malloc_initialize",
        """
        Call at process start to initialize the allocator.

        This function also calls #malloc_thread_initialize().
        """
    )

    void(
        "malloc_finalize",
        "Call at process exit to finalize the allocator."
    )

    void(
        "malloc_thread_initialize",
        "Call at each thread start to initialize the thread local data for the allocator."
    )

    void(
        "malloc_thread_finalize",
        "Call at each thread exit to finalize and release thread cache back to global cache."
    )

    void(
        "malloc_thread_collect",
        ""
    )

    int(
        "malloc_is_thread_initialized",
        ""
    )

    void(
        "malloc_thread_statistics",
        "",

        rpmalloc_thread_statistics_t_p.OUT("stats", "")
    )

    void(
        "malloc_global_statistics",
        "",

        rpmalloc_global_statistics_t_p.OUT("stats", "")
    )

    void_p(
        "malloc",
        "",

        AutoSizeResult..size_t.IN("size", "")
    )

    void(
        "free",
        "",

        MultiTypeAll..Unsafe..nullable..void_p.IN("ptr", "")
    )

    void_p(
        "calloc",
        "",

        AutoSizeResult..size_t.IN("num", ""),
        AutoSizeResult..size_t.IN("size", "")
    )

    void_p(
        "realloc",
        "",

        Unsafe..nullable..void_p.IN("ptr", ""),
        AutoSizeResult..size_t.IN("size", "")
    )

    void_p(
        "aligned_realloc",
        "",

        nullable..void_p.IN("ptr", ""),
        size_t.IN("alignment", ""),
        AutoSizeResult..size_t.IN("size", ""),
        AutoSize("ptr")..size_t.IN("oldsize", ""),
        unsigned_int.IN("flags", "")
    )

    void_p(
        "aligned_alloc",
        "",

        size_t.IN("alignment", ""),
        AutoSizeResult..size_t.IN("size", "")
    )

    void_p(
        "memalign",
        "",

        size_t.IN("alignment", ""),
        AutoSizeResult..size_t.IN("size", "")
    )

    int(
        "posix_memalign",
        "",

        Check(1)..void_pp.OUT("memptr", ""),
        size_t.IN("alignment", ""),
        size_t.IN("size", "")
    )

    size_t(
        "malloc_usable_size",
        "",

        MultiTypeAll..Unsafe..void_p.IN("ptr", "")
    )
}