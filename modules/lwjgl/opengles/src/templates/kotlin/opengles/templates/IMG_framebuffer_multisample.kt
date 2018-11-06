/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val IMG_framebuffer_downsample = "IMGFramebufferDownsample".nativeClassGLES("IMG_framebuffer_downsample", postfix = IMG) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces the ability to attach color buffers to a framebuffer that are at a lower resolution than the framebuffer itself, with the GPU
        automatically downsampling the color attachment to fit.

        This can be useful for various post-process rendering techniques where it is desirable to generate downsampled images in an efficient manner, or for a
        lower resolution post-process technique.

        This extension exposes at least a 2 x 2 downscale. Other downsampling modes may be exposed on the system and this can be queried.
        """

    IntConstant(
        "Returned by CheckFramebufferStatus.",

        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_AND_DOWNSAMPLE_IMG"..0x913C
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetInteger64v, and GetInternalFormativ.",

        "NUM_DOWNSAMPLE_SCALES_IMG"..0x913D
    )

    IntConstant(
        "Accepted by the {@code target} parameter of GetIntegerv, GetInteger64v, GetIntegeri_v, GetInteger64i_v and GetInternalFormativ.",

        "DOWNSAMPLE_SCALES_IMG"..0x913E
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.",

        "FRAMEBUFFER_ATTACHMENT_TEXTURE_SCALE_IMG"..0x913F
    )

    void(
        "FramebufferTexture2DDownsampleIMG",
        "",

        GLenum("target", ""),
        GLenum("attachment", ""),
        GLenum("textarget", ""),
        GLuint("texture", ""),
        GLint("level", ""),
        GLint("xscale", ""),
        GLint("yscale", "")
    )

    void(
        "FramebufferTextureLayerDownsampleIMG",
        "",

        GLenum("target", ""),
        GLenum("attachment", ""),
        GLuint("texture", ""),
        GLint("level", ""),
        GLint("layer", ""),
        GLint("xscale", ""),
        GLint("yscale", "")
    )
}