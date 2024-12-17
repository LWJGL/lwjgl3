/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_disjoint_timer_query = "EXTDisjointTimerQuery".nativeClassGLES("EXT_disjoint_timer_query", postfix = EXT) {
    IntConstant(
        "QUERY_COUNTER_BITS_EXT"..0x8864,
        "CURRENT_QUERY_EXT"..0x8865
    )

    IntConstant(
        "QUERY_RESULT_EXT"..0x8866,
        "QUERY_RESULT_AVAILABLE_EXT"..0x8867
    )

    IntConstant(
        "TIME_ELAPSED_EXT"..0x88BF
    )

    IntConstant(
        "TIMESTAMP_EXT"..0x8E28
    )

    IntConstant(
        "GPU_DISJOINT_EXT"..0x8FBB
    )

    reuse(EXT_occlusion_query_boolean, "GenQueriesEXT")
    reuse(EXT_occlusion_query_boolean, "DeleteQueriesEXT")
    reuse(EXT_occlusion_query_boolean, "IsQueryEXT")
    reuse(EXT_occlusion_query_boolean, "BeginQueryEXT")
    reuse(EXT_occlusion_query_boolean, "EndQueryEXT")
    reuse(EXT_occlusion_query_boolean, "GetQueryivEXT")
    reuse(EXT_occlusion_query_boolean, "GetQueryObjectuivEXT")

    void(
        "QueryCounterEXT",

        GLuint("id"),
        GLenum("target")
    )


    IgnoreMissing..void(
        "GetQueryObjectivEXT",

        GLuint("id"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    void(
        "GetQueryObjecti64vEXT",

        GLuint("id"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint64.p("params")
    )

    void(
        "GetQueryObjectui64vEXT",

        GLuint("id"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLuint64.p("params")
    )

    IgnoreMissing..void(
        "GetInteger64vEXT",

        GLenum("pname"),
        ReturnParam..Check(1)..GLint64.p("data")
    )
}