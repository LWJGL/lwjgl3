/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_gpu_multicast = "NVGPUMulticast".nativeClassGL("NV_gpu_multicast", postfix = NV) {

    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables novel multi-GPU rendering techniques by providing application control over a group of linked GPUs with identical hardware
        configuration.

        Multi-GPU rendering techniques fall into two categories: implicit and explicit. Existing explicit approaches like ${WGL_NV_gpu_affinity.link} have two
        main drawbacks: CPU overhead and application complexity. An application must manage one context per GPU and multi-pump the API stream. Implicit
        multi-GPU rendering techniques avoid these issues by broadcasting rendering from one context to multiple GPUs. Common implicit approaches include
        alternate-frame rendering (AFR), split-frame rendering (SFR) and multi-GPU anti-aliasing. They each have drawbacks. AFR scales nicely but interacts
        poorly with inter-frame dependencies. SFR can improve latency but has challenges with offscreen rendering and scaling of vertex processing. With
        multi-GPU anti-aliasing, each GPU renders the same content with alternate sample positions and the driver blends the result to improve quality. This
        also has issues with offscreen rendering and can conflict with other anti-aliasing techniques.

        These issues with implicit multi-GPU rendering all have the same root cause: the driver lacks adequate knowledge to accelerate every application. To
        resolve this, NV_gpu_multicast provides fine-grained, explicit application control over multiple GPUs with a single context.

        Key points:
        ${ul(
            "One context controls multiple GPUs. Every GPU in the linked group can access every object.",
            "Rendering is broadcast. Each draw is repeated across all GPUs in the linked group.",
            """
        Each GPU gets its own instance of all framebuffers, allowing individualized output for each GPU. Input data can be customized for each GPU using
        buffers created with the storage flag, #PER_GPU_STORAGE_BIT_NV and a new API, #MulticastBufferSubDataNV().
        """,
            "New interfaces provide mechanisms to transfer textures and buffers from one GPU to another."
        )}

        Requires ${ARB_copy_image.link} and ${EXT_direct_state_access.link}.
        """

    IntConstant(
        "Accepted in the {@code flags} parameter of BufferStorage and NamedBufferStorageEXT.",

        "PER_GPU_STORAGE_BIT_NV"..0x0800
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "MULTICAST_GPUS_NV"..0x92BA,
        "RENDER_GPU_MASK_NV"..0x9558
    )

    IntConstant(
        """
        Accepted as a value for {@code pname} for the TexParameter{if}, TexParameter{if}v, TextureParameter{if}, TextureParameter{if}v, MultiTexParameter{if}EXT
        and MultiTexParameter{if}vEXT commands and for the {@code value} parameter of GetTexParameter{if}v, GetTextureParameter{if}vEXT and
        GetMultiTexParameter{if}vEXT.
        """,

        "PER_GPU_STORAGE_NV"..0x9548
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetMultisamplefv.",

        "MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV"..0x9549
    )

    void(
        "RenderGpuMaskNV",
        "Restricts render commands to a specific set of GPUs.",

        GLbitfield("mask", "")
    )

    void(
        "MulticastBufferSubDataNV",
        "",

        GLbitfield("gpuMask", ""),
        GLuint("buffer", ""),
        GLintptr("offset", ""),
        AutoSize("data")..GLsizeiptr("size", ""),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.const.p("data", "")
    )

    void(
        "MulticastCopyBufferSubDataNV",
        "",

        GLuint("readGpu", ""),
        GLbitfield("writeGpuMask", ""),
        GLuint("readBuffer", ""),
        GLuint("writeBuffer", ""),
        GLintptr("readOffset", ""),
        GLintptr("writeOffset", ""),
        GLsizeiptr("size", "")
    )

    void(
        "MulticastCopyImageSubDataNV",
        "",

        GLuint("srcGpu", ""),
        GLbitfield("dstGpuMask", ""),
        GLuint("srcName", ""),
        GLenum("srcTarget", ""),
        GLint("srcLevel", ""),
        GLint("srcX", ""),
        GLint("srxY", ""),
        GLint("srcZ", ""),
        GLuint("dstName", ""),
        GLenum("dstTarget", ""),
        GLint("dstLevel", ""),
        GLint("dstX", ""),
        GLint("dstY", ""),
        GLint("dstZ", ""),
        GLsizei("srcWidth", ""),
        GLsizei("srcHeight", ""),
        GLsizei("srcDepth", "")
    )

    void(
        "MulticastBlitFramebufferNV",
        "",

        GLuint("srcGpu", ""),
        GLuint("dstGpu", ""),
        GLint("srcX0", ""),
        GLint("srcY0", ""),
        GLint("srcX1", ""),
        GLint("srcY1", ""),
        GLint("dstX0", ""),
        GLint("dstY0", ""),
        GLint("dstX1", ""),
        GLint("dstY1", ""),
        GLbitfield("mask", ""),
        GLenum("filter", "")
    )

    void(
        "MulticastFramebufferSampleLocationsfvNV",
        "",

        GLuint("gpu", ""),
        GLuint("framebuffer", ""),
        GLuint("start", ""),
        AutoSize(2, "v")..GLsizei("count", ""),
        GLfloat.const.p("v", "")
    )

    void(
        "MulticastBarrierNV",
        ""
    )

    void(
        "MulticastWaitSyncNV",
        "",

        GLuint("signalGpu", ""),
        GLbitfield("waitGpuMask", "")
    )

    void(
        "MulticastGetQueryObjectivNV",
        "",

        GLuint("gpu", ""),
        GLuint("id", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint.p("params", "")
    )

    void(
        "MulticastGetQueryObjectuivNV",
        "",

        GLuint("gpu", ""),
        GLuint("id", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLuint.p("params", "")
    )

    void(
        "MulticastGetQueryObjecti64vNV",
        "",

        GLuint("gpu", ""),
        GLuint("id", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLint64.p("params", "")
    )

    void(
        "MulticastGetQueryObjectui64vNV",
        "",

        GLuint("gpu", ""),
        GLuint("id", ""),
        GLenum("pname", ""),
        Check(1)..ReturnParam..GLuint64.p("params", "")
    )
}