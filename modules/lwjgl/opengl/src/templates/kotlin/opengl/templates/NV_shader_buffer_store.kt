/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_shader_buffer_store = "NVShaderBufferStore".nativeClassGL("NV_shader_buffer_store", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension builds upon the mechanisms added by the NV_shader_buffer_load extension to allow shaders to perform random-access
        reads to buffer object memory without using dedicated buffer object binding points.  Instead, it allowed an application to make a buffer
        object resident, query a GPU address (pointer) for the buffer object, and then use that address as a pointer in shader code.  This approach allows
        shaders to access a large number of buffer objects without needing to repeatedly bind buffers to a limited number of fixed-functionality binding
        points.

        Requires ${GL30.core}, GLSL 1.30, ${NV_shader_buffer_load.link}, ${registryLinkTo("NV", "gpu_program5")} and/or ${NV_gpu_shader5.link}.
        """

    IntConstant(
        "Accepted by the {@code barriers} parameter of MemoryBarrierNV.",

        "SHADER_GLOBAL_ACCESS_BARRIER_BIT_NV"..0x00000010
    )
}