/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_query_resource = "NVQueryResource".nativeClassGL("NV_query_resource", postfix = NV) {
    IntConstant(
        "QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV"..0x9540
    )

    IntConstant(
        "QUERY_RESOURCE_MEMTYPE_VIDMEM_NV"..0x9542,
        "QUERY_RESOURCE_SYS_RESERVED_NV"..0x9544,
        "QUERY_RESOURCE_TEXTURE_NV"..0x9545,
        "QUERY_RESOURCE_RENDERBUFFER_NV"..0x9546,
        "QUERY_RESOURCE_BUFFEROBJECT_NV"..0x9547
    )

    GLint(
        "QueryResourceNV",

        GLenum("queryType"),
        GLint("pname"),
        AutoSize("buffer")..GLuint("bufSize"),
        GLint.p("buffer")
    )
}