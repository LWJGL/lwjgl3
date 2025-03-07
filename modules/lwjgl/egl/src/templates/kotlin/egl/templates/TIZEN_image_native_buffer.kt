/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val TIZEN_image_native_buffer = "TIZENImageNativeBuffer".nativeClassEGL("TIZEN_image_native_buffer", postfix = TIZEN) {
    IntConstant(
        "NATIVE_BUFFER_TIZEN"..0x32A0
    )
}