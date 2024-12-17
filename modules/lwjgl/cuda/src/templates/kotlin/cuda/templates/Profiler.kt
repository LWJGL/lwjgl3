/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val Profiler = "CUDAProfiler".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    EnumConstant(
        "OUT_KEY_VALUE_PAIR".enum(0x00),
        "OUT_CSV".enum
    )

    CUresult(
        "ProfilerInitialize",

        charASCII.const.p("configFile"),
        charASCII.const.p("outputFile"),
        CUoutput_mode("outputMode")
    )

    CUresult(
        "ProfilerStart",

        void()
    )

    CUresult(
        "ProfilerStop",

        void()
    )
}