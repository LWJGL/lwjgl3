/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val KHR_context_flush_control = "KHRContextFlushControl".nativeClassGL("KHR_context_flush_control") {
    IntConstant(
        "CONTEXT_RELEASE_BEHAVIOR"..0x82FB
    )

    IntConstant(
        "CONTEXT_RELEASE_BEHAVIOR_FLUSH"..0x82FC
    )
}

val GLX_ARB_context_flush_control = "GLXARBContextFlushControl".nativeClassGLX("GLX_ARB_context_flush_control", ARB) {
    IntConstant(
        "CONTEXT_RELEASE_BEHAVIOR_ARB"..0x2097
    )

    IntConstant(
        "CONTEXT_RELEASE_BEHAVIOR_NONE_ARB"..0x0000,
        "CONTEXT_RELEASE_BEHAVIOR_FLUSH_ARB"..0x2098
    )
}

val WGL_ARB_context_flush_control = "WGLARBContextFlushControl".nativeClassWGL("WGL_ARB_context_flush_control", ARB) {
    IntConstant(
        "CONTEXT_RELEASE_BEHAVIOR_ARB"..0x2097
    )

    IntConstant(
        "CONTEXT_RELEASE_BEHAVIOR_NONE_ARB"..0x0000,
        "CONTEXT_RELEASE_BEHAVIOR_FLUSH_ARB"..0x2098
    )
}