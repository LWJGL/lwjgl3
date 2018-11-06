/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU90 = "CU90".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")
    extends = CU80
    documentation = "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/cuda-driver-api/index.html\">CUDA Driver API</a>."

    EnumConstant(
        "",

        "CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_PRE_LAUNCH_SYNC".enum(
            """
            If set, each kernel launched as part of #LaunchCooperativeKernelMultiDevice() only waits for prior work in the stream corresponding to that GPU to
            complete before the kernel begins execution.
            """,
            0x01
        ),
        "CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_POST_LAUNCH_SYNC".enum(
            """
            If set, any subsequent work pushed in a stream that participated in a call to #LaunchCooperativeKernelMultiDevice() will only wait for the kernel
            launched on the GPU corresponding to that stream to complete before it begins execution.
            """,
            0x02
        )
    )

    CUresult(
        "FuncSetAttribute",
        "",

        CUfunction("hfunc", ""),
        CUfunction_attribute("attrib", ""),
        int("value", "")
    )

    CUresult(
        "LaunchCooperativeKernel",
        "",

        CUfunction("f", ""),
        unsigned_int("gridDimX", ""),
        unsigned_int("gridDimY", ""),
        unsigned_int("gridDimZ", ""),
        unsigned_int("blockDimX", ""),
        unsigned_int("blockDimY", ""),
        unsigned_int("blockDimZ", ""),
        unsigned_int("sharedMemBytes", ""),
        nullable..CUstream("hStream", ""),
        Unsafe..nullable..void.p.p("kernelParams", "")
    ).ptsz()

    CUresult(
        "LaunchCooperativeKernelMultiDevice",
        "",

        Input..CUDA_LAUNCH_PARAMS.p("launchParamsList", ""),
        AutoSize("launchParamsList")..unsigned_int("numDevices", ""),
        unsigned_int("flags", "")
    )
}