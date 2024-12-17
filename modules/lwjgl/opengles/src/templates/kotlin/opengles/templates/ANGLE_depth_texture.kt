/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ANGLE_depth_texture = "ANGLEDepthTexture".nativeClassGLES("ANGLE_depth_texture", postfix = ANGLE) {
    IntConstant(
        "DEPTH_STENCIL_OES"..0x84F9
    )

    IntConstant(
        "UNSIGNED_INT_24_8_OES"..0x84FA
    )

    IntConstant(
        "DEPTH_COMPONENT32_OES"..0x81A7,
        "DEPTH24_STENCIL8_OES"..0x88F0
    )
}