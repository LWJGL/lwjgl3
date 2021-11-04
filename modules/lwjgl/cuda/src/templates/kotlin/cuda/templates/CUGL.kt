/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CUGL = "CUGL".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")
    documentation =
        """
        Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/group__CUDA__GL.html\#group__CUDA__GL">CUDA Driver OpenGL
        Interoperability API</a>.
        """

    EnumConstant(
        "CUDA devices corresponding to an OpenGL device. ({@code CUGLDeviceList})",

        "GL_DEVICE_LIST_ALL".enum("The CUDA devices for all GPUs used by the current OpenGL context.", 0x01),
        "GL_DEVICE_LIST_CURRENT_FRAME".enum("The CUDA devices for the GPUs used by the current OpenGL context in its currently rendering frame."),
        "GL_DEVICE_LIST_NEXT_FRAME".enum("The CUDA devices for the GPUs to be used by the current OpenGL context in the next frame.")
    )

    EnumConstant(
        "Flags to map or unmap a resource. ({@code CUGLmap_flags})",

        "GL_MAP_RESOURCE_FLAGS_NONE".enum("", 0x01),
        "GL_MAP_RESOURCE_FLAGS_READ_ONLY".enum,
        "GL_MAP_RESOURCE_FLAGS_WRITE_DISCARD".enum
    )

    CUresult(
        "GraphicsGLRegisterBuffer",
        """
        Registers an OpenGL buffer object.

        Registers the buffer object specified by {@code buffer} for access by CUDA. A handle to the registered object is returned as {@code pCudaResource}. The
        register flags {@code Flags} specify the intended usage, as follows:
        ${ul(
            """
            #GRAPHICS_REGISTER_FLAGS_NONE: Specifies no hints about how this resource will be used. It is therefore assumed that this resource will be read
            from and written to by CUDA. This is the default value.
            """,
            "#GRAPHICS_REGISTER_FLAGS_READ_ONLY: Specifies that CUDA will not write to this resource.",
            """
            #GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD: Specifies that CUDA will not read from this resource and will write over the entire contents of the
            resource, so none of the data previously stored in the resource will be preserved.
            """
        )}
        """,

        Check(1)..CUgraphicsResource.p("pCudaResource", "pointer to the returned object handle"),
        GLuint("buffer", "name of buffer object to be registered"),
        unsigned_int("Flags", "register flags")
    )

    CUresult(
        "GraphicsGLRegisterImage",
        """
        Register an OpenGL texture or renderbuffer object.

        Registers the texture or renderbuffer object specified by {@code image} for access by CUDA. A handle to the registered object is returned as
        {@code pCudaResource}.

        {@code target} must match the type of the object, and must be one of {@code GL_TEXTURE_2D}, {@code GL_TEXTURE_RECTANGLE}, {@code GL_TEXTURE_CUBE_MAP},
        {@code GL_TEXTURE_3D}, {@code GL_TEXTURE_2D_ARRAY}, or {@code GL_RENDERBUFFER}.

        The register flags {@code Flags} specify the intended usage, as follows:
        ${ul(
            """
            #GRAPHICS_REGISTER_FLAGS_NONE: Specifies no hints about how this resource will be used. It is therefore assumed that this resource will be read
            from and written to by CUDA. This is the default value.
            """,
            "#GRAPHICS_REGISTER_FLAGS_READ_ONLY: Specifies that CUDA will not write to this resource.",
            """
            #GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD: Specifies that CUDA will not read from this resource and will write over the entire contents of the
            resource, so none of the data previously stored in the resource will be preserved.
            """,
            "#GRAPHICS_REGISTER_FLAGS_SURFACE_LDST: Specifies that CUDA will bind this resource to a surface reference.",
            "#GRAPHICS_REGISTER_FLAGS_TEXTURE_GATHER: Specifies that CUDA will perform texture gather operations on this resource."
        )}

        The following image formats are supported. For brevity's sake, the list is abbreviated. For ex., {@code {GL_R, GL_RG} X {8, 16}} would expand to the
        following 4 formats {@code {GL_R8, GL_R16, GL_RG8, GL_RG16}}:
        ${ul(
            "GL_RED, GL_RG, GL_RGBA, GL_LUMINANCE, GL_ALPHA, GL_LUMINANCE_ALPHA, GL_INTENSITY",
            "{GL_R, GL_RG, GL_RGBA} X {8, 16, 16F, 32F, 8UI, 16UI, 32UI, 8I, 16I, 32I}",
            "{GL_LUMINANCE, GL_ALPHA, GL_LUMINANCE_ALPHA, GL_INTENSITY} X {8, 16, 16F_ARB, 32F_ARB, 8UI_EXT, 16UI_EXT, 32UI_EXT, 8I_EXT, 16I_EXT, 32I_EXT}"
        )}

        The following image classes are currently disallowed:
        ${ul(
            "Textures with borders",
            "Multisampled renderbuffers"
        )}
        """,

        Check(1)..CUgraphicsResource.p("pCudaResource", "pointer to the returned object handle"),
        GLuint("image", "name of texture or renderbuffer object to be registered"),
        GLenum("target", "identifies the type of object specified by {@code image}"),
        unsigned_int("Flags", "register flags")
    )

    IgnoreMissing..CUresult(
        "GLGetDevices",
        """
        Gets the CUDA devices associated with the current OpenGL context.

        Returns in {@code *pCudaDeviceCount} the number of CUDA-compatible devices corresponding to the current OpenGL context. Also returns in
        {@code *pCudaDevices} at most {@code cudaDeviceCount} of the CUDA-compatible devices corresponding to the current OpenGL context. If any of the GPUs
        being used by the current OpenGL context are not CUDA capable then the call will return #CUDA_ERROR_NO_DEVICE.

        The {@code deviceList} argument may be any of the following:

        ${ul(
            "#GL_DEVICE_LIST_ALL: Query all devices used by the current OpenGL context.",
            "#GL_DEVICE_LIST_CURRENT_FRAME: Query the devices used by the current OpenGL context to render the current frame (in SLI).",
            """
            #GL_DEVICE_LIST_NEXT_FRAME: Query the devices used by the current OpenGL context to render the next frame (in SLI). Note that this is a prediction,
            it can't be guaranteed that this is correct in all cases.
            """
        )}

        ${note("""This function is not supported on Mac OS X.""")}
        """,

        Check(1)..unsigned_int.p("pCudaDeviceCount", "returned number of CUDA devices"),
        CUdevice.p("pCudaDevices", "returned CUDA devices"),
        AutoSize("pCudaDevices")..unsigned_int("cudaDeviceCount", "the size of the output device array {@code pCudaDevices}"),
        CUGLDeviceList("deviceList", "the set of devices to return")
    ).versioned()

    CUresult(
        "GLCtxCreate",
        """
        Create a CUDA context for interoperability with OpenGL.
        
        Deprecated: This function is deprecated as of Cuda 5.0.

        This function is deprecated and should no longer be used. It is no longer necessary to associate a CUDA context with an OpenGL context in order to
        achieve maximum interoperability performance.
        """,

        Check(1)..CUcontext.p("pCtx", "returned CUDA context"),
        unsigned_int("Flags", "options for CUDA context creation"),
        CUdevice("device", "device on which to create the context")
    ).versioned()

    CUresult(
        "GLInit",
        """
        Initializes OpenGL interoperability.
        
        Deprecated: This function is deprecated as of Cuda 3.0.

        Initializes OpenGL interoperability. This function is deprecated and calling it is no longer required. It may fail if the needed OpenGL driver
        facilities are not available.
        """,

        void()
    )

    CUresult(
        "GLRegisterBufferObject",
        """
        Registers an OpenGL buffer object.
        
        Deprecated: This function is deprecated as of Cuda 3.0.

        Registers the buffer object specified by {@code buffer} for access by CUDA. This function must be called before CUDA can map the buffer object. There
        must be a valid OpenGL context bound to the current thread when this function is called, and the buffer name is resolved by that context.
        """,

        GLuint("buffer", "the name of the buffer object to register")
    )

    CUresult(
        "GLMapBufferObject",
        """
        Maps an OpenGL buffer object.
        
        Deprecated: This function is deprecated as of Cuda 3.0.

        Maps the buffer object specified by {@code buffer} into the address space of the current CUDA context and returns in {@code *dptr} and {@code *size}
        the base pointer and size of the resulting mapping.

        There must be a valid OpenGL context bound to the current thread when this function is called. This must be the same context, or a member of the same
        shareGroup, as the context that was bound when the buffer was registered.

        All streams in the current CUDA context are synchronized with the current GL context.
        """,

        Check(1)..CUdeviceptr.p("dptr", "returned mapped base pointer"),
        Check(1)..size_t.p("size", "returned size of mapping"),
        GLuint("buffer", "the name of the buffer object to map")
    ).ptds(2)

    CUresult(
        "GLUnmapBufferObject",
        """
        Unmaps an OpenGL buffer object.
        
        Deprecated: This function is deprecated as of Cuda 3.0.

        Unmaps the buffer object specified by {@code buffer} for access by CUDA.

        There must be a valid OpenGL context bound to the current thread when this function is called. This must be the same context, or a member of the same
        {@code shareGroup}, as the context that was bound when the buffer was registered.

        All streams in the current CUDA context are synchronized with the current GL context.
        """,

        GLuint("buffer", "buffer object to unmap")
    )

    CUresult(
        "GLUnregisterBufferObject",
        """
        Unregister an OpenGL buffer object.
        
        Deprecated: This function is deprecated as of Cuda 3.0.

        Unregisters the buffer object specified by {@code buffer}. This releases any resources associated with the registered buffer. After this call, the
        buffer may no longer be mapped for access by CUDA.

        There must be a valid OpenGL context bound to the current thread when this function is called. This must be the same context, or a member of the same
        shareGroup, as the context that was bound when the buffer was registered.
        """,

        GLuint("buffer", "name of the buffer object to unregister")
    )

    CUresult(
        "GLSetBufferObjectMapFlags",
        """
        Set the map flags for an OpenGL buffer object.
        
        Deprecated: This function is deprecated as of Cuda 3.0.

        Sets the map flags for the buffer object specified by {@code buffer}.

        Changes to {@code Flags} will take effect the next time {@code buffer} is mapped. The {@code Flags} argument may be any of the following:
        ${ul(
            """
            #GL_MAP_RESOURCE_FLAGS_NONE: Specifies no hints about how this resource will be used. It is therefore assumed that this resource will be read from
            and written to by CUDA kernels. This is the default value.
            """,
            "#GL_MAP_RESOURCE_FLAGS_READ_ONLY: Specifies that CUDA kernels which access this resource will not write to this resource.",
            """
            #GL_MAP_RESOURCE_FLAGS_WRITE_DISCARD: Specifies that CUDA kernels which access this resource will not read from this resource and will write over
            the entire contents of the resource, so none of the data previously stored in the resource will be preserved.
            """
        )}

        If {@code buffer} has not been registered for use with CUDA, then #CUDA_ERROR_INVALID_HANDLE is returned. If {@code buffer} is presently mapped for
        access by CUDA, then #CUDA_ERROR_ALREADY_MAPPED is returned.

        There must be a valid OpenGL context bound to the current thread when this function is called. This must be the same context, or a member of the same
        shareGroup, as the context that was bound when the buffer was registered.
        """,

        GLuint("buffer", "buffer object to unmap"),
        unsigned_int("Flags", "map flags")
    )

    CUresult(
        "GLMapBufferObjectAsync",
        """
        Maps an OpenGL buffer object.
        
        Deprecated: This function is deprecated as of Cuda 3.0.

        Maps the buffer object specified by {@code buffer} into the address space of the current CUDA context and returns in {@code *dptr} and {@code *size}
        the base pointer and size of the resulting mapping.

        There must be a valid OpenGL context bound to the current thread when this function is called. This must be the same context, or a member of the same
        shareGroup, as the context that was bound when the buffer was registered.

        Stream {@code hStream} in the current CUDA context is synchronized with the current GL context.
        """,

        Check(1)..CUdeviceptr.p("dptr", "returned mapped base pointer"),
        Check(1)..size_t.p("size", "returned size of mapping"),
        GLuint("buffer", "the name of the buffer object to map"),
        nullable..CUstream("hStream", "stream to synchronize")
    ).ptsz(2)

    CUresult(
        "GLUnmapBufferObjectAsync",
        """
        Unmaps an OpenGL buffer object.
        
        Deprecated: This function is deprecated as of Cuda 3.0.

        Unmaps the buffer object specified by {@code buffer} for access by CUDA.

        There must be a valid OpenGL context bound to the current thread when this function is called. This must be the same context, or a member of the same
        {@code shareGroup}, as the context that was bound when the buffer was registered.

        Stream {@code hStream} in the current CUDA context is synchronized with the current GL context.
        """,

        GLuint("buffer", "name of the buffer object to unmap"),
        nullable..CUstream("hStream", "stream to synchronize")
    )
}