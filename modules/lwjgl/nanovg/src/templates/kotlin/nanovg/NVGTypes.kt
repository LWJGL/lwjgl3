/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*

const val NANOVG_LIBRARY = "LibNanoVG.initialize();"

fun config() {
    packageInfo(
        Module.NANOVG,
        """
        Contains bindings to ${url("https://github.com/memononen/nanovg", "NanoVG")}, a small antialiased vector graphics rendering library for OpenGL. It has
        lean API modeled after HTML5 canvas API. It is aimed to be a practical and fun toolset for building scalable user interfaces and visualizations.
        """
    )

    Generator.registerLibraryInit(Module.NANOVG, "LibNanoVG", "nanovg", setupAllocator = true)
}

fun GeneratorTargetNative.includeNanoVGAPI(directives: String) = nativeDirective(
    """DISABLE_WARNINGS()
$directives
ENABLE_WARNINGS()""")

val NVGcontext = "NVGcontext".opaque

val NVGcolor = struct(Module.NANOVG, "NVGColor", nativeName = "NVGcolor") {
    documentation = "A NanoVG color."

    union {
        float.array("rgba", "an array of 4 color components", size = 4)
        struct {
            float.member("r", "the color red component")
            float.member("g", "the color green component")
            float.member("b", "the color blue component")
            float.member("a", "the color alpha component")
        }
    }
}

val NVGpaint = struct(Module.NANOVG, "NVGPaint", nativeName = "NVGpaint") {
    documentation = "A NanoVG paint."

    float.array("xform", "the transformation matrix", size = 6)
    float.array("extent", "the extent", size = 2)
    float.member("radius", "the radius")
    float.member("feather", "the feather amount")
    NVGcolor.member("innerColor", "the inner color")
    NVGcolor.member("outerColor", "the outer color")
    int.member("image", "the image handle")
}

val charptr = "char".opaque // address, not data

val NVGglyphPosition = struct(Module.NANOVG, "NVGGlyphPosition", nativeName = "NVGglyphPosition", mutable = false) {
    documentation = "A glyph position."

    charptr.p.member("str", "position of the glyph in the input string")
    float.member("x", "the x-coordinate of the logical glyph position")
    float.member("minx", "the left bound of the glyph shape")
    float.member("maxx", "the right bound of the glyph shape")
}

val NVGtextRow = struct(Module.NANOVG, "NVGTextRow", nativeName = "NVGtextRow", mutable = false) {
    documentation = "A text row."

    charptr.p.member("start", "pointer to the input text where the row starts")
    charptr.p.member("end", "pointer to the input text where the row ends (one past the last character")
    charptr.p.member("next", "pointer to the beginning of the next row")
    float.member("width", "logical width of the row")
    float.member("minx", "actual left bound of the row. Logical width and bounds can differ because of kerning and some parts over extending.")
    float.member("maxx", "actual right bound of the row. Logical width and bounds can differ because of kerning and some parts over extending.")
}
