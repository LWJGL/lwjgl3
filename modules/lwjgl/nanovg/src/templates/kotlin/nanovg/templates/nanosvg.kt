/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg.templates

import org.lwjgl.generator.*
import nanovg.*

val nanosvg = "NanoSVG".nativeClass(Module.NANOVG, prefix = "NSVG") {
    includeNanoVGAPI("""#define NANOSVG_IMPLEMENTATION
#include "nanosvg.h"
#define NANOSVGRAST_IMPLEMENTATION
#include "nanosvgrast.h"""")

    // nanosvg.h

    EnumConstant(
        "PAINT_UNDEF".."-1",
        "PAINT_NONE".."0",
        "PAINT_COLOR".."1",
        "PAINT_LINEAR_GRADIENT".."2",
        "PAINT_RADIAL_GRADIENT".."3"
    )

    EnumConstant(
        "SPREAD_PAD".."0",
        "SPREAD_REFLECT".."1",
        "SPREAD_REPEAT".."2"
    )

    EnumConstant(
        "JOIN_MITER".."0",
        "JOIN_ROUND".."1",
        "JOIN_BEVEL".."2"
    )

    EnumConstant(
        "CAP_BUTT".."0",
        "CAP_ROUND".."1",
        "CAP_SQUARE".."2"
    )

    EnumConstant(
        "FILLRULE_NONZERO".."0",
        "FILLRULE_EVENODD".."1"
    )

    EnumConstant(
        "FLAGS_VISIBLE".."0x01"
    )

    NSVGimage.p(
        "ParseFromFile",

        charASCII.const.p("filename"),
        charASCII.const.p("units"),
        float("dpi")
    )

    NSVGimage.p(
        "Parse",

        Input..charASCII.p("input"),
        charASCII.const.p("units"),
        float("dpi")
    )

    NSVGpath.p(
        "DuplicatePath",

        Input..NSVGpath.p("p")
    )

    void(
        "Delete",

        Input..NSVGimage.p("image")
    )

    // nanosvgrast.h

    NSVGrasterizer.p(
        "CreateRasterizer",
        void()
    )

    void(
        "Rasterize",

        NSVGrasterizer.p("r"),
        Input..NSVGimage.p("image"),
        float("tx"),
        float("ty"),
        float("scale"),
        Check("h * stride")..unsigned_char.p("dst"),
        int("w"),
        int("h"),
        int("stride")
    )

    void(
        "DeleteRasterizer",

        NSVGrasterizer.p("rasterizer")
    )
}