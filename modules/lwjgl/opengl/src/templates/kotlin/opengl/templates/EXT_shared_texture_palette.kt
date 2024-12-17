/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_shared_texture_palette = "EXTSharedTexturePalette".nativeClassGL("EXT_shared_texture_palette", postfix = EXT) {
    IntConstant(
        "SHARED_TEXTURE_PALETTE_EXT"..0x81FB
    )
}