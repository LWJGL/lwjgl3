/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val CL12GL = "CL12GL".dependsOn(Module.OPENGL, Module.OPENGLES)?.nativeClassCL("CL12GL") {
    extends = CL10GL
    IntConstant(
        "GL_OBJECT_TEXTURE_2D_ARRAY"..0x200E,
        "GL_OBJECT_TEXTURE1D"..0x200F,
        "GL_OBJECT_TEXTURE1D_ARRAY"..0x2010,
        "GL_OBJECT_TEXTURE_BUFFER"..0x2011
    )

    cl_mem(
        "CreateFromGLTexture",

        cl_context("context"),
        cl_mem_flags("flags"),
        GLenum("texture_target"),
        GLint("miplevel"),
        GLuint("texture"),
        ERROR_RET
    )
}