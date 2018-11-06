/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU92 = "CU92".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")
    extends = CU90
    documentation = "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/cuda-driver-api/index.html\">CUDA Driver API</a>."

    CUresult(
        "DeviceGetUuid",
        "",

        CUuuid.p("uuid", ""),
        CUdevice("dev", "")
    )

    CUresult(
        "StreamGetCtx",
        "",

        CUstream("hStream", ""),
        Check(1)..CUcontext.p("pctx", "")
    ).ptsz()
}