/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_shadow = "ARBShadow".nativeClassGL("ARB_shadow", postfix = ARB) {
    IntConstant(
        "TEXTURE_COMPARE_MODE_ARB"..0x884C,
        "TEXTURE_COMPARE_FUNC_ARB"..0x884D
    )

    IntConstant(
        "COMPARE_R_TO_TEXTURE_ARB"..0x884E
    )
}