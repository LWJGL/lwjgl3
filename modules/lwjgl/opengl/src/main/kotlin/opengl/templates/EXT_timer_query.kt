/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_timer_query = "EXTTimerQuery".nativeClassGL("EXT_timer_query", postfix = EXT) {
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

        Requires ${GL15.core}.
        """

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.",

        "TIME_ELAPSED_EXT"..0x88BF
    )

    void(
        "GetQueryObjecti64vEXT",
        "",

        GLuint.IN("id", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint64.p.OUT("params", "")
    )

    void(
        "GetQueryObjectui64vEXT",
        "",

        GLuint.IN("id", ""),
        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLuint64.p.OUT("params", "")
    )
}