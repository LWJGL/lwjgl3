/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NOK_texture_from_pixmap = "NOKTextureFromPixmap".nativeClassEGL("NOK_texture_from_pixmap", postfix = NOK) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows a color buffer to be used for both rendering and texturing.

        EGL allows the use of color buffers of pbuffer drawables for texturing, this extension extends this to allow the use of color buffers of pixmaps too.
        Other types of drawables could be supported by future extensions layered on top of this extension, though only windows are really left which are
        problematic.

        The functionality of this extension is similar to WGL_ARB_render_texture which was incorporated into EGL 1.1. However, the purpose of this extension is
        not to provide "render to texture" like functionality but rather the ability to bind existing native drawables (for instance X pixmaps) to a texture.
        Though, there is nothing that prohibits it from being used for "render to texture".
        ${ul(
            "Windows are problematic as they can change size and therefore are not supported by this extension.",
            """
            Only a color buffer of a EGL pixmap created using an EGLConfig with attribute EGL_BIND_TO_TEXTURE_RGB or EGL_BIND_TO_TEXTURE_RGBA set to TRUE can
            be bound as a texture.
            """,
            """
            The texture internal format is determined when the color buffer is associated with the texture, guaranteeing that the color buffer format is
            equivalent to the texture internal format.
            """,
            "A client can create a complete set of mipmap images."
        )}

        Requires ${EGL11.core}.
        """

    IntConstant(
        "",

        "Y_INVERTED_NOK"..0x307F
    )
}