/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_polygon_mode = "NVPolygonMode".nativeClassGLES("NV_polygon_mode", postfix = NV) {
    IntConstant(
        "POLYGON_MODE_NV"..0x0B40
    )

    IntConstant(
        "POLYGON_OFFSET_POINT_NV"..0x2A01,
        "POLYGON_OFFSET_LINE_NV"..0x2A02
    )

    IntConstant(
        "POINT_NV"..0x1B00,
        "LINE_NV"..0x1B01,
        "FILL_NV"..0x1B02
    )

    void(
        "PolygonModeNV",

        GLenum("face"),
        GLenum("mode")
    )
}