/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_compressed_ETC1_RGB8_texture = "OESCompressedETC1RGB8Texture".nativeClassGLES("OES_compressed_ETC1_RGB8_texture", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The goal of this extension is to allow direct support of compressed textures in the Ericsson Texture Compression (ETC) formats in OpenGL ES.

        ETC-compressed textures are handled in OpenGL ES using the CompressedTexImage2D call.

        The definition of the "internalformat" parameter in the CompressedTexImage2D call has been extended to support ETC-compressed textures.
        """

    IntConstant(
        "Accepted by the {@code internalformat} parameter of CompressedTexImage2D.",

        "ETC1_RGB8_OES"..0x8D64
    )
}