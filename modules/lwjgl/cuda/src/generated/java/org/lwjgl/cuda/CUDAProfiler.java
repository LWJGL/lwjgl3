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
     * Profiler Output Modes. ({@code CUoutput_mode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_OUT_KEY_VALUE_PAIR OUT_KEY_VALUE_PAIR} - Output mode Key-Value pair format.</li>
     * <li>{@link #CU_OUT_CSV OUT_CSV} - Output mode Comma separated values format.</li>
     * </ul>
     */
    public static final int
        CU_OUT_KEY_VALUE_PAIR = 0x0,
        CU_OUT_CSV            = 0x1;

    protected CUDAProfiler() {
        throw new UnsupportedOperationException();
    }

    // --- [ cuProfilerInitialize ] ---

    /** Unsafe version of: {@link #cuProfilerInitialize ProfilerInitialize} */
    public static int ncuProfilerInitialize(long configFile, long outputFile, int outputMode) {
        long __functionAddress = Functions.ProfilerInitialize;
        return callPPI(configFile, outputFile, outputMode, __functionAddress);
    }

    /**
     * Initialize the profiling. Deprecated.
     * 
     * <p>Using this API user can initialize the CUDA profiler by specifying the configuration file, output file and output file format. This API is generally
     * used to profile different set of counters by looping the kernel launch. The {@code configFile} parameter can be used to select profiling options
     * including profiler counters. Refer to the "Compute Command Line Profiler User Guide" for supported profiler options and counters.</p>
     * 
     * <p>Limitation: The CUDA profiler cannot be initialized with this API if another profiling tool is already active, as indicated by the
     * {@link CU#CUDA_ERROR_PROFILER_DISABLED} return code.</p>
     * 
     * <p>Typical usage of the profiling APIs is as follows:</p>
     * 
     * <pre><code>
     * for each set of counters/options
     * {
     *     cuProfilerInitialize(); //Initialize profiling, set the counters or options in the config file
     *     ...
     *     cuProfilerStart();
     *     // code to be profiled
     *     cuProfilerStop();
     *     ...
     *     cuProfilerStart();
     *     // code to be profiled
     *     cuProfilerStop();
     *     ...
     * }</code></pre>
     *
     * @param configFile name of the config file that lists the counters/options for profiling
     * @param outputFile name of the outputFile where the profiling results will be stored
     * @param outputMode one of:<br><table><tr><td>{@link #CU_OUT_KEY_VALUE_PAIR OUT_KEY_VALUE_PAIR}</td><td>{@link #CU_OUT_CSV OUT_CSV}</td></tr></table>
     */
    @NativeType("CUresult")
    public static int cuProfilerInitialize(@NativeType("char const *") ByteBuffer configFile, @NativeType("char const *") ByteBuffer outputFile, @NativeType("CUoutput_mode") int outputMode) {
        if (CHECKS) {
            checkNT1(configFile);
            checkNT1(outputFile);
        }
        return ncuProfilerInitialize(memAddress(configFile), memAddress(outputFile), outputMode);
    }

    /**
     * Initialize the profiling. Deprecated.
     * 
     * <p>Using this API user can initialize the CUDA profiler by specifying the configuration file, output file and output file format. This API is generally
     * used to profile different set of counters by looping the kernel launch. The {@code configFile} parameter can be used to select profiling options
     * including profiler counters. Refer to the "Compute Command Line Profiler User Guide" for supported profiler options and counters.</p>
     * 
     * <p>Limitation: The CUDA profiler cannot be initialized with this API if another profiling tool is already active, as indicated by the
     * {@link CU#CUDA_ERROR_PROFILER_DISABLED} return code.</p>
     * 
     * <p>Typical usage of the profiling APIs is as follows:</p>
     * 
     * <pre><code>
     * for each set of counters/options
     * {
     *     cuProfilerInitialize(); //Initialize profiling, set the counters or options in the config file
     *     ...
     *     cuProfilerStart();
     *     // code to be profiled
     *     cuProfilerStop();
     *     ...
     *     cuProfilerStart();
     *     // code to be profiled
     *     cuProfilerStop();
     *     ...
     * }</code></pre>
     *
     * @param configFile name of the config file that lists the counters/options for profiling
     * @param outputFile name of the outputFile where the profiling results will be stored
     * @param outputMode one of:<br><table><tr><td>{@link #CU_OUT_KEY_VALUE_PAIR OUT_KEY_VALUE_PAIR}</td><td>{@link #CU_OUT_CSV OUT_CSV}</td></tr></table>
     */
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

    /**
     * Enable profiling.
     * 
     * <p>Enables profile collection by the active profiling tool for the current context. If profiling is already enabled, then {@code cuProfilerStart()} has no
     * effect.</p>
     * 
     * <p>{@code cuProfilerStart} and {@link #cuProfilerStop ProfilerStop} APIs are used to programmatically control the profiling granularity by allowing profiling to be done only
     * on selective pieces of code.</p>
     */
    @NativeType("CUresult")
    public static int cuProfilerStart() {
        long __functionAddress = Functions.ProfilerStart;
        return callI(__functionAddress);
    }

    // --- [ cuProfilerStop ] ---

    /**
     * Disable profiling.
     * 
     * <p>Disables profile collection by the active profiling tool for the current context. If profiling is already disabled, then {@code cuProfilerStop()} has
     * no effect.</p>
     * 
     * <p>{@link #cuProfilerStart ProfilerStart} and {@code cuProfilerStop} APIs are used to programmatically control the profiling granularity by allowing profiling to be done only
     * on selective pieces of code.</p>
     */
    @NativeType("CUresult")
    public static int cuProfilerStop() {
        long __functionAddress = Functions.ProfilerStop;
        return callI(__functionAddress);
    }

}