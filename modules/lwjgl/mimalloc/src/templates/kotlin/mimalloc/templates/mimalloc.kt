/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package mimalloc.templates

import org.lwjgl.generator.*
import mimalloc.*

val mimalloc = "mimalloc".nativeClass(Module.MIMALLOC, prefix = "mi", prefixMethod = "mi_", binding = simpleBinding(
    Module.MIMALLOC,
    libraryExpression = """Configuration.MIMALLOC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("mimalloc"))""",
    bundledWithLWJGL = true
)) {
    IntConstant(
        "MI_MALLOC_VERSION".."30302"
    ).noPrefix()

    IntConstant(
        "MI_SMALL_WSIZE_MAX".."128",
        "MI_SMALL_SIZE_MAX".."MI_SMALL_WSIZE_MAX * Pointer.POINTER_SIZE"
    ).noPrefix()

    EnumConstant(
        "option_show_errors".enum("0"),
        "option_show_stats".enum,
        "option_verbose".enum,
        "option_deprecated_eager_commit".enum,
        "option_arena_eager_commit".enum,
        "option_purge_decommits".enum,
        "option_allow_large_os_pages".enum,
        "option_reserve_huge_os_pages".enum,
        "option_reserve_huge_os_pages_at".enum,
        "option_reserve_os_memory".enum,
        "option_deprecated_segment_cache".enum,
        "option_deprecated_page_reset".enum,
        "option_deprecated_abandoned_page_purge".enum,
        "option_deprecated_segment_reset".enum,
        "option_deprecated_eager_commit_delay".enum,
        "option_purge_delay".enum,
        "option_use_numa_nodes".enum,
        "option_disallow_os_alloc".enum,
        "option_os_tag".enum,
        "option_max_errors".enum,
        "option_max_warnings".enum,
        "option_deprecated_max_segment_reclaim".enum,
        "option_destroy_on_exit".enum,
        "option_arena_reserve".enum,
        "option_arena_purge_mult".enum,
        "option_deprecated_purge_extend_delay".enum,
        "option_disallow_arena_alloc".enum,
        "option_retry_on_oom".enum,
        "option_visit_abandoned".enum,
        "option_guarded_min".enum,
        "option_guarded_max".enum,
        "option_guarded_precise".enum,
        "option_guarded_sample_rate".enum,
        "option_guarded_sample_seed".enum,
        "option_generic_collect".enum,
        "option_page_reclaim_on_free".enum,
        "option_page_full_retain".enum,
        "option_page_max_candidates".enum,
        "option_max_vabits".enum,
        "option_pagemap_commit".enum,
        "option_page_commit_on_demand".enum,
        "option_page_max_reclaim".enum,
        "option_page_cross_thread_max_reclaim".enum,
        "option_allow_thp".enum,
        "option_minimal_purge_size".enum,
        "option_arena_max_object_size".enum,
        "option_arena_is_numa_local".enum
    )

    void.p(
        "malloc",

        AutoSizeResult..size_t("size")
    )

    void.p(
        "calloc",

        AutoSizeResult..size_t("count"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "realloc",

        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize")
    )

    void.p(
        "expand",

        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize")
    )

    void(
        "free",

        MultiTypeAll..Unsafe..nullable..void.p("p")
    )

    /*
    char.p(
        "strdup",

        NullTerminated..nullable..char.const.p("s")
    )

    char.p(
        "strndup",

        nullable..char.const.p("s"),
        AutoSize("s")..size_t("n")
    )

    char.p(
        "realpath",

        NullTerminated..char.const.p("fname"),
        nullable..char.p("resolved_name")
    )*/

    void.p(
        "malloc_small",

        AutoSizeResult..size_t("size")
    )

    void.p(
        "zalloc_small",

        AutoSizeResult..size_t("size")
    )

    void.p(
        "zalloc",

        AutoSizeResult..size_t("size")
    )

    void.p(
        "mallocn",

        AutoSizeResult..size_t("count"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "reallocn",

        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("count"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "reallocf",

        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize")
    )

    size_t(
        "usable_size",

        Unsafe..nullable..void.const.p("p")
    )

    size_t(
        "good_size",

        size_t("size")
    )

    void(
        "free_small",

        MultiTypeAll..Unsafe..nullable..void.p("p")
    )

    void.p(
        "malloc_aligned",

        AutoSizeResult..size_t("size"),
        size_t("alignment")
    )

    void.p(
        "malloc_aligned_at",

        AutoSizeResult..size_t("size"),
        size_t("alignment"),
        size_t("offset")
    )

    void.p(
        "zalloc_aligned",

        AutoSizeResult..size_t("size"),
        size_t("alignment")
    )

    void.p(
        "zalloc_aligned_at",

        AutoSizeResult..size_t("size"),
        size_t("alignment"),
        size_t("offset")
    )

    void.p(
        "calloc_aligned",

        AutoSizeResult..size_t("count"),
        AutoSizeResult..size_t("size"),
        size_t("alignment")
    )

    void.p(
        "calloc_aligned_at",

        AutoSizeResult..size_t("count"),
        AutoSizeResult..size_t("size"),
        size_t("alignment"),
        size_t("offset")
    )

    void.p(
        "realloc_aligned",

        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize"),
        size_t("alignment")
    )

    void.p(
        "realloc_aligned_at",

        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize"),
        size_t("alignment"),
        size_t("offset")
    )

    void(
        "register_deferred_free",

        nullable..mi_deferred_free_fun("deferred_free"),
        nullable..opaque_p("arg")
    )

    void(
        "register_output",

        nullable..mi_output_fun("out"),
        nullable..opaque_p("arg")
    )

    void(
        "register_error",

        nullable..mi_error_fun("fun"),
        nullable..opaque_p("arg")
    )

    void(
        "collect",

        bool("force")
    )

    int(
        "version",

        void()
    )

    void(
        "options_print",

        void()
    )

    void(
        "process_info_print",

        void()
    )

    void(
        "options_print_out",

        nullable..mi_output_fun("out"),
        nullable..opaque_p("arg")
    )

    void(
        "process_info_print_out",

        nullable..mi_output_fun("out"),
        nullable..opaque_p("arg")
    )

    void(
        "process_info",

        Check(1)..nullable..size_t.p("elapsed_msecs"),
        Check(1)..nullable..size_t.p("user_msecs"),
        Check(1)..nullable..size_t.p("system_msecs"),
        Check(1)..nullable..size_t.p("current_rss"),
        Check(1)..nullable..size_t.p("peak_rss"),
        Check(1)..nullable..size_t.p("current_commit"),
        Check(1)..nullable..size_t.p("peak_commit"),
        Check(1)..nullable..size_t.p("page_faults")
    )

    void("process_init", void())
    void("process_done", void())

    void("thread_init", void())
    void("thread_done", void())

    void(
        "thread_set_in_threadpool",

        void()
    )

    void.p(
        "umalloc",

        AutoSizeResult..size_t("size"),
        Check(1)..nullable..size_t.p("block_size")
    )

    void.p(
        "ucalloc",

        AutoSizeResult..size_t("count"),
        AutoSizeResult..size_t("size"),
        Check(1)..nullable..size_t.p("block_size")
    )

    void.p(
        "urealloc",

        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize"),
        Check(1)..nullable..size_t.p("block_size_pre"),
        Check(1)..nullable..size_t.p("block_size_post")
    )

    void(
        "ufree",

        MultiTypeAll..Unsafe..nullable..void.p("p"),
        Check(1)..nullable..size_t.p("block_size")
    )

    void.p(
        "umalloc_aligned",

        AutoSizeResult..size_t("size"),
        size_t("alignment"),
        Check(1)..nullable..size_t.p("block_size")
    )

    void.p(
        "uzalloc_aligned",

        AutoSizeResult..size_t("size"),
        size_t("alignment"),
        Check(1)..nullable..size_t.p("block_size")
    )

    void.p(
        "umalloc_small",

        AutoSizeResult..size_t("size"),
        Check(1)..nullable..size_t.p("block_size")
    )

    // TODO: not implemented yet?
    /*void.p(
        "uzalloc_small",

        AutoSizeResult..size_t("size"),
        Check(1)..nullable..size_t.p("block_size")
    )*/

    mi_heap_t.p(
        "heap_new",

        void()
    )

    void(
        "heap_delete",

        nullable..mi_heap_t.p("heap")
    )

    void(
        "heap_destroy",

        nullable..mi_heap_t.p("heap")
    )

    void(
        "heap_set_numa_affinity",

        mi_heap_t.p("heap"),
        int("numa_node")
    )

    void(
        "heap_collect",

        mi_heap_t.p("heap"),
        bool("force")
    )

    mi_heap_t.p(
        "heap_main",

        void()
    )

    mi_heap_t.p(
        "heap_of",

        Unsafe..nullable..void.const.p("p")
    )

    bool(
        "heap_contains",

        mi_heap_t.const.p("heap"),
        Unsafe..nullable..void.const.p("p")
    )

    bool(
        "any_heap_contains",

        Unsafe..nullable..void.const.p("p")
    )

    void.p(
        "heap_malloc",

        mi_heap_t.p("theap"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "heap_zalloc",

        mi_heap_t.p("heap"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "heap_calloc",

        mi_heap_t.p("heap"),
        AutoSizeResult..size_t("count"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "heap_mallocn",

        mi_heap_t.p("heap"),
        AutoSizeResult..size_t("count"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "heap_malloc_small",

        mi_heap_t.p("heap"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "heap_zalloc_small",

        mi_heap_t.p("heap"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "heap_realloc",

        mi_heap_t.p("heap"),
        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize")
    )

    void.p(
        "heap_reallocn",

        mi_heap_t.p("heap"),
        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("count"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "heap_reallocf",

        mi_heap_t.p("theap"),
        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize")
    )

    /*char.p(
        "heap_strdup",

        mi_heap_t.p("heap"),
        char.const.p("s")
    )

    char.p(
        "heap_strndup",

        mi_heap_t.p("heap"),
        char.const.p("s"),
        size_t("n")
    )

    char.p(
        "heap_realpath",

        mi_heap_t.p("heap"),
        char.const.p("fname"),
        char.p("resolved_name")
    )*/

    void.p(
        "heap_malloc_aligned",

        mi_heap_t.p("heap"),
        AutoSizeResult..size_t("size"),
        size_t("alignment")
    )

    void.p(
        "heap_malloc_aligned_at",

        mi_heap_t.p("heap"),
        AutoSizeResult..size_t("size"),
        size_t("alignment"),
        size_t("offset")
    )

    void.p(
        "heap_zalloc_aligned",

        mi_heap_t.p("heap"),
        AutoSizeResult..size_t("size"),
        size_t("alignment")
    )

    void.p(
        "heap_zalloc_aligned_at",

        mi_heap_t.p("heap"),
        AutoSizeResult..size_t("size"),
        size_t("alignment"),
        size_t("offset")
    )

    void.p(
        "heap_calloc_aligned",

        mi_heap_t.p("heap"),
        AutoSizeResult..size_t("count"),
        AutoSizeResult..size_t("size"),
        size_t("alignment")
    )

    void.p(
        "heap_calloc_aligned_at",

        mi_heap_t.p("heap"),
        AutoSizeResult..size_t("count"),
        AutoSizeResult..size_t("size"),
        size_t("alignment"),
        size_t("offset")
    )

    void.p(
        "heap_realloc_aligned",

        mi_heap_t.p("heap"),
        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize"),
        size_t("alignment")
    )

    void.p(
        "heap_realloc_aligned_at",

        mi_heap_t.p("heap"),
        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize"),
        size_t("alignment"),
        size_t("offset")
    )

    void.p(
        "rezalloc",

        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize")
    )

    void.p(
        "recalloc",

        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newcount"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "rezalloc_aligned",

        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize"),
        size_t("alignment")
    )

    void.p(
        "rezalloc_aligned_at",

        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize"),
        size_t("alignment"),
        size_t("offset")
    )

    void.p(
        "recalloc_aligned",

        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newcount"),
        AutoSizeResult..size_t("size"),
        size_t("alignment")
    )

    void.p(
        "recalloc_aligned_at",

        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newcount"),
        AutoSizeResult..size_t("size"),
        size_t("alignment"),
        size_t("offset")
    )

    void.p(
        "heap_rezalloc",

        mi_heap_t.p("heap"),
        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize")
    )

    void.p(
        "heap_recalloc",

        mi_heap_t.p("heap"),
        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newcount"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "heap_rezalloc_aligned",

        mi_heap_t.p("heap"),
        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize"),
        size_t("alignment")
    )

    void.p(
        "heap_rezalloc_aligned_at",

        mi_heap_t.p("heap"),
        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize"),
        size_t("alignment"),
        size_t("offset")
    )

    void.p(
        "heap_recalloc_aligned",

        mi_heap_t.p("heap"),
        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newcount"),
        AutoSizeResult..size_t("size"),
        size_t("alignment")
    )

    void.p(
        "heap_recalloc_aligned_at",

        mi_heap_t.p("heap"),
        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newcount"),
        AutoSizeResult..size_t("size"),
        size_t("alignment"),
        size_t("offset")
    )

    bool(
        "heap_visit_blocks",

        mi_heap_t.p("heap"),
        bool("visit_blocks"),
        mi_block_visit_fun("visitor"),
        nullable..opaque_p("arg")
    )

    bool(
        "heap_visit_abandoned_blocks",

        mi_heap_t.p("heap"),
        bool("visit_blocks"),
        mi_block_visit_fun("visitor"),
        nullable..opaque_p("arg")
    )

    bool(
        "is_redirected",

        void()
    )

    int(
        "reserve_huge_os_pages_interleave",

        size_t("pages"),
        size_t("numa_nodes"),
        size_t("timeout_msecs")
    )

    int(
        "reserve_huge_os_pages_at",

        size_t("pages"),
        int("numa_node"),
        size_t("timeout_msecs")
    )

    int(
        "reserve_os_memory",

        size_t("size"),
        bool("commit"),
        bool("allow_large")
    )

    bool(
        "manage_os_memory",

        void.p("start"),
        AutoSize("start")..size_t("size"),
        bool("is_committed"),
        bool("is_pinned"),
        bool("is_zero"),
        int("numa_node")
    )

    void(
        "debug_show_arenas",

        void()
    )

    void(
        "arenas_print",

        void()
    )

    size_t(
        "arena_min_alignment",

        void()
    )

    size_t(
        "arena_min_size",

        void()
    )

    void.p(
        "arena_area",

        mi_arena_id_t("arena_id"),
        AutoSizeResult..Check(1)..size_t.p("size")
    )

    int(
        "reserve_huge_os_pages_at_ex",

        size_t("pages"),
        int("numa_node"),
        size_t("timeout_msecs"),
        bool("exclusive"),
        Check(1)..nullable..mi_arena_id_t.p("arena_id")
    )

    int(
        "reserve_os_memory_ex",

        size_t("size"),
        bool("commit"),
        bool("allow_large"),
        bool("exclusive"),
        Check(1)..nullable..mi_arena_id_t.p("arena_id")
    )

    bool(
        "manage_os_memory_ex",

        void.p("start"),
        AutoSize("start")..size_t("size"),
        bool("is_committed"),
        bool("is_pinned"),
        bool("is_zero"),
        int("numa_node"),
        bool("exclusive"),
        Check(1)..nullable..mi_arena_id_t.p("arena_id")
    )

    bool(
        "arena_contains",

        mi_arena_id_t("arena_id"),
        Unsafe..nullable..void.const.p("p")
    )

    mi_heap_t.p(
        "heap_new_in_arena",

        mi_arena_id_t("arena_id")
    )

    mi_subproc_id_t(
        "subproc_main",

        void()
    )

    mi_subproc_id_t(
        "subproc_current",

        void()
    )

    mi_subproc_id_t(
        "subproc_new",

        void()
    )

    void(
        "subproc_destroy",

        mi_subproc_id_t("subproc")
    )

    void(
        "subproc_add_current_thread",

        mi_subproc_id_t("subproc")
    )

    bool(
        "subproc_visit_heaps",

        mi_subproc_id_t("subproc"),
        mi_heap_visit_fun("visitor"),
        nullable..opaque_p("arg")
    )

    mi_theap_t.p(
        "heap_theap",

        mi_heap_t.p("heap")
    )

    // TODO: not implemented yet?
    /*mi_theap_t.p(
        "theap_set_default",

        mi_theap_t.p("theap")
    )*/

    mi_theap_t.p(
        "theap_get_default",

        void()
    )

    void(
        "theap_collect",

        mi_theap_t.p("theap"),
        bool("force")
    )

    void.p(
        "theap_malloc",

        mi_theap_t.p("theap"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "theap_zalloc",

        mi_theap_t.p("theap"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "theap_calloc",

        mi_theap_t.p("theap"),
        AutoSizeResult..size_t("count"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "theap_malloc_small",

        mi_theap_t.p("theap"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "theap_zalloc_small",

        mi_theap_t.p("theap"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "theap_malloc_aligned",

        mi_theap_t.p("theap"),
        AutoSizeResult..size_t("size"),
        size_t("alignment")
    )

    void.p(
        "theap_realloc",

        mi_theap_t.p("theap"),
        Unsafe..nullable..void.p("p"),
        AutoSizeResult..size_t("newsize")
    )

    void(
        "theap_guarded_set_sample_rate",

        mi_theap_t.p("theap"),
        size_t("sample_rate"),
        size_t("seed")
    )

    void(
        "theap_guarded_set_size_bound",

        mi_theap_t.p("theap"),
        size_t("min"),
        size_t("max")
    )

    bool(
        "manage_memory",

        void.p("start"),
        AutoSize("start")..size_t("size"),
        bool("is_committed"),
        bool("is_pinned"),
        bool("is_zero"),
        int("numa_node"),
        bool("exclusive"),
        mi_commit_fun_t("commit_fun"),
        nullable..opaque_p("commit_fun_arg"),
        Check(1)..nullable..mi_arena_id_t.p("arena_id")
    )

    bool(
        "unsafe_heap_page_is_under_utilized",

        mi_heap_t.p("heap"),
        Unsafe..nullable..void.p("p"),
        size_t("perc_threshold")
    )

    bool(
        "option_is_enabled",

        mi_option_t("option")
    )

    void(
        "option_enable",

        mi_option_t("option")
    )

    void(
        "option_disable",

        mi_option_t("option")
    )

    void(
        "option_set_enabled",

        mi_option_t("option"),
        bool("enable")
    )

    void(
        "option_set_enabled_default",

        mi_option_t("option"),
        bool("enable")
    )

    long(
        "option_get",

        mi_option_t("option")
    )

    long(
        "option_get_clamp",

        mi_option_t("option"),
        long("min"),
        long("max")
    )

    size_t(
        "option_get_size",

        mi_option_t("option")
    )

    void(
        "option_set",

        mi_option_t("option"),
        long("value")
    )

    void(
        "option_set_default",

        mi_option_t("option"),
        long("value")
    )

    customMethod("""
    public static final class Allocator implements MemoryAllocator {
        @Override public long getMalloc()                              { return Functions.malloc; }
        @Override public long getCalloc()                              { return Functions.calloc; }
        @Override public long getRealloc()                             { return Functions.realloc; }
        @Override public long getFree()                                { return Functions.free; }
        @Override public long getAlignedAlloc()                        { return Functions.malloc_aligned; }
        @Override public long getAlignedFree()                         { return Functions.free; }

        @Override public long malloc(long size)                        { return nmi_malloc(size); }
        @Override public long calloc(long num, long size)              { return nmi_calloc(num, size); }
        @Override public long realloc(long ptr, long size)             { return nmi_realloc(ptr, size); }
        @Override public void free(long ptr)                           { nmi_free(ptr); }
        @Override public long aligned_alloc(long alignment, long size) { return nmi_malloc_aligned(size, alignment); }
        @Override public void aligned_free(long ptr)                   { nmi_free(ptr); }
    }""")
}