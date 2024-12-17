/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_vertex_array_object = "ARBVertexArrayObject".nativeClassGL("ARB_vertex_array_object") {
    IntConstant(
        "VERTEX_ARRAY_BINDING"..0x85B5
    )

    reuse(GL30C, "BindVertexArray")
    reuse(GL30C, "DeleteVertexArrays")
    reuse(GL30C, "GenVertexArrays")
    reuse(GL30C, "IsVertexArray")
}