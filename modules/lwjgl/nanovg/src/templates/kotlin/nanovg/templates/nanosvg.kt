/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg.templates

import org.lwjgl.generator.*
import nanovg.*

val nanosvg = "NanoSVG".nativeClass(Module.NANOVG, prefix = "NSVG", library = NANOVG_LIBRARY) {
    includeNanoVGAPI("""#define NANOSVG_IMPLEMENTATION
#include "nanosvg.h"
#define NANOSVGRAST_IMPLEMENTATION
#include "nanosvgrast.h"""")

    documentation =
        """
        NanoSVG is a simple stupid single-header-file SVG parse. The output of the parser is a list of cubic bezier shapes.

        The library suits well for anything from rendering scalable icons in your editor application to prototyping a game.

        NanoSVG supports a wide range of SVG features, but something may be missing, feel free to create a pull request!

        The shapes in the SVG images are transformed by the viewBox and converted to specified units. That is, you should get the same looking data as your
        designed in your favorite app.

        NanoSVG can return the paths in few different units. For example if you want to render an image, you may choose to get the paths in pixels, or if you
        are feeding the data into a CNC-cutter, you may want to use millimeters.

        The units passed to NanoSVG should be one of: 'px', 'pt', 'pc' 'mm', 'cm', or 'in'. DPI (dots-per-inch) controls how the unit conversion is done.

        If you don't know or care about the units stuff, "px" and 96 should get you going.
        """

    // nanosvg.h

    EnumConstant(
        "NSVGpaintType",

        "PAINT_NONE".."0",
        "PAINT_COLOR".."1",
        "PAINT_LINEAR_GRADIENT".."2",
        "PAINT_RADIAL_GRADIENT".."3"
    )

    EnumConstant(
        "NSVGspreadType",

        "SPREAD_PAD".."0",
        "SPREAD_REFLECT".."1",
        "SPREAD_REPEAT".."2"
    )

    EnumConstant(
        "NSVGlineJoin",

        "JOIN_MITER".."0",
        "JOIN_ROUND".."1",
        "JOIN_BEVEL".."2"
    )

    EnumConstant(
        "NSVGlineCap",

        "CAP_BUTT".."0",
        "CAP_ROUND".."1",
        "CAP_SQUARE".."2"
    )

    EnumConstant(
        "NSVGfillRule",

        "FILLRULE_NONZERO".."0",
        "FILLRULE_EVENODD".."1"
    )

    EnumConstant(
        "NSVGflags",

        "FLAGS_VISIBLE".."0x01"
    )

    NSVGimage.p(
        "ParseFromFile",
        "Parses SVG file from a file, returns SVG image as paths.",

        charASCII.const.p.IN("filename", ""),
        charASCII.const.p.IN("units", ""),
        float.IN("dpi", "")
    )

    NSVGimage.p(
        "Parse",
        """
        Parses SVG file from a null terminated string, returns SVG image as paths.

        Important note: changes the string.
        """,

        charASCII.p.IN("input", ""),
        charASCII.const.p.IN("units", ""),
        float.IN("dpi", "")
    )

    void(
        "Delete",
        "Deletes list of paths.",

        NSVGimage.p.IN("image", "")
    )

    // nanosvgrast.h

    NSVGrasterizer.p(
        "CreateRasterizer",
        "Allocates rasterizer context."
    )

    void(
        "Rasterize",
        "Rasterizes SVG image, returns RGBA image (non-premultiplied alpha).",

        NSVGrasterizer.p.IN("r", "pointer to rasterizer context"),
        NSVGimage.p.IN("image", "pointer to image to rasterize"),
        float.IN("tx", "image x offset (applied after scaling)"),
        float.IN("ty", "image y offset (applied after scaling)"),
        float.IN("scale", "image scale"),
        Check("h * stride")..unsigned_char.p.OUT("dst", "pointer to destination image data, 4 bytes per pixel (RGBA)"),
        int.IN("w", "width of the image to render"),
        int.IN("h", "height of the image to render"),
        int.IN("stride", "number of bytes per scaleline in the destination buffer")
    )

    void(
        "DeleteRasterizer",
        "Deletes rasterizer context.",

        NSVGrasterizer.p.IN("rasterizer", "the rasterizer context to delete")
    )
}