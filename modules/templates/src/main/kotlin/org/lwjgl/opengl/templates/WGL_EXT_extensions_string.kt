/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_EXT_extensions_string = "WGLEXTExtensionsString".nativeClassWGL("WGL_EXT_extensions_string", EXT) {
    documentation = "Native bindings to the ${registryLink("EXT", "wgl_extensions_string")} extension."

    const..charASCII_p(
        "GetExtensionsStringEXT",
        """
        Returns a list of supported extensions to WGL. Although the contents of the string is implementation specific, the string will be #NULL terminated and
        will contain a space-separated list of extension names. (The extension names themselves do not contain spaces.) If there are no extensions then the
        empty string is returned.
        """
    )

}