/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_ARB_extensions_string = "WGLARBExtensionsString".nativeClassWGL("WGL_ARB_extensions_string", ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a way for applications to determine which WGL extensions are supported by a device. This is the foundation upon which other WGL
        extensions are built.
        """

    charASCII.const.p(
        "GetExtensionsStringARB",
        """
        Returns a list of supported extensions to WGL. Although the contents of the string is implementation specific, the string will be #NULL terminated and
        will contain a space-separated list of extension names. (The extension names themselves do not contain spaces.) If there are no extensions then the
        empty string is returned.
        """,

        HDC.IN("hdc", "the device context to query extensions for")
    )

}