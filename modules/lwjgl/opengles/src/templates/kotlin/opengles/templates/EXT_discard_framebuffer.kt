/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_discard_framebuffer = "EXTDiscardFramebuffer".nativeClassGLES("EXT_discard_framebuffer", postfix = EXT) {
    IntConstant(
        "COLOR_EXT"..0x1800,
        "DEPTH_EXT"..0x1801,
        "STENCIL_EXT"..0x1802
    )

    void(
        "DiscardFramebufferEXT",

        GLenum("target"),
        AutoSize("attachments")..GLsizei("numAttachments"),
        SingleValue("attachment")..GLenum.const.p("attachments")
    )
}