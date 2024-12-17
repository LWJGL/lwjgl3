/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val KHR_no_error = "KHRNoError".nativeClassGLES("KHR_no_error", postfix = KHR) {
    IntConstant(
        "CONTEXT_FLAG_NO_ERROR_BIT_KHR"..0x00000008
    )
}