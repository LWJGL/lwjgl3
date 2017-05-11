/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.jemalloc

import org.lwjgl.generator.*
import java.io.*

val JEMALLOC_PACKAGE = "org.lwjgl.system.jemalloc"

fun config() {
    packageInfo(
        JEMALLOC_PACKAGE,
        """
        Contains bindings to the ${url("http://jemalloc.net/", "jemalloc")} library. jemalloc is a general purpose malloc implementation that emphasizes
        fragmentation avoidance and scalable concurrency support.

        The jemalloc documentation can be found ${url("http://jemalloc.net/jemalloc.3.html", "here")}. The jemalloc
        ${url("https://github.com/jemalloc/jemalloc/wiki", "wiki")} also contains useful information.

        The jemalloc shared library that comes with LWJGL is configured with:
        ${ul(
            "--with-jemalloc-prefix=je_",
            "--with-malloc-conf=purge:decay",
            "--enable-tls",
            "--disable-stats",
            "--disable-fill",
            "--disable-zone-allocator (MacOS)"
        )}

        The shared library may be replaced with a custom build that has more features enabled.

        Dynamic configuration (for enabled features) is also possible, using either the {@code MALLOC_CONF} environment variable or the
        ${url("http://jemalloc.net/jemalloc.3.html\\#mallctl_namespace", "MALLCTL NAMESPACE")} and the {@code mallctl*} functions.
        """
    )

    Generator.register(object : GeneratorTarget(JEMALLOC_PACKAGE, "JEmallocAllocator") {

        init {
            javaImport("org.lwjgl.system.MemoryUtil.*")
            javaImport("static org.lwjgl.system.jemalloc.JEmalloc.*")
            documentation = "A {@link MemoryAllocator} implementation using the jemalloc library."
        }

        override fun PrintWriter.generateJava() {
            generateJavaPreamble()
            println("""public class JEmallocAllocator implements MemoryAllocator {

    static {
        // initialize jemalloc
        JEmalloc.getLibrary();
    }

    @Override
    public long getMalloc() { return JEmalloc.Functions.malloc; }

    @Override
    public long getCalloc() { return JEmalloc.Functions.calloc; }

    @Override
    public long getRealloc() { return JEmalloc.Functions.realloc; }

    @Override
    public long getFree() { return JEmalloc.Functions.free; }

    @Override
    public long getAlignedAlloc() { return JEmalloc.Functions.aligned_alloc; }

    @Override
    public long getAlignedFree() { return JEmalloc.Functions.free; }

    @Override
    public long malloc(long size) {
        return nje_malloc(size);
    }

    @Override
    public long calloc(long num, long size) {
        return nje_calloc(num, size);
    }

    @Override
    public long realloc(long ptr, long size) {
        return nje_realloc(ptr, size);
    }

    @Override
    public void free(long ptr) {
        nje_free(ptr);
    }

    @Override
    public long aligned_alloc(long alignment, long size) {
        return nje_aligned_alloc(alignment, size);
    }

    @Override
    public void aligned_free(long ptr) {
        nje_free(ptr);
    }

}""")
        }
    })
}

val je_malloc_message_cb = "je_malloc_message_cb".callback(
    JEMALLOC_PACKAGE, void, "MallocMessageCallback",
    "Will be called by the #malloc_usable_size() method.",

    void_p.IN("cbopaque", "the opaque pointer passed to #malloc_usable_size()"),
    NullTerminated..const..charASCII_p.IN("s", "the message")
) {
    documentation = "Instances of this interface may be passed to the #malloc_usable_size() method."
    additionalCode = """
    /**
     * Converts the specified {@link MallocMessageCallback} arguments to a String.
     *
     * <p>This method may only be used inside a MallocMessageCallback invocation.</p>
     *
     * @param s the MallocMessageCallback {@code s} argument
     *
     * @return the message as a String
     */
    public static String getMessage(long s) {
        return memASCII(s);
    }
    """
}

val chunk_alloc_t = "chunk_alloc_t".callback(
    JEMALLOC_PACKAGE, void_p, "ChunkAlloc",
    "Chunk allocation hook.",

    void_p.IN("new_addr", ""),
    size_t.IN("size", ""),
    size_t.IN("alignment", ""),
    bool_p.INOUT("zero", ""),
    bool_p.INOUT("commit", ""),
    unsigned_int.IN("arena_ind", "")
) {
    documentation = "Instances of this interface may be set to the ##ChunkHooks struct."
}

val chunk_dalloc_t = "chunk_dalloc_t".callback(
    JEMALLOC_PACKAGE, bool, "ChunkDalloc",
    "Chunk deallocation hook.",

    void_p.IN("chunk", ""),
    size_t.IN("size", ""),
    bool.IN("committed", ""),
    unsigned_int.IN("arena_ind", "")
) {
    documentation = "Instances of this interface may be set to the ##ChunkHooks struct."
}

val chunk_commit_t = "chunk_commit_t".callback(
    JEMALLOC_PACKAGE, bool, "ChunkCommit",
    "Chunk commit hook.",

    void_p.IN("chunk", ""),
    size_t.IN("size", ""),
    size_t.IN("offset", ""),
    size_t.IN("length", ""),
    unsigned_int.IN("arena_ind", "")
) {
    documentation = "Instances of this interface may be set to the ##ChunkHooks struct."
}

val chunk_decommit_t = "chunk_decommit_t".callback(
    JEMALLOC_PACKAGE, bool, "ChunkDecommit",
    "Chunk decommit hook.",

    void_p.IN("chunk", ""),
    size_t.IN("size", ""),
    size_t.IN("offset", ""),
    size_t.IN("length", ""),
    unsigned_int.IN("arena_ind", "")
) {
    documentation = "Instances of this interface may be set to the ##ChunkHooks struct."
}

val chunk_purge_t = "chunk_purge_t".callback(
    JEMALLOC_PACKAGE, bool, "ChunkPurge",
    "Chunk purge hook.",

    void_p.IN("chunk", ""),
    size_t.IN("size", ""),
    size_t.IN("offset", ""),
    size_t.IN("length", ""),
    unsigned_int.IN("arena_ind", "")
) {
    documentation = "Instances of this interface may be set to the ##ChunkHooks struct."
}

val chunk_split_t = "chunk_split_t".callback(
    JEMALLOC_PACKAGE, bool, "ChunkSplit",
    "Chunk split hook.",

    void_p.IN("chunk", ""),
    size_t.IN("size", ""),
    size_t.IN("size_a", ""),
    size_t.IN("size_b", ""),
    bool.IN("committed", ""),
    unsigned_int.IN("arena_ind", "")
) {
    documentation = "Instances of this interface may be set to the ##ChunkHooks struct."
}

val chunk_merge_t = "chunk_merge_t".callback(
    JEMALLOC_PACKAGE, bool, "ChunkMerge",
    "Chunk merge hook.",

    void_p.IN("chunk_a", ""),
    size_t.IN("size_a", ""),
    void_p.IN("chunk_b", ""),
    size_t.IN("size_b", ""),
    bool.IN("committed", ""),
    unsigned_int.IN("arena_ind", "")
) {
    documentation = "Instances of this interface may be set to the ##ChunkHooks struct."
}

val chunk_hooks_t = struct(JEMALLOC_PACKAGE, "ChunkHooks", nativeName = "chunk_hooks_t") {
    documentation =
        """
    Comprises function pointers which are described individually below. jemalloc uses these functions to manage chunk lifetime, which starts off with
    allocation of mapped committed memory, in the simplest case followed by deallocation. However, there are performance and platform reasons to retain chunks
    for later reuse. Cleanup attempts cascade from deallocation to decommit to purging, which gives the chunk management functions opportunities to reject the
    most permanent cleanup operations in favor of less permanent (and often less costly) operations. The chunk splitting and merging operations can also be
    opted out of, but this is mainly intended to support platforms on which virtual memory mappings provided by the operating system kernel do not
    automatically coalesce and split, e.g. Windows.
    """

    chunk_alloc_t.member("alloc", "the chunk allocation hook")
    chunk_dalloc_t.member("dalloc", "the chunk deallocation hook")
    chunk_commit_t.member("commit", "the chunk commit hook")
    chunk_decommit_t.member("decommit", "the chunk decommit hook")
    chunk_purge_t.member("purge", "the chunk purge hook")
    chunk_split_t.member("split", "the chunk split hook")
    chunk_merge_t.member("merge", "the chunk merge hook")
}.p