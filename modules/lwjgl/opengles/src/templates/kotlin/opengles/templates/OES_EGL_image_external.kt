/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_EGL_image_external = "OESEGLImageExternal".nativeClassGLES("OES_EGL_image_external", postfix = OES) {
    IntConstant(
        "TEXTURE_EXTERNAL_OES"..0x8D65
    )

    IntConstant(
        "SAMPLER_EXTERNAL_OES"..0x8D66
    )

    IntConstant(
        "TEXTURE_BINDING_EXTERNAL_OES"..0x8D67
    )

    IntConstant(
        "REQUIRED_TEXTURE_IMAGE_UNITS_OES"..0x8D68
    )
}