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
            documentation = "A {@link MemoryAllocator} implementation using the rpmalloc library."
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
    documentation =
        """
        This struct enables configuration of a memory mapper providing map/unmap of memory pages. Defaults to {@code VirtualAlloc}/{@code mmap} if none
        provided. This allows rpmalloc to be used in contexts where memory is provided by internal means.

        Page size may be set explicitly in initialization. This allows the allocator to be used as a sub-allocator where the page granularity should be lower
        to reduce risk of wasting unused memory ranges.

        If rpmalloc is built with {@code ENABLE_GUARDS}, {@code memory_overwrite} may be set to detect writes before or after allocated memory blocks. This is
        not enabled in the default LWJGL build.
        """

    nullable..Module.RPMALLOC.callback {
        opaque_p(
            "RPMemoryMapCallback",
            """
            Map memory pages for the given number of bytes.

            The returned address MUST be aligned to the rpmalloc span size, which will always be a power of two. Optionally the function can store an alignment
            offset in the offset variable in case it performs alignment and the returned pointer is offset from the actual start of the memory region due to this
            alignment. The alignment offset will be passed to the memory unmap function. The alignment offset MUST NOT be larger than 65535 (storable in an
            {@code uint16_t}), if it is you must use natural alignment to shift it into 16 bits.

            If you set a {@code memory_map} function, you must also set a {@code memory_unmap} function or else the default implementation will be used for
            both.
            """,

            size_t("size", "the number of bytes to map"),
            Check(1)..size_t.p("offset", "the alignment offset")
        ) {
            documentation = "Instances of this interface may be set to the ##RPMallocConfig struct."
        }
    }("memory_map", "the memory map callback function")
    nullable..Module.RPMALLOC.callback {
        void(
            "RPMemoryUnmapCallback",
            """
            Unmap the memory pages starting at address and spanning the given number of bytes.

            If release is set to non-zero, the unmap is for an entire span range as returned by a previous call to {@code memory_map} and that the entire range
            should be released. The release argument holds the size of the entire span range. If {@code release} is set to 0, the unmap is a partial decommit
            of a subset of the mapped memory range.

            If you set a {@code memory_unmap} function, you must also set a {@code memory_map} function or else the default implementation will be used for
            both.
            """,

            //void* address, size_t size, size_t offset, int release
            opaque_p("address", "the address to unmap"),
            size_t("size", "the size of the mapped pages, in bytes"),
            size_t("offset", "the alignment offset"),
            intb("release", "the release flag")
        ) {
            documentation = "Instances of this interface may be set to the ##RPMallocConfig struct."
        }
    }("memory_unmap", "the memory unmap callback function")
    nullable..Module.RPMALLOC.callback {
        void(
            "RPErrorCallback",
            "Called when an assert fails, if asserts are enabled. Will use the standard {@code assert()} if this is not set.",

            charASCII.const.p("message", "")
        ) {
            documentation = "Instances of this interface may be set to the ##RPMallocConfig struct."
        }
    }("error_callback", "the error callback function")
    nullable..Module.RPMALLOC.callback {
        int(
            "RPMapFailCallback",
            """
            Called when a call to map memory pages fails (out of memory).
            
            If this callback is not set or returns zero the library will return a null pointer in the allocation call. If this callback returns non-zero the
            map call will be retried. The argument passed is the number of bytes that was requested in the map call. Only used if the default system memory map
            function is used ({@code memory_map} callback is not set).
            """,

            size_t("size", "")
        ) {
            documentation = "Instances of this interface may be set to the ##RPMallocConfig struct."
        }
    }("map_fail_callback", "the map fail callback function")
	size_t(
        "page_size",
        """
        the size of memory pages.

        The page size MUST be a power of two in {@code [512,16384]} range (2<sup>9</sup> to 2<sup>14</sup>) unless 0 - set to 0 to use system page size. All
        memory mapping requests to {@code memory_map} will be made with size set to a multiple of the page size.
        
        Used if {@code RPMALLOC_CONFIGURABLE} is defined to 1, otherwise system page size is used.
        """
    )
    size_t(
        "span_size",
        """
        size of a span of memory blocks.

        MUST be a power of two, and in {@code [4096,262144]} range (unless 0 - set to 0 to use the default span size).
        
        Used if {@code RPMALLOC_CONFIGURABLE} is defined to 1.
        """
    )
    size_t(
        "span_map_count",
        """
        number of spans to map at each request to map new virtual memory blocks.

        This can be used to minimize the system call overhead at the cost of virtual memory address space. The extra mapped pages will not be written until
        actually used, so physical committed memory should not be affected in the default implementation.

        Will be aligned to a multiple of spans that match memory page size in case of huge pages.
        """
    )
	intb(
        "enable_huge_pages",
        """
        enable use of large/huge pages.

        If this flag is set to non-zero and page size is zero, the allocator will try to enable huge pages and auto detect the configuration. If this is set to
        non-zero and page_size is also non-zero, the allocator will assume huge pages have been configured and enabled prior to initializing the allocator.

        For Windows, see <a href="https://docs.microsoft.com/en-us/windows/desktop/memory/large-page-support">large-page-support</a>. For Linux, see
        <a href="https://www.kernel.org/doc/Documentation/vm/hugetlbpage.txt">hugetlbpage.txt</a>.
        """
    )
    padding(4)
}

val rpmalloc_global_statistics_t = struct(
    Module.RPMALLOC,
    "RPmallocGlobalStatistics",
    nativeName = "rpmalloc_global_statistics_t",
    mutable = false
) {
    size_t("mapped", "Current amount of virtual memory mapped, all of which might not have been committed (only if {@code ENABLE_STATISTICS=1})")
	size_t("mapped_peak", "Peak amount of virtual memory mapped, all of which might not have been committed (only if {@code ENABLE_STATISTICS=1})")
    size_t("cached", "Current amount of memory in global caches for small and medium sizes (&lt;32KiB)")
	size_t(
        "huge_alloc",
        """
        Current amount of memory allocated in huge allocations, i.e larger than {@code LARGE_SIZE_LIMIT} which is 2MiB by default (only if
        {@code ENABLE_STATISTICS=1})
        """
    )
	size_t(
        "huge_alloc_peak",
        """
        Peak amount of memory allocated in huge allocations, i.e larger than {@code LARGE_SIZE_LIMIT} which is 2MiB by default (only if
        {@code ENABLE_STATISTICS=1})
        """
    )
    size_t("mapped_total", "Total amount of memory mapped since initialization (only if {@code ENABLE_STATISTICS=1})")
    size_t("unmapped_total", "Total amount of memory unmapped since initialization  (only if {@code ENABLE_STATISTICS=1})")
}

val rpmalloc_thread_statistics_t = struct(
    Module.RPMALLOC,
    "RPmallocThreadStatistics",
    nativeName = "rpmalloc_thread_statistics_t",
    mutable = false
) {
    size_t("sizecache", "Current number of bytes available in thread size class caches for small and medium sizes (&lt;32KiB)")
	size_t("spancache", "Current number of bytes available in thread span caches for small and medium sizes (&lt;32KiB)")
	size_t("thread_to_global", "Total number of bytes transitioned from thread cache to global cache (only if {@code ENABLE_STATISTICS=1})")
	size_t("global_to_thread", "Total number of bytes transitioned from global cache to thread cache (only if {@code ENABLE_STATISTICS=1})")
	struct {
		size_t("current", "Currently used number of spans")
		size_t("peak", "High water mark of spans used")
		size_t("to_global", "Number of spans transitioned to global cache")
		size_t("from_global", "Number of spans transitioned from global cache")
		size_t("to_cache", "Number of spans transitioned to thread cache")
		size_t("from_cache", "Number of spans transitioned from thread cache")
		size_t("to_reserved", "Number of spans transitioned to reserved state")
		size_t("from_reserved", "Number of spans transitioned from reserved state")
		size_t("map_calls", "Number of raw memory map calls (not hitting the reserve spans but resulting in actual OS mmap calls)")
	}("span_use", "Per span count statistics (only if {@code ENABLE_STATISTICS=1})")[64]
	struct {
		size_t("alloc_current", "Current number of allocations")
		size_t("alloc_peak", "Peak number of allocations")
		size_t("alloc_total", "Total number of allocations")
		size_t("free_total", "Total number of frees")
		size_t("spans_to_cache", "Number of spans transitioned to cache")
		size_t("spans_from_cache", "Number of spans transitioned from cache")
		size_t("spans_from_reserved", "Number of spans transitioned from reserved state")
		size_t("map_calls", "Number of raw memory map calls (not hitting the reserve spans but resulting in actual OS mmap calls)")
	}("size_use", "Per size class statistics (only if {@code ENABLE_STATISTICS=1})")[128]
}