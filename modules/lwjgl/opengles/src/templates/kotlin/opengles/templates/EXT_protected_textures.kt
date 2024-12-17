/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_protected_textures = "EXTProtectedTextures".nativeClassGLES("EXT_protected_textures", postfix = EXT) {
    IntConstant(
        "CONTEXT_FLAG_PROTECTED_CONTENT_BIT_EXT"..0x00000010
    )

    IntConstant(
        "TEXTURE_PROTECTED_EXT"..0x8BFA
    )
}