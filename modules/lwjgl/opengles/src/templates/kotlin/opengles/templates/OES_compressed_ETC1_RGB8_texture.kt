/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_compressed_ETC1_RGB8_texture = "OESCompressedETC1RGB8Texture".nativeClassGLES("OES_compressed_ETC1_RGB8_texture", postfix = OES) {
    IntConstant(
        "ETC1_RGB8_OES"..0x8D64
    )
}