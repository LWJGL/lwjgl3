/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_pixel_buffer_object = "ARBPixelBufferObject".nativeClassGL("ARB_pixel_buffer_object", postfix = ARB) {
    IntConstant(
        "PIXEL_PACK_BUFFER_ARB"..0x88EB,
        "PIXEL_UNPACK_BUFFER_ARB"..0x88EC
    )

    IntConstant(
        "PIXEL_PACK_BUFFER_BINDING_ARB"..0x88ED,
        "PIXEL_UNPACK_BUFFER_BINDING_ARB"..0x88EF
    )
}