/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_AMD_gpu_association = "GLXAMDGPUAssociation".nativeClassGLX("GLX_AMD_gpu_association", AMD) {
    IntConstant(
        "GPU_VENDOR_AMD"..0x1F00,
        "GPU_RENDERER_STRING_AMD"..0x1F01,
        "GPU_OPENGL_VERSION_STRING_AMD"..0x1F02,
        "GPU_FASTEST_TARGET_GPUS_AMD"..0x21A2,
        "GPU_RAM_AMD"..0x21A3,
        "GPU_CLOCK_AMD"..0x21A4,
        "GPU_NUM_PIPES_AMD"..0x21A5,
        "GPU_NUM_SIMD_AMD"..0x21A6,
        "GPU_NUM_RB_AMD"..0x21A7,
        "GPU_NUM_SPI_AMD"..0x21A8
    )

    void(
        "BlitContextFramebufferAMD",

        GLXContext("dstCtx"),
        GLint("srcX0"),
        GLint("srcY0"),
        GLint("srcX1"),
        GLint("srcY1"),
        GLint("dstX0"),
        GLint("dstY0"),
        GLint("dstX1"),
        GLint("dstY1"),
        GLbitfield("mask"),
        GLenum("filter")
    )

    GLXContext(
        "CreateAssociatedContextAMD",

        unsigned_int("id"),
        nullable..GLXContext("share_list")
    )

    GLXContext(
        "CreateAssociatedContextAttribsAMD",

        unsigned_int("id"),
        nullable..GLXContext("share_list"),
        NullTerminated..int.const.p("attribList")
    )

    Bool(
        "DeleteAssociatedContextAMD",

        GLXContext("ctx")
    )

    unsigned_int(
        "GetContextGPUIDAMD",

        GLXContext("ctx")
    )

    GLXContext(
        "GetCurrentAssociatedContextAMD",
        void()
    )

    unsigned_int(
        "GetGPUIDsAMD",

        AutoSize("ids")..unsigned_int("maxCount"),
        nullable..unsigned_int.p("ids")
    )

    int(
        "GetGPUInfoAMD",

        unsigned_int("id"),
        int("property"),
        GLenum("dataType"),
        AutoSize("data")..unsigned_int("size"),
        void.p("data")
    )

    Bool(
        "MakeAssociatedContextCurrentAMD",

        GLXContext("ctx")
    )

}