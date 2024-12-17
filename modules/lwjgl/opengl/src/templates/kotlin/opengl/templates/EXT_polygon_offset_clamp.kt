/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_polygon_offset_clamp = "EXTPolygonOffsetClamp".nativeClassGL("EXT_polygon_offset_clamp", postfix = EXT) {
    IntConstant(
        "POLYGON_OFFSET_CLAMP_EXT"..0x8E1B
    )

    void(
        "PolygonOffsetClampEXT",

        GLfloat("factor"),
        GLfloat("units"),
        GLfloat("clamp")
    )
}