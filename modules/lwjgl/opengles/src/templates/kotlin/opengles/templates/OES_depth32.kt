/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_depth32 = "OESDepth32".nativeClassGLES("OES_depth32", postfix = OES) {
    IntConstant(
        "DEPTH_COMPONENT32_OES"..0x81A7
    )
}