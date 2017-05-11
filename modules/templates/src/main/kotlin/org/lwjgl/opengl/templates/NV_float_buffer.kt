/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_float_buffer = "NVFloatBuffer".nativeClassGL("NV_float_buffer", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension builds upon NV_fragment_program to provide a framebuffer and texture format that allows fragment programs to read and write
        unconstrained floating point data.
        """

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexImage2D and CopyTexImage2D.",

        "FLOAT_R_NV"..0x8880,
        "FLOAT_RG_NV"..0x8881,
        "FLOAT_RGB_NV"..0x8882,
        "FLOAT_RGBA_NV"..0x8883,
        "FLOAT_R16_NV"..0x8884,
        "FLOAT_R32_NV"..0x8885,
        "FLOAT_RG16_NV"..0x8886,
        "FLOAT_RG32_NV"..0x8887,
        "FLOAT_RGB16_NV"..0x8888,
        "FLOAT_RGB32_NV"..0x8889,
        "FLOAT_RGBA16_NV"..0x888A,
        "FLOAT_RGBA32_NV"..0x888B
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv.",

        "TEXTURE_FLOAT_COMPONENTS_NV"..0x888C
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "FLOAT_CLEAR_COLOR_VALUE_NV"..0x888D,
        "FLOAT_RGBA_MODE_NV"..0x888E
    )
}

val WGL_NV_float_buffer = "WGLNVFloatBuffer".nativeClassWGL("WGL_NV_float_buffer", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        WGL functionality for ${NV_float_buffer.link}.
        """

    IntConstant(
        """
        Accepted in the {@code piAttributes} array of wglGetPixelFormatAttribivARB and wglGetPixelFormatAttribfvARB and in the {@code piAttribIList} and
        {@code pfAttribFList} arrays of wglChoosePixelFormatARB.
        """,

        "FLOAT_COMPONENTS_NV"..0x20B0,
        "BIND_TO_TEXTURE_RECTANGLE_FLOAT_R_NV"..0x20B1,
        "BIND_TO_TEXTURE_RECTANGLE_FLOAT_RG_NV"..0x20B2,
        "BIND_TO_TEXTURE_RECTANGLE_FLOAT_RGB_NV"..0x20B3,
        "BIND_TO_TEXTURE_RECTANGLE_FLOAT_RGBA_NV"..0x20B4
    )

    IntConstant(
        """
        Accepted in the {@code piAttribIList} array of wglCreatePbufferARB and returned in the {@code value} parameter of wglQueryPbufferARB when
        {@code iAttribute} is TEXTURE_FORMAT_ARB.
        """,

        "TEXTURE_FLOAT_R_NV"..0x20B5,
        "TEXTURE_FLOAT_RG_NV"..0x20B6,
        "TEXTURE_FLOAT_RGB_NV"..0x20B7,
        "TEXTURE_FLOAT_RGBA_NV"..0x20B8
    )
}

val GLX_NV_float_buffer = "GLXNVFloatBuffer".nativeClassGLX("GLX_NV_float_buffer", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        GLX functionality for ${NV_float_buffer.link}.
        """

    IntConstant(
        "Accepted in the {@code value} array of glXGetFBConfigAttrib (and glXGetFBConfigAttribSGIX).",

        "FLOAT_COMPONENTS_NV"..0x20B0
    )
}