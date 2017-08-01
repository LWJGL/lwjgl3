/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.rpmalloc

import org.lwjgl.generator.*
import java.io.*

val RPMALLOC_PACKAGE = "org.lwjgl.system.rpmalloc"

fun config() {
    packageInfo(
        RPMALLOC_PACKAGE,
        """
        Contains bindings to the ${url("https://github.com/rampantpixels/rpmalloc", "rpmalloc")} library. rpmalloc is a public domain cross platform lock free
        thread caching 16-byte aligned memory allocator implemented in C.
        """
    )

    Generator.registerLibraryInit(RPMALLOC_PACKAGE, "LibRPmalloc", "rpmalloc")

    Generator.register(object : GeneratorTarget(RPMALLOC_PACKAGE, "RPmallocAllocator") {

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

val rpmalloc_global_statistics_t_p = struct(
    RPMALLOC_PACKAGE,
    "RPmallocGlobalStatistics",
    nativeName = "rpmalloc_global_statistics_t",
    mutable = false
) {
    size_t.member("mapped", "Current amount of virtual memory mapped (only if {@code ENABLE_STATISTICS=1})")
    size_t.member("cached", "Current amount of memory in global caches for small and medium sizes (<64KiB)")
    size_t.member("cached_large", "Curren amount of memory in global caches for large sizes (>=64KiB)")
    size_t.member("mapped_total", "Total amount of memory mapped (only if {@code ENABLE_STATISTICS=1})")
    size_t.member("unmapped_total", "Total amount of memory unmapped (only if {@code ENABLE_STATISTICS=1})")
}.p

val rpmalloc_thread_statistics_t_p = struct(
    RPMALLOC_PACKAGE,
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
}.p