/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU70 = "CU70".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    extends = CU65
    documentation = "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/cuda-driver-api/index.html\">CUDA Driver API</a>."

    LongConstant(
        """
        Legacy stream handle.

        Stream handle that can be passed as a {@code CUstream} to use an implicit stream with legacy synchronization behavior.
        """,

        "STREAM_LEGACY"..0x1L
    )

    LongConstant(
        """
        Per-thread stream handle.

        Stream handle that can be passed as a {@code CUstream} to use an implicit stream with per-thread synchronization behavior.
        """,

        "STREAM_PER_THREAD"..0x2L
    )

    CUresult(
        "DevicePrimaryCtxRetain",
        "",

        Check(1)..CUcontext.p("pctx", ""),
        CUdevice("dev", "")
    )

    CUresult(
        "DevicePrimaryCtxRelease",
        "",

        CUdevice("dev", "")
    )

    CUresult(
        "DevicePrimaryCtxSetFlags",
        "",

        CUdevice("dev", ""),
        unsigned_int("flags", "")
    )

    CUresult(
        "DevicePrimaryCtxGetState",
        "",

        CUdevice("dev", ""),
        Check(1)..unsigned_int.p("flags", ""),
        Check(1)..int.p("active", "")
    )

    CUresult(
        "DevicePrimaryCtxReset",
        "",

        CUdevice("dev", "")
    )

    CUresult(
        "CtxGetFlags",
        "",

        Check(1)..unsigned_int.p("flags", "")
    )

    CUresult(
        "PointerGetAttributes",
        "",

        AutoSize("attributes", "data")..unsigned_int("numAttributes", ""),
        CUpointer_attribute.p("attributes", ""),
        void.p.p("data", ""),
        CUdeviceptr("ptr", "")
    )
}