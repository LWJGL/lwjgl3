/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_primitive_bounding_box = "EXTPrimitiveBoundingBox".nativeClassGLES("EXT_primitive_bounding_box", postfix = EXT) {
    IntConstant(
        "PRIMITIVE_BOUNDING_BOX_EXT"..0x92BE
    )

    void(
        "PrimitiveBoundingBoxEXT",

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