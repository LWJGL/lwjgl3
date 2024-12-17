/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_depth24 = "OESDepth24".nativeClassGLES("OES_depth24", postfix = OES) {
    IntConstant(
        "DEPTH_COMPONENT24_OES"..0x81A6
    )
}