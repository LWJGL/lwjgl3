/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

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

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GraphicsGLRegisterBuffer  = apiGetFunctionAddress(CU.getLibrary(), "cuGraphicsGLRegisterBuffer"),
            GraphicsGLRegisterImage   = apiGetFunctionAddress(CU.getLibrary(), "cuGraphicsGLRegisterImage"),
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

    // --- [ cuGraphicsGLRegisterBuffer ] ---

    public static int ncuGraphicsGLRegisterBuffer(long pCudaResource, int buffer, int Flags) {
        long __functionAddress = Functions.GraphicsGLRegisterBuffer;
        return callPI(pCudaResource, buffer, Flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphicsGLRegisterBuffer(@NativeType("CUgraphicsResource *") PointerBuffer pCudaResource, @NativeType("GLuint") int buffer, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pCudaResource, 1);
        }
        return ncuGraphicsGLRegisterBuffer(memAddress(pCudaResource), buffer, Flags);
    }

    // --- [ cuGraphicsGLRegisterImage ] ---

    public static int ncuGraphicsGLRegisterImage(long pCudaResource, int image, int target, int Flags) {
        long __functionAddress = Functions.GraphicsGLRegisterImage;
        return callPI(pCudaResource, image, target, Flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphicsGLRegisterImage(@NativeType("CUgraphicsResource *") PointerBuffer pCudaResource, @NativeType("GLuint") int image, @NativeType("GLenum") int target, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pCudaResource, 1);
        }
        return ncuGraphicsGLRegisterImage(memAddress(pCudaResource), image, target, Flags);
    }

    // --- [ cuGLCtxCreate ] ---

    public static int ncuGLCtxCreate(long pCtx, int Flags, int device) {
        long __functionAddress = Functions.GLCtxCreate;
        return callPI(pCtx, Flags, device, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGLCtxCreate(@NativeType("CUcontext *") PointerBuffer pCtx, @NativeType("unsigned int") int Flags, @NativeType("CUdevice") int device) {
        if (CHECKS) {
            check(pCtx, 1);
        }
        return ncuGLCtxCreate(memAddress(pCtx), Flags, device);
    }

    // --- [ cuGLInit ] ---

    @NativeType("CUresult")
    public static int cuGLInit() {
        long __functionAddress = Functions.GLInit;
        return callI(__functionAddress);
    }

    // --- [ cuGLRegisterBufferObject ] ---

    @NativeType("CUresult")
    public static int cuGLRegisterBufferObject(@NativeType("GLuint") int buffer) {
        long __functionAddress = Functions.GLRegisterBufferObject;
        return callI(buffer, __functionAddress);
    }

    // --- [ cuGLMapBufferObject ] ---

    public static int ncuGLMapBufferObject(long dptr, long size, int buffer) {
        long __functionAddress = Functions.GLMapBufferObject;
        return callPPI(dptr, size, buffer, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGLMapBufferObject(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t *") PointerBuffer size, @NativeType("GLuint") int buffer) {
        if (CHECKS) {
            check(dptr, 1);
            check(size, 1);
        }
        return ncuGLMapBufferObject(memAddress(dptr), memAddress(size), buffer);
    }

    // --- [ cuGLUnmapBufferObject ] ---

    @NativeType("CUresult")
    public static int cuGLUnmapBufferObject(@NativeType("GLuint") int buffer) {
        long __functionAddress = Functions.GLUnmapBufferObject;
        return callI(buffer, __functionAddress);
    }

    // --- [ cuGLUnregisterBufferObject ] ---

    @NativeType("CUresult")
    public static int cuGLUnregisterBufferObject(@NativeType("GLuint") int buffer) {
        long __functionAddress = Functions.GLUnregisterBufferObject;
        return callI(buffer, __functionAddress);
    }

    // --- [ cuGLSetBufferObjectMapFlags ] ---

    @NativeType("CUresult")
    public static int cuGLSetBufferObjectMapFlags(@NativeType("GLuint") int buffer, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.GLSetBufferObjectMapFlags;
        return callI(buffer, Flags, __functionAddress);
    }

    // --- [ cuGLMapBufferObjectAsync ] ---

    public static int ncuGLMapBufferObjectAsync(long dptr, long size, int buffer, long hStream) {
        long __functionAddress = Functions.GLMapBufferObjectAsync;
        return callPPPI(dptr, size, buffer, hStream, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGLMapBufferObjectAsync(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t *") PointerBuffer size, @NativeType("GLuint") int buffer, @NativeType("CUstream") long hStream) {
        if (CHECKS) {
            check(dptr, 1);
            check(size, 1);
        }
        return ncuGLMapBufferObjectAsync(memAddress(dptr), memAddress(size), buffer, hStream);
    }

    // --- [ cuGLUnmapBufferObjectAsync ] ---

    @NativeType("CUresult")
    public static int cuGLUnmapBufferObjectAsync(@NativeType("GLuint") int buffer, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.GLUnmapBufferObjectAsync;
        return callPI(buffer, hStream, __functionAddress);
    }

}