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

        Check(1)..CUcontext.p.OUT("pctx", ""),
        CUdevice.IN("dev", "")
    )

    CUresult(
        "DevicePrimaryCtxRelease",
        "",

        CUdevice.IN("dev", "")
    )

    CUresult(
        "DevicePrimaryCtxSetFlags",
        "",

        CUdevice.IN("dev", ""),
        unsigned_int.IN("flags", "")
    )

    CUresult(
        "DevicePrimaryCtxGetState",
        "",

        CUdevice.IN("dev", ""),
        Check(1)..unsigned_int.p.OUT("flags", ""),
        Check(1)..int.p.OUT("active", "")
    )

    CUresult(
        "DevicePrimaryCtxReset",
        "",

        CUdevice.IN("dev", "")
    )

    CUresult(
        "CtxGetFlags",
        "",

        Check(1)..unsigned_int.p.OUT("flags", "")
    )

    CUresult(
        "PointerGetAttributes",
        "",

        AutoSize("attributes", "data")..unsigned_int.IN("numAttributes", ""),
        CUpointer_attribute.p.IN("attributes", ""),
        void.p.p.OUT("data", ""),
        CUdeviceptr.IN("ptr", "")
    )
}