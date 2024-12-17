/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_standard_derivatives = "OESStandardDerivatives".nativeClassGLES("OES_standard_derivatives", postfix = OES) {
    IntConstant(
        "FRAGMENT_SHADER_DERIVATIVE_HINT_OES"..0x8B8B
    )
}