/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_parallel_shader_compile = "ARBParallelShaderCompile".nativeClassGL("ARB_parallel_shader_compile", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Compiling GLSL into implementation-specific code can be a time consuming process, so a GL implementation may wish to perform the compilation in a
        separate CPU thread. This extension provides a mechanism for the application to provide a hint to limit the number of threads it wants to be used to
        compile shaders, as well as a query to determine if the compilation process is complete.

        Requires ${GL30.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "MAX_SHADER_COMPILER_THREADS_ARB"..0x91B0
    )

    IntConstant(
        "Accepted as part of the {@code pname} parameter to GetShaderiv() and accepted as part of the {@code pname} parameter to GetProgramiv().",

        "COMPLETION_STATUS_ARB"..0x91B1
    )

    void(
        "MaxShaderCompilerThreadsARB",
        """
        Application may use the following to hint to the driver the maximum number background threads it would like to be used in the process of compiling
        shaders or linking programs.

        An implementation may combine the maximum compiler thread request from multiple contexts in a share group in an implementation-specific way.

        An application can query the current MaxShaderCompilerThreads() {@code count} by calling #GetIntegerv() with {@code pname} set to
        #MAX_SHADER_COMPILER_THREADS_ARB.
        """,

        GLuint.IN(
            "count",
            """
            the number of background threads. A {@code count} of zero specifies a request for no parallel compiling or linking and a {@code count} of
            {@code 0xFFFFFFFF} requests an implementation-specific maximum.
            """
        )
    )
}