/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OVR_multiview_multisampled_render_to_texture = "OVRMultiviewMultisampledRenderToTexture".nativeClassGLES("OVR_multiview_multisampled_render_to_texture", postfix = OVR) {
    documentation =
        """
        Native bindings to the ${registryLink("OVR", "multiview_multisampled_render_to_texture")} extension.

        This extension brings to multiview rendering the functionality originally introduced in ${EXT_multisampled_render_to_texture.link}. Essentially this
        just means adding one new function for multisample multiview array attachments in the framebuffer object.
        """

    void(
        "FramebufferTextureMultisampleMultiviewOVR",
        """
        Operates similarly to #FramebufferTextureMultiviewOVR(), except that it also enables multisampled rendering into the images of a
        non-multisampled texture object similarly to #FramebufferTexture2DMultisampleEXT().
        """,

        GLenum.IN("target", ""),
        GLenum.IN("attachment", ""),
        GLuint.IN("texture", ""),
        GLint.IN("level", ""),
        GLsizei.IN("samples", ""),
        GLint.IN("baseViewIndex", ""),
        GLsizei.IN("numViews", "")
    )
}