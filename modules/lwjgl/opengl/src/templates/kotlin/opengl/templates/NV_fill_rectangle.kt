/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_fill_rectangle = "NVFillRectangle".nativeClassGL("NV_fill_rectangle", postfix = NV) {
    IntConstant(
        "FILL_RECTANGLE_NV"..0x933C
    )
}
