/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_blend_func_extended = "EXTBlendFuncExtended".nativeClassGLES("EXT_blend_func_extended", postfix = EXT) {
    IntConstant(
        "SRC1_COLOR_EXT"..0x88F9,
        "SRC1_ALPHA_EXT"..0x8589,
        "ONE_MINUS_SRC1_COLOR_EXT"..0x88FA,
        "ONE_MINUS_SRC1_ALPHA_EXT"..0x88FB,
        "SRC_ALPHA_SATURATE_EXT"..0x0308
    )

    IntConstant(
        "LOCATION_INDEX_EXT"..0x930F
    )

    IntConstant(
        "MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT"..0x88FC
    )

    DependsOn("GLES30")..void(
        "BindFragDataLocationIndexedEXT",

        GLuint("program"),
        GLuint("colorNumber"),
        GLuint("index"),
        GLcharASCII.const.p("name")
    )

    DependsOn("GLES30")..GLint(
        "GetFragDataIndexEXT",

        GLuint("program"),
        GLcharASCII.const.p("name")
    )

    DependsOn("GLES30")..void(
        "BindFragDataLocationEXT",

        GLuint("program"),
        GLuint("colorNumber"),
        GLcharASCII.const.p("name")
    )

    // Missing on Windows with OpenGL ES 3.2 NVIDIA 452.06
    IgnoreMissing..DependsOn("GLES31")..GLint(
        "GetProgramResourceLocationIndexEXT",

        GLuint("program"),
        GLenum("programInterface"),
        GLcharASCII.const.p("name")
    )
}