/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val APPLE_row_bytes = "APPLERowBytes".nativeClassGL("APPLE_row_bytes") {
    IntConstant(
        "PACK_ROW_BYTES_APPLE"..0x8A15,
        "UNPACK_ROW_BYTES_APPLE"..0x8A16
    )
}