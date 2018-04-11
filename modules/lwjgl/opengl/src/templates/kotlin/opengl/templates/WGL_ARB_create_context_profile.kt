/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_ARB_create_context_profile = "WGLARBCreateContextProfile".nativeClassWGL("WGL_ARB_create_context_profile", ARB) {
    documentation =
        """
        Native bindings to the ${registryLink("WGL_ARB_create_context")} extension.

        Adds an attribute to ##WGLARBCreateContext, specifying the GL profile requested for a context of OpenGL 3.2 or later.

        Requires ${WGL_ARB_extensions_string.link} and ${GL32.core}.
        """

    IntConstant(
        "Accepted as an attribute name in {@code attribList}.",

        "CONTEXT_PROFILE_MASK_ARB"..0x9126
    )

    IntConstant(
        "Accepted as bits in the attribute value for #CONTEXT_PROFILE_MASK_ARB in {@code attribList}.",

        "CONTEXT_CORE_PROFILE_BIT_ARB"..0x00000001,
        "CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB"..0x00000002
    )

    IntConstant(
        "New errors returned by org.lwjgl.system.windows.WinBase#GetLastError().",

        "ERROR_INVALID_PROFILE_ARB"..0x2096
    ).noPrefix()

}