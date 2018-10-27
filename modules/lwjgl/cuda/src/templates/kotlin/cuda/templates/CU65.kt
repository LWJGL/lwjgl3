/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU65 = "CU65".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    extends = CU60
    documentation = "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/cuda-driver-api/index.html\">CUDA Driver API</a>."

    EnumConstant(
        "Occupancy calculator flag. ({@code CUoccupancy_flags})",

        "OCCUPANCY_DEFAULT".enum("Default behavior", 0x0),
        "OCCUPANCY_DISABLE_CACHING_OVERRIDE".enum("Assume global caching is enabled and cannot be automatically turned off", 0x1)
    )

    CUresult(
        "OccupancyMaxActiveBlocksPerMultiprocessor",
        "",

        Check(1)..int.p.OUT("numBlocks", ""),
        CUfunction.IN("func", ""),
        int.IN("blockSize", ""),
        size_t.IN("dynamicSMemSize", "")
    )

    CUresult(
        "OccupancyMaxActiveBlocksPerMultiprocessorWithFlags",
        "",

        Check(1)..int.p.OUT("numBlocks", ""),
        CUfunction.IN("func", ""),
        int.IN("blockSize", ""),
        size_t.IN("dynamicSMemSize", ""),
        unsigned_int.IN("flags", "")
    )

    CUresult(
        "OccupancyMaxPotentialBlockSize",
        "",

        Check(1)..int.p.OUT("minGridSize", ""),
        Check(1)..int.p.OUT("blockSize", ""),
        CUfunction.IN("func", ""),
        nullable..CUoccupancyB2DSize.IN("blockSizeToDynamicSMemSize", ""),
        size_t.IN("dynamicSMemSize", ""),
        int.IN("blockSizeLimit", "")
    )

    CUresult(
        "OccupancyMaxPotentialBlockSizeWithFlags",
        "",

        Check(1)..int.p.OUT("minGridSize", ""),
        Check(1)..int.p.OUT("blockSize", ""),
        CUfunction.IN("func", ""),
        CUoccupancyB2DSize.IN("blockSizeToDynamicSMemSize", ""),
        size_t.IN("dynamicSMemSize", ""),
        int.IN("blockSizeLimit", ""),
        unsigned_int.IN("flags", "")
    )
}