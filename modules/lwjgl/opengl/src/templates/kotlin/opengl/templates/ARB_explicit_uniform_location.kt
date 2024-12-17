/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_explicit_uniform_location = "ARBExplicitUniformLocation".nativeClassGL("ARB_explicit_uniform_location") {
    IntConstant(
        "MAX_UNIFORM_LOCATIONS"..0x826E
    )
}