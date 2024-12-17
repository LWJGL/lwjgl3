/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_color_buffer_half_float = "EXTColorBufferHalfFloat".nativeClassGLES("EXT_color_buffer_half_float", postfix = EXT) {
    IntConstant(
        "RGBA16F_EXT"..0x881A,
        "RGB16F_EXT"..0x881B,
        "RG16F_EXT"..0x822F,
        "R16F_EXT"..0x822D
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT"..0x8211
    )

    IntConstant(
        "UNSIGNED_NORMALIZED_EXT"..0x8C17
    )
}