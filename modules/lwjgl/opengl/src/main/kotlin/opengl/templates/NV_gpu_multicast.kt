/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

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

        GLbitfield.IN("mask", "")
    )

    void(
        "MulticastBufferSubDataNV",
        "",

        GLbitfield.IN("gpuMask", ""),
        GLuint.IN("buffer", ""),
        GLintptr.IN("offset", ""),
        AutoSize("data")..GLsizeiptr.IN("size", ""),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..const..void_p.IN("data", "")
    )

    void(
        "MulticastCopyBufferSubDataNV",
        "",

        GLuint.IN("readGpu", ""),
        GLbitfield.IN("writeGpuMask", ""),
        GLuint.IN("readBuffer", ""),
        GLuint.IN("writeBuffer", ""),
        GLintptr.IN("readOffset", ""),
        GLintptr.IN("writeOffset", ""),
        GLsizeiptr.IN("size", "")
    )

    void(
        "MulticastCopyImageSubDataNV",
        "",

        GLuint.IN("srcGpu", ""),
        GLbitfield.IN("dstGpuMask", ""),
        GLuint.IN("srcName", ""),
        GLenum.IN("srcTarget", ""),
        GLint.IN("srcLevel", ""),
        GLint.IN("srcX", ""),
        GLint.IN("srxY", ""),
        GLint.IN("srcZ", ""),
        GLuint.IN("dstName", ""),
        GLenum.IN("dstTarget", ""),
        GLint.IN("dstLevel", ""),
        GLint.IN("dstX", ""),
        GLint.IN("dstY", ""),
        GLint.IN("dstZ", ""),
        GLsizei.IN("srcWidth", ""),
        GLsizei.IN("srcHeight", ""),
        GLsizei.IN("srcDepth", "")
    )

    void(
        "MulticastBlitFramebufferNV",
        "",

        GLuint.IN("srcGpu", ""),
        GLuint.IN("dstGpu", ""),
        GLint.IN("srcX0", ""),
        GLint.IN("srcY0", ""),
        GLint.IN("srcX1", ""),
        GLint.IN("srcY1", ""),
        GLint.IN("dstX0", ""),
        GLint.IN("dstY0", ""),
        GLint.IN("dstX1", ""),
        GLint.IN("dstY1", ""),
        GLbitfield.IN("mask", ""),
        GLenum.IN("filter", "")
    )

    void(
        "MulticastFramebufferSampleLocationsfvNV",
        "",

        GLuint.IN("gpu", ""),
        GLuint.IN("framebuffer", ""),
        GLuint.IN("start", ""),
        AutoSize(2, "v")..GLsizei.IN("count", ""),
        const..GLfloat_p.IN("v", "")
    )

    void(
        "MulticastBarrierNV",
        ""
    )

    void(
        "MulticastWaitSyncNV",
        "",

        GLuint.IN("signalGpu", ""),
        GLbitfield.IN("waitGpuMask", "")
    )

    void(
        "MulticastGetQueryObjectivNV",
        "",

        GLuint.IN("gpu", ""),
        GLuint.IN("id", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint_p.OUT("params", "")
    )

    void(
        "MulticastGetQueryObjectuivNV",
        "",

        GLuint.IN("gpu", ""),
        GLuint.IN("id", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLuint_p.OUT("params", "")
    )

    void(
        "MulticastGetQueryObjecti64vNV",
        "",

        GLuint.IN("gpu", ""),
        GLuint.IN("id", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLint64_p.OUT("params", "")
    )

    void(
        "MulticastGetQueryObjectui64vNV",
        "",

        GLuint.IN("gpu", ""),
        GLuint.IN("id", ""),
        GLenum.IN("pname", ""),
        Check(1)..ReturnParam..GLuint64_p.OUT("params", "")
    )
}