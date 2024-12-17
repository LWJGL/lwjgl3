/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb.templates

import org.lwjgl.generator.*
import stb.*

val stb_truetype = "STBTruetype".nativeClass(Module.STB, prefix = "STBTT", prefixMethod = "stbtt_") {
    includeSTBAPI(
        """#include "lwjgl_malloc.h"
#define STBTT_malloc(x,u)  ((void)(u),org_lwjgl_malloc(x))
#define STBTT_free(x,u)    ((void)(u),org_lwjgl_free(x))
#define STBTT_assert
#define STB_TRUETYPE_IMPLEMENTATION
#define STBTT_STATIC
#include "stb_rect_pack.h"
#include "stb_truetype.h"""")

    // TEXTURE BAKING API

    int(
        "BakeFontBitmap",

        Unsafe..unsigned_char.const.p("data"),
        Expression("0")..int("offset"),
        float("pixel_height"),
        Check("pw * ph")..unsigned_char.p("pixels"),
        int("pw"),
        int("ph"),
        int("first_char"),
        AutoSize("chardata")..int("num_chars"),
        stbtt_bakedchar.p("chardata")
    )

    void(
        "GetBakedQuad",

        Check("char_index + 1")..stbtt_bakedchar.const.p("chardata"),
        int("pw"),
        int("ph"),
        int("char_index"),
        Check(1)..float.p("xpos"),
        Check(1)..float.p("ypos"),
        stbtt_aligned_quad.p("q"),
        intb("opengl_fillrule")
    )

    void(
        "GetScaledFontVMetrics",

        Unsafe..unsigned_char.const.p("fontdata"),
        int("index"),
        float("size"),
        Check(1)..float.p("ascent"),
        Check(1)..float.p("descent"),
        Check(1)..float.p("lineGap")
    )

    // NEW TEXTURE BAKING API

    intb(
        "PackBegin",

        stbtt_pack_context.p("spc"),
        Check("(stride_in_bytes != 0 ? stride_in_bytes : width) * height")..nullable..unsigned_char.p("pixels"),
        int("width"),
        int("height"),
        int("stride_in_bytes"),
        int("padding"),
        Expression("NULL")..nullable..opaque_p("alloc_context")
    )

    void(
        "PackEnd",

        stbtt_pack_context.p("spc")
    )

    macro(expression = "-font_size")..int(
        "STBTT_POINT_SIZE",

        int("font_size"),

        noPrefix = true
    )

    intb(
        "PackFontRange",

        stbtt_pack_context.p("spc"),
        Unsafe..unsigned_char.const.p("fontdata"),
        int("font_index"),
        float("font_size"),
        int("first_unicode_char_in_range"),
        AutoSize("chardata_for_range")..int("num_chars_in_range"),
        stbtt_packedchar.p("chardata_for_range")
    )

    intb(
        "PackFontRanges",

        stbtt_pack_context.p("spc"),
        Unsafe..unsigned_char.const.p("fontdata"),
        int("font_index"),
        Input..stbtt_pack_range.p("ranges"),
        AutoSize("ranges")..int("num_ranges")
    )

    void(
        "PackSetOversampling",

        stbtt_pack_context.p("spc"),
        unsigned_int("h_oversample"),
        unsigned_int("v_oversample")
    )

    void(
        "PackSetSkipMissingCodepoints",

        stbtt_pack_context.p("spc"),
        intb("skip")
    )

    void(
        "GetPackedQuad",

        Check("char_index + 1")..stbtt_packedchar.const.p("chardata"),
        int("pw"),
        int("ph"),
        int("char_index"),
        Check(1)..float.p("xpos"),
        Check(1)..float.p("ypos"),
        stbtt_aligned_quad.p("q"),
        intb("align_to_integer")
    )

    int(
        "PackFontRangesGatherRects",

        stbtt_pack_context.p("spc"),
        stbtt_fontinfo.p("info"),
        Input..stbtt_pack_range.p("ranges"),
        AutoSize("ranges")..int("num_ranges"),
        Unsafe..stbrp_rect.p("rects")
    )

    void(
        "PackFontRangesPackRects",

        stbtt_pack_context.p("spc"),
        stbrp_rect.p("rects"),
        AutoSize("rects")..int("num_rects")
    )

    intb(
        "PackFontRangesRenderIntoRects",

        stbtt_pack_context.p("spc"),
        stbtt_fontinfo.p("info"),
        Input..stbtt_pack_range.p("ranges"),
        AutoSize("ranges")..int("num_ranges"),
        Unsafe..stbrp_rect.p("rects")
    )

    // FONT LOADING

    int(
        "GetNumberOfFonts",

        Unsafe..unsigned_char.const.p("data")
    )

    int(
        "GetFontOffsetForIndex",

        Unsafe..unsigned_char.const.p("data"),
        int("index")
    )

    intb(
        "InitFont",

        stbtt_fontinfo.p("info"),
        Unsafe..unsigned_char.const.p("data"),
        Expression("0")..int("offset")
    )

    // CHARACTER TO GLYPH-INDEX CONVERSION

    int(
        "FindGlyphIndex",

        stbtt_fontinfo.const.p("info"),
        int("unicode_codepoint")
    )

    // CHARACTER PROPERTIES

    float(
        "ScaleForPixelHeight",

        stbtt_fontinfo.const.p("info"),
        float("pixels")
    )

    float(
        "ScaleForMappingEmToPixels",

        stbtt_fontinfo.const.p("info"),
        float("pixels")
    )

    void(
        "GetFontVMetrics",

        stbtt_fontinfo.const.p("info"),
        nullable..Check(1)..int.p("ascent"),
        nullable..Check(1)..int.p("descent"),
        nullable..Check(1)..int.p("lineGap")
    )

    intb(
        "GetFontVMetricsOS2",

        stbtt_fontinfo.const.p("info"),
        nullable..Check(1)..int.p("typoAscent"),
        nullable..Check(1)..int.p("typoDescent"),
        nullable..Check(1)..int.p("typoLineGap")
    )

    void(
        "GetFontBoundingBox",

        stbtt_fontinfo.const.p("info"),
        Check(1)..int.p("x0"),
        Check(1)..int.p("y0"),
        Check(1)..int.p("x1"),
        Check(1)..int.p("y1")
    )

    void(
        "GetCodepointHMetrics",

        stbtt_fontinfo.const.p("info"),
        int("codepoint"),
        nullable..Check(1)..int.p("advanceWidth"),
        nullable..Check(1)..int.p("leftSideBearing")
    )

    int(
        "GetCodepointKernAdvance",

        stbtt_fontinfo.const.p("info"),
        int("ch1"),
        int("ch2")
    )

    intb(
        "GetCodepointBox",

        stbtt_fontinfo.const.p("info"),
        int("codepoint"),
        nullable..Check(1)..int.p("x0"),
        nullable..Check(1)..int.p("y0"),
        nullable..Check(1)..int.p("x1"),
        nullable..Check(1)..int.p("y1")
    )

    void(
        "GetGlyphHMetrics",

        stbtt_fontinfo.const.p("info"),
        int("glyph_index"),
        nullable..Check(1)..int.p("advanceWidth"),
        nullable..Check(1)..int.p("leftSideBearing")
    )

    int(
        "GetGlyphKernAdvance",

        stbtt_fontinfo.const.p("info"),
        int("glyph1"),
        int("glyph2")
    )

    intb(
        "GetGlyphBox",

        stbtt_fontinfo.const.p("info"),
        int("glyph_index"),
        nullable..Check(1)..int.p("x0"),
        nullable..Check(1)..int.p("y0"),
        nullable..Check(1)..int.p("x1"),
        nullable..Check(1)..int.p("y1")
    )

    int(
        "GetKerningTableLength",

        stbtt_fontinfo.const.p("info")
    )
    int(
        "GetKerningTable",

        stbtt_fontinfo.const.p("info"),
        stbtt_kerningentry.p("table"),
        AutoSize("table")..int("table_length")
    )

    // GLYPH SHAPES

    ByteConstant(
        "vmove".."1",
        "vline".."2",
        "vcurve".."3",
        "vcubic".."4"
    )

    intb(
        "IsGlyphEmpty",

        stbtt_fontinfo.const.p("info"),
        int("glyph_index")
    )

    int(
        "GetCodepointShape",

        stbtt_fontinfo.const.p("info"),
        int("unicode_codepoint"),
        Check(1)..Return(RESULT)..stbtt_vertex.p.p("vertices")
    )

    int(
        "GetGlyphShape",

        stbtt_fontinfo.const.p("info"),
        int("glyph_index"),
        Check(1)..Return(RESULT)..stbtt_vertex.p.p("vertices")
    )

    void(
        "FreeShape",

        stbtt_fontinfo.const.p("info"),
        Check(1)..stbtt_vertex.p("vertices")
    )

    "unsigned char".opaque.p(
        "FindSVGDoc",

        stbtt_fontinfo.const.p("info"),
        int("gl")
    )

    int(
        "GetCodepointSVG",

        stbtt_fontinfo.const.p("info"),
        int("unicode_codepoint"),
        Check(1)..char.const.p.p("svg")
    )

    int(
        "GetGlyphSVG",

        stbtt_fontinfo.const.p("info"),
        int("gl"),
        Check(1)..char.const.p.p("svg")
    )

    // BITMAP RENDERING

    void(
        "FreeBitmap",

        Unsafe..unsigned_char.p("bitmap"),
        Expression("NULL")..nullable..opaque_p("userdata")
    )

    unsigned_char.p(
        "GetCodepointBitmap",

        stbtt_fontinfo.const.p("info"),
        float("scale_x"),
        float("scale_y"),
        int("codepoint"),
        Check(1)..AutoSizeResult..int.p("width"),
        Check(1)..AutoSizeResult..int.p("height"),
        nullable..Check(1)..int.p("xoff"),
        nullable..Check(1)..int.p("yoff")
    )

    unsigned_char.p(
        "GetCodepointBitmapSubpixel",

        stbtt_fontinfo.const.p("info"),
        float("scale_x"),
        float("scale_y"),
        float("shift_x"),
        float("shift_y"),
        int("codepoint"),
        Check(1)..AutoSizeResult..int.p("width"),
        Check(1)..AutoSizeResult..int.p("height"),
        nullable..Check(1)..int.p("xoff"),
        nullable..Check(1)..int.p("yoff")
    )

    void(
        "MakeCodepointBitmap",

        stbtt_fontinfo.const.p("info"),
        Check("(out_stride != 0 ? out_stride : out_w) * out_h")..unsigned_char.p("output"),
        int("out_w"),
        int("out_h"),
        int("out_stride"),
        float("scale_x"),
        float("scale_y"),
        int("codepoint")
    )

    void(
        "MakeCodepointBitmapSubpixel",

        stbtt_fontinfo.const.p("info"),
        Check("(out_stride != 0 ? out_stride : out_w) * out_h")..unsigned_char.p("output"),
        int("out_w"),
        int("out_h"),
        int("out_stride"),
        float("scale_x"),
        float("scale_y"),
        float("shift_x"),
        float("shift_y"),
        int("codepoint")
    )

    void(
        "MakeCodepointBitmapSubpixelPrefilter",

        stbtt_fontinfo.const.p("info"),
        Check("(out_stride != 0 ? out_stride : out_w) * out_h")..unsigned_char.p("output"),
        int("out_w"),
        int("out_h"),
        int("out_stride"),
        float("scale_x"),
        float("scale_y"),
        float("shift_x"),
        float("shift_y"),
        int("oversample_x"),
        int("oversample_y"),
        Check(1)..float.p("sub_x"),
        Check(1)..float.p("sub_y"),
        int("codepoint")
    )

    void(
        "GetCodepointBitmapBox",

        stbtt_fontinfo.const.p("font"),
        int("codepoint"),
        float("scale_x"),
        float("scale_y"),
        nullable..Check(1)..int.p("ix0"),
        nullable..Check(1)..int.p("iy0"),
        nullable..Check(1)..int.p("ix1"),
        nullable..Check(1)..int.p("iy1")
    )

    void(
        "GetCodepointBitmapBoxSubpixel",

        stbtt_fontinfo.const.p("font"),
        int("codepoint"),
        float("scale_x"),
        float("scale_y"),
        float("shift_x"),
        float("shift_y"),
        nullable..Check(1)..int.p("ix0"),
        nullable..Check(1)..int.p("iy0"),
        nullable..Check(1)..int.p("ix1"),
        nullable..Check(1)..int.p("iy1")
    )

    unsigned_char.p(
        "GetGlyphBitmap",

        stbtt_fontinfo.const.p("info"),
        float("scale_x"),
        float("scale_y"),
        int("glyph"),
        Check(1)..AutoSizeResult..int.p("width"),
        Check(1)..AutoSizeResult..int.p("height"),
        nullable..Check(1)..int.p("xoff"),
        nullable..Check(1)..int.p("yoff")
    )

    unsigned_char.p(
        "GetGlyphBitmapSubpixel",

        stbtt_fontinfo.const.p("info"),
        float("scale_x"),
        float("scale_y"),
        float("shift_x"),
        float("shift_y"),
        int("glyph"),
        Check(1)..AutoSizeResult..int.p("width"),
        Check(1)..AutoSizeResult..int.p("height"),
        nullable..Check(1)..int.p("xoff"),
        nullable..Check(1)..int.p("yoff")
    )

    void(
        "MakeGlyphBitmap",

        stbtt_fontinfo.const.p("info"),
        Check("(out_stride != 0 ? out_stride : out_w) * out_h")..unsigned_char.p("output"),
        int("out_w"),
        int("out_h"),
        int("out_stride"),
        float("scale_x"),
        float("scale_y"),
        int("glyph")
    )

    void(
        "MakeGlyphBitmapSubpixel",

        stbtt_fontinfo.const.p("info"),
        Check("(out_stride != 0 ? out_stride : out_w) * out_h")..unsigned_char.p("output"),
        int("out_w"),
        int("out_h"),
        int("out_stride"),
        float("scale_x"),
        float("scale_y"),
        float("shift_x"),
        float("shift_y"),
        int("glyph")
    )

    void(
        "MakeGlyphBitmapSubpixelPrefilter",

        stbtt_fontinfo.const.p("info"),
        Check("(out_stride != 0 ? out_stride : out_w) * out_h")..unsigned_char.p("output"),
        int("out_w"),
        int("out_h"),
        int("out_stride"),
        float("scale_x"),
        float("scale_y"),
        float("shift_x"),
        float("shift_y"),
        int("oversample_x"),
        int("oversample_y"),
        Check(1)..float.p("sub_x"),
        Check(1)..float.p("sub_y"),
        int("glyph")
    )

    void(
        "GetGlyphBitmapBox",

        stbtt_fontinfo.const.p("font"),
        int("glyph"),
        float("scale_x"),
        float("scale_y"),
        nullable..Check(1)..int.p("ix0"),
        nullable..Check(1)..int.p("iy0"),
        nullable..Check(1)..int.p("ix1"),
        nullable..Check(1)..int.p("iy1")
    )

    void(
        "GetGlyphBitmapBoxSubpixel",

        stbtt_fontinfo.const.p("font"),
        int("glyph"),
        float("scale_x"),
        float("scale_y"),
        float("shift_x"),
        float("shift_y"),
        nullable..Check(1)..int.p("ix0"),
        nullable..Check(1)..int.p("iy0"),
        nullable..Check(1)..int.p("ix1"),
        nullable..Check(1)..int.p("iy1")
    )

    void(
        "Rasterize",

        stbtt__bitmap.p("result"),
        float("flatness_in_pixels"),
        stbtt_vertex.p("vertices"),
        AutoSize("vertices")..int("num_verts"),
        float("scale_x"),
        float("scale_y"),
        float("shift_x"),
        float("shift_y"),
        int("x_off"),
        int("y_off"),
        intb("invert"),
        Expression("NULL")..nullable..opaque_p("alloc_context")
    )

    // Signed Distance Function (or Field) rendering

    void(
        "FreeSDF",

        Unsafe..unsigned_char.p("bitmap"),
        Expression("NULL")..nullable..opaque_p("userdata")
    )

    unsigned_char.p(
        "GetGlyphSDF",

        stbtt_fontinfo.const.p("font"),
        float("scale"),
        int("glyph"),
        int("padding"),
        unsigned_char("onedge_value"),
        float("pixel_dist_scale"),
        AutoSizeResult..Check(1)..int.p("width"),
        AutoSizeResult..Check(1)..int.p("height"),
        Check(1)..int.p("xoff"),
        Check(1)..int.p("yoff")
    )

    unsigned_char.p(
        "GetCodepointSDF",

        stbtt_fontinfo.const.p("font"),
        float("scale"),
        int("codepoint"),
        int("padding"),
        unsigned_char("onedge_value"),
        float("pixel_dist_scale"),
        AutoSizeResult..Check(1)..int.p("width"),
        AutoSizeResult..Check(1)..int.p("height"),
        Check(1)..int.p("xoff"),
        Check(1)..int.p("yoff")
    )

    // Finding the right font...

    IntConstant(
        "MACSTYLE_DONTCARE".."0",
        "MACSTYLE_BOLD".."1",
        "MACSTYLE_ITALIC".."2",
        "MACSTYLE_UNDERSCORE".."4",
        "MACSTYLE_NONE".."8"
    )

    IntConstant(
        "PLATFORM_ID_UNICODE".."0",
        "PLATFORM_ID_MAC".."1",
        "PLATFORM_ID_ISO".."2",
        "PLATFORM_ID_MICROSOFT".."3"
    )

    IntConstant(
        "UNICODE_EID_UNICODE_1_0".."0",
        "UNICODE_EID_UNICODE_1_1".."1",
        "UNICODE_EID_ISO_10646".."2",
        "UNICODE_EID_UNICODE_2_0_BMP".."3",
        "UNICODE_EID_UNICODE_2_0_FULL".."4"
    )

    IntConstant(
        "MS_EID_SYMBOL".."0",
        "MS_EID_UNICODE_BMP".."1",
        "MS_EID_SHIFTJIS".."2",
        "MS_EID_UNICODE_FULL".."10"
    )

    IntConstant(
        "MAC_EID_ROMAN".."0",
        "MAC_EID_JAPANESE".."1",
        "MAC_EID_CHINESE_TRAD".."2",
        "MAC_EID_KOREAN".."3",
        "MAC_EID_ARABIC".."4",
        "MAC_EID_HEBREW".."5",
        "MAC_EID_GREEK".."6",
        "MAC_EID_RUSSIAN".."7"
    )

    IntConstant(
        "MS_LANG_ENGLISH"..0x0409,
        "MS_LANG_CHINESE"..0x0804,
        "MS_LANG_DUTCH"..0x0413,
        "MS_LANG_FRENCH"..0x040c,
        "MS_LANG_GERMAN"..0x0407,
        "MS_LANG_HEBREW"..0x040d,
        "MS_LANG_ITALIAN"..0x0410,
        "MS_LANG_JAPANESE"..0x0411,
        "MS_LANG_KOREAN"..0x0412,
        "MS_LANG_RUSSIAN"..0x0419,
        "MS_LANG_SPANISH"..0x0409,
        "MS_LANG_SWEDISH"..0x041D
    )

    IntConstant(
        "MAC_LANG_ENGLISH".."0",
        "MAC_LANG_ARABIC".."12",
        "MAC_LANG_DUTCH".."4",
        "MAC_LANG_FRENCH".."1",
        "MAC_LANG_GERMAN".."2",
        "MAC_LANG_HEBREW".."10",
        "MAC_LANG_ITALIAN".."3",
        "MAC_LANG_JAPANESE".."11",
        "MAC_LANG_KOREAN".."23",
        "MAC_LANG_RUSSIAN".."32",
        "MAC_LANG_SPANISH".."6",
        "MAC_LANG_SWEDISH".."5",
        "MAC_LANG_CHINESE_SIMPLIFIED".."33",
        "MAC_LANG_CHINESE_TRAD".."19"
    )

    int(
        "FindMatchingFont",

        Unsafe..unsigned_char.const.p("fontdata"),
        charUTF8.const.p("name"),
        int("flags")
    )

    intb(
        "CompareUTF8toUTF16_bigendian",

        char.const.p("s1"),
        AutoSize("s1")..int("len1"),
        char.const.p("s2"),
        AutoSize("s2")..int("len2")
    )

    char.const.p(
        "GetFontNameString",

        stbtt_fontinfo.const.p("font"),
        AutoSizeResult..int.p("length"),
        int("platformID"),
        int("encodingID"),
        int("languageID"),
        int("nameID")
    )
}