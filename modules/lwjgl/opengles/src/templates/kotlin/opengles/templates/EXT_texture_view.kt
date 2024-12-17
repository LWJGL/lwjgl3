/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_view = "EXTTextureView".nativeClassGLES("EXT_texture_view", postfix = EXT) {
    IntConstant(
        "TEXTURE_VIEW_MIN_LEVEL_EXT"..0x82DB,
        "TEXTURE_VIEW_NUM_LEVELS_EXT"..0x82DC,
        "TEXTURE_VIEW_MIN_LAYER_EXT"..0x82DD,
        "TEXTURE_VIEW_NUM_LAYERS_EXT"..0x82DE,
        "TEXTURE_IMMUTABLE_LEVELS"..0x82DF
    )

    void(
        "TextureViewEXT",

        GLuint("texture"),
        GLenum("target"),
        GLuint("origtexture"),
        GLenum("internalformat"),
        GLuint("minlevel"),
        GLuint("numlevels"),
        GLuint("minlayer"),
        GLuint("numlayers")
    )
}