/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_shadow_ambient = "ARBShadowAmbient".nativeClassGL("ARB_shadow_ambient", postfix = ARB) {
    IntConstant(
        "TEXTURE_COMPARE_FAIL_VALUE_ARB"..0x80BF
    )

}