/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val MESA_bgra = "MESABGRA".nativeClassGLES("MESA_bgra", postfix = MESA) {
    IntConstant(
        "BGR_EXT"..0x80E0,
        "BGRA_EXT"..0x80E1
    )
}