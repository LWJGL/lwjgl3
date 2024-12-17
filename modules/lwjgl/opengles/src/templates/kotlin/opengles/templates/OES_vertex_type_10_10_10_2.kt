/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_vertex_type_10_10_10_2 = "OESVertexType1010102".nativeClassGLES("OES_vertex_type_10_10_10_2", postfix = OES) {
    IntConstant(
        "UNSIGNED_INT_10_10_10_2_OES"..0x8DF6,
        "INT_10_10_10_2_OES"..0x8DF7
    )
}