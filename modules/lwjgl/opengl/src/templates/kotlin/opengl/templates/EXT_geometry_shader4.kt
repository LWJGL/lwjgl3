/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_geometry_shader4 = "EXTGeometryShader4".nativeClassGL("EXT_geometry_shader4", postfix = EXT) {
    IntConstant(
        "GEOMETRY_SHADER_EXT"..0x8DD9
    )

    IntConstant(
        "GEOMETRY_VERTICES_OUT_EXT"..0x8DDA,
        "GEOMETRY_INPUT_TYPE_EXT"..0x8DDB,
        "GEOMETRY_OUTPUT_TYPE_EXT"..0x8DDC
    )

    IntConstant(
        "MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT"..0x8C29,
        "MAX_GEOMETRY_VARYING_COMPONENTS_EXT"..0x8DDD,
        "MAX_VERTEX_VARYING_COMPONENTS_EXT"..0x8DDE,
        "MAX_VARYING_COMPONENTS_EXT"..0x8B4B,
        "MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT"..0x8DDF,
        "MAX_GEOMETRY_OUTPUT_VERTICES_EXT"..0x8DE0,
        "MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT"..0x8DE1
    )

    IntConstant(
        "LINES_ADJACENCY_EXT"..0xA,
        "LINE_STRIP_ADJACENCY_EXT"..0xB,
        "TRIANGLES_ADJACENCY_EXT"..0xC,
        "TRIANGLE_STRIP_ADJACENCY_EXT"..0xD
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT"..0x8DA8,
        "FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_EXT"..0x8DA9
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_LAYERED_EXT"..0x8DA7,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT"..0x8CD4
    )

    IntConstant(
        "PROGRAM_POINT_SIZE_EXT"..0x8642
    )

    void(
        "ProgramParameteriEXT",

        GLuint("program"),
        GLenum("pname"),
        GLint("value")
    )

    void(
        "FramebufferTextureEXT",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level")
    )

    reuse(EXT_texture_array, "FramebufferTextureLayerEXT")

    void(
        "FramebufferTextureFaceEXT",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level"),
        GLenum("face")
    )
}