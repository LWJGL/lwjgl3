/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val CL10GL = "CL10GL".dependsOn(Module.OPENGL, Module.OPENGLES)?.nativeClassCL("CL10GL") {
    IntConstant(
        "INVALID_GL_OBJECT".."-60",
        "INVALID_MIP_LEVEL".."-62"
    )

    IntConstant(
        "GL_OBJECT_BUFFER"..0x2000,
        "GL_OBJECT_TEXTURE2D"..0x2001,
        "GL_OBJECT_TEXTURE3D"..0x2002,
        "GL_OBJECT_RENDERBUFFER"..0x2003
    )

    IntConstant(
        "GL_TEXTURE_TARGET"..0x2004,
        "GL_MIPMAP_LEVEL"..0x2005
    )

    cl_mem(
        "CreateFromGLBuffer",

        cl_context("context"),
        cl_mem_flags("flags"),
        GLuint("bufobj"),
        ERROR_RET
    )

    DeprecatedCL("1.1")..cl_mem(
        "CreateFromGLTexture2D",

        cl_context("context"),
        cl_mem_flags("flags"),
        GLenum("texture_target"),
        GLint("miplevel"),
        GLuint("texture"),
        ERROR_RET
    )

    DeprecatedCL("1.1")..cl_mem(
        "CreateFromGLTexture3D",

        cl_context("context"),
        cl_mem_flags("flags"),
        GLenum("texture_target"),
        GLint("miplevel"),
        GLuint("texture"),
        ERROR_RET
    )

    cl_mem(
        "CreateFromGLRenderbuffer",

        cl_context("context"),
        cl_mem_flags("flags"),
        GLuint("renderbuffer"),
        ERROR_RET
    )

    cl_int(
        "GetGLObjectInfo",

        cl_mem("memobj"),
        Check(1)..nullable..cl_gl_object_type.p("gl_object_type"),
        Check(1)..nullable..GLuint.p("gl_object_name")
    )

    cl_int(
        "GetGLTextureInfo",

        cl_mem("memobj"),
        cl_gl_texture_info("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "EnqueueAcquireGLObjects",

        cl_command_queue("command_queue"),
        AutoSize("mem_objects")..cl_uint("num_objects"),
        SingleValue("mem_object")..cl_mem.const.p("mem_objects"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueReleaseGLObjects",

        cl_command_queue("command_queue"),
        AutoSize("mem_objects")..cl_uint("num_objects"),
        SingleValue("mem_object")..cl_mem.const.p("mem_objects"),
        NEWL,
        EWL,
        EVENT
    )
}