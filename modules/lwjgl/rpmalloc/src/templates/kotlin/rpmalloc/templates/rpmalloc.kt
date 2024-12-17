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

    IntConstant(
        "MALLOC_NO_PRESERVE".."1",
        "MALLOC_GROW_OR_FAIL".."2"
    )

    arrayOf(
        "malloc",
        "calloc",
        "realloc",
        "free",
        "aligned_alloc"
    ).forEach {
        Code(nativeCall = "${t}return (jlong)(uintptr_t)&rp$it;")..internal..opaque_p("${it}_address", void())
    }

    intb("malloc_initialize", void())

    intb(
        "malloc_initialize_config",

        nullable..rpmalloc_config_t.const.p("config")
    )

    Nonnull..rpmalloc_config_t.const.p("malloc_config", void())

    void("malloc_finalize", void())
    void("malloc_thread_initialize", void())
    void(
        "malloc_thread_finalize",
        intb("release_caches")
    )
    void("malloc_thread_collect", void())
    intb("malloc_is_thread_initialized", void())

    void(
        "malloc_thread_statistics",

        rpmalloc_thread_statistics_t.p("stats")
    )

    void(
        "malloc_global_statistics",

        rpmalloc_global_statistics_t.p("stats")
    )

    void.p(
        "malloc",

        AutoSizeResult..size_t("size")
    )

    void(
        "free",

        MultiTypeAll..Unsafe..nullable..void.p("ptr")
    )

    void.p(
        "calloc",

        AutoSizeResult..size_t("num"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "realloc",

        Unsafe..nullable..void.p("ptr"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "aligned_realloc",

        nullable..void.p("ptr"),
        size_t("alignment"),
        AutoSizeResult..size_t("size"),
        AutoSize("ptr")..size_t("oldsize"),
        unsigned_int("flags")
    )

    void.p(
        "aligned_alloc",

        size_t("alignment"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "aligned_calloc",

        size_t("alignment"),
        AutoSizeResult..size_t("num"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "memalign",

        size_t("alignment"),
        AutoSizeResult..size_t("size")
    )

    int(
        "posix_memalign",

        Check(1)..void.p.p("memptr"),
        size_t("alignment"),
        size_t("size")
    )

    size_t(
        "malloc_usable_size",

        MultiTypeAll..Unsafe..void.p("ptr")
    )

    rpmalloc_heap_t.p(
        "malloc_heap_acquire",

        void()
    )

    void(
        "malloc_heap_release",

        nullable..rpmalloc_heap_t.p("heap")
    )

    void.p(
        "malloc_heap_alloc",

        rpmalloc_heap_t.p("heap"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "malloc_heap_aligned_alloc",

        rpmalloc_heap_t.p("heap"),
        size_t("alignment"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "malloc_heap_calloc",

        rpmalloc_heap_t.p("heap"),
        AutoSizeResult..size_t("num"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "malloc_heap_aligned_calloc",

        rpmalloc_heap_t.p("heap"),
        size_t("alignment"),
        AutoSizeResult..size_t("num"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "malloc_heap_realloc",

        rpmalloc_heap_t.p("heap"),
        Unsafe..nullable..void.p("ptr"),
        AutoSizeResult..size_t("size"),
        unsigned_int("flags")
    )

    void.p(
        "malloc_heap_aligned_realloc",

        rpmalloc_heap_t.p("heap"),
        Unsafe..nullable..void.p("ptr"),
        size_t("alignment"),
        AutoSizeResult..size_t("size"),
        unsigned_int("flags")
    )

    void(
        "malloc_heap_free",

        rpmalloc_heap_t.p("heap"),
        MultiTypeAll..Unsafe..nullable..void.p("ptr")
    )

    void(
        "malloc_heap_free_all",

        rpmalloc_heap_t.p("heap")
    )

    void(
        "malloc_heap_thread_set_current",

        nullable..rpmalloc_heap_t.p("heap")
    )

    rpmalloc_heap_t.p(
        "malloc_get_heap_for_ptr",

        MultiTypeAll..Unsafe..nullable..void.p("ptr")
    )
}