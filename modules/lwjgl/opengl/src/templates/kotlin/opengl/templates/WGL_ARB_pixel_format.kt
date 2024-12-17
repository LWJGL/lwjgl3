/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_ARB_pixel_format = "WGLARBPixelFormat".nativeClassWGL("WGL_ARB_pixel_format", ARB) {
    IntConstant(
        "NUMBER_PIXEL_FORMATS_ARB"..0x2000,
        "DRAW_TO_WINDOW_ARB"..0x2001,
        "DRAW_TO_BITMAP_ARB"..0x2002,
        "ACCELERATION_ARB"..0x2003,
        "NEED_PALETTE_ARB"..0x2004,
        "NEED_SYSTEM_PALETTE_ARB"..0x2005,
        "SWAP_LAYER_BUFFERS_ARB"..0x2006,
        "SWAP_METHOD_ARB"..0x2007,
        "NUMBER_OVERLAYS_ARB"..0x2008,
        "NUMBER_UNDERLAYS_ARB"..0x2009,
        "TRANSPARENT_ARB"..0x200A,
        "TRANSPARENT_RED_VALUE_ARB"..0x2037,
        "TRANSPARENT_GREEN_VALUE_ARB"..0x2038,
        "TRANSPARENT_BLUE_VALUE_ARB"..0x2039,
        "TRANSPARENT_ALPHA_VALUE_ARB"..0x203A,
        "TRANSPARENT_INDEX_VALUE_ARB"..0x203B,
        "SHARE_DEPTH_ARB"..0x200C,
        "SHARE_STENCIL_ARB"..0x200D,
        "SHARE_ACCUM_ARB"..0x200E,
        "SUPPORT_GDI_ARB"..0x200F,
        "SUPPORT_OPENGL_ARB"..0x2010,
        "DOUBLE_BUFFER_ARB"..0x2011,
        "STEREO_ARB"..0x2012,
        "PIXEL_TYPE_ARB"..0x2013,
        "COLOR_BITS_ARB"..0x2014,
        "RED_BITS_ARB"..0x2015,
        "RED_SHIFT_ARB"..0x2016,
        "GREEN_BITS_ARB"..0x2017,
        "GREEN_SHIFT_ARB"..0x2018,
        "BLUE_BITS_ARB"..0x2019,
        "BLUE_SHIFT_ARB"..0x201A,
        "ALPHA_BITS_ARB"..0x201B,
        "ALPHA_SHIFT_ARB"..0x201C,
        "ACCUM_BITS_ARB"..0x201D,
        "ACCUM_RED_BITS_ARB"..0x201E,
        "ACCUM_GREEN_BITS_ARB"..0x201F,
        "ACCUM_BLUE_BITS_ARB"..0x2020,
        "ACCUM_ALPHA_BITS_ARB"..0x2021,
        "DEPTH_BITS_ARB"..0x2022,
        "STENCIL_BITS_ARB"..0x2023,
        "AUX_BUFFERS_ARB"..0x2024
    )

    IntConstant(
        "NO_ACCELERATION_ARB"..0x2025,
        "GENERIC_ACCELERATION_ARB"..0x2026,
        "FULL_ACCELERATION_ARB"..0x2027,

        "SWAP_EXCHANGE_ARB"..0x2028,
        "SWAP_COPY_ARB"..0x2029,
        "SWAP_UNDEFINED_ARB"..0x202A,

        "TYPE_RGBA_ARB"..0x202B,
        "TYPE_COLORINDEX_ARB"..0x202C
    )

    BOOL(
        "GetPixelFormatAttribivARB",

        HDC("hdc"),
        int("pixelFormat"),
        int("layerPlane"),
        AutoSize("attributes", "values")..UINT("n"),
        SingleValue("attribute")..int.const.p("attributes"),
        int.p("values")
    )

    BOOL(
        "GetPixelFormatAttribfvARB",

        HDC("hdc"),
        int("pixelFormat"),
        int("layerPlane"),
        AutoSize("attributes", "values")..UINT("n"),
        SingleValue("attribute")..int.const.p("attributes"),
        FLOAT.p("values")
    )

    BOOL(
        "ChoosePixelFormatARB",

        HDC("hdc"),
        NullTerminated..nullable..int.const.p("attribIList"),
        NullTerminated..nullable..FLOAT.const.p("attribFList"),
        AutoSize("formats")..UINT("maxFormats"),
        int.p("formats"),
        Check(1)..UINT.p("numFormats")
    )

}