/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_framebuffer_no_attachments = "ARBFramebufferNoAttachments".nativeClassGL("ARB_framebuffer_no_attachments") {
    IntConstant(
        "FRAMEBUFFER_DEFAULT_WIDTH"..0x9310,
        "FRAMEBUFFER_DEFAULT_HEIGHT"..0x9311,
        "FRAMEBUFFER_DEFAULT_LAYERS"..0x9312,
        "FRAMEBUFFER_DEFAULT_SAMPLES"..0x9313,
        "FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS"..0x9314
    )

    IntConstant(
        "MAX_FRAMEBUFFER_WIDTH"..0x9315,
        "MAX_FRAMEBUFFER_HEIGHT"..0x9316,
        "MAX_FRAMEBUFFER_LAYERS"..0x9317,
        "MAX_FRAMEBUFFER_SAMPLES"..0x9318
    )

    reuse(GL43C, "FramebufferParameteri")
    reuse(GL43C, "GetFramebufferParameteriv")

    var src = GL43C["FramebufferParameteri"]
    DependsOn("GL_EXT_direct_state_access")..void(
        "NamedFramebufferParameteriEXT",

        GLuint("framebuffer"),
        src["pname"],
        src["param"]
    )

    src = GL43C["GetFramebufferParameteriv"]
    DependsOn("GL_EXT_direct_state_access", postfix = "EXT")..void(
        "GetNamedFramebufferParameterivEXT",

        GLuint("framebuffer"),
        src["pname"],
        src["params"]
    )
}