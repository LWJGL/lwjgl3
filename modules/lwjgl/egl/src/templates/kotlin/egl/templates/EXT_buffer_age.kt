/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_buffer_age = "EXTBufferAge".nativeClassEGL("EXT_buffer_age", postfix = EXT) {
    IntConstant(
        "BUFFER_AGE_EXT"..0x313D
    )
}