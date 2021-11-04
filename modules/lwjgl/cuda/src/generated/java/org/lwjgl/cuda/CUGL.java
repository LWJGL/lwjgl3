/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.cuda.CUDA.*;

/**
 * Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/group__CUDA__GL.html#group__CUDA__GL">CUDA Driver OpenGL
 * Interoperability API</a>.
 */
public class CUGL {

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GraphicsGLRegisterBuffer  = apiGetFunctionAddress(CU.getLibrary(), "cuGraphicsGLRegisterBuffer"),
            GraphicsGLRegisterImage   = apiGetFunctionAddress(CU.getLibrary(), "cuGraphicsGLRegisterImage"),
            GLGetDevices              = CU.getLibrary().getFunctionAddress(__CUDA_API_VERSION("cuGLGetDevices", 2)),
            GLCtxCreate               = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_VERSION("cuGLCtxCreate", 2)),
            GLInit                    = apiGetFunctionAddress(CU.getLibrary(), "cuGLInit"),
            GLRegisterBufferObject    = apiGetFunctionAddress(CU.getLibrary(), "cuGLRegisterBufferObject"),
            GLMapBufferObject         = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTDS(__CUDA_API_VERSION("cuGLMapBufferObject", 2))),
            GLUnmapBufferObject       = apiGetFunctionAddress(CU.getLibrary(), "cuGLUnmapBufferObject"),
            GLUnregisterBufferObject  = apiGetFunctionAddress(CU.getLibrary(), "cuGLUnregisterBufferObject"),
            GLSetBufferObjectMapFlags = apiGetFunctionAddress(CU.getLibrary(), "cuGLSetBufferObjectMapFlags"),
            GLMapBufferObjectAsync    = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ(__CUDA_API_VERSION("cuGLMapBufferObjectAsync", 2))),
            GLUnmapBufferObjectAsync  = apiGetFunctionAddress(CU.getLibrary(), "cuGLUnmapBufferObjectAsync");

    }

    /**
     * CUDA devices corresponding to an OpenGL device. ({@code CUGLDeviceList})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_GL_DEVICE_LIST_ALL GL_DEVICE_LIST_ALL} - The CUDA devices for all GPUs used by the current OpenGL context.</li>
     * <li>{@link #CU_GL_DEVICE_LIST_CURRENT_FRAME GL_DEVICE_LIST_CURRENT_FRAME} - The CUDA devices for the GPUs used by the current OpenGL context in its currently rendering frame.</li>
     * <li>{@link #CU_GL_DEVICE_LIST_NEXT_FRAME GL_DEVICE_LIST_NEXT_FRAME} - The CUDA devices for the GPUs to be used by the current OpenGL context in the next frame.</li>
     * </ul>
     */
    public static final int
        CU_GL_DEVICE_LIST_ALL           = 0x1,
        CU_GL_DEVICE_LIST_CURRENT_FRAME = 0x2,
        CU_GL_DEVICE_LIST_NEXT_FRAME    = 0x3;

    /**
     * Flags to map or unmap a resource. ({@code CUGLmap_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_GL_MAP_RESOURCE_FLAGS_NONE GL_MAP_RESOURCE_FLAGS_NONE}</li>
     * <li>{@link #CU_GL_MAP_RESOURCE_FLAGS_READ_ONLY GL_MAP_RESOURCE_FLAGS_READ_ONLY}</li>
     * <li>{@link #CU_GL_MAP_RESOURCE_FLAGS_WRITE_DISCARD GL_MAP_RESOURCE_FLAGS_WRITE_DISCARD}</li>
     * </ul>
     */
    public static final int
        CU_GL_MAP_RESOURCE_FLAGS_NONE          = 0x1,
        CU_GL_MAP_RESOURCE_FLAGS_READ_ONLY     = 0x2,
        CU_GL_MAP_RESOURCE_FLAGS_WRITE_DISCARD = 0x3;

    protected CUGL() {
        throw new UnsupportedOperationException();
    }

    // --- [ cuGraphicsGLRegisterBuffer ] ---

    /** Unsafe version of: {@link #cuGraphicsGLRegisterBuffer GraphicsGLRegisterBuffer} */
    public static int ncuGraphicsGLRegisterBuffer(long pCudaResource, int buffer, int Flags) {
        long __functionAddress = Functions.GraphicsGLRegisterBuffer;
        return callPI(pCudaResource, buffer, Flags, __functionAddress);
    }

    /**
     * Registers an OpenGL buffer object.
     * 
     * <p>Registers the buffer object specified by {@code buffer} for access by CUDA. A handle to the registered object is returned as {@code pCudaResource}. The
     * register flags {@code Flags} specify the intended usage, as follows:</p>
     * 
     * <ul>
     * <li>{@link CU#CU_GRAPHICS_REGISTER_FLAGS_NONE GRAPHICS_REGISTER_FLAGS_NONE}: Specifies no hints about how this resource will be used. It is therefore assumed that this resource will be read
     * from and written to by CUDA. This is the default value.</li>
     * <li>{@link CU#CU_GRAPHICS_REGISTER_FLAGS_READ_ONLY GRAPHICS_REGISTER_FLAGS_READ_ONLY}: Specifies that CUDA will not write to this resource.</li>
     * <li>{@link CU#CU_GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD}: Specifies that CUDA will not read from this resource and will write over the entire contents of the
     * resource, so none of the data previously stored in the resource will be preserved.</li>
     * </ul>
     *
     * @param pCudaResource pointer to the returned object handle
     * @param buffer        name of buffer object to be registered
     * @param Flags         register flags
     */
    @NativeType("CUresult")
    public static int cuGraphicsGLRegisterBuffer(@NativeType("CUgraphicsResource *") PointerBuffer pCudaResource, @NativeType("GLuint") int buffer, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pCudaResource, 1);
        }
        return ncuGraphicsGLRegisterBuffer(memAddress(pCudaResource), buffer, Flags);
    }

    // --- [ cuGraphicsGLRegisterImage ] ---

    /** Unsafe version of: {@link #cuGraphicsGLRegisterImage GraphicsGLRegisterImage} */
    public static int ncuGraphicsGLRegisterImage(long pCudaResource, int image, int target, int Flags) {
        long __functionAddress = Functions.GraphicsGLRegisterImage;
        return callPI(pCudaResource, image, target, Flags, __functionAddress);
    }

    /**
     * Register an OpenGL texture or renderbuffer object.
     * 
     * <p>Registers the texture or renderbuffer object specified by {@code image} for access by CUDA. A handle to the registered object is returned as
     * {@code pCudaResource}.</p>
     * 
     * <p>{@code target} must match the type of the object, and must be one of {@code GL_TEXTURE_2D}, {@code GL_TEXTURE_RECTANGLE}, {@code GL_TEXTURE_CUBE_MAP},
     * {@code GL_TEXTURE_3D}, {@code GL_TEXTURE_2D_ARRAY}, or {@code GL_RENDERBUFFER}.</p>
     * 
     * <p>The register flags {@code Flags} specify the intended usage, as follows:</p>
     * 
     * <ul>
     * <li>{@link CU#CU_GRAPHICS_REGISTER_FLAGS_NONE GRAPHICS_REGISTER_FLAGS_NONE}: Specifies no hints about how this resource will be used. It is therefore assumed that this resource will be read
     * from and written to by CUDA. This is the default value.</li>
     * <li>{@link CU#CU_GRAPHICS_REGISTER_FLAGS_READ_ONLY GRAPHICS_REGISTER_FLAGS_READ_ONLY}: Specifies that CUDA will not write to this resource.</li>
     * <li>{@link CU#CU_GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD}: Specifies that CUDA will not read from this resource and will write over the entire contents of the
     * resource, so none of the data previously stored in the resource will be preserved.</li>
     * <li>{@link CU#CU_GRAPHICS_REGISTER_FLAGS_SURFACE_LDST GRAPHICS_REGISTER_FLAGS_SURFACE_LDST}: Specifies that CUDA will bind this resource to a surface reference.</li>
     * <li>{@link CU#CU_GRAPHICS_REGISTER_FLAGS_TEXTURE_GATHER GRAPHICS_REGISTER_FLAGS_TEXTURE_GATHER}: Specifies that CUDA will perform texture gather operations on this resource.</li>
     * </ul>
     * 
     * <p>The following image formats are supported. For brevity's sake, the list is abbreviated. For ex., {@code {GL_R, GL_RG} X {8, 16}} would expand to the
     * following 4 formats {@code {GL_R8, GL_R16, GL_RG8, GL_RG16}}:</p>
     * 
     * <ul>
     * <li>GL_RED, GL_RG, GL_RGBA, GL_LUMINANCE, GL_ALPHA, GL_LUMINANCE_ALPHA, GL_INTENSITY</li>
     * <li>{GL_R, GL_RG, GL_RGBA} X {8, 16, 16F, 32F, 8UI, 16UI, 32UI, 8I, 16I, 32I}</li>
     * <li>{GL_LUMINANCE, GL_ALPHA, GL_LUMINANCE_ALPHA, GL_INTENSITY} X {8, 16, 16F_ARB, 32F_ARB, 8UI_EXT, 16UI_EXT, 32UI_EXT, 8I_EXT, 16I_EXT, 32I_EXT}</li>
     * </ul>
     * 
     * <p>The following image classes are currently disallowed:</p>
     * 
     * <ul>
     * <li>Textures with borders</li>
     * <li>Multisampled renderbuffers</li>
     * </ul>
     *
     * @param pCudaResource pointer to the returned object handle
     * @param image         name of texture or renderbuffer object to be registered
     * @param target        identifies the type of object specified by {@code image}
     * @param Flags         register flags
     */
    @NativeType("CUresult")
    public static int cuGraphicsGLRegisterImage(@NativeType("CUgraphicsResource *") PointerBuffer pCudaResource, @NativeType("GLuint") int image, @NativeType("GLenum") int target, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pCudaResource, 1);
        }
        return ncuGraphicsGLRegisterImage(memAddress(pCudaResource), image, target, Flags);
    }

    // --- [ cuGLGetDevices ] ---

    /**
     * Unsafe version of: {@link #cuGLGetDevices GLGetDevices}
     *
     * @param cudaDeviceCount the size of the output device array {@code pCudaDevices}
     */
    public static int ncuGLGetDevices(long pCudaDeviceCount, long pCudaDevices, int cudaDeviceCount, int deviceList) {
        long __functionAddress = Functions.GLGetDevices;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pCudaDeviceCount, pCudaDevices, cudaDeviceCount, deviceList, __functionAddress);
    }

    /**
     * Gets the CUDA devices associated with the current OpenGL context.
     * 
     * <p>Returns in {@code *pCudaDeviceCount} the number of CUDA-compatible devices corresponding to the current OpenGL context. Also returns in
     * {@code *pCudaDevices} at most {@code cudaDeviceCount} of the CUDA-compatible devices corresponding to the current OpenGL context. If any of the GPUs
     * being used by the current OpenGL context are not CUDA capable then the call will return {@link CU#CUDA_ERROR_NO_DEVICE}.</p>
     * 
     * <p>The {@code deviceList} argument may be any of the following:</p>
     * 
     * <ul>
     * <li>{@link #CU_GL_DEVICE_LIST_ALL GL_DEVICE_LIST_ALL}: Query all devices used by the current OpenGL context.</li>
     * <li>{@link #CU_GL_DEVICE_LIST_CURRENT_FRAME GL_DEVICE_LIST_CURRENT_FRAME}: Query the devices used by the current OpenGL context to render the current frame (in SLI).</li>
     * <li>{@link #CU_GL_DEVICE_LIST_NEXT_FRAME GL_DEVICE_LIST_NEXT_FRAME}: Query the devices used by the current OpenGL context to render the next frame (in SLI). Note that this is a prediction,
     * it can't be guaranteed that this is correct in all cases.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This function is not supported on Mac OS X.</p></div>
     *
     * @param pCudaDeviceCount returned number of CUDA devices
     * @param pCudaDevices     returned CUDA devices
     * @param deviceList       the set of devices to return
     */
    @NativeType("CUresult")
    public static int cuGLGetDevices(@NativeType("unsigned int *") IntBuffer pCudaDeviceCount, @NativeType("CUdevice *") IntBuffer pCudaDevices, @NativeType("CUGLDeviceList") int deviceList) {
        if (CHECKS) {
            check(pCudaDeviceCount, 1);
        }
        return ncuGLGetDevices(memAddress(pCudaDeviceCount), memAddress(pCudaDevices), pCudaDevices.remaining(), deviceList);
    }

    // --- [ cuGLCtxCreate ] ---

    /** Unsafe version of: {@link #cuGLCtxCreate GLCtxCreate} */
    public static int ncuGLCtxCreate(long pCtx, int Flags, int device) {
        long __functionAddress = Functions.GLCtxCreate;
        return callPI(pCtx, Flags, device, __functionAddress);
    }

    /**
     * Create a CUDA context for interoperability with OpenGL.
     * 
     * <p>Deprecated: This function is deprecated as of Cuda 5.0.</p>
     * 
     * <p>This function is deprecated and should no longer be used. It is no longer necessary to associate a CUDA context with an OpenGL context in order to
     * achieve maximum interoperability performance.</p>
     *
     * @param pCtx   returned CUDA context
     * @param Flags  options for CUDA context creation
     * @param device device on which to create the context
     */
    @NativeType("CUresult")
    public static int cuGLCtxCreate(@NativeType("CUcontext *") PointerBuffer pCtx, @NativeType("unsigned int") int Flags, @NativeType("CUdevice") int device) {
        if (CHECKS) {
            check(pCtx, 1);
        }
        return ncuGLCtxCreate(memAddress(pCtx), Flags, device);
    }

    // --- [ cuGLInit ] ---

    /**
     * Initializes OpenGL interoperability.
     * 
     * <p>Deprecated: This function is deprecated as of Cuda 3.0.</p>
     * 
     * <p>Initializes OpenGL interoperability. This function is deprecated and calling it is no longer required. It may fail if the needed OpenGL driver
     * facilities are not available.</p>
     */
    @NativeType("CUresult")
    public static int cuGLInit() {
        long __functionAddress = Functions.GLInit;
        return callI(__functionAddress);
    }

    // --- [ cuGLRegisterBufferObject ] ---

    /**
     * Registers an OpenGL buffer object.
     * 
     * <p>Deprecated: This function is deprecated as of Cuda 3.0.</p>
     * 
     * <p>Registers the buffer object specified by {@code buffer} for access by CUDA. This function must be called before CUDA can map the buffer object. There
     * must be a valid OpenGL context bound to the current thread when this function is called, and the buffer name is resolved by that context.</p>
     *
     * @param buffer the name of the buffer object to register
     */
    @NativeType("CUresult")
    public static int cuGLRegisterBufferObject(@NativeType("GLuint") int buffer) {
        long __functionAddress = Functions.GLRegisterBufferObject;
        return callI(buffer, __functionAddress);
    }

    // --- [ cuGLMapBufferObject ] ---

    /** Unsafe version of: {@link #cuGLMapBufferObject GLMapBufferObject} */
    public static int ncuGLMapBufferObject(long dptr, long size, int buffer) {
        long __functionAddress = Functions.GLMapBufferObject;
        return callPPI(dptr, size, buffer, __functionAddress);
    }

    /**
     * Maps an OpenGL buffer object.
     * 
     * <p>Deprecated: This function is deprecated as of Cuda 3.0.</p>
     * 
     * <p>Maps the buffer object specified by {@code buffer} into the address space of the current CUDA context and returns in {@code *dptr} and {@code *size}
     * the base pointer and size of the resulting mapping.</p>
     * 
     * <p>There must be a valid OpenGL context bound to the current thread when this function is called. This must be the same context, or a member of the same
     * shareGroup, as the context that was bound when the buffer was registered.</p>
     * 
     * <p>All streams in the current CUDA context are synchronized with the current GL context.</p>
     *
     * @param dptr   returned mapped base pointer
     * @param size   returned size of mapping
     * @param buffer the name of the buffer object to map
     */
    @NativeType("CUresult")
    public static int cuGLMapBufferObject(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t *") PointerBuffer size, @NativeType("GLuint") int buffer) {
        if (CHECKS) {
            check(dptr, 1);
            check(size, 1);
        }
        return ncuGLMapBufferObject(memAddress(dptr), memAddress(size), buffer);
    }

    // --- [ cuGLUnmapBufferObject ] ---

    /**
     * Unmaps an OpenGL buffer object.
     * 
     * <p>Deprecated: This function is deprecated as of Cuda 3.0.</p>
     * 
     * <p>Unmaps the buffer object specified by {@code buffer} for access by CUDA.</p>
     * 
     * <p>There must be a valid OpenGL context bound to the current thread when this function is called. This must be the same context, or a member of the same
     * {@code shareGroup}, as the context that was bound when the buffer was registered.</p>
     * 
     * <p>All streams in the current CUDA context are synchronized with the current GL context.</p>
     *
     * @param buffer buffer object to unmap
     */
    @NativeType("CUresult")
    public static int cuGLUnmapBufferObject(@NativeType("GLuint") int buffer) {
        long __functionAddress = Functions.GLUnmapBufferObject;
        return callI(buffer, __functionAddress);
    }

    // --- [ cuGLUnregisterBufferObject ] ---

    /**
     * Unregister an OpenGL buffer object.
     * 
     * <p>Deprecated: This function is deprecated as of Cuda 3.0.</p>
     * 
     * <p>Unregisters the buffer object specified by {@code buffer}. This releases any resources associated with the registered buffer. After this call, the
     * buffer may no longer be mapped for access by CUDA.</p>
     * 
     * <p>There must be a valid OpenGL context bound to the current thread when this function is called. This must be the same context, or a member of the same
     * shareGroup, as the context that was bound when the buffer was registered.</p>
     *
     * @param buffer name of the buffer object to unregister
     */
    @NativeType("CUresult")
    public static int cuGLUnregisterBufferObject(@NativeType("GLuint") int buffer) {
        long __functionAddress = Functions.GLUnregisterBufferObject;
        return callI(buffer, __functionAddress);
    }

    // --- [ cuGLSetBufferObjectMapFlags ] ---

    /**
     * Set the map flags for an OpenGL buffer object.
     * 
     * <p>Deprecated: This function is deprecated as of Cuda 3.0.</p>
     * 
     * <p>Sets the map flags for the buffer object specified by {@code buffer}.</p>
     * 
     * <p>Changes to {@code Flags} will take effect the next time {@code buffer} is mapped. The {@code Flags} argument may be any of the following:</p>
     * 
     * <ul>
     * <li>{@link #CU_GL_MAP_RESOURCE_FLAGS_NONE GL_MAP_RESOURCE_FLAGS_NONE}: Specifies no hints about how this resource will be used. It is therefore assumed that this resource will be read from
     * and written to by CUDA kernels. This is the default value.</li>
     * <li>{@link #CU_GL_MAP_RESOURCE_FLAGS_READ_ONLY GL_MAP_RESOURCE_FLAGS_READ_ONLY}: Specifies that CUDA kernels which access this resource will not write to this resource.</li>
     * <li>{@link #CU_GL_MAP_RESOURCE_FLAGS_WRITE_DISCARD GL_MAP_RESOURCE_FLAGS_WRITE_DISCARD}: Specifies that CUDA kernels which access this resource will not read from this resource and will write over
     * the entire contents of the resource, so none of the data previously stored in the resource will be preserved.</li>
     * </ul>
     * 
     * <p>If {@code buffer} has not been registered for use with CUDA, then {@link CU#CUDA_ERROR_INVALID_HANDLE} is returned. If {@code buffer} is presently mapped for
     * access by CUDA, then {@link CU#CUDA_ERROR_ALREADY_MAPPED} is returned.</p>
     * 
     * <p>There must be a valid OpenGL context bound to the current thread when this function is called. This must be the same context, or a member of the same
     * shareGroup, as the context that was bound when the buffer was registered.</p>
     *
     * @param buffer buffer object to unmap
     * @param Flags  map flags
     */
    @NativeType("CUresult")
    public static int cuGLSetBufferObjectMapFlags(@NativeType("GLuint") int buffer, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.GLSetBufferObjectMapFlags;
        return callI(buffer, Flags, __functionAddress);
    }

    // --- [ cuGLMapBufferObjectAsync ] ---

    /** Unsafe version of: {@link #cuGLMapBufferObjectAsync GLMapBufferObjectAsync} */
    public static int ncuGLMapBufferObjectAsync(long dptr, long size, int buffer, long hStream) {
        long __functionAddress = Functions.GLMapBufferObjectAsync;
        return callPPPI(dptr, size, buffer, hStream, __functionAddress);
    }

    /**
     * Maps an OpenGL buffer object.
     * 
     * <p>Deprecated: This function is deprecated as of Cuda 3.0.</p>
     * 
     * <p>Maps the buffer object specified by {@code buffer} into the address space of the current CUDA context and returns in {@code *dptr} and {@code *size}
     * the base pointer and size of the resulting mapping.</p>
     * 
     * <p>There must be a valid OpenGL context bound to the current thread when this function is called. This must be the same context, or a member of the same
     * shareGroup, as the context that was bound when the buffer was registered.</p>
     * 
     * <p>Stream {@code hStream} in the current CUDA context is synchronized with the current GL context.</p>
     *
     * @param dptr    returned mapped base pointer
     * @param size    returned size of mapping
     * @param buffer  the name of the buffer object to map
     * @param hStream stream to synchronize
     */
    @NativeType("CUresult")
    public static int cuGLMapBufferObjectAsync(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t *") PointerBuffer size, @NativeType("GLuint") int buffer, @NativeType("CUstream") long hStream) {
        if (CHECKS) {
            check(dptr, 1);
            check(size, 1);
        }
        return ncuGLMapBufferObjectAsync(memAddress(dptr), memAddress(size), buffer, hStream);
    }

    // --- [ cuGLUnmapBufferObjectAsync ] ---

    /**
     * Unmaps an OpenGL buffer object.
     * 
     * <p>Deprecated: This function is deprecated as of Cuda 3.0.</p>
     * 
     * <p>Unmaps the buffer object specified by {@code buffer} for access by CUDA.</p>
     * 
     * <p>There must be a valid OpenGL context bound to the current thread when this function is called. This must be the same context, or a member of the same
     * {@code shareGroup}, as the context that was bound when the buffer was registered.</p>
     * 
     * <p>Stream {@code hStream} in the current CUDA context is synchronized with the current GL context.</p>
     *
     * @param buffer  name of the buffer object to unmap
     * @param hStream stream to synchronize
     */
    @NativeType("CUresult")
    public static int cuGLUnmapBufferObjectAsync(@NativeType("GLuint") int buffer, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.GLUnmapBufferObjectAsync;
        return callPI(buffer, hStream, __functionAddress);
    }

}