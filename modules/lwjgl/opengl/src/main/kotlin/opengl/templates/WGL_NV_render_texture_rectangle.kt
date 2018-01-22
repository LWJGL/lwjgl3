/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_NV_render_texture_rectangle = "WGLNVRenderTextureRectangle".nativeClassWGL("WGL_NV_render_texture_rectangle", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows a color buffer with non-power-of-two dimensions to be used for both rendering and texturing. It is built upon the
        ARB_render_texture extension; the only addition in this extension is the ability to bind a texture to a texture rectangle target, as provided through
        the NV_texture_rectangle extension.
        """

    IntConstant(
        """
        Accepted by the {@code piAttributes} parameter of wglGetPixelFormatAttribivARB, wglGetPixelFormatAttribfvARB, and the {@code piAttribIList} and
        {@code pfAttribIList} parameters of wglChoosePixelFormatARB.
        """,

        "BIND_TO_TEXTURE_RECTANGLE_RGB_NV"..0x20A0,
        "BIND_TO_TEXTURE_RECTANGLE_RGBA_NV"..0x20A1
    )

    IntConstant(
        """
        Accepted as a value in the {@code piAttribList} parameter of wglCreatePbufferARB and returned in the value parameter of wglQueryPbufferARB when
        {@code iAttribute} is WGL_TEXTURE_TARGET_ARB.
        """,

        "TEXTURE_RECTANGLE_NV"..0x20A2
    )
}