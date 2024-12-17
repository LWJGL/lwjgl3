/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_YUV_target = "EXTYUVTarget".nativeClassGLES("EXT_YUV_target", postfix = EXT) {
    IntConstant(
        "SAMPLER_EXTERNAL_2D_Y2Y_EXT"..0x8BE7
    )

    IntConstant(
        "TEXTURE_EXTERNAL_OES"..0x8D65
    )

    IntConstant(
        "TEXTURE_BINDING_EXTERNAL_OES"..0x8D67
    )

    IntConstant(
        "REQUIRED_TEXTURE_IMAGE_UNITS_OES"..0x8D68
    )
}