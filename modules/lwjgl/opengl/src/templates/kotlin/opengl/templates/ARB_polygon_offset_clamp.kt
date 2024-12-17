/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_polygon_offset_clamp = "ARBPolygonOffsetClamp".nativeClassGL("ARB_polygon_offset_clamp", postfix = ARB) {
    IntConstant(
        "POLYGON_OFFSET_CLAMP"..0x8E1B
    )

    reuse(GL46C, "PolygonOffsetClamp")
}