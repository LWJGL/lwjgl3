/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val AMD_compressed_ATC_texture = "AMDCompressedATCTexture".nativeClassGLES("AMD_compressed_ATC_texture", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables support for ATC compressed texture formats. ATC is AMD's proprietary compression algorithm for compressing textures for handheld
        devices to save on power consumption, memory footprint and bandwidth.

        Three compression formats are introduced:
        ${ul(
            "A compression format for RGB textures.",
            "A compression format for RGBA textures using explicit alpha encoding.",
            "A compression format for RGBA textures using interpolated alpha encoding."
        )}
        """

    IntConstant(
        "Accepted by the {@code internalformat} parameter of CompressedTexImage2D and CompressedTexImage3DOES.",

        "ATC_RGB_AMD"..0x8C92,
        "ATC_RGBA_EXPLICIT_ALPHA_AMD"..0x8C93,
        "ATC_RGBA_INTERPOLATED_ALPHA_AMD"..0x87EE
    )
}