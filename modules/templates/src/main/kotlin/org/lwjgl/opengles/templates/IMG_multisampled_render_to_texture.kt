/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val IMG_multisampled_render_to_texture = "IMGMultisampledRenderToTexture".nativeClassGLES("IMG_multisampled_render_to_texture", postfix = IMG) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces functionality to perform multisampled rendering to a color renderable texture, without requiring an explicit resolve of
        multisample data.

        Some GPU architectures - such as tile-based renderers - are capable of performing multisampled rendering by storing multisample data in internal
        high-speed memory and downsampling the data when writing out to external memory after rendering has finished. Since per-sample data is never written
        out to external memory, this approach saves bandwidth and storage space. In this case multisample data gets discarded, however this is acceptable in
        most cases.

        The extension provides a new command, FramebufferTexture2DMultisampleIMG, which attaches a texture level to a framebuffer and enables multisampled
        rendering to that texture level.

        When the texture level is used as a source or destination for any operation other than drawing to it, an implicit resolve of multisampled color data is
        performed. After such a resolve, the multisampled color data is discarded.

        In order to allow the use of multisampled depth and stencil buffers when performing multisampled rendering to a texture, the extension also adds the
        command RenderbufferStorageMultisampleIMG.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.",

        "RENDERBUFFER_SAMPLES_IMG"..0x9133
    )

    IntConstant(
        "Returned by CheckFramebufferStatus.",

        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_IMG"..0x9134
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_SAMPLES_IMG"..0x9135
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.",

        "TEXTURE_SAMPLES_IMG"..0x9136
    )

    void(
        "RenderbufferStorageMultisampleIMG",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("samples", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )

    void(
        "FramebufferTexture2DMultisampleIMG",
        "",

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLenum.IN("textarget", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLsizei.IN("samples", "")
    )
}