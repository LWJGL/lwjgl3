/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package rpmalloc

import org.lwjgl.generator.*
import java.io.*

fun config() {
    Generator.register(object : GeneratorTarget(Module.RPMALLOC, "RPmallocAllocator") {

        init {
            javaImport("org.lwjgl.system.MemoryUtil.*")
            javaImport("static org.lwjgl.system.rpmalloc.RPmalloc.*")
        }

        override fun PrintWriter.generateJava() {
            generateJavaPreamble()
            println("""public class RPmallocAllocator implements MemoryAllocator {

    static {
        // initialize rpmalloc
        LibRPmalloc.initialize();
        rpmalloc_initialize();
    }

    @Override
    public long getMalloc() { return rpmalloc_address(); }

    @Override
    public long getCalloc() { return rpcalloc_address(); }

    @Override
    public long getRealloc() { return rprealloc_address(); }

    @Override
    public long getFree() { return rpfree_address(); }

    @Override
    public long getAlignedAlloc() { return rpaligned_alloc_address(); }

    @Override
    public long getAlignedFree() { return rpfree_address(); }

    @Override
    public long malloc(long size) {
        return nrpmalloc(size);
    }

    @Override
    public long calloc(long num, long size) {
        return nrpcalloc(num, size);
    }

    @Override
    public long realloc(long ptr, long size) {
        return nrprealloc(ptr, size);
    }

    @Override
    public void free(long ptr) {
        nrpfree(ptr);
    }

    @Override
    public long aligned_alloc(long alignment, long size) {
        return nrpaligned_alloc(alignment, size);
    }

    @Override
    public void aligned_free(long ptr) {
        nrpfree(ptr);
    }

}""")
        }
    })
}

val rpmalloc_heap_t = "rpmalloc_heap_t".opaque

val rpmalloc_config_t = struct(Module.RPMALLOC, "RPMallocConfig", nativeName = "rpmalloc_config_t", skipBuffer = true) {
    nullable..Module.RPMALLOC.callback {
        opaque_p(
            "RPMemoryMapCallback",

            size_t("size"),
            Check(1)..size_t.p("offset")
        ) {}
    }("memory_map")
    nullable..Module.RPMALLOC.callback {
        void(
            "RPMemoryUnmapCallback",

            //void* address, size_t size, size_t offset, int release
            opaque_p("address"),
            size_t("size"),
            size_t("offset"),
            intb("release")
        ) {}
    }("memory_unmap")
    nullable..Module.RPMALLOC.callback {
        void(
            "RPErrorCallback",

            charASCII.const.p("message")
        ) {}
    }("error_callback")
    nullable..Module.RPMALLOC.callback {
        int(
            "RPMapFailCallback",

            size_t("size")
        ) {}
    }("map_fail_callback")
	size_t("page_size")
    size_t("span_size")
    size_t("span_map_count")
	intb("enable_huge_pages")
    nullable..charASCII.const.p("page_name")
    nullable..charASCII.const.p("huge_page_name")
}

val rpmalloc_global_statistics_t = struct(
    Module.RPMALLOC,
    "RPmallocGlobalStatistics",
    nativeName = "rpmalloc_global_statistics_t",
    mutable = false
) {
    size_t("mapped")
	size_t("mapped_peak")
    size_t("cached")
	size_t("huge_alloc")
	size_t("huge_alloc_peak")
    size_t("mapped_total")
    size_t("unmapped_total")
}

val rpmalloc_thread_statistics_t = struct(
    Module.RPMALLOC,
    "RPmallocThreadStatistics",
    nativeName = "rpmalloc_thread_statistics_t",
    mutable = false
) {
    size_t("sizecache")
	size_t("spancache")
	size_t("thread_to_global")
	size_t("global_to_thread")
	struct {
		size_t("current")
		size_t("peak")
		size_t("to_global")
		size_t("from_global")
		size_t("to_cache")
		size_t("from_cache")
		size_t("to_reserved")
		size_t("from_reserved")
		size_t("map_calls")
	}("span_use")[64]
	struct {
		size_t("alloc_current")
		size_t("alloc_peak")
		size_t("alloc_total")
		size_t("free_total")
		size_t("spans_to_cache")
		size_t("spans_from_cache")
		size_t("spans_from_reserved")
		size_t("map_calls")
	}("size_use")[128]
}