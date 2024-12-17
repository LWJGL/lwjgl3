/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_surfaceless_context = "OESSurfacelessContext".nativeClassGLES("OES_surfaceless_context", postfix = OES) {
    IntConstant(
        "FRAMEBUFFER_UNDEFINED_OES"..0x8219
    )
}