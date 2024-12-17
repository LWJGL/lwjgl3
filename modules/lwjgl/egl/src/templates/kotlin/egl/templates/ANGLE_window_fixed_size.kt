/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANGLE_window_fixed_size = "ANGLEWindowFixedSize".nativeClassEGL("ANGLE_window_fixed_size", postfix = ANGLE) {
    IntConstant(
        "FIXED_SIZE_ANGLE"..0x3201
    )
}