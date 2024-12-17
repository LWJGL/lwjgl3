/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

val GL32C = "GL32C".nativeClassGL("GL32C") {
    extends = GL31C

    IntConstant(
        "CONTEXT_PROFILE_MASK"..0x9126
    )

    IntConstant(
        "CONTEXT_CORE_PROFILE_BIT"..0x00000001,
        "CONTEXT_COMPATIBILITY_PROFILE_BIT"..0x00000002
    )

    IntConstant(
        "MAX_VERTEX_OUTPUT_COMPONENTS"..0x9122,
        "MAX_GEOMETRY_INPUT_COMPONENTS"..0x9123,
        "MAX_GEOMETRY_OUTPUT_COMPONENTS"..0x9124,
        "MAX_FRAGMENT_INPUT_COMPONENTS"..0x9125
    )

    void(
        "GetBufferParameteri64v",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint64.p("params")
    )

    // ARB_draw_elements_base_vertex

    void(
        "DrawElementsBaseVertex",

        GLenum("mode"),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLint("basevertex")
    )

    void(
        "DrawRangeElementsBaseVertex",

        GLenum("mode"),
        GLuint("start"),
        GLuint("end"),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLint("basevertex")
    )

    void(
        "DrawElementsInstancedBaseVertex",

        GLenum("mode"),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei("count"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum("type"),
        RawPointer..void.const.p("indices"),
        GLsizei("primcount"),
        GLint("basevertex")
    )

    void(
        "MultiDrawElementsBaseVertex",

        GLenum("mode"),
        GLsizei.const.p("count"),
        GLenum("type"),
        void.const.p.const.p("indices"),
        AutoSize("count", "indices", "basevertex")..GLsizei("drawcount"),
        GLint.p("basevertex")
    )

    // ARB_provoking_vertex

    IntConstant(
        "FIRST_VERTEX_CONVENTION"..0x8E4D,
        "LAST_VERTEX_CONVENTION"..0x8E4E
    )

    IntConstant(
        "PROVOKING_VERTEX"..0x8E4F,
        "QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION"..0x8E4C
    )

    void(
        "ProvokingVertex",

        GLenum("mode")
    )

    // ARB_seamless_cube_map

    IntConstant(
        "TEXTURE_CUBE_MAP_SEAMLESS"..0x884F
    )

    // ARB_texture_multisample

    IntConstant(
        "SAMPLE_POSITION"..0x8E50
    )

    IntConstant(
        "SAMPLE_MASK"..0x8E51
    )

    IntConstant(
        "SAMPLE_MASK_VALUE"..0x8E52
    )

    IntConstant(
        "TEXTURE_2D_MULTISAMPLE"..0x9100
    )

    IntConstant(
        "PROXY_TEXTURE_2D_MULTISAMPLE"..0x9101
    )

    IntConstant(
        "TEXTURE_2D_MULTISAMPLE_ARRAY"..0x9102
    )

    IntConstant(
        "PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY"..0x9103
    )

    IntConstant(
        "MAX_SAMPLE_MASK_WORDS"..0x8E59,
        "MAX_COLOR_TEXTURE_SAMPLES"..0x910E,
        "MAX_DEPTH_TEXTURE_SAMPLES"..0x910F,
        "MAX_INTEGER_SAMPLES"..0x9110,
        "TEXTURE_BINDING_2D_MULTISAMPLE"..0x9104,
        "TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY"..0x9105
    )

    IntConstant(
        "TEXTURE_SAMPLES"..0x9106,
        "TEXTURE_FIXED_SAMPLE_LOCATIONS"..0x9107
    )

    IntConstant(
        "SAMPLER_2D_MULTISAMPLE"..0x9108,
        "INT_SAMPLER_2D_MULTISAMPLE"..0x9109,
        "UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE"..0x910A,
        "SAMPLER_2D_MULTISAMPLE_ARRAY"..0x910B,
        "INT_SAMPLER_2D_MULTISAMPLE_ARRAY"..0x910C,
        "UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY"..0x910D
    )

    void(
        "TexImage2DMultisample",

        GLenum("target"),
        GLsizei("samples"),
        GLint("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLboolean("fixedsamplelocations")
    )

    void(
        "TexImage3DMultisample",

        GLenum("target"),
        GLsizei("samples"),
        GLint("internalformat"),
        GLsizei("width"),
        GLsizei("height"),
        GLsizei("depth"),
        GLboolean("fixedsamplelocations")
    )

    void(
        "GetMultisamplefv",

        GLenum("pname"),
        GLuint("index"),
        Check(1)..ReturnParam..GLfloat.p("val")
    )

    void(
        "SampleMaski",

        GLuint("index"),
        GLbitfield("mask")
    )

    // ARB_depth_clamp

    IntConstant(
        "DEPTH_CLAMP"..0x864F
    )

    // ARB_geometry_shader4

    IntConstant(
        "GEOMETRY_SHADER"..0x8DD9
    )

    IntConstant(
        "GEOMETRY_VERTICES_OUT"..0x8DDA,
        "GEOMETRY_INPUT_TYPE"..0x8DDB,
        "GEOMETRY_OUTPUT_TYPE"..0x8DDC
    )

    IntConstant(
        "MAX_GEOMETRY_TEXTURE_IMAGE_UNITS"..0x8C29,
        "MAX_GEOMETRY_UNIFORM_COMPONENTS"..0x8DDF,
        "MAX_GEOMETRY_OUTPUT_VERTICES"..0x8DE0,
        "MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS"..0x8DE1
    )

    IntConstant(
        "LINES_ADJACENCY"..0xA,
        "LINE_STRIP_ADJACENCY"..0xB,
        "TRIANGLES_ADJACENCY"..0xC,
        "TRIANGLE_STRIP_ADJACENCY"..0xD
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS"..0x8DA8
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_LAYERED"..0x8DA7
    )

    IntConstant(
        "PROGRAM_POINT_SIZE"..0x8642
    )

    void(
        "FramebufferTexture",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level")
    )

    // ARB_sync

    IntConstant(
        "MAX_SERVER_WAIT_TIMEOUT"..0x9111
    )

    IntConstant(
        "OBJECT_TYPE"..0x9112,
        "SYNC_CONDITION"..0x9113,
        "SYNC_STATUS"..0x9114,
        "SYNC_FLAGS"..0x9115
    )

    IntConstant(
        "SYNC_FENCE"..0x9116
    )

    IntConstant(
        "SYNC_GPU_COMMANDS_COMPLETE"..0x9117
    )

    IntConstant(
        "UNSIGNALED"..0x9118,
        "SIGNALED"..0x9119
    )

    IntConstant(
        "SYNC_FLUSH_COMMANDS_BIT"..0x00000001
    )

    LongConstant(
        "TIMEOUT_IGNORED".."0xFFFFFFFFFFFFFFFFL" // TODO: https://youtrack.jetbrains.com/issue/KT-2780
    )

    IntConstant(
        "ALREADY_SIGNALED"..0x911A,
        "TIMEOUT_EXPIRED"..0x911B,
        "CONDITION_SATISFIED"..0x911C,
        "WAIT_FAILED"..0x911D
    )

    GLsync(
        "FenceSync",

        GLenum("condition"),
        GLbitfield("flags")
    )

    GLboolean(
        "IsSync",

        GLsync("sync")
    )

    void(
        "DeleteSync",

        GLsync("sync")
    )

    GLenum(
        "ClientWaitSync",

        GLsync("sync"),
        GLbitfield("flags"),
        GLuint64("timeout")
    )

    void(
        "WaitSync",

        GLsync("sync"),
        GLbitfield("flags"),
        GLuint64("timeout")
    )

    void(
        "GetInteger64v",

        GLenum("pname"),
        Check(1)..ReturnParam..GLint64.p("params")
    )

    void(
        "GetInteger64i_v",

        GLenum("pname"),
        GLuint("index"),
        Check(1)..ReturnParam..GLint64.p("params")
    )

    void(
        "GetSynciv",

        GLsync("sync"),
        GLenum("pname"),
        AutoSize("values")..GLsizei("bufSize"),
        Check(1)..nullable..GLsizei.p("length"),
        ReturnParam..GLint.p("values")
    )
}