/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_disjoint_timer_query = "EXTDisjointTimerQuery".nativeClassGLES("EXT_disjoint_timer_query", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Applications can benefit from accurate timing information in a number of different ways. During application development, timing information can help
        identify application or driver bottlenecks. At run time, applications can use timing information to dynamically adjust the amount of detail in a scene
        to achieve constant frame rates. OpenGL implementations have historically provided little to no useful timing information. Applications can get some
        idea of timing by reading timers on the CPU, but these timers are not synchronized with the graphics rendering pipeline. Reading a CPU timer does not
        guarantee the completion of a potentially large amount of graphics work accumulated before the timer is read, and will thus produce wildly inaccurate
        results. glFinish() can be used to determine when previous rendering commands have been completed, but will idle the graphics pipeline and adversely
        affect application performance.

        This extension provides a query mechanism that can be used to determine the amount of time it takes to fully complete a set of GL commands, and without
        stalling the rendering pipeline. It uses the query object mechanisms first introduced in the occlusion query extension, which allow time intervals to
        be polled asynchronously by the application.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetQueryivEXT.",

        "QUERY_COUNTER_BITS_EXT"..0x8864,
        "CURRENT_QUERY_EXT"..0x8865
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetQueryObjectivEXT, GetQueryObjectuivEXT, GetQueryObjecti64vEXT, and GetQueryObjectui64vEXT.",

        "QUERY_RESULT_EXT"..0x8866,
        "QUERY_RESULT_AVAILABLE_EXT"..0x8867
    )

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQueryEXT, EndQueryEXT, and GetQueryivEXT.",

        "TIME_ELAPSED_EXT"..0x88BF
    )

    IntConstant(
        """
        Accepted by the {@code target} parameter of GetQueryiv and QueryCounter. Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv,
        GetInteger64v, GetFloatv, and GetDoublev.
        """,

        "TIMESTAMP_EXT"..0x8E28
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "GPU_DISJOINT_EXT"..0x8FBB
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
        "QueryCounterEXT",
        "",

        GLuint.IN("id", ""),
        GLenum.IN("target", "")
    )

    void(
        "GetQueryivEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint_p.OUT("params", "")
    )

    IgnoreMissing..void(
        "GetQueryObjectivEXT",
        "",

        GLuint.IN("id", ""),
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

    void(
        "GetQueryObjecti64vEXT",
        "",

        GLuint.IN("id", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint64_p.OUT("params", "")
    )

    void(
        "GetQueryObjectui64vEXT",
        "",

        GLuint.IN("id", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLuint64_p.OUT("params", "")
    )
}