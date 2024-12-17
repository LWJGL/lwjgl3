/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_EXT_texture_from_pixmap = "GLXEXTTextureFromPixmap".nativeClassGLX("GLX_EXT_texture_from_pixmap", EXT) {
    IntConstant(
        "BIND_TO_TEXTURE_RGB_EXT"..0x20D0,
        "BIND_TO_TEXTURE_RGBA_EXT"..0x20D1,
        "BIND_TO_MIPMAP_TEXTURE_EXT"..0x20D2,
        "BIND_TO_TEXTURE_TARGETS_EXT"..0x20D3,
        "Y_INVERTED_EXT"..0x20D4
    )

    IntConstant(
        "TEXTURE_FORMAT_EXT"..0x20D5,
        "TEXTURE_TARGET_EXT"..0x20D6,
        "MIPMAP_TEXTURE_EXT"..0x20D7
    )

    IntConstant(
        "TEXTURE_FORMAT_NONE_EXT"..0x20D8,
        "TEXTURE_FORMAT_RGB_EXT"..0x20D9,
        "TEXTURE_FORMAT_RGBA_EXT"..0x20DA
    )

    IntConstant(
        "TEXTURE_1D_BIT_EXT"..0x00000001,
        "TEXTURE_2D_BIT_EXT"..0x00000002,
        "TEXTURE_RECTANGLE_BIT_EXT"..0x00000004
    )

    IntConstant(
        "TEXTURE_1D_EXT"..0x20DB,
        "TEXTURE_2D_EXT"..0x20DC,
        "TEXTURE_RECTANGLE_EXT"..0x20DD
    )

    IntConstant(
        "FRONT_LEFT_EXT"..0x20DE,
        "FRONT_RIGHT_EXT"..0x20DF,
        "BACK_LEFT_EXT"..0x20E0,
        "BACK_RIGHT_EXT"..0x20E1,
        "FRONT_EXT".."GLX_FRONT_LEFT_EXT",
        "BACK_EXT".."GLX_BACK_LEFT_EXT",
        "AUX0_EXT"..0x20E2,
        "AUX1_EXT"..0x20E3,
        "AUX2_EXT"..0x20E4,
        "AUX3_EXT"..0x20E5,
        "AUX4_EXT"..0x20E6,
        "AUX5_EXT"..0x20E7,
        "AUX6_EXT"..0x20E8,
        "AUX7_EXT"..0x20E9,
        "AUX8_EXT"..0x20EA,
        "AUX9_EXT"..0x20EB
    )

    void(
        "BindTexImageEXT",

        DISPLAY,
        GLXDrawable("drawable"),
        int("buffer"),
        nullable..NullTerminated..int.const.p("attrib_list")
    )

    void(
        "ReleaseTexImageEXT",

        DISPLAY,
        GLXDrawable("drawable"),
        int("buffer")
    )

}