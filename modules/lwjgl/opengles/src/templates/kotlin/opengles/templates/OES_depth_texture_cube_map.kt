/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_depth_texture_cube_map = "OESDepthTextureCubeMap".nativeClassGLES("OES_depth_texture_cube_map", postfix = OES) {
    IntConstant(
        "DEPTH_STENCIL_OES"..0x84F9
    )

    IntConstant(
        "DEPTH24_STENCIL8_OES"..0x88F0
    )
}