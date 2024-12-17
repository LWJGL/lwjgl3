/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_texture_shared_exponent = "EXTTextureSharedExponent".nativeClassGL("EXT_texture_shared_exponent", postfix = EXT) {
    IntConstant(
        "RGB9_E5_EXT"..0x8C3D
    )

    IntConstant(
        "UNSIGNED_INT_5_9_9_9_REV_EXT"..0x8C3E
    )

    IntConstant(
        "TEXTURE_SHARED_SIZE_EXT"..0x8C3F
    )
}