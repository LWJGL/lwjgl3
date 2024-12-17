/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_polygon_offset_clamp = "EXTPolygonOffsetClamp".nativeClassGLES("EXT_polygon_offset_clamp", postfix = EXT) {
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