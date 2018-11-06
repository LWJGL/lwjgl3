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

        Check(1)..int.p("numBlocks", ""),
        CUfunction("func", ""),
        int("blockSize", ""),
        size_t("dynamicSMemSize", "")
    )

    CUresult(
        "OccupancyMaxActiveBlocksPerMultiprocessorWithFlags",
        "",

        Check(1)..int.p("numBlocks", ""),
        CUfunction("func", ""),
        int("blockSize", ""),
        size_t("dynamicSMemSize", ""),
        unsigned_int("flags", "")
    )

    CUresult(
        "OccupancyMaxPotentialBlockSize",
        "",

        Check(1)..int.p("minGridSize", ""),
        Check(1)..int.p("blockSize", ""),
        CUfunction("func", ""),
        nullable..CUoccupancyB2DSize("blockSizeToDynamicSMemSize", ""),
        size_t("dynamicSMemSize", ""),
        int("blockSizeLimit", "")
    )

    CUresult(
        "OccupancyMaxPotentialBlockSizeWithFlags",
        "",

        Check(1)..int.p("minGridSize", ""),
        Check(1)..int.p("blockSize", ""),
        CUfunction("func", ""),
        CUoccupancyB2DSize("blockSizeToDynamicSMemSize", ""),
        size_t("dynamicSMemSize", ""),
        int("blockSizeLimit", ""),
        unsigned_int("flags", "")
    )
}