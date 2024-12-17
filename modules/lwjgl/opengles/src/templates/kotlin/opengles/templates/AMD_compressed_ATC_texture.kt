/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val AMD_compressed_ATC_texture = "AMDCompressedATCTexture".nativeClassGLES("AMD_compressed_ATC_texture", postfix = AMD) {
    IntConstant(
        "ATC_RGB_AMD"..0x8C92,
        "ATC_RGBA_EXPLICIT_ALPHA_AMD"..0x8C93,
        "ATC_RGBA_INTERPOLATED_ALPHA_AMD"..0x87EE
    )
}