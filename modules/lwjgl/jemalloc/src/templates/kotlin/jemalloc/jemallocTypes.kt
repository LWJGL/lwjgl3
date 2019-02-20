/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package jemalloc

import org.lwjgl.generator.*
import java.io.*

fun config() {
    Generator.register(object : GeneratorTarget(Module.JEMALLOC, "JEmallocAllocator") {

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

val write_cb = Module.JEMALLOC.callback {
    void(
        "MallocMessageCallback",
        "Will be called by the #malloc_usable_size() method.",

        void.p("cbopaque", "the opaque pointer passed to #malloc_usable_size()"),
        NullTerminated..charASCII.const.p("s", "the message")
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
}

private val _extent_hooks_t = struct(Module.JEMALLOC, "ExtentHooks", nativeName = "extent_hooks_t")

val extent_alloc_t = Module.JEMALLOC.callback {
    void.p(
        "ExtentAlloc",
        """
        Extent allocation hook.

        An extent allocation function conforms to the {@code extent_alloc_t} type and upon success returns a pointer to {@code size} bytes of mapped memory on
        behalf of arena {@code arena_ind} such that the extent's base address is a multiple of {@code alignment}, as well as setting {@code *zero} to indicate
        whether the extent is zeroed and {@code *commit} to indicate whether the extent is committed. Upon error the function returns #NULL and leaves
        {@code *zero} and {@code *commit} unmodified. The {@code size} parameter is always a multiple of the page size. The {@code alignment} parameter is always a
        power of two at least as large as the page size. Zeroing is mandatory if {@code *zero} is true upon function entry. Committing is mandatory if
        {@code *commit} is true upon function entry. If {@code new_addr} is not #NULL, the returned pointer must be {@code new_addr} on success or #NULL on error.
        Committed memory may be committed in absolute terms as on a system that does not overcommit, or in implicit terms as on a system that overcommits and
        satisfies physical memory needs on demand via soft page faults. Note that replacing the default extent allocation function makes the arena's
        {@code arena.i.dss} setting irrelevant.
        """,

        _extent_hooks_t.p("extent_hooks", ""),
        nullable..void.p("new_addr", ""),
        size_t("size", ""),
        size_t("alignment", ""),
        Check(1)..bool.p("zero", ""),
        Check(1)..bool.p("commit", ""),
        unsigned_int("arena_ind", ""),

        nativeType = "extent_alloc_t"
    ) {
        documentation = "Instances of this interface may be set to the ##ExtentHooks struct."
    }
}

val extent_dalloc_t = Module.JEMALLOC.callback {
    bool(
        "ExtentDalloc",
        """
        Extent deallocation hook.

        An extent deallocation function conforms to the {@code extent_dalloc_t} type and deallocates an extent at given {@code addr} and {@code size} with
        {@code committed}/decommited memory as indicated, on behalf of arena {@code arena_ind}, returning false upon success. If the function returns true, this
        indicates opt-out from deallocation; the virtual memory mapping associated with the extent remains mapped, in the same commit state, and available for
        future use, in which case it will be automatically retained for later reuse.
        """,

        _extent_hooks_t.p("extent_hooks", ""),
        void.p("addr", ""),
        AutoSize("addr")..size_t("size", ""),
        bool("committed", ""),
        unsigned_int("arena_ind", ""),

        nativeType = "extent_dalloc_t"
    ) {
        documentation = "Instances of this interface may be set to the ##ExtentHooks struct."
    }
}

val extent_destroy_t = Module.JEMALLOC.callback {
    bool(
        "ExtentDestroy",
        """
        Extent destruction hook.

        An extent destruction function conforms to the {@code extent_destroy_t} type and unconditionally destroys an extent at given {@code addr} and {@code size}
        with {@code committed}/decommited memory as indicated, on behalf of arena {@code arena_ind}. This function may be called to destroy retained extents during
        arena destruction (see {@code arena.i.destroy}).
        """,

        _extent_hooks_t.p("extent_hooks", ""),
        void.p("addr", ""),
        AutoSize("addr")..size_t("size", ""),
        bool("committed", ""),
        unsigned_int("arena_ind", ""),

        nativeType = "extent_destroy_t"
    ) {
        documentation = "Instances of this interface may be set to the ##ExtentHooks struct."
    }
}

val extent_commit_t = Module.JEMALLOC.callback {
    bool(
        "ExtentCommit",
        """
        Extent commit hook.

        An extent commit function conforms to the {@code extent_commit_t} type and commits zeroed physical memory to back pages within an extent at given
        {@code addr} and {@code size} at {@code offset} bytes, extending for {@code length} on behalf of arena {@code arena_ind}, returning false upon success.
        Committed memory may be committed in absolute terms as on a system that does not overcommit, or in implicit terms as on a system that overcommits and
        satisfies physical memory needs on demand via soft page faults. If the function returns true, this indicates insufficient physical memory to satisfy the
        request.
        """,

        _extent_hooks_t.p("extent_hooks", ""),
        void.p("addr", ""),
        AutoSize("addr")..size_t("size", ""),
        size_t("offset", ""),
        size_t("length", ""),
        unsigned_int("arena_ind", ""),

        nativeType = "extent_commit_t"
    ) {
        documentation = "Instances of this interface may be set to the ##ExtentHooks struct."
    }
}

val extent_decommit_t = Module.JEMALLOC.callback {
    bool(
        "ExtentDecommit",
        """
        Extent decommit hook.

        An extent decommit function conforms to the {@code extent_decommit_t} type and decommits any physical memory that is backing pages within an extent at
        given {@code addr} and {@code size} at {@code offset} bytes, extending for {@code length} on behalf of arena {@code arena_ind}, returning false upon
        success, in which case the pages will be committed via the extent commit function before being reused.  If the function returns true, this indicates
        opt-out from decommit; the memory remains committed and available for future use, in which case it will be automatically retained for later reuse.
        """,

        _extent_hooks_t.p("extent_hooks", ""),
        void.p("addr", ""),
        AutoSize("addr")..size_t("size", ""),
        size_t("offset", ""),
        size_t("length", ""),
        unsigned_int("arena_ind", ""),

        nativeType = "extent_decommit_t"
    ) {
        documentation = "Instances of this interface may be set to the ##ExtentHooks struct."
    }
}
val extent_purge_t = Module.JEMALLOC.callback {
    bool(
        "ExtentPurge",
        """
        Extent purge hook.

        An extent purge function conforms to the {@code extent_purge_t} type and discards physical pages within the virtual memory mapping associated with an
        extent at given {@code addr} and {@code size} at {@code offset} bytes, extending for {@code length} on behalf of arena {@code arena_ind}. A lazy extent
        purge function (e.g. implemented via {@code madvise(..., MADV_FREE)}) can delay purging indefinitely and leave the pages within the purged virtual memory
        range in an indeterminite state, whereas a forced extent purge function immediately purges, and the pages within the virtual memory range will be
        zero-filled the next time they are accessed. If the function returns true, this indicates failure to purge.
        """,

        _extent_hooks_t.p("extent_hooks", ""),
        void.p("addr", ""),
        AutoSize("addr")..size_t("size", ""),
        size_t("offset", ""),
        size_t("length", ""),
        unsigned_int("arena_ind", ""),

        nativeType = "extent_purge_t"
    ) {
        documentation = "Instances of this interface may be set to the ##ExtentHooks struct."
    }
}

val extent_split_t = Module.JEMALLOC.callback {
    bool(
        "ExtentSplit",
        """
        Extent split hook.

        An extent split function conforms to the {@code extent_split_t} type and optionally splits an extent at given {@code addr} and {@code size} into two
        adjacent extents, the first of {@code size_a} bytes, and the second of {@code size_b} bytes, operating on {@code committed}/decommitted memory as
        indicated, on behalf of arena {@code arena_ind}, returning false upon success. If the function returns true, this indicates that the extent remains unsplit
        and therefore should continue to be operated on as a whole.
        """,

        _extent_hooks_t.p("extent_hooks", ""),
        void.p("addr", ""),
        AutoSize("addr")..size_t("size", ""),
        size_t("size_a", ""),
        size_t("size_b", ""),
        bool("committed", ""),
        unsigned_int("arena_ind", ""),

        nativeType = "extent_split_t"
    ) {
        documentation = "Instances of this interface may be set to the ##ExtentHooks struct."
    }
}

val extent_merge_t = Module.JEMALLOC.callback {
    bool(
        "ExtentMerge",
        """
        Extent merge hook.

        An extent merge function conforms to the {@code extent_merge_t} type and optionally merges adjacent extents, at given {@code addr_a} and {@code size_a}
        with given {@code addr_b} and {@code size_b} into one contiguous extent, operating on {@code committed}/decommitted memory as indicated, on behalf of arena
        {@code arena_ind}, returning false upon success. If the function returns true, this indicates that the extents remain distinct mappings and therefore
        should continue to be operated on independently.
        """,

        _extent_hooks_t.p("extent_hooks", ""),
        void.p("addr_a", ""),
        AutoSize("addr_a")..size_t("size_a", ""),
        void.p("addr_b", ""),
        AutoSize("addr_b")..size_t("size_b", ""),
        bool("committed", ""),
        unsigned_int("arena_ind", ""),

        nativeType = "extent_merge_t"
    ) {
        documentation = "Instances of this interface may be set to the ##ExtentHooks struct."
    }
}

val extent_hooks_t = struct(Module.JEMALLOC, "ExtentHooks", nativeName = "extent_hooks_t", skipBuffer = true) {
    documentation =
        """
        The {@code extent_hooks_t} structure comprises function pointers which are described individually below. jemalloc uses these functions to manage extent
        lifetime, which starts off with allocation of mapped committed memory, in the simplest case followed by deallocation. However, there are performance
        and platform reasons to retain extents for later reuse. Cleanup attempts cascade from deallocation to decommit to forced purging to lazy purging, which
        gives the extent management functions opportunities to reject the most permanent cleanup operations in favor of less permanent (and often less costly)
        operations. All operations except allocation can be universally opted out of by setting the hook pointers to #NULL, or selectively opted out of by
        returning failure.
        """

    extent_alloc_t("alloc", "the extent allocation hook")
    nullable..extent_dalloc_t("dalloc", "the extent deallocation hook")
    nullable..extent_destroy_t("destroy", "the extent destruction hook")
    nullable..extent_commit_t("commit", "the extent commit hook")
    nullable..extent_decommit_t("decommit", "the extent decommit hook")
    nullable..extent_purge_t("purge_lazy", "the extent lazy purge hook")
    nullable..extent_purge_t("purge_forced", "the extent forced purge hook")
    nullable..extent_split_t("split", "the extent split hook")
    nullable..extent_merge_t("merge", "the extent merge hook")
}