/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package rpmalloc.templates

import org.lwjgl.generator.*
import rpmalloc.*

val rpmalloc = "RPmalloc".nativeClass(Module.RPMALLOC, prefix = "RP", prefixConstant = "RP") {
    nativeDirective("""DISABLE_WARNINGS()
//#define ENABLE_STATISTICS 1
#define RPMALLOC_CONFIGURABLE 1
#define RPMALLOC_FIRST_CLASS_HEAPS 1
#include "rpmalloc.c"
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to the ${url("https://github.com/mjansson/rpmalloc", "rpmalloc")} library. rpmalloc is a public domain cross platform lock free
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

        The rpmalloc build in LWJGL is configured with {@code RPMALLOC_CONFIGURABLE=1} and {@code ENABLE_STATISTICS=0}.
        """

    IntConstant(
        "Flag to #aligned_realloc() to not preserve content in reallocation.",

        "MALLOC_NO_PRESERVE".."1"
    )

    IntConstant(
        """
        Flag to #aligned_realloc() to fail and return null pointer if grow cannot be done in-place, in which case the original pointer is still valid (just
        like a call to realloc which failes to allocate a new block).
        """,

        "MALLOC_GROW_OR_FAIL".."2"
    )

    arrayOf(
        "malloc",
        "calloc",
        "realloc",
        "free",
        "aligned_alloc"
    ).forEach {
        Code(nativeCall = "${t}return (jlong)(uintptr_t)&rp$it;")..internal..opaque_p("${it}_address", "The #$it() function address.", void())
    }

    intb("malloc_initialize", "Initializes allocator with default configuration.", void())

    intb(
        "malloc_initialize_config",
        "Initializes allocator with given configuration.",

        nullable..rpmalloc_config_t.const.p("config", "an optional ##RPMallocConfig instance")
    )

    Nonnull..rpmalloc_config_t.const.p("malloc_config", "Gets allocator configuration.", void())

    void("malloc_finalize", "Finalizes allocator.", void())
    void("malloc_thread_initialize", "Initializes allocator for calling thread.", void())
    void(
        "malloc_thread_finalize",

        "Finalizes allocator for calling thread.",
        intb("release_caches", "pass non-zero to release thread caches to global cache")
    )
    void("malloc_thread_collect", "Performs deferred deallocations pending for the calling thread heap.", void())
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
        """
        Reallocates the given block to at least the given size and alignment, with optional control flags (see #MALLOC_NO_PRESERVE).

        Alignment must be a power of two and a multiple of {@code sizeof(void*)}, and should ideally be less than memory page size. A caveat of rpmalloc
        internals is that this must also be strictly less than the span size (default {@code 64KiB}).
        """,

        nullable..void.p("ptr", ""),
        size_t("alignment", ""),
        AutoSizeResult..size_t("size", ""),
        AutoSize("ptr")..size_t("oldsize", ""),
        unsigned_int("flags", "#MALLOC_NO_PRESERVE #MALLOC_GROW_OR_FAIL")
    )

    void.p(
        "aligned_alloc",
        """
        Allocates a memory block of at least the given size and alignment.

        Alignment must be a power of two and a multiple of {@code sizeof(void*)}, and should ideally be less than memory page size. A caveat of rpmalloc
        internals is that this must also be strictly less than the span size (default {@code 64KiB}).
        """,

        size_t("alignment", ""),
        AutoSizeResult..size_t("size", "")
    )

    void.p(
        "aligned_calloc",
        """
        Allocates a memory block of at least the given size and alignment, and zero initializes it.

        Alignment must be a power of two and a multiple of {@code sizeof(void*)}, and should ideally be less than memory page size. A caveat of rpmalloc
        internals is that this must also be strictly less than the span size (default {@code 64KiB}).
        """,

        size_t("alignment", ""),
        AutoSizeResult..size_t("num", ""),
        AutoSizeResult..size_t("size", "")
    )

    void.p(
        "memalign",
        """
        Allocates a memory block of at least the given size and alignment.

        Alignment must be a power of two and a multiple of {@code sizeof(void*)}, and should ideally be less than memory page size. A caveat of rpmalloc
        internals is that this must also be strictly less than the span size (default {@code 64KiB}).
        """,

        size_t("alignment", ""),
        AutoSizeResult..size_t("size", "")
    )

    int(
        "posix_memalign",
        """
        Allocates a memory block of at least the given size and alignment.

        Alignment must be a power of two and a multiple of {@code sizeof(void*)}, and should ideally be less than memory page size. A caveat of rpmalloc
        internals is that this must also be strictly less than the span size (default {@code 64KiB}).
        """,

        Check(1)..void.p.p("memptr", ""),
        size_t("alignment", ""),
        size_t("size", "")
    )

    size_t(
        "malloc_usable_size",
        "Queries the usable size of the given memory block (from given pointer to the end of block).",

        MultiTypeAll..Unsafe..void.p("ptr", "")
    )

    rpmalloc_heap_t.p(
        "malloc_heap_acquire",
        """
        Acquires a new heap.

        Will reuse existing released heaps or allocate memory for a new heap if none available. Heap API is implemented with the strict assumption that only
        one single thread will call heap functions for a given heap at any given time, no functions are thread safe.
        """,

        void()
    )

    void(
        "malloc_heap_release",
        """
        Releases a heap (does NOT free the memory allocated by the heap, use #malloc_heap_free_all() before destroying the heap).

        Releasing a heap will enable it to be reused by other threads. Safe to pass a null pointer.
        """,

        nullable..rpmalloc_heap_t.p("heap", "")
    )

    void.p(
        "malloc_heap_alloc",
        "Allocates a memory block of at least the given size using the given heap.",

        rpmalloc_heap_t.p("heap", ""),
        AutoSizeResult..size_t("size", "")
    )

    void.p(
        "malloc_heap_aligned_alloc",
        """
        Allocates a memory block of at least the given size using the given heap.

        The returned block will have the requested alignment. Alignment must be a power of two and a multiple of {@code sizeof(void*)}, and should ideally be
        less than memory page size. A caveat of rpmalloc internals is that this must also be strictly less than the span size (default {@code 64KiB}).
        """,

        rpmalloc_heap_t.p("heap", ""),
        size_t("alignment", ""),
        AutoSizeResult..size_t("size", "")
    )

    void.p(
        "malloc_heap_calloc",
        "Allocates a memory block of at least the given size using the given heap and zero initializes it.",

        rpmalloc_heap_t.p("heap", ""),
        AutoSizeResult..size_t("num", ""),
        AutoSizeResult..size_t("size", "")
    )

    void.p(
        "malloc_heap_aligned_calloc",
        """
        Allocates a memory block of at least the given size using the given heap and zero initializes it.

        The returned block will have the requested alignment. Alignment must either be zero, or a power of two and a multiple of {@code sizeof(void*)}, and
        should ideally be less than memory page size. A caveat of rpmalloc internals is that this must also be strictly less than the span size (default
        {@code 64KiB}).
        """,

        rpmalloc_heap_t.p("heap", ""),
        size_t("alignment", ""),
        AutoSizeResult..size_t("num", "'"),
        AutoSizeResult..size_t("size", "")
    )

    void.p(
        "malloc_heap_realloc",
        """
        Reallocates the given block to at least the given size.

        The memory block MUST be allocated by the same heap given to this function.        
        """,

        rpmalloc_heap_t.p("heap", ""),
        Unsafe..nullable..void.p("ptr", ""),
        AutoSizeResult..size_t("size", ""),
        unsigned_int("flags", "#MALLOC_NO_PRESERVE #MALLOC_GROW_OR_FAIL")
    )

    void.p(
        "malloc_heap_aligned_realloc",
        """
        Reallocates the given block to at least the given size.

        The memory block MUST be allocated by the same heap given to this function. The returned block will have the requested alignment. Alignment must be
        either zero, or a power of two and a multiple of {@code sizeof(void*)}, and should ideally be less than memory page size. A caveat of rpmalloc
        internals is that this must also be strictly less than the span size (default {@code 64KiB}).
        """,

        rpmalloc_heap_t.p("heap", ""),
        Unsafe..nullable..void.p("ptr", ""),
        size_t("alignment", ""),
        AutoSizeResult..size_t("size", ""),
        unsigned_int("flags", "#MALLOC_NO_PRESERVE #MALLOC_GROW_OR_FAIL")
    )

    void(
        "malloc_heap_free",
        """
        Frees the given memory block from the given heap.

        The memory block MUST be allocated by the same heap given to this function.
        """,

        rpmalloc_heap_t.p("heap", ""),
        MultiTypeAll..Unsafe..nullable..void.p("ptr", "")
    )

    void(
        "malloc_heap_free_all",
        "Frees all memory allocated by the heap.",

        rpmalloc_heap_t.p("heap", "")
    )

    void(
        "malloc_heap_thread_set_current",
        """
        Sets the given heap as the current heap for the calling thread.

        A heap MUST only be current heap for a single thread, a heap can never be shared between multiple threads. The previous current heap for the calling
        thread is released to be reused by other threads.
        """,

        nullable..rpmalloc_heap_t.p("heap", "")
    )
}