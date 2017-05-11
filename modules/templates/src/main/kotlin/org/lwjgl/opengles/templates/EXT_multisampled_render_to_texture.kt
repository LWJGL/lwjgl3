/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_multisampled_render_to_texture = "EXTMultisampledRenderToTexture".nativeClassGLES("EXT_multisampled_render_to_texture", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces functionality to perform multisampled rendering to a color renderable texture, without requiring an explicit resolve of
        multisample data.

        Some GPU architectures - such as tile-based renderers - are capable of performing multisampled rendering by storing multisample data in internal
        high-speed memory and downsampling the data when writing out to external memory after rendering has finished. Since per-sample data is never written
        out to external memory, this approach saves bandwidth and storage space. In this case multisample data gets discarded, however this is acceptable in
        most cases.

        The extension provides a new command, FramebufferTexture2DMultisampleEXT, which attaches a texture level to a framebuffer and enables multisampled
        rendering to that texture level.

        When the texture level is flushed or used as a source or destination for any operation other than drawing to it, an implicit resolve of multisampled
        color data may be performed. After such a resolve, the multisampled color data is discarded.

        In order to allow the use of multisampled depth and stencil buffers when performing multisampled rendering to a texture, the extension also adds the
        command RenderbufferStorageMultisampleEXT.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.",

        "RENDERBUFFER_SAMPLES_EXT"..0x8CAB
    )

    IntConstant(
        "Returned by CheckFramebufferStatus.",

        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT"..0x8D56
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "MAX_SAMPLES_EXT"..0x8D57
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.",

        "FRAMEBUFFER_ATTACHMENT_TEXTURE_SAMPLES_EXT"..0x8D6C
    )

    void(
        "RenderbufferStorageMultisampleEXT",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("samples", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "FramebufferTexture2DMultisampleEXT",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLenum.IN("textarget", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLsizei.IN("samples", "")
    )
}