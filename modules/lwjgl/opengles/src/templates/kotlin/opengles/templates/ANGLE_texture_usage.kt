/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ANGLE_texture_usage = "ANGLETextureUsage".nativeClassGLES("ANGLE_texture_usage", postfix = ANGLE) {
    IntConstant(
        "TEXTURE_USAGE_ANGLE"..0x93A2
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_ANGLE"..0x93A3
    )
}