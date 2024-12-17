/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_depth_clamp = "EXTDepthClamp".nativeClassGLES("EXT_depth_clamp", postfix = EXT) {
    IntConstant(
        "DEPTH_CLAMP_EXT"..0x864F
    )
}