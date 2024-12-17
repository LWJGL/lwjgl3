/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb.templates

import org.lwjgl.generator.*
import stb.*

val stb_rect_pack = "STBRectPack".nativeClass(Module.STB, prefix = "STBRP", prefixMethod = "stbrp_") {
    includeSTBAPI(
        """#define STBRP_ASSERT
#define STB_RECT_PACK_IMPLEMENTATION
#include "stb_rect_pack.h"""")

    IntConstant(
        "_MAXVAL"..0x7fffffff
    )

    EnumConstant(
        "HEURISTIC_Skyline_default".enum,
        "HEURISTIC_Skyline_BL_sortHeight".."STBRP_HEURISTIC_Skyline_default",
        "HEURISTIC_Skyline_BF_sortHeight".enum
    )

    int(
        "pack_rects",

        stbrp_context.p("context"),
        stbrp_rect.p("rects"),
        AutoSize("rects")..int("num_rects")
    )

    void(
        "init_target",

        stbrp_context.p("context"),
        int("width"),
        int("height"),
        stbrp_node.p("nodes"),
        AutoSize("nodes")..int("num_nodes")
    )

    void(
        "setup_allow_out_of_mem",

        stbrp_context.p("context"),
        intb("allow_out_of_mem")
    )

    void(
        "setup_heuristic",

        stbrp_context.p("context"),
        int("heuristic")
    )
}