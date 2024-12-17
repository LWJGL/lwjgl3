/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_geometry_shader4 = "ARBGeometryShader4".nativeClassGL("ARB_geometry_shader4", postfix = ARB) {
    IntConstant(
        "GEOMETRY_SHADER_ARB"..0x8DD9
    )

    IntConstant(
        "GEOMETRY_VERTICES_OUT_ARB"..0x8DDA,
        "GEOMETRY_INPUT_TYPE_ARB"..0x8DDB,
        "GEOMETRY_OUTPUT_TYPE_ARB"..0x8DDC
    )

    IntConstant(
        "MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB"..0x8C29,
        "MAX_GEOMETRY_VARYING_COMPONENTS_ARB"..0x8DDD,
        "MAX_VERTEX_VARYING_COMPONENTS_ARB"..0x8DDE,
        "MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB"..0x8DDF,
        "MAX_GEOMETRY_OUTPUT_VERTICES_ARB"..0x8DE0,
        "MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB"..0x8DE1
    )

    IntConstant(
        "LINES_ADJACENCY_ARB"..0xA,
        "LINE_STRIP_ADJACENCY_ARB"..0xB,
        "TRIANGLES_ADJACENCY_ARB"..0xC,
        "TRIANGLE_STRIP_ADJACENCY_ARB"..0xD
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB"..0x8DA8,
        "FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB"..0x8DA9
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_LAYERED_ARB"..0x8DA7,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER"..0x8CD4
    )

    IntConstant(
        "PROGRAM_POINT_SIZE_ARB"..0x8642
    )

    void(
        "ProgramParameteriARB",

        GLuint("program"),
        GLenum("pname"),
        GLint("value")
    )

    void(
        "FramebufferTextureARB",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level")
    )

    void(
        "FramebufferTextureLayerARB",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level"),
        GLint("layer")
    )

    void(
        "FramebufferTextureFaceARB",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level"),
        GLenum("face")
    )
}