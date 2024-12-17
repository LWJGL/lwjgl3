/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_float_buffer = "NVFloatBuffer".nativeClassGL("NV_float_buffer", postfix = NV) {
    IntConstant(
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
        "TEXTURE_FLOAT_COMPONENTS_NV"..0x888C
    )

    IntConstant(
        "FLOAT_CLEAR_COLOR_VALUE_NV"..0x888D,
        "FLOAT_RGBA_MODE_NV"..0x888E
    )
}

val WGL_NV_float_buffer = "WGLNVFloatBuffer".nativeClassWGL("WGL_NV_float_buffer", postfix = NV) {
    IntConstant(
        "FLOAT_COMPONENTS_NV"..0x20B0,
        "BIND_TO_TEXTURE_RECTANGLE_FLOAT_R_NV"..0x20B1,
        "BIND_TO_TEXTURE_RECTANGLE_FLOAT_RG_NV"..0x20B2,
        "BIND_TO_TEXTURE_RECTANGLE_FLOAT_RGB_NV"..0x20B3,
        "BIND_TO_TEXTURE_RECTANGLE_FLOAT_RGBA_NV"..0x20B4
    )

    IntConstant(
        "TEXTURE_FLOAT_R_NV"..0x20B5,
        "TEXTURE_FLOAT_RG_NV"..0x20B6,
        "TEXTURE_FLOAT_RGB_NV"..0x20B7,
        "TEXTURE_FLOAT_RGBA_NV"..0x20B8
    )
}

val GLX_NV_float_buffer = "GLXNVFloatBuffer".nativeClassGLX("GLX_NV_float_buffer", postfix = NV) {
    IntConstant(
        "FLOAT_COMPONENTS_NV"..0x20B0
    )
}