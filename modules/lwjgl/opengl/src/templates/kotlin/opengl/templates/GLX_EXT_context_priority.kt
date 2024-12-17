/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_EXT_context_priority = "GLXEXTContextPriority".nativeClassGLX("GLX_EXT_context_priority", EXT) {
    IntConstant(
        "CONTEXT_PRIORITY_LEVEL_EXT"..0x3100
    )

    IntConstant(
        "CONTEXT_PRIORITY_HIGH_EXT"..0x3101,
        "CONTEXT_PRIORITY_MEDIUM_EXT"..0x3102,
        "CONTEXT_PRIORITY_LOW_EXT"..0x3103
    )
}