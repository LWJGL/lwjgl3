/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_EXT_extensions_string = "WGLEXTExtensionsString".nativeClassWGL("WGL_EXT_extensions_string", EXT) {
    charASCII.const.p(
        "GetExtensionsStringEXT",
        void()
    )

}