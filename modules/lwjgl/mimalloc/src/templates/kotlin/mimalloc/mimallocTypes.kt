/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package mimalloc

import org.lwjgl.generator.*

val mi_arena_id_t = "mi_arena_id_t".handle

val mi_heap_t = "mi_heap_t".opaque
val mi_theap_t = "mi_theap_t".opaque

val mi_option_t = "mi_option_t".enumType

val mi_deferred_free_fun = Module.MIMALLOC.callback {
    void(
        "mi_deferred_free_fun",

        bool("force"),
        unsigned_long_long("heartbeat"),
        nullable..opaque_p("arg"),

        nativeType = "mi_deferred_free_fun"
    )
}

val mi_output_fun = Module.MIMALLOC.callback {
    void(
        "mi_output_fun",

        charASCII.const.p("msg"),
        nullable..opaque_p("arg"),

        nativeType = "mi_output_fun"
    )
}

val mi_error_fun = Module.MIMALLOC.callback {
    void(
        "mi_error_fun",

        int("err"),
        nullable..opaque_p("arg"),

        nativeType = "mi_error_fun"
    )
}

val mi_heap_area_t = struct(Module.MIMALLOC, "mi_heap_area_t") {
    opaque_p("blocks")
    size_t("reserved")
    size_t("committed")
    size_t("used")
    size_t("block_size")
    size_t("full_block_size")
    nullable..opaque_p("reserved1").private()
}

val mi_block_visit_fun = Module.MIMALLOC.callback {
    bool(
        "mi_block_visit_fun",

        mi_heap_t.const.p("heap"),
        mi_heap_area_t.const.p("area"),
        nullable..void.p("block"),
        AutoSize("block")..size_t("block_size"),
        nullable..opaque_p("arg"),

        nativeType = "mi_block_visit_fun"
    )
}

val mi_subproc_id_t = struct(Module.MIMALLOC, "mi_subproc_id_t") {
    nullable..void.p("_mi_subproc_id").private()
}

val mi_heap_visit_fun = Module.MIMALLOC.callback {
    bool(
        "mi_heap_visit_fun",

        mi_heap_t.p("heap"),
        nullable..opaque_p("arg"),

        nativeType = "mi_heap_visit_fun"
    )
}

val mi_commit_fun_t = Module.MIMALLOC.callback {
    bool(
        "mi_commit_fun_t",

        bool("commit"),
        void.p("start"),
        AutoSize("start")..size_t("size"),
        bool.p("is_zero"),
        nullable..opaque_p("user_arg"),

        nativeType = "mi_commit_fun_t"
    )
}