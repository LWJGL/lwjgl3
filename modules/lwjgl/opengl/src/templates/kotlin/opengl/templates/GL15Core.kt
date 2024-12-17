/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL15C = "GL15C".nativeClassGL("GL15C") {
    extends = GL14C

    IntConstant(
        "SRC1_ALPHA"..0x8589
    )

    // ARB_vertex_buffer_object

    IntConstant(
        "ARRAY_BUFFER"..0x8892,
        "ELEMENT_ARRAY_BUFFER"..0x8893
    )

    IntConstant(
        "ARRAY_BUFFER_BINDING"..0x8894,
        "ELEMENT_ARRAY_BUFFER_BINDING"..0x8895
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_BUFFER_BINDING"..0x889F
    )

    IntConstant(
        "STREAM_DRAW"..0x88E0,
        "STREAM_READ"..0x88E1,
        "STREAM_COPY"..0x88E2,
        "STATIC_DRAW"..0x88E4,
        "STATIC_READ"..0x88E5,
        "STATIC_COPY"..0x88E6,
        "DYNAMIC_DRAW"..0x88E8,
        "DYNAMIC_READ"..0x88E9,
        "DYNAMIC_COPY"..0x88EA
    )

    IntConstant(
        "READ_ONLY"..0x88B8,
        "WRITE_ONLY"..0x88B9,
        "READ_WRITE"..0x88BA
    )

    IntConstant(
        "BUFFER_SIZE"..0x8764,
        "BUFFER_USAGE"..0x8765,
        "BUFFER_ACCESS"..0x88BB,
        "BUFFER_MAPPED"..0x88BC
    )

    IntConstant(
        "BUFFER_MAP_POINTER"..0x88BD
    )

    void(
        "BindBuffer",

        GLenum("target"),
        GLuint("buffer")
    )

    void(
        "DeleteBuffers",

        AutoSize("buffers")..GLsizei("n"),
        SingleValue("buffer")..GLuint.const.p("buffers")
    )

    void(
        "GenBuffers",

        AutoSize("buffers")..GLsizei("n"),
        ReturnParam..GLuint.p("buffers")
    )

    GLboolean(
        "IsBuffer",

        GLuint("buffer")
    )

    void(
        "BufferData",

        GLenum("target"),
        AutoSize("data")..GLsizeiptr("size"),
        optional..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.const.p("data"),
        GLenum("usage")
    )

    void(
        "BufferSubData",

        GLenum("target"),
        GLintptr("offset"),
        AutoSize("data")..GLsizeiptr("size"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.const.p("data")
    )

    void(
        "GetBufferSubData",

        GLenum("target"),
        GLintptr("offset"),
        AutoSize("data")..GLsizeiptr("size"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.p("data")
    )

    MapPointer("glGetBufferParameteri(target, GL_BUFFER_SIZE)", oldBufferOverloads = true)..void.p(
        "MapBuffer",

        GLenum("target"),
        GLenum("access")
    )

    GLboolean(
        "UnmapBuffer",

        GLenum("target")
    )

    void(
        "GetBufferParameteriv",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetBufferPointerv",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..void.p.p("params")
    )

    // ARB_occlusion_query

    IntConstant(
        "SAMPLES_PASSED"..0x8914
    )

    IntConstant(
        "QUERY_COUNTER_BITS"..0x8864,
        "CURRENT_QUERY"..0x8865
    )

    IntConstant(
        "QUERY_RESULT"..0x8866,
        "QUERY_RESULT_AVAILABLE"..0x8867
    )

    void(
        "GenQueries",

        AutoSize("ids")..GLsizei("n"),
        ReturnParam..GLuint.p("ids")
    )

    void(
        "DeleteQueries",

        AutoSize("ids")..GLsizei("n"),
        SingleValue("id")..GLuint.const.p("ids")
    )

    GLboolean(
        "IsQuery",

        GLuint("id")
    )

    void(
        "BeginQuery",

        GLenum("target"),
        GLuint("id")
    )

    void(
        "EndQuery",

        GLenum("target")
    )

    void(
        "GetQueryiv",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetQueryObjectiv",

        GLuint("id"),
        GLenum("pname"),
        RawPointer..Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetQueryObjectuiv",

        GLuint("id"),
        GLenum("pname"),
        RawPointer..Check(1)..ReturnParam..GLuint.p("params")
    )
}