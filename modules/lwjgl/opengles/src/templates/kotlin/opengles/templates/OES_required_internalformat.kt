/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_required_internalformat = "OESRequiredInternalformat".nativeClassGLES("OES_required_internalformat", postfix = OES) {
    IntConstant(
        "ALPHA8_OES"..0x803C,
        "LUMINANCE8_OES"..0x8040,
        "LUMINANCE8_ALPHA8_OES"..0x8045,
        "LUMINANCE4_ALPHA4_OES"..0x8043,
        "RGB565_OES"..0x8D62,
        "RGB8_OES"..0x8051,
        "RGBA4_OES"..0x8056,
        "RGB5_A1_OES"..0x8057,
        "RGBA8_OES"..0x8058,
        "DEPTH_COMPONENT16_OES"..0x81A5,
        "DEPTH_COMPONENT24_OES"..0x81A6,
        "DEPTH_COMPONENT32_OES"..0x81A7,
        "DEPTH24_STENCIL8_OES"..0x88F0,
        "RGB10_EXT"..0x8052,
        "RGB10_A2_EXT"..0x8059
    )
}