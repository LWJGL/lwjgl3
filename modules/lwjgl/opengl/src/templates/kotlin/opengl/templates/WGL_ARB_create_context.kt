/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_ARB_create_context = "WGLARBCreateContext".nativeClassWGL("WGL_ARB_create_context", ARB) {
    IntConstant(
        "CONTEXT_MAJOR_VERSION_ARB"..0x2091,
        "CONTEXT_MINOR_VERSION_ARB"..0x2092,
        "CONTEXT_LAYER_PLANE_ARB"..0x2093,
        "CONTEXT_FLAGS_ARB"..0x2094
    )

    IntConstant(
        "CONTEXT_DEBUG_BIT_ARB"..0x0001,
        "CONTEXT_FORWARD_COMPATIBLE_BIT_ARB"..0x0002
    )

    IntConstant(
        "ERROR_INVALID_VERSION_ARB"..0x2095
    ).noPrefix()

    HGLRC(
        "CreateContextAttribsARB",

        HDC("hdc"),
        nullable..HGLRC("shareContext"),
        NullTerminated..nullable..int.const.p("attribList")
    )
}