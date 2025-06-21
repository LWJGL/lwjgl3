/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package meshoptimizer

import org.lwjgl.generator.*

val meshopt_EncodeExpMode = "enum meshopt_EncodeExpMode".enumType

val meshopt_Stream = struct(Module.MESHOPTIMIZER, "MeshoptStream", nativeName = "struct meshopt_Stream") {
    void.const.p("data")
    size_t("size")
    size_t("stride")
}

val meshopt_VertexCacheStatistics = struct(Module.MESHOPTIMIZER, "MeshoptVertexCacheStatistics", nativeName = "struct meshopt_VertexCacheStatistics", mutable = false) {
    unsigned_int("vertices_transformed")
    unsigned_int("warps_executed")
    float("acmr")
    float("atvr")
}

val meshopt_OverdrawStatistics = struct(Module.MESHOPTIMIZER, "MeshoptOverdrawStatistics", nativeName = "struct meshopt_OverdrawStatistics", mutable = false) {
    unsigned_int("pixels_covered")
    unsigned_int("pixels_shaded")
    float("overdraw")
}

val meshopt_VertexFetchStatistics = struct(Module.MESHOPTIMIZER, "MeshoptVertexFetchStatistics", nativeName = "struct meshopt_VertexFetchStatistics", mutable = false) {
    unsigned_int("bytes_fetched")
    float("overfetch")
}

val meshopt_CoverageStatistics = struct(Module.MESHOPTIMIZER, "MeshoptCoverageStatistics", nativeName = "struct meshopt_CoverageStatistics", mutable = false)  {
    float("coverage")[3]
    float("extent")
}

val meshopt_Meshlet = struct(Module.MESHOPTIMIZER, "MeshoptMeshlet", nativeName = "struct meshopt_Meshlet", mutable = false) {
    unsigned_int("vertex_offset")
    unsigned_int("triangle_offset")

    unsigned_int("vertex_count")
    unsigned_int("triangle_count")
}

val meshopt_Bounds = struct(Module.MESHOPTIMIZER, "MeshoptBounds", nativeName = "struct meshopt_Bounds", mutable = false) {
    float("center")[3]
    float("radius")
    float("cone_apex")[3]
    float("cone_axis")[3]
    float("cone_cutoff")
    char("cone_axis_s8")[3]
    char("cone_cutoff_s8")
}

val meshopt_AllocateCB = Module.MESHOPTIMIZER.callback {
    void.p(
        "MeshoptAllocate",

        size_t("size")
    ) {}
}

val meshopt_DeallocateCB = Module.MESHOPTIMIZER.callback {
    void(
        "MeshoptDeallocate",

        void.p("ptr")
    ) {}
}

val meshopt_EqualsCB = Module.MESHOPTIMIZER.callback {
    intb(
        "MeshoptEquals",

        opaque_p("context"),
        unsigned_int("index_a"),
        unsigned_int("index_b")
    ) {}
}