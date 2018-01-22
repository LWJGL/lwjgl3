/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_compressed_paletted_texture = "OESCompressedPalettedTexture".nativeClassGLES("OES_compressed_paletted_texture", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The goal of this extension is to allow direct support of palettized textures in OpenGL ES.

        Palettized textures are implemented in OpenGL ES using the CompressedTexImage2D call. The definition of the following parameters "level" and
        "internalformat" in the CompressedTexImage2D call have been extended to support paletted textures.
        """

    IntConstant(
        "Accepted by the {@code internalformat} paramter of CompressedTexImage2D.",

        "PALETTE4_RGB8_OES"..0x8B90,
        "PALETTE4_RGBA8_OES"..0x8B91,
        "PALETTE4_R5_G6_B5_OES"..0x8B92,
        "PALETTE4_RGBA4_OES"..0x8B93,
        "PALETTE4_RGB5_A1_OES"..0x8B94,
        "PALETTE8_RGB8_OES"..0x8B95,
        "PALETTE8_RGBA8_OES"..0x8B96,
        "PALETTE8_R5_G6_B5_OES"..0x8B97,
        "PALETTE8_RGBA4_OES"..0x8B98,
        "PALETTE8_RGB5_A1_OES"..0x8B99
    )
}