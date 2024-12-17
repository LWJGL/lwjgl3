/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_view = "ARBTextureView".nativeClassGL("ARB_texture_view") {
    IntConstant(
        "TEXTURE_VIEW_MIN_LEVEL"..0x82DB,
        "TEXTURE_VIEW_NUM_LEVELS"..0x82DC,
        "TEXTURE_VIEW_MIN_LAYER"..0x82DD,
        "TEXTURE_VIEW_NUM_LAYERS"..0x82DE,
        "TEXTURE_IMMUTABLE_LEVELS"..0x82DF
    )

    reuse(GL43C, "TextureView")
}