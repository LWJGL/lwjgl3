/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NVX_gpu_multicast2 = "NVXGpuMulticast2".nativeClassGL("NVX_gpu_multicast2", postfix = NVX) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides additional mechanisms that influence multicast rendering which is simultaneous rendering to multiple GPUs.
    
        Requires ${NV_gpu_multicast.link}, {@code EXT_device_group}, {@code NV_viewport_array}, ${NV_clip_space_w_scaling.link} and ${NVX_progress_fence.link}.
        """

    GLuint(
        "AsyncCopyImageSubDataNVX",
        "",

        AutoSize("waitSemaphoreArray", "waitValueArray")..GLsizei("waitSemaphoreCount", ""),
        GLuint.const.p("waitSemaphoreArray", ""),
        GLuint64.const.p("waitValueArray", ""),
        GLuint("srcGpu", ""),
        GLbitfield("dstGpuMask", ""),
        GLuint("srcName", ""),
        GLenum("srcTarget", ""),
        GLint("srcLevel", ""),
        GLint("srcX", ""),
        GLint("srcY", ""),
        GLint("srcZ", ""),
        GLuint("dstName", ""),
        GLenum("dstTarget", ""),
        GLint("dstLevel", ""),
        GLint("dstX", ""),
        GLint("dstY", ""),
        GLint("dstZ", ""),
        GLsizei("srcWidth", ""),
        GLsizei("srcHeight", ""),
        GLsizei("srcDepth", ""),
        AutoSize("signalSemaphoreArray", "signalValueArray")..GLsizei("signalSemaphoreCount", ""),
        GLuint.const.p("signalSemaphoreArray", ""),
        GLuint64.const.p("signalValueArray", "")
    )

    GLsync(
        "AsyncCopyBufferSubDataNVX",
        "",

        AutoSize("waitSemaphoreArray", "fenceValueArray")..GLsizei("waitSemaphoreCount", ""),
        GLuint.const.p("waitSemaphoreArray", ""),
        GLuint64.const.p("fenceValueArray", ""),
        GLuint("readGpu", ""),
        GLbitfield("writeGpuMask", ""),
        GLuint("readBuffer", ""),
        GLuint("writeBuffer", ""),
        GLintptr("readOffset", ""),
        GLintptr("writeOffset", ""),
        GLsizeiptr("size", ""),
        AutoSize("signalSemaphoreArray", "signalValueArray")..GLsizei("signalSemaphoreCount", ""),
        GLuint.const.p("signalSemaphoreArray", ""),
        GLuint64.const.p("signalValueArray", "")
    )

    void(
        "UploadGpuMaskNVX",
        "",

        GLbitfield("mask", "")
    )

    void(
        "MulticastViewportArrayvNVX",
        "",

        GLuint("gpu", ""),
        GLuint("first", ""),
        AutoSize(4, "v")..GLsizei("count", ""),
        GLfloat.const.p("v", "")
    )

    void(
        "MulticastScissorArrayvNVX",
        "",

        GLuint("gpu", ""),
        GLuint("first", ""),
        AutoSize(4, "v")..GLsizei("count", ""),
        GLint.const.p("v", "")
    )

    void(
        "MulticastViewportPositionWScaleNVX",
        "",

        GLuint("gpu", ""),
        GLuint("index", ""),
        GLfloat("xcoeff", ""),
        GLfloat("ycoeff", "")
    )
}
