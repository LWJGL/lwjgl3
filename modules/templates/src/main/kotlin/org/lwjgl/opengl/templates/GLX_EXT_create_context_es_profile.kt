/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_EXT_create_context_es_profile = "GLXEXTCreateContextESProfile".nativeClassGLX("GLX_EXT_create_context_es_profile", EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "glx_create_context_es2_profile")} extension.

        This extension allows creating an OpenGL ES context.

        Requires ${GLX14.glx}, ${GLX_ARB_create_context.link}, ${GLX_ARB_create_context_profile.link} and an OpenGL ES implemenation.
        """

    IntConstant(
        "Accepted as a bit in the attribute value for GLXARBCreateContextProfile#GLX_CONTEXT_PROFILE_MASK_ARB in {@code attrib_list}.",

        "CONTEXT_ES_PROFILE_BIT_EXT"..0x00000004
    )
}

val GLX_EXT_create_context_es2_profile = "GLXEXTCreateContextES2Profile".nativeClassGLX("GLX_EXT_create_context_es2_profile", EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "glx_create_context_es2_profile")} extension.

        This extension allows creating an OpenGL ES context.

        Requires ${GLX14.glx}, ${GLX_ARB_create_context.link}, ${GLX_ARB_create_context_profile.link} and an OpenGL ES implemenation.
        """

    IntConstant(
        "Accepted as a bit in the attribute value for GLXARBCreateContextProfile#GLX_CONTEXT_PROFILE_MASK_ARB in {@code attrib_list}.",

        "CONTEXT_ES2_PROFILE_BIT_EXT"..0x00000004
    )
}