/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_create_context_no_error = "KHRCreateContextNoError".nativeClassEGL("KHR_create_context_no_error", postfix = KHR) {
    IntConstant(
        "CONTEXT_OPENGL_NO_ERROR_KHR"..0x31B3
    )
}