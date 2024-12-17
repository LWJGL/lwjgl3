/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_vertex_buffer_object = "ARBVertexBufferObject".nativeClassGL("ARB_vertex_buffer_object", postfix = ARB) {
    IntConstant(
        "ARRAY_BUFFER_ARB"..0x8892,
        "ELEMENT_ARRAY_BUFFER_ARB"..0x8893
    )

    IntConstant(
        "ARRAY_BUFFER_BINDING_ARB"..0x8894,
        "ELEMENT_ARRAY_BUFFER_BINDING_ARB"..0x8895,
        "VERTEX_ARRAY_BUFFER_BINDING_ARB"..0x8896,
        "NORMAL_ARRAY_BUFFER_BINDING_ARB"..0x8897,
        "COLOR_ARRAY_BUFFER_BINDING_ARB"..0x8898,
        "INDEX_ARRAY_BUFFER_BINDING_ARB"..0x8899,
        "TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB"..0x889A,
        "EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB"..0x889B,
        "SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB"..0x889C,
        "FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB"..0x889D,
        "WEIGHT_ARRAY_BUFFER_BINDING_ARB"..0x889E
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB"..0x889F
    )

    IntConstant(
        "STREAM_DRAW_ARB"..0x88E0,
        "STREAM_READ_ARB"..0x88E1,
        "STREAM_COPY_ARB"..0x88E2,
        "STATIC_DRAW_ARB"..0x88E4,
        "STATIC_READ_ARB"..0x88E5,
        "STATIC_COPY_ARB"..0x88E6,
        "DYNAMIC_DRAW_ARB"..0x88E8,
        "DYNAMIC_READ_ARB"..0x88E9,
        "DYNAMIC_COPY_ARB"..0x88EA
    )

    IntConstant(
        "READ_ONLY_ARB"..0x88B8,
        "WRITE_ONLY_ARB"..0x88B9,
        "READ_WRITE_ARB"..0x88BA
    )

    IntConstant(
        "BUFFER_SIZE_ARB"..0x8764,
        "BUFFER_USAGE_ARB"..0x8765,
        "BUFFER_ACCESS_ARB"..0x88BB,
        "BUFFER_MAPPED_ARB"..0x88BC
    )

    IntConstant(
        "BUFFER_MAP_POINTER_ARB"..0x88BD
    )

    void(
        "BindBufferARB",

        GLenum("target"),
        GLuint("buffer")
    )

    void(
        "DeleteBuffersARB",

        AutoSize("buffers")..GLsizei("n"),
        SingleValue("buffer")..GLuint.const.p("buffers")
    )

    void(
        "GenBuffersARB",

        AutoSize("buffers")..GLsizei("n"),
        ReturnParam..GLuint.p("buffers")
    )

    GLboolean(
        "IsBufferARB",

        GLuint("buffer")
    )

    void(
        "BufferDataARB",

        GLenum("target"),
        AutoSize("data")..GLsizeiptrARB("size"),
        optional..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.const.p("data"),
        GLenum("usage")
    )

    void(
        "BufferSubDataARB",

        GLenum("target"),
        GLintptrARB("offset"),
        AutoSize("data")..GLsizeiptrARB("size"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.const.p("data")
    )

    void(
        "GetBufferSubDataARB",

        GLenum("target"),
        GLintptrARB("offset"),
        AutoSize("data")..GLsizeiptrARB("size"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.p("data")
    )

    MapPointer("glGetBufferParameteriARB(target, GL_BUFFER_SIZE_ARB)", oldBufferOverloads = true)..void.p(
        "MapBufferARB",

        GLenum("target"),
        GLenum("access")
    )

    GLboolean(
        "UnmapBufferARB",

        GLenum("target")
    )

    void(
        "GetBufferParameterivARB",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetBufferPointervARB",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..void.p.p("params")
    )
}