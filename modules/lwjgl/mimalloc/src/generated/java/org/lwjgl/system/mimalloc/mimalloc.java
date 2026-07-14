/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.mimalloc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class mimalloc {

    private static final SharedLibrary MIMALLOC = Library.loadNative(mimalloc.class, "org.lwjgl.mimalloc", Configuration.MIMALLOC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("mimalloc")), true);

    /** Contains the function pointers loaded from the mimalloc {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            malloc                             = apiGetFunctionAddress(MIMALLOC, "mi_malloc"),
            calloc                             = apiGetFunctionAddress(MIMALLOC, "mi_calloc"),
            realloc                            = apiGetFunctionAddress(MIMALLOC, "mi_realloc"),
            expand                             = apiGetFunctionAddress(MIMALLOC, "mi_expand"),
            free                               = apiGetFunctionAddress(MIMALLOC, "mi_free"),
            malloc_small                       = apiGetFunctionAddress(MIMALLOC, "mi_malloc_small"),
            zalloc_small                       = apiGetFunctionAddress(MIMALLOC, "mi_zalloc_small"),
            zalloc                             = apiGetFunctionAddress(MIMALLOC, "mi_zalloc"),
            mallocn                            = apiGetFunctionAddress(MIMALLOC, "mi_mallocn"),
            reallocn                           = apiGetFunctionAddress(MIMALLOC, "mi_reallocn"),
            reallocf                           = apiGetFunctionAddress(MIMALLOC, "mi_reallocf"),
            usable_size                        = apiGetFunctionAddress(MIMALLOC, "mi_usable_size"),
            good_size                          = apiGetFunctionAddress(MIMALLOC, "mi_good_size"),
            free_small                         = apiGetFunctionAddress(MIMALLOC, "mi_free_small"),
            malloc_aligned                     = apiGetFunctionAddress(MIMALLOC, "mi_malloc_aligned"),
            malloc_aligned_at                  = apiGetFunctionAddress(MIMALLOC, "mi_malloc_aligned_at"),
            zalloc_aligned                     = apiGetFunctionAddress(MIMALLOC, "mi_zalloc_aligned"),
            zalloc_aligned_at                  = apiGetFunctionAddress(MIMALLOC, "mi_zalloc_aligned_at"),
            calloc_aligned                     = apiGetFunctionAddress(MIMALLOC, "mi_calloc_aligned"),
            calloc_aligned_at                  = apiGetFunctionAddress(MIMALLOC, "mi_calloc_aligned_at"),
            realloc_aligned                    = apiGetFunctionAddress(MIMALLOC, "mi_realloc_aligned"),
            realloc_aligned_at                 = apiGetFunctionAddress(MIMALLOC, "mi_realloc_aligned_at"),
            register_deferred_free             = apiGetFunctionAddress(MIMALLOC, "mi_register_deferred_free"),
            register_output                    = apiGetFunctionAddress(MIMALLOC, "mi_register_output"),
            register_error                     = apiGetFunctionAddress(MIMALLOC, "mi_register_error"),
            collect                            = apiGetFunctionAddress(MIMALLOC, "mi_collect"),
            version                            = apiGetFunctionAddress(MIMALLOC, "mi_version"),
            options_print                      = apiGetFunctionAddress(MIMALLOC, "mi_options_print"),
            process_info_print                 = apiGetFunctionAddress(MIMALLOC, "mi_process_info_print"),
            options_print_out                  = apiGetFunctionAddress(MIMALLOC, "mi_options_print_out"),
            process_info_print_out             = apiGetFunctionAddress(MIMALLOC, "mi_process_info_print_out"),
            process_info                       = apiGetFunctionAddress(MIMALLOC, "mi_process_info"),
            process_init                       = apiGetFunctionAddress(MIMALLOC, "mi_process_init"),
            process_done                       = apiGetFunctionAddress(MIMALLOC, "mi_process_done"),
            thread_init                        = apiGetFunctionAddress(MIMALLOC, "mi_thread_init"),
            thread_done                        = apiGetFunctionAddress(MIMALLOC, "mi_thread_done"),
            thread_set_in_threadpool           = apiGetFunctionAddress(MIMALLOC, "mi_thread_set_in_threadpool"),
            umalloc                            = apiGetFunctionAddress(MIMALLOC, "mi_umalloc"),
            ucalloc                            = apiGetFunctionAddress(MIMALLOC, "mi_ucalloc"),
            urealloc                           = apiGetFunctionAddress(MIMALLOC, "mi_urealloc"),
            ufree                              = apiGetFunctionAddress(MIMALLOC, "mi_ufree"),
            umalloc_aligned                    = apiGetFunctionAddress(MIMALLOC, "mi_umalloc_aligned"),
            uzalloc_aligned                    = apiGetFunctionAddress(MIMALLOC, "mi_uzalloc_aligned"),
            umalloc_small                      = apiGetFunctionAddress(MIMALLOC, "mi_umalloc_small"),
            heap_new                           = apiGetFunctionAddress(MIMALLOC, "mi_heap_new"),
            heap_delete                        = apiGetFunctionAddress(MIMALLOC, "mi_heap_delete"),
            heap_destroy                       = apiGetFunctionAddress(MIMALLOC, "mi_heap_destroy"),
            heap_set_numa_affinity             = apiGetFunctionAddress(MIMALLOC, "mi_heap_set_numa_affinity"),
            heap_collect                       = apiGetFunctionAddress(MIMALLOC, "mi_heap_collect"),
            heap_main                          = apiGetFunctionAddress(MIMALLOC, "mi_heap_main"),
            heap_of                            = apiGetFunctionAddress(MIMALLOC, "mi_heap_of"),
            heap_contains                      = apiGetFunctionAddress(MIMALLOC, "mi_heap_contains"),
            any_heap_contains                  = apiGetFunctionAddress(MIMALLOC, "mi_any_heap_contains"),
            heap_malloc                        = apiGetFunctionAddress(MIMALLOC, "mi_heap_malloc"),
            heap_zalloc                        = apiGetFunctionAddress(MIMALLOC, "mi_heap_zalloc"),
            heap_calloc                        = apiGetFunctionAddress(MIMALLOC, "mi_heap_calloc"),
            heap_mallocn                       = apiGetFunctionAddress(MIMALLOC, "mi_heap_mallocn"),
            heap_malloc_small                  = apiGetFunctionAddress(MIMALLOC, "mi_heap_malloc_small"),
            heap_zalloc_small                  = apiGetFunctionAddress(MIMALLOC, "mi_heap_zalloc_small"),
            heap_realloc                       = apiGetFunctionAddress(MIMALLOC, "mi_heap_realloc"),
            heap_reallocn                      = apiGetFunctionAddress(MIMALLOC, "mi_heap_reallocn"),
            heap_reallocf                      = apiGetFunctionAddress(MIMALLOC, "mi_heap_reallocf"),
            heap_malloc_aligned                = apiGetFunctionAddress(MIMALLOC, "mi_heap_malloc_aligned"),
            heap_malloc_aligned_at             = apiGetFunctionAddress(MIMALLOC, "mi_heap_malloc_aligned_at"),
            heap_zalloc_aligned                = apiGetFunctionAddress(MIMALLOC, "mi_heap_zalloc_aligned"),
            heap_zalloc_aligned_at             = apiGetFunctionAddress(MIMALLOC, "mi_heap_zalloc_aligned_at"),
            heap_calloc_aligned                = apiGetFunctionAddress(MIMALLOC, "mi_heap_calloc_aligned"),
            heap_calloc_aligned_at             = apiGetFunctionAddress(MIMALLOC, "mi_heap_calloc_aligned_at"),
            heap_realloc_aligned               = apiGetFunctionAddress(MIMALLOC, "mi_heap_realloc_aligned"),
            heap_realloc_aligned_at            = apiGetFunctionAddress(MIMALLOC, "mi_heap_realloc_aligned_at"),
            rezalloc                           = apiGetFunctionAddress(MIMALLOC, "mi_rezalloc"),
            recalloc                           = apiGetFunctionAddress(MIMALLOC, "mi_recalloc"),
            rezalloc_aligned                   = apiGetFunctionAddress(MIMALLOC, "mi_rezalloc_aligned"),
            rezalloc_aligned_at                = apiGetFunctionAddress(MIMALLOC, "mi_rezalloc_aligned_at"),
            recalloc_aligned                   = apiGetFunctionAddress(MIMALLOC, "mi_recalloc_aligned"),
            recalloc_aligned_at                = apiGetFunctionAddress(MIMALLOC, "mi_recalloc_aligned_at"),
            heap_rezalloc                      = apiGetFunctionAddress(MIMALLOC, "mi_heap_rezalloc"),
            heap_recalloc                      = apiGetFunctionAddress(MIMALLOC, "mi_heap_recalloc"),
            heap_rezalloc_aligned              = apiGetFunctionAddress(MIMALLOC, "mi_heap_rezalloc_aligned"),
            heap_rezalloc_aligned_at           = apiGetFunctionAddress(MIMALLOC, "mi_heap_rezalloc_aligned_at"),
            heap_recalloc_aligned              = apiGetFunctionAddress(MIMALLOC, "mi_heap_recalloc_aligned"),
            heap_recalloc_aligned_at           = apiGetFunctionAddress(MIMALLOC, "mi_heap_recalloc_aligned_at"),
            heap_visit_blocks                  = apiGetFunctionAddress(MIMALLOC, "mi_heap_visit_blocks"),
            heap_visit_abandoned_blocks        = apiGetFunctionAddress(MIMALLOC, "mi_heap_visit_abandoned_blocks"),
            is_redirected                      = apiGetFunctionAddress(MIMALLOC, "mi_is_redirected"),
            reserve_huge_os_pages_interleave   = apiGetFunctionAddress(MIMALLOC, "mi_reserve_huge_os_pages_interleave"),
            reserve_huge_os_pages_at           = apiGetFunctionAddress(MIMALLOC, "mi_reserve_huge_os_pages_at"),
            reserve_os_memory                  = apiGetFunctionAddress(MIMALLOC, "mi_reserve_os_memory"),
            manage_os_memory                   = apiGetFunctionAddress(MIMALLOC, "mi_manage_os_memory"),
            debug_show_arenas                  = apiGetFunctionAddress(MIMALLOC, "mi_debug_show_arenas"),
            arenas_print                       = apiGetFunctionAddress(MIMALLOC, "mi_arenas_print"),
            arena_min_alignment                = apiGetFunctionAddress(MIMALLOC, "mi_arena_min_alignment"),
            arena_min_size                     = apiGetFunctionAddress(MIMALLOC, "mi_arena_min_size"),
            arena_area                         = apiGetFunctionAddress(MIMALLOC, "mi_arena_area"),
            reserve_huge_os_pages_at_ex        = apiGetFunctionAddress(MIMALLOC, "mi_reserve_huge_os_pages_at_ex"),
            reserve_os_memory_ex               = apiGetFunctionAddress(MIMALLOC, "mi_reserve_os_memory_ex"),
            manage_os_memory_ex                = apiGetFunctionAddress(MIMALLOC, "mi_manage_os_memory_ex"),
            arena_contains                     = apiGetFunctionAddress(MIMALLOC, "mi_arena_contains"),
            heap_new_in_arena                  = apiGetFunctionAddress(MIMALLOC, "mi_heap_new_in_arena"),
            subproc_main                       = apiGetFunctionAddress(MIMALLOC, "mi_subproc_main"),
            subproc_current                    = apiGetFunctionAddress(MIMALLOC, "mi_subproc_current"),
            subproc_new                        = apiGetFunctionAddress(MIMALLOC, "mi_subproc_new"),
            subproc_destroy                    = apiGetFunctionAddress(MIMALLOC, "mi_subproc_destroy"),
            subproc_add_current_thread         = apiGetFunctionAddress(MIMALLOC, "mi_subproc_add_current_thread"),
            subproc_visit_heaps                = apiGetFunctionAddress(MIMALLOC, "mi_subproc_visit_heaps"),
            heap_theap                         = apiGetFunctionAddress(MIMALLOC, "mi_heap_theap"),
            theap_get_default                  = apiGetFunctionAddress(MIMALLOC, "mi_theap_get_default"),
            theap_collect                      = apiGetFunctionAddress(MIMALLOC, "mi_theap_collect"),
            theap_malloc                       = apiGetFunctionAddress(MIMALLOC, "mi_theap_malloc"),
            theap_zalloc                       = apiGetFunctionAddress(MIMALLOC, "mi_theap_zalloc"),
            theap_calloc                       = apiGetFunctionAddress(MIMALLOC, "mi_theap_calloc"),
            theap_malloc_small                 = apiGetFunctionAddress(MIMALLOC, "mi_theap_malloc_small"),
            theap_zalloc_small                 = apiGetFunctionAddress(MIMALLOC, "mi_theap_zalloc_small"),
            theap_malloc_aligned               = apiGetFunctionAddress(MIMALLOC, "mi_theap_malloc_aligned"),
            theap_realloc                      = apiGetFunctionAddress(MIMALLOC, "mi_theap_realloc"),
            theap_guarded_set_sample_rate      = apiGetFunctionAddress(MIMALLOC, "mi_theap_guarded_set_sample_rate"),
            theap_guarded_set_size_bound       = apiGetFunctionAddress(MIMALLOC, "mi_theap_guarded_set_size_bound"),
            manage_memory                      = apiGetFunctionAddress(MIMALLOC, "mi_manage_memory"),
            unsafe_heap_page_is_under_utilized = apiGetFunctionAddress(MIMALLOC, "mi_unsafe_heap_page_is_under_utilized"),
            option_is_enabled                  = apiGetFunctionAddress(MIMALLOC, "mi_option_is_enabled"),
            option_enable                      = apiGetFunctionAddress(MIMALLOC, "mi_option_enable"),
            option_disable                     = apiGetFunctionAddress(MIMALLOC, "mi_option_disable"),
            option_set_enabled                 = apiGetFunctionAddress(MIMALLOC, "mi_option_set_enabled"),
            option_set_enabled_default         = apiGetFunctionAddress(MIMALLOC, "mi_option_set_enabled_default"),
            option_get                         = apiGetFunctionAddress(MIMALLOC, "mi_option_get"),
            option_get_clamp                   = apiGetFunctionAddress(MIMALLOC, "mi_option_get_clamp"),
            option_get_size                    = apiGetFunctionAddress(MIMALLOC, "mi_option_get_size"),
            option_set                         = apiGetFunctionAddress(MIMALLOC, "mi_option_set"),
            option_set_default                 = apiGetFunctionAddress(MIMALLOC, "mi_option_set_default"),
            aligned_alloc                      = apiGetFunctionAddress(MIMALLOC, "mi_aligned_alloc");

    }

    /** Returns the mimalloc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return MIMALLOC;
    }

    public static final int MI_MALLOC_VERSION = 30302;

    public static final int
        MI_SMALL_WSIZE_MAX = 128,
        MI_SMALL_SIZE_MAX  = MI_SMALL_WSIZE_MAX * Pointer.POINTER_SIZE;

    public static final int
        mi_option_show_errors                     = 0,
        mi_option_show_stats                      = 1,
        mi_option_verbose                         = 2,
        mi_option_deprecated_eager_commit         = 3,
        mi_option_arena_eager_commit              = 4,
        mi_option_purge_decommits                 = 5,
        mi_option_allow_large_os_pages            = 6,
        mi_option_reserve_huge_os_pages           = 7,
        mi_option_reserve_huge_os_pages_at        = 8,
        mi_option_reserve_os_memory               = 9,
        mi_option_deprecated_segment_cache        = 10,
        mi_option_deprecated_page_reset           = 11,
        mi_option_deprecated_abandoned_page_purge = 12,
        mi_option_deprecated_segment_reset        = 13,
        mi_option_deprecated_eager_commit_delay   = 14,
        mi_option_purge_delay                     = 15,
        mi_option_use_numa_nodes                  = 16,
        mi_option_disallow_os_alloc               = 17,
        mi_option_os_tag                          = 18,
        mi_option_max_errors                      = 19,
        mi_option_max_warnings                    = 20,
        mi_option_deprecated_max_segment_reclaim  = 21,
        mi_option_destroy_on_exit                 = 22,
        mi_option_arena_reserve                   = 23,
        mi_option_arena_purge_mult                = 24,
        mi_option_deprecated_purge_extend_delay   = 25,
        mi_option_disallow_arena_alloc            = 26,
        mi_option_retry_on_oom                    = 27,
        mi_option_visit_abandoned                 = 28,
        mi_option_guarded_min                     = 29,
        mi_option_guarded_max                     = 30,
        mi_option_guarded_precise                 = 31,
        mi_option_guarded_sample_rate             = 32,
        mi_option_guarded_sample_seed             = 33,
        mi_option_generic_collect                 = 34,
        mi_option_page_reclaim_on_free            = 35,
        mi_option_page_full_retain                = 36,
        mi_option_page_max_candidates             = 37,
        mi_option_max_vabits                      = 38,
        mi_option_pagemap_commit                  = 39,
        mi_option_page_commit_on_demand           = 40,
        mi_option_page_max_reclaim                = 41,
        mi_option_page_cross_thread_max_reclaim   = 42,
        mi_option_allow_thp                       = 43,
        mi_option_minimal_purge_size              = 44,
        mi_option_arena_max_object_size           = 45,
        mi_option_arena_is_numa_local             = 46;

    protected mimalloc() {
        throw new UnsupportedOperationException();
    }

    // --- [ mi_malloc ] ---

    /** {@code void * mi_malloc(size_t size)} */
    public static long nmi_malloc(long size) {
        long __functionAddress = Functions.malloc;
        return invokePP(size, __functionAddress);
    }

    /** {@code void * mi_malloc(size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_malloc(@NativeType("size_t") long size) {
        long __result = nmi_malloc(size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_calloc ] ---

    /** {@code void * mi_calloc(size_t count, size_t size)} */
    public static long nmi_calloc(long count, long size) {
        long __functionAddress = Functions.calloc;
        return invokePPP(count, size, __functionAddress);
    }

    /** {@code void * mi_calloc(size_t count, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_calloc(@NativeType("size_t") long count, @NativeType("size_t") long size) {
        long __result = nmi_calloc(count, size);
        return memByteBufferSafe(__result, (int)count * (int)size);
    }

    // --- [ mi_realloc ] ---

    /** {@code void * mi_realloc(void * p, size_t newsize)} */
    public static long nmi_realloc(long p, long newsize) {
        long __functionAddress = Functions.realloc;
        return invokePPP(p, newsize, __functionAddress);
    }

    /** {@code void * mi_realloc(void * p, size_t newsize)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_realloc(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize) {
        long __result = nmi_realloc(memAddressSafe(p), newsize);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_expand ] ---

    /** {@code void * mi_expand(void * p, size_t newsize)} */
    public static long nmi_expand(long p, long newsize) {
        long __functionAddress = Functions.expand;
        return invokePPP(p, newsize, __functionAddress);
    }

    /** {@code void * mi_expand(void * p, size_t newsize)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_expand(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize) {
        long __result = nmi_expand(memAddressSafe(p), newsize);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_free ] ---

    /** {@code void mi_free(void * p)} */
    public static void nmi_free(long p) {
        long __functionAddress = Functions.free;
        invokePV(p, __functionAddress);
    }

    /** {@code void mi_free(void * p)} */
    public static void mi_free(@NativeType("void *") @Nullable ByteBuffer p) {
        nmi_free(memAddressSafe(p));
    }

    /** {@code void mi_free(void * p)} */
    public static void mi_free(@NativeType("void *") @Nullable ShortBuffer p) {
        nmi_free(memAddressSafe(p));
    }

    /** {@code void mi_free(void * p)} */
    public static void mi_free(@NativeType("void *") @Nullable IntBuffer p) {
        nmi_free(memAddressSafe(p));
    }

    /** {@code void mi_free(void * p)} */
    public static void mi_free(@NativeType("void *") @Nullable LongBuffer p) {
        nmi_free(memAddressSafe(p));
    }

    /** {@code void mi_free(void * p)} */
    public static void mi_free(@NativeType("void *") @Nullable FloatBuffer p) {
        nmi_free(memAddressSafe(p));
    }

    /** {@code void mi_free(void * p)} */
    public static void mi_free(@NativeType("void *") @Nullable DoubleBuffer p) {
        nmi_free(memAddressSafe(p));
    }

    /** {@code void mi_free(void * p)} */
    public static void mi_free(@NativeType("void *") @Nullable PointerBuffer p) {
        nmi_free(memAddressSafe(p));
    }

    // --- [ mi_malloc_small ] ---

    /** {@code void * mi_malloc_small(size_t size)} */
    public static long nmi_malloc_small(long size) {
        long __functionAddress = Functions.malloc_small;
        return invokePP(size, __functionAddress);
    }

    /** {@code void * mi_malloc_small(size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_malloc_small(@NativeType("size_t") long size) {
        long __result = nmi_malloc_small(size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_zalloc_small ] ---

    /** {@code void * mi_zalloc_small(size_t size)} */
    public static long nmi_zalloc_small(long size) {
        long __functionAddress = Functions.zalloc_small;
        return invokePP(size, __functionAddress);
    }

    /** {@code void * mi_zalloc_small(size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_zalloc_small(@NativeType("size_t") long size) {
        long __result = nmi_zalloc_small(size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_zalloc ] ---

    /** {@code void * mi_zalloc(size_t size)} */
    public static long nmi_zalloc(long size) {
        long __functionAddress = Functions.zalloc;
        return invokePP(size, __functionAddress);
    }

    /** {@code void * mi_zalloc(size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_zalloc(@NativeType("size_t") long size) {
        long __result = nmi_zalloc(size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_mallocn ] ---

    /** {@code void * mi_mallocn(size_t count, size_t size)} */
    public static long nmi_mallocn(long count, long size) {
        long __functionAddress = Functions.mallocn;
        return invokePPP(count, size, __functionAddress);
    }

    /** {@code void * mi_mallocn(size_t count, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_mallocn(@NativeType("size_t") long count, @NativeType("size_t") long size) {
        long __result = nmi_mallocn(count, size);
        return memByteBufferSafe(__result, (int)count * (int)size);
    }

    // --- [ mi_reallocn ] ---

    /** {@code void * mi_reallocn(void * p, size_t count, size_t size)} */
    public static long nmi_reallocn(long p, long count, long size) {
        long __functionAddress = Functions.reallocn;
        return invokePPPP(p, count, size, __functionAddress);
    }

    /** {@code void * mi_reallocn(void * p, size_t count, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_reallocn(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long count, @NativeType("size_t") long size) {
        long __result = nmi_reallocn(memAddressSafe(p), count, size);
        return memByteBufferSafe(__result, (int)count * (int)size);
    }

    // --- [ mi_reallocf ] ---

    /** {@code void * mi_reallocf(void * p, size_t newsize)} */
    public static long nmi_reallocf(long p, long newsize) {
        long __functionAddress = Functions.reallocf;
        return invokePPP(p, newsize, __functionAddress);
    }

    /** {@code void * mi_reallocf(void * p, size_t newsize)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_reallocf(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize) {
        long __result = nmi_reallocf(memAddressSafe(p), newsize);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_usable_size ] ---

    /** {@code size_t mi_usable_size(void const * p)} */
    public static long nmi_usable_size(long p) {
        long __functionAddress = Functions.usable_size;
        return invokePP(p, __functionAddress);
    }

    /** {@code size_t mi_usable_size(void const * p)} */
    @NativeType("size_t")
    public static long mi_usable_size(@NativeType("void const *") @Nullable ByteBuffer p) {
        return nmi_usable_size(memAddressSafe(p));
    }

    // --- [ mi_good_size ] ---

    /** {@code size_t mi_good_size(size_t size)} */
    @NativeType("size_t")
    public static long mi_good_size(@NativeType("size_t") long size) {
        long __functionAddress = Functions.good_size;
        return invokePP(size, __functionAddress);
    }

    // --- [ mi_free_small ] ---

    /** {@code void mi_free_small(void * p)} */
    public static void nmi_free_small(long p) {
        long __functionAddress = Functions.free_small;
        invokePV(p, __functionAddress);
    }

    /** {@code void mi_free_small(void * p)} */
    public static void mi_free_small(@NativeType("void *") @Nullable ByteBuffer p) {
        nmi_free_small(memAddressSafe(p));
    }

    /** {@code void mi_free_small(void * p)} */
    public static void mi_free_small(@NativeType("void *") @Nullable ShortBuffer p) {
        nmi_free_small(memAddressSafe(p));
    }

    /** {@code void mi_free_small(void * p)} */
    public static void mi_free_small(@NativeType("void *") @Nullable IntBuffer p) {
        nmi_free_small(memAddressSafe(p));
    }

    /** {@code void mi_free_small(void * p)} */
    public static void mi_free_small(@NativeType("void *") @Nullable LongBuffer p) {
        nmi_free_small(memAddressSafe(p));
    }

    /** {@code void mi_free_small(void * p)} */
    public static void mi_free_small(@NativeType("void *") @Nullable FloatBuffer p) {
        nmi_free_small(memAddressSafe(p));
    }

    /** {@code void mi_free_small(void * p)} */
    public static void mi_free_small(@NativeType("void *") @Nullable DoubleBuffer p) {
        nmi_free_small(memAddressSafe(p));
    }

    /** {@code void mi_free_small(void * p)} */
    public static void mi_free_small(@NativeType("void *") @Nullable PointerBuffer p) {
        nmi_free_small(memAddressSafe(p));
    }

    // --- [ mi_malloc_aligned ] ---

    /** {@code void * mi_malloc_aligned(size_t size, size_t alignment)} */
    public static long nmi_malloc_aligned(long size, long alignment) {
        long __functionAddress = Functions.malloc_aligned;
        return invokePPP(size, alignment, __functionAddress);
    }

    /** {@code void * mi_malloc_aligned(size_t size, size_t alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_malloc_aligned(@NativeType("size_t") long size, @NativeType("size_t") long alignment) {
        long __result = nmi_malloc_aligned(size, alignment);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_malloc_aligned_at ] ---

    /** {@code void * mi_malloc_aligned_at(size_t size, size_t alignment, size_t offset)} */
    public static long nmi_malloc_aligned_at(long size, long alignment, long offset) {
        long __functionAddress = Functions.malloc_aligned_at;
        return invokePPPP(size, alignment, offset, __functionAddress);
    }

    /** {@code void * mi_malloc_aligned_at(size_t size, size_t alignment, size_t offset)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_malloc_aligned_at(@NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("size_t") long offset) {
        long __result = nmi_malloc_aligned_at(size, alignment, offset);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_zalloc_aligned ] ---

    /** {@code void * mi_zalloc_aligned(size_t size, size_t alignment)} */
    public static long nmi_zalloc_aligned(long size, long alignment) {
        long __functionAddress = Functions.zalloc_aligned;
        return invokePPP(size, alignment, __functionAddress);
    }

    /** {@code void * mi_zalloc_aligned(size_t size, size_t alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_zalloc_aligned(@NativeType("size_t") long size, @NativeType("size_t") long alignment) {
        long __result = nmi_zalloc_aligned(size, alignment);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_zalloc_aligned_at ] ---

    /** {@code void * mi_zalloc_aligned_at(size_t size, size_t alignment, size_t offset)} */
    public static long nmi_zalloc_aligned_at(long size, long alignment, long offset) {
        long __functionAddress = Functions.zalloc_aligned_at;
        return invokePPPP(size, alignment, offset, __functionAddress);
    }

    /** {@code void * mi_zalloc_aligned_at(size_t size, size_t alignment, size_t offset)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_zalloc_aligned_at(@NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("size_t") long offset) {
        long __result = nmi_zalloc_aligned_at(size, alignment, offset);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_calloc_aligned ] ---

    /** {@code void * mi_calloc_aligned(size_t count, size_t size, size_t alignment)} */
    public static long nmi_calloc_aligned(long count, long size, long alignment) {
        long __functionAddress = Functions.calloc_aligned;
        return invokePPPP(count, size, alignment, __functionAddress);
    }

    /** {@code void * mi_calloc_aligned(size_t count, size_t size, size_t alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_calloc_aligned(@NativeType("size_t") long count, @NativeType("size_t") long size, @NativeType("size_t") long alignment) {
        long __result = nmi_calloc_aligned(count, size, alignment);
        return memByteBufferSafe(__result, (int)count * (int)size);
    }

    // --- [ mi_calloc_aligned_at ] ---

    /** {@code void * mi_calloc_aligned_at(size_t count, size_t size, size_t alignment, size_t offset)} */
    public static long nmi_calloc_aligned_at(long count, long size, long alignment, long offset) {
        long __functionAddress = Functions.calloc_aligned_at;
        return invokePPPPP(count, size, alignment, offset, __functionAddress);
    }

    /** {@code void * mi_calloc_aligned_at(size_t count, size_t size, size_t alignment, size_t offset)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_calloc_aligned_at(@NativeType("size_t") long count, @NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("size_t") long offset) {
        long __result = nmi_calloc_aligned_at(count, size, alignment, offset);
        return memByteBufferSafe(__result, (int)count * (int)size);
    }

    // --- [ mi_realloc_aligned ] ---

    /** {@code void * mi_realloc_aligned(void * p, size_t newsize, size_t alignment)} */
    public static long nmi_realloc_aligned(long p, long newsize, long alignment) {
        long __functionAddress = Functions.realloc_aligned;
        return invokePPPP(p, newsize, alignment, __functionAddress);
    }

    /** {@code void * mi_realloc_aligned(void * p, size_t newsize, size_t alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_realloc_aligned(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize, @NativeType("size_t") long alignment) {
        long __result = nmi_realloc_aligned(memAddressSafe(p), newsize, alignment);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_realloc_aligned_at ] ---

    /** {@code void * mi_realloc_aligned_at(void * p, size_t newsize, size_t alignment, size_t offset)} */
    public static long nmi_realloc_aligned_at(long p, long newsize, long alignment, long offset) {
        long __functionAddress = Functions.realloc_aligned_at;
        return invokePPPPP(p, newsize, alignment, offset, __functionAddress);
    }

    /** {@code void * mi_realloc_aligned_at(void * p, size_t newsize, size_t alignment, size_t offset)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_realloc_aligned_at(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize, @NativeType("size_t") long alignment, @NativeType("size_t") long offset) {
        long __result = nmi_realloc_aligned_at(memAddressSafe(p), newsize, alignment, offset);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_register_deferred_free ] ---

    /** {@code void mi_register_deferred_free(mi_deferred_free_fun deferred_free, void * arg)} */
    public static void nmi_register_deferred_free(long deferred_free, long arg) {
        long __functionAddress = Functions.register_deferred_free;
        invokePPV(deferred_free, arg, __functionAddress);
    }

    /** {@code void mi_register_deferred_free(mi_deferred_free_fun deferred_free, void * arg)} */
    public static void mi_register_deferred_free(@NativeType("mi_deferred_free_fun") @Nullable mi_deferred_free_funI deferred_free, @NativeType("void *") long arg) {
        nmi_register_deferred_free(memAddressSafe(deferred_free), arg);
    }

    // --- [ mi_register_output ] ---

    /** {@code void mi_register_output(mi_output_fun out, void * arg)} */
    public static void nmi_register_output(long out, long arg) {
        long __functionAddress = Functions.register_output;
        invokePPV(out, arg, __functionAddress);
    }

    /** {@code void mi_register_output(mi_output_fun out, void * arg)} */
    public static void mi_register_output(@NativeType("mi_output_fun") @Nullable mi_output_funI out, @NativeType("void *") long arg) {
        nmi_register_output(memAddressSafe(out), arg);
    }

    // --- [ mi_register_error ] ---

    /** {@code void mi_register_error(mi_error_fun fun, void * arg)} */
    public static void nmi_register_error(long fun, long arg) {
        long __functionAddress = Functions.register_error;
        invokePPV(fun, arg, __functionAddress);
    }

    /** {@code void mi_register_error(mi_error_fun fun, void * arg)} */
    public static void mi_register_error(@NativeType("mi_error_fun") @Nullable mi_error_funI fun, @NativeType("void *") long arg) {
        nmi_register_error(memAddressSafe(fun), arg);
    }

    // --- [ mi_collect ] ---

    /** {@code void mi_collect(bool force)} */
    public static void mi_collect(@NativeType("bool") boolean force) {
        long __functionAddress = Functions.collect;
        invokeV(force, __functionAddress);
    }

    // --- [ mi_version ] ---

    /** {@code int mi_version(void)} */
    public static int mi_version() {
        long __functionAddress = Functions.version;
        return invokeI(__functionAddress);
    }

    // --- [ mi_options_print ] ---

    /** {@code void mi_options_print(void)} */
    public static void mi_options_print() {
        long __functionAddress = Functions.options_print;
        invokeV(__functionAddress);
    }

    // --- [ mi_process_info_print ] ---

    /** {@code void mi_process_info_print(void)} */
    public static void mi_process_info_print() {
        long __functionAddress = Functions.process_info_print;
        invokeV(__functionAddress);
    }

    // --- [ mi_options_print_out ] ---

    /** {@code void mi_options_print_out(mi_output_fun out, void * arg)} */
    public static void nmi_options_print_out(long out, long arg) {
        long __functionAddress = Functions.options_print_out;
        invokePPV(out, arg, __functionAddress);
    }

    /** {@code void mi_options_print_out(mi_output_fun out, void * arg)} */
    public static void mi_options_print_out(@NativeType("mi_output_fun") @Nullable mi_output_funI out, @NativeType("void *") long arg) {
        nmi_options_print_out(memAddressSafe(out), arg);
    }

    // --- [ mi_process_info_print_out ] ---

    /** {@code void mi_process_info_print_out(mi_output_fun out, void * arg)} */
    public static void nmi_process_info_print_out(long out, long arg) {
        long __functionAddress = Functions.process_info_print_out;
        invokePPV(out, arg, __functionAddress);
    }

    /** {@code void mi_process_info_print_out(mi_output_fun out, void * arg)} */
    public static void mi_process_info_print_out(@NativeType("mi_output_fun") @Nullable mi_output_funI out, @NativeType("void *") long arg) {
        nmi_process_info_print_out(memAddressSafe(out), arg);
    }

    // --- [ mi_process_info ] ---

    /** {@code void mi_process_info(size_t * elapsed_msecs, size_t * user_msecs, size_t * system_msecs, size_t * current_rss, size_t * peak_rss, size_t * current_commit, size_t * peak_commit, size_t * page_faults)} */
    public static void nmi_process_info(long elapsed_msecs, long user_msecs, long system_msecs, long current_rss, long peak_rss, long current_commit, long peak_commit, long page_faults) {
        long __functionAddress = Functions.process_info;
        invokePPPPPPPPV(elapsed_msecs, user_msecs, system_msecs, current_rss, peak_rss, current_commit, peak_commit, page_faults, __functionAddress);
    }

    /** {@code void mi_process_info(size_t * elapsed_msecs, size_t * user_msecs, size_t * system_msecs, size_t * current_rss, size_t * peak_rss, size_t * current_commit, size_t * peak_commit, size_t * page_faults)} */
    public static void mi_process_info(@NativeType("size_t *") @Nullable PointerBuffer elapsed_msecs, @NativeType("size_t *") @Nullable PointerBuffer user_msecs, @NativeType("size_t *") @Nullable PointerBuffer system_msecs, @NativeType("size_t *") @Nullable PointerBuffer current_rss, @NativeType("size_t *") @Nullable PointerBuffer peak_rss, @NativeType("size_t *") @Nullable PointerBuffer current_commit, @NativeType("size_t *") @Nullable PointerBuffer peak_commit, @NativeType("size_t *") @Nullable PointerBuffer page_faults) {
        if (CHECKS) {
            checkSafe(elapsed_msecs, 1);
            checkSafe(user_msecs, 1);
            checkSafe(system_msecs, 1);
            checkSafe(current_rss, 1);
            checkSafe(peak_rss, 1);
            checkSafe(current_commit, 1);
            checkSafe(peak_commit, 1);
            checkSafe(page_faults, 1);
        }
        nmi_process_info(memAddressSafe(elapsed_msecs), memAddressSafe(user_msecs), memAddressSafe(system_msecs), memAddressSafe(current_rss), memAddressSafe(peak_rss), memAddressSafe(current_commit), memAddressSafe(peak_commit), memAddressSafe(page_faults));
    }

    // --- [ mi_process_init ] ---

    /** {@code void mi_process_init(void)} */
    public static void mi_process_init() {
        long __functionAddress = Functions.process_init;
        invokeV(__functionAddress);
    }

    // --- [ mi_process_done ] ---

    /** {@code void mi_process_done(void)} */
    public static void mi_process_done() {
        long __functionAddress = Functions.process_done;
        invokeV(__functionAddress);
    }

    // --- [ mi_thread_init ] ---

    /** {@code void mi_thread_init(void)} */
    public static void mi_thread_init() {
        long __functionAddress = Functions.thread_init;
        invokeV(__functionAddress);
    }

    // --- [ mi_thread_done ] ---

    /** {@code void mi_thread_done(void)} */
    public static void mi_thread_done() {
        long __functionAddress = Functions.thread_done;
        invokeV(__functionAddress);
    }

    // --- [ mi_thread_set_in_threadpool ] ---

    /** {@code void mi_thread_set_in_threadpool(void)} */
    public static void mi_thread_set_in_threadpool() {
        long __functionAddress = Functions.thread_set_in_threadpool;
        invokeV(__functionAddress);
    }

    // --- [ mi_umalloc ] ---

    /** {@code void * mi_umalloc(size_t size, size_t * block_size)} */
    public static long nmi_umalloc(long size, long block_size) {
        long __functionAddress = Functions.umalloc;
        return invokePPP(size, block_size, __functionAddress);
    }

    /** {@code void * mi_umalloc(size_t size, size_t * block_size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_umalloc(@NativeType("size_t") long size, @NativeType("size_t *") @Nullable PointerBuffer block_size) {
        if (CHECKS) {
            checkSafe(block_size, 1);
        }
        long __result = nmi_umalloc(size, memAddressSafe(block_size));
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_ucalloc ] ---

    /** {@code void * mi_ucalloc(size_t count, size_t size, size_t * block_size)} */
    public static long nmi_ucalloc(long count, long size, long block_size) {
        long __functionAddress = Functions.ucalloc;
        return invokePPPP(count, size, block_size, __functionAddress);
    }

    /** {@code void * mi_ucalloc(size_t count, size_t size, size_t * block_size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_ucalloc(@NativeType("size_t") long count, @NativeType("size_t") long size, @NativeType("size_t *") @Nullable PointerBuffer block_size) {
        if (CHECKS) {
            checkSafe(block_size, 1);
        }
        long __result = nmi_ucalloc(count, size, memAddressSafe(block_size));
        return memByteBufferSafe(__result, (int)count * (int)size);
    }

    // --- [ mi_urealloc ] ---

    /** {@code void * mi_urealloc(void * p, size_t newsize, size_t * block_size_pre, size_t * block_size_post)} */
    public static long nmi_urealloc(long p, long newsize, long block_size_pre, long block_size_post) {
        long __functionAddress = Functions.urealloc;
        return invokePPPPP(p, newsize, block_size_pre, block_size_post, __functionAddress);
    }

    /** {@code void * mi_urealloc(void * p, size_t newsize, size_t * block_size_pre, size_t * block_size_post)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_urealloc(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize, @NativeType("size_t *") @Nullable PointerBuffer block_size_pre, @NativeType("size_t *") @Nullable PointerBuffer block_size_post) {
        if (CHECKS) {
            checkSafe(block_size_pre, 1);
            checkSafe(block_size_post, 1);
        }
        long __result = nmi_urealloc(memAddressSafe(p), newsize, memAddressSafe(block_size_pre), memAddressSafe(block_size_post));
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_ufree ] ---

    /** {@code void mi_ufree(void * p, size_t * block_size)} */
    public static void nmi_ufree(long p, long block_size) {
        long __functionAddress = Functions.ufree;
        invokePPV(p, block_size, __functionAddress);
    }

    /** {@code void mi_ufree(void * p, size_t * block_size)} */
    public static void mi_ufree(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t *") @Nullable PointerBuffer block_size) {
        if (CHECKS) {
            checkSafe(block_size, 1);
        }
        nmi_ufree(memAddressSafe(p), memAddressSafe(block_size));
    }

    /** {@code void mi_ufree(void * p, size_t * block_size)} */
    public static void mi_ufree(@NativeType("void *") @Nullable ShortBuffer p, @NativeType("size_t *") @Nullable PointerBuffer block_size) {
        if (CHECKS) {
            checkSafe(block_size, 1);
        }
        nmi_ufree(memAddressSafe(p), memAddressSafe(block_size));
    }

    /** {@code void mi_ufree(void * p, size_t * block_size)} */
    public static void mi_ufree(@NativeType("void *") @Nullable IntBuffer p, @NativeType("size_t *") @Nullable PointerBuffer block_size) {
        if (CHECKS) {
            checkSafe(block_size, 1);
        }
        nmi_ufree(memAddressSafe(p), memAddressSafe(block_size));
    }

    /** {@code void mi_ufree(void * p, size_t * block_size)} */
    public static void mi_ufree(@NativeType("void *") @Nullable LongBuffer p, @NativeType("size_t *") @Nullable PointerBuffer block_size) {
        if (CHECKS) {
            checkSafe(block_size, 1);
        }
        nmi_ufree(memAddressSafe(p), memAddressSafe(block_size));
    }

    /** {@code void mi_ufree(void * p, size_t * block_size)} */
    public static void mi_ufree(@NativeType("void *") @Nullable FloatBuffer p, @NativeType("size_t *") @Nullable PointerBuffer block_size) {
        if (CHECKS) {
            checkSafe(block_size, 1);
        }
        nmi_ufree(memAddressSafe(p), memAddressSafe(block_size));
    }

    /** {@code void mi_ufree(void * p, size_t * block_size)} */
    public static void mi_ufree(@NativeType("void *") @Nullable DoubleBuffer p, @NativeType("size_t *") @Nullable PointerBuffer block_size) {
        if (CHECKS) {
            checkSafe(block_size, 1);
        }
        nmi_ufree(memAddressSafe(p), memAddressSafe(block_size));
    }

    /** {@code void mi_ufree(void * p, size_t * block_size)} */
    public static void mi_ufree(@NativeType("void *") @Nullable PointerBuffer p, @NativeType("size_t *") @Nullable PointerBuffer block_size) {
        if (CHECKS) {
            checkSafe(block_size, 1);
        }
        nmi_ufree(memAddressSafe(p), memAddressSafe(block_size));
    }

    // --- [ mi_umalloc_aligned ] ---

    /** {@code void * mi_umalloc_aligned(size_t size, size_t alignment, size_t * block_size)} */
    public static long nmi_umalloc_aligned(long size, long alignment, long block_size) {
        long __functionAddress = Functions.umalloc_aligned;
        return invokePPPP(size, alignment, block_size, __functionAddress);
    }

    /** {@code void * mi_umalloc_aligned(size_t size, size_t alignment, size_t * block_size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_umalloc_aligned(@NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("size_t *") @Nullable PointerBuffer block_size) {
        if (CHECKS) {
            checkSafe(block_size, 1);
        }
        long __result = nmi_umalloc_aligned(size, alignment, memAddressSafe(block_size));
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_uzalloc_aligned ] ---

    /** {@code void * mi_uzalloc_aligned(size_t size, size_t alignment, size_t * block_size)} */
    public static long nmi_uzalloc_aligned(long size, long alignment, long block_size) {
        long __functionAddress = Functions.uzalloc_aligned;
        return invokePPPP(size, alignment, block_size, __functionAddress);
    }

    /** {@code void * mi_uzalloc_aligned(size_t size, size_t alignment, size_t * block_size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_uzalloc_aligned(@NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("size_t *") @Nullable PointerBuffer block_size) {
        if (CHECKS) {
            checkSafe(block_size, 1);
        }
        long __result = nmi_uzalloc_aligned(size, alignment, memAddressSafe(block_size));
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_umalloc_small ] ---

    /** {@code void * mi_umalloc_small(size_t size, size_t * block_size)} */
    public static long nmi_umalloc_small(long size, long block_size) {
        long __functionAddress = Functions.umalloc_small;
        return invokePPP(size, block_size, __functionAddress);
    }

    /** {@code void * mi_umalloc_small(size_t size, size_t * block_size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_umalloc_small(@NativeType("size_t") long size, @NativeType("size_t *") @Nullable PointerBuffer block_size) {
        if (CHECKS) {
            checkSafe(block_size, 1);
        }
        long __result = nmi_umalloc_small(size, memAddressSafe(block_size));
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_heap_new ] ---

    /** {@code mi_heap_t * mi_heap_new(void)} */
    @NativeType("mi_heap_t *")
    public static long mi_heap_new() {
        long __functionAddress = Functions.heap_new;
        return invokeP(__functionAddress);
    }

    // --- [ mi_heap_delete ] ---

    /** {@code void mi_heap_delete(mi_heap_t * heap)} */
    public static void mi_heap_delete(@NativeType("mi_heap_t *") long heap) {
        long __functionAddress = Functions.heap_delete;
        invokePV(heap, __functionAddress);
    }

    // --- [ mi_heap_destroy ] ---

    /** {@code void mi_heap_destroy(mi_heap_t * heap)} */
    public static void mi_heap_destroy(@NativeType("mi_heap_t *") long heap) {
        long __functionAddress = Functions.heap_destroy;
        invokePV(heap, __functionAddress);
    }

    // --- [ mi_heap_set_numa_affinity ] ---

    /** {@code void mi_heap_set_numa_affinity(mi_heap_t * heap, int numa_node)} */
    public static void mi_heap_set_numa_affinity(@NativeType("mi_heap_t *") long heap, int numa_node) {
        long __functionAddress = Functions.heap_set_numa_affinity;
        if (CHECKS) {
            check(heap);
        }
        invokePV(heap, numa_node, __functionAddress);
    }

    // --- [ mi_heap_collect ] ---

    /** {@code void mi_heap_collect(mi_heap_t * heap, bool force)} */
    public static void mi_heap_collect(@NativeType("mi_heap_t *") long heap, @NativeType("bool") boolean force) {
        long __functionAddress = Functions.heap_collect;
        if (CHECKS) {
            check(heap);
        }
        invokePV(heap, force, __functionAddress);
    }

    // --- [ mi_heap_main ] ---

    /** {@code mi_heap_t * mi_heap_main(void)} */
    @NativeType("mi_heap_t *")
    public static long mi_heap_main() {
        long __functionAddress = Functions.heap_main;
        return invokeP(__functionAddress);
    }

    // --- [ mi_heap_of ] ---

    /** {@code mi_heap_t * mi_heap_of(void const * p)} */
    public static long nmi_heap_of(long p) {
        long __functionAddress = Functions.heap_of;
        return invokePP(p, __functionAddress);
    }

    /** {@code mi_heap_t * mi_heap_of(void const * p)} */
    @NativeType("mi_heap_t *")
    public static long mi_heap_of(@NativeType("void const *") @Nullable ByteBuffer p) {
        return nmi_heap_of(memAddressSafe(p));
    }

    // --- [ mi_heap_contains ] ---

    /** {@code bool mi_heap_contains(mi_heap_t const * heap, void const * p)} */
    public static boolean nmi_heap_contains(long heap, long p) {
        long __functionAddress = Functions.heap_contains;
        if (CHECKS) {
            check(heap);
        }
        return invokePPZ(heap, p, __functionAddress);
    }

    /** {@code bool mi_heap_contains(mi_heap_t const * heap, void const * p)} */
    @NativeType("bool")
    public static boolean mi_heap_contains(@NativeType("mi_heap_t const *") long heap, @NativeType("void const *") @Nullable ByteBuffer p) {
        return nmi_heap_contains(heap, memAddressSafe(p));
    }

    // --- [ mi_any_heap_contains ] ---

    /** {@code bool mi_any_heap_contains(void const * p)} */
    public static boolean nmi_any_heap_contains(long p) {
        long __functionAddress = Functions.any_heap_contains;
        return invokePZ(p, __functionAddress);
    }

    /** {@code bool mi_any_heap_contains(void const * p)} */
    @NativeType("bool")
    public static boolean mi_any_heap_contains(@NativeType("void const *") @Nullable ByteBuffer p) {
        return nmi_any_heap_contains(memAddressSafe(p));
    }

    // --- [ mi_heap_malloc ] ---

    /** {@code void * mi_heap_malloc(mi_heap_t * theap, size_t size)} */
    public static long nmi_heap_malloc(long theap, long size) {
        long __functionAddress = Functions.heap_malloc;
        if (CHECKS) {
            check(theap);
        }
        return invokePPP(theap, size, __functionAddress);
    }

    /** {@code void * mi_heap_malloc(mi_heap_t * theap, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_malloc(@NativeType("mi_heap_t *") long theap, @NativeType("size_t") long size) {
        long __result = nmi_heap_malloc(theap, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_heap_zalloc ] ---

    /** {@code void * mi_heap_zalloc(mi_heap_t * heap, size_t size)} */
    public static long nmi_heap_zalloc(long heap, long size) {
        long __functionAddress = Functions.heap_zalloc;
        if (CHECKS) {
            check(heap);
        }
        return invokePPP(heap, size, __functionAddress);
    }

    /** {@code void * mi_heap_zalloc(mi_heap_t * heap, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_zalloc(@NativeType("mi_heap_t *") long heap, @NativeType("size_t") long size) {
        long __result = nmi_heap_zalloc(heap, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_heap_calloc ] ---

    /** {@code void * mi_heap_calloc(mi_heap_t * heap, size_t count, size_t size)} */
    public static long nmi_heap_calloc(long heap, long count, long size) {
        long __functionAddress = Functions.heap_calloc;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPP(heap, count, size, __functionAddress);
    }

    /** {@code void * mi_heap_calloc(mi_heap_t * heap, size_t count, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_calloc(@NativeType("mi_heap_t *") long heap, @NativeType("size_t") long count, @NativeType("size_t") long size) {
        long __result = nmi_heap_calloc(heap, count, size);
        return memByteBufferSafe(__result, (int)count * (int)size);
    }

    // --- [ mi_heap_mallocn ] ---

    /** {@code void * mi_heap_mallocn(mi_heap_t * heap, size_t count, size_t size)} */
    public static long nmi_heap_mallocn(long heap, long count, long size) {
        long __functionAddress = Functions.heap_mallocn;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPP(heap, count, size, __functionAddress);
    }

    /** {@code void * mi_heap_mallocn(mi_heap_t * heap, size_t count, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_mallocn(@NativeType("mi_heap_t *") long heap, @NativeType("size_t") long count, @NativeType("size_t") long size) {
        long __result = nmi_heap_mallocn(heap, count, size);
        return memByteBufferSafe(__result, (int)count * (int)size);
    }

    // --- [ mi_heap_malloc_small ] ---

    /** {@code void * mi_heap_malloc_small(mi_heap_t * heap, size_t size)} */
    public static long nmi_heap_malloc_small(long heap, long size) {
        long __functionAddress = Functions.heap_malloc_small;
        if (CHECKS) {
            check(heap);
        }
        return invokePPP(heap, size, __functionAddress);
    }

    /** {@code void * mi_heap_malloc_small(mi_heap_t * heap, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_malloc_small(@NativeType("mi_heap_t *") long heap, @NativeType("size_t") long size) {
        long __result = nmi_heap_malloc_small(heap, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_heap_zalloc_small ] ---

    /** {@code void * mi_heap_zalloc_small(mi_heap_t * heap, size_t size)} */
    public static long nmi_heap_zalloc_small(long heap, long size) {
        long __functionAddress = Functions.heap_zalloc_small;
        if (CHECKS) {
            check(heap);
        }
        return invokePPP(heap, size, __functionAddress);
    }

    /** {@code void * mi_heap_zalloc_small(mi_heap_t * heap, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_zalloc_small(@NativeType("mi_heap_t *") long heap, @NativeType("size_t") long size) {
        long __result = nmi_heap_zalloc_small(heap, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_heap_realloc ] ---

    /** {@code void * mi_heap_realloc(mi_heap_t * heap, void * p, size_t newsize)} */
    public static long nmi_heap_realloc(long heap, long p, long newsize) {
        long __functionAddress = Functions.heap_realloc;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPP(heap, p, newsize, __functionAddress);
    }

    /** {@code void * mi_heap_realloc(mi_heap_t * heap, void * p, size_t newsize)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_realloc(@NativeType("mi_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize) {
        long __result = nmi_heap_realloc(heap, memAddressSafe(p), newsize);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_heap_reallocn ] ---

    /** {@code void * mi_heap_reallocn(mi_heap_t * heap, void * p, size_t count, size_t size)} */
    public static long nmi_heap_reallocn(long heap, long p, long count, long size) {
        long __functionAddress = Functions.heap_reallocn;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPPP(heap, p, count, size, __functionAddress);
    }

    /** {@code void * mi_heap_reallocn(mi_heap_t * heap, void * p, size_t count, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_reallocn(@NativeType("mi_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long count, @NativeType("size_t") long size) {
        long __result = nmi_heap_reallocn(heap, memAddressSafe(p), count, size);
        return memByteBufferSafe(__result, (int)count * (int)size);
    }

    // --- [ mi_heap_reallocf ] ---

    /** {@code void * mi_heap_reallocf(mi_heap_t * theap, void * p, size_t newsize)} */
    public static long nmi_heap_reallocf(long theap, long p, long newsize) {
        long __functionAddress = Functions.heap_reallocf;
        if (CHECKS) {
            check(theap);
        }
        return invokePPPP(theap, p, newsize, __functionAddress);
    }

    /** {@code void * mi_heap_reallocf(mi_heap_t * theap, void * p, size_t newsize)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_reallocf(@NativeType("mi_heap_t *") long theap, @NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize) {
        long __result = nmi_heap_reallocf(theap, memAddressSafe(p), newsize);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_heap_malloc_aligned ] ---

    /** {@code void * mi_heap_malloc_aligned(mi_heap_t * heap, size_t size, size_t alignment)} */
    public static long nmi_heap_malloc_aligned(long heap, long size, long alignment) {
        long __functionAddress = Functions.heap_malloc_aligned;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPP(heap, size, alignment, __functionAddress);
    }

    /** {@code void * mi_heap_malloc_aligned(mi_heap_t * heap, size_t size, size_t alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_malloc_aligned(@NativeType("mi_heap_t *") long heap, @NativeType("size_t") long size, @NativeType("size_t") long alignment) {
        long __result = nmi_heap_malloc_aligned(heap, size, alignment);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_heap_malloc_aligned_at ] ---

    /** {@code void * mi_heap_malloc_aligned_at(mi_heap_t * heap, size_t size, size_t alignment, size_t offset)} */
    public static long nmi_heap_malloc_aligned_at(long heap, long size, long alignment, long offset) {
        long __functionAddress = Functions.heap_malloc_aligned_at;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPPP(heap, size, alignment, offset, __functionAddress);
    }

    /** {@code void * mi_heap_malloc_aligned_at(mi_heap_t * heap, size_t size, size_t alignment, size_t offset)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_malloc_aligned_at(@NativeType("mi_heap_t *") long heap, @NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("size_t") long offset) {
        long __result = nmi_heap_malloc_aligned_at(heap, size, alignment, offset);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_heap_zalloc_aligned ] ---

    /** {@code void * mi_heap_zalloc_aligned(mi_heap_t * heap, size_t size, size_t alignment)} */
    public static long nmi_heap_zalloc_aligned(long heap, long size, long alignment) {
        long __functionAddress = Functions.heap_zalloc_aligned;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPP(heap, size, alignment, __functionAddress);
    }

    /** {@code void * mi_heap_zalloc_aligned(mi_heap_t * heap, size_t size, size_t alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_zalloc_aligned(@NativeType("mi_heap_t *") long heap, @NativeType("size_t") long size, @NativeType("size_t") long alignment) {
        long __result = nmi_heap_zalloc_aligned(heap, size, alignment);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_heap_zalloc_aligned_at ] ---

    /** {@code void * mi_heap_zalloc_aligned_at(mi_heap_t * heap, size_t size, size_t alignment, size_t offset)} */
    public static long nmi_heap_zalloc_aligned_at(long heap, long size, long alignment, long offset) {
        long __functionAddress = Functions.heap_zalloc_aligned_at;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPPP(heap, size, alignment, offset, __functionAddress);
    }

    /** {@code void * mi_heap_zalloc_aligned_at(mi_heap_t * heap, size_t size, size_t alignment, size_t offset)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_zalloc_aligned_at(@NativeType("mi_heap_t *") long heap, @NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("size_t") long offset) {
        long __result = nmi_heap_zalloc_aligned_at(heap, size, alignment, offset);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_heap_calloc_aligned ] ---

    /** {@code void * mi_heap_calloc_aligned(mi_heap_t * heap, size_t count, size_t size, size_t alignment)} */
    public static long nmi_heap_calloc_aligned(long heap, long count, long size, long alignment) {
        long __functionAddress = Functions.heap_calloc_aligned;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPPP(heap, count, size, alignment, __functionAddress);
    }

    /** {@code void * mi_heap_calloc_aligned(mi_heap_t * heap, size_t count, size_t size, size_t alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_calloc_aligned(@NativeType("mi_heap_t *") long heap, @NativeType("size_t") long count, @NativeType("size_t") long size, @NativeType("size_t") long alignment) {
        long __result = nmi_heap_calloc_aligned(heap, count, size, alignment);
        return memByteBufferSafe(__result, (int)count * (int)size);
    }

    // --- [ mi_heap_calloc_aligned_at ] ---

    /** {@code void * mi_heap_calloc_aligned_at(mi_heap_t * heap, size_t count, size_t size, size_t alignment, size_t offset)} */
    public static long nmi_heap_calloc_aligned_at(long heap, long count, long size, long alignment, long offset) {
        long __functionAddress = Functions.heap_calloc_aligned_at;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPPPP(heap, count, size, alignment, offset, __functionAddress);
    }

    /** {@code void * mi_heap_calloc_aligned_at(mi_heap_t * heap, size_t count, size_t size, size_t alignment, size_t offset)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_calloc_aligned_at(@NativeType("mi_heap_t *") long heap, @NativeType("size_t") long count, @NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("size_t") long offset) {
        long __result = nmi_heap_calloc_aligned_at(heap, count, size, alignment, offset);
        return memByteBufferSafe(__result, (int)count * (int)size);
    }

    // --- [ mi_heap_realloc_aligned ] ---

    /** {@code void * mi_heap_realloc_aligned(mi_heap_t * heap, void * p, size_t newsize, size_t alignment)} */
    public static long nmi_heap_realloc_aligned(long heap, long p, long newsize, long alignment) {
        long __functionAddress = Functions.heap_realloc_aligned;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPPP(heap, p, newsize, alignment, __functionAddress);
    }

    /** {@code void * mi_heap_realloc_aligned(mi_heap_t * heap, void * p, size_t newsize, size_t alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_realloc_aligned(@NativeType("mi_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize, @NativeType("size_t") long alignment) {
        long __result = nmi_heap_realloc_aligned(heap, memAddressSafe(p), newsize, alignment);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_heap_realloc_aligned_at ] ---

    /** {@code void * mi_heap_realloc_aligned_at(mi_heap_t * heap, void * p, size_t newsize, size_t alignment, size_t offset)} */
    public static long nmi_heap_realloc_aligned_at(long heap, long p, long newsize, long alignment, long offset) {
        long __functionAddress = Functions.heap_realloc_aligned_at;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPPPP(heap, p, newsize, alignment, offset, __functionAddress);
    }

    /** {@code void * mi_heap_realloc_aligned_at(mi_heap_t * heap, void * p, size_t newsize, size_t alignment, size_t offset)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_realloc_aligned_at(@NativeType("mi_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize, @NativeType("size_t") long alignment, @NativeType("size_t") long offset) {
        long __result = nmi_heap_realloc_aligned_at(heap, memAddressSafe(p), newsize, alignment, offset);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_rezalloc ] ---

    /** {@code void * mi_rezalloc(void * p, size_t newsize)} */
    public static long nmi_rezalloc(long p, long newsize) {
        long __functionAddress = Functions.rezalloc;
        return invokePPP(p, newsize, __functionAddress);
    }

    /** {@code void * mi_rezalloc(void * p, size_t newsize)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_rezalloc(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize) {
        long __result = nmi_rezalloc(memAddressSafe(p), newsize);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_recalloc ] ---

    /** {@code void * mi_recalloc(void * p, size_t newcount, size_t size)} */
    public static long nmi_recalloc(long p, long newcount, long size) {
        long __functionAddress = Functions.recalloc;
        return invokePPPP(p, newcount, size, __functionAddress);
    }

    /** {@code void * mi_recalloc(void * p, size_t newcount, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_recalloc(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newcount, @NativeType("size_t") long size) {
        long __result = nmi_recalloc(memAddressSafe(p), newcount, size);
        return memByteBufferSafe(__result, (int)newcount * (int)size);
    }

    // --- [ mi_rezalloc_aligned ] ---

    /** {@code void * mi_rezalloc_aligned(void * p, size_t newsize, size_t alignment)} */
    public static long nmi_rezalloc_aligned(long p, long newsize, long alignment) {
        long __functionAddress = Functions.rezalloc_aligned;
        return invokePPPP(p, newsize, alignment, __functionAddress);
    }

    /** {@code void * mi_rezalloc_aligned(void * p, size_t newsize, size_t alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_rezalloc_aligned(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize, @NativeType("size_t") long alignment) {
        long __result = nmi_rezalloc_aligned(memAddressSafe(p), newsize, alignment);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_rezalloc_aligned_at ] ---

    /** {@code void * mi_rezalloc_aligned_at(void * p, size_t newsize, size_t alignment, size_t offset)} */
    public static long nmi_rezalloc_aligned_at(long p, long newsize, long alignment, long offset) {
        long __functionAddress = Functions.rezalloc_aligned_at;
        return invokePPPPP(p, newsize, alignment, offset, __functionAddress);
    }

    /** {@code void * mi_rezalloc_aligned_at(void * p, size_t newsize, size_t alignment, size_t offset)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_rezalloc_aligned_at(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize, @NativeType("size_t") long alignment, @NativeType("size_t") long offset) {
        long __result = nmi_rezalloc_aligned_at(memAddressSafe(p), newsize, alignment, offset);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_recalloc_aligned ] ---

    /** {@code void * mi_recalloc_aligned(void * p, size_t newcount, size_t size, size_t alignment)} */
    public static long nmi_recalloc_aligned(long p, long newcount, long size, long alignment) {
        long __functionAddress = Functions.recalloc_aligned;
        return invokePPPPP(p, newcount, size, alignment, __functionAddress);
    }

    /** {@code void * mi_recalloc_aligned(void * p, size_t newcount, size_t size, size_t alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_recalloc_aligned(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newcount, @NativeType("size_t") long size, @NativeType("size_t") long alignment) {
        long __result = nmi_recalloc_aligned(memAddressSafe(p), newcount, size, alignment);
        return memByteBufferSafe(__result, (int)newcount * (int)size);
    }

    // --- [ mi_recalloc_aligned_at ] ---

    /** {@code void * mi_recalloc_aligned_at(void * p, size_t newcount, size_t size, size_t alignment, size_t offset)} */
    public static long nmi_recalloc_aligned_at(long p, long newcount, long size, long alignment, long offset) {
        long __functionAddress = Functions.recalloc_aligned_at;
        return invokePPPPPP(p, newcount, size, alignment, offset, __functionAddress);
    }

    /** {@code void * mi_recalloc_aligned_at(void * p, size_t newcount, size_t size, size_t alignment, size_t offset)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_recalloc_aligned_at(@NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newcount, @NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("size_t") long offset) {
        long __result = nmi_recalloc_aligned_at(memAddressSafe(p), newcount, size, alignment, offset);
        return memByteBufferSafe(__result, (int)newcount * (int)size);
    }

    // --- [ mi_heap_rezalloc ] ---

    /** {@code void * mi_heap_rezalloc(mi_heap_t * heap, void * p, size_t newsize)} */
    public static long nmi_heap_rezalloc(long heap, long p, long newsize) {
        long __functionAddress = Functions.heap_rezalloc;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPP(heap, p, newsize, __functionAddress);
    }

    /** {@code void * mi_heap_rezalloc(mi_heap_t * heap, void * p, size_t newsize)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_rezalloc(@NativeType("mi_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize) {
        long __result = nmi_heap_rezalloc(heap, memAddressSafe(p), newsize);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_heap_recalloc ] ---

    /** {@code void * mi_heap_recalloc(mi_heap_t * heap, void * p, size_t newcount, size_t size)} */
    public static long nmi_heap_recalloc(long heap, long p, long newcount, long size) {
        long __functionAddress = Functions.heap_recalloc;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPPP(heap, p, newcount, size, __functionAddress);
    }

    /** {@code void * mi_heap_recalloc(mi_heap_t * heap, void * p, size_t newcount, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_recalloc(@NativeType("mi_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newcount, @NativeType("size_t") long size) {
        long __result = nmi_heap_recalloc(heap, memAddressSafe(p), newcount, size);
        return memByteBufferSafe(__result, (int)newcount * (int)size);
    }

    // --- [ mi_heap_rezalloc_aligned ] ---

    /** {@code void * mi_heap_rezalloc_aligned(mi_heap_t * heap, void * p, size_t newsize, size_t alignment)} */
    public static long nmi_heap_rezalloc_aligned(long heap, long p, long newsize, long alignment) {
        long __functionAddress = Functions.heap_rezalloc_aligned;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPPP(heap, p, newsize, alignment, __functionAddress);
    }

    /** {@code void * mi_heap_rezalloc_aligned(mi_heap_t * heap, void * p, size_t newsize, size_t alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_rezalloc_aligned(@NativeType("mi_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize, @NativeType("size_t") long alignment) {
        long __result = nmi_heap_rezalloc_aligned(heap, memAddressSafe(p), newsize, alignment);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_heap_rezalloc_aligned_at ] ---

    /** {@code void * mi_heap_rezalloc_aligned_at(mi_heap_t * heap, void * p, size_t newsize, size_t alignment, size_t offset)} */
    public static long nmi_heap_rezalloc_aligned_at(long heap, long p, long newsize, long alignment, long offset) {
        long __functionAddress = Functions.heap_rezalloc_aligned_at;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPPPP(heap, p, newsize, alignment, offset, __functionAddress);
    }

    /** {@code void * mi_heap_rezalloc_aligned_at(mi_heap_t * heap, void * p, size_t newsize, size_t alignment, size_t offset)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_rezalloc_aligned_at(@NativeType("mi_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize, @NativeType("size_t") long alignment, @NativeType("size_t") long offset) {
        long __result = nmi_heap_rezalloc_aligned_at(heap, memAddressSafe(p), newsize, alignment, offset);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_heap_recalloc_aligned ] ---

    /** {@code void * mi_heap_recalloc_aligned(mi_heap_t * heap, void * p, size_t newcount, size_t size, size_t alignment)} */
    public static long nmi_heap_recalloc_aligned(long heap, long p, long newcount, long size, long alignment) {
        long __functionAddress = Functions.heap_recalloc_aligned;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPPPP(heap, p, newcount, size, alignment, __functionAddress);
    }

    /** {@code void * mi_heap_recalloc_aligned(mi_heap_t * heap, void * p, size_t newcount, size_t size, size_t alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_recalloc_aligned(@NativeType("mi_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newcount, @NativeType("size_t") long size, @NativeType("size_t") long alignment) {
        long __result = nmi_heap_recalloc_aligned(heap, memAddressSafe(p), newcount, size, alignment);
        return memByteBufferSafe(__result, (int)newcount * (int)size);
    }

    // --- [ mi_heap_recalloc_aligned_at ] ---

    /** {@code void * mi_heap_recalloc_aligned_at(mi_heap_t * heap, void * p, size_t newcount, size_t size, size_t alignment, size_t offset)} */
    public static long nmi_heap_recalloc_aligned_at(long heap, long p, long newcount, long size, long alignment, long offset) {
        long __functionAddress = Functions.heap_recalloc_aligned_at;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPPPPP(heap, p, newcount, size, alignment, offset, __functionAddress);
    }

    /** {@code void * mi_heap_recalloc_aligned_at(mi_heap_t * heap, void * p, size_t newcount, size_t size, size_t alignment, size_t offset)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_heap_recalloc_aligned_at(@NativeType("mi_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newcount, @NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("size_t") long offset) {
        long __result = nmi_heap_recalloc_aligned_at(heap, memAddressSafe(p), newcount, size, alignment, offset);
        return memByteBufferSafe(__result, (int)newcount * (int)size);
    }

    // --- [ mi_heap_visit_blocks ] ---

    /** {@code bool mi_heap_visit_blocks(mi_heap_t * heap, bool visit_blocks, mi_block_visit_fun visitor, void * arg)} */
    public static boolean nmi_heap_visit_blocks(long heap, boolean visit_blocks, long visitor, long arg) {
        long __functionAddress = Functions.heap_visit_blocks;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPZ(heap, visit_blocks, visitor, arg, __functionAddress);
    }

    /** {@code bool mi_heap_visit_blocks(mi_heap_t * heap, bool visit_blocks, mi_block_visit_fun visitor, void * arg)} */
    @NativeType("bool")
    public static boolean mi_heap_visit_blocks(@NativeType("mi_heap_t *") long heap, @NativeType("bool") boolean visit_blocks, @NativeType("mi_block_visit_fun") mi_block_visit_funI visitor, @NativeType("void *") long arg) {
        return nmi_heap_visit_blocks(heap, visit_blocks, visitor.address(), arg);
    }

    // --- [ mi_heap_visit_abandoned_blocks ] ---

    /** {@code bool mi_heap_visit_abandoned_blocks(mi_heap_t * heap, bool visit_blocks, mi_block_visit_fun visitor, void * arg)} */
    public static boolean nmi_heap_visit_abandoned_blocks(long heap, boolean visit_blocks, long visitor, long arg) {
        long __functionAddress = Functions.heap_visit_abandoned_blocks;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPZ(heap, visit_blocks, visitor, arg, __functionAddress);
    }

    /** {@code bool mi_heap_visit_abandoned_blocks(mi_heap_t * heap, bool visit_blocks, mi_block_visit_fun visitor, void * arg)} */
    @NativeType("bool")
    public static boolean mi_heap_visit_abandoned_blocks(@NativeType("mi_heap_t *") long heap, @NativeType("bool") boolean visit_blocks, @NativeType("mi_block_visit_fun") mi_block_visit_funI visitor, @NativeType("void *") long arg) {
        return nmi_heap_visit_abandoned_blocks(heap, visit_blocks, visitor.address(), arg);
    }

    // --- [ mi_is_redirected ] ---

    /** {@code bool mi_is_redirected(void)} */
    @NativeType("bool")
    public static boolean mi_is_redirected() {
        long __functionAddress = Functions.is_redirected;
        return invokeZ(__functionAddress);
    }

    // --- [ mi_reserve_huge_os_pages_interleave ] ---

    /** {@code int mi_reserve_huge_os_pages_interleave(size_t pages, size_t numa_nodes, size_t timeout_msecs)} */
    public static int mi_reserve_huge_os_pages_interleave(@NativeType("size_t") long pages, @NativeType("size_t") long numa_nodes, @NativeType("size_t") long timeout_msecs) {
        long __functionAddress = Functions.reserve_huge_os_pages_interleave;
        return invokePPPI(pages, numa_nodes, timeout_msecs, __functionAddress);
    }

    // --- [ mi_reserve_huge_os_pages_at ] ---

    /** {@code int mi_reserve_huge_os_pages_at(size_t pages, int numa_node, size_t timeout_msecs)} */
    public static int mi_reserve_huge_os_pages_at(@NativeType("size_t") long pages, int numa_node, @NativeType("size_t") long timeout_msecs) {
        long __functionAddress = Functions.reserve_huge_os_pages_at;
        return invokePPI(pages, numa_node, timeout_msecs, __functionAddress);
    }

    // --- [ mi_reserve_os_memory ] ---

    /** {@code int mi_reserve_os_memory(size_t size, bool commit, bool allow_large)} */
    public static int mi_reserve_os_memory(@NativeType("size_t") long size, @NativeType("bool") boolean commit, @NativeType("bool") boolean allow_large) {
        long __functionAddress = Functions.reserve_os_memory;
        return invokePI(size, commit, allow_large, __functionAddress);
    }

    // --- [ mi_manage_os_memory ] ---

    /** {@code bool mi_manage_os_memory(void * start, size_t size, bool is_committed, bool is_pinned, bool is_zero, int numa_node)} */
    public static boolean nmi_manage_os_memory(long start, long size, boolean is_committed, boolean is_pinned, boolean is_zero, int numa_node) {
        long __functionAddress = Functions.manage_os_memory;
        return invokePPZ(start, size, is_committed, is_pinned, is_zero, numa_node, __functionAddress);
    }

    /** {@code bool mi_manage_os_memory(void * start, size_t size, bool is_committed, bool is_pinned, bool is_zero, int numa_node)} */
    @NativeType("bool")
    public static boolean mi_manage_os_memory(@NativeType("void *") ByteBuffer start, @NativeType("bool") boolean is_committed, @NativeType("bool") boolean is_pinned, @NativeType("bool") boolean is_zero, int numa_node) {
        return nmi_manage_os_memory(memAddress(start), start.remaining(), is_committed, is_pinned, is_zero, numa_node);
    }

    // --- [ mi_debug_show_arenas ] ---

    /** {@code void mi_debug_show_arenas(void)} */
    public static void mi_debug_show_arenas() {
        long __functionAddress = Functions.debug_show_arenas;
        invokeV(__functionAddress);
    }

    // --- [ mi_arenas_print ] ---

    /** {@code void mi_arenas_print(void)} */
    public static void mi_arenas_print() {
        long __functionAddress = Functions.arenas_print;
        invokeV(__functionAddress);
    }

    // --- [ mi_arena_min_alignment ] ---

    /** {@code size_t mi_arena_min_alignment(void)} */
    @NativeType("size_t")
    public static long mi_arena_min_alignment() {
        long __functionAddress = Functions.arena_min_alignment;
        return invokeP(__functionAddress);
    }

    // --- [ mi_arena_min_size ] ---

    /** {@code size_t mi_arena_min_size(void)} */
    @NativeType("size_t")
    public static long mi_arena_min_size() {
        long __functionAddress = Functions.arena_min_size;
        return invokeP(__functionAddress);
    }

    // --- [ mi_arena_area ] ---

    /** {@code void * mi_arena_area(mi_arena_id_t arena_id, size_t * size)} */
    public static long nmi_arena_area(long arena_id, long size) {
        long __functionAddress = Functions.arena_area;
        if (CHECKS) {
            check(arena_id);
        }
        return invokePPP(arena_id, size, __functionAddress);
    }

    /** {@code void * mi_arena_area(mi_arena_id_t arena_id, size_t * size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_arena_area(@NativeType("mi_arena_id_t") long arena_id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer size = stack.callocPointer(1);
        try {
            long __result = nmi_arena_area(arena_id, memAddress(size));
            return memByteBufferSafe(__result, (int)size.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ mi_reserve_huge_os_pages_at_ex ] ---

    /** {@code int mi_reserve_huge_os_pages_at_ex(size_t pages, int numa_node, size_t timeout_msecs, bool exclusive, mi_arena_id_t * arena_id)} */
    public static int nmi_reserve_huge_os_pages_at_ex(long pages, int numa_node, long timeout_msecs, boolean exclusive, long arena_id) {
        long __functionAddress = Functions.reserve_huge_os_pages_at_ex;
        return invokePPPI(pages, numa_node, timeout_msecs, exclusive, arena_id, __functionAddress);
    }

    /** {@code int mi_reserve_huge_os_pages_at_ex(size_t pages, int numa_node, size_t timeout_msecs, bool exclusive, mi_arena_id_t * arena_id)} */
    public static int mi_reserve_huge_os_pages_at_ex(@NativeType("size_t") long pages, int numa_node, @NativeType("size_t") long timeout_msecs, @NativeType("bool") boolean exclusive, @NativeType("mi_arena_id_t *") @Nullable PointerBuffer arena_id) {
        if (CHECKS) {
            checkSafe(arena_id, 1);
        }
        return nmi_reserve_huge_os_pages_at_ex(pages, numa_node, timeout_msecs, exclusive, memAddressSafe(arena_id));
    }

    // --- [ mi_reserve_os_memory_ex ] ---

    /** {@code int mi_reserve_os_memory_ex(size_t size, bool commit, bool allow_large, bool exclusive, mi_arena_id_t * arena_id)} */
    public static int nmi_reserve_os_memory_ex(long size, boolean commit, boolean allow_large, boolean exclusive, long arena_id) {
        long __functionAddress = Functions.reserve_os_memory_ex;
        return invokePPI(size, commit, allow_large, exclusive, arena_id, __functionAddress);
    }

    /** {@code int mi_reserve_os_memory_ex(size_t size, bool commit, bool allow_large, bool exclusive, mi_arena_id_t * arena_id)} */
    public static int mi_reserve_os_memory_ex(@NativeType("size_t") long size, @NativeType("bool") boolean commit, @NativeType("bool") boolean allow_large, @NativeType("bool") boolean exclusive, @NativeType("mi_arena_id_t *") @Nullable PointerBuffer arena_id) {
        if (CHECKS) {
            checkSafe(arena_id, 1);
        }
        return nmi_reserve_os_memory_ex(size, commit, allow_large, exclusive, memAddressSafe(arena_id));
    }

    // --- [ mi_manage_os_memory_ex ] ---

    /** {@code bool mi_manage_os_memory_ex(void * start, size_t size, bool is_committed, bool is_pinned, bool is_zero, int numa_node, bool exclusive, mi_arena_id_t * arena_id)} */
    public static boolean nmi_manage_os_memory_ex(long start, long size, boolean is_committed, boolean is_pinned, boolean is_zero, int numa_node, boolean exclusive, long arena_id) {
        long __functionAddress = Functions.manage_os_memory_ex;
        return invokePPPZ(start, size, is_committed, is_pinned, is_zero, numa_node, exclusive, arena_id, __functionAddress);
    }

    /** {@code bool mi_manage_os_memory_ex(void * start, size_t size, bool is_committed, bool is_pinned, bool is_zero, int numa_node, bool exclusive, mi_arena_id_t * arena_id)} */
    @NativeType("bool")
    public static boolean mi_manage_os_memory_ex(@NativeType("void *") ByteBuffer start, @NativeType("bool") boolean is_committed, @NativeType("bool") boolean is_pinned, @NativeType("bool") boolean is_zero, int numa_node, @NativeType("bool") boolean exclusive, @NativeType("mi_arena_id_t *") @Nullable PointerBuffer arena_id) {
        if (CHECKS) {
            checkSafe(arena_id, 1);
        }
        return nmi_manage_os_memory_ex(memAddress(start), start.remaining(), is_committed, is_pinned, is_zero, numa_node, exclusive, memAddressSafe(arena_id));
    }

    // --- [ mi_arena_contains ] ---

    /** {@code bool mi_arena_contains(mi_arena_id_t arena_id, void const * p)} */
    public static boolean nmi_arena_contains(long arena_id, long p) {
        long __functionAddress = Functions.arena_contains;
        if (CHECKS) {
            check(arena_id);
        }
        return invokePPZ(arena_id, p, __functionAddress);
    }

    /** {@code bool mi_arena_contains(mi_arena_id_t arena_id, void const * p)} */
    @NativeType("bool")
    public static boolean mi_arena_contains(@NativeType("mi_arena_id_t") long arena_id, @NativeType("void const *") @Nullable ByteBuffer p) {
        return nmi_arena_contains(arena_id, memAddressSafe(p));
    }

    // --- [ mi_heap_new_in_arena ] ---

    /** {@code mi_heap_t * mi_heap_new_in_arena(mi_arena_id_t arena_id)} */
    @NativeType("mi_heap_t *")
    public static long mi_heap_new_in_arena(@NativeType("mi_arena_id_t") long arena_id) {
        long __functionAddress = Functions.heap_new_in_arena;
        if (CHECKS) {
            check(arena_id);
        }
        return invokePP(arena_id, __functionAddress);
    }

    // --- [ mi_subproc_main ] ---

    private static final class mi_subproc_main {
        static final FFICIF CIF = apiCreateCIF(
            apiCreateStruct(ffi_type_pointer)
        );
    }

    /** {@code mi_subproc_id_t mi_subproc_main(void)} */
    public static void nmi_subproc_main(long __result) {
        long __functionAddress = Functions.subproc_main;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            nffi_call(mi_subproc_main.CIF.address(), __functionAddress, __result, NULL);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code mi_subproc_id_t mi_subproc_main(void)} */
    public static mi_subproc_id_t mi_subproc_main(mi_subproc_id_t __result) {
        nmi_subproc_main(__result.address());
        return __result;
    }

    // --- [ mi_subproc_current ] ---

    private static final class mi_subproc_current {
        static final FFICIF CIF = apiCreateCIF(
            apiCreateStruct(ffi_type_pointer)
        );
    }

    /** {@code mi_subproc_id_t mi_subproc_current(void)} */
    public static void nmi_subproc_current(long __result) {
        long __functionAddress = Functions.subproc_current;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            nffi_call(mi_subproc_current.CIF.address(), __functionAddress, __result, NULL);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code mi_subproc_id_t mi_subproc_current(void)} */
    public static mi_subproc_id_t mi_subproc_current(mi_subproc_id_t __result) {
        nmi_subproc_current(__result.address());
        return __result;
    }

    // --- [ mi_subproc_new ] ---

    private static final class mi_subproc_new {
        static final FFICIF CIF = apiCreateCIF(
            apiCreateStruct(ffi_type_pointer)
        );
    }

    /** {@code mi_subproc_id_t mi_subproc_new(void)} */
    public static void nmi_subproc_new(long __result) {
        long __functionAddress = Functions.subproc_new;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            nffi_call(mi_subproc_new.CIF.address(), __functionAddress, __result, NULL);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code mi_subproc_id_t mi_subproc_new(void)} */
    public static mi_subproc_id_t mi_subproc_new(mi_subproc_id_t __result) {
        nmi_subproc_new(__result.address());
        return __result;
    }

    // --- [ mi_subproc_destroy ] ---

    private static final class mi_subproc_destroy {
        static final FFICIF CIF = apiCreateCIF(
            ffi_type_void,
            apiCreateStruct(ffi_type_pointer)
        );
    }

    /** {@code void mi_subproc_destroy(mi_subproc_id_t subproc)} */
    public static void nmi_subproc_destroy(long subproc) {
        long __functionAddress = Functions.subproc_destroy;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 1);
            memPutAddress(arguments, subproc);

            nffi_call(mi_subproc_destroy.CIF.address(), __functionAddress, NULL, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void mi_subproc_destroy(mi_subproc_id_t subproc)} */
    public static void mi_subproc_destroy(mi_subproc_id_t subproc) {
        nmi_subproc_destroy(subproc.address());
    }

    // --- [ mi_subproc_add_current_thread ] ---

    private static final class mi_subproc_add_current_thread {
        static final FFICIF CIF = apiCreateCIF(
            ffi_type_void,
            apiCreateStruct(ffi_type_pointer)
        );
    }

    /** {@code void mi_subproc_add_current_thread(mi_subproc_id_t subproc)} */
    public static void nmi_subproc_add_current_thread(long subproc) {
        long __functionAddress = Functions.subproc_add_current_thread;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 1);
            memPutAddress(arguments, subproc);

            nffi_call(mi_subproc_add_current_thread.CIF.address(), __functionAddress, NULL, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void mi_subproc_add_current_thread(mi_subproc_id_t subproc)} */
    public static void mi_subproc_add_current_thread(mi_subproc_id_t subproc) {
        nmi_subproc_add_current_thread(subproc.address());
    }

    // --- [ mi_subproc_visit_heaps ] ---

    private static final class mi_subproc_visit_heaps {
        static final FFICIF CIF = apiCreateCIF(
            ffi_type_uint8,
            apiCreateStruct(ffi_type_pointer), ffi_type_pointer, ffi_type_pointer
        );
    }

    /** {@code bool mi_subproc_visit_heaps(mi_subproc_id_t subproc, mi_heap_visit_fun visitor, void * arg)} */
    public static boolean nmi_subproc_visit_heaps(long subproc, long visitor, long arg) {
        long __functionAddress = Functions.subproc_visit_heaps;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.nbyte((byte)0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 3);
            memPutAddress(arguments, subproc);
            memPutAddress(arguments + POINTER_SIZE, stack.npointer(visitor));
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.npointer(arg));

            nffi_call(mi_subproc_visit_heaps.CIF.address(), __functionAddress, __result, arguments);

            return memGetByte(__result) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code bool mi_subproc_visit_heaps(mi_subproc_id_t subproc, mi_heap_visit_fun visitor, void * arg)} */
    @NativeType("bool")
    public static boolean mi_subproc_visit_heaps(mi_subproc_id_t subproc, @NativeType("mi_heap_visit_fun") mi_heap_visit_funI visitor, @NativeType("void *") long arg) {
        return nmi_subproc_visit_heaps(subproc.address(), visitor.address(), arg);
    }

    // --- [ mi_heap_theap ] ---

    /** {@code mi_theap_t * mi_heap_theap(mi_heap_t * heap)} */
    @NativeType("mi_theap_t *")
    public static long mi_heap_theap(@NativeType("mi_heap_t *") long heap) {
        long __functionAddress = Functions.heap_theap;
        if (CHECKS) {
            check(heap);
        }
        return invokePP(heap, __functionAddress);
    }

    // --- [ mi_theap_get_default ] ---

    /** {@code mi_theap_t * mi_theap_get_default(void)} */
    @NativeType("mi_theap_t *")
    public static long mi_theap_get_default() {
        long __functionAddress = Functions.theap_get_default;
        return invokeP(__functionAddress);
    }

    // --- [ mi_theap_collect ] ---

    /** {@code void mi_theap_collect(mi_theap_t * theap, bool force)} */
    public static void mi_theap_collect(@NativeType("mi_theap_t *") long theap, @NativeType("bool") boolean force) {
        long __functionAddress = Functions.theap_collect;
        if (CHECKS) {
            check(theap);
        }
        invokePV(theap, force, __functionAddress);
    }

    // --- [ mi_theap_malloc ] ---

    /** {@code void * mi_theap_malloc(mi_theap_t * theap, size_t size)} */
    public static long nmi_theap_malloc(long theap, long size) {
        long __functionAddress = Functions.theap_malloc;
        if (CHECKS) {
            check(theap);
        }
        return invokePPP(theap, size, __functionAddress);
    }

    /** {@code void * mi_theap_malloc(mi_theap_t * theap, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_theap_malloc(@NativeType("mi_theap_t *") long theap, @NativeType("size_t") long size) {
        long __result = nmi_theap_malloc(theap, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_theap_zalloc ] ---

    /** {@code void * mi_theap_zalloc(mi_theap_t * theap, size_t size)} */
    public static long nmi_theap_zalloc(long theap, long size) {
        long __functionAddress = Functions.theap_zalloc;
        if (CHECKS) {
            check(theap);
        }
        return invokePPP(theap, size, __functionAddress);
    }

    /** {@code void * mi_theap_zalloc(mi_theap_t * theap, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_theap_zalloc(@NativeType("mi_theap_t *") long theap, @NativeType("size_t") long size) {
        long __result = nmi_theap_zalloc(theap, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_theap_calloc ] ---

    /** {@code void * mi_theap_calloc(mi_theap_t * theap, size_t count, size_t size)} */
    public static long nmi_theap_calloc(long theap, long count, long size) {
        long __functionAddress = Functions.theap_calloc;
        if (CHECKS) {
            check(theap);
        }
        return invokePPPP(theap, count, size, __functionAddress);
    }

    /** {@code void * mi_theap_calloc(mi_theap_t * theap, size_t count, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_theap_calloc(@NativeType("mi_theap_t *") long theap, @NativeType("size_t") long count, @NativeType("size_t") long size) {
        long __result = nmi_theap_calloc(theap, count, size);
        return memByteBufferSafe(__result, (int)count * (int)size);
    }

    // --- [ mi_theap_malloc_small ] ---

    /** {@code void * mi_theap_malloc_small(mi_theap_t * theap, size_t size)} */
    public static long nmi_theap_malloc_small(long theap, long size) {
        long __functionAddress = Functions.theap_malloc_small;
        if (CHECKS) {
            check(theap);
        }
        return invokePPP(theap, size, __functionAddress);
    }

    /** {@code void * mi_theap_malloc_small(mi_theap_t * theap, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_theap_malloc_small(@NativeType("mi_theap_t *") long theap, @NativeType("size_t") long size) {
        long __result = nmi_theap_malloc_small(theap, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_theap_zalloc_small ] ---

    /** {@code void * mi_theap_zalloc_small(mi_theap_t * theap, size_t size)} */
    public static long nmi_theap_zalloc_small(long theap, long size) {
        long __functionAddress = Functions.theap_zalloc_small;
        if (CHECKS) {
            check(theap);
        }
        return invokePPP(theap, size, __functionAddress);
    }

    /** {@code void * mi_theap_zalloc_small(mi_theap_t * theap, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_theap_zalloc_small(@NativeType("mi_theap_t *") long theap, @NativeType("size_t") long size) {
        long __result = nmi_theap_zalloc_small(theap, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_theap_malloc_aligned ] ---

    /** {@code void * mi_theap_malloc_aligned(mi_theap_t * theap, size_t size, size_t alignment)} */
    public static long nmi_theap_malloc_aligned(long theap, long size, long alignment) {
        long __functionAddress = Functions.theap_malloc_aligned;
        if (CHECKS) {
            check(theap);
        }
        return invokePPPP(theap, size, alignment, __functionAddress);
    }

    /** {@code void * mi_theap_malloc_aligned(mi_theap_t * theap, size_t size, size_t alignment)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_theap_malloc_aligned(@NativeType("mi_theap_t *") long theap, @NativeType("size_t") long size, @NativeType("size_t") long alignment) {
        long __result = nmi_theap_malloc_aligned(theap, size, alignment);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ mi_theap_realloc ] ---

    /** {@code void * mi_theap_realloc(mi_theap_t * theap, void * p, size_t newsize)} */
    public static long nmi_theap_realloc(long theap, long p, long newsize) {
        long __functionAddress = Functions.theap_realloc;
        if (CHECKS) {
            check(theap);
        }
        return invokePPPP(theap, p, newsize, __functionAddress);
    }

    /** {@code void * mi_theap_realloc(mi_theap_t * theap, void * p, size_t newsize)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer mi_theap_realloc(@NativeType("mi_theap_t *") long theap, @NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long newsize) {
        long __result = nmi_theap_realloc(theap, memAddressSafe(p), newsize);
        return memByteBufferSafe(__result, (int)newsize);
    }

    // --- [ mi_theap_guarded_set_sample_rate ] ---

    /** {@code void mi_theap_guarded_set_sample_rate(mi_theap_t * theap, size_t sample_rate, size_t seed)} */
    public static void mi_theap_guarded_set_sample_rate(@NativeType("mi_theap_t *") long theap, @NativeType("size_t") long sample_rate, @NativeType("size_t") long seed) {
        long __functionAddress = Functions.theap_guarded_set_sample_rate;
        if (CHECKS) {
            check(theap);
        }
        invokePPPV(theap, sample_rate, seed, __functionAddress);
    }

    // --- [ mi_theap_guarded_set_size_bound ] ---

    /** {@code void mi_theap_guarded_set_size_bound(mi_theap_t * theap, size_t min, size_t max)} */
    public static void mi_theap_guarded_set_size_bound(@NativeType("mi_theap_t *") long theap, @NativeType("size_t") long min, @NativeType("size_t") long max) {
        long __functionAddress = Functions.theap_guarded_set_size_bound;
        if (CHECKS) {
            check(theap);
        }
        invokePPPV(theap, min, max, __functionAddress);
    }

    // --- [ mi_manage_memory ] ---

    /** {@code bool mi_manage_memory(void * start, size_t size, bool is_committed, bool is_pinned, bool is_zero, int numa_node, bool exclusive, mi_commit_fun_t commit_fun, void * commit_fun_arg, mi_arena_id_t * arena_id)} */
    public static boolean nmi_manage_memory(long start, long size, boolean is_committed, boolean is_pinned, boolean is_zero, int numa_node, boolean exclusive, long commit_fun, long commit_fun_arg, long arena_id) {
        long __functionAddress = Functions.manage_memory;
        return invokePPPPPZ(start, size, is_committed, is_pinned, is_zero, numa_node, exclusive, commit_fun, commit_fun_arg, arena_id, __functionAddress);
    }

    /** {@code bool mi_manage_memory(void * start, size_t size, bool is_committed, bool is_pinned, bool is_zero, int numa_node, bool exclusive, mi_commit_fun_t commit_fun, void * commit_fun_arg, mi_arena_id_t * arena_id)} */
    @NativeType("bool")
    public static boolean mi_manage_memory(@NativeType("void *") ByteBuffer start, @NativeType("bool") boolean is_committed, @NativeType("bool") boolean is_pinned, @NativeType("bool") boolean is_zero, int numa_node, @NativeType("bool") boolean exclusive, @NativeType("mi_commit_fun_t") mi_commit_fun_tI commit_fun, @NativeType("void *") long commit_fun_arg, @NativeType("mi_arena_id_t *") @Nullable PointerBuffer arena_id) {
        if (CHECKS) {
            checkSafe(arena_id, 1);
        }
        return nmi_manage_memory(memAddress(start), start.remaining(), is_committed, is_pinned, is_zero, numa_node, exclusive, commit_fun.address(), commit_fun_arg, memAddressSafe(arena_id));
    }

    // --- [ mi_unsafe_heap_page_is_under_utilized ] ---

    /** {@code bool mi_unsafe_heap_page_is_under_utilized(mi_heap_t * heap, void * p, size_t perc_threshold)} */
    public static boolean nmi_unsafe_heap_page_is_under_utilized(long heap, long p, long perc_threshold) {
        long __functionAddress = Functions.unsafe_heap_page_is_under_utilized;
        if (CHECKS) {
            check(heap);
        }
        return invokePPPZ(heap, p, perc_threshold, __functionAddress);
    }

    /** {@code bool mi_unsafe_heap_page_is_under_utilized(mi_heap_t * heap, void * p, size_t perc_threshold)} */
    @NativeType("bool")
    public static boolean mi_unsafe_heap_page_is_under_utilized(@NativeType("mi_heap_t *") long heap, @NativeType("void *") @Nullable ByteBuffer p, @NativeType("size_t") long perc_threshold) {
        return nmi_unsafe_heap_page_is_under_utilized(heap, memAddressSafe(p), perc_threshold);
    }

    // --- [ mi_option_is_enabled ] ---

    /** {@code bool mi_option_is_enabled(mi_option_t option)} */
    @NativeType("bool")
    public static boolean mi_option_is_enabled(@NativeType("mi_option_t") int option) {
        long __functionAddress = Functions.option_is_enabled;
        return invokeZ(option, __functionAddress);
    }

    // --- [ mi_option_enable ] ---

    /** {@code void mi_option_enable(mi_option_t option)} */
    public static void mi_option_enable(@NativeType("mi_option_t") int option) {
        long __functionAddress = Functions.option_enable;
        invokeV(option, __functionAddress);
    }

    // --- [ mi_option_disable ] ---

    /** {@code void mi_option_disable(mi_option_t option)} */
    public static void mi_option_disable(@NativeType("mi_option_t") int option) {
        long __functionAddress = Functions.option_disable;
        invokeV(option, __functionAddress);
    }

    // --- [ mi_option_set_enabled ] ---

    /** {@code void mi_option_set_enabled(mi_option_t option, bool enable)} */
    public static void mi_option_set_enabled(@NativeType("mi_option_t") int option, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.option_set_enabled;
        invokeV(option, enable, __functionAddress);
    }

    // --- [ mi_option_set_enabled_default ] ---

    /** {@code void mi_option_set_enabled_default(mi_option_t option, bool enable)} */
    public static void mi_option_set_enabled_default(@NativeType("mi_option_t") int option, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.option_set_enabled_default;
        invokeV(option, enable, __functionAddress);
    }

    // --- [ mi_option_get ] ---

    /** {@code long mi_option_get(mi_option_t option)} */
    public static long mi_option_get(@NativeType("mi_option_t") int option) {
        long __functionAddress = Functions.option_get;
        return invokeN(option, __functionAddress);
    }

    // --- [ mi_option_get_clamp ] ---

    /** {@code long mi_option_get_clamp(mi_option_t option, long min, long max)} */
    public static long mi_option_get_clamp(@NativeType("mi_option_t") int option, long min, long max) {
        long __functionAddress = Functions.option_get_clamp;
        return invokeNNN(option, min, max, __functionAddress);
    }

    // --- [ mi_option_get_size ] ---

    /** {@code size_t mi_option_get_size(mi_option_t option)} */
    @NativeType("size_t")
    public static long mi_option_get_size(@NativeType("mi_option_t") int option) {
        long __functionAddress = Functions.option_get_size;
        return invokeP(option, __functionAddress);
    }

    // --- [ mi_option_set ] ---

    /** {@code void mi_option_set(mi_option_t option, long value)} */
    public static void mi_option_set(@NativeType("mi_option_t") int option, long value) {
        long __functionAddress = Functions.option_set;
        invokeNV(option, value, __functionAddress);
    }

    // --- [ mi_option_set_default ] ---

    /** {@code void mi_option_set_default(mi_option_t option, long value)} */
    public static void mi_option_set_default(@NativeType("mi_option_t") int option, long value) {
        long __functionAddress = Functions.option_set_default;
        invokeNV(option, value, __functionAddress);
    }

    // --- [ mi_aligned_alloc ] ---

    /** {@code void * mi_aligned_alloc(size_t alignment, size_t size)} */
    private static long nmi_aligned_alloc(long alignment, long size) {
        long __functionAddress = Functions.aligned_alloc;
        return invokePPP(alignment, size, __functionAddress);
    }

    /** {@code void * mi_aligned_alloc(size_t alignment, size_t size)} */
    @NativeType("void *")
    private static @Nullable ByteBuffer mi_aligned_alloc(@NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        long __result = nmi_aligned_alloc(alignment, size);
        return memByteBufferSafe(__result, (int)size);
    }

    public static final class Allocator implements MemoryAllocator {
        @Override public long getMalloc()                              { return Functions.malloc; }
        @Override public long getCalloc()                              { return Functions.calloc; }
        @Override public long getRealloc()                             { return Functions.realloc; }
        @Override public long getFree()                                { return Functions.free; }
        @Override public long getAlignedAlloc()                        { return Functions.aligned_alloc; }
        @Override public long getAlignedFree()                         { return Functions.free; }

        @Override public long malloc(long size)                        { return nmi_malloc(size); }
        @Override public long calloc(long num, long size)              { return nmi_calloc(num, size); }
        @Override public long realloc(long ptr, long size)             { return nmi_realloc(ptr, size); }
        @Override public void free(long ptr)                           { nmi_free(ptr); }
        @Override public long aligned_alloc(long alignment, long size) { return nmi_malloc_aligned(size, alignment); }
        @Override public void aligned_free(long ptr)                   { nmi_free(ptr); }
    }

}