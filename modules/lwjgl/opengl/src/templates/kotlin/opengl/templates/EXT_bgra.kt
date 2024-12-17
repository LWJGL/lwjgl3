/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_bgra = "EXTBGRA".nativeClassGL("EXT_bgra", postfix = EXT) {
    IntConstant(
        "BGR_EXT"..0x80E0,
        "BGRA_EXT"..0x80E1
    )
}