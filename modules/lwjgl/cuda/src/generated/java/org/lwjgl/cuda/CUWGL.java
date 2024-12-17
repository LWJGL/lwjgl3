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

    /** {@code CUresult cuWGLGetDevice(CUdevice * pDevice, HGPUNV hGpu)} */
    public static int ncuWGLGetDevice(long pDevice, long hGpu) {
        long __functionAddress = Functions.WGLGetDevice;
        if (CHECKS) {
            check(hGpu);
        }
        return callPPI(pDevice, hGpu, __functionAddress);
    }

    /** {@code CUresult cuWGLGetDevice(CUdevice * pDevice, HGPUNV hGpu)} */
    @NativeType("CUresult")
    public static int cuWGLGetDevice(@NativeType("CUdevice *") IntBuffer pDevice, @NativeType("HGPUNV") long hGpu) {
        if (CHECKS) {
            check(pDevice, 1);
        }
        return ncuWGLGetDevice(memAddress(pDevice), hGpu);
    }

}