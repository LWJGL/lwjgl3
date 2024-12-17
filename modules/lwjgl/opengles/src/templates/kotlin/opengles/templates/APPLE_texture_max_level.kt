/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val APPLE_texture_max_level = "APPLETextureMaxLevel".nativeClassGLES("APPLE_texture_max_level", postfix = APPLE) {
    IntConstant(
        "TEXTURE_MAX_LEVEL_APPLE"..0x813D
    )
}