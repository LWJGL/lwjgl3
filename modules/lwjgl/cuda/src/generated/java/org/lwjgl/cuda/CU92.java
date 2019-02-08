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

/** Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>. */
public class CU92 extends CU90 {

    protected CU92() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DeviceGetUuid = apiGetFunctionAddress(CU.getLibrary(), "cuDeviceGetUuid"),
            StreamGetCtx  = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuStreamGetCtx"));

    }

    // --- [ cuDeviceGetUuid ] ---

    public static int ncuDeviceGetUuid(long uuid, int dev) {
        long __functionAddress = Functions.DeviceGetUuid;
        return callPI(uuid, dev, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDeviceGetUuid(@NativeType("CUuuid *") CUuuid uuid, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetUuid(uuid.address(), dev);
    }

    // --- [ cuStreamGetCtx ] ---

    public static int ncuStreamGetCtx(long hStream, long pctx) {
        long __functionAddress = Functions.StreamGetCtx;
        if (CHECKS) {
            check(hStream);
        }
        return callPPI(hStream, pctx, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuStreamGetCtx(@NativeType("CUstream") long hStream, @NativeType("CUcontext *") PointerBuffer pctx) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuStreamGetCtx(hStream, memAddress(pctx));
    }

}