/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_query_resource = "NVQueryResource".nativeClassGL("NV_query_resource", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        OpenGL implementations manage the residence of textures, shaders, and other graphical objects in GPU accessible memory (whether in on-board video
        memory or addressable system memory is implementation dependent). With more insight into OpenGL's memory usage 1) applications could make educated
        decisions on better utilizing the limited GPU resources, 2) users could better optimize their workflow when working with multiple tools, and 3)
        administrators can make better decisions regarding resource allocation and system configurations.

        The purpose of this extension is to return a more detailed breakdown of memory usage in terms of the OpenGL objects residing in memory (textures,
        render buffers, buffer objects, system reserved objects, ...). This extension differs from GL_NVX_gpu_memory_info in that this extension returns
        detailed memory usage at the object level for video memory while the other extension only reports total vidmem usage.

        For the purposes of this specification the term vidmem refers to video memory resident on the graphics card that is directly accessible to the GPU at
        the highest performance level.

        Requires ${GL20.core}.
        """

    IntConstant(
        "Accepted by the {@code queryType} parameter of #QueryResourceNV().",

        "QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV"..0x9540
    )

    IntConstant(
        "New enums defined.",

        "QUERY_RESOURCE_MEMTYPE_VIDMEM_NV"..0x9542,
        "QUERY_RESOURCE_SYS_RESERVED_NV"..0x9544,
        "QUERY_RESOURCE_TEXTURE_NV"..0x9545,
        "QUERY_RESOURCE_RENDERBUFFER_NV"..0x9546,
        "QUERY_RESOURCE_BUFFEROBJECT_NV"..0x9547
    )

    GLint(
        "QueryResourceNV",
        "",

        GLenum("queryType", "", "#QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV"),
        GLint("pname", ""),
        AutoSize("buffer")..GLuint("bufSize", ""),
        GLint.p("buffer", "")
    )
}