/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb.templates

import org.lwjgl.generator.*
import stb.*

val stb_dxt = "STBDXT".nativeClass(Module.STB, prefix = "STB", prefixMethod = "stb_") {
    includeSTBAPI(
        """#define STB_DXT_IMPLEMENTATION
#define STB_DXT_STATIC
#include <string.h>
#include "stb_dxt.h"""")

    IntConstant(
        "DXT_NORMAL"..0,
        "DXT_DITHER"..1,
        "DXT_HIGHQUAL"..2
    )

    void(
        "compress_dxt_block",

        Check("alpha ? 16 : 8")..unsigned_char.p("dest"),
        Check(4 * 4 * 4)..unsigned_char.const.p("src_rgba_four_bytes_per_pixel"),
        intb("alpha"),
        int("mode")
    )

    void(
        "compress_bc4_block",

        Check("8")..unsigned_char.p("dest"),
        Check(4 * 4)..unsigned_char.const.p("src_r_one_byte_per_pixel")
    )

    void(
        "compress_bc5_block",

        Check("16")..unsigned_char.p("dest"),
        Check(4 * 4 * 2)..unsigned_char.const.p("src_rg_two_byte_per_pixel")
    )
}