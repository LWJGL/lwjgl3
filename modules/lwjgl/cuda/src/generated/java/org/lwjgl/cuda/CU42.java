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

/** Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>. */
public class CU42 extends CU41 {

    /**
     * Shared memory configurations. ({@code CUsharedconfig})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE} - set default shared memory bank size</li>
     * <li>{@link #CU_SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE} - set shared memory bank width to four bytes</li>
     * <li>{@link #CU_SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE} - set shared memory bank width to eight bytes</li>
     * </ul>
     */
    public static final int
        CU_SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE    = 0x0,
        CU_SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE  = 0x1,
        CU_SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE = 0x2;

    /**
     * Shared memory carveout configurations. ({@code CUshared_carveout})
     * 
     * <p>These may be passed to {@link CU90#cuFuncSetAttribute FuncSetAttribute}.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_SHAREDMEM_CARVEOUT_DEFAULT SHAREDMEM_CARVEOUT_DEFAULT} - no preference for shared memory or L1 (default)</li>
     * <li>{@link #CU_SHAREDMEM_CARVEOUT_MAX_SHARED SHAREDMEM_CARVEOUT_MAX_SHARED} - prefer maximum available shared memory, minimum L1 cache</li>
     * <li>{@link #CU_SHAREDMEM_CARVEOUT_MAX_L1 SHAREDMEM_CARVEOUT_MAX_L1} - prefer maximum available L1 cache, minimum shared memory</li>
     * </ul>
     */
    public static final int
        CU_SHAREDMEM_CARVEOUT_DEFAULT    = 0xFFFFFFFF,
        CU_SHAREDMEM_CARVEOUT_MAX_SHARED = 0x64,
        CU_SHAREDMEM_CARVEOUT_MAX_L1     = 0x0;

    protected CU42() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CtxGetSharedMemConfig  = apiGetFunctionAddress(CU.getLibrary(), "cuCtxGetSharedMemConfig"),
            CtxSetSharedMemConfig  = apiGetFunctionAddress(CU.getLibrary(), "cuCtxSetSharedMemConfig"),
            FuncSetSharedMemConfig = apiGetFunctionAddress(CU.getLibrary(), "cuFuncSetSharedMemConfig");

    }

    // --- [ cuCtxGetSharedMemConfig ] ---

    public static int ncuCtxGetSharedMemConfig(long pConfig) {
        long __functionAddress = Functions.CtxGetSharedMemConfig;
        return callPI(pConfig, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuCtxGetSharedMemConfig(@NativeType("CUsharedconfig *") IntBuffer pConfig) {
        if (CHECKS) {
            check(pConfig, 1);
        }
        return ncuCtxGetSharedMemConfig(memAddress(pConfig));
    }

    // --- [ cuCtxSetSharedMemConfig ] ---

    @NativeType("CUresult")
    public static int cuCtxSetSharedMemConfig(@NativeType("CUsharedconfig") int config) {
        long __functionAddress = Functions.CtxSetSharedMemConfig;
        return callI(config, __functionAddress);
    }

    // --- [ cuFuncSetSharedMemConfig ] ---

    @NativeType("CUresult")
    public static int cuFuncSetSharedMemConfig(@NativeType("CUfunction") long hfunc, @NativeType("CUsharedconfig") int config) {
        long __functionAddress = Functions.FuncSetSharedMemConfig;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, config, __functionAddress);
    }

}