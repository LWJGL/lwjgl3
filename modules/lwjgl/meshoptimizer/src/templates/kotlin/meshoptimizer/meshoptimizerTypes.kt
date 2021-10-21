/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package meshoptimizer

import org.lwjgl.generator.*

val meshopt_Stream = struct(Module.MESHOPTIMIZER, "MeshoptStream", nativeName = "struct meshopt_Stream") {
    documentation =
        """
        Vertex attribute stream, similar to {@code glVertexPointer}.
        
        Each element takes {@code size} bytes, with {@code stride} controlling the spacing between successive elements.
        """

    void.const.p("data", "")
    size_t("size", "")
    size_t("stride", "")
}

val meshopt_VertexCacheStatistics = struct(Module.MESHOPTIMIZER, "MeshoptVertexCacheStatistics", nativeName = "struct meshopt_VertexCacheStatistics", mutable = false) {
    documentation = ""

    unsigned_int("vertices_transformed", "")
    unsigned_int("warps_executed", "")
    float("acmr", "transformed vertices / triangle count; best case 0.5, worst case 3.0, optimum depends on topology")
    float("atvr", "transformed vertices / vertex count; best case 1.0, worst case 6.0, optimum is 1.0 (each vertex is transformed once)")
}

val meshopt_OverdrawStatistics = struct(Module.MESHOPTIMIZER, "MeshoptOverdrawStatistics", nativeName = "struct meshopt_OverdrawStatistics", mutable = false) {
    documentation = ""

    unsigned_int("pixels_covered", "")
    unsigned_int("pixels_shaded", "")
    float("overdraw", "shaded pixels / covered pixels; best case 1.0")
}

val meshopt_VertexFetchStatistics = struct(Module.MESHOPTIMIZER, "MeshoptVertexFetchStatistics", nativeName = "struct meshopt_VertexFetchStatistics", mutable = false) {
    documentation = ""

    unsigned_int("bytes_fetched", "")
    float("overfetch", "fetched bytes / vertex buffer size; best case 1.0 (each byte is fetched once)")
}

val meshopt_Meshlet = struct(Module.MESHOPTIMIZER, "MeshoptMeshlet", nativeName = "struct meshopt_Meshlet", mutable = false) {
    documentation = "Experimental: Meshlet"

    unsigned_int("vertex_offset", "offset within {@code meshlet_vertices} array with meshlet data")
    unsigned_int("triangle_offset", "offset within {@code meshlet_triangles} array with meshlet data")

    unsigned_int("vertex_count", "number of vertices used in the meshlet; data is stored in consecutive range defined by offset and count")
    unsigned_int("triangle_count", "number of triangles used in the meshlet; data is stored in consecutive range defined by offset and count")
}

val meshopt_Bounds = struct(Module.MESHOPTIMIZER, "MeshoptBounds", nativeName = "struct meshopt_Bounds", mutable = false) {
    documentation = ""

    float("center", "bounding sphere, useful for frustum and occlusion culling")[3]
    float("radius", "")
    float("cone_apex", "normal cone, useful for backface culling")[3]
    float("cone_axis", "")[3]
    float("cone_cutoff", "{@code cos(angle/2)}")
    char("cone_axis_s8", "normal cone axis and cutoff, stored in 8-bit {@code SNORM} format; decode using {@code x/127.0}")[3]
    char("cone_cutoff_s8", "")
}

val meshopt_AllocateCB = Module.MESHOPTIMIZER.callback {
    void.p(
        "MeshoptAllocate",
        "",

        size_t("size", "")
    ) {
        documentation = "Instances of this interface may be passed to the #setAllocator() method."
    }
}

val meshopt_DeallocateCB = Module.MESHOPTIMIZER.callback {
    void(
        "MeshoptDeallocate",
        "",

        void.p("ptr", "")
    ) {
        documentation = "Instances of this interface may be passed to the #setAllocator() method."
    }
}