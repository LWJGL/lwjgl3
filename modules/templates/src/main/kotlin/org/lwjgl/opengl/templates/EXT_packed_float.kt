/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_packed_float = "EXTPackedFloat".nativeClassGL("EXT_packed_float", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds a new 3-component floating-point texture format that fits within a single 32-bit word. This format stores 5 bits of biased exponent
        per component in the same manner as 16-bit floating-point formats, but rather than 10 mantissa bits, the red, green, and blue components have 6, 6, and
        5 bits respectively. Each mantissa is assumed to have an implied leading one except in the denorm exponent case. There is no sign bit so only
        non-negative values can be represented. Positive infinity, positive denorms, and positive NaN values are representable. The value of the fourth
        component returned by a texture fetch is always 1.0.

        This extension also provides support for rendering into an unsigned floating-point rendering format with the assumption that the texture format
        described above could also be advertised as an unsigned floating-point format for rendering.

        The extension also provides a pixel external format for specifying packed float values directly.

        ${GL30.promoted}
        """

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorageEXT.",

        "R11F_G11F_B10F_EXT"..0x8C3A
    )

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
        TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
        GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
        """,

        "UNSIGNED_INT_10F_11F_11F_REV_EXT"..0x8C3B
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.",

        "RGBA_SIGNED_COMPONENTS_EXT"..0x8C3C
    )
}

val GLX_EXT_fbconfig_packed_float = "GLXEXTFBConfigPackedFloat".nativeClassGLX("GLX_EXT_fbconfig_packed_float", EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "packed_float")} extension.

        This extension adds a new 3-component floating-point texture format that fits within a single 32-bit word.  This format stores 5 bits of biased exponent
        per component in the same manner as 16-bit floating-point formats, but rather than 10 mantissa bits, the red, green, and blue components have 6, 6, and
        5 bits respectively. Each mantissa is assumed to have an implied leading one except in the denorm exponent case.  There is no sign bit so only
        non-negative values can be represented.  Positive infinity, positive denorms, and positive NaN values are representable.  The value of the fourth
        component returned by a texture fetch is always 1.0.

        This extension also provides support for rendering into an unsigned floating-point rendering format with the assumption that the texture format
        described above could also be advertised as an unsigned floating-point format for rendering.

        The extension also provides a pixel external format for specifying packed float values directly.

        Requires ${GLX13.glx}.
        """

    IntConstant(
        "Accepted as values of the {@code render_type} arguments in the #CreateNewContext() and GLX#glXCreateContext() functions.",

        "RGBA_UNSIGNED_FLOAT_TYPE_EXT"..0x20B1
    )

    IntConstant(
        """
        Returned by #GetFBConfigAttrib() (when {@code attribute} is set to GLX_RENDER_TYPE) and accepted by the {@code attrib_list} parameter of
        #ChooseFBConfig() (following the GLX_RENDER_TYPE token).
        """,

        "RGBA_UNSIGNED_FLOAT_BIT_EXT"..0x00000008
    )

}

val WGL_EXT_pixel_format_packed_float = "WGLEXTPixelFormatPackedFloat".nativeClassWGL("WGL_EXT_pixel_format_packed_float", EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "packed_float")} extension.

        This extension provides support for rendering into an unsigned floating-point rendering format with the assumption that the texture format described in
        ##EXTPackedFloat could also be advertised as an unsigned floating-point format for rendering.

        Requires ${WGL_ARB_pixel_format.link}.
        """

    IntConstant(
        """
        Accepted as a value in the {@code attribIList} parameter array of #ChoosePixelFormatARB(), and returned in the {@code values}
        parameter array of #GetPixelFormatAttribivARB().
        """,

        "TYPE_RGBA_UNSIGNED_FLOAT_EXT"..0x20A8
    )
}