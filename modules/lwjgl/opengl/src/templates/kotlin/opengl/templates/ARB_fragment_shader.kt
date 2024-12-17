/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_fragment_shader = "ARBFragmentShader".nativeClassGL("ARB_fragment_shader", postfix = ARB) {
    IntConstant(
        "FRAGMENT_SHADER_ARB"..0x8B30
    )

    IntConstant(
        "MAX_FRAGMENT_UNIFORM_COMPONENTS_ARB"..0x8B49
    )

    IntConstant(
        "FRAGMENT_SHADER_DERIVATIVE_HINT_ARB"..0x8B8B
    )
}