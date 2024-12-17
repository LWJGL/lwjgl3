/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_AMD_gpu_association = "WGLAMDGPUAssociation".nativeClassWGL("WGL_AMD_gpu_association", AMD) {
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

    UINT(
        "GetGPUIDsAMD",

        AutoSize("ids")..UINT("maxCount"),
        nullable..UINT.p("ids")
    )

    int(
        "GetGPUInfoAMD",

        UINT("id"),
        int("property"),
        GLenum("dataType"),
        AutoSizeShr("GLChecks.typeToByteShift(dataType)", "data")..UINT("size"),
        MultiType(
            PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..void.p("data")
    )

    UINT(
        "GetContextGPUIDAMD",

        HGLRC("hglrc")
    )

    HGLRC(
        "CreateAssociatedContextAMD",

        UINT("id")
    )

    HGLRC(
        "CreateAssociatedContextAttribsAMD",

        UINT("id"),
        nullable..HGLRC("shareContext"),
        NullTerminated..nullable..int.const.p("attribList")
    )

    BOOL(
        "DeleteAssociatedContextAMD",

        HGLRC("hglrc")
    )

    BOOL(
        "MakeAssociatedContextCurrentAMD",

        HGLRC("hglrc")
    )

    HGLRC("GetCurrentAssociatedContextAMD", void())

    IgnoreMissing..VOID(
        "BlitContextFramebufferAMD",

        HGLRC("dstCtx"),
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
}