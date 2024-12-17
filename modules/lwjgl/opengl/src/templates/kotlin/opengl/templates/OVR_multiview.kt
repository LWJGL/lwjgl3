/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val OVR_multiview = "OVRMultiview".nativeClassGL("OVR_multiview", postfix = OVR) {
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

    val FramebufferTextureLayer = GL30["FramebufferTextureLayer"]

    void(
        "FramebufferTextureMultiviewOVR",

        FramebufferTextureLayer["target"],
        FramebufferTextureLayer["attachment"],
        FramebufferTextureLayer["texture"],
        FramebufferTextureLayer["level"],
        GLint("baseViewIndex"),
        GLsizei("numViews")
    )

    val NamedFramebufferTextureLayer = GL45["NamedFramebufferTextureLayer"]

    DependsOn("hasDSA(ext)")..void(
        "NamedFramebufferTextureMultiviewOVR",

        NamedFramebufferTextureLayer["framebuffer"],
        NamedFramebufferTextureLayer["attachment"],
        NamedFramebufferTextureLayer["texture"],
        NamedFramebufferTextureLayer["level"],
        GLint("baseViewIndex"),
        GLsizei("numViews")
    )
}
