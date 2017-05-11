/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

val GLX11 = "GLX11".nativeClassGLX("GLX11") {
    documentation = "Native bindings to GLX 1.1."

    IntConstant(
        "Names for attributes to #GetClientString().",

        "VENDOR"..0x1,
        "VERSION"..0x2,
        "EXTENSIONS"..0x3
    )

    const..charASCII_p(
        "QueryExtensionsString",
        "Returns a string describing which GLX extensions are supported on the connection.",

        DISPLAY,
        int.IN("screen", "the screen number")
    )

    const..charASCII_p(
        "GetClientString",
        "Returns a pointer to a string describing some aspect of the client library.",

        DISPLAY,
        int.IN("name", "the string to query")
    )

    const..charASCII_p(
        "QueryServerString",
        "Returns a pointer to a string describing some aspect of the server's GLX extension.",

        DISPLAY,
        int.IN("screen", "the screen number"),
        int.IN("name", "the string to query")
    )

}