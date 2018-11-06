/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*

val NSVGgradientStop = struct(Module.NANOVG, "NSVGGradientStop", nativeName = "NSVGgradientStop", mutable = false) {
    unsigned_int("color", "")
    float("offset", "")
}

val NSVGgradient = struct(Module.NANOVG, "NSVGGradient", nativeName = "NSVGgradient", mutable = false) {
    float("xform", "")[6]
    char("spread", "")
    float("fx", "")
    float("fy", "")
    AutoSize("pstops")..int("nstops", "")
    NSVGgradientStop("pstops", "")["1"]
}

val NSVGpaint = struct(Module.NANOVG, "NSVGPaint", nativeName = "NSVGpaint", mutable = false) {
    char("type", "")
    union {
        unsigned_int("color", "")
        NSVGgradient.p("gradient", "")
    }
}

private val _NSVGpath = struct(Module.NANOVG, "NSVGPath", nativeName = "NSVGpath", mutable = false)
val NSVGpath = struct(Module.NANOVG, "NSVGPath", nativeName = "NSVGpath", mutable = false) {
    float.p("pts", "cubic bezier points: {@code x0,y0, [cpx1,cpx1,cpx2,cpy2,x1,y1], ...}")
    AutoSize("pts")..int("npts", "total number of bezier points")
    char("closed", "flag indicating if shapes should be treated as closed")
    float("bounds", "tight bounding box of the shape {@code [minx,miny,maxx,maxy]}")[4]
    _NSVGpath.p("next", "pointer to next path, or #NULL if last element")
}

private val _NSVGshape = struct(Module.NANOVG, "NSVGShape", nativeName = "NSVGshape", mutable = false)
val NSVGshape = struct(Module.NANOVG, "NSVGShape", nativeName = "NSVGshape", mutable = false) {
    charASCII("id", "optional 'id' attr of the shape or its group")[64]
    NSVGpaint("fill", "fill paint")
    NSVGpaint("stroke", "stroke paint")
    float("opacity", "opacity of the shape")
    float("strokeWidth", "stroke width (scaled)")
    float("strokeDashOffset", "stroke dash offset (scaled)")
    float("strokeDashArray", "stroke dash array (scaled)")[8]
    char("strokeDashCount", "number of dash values in dash array")
    char("strokeLineJoin", "stroke join type")
    char("strokeLineCap", "stroke cap type")
    float("miterLimit", "miter limit")
    char("fillRule", "fill rule, see NSVGfillRule")
    unsigned_char("flags", "logical or of NSVG_FLAGS_* flags")
    float("bounds", "tight bounding box of the shape {@code [minx,miny,maxx,maxy]}")[4]
    NSVGpath.p("paths", "linked list of paths in the image")
    _NSVGshape.p("next", "pointer to next shape, or #NULL if last element")
}

val NSVGimage = struct(Module.NANOVG, "NSVGImage", nativeName = "NSVGimage", mutable = false) {
    float("width", "Width of the image.")
    float("height", "Height of the image.")
    NSVGshape.p("shapes", "lLinked list of shapes in the image")
}

val NSVGrasterizer = "NSVGrasterizer".opaque