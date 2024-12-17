/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_vertex_array_bgra = "ARBVertexArrayBGRA".nativeClassGL("ARB_vertex_array_bgra") {
    IntConstant(
        "BGRA"..0x80E1
    )
}