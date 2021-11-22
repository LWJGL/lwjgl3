/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package meshoptimizer.templates

import meshoptimizer.*
import org.lwjgl.generator.*

val meshoptimizer = "MeshOptimizer".nativeClass(Module.MESHOPTIMIZER, prefix = "MESHOPTIMIZER", prefixMethod = "meshopt_") {
    nativeImport("meshoptimizer.h")
    javaImport("static java.lang.Float.*")

    documentation =
        """
        Native bindings to ${url("https://github.com/zeux/meshoptimizer", "meshoptimizer")}.
        
        When a GPU renders triangle meshes, various stages of the GPU pipeline have to process vertex and index data. The efficiency of these stages depends on
        the data you feed to them; this library provides algorithms to help optimize meshes for these stages, as well as algorithms to reduce the mesh
        complexity and storage overhead.
        
        <h3>Pipeline</h3>

        When optimizing a mesh, you should typically feed it through a set of optimizations (the order is important!):
        ${ul(
            "Indexing",
            "Vertex cache optimization",
            "Overdraw optimization",
            "Vertex fetch optimization",
            "Vertex quantization",
            "(optional) Vertex/index buffer compression"            
        )}

        <h3>Indexing</h3>

        Most algorithms in this library assume that a mesh has a vertex buffer and an index buffer. For algorithms to work well and also for GPU to render your
        mesh efficiently, the vertex buffer has to have no redundant vertices; you can generate an index buffer from an unindexed vertex buffer or reindex an
        existing (potentially redundant) index buffer as follows:

        First, generate a remap table from your existing vertex (and, optionally, index) data:
        ${codeBlock("""
size_t index_count = face_count * 3;
std::vector<unsigned int> remap(index_count); // allocate temporary memory for the remap table
size_t vertex_count = meshopt_generateVertexRemap(&remap[0], NULL, index_count, &unindexed_vertices[0], index_count, sizeof(Vertex));""")}

        Note that in this case we only have an unindexed vertex buffer; the remap table is generated based on binary equivalence of the input vertices, so the
        resulting mesh will render the same way.

        After generating the remap table, you can allocate space for the target vertex buffer ({@code vertex_count} elements) and index buffer
        ({@code index_count} elements) and generate them:
${codeBlock("""
meshopt_remapIndexBuffer(indices, NULL, index_count, &remap[0]);
meshopt_remapVertexBuffer(vertices, &unindexed_vertices[0], index_count, sizeof(Vertex), &remap[0]);""")}

        You can then further optimize the resulting buffers by calling the other functions on them in-place.

        <h3>Vertex cache optimization</h3>

        When the GPU renders the mesh, it has to run the vertex shader for each vertex; usually GPUs have a built-in fixed size cache that stores the
        transformed vertices (the result of running the vertex shader), and uses this cache to reduce the number of vertex shader invocations. This cache is
        usually small, 16-32 vertices, and can have different replacement policies; to use this cache efficiently, you have to reorder your triangles to
        maximize the locality of reused vertex references like so:
${codeBlock("""
meshopt_optimizeVertexCache(indices, indices, index_count, vertex_count);""")}

        <h3>Overdraw optimization</h3>

        After transforming the vertices, GPU sends the triangles for rasterization which results in generating pixels that are usually first ran through the
        depth test, and pixels that pass it get the pixel shader executed to generate the final color. As pixel shaders get more expensive, it becomes more and
        more important to reduce overdraw. While in general improving overdraw requires view-dependent operations, this library provides an algorithm to
        reorder triangles to minimize the overdraw from all directions, which you should run after vertex cache optimization like this:
${codeBlock("""
meshopt_optimizeOverdraw(indices, indices, index_count, &vertices[0].x, vertex_count, sizeof(Vertex), 1.05f);""")}

        The overdraw optimizer needs to read vertex positions as a {@code float3} from the vertex; the code snippet above assumes that the vertex stores
        position as {@code float x, y, z}.

        When performing the overdraw optimization you have to specify a floating-point threshold parameter. The algorithm tries to maintain a balance between
        vertex cache efficiency and overdraw; the threshold determines how much the algorithm can compromise the vertex cache hit ratio, with 1.05 meaning that
        the resulting ratio should be at most 5% worse than before the optimization.

        <h3>Vertex fetch optimization</h3>

        After the final triangle order has been established, we still can optimize the vertex buffer for memory efficiency. Before running the vertex shader
        GPU has to fetch the vertex attributes from the vertex buffer; the fetch is usually backed by a memory cache, and as such optimizing the data for the
        locality of memory access is important. You can do this by running this code:

        To optimize the index/vertex buffers for vertex fetch efficiency, call:
${codeBlock("""
meshopt_optimizeVertexFetch(vertices, indices, index_count, vertices, vertex_count, sizeof(Vertex));""")}

        This will reorder the vertices in the vertex buffer to try to improve the locality of reference, and rewrite the indices in place to match; if the
        vertex data is stored using multiple streams, you should use #optimizeVertexFetchRemap() instead. This optimization has to be performed on the final
        index buffer since the optimal vertex order depends on the triangle order.

        Note that the algorithm does not try to model cache replacement precisely and instead just orders vertices in the order of use, which generally
        produces results that are close to optimal.

        <h3>Vertex quantization</h3>

        To optimize memory bandwidth when fetching the vertex data even further, and to reduce the amount of memory required to store the mesh, it is often
        beneficial to quantize the vertex attributes to smaller types. While this optimization can technically run at any part of the pipeline (and sometimes
        doing quantization as the first step can improve indexing by merging almost identical vertices), it generally is easier to run this after all other
        optimizations since some of them require access to {@code float3} positions.

        Quantization is usually domain specific; it's common to quantize normals using 3 8-bit integers but you can use higher-precision quantization (for
        example using 10 bits per component in a {@code 10_10_10_2} format), or a different encoding to use just 2 components. For positions and texture
        coordinate data the two most common storage formats are half precision floats, and 16-bit normalized integers that encode the position relative to the
        AABB of the mesh or the UV bounding rectangle.

        The number of possible combinations here is very large but this library does provide the building blocks, specifically functions to quantize floating
        point values to normalized integers, as well as half-precision floats. For example, here's how you can quantize a normal:
${codeBlock("""
unsigned int normal =
	(meshopt_quantizeUnorm(v.nx, 10) << 20) |
	(meshopt_quantizeUnorm(v.ny, 10) << 10) |
	 meshopt_quantizeUnorm(v.nz, 10);""")}

        and here's how you can quantize a position:
${codeBlock("""
unsigned short px = meshopt_quantizeHalf(v.x);
unsigned short py = meshopt_quantizeHalf(v.y);
unsigned short pz = meshopt_quantizeHalf(v.z);""")}

        <h3>Vertex/index buffer compression</h3>

        In case storage size or transmission bandwidth is of importance, you might want to additionally compress vertex and index data. While several mesh
        compression libraries, like Google Draco, are available, they typically are designed to maximize the compression ratio at the cost of disturbing the
        vertex/index order (which makes the meshes inefficient to render on GPU) or decompression performance. They also frequently don't support custom
        game-ready quantized vertex formats and thus require to re-quantize the data after loading it, introducing extra quantization errors and making
        decoding slower.

        Alternatively you can use general purpose compression libraries like zstd or Oodle to compress vertex/index data - however these compressors aren't
        designed to exploit redundancies in vertex/index data and as such compression rates can be unsatisfactory.

        To that end, this library provides algorithms to "encode" vertex and index data. The result of the encoding is generally significantly smaller than
        initial data, and remains compressible with general purpose compressors - so you can either store encoded data directly (for modest compression ratios
        and maximum decoding performance), or further compress it with zstd/Oodle to maximize compression ratio.

        To encode, you need to allocate target buffers (preferably using the worst case bound) and call encoding functions:
${codeBlock("""
std::vector<unsigned char> vbuf(meshopt_encodeVertexBufferBound(vertex_count, sizeof(Vertex)));
vbuf.resize(meshopt_encodeVertexBuffer(&vbuf[0], vbuf.size(), vertices, vertex_count, sizeof(Vertex)));

std::vector<unsigned char> ibuf(meshopt_encodeIndexBufferBound(index_count, vertex_count));
ibuf.resize(meshopt_encodeIndexBuffer(&ibuf[0], ibuf.size(), indices, index_count));""")}

        You can then either serialize {@code vbuf}/{@code ibuf} as is, or compress them further. To decode the data at runtime, call decoding functions:
${codeBlock("""
int resvb = meshopt_decodeVertexBuffer(vertices, vertex_count, sizeof(Vertex), &vbuf[0], vbuf.size());
int resib = meshopt_decodeIndexBuffer(indices, index_count, &buffer[0], buffer.size());
assert(resvb == 0 && resib == 0);""")}

        Note that vertex encoding assumes that vertex buffer was optimized for vertex fetch, and that vertices are quantized; index encoding assumes that the
        vertex/index buffers were optimized for vertex cache and vertex fetch. Feeding unoptimized data into the encoders will produce poor compression ratios.
        Both codecs are lossless - the only lossy step is quantization that happens before encoding.

        Decoding functions are heavily optimized and can directly target write-combined memory; you can expect both decoders to run at 1-3 GB/s on modern
        desktop CPUs. Compression ratios depend on the data; vertex data compression ratio is typically around 2-4x (compared to already quantized data), index
        data compression ratio is around 5-6x (compared to raw 16-bit index data). General purpose lossless compressors can further improve on these results.

        <h3>Triangle strip conversion</h3>

        On most hardware, indexed triangle lists are the most efficient way to drive the GPU. However, in some cases triangle strips might prove beneficial:
        ${ul(
            "On some older GPUs, triangle strips may be a bit more efficient to render",
            "On extremely memory constrained systems, index buffers for triangle strips could save a bit of memory"
        )}

        This library provides an algorithm for converting a vertex cache optimized triangle list to a triangle strip:
${codeBlock("""
std::vector<unsigned int> strip(meshopt_stripifyBound(index_count));
unsigned int restart_index = ~0u;
size_t strip_size = meshopt_stripify(&strip[0], indices, index_count, vertex_count, restart_index);""")}

        Typically you should expect triangle strips to have ~50-60% of indices compared to triangle lists (~1.5-1.8 indices per triangle) and have ~5% worse
        ACMR. Note that triangle strips can be stitched with or without restart index support. Using restart indices can result in ~10% smaller index buffers,
        but on some GPUs restart indices may result in decreased performance.

        <h3>Deinterleaved geometry</h3>

        All of the examples above assume that geometry is represented as a single vertex buffer and a single index buffer. This requires storing all vertex
        attributes - position, normal, texture coordinate, skinning weights etc. - in a single contiguous struct. However, in some cases using multiple vertex
        streams may be preferable. In particular, if some passes require only positional data - such as depth pre-pass or shadow map - then it may be
        beneficial to split it from the rest of the vertex attributes to make sure the bandwidth use during these passes is optimal. On some mobile GPUs a
        position-only attribute stream also improves efficiency of tiling algorithms.

        Most of the functions in this library either only need the index buffer (such as vertex cache optimization) or only need positional information (such
        as overdraw optimization). However, several tasks require knowledge about all vertex attributes.

        For indexing, #generateVertexRemap() assumes that there's just one vertex stream; when multiple vertex streams are used, it's necessary to use
        #generateVertexRemapMulti() as follows:
${codeBlock("""
meshopt_Stream streams[] = {
    {&unindexed_pos[0], sizeof(float) * 3, sizeof(float) * 3},
    {&unindexed_nrm[0], sizeof(float) * 3, sizeof(float) * 3},
    {&unindexed_uv[0], sizeof(float) * 2, sizeof(float) * 2},
};

std::vector<unsigned int> remap(index_count);
size_t vertex_count = meshopt_generateVertexRemapMulti(&remap[0], NULL, index_count, index_count, streams, sizeof(streams) / sizeof(streams[0]));""")}

        After this #remapVertexBuffer() needs to be called once for each vertex stream to produce the correctly reindexed stream.

        Instead of calling #optimizeVertexFetch() for reordering vertices in a single vertex buffer for efficiency, calling #optimizeVertexFetchRemap() and
        then calling #remapVertexBuffer() for each stream again is recommended.

        Finally, when compressing vertex data, #encodeVertexBuffer() should be used on each vertex stream separately - this allows the encoder to best utilize
        correlation between attribute values for different vertices.

        <h3>Simplification</h3>

        All algorithms presented so far don't affect visual appearance at all, with the exception of quantization that has minimal controlled impact. However,
        fundamentally the most effective way at reducing the rendering or transmission cost of a mesh is to make the mesh simpler.

        This library provides two simplification algorithms that reduce the number of triangles in the mesh. Given a vertex and an index buffer, they generate
        a second index buffer that uses existing vertices in the vertex buffer. This index buffer can be used directly for rendering with the original vertex
        buffer (preferably after vertex cache optimization), or a new compact vertex/index buffer can be generated using #optimizeVertexFetch() that uses the
        optimal number and order of vertices.

        The first simplification algorithm, #simplify(), follows the topology of the original mesh in an attempt to preserve attribute seams, borders and
        overall appearance. For meshes with inconsistent topology or many seams, such as faceted meshes, it can result in simplifier getting "stuck" and not
        being able to simplify the mesh fully; it's recommended to preprocess the index buffer with #generateShadowIndexBuffer() to discard any vertex
        attributes that aren't critical and can be rebuilt later such as normals.
${codeBlock("""
float threshold = 0.2f;
size_t target_index_count = size_t(index_count * threshold);
float target_error = 1e-2f;

std::vector<unsigned int> lod(index_count);
lod.resize(meshopt_simplify(&lod[0], indices, index_count, &vertices[0].x, vertex_count, sizeof(Vertex), target_index_count, target_error));""")}

        Target error is an approximate measure of the deviation from the original mesh using distance normalized to {@code 0..1} (so {@code 1e-2f} means that
        simplifier will try to maintain the error to be below 1% of the mesh extents). Note that because of topological restrictions and error bounds
        simplifier isn't guaranteed to reach the target index count and can stop earlier.

        The second simplification algorithm, #simplifySloppy(), doesn't follow the topology of the original mesh. This means that it doesn't preserve attribute
        seams or borders, but it can collapse internal details that are too small to matter better because it can merge mesh features that are topologically
        disjoint but spatially close.
${codeBlock("""
float threshold = 0.2f;
size_t target_index_count = size_t(index_count * threshold);

std::vector<unsigned int> lod(target_index_count);
lod.resize(meshopt_simplifySloppy(&lod[0], indices, index_count, &vertices[0].x, vertex_count, sizeof(Vertex), target_index_count));""")}

        This algorithm is guaranteed to return a result at or below the target index count. It is 5-6x faster than #simplify() when simplification ratio is
        large, and is able to reach ~20M triangles/sec on a desktop CPU ({@code meshopt_simplify} works at ~3M triangles/sec).

        When a sequence of LOD meshes is generated that all use the original vertex buffer, care must be taken to order vertices optimally to not penalize
        mobile GPU architectures that are only capable of transforming a sequential vertex buffer range. It's recommended in this case to first optimize each
        LOD for vertex cache, then assemble all LODs in one large index buffer starting from the coarsest LOD (the one with fewest triangles), and call
        #optimizeVertexFetch() on the final large index buffer. This will make sure that coarser LODs require a smaller vertex range and are efficient wrt
        vertex fetch and transform.

        <h3>Efficiency analyzers</h3>

        While the only way to get precise performance data is to measure performance on the target GPU, it can be valuable to measure the impact of these
        optimization in a GPU-independent manner. To this end, the library provides analyzers for all three major optimization routines. For each optimization
        there is a corresponding analyze function, like #analyzeOverdraw(), that returns a struct with statistics.

        #analyzeVertexCache() returns vertex cache statistics. The common metric to use is ACMR - average cache miss ratio, which is the ratio of the total
        number of vertex invocations to the triangle count. The worst-case ACMR is 3 (GPU has to process 3 vertices for each triangle); on regular grids the
        optimal ACMR approaches 0.5. On real meshes it usually is in {@code [0.5..1.5]} range depending on the amount of vertex splits. One other useful metric
        is ATVR - average transformed vertex ratio - which represents the ratio of vertex shader invocations to the total vertices, and has the best case of
        1.0 regardless of mesh topology (each vertex is transformed once).

        #analyzeVertexFetch() returns vertex fetch statistics. The main metric it uses is overfetch - the ratio between the number of bytes read from the
        vertex buffer to the total number of bytes in the vertex buffer. Assuming non-redundant vertex buffers, the best case is 1.0 - each byte is fetched
        once.

        #analyzeOverdraw() returns overdraw statistics. The main metric it uses is overdraw - the ratio between the number of pixel shader invocations to the
        total number of covered pixels, as measured from several different orthographic cameras. The best case for overdraw is 1.0 - each pixel is shaded once.

        Note that all analyzers use approximate models for the relevant GPU units, so the numbers you will get as the result are only a rough approximation of
        the actual performance.

        <h3>Memory management</h3>

        Many algorithms allocate temporary memory to store intermediate results or accelerate processing. The amount of memory allocated is a function of
        various input parameters such as vertex count and index count. By default memory is allocated using {@code operator new} and {@code operator delete};
        if these operators are overloaded by the application, the overloads will be used instead. Alternatively it's possible to specify custom
        allocation/deallocation functions using #setAllocator(), e.g.
${codeBlock("""
meshopt_setAllocator(malloc, free);""")}

        Note that the library expects the allocation function to either throw in case of out-of-memory (in which case the exception will propagate to the
        caller) or abort, so technically the use of {@code malloc} above isn't safe. If you want to handle out-of-memory errors without using C++ exceptions,
        you can use {@code setjmp}/{@code longjmp} instead.

        Vertex and index decoders (#decodeVertexBuffer() and #decodeIndexBuffer()) do not allocate memory and work completely within the buffer space provided
        via arguments.

        All functions have bounded stack usage that does not exceed 32 KB for any algorithms.
        
        LWJGL note: meshoptimizer can be configured to use the LWJGL memory allocator with the following code:
        ${codeBlock("""
nmeshopt_setAllocator(
    MemoryUtil.getAllocator().getMalloc(),
    MemoryUtil.getAllocator().getFree()
);""")}
        """

    IntConstant("", "VERSION".."170")

    size_t(
        "generateVertexRemap",
        """
        Generates a vertex remap table from the vertex buffer and an optional index buffer and returns number of unique vertices.
        
        As a result, all vertices that are binary equivalent map to the same (new) location, with no gaps in the resulting sequence. Resulting remap table
        maps old vertices to new vertices and can be used in #remapVertexBuffer()/#remapIndexBuffer(). Note that binary equivalence considers all
        {@code vertex_size} bytes, including padding which should be zero-initialized.
        """,

        unsigned_int.p("destination", "must contain enough space for the resulting remap table ({@code vertex_count} elements)"),
        Check("index_count")..nullable..unsigned_int.const.p("indices", "can be #NULL if the input is unindexed"),
        size_t("index_count", ""),
        Check("vertex_count * vertex_size")..void.const.p("vertices", ""),
        UseVariable..AutoSize("destination")..size_t("vertex_count", ""),
        size_t("vertex_size", "")
    )

    size_t(
        "generateVertexRemapMulti",
        """
        Generates a vertex remap table from multiple vertex streams and an optional index buffer and returns number of unique vertices.
         
        As a result, all vertices that are binary equivalent map to the same (new) location, with no gaps in the resulting sequence. Resulting remap table maps
        old vertices to new vertices and can be used in #remapVertexBuffer()/#remapIndexBuffer(). To remap vertex buffers, you will need to call
        {@code meshopt_remapVertexBuffer} for each vertex stream. Note that binary equivalence considers all size bytes in each stream, including padding which
        should be zero-initialized.
        """,

        unsigned_int.p("destination", "must contain enough space for the resulting remap table ({@code vertex_count} elements)"),
        Check("index_count")..nullable..unsigned_int.const.p("indices", "can be #NULL if the input is unindexed"),
        size_t("index_count", ""),
        UseVariable..AutoSize("destination")..size_t("vertex_count", ""),
        meshopt_Stream.const.p("streams", ""),
        AutoSize("streams")..size_t("stream_count", "")
    )

    void(
        "remapVertexBuffer",
        "Generates vertex buffer from the source vertex buffer and remap table generated by #generateVertexRemap().",

        Unsafe..void.p(
            "destination",
            "must contain enough space for the resulting vertex buffer ({@code unique_vertex_count} elements, returned by {@code meshopt_generateVertexRemap})"
        ),
        Check("vertex_count * vertex_size")..void.const.p("vertices", ""),
        UseVariable..AutoSize("remap")..size_t(
            "vertex_count",
            "should be the initial vertex count and not the value returned by {@code meshopt_generateVertexRemap}"
        ),
        size_t("vertex_size", ""),
        unsigned_int.const.p("remap", "")
    )

    void(
        "remapIndexBuffer",
        "Generates index buffer from the source index buffer and remap table generated by #generateVertexRemap().",

        unsigned_int.p("destination", "must contain enough space for the resulting index buffer ({@code index_count} elements)"),
        nullable..unsigned_int.const.p("indices", "can be #NULL if the input is unindexed"),
        AutoSize("destination", "indices")..size_t("index_count", ""),
        Unsafe..unsigned_int.const.p("remap", "")
    )

    void(
        "generateShadowIndexBuffer",
        """
        Generates index buffer that can be used for more efficient rendering when only a subset of the vertex attributes is necessary.
        
        All vertices that are binary equivalent (wrt first {@code vertex_size} bytes) map to the first vertex in the original vertex buffer. This makes it
        possible to use the index buffer for Z pre-pass or shadowmap rendering, while using the original index buffer for regular rendering. Note that binary
        equivalence considers all {@code vertex_size} bytes, including padding which should be zero-initialized.
        """,

        unsigned_int.p("destination", "must contain enough space for the resulting index buffer ({@code index_count} elements)"),
        unsigned_int.const.p("indices", ""),
        AutoSize("destination", "indices")..size_t("index_count", ""),
        Check("vertex_count * vertex_stride")..void.const.p("vertices", ""),
        size_t("vertex_count", ""),
        size_t("vertex_size", ""),
        size_t("vertex_stride", "")
    )

    void(
        "generateShadowIndexBufferMulti",
        """
        Generates index buffer that can be used for more efficient rendering when only a subset of the vertex attributes is necessary.
        
        All vertices that are binary equivalent (wrt specified {@code streams}) map to the first vertex in the original vertex buffer. This makes it possible
        to use the index buffer for Z pre-pass or shadowmap rendering, while using the original index buffer for regular rendering. Note that binary
        equivalence considers all size bytes in each stream, including padding which should be zero-initialized.
        """,

        unsigned_int.p("destination", "must contain enough space for the resulting index buffer ({@code index_count} elements)"),
        unsigned_int.const.p("indices", ""),
        AutoSize("destination", "indices")..size_t("index_count", ""),
        size_t("vertex_count", ""),
        meshopt_Stream.const.p("streams", ""),
        AutoSize("streams")..size_t("stream_count", "")
    )

    void(
        "generateAdjacencyIndexBuffer",
        """
        Generate index buffer that can be used as a geometry shader input with triangle adjacency topology.

        Each triangle is converted into a 6-vertex patch with the following layout:
        ${ul(
            "0, 2, 4: original triangle vertices",
            "1, 3, 5: vertices adjacent to edges 02, 24 and 40"
        )}

        The resulting patch can be rendered with geometry shaders using e.g. {@code VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY}. This can be used to
        implement algorithms like silhouette detection/expansion and other forms of GS-driven rendering.
        """,

        Check("indices.remaining() << 1")..unsigned_int.p("destination", "must contain enough space for the resulting index buffer ({@code index_count*2} elements)"),
        unsigned_int.const.p("indices", ""),
        AutoSize("indices")..size_t("index_count", ""),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p(
            "vertex_positions",
            "should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}"
        ),
        size_t("vertex_count", ""),
        size_t("vertex_positions_stride", "")
    )

    void(
        "generateTessellationIndexBuffer",
        """
        Generate index buffer that can be used for PN-AEN tessellation with crack-free displacement.
        
        Each triangle is converted into a 12-vertex patch with the following layout:
        ${ul(
            "0, 1, 2: original triangle vertices",
            "3, 4: opposing edge for edge 0, 1",
            "5, 6: opposing edge for edge 1, 2",
            "7, 8: opposing edge for edge 2, 0",
            "9, 10, 11: dominant vertices for corners 0, 1, 2"
        )}

        The resulting patch can be rendered with hardware tessellation using PN-AEN and displacement mapping. See "Tessellation on Any Budget" (John McDonald,
        GDC 2011) for implementation details.
        """,

        Check("indices.remaining() << 2")..unsigned_int.p("destination", "must contain enough space for the resulting index buffer ({@code index_count*4} elements)"),
        unsigned_int.const.p("indices", ""),
        AutoSize("indices")..size_t("index_count", ""),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p(
            "vertex_positions",
            "should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}"
        ),
        size_t("vertex_count", ""),
        size_t("vertex_positions_stride", "")
    )

    void(
        "optimizeVertexCache",
        """
        Vertex transform cache optimizer.
        
        Reorders {@code indices} to reduce the number of GPU vertex shader invocations. If index buffer contains multiple ranges for multiple draw calls, this
        function needs to be called on each range individually.
        """,

        unsigned_int.p("destination", "must contain enough space for the resulting index buffer ({@code index_count} elements)"),
        unsigned_int.const.p("indices", ""),
        AutoSize("destination", "indices")..size_t("index_count", ""),
        size_t("vertex_count", "")
    )

    void(
        "optimizeVertexCacheStrip",
        """
        Vertex transform cache optimizer for strip-like caches.

        Produces inferior results to #optimizeVertexCache() from the GPU vertex cache perspective. However, the resulting index order is more optimal if the
        goal is to reduce the triangle strip length or improve compression efficiency.
        """,

        unsigned_int.p("destination", ""),
        unsigned_int.const.p("indices", ""),
        AutoSize("destination", "indices")..size_t("index_count", ""),
        size_t("vertex_count", "")
    )

    void(
        "optimizeVertexCacheFifo",
        """
        Vertex transform cache optimizer for FIFO caches.
        
        Reorders indices to reduce the number of GPU vertex shader invocations. Generally takes ~3x less time to optimize meshes but produces inferior results
        compared to #optimizeVertexCache(). If index buffer contains multiple ranges for multiple draw calls, this function needs to be called on each range
        individually.
        """,

        unsigned_int.p("destination", "must contain enough space for the resulting index buffer ({@code index_count} elements)"),
        unsigned_int.const.p("indices", ""),
        AutoSize("destination", "indices")..size_t("index_count", ""),
        size_t("vertex_count", ""),
        unsigned_int("cache_size", "should be less than the actual GPU cache size to avoid cache thrashing")
    )

    void(
        "optimizeOverdraw",
        """
        Overdraw optimizer.
         
        Reorders indices to reduce the number of GPU vertex shader invocations and the pixel overdraw. If index buffer contains multiple ranges for multiple
        draw calls, this function needs to be called on each range individually.
        """,

        unsigned_int.p("destination", "must contain enough space for the resulting index buffer ({@code index_count} elements)"),
        unsigned_int.const.p("indices", "must contain index data that is the result of #optimizeVertexCache() (<b>not</b> the original mesh indices!)"),
        AutoSize("destination", "indices")..size_t("index_count", ""),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p(
            "vertex_positions",
            "should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}"
        ),
        size_t("vertex_count", ""),
        size_t("vertex_positions_stride", ""),
        float(
            "threshold",
            "indicates how much the overdraw optimizer can degrade vertex cache efficiency (1.05 = up to 5%) to reduce overdraw more efficiently"
        )
    )

    size_t(
        "optimizeVertexFetch",
        """
        Vertex fetch cache optimizer.
         
        Reorders vertices and changes indices to reduce the amount of GPU memory fetches during vertex processing. Returns the number of unique vertices, which
        is the same as input vertex count unless some vertices are unused. This function works for a single vertex stream; for multiple vertex streams, use
        #optimizeVertexFetchRemap() + #remapVertexBuffer() for each stream.
        """,

        Check("vertex_count * vertex_size")..void.p("destination", "must contain enough space for the resulting vertex buffer ({@code vertex_count} elements)"),
        unsigned_int.p("indices", "is used both as an input and as an output index buffer"),
        AutoSize("indices")..size_t("index_count", ""),
        Check("vertex_count * vertex_size")..void.const.p("vertices", ""),
        size_t("vertex_count", ""),
        size_t("vertex_size", "")
    )

    size_t(
        "optimizeVertexFetchRemap",
        """
        Vertex fetch cache optimizer.
         
        Generates vertex remap to reduce the amount of GPU memory fetches during vertex processing. Returns the number of unique vertices, which is the same as
        input vertex count unless some vertices are unused. The resulting remap table should be used to reorder vertex/index buffers using
        #remapVertexBuffer()/#remapIndexBuffer().
        """,

        unsigned_int.p("destination", "must contain enough space for the resulting remap table ({@code vertex_count} elements)"),
        unsigned_int.const.p("indices", ""),
        AutoSize("indices")..size_t("index_count", ""),
        AutoSize("destination")..size_t("vertex_count", "")
    )

    size_t(
        "encodeIndexBuffer",
        """
        Index buffer encoder.
         
        Encodes index data into an array of bytes that is generally much smaller (&lt;1.5 bytes/triangle) and compresses better (&lt;1 bytes/triangle) compared
        to original. Input index buffer must represent a triangle list. Returns encoded data size on success, 0 on error; the only error condition is if buffer
        doesn't have enough space. For maximum efficiency the index buffer being encoded has to be optimized for vertex cache and vertex fetch first.
        """,

        unsigned_char.p("buffer", "must contain enough space for the encoded index buffer (use #encodeIndexBufferBound() to compute worst case size)"),
        AutoSize("buffer")..size_t("buffer_size", ""),
        unsigned_int.const.p("indices", ""),
        AutoSize("indices")..size_t("index_count", "")
    )

    size_t(
        "encodeIndexBufferBound",
        "",

        size_t("index_count", ""),
        size_t("vertex_count", "")
    )

    void(
        "encodeIndexVersion",
        "Set index encoder format version.",

        int("version", "must specify the data format version to encode; valid values are 0 (decodable by all library versions) and 1 (decodable by 0.14+)")
    )

    int(
        "decodeIndexBuffer",
        """
        Index buffer decoder.
         
        Decodes index data from an array of bytes generated by #encodeIndexBuffer(). Returns 0 if decoding was successful, and an error code otherwise. The
        decoder is safe to use for untrusted input, but it may produce garbage data (e.g. out of range indices).
        """,

        Check("index_count * index_size")..void.p("destination", "must contain enough space for the resulting index buffer ({@code index_count} elements)"),
        size_t("index_count", ""),
        size_t("index_size", ""),
        unsigned_char.const.p("buffer", ""),
        AutoSize("buffer")..size_t("buffer_size", "")
    )

    size_t(
        "encodeIndexSequence",
        """
        Index sequence encoder.

        Encodes index sequence into an array of bytes that is generally smaller and compresses better compared to original. Input index sequence can represent
        arbitrary topology; for triangle lists #encodeIndexBuffer() is likely to be better. Returns encoded data size on success, 0 on error; the only error
        condition is if buffer doesn't have enough space.
        """,

        unsigned_char.p("buffer", "must contain enough space for the encoded index sequence (use #encodeIndexSequenceBound() to compute worst case size)"),
        AutoSize("buffer")..size_t("buffer_size", ""),
        unsigned_int.const.p("indices", ""),
        AutoSize("indices")..size_t("index_count", "")
    )
    size_t(
        "encodeIndexSequenceBound",
        "",

        size_t("index_count", ""),
        size_t("vertex_count", "")
    )

    int(
        "decodeIndexSequence",
        """
        Index sequence decoder.

        Decodes index data from an array of bytes generated by #encodeIndexSequence(). Returns 0 if decoding was successful, and an error code otherwise. The
        decoder is safe to use for untrusted input, but it may produce garbage data (e.g. out of range indices).
        """,

        Check("index_count * index_size")..void.p("destination", "must contain enough space for the resulting index sequence ({@code index_count} elements)"),
        size_t("index_count", ""),
        size_t("index_size", ""),
        unsigned_char.const.p("buffer", ""),
        AutoSize("buffer")..size_t("buffer_size", "")
    )

    size_t(
        "encodeVertexBuffer",
        """
        Vertex buffer encoder.
        
        Encodes vertex data into an array of bytes that is generally smaller and compresses better compared to original. Returns encoded data size on success,
        0 on error; the only error condition is if buffer doesn't have enough space. This function works for a single vertex stream; for multiple vertex
        streams, call {@code meshopt_encodeVertexBuffer} for each stream. Note that all {@code vertex_size} bytes of each vertex are encoded verbatim,
        including padding which should be zero-initialized.
        """,

        unsigned_char.p("buffer", "must contain enough space for the encoded vertex buffer (use #encodeVertexBufferBound() to compute worst case size)"),
        AutoSize("buffer")..size_t("buffer_size", ""),
        Check("vertex_count * vertex_size")..void.const.p("vertices", ""),
        size_t("vertex_count", ""),
        size_t("vertex_size", "")
    )

    size_t(
        "encodeVertexBufferBound",
        "",

        size_t("vertex_count", ""),
        size_t("vertex_size", "")
    )

    void(
        "encodeVertexVersion",
        "Set vertex encoder format version.",

        int("version", "must specify the data format version to encode; valid values are 0 (decodable by all library versions)")
    )

    int(
        "decodeVertexBuffer",
        """
        Vertex buffer decoder.
         
        Decodes vertex data from an array of bytes generated by #encodeVertexBuffer(). Returns 0 if decoding was successful, and an error code otherwise. The
        decoder is safe to use for untrusted input, but it may produce garbage data.
        """,

        Check("vertex_count * vertex_size")..void.p("destination", "must contain enough space for the resulting vertex buffer ({@code vertex_count * vertex_size} bytes)"),
        size_t("vertex_count", ""),
        size_t("vertex_size", ""),
        unsigned_char.const.p("buffer", ""),
        AutoSize("buffer")..size_t("buffer_size", "")
    )

    void(
        "decodeFilterOct",
        """
        Experimental: Decodes octahedral encoding of a unit vector with K-bit (K &le; 16) signed X/Y as an input; Z must store 1.0f.

        Each component is stored as an 8-bit or 16-bit normalized integer; stride must be equal to 4 or 8. W is preserved as is.
        """,

        MultiType(PointerMapping.DATA_SHORT)..Check("count * stride")..void.p("buffer", ""),
        size_t("count", ""),
        size_t("stride", "")
    )

    void(
        "decodeFilterQuat",
        """
        Experimental: Decodes 3-component quaternion encoding with K-bit (4 &le; K &le; 16) component encoding and a 2-bit component index indicating which
        component to reconstruct.

        Each component is stored as an 16-bit integer; stride must be equal to 8.
        """,

        MultiType(PointerMapping.DATA_SHORT)..Check("count * stride")..void.p("buffer", ""),
        size_t("count", ""),
        size_t("stride", "")
    )

    void(
        "decodeFilterExp",
        """
        Experimental: Decodes exponential encoding of floating-point data with 8-bit exponent and 24-bit integer mantissa as {@code 2^E*M}.

        Each 32-bit component is decoded in isolation; stride must be divisible by 4.
        """,

        MultiType(PointerMapping.DATA_INT)..Check("count * stride")..void.p("buffer", ""),
        size_t("count", ""),
        size_t("stride", "")
    )

    void(
        "encodeFilterOct",
        """
        Experimental: Encodes unit vectors with K-bit (K &le; 16) signed X/Y as an output.
     
        Each component is stored as an 8-bit or 16-bit normalized integer; {@code stride} must be equal to 4 or 8. {@code W} is preserved as is. Input data
        must contain 4 floats for every vector ({@code count*4} total).
        """,

        MultiType(PointerMapping.DATA_SHORT)..Check("count * 4 * (stride >> 2)")..void.p("destination", ""),
        size_t("count", ""),
        size_t("stride", ""),
        int("bits", ""),
        Check("count * 4")..float.const.p("data", "")
    )

    void(
        "encodeFilterQuat",
        """
        Experimental: Encodes unit quaternions with K-bit (4 &le; K &le; 16) component encoding.

        Each component is stored as an 16-bit integer; {@code stride} must be equal to 8. Input data must contain 4 floats for every quaternion
        ({@code count*4} total).
        """,

        MultiType(PointerMapping.DATA_SHORT)..Check("count * 4 * 2")..void.p("destination", ""),
        size_t("count", ""),
        size_t("stride", ""),
        int("bits", ""),
        Check("count * 4")..float.const.p("data", "")
    )

    void(
        "encodeFilterExp",
        """
        Experimental: Encodes arbitrary (finite) floating-point data with 8-bit exponent and K-bit integer mantissa (1 &le; K &le; 24).

        Mantissa is shared between all components of a given vector as defined by {@code stride}; {@code stride} must be divisible by 4. Input data must
        contain {@code stride/4} floats for every vector ({@code count*stride/4} total). When individual (scalar) encoding is desired, simply pass
        {@code stride=4} and adjust {@code count} accordingly.
        """,

        MultiType(PointerMapping.DATA_INT)..Check("count * (stride >> 2) * 4")..void.p("destination", ""),
        size_t("count", ""),
        size_t("stride", ""),
        int("bits", ""),
        Check("count * (stride >> 2)")..float.const.p("data", "")
    )

    size_t(
        "simplify",
        """
        Experimental: Mesh simplifier. Reduces the number of triangles in the mesh, attempting to preserve mesh appearance as much as possible.
         
        The algorithm tries to preserve mesh topology and can stop short of the target goal based on topology constraints or target error. If not all
        attributes from the input mesh are required, it's recommended to reindex the mesh using #generateShadowIndexBuffer() prior to simplification. Returns
        the number of indices after simplification, with destination containing new index data. The resulting index buffer references vertices from the
        original vertex buffer. If the original vertex data isn't required, creating a compact vertex buffer using #optimizeVertexFetch() is recommended.
        """,

        unsigned_int.p(
            "destination",
            "must contain enough space for the target index buffer, worst case is {@code index_count} elements (<b>not</b> {@code target_index_count})!"
        ),
        unsigned_int.const.p("indices", ""),
        AutoSize("destination", "indices")..size_t("index_count", ""),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p(
            "vertex_positions",
            "should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}"
        ),
        size_t("vertex_count", ""),
        size_t("vertex_positions_stride", ""),
        size_t("target_index_count", ""),
        float("target_error", "represents the error relative to mesh extents that can be tolerated, e.g. {@code 0.01 = 1% deformation}"),
        Check(1)..nullable..float.p("result_error", "can be #NULL; when it's not #NULL, it will contain the resulting (relative) error after simplification")
    )

    size_t(
        "simplifySloppy",
        """
        Experimental: Mesh simplifier (sloppy). Reduces the number of triangles in the mesh, sacrificing mesh appearance for simplification performance.
         
        The algorithm doesn't preserve mesh topology but can stop short of the target goal based on target error. Returns the number of indices after
        simplification, with destination containing new index data. The resulting index buffer references vertices from the original vertex buffer. If the
        original vertex data isn't required, creating a compact vertex buffer using #optimizeVertexFetch() is recommended.
        """,

        unsigned_int.p(
            "destination",
            "must contain enough space for the target index buffer, worst case is {@code index_count} elements (<b>not</b> {@code target_index_count})!"
        ),
        unsigned_int.const.p("indices", ""),
        AutoSize("destination", "indices")..size_t("index_count", ""),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p(
            "vertex_positions",
            "should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}"
        ),
        size_t("vertex_count", ""),
        size_t("vertex_positions_stride", ""),
        size_t("target_index_count", ""),
        float("target_error", "represents the error relative to mesh extents that can be tolerated, e.g. {@code 0.01 = 1% deformation}"),
        Check(1)..nullable..float.p("result_error", "can be #NULL; when it's not #NULL, it will contain the resulting (relative) error after simplification")
    )

    size_t(
        "simplifyPoints",
        """
        Experimental: Point cloud simplifier. Reduces the number of points in the cloud to reach the given target.

        Returns the number of points after simplification, with {@code destination} containing new index data. The resulting index buffer references vertices
        from the original vertex buffer. If the original vertex data isn't required, creating a compact vertex buffer using #optimizeVertexFetch() is
        recommended.
        """,

        Check("target_vertex_count")..unsigned_int.p(
            "destination",
            "must contain enough space for the target index buffer ({@code target_vertex_count} elements)"
        ),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p(
            "vertex_positions",
            "should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}"
        ),
        size_t("vertex_count", ""),
        size_t("vertex_positions_stride", ""),
        size_t("target_vertex_count", "")
    )

    float(
        "simplifyScale",
        """
        Experimental: Returns the error scaling factor used by the simplifier to convert between absolute and relative extents.
     
        Absolute error must be <b>divided</b> by the scaling factor before passing it to #simplify() as {@code target_error}. Relative error returned by
        {@code meshopt_simplify} via {@code result_error} must be <b>multiplied</b> by the scaling factor to get absolute error.
        """,

        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions", ""),
        size_t("vertex_count", ""),
        size_t("vertex_positions_stride", "")
    )

    size_t(
        "stripify",
        """
        Mesh stripifier. Converts a previously vertex cache optimized triangle list to triangle strip, stitching strips using restart index or degenerate
        triangles.
         
        Returns the number of indices in the resulting strip, with destination containing new index data. For maximum efficiency the index buffer being
        converted has to be optimized for vertex cache first. Using restart indices can result in ~10% smaller index buffers, but on some GPUs restart indices
        may result in decreased performance.
        """,

        Unsafe..unsigned_int.p("destination", "must contain enough space for the target index buffer, worst case can be computed with #stripifyBound()"),
        unsigned_int.const.p("indices", ""),
        AutoSize("indices")..size_t("index_count", ""),
        size_t("vertex_count", ""),
        unsigned_int("restart_index", "should be {@code 0xffff} or {@code 0xffffffff} depending on index size, or 0 to use degenerate triangles")
    )

    size_t(
        "stripifyBound",
        "",

        size_t("index_count", "")
    )

    size_t(
        "unstripify",
        """
        Mesh unstripifier. Converts a triangle strip to a triangle list.
         
        Returns the number of indices in the resulting list, with destination containing new index data.
        """,

        Unsafe..unsigned_int.p("destination", "must contain enough space for the target index buffer, worst case can be computed with #unstripifyBound()"),
        unsigned_int.const.p("indices", ""),
        AutoSize("indices")..size_t("index_count", ""),
        unsigned_int("restart_index", "")
    )

    size_t(
        "unstripifyBound",
        "",

        size_t("index_count", "")
    )

    meshopt_VertexCacheStatistics(
        "analyzeVertexCache",
        """
        Vertex transform cache analyzer.
        
        Returns cache hit statistics using a simplified FIFO model. Results may not match actual GPU performance.
        """,

        unsigned_int.const.p("indices", ""),
        AutoSize("indices")..size_t("index_count", ""),
        size_t("vertex_count", ""),
        unsigned_int("cache_size", ""),
        unsigned_int("warp_size", ""),
        unsigned_int("primgroup_size", "")
    )

    meshopt_OverdrawStatistics(
        "analyzeOverdraw",
        """
        Overdraw analyzer. Returns overdraw statistics using a software rasterizer.
        
        Results may not match actual GPU performance.
        """,

        unsigned_int.const.p("indices", ""),
        AutoSize("indices")..size_t("index_count", ""),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p(
            "vertex_positions",
            "should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}"
        ),
        size_t("vertex_count", ""),
        size_t("vertex_positions_stride", "")
    )

    meshopt_VertexFetchStatistics(
        "analyzeVertexFetch",
        """
        Vertex fetch cache analyzer. Returns cache hit statistics using a simplified direct mapped model.
        
        Results may not match actual GPU performance.
        """,

        unsigned_int.const.p("indices", ""),
        AutoSize("indices")..size_t("index_count", ""),
        size_t("vertex_count", ""),
        size_t("vertex_size", "")
    )

    size_t(
        "buildMeshlets",
        """
        Meshlet builder. Splits the mesh into a set of meshlets where each meshlet has a micro index buffer indexing into meshlet vertices that refer to the
        original vertex buffer.
         
        The resulting data can be used to render meshes using NVidia programmable mesh shading pipeline, or in other cluster-based renderers. When using
        {@code buildMeshlets}, vertex positions need to be provided to minimize the size of the resulting clusters. When using #buildMeshletsScan(), for
        maximum efficiency the index buffer being converted has to be optimized for vertex cache first.
        """,

        Unsafe..meshopt_Meshlet.p("meshlets", "must contain enough space for all meshlets, worst case size can be computed with #buildMeshletsBound()"),
        Check("meshlets.remaining() * max_vertices")..unsigned_int.p(
            "meshlet_vertices",
            "must contain enough space for all meshlets, worst case size is equal to {@code max_meshlets * max_vertices}"
        ),
        Check("meshlets.remaining() * max_triangles * 3")..unsigned_char.p(
            "meshlet_triangles",
            "must contain enough space for all meshlets, worst case size is equal to {@code max_meshlets * max_triangles * 3}"
        ),
        unsigned_int.const.p("indices", ""),
        AutoSize("indices")..size_t("index_count", ""),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p(
            "vertex_positions",
            "should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}"
        ),
        size_t("vertex_count", ""),
        size_t("vertex_positions_stride", ""),
        size_t("max_vertices", "must not exceed implementation limits ({@code max_vertices} &le; 255 - not 256!)"),
        size_t("max_triangles", "must not exceed implementation limits ({@code max_triangles} &le; 512)"),
        float(
            "cone_weight",
            """
            should be set to 0 when cone culling is not used, and a value between 0 and 1 otherwise to balance between cluster size and cone culling efficiency
            """
        )
    )

    size_t(
        "buildMeshletsScan",
        "See #buildMeshlets().",

        Unsafe..meshopt_Meshlet.p("meshlets", ""),
        Check("meshlets.remaining() * max_vertices")..unsigned_int.p("meshlet_vertices", ""),
        Check("meshlets.remaining() * max_triangles * 3")..unsigned_char.p("meshlet_triangles", ""),
        unsigned_int.const.p("indices", ""),
        AutoSize("indices")..size_t("index_count", ""),
        size_t("vertex_count", ""),
        size_t("max_vertices", ""),
        size_t("max_triangles", "")
    )

    size_t(
        "buildMeshletsBound",
        "See #buildMeshlets().",

        size_t("index_count", ""),
        size_t("max_vertices", ""),
        size_t("max_triangles", "")
    )

    meshopt_Bounds(
        "computeClusterBounds",
        """
        Cluster bounds generator. Creates bounding volumes that can be used for frustum, backface and occlusion culling.

        For backface culling with orthographic projection, use the following formula to reject backfacing clusters: {@code dot(view, cone_axis) >= cone_cutoff}

        For perspective projection, you can the formula that needs cone apex in addition to axis &amp; cutoff:
        {@code dot(normalize(cone_apex - camera_position), cone_axis) >= cone_cutoff}.

        Alternatively, you can use the formula that doesn't need cone apex and uses bounding sphere instead:
        {@code dot(normalize(center - camera_position), cone_axis) >= cone_cutoff + radius / length(center - camera_position)} or an equivalent formula that
        doesn't have a singularity at center = camera_position:
        {@code dot(center - camera_position, cone_axis) >= cone_cutoff * length(center - camera_position) + radius}

        The formula that uses the apex is slightly more accurate but needs the apex; if you are already using bounding sphere to do frustum/occlusion culling,
        the formula that doesn't use the apex may be preferable.
        """,

        unsigned_int.const.p("indices", ""),
        AutoSize("indices")..size_t(
            "index_count",
            "{@code index_count/3} should be less than or equal to 512 (the function assumes clusters of limited size)"
        ),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p(
            "vertex_positions",
            "should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}"
        ),
        size_t("vertex_count", ""),
        size_t("vertex_positions_stride", "")
    )

    meshopt_Bounds(
        "computeMeshletBounds",
        "See #computeClusterBounds().",

        Unsafe..unsigned_int.const.p("meshlet_vertices", ""),
        Check("triangle_count * 3")..unsigned_char.const.p("meshlet_triangles", ""),
        size_t("triangle_count", ""),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions", ""),
        size_t("vertex_count", ""),
        size_t("vertex_positions_stride", "")
    )

    void(
        "spatialSortRemap",
        """
        Experimental: Spatial sorter. Generates a remap table that can be used to reorder points for spatial locality.
        
        Resulting remap table maps old vertices to new vertices and can be used in #remapVertexBuffer().
        """,

        unsigned_int.p("destination", "must contain enough space for the resulting remap table ({@code vertex_count} elements)"),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p("vertex_positions", ""),
        UseVariable..AutoSize("destination")..size_t("vertex_count", ""),
        size_t("vertex_positions_stride", "")
    )

    void(
        "spatialSortTriangles",
        """
        Experimental: Spatial sorter. Reorders triangles for spatial locality, and generates a new index buffer.
        
        The resulting index buffer can be used with other functions like #optimizeVertexCache().
        """,

        unsigned_int.p("destination", "must contain enough space for the resulting index buffer ({@code index_count} elements)"),
        unsigned_int.const.p("indices", ""),
        AutoSize("destination", "indices")..size_t("index_count", ""),
        Check("vertex_count * (vertex_positions_stride >>> 2)")..float.const.p(
            "vertex_positions",
            "should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}"
        ),
        size_t("vertex_count", ""),
        size_t("vertex_positions_stride", "")
    )

    void(
        "setAllocator",
        """
        Set allocation callbacks.
        
        These callbacks will be used instead of the default operator new/operator delete for all temporary allocations in the library. Note that all algorithms
        only allocate memory for temporary use. {@code allocate}/{@code deallocate} are always called in a stack-like order - last pointer to be allocated is
        deallocated first.
        """,

        meshopt_AllocateCB("allocate", ""),
        meshopt_DeallocateCB("deallocate", "")
    )

    /*int(
        "quantizeUnorm",
        """
        Quantizes a float in {@code [0..1]} range into an N-bit fixed point {@code unorm} value.

        Assumes reconstruction function ${code("q / (2<sup>N</sup> - 1)")}, which is the case for fixed-function normalized fixed point conversion. Maximum
        reconstruction error: ${code("1 / 2<sup>N+1</sup>")}.
        """,

        float("v", ""),
        int("N", "")
    )

    int(
        "quantizeSnorm",
        """
        Quantizes a float in {@code [-1..1]} range into an N-bit fixed point {@code snorm} value.

        Assumes reconstruction function ${code("q / (2<sup>N-1</sup> - 1)")}, which is the case for fixed-function normalized fixed point conversion (except early
        OpenGL versions). Maximum reconstruction error: ${code("1 / 2<sup>N</sup>")}.
        """,

        float("v", ""),
        int("N", "")
    )

    short(
        "quantizeHalf",
        """
        Quantizes a float into half-precision floating point value.

        Generates {@code +-inf} for overflow, preserves {@code NaN}, flushes denormals to zero, rounds to nearest. Representable magnitude range:
        {@code [6e-5; 65504]}. Maximum relative reconstruction error: {@code 5e-4}.
        """,

        float("v", "")
    )

    float(
        "quantizeFloat",
        """
        Quantizes a float into a floating point value with a limited number of significant mantissa bits.

        Generates {@code +-inf} for overflow, preserves {@code NaN}, flushes denormals to zero, rounds to nearest. Assumes {@code N} is in a valid mantissa
        precision range, which is {@code 1..23}.
        """,

        float("v", ""),
        int("N", "")
    )*/
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
     * Quantizes a float into half-precision floating point value.
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
     * Quantizes a float into a floating point value with a limited number of significant mantissa bits.
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
    }""")
}