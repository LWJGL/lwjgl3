/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*

val NSVGgradientStop = struct(Module.NANOVG, "NSVGGradientStop", nativeName = "NSVGgradientStop", mutable = false) {
    unsigned_int.member("color", "")
    float.member("offset", "")
}

val NSVGgradient = struct(Module.NANOVG, "NSVGGradient", nativeName = "NSVGgradient", mutable = false) {
    float.array("xform", "", size = 6)
    char.member("spread", "")
    float.member("fx", "")
    float.member("fy", "")
    AutoSize("pstops")..int.member("nstops", "")
    NSVGgradientStop.array("pstops", "", size = "1")
}

val NSVGpaint = struct(Module.NANOVG, "NSVGPaint", nativeName = "NSVGpaint", mutable = false) {
    char.member("type", "")
    union {
        unsigned_int.member("color", "")
        NSVGgradient.p.member("gradient", "")
    }
}

private val NSVGpath_p = struct(Module.NANOVG, "NSVGPath", nativeName = "NSVGpath", mutable = false).p
val NSVGpath = struct(Module.NANOVG, "NSVGPath", nativeName = "NSVGpath", mutable = false) {
    float.p.member("pts", "cubic bezier points: {@code x0,y0, [cpx1,cpx1,cpx2,cpy2,x1,y1], ...}")
    AutoSize("pts")..int.member("npts", "total number of bezier points")
    char.member("closed", "flag indicating if shapes should be treated as closed")
    float.array("bounds", "tight bounding box of the shape {@code [minx,miny,maxx,maxy]}", size = 4)
    NSVGpath_p.member("next", "pointer to next path, or #NULL if last element")
}

private val NSVGshape_p = struct(Module.NANOVG, "NSVGShape", nativeName = "NSVGshape", mutable = false).p
val NSVGshape = struct(Module.NANOVG, "NSVGShape", nativeName = "NSVGshape", mutable = false) {
    char.array("id", "optional 'id' attr of the shape or its group", size = 64)
    NSVGpaint.member("fill", "fill paint")
    NSVGpaint.member("stroke", "stroke paint")
    float.member("opacity", "opacity of the shape")
    float.member("strokeWidth", "stroke width (scaled)")
    float.member("strokeDashOffset", "stroke dash offset (scaled)")
    float.array("strokeDashArray", "stroke dash array (scaled)", size = 8)
    char.member("strokeDashCount", "number of dash values in dash array")
    char.member("strokeLineJoin", "stroke join type")
    char.member("strokeLineCap", "stroke cap type")
    float.member("miterLimit", "miter limit")
    char.member("fillRule", "fill rule, see NSVGfillRule")
    unsigned_char.member("flags", "logical or of NSVG_FLAGS_* flags")
    float.array("bounds", "tight bounding box of the shape {@code [minx,miny,maxx,maxy]}", size = 4)
    NSVGpath_p.member("paths", "linked list of paths in the image")
    NSVGshape_p.member("next", "pointer to next shape, or #NULL if last element")
}

val NSVGimage = struct(Module.NANOVG, "NSVGImage", nativeName = "NSVGimage", mutable = false) {
    float.member("width", "Width of the image.")
    float.member("height", "Height of the image.")
    NSVGshape_p.member("shapes", "lLinked list of shapes in the image")
}

val NSVGrasterizer = "NSVGrasterizer".opaque