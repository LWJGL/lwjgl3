/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val KHR_no_error = "KHRNoError".nativeClassGL("KHR_no_error") {
    IntConstant(
        "CONTEXT_FLAG_NO_ERROR_BIT_KHR"..0x00000008
    )
}