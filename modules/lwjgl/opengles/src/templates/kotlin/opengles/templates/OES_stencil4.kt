/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_stencil4 = "OESStencil4".nativeClassGLES("OES_stencil4", postfix = OES) {
    IntConstant(
        "STENCIL_INDEX4_OES"..0x8D47
    )
}