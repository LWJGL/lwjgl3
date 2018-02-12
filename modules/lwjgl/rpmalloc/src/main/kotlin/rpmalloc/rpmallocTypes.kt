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

val rpmalloc_config_t = struct(Module.RPMALLOC, "RPMallocConfig", nativeName = "rpmalloc_config_t") {
    documentation =
        """
        This struct enables configuration of a memory mapper providing map/unmap of memory pages. Defaults to {@code VirtualAlloc}/{@code mmap} if none
        provided. This allows rpmalloc to be used in contexts where memory is provided by internal means.

        Page size may be set explicitly in initialization. This allows the allocator to be used as a sub-allocator where the page granularity should be lower
        to reduce risk of wasting unused memory ranges.

        If rpmalloc is built with {@code ENABLE_GUARDS}, {@code memory_overwrite} may be set to detect writes before or after allocated memory blocks. This is
        not enabled in the default LWJGL build.
        """

    nullable..callback(
        Module.RPMALLOC, opaque_p, "RPMemoryMapCallback",
        """
        Map memory pages for the given number of bytes.

        The returned address MUST be 2 byte aligned, and should ideally be 64KiB aligned. If memory returned is not 64KiB aligned rpmalloc will call unmap and
        then another map request with size padded by 64KiB in order to align it internally.
        """,

        size_t.IN("size", "the number of bytes to map")
    ) {
        documentation = "Instances of this interface may be set to the ##RPMallocConfig struct."
    }.member("memory_map", "the memory map callback function")
    nullable..callback(
        Module.RPMALLOC, void, "RPMemoryUnmapCallback",
        """
        Unmap the memory pages starting at address and spanning the given number of bytes.

        Address will always be an address returned by an earlier call to {@code memory_map} function.
        """,

        opaque_p.IN("address", "the address to unmap"),
        size_t.IN("size", "the size of the mapped pages, in bytes")
    ) {
        documentation = "Instances of this interface may be set to the ##RPMallocConfig struct."
    }.member("memory_unmap", "the memory unmap callback function")
	size_t.member(
        "page_size",
        """
        the size of memory pages.

        All allocation requests will be made in multiples of this page size. If set to 0, rpmalloc will use system calls to determine the page size. The page
        size MUST be a power of two in {@code [512,16384]} range ({@code 2^9} to {@code 2^14}).
        """
    )
    nullable..callback(
        Module.RPMALLOC, void, "RPMemoryOverwriteCallback",
        "Debug callback if memory guards are enabled. Called if a memory overwrite is detected before or after the allocated memory block.",

        opaque_p.IN("address", "the allocated block around which memory overwrite was detected")
    ) {
        documentation = "Instances of this interface may be set to the ##RPMallocConfig struct."
    }.member("memory_overwrite", "the memory overwrite callback function")
}

val rpmalloc_global_statistics_t = struct(
    Module.RPMALLOC,
    "RPmallocGlobalStatistics",
    nativeName = "rpmalloc_global_statistics_t",
    mutable = false
) {
    size_t.member("mapped", "Current amount of virtual memory mapped (only if {@code ENABLE_STATISTICS=1})")
    size_t.member("cached", "Current amount of memory in global caches for small and medium sizes (<64KiB)")
    size_t.member("cached_large", "Curren amount of memory in global caches for large sizes (>=64KiB)")
    size_t.member("mapped_total", "Total amount of memory mapped (only if {@code ENABLE_STATISTICS=1})")
    size_t.member("unmapped_total", "Total amount of memory unmapped (only if {@code ENABLE_STATISTICS=1})")
}

val rpmalloc_thread_statistics_t = struct(
    Module.RPMALLOC,
    "RPmallocThreadStatistics",
    nativeName = "rpmalloc_thread_statistics_t",
    mutable = false
) {
    size_t.member("requested", "Amount of memory currently requested in allocations (only if {@code ENABLE_STATISTICS=1})")
    size_t.member("allocated", "Amount of memory actually allocated in memory blocks (only if {@code ENABLE_STATISTICS=1})")
    size_t.member("active", "Current number of bytes available for allocation from active spans")
    size_t.member("sizecache", "Current number of bytes available in thread size class caches")
    size_t.member("spancache", "Current number of bytes available in thread span caches")
    size_t.member("deferred", "Current number of bytes in pending deferred deallocations")
    size_t.member("thread_to_global", "Total number of bytes transitioned from thread cache to global cache")
    size_t.member("global_to_thread", "Total number of bytes transitioned from global cache to thread cache")
}