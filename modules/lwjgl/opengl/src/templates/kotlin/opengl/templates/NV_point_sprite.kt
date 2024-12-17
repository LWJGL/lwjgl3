/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_point_sprite = "NVPointSprite".nativeClassGL("NV_point_sprite", postfix = NV) {
    IntConstant(
        "POINT_SPRITE_NV"..0x8861
    )

    IntConstant(
        "COORD_REPLACE_NV"..0x8862
    )

    IntConstant(
        "POINT_SPRITE_R_MODE_NV"..0x8863
    )

    void(
        "PointParameteriNV",

        GLenum("pname"),
        GLint("param")
    )

    void(
        "PointParameterivNV",

        GLenum("pname"),
        Check(1)..GLint.const.p("params")
    )
}