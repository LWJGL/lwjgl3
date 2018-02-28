/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb.templates

import org.lwjgl.generator.*
import stb.*

val stb_dxt = "STBDXT".nativeClass(Module.STB, prefix = "STB", prefixMethod = "stb_", library = STB_LIBRARY) {
    includeSTBAPI(
        """#define STB_DXT_IMPLEMENTATION
#define STB_DXT_STATIC
#include "stb_dxt.h"""")

    documentation =
        """
        Native bindings to stb_dxt.h from the ${url("https://github.com/nothings/stb", "stb library")}.

        DXT1/DXT5 compressor.
        """

    IntConstant("", "DXT_NORMAL"..0)
    IntConstant("Use dithering. Dubious win, never use for normal maps and the like!", "DXT_DITHER"..1)
    IntConstant("High quality mode, does two refinement steps instead of 1. ~30-40% slower.", "DXT_HIGHQUAL"..2)

    void(
        "compress_dxt_block",
        """
        Call this function for every block (you must pad). The source should be a 4x4 block of RGBA data in row-major order; A is ignored if you specify
        {@code alpha=0}; you can turn on dithering and "high quality" using {@code mode}.
        """,

        Check("alpha ? 16 : 8")..unsigned_char.p.OUT("dest", "a buffer in which to store the compressed block"),
        Check(4 * 4 * 4)..unsigned_char.const.p.IN("src_rgba_four_bytes_per_pixel", "the block to compress"),
        intb.IN("alpha", "1 to compress the alpha channel, 0 to ignore it"),
        int.IN("mode", "the compression mode", "#DXT_NORMAL #DXT_DITHER #DXT_HIGHQUAL")
    )

    void(
        "compress_bc4_block",
        "Call this function for every block (you must pad). The source should be a 4x4 block of A data in row-major order.",

        Check("8")..unsigned_char.p.OUT("dest", "a buffer in which to store the compressed block"),
        Check(4 * 4)..unsigned_char.const.p.IN("src_r_one_byte_per_pixel", "the block to compress")
    )

    void(
        "compress_bc5_block",
        "Call this function for every block (you must pad). The source should be a 4x4 block of RG data in row-major order.",

        Check("16")..unsigned_char.p.OUT("dest", "a buffer in which to store the compressed block"),
        Check(4 * 4 * 2)..unsigned_char.const.p.IN("src_rg_two_byte_per_pixel", "the block to compress")
    )
}