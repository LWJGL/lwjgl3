/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL44C = "GL44C".nativeClassGL("GL44C") {
    extends = GL43C

    IntConstant(
        "MAX_VERTEX_ATTRIB_STRIDE"..0x82E5
    )

    IntConstant(
        "PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED"..0x8221
    )

    IntConstant(
        "TEXTURE_BUFFER_BINDING"..0x8C2A
    )

    // ARB_buffer_storage

    IntConstant(
        "MAP_PERSISTENT_BIT"..0x0040,
        "MAP_COHERENT_BIT"..0x0080,
        "DYNAMIC_STORAGE_BIT"..0x0100,
        "CLIENT_STORAGE_BIT"..0x0200
    )

    IntConstant(
        "BUFFER_IMMUTABLE_STORAGE"..0x821F,
        "BUFFER_STORAGE_FLAGS"..0x8220
    )

    IntConstant(
        "CLIENT_MAPPED_BUFFER_BARRIER_BIT"..0x00004000
    )

    void(
        "BufferStorage",

        GLenum("target"),
        AutoSize("data")..GLsizeiptr("size"),
        optional..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.const.p("data"),
        GLbitfield("flags")
    )

    // ARB_clear_texture

    IntConstant(
        "CLEAR_TEXTURE"..0x9365
    )

    void(
        "ClearTexSubImage",

        GLuint("texture"),
        GLint("level"),
        GLint("xoffset"),
        GLint("yoffset"),
        GLint("zoffset"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..nullable..void.const.p("data")
    )

    void(
        "ClearTexImage",

        GLuint("texture"),
        GLint("level"),
        GLenum("format"),
        GLenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..nullable..void.const.p("data")
    )

    // ARB_enhanced_layouts

    IntConstant(
        "LOCATION_COMPONENT"..0x934A,
        "TRANSFORM_FEEDBACK_BUFFER_INDEX"..0x934B,
        "TRANSFORM_FEEDBACK_BUFFER_STRIDE"..0x934C
    )

    // ARB_multi_bind

    void(
        "BindBuffersBase",

        GLenum("target"),
        GLuint("first"),
        AutoSize("buffers")..GLsizei("count"),
        nullable..GLuint.const.p("buffers")
    )

    void(
        "BindBuffersRange",

        GLenum("target"),
        GLuint("first"),
        AutoSize("buffers", "offsets", "sizes")..GLsizei("count"),
        nullable..GLuint.const.p("buffers"),
        nullable..GLintptr.const.p("offsets"),
        nullable..GLsizeiptr.const.p("sizes")
    )

    void(
        "BindTextures",

        GLuint("first"),
        AutoSize("textures")..GLsizei("count"),
        nullable..GLuint.const.p("textures")
    )

    void(
        "BindSamplers",

        GLuint("first"),
        AutoSize("samplers")..GLsizei("count"),
        nullable..GLuint.const.p("samplers")
    )

    void(
        "BindImageTextures",

        GLuint("first"),
        AutoSize("textures")..GLsizei("count"),
        nullable..GLuint.const.p("textures")
    )

    void(
        "BindVertexBuffers",

        GLuint("first"),
        AutoSize("buffers", "offsets", "strides")..GLsizei("count"),
        nullable..GLuint.const.p("buffers"),
        nullable..GLintptr.const.p("offsets"),
        nullable..GLsizei.const.p("strides")
    )

    // ARB_query_buffer_object

    IntConstant(
        "QUERY_RESULT_NO_WAIT"..0x9194
    )

    IntConstant(
        "QUERY_BUFFER"..0x9192
    )

    IntConstant(
        "QUERY_BUFFER_BINDING"..0x9193
    )

    IntConstant(
        "QUERY_BUFFER_BARRIER_BIT"..0x00008000
    )

    // ARB_texture_mirror_clamp_to_edge

    IntConstant(
        "MIRROR_CLAMP_TO_EDGE"..0x8743
    )
}