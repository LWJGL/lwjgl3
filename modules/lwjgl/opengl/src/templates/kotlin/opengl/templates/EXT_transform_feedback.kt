/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_transform_feedback = "EXTTransformFeedback".nativeClassGL("EXT_transform_feedback", postfix = EXT) {
    IntConstant(
        "TRANSFORM_FEEDBACK_BUFFER_EXT"..0x8C8E
    )

    IntConstant(
        "TRANSFORM_FEEDBACK_BUFFER_START_EXT"..0x8C84,
        "TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT"..0x8C85
    )

    IntConstant(
        "TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT"..0x8C8F
    )

    IntConstant(
        "INTERLEAVED_ATTRIBS_EXT"..0x8C8C,
        "SEPARATE_ATTRIBS_EXT"..0x8C8D
    )

    IntConstant(
        "PRIMITIVES_GENERATED_EXT"..0x8C87,
        "TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT"..0x8C88
    )

    IntConstant(
        "RASTERIZER_DISCARD_EXT"..0x8C89
    )

    IntConstant(
        "MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT"..0x8C8A,
        "MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT"..0x8C8B,
        "MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT"..0x8C80
    )

    IntConstant(
        "TRANSFORM_FEEDBACK_VARYINGS_EXT"..0x8C83,
        "TRANSFORM_FEEDBACK_BUFFER_MODE_EXT"..0x8C7F,
        "TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT"..0x8C76
    )

    void(
        "BindBufferRangeEXT",

        GLenum("target"),
        GLuint("index"),
        GLuint("buffer"),
        GLintptr("offset"),
        GLsizeiptr("size")
    )

    void(
        "BindBufferOffsetEXT",

        GLenum("target"),
        GLuint("index"),
        GLuint("buffer"),
        GLintptr("offset")
    )

    void(
        "BindBufferBaseEXT",

        GLenum("target"),
        GLuint("index"),
        GLuint("buffer")
    )

    void(
        "BeginTransformFeedbackEXT",

        GLenum("primitiveMode")
    )

    void("EndTransformFeedbackEXT")

    void(
        "TransformFeedbackVaryingsEXT",

        GLuint("program"),
        AutoSize("varyings")..GLsizei("count"),
        PointerArray(GLcharASCII.p, "varying")..GLcharASCII.const.p.const.p("varyings"),
        GLenum("bufferMode")
    )

    void(
        "GetTransformFeedbackVaryingEXT",

        GLuint("program"),
        GLuint("index"),
        AutoSize("name")..GLsizei("bufSize"),
        Check(1)..nullable..GLsizei.p("length"),
        Check(1)..GLsizei.p("size"),
        Check(1)..GLenum.p("type"),
        Return("length", """GL.getCapabilities().OpenGL20
            ? GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT)
            : ARBShaderObjects.glGetObjectParameteriARB(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT)""")..GLcharASCII.p("name")
    )

    reuse(EXT_draw_buffers2, "GetIntegerIndexedvEXT")
    reuse(EXT_draw_buffers2, "GetBooleanIndexedvEXT")
}