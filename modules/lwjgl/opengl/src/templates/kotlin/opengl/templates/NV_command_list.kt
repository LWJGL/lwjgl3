/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_command_list = "NVCommandList".nativeClassGL("NV_command_list", postfix = NV) {
    IntConstant(
        "TERMINATE_SEQUENCE_COMMAND_NV"..0x0000,
        "NOP_COMMAND_NV"..0x0001,
        "DRAW_ELEMENTS_COMMAND_NV"..0x0002,
        "DRAW_ARRAYS_COMMAND_NV"..0x0003,
        "DRAW_ELEMENTS_STRIP_COMMAND_NV"..0x0004,
        "DRAW_ARRAYS_STRIP_COMMAND_NV"..0x0005,
        "DRAW_ELEMENTS_INSTANCED_COMMAND_NV"..0x0006,
        "DRAW_ARRAYS_INSTANCED_COMMAND_NV"..0x0007,
        "ELEMENT_ADDRESS_COMMAND_NV"..0x0008,
        "ATTRIBUTE_ADDRESS_COMMAND_NV"..0x0009,
        "UNIFORM_ADDRESS_COMMAND_NV"..0x000a,
        "BLEND_COLOR_COMMAND_NV"..0x000b,
        "STENCIL_REF_COMMAND_NV"..0x000c,
        "LINE_WIDTH_COMMAND_NV"..0x000d,
        "POLYGON_OFFSET_COMMAND_NV"..0x000e,
        "ALPHA_REF_COMMAND_NV"..0x000f,
        "VIEWPORT_COMMAND_NV"..0x0010,
        "SCISSOR_COMMAND_NV"..0x0011,
        "FRONT_FACE_COMMAND_NV"..0x0012
    )

    void(
        "CreateStatesNV",

        AutoSize("states")..GLsizei("n"),
        ReturnParam..GLuint.p("states")
    )

    void(
        "DeleteStatesNV",

        AutoSize("states")..GLsizei("n"),
        SingleValue("state")..GLuint.const.p("states")
    )

    GLboolean(
        "IsStateNV",

        GLuint("state")
    )

    void(
        "StateCaptureNV",

        GLuint("state"),
        GLenum("mode")
    )

    GLuint(
        "GetCommandHeaderNV",

        GLenum("tokenID"),
        GLuint("size")
    )

    GLushort(
        "GetStageIndexNV",

        GLenum("shadertype")
    )

    void(
        "DrawCommandsNV",

        GLenum("primitiveMode"),
        GLuint("buffer"),
        GLintptr.const.p("indirects"),
        GLsizei.const.p("sizes"),
        AutoSize("indirects", "sizes")..GLuint("count")
    )

    void(
        "DrawCommandsAddressNV",

        GLenum("primitiveMode"),
        GLuint64.const.p("indirects"),
        GLsizei.const.p("sizes"),
        AutoSize("indirects", "sizes")..GLuint("count")
    )

    void(
        "DrawCommandsStatesNV",

        GLuint("buffer"),
        GLintptr.const.p("indirects"),
        GLsizei.const.p("sizes"),
        GLuint.const.p("states"),
        GLuint.const.p("fbos"),
        AutoSize("indirects", "sizes", "states", "fbos")..GLuint("count")
    )

    void(
        "DrawCommandsStatesAddressNV",

        GLuint64.const.p("indirects"),
        GLsizei.const.p("sizes"),
        GLuint.const.p("states"),
        GLuint.const.p("fbos"),
        AutoSize("indirects", "sizes", "states", "fbos")..GLuint("count")
    )

    void(
        "CreateCommandListsNV",

        AutoSize("lists")..GLsizei("n"),
        ReturnParam..GLuint.p("lists")
    )

    void(
        "DeleteCommandListsNV",

        AutoSize("lists")..GLsizei("n"),
        SingleValue("list")..GLuint.const.p("lists")
    )

    GLboolean(
        "IsCommandListNV",

        GLuint("list")
    )

    void(
        "ListDrawCommandsStatesClientNV",

        GLuint("list"),
        GLuint("segment"),
        void.const.p.p("indirects"),
        GLsizei.const.p("sizes"),
        GLuint.const.p("states"),
        GLuint.const.p("fbos"),
        AutoSize("indirects", "sizes", "states", "fbos")..GLuint("count")
    )

    void(
        "CommandListSegmentsNV",

        GLuint("list"),
        GLuint("segments")
    )

    void(
        "CompileCommandListNV",

        GLuint("list")
    )

    void(
        "CallCommandListNV",

        GLuint("list")
    )
}
