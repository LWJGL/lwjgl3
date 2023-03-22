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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Contains bindings to <a href="https://developer.nvidia.com/cuda-zone">CUDA</a> profiler control functions of the low-level CUDA driver API. */
public class CUDAProfiler {

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ProfilerInitialize = apiGetFunctionAddress(CU.getLibrary(), "cuProfilerInitialize"),
            ProfilerStart      = apiGetFunctionAddress(CU.getLibrary(), "cuProfilerStart"),
            ProfilerStop       = apiGetFunctionAddress(CU.getLibrary(), "cuProfilerStop");

    }

    /**
     * {@code CUoutput_mode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_OUT_KEY_VALUE_PAIR OUT_KEY_VALUE_PAIR}</li>
     * <li>{@link #CU_OUT_CSV OUT_CSV}</li>
     * </ul>
     */
    public static final int
        CU_OUT_KEY_VALUE_PAIR = 0x0,
        CU_OUT_CSV            = 0x1;

    protected CUDAProfiler() {
        throw new UnsupportedOperationException();
    }

    // --- [ cuProfilerInitialize ] ---

    public static int ncuProfilerInitialize(long configFile, long outputFile, int outputMode) {
        long __functionAddress = Functions.ProfilerInitialize;
        return callPPI(configFile, outputFile, outputMode, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuProfilerInitialize(@NativeType("char const *") ByteBuffer configFile, @NativeType("char const *") ByteBuffer outputFile, @NativeType("CUoutput_mode") int outputMode) {
        if (CHECKS) {
            checkNT1(configFile);
            checkNT1(outputFile);
        }
        return ncuProfilerInitialize(memAddress(configFile), memAddress(outputFile), outputMode);
    }

    @NativeType("CUresult")
    public static int cuProfilerInitialize(@NativeType("char const *") CharSequence configFile, @NativeType("char const *") CharSequence outputFile, @NativeType("CUoutput_mode") int outputMode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(configFile, true);
            long configFileEncoded = stack.getPointerAddress();
            stack.nASCII(outputFile, true);
            long outputFileEncoded = stack.getPointerAddress();
            return ncuProfilerInitialize(configFileEncoded, outputFileEncoded, outputMode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuProfilerStart ] ---

    @NativeType("CUresult")
    public static int cuProfilerStart() {
        long __functionAddress = Functions.ProfilerStart;
        return callI(__functionAddress);
    }

    // --- [ cuProfilerStop ] ---

    @NativeType("CUresult")
    public static int cuProfilerStop() {
        long __functionAddress = Functions.ProfilerStop;
        return callI(__functionAddress);
    }

}