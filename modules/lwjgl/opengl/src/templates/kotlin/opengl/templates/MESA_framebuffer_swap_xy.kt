/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val MESA_framebuffer_swap_xy = "MESAFramebufferSwapXY".nativeClassGL("MESA_framebuffer_swap_xy", postfix = MESA) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines a new framebuffer parameter, #FRAMEBUFFER_SWAP_XY_MESA, that changes the behavior of the reads and writes to the framebuffer
        attachment points. When {@code GL_FRAMEBUFFER_SWAP_XY_MESA} is #TRUE, render commands and pixel transfer operations access the backing store of each
        attachment point with an xy-swapped coordinate system. This xy-inversion is relative to the coordinate system set when
        {@code GL_FRAMEBUFFER_SWAP_XY_MESA} is #FALSE.

        Access through #TexSubImage2D() and similar calls will notice the effect of the swap when they are not attached to framebuffer objects because
        {@code GL_FRAMEBUFFER_SWAP_XY_MESA} is associated with the framebuffer object and not the attachment points.

        The application should notice the display width and height are also swapped when {@code GL_FRAMEBUFFER_SWAP_XY_MESA} is {@code GL_TRUE}.

        This extension is mainly for pre-rotation and recommended to use it with {@code MESA_framebuffer_flip_x} and {@code MESA_framebuffer_flip_y} to have
        rotated result.
        
        Requires ${GL43.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} argument of #FramebufferParameteri() and #GetFramebufferParameteriv().",

        "FRAMEBUFFER_SWAP_XY_MESA"..0x8BBD
    )
}