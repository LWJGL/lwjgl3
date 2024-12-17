/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_shader_image_load_store = "EXTShaderImageLoadStore".nativeClassGL("EXT_shader_image_load_store", postfix = EXT) {
    IntConstant(
        "MAX_IMAGE_UNITS_EXT"..0x8F38,
        "MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS_EXT"..0x8F39,
        "MAX_IMAGE_SAMPLES_EXT"..0x906D
    )

    IntConstant(
        "IMAGE_BINDING_NAME_EXT"..0x8F3A,
        "IMAGE_BINDING_LEVEL_EXT"..0x8F3B,
        "IMAGE_BINDING_LAYERED_EXT"..0x8F3C,
        "IMAGE_BINDING_LAYER_EXT"..0x8F3D,
        "IMAGE_BINDING_ACCESS_EXT"..0x8F3E,
        "IMAGE_BINDING_FORMAT_EXT"..0x906E
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_BARRIER_BIT_EXT"..0x00000001,
        "ELEMENT_ARRAY_BARRIER_BIT_EXT"..0x00000002,
        "UNIFORM_BARRIER_BIT_EXT"..0x00000004,
        "TEXTURE_FETCH_BARRIER_BIT_EXT"..0x00000008,
        "SHADER_IMAGE_ACCESS_BARRIER_BIT_EXT"..0x00000020,
        "COMMAND_BARRIER_BIT_EXT"..0x00000040,
        "PIXEL_BUFFER_BARRIER_BIT_EXT"..0x00000080,
        "TEXTURE_UPDATE_BARRIER_BIT_EXT"..0x00000100,
        "BUFFER_UPDATE_BARRIER_BIT_EXT"..0x00000200,
        "FRAMEBUFFER_BARRIER_BIT_EXT"..0x00000400,
        "TRANSFORM_FEEDBACK_BARRIER_BIT_EXT"..0x00000800,
        "ATOMIC_COUNTER_BARRIER_BIT_EXT"..0x00001000,
        "ALL_BARRIER_BITS_EXT"..0xFFFFFFFF.i
    )

    IntConstant(
        "IMAGE_1D_EXT"..0x904C,
        "IMAGE_2D_EXT"..0x904D,
        "IMAGE_3D_EXT"..0x904E,
        "IMAGE_2D_RECT_EXT"..0x904F,
        "IMAGE_CUBE_EXT"..0x9050,
        "IMAGE_BUFFER_EXT"..0x9051,
        "IMAGE_1D_ARRAY_EXT"..0x9052,
        "IMAGE_2D_ARRAY_EXT"..0x9053,
        "IMAGE_CUBE_MAP_ARRAY_EXT"..0x9054,
        "IMAGE_2D_MULTISAMPLE_EXT"..0x9055,
        "IMAGE_2D_MULTISAMPLE_ARRAY_EXT"..0x9056,
        "INT_IMAGE_1D_EXT"..0x9057,
        "INT_IMAGE_2D_EXT"..0x9058,
        "INT_IMAGE_3D_EXT"..0x9059,
        "INT_IMAGE_2D_RECT_EXT"..0x905A,
        "INT_IMAGE_CUBE_EXT"..0x905B,
        "INT_IMAGE_BUFFER_EXT"..0x905C,
        "INT_IMAGE_1D_ARRAY_EXT"..0x905D,
        "INT_IMAGE_2D_ARRAY_EXT"..0x905E,
        "INT_IMAGE_CUBE_MAP_ARRAY_EXT"..0x905F,
        "INT_IMAGE_2D_MULTISAMPLE_EXT"..0x9060,
        "INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT"..0x9061,
        "UNSIGNED_INT_IMAGE_1D_EXT"..0x9062,
        "UNSIGNED_INT_IMAGE_2D_EXT"..0x9063,
        "UNSIGNED_INT_IMAGE_3D_EXT"..0x9064,
        "UNSIGNED_INT_IMAGE_2D_RECT_EXT"..0x9065,
        "UNSIGNED_INT_IMAGE_CUBE_EXT"..0x9066,
        "UNSIGNED_INT_IMAGE_BUFFER_EXT"..0x9067,
        "UNSIGNED_INT_IMAGE_1D_ARRAY_EXT"..0x9068,
        "UNSIGNED_INT_IMAGE_2D_ARRAY_EXT"..0x9069,
        "UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_EXT"..0x906A,
        "UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_EXT"..0x906B,
        "UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY_EXT"..0x906C
    )

    void(
        "BindImageTextureEXT",

        GLuint("index"),
        GLuint("texture"),
        GLint("level"),
        GLboolean("layered"),
        GLint("layer"),
        GLenum("access"),
        GLint("format")
    )

    void(
        "MemoryBarrierEXT",

        GLbitfield("barriers")
    )
}