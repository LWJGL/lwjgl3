/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg.templates

import org.lwjgl.generator.*
import nanovg.*

val nanovg = "NanoVG".nativeClass(Module.NANOVG, prefix = "NVG") {
    includeNanoVGAPI("""#define STBI_MALLOC(sz)    org_lwjgl_malloc(sz)
#define STBI_REALLOC(p,sz) org_lwjgl_realloc(p,sz)
#define STBI_FREE(p)       org_lwjgl_free(p)
#define STBI_FAILURE_USERMSG
#define STBI_ASSERT(x)
#define STB_IMAGE_IMPLEMENTATION
#define STB_IMAGE_STATIC
#define STBTT_malloc(x,u)  ((void)(u),org_lwjgl_malloc(x))
#define STBTT_free(x,u)    ((void)(u),org_lwjgl_free(x))
#define STBTT_assert
#define STB_TRUETYPE_IMPLEMENTATION
#define STBTT_STATIC
#include "nanovg.c"""")

    FloatConstant(
        "PI"..3.14159265358979323846264338327f
    )

    EnumConstant(
        "CCW".enum(1),
        "CW".enum(2)
    )

    EnumConstant(
        "SOLID".enum(1),
        "HOLE".enum(2)
    )

    EnumConstant(
        "BUTT".enum,
        "ROUND".enum,
        "SQUARE".enum,
        "BEVEL".enum,
        "MITER".enum
    )

    EnumConstant(
        "ALIGN_LEFT".enum("1<<0"),
        "ALIGN_CENTER".enum("1<<1"),
        "ALIGN_RIGHT".enum("1<<2"),

        "ALIGN_TOP".enum("1<<3"),
        "ALIGN_MIDDLE".enum("1<<4"),
        "ALIGN_BOTTOM".enum("1<<5"),
        "ALIGN_BASELINE".enum("1<<6")
    )

    EnumConstant(
        "ZERO".enum("1<<0"),
        "ONE".enum("1<<1"),
        "SRC_COLOR".enum("1<<2"),
        "ONE_MINUS_SRC_COLOR".enum("1<<3"),
        "DST_COLOR".enum("1<<4"),
        "ONE_MINUS_DST_COLOR".enum("1<<5"),
        "SRC_ALPHA".enum("1<<6"),
        "ONE_MINUS_SRC_ALPHA".enum("1<<7"),
        "DST_ALPHA".enum("1<<8"),
        "ONE_MINUS_DST_ALPHA".enum("1<<9"),
        "SRC_ALPHA_SATURATE".enum("1<<10")
    )

    EnumConstant(
        "SOURCE_OVER".enum,
        "SOURCE_IN".enum,
        "SOURCE_OUT".enum,
        "ATOP".enum,
        "DESTINATION_OVER".enum,
        "DESTINATION_IN".enum,
        "DESTINATION_OUT".enum,
        "DESTINATION_ATOP".enum,
        "LIGHTER".enum,
        "COPY".enum,
        "XOR".enum
    )

    EnumConstant(
        "IMAGE_GENERATE_MIPMAPS".enum("1<<0"),
        "IMAGE_REPEATX".enum("1<<1"),
        "IMAGE_REPEATY".enum("1<<2"),
        "IMAGE_FLIPY".enum("1<<3"),
        "IMAGE_PREMULTIPLIED".enum("1<<4"),
        "IMAGE_NEAREST".enum("1<<5")
    )

    val ctx = NVGcontext.p("ctx")

    void(
        "BeginFrame",

        ctx,
        float("windowWidth"),
        float("windowHeight"),
        float("devicePixelRatio")
    )

    void(
        "CancelFrame",

        ctx
    )

    void(
        "EndFrame",

        ctx
    )

    // Composite operation

    void(
        "GlobalCompositeOperation",

        ctx,
        int("op")
    )

    void(
        "GlobalCompositeBlendFunc",

        ctx,
        int("sfactor"),
        int("dfactor")
    )

    void(
        "GlobalCompositeBlendFuncSeparate",

        ctx,
        int("srcRGB"),
        int("dstRGB"),
        int("srcAlpha"),
        int("dstAlpha")
    )

    // Color utils

    NVGcolor(
        "RGB",

        unsigned_char("r"),
        unsigned_char("g"),
        unsigned_char("b")
    )

    NVGcolor(
        "RGBf",

        float("r"),
        float("g"),
        float("b")
    )

    NVGcolor(
        "RGBA",

        unsigned_char("r"),
        unsigned_char("g"),
        unsigned_char("b"),
        unsigned_char("a")
    )

    NVGcolor(
        "RGBAf",

        float("r"),
        float("g"),
        float("b"),
        float("a")
    )

    NVGcolor(
        "LerpRGBA",

        NVGcolor("c0"),
        NVGcolor("c1"),
        float("u")
    )

    NVGcolor(
        "TransRGBA",

        NVGcolor("c0"),
        unsigned_char("a")
    )

    NVGcolor(
        "TransRGBAf",

        NVGcolor("c0"),
        float("a")
    )

    NVGcolor(
        "HSL",

        float("h"),
        float("s"),
        float("l")
    )

    NVGcolor(
        "HSLA",

        float("h"),
        float("s"),
        float("l"),
        unsigned_char("a")
    )

    // State Handling

    void(
        "Save",

        ctx
    )

    void(
        "Restore",

        ctx
    )

    void(
        "Reset",

        ctx
    )

    // Render styles

    void(
        "ShapeAntiAlias",

        ctx,
        intb("enabled")
    )

    void(
        "StrokeColor",

        ctx,
        NVGcolor("color")
    )

    void(
        "StrokePaint",

        ctx,
        NVGpaint("paint")
    )

    void(
        "FillColor",

        ctx,
        NVGcolor("color")
    )

    void(
        "FillPaint",

        ctx,
        NVGpaint("paint")
    )

    void(
        "MiterLimit",

        ctx,
        float("limit")
    )

    void(
        "StrokeWidth",

        ctx,
        float("size")
    )

    void(
        "LineCap",

        ctx,
        int("cap")
    )

    void(
        "LineJoin",

        ctx,
        int("join")
    )

    void(
        "GlobalAlpha",

        ctx,
        float("alpha")
    )

    // Transforms

    void(
        "ResetTransform",

        ctx
    )

    void(
        "Transform",

        ctx,
        float("a"),
        float("b"),
        float("c"),
        float("d"),
        float("e"),
        float("f")
    )

    void(
        "Translate",

        ctx,
        float("x"),
        float("y")
    )

    void(
        "Rotate",

        ctx,
        float("angle")
    )

    void(
        "SkewX",

        ctx,
        float("angle")
    )

    void(
        "SkewY",

        ctx,
        float("angle")
    )

    void(
        "Scale",

        ctx,
        float("x"),
        float("y")
    )

    void(
        "CurrentTransform",

        ctx,
        Check(6)..float.p("xform")
    )

    val TransformIdentity = void(
        "TransformIdentity",

        Check(6)..float.p("dst")
    )

    void(
        "TransformTranslate",

        TransformIdentity["dst"],
        float("tx"),
        float("ty")
    )

    void(
        "TransformScale",

        TransformIdentity["dst"],
        float("sx"),
        float("sy")
    )

    void(
        "TransformRotate",

        TransformIdentity["dst"],
        float("a")
    )

    void(
        "TransformSkewX",

        TransformIdentity["dst"],
        float("a")
    )

    void(
        "TransformSkewY",

        TransformIdentity["dst"],
        float("a")
    )

    void(
        "TransformMultiply",

        TransformIdentity["dst"],
        Check(6)..float.const.p("src")
    )

    void(
        "TransformPremultiply",

        TransformIdentity["dst"],
        Check(6)..float.const.p("src")
    )

    intb(
        "TransformInverse",

        TransformIdentity["dst"],
        Check(6)..float.const.p("src")
    )

    void(
        "TransformPoint",

        Check(1)..float.p("dstx"),
        Check(1)..float.p("dsty"),
        Check(6)..float.const.p("xform"),
        float("srcx"),
        float("srcy")
    )

    float(
        "DegToRad",

        float("deg")
    )

    float(
        "RadToDeg",

        float("rad")
    )

    // Images

    val imageFlags = int("imageFlags")

    int(
        "CreateImage",

        ctx,
        charASCII.const.p("filename"),
        imageFlags
    )

    int(
        "CreateImageMem",

        ctx,
        imageFlags,
        unsigned_char.p("data"),
        AutoSize("data")..int("ndata")
    )

    int(
        "CreateImageRGBA",

        ctx,
        int("w"),
        int("h"),
        imageFlags,
        Check("w * h * 4")..unsigned_char.const.p("data")
    )

    void(
        "UpdateImage",

        ctx,
        int("image"),
        Unsafe..unsigned_char.const.p("data")
    )

    void(
        "ImageSize",

        ctx,
        int("image"),
        Check(1)..int.p("w"),
        Check(1)..int.p("h")
    )

    void(
        "DeleteImage",

        ctx,
        int("image")
    )

    // Paints

    NVGpaint(
        "LinearGradient",

        ctx,
        float("sx"),
        float("sy"),
        float("ex"),
        float("ey"),
        NVGcolor("icol"),
        NVGcolor("ocol")
    )

    NVGpaint(
        "BoxGradient",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        float("r"),
        float("f"),
        NVGcolor("icol"),
        NVGcolor("ocol")
    )

    NVGpaint(
        "RadialGradient",

        ctx,
        float("cx"),
        float("cy"),
        float("inr"),
        float("outr"),
        NVGcolor("icol"),
        NVGcolor("ocol")
    )

    NVGpaint(
        "ImagePattern",

        ctx,
        float("ox"),
        float("oy"),
        float("ex"),
        float("ey"),
        float("angle"),
        int("image"),
        float("alpha")
    )

    // Scissoring

    void(
        "Scissor",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h")
    )

    void(
        "IntersectScissor",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h")
    )

    void(
        "ResetScissor",

        ctx
    )

    // Paths

    void(
        "BeginPath",

        ctx
    )

    void(
        "MoveTo",

        ctx,
        float("x"),
        float("y")
    )

    void(
        "LineTo",

        ctx,
        float("x"),
        float("y")
    )

    void(
        "BezierTo",

        ctx,
        float("c1x"),
        float("c1y"),
        float("c2x"),
        float("c2y"),
        float("x"),
        float("y")
    )

    void(
        "QuadTo",

        ctx,
        float("cx"),
        float("cy"),
        float("x"),
        float("y")
    )

    void(
        "ArcTo",

        ctx,
        float("x1"),
        float("y1"),
        float("x2"),
        float("y2"),
        float("radius")
    )

    void(
        "ClosePath",

        ctx
    )

    void(
        "PathWinding",

        ctx,
        int("dir")
    )

    void(
        "Arc",

        ctx,
        float("cx"),
        float("cy"),
        float("r"),
        float("a0"),
        float("a1"),
        int("dir")
    )

    void(
        "Rect",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h")
    )

    void(
        "RoundedRect",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        float("r")
    )

    void(
        "RoundedRectVarying",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        float("radTopLeft"),
        float("radTopRight"),
        float("radBottomRight"),
        float("radBottomLeft")
    )

    void(
        "Ellipse",

        ctx,
        float("cx"),
        float("cy"),
        float("rx"),
        float("ry")
    )

    void(
        "Circle",

        ctx,
        float("cx"),
        float("cy"),
        float("r")
    )

    void(
        "Fill",

        ctx
    )

    void(
        "Stroke",

        ctx
    )

    // Text

    int(
        "CreateFont",

        ctx,
        charASCII.const.p("name"),
        charASCII.const.p("filename")
    )

    int(
        "CreateFontAtIndex",

        ctx,
        charASCII.const.p("name"),
        charASCII.const.p("filename"),
        int("fontIndex")
    )

    int(
        "CreateFontMem",

        ctx,
        charASCII.const.p("name"),
        unsigned_char.p("data"),
        AutoSize("data")..int("ndata"),
        intb("freeData")
    )

    int(
        "CreateFontMemAtIndex",

        ctx,
        charASCII.const.p("name"),
        unsigned_char.p("data"),
        AutoSize("data")..int("ndata"),
        intb("freeData"),
        int("fontIndex")
    )

    int(
        "FindFont",

        ctx,
        charASCII.const.p("name")
    )

    int(
        "AddFallbackFontId",

        ctx,
        int("baseFont"),
        int("fallbackFont")
    )

    int(
        "AddFallbackFont",

        ctx,
        charASCII.const.p("baseFont"),
        charASCII.const.p("fallbackFont")
    )

    void(
        "ResetFallbackFontsId",

        ctx,
        int("baseFont")
    )

    void(
        "ResetFallbackFonts",

        ctx,
        charASCII.const.p("baseFont")
    )

    void(
        "FontSize",

        ctx,
        float("size")
    )

    void(
        "FontBlur",

        ctx,
        float("blur")
    )

    void(
        "TextLetterSpacing",

        ctx,
        float("spacing")
    )

    void(
        "TextLineHeight",

        ctx,
        float("lineHeight")
    )

    void(
        "TextAlign",

        ctx,
        int("align")
    )

    void(
        "FontFaceId",

        ctx,
        int("font")
    )

    void(
        "FontFace",

        ctx,
        charASCII.const.p("font")
    )

    float(
        "Text",

        ctx,
        float("x"),
        float("y"),
        charUTF8.const.p("string"),
        AutoSize("string")..nullable..charptr.const.p("end")
    )

    void(
        "TextBox",

        ctx,
        float("x"),
        float("y"),
        float("breakRowWidth"),
        charUTF8.const.p("string"),
        AutoSize("string")..nullable..charptr.const.p("end")
    )

    float(
        "TextBounds",

        ctx,
        float("x"),
        float("y"),
        charUTF8.const.p("string"),
        AutoSize("string")..nullable..charptr.const.p("end"),
        nullable..Check(4)..float.p("bounds")
    )

    void(
        "TextBoxBounds",

        ctx,
        float("x"),
        float("y"),
        float("breakRowWidth"),
        charUTF8.const.p("string"),
        AutoSize("string")..nullable..charptr.const.p("end"),
        nullable..Check(4)..float.p("bounds")
    )

    int(
        "TextGlyphPositions",

        ctx,
        float("x"),
        float("y"),
        charUTF8.const.p("string"),
        AutoSize("string")..nullable..charptr.const.p("end"),
        NVGglyphPosition.p("positions"),
        AutoSize("positions")..int("maxPositions")
    )

    void(
        "TextMetrics",

        ctx,
        nullable..Check(1)..float.p("ascender"),
        nullable..Check(1)..float.p("descender"),
        nullable..Check(1)..float.p("lineh")
    )

    int(
        "TextBreakLines",

        ctx,
        charUTF8.const.p("string"),
        AutoSize("string")..nullable..charptr.const.p("end"),
        float("breakRowWidth"),
        NVGtextRow.p("rows"),
        AutoSize("rows")..int("maxRows")
    )

    // Rendering back-end integration

    internal..macro..Address..opaque_p("CreateInternal", void())
    internal..macro..Address..opaque_p("InternalParams", void())
    internal..macro..Address..opaque_p("DeleteInternal", void())


}