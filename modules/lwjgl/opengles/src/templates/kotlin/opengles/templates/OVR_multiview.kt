/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OVR_multiview = "OVRMultiview".nativeClassGLES("OVR_multiview", postfix = OVR) {
    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR"..0x9630,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR"..0x9632
    )

    IntConstant(
        "MAX_VIEWS_OVR"..0x9631
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR"..0x9633
    )

    void(
        "FramebufferTextureMultiviewOVR",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level"),
        GLint("baseViewIndex"),
        GLsizei("numViews")
    )

    DependsOn("hasDSA(ext)")..void(
        "NamedFramebufferTextureMultiviewOVR",

        GLuint("framebuffer"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level"),
        GLint("baseViewIndex"),
        GLsizei("numViews")
    )
}