/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_NV_render_depth_texture = "WGLNVRenderDepthTexture".nativeClassWGL("WGL_NV_render_depth_texture", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows a depth buffer to be used for both rendering and texturing. It is built upon the ARB_render_texture extension; the only addition
        in this extension is the ability to use a depth buffer as a DEPTH_COMPONENT texture map.
        """

    IntConstant(
        """
        Accepted by the {@code piAttributes} parameter of wglGetPixelFormatAttribivARB, wglGetPixelFormatAttribfvARB, and the {@code piAttribIList} and
        {@code pfAttribIList} parameters of wglChoosePixelFormatARB.
        """,

        "BIND_TO_TEXTURE_DEPTH_NV"..0x20A3,
        "BIND_TO_TEXTURE_RECTANGLE_DEPTH_NV"..0x20A4
    )

    IntConstant(
        "Accepted by the {@code piAttribList} parameter of wglCreatePbufferARB and by the {@code iAttribute} parameter of wglQueryPbufferARB.",

        "DEPTH_TEXTURE_FORMAT_NV"..0x20A5
    )

    IntConstant(
        """
        Accepted as a value in the {@code piAttribList} parameter of wglCreatePbufferARB and returned in the value parameter of wglQueryPbufferARB when
        {@code iAttribute} is WGL_DEPTH_TEXTURE_FORMAT_NV.
        """,

        "TEXTURE_DEPTH_COMPONENT_NV"..0x20A6,
        "NO_TEXTURE_ARB"..0x2077
    )

    IntConstant(
        "Accepted by the {@code iBuffer} parameter of wglBindTexImageARB.",

        "DEPTH_COMPONENT_NV"..0x20A7
    )
}