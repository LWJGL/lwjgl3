/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import java.nio.*;

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
public class CUGL65 extends CUGL {

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

    protected CUGL65() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GLGetDevices = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_VERSION("cuGLGetDevices", 2));

    }

    // --- [ cuGLGetDevices ] ---

    public static int ncuGLGetDevices(long pCudaDeviceCount, long pCudaDevices, int cudaDeviceCount, int deviceList) {
        long __functionAddress = Functions.GLGetDevices;
        return callPPI(pCudaDeviceCount, pCudaDevices, cudaDeviceCount, deviceList, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGLGetDevices(@NativeType("unsigned int *") IntBuffer pCudaDeviceCount, @NativeType("CUdevice *") IntBuffer pCudaDevices, @NativeType("CUGLDeviceList") int deviceList) {
        if (CHECKS) {
            check(pCudaDeviceCount, 1);
        }
        return ncuGLGetDevices(memAddress(pCudaDeviceCount), memAddress(pCudaDevices), pCudaDevices.remaining(), deviceList);
    }

}