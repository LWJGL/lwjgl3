/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_ATI_render_texture_rectangle = "WGLATIRenderTextureRectangle".nativeClassWGL("WGL_ATI_render_texture_rectangle", postfix = ATI) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension builds upon ${WGL_ARB_render_texture.link} and allows a pbuffer to be bound to a texture rectangle target.

        Requires ${WGL_ARB_render_texture.link} and ${ARB_texture_rectangle.link}.
        """

    IntConstant(
        """
        Accepted as a value in the {@code piAttribList} parameter of wglCreatePbufferARB and returned in the value parameter of wglQueryPbufferARB when
        {@code iAttribute} is WGL_TEXTURE_TARGET_ARB.
        """,

        "TEXTURE_RECTANGLE_ATI"..0x21A5
    )
}