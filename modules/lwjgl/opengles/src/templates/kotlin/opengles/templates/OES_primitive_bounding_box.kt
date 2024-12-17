/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_primitive_bounding_box = "OESPrimitiveBoundingBox".nativeClassGLES("OES_primitive_bounding_box", postfix = OES) {
    IntConstant(
        "PRIMITIVE_BOUNDING_BOX_OES"..0x92BE
    )

    void(
        "PrimitiveBoundingBoxOES",

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