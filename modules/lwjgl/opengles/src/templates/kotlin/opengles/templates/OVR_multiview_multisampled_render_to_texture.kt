/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OVR_multiview_multisampled_render_to_texture = "OVRMultiviewMultisampledRenderToTexture".nativeClassGLES("OVR_multiview_multisampled_render_to_texture", postfix = OVR) {
    void(
        "FramebufferTextureMultisampleMultiviewOVR",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level"),
        GLsizei("samples"),
        GLint("baseViewIndex"),
        GLsizei("numViews")
    )
}