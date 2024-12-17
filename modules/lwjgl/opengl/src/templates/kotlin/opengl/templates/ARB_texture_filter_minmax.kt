/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_filter_minmax = "ARBTextureFilterMinmax".nativeClassGL("ARB_texture_filter_minmax") {
    IntConstant(
        "TEXTURE_REDUCTION_MODE_ARB"..0x9366
    )

    IntConstant(
        "WEIGHTED_AVERAGE_ARB"..0x9367
    )
}