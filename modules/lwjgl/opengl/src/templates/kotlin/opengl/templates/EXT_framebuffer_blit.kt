/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_framebuffer_blit = "EXTFramebufferBlit".nativeClassGL("EXT_framebuffer_blit", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension modifies EXT_framebuffer_object by splitting the framebuffer object binding point into separate DRAW and READ bindings. This allows
        copying directly from one framebuffer to another. In addition, a new high performance blit function is added to facilitate these blits and perform some
        data conversion where allowed.

        ${GL30.promoted}
        """

    IntConstant(
        """
        Accepted by the {@code target} parameter of BindFramebufferEXT, CheckFramebufferStatusEXT, FramebufferTexture{1D|2D|3D}EXT, FramebufferRenderbufferEXT,
        and GetFramebufferAttachmentParameterivEXT.
        """,

        "READ_FRAMEBUFFER_EXT"..0x8CA8,
        "DRAW_FRAMEBUFFER_EXT"..0x8CA9
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.",

        "DRAW_FRAMEBUFFER_BINDING_EXT"..0x8CA6,
        "READ_FRAMEBUFFER_BINDING_EXT"..0x8CAA
    )

    void(
        "BlitFramebufferEXT",
        "",

        GLint("srcX0", ""),
        GLint("srcY0", ""),
        GLint("srcX1", ""),
        GLint("srcY1", ""),
        GLint("dstX0", ""),
        GLint("dstY0", ""),
        GLint("dstX1", ""),
        GLint("dstY1", ""),
        GLbitfield("mask", ""),
        GLenum("filter", "")
    )
}