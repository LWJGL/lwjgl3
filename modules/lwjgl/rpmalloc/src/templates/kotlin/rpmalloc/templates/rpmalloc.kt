/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package rpmalloc.templates

import org.lwjgl.generator.*
import rpmalloc.*

val RPMALLOC_LIBRARY = "LibRPmalloc.initialize();"

val rpmalloc = "RPmalloc".nativeClass(Module.RPMALLOC, prefix = "RP", prefixConstant = "RP", library = RPMALLOC_LIBRARY) {
    nativeDirective("""DISABLE_WARNINGS()
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
        Code(nativeCall = "${t}return (jlong)(intptr_t)&rp$it;")..internal..opaque_p("${it}_address", "The #$it() function address.", void())
    }

    intb("malloc_initialize", "Initializes allocator with default configuration.", void())

    intb(
        "malloc_initialize_config",
        "Initializes allocator with given configuration.",

        nullable..rpmalloc_config_t.const.p("config", "an optional ##RPMallocConfig instance")
    )

    Nonnull..rpmalloc_config_t.const.p("malloc_config", "Gets allocator configuration.", void())

    void("malloc_finalize", "Finalizes allocator.")
    void("malloc_thread_initialize", "Initializes allocator for calling thread.")
    void("malloc_thread_finalize", "Finalizes allocator for calling thread.")
    void("malloc_thread_collect", "Performs deferred deallocations pending for the calling thread heap.")
    intb("malloc_is_thread_initialized", "Query if allocator is initialized for calling thread.", void())

    void(
        "malloc_thread_statistics",
        "Gets per-thread statistics.",

        rpmalloc_thread_statistics_t.p("stats", "")
    )

    void(
        "malloc_global_statistics",
        "Gets global statistics.",

        rpmalloc_global_statistics_t.p("stats", "")
    )

    void.p(
        "malloc",
        "Allocates a memory block of at least the given size.",

        AutoSizeResult..size_t("size", "")
    )

    void(
        "free",
        "Frees the given memory block.",

        MultiTypeAll..Unsafe..nullable..void.p("ptr", "")
    )

    void.p(
        "calloc",
        "Allocates a memory block of at least the given size and zero initializes it.",

        AutoSizeResult..size_t("num", ""),
        AutoSizeResult..size_t("size", "")
    )

    void.p(
        "realloc",
        "Reallocates the given block to at least the given size.",

        Unsafe..nullable..void.p("ptr", ""),
        AutoSizeResult..size_t("size", "")
    )

    void.p(
        "aligned_realloc",
        "Reallocates the given block to at least the given size and alignment, with optional control flags (see #MALLOC_NO_PRESERVE)",

        nullable..void.p("ptr", ""),
        size_t("alignment", ""),
        AutoSizeResult..size_t("size", ""),
        AutoSize("ptr")..size_t("oldsize", ""),
        unsigned_int("flags", "")
    )

    void.p(
        "aligned_alloc",
        "Allocates a memory block of at least the given size and alignment.",

        size_t("alignment", ""),
        AutoSizeResult..size_t("size", "")
    )

    void.p(
        "memalign",
        "Allocates a memory block of at least the given size and alignment.",

        size_t("alignment", ""),
        AutoSizeResult..size_t("size", "")
    )

    int(
        "posix_memalign",
        "Allocates a memory block of at least the given size and alignment.",

        Check(1)..void.p.p("memptr", ""),
        size_t("alignment", ""),
        size_t("size", "")
    )

    size_t(
        "malloc_usable_size",
        "Queries the usable size of the given memory block (from given pointer to the end of block).",

        MultiTypeAll..Unsafe..void.p("ptr", "")
    )
}