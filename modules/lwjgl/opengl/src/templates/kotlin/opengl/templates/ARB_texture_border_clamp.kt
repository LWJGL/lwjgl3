/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_border_clamp = "ARBTextureBorderClamp".nativeClassGL("ARB_texture_border_clamp", postfix = ARB) {
    IntConstant(
        "CLAMP_TO_BORDER_ARB"..0x812D
    )

}