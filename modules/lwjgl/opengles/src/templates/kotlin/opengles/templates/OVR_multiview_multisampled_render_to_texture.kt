/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OVR_multiview_multisampled_render_to_texture = "OVRMultiviewMultisampledRenderToTexture".nativeClassGLES("OVR_multiview_multisampled_render_to_texture", postfix = OVR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension brings to multiview rendering the functionality originally introduced in ${EXT_multisampled_render_to_texture.link}. Essentially this
        just means adding one new function for multisample multiview array attachments in the framebuffer object.
        """

    void(
        "FramebufferTextureMultisampleMultiviewOVR",
        """
        Operates similarly to #FramebufferTextureMultiviewOVR(), except that it also enables multisampled rendering into the images of a
        non-multisampled texture object similarly to #FramebufferTexture2DMultisampleEXT().
        """,

        GLenum("target", ""),
        GLenum("attachment", ""),
        GLuint("texture", ""),
        GLint("level", ""),
        GLsizei("samples", ""),
        GLint("baseViewIndex", ""),
        GLsizei("numViews", "")
    )
}