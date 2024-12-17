/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_half_float_vertex = "ARBHalfFloatVertex".nativeClassGL("ARB_half_float_vertex") {
    IntConstant(
        "HALF_FLOAT"..0x140B
    )
}