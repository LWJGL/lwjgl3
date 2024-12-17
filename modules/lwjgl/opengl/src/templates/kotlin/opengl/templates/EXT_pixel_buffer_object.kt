/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_pixel_buffer_object = "EXTPixelBufferObject".nativeClassGL("EXT_pixel_buffer_object", postfix = EXT) {
    IntConstant(
        "PIXEL_PACK_BUFFER_EXT"..0x88EB,
        "PIXEL_UNPACK_BUFFER_EXT"..0x88EC
    )

    IntConstant(
        "PIXEL_PACK_BUFFER_BINDING_EXT"..0x88ED,
        "PIXEL_UNPACK_BUFFER_BINDING_EXT"..0x88EF
    )
}