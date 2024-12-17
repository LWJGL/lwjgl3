/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_gather = "ARBTextureGather".nativeClassGL("ARB_texture_gather", postfix = ARB) {
    IntConstant(
        "MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB"..0x8E5E,
        "MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB"..0x8E5F,
        "MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB"..0x8F9F
    )
}