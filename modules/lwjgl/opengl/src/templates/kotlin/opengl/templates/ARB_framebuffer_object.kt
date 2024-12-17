/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_framebuffer_object = "ARBFramebufferObject".nativeClassGL("ARB_framebuffer_object") {
    IntConstant(
        "FRAMEBUFFER"..0x8D40,
        "READ_FRAMEBUFFER"..0x8CA8,
        "DRAW_FRAMEBUFFER"..0x8CA9
    )

    IntConstant(
        "RENDERBUFFER"..0x8D41
    )

    IntConstant(
        "STENCIL_INDEX1"..0x8D46,
        "STENCIL_INDEX4"..0x8D47,
        "STENCIL_INDEX8"..0x8D48,
        "STENCIL_INDEX16"..0x8D49
    )

    IntConstant(
        "RENDERBUFFER_WIDTH"..0x8D42,
        "RENDERBUFFER_HEIGHT"..0x8D43,
        "RENDERBUFFER_INTERNAL_FORMAT"..0x8D44,
        "RENDERBUFFER_RED_SIZE"..0x8D50,
        "RENDERBUFFER_GREEN_SIZE"..0x8D51,
        "RENDERBUFFER_BLUE_SIZE"..0x8D52,
        "RENDERBUFFER_ALPHA_SIZE"..0x8D53,
        "RENDERBUFFER_DEPTH_SIZE"..0x8D54,
        "RENDERBUFFER_STENCIL_SIZE"..0x8D55,
        "RENDERBUFFER_SAMPLES"..0x8CAB
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE"..0x8CD0,
        "FRAMEBUFFER_ATTACHMENT_OBJECT_NAME"..0x8CD1,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL"..0x8CD2,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE"..0x8CD3,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER"..0x8CD4,
        "FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING"..0x8210,
        "FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE"..0x8211,
        "FRAMEBUFFER_ATTACHMENT_RED_SIZE"..0x8212,
        "FRAMEBUFFER_ATTACHMENT_GREEN_SIZE"..0x8213,
        "FRAMEBUFFER_ATTACHMENT_BLUE_SIZE"..0x8214,
        "FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE"..0x8215,
        "FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE"..0x8216,
        "FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE"..0x8217
    )

    IntConstant(
        "UNSIGNED_NORMALIZED"..0x8C17,
        "FRAMEBUFFER_DEFAULT"..0x8218,
        "INDEX"..0x8222
    )

    IntConstant(
        "COLOR_ATTACHMENT0"..0x8CE0,
        "COLOR_ATTACHMENT1"..0x8CE1,
        "COLOR_ATTACHMENT2"..0x8CE2,
        "COLOR_ATTACHMENT3"..0x8CE3,
        "COLOR_ATTACHMENT4"..0x8CE4,
        "COLOR_ATTACHMENT5"..0x8CE5,
        "COLOR_ATTACHMENT6"..0x8CE6,
        "COLOR_ATTACHMENT7"..0x8CE7,
        "COLOR_ATTACHMENT8"..0x8CE8,
        "COLOR_ATTACHMENT9"..0x8CE9,
        "COLOR_ATTACHMENT10"..0x8CEA,
        "COLOR_ATTACHMENT11"..0x8CEB,
        "COLOR_ATTACHMENT12"..0x8CEC,
        "COLOR_ATTACHMENT13"..0x8CED,
        "COLOR_ATTACHMENT14"..0x8CEE,
        "COLOR_ATTACHMENT15"..0x8CEF,
        "DEPTH_ATTACHMENT"..0x8D00,
        "STENCIL_ATTACHMENT"..0x8D20,
        "DEPTH_STENCIL_ATTACHMENT"..0x821A
    )

    IntConstant(
        "MAX_SAMPLES"..0x8D57
    )

    IntConstant(
        "FRAMEBUFFER_COMPLETE"..0x8CD5,
        "FRAMEBUFFER_INCOMPLETE_ATTACHMENT"..0x8CD6,
        "FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT"..0x8CD7,
        "FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER"..0x8CDB,
        "FRAMEBUFFER_INCOMPLETE_READ_BUFFER"..0x8CDC,
        "FRAMEBUFFER_UNSUPPORTED"..0x8CDD,
        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE"..0x8D56,
        "FRAMEBUFFER_UNDEFINED"..0x8219
    )

    IntConstant(
        "FRAMEBUFFER_BINDING"..0x8CA6,
        "DRAW_FRAMEBUFFER_BINDING"..0x8CA6,
        "READ_FRAMEBUFFER_BINDING"..0x8CAA,
        "RENDERBUFFER_BINDING"..0x8CA7,
        "MAX_COLOR_ATTACHMENTS"..0x8CDF,
        "MAX_RENDERBUFFER_SIZE"..0x84E8
    )

    IntConstant(
        "INVALID_FRAMEBUFFER_OPERATION"..0x0506
    )

    IntConstant(
        "DEPTH_STENCIL"..0x84F9
    )

    IntConstant(
        "UNSIGNED_INT_24_8"..0x84FA
    )

    IntConstant(
        "DEPTH24_STENCIL8"..0x88F0
    )

    IntConstant(
        "TEXTURE_STENCIL_SIZE"..0x88F1
    )

    reuse(GL30C, "IsRenderbuffer")
    reuse(GL30C, "BindRenderbuffer")
    reuse(GL30C, "DeleteRenderbuffers")
    reuse(GL30C, "GenRenderbuffers")
    reuse(GL30C, "RenderbufferStorage")
    reuse(GL30C, "RenderbufferStorageMultisample")
    reuse(GL30C, "GetRenderbufferParameteriv")
    reuse(GL30C, "IsFramebuffer")
    reuse(GL30C, "BindFramebuffer")
    reuse(GL30C, "DeleteFramebuffers")
    reuse(GL30C, "GenFramebuffers")
    reuse(GL30C, "CheckFramebufferStatus")
    reuse(GL30C, "FramebufferTexture1D")
    reuse(GL30C, "FramebufferTexture2D")
    reuse(GL30C, "FramebufferTexture3D")
    reuse(GL30C, "FramebufferTextureLayer")
    reuse(GL30C, "FramebufferRenderbuffer")
    reuse(GL30C, "GetFramebufferAttachmentParameteriv")
    reuse(GL30C, "BlitFramebuffer")
    reuse(GL30C, "GenerateMipmap")
}