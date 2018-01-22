/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.stb.templates

import org.lwjgl.generator.*
import org.lwjgl.stb.*

val stb_rect_pack = "STBRectPack".nativeClass(packageName = STB_PACKAGE, prefix = "STBRP", prefixMethod = "stbrp_", library = STB_LIBRARY) {
    includeSTBAPI(
        """#define STBRP_ASSERT
#define STB_RECT_PACK_IMPLEMENTATION
#include "stb_rect_pack.h"""")

    documentation =
        """
        Native bindings to stb_rect_pack.h from the ${url("https://github.com/nothings/stb", "stb library")}.

        Useful for e.g. packing rectangular textures into an atlas. Does not do rotation.

        This library currently uses the Skyline Bottom-Left algorithm. Not necessarily the awesomest packing method, but better than the totally naive one in
        stb_truetype (which is primarily what this is meant to replace).
        """

    EnumConstant(
        "Packing heuristics",

        "HEURISTIC_Skyline_default".enum,
        "HEURISTIC_Skyline_BL_sortHeight".."STBRP_HEURISTIC_Skyline_default",
        "HEURISTIC_Skyline_BF_sortHeight".enum
    )

    int(
        "pack_rects",
        """
        Assigns packed locations to rectangles. The rectangles are of type ##STBRPRect, stored in the array {@code rects}, and there are {@code num_rects} many
        of them.

        Rectangles which are successfully packed have the {@code was_packed} flag set to a non-zero value and {@code x} and {@code y} store the minimum
        location on each axis (i.e. bottom-left in cartesian coordinates, top-left if you imagine y increasing downwards). Rectangles which do not fit have the
        {@code was_packed} flag set to 0.

        You should not try to access the {@code rects} array from another thread while this function is running, as the function temporarily reorders the array
        while it executes.

        To pack into another rectangle, you need to call #init_target() again. To continue packing into the same rectangle, you can call this function again.
        Calling this multiple times with multiple rect arrays will probably produce worse packing results than calling it a single time with the full rectangle
        array, but the option is available.
        """,

        stbrp_context_p.IN("context", "an ##STBRPContext struct"),
        stbrp_rect_p.INOUT("rects", "an array of ##STBRPRect structs"),
        AutoSize("rects")..int.IN("num_rects", "the number of structs in {@code rects}"),

        returnDoc = "1 if all of the rectangles were successfully packed and 0 otherwise"
    )

    void(
        "init_target",
        """
        Initialize a rectangle packer to: pack a rectangle that is {@code width} by {@code height} in dimensions using temporary storage provided by the array
        {@code nodes}, which is {@code num_nodes} long.

        You must call this function every time you start packing into a new target.

        There is no "shutdown" function. The {@code nodes} memory must stay valid for the following #pack_rects() call (or calls), but can be freed after the
        call (or calls) finish.

        Note: to guarantee best results, either:
        ${ol(
            "make sure {@code num_nodes &ge; width}",
            "or, call #setup_allow_out_of_mem() with {@code allow_out_of_mem = 1}"
        )}
        If you don't do either of the above things, widths will be quantized to multiples of small integers to guarantee the algorithm doesn't run out of
        temporary storage.

        If you do \#2, then the non-quantized algorithm will be used, but the algorithm may run out of temporary storage and be unable to pack some rectangles.
        """,

        stbrp_context_p.IN("context", "an ##STBRPContext struct"),
        int.IN("width", "the rectangle width"),
        int.IN("height", "the rectangle height"),
        stbrp_node_p.IN("nodes", "an array of ##STBRPNode structs"),
        AutoSize("nodes")..int.IN("num_nodes", "the number of structs in {@code nodes}")
    )

    void(
        "setup_allow_out_of_mem",
        """
        Optionally call this function after init but before doing any packing to change the handling of the out-of-temp-memory scenario, described in
        #init_target(). If you call init again, this will be reset to the default (false).
        """,

        stbrp_context_p.IN("context", "an ##STBRPContext struct"),
        intb.IN("allow_out_of_mem", "1 to allow running out of temporary storage")
    )

    void(
        "setup_heuristic",
        """
        Optionally select which packing heuristic the library should use. Different heuristics will produce better/worse results for different data sets. If
        you call init again, this will be reset to the default.
        """,

        stbrp_context_p.IN("context", "an ##STBRPContext struct"),
        int.IN("heuristic", "the packing heuristic")
    )
}