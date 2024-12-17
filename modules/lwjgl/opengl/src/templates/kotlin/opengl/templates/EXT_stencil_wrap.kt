/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_stencil_wrap = "EXTStencilWrap".nativeClassGL("EXT_stencil_wrap", postfix = EXT) {
    IntConstant(
        "INCR_WRAP_EXT"..0x8507,
        "DECR_WRAP_EXT"..0x8508
    )
}