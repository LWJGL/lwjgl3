/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.cuda.CUDA.*;

/** Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>. */
public class CU90 extends CU80 {

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_PRE_LAUNCH_SYNC CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_PRE_LAUNCH_SYNC} - 
     * If set, each kernel launched as part of {@link #cuLaunchCooperativeKernelMultiDevice LaunchCooperativeKernelMultiDevice} only waits for prior work in the stream corresponding to that GPU to
     * complete before the kernel begins execution.
     * </li>
     * <li>{@link #CU_CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_POST_LAUNCH_SYNC CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_POST_LAUNCH_SYNC} - 
     * If set, any subsequent work pushed in a stream that participated in a call to {@link #cuLaunchCooperativeKernelMultiDevice LaunchCooperativeKernelMultiDevice} will only wait for the kernel
     * launched on the GPU corresponding to that stream to complete before it begins execution.
     * </li>
     * </ul>
     */
    public static final int
        CU_CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_PRE_LAUNCH_SYNC  = 0x1,
        CU_CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_POST_LAUNCH_SYNC = 0x2;

    protected CU90() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            FuncSetAttribute                   = apiGetFunctionAddress(CU.getLibrary(), "cuFuncSetAttribute"),
            LaunchCooperativeKernel            = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuLaunchCooperativeKernel")),
            LaunchCooperativeKernelMultiDevice = apiGetFunctionAddress(CU.getLibrary(), "cuLaunchCooperativeKernelMultiDevice");

    }

    // --- [ cuFuncSetAttribute ] ---

    @NativeType("CUresult")
    public static int cuFuncSetAttribute(@NativeType("CUfunction") long hfunc, @NativeType("CUfunction_attribute") int attrib, int value) {
        long __functionAddress = Functions.FuncSetAttribute;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, attrib, value, __functionAddress);
    }

    // --- [ cuLaunchCooperativeKernel ] ---

    public static int ncuLaunchCooperativeKernel(long f, int gridDimX, int gridDimY, int gridDimZ, int blockDimX, int blockDimY, int blockDimZ, int sharedMemBytes, long hStream, long kernelParams) {
        long __functionAddress = Functions.LaunchCooperativeKernel;
        if (CHECKS) {
            check(f);
        }
        return callPPPI(f, gridDimX, gridDimY, gridDimZ, blockDimX, blockDimY, blockDimZ, sharedMemBytes, hStream, kernelParams, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuLaunchCooperativeKernel(@NativeType("CUfunction") long f, @NativeType("unsigned int") int gridDimX, @NativeType("unsigned int") int gridDimY, @NativeType("unsigned int") int gridDimZ, @NativeType("unsigned int") int blockDimX, @NativeType("unsigned int") int blockDimY, @NativeType("unsigned int") int blockDimZ, @NativeType("unsigned int") int sharedMemBytes, @NativeType("CUstream") long hStream, @Nullable @NativeType("void **") PointerBuffer kernelParams) {
        return ncuLaunchCooperativeKernel(f, gridDimX, gridDimY, gridDimZ, blockDimX, blockDimY, blockDimZ, sharedMemBytes, hStream, memAddressSafe(kernelParams));
    }

    // --- [ cuLaunchCooperativeKernelMultiDevice ] ---

    public static int ncuLaunchCooperativeKernelMultiDevice(long launchParamsList, int numDevices, int flags) {
        long __functionAddress = Functions.LaunchCooperativeKernelMultiDevice;
        if (CHECKS) {
            CUDA_LAUNCH_PARAMS.validate(launchParamsList, numDevices);
        }
        return callPI(launchParamsList, numDevices, flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuLaunchCooperativeKernelMultiDevice(@NativeType("CUDA_LAUNCH_PARAMS *") CUDA_LAUNCH_PARAMS.Buffer launchParamsList, @NativeType("unsigned int") int flags) {
        return ncuLaunchCooperativeKernelMultiDevice(launchParamsList.address(), launchParamsList.remaining(), flags);
    }

}