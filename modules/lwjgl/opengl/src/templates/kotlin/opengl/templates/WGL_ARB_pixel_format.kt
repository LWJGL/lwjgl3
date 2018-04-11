/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_ARB_pixel_format = "WGLARBPixelFormat".nativeClassWGL("WGL_ARB_pixel_format", ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds functions to query pixel format attributes and to choose from the list of supported pixel formats.

        These functions treat pixel formats as opaque types: attributes are specified by name rather than by accessing them directly as fields in a structure.
        Thus the list of attributes can be easily extended.

        Requires ${WGL_ARB_extensions_string.link}.
        """

    val WGL_ATTRIBUTES = IntConstant(
        """
        Accepted in the {@code attributes} parameter array of #GetPixelFormatAttribivARB(), and #GetPixelFormatAttribfvARB(), and as a type in
        the {@code attribIList} and {@code attribFList} parameter arrays of #ChoosePixelFormatARB().
        """,

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
    ).javaDocLinks

    IntConstant(
        """
        Accepted as a value in the {@code attribIList} and {@code attribFList} parameter arrays of #ChoosePixelFormatARB(), and returned in the
        {@code values} parameter array of #GetPixelFormatAttribivARB() and #GetPixelFormatAttribfvARB().
        """,

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
        "",

        HDC.IN("hdc", "the device context on which the pixel format is supported"),
        int.IN("pixelFormat", "an index that specifies the pixel format"),
        int.IN("layerPlane", "the plane being queried"),
        AutoSize("attributes", "values")..UINT.IN("n", "the number of attributes being queried"),
        SingleValue("attribute")..int.const.p.IN("attributes", "an array of pixel format attribute identifiers which specify the attributes to be queried", WGL_ATTRIBUTES),
        int.p.OUT("values", "a buffer into which the results of the query will be placed")
    )

    BOOL(
        "GetPixelFormatAttribfvARB",
        "Float version of #GetPixelFormatAttribivARB().",

        HDC.IN("hdc", "the device context on which the pixel format is supported"),
        int.IN("pixelFormat", "an index that specifies the pixel format"),
        int.IN("layerPlane", "the plane being queried"),
        AutoSize("attributes", "values")..UINT.IN("n", "the number of attributes being queried"),
        SingleValue("attribute")..int.const.p.IN("attributes", "an array of pixel format attribute identifiers which specify the attributes to be queried"),
        FLOAT.p.OUT("values", "a buffer into which the results of the query will be placed")
    )

    BOOL(
        "ChoosePixelFormatARB",
        """
        Selects from among all of the available pixel formats (including both accelerated and generic formats and non-displayable formats). This function
        accepts attributes for the main planes. A list of pixel formats that match the specified attributes is returned with the "best" pixel formats at the
        start of the list (order is device dependent).
        """,

        HDC.IN("hdc", "the device context on which the pixel format is supported"),
        NullTerminated..nullable..int.const.p.IN("attribIList", "a list of attribute {type, value} pairs containing integer attribute values", WGL_ATTRIBUTES),
        NullTerminated..nullable..FLOAT.const.p.IN("attribFList", "a list of attribute {type, value} pairs containing floating point attribute values"),
        AutoSize("formats")..UINT.IN("maxFormats", "the number of attributes being queried"),
        int.p.IN(
            "formats",
            """
            an array of returned indices of the matching pixel formats. The best pixel formats (i.e. closest match and best format for the hardware) are at the
            head of the list.
            """
        ),
        Check(1)..UINT.p.OUT("numFormats", "returns the number of matching formats")
    )

}