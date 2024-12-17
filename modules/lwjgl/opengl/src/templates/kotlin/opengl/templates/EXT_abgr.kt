/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_abgr = "EXTABGR".nativeClassGL("EXT_abgr", postfix = EXT) {
    IntConstant(
        "ABGR_EXT"..0x8000
    )
}