/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_ES3_2_compatibility = "ARBES32Compatibility".nativeClassGL("ARB_ES3_2_compatibility") {
    IntConstant(
        "PRIMITIVE_BOUNDING_BOX_ARB"..0x92BE,
        "MULTISAMPLE_LINE_WIDTH_RANGE_ARB"..0x9381,
        "MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB"..0x9382
    )

    void(
        "PrimitiveBoundingBoxARB",

        GLfloat("minX"),
        GLfloat("minY"),
        GLfloat("minZ"),
        GLfloat("minW"),
        GLfloat("maxX"),
        GLfloat("maxY"),
        GLfloat("maxZ"),
        GLfloat("maxW")
    )
}