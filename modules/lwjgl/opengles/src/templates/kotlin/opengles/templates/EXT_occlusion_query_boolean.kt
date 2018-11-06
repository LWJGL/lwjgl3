/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_occlusion_query_boolean = "EXTOcclusionQueryBoolean".nativeClassGLES("EXT_occlusion_query_boolean", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines a mechanism whereby an application can query whether any pixels (or, more precisely, samples) are drawn by a primitive or group
        of primitives.

        The primary purpose of such a query (hereafter referred to as an "occlusion query") is to determine the visibility of an object. Typically, the
        application will render the major occluders in the scene, then perform an occlusion query for each detail object in the scene. On subsequent frames,
        the previous results of the occlusion queries can be used to decide whether to draw an object or not.
        """

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQueryEXT, EndQueryEXT, and GetQueryivEXT.",

        "ANY_SAMPLES_PASSED_EXT"..0x8C2F,
        "ANY_SAMPLES_PASSED_CONSERVATIVE_EXT"..0x8D6A
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetQueryivEXT.",

        "CURRENT_QUERY_EXT"..0x8865
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetQueryObjectivEXT and GetQueryObjectuivEXT.",

        "QUERY_RESULT_EXT"..0x8866,
        "QUERY_RESULT_AVAILABLE_EXT"..0x8867
    )

    void(
        "GenQueriesEXT",
        "",

        AutoSize("ids")..GLsizei("n", ""),
        ReturnParam..GLuint.p("ids", "")
    )

    void(
        "DeleteQueriesEXT",
        "",

        AutoSize("ids")..GLsizei("n", ""),
        SingleValue("id")..GLuint.const.p("ids", "")
    )

    GLboolean(
        "IsQueryEXT",
        "",

        GLuint("id", "")
    )

    void(
        "BeginQueryEXT",
        "",

        GLenum("target", ""),
        GLuint("id", "")
    )

    void(
        "EndQueryEXT",
        "",

        GLenum("target", "")
    )

    void(
        "GetQueryivEXT",
        "",

        GLenum("target", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLint.p("params", "")
    )

    void(
        "GetQueryObjectuivEXT",
        "",

        GLuint("id", ""),
        GLenum("pname", ""),
        ReturnParam..Check(1)..GLuint.p("params", "")
    )
}