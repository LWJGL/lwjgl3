/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_stencil1 = "OESStencil1".nativeClassGLES("OES_stencil1", postfix = OES) {
    IntConstant(
        "STENCIL_INDEX1_OES"..0x8D46
    )
}