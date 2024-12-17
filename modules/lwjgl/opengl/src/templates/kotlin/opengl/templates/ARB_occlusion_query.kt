/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_occlusion_query = "ARBOcclusionQuery".nativeClassGL("ARB_occlusion_query", postfix = ARB) {
    IntConstant(
        "SAMPLES_PASSED_ARB"..0x8914
    )

    IntConstant(
        "QUERY_COUNTER_BITS_ARB"..0x8864,
        "CURRENT_QUERY_ARB"..0x8865
    )

    IntConstant(
        "QUERY_RESULT_ARB"..0x8866,
        "QUERY_RESULT_AVAILABLE_ARB"..0x8867
    )

    void(
        "GenQueriesARB",

        AutoSize("ids")..GLsizei("n"),
        ReturnParam..GLuint.p("ids")
    )

    void(
        "DeleteQueriesARB",

        AutoSize("ids")..GLsizei("n"),
        SingleValue("id")..GLuint.const.p("ids")
    )

    GLboolean(
        "IsQueryARB",

        GLuint("id")
    )

    void(
        "BeginQueryARB",

        GLenum("target"),
        GLuint("id")
    )

    void(
        "EndQueryARB",

        GLenum("target")
    )

    void(
        "GetQueryivARB",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetQueryObjectivARB",

        GLuint("id"),
        GLenum("pname"),
        RawPointer..Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetQueryObjectuivARB",

        GLuint("id"),
        GLenum("pname"),
        RawPointer..Check(1)..ReturnParam..GLuint.p("params")
    )

}