/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package jemalloc

import org.lwjgl.generator.*

val write_cb = Module.JEMALLOC.callback {
    void(
        "MallocMessageCallback",

        void.p("cbopaque"),
        NullTerminated..charASCII.const.p("s")
    ) {
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

        _extent_hooks_t.p("extent_hooks"),
        nullable..void.p("new_addr"),
        size_t("size"),
        size_t("alignment"),
        Check(1)..bool.p("zero"),
        Check(1)..bool.p("commit"),
        unsigned_int("arena_ind"),

        nativeType = "extent_alloc_t"
    ) {
    }
}

val extent_dalloc_t = Module.JEMALLOC.callback {
    bool(
        "ExtentDalloc",

        _extent_hooks_t.p("extent_hooks"),
        void.p("addr"),
        AutoSize("addr")..size_t("size"),
        bool("committed"),
        unsigned_int("arena_ind"),

        nativeType = "extent_dalloc_t"
    ) {
    }
}

val extent_destroy_t = Module.JEMALLOC.callback {
    bool(
        "ExtentDestroy",

        _extent_hooks_t.p("extent_hooks"),
        void.p("addr"),
        AutoSize("addr")..size_t("size"),
        bool("committed"),
        unsigned_int("arena_ind"),

        nativeType = "extent_destroy_t"
    ) {
    }
}

val extent_commit_t = Module.JEMALLOC.callback {
    bool(
        "ExtentCommit",

        _extent_hooks_t.p("extent_hooks"),
        void.p("addr"),
        AutoSize("addr")..size_t("size"),
        size_t("offset"),
        size_t("length"),
        unsigned_int("arena_ind"),

        nativeType = "extent_commit_t"
    ) {
    }
}

val extent_decommit_t = Module.JEMALLOC.callback {
    bool(
        "ExtentDecommit",

        _extent_hooks_t.p("extent_hooks"),
        void.p("addr"),
        AutoSize("addr")..size_t("size"),
        size_t("offset"),
        size_t("length"),
        unsigned_int("arena_ind"),

        nativeType = "extent_decommit_t"
    ) {
    }
}
val extent_purge_t = Module.JEMALLOC.callback {
    bool(
        "ExtentPurge",

        _extent_hooks_t.p("extent_hooks"),
        void.p("addr"),
        AutoSize("addr")..size_t("size"),
        size_t("offset"),
        size_t("length"),
        unsigned_int("arena_ind"),

        nativeType = "extent_purge_t"
    ) {
    }
}

val extent_split_t = Module.JEMALLOC.callback {
    bool(
        "ExtentSplit",

        _extent_hooks_t.p("extent_hooks"),
        void.p("addr"),
        AutoSize("addr")..size_t("size"),
        size_t("size_a"),
        size_t("size_b"),
        bool("committed"),
        unsigned_int("arena_ind"),

        nativeType = "extent_split_t"
    ) {
    }
}

val extent_merge_t = Module.JEMALLOC.callback {
    bool(
        "ExtentMerge",

        _extent_hooks_t.p("extent_hooks"),
        void.p("addr_a"),
        AutoSize("addr_a")..size_t("size_a"),
        void.p("addr_b"),
        AutoSize("addr_b")..size_t("size_b"),
        bool("committed"),
        unsigned_int("arena_ind"),

        nativeType = "extent_merge_t"
    ) {
    }
}

val extent_hooks_t = struct(Module.JEMALLOC, "ExtentHooks", nativeName = "extent_hooks_t", skipBuffer = true) {
    extent_alloc_t("alloc")
    nullable..extent_dalloc_t("dalloc")
    nullable..extent_destroy_t("destroy")
    nullable..extent_commit_t("commit")
    nullable..extent_decommit_t("decommit")
    nullable..extent_purge_t("purge_lazy")
    nullable..extent_purge_t("purge_forced")
    nullable..extent_split_t("split")
    nullable..extent_merge_t("merge")
}