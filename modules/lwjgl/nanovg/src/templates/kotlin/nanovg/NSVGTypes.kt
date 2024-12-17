/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*

val NSVGgradientStop = struct(Module.NANOVG, "NSVGGradientStop", nativeName = "NSVGgradientStop", mutable = false) {
    unsigned_int("color")
    float("offset")
}

val NSVGgradient = struct(Module.NANOVG, "NSVGGradient", nativeName = "NSVGgradient", mutable = false) {
    float("xform")[6]
    char("spread")
    float("fx")
    float("fy")
    AutoSize("pstops")..int("nstops")
    NSVGgradientStop("pstops")["1"]
}

val NSVGpaint = struct(Module.NANOVG, "NSVGPaint", nativeName = "NSVGpaint", mutable = false) {
    typedef(char, "signed char")("type")
    union {
        unsigned_int("color")
        NSVGgradient.p("gradient")
    }
}

private val _NSVGpath = struct(Module.NANOVG, "NSVGPath", nativeName = "NSVGpath", mutable = false)
val NSVGpath = struct(Module.NANOVG, "NSVGPath", nativeName = "NSVGpath", mutable = false) {
    float.p("pts")
    AutoSizeShl("1", "pts")..int("npts")
    char("closed")
    float("bounds")[4]
    _NSVGpath.p("next")
}

private val _NSVGshape = struct(Module.NANOVG, "NSVGShape", nativeName = "NSVGshape", mutable = false)
val NSVGshape = struct(Module.NANOVG, "NSVGShape", nativeName = "NSVGshape", mutable = false) {
    charASCII("id")[64]
    NSVGpaint("fill")
    NSVGpaint("stroke")
    float("opacity")
    float("strokeWidth")
    float("strokeDashOffset")
    float("strokeDashArray")[8]
    char("strokeDashCount")
    char("strokeLineJoin")
    char("strokeLineCap")
    float("miterLimit")
    char("fillRule")
    unsigned_char("flags")
    float("bounds")[4]
    charASCII("fillGradient")[64]
    charASCII("strokeGradient")[64]
    float("xform")[6]
    NSVGpath.p("paths")
    _NSVGshape.p("next")
}

val NSVGimage = struct(Module.NANOVG, "NSVGImage", nativeName = "NSVGimage", mutable = false) {
    float("width")
    float("height")
    NSVGshape.p("shapes")
}

val NSVGrasterizer = "NSVGrasterizer".opaque