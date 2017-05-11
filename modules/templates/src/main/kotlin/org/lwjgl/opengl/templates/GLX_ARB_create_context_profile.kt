/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_ARB_create_context_profile = "GLXARBCreateContextProfile".nativeClassGLX("GLX_ARB_create_context_profile", ARB) {
    documentation =
        """
        Native bindings to the ${registryLink("ARB", "glx_create_context")} extension.

        Adds an attribute to ##GLXARBCreateContext, specifying the GL profile requested for a context of OpenGL 3.2 or later.

        Requires ${GLX14.glx} and ${GL32.core}.
        """

    IntConstant(
        "Accepted as an attribute name in {@code attrib_list}.",

        "CONTEXT_PROFILE_MASK_ARB"..0x9126
    )

    IntConstant(
        "Accepted as bits in the attribute value for #CONTEXT_PROFILE_MASK_ARB in {@code attrib_list}.",

        "CONTEXT_CORE_PROFILE_BIT_ARB"..0x00000001,
        "CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB"..0x00000002
    )

    IntConstant(
        "GLX error.",

        "GLXBadProfileARB".."13"
    ).noPrefix()

}