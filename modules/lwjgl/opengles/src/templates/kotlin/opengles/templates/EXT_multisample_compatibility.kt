/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_multisample_compatibility = "EXTMultisampleCompatibility".nativeClassGLES("EXT_multisample_compatibility", postfix = EXT) {
    IntConstant(
        "MULTISAMPLE_EXT"..0x809D,
        "SAMPLE_ALPHA_TO_ONE_EXT"..0x809F
    )
}