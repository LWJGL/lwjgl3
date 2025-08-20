/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package meshoptimizer.templates

import meshoptimizer.*
import org.lwjgl.generator.*

val meshoptimizer = "MeshOptimizer".nativeClass(Module.MESHOPTIMIZER, prefix = "meshopt", prefixMethod = "meshopt_") {
    nativeImport("meshoptimizer.h")
    javaImport("static java.lang.Float.*")

    cpp = true

    IntConstant("MESHOPTIMIZER_VERSION".."250").noPrefix()

    size_t(
        "generateVertexRemap",

        Check("vertex_count")..unsigned_int.p("destination"),
        Check("index_count")..nullable..unsigned_int.const.p("indices"),
        size_t("index_count"),
        Check("vertex_count * vertex_size")..void.const.p("vertices"),
        size_t("vertex_count"),
        size_t("vertex_size")
    )

    size_t(
        "generateVertexRemapMulti",

        Check("vertex_count")..unsigned_int.p("destination"),
        nullable..unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        size_t("vertex_count"),
        meshopt_Stream.const.p("streams"),
        AutoSize("streams")..size_t("stream_count")
    )

    size_t(
        "generateVertexRemapCustom",

        Check("vertex_count")..unsigned_int.p("destination"),
        nullable..unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride"),
        nullable..meshopt_EqualsCB("callback"),
        nullable..opaque_p("context")
    )

    void(
        "remapVertexBuffer",

        Unsafe..void.p("destination"),
        Check("vertex_count * vertex_size")..void.const.p("vertices"),
        size_t("vertex_count"),
        size_t("vertex_size"),
        Check("vertex_count")..unsigned_int.const.p("remap")
    )

    void(
        "remapIndexBuffer",

        Check("index_count")..unsigned_int.p("destination"),
        Check("index_count")..nullable..unsigned_int.const.p("indices"),
        size_t("index_count"),
        Unsafe..unsigned_int.const.p("remap")
    )

    void(
        "generateShadowIndexBuffer",

        unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices", "destination")..size_t("index_count"),
        Check("vertex_count * vertex_stride")..void.const.p("vertices"),
        size_t("vertex_count"),
        size_t("vertex_size"),
        size_t("vertex_stride")
    )

    void(
        "generateShadowIndexBufferMulti",

        unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices", "destination")..size_t("index_count"),
        size_t("vertex_count"),
        meshopt_Stream.const.p("streams"),
        AutoSize("streams")..size_t("stream_count")
    )

    void(
        "generatePositionRemap",

        Check("vertex_count")..unsigned_int.p("destination"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride")
    )

    void(
        "generateAdjacencyIndexBuffer",

        Check("indices.remaining() << 1")..unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride")
    )

    void(
        "generateTessellationIndexBuffer",

        Check("indices.remaining() << 2")..unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride")
    )

    size_t(
        "generateProvokingIndexBuffer",

        Check("index_count")..unsigned_int.p("destination"),
        Check("vertex_count + index_count / 3")..unsigned_int.p("reorder"),
        Check("index_count")..unsigned_int.const.p("indices"),
        size_t("index_count"),
        size_t("vertex_count")
    )

    void(
        "optimizeVertexCache",

        unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices", "destination")..size_t("index_count"),
        size_t("vertex_count")
    )

    void(
        "optimizeVertexCacheStrip",

        unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices", "destination")..size_t("index_count"),
        size_t("vertex_count")
    )

    void(
        "optimizeVertexCacheFifo",

        unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices", "destination")..size_t("index_count"),
        size_t("vertex_count"),
        unsigned_int("cache_size")
    )

    void(
        "optimizeOverdraw",

        unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices", "destination")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride"),
        float("threshold")
    )

    size_t(
        "optimizeVertexFetch",

        Check("vertex_count * vertex_size")..void.p("destination"),
        unsigned_int.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        Check("vertex_count * vertex_size")..void.const.p("vertices"),
        size_t("vertex_count"),
        size_t("vertex_size")
    )

    size_t(
        "optimizeVertexFetchRemap",

        unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        AutoSize("destination")..size_t("vertex_count")
    )

    size_t(
        "encodeIndexBuffer",

        unsigned_char.p("buffer"),
        AutoSize("buffer")..size_t("buffer_size"),
        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count")
    )

    size_t(
        "encodeIndexBufferBound",

        size_t("index_count"),
        size_t("vertex_count")
    )

    void(
        "encodeIndexVersion",

        int("version")
    )

    int(
        "decodeIndexBuffer",

        Check("index_count * index_size")..void.p("destination"),
        size_t("index_count"),
        size_t("index_size"),
        unsigned_char.const.p("buffer"),
        AutoSize("buffer")..size_t("buffer_size")
    )

    int(
        "decodeIndexVersion",

        unsigned_char.const.p("buffer"),
        AutoSize("buffer")..size_t("buffer_size")
    )

    size_t(
        "encodeIndexSequence",

        unsigned_char.p("buffer"),
        AutoSize("buffer")..size_t("buffer_size"),
        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count")
    )
    size_t(
        "encodeIndexSequenceBound",

        size_t("index_count"),
        size_t("vertex_count")
    )

    int(
        "decodeIndexSequence",

        Check("index_count * index_size")..void.p("destination"),
        size_t("index_count"),
        size_t("index_size"),
        unsigned_char.const.p("buffer"),
        AutoSize("buffer")..size_t("buffer_size")
    )

    size_t(
        "encodeVertexBuffer",

        unsigned_char.p("buffer"),
        AutoSize("buffer")..size_t("buffer_size"),
        Check("vertex_count * vertex_size")..void.const.p("vertices"),
        size_t("vertex_count"),
        size_t("vertex_size")
    )

    size_t(
        "encodeVertexBufferBound",

        size_t("vertex_count"),
        size_t("vertex_size")
    )

    size_t(
        "encodeVertexBufferLevel",

        unsigned_char.p("buffer"),
        AutoSize("buffer")..size_t("buffer_size"),
        Check("vertex_count * vertex_size")..void.const.p("vertices"),
        size_t("vertex_count"),
        size_t("vertex_size"),
        int("level"),
        int("version")
    )

    void(
        "encodeVertexVersion",

        int("version")
    )

    int(
        "decodeVertexBuffer",

        Check("vertex_count * vertex_size")..void.p("destination"),
        size_t("vertex_count"),
        size_t("vertex_size"),
        unsigned_char.const.p("buffer"),
        AutoSize("buffer")..size_t("buffer_size")
    )

    int(
        "decodeVertexVersion",

        unsigned_char.const.p("buffer"),
        AutoSize("buffer")..size_t("buffer_size")
    )

    void(
        "decodeFilterOct",

        MultiType(PointerMapping.DATA_SHORT)..Check("count * stride")..void.p("buffer"),
        size_t("count"),
        size_t("stride")
    )

    void(
        "decodeFilterQuat",

        MultiType(PointerMapping.DATA_SHORT)..Check("count * stride")..void.p("buffer"),
        size_t("count"),
        size_t("stride")
    )

    void(
        "decodeFilterExp",

        MultiType(PointerMapping.DATA_INT)..Check("count * stride")..void.p("buffer"),
        size_t("count"),
        size_t("stride")
    )

    void(
        "decodeFilterColor",

        MultiType(PointerMapping.DATA_SHORT)..Check("count * stride")..void.p("buffer"),
        size_t("count"),
        size_t("stride")
    )

    EnumConstant(
        "EncodeExpSeparate".enum("0"),
        "EncodeExpSharedVector".enum,
        "EncodeExpSharedComponent".enum,
        "EncodeExpClamped".enum
    )

    void(
        "encodeFilterOct",

        MultiType(PointerMapping.DATA_SHORT)..Check("count * stride")..void.p("destination"),
        size_t("count"),
        size_t("stride"),
        int("bits"),
        Check("count * 4")..float.const.p("data")
    )

    void(
        "encodeFilterQuat",

        MultiType(PointerMapping.DATA_SHORT)..Check("count * stride")..void.p("destination"),
        size_t("count"),
        size_t("stride"),
        int("bits"),
        Check("count * 4")..float.const.p("data")
    )

    void(
        "encodeFilterExp",

        MultiType(PointerMapping.DATA_INT)..Check("count * stride")..void.p("destination"),
        size_t("count"),
        size_t("stride"),
        int("bits"),
        Check("count * (stride >> 2)")..float.const.p("data"),
        meshopt_EncodeExpMode("mode")
    )

    void(
        "encodeFilterColor",

        MultiType(PointerMapping.DATA_SHORT)..Check("count * stride")..void.p("destination"),
        size_t("count"),
        size_t("stride"),
        int("bits"),
        Check("count * 4")..float.const.p("data")
    )

    EnumConstant(
        "SimplifyLockBorder".enum("1 << 0"),
        "SimplifySparse".enum("1 << 1"),
        "SimplifyErrorAbsolute".enum("1 << 2"),
        "SimplifyPrune".enum("1 << 3"),
        "SimplifyRegularize".enum("1 << 4"),
        "SimplifyPermissive".enum("1 << 5")
    )

    EnumConstant(
        "SimplifyVertex_Lock".enum("1 << 0"),
        "SimplifyVertex_Protect".enum("1 << 1")
    )

    size_t(
        "simplify",

        unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices", "destination")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride"),
        size_t("target_index_count"),
        float("target_error"),
        unsigned_int("options"),
        Check(1)..nullable..float.p("result_error")
    )

    size_t(
        "simplifyWithAttributes",

        unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices", "destination")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride"),
        Check("vertex_count * (vertex_attributes_stride >>> 2)")..float.const.p("vertex_attributes"),
        size_t("vertex_attributes_stride"),
        float.const.p("attribute_weights"),
        AutoSize("attribute_weights")..size_t("attribute_count"),
        Check("vertex_count")..nullable..unsigned_char.const.p("vertex_lock"),
        size_t("target_index_count"),
        float("target_error"),
        unsigned_int("options"),
        Check(1)..nullable..float.p("result_error")
    )

    size_t(
        "simplifyWithUpdate",

        unsigned_int.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride"),
        Check("vertex_count * (vertex_attributes_stride >>> 2)")..float.p("vertex_attributes"),
        size_t("vertex_attributes_stride"),
        float.const.p("attribute_weights"),
        AutoSize("attribute_weights")..size_t("attribute_count"),
        Check("vertex_count")..nullable..unsigned_char.const.p("vertex_lock"),
        size_t("target_index_count"),
        float("target_error"),
        unsigned_int("options"),
        Check(1)..nullable..float.p("result_error")
    )

    size_t(
        "simplifySloppy",

        unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices", "destination")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride"),
        Check("vertex_count")..nullable..unsigned_char.const.p("vertex_lock"),
        size_t("target_index_count"),
        float("target_error"),
        Check(1)..nullable..float.p("result_error")
    )

    size_t(
        "simplifyPrune",

        unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices", "destination")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride"),
        float("target_error")
    )

    size_t(
        "simplifyPoints",

        Check("target_vertex_count")..unsigned_int.p("destination"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride"),
        Check("vertex_count * (vertex_colors_stride >>> 2)")..nullable..float.const.p("vertex_colors"),
        size_t("vertex_colors_stride"),
        float("color_weight"),
        size_t("target_vertex_count")
    )

    float(
        "simplifyScale",

        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride")
    )

    size_t(
        "stripify",

        Unsafe..unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        size_t("vertex_count"),
        unsigned_int("restart_index")
    )

    size_t(
        "stripifyBound",

        size_t("index_count")
    )

    size_t(
        "unstripify",

        Unsafe..unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        unsigned_int("restart_index")
    )

    size_t(
        "unstripifyBound",

        size_t("index_count")
    )

    meshopt_VertexCacheStatistics(
        "analyzeVertexCache",

        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        size_t("vertex_count"),
        unsigned_int("cache_size"),
        unsigned_int("warp_size"),
        unsigned_int("primgroup_size")
    )

    meshopt_VertexFetchStatistics(
        "analyzeVertexFetch",

        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        size_t("vertex_count"),
        size_t("vertex_size")
    )

    meshopt_OverdrawStatistics(
        "analyzeOverdraw",

        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride")
    )

    meshopt_CoverageStatistics(
        "analyzeCoverage",

        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride")
    )

    size_t(
        "buildMeshlets",

        Unsafe..meshopt_Meshlet.p("meshlets"),
        Check("meshlets.remaining() * max_vertices")..unsigned_int.p("meshlet_vertices"),
        Check("meshlets.remaining() * max_triangles * 3")..unsigned_char.p("meshlet_triangles"),
        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride"),
        size_t("max_vertices"),
        size_t("max_triangles"),
        float("cone_weight")
    )

    size_t(
        "buildMeshletsScan",

        Unsafe..meshopt_Meshlet.p("meshlets"),
        Check("meshlets.remaining() * max_vertices")..unsigned_int.p("meshlet_vertices"),
        Check("meshlets.remaining() * max_triangles * 3")..unsigned_char.p("meshlet_triangles"),
        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        size_t("vertex_count"),
        size_t("max_vertices"),
        size_t("max_triangles")
    )

    size_t(
        "buildMeshletsBound",

        size_t("index_count"),
        size_t("max_vertices"),
        size_t("max_triangles")
    )

    size_t(
        "buildMeshletsFlex",

        Unsafe..meshopt_Meshlet.p("meshlets"),
        Check("meshlets.remaining() * max_vertices")..unsigned_int.p("meshlet_vertices"),
        Check("meshlets.remaining() * max_triangles * 3")..unsigned_char.p("meshlet_triangles"),
        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride"),
        size_t("max_vertices"),
        size_t("min_triangles"),
        size_t("max_triangles"),
        float("cone_weight"),
        float("split_factor")
    )

    size_t(
        "buildMeshletsSpatial",

        Unsafe..meshopt_Meshlet.p("meshlets"),
        Check("meshlets.remaining() * max_vertices")..unsigned_int.p("meshlet_vertices"),
        Check("meshlets.remaining() * max_triangles * 3")..unsigned_char.p("meshlet_triangles"),
        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride"),
        size_t("max_vertices"),
        size_t("min_triangles"),
        size_t("max_triangles"),
        float("fill_weight")
    )

    void(
        "optimizeMeshlet",

        unsigned_int.p("meshlet_vertices"),
        unsigned_char.p("meshlet_triangles"),
        AutoSizeDiv("3", "meshlet_triangles")..size_t("triangle_count"),
        AutoSize("meshlet_vertices")..size_t("vertex_count")
    )

    meshopt_Bounds(
        "computeClusterBounds",

        unsigned_int.const.p("indices"),
        AutoSize("indices")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride")
    )

    meshopt_Bounds(
        "computeMeshletBounds",

        Unsafe..unsigned_int.const.p("meshlet_vertices"),
        unsigned_char.const.p("meshlet_triangles"),
        AutoSizeDiv("3", "meshlet_triangles")..size_t("triangle_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride")
    )

    meshopt_Bounds(
        "computeSphereBounds",

        Check("count * (positions_stride >>> 2)")..float.const.p("positions"),
        size_t("count"),
        size_t("positions_stride"),
        Check("count * (radii_stride >>> 2)")..nullable..float.const.p("radii"),
        size_t("radii_stride")
    )

    size_t(
        "partitionClusters",

        unsigned_int.p("destination"),
        unsigned_int.const.p("cluster_indices"),
        AutoSize("cluster_indices")..size_t("total_index_count"),
        unsigned_int.const.p("cluster_index_counts"),
        AutoSize("cluster_index_counts", "destination")..size_t("cluster_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..nullable..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride"),
        size_t("target_partition_size")
    )

    void(
        "spatialSortRemap",

        Check("vertex_count")..unsigned_int.p("destination"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride")
    )

    void(
        "spatialSortTriangles",

        unsigned_int.p("destination"),
        unsigned_int.const.p("indices"),
        AutoSize("indices", "destination")..size_t("index_count"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride")
    )

    void(
        "spatialClusterPoints",

        Check("vertex_count")..unsigned_int.p("destination"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions"),
        size_t("vertex_count"),
        size_t("vertex_positions_stride"),
        size_t("cluster_size")
    )

    NativeName("meshopt_quantizeUnorm")..internal..int(
        "quantizeUnorm_ref",

        float("v"),
        int("N")
    )

    NativeName("meshopt_quantizeSnorm")..internal..int(
        "quantizeSnorm_ref",

        float("v"),
        int("N")
    )

    NativeName("meshopt_quantizeHalf")..internal..short(
        "quantizeHalf_ref",

        float("v")
    )

    NativeName("meshopt_quantizeFloat")..internal..float(
        "quantizeFloat_ref",

        float("v"),
        int("N")
    )

    NativeName("meshopt_dequantizeHalf")..internal..float(
        "dequantizeHalf_ref",

        unsigned_short("h")
    )

    void(
        "setAllocator",

        meshopt_AllocateCB("allocate"),
        meshopt_DeallocateCB("deallocate")
    )

    customMethod("""
    /**
     * Quantizes a float in {@code [0..1]} range into an N-bit fixed point {@code unorm} value.
     * 
     * <p>Assumes reconstruction function <code>q / (2<sup>N</sup> - 1)</code>, which is the case for fixed-function normalized fixed point conversion. Maximum
     * reconstruction error: <code>1 / 2<sup>N+1</sup></code>.</p>
     */
    public static int meshopt_quantizeUnorm(float v, int N) {
        float scale = (1 << N) - 1;

        v = (v >= 0f) ? v : 0f;
        v = (v <= 1f) ? v : 1f;

        return (int)(v * scale + 0.5f);
    }

    /**
     * Quantizes a float in {@code [-1..1]} range into an N-bit fixed point {@code snorm} value.
     * 
     * <p>Assumes reconstruction function <code>q / (2<sup>N-1</sup> - 1)</code>, which is the case for fixed-function normalized fixed point conversion (except early
     * OpenGL versions). Maximum reconstruction error: <code>1 / 2<sup>N</sup></code>.</p>
     */
    public static int meshopt_quantizeSnorm(float v, int N) {
        float scale = (1 << (N - 1)) - 1;

        float round = (v >= 0f ? 0.5f : -0.5f);

        v = (v >= -1f) ? v : -1f;
        v = (v <= +1f) ? v : +1f;

        return (int)(v * scale + round);
    }

    /**
     * Quantizes a float into half-precision (as defined by IEEE-754 fp16) floating point value.
     * 
     * <p>Generates {@code +-inf} for overflow, preserves {@code NaN}, flushes denormals to zero, rounds to nearest. Representable magnitude range:
     * {@code [6e-5; 65504]}. Maximum relative reconstruction error: {@code 5e-4}.</p>
     */
    public static short meshopt_quantizeHalf(float v) {
        int ui = floatToRawIntBits(v);

        int s  = (ui >>> 16) & 0x8000;
        int em = ui & 0x7fffffff;

        /* bias exponent and round to nearest; 112 is relative exponent bias (127-15) */
        int h = (em - (112 << 23) + (1 << 12)) >> 13;

        /* underflow: flush to zero; 113 encodes exponent -14 */
        h = (em < (113 << 23)) ? 0 : h;

        /* overflow: infinity; 143 encodes exponent 16 */
        h = (em >= (143 << 23)) ? 0x7c00 : h;

        /* NaN; note that we convert all types of NaN to qNaN */
        h = (em > (255 << 23)) ? 0x7e00 : h;

        return (short)(s | h);
    }

    /**
     * Quantizes a float into a floating point value with a limited number of significant mantissa bits, preserving the IEEE-754 fp32 binary representation.
     * 
     * <p>Generates {@code +-inf} for overflow, preserves {@code NaN}, flushes denormals to zero, rounds to nearest. Assumes {@code N} is in a valid mantissa
     * precision range, which is {@code 1..23}.</p>
     */
    public static float meshopt_quantizeFloat(float v, int N) {
        int ui = floatToRawIntBits(v);

        int mask  = (1 << (23 - N)) - 1;
        int round = (1 << (23 - N)) >> 1;

        int e   = ui & 0x7f800000;
        int rui = (ui + round) & ~mask;

        /* round all numbers except inf/nan; this is important to make sure nan doesn't overflow into -0 */
        ui = e == 0x7f800000 ? ui : rui;

        /* flush denormals to zero */
        ui = e == 0 ? 0 : ui;

        return intBitsToFloat(ui);
    }

    /**
     * Reverse quantization of a half-precision (as defined by IEEE-754 fp16) floating point value.
     * 
     * <p>Preserves Inf/NaN, flushes denormals to zero.</p>
     */
    public static float meshopt_dequantizeHalf(@NativeType("unsigned short") short h) {
        int s = (h & 0x8000) << 16;
        int em = h & 0x7fff;

        // bias exponent and pad mantissa with 0; 112 is relative exponent bias (127-15)
        int r = (em + (112 << 10)) << 13;

        // denormal: flush to zero
        r = (em < (1 << 10)) ? 0 : r;

        // infinity/NaN; note that we preserve NaN payload as a byproduct of unifying inf/nan cases
        // 112 is an exponent bias fixup; since we already applied it once, applying it twice converts 31 to 255
        r += (em >= (31 << 10)) ? (112 << 23) : 0;

        return intBitsToFloat(s | r);
    }""")
}