/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_present_opaque = "EXTPresentOpaque".nativeClassEGL("EXT_present_opaque", postfix = EXT) {
    IntConstant(
        "PRESENT_OPAQUE_EXT"..0x31DF
    )
}