/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU42 = "CU42".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    extends = CU41
    documentation = "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/cuda-driver-api/index.html\">CUDA Driver API</a>."

    EnumConstant(
        "Shared memory configurations. ({@code CUsharedconfig})",

        "SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE".enum("set default shared memory bank size", 0x00),
        "SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE".enum("set shared memory bank width to four bytes", 0x01),
        "SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE".enum("set shared memory bank width to eight bytes", 0x02)
    )

    EnumConstant(
        """
        Shared memory carveout configurations. ({@code CUshared_carveout})

        These may be passed to #FuncSetAttribute().
        """,

        "SHAREDMEM_CARVEOUT_DEFAULT".enum("no preference for shared memory or L1 (default)", -1),
        "SHAREDMEM_CARVEOUT_MAX_SHARED".enum("prefer maximum available shared memory, minimum L1 cache", 100),
        "SHAREDMEM_CARVEOUT_MAX_L1".enum("prefer maximum available L1 cache, minimum shared memory", 0)
    )

    CUresult(
        "CtxGetSharedMemConfig",
        "",

        Check(1)..CUsharedconfig.p("pConfig", "")
    )

    CUresult(
        "CtxSetSharedMemConfig",
        "",

        CUsharedconfig("config", "")
    )

    CUresult(
        "FuncSetSharedMemConfig",
        "",

        CUfunction("hfunc", ""),
        CUsharedconfig("config", "")
    )
}