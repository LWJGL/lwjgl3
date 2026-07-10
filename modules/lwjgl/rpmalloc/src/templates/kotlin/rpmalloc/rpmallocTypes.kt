/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package rpmalloc

import org.lwjgl.generator.*

val rpmalloc_heap_t = "rpmalloc_heap_t".opaque

val rpmalloc_interface_t = struct(Module.RPMALLOC, "rpmalloc_interface_t", nativeName = "rpmalloc_interface_t", skipBuffer = true) {
    nullable..Module.RPMALLOC.callback {
        opaque_p(
            "rpmalloc_interface_memory_map",

            size_t("size"),
            size_t("alignment"),
            Check(1)..size_t.p("offset"),
            Check(1)..size_t.p("mapped_size")
        ) {}
    }("memory_map")
    nullable..Module.RPMALLOC.callback {
        int(
            "rpmalloc_interface_memory_commit",

            void.p("address"),
            AutoSize("address")..size_t("size")
        ) {}
    }("memory_commit")
    nullable..Module.RPMALLOC.callback {
        int(
            "rpmalloc_interface_memory_decommit",

            void.p("address"),
            AutoSize("address")..size_t("size")
        ) {}
    }("memory_decommit")
    nullable..Module.RPMALLOC.callback {
        void(
            "rpmalloc_interface_memory_unmap",

            void.p("address"),
            size_t("offset"),
            AutoSize("address")..size_t("mapped_size")
        ) {}
    }("memory_unmap")
    nullable..Module.RPMALLOC.callback {
        int(
            "rpmalloc_interface_map_fail_callback",

            size_t("size")
        ) {}
    }("map_fail_callback")
    nullable..Module.RPMALLOC.callback {
        void(
            "rpmalloc_interface_error_callback",

            charASCII.const.p("message")
        ) {}
    }("error_callback")
}

val rpmalloc_config_t = struct(Module.RPMALLOC, "rpmalloc_config_t", nativeName = "rpmalloc_config_t", skipBuffer = true) {
 	size_t("page_size")
	intb("enable_huge_pages")
    intb("enable_thp")
    intb("disable_decommit")
    nullable..charASCII.const.p("page_name")
    nullable..charASCII.const.p("huge_page_name")
    intb("unmap_on_finalize")
    intb("disable_thp")
}

val rpmalloc_global_statistics_t = struct(Module.RPMALLOC, "rpmalloc_global_statistics_t", mutable = false) {
    size_t("mapped")
	size_t("mapped_peak")
	size_t("committed")
	size_t("decommitted")
	size_t("active")
	size_t("active_peak")
	size_t("huge_alloc")
	size_t("huge_alloc_peak")
	size_t("heap_count")
}

val rpmalloc_thread_statistics_t = struct(Module.RPMALLOC, "rpmalloc_thread_statistics_t", mutable = false) {
    size_t("sizecache")
	size_t("spancache")
	size_t("thread_to_global")
	size_t("global_to_thread")
	struct {
		size_t("current")
		size_t("map_calls")
	}("span_use")[5]
	struct {
		size_t("alloc_current")
		size_t("alloc_peak")
		size_t("alloc_total")
		size_t("free_total")
	}("size_use")[128]
}

val rpmalloc_heap_statistics_t = struct(
    Module.RPMALLOC,
    "rpmalloc_heap_statistics_t",
    nativeName = "struct rpmalloc_heap_statistics_t",
    mutable = false
) {
    size_t("allocated_size")
    size_t("committed_size")
    size_t("mapped_size")
}