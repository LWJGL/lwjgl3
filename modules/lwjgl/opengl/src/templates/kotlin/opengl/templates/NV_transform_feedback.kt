/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_transform_feedback = "NVTransformFeedback".nativeClassGL("NV_transform_feedback", postfix = NV) {
    IntConstant(
        "TRANSFORM_FEEDBACK_BUFFER_NV"..0x8C8E
    )

    IntConstant(
        "TRANSFORM_FEEDBACK_BUFFER_START_NV"..0x8C84,
        "TRANSFORM_FEEDBACK_BUFFER_SIZE_NV"..0x8C85,
        "TRANSFORM_FEEDBACK_RECORD_NV"..0x8C86
    )

    IntConstant(
        "TRANSFORM_FEEDBACK_BUFFER_BINDING_NV"..0x8C8F
    )

    IntConstant(
        "INTERLEAVED_ATTRIBS_NV"..0x8C8C,
        "SEPARATE_ATTRIBS_NV"..0x8C8D
    )

    IntConstant(
        "PRIMITIVES_GENERATED_NV"..0x8C87,
        "TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV"..0x8C88
    )

    IntConstant(
        "RASTERIZER_DISCARD_NV"..0x8C89
    )

    IntConstant(
        "MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_NV"..0x8C8A,
        "MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV"..0x8C8B,
        "MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV"..0x8C80,
        "TRANSFORM_FEEDBACK_ATTRIBS_NV"..0x8C7E
    )

    IntConstant(
        "ACTIVE_VARYINGS_NV"..0x8C81,
        "ACTIVE_VARYING_MAX_LENGTH_NV"..0x8C82,
        "TRANSFORM_FEEDBACK_VARYINGS_NV"..0x8C83
    )

    IntConstant(
        "TRANSFORM_FEEDBACK_BUFFER_MODE_NV"..0x8C7F
    )

    IntConstant(
        "BACK_PRIMARY_COLOR_NV"..0x8C77,
        "BACK_SECONDARY_COLOR_NV"..0x8C78,
        "TEXTURE_COORD_NV"..0x8C79,
        "CLIP_DISTANCE_NV"..0x8C7A,
        "VERTEX_ID_NV"..0x8C7B,
        "PRIMITIVE_ID_NV"..0x8C7C,
        "GENERIC_ATTRIB_NV"..0x8C7D,
        "SECONDARY_COLOR_NV"..0x852D,
        "LAYER_NV"..0x8DAA
    )

    void(
        "BeginTransformFeedbackNV",

        GLenum("primitiveMode")
    )

    void("EndTransformFeedbackNV")

    void(
        "TransformFeedbackAttribsNV",

        AutoSize("attribs")..GLsizei("count"),
        GLint.const.p("attribs"),
        GLenum("bufferMode")
    )

    void(
        "BindBufferRangeNV",

        GLenum("target"),
        GLuint("index"),
        GLuint("buffer"),
        GLintptr("offset"),
        GLsizeiptr("size")
    )

    void(
        "BindBufferOffsetNV",

        GLenum("target"),
        GLuint("index"),
        GLuint("buffer"),
        GLintptr("offset")
    )

    void(
        "BindBufferBaseNV",

        GLenum("target"),
        GLuint("index"),
        GLuint("buffer")
    )

    void(
        "TransformFeedbackVaryingsNV",

        GLuint("program"),
        AutoSize("locations")..GLsizei("count"),
        GLint.const.p("locations"),
        GLenum("bufferMode")
    )

    void(
        "ActiveVaryingNV",

        GLuint("program"),
        GLcharASCII.const.p("name")
    )

    GLint(
        "GetVaryingLocationNV",

        GLuint("program"),
        GLcharASCII.const.p("name")
    )

    void(
        "GetActiveVaryingNV",

        GLuint("program"),
        GLuint("index"),
        AutoSize("name")..GLsizei("bufSize"),
        nullable..Check(1)..GLsizei.p("length"),
        Check(1)..GLsizei.p("size"),
        Check(1)..GLenum.p("type"),
        GLcharASCII.p("name")
    )

    void(
        "GetTransformFeedbackVaryingNV",

        GLuint("program"),
        GLuint("index"),
        ReturnParam..Check(1)..GLint.p("location")
    )

    void(
        "TransformFeedbackStreamAttribsNV",

        AutoSize("attribs")..GLsizei("count"),
        GLint.const.p("attribs"),
        AutoSize("bufstreams")..GLsizei("nbuffers"),
        GLint.const.p("bufstreams"),
        GLenum("bufferMode")
    )
}