/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX11 = "GLX11".nativeClassGLX("GLX11") {
    extends = GLX
    IntConstant(
        "VENDOR"..0x1,
        "VERSION"..0x2,
        "EXTENSIONS"..0x3
    )

    charASCII.const.p(
        "QueryExtensionsString",

        DISPLAY,
        int("screen")
    )

    charASCII.const.p(
        "GetClientString",

        DISPLAY,
        int("name")
    )

    charASCII.const.p(
        "QueryServerString",

        DISPLAY,
        int("screen"),
        int("name")
    )
}