/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val APPLE_vertex_array_object = "APPLEVertexArrayObject".nativeClassGL("APPLE_vertex_array_object") {
    IntConstant(
        "VERTEX_ARRAY_BINDING_APPLE"..0x85B5
    )

    void(
        "BindVertexArrayAPPLE",

        GLuint("array")
    )

    void(
        "DeleteVertexArraysAPPLE",

        AutoSize("arrays")..GLsizei("n"),
        SingleValue("array")..GLuint.const.p("arrays")
    )

    void(
        "GenVertexArraysAPPLE",

        AutoSize("arrays")..GLsizei("n"),
        ReturnParam..GLuint.p("arrays")
    )

    GLboolean(
        "IsVertexArrayAPPLE",

        GLuint("array")
    )
}