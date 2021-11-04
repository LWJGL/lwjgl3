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
 * 
 * <p>This class contains Windows-specific functionality.</p>
 */
public class CUWGL {

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            WGLGetDevice = apiGetFunctionAddress(CU.getLibrary(), "cuWGLGetDevice");

    }

    protected CUWGL() {
        throw new UnsupportedOperationException();
    }

    // --- [ cuWGLGetDevice ] ---

    /** Unsafe version of: {@link #cuWGLGetDevice WGLGetDevice} */
    public static int ncuWGLGetDevice(long pDevice, long hGpu) {
        long __functionAddress = Functions.WGLGetDevice;
        if (CHECKS) {
            check(hGpu);
        }
        return callPPI(pDevice, hGpu, __functionAddress);
    }

    /**
     * Gets the CUDA device associated with {@code hGpu}.
     * 
     * <p>Returns in {@code *pDevice} the CUDA device associated with a {@code hGpu}, if applicable.</p>
     *
     * @param pDevice device associated with hGpu
     * @param hGpu    handle to a GPU, as queried via {@code WGL_NV_gpu_affinity()}
     */
    @NativeType("CUresult")
    public static int cuWGLGetDevice(@NativeType("CUdevice *") IntBuffer pDevice, @NativeType("HGPUNV") long hGpu) {
        if (CHECKS) {
            check(pDevice, 1);
        }
        return ncuWGLGetDevice(memAddress(pDevice), hGpu);
    }

}