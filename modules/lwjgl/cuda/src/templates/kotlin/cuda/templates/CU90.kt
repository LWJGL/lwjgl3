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

        CUfunction.IN("hfunc", ""),
        CUfunction_attribute.IN("attrib", ""),
        int.IN("value", "")
    )

    CUresult(
        "LaunchCooperativeKernel",
        "",

        CUfunction.IN("f", ""),
        unsigned_int.IN("gridDimX", ""),
        unsigned_int.IN("gridDimY", ""),
        unsigned_int.IN("gridDimZ", ""),
        unsigned_int.IN("blockDimX", ""),
        unsigned_int.IN("blockDimY", ""),
        unsigned_int.IN("blockDimZ", ""),
        unsigned_int.IN("sharedMemBytes", ""),
        nullable..CUstream.IN("hStream", ""),
        Unsafe..nullable..void.p.p.IN("kernelParams", "")
    ).ptsz()

    CUresult(
        "LaunchCooperativeKernelMultiDevice",
        "",

        CUDA_LAUNCH_PARAMS.p.IN("launchParamsList", ""),
        AutoSize("launchParamsList")..unsigned_int.IN("numDevices", ""),
        unsigned_int.IN("flags", "")
    )
}