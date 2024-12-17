/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_fill_rectangle = "NVFillRectangle".nativeClassGLES("NV_fill_rectangle", postfix = NV) {
    IntConstant(
        "FILL_RECTANGLE_NV"..0x933C
    )
}