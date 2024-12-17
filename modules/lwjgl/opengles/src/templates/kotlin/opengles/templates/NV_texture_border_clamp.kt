/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_texture_border_clamp = "NVTextureBorderClamp".nativeClassGLES("NV_texture_border_clamp", postfix = NV) {
    IntConstant(
        "TEXTURE_BORDER_COLOR_NV"..0x1004
    )

    IntConstant(
        "CLAMP_TO_BORDER_NV"..0x812D
    )
}