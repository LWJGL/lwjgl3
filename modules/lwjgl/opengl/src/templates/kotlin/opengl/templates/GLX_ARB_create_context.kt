/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_ARB_create_context = "GLXARBCreateContext".nativeClassGLX("GLX_ARB_create_context", ARB) {
    IntConstant(
        "CONTEXT_MAJOR_VERSION_ARB"..0x2091,
        "CONTEXT_MINOR_VERSION_ARB"..0x2092,
        "CONTEXT_FLAGS_ARB"..0x2094
    )

    IntConstant(
        "CONTEXT_DEBUG_BIT_ARB"..0x0001,
        "CONTEXT_FORWARD_COMPATIBLE_BIT_ARB"..0x0002
    )

    GLXContext(
        "CreateContextAttribsARB",

        DISPLAY,
        GLXFBConfig("config"),
        nullable..GLXContext("share_context"),
        Bool("direct"),
        nullable..NullTerminated..int.const.p("attrib_list")
    )

}