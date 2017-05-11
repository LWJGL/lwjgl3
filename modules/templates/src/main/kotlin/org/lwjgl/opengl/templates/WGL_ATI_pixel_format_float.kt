/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_ATI_pixel_format_float = "WGLATIPixelFormatFloat".nativeClassWGL("WGL_ATI_pixel_format_float", postfix = ATI) {
    documentation =
        """
        Native bindings to the ${registryLink("ATI", "pixel_format_float")} extension.

        This extension adds pixel formats with floating-point RGBA color components.

        The size of each float components is specified using the same WGL_RED_BITS_ARB, WGL_GREEN_BITS_ARB, WGL_BLUE_BITS_ARB and WGL_ALPHA_BITS_ARB pixel
        format attributes that are used for defining the size of fixed-point components. 32 bit floating- point components are in the standard IEEE float
        format. 16 bit floating-point components have 1 sign bit, 5 exponent bits, and 10 mantissa bits.

        In standard OpenGL RGBA color components are normally clamped to the range [0,1]. The color components of a float buffer are clamped to the limits of
        the range representable by their format.

        Requires ${WGL_ARB_pixel_format.link}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "RGBA_FLOAT_MODE_ATI"..0x8820,
        "COLOR_CLEAR_UNCLAMPED_VALUE_ATI"..0x8835
    )

    IntConstant(
        """
        Accepted as a value in the {@code piAttribIList} and {@code pfAttribFList} parameter arrays of wglChoosePixelFormatARB, and returned in the
        {@code piValues} parameter array of wglGetPixelFormatAttribivARB, and the {@code pfValues} parameter array of wglGetPixelFormatAttribfvARB.
        """,

        "WGL_TYPE_RGBA_FLOAT_ATI"..0x21A0
    )
}