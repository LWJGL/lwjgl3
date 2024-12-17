/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_vertex_array_object = "OESVertexArrayObject".nativeClassGLES("OES_vertex_array_object", postfix = OES) {
    IntConstant(
        "VERTEX_ARRAY_BINDING_OES"..0x85B5
    )

    void(
        "BindVertexArrayOES",

        GLuint("array")
    )

    void(
        "DeleteVertexArraysOES",

        AutoSize("arrays")..GLsizei("n"),
        SingleValue("array")..GLuint.const.p("arrays")
    )

    void(
        "GenVertexArraysOES",

        AutoSize("arrays")..GLsizei("n"),
        ReturnParam..Check(1)..GLuint.p("arrays")
    )

    GLboolean(
        "IsVertexArrayOES",

        GLuint("array")
    )
}