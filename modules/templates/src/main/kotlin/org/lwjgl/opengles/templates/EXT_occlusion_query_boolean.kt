/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

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

        AutoSize("ids")..GLsizei.IN("n", ""),
        ReturnParam..GLuint_p.OUT("ids", "")
    )

    void(
        "DeleteQueriesEXT",
        "",

        AutoSize("ids")..GLsizei.IN("n", ""),
        SingleValue("id")..const..GLuint_p.IN("ids", "")
    )

    GLboolean(
        "IsQueryEXT",
        "",

        GLuint.IN("id", "")
    )

    void(
        "BeginQueryEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("id", "")
    )

    void(
        "EndQueryEXT",
        "",

        GLenum.IN("target", "")
    )

    void(
        "GetQueryivEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    void(
        "GetQueryObjectuivEXT",
        "",

        GLuint.IN("id", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLuint_p.OUT("params", "")
    )
}