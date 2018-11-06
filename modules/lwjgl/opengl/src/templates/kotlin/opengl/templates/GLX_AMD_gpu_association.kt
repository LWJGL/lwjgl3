/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_AMD_gpu_association = "GLXAMDGPUAssociation".nativeClassGLX("GLX_AMD_gpu_association", AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        There currently is no way for applications to efficiently use GPU resources in systems that contain more than one GPU. Vendors have provided methods
        that attempt to split the workload for an application among the available GPU resources. This has proven to be very inefficient because most
        applications were never written with these sorts of optimizations in mind.

        This extension provides a mechanism for applications to explicitly use the GPU resources on a given system individually. By providing this
        functionality, a driver allows applications to make appropriate decisions regarding where and when to distribute rendering tasks.

        Requires ${GL15.core}, ${GLX13.glx}, ${EXT_framebuffer_object.link} and ${GLX_ARB_get_proc_address.link}.
        """

    val properties = IntConstant(
        "Accepted by the {@code property} parameter of #GetGPUInfoAMD().",

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
    ).javaDocLinks

    void(
        "BlitContextFramebufferAMD",
        "",

        GLXContext("dstCtx", ""),
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

    GLXContext(
        "CreateAssociatedContextAMD",
        "Creates an associated context.",

        unsigned_int("id", ""),
        GLXContext("share_list", "")
    )

    GLXContext(
        "CreateAssociatedContextAttribsAMD",
        "Creates an associated context and requests a specific GL version.",

        unsigned_int("id", ""),
        GLXContext("share_context", ""),
        NullTerminated..int.const.p("attribList", "")
    )

    Bool(
        "DeleteAssociatedContextAMD",
        "Deletes an associated context.",

        GLXContext("ctx", "the GLXContext")
    )

    unsigned_int(
        "GetContextGPUIDAMD",
        "Determines which GPU a context is attached to.",

        GLXContext("ctx", "the GLXContext")
    )

    GLXContext(
        "GetCurrentAssociatedContextAMD",
        "Queries the crrent associated context.",
        void()
    )

    unsigned_int(
        "GetGPUIDsAMD",
        "Queries the IDs for available GPUs.",

        unsigned_int("maxCount", ""),
        unsigned_int("ids", "")
    )

    int(
        "GetGPUInfoAMD",
        "Queries GPU properties.",

        unsigned_int("id", ""),
        int("property", "", properties),
        GLenum("dataType", ""),
        AutoSize("data")..unsigned_int("size", ""),
        void.p("data", "")
    )

    Bool(
        "MakeAssociatedContextCurrentAMD",
        "Makes an associated context current in the current thread.",

        GLXContext("ctx", "the GLXContext")
    )

}