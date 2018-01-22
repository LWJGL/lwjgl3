/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val ANGLE_framebuffer_blit = "ANGLEFramebufferBlit".nativeClassGLES("ANGLE_framebuffer_blit", postfix = ANGLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension modifies framebuffer objects by splitting the framebuffer object binding point into separate DRAW and READ bindings. This allows copying
        directly from one framebuffer to another. In addition, a new high performance blit function is added to facilitate these blits and perform some data
        conversion where allowed.

        Requires ${GLES20.core}.
        """

    IntConstant(
        """
        Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture2D, FramebufferTexture3DOES,
        FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.
        """,

        "READ_FRAMEBUFFER_ANGLE"..0x8CA8,
        "DRAW_FRAMEBUFFER_ANGLE"..0x8CA9
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetIntegerv and GetFloatv.",

        "DRAW_FRAMEBUFFER_BINDING_ANGLE"..0x8CA6,
        "READ_FRAMEBUFFER_BINDING_ANGLE"..0x8CAA
    )

    void(
        "BlitFramebufferANGLE",
        "",

        GLint.IN("srcX0", ""),
        GLint.IN("srcY0", ""),
        GLint.IN("srcX1", ""),
        GLint.IN("srcY1", ""),
        GLint.IN("dstX0", ""),
        GLint.IN("dstY0", ""),
        GLint.IN("dstX1", ""),
        GLint.IN("dstY1", ""),
        GLbitfield.IN("mask", ""),
        GLenum.IN("filter", "")
    )
}