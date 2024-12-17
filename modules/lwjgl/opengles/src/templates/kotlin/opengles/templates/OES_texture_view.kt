/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_texture_view = "OESTextureView".nativeClassGLES("OES_texture_view", postfix = OES) {
    IntConstant(
        "TEXTURE_VIEW_MIN_LEVEL_OES"..0x82DB,
        "TEXTURE_VIEW_NUM_LEVELS_OES"..0x82DC,
        "TEXTURE_VIEW_MIN_LAYER_OES"..0x82DD,
        "TEXTURE_VIEW_NUM_LAYERS_OES"..0x82DE,
        "TEXTURE_IMMUTABLE_LEVELS"..0x82DF
    )

    void(
        "TextureViewOES",

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