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

/** Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>. */
public class CU70 extends CU65 {

    /**
     * Legacy stream handle.
     * 
     * <p>Stream handle that can be passed as a {@code CUstream} to use an implicit stream with legacy synchronization behavior.</p>
     */
    public static final long CU_STREAM_LEGACY = 0x1L;

    /**
     * Per-thread stream handle.
     * 
     * <p>Stream handle that can be passed as a {@code CUstream} to use an implicit stream with per-thread synchronization behavior.</p>
     */
    public static final long CU_STREAM_PER_THREAD = 0x2L;

    protected CU70() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DevicePrimaryCtxRetain   = apiGetFunctionAddress(CU.getLibrary(), "cuDevicePrimaryCtxRetain"),
            DevicePrimaryCtxRelease  = apiGetFunctionAddress(CU.getLibrary(), "cuDevicePrimaryCtxRelease"),
            DevicePrimaryCtxSetFlags = apiGetFunctionAddress(CU.getLibrary(), "cuDevicePrimaryCtxSetFlags"),
            DevicePrimaryCtxGetState = apiGetFunctionAddress(CU.getLibrary(), "cuDevicePrimaryCtxGetState"),
            DevicePrimaryCtxReset    = apiGetFunctionAddress(CU.getLibrary(), "cuDevicePrimaryCtxReset"),
            CtxGetFlags              = apiGetFunctionAddress(CU.getLibrary(), "cuCtxGetFlags"),
            PointerGetAttributes     = apiGetFunctionAddress(CU.getLibrary(), "cuPointerGetAttributes");

    }

    // --- [ cuDevicePrimaryCtxRetain ] ---

    public static int ncuDevicePrimaryCtxRetain(long pctx, int dev) {
        long __functionAddress = Functions.DevicePrimaryCtxRetain;
        return callPI(pctx, dev, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxRetain(@NativeType("CUcontext *") PointerBuffer pctx, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuDevicePrimaryCtxRetain(memAddress(pctx), dev);
    }

    // --- [ cuDevicePrimaryCtxRelease ] ---

    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxRelease(@NativeType("CUdevice") int dev) {
        long __functionAddress = Functions.DevicePrimaryCtxRelease;
        return callI(dev, __functionAddress);
    }

    // --- [ cuDevicePrimaryCtxSetFlags ] ---

    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxSetFlags(@NativeType("CUdevice") int dev, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.DevicePrimaryCtxSetFlags;
        return callI(dev, flags, __functionAddress);
    }

    // --- [ cuDevicePrimaryCtxGetState ] ---

    public static int ncuDevicePrimaryCtxGetState(int dev, long flags, long active) {
        long __functionAddress = Functions.DevicePrimaryCtxGetState;
        return callPPI(dev, flags, active, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxGetState(@NativeType("CUdevice") int dev, @NativeType("unsigned int *") IntBuffer flags, @NativeType("int *") IntBuffer active) {
        if (CHECKS) {
            check(flags, 1);
            check(active, 1);
        }
        return ncuDevicePrimaryCtxGetState(dev, memAddress(flags), memAddress(active));
    }

    // --- [ cuDevicePrimaryCtxReset ] ---

    @NativeType("CUresult")
    public static int cuDevicePrimaryCtxReset(@NativeType("CUdevice") int dev) {
        long __functionAddress = Functions.DevicePrimaryCtxReset;
        return callI(dev, __functionAddress);
    }

    // --- [ cuCtxGetFlags ] ---

    public static int ncuCtxGetFlags(long flags) {
        long __functionAddress = Functions.CtxGetFlags;
        return callPI(flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuCtxGetFlags(@NativeType("unsigned int *") IntBuffer flags) {
        if (CHECKS) {
            check(flags, 1);
        }
        return ncuCtxGetFlags(memAddress(flags));
    }

    // --- [ cuPointerGetAttributes ] ---

    public static int ncuPointerGetAttributes(int numAttributes, long attributes, long data, long ptr) {
        long __functionAddress = Functions.PointerGetAttributes;
        if (CHECKS) {
            check(ptr);
        }
        return callPPPI(numAttributes, attributes, data, ptr, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuPointerGetAttributes(@NativeType("CUpointer_attribute *") IntBuffer attributes, @NativeType("void **") PointerBuffer data, @NativeType("CUdeviceptr") long ptr) {
        if (CHECKS) {
            check(data, attributes.remaining());
        }
        return ncuPointerGetAttributes(attributes.remaining(), memAddress(attributes), memAddress(data), ptr);
    }

}