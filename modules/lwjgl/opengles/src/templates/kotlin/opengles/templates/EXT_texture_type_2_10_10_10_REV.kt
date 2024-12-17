/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_type_2_10_10_10_REV = "EXTTextureType2101010REV".nativeClassGLES("EXT_texture_type_2_10_10_10_REV", postfix = EXT) {
    IntConstant(
        "UNSIGNED_INT_2_10_10_10_REV_EXT"..0x8368
    )
}