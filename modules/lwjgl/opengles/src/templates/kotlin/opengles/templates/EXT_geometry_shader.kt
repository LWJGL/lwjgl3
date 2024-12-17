/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_geometry_shader = "EXTGeometryShader".nativeClassGLES("EXT_geometry_shader", postfix = EXT) {
    IntConstant(
        "GEOMETRY_SHADER_EXT"..0x8DD9
    )

    IntConstant(
        "GEOMETRY_SHADER_BIT_EXT"..0x00000004
    )

    IntConstant(
        "GEOMETRY_LINKED_VERTICES_OUT_EXT"..0x8916,
        "GEOMETRY_LINKED_INPUT_TYPE_EXT"..0x8917,
        "GEOMETRY_LINKED_OUTPUT_TYPE_EXT"..0x8918,
        "GEOMETRY_SHADER_INVOCATIONS_EXT"..0x887F
    )

    IntConstant(
        "LAYER_PROVOKING_VERTEX_EXT"..0x825E,
        "MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT"..0x8DDF,
        "MAX_GEOMETRY_UNIFORM_BLOCKS_EXT"..0x8A2C,
        "MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS_EXT"..0x8A32,
        "MAX_GEOMETRY_INPUT_COMPONENTS_EXT"..0x9123,
        "MAX_GEOMETRY_OUTPUT_COMPONENTS_EXT"..0x9124,
        "MAX_GEOMETRY_OUTPUT_VERTICES_EXT"..0x8DE0,
        "MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT"..0x8DE1,
        "MAX_GEOMETRY_SHADER_INVOCATIONS_EXT"..0x8E5A,
        "MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT"..0x8C29,
        "MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS_EXT"..0x92CF,
        "MAX_GEOMETRY_ATOMIC_COUNTERS_EXT"..0x92D5,
        "MAX_GEOMETRY_IMAGE_UNIFORMS_EXT"..0x90CD,
        "MAX_GEOMETRY_SHADER_STORAGE_BLOCKS_EXT"..0x90D7
    )

    IntConstant(
        "FIRST_VERTEX_CONVENTION_EXT"..0x8E4D,
        "LAST_VERTEX_CONVENTION_EXT"..0x8E4E,
        "UNDEFINED_VERTEX_EXT"..0x8260
    )

    IntConstant(
        "PRIMITIVES_GENERATED_EXT"..0x8C87
    )

    IntConstant(
        "LINES_ADJACENCY_EXT"..0xA,
        "LINE_STRIP_ADJACENCY_EXT"..0xB,
        "TRIANGLES_ADJACENCY_EXT"..0xC,
        "TRIANGLE_STRIP_ADJACENCY_EXT"..0xD
    )

    IntConstant(
        "FRAMEBUFFER_DEFAULT_LAYERS_EXT"..0x9312
    )

    IntConstant(
        "MAX_FRAMEBUFFER_LAYERS_EXT"..0x9317
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT"..0x8DA8
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_LAYERED_EXT"..0x8DA7
    )

    IntConstant(
        "REFERENCED_BY_GEOMETRY_SHADER_EXT"..0x9309
    )

    void(
        "FramebufferTextureEXT",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level")
    )
}

val EXT_geometry_point_size = EXT_FLAG.nativeClassGLES("EXT_geometry_point_size", postfix = EXT)