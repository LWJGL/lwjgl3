/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package rpmalloc

import org.lwjgl.generator.*
import java.io.*

fun config() {
    packageInfo(
        Module.RPMALLOC,
        """
        Contains bindings to the ${url("https://github.com/rampantpixels/rpmalloc", "rpmalloc")} library. rpmalloc is a public domain cross platform lock free
        thread caching 16-byte aligned memory allocator implemented in C.
        """
    )

    Generator.registerLibraryInit(Module.RPMALLOC, "LibRPmalloc", "rpmalloc")

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
	size_t(
        "page_size",
        """
        the size of memory pages.

        The page size MUST be a power of two in {@code [512,16384]} range (2<sup>9</sup> to 2<sup>14</sup>) unless 0 - set to 0 to use system page size. All
        memory mapping requests to {@code memory_map} will be made with size set to a multiple of the page size.
        """
    )
    size_t(
        "span_size",
        """
        size of a span of memory blocks.

        MUST be a power of two, and in {@code [4096,262144]} range (unless 0 - set to 0 to use the default span size).
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
}

val rpmalloc_global_statistics_t = struct(
    Module.RPMALLOC,
    "RPmallocGlobalStatistics",
    nativeName = "rpmalloc_global_statistics_t",
    mutable = false
) {
    size_t("mapped", "Current amount of virtual memory mapped (only if {@code ENABLE_STATISTICS=1})")
    size_t("cached", "Current amount of memory in global caches for small and medium sizes (&lt;64KiB)")
    size_t("mapped_total", "Total amount of memory mapped (only if {@code ENABLE_STATISTICS=1})")
    size_t("unmapped_total", "Total amount of memory unmapped (only if {@code ENABLE_STATISTICS=1})")
}

val rpmalloc_thread_statistics_t = struct(
    Module.RPMALLOC,
    "RPmallocThreadStatistics",
    nativeName = "rpmalloc_thread_statistics_t",
    mutable = false
) {
    size_t("active", "Current number of bytes available for allocation from active spans")
    size_t("sizecache", "Current number of bytes available in thread size class caches")
    size_t("spancache", "Current number of bytes available in thread span caches")
    size_t("deferred", "Current number of bytes in pending deferred deallocations")
    size_t("thread_to_global", "Total number of bytes transitioned from thread cache to global cache")
    size_t("global_to_thread", "Total number of bytes transitioned from global cache to thread cache")
}