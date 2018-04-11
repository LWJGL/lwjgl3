/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_EXT_texture_from_pixmap = "GLXEXTTextureFromPixmap".nativeClassGLX("GLX_EXT_texture_from_pixmap", EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows a color buffer to be used for both rendering and texturing.

        Requires ${GLX13.glx}.
        """

    IntConstant(
        "Accepted by the {@code attribute} parameter of #GetFBConfigAttrib() and the {@code attrib_list} parameter of #ChooseFBConfig().",

        "BIND_TO_TEXTURE_RGB_EXT"..0x20D0,
        "BIND_TO_TEXTURE_RGBA_EXT"..0x20D1,
        "BIND_TO_MIPMAP_TEXTURE_EXT"..0x20D2,
        "BIND_TO_TEXTURE_TARGETS_EXT"..0x20D3,
        "Y_INVERTED_EXT"..0x20D4
    )

    IntConstant(
        "Accepted as an attribute in the {@code attrib_list} parameter of #CreatePixmap(), and by the {@code attribute} parameter of #QueryDrawable().",

        "TEXTURE_FORMAT_EXT"..0x20D5,
        "TEXTURE_TARGET_EXT"..0x20D6,
        "MIPMAP_TEXTURE_EXT"..0x20D7
    )

    IntConstant(
        """
        Accepted as a value in the {@code attrib_list} parameter of #CreatePixmap() and returned in the {@code value} parameter of
        #QueryDrawable() when {@code attribute} is #TEXTURE_FORMAT_EXT.
        """,

        "TEXTURE_FORMAT_NONE_EXT"..0x20D8,
        "TEXTURE_FORMAT_RGB_EXT"..0x20D9,
        "TEXTURE_FORMAT_RGBA_EXT"..0x20DA
    )

    IntConstant(
        "Accepted as bits in the #BIND_TO_TEXTURE_TARGETS_EXT variable.",

        "TEXTURE_1D_BIT_EXT"..0x00000001,
        "TEXTURE_2D_BIT_EXT"..0x00000002,
        "TEXTURE_RECTANGLE_BIT_EXT"..0x00000004
    )

    IntConstant(
        """
        Accepted as a value in the {@code attrib_list} parameter of #CreatePixmap() and returned in the {@code value} parameter of
        #QueryDrawable() when {@code attribute} is #TEXTURE_TARGET_EXT.
        """,

        "TEXTURE_1D_EXT"..0x20DB,
        "TEXTURE_2D_EXT"..0x20DC,
        "TEXTURE_RECTANGLE_EXT"..0x20DD
    )

    IntConstant(
        "Accepted by the {@code buffer} parameter of #BindTexImageEXT() and #ReleaseTexImageEXT().",

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
        """
        Defines a one- or two-dimensional texture image. The texture image is taken from {@code buffer} and need not be copied. The texture target, the texture
        format, and the size of the texture components are derived from attributes of {@code drawable}.
        """,

        DISPLAY,
        GLXDrawable.IN("drawable", "the drawable"),
        int.IN("buffer", "the buffer"),
        nullable..NullTerminated..int.const.p.IN("attrib_list", "an optional null-terminated list of attributes")
    )

    void(
        "ReleaseTexImageEXT",
        "Releases a color buffer that is being used as a texture.",

        DISPLAY,
        GLXDrawable.IN("drawable", "the drawable"),
        int.IN("buffer", "the buffer")
    )

}