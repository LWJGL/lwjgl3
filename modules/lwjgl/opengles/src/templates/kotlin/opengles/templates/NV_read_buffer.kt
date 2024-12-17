/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_read_buffer = "NVReadBuffer".nativeClassGLES("NV_read_buffer", postfix = NV) {
    IntConstant(
        "READ_BUFFER_NV"..0x0C02
    )

    void(
        "ReadBufferNV",

        GLenum("mode")
    )
}

val NV_read_buffer_front = EXT_FLAG.nativeClassGLES("NV_read_buffer_front", postfix = NV) {
}