/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_gpu_multicast = "NVGPUMulticast".nativeClassGL("NV_gpu_multicast", postfix = NV) {
    IntConstant(
        "PER_GPU_STORAGE_BIT_NV"..0x0800
    )

    IntConstant(
        "MULTICAST_GPUS_NV"..0x92BA,
        "RENDER_GPU_MASK_NV"..0x9558
    )

    IntConstant(
        "PER_GPU_STORAGE_NV"..0x9548
    )

    IntConstant(
        "MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV"..0x9549
    )

    void(
        "RenderGpuMaskNV",

        GLbitfield("mask")
    )

    void(
        "MulticastBufferSubDataNV",

        GLbitfield("gpuMask"),
        GLuint("buffer"),
        GLintptr("offset"),
        AutoSize("data")..GLsizeiptr("size"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.const.p("data")
    )

    void(
        "MulticastCopyBufferSubDataNV",

        GLuint("readGpu"),
        GLbitfield("writeGpuMask"),
        GLuint("readBuffer"),
        GLuint("writeBuffer"),
        GLintptr("readOffset"),
        GLintptr("writeOffset"),
        GLsizeiptr("size")
    )

    void(
        "MulticastCopyImageSubDataNV",

        GLuint("srcGpu"),
        GLbitfield("dstGpuMask"),
        GLuint("srcName"),
        GLenum("srcTarget"),
        GLint("srcLevel"),
        GLint("srcX"),
        GLint("srxY"),
        GLint("srcZ"),
        GLuint("dstName"),
        GLenum("dstTarget"),
        GLint("dstLevel"),
        GLint("dstX"),
        GLint("dstY"),
        GLint("dstZ"),
        GLsizei("srcWidth"),
        GLsizei("srcHeight"),
        GLsizei("srcDepth")
    )

    void(
        "MulticastBlitFramebufferNV",

        GLuint("srcGpu"),
        GLuint("dstGpu"),
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

    void(
        "MulticastFramebufferSampleLocationsfvNV",

        GLuint("gpu"),
        GLuint("framebuffer"),
        GLuint("start"),
        AutoSize(2, "v")..GLsizei("count"),
        GLfloat.const.p("v")
    )

    void("MulticastBarrierNV")

    void(
        "MulticastWaitSyncNV",

        GLuint("signalGpu"),
        GLbitfield("waitGpuMask")
    )

    void(
        "MulticastGetQueryObjectivNV",

        GLuint("gpu"),
        GLuint("id"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "MulticastGetQueryObjectuivNV",

        GLuint("gpu"),
        GLuint("id"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLuint.p("params")
    )

    void(
        "MulticastGetQueryObjecti64vNV",

        GLuint("gpu"),
        GLuint("id"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint64.p("params")
    )

    void(
        "MulticastGetQueryObjectui64vNV",

        GLuint("gpu"),
        GLuint("id"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLuint64.p("params")
    )
}