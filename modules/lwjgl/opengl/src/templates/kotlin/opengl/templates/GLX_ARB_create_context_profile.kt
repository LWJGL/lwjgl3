/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_ARB_create_context_profile = "GLXARBCreateContextProfile".nativeClassGLX("GLX_ARB_create_context_profile", ARB) {
    IntConstant(
        "CONTEXT_PROFILE_MASK_ARB"..0x9126
    )

    IntConstant(
        "CONTEXT_CORE_PROFILE_BIT_ARB"..0x00000001,
        "CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB"..0x00000002
    )

    IntConstant(
        "GLXBadProfileARB".."13"
    ).noPrefix()

}