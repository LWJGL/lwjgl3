/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_texture_filter_minmax = "EXTTextureFilterMinmax".nativeClassGL("EXT_texture_filter_minmax", postfix = EXT) {
    IntConstant(
        "TEXTURE_REDUCTION_MODE_EXT"..0x9366
    )

    IntConstant(
        "WEIGHTED_AVERAGE_EXT"..0x9367
    )
}