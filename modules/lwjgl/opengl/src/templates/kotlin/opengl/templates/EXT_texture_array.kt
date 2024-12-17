/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_texture_array = "EXTTextureArray".nativeClassGL("EXT_texture_array", postfix = EXT) {
    IntConstant(
        "TEXTURE_1D_ARRAY_EXT"..0x8C18,
        "TEXTURE_2D_ARRAY_EXT"..0x8C1A
    )

    IntConstant(
        "PROXY_TEXTURE_2D_ARRAY_EXT"..0x8C1B
    )

    IntConstant(
        "PROXY_TEXTURE_1D_ARRAY_EXT"..0x8C19
    )

    IntConstant(
        "TEXTURE_BINDING_1D_ARRAY_EXT"..0x8C1C,
        "TEXTURE_BINDING_2D_ARRAY_EXT"..0x8C1D,
        "MAX_ARRAY_TEXTURE_LAYERS_EXT"..0x88FF
    )

    IntConstant(
        "COMPARE_REF_DEPTH_TO_TEXTURE_EXT"..0x884E
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT"..0x8CD4
    )

    IntConstant(
        "SAMPLER_1D_ARRAY_EXT"..0x8DC0,
        "SAMPLER_2D_ARRAY_EXT"..0x8DC1,
        "SAMPLER_1D_ARRAY_SHADOW_EXT"..0x8DC3,
        "SAMPLER_2D_ARRAY_SHADOW_EXT"..0x8DC4
    )

    void(
        "FramebufferTextureLayerEXT",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level"),
        GLint("layer")
    )
}