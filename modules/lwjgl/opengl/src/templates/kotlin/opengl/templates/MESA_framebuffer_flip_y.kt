/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val MESA_framebuffer_flip_y = "MESAFramebufferFlipY".nativeClassGL("MESA_framebuffer_flip_y", postfix = MESA) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines a new framebuffer parameter, #FRAMEBUFFER_FLIP_Y_MESA, that changes the behavior of the reads and writes to the framebuffer
        attachment points. When {@code GL_FRAMEBUFFER_FLIP_Y_MESA} is #TRUE, render commands and pixel transfer operations access the backing store of each
        attachment point with an y-inverted coordinate system. This y-inversion is relative to the coordinate system set when
        {@code GL_FRAMEBUFFER_FLIP_Y_MESA} is #FALSE.

        Access through #TexSubImage2D() and similar calls will notice the effect of the flip when they are not attached to framebuffer objects because
        {@code GL_FRAMEBUFFER_FLIP_Y_MESA} is associated with the framebuffer object and not the attachment points.
        
        Requires ${GL43.core} or ${ARB_framebuffer_no_attachments.link}.
        """

    IntConstant(
        "Accepted by the {@code pname} argument of #FramebufferParameteriMESA() and #GetFramebufferParameterivMESA().",

        "FRAMEBUFFER_FLIP_Y_MESA"..0x8BBB
    )

    void(
        "FramebufferParameteriMESA",
        "",

        GLenum("target", ""),
        GLenum("pname", ""),
        GLint("param", "")
    )

    void(
        "GetFramebufferParameterivMESA",
        "",

        GLenum("target", ""),
        GLenum("pname", ""),
        Check(1)..GLint.p("params", "")
    )
}