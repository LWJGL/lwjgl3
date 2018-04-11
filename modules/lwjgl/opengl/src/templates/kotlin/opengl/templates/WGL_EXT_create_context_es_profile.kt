/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_EXT_create_context_es_profile = "WGLEXTCreateContextESProfile".nativeClassWGL("WGL_EXT_create_context_es_profile", EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("WGL_EXT_create_context_es2_profile")} extension.

        This extension allows creating an OpenGL ES context.

        Requires ${WGL_ARB_extensions_string.link}, ${WGL_ARB_create_context.link}, ${WGL_ARB_create_context_profile.link} and an OpenGL ES implementation.
        """

    IntConstant(
        "Accepted as a bit in the attribute value for WGLARBCreateContextProfile#WGL_CONTEXT_PROFILE_MASK_ARB in {@code attribList}.",

        "CONTEXT_ES_PROFILE_BIT_EXT"..0x00000004
    )
}

val WGL_EXT_create_context_es2_profile = "WGLEXTCreateContextES2Profile".nativeClassWGL("WGL_EXT_create_context_es2_profile", EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows creating an OpenGL ES context.

        Requires ${WGL_ARB_extensions_string.link}, ${WGL_ARB_create_context.link}, ${WGL_ARB_create_context_profile.link} and an OpenGL ES implementation.
        """

    IntConstant(
        "Accepted as a bit in the attribute value for WGLARBCreateContextProfile#WGL_CONTEXT_PROFILE_MASK_ARB in {@code attribList}.",

        "CONTEXT_ES2_PROFILE_BIT_EXT"..0x00000004
    )
}