/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_AMD_gpu_association = "WGLAMDGPUAssociation".nativeClassWGL("WGL_AMD_gpu_association", AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        There currently is no way for applications to efficiently use GPU resources in systems that contain more than one GPU. Vendors have provided methods
        that attempt to split the workload for an application among the available GPU resources. This has proven to be very inefficient because most
        applications were never written with these sorts of optimizations in mind.

        This extension provides a mechanism for applications to explicitly use the GPU resources on a given system individually. By providing this
        functionality, a driver allows applications to make appropriate decisions regarding where and when to distribute rendering tasks.

        Requires ${WGL_ARB_extensions_string.link} and ${EXT_framebuffer_object.link}.
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

    UINT(
        "GetGPUIDsAMD",
        """
        Returns the IDs for available GPUs.

        If the function succeeds, the return value is the number of total GPUs available. The value 0 is returned if no GPUs are available or if the call has
        failed. The ID 0 is reserved and will not be retuned as a valid GPU ID. If the array {@code ids} is #NULL, the function will only return the total
        number of GPUs. {@code ids} will be tightly packed with no 0 values between valid ids.
        """,

        AutoSize("ids")..UINT("maxCount", "the max number of IDs that can be returned"),
        nullable..UINT.p("ids", "the array of returned IDs")
    )

    int(
        "GetGPUInfoAMD",
        """
        Each GPU in a system may have different properties, performance characteristics and different supported OpenGL versions. Use this function to determine
        which GPU is best suited for a specific task.

        For a string, {@code size} will be the number of characters allocated and will include #NULL termination. For arrays of type GL_UNSIGNED_INT, GL_INT,
        and GL_FLOAT {@code size} will be the array depth. If the function succeeds, the number of values written will be returned. If the number of values
        written is equal to {@code size}, the query should be repeated with a larger {@code data} buffer. Strings should be queried using the GL_UNSIGNED_BYTE
        type, are UTF-8 encoded and will be #NULL terminated. If the function fails, -1 will be returned.
        """,

        UINT("id", "a GPU id obtained from calling #GetGPUIDsAMD()"),
        int("property", "the information being queried", properties),
        GLenum(
            "dataType",
            "the data type to be returned",
            "#UNSIGNED_INT #INT #FLOAT #UNSIGNED_BYTE"
        ),
        AutoSizeShr("GLChecks.typeToByteShift(dataType)", "data")..UINT("size", "the size of the {@code data} buffer"),
        MultiType(
            PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..void.p("data", "the buffer which will be filled with the requested information")
    )

    UINT(
        "GetContextGPUIDAMD",
        """
        Determine which GPU a context is attached to.

        Unassociated contexts are created by calling WGL#wglCreateContext(). Although these contexts are unassociated, their use will still be tied to a single
        GPU in most cases. For this reason it is advantageous to be able to query the GPU an existing unassociated context resides on. If multiple GPUs are
        available, it would be undesirable to use one for rendering to visible surfaces and then chose the same one for off-screen rendering.
        """,

        HGLRC("hglrc", "the context for which the GPU id will be returned")
    )

    HGLRC(
        "CreateAssociatedContextAMD",
        "Creates an associated context. Upon successful creation, no pixel format is tied to an associated context.",

        UINT("id", "a valid GPU id")
    )

    HGLRC(
        "CreateAssociatedContextAttribsAMD",
        """
        Create an associated context with a specific GL version.

        All capabilities and limitations of WGLARBCreateContext#wglCreateContextAttribsARB() apply to {@code CreateAssociatedContextAttribsAMD}.
        """,

        UINT("id", "a valid GPU id"),
        nullable..HGLRC("shareContext", "must either be #NULL or that of an associated context created with the same GPU ID as {@code id}"),
        NullTerminated..nullable..int.const.p("attribList", "a 0-terminated list of attributes for the context")
    )

    BOOL(
        "DeleteAssociatedContextAMD",
        "Deletes an associated context. An associated context cannot be deleted by calling #DeleteContext().",

        HGLRC("hglrc", "a valid associated context created by calling #CreateAssociatedContextAMD()")
    )

    BOOL(
        "MakeAssociatedContextCurrentAMD",
        "Makes an associated context current in the current thread.",

        HGLRC("hglrc", "a context handle created by calling #CreateAssociatedContextAMD()")
    )

    HGLRC("GetCurrentAssociatedContextAMD", "Returns the current associated context in the current thread.", void())

    IgnoreMissing..VOID(
        "BlitContextFramebufferAMD",
        """
        Blits data from one context to another. This facilitates high performance data communication between multiple contexts.
        """,

        HGLRC("dstCtx", "the context handle for the write context"),
        GLint("srcX0", "the source x<sub>0</sub> coordinate"),
        GLint("srcY0", "the source Y<sub>0</sub> coordinate"),
        GLint("srcX1", "the source X<sub>1</sub> coordinate"),
        GLint("srcY1", "the source Y<sub>1</sub> coordinate"),
        GLint("dstX0", "the destination X<sub>0</sub> coordinate"),
        GLint("dstY0", "the destination Y<sub>0</sub> coordinate"),
        GLint("dstX1", "the destination X<sub>1</sub> coordinate"),
        GLint("dstY1", "the destination Y<sub>1</sub> coordinate"),
        GLbitfield(
            "mask",
            "the bitwise OR of a number of values indicating which buffers are to be copied",
            "#COLOR_BUFFER_BIT #DEPTH_BUFFER_BIT #STENCIL_BUFFER_BIT", LinkMode.BITFIELD
        ),
        GLenum("filter", "the interpolation method to apply if the image is stretched", "#LINEAR #NEAREST")
    )
}