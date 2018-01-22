/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val ANGLE_framebuffer_multisample = "ANGLEFramebufferMultisample".nativeClassGLES("ANGLE_framebuffer_multisample", postfix = ANGLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension extends the framebuffer object framework to enable multisample rendering.

        The new operation RenderbufferStorageMultisampleANGLE() allocates storage for a renderbuffer object that can be used as a multisample buffer. A
        multisample render buffer image differs from a single-sample render buffer image in that a multisample image has a number of SAMPLES that is greater
        than zero. No method is provided for creating multisample texture images.

        All of the framebuffer-attachable images attached to a framebuffer object must have the same number of SAMPLES or else the framebuffer object is not
        "framebuffer complete". If a framebuffer object with multisample attachments is "framebuffer complete", then the framebuffer object behaves as if
        SAMPLE_BUFFERS is one.

        The resolve operation is affected by calling BlitFramebufferANGLE (provided by the ANGLE_framebuffer_blit extension) where the source is a multisample
        application-created framebuffer object and the destination is a single-sample framebuffer object (either application-created or window-system
        provided).

        Requires ${GLES20.core} and ${ANGLE_framebuffer_blit.link}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.",

        "RENDERBUFFER_SAMPLES_ANGLE"..0x8CAB
    )

    IntConstant(
        "Returned by CheckFramebufferStatus.",

        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_ANGLE"..0x8D56
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "MAX_SAMPLES_ANGLE"..0x8D57
    )

    void(
        "RenderbufferStorageMultisampleANGLE",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("samples", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )
}