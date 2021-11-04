/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val Profiler = "CUDAProfiler".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    documentation =
        "Contains bindings to <a href=\"https://developer.nvidia.com/cuda-zone\">CUDA</a> profiler control functions of the low-level CUDA driver API."

    EnumConstant(
        "Profiler Output Modes. ({@code CUoutput_mode}",

        "OUT_KEY_VALUE_PAIR".enum("Output mode Key-Value pair format.", 0x00),
        "OUT_CSV".enum("Output mode Comma separated values format.")
    )

    CUresult(
        "ProfilerInitialize",
        """
        Initialize the profiling. Deprecated.

        Using this API user can initialize the CUDA profiler by specifying the configuration file, output file and output file format. This API is generally
        used to profile different set of counters by looping the kernel launch. The {@code configFile} parameter can be used to select profiling options
        including profiler counters. Refer to the "Compute Command Line Profiler User Guide" for supported profiler options and counters.

        Limitation: The CUDA profiler cannot be initialized with this API if another profiling tool is already active, as indicated by the
        #CUDA_ERROR_PROFILER_DISABLED return code.

        Typical usage of the profiling APIs is as follows:
        ${codeBlock("""
for each set of counters/options
{
    cuProfilerInitialize(); //Initialize profiling, set the counters or options in the config file
    ...
    cuProfilerStart();
    // code to be profiled
    cuProfilerStop();
    ...
    cuProfilerStart();
    // code to be profiled
    cuProfilerStop();
    ...
}""")}
        """,

        charASCII.const.p("configFile", "name of the config file that lists the counters/options for profiling"),
        charASCII.const.p("outputFile", "name of the outputFile where the profiling results will be stored"),
        CUoutput_mode("outputMode", "", "#OUT_KEY_VALUE_PAIR #OUT_CSV")
    )

    CUresult(
        "ProfilerStart",
        """
        Enable profiling.

        Enables profile collection by the active profiling tool for the current context. If profiling is already enabled, then {@code cuProfilerStart()} has no
        effect.

        {@code cuProfilerStart} and #ProfilerStop() APIs are used to programmatically control the profiling granularity by allowing profiling to be done only
        on selective pieces of code.
        """,
        void()
    )

    CUresult(
        "ProfilerStop",
        """
        Disable profiling.

        Disables profile collection by the active profiling tool for the current context. If profiling is already disabled, then {@code cuProfilerStop()} has
        no effect.

        #ProfilerStart() and {@code cuProfilerStop} APIs are used to programmatically control the profiling granularity by allowing profiling to be done only
        on selective pieces of code.
        """,
        void()
    )
}