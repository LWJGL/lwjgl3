/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_parallel_shader_compile = "ARBParallelShaderCompile".nativeClassGL("ARB_parallel_shader_compile", postfix = ARB) {
    IntConstant(
        "MAX_SHADER_COMPILER_THREADS_ARB"..0x91B0
    )

    IntConstant(
        "COMPLETION_STATUS_ARB"..0x91B1
    )

    void(
        "MaxShaderCompilerThreadsARB",

        GLuint("count")
    )
}