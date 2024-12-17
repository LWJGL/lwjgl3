/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_env_dot3 = "ARBTextureEnvDot3".nativeClassGL("ARB_texture_env_dot3", postfix = ARB) {
    IntConstant(
        "DOT3_RGB_ARB"..0x86AE,
        "DOT3_RGBA_ARB"..0x86AF
    )
}