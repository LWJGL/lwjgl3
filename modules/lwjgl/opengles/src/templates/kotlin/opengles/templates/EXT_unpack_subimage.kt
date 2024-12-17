/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_unpack_subimage = "EXTUnpackSubimage".nativeClassGLES("EXT_unpack_subimage", postfix = EXT) {
    IntConstant(
        "UNPACK_ROW_LENGTH_EXT"..0x0CF2,
        "UNPACK_SKIP_ROWS_EXT"..0x0CF3,
        "UNPACK_SKIP_PIXELS_EXT"..0x0CF4
    )
}