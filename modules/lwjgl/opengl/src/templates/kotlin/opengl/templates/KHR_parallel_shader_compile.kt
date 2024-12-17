/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val KHR_parallel_shader_compile = "KHRParallelShaderCompile".nativeClassGL("KHR_parallel_shader_compile", postfix = KHR) {
    IntConstant(
        "MAX_SHADER_COMPILER_THREADS_KHR"..0x91B0
    )

    IntConstant(
        "COMPLETION_STATUS_KHR"..0x91B1
    )

    void(
        "MaxShaderCompilerThreadsKHR",

        GLuint("count")
    )
}