/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_render_snorm = "EXTRenderSnorm".nativeClassGLES("EXT_render_snorm", postfix = EXT) {
    IntConstant(
        "R16_SNORM_EXT"..0x8F98,
        "RG16_SNORM_EXT"..0x8F99,
        "RGBA16_SNORM_EXT"..0x8F9B
    )
}