/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_depth_texture = "ARBDepthTexture".nativeClassGL("ARB_depth_texture", postfix = ARB) {
    IntConstant(
        "DEPTH_COMPONENT16_ARB"..0x81A5,
        "DEPTH_COMPONENT24_ARB"..0x81A6,
        "DEPTH_COMPONENT32_ARB"..0x81A7
    )

    IntConstant(
        "TEXTURE_DEPTH_SIZE_ARB"..0x884A
    )

    IntConstant(
        "DEPTH_TEXTURE_MODE_ARB"..0x884B
    )
}