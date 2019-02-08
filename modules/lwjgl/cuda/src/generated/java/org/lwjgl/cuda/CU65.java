/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>. */
public class CU65 extends CU60 {

    /**
     * Occupancy calculator flag. ({@code CUoccupancy_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_OCCUPANCY_DEFAULT OCCUPANCY_DEFAULT} - Default behavior</li>
     * <li>{@link #CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE OCCUPANCY_DISABLE_CACHING_OVERRIDE} - Assume global caching is enabled and cannot be automatically turned off</li>
     * </ul>
     */
    public static final int
        CU_OCCUPANCY_DEFAULT                  = 0x0,
        CU_OCCUPANCY_DISABLE_CACHING_OVERRIDE = 0x1;

    protected CU65() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            OccupancyMaxActiveBlocksPerMultiprocessor          = apiGetFunctionAddress(CU.getLibrary(), "cuOccupancyMaxActiveBlocksPerMultiprocessor"),
            OccupancyMaxActiveBlocksPerMultiprocessorWithFlags = apiGetFunctionAddress(CU.getLibrary(), "cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags"),
            OccupancyMaxPotentialBlockSize                     = apiGetFunctionAddress(CU.getLibrary(), "cuOccupancyMaxPotentialBlockSize"),
            OccupancyMaxPotentialBlockSizeWithFlags            = apiGetFunctionAddress(CU.getLibrary(), "cuOccupancyMaxPotentialBlockSizeWithFlags");

    }

    // --- [ cuOccupancyMaxActiveBlocksPerMultiprocessor ] ---

    public static int ncuOccupancyMaxActiveBlocksPerMultiprocessor(long numBlocks, long func, int blockSize, long dynamicSMemSize) {
        long __functionAddress = Functions.OccupancyMaxActiveBlocksPerMultiprocessor;
        if (CHECKS) {
            check(func);
        }
        return callPPPI(numBlocks, func, blockSize, dynamicSMemSize, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuOccupancyMaxActiveBlocksPerMultiprocessor(@NativeType("int *") IntBuffer numBlocks, @NativeType("CUfunction") long func, int blockSize, @NativeType("size_t") long dynamicSMemSize) {
        if (CHECKS) {
            check(numBlocks, 1);
        }
        return ncuOccupancyMaxActiveBlocksPerMultiprocessor(memAddress(numBlocks), func, blockSize, dynamicSMemSize);
    }

    // --- [ cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags ] ---

    public static int ncuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(long numBlocks, long func, int blockSize, long dynamicSMemSize, int flags) {
        long __functionAddress = Functions.OccupancyMaxActiveBlocksPerMultiprocessorWithFlags;
        if (CHECKS) {
            check(func);
        }
        return callPPPI(numBlocks, func, blockSize, dynamicSMemSize, flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(@NativeType("int *") IntBuffer numBlocks, @NativeType("CUfunction") long func, int blockSize, @NativeType("size_t") long dynamicSMemSize, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(numBlocks, 1);
        }
        return ncuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags(memAddress(numBlocks), func, blockSize, dynamicSMemSize, flags);
    }

    // --- [ cuOccupancyMaxPotentialBlockSize ] ---

    public static int ncuOccupancyMaxPotentialBlockSize(long minGridSize, long blockSize, long func, long blockSizeToDynamicSMemSize, long dynamicSMemSize, int blockSizeLimit) {
        long __functionAddress = Functions.OccupancyMaxPotentialBlockSize;
        if (CHECKS) {
            check(func);
        }
        return callPPPPPI(minGridSize, blockSize, func, blockSizeToDynamicSMemSize, dynamicSMemSize, blockSizeLimit, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuOccupancyMaxPotentialBlockSize(@NativeType("int *") IntBuffer minGridSize, @NativeType("int *") IntBuffer blockSize, @NativeType("CUfunction") long func, @Nullable @NativeType("size_t (*) (int)") CUoccupancyB2DSizeI blockSizeToDynamicSMemSize, @NativeType("size_t") long dynamicSMemSize, int blockSizeLimit) {
        if (CHECKS) {
            check(minGridSize, 1);
            check(blockSize, 1);
        }
        return ncuOccupancyMaxPotentialBlockSize(memAddress(minGridSize), memAddress(blockSize), func, memAddressSafe(blockSizeToDynamicSMemSize), dynamicSMemSize, blockSizeLimit);
    }

    // --- [ cuOccupancyMaxPotentialBlockSizeWithFlags ] ---

    public static int ncuOccupancyMaxPotentialBlockSizeWithFlags(long minGridSize, long blockSize, long func, long blockSizeToDynamicSMemSize, long dynamicSMemSize, int blockSizeLimit, int flags) {
        long __functionAddress = Functions.OccupancyMaxPotentialBlockSizeWithFlags;
        if (CHECKS) {
            check(func);
        }
        return callPPPPPI(minGridSize, blockSize, func, blockSizeToDynamicSMemSize, dynamicSMemSize, blockSizeLimit, flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuOccupancyMaxPotentialBlockSizeWithFlags(@NativeType("int *") IntBuffer minGridSize, @NativeType("int *") IntBuffer blockSize, @NativeType("CUfunction") long func, @NativeType("size_t (*) (int)") CUoccupancyB2DSizeI blockSizeToDynamicSMemSize, @NativeType("size_t") long dynamicSMemSize, int blockSizeLimit, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(minGridSize, 1);
            check(blockSize, 1);
        }
        return ncuOccupancyMaxPotentialBlockSizeWithFlags(memAddress(minGridSize), memAddress(blockSize), func, blockSizeToDynamicSMemSize.address(), dynamicSMemSize, blockSizeLimit, flags);
    }

}