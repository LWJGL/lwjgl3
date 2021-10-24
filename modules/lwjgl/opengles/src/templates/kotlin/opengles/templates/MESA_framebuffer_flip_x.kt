/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val MESA_framebuffer_flip_x = "MESAFramebufferFlipX".nativeClassGLES("MESA_framebuffer_flip_x", postfix = MESA) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines a new framebuffer parameter, #FRAMEBUFFER_FLIP_X_MESA, that changes the behavior of the reads and writes to the framebuffer
        attachment points. When {@code GL_FRAMEBUFFER_FLIP_X_MESA} is #TRUE, render commands and pixel transfer operations access the backing store of each
        attachment point with an x-inverted coordinate system. This x-inversion is relative to the coordinate system set when
        {@code GL_FRAMEBUFFER_FLIP_X_MESA} is #FALSE.

        Access through #TexSubImage2D() and similar calls will notice the effect of the flip when they are not attached to framebuffer objects because
        {@code GL_FRAMEBUFFER_FLIP_X_MESA} is associated with the framebuffer object and not the attachment points.

        This extension is mainly for pre-rotation and recommended to use it with {@code MESA_framebuffer_flip_y} and {@code MESA_framebuffer_swap_xy} to have
        rotated result.
        
        Requires ${GLES31.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} argument of #FramebufferParameteri() and #GetFramebufferParameteriv().",

        "FRAMEBUFFER_FLIP_X_MESA"..0x8BBC
    )
}