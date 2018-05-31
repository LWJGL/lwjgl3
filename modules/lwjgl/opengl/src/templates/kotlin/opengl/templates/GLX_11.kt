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
    documentation = "Native bindings to GLX 1.1."

    IntConstant(
        "Names for attributes to #GetClientString().",

        "VENDOR"..0x1,
        "VERSION"..0x2,
        "EXTENSIONS"..0x3
    )

    charASCII.const.p(
        "QueryExtensionsString",
        "Returns a string describing which GLX extensions are supported on the connection.",

        DISPLAY,
        int.IN("screen", "the screen number")
    )

    charASCII.const.p(
        "GetClientString",
        "Returns a pointer to a string describing some aspect of the client library.",

        DISPLAY,
        int.IN("name", "the string to query")
    )

    charASCII.const.p(
        "QueryServerString",
        "Returns a pointer to a string describing some aspect of the server's GLX extension.",

        DISPLAY,
        int.IN("screen", "the screen number"),
        int.IN("name", "the string to query")
    )
}