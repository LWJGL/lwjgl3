/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_discard_framebuffer = "EXTDiscardFramebuffer".nativeClassGLES("EXT_discard_framebuffer", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a new command, DiscardFramebufferEXT, which causes the contents of the named framebuffer attachable images to become undefined.
        The contents of the specified buffers are undefined until a subsequent operation modifies the content, and only the modified region is guaranteed to
        hold valid content. Effective usage of this command may provide an implementation with new optimization opportunities.

        Some OpenGL ES implementations cache framebuffer images in a small pool of fast memory. Before rendering, these implementations must load the existing
        contents of one or more of the logical buffers (color, depth, stencil, etc.) into this memory. After rendering, some or all of these buffers are
        likewise stored back to external memory so their contents can be used again in the future. In many applications, some or all of the logical buffers are
        cleared at the start of rendering. If so, the effort to load or store those buffers is wasted.

        Even without this extension, if a frame of rendering begins with a full- screen Clear, an OpenGL ES implementation may optimize away the loading of
        framebuffer contents prior to rendering the frame. With this extension, an application can use DiscardFramebufferEXT to signal that framebuffer
        contents will no longer be needed. In this case an OpenGL ES implementation may also optimize away the storing back of framebuffer contents after
        rendering the frame.

        Requires ${GLES20.core}
        """

    IntConstant(
        "Accepted in the {@code attachments} parameter of DiscardFramebufferEXT when the default framebuffer is bound to {@code target}.",

        "COLOR_EXT"..0x1800,
        "DEPTH_EXT"..0x1801,
        "STENCIL_EXT"..0x1802
    )

    void(
        "DiscardFramebufferEXT",
        "",

        GLenum.IN("target", ""),
        AutoSize("attachments")..GLsizei.IN("numAttachments", ""),
        SingleValue("attachment")..const..GLenum_p.IN("attachments", "")
    )
}