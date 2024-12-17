/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val IMG_read_format = "IMGReadFormat".nativeClassGLES("IMG_read_format", postfix = IMG) {
    IntConstant(
        "BGRA_IMG"..0x80E1,
        "UNSIGNED_SHORT_4_4_4_4_REV_IMG"..0x8365
    )
}