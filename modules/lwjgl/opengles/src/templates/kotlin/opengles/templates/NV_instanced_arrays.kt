/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_instanced_arrays = "NVInstancedArrays".nativeClassGLES("NV_instanced_arrays", postfix = NV) {
    IntConstant(
        "VERTEX_ATTRIB_ARRAY_DIVISOR_NV"..0x88FE
    )

    void(
        "VertexAttribDivisorNV",

        GLuint("index"),
        GLuint("divisor")
    )
}