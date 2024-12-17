/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ANGLE_pack_reverse_row_order = "ANGLEPackReverseRowOrder".nativeClassGLES("ANGLE_pack_reverse_row_order", postfix = ANGLE) {
    IntConstant(
        "PACK_REVERSE_ROW_ORDER_ANGLE"..0x93A4
    )
}