/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_bind_to_front = "EXTBindToFront".nativeClassEGL("EXT_bind_to_front", postfix = EXT) {
    IntConstant(
        "FRONT_BUFFER_EXT"..0x3464
    )
}