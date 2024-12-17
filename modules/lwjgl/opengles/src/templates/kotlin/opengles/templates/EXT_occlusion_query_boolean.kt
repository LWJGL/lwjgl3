/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_occlusion_query_boolean = "EXTOcclusionQueryBoolean".nativeClassGLES("EXT_occlusion_query_boolean", postfix = EXT) {
    IntConstant(
        "ANY_SAMPLES_PASSED_EXT"..0x8C2F,
        "ANY_SAMPLES_PASSED_CONSERVATIVE_EXT"..0x8D6A
    )

    IntConstant(
        "CURRENT_QUERY_EXT"..0x8865
    )

    IntConstant(
        "QUERY_RESULT_EXT"..0x8866,
        "QUERY_RESULT_AVAILABLE_EXT"..0x8867
    )

    void(
        "GenQueriesEXT",

        AutoSize("ids")..GLsizei("n"),
        ReturnParam..GLuint.p("ids")
    )

    void(
        "DeleteQueriesEXT",

        AutoSize("ids")..GLsizei("n"),
        SingleValue("id")..GLuint.const.p("ids")
    )

    GLboolean(
        "IsQueryEXT",

        GLuint("id")
    )

    void(
        "BeginQueryEXT",

        GLenum("target"),
        GLuint("id")
    )

    void(
        "EndQueryEXT",

        GLenum("target")
    )

    void(
        "GetQueryivEXT",

        GLenum("target"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    void(
        "GetQueryObjectuivEXT",

        GLuint("id"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLuint.p("params")
    )
}