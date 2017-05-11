/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val APPLE_framebuffer_multisample = "APPLEFramebufferMultisample".nativeClassGLES("APPLE_framebuffer_multisample", postfix = APPLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension extends the framebuffer object framework to enable multisample rendering.

        The new operation RenderbufferStorageMultisampleAPPLE() allocates storage for a renderbuffer object that can be used as a multisample buffer. A
        multisample render buffer image differs from a single-sample render buffer image in that a multisample image has a number of SAMPLES that is greater
        than zero. No method is provided for creating multisample texture images.

        All of the framebuffer-attachable images attached to a framebuffer object must have the same number of SAMPLES or else the framebuffer object is not
        "framebuffer complete". If a framebuffer object with multisample attachments is "framebuffer complete", then the framebuffer object behaves as if
        SAMPLE_BUFFERS is one.

        The resolve operation is affected by calling ResolveMultisampleFramebufferAPPLE where the source is a multisample application-created framebuffer
        object and the destination is a single-sample framebuffer object. Separate read and draw framebuffer object binding points are established to
        facilitate the resolve.

        Scissoring may be used in conjunction with ResolveMultisampleFramebufferAPPLE to resolve only a portion of the framebuffer.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.",

        "RENDERBUFFER_SAMPLES_APPLE"..0x8CAB
    )

    IntConstant(
        "Returned by CheckFramebufferStatus.",

        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_APPLE"..0x8D56
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "MAX_SAMPLES_APPLE"..0x8D57
    )

    IntConstant(
        """
        Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture2D, FramebufferRenderbuffer, and
        GetFramebufferAttachmentParameteriv.
        """,

        "READ_FRAMEBUFFER_APPLE"..0x8CA8,
        "DRAW_FRAMEBUFFER_APPLE"..0x8CA9
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "DRAW_FRAMEBUFFER_BINDING_APPLE"..0x8CA6,
        "READ_FRAMEBUFFER_BINDING_APPLE"..0x8CAA
    )

    void(
        "RenderbufferStorageMultisampleAPPLE",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("samples", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "ResolveMultisampleFramebufferAPPLE",
        ""
    )
}