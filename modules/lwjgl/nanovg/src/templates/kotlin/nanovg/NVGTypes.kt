/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*

fun GeneratorTargetNative.includeNanoVGAPI(directives: String) = nativeDirective(
    """#include "lwjgl_malloc.h"
#define NVG_MALLOC(sz)     org_lwjgl_malloc(sz)
#define NVG_REALLOC(p,sz)  org_lwjgl_realloc(p,sz)
#define NVG_FREE(p)        org_lwjgl_free(p)
DISABLE_WARNINGS()
$directives
ENABLE_WARNINGS()""")

val NVGcontext = "NVGcontext".opaque

val NVGcolor = struct(Module.NANOVG, "NVGColor", nativeName = "NVGcolor") {
    documentation = "A NanoVG color."

    union {
        float("rgba", "an array of 4 color components")[4]
        struct {
            float("r", "the color red component")
            float("g", "the color green component")
            float("b", "the color blue component")
            float("a", "the color alpha component")
        }
    }
}

val NVGpaint = struct(Module.NANOVG, "NVGPaint", nativeName = "NVGpaint") {
    documentation = "A NanoVG paint."

    float("xform", "the transformation matrix")[6]
    float("extent", "the extent")[2]
    float("radius", "the radius")
    float("feather", "the feather amount")
    NVGcolor("innerColor", "the inner color")
    NVGcolor("outerColor", "the outer color")
    int("image", "the image handle")
}

val charptr = "char".opaque // address, not data

val NVGglyphPosition = struct(Module.NANOVG, "NVGGlyphPosition", nativeName = "NVGglyphPosition", mutable = false) {
    documentation = "A glyph position."

    charptr.p("str", "position of the glyph in the input string")
    float("x", "the x-coordinate of the logical glyph position")
    float("minx", "the left bound of the glyph shape")
    float("maxx", "the right bound of the glyph shape")
}

val NVGtextRow = struct(Module.NANOVG, "NVGTextRow", nativeName = "NVGtextRow", mutable = false) {
    documentation = "A text row."

    charptr.p("start", "pointer to the input text where the row starts")
    charptr.p("end", "pointer to the input text where the row ends (one past the last character")
    charptr.p("next", "pointer to the beginning of the next row")
    float("width", "logical width of the row")
    float("minx", "actual left bound of the row. Logical width and bounds can differ because of kerning and some parts over extending.")
    float("maxx", "actual right bound of the row. Logical width and bounds can differ because of kerning and some parts over extending.")
}
