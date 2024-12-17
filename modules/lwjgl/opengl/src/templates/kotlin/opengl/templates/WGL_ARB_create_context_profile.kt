/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_ARB_create_context_profile = "WGLARBCreateContextProfile".nativeClassWGL("WGL_ARB_create_context_profile", ARB) {
    IntConstant(
        "CONTEXT_PROFILE_MASK_ARB"..0x9126
    )

    IntConstant(
        "CONTEXT_CORE_PROFILE_BIT_ARB"..0x00000001,
        "CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB"..0x00000002
    )

    IntConstant(
        "ERROR_INVALID_PROFILE_ARB"..0x2096
    ).noPrefix()

}