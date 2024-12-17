/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_ARB_extensions_string = "WGLARBExtensionsString".nativeClassWGL("WGL_ARB_extensions_string", ARB) {
    charASCII.const.p(
        "GetExtensionsStringARB",

        HDC("hdc")
    )

}