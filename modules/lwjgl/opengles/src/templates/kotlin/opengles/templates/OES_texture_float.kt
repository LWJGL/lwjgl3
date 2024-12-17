/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_texture_float = EXT_FLAG.nativeClassGLES("OES_texture_float", postfix = OES) {
}

val OES_texture_half_float = "OESTextureHalfFloat".nativeClassGLES("OES_texture_half_float", postfix = OES) {
    IntConstant(
        "HALF_FLOAT_OES"..0x8D61
    )
}