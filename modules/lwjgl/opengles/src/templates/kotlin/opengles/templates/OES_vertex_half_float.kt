/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_vertex_half_float = "OESVertexHalfFloat".nativeClassGLES("OES_vertex_half_float", postfix = OES) {
    IntConstant(
        "HALF_FLOAT_OES"..0x8D61
    )
}