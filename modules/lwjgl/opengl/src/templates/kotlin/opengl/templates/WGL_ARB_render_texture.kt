/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_ARB_render_texture = "WGLARBRenderTexture".nativeClassWGL("WGL_ARB_render_texture", ARB) {
    IntConstant(
        "BIND_TO_TEXTURE_RGB_ARB"..0x2070,
        "BIND_TO_TEXTURE_RGBA_ARB"..0x2071
    )

    IntConstant(
        "TEXTURE_FORMAT_ARB"..0x2072,
        "TEXTURE_TARGET_ARB"..0x2073,
        "MIPMAP_TEXTURE_ARB"..0x2074
    )

    IntConstant(
        "TEXTURE_RGB_ARB"..0x2075,
        "TEXTURE_RGBA_ARB"..0x2076,
        "NO_TEXTURE_ARB"..0x2077
    )

    IntConstant(
        "TEXTURE_CUBE_MAP_ARB"..0x2078,
        "TEXTURE_1D_ARB"..0x2079,
        "TEXTURE_2D_ARB"..0x207A
    )

    IntConstant(
        "MIPMAP_LEVEL_ARB"..0x207B,
        "CUBE_MAP_FACE_ARB"..0x207C
    )

    IntConstant(
        "TEXTURE_CUBE_MAP_POSITIVE_X_ARB"..0x207D,
        "TEXTURE_CUBE_MAP_NEGATIVE_X_ARB"..0x207E,
        "TEXTURE_CUBE_MAP_POSITIVE_Y_ARB"..0x207F,
        "TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB"..0x2080,
        "TEXTURE_CUBE_MAP_POSITIVE_Z_ARB"..0x2081,
        "TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB"..0x2082
    )

    IntConstant(
        "FRONT_LEFT_ARB"..0x2083,
        "FRONT_RIGHT_ARB"..0x2084,
        "BACK_LEFT_ARB"..0x2085,
        "BACK_RIGHT_ARB"..0x2086,
        "AUX0_ARB"..0x2087,
        "AUX1_ARB"..0x2088,
        "AUX2_ARB"..0x2089,
        "AUX3_ARB"..0x208A,
        "AUX4_ARB"..0x208B,
        "AUX5_ARB"..0x208C,
        "AUX6_ARB"..0x208D,
        "AUX7_ARB"..0x208E,
        "AUX8_ARB"..0x208F,
        "AUX9_ARB"..0x2090
    )

    BOOL(
        "BindTexImageARB",

        HPBUFFERARB("pbuffer"),
        int("buffer")
    )

    BOOL(
        "ReleaseTexImageARB",

        HPBUFFERARB("pbuffer"),
        int("buffer")
    )

    BOOL(
        "SetPbufferAttribARB",

        HPBUFFERARB("pbuffer"),
        NullTerminated..nullable..int.const.p("attribList")
    )
}