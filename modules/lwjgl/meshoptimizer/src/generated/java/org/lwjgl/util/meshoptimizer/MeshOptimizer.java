/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meshoptimizer;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static java.lang.Float.*;

/**
 * Native bindings to <a target="_blank" href="https://github.com/zeux/meshoptimizer">meshoptimizer</a>.
 * 
 * <p>When a GPU renders triangle meshes, various stages of the GPU pipeline have to process vertex and index data. The efficiency of these stages depends on
 * the data you feed to them; this library provides algorithms to help optimize meshes for these stages, as well as algorithms to reduce the mesh
 * complexity and storage overhead.</p>
 * 
 * <h3>Pipeline</h3>
 * 
 * <p>When optimizing a mesh, you should typically feed it through a set of optimizations (the order is important!):</p>
 * 
 * <ul>
 * <li>Indexing</li>
 * <li>Vertex cache optimization</li>
 * <li>Overdraw optimization</li>
 * <li>Vertex fetch optimization</li>
 * <li>Vertex quantization</li>
 * <li>(optional) Vertex/index buffer compression</li>
 * </ul>
 * 
 * <h3>Indexing</h3>
 * 
 * <p>Most algorithms in this library assume that a mesh has a vertex buffer and an index buffer. For algorithms to work well and also for GPU to render your
 * mesh efficiently, the vertex buffer has to have no redundant vertices; you can generate an index buffer from an unindexed vertex buffer or reindex an
 * existing (potentially redundant) index buffer as follows:</p>
 * 
 * <p>First, generate a remap table from your existing vertex (and, optionally, index) data:</p>
 * 
 * <pre><code>
 * size_t index_count = face_count * 3;
 * std::vector&lt;unsigned int&gt; remap(index_count); // allocate temporary memory for the remap table
 * size_t vertex_count = meshopt_generateVertexRemap(&amp;remap[0], NULL, index_count, &amp;unindexed_vertices[0], index_count, sizeof(Vertex));</code></pre>
 * 
 * <p>Note that in this case we only have an unindexed vertex buffer; the remap table is generated based on binary equivalence of the input vertices, so the
 * resulting mesh will render the same way.</p>
 * 
 * <p>After generating the remap table, you can allocate space for the target vertex buffer ({@code vertex_count} elements) and index buffer
 * ({@code index_count} elements) and generate them:</p>
 * 
 * <pre><code>
 * meshopt_remapIndexBuffer(indices, NULL, index_count, &amp;remap[0]);
 * meshopt_remapVertexBuffer(vertices, &amp;unindexed_vertices[0], index_count, sizeof(Vertex), &amp;remap[0]);</code></pre>
 * 
 * <p>You can then further optimize the resulting buffers by calling the other functions on them in-place.</p>
 * 
 * <h3>Vertex cache optimization</h3>
 * 
 * <p>When the GPU renders the mesh, it has to run the vertex shader for each vertex; usually GPUs have a built-in fixed size cache that stores the
 * transformed vertices (the result of running the vertex shader), and uses this cache to reduce the number of vertex shader invocations. This cache is
 * usually small, 16-32 vertices, and can have different replacement policies; to use this cache efficiently, you have to reorder your triangles to
 * maximize the locality of reused vertex references like so:</p>
 * 
 * <pre><code>
 * meshopt_optimizeVertexCache(indices, indices, index_count, vertex_count);</code></pre>
 * 
 * <h3>Overdraw optimization</h3>
 * 
 * <p>After transforming the vertices, GPU sends the triangles for rasterization which results in generating pixels that are usually first ran through the
 * depth test, and pixels that pass it get the pixel shader executed to generate the final color. As pixel shaders get more expensive, it becomes more and
 * more important to reduce overdraw. While in general improving overdraw requires view-dependent operations, this library provides an algorithm to
 * reorder triangles to minimize the overdraw from all directions, which you should run after vertex cache optimization like this:</p>
 * 
 * <pre><code>
 * meshopt_optimizeOverdraw(indices, indices, index_count, &amp;vertices[0].x, vertex_count, sizeof(Vertex), 1.05f);</code></pre>
 * 
 * <p>The overdraw optimizer needs to read vertex positions as a {@code float3} from the vertex; the code snippet above assumes that the vertex stores
 * position as {@code float x, y, z}.</p>
 * 
 * <p>When performing the overdraw optimization you have to specify a floating-point threshold parameter. The algorithm tries to maintain a balance between
 * vertex cache efficiency and overdraw; the threshold determines how much the algorithm can compromise the vertex cache hit ratio, with 1.05 meaning that
 * the resulting ratio should be at most 5% worse than before the optimization.</p>
 * 
 * <h3>Vertex fetch optimization</h3>
 * 
 * <p>After the final triangle order has been established, we still can optimize the vertex buffer for memory efficiency. Before running the vertex shader
 * GPU has to fetch the vertex attributes from the vertex buffer; the fetch is usually backed by a memory cache, and as such optimizing the data for the
 * locality of memory access is important. You can do this by running this code:</p>
 * 
 * <p>To optimize the index/vertex buffers for vertex fetch efficiency, call:</p>
 * 
 * <pre><code>
 * meshopt_optimizeVertexFetch(vertices, indices, index_count, vertices, vertex_count, sizeof(Vertex));</code></pre>
 * 
 * <p>This will reorder the vertices in the vertex buffer to try to improve the locality of reference, and rewrite the indices in place to match; if the
 * vertex data is stored using multiple streams, you should use {@link #meshopt_optimizeVertexFetchRemap optimizeVertexFetchRemap} instead. This optimization has to be performed on the final
 * index buffer since the optimal vertex order depends on the triangle order.</p>
 * 
 * <p>Note that the algorithm does not try to model cache replacement precisely and instead just orders vertices in the order of use, which generally
 * produces results that are close to optimal.</p>
 * 
 * <h3>Vertex quantization</h3>
 * 
 * <p>To optimize memory bandwidth when fetching the vertex data even further, and to reduce the amount of memory required to store the mesh, it is often
 * beneficial to quantize the vertex attributes to smaller types. While this optimization can technically run at any part of the pipeline (and sometimes
 * doing quantization as the first step can improve indexing by merging almost identical vertices), it generally is easier to run this after all other
 * optimizations since some of them require access to {@code float3} positions.</p>
 * 
 * <p>Quantization is usually domain specific; it's common to quantize normals using 3 8-bit integers but you can use higher-precision quantization (for
 * example using 10 bits per component in a {@code 10_10_10_2} format), or a different encoding to use just 2 components. For positions and texture
 * coordinate data the two most common storage formats are half precision floats, and 16-bit normalized integers that encode the position relative to the
 * AABB of the mesh or the UV bounding rectangle.</p>
 * 
 * <p>The number of possible combinations here is very large but this library does provide the building blocks, specifically functions to quantize floating
 * point values to normalized integers, as well as half-precision floats. For example, here's how you can quantize a normal:</p>
 * 
 * <pre><code>
 * unsigned int normal =
 *     (meshopt_quantizeUnorm(v.nx, 10) &lt;&lt; 20) |
 *     (meshopt_quantizeUnorm(v.ny, 10) &lt;&lt; 10) |
 *      meshopt_quantizeUnorm(v.nz, 10);</code></pre>
 * 
 * <p>and here's how you can quantize a position:</p>
 * 
 * <pre><code>
 * unsigned short px = meshopt_quantizeHalf(v.x);
 * unsigned short py = meshopt_quantizeHalf(v.y);
 * unsigned short pz = meshopt_quantizeHalf(v.z);</code></pre>
 * 
 * <h3>Vertex/index buffer compression</h3>
 * 
 * <p>In case storage size or transmission bandwidth is of importance, you might want to additionally compress vertex and index data. While several mesh
 * compression libraries, like Google Draco, are available, they typically are designed to maximize the compression ratio at the cost of disturbing the
 * vertex/index order (which makes the meshes inefficient to render on GPU) or decompression performance. They also frequently don't support custom
 * game-ready quantized vertex formats and thus require to re-quantize the data after loading it, introducing extra quantization errors and making
 * decoding slower.</p>
 * 
 * <p>Alternatively you can use general purpose compression libraries like zstd or Oodle to compress vertex/index data - however these compressors aren't
 * designed to exploit redundancies in vertex/index data and as such compression rates can be unsatisfactory.</p>
 * 
 * <p>To that end, this library provides algorithms to "encode" vertex and index data. The result of the encoding is generally significantly smaller than
 * initial data, and remains compressible with general purpose compressors - so you can either store encoded data directly (for modest compression ratios
 * and maximum decoding performance), or further compress it with zstd/Oodle to maximize compression ratio.</p>
 * 
 * <p>To encode, you need to allocate target buffers (preferably using the worst case bound) and call encoding functions:</p>
 * 
 * <pre><code>
 * std::vector&lt;unsigned char&gt; vbuf(meshopt_encodeVertexBufferBound(vertex_count, sizeof(Vertex)));
 * vbuf.resize(meshopt_encodeVertexBuffer(&amp;vbuf[0], vbuf.size(), vertices, vertex_count, sizeof(Vertex)));
 * 
 * std::vector&lt;unsigned char&gt; ibuf(meshopt_encodeIndexBufferBound(index_count, vertex_count));
 * ibuf.resize(meshopt_encodeIndexBuffer(&amp;ibuf[0], ibuf.size(), indices, index_count));</code></pre>
 * 
 * <p>You can then either serialize {@code vbuf}/{@code ibuf} as is, or compress them further. To decode the data at runtime, call decoding functions:</p>
 * 
 * <pre><code>
 * int resvb = meshopt_decodeVertexBuffer(vertices, vertex_count, sizeof(Vertex), &amp;vbuf[0], vbuf.size());
 * int resib = meshopt_decodeIndexBuffer(indices, index_count, &amp;buffer[0], buffer.size());
 * assert(resvb == 0 &amp;&amp; resib == 0);</code></pre>
 * 
 * <p>Note that vertex encoding assumes that vertex buffer was optimized for vertex fetch, and that vertices are quantized; index encoding assumes that the
 * vertex/index buffers were optimized for vertex cache and vertex fetch. Feeding unoptimized data into the encoders will produce poor compression ratios.
 * Both codecs are lossless - the only lossy step is quantization that happens before encoding.</p>
 * 
 * <p>Decoding functions are heavily optimized and can directly target write-combined memory; you can expect both decoders to run at 1-3 GB/s on modern
 * desktop CPUs. Compression ratios depend on the data; vertex data compression ratio is typically around 2-4x (compared to already quantized data), index
 * data compression ratio is around 5-6x (compared to raw 16-bit index data). General purpose lossless compressors can further improve on these results.</p>
 * 
 * <h3>Triangle strip conversion</h3>
 * 
 * <p>On most hardware, indexed triangle lists are the most efficient way to drive the GPU. However, in some cases triangle strips might prove beneficial:</p>
 * 
 * <ul>
 * <li>On some older GPUs, triangle strips may be a bit more efficient to render</li>
 * <li>On extremely memory constrained systems, index buffers for triangle strips could save a bit of memory</li>
 * </ul>
 * 
 * <p>This library provides an algorithm for converting a vertex cache optimized triangle list to a triangle strip:</p>
 * 
 * <pre><code>
 * std::vector&lt;unsigned int&gt; strip(meshopt_stripifyBound(index_count));
 * unsigned int restart_index = ~0u;
 * size_t strip_size = meshopt_stripify(&amp;strip[0], indices, index_count, vertex_count, restart_index);</code></pre>
 * 
 * <p>Typically you should expect triangle strips to have ~50-60% of indices compared to triangle lists (~1.5-1.8 indices per triangle) and have ~5% worse
 * ACMR. Note that triangle strips can be stitched with or without restart index support. Using restart indices can result in ~10% smaller index buffers,
 * but on some GPUs restart indices may result in decreased performance.</p>
 * 
 * <h3>Deinterleaved geometry</h3>
 * 
 * <p>All of the examples above assume that geometry is represented as a single vertex buffer and a single index buffer. This requires storing all vertex
 * attributes - position, normal, texture coordinate, skinning weights etc. - in a single contiguous struct. However, in some cases using multiple vertex
 * streams may be preferable. In particular, if some passes require only positional data - such as depth pre-pass or shadow map - then it may be
 * beneficial to split it from the rest of the vertex attributes to make sure the bandwidth use during these passes is optimal. On some mobile GPUs a
 * position-only attribute stream also improves efficiency of tiling algorithms.</p>
 * 
 * <p>Most of the functions in this library either only need the index buffer (such as vertex cache optimization) or only need positional information (such
 * as overdraw optimization). However, several tasks require knowledge about all vertex attributes.</p>
 * 
 * <p>For indexing, {@link #meshopt_generateVertexRemap generateVertexRemap} assumes that there's just one vertex stream; when multiple vertex streams are used, it's necessary to use
 * {@link #meshopt_generateVertexRemapMulti generateVertexRemapMulti} as follows:</p>
 * 
 * <pre><code>
 * meshopt_Stream streams[] = {
 *     {&amp;unindexed_pos[0], sizeof(float) * 3, sizeof(float) * 3},
 *     {&amp;unindexed_nrm[0], sizeof(float) * 3, sizeof(float) * 3},
 *     {&amp;unindexed_uv[0], sizeof(float) * 2, sizeof(float) * 2},
 * };
 * 
 * std::vector&lt;unsigned int&gt; remap(index_count);
 * size_t vertex_count = meshopt_generateVertexRemapMulti(&amp;remap[0], NULL, index_count, index_count, streams, sizeof(streams) / sizeof(streams[0]));</code></pre>
 * 
 * <p>After this {@link #meshopt_remapVertexBuffer remapVertexBuffer} needs to be called once for each vertex stream to produce the correctly reindexed stream.</p>
 * 
 * <p>Instead of calling {@link #meshopt_optimizeVertexFetch optimizeVertexFetch} for reordering vertices in a single vertex buffer for efficiency, calling {@link #meshopt_optimizeVertexFetchRemap optimizeVertexFetchRemap} and
 * then calling {@link #meshopt_remapVertexBuffer remapVertexBuffer} for each stream again is recommended.</p>
 * 
 * <p>Finally, when compressing vertex data, {@link #meshopt_encodeVertexBuffer encodeVertexBuffer} should be used on each vertex stream separately - this allows the encoder to best utilize
 * correlation between attribute values for different vertices.</p>
 * 
 * <h3>Simplification</h3>
 * 
 * <p>All algorithms presented so far don't affect visual appearance at all, with the exception of quantization that has minimal controlled impact. However,
 * fundamentally the most effective way at reducing the rendering or transmission cost of a mesh is to make the mesh simpler.</p>
 * 
 * <p>This library provides two simplification algorithms that reduce the number of triangles in the mesh. Given a vertex and an index buffer, they generate
 * a second index buffer that uses existing vertices in the vertex buffer. This index buffer can be used directly for rendering with the original vertex
 * buffer (preferably after vertex cache optimization), or a new compact vertex/index buffer can be generated using {@link #meshopt_optimizeVertexFetch optimizeVertexFetch} that uses the
 * optimal number and order of vertices.</p>
 * 
 * <p>The first simplification algorithm, {@link #meshopt_simplify simplify}, follows the topology of the original mesh in an attempt to preserve attribute seams, borders and
 * overall appearance. For meshes with inconsistent topology or many seams, such as faceted meshes, it can result in simplifier getting "stuck" and not
 * being able to simplify the mesh fully; it's recommended to preprocess the index buffer with {@link #meshopt_generateShadowIndexBuffer generateShadowIndexBuffer} to discard any vertex
 * attributes that aren't critical and can be rebuilt later such as normals.</p>
 * 
 * <pre><code>
 * float threshold = 0.2f;
 * size_t target_index_count = size_t(index_count * threshold);
 * float target_error = 1e-2f;
 * 
 * std::vector&lt;unsigned int&gt; lod(index_count);
 * lod.resize(meshopt_simplify(&amp;lod[0], indices, index_count, &amp;vertices[0].x, vertex_count, sizeof(Vertex), target_index_count, target_error));</code></pre>
 * 
 * <p>Target error is an approximate measure of the deviation from the original mesh using distance normalized to {@code 0..1} (so {@code 1e-2f} means that
 * simplifier will try to maintain the error to be below 1% of the mesh extents). Note that because of topological restrictions and error bounds
 * simplifier isn't guaranteed to reach the target index count and can stop earlier.</p>
 * 
 * <p>The second simplification algorithm, {@link #meshopt_simplifySloppy simplifySloppy}, doesn't follow the topology of the original mesh. This means that it doesn't preserve attribute
 * seams or borders, but it can collapse internal details that are too small to matter better because it can merge mesh features that are topologically
 * disjoint but spatially close.</p>
 * 
 * <pre><code>
 * float threshold = 0.2f;
 * size_t target_index_count = size_t(index_count * threshold);
 * 
 * std::vector&lt;unsigned int&gt; lod(target_index_count);
 * lod.resize(meshopt_simplifySloppy(&amp;lod[0], indices, index_count, &amp;vertices[0].x, vertex_count, sizeof(Vertex), target_index_count));</code></pre>
 * 
 * <p>This algorithm is guaranteed to return a result at or below the target index count. It is 5-6x faster than {@link #meshopt_simplify simplify} when simplification ratio is
 * large, and is able to reach ~20M triangles/sec on a desktop CPU ({@code meshopt_simplify} works at ~3M triangles/sec).</p>
 * 
 * <p>When a sequence of LOD meshes is generated that all use the original vertex buffer, care must be taken to order vertices optimally to not penalize
 * mobile GPU architectures that are only capable of transforming a sequential vertex buffer range. It's recommended in this case to first optimize each
 * LOD for vertex cache, then assemble all LODs in one large index buffer starting from the coarsest LOD (the one with fewest triangles), and call
 * {@link #meshopt_optimizeVertexFetch optimizeVertexFetch} on the final large index buffer. This will make sure that coarser LODs require a smaller vertex range and are efficient wrt
 * vertex fetch and transform.</p>
 * 
 * <h3>Efficiency analyzers</h3>
 * 
 * <p>While the only way to get precise performance data is to measure performance on the target GPU, it can be valuable to measure the impact of these
 * optimization in a GPU-independent manner. To this end, the library provides analyzers for all three major optimization routines. For each optimization
 * there is a corresponding analyze function, like {@link #meshopt_analyzeOverdraw analyzeOverdraw}, that returns a struct with statistics.</p>
 * 
 * <p>{@link #meshopt_analyzeVertexCache analyzeVertexCache} returns vertex cache statistics. The common metric to use is ACMR - average cache miss ratio, which is the ratio of the total
 * number of vertex invocations to the triangle count. The worst-case ACMR is 3 (GPU has to process 3 vertices for each triangle); on regular grids the
 * optimal ACMR approaches 0.5. On real meshes it usually is in {@code [0.5..1.5]} range depending on the amount of vertex splits. One other useful metric
 * is ATVR - average transformed vertex ratio - which represents the ratio of vertex shader invocations to the total vertices, and has the best case of
 * 1.0 regardless of mesh topology (each vertex is transformed once).</p>
 * 
 * <p>{@link #meshopt_analyzeVertexFetch analyzeVertexFetch} returns vertex fetch statistics. The main metric it uses is overfetch - the ratio between the number of bytes read from the
 * vertex buffer to the total number of bytes in the vertex buffer. Assuming non-redundant vertex buffers, the best case is 1.0 - each byte is fetched
 * once.</p>
 * 
 * <p>{@link #meshopt_analyzeOverdraw analyzeOverdraw} returns overdraw statistics. The main metric it uses is overdraw - the ratio between the number of pixel shader invocations to the
 * total number of covered pixels, as measured from several different orthographic cameras. The best case for overdraw is 1.0 - each pixel is shaded once.</p>
 * 
 * <p>Note that all analyzers use approximate models for the relevant GPU units, so the numbers you will get as the result are only a rough approximation of
 * the actual performance.</p>
 * 
 * <h3>Memory management</h3>
 * 
 * <p>Many algorithms allocate temporary memory to store intermediate results or accelerate processing. The amount of memory allocated is a function of
 * various input parameters such as vertex count and index count. By default memory is allocated using {@code operator new} and {@code operator delete};
 * if these operators are overloaded by the application, the overloads will be used instead. Alternatively it's possible to specify custom
 * allocation/deallocation functions using {@link #meshopt_setAllocator setAllocator}, e.g.</p>
 * 
 * <pre><code>
 * meshopt_setAllocator(malloc, free);</code></pre>
 * 
 * <p>Note that the library expects the allocation function to either throw in case of out-of-memory (in which case the exception will propagate to the
 * caller) or abort, so technically the use of {@code malloc} above isn't safe. If you want to handle out-of-memory errors without using C++ exceptions,
 * you can use {@code setjmp}/{@code longjmp} instead.</p>
 * 
 * <p>Vertex and index decoders ({@link #meshopt_decodeVertexBuffer decodeVertexBuffer} and {@link #meshopt_decodeIndexBuffer decodeIndexBuffer}) do not allocate memory and work completely within the buffer space provided
 * via arguments.</p>
 * 
 * <p>All functions have bounded stack usage that does not exceed 32 KB for any algorithms.</p>
 * 
 * <p>LWJGL note: meshoptimizer can be configured to use the LWJGL memory allocator with the following code:</p>
 * 
 * <pre><code>
 * nmeshopt_setAllocator(
 *     MemoryUtil.getAllocator().getMalloc(),
 *     MemoryUtil.getAllocator().getFree()
 * );</code></pre>
 */
public class MeshOptimizer {

    static { LibMeshOptimizer.initialize(); }

    public static final int MESHOPTIMIZER_VERSION = 170;

    protected MeshOptimizer() {
        throw new UnsupportedOperationException();
    }

    // --- [ meshopt_generateVertexRemap ] ---

    /** Unsafe version of: {@link #meshopt_generateVertexRemap generateVertexRemap} */
    public static native long nmeshopt_generateVertexRemap(long destination, long indices, long index_count, long vertices, long vertex_count, long vertex_size);

    /**
     * Generates a vertex remap table from the vertex buffer and an optional index buffer and returns number of unique vertices.
     * 
     * <p>As a result, all vertices that are binary equivalent map to the same (new) location, with no gaps in the resulting sequence. Resulting remap table
     * maps old vertices to new vertices and can be used in {@link #meshopt_remapVertexBuffer remapVertexBuffer}/{@link #meshopt_remapIndexBuffer remapIndexBuffer}. Note that binary equivalence considers all
     * {@code vertex_size} bytes, including padding which should be zero-initialized.</p>
     *
     * @param destination must contain enough space for the resulting remap table ({@code vertex_count} elements)
     * @param indices     can be {@code NULL} if the input is unindexed
     */
    @NativeType("size_t")
    public static long meshopt_generateVertexRemap(@NativeType("unsigned int *") IntBuffer destination, @Nullable @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long index_count, @NativeType("void const *") ByteBuffer vertices, @NativeType("size_t") long vertex_size) {
        long vertex_count = destination.remaining();
        if (CHECKS) {
            checkSafe(indices, index_count);
            check(vertices, vertex_count * vertex_size);
        }
        return nmeshopt_generateVertexRemap(memAddress(destination), memAddressSafe(indices), index_count, memAddress(vertices), vertex_count, vertex_size);
    }

    // --- [ meshopt_generateVertexRemapMulti ] ---

    /** Unsafe version of: {@link #meshopt_generateVertexRemapMulti generateVertexRemapMulti} */
    public static native long nmeshopt_generateVertexRemapMulti(long destination, long indices, long index_count, long vertex_count, long streams, long stream_count);

    /**
     * Generates a vertex remap table from multiple vertex streams and an optional index buffer and returns number of unique vertices.
     * 
     * <p>As a result, all vertices that are binary equivalent map to the same (new) location, with no gaps in the resulting sequence. Resulting remap table maps
     * old vertices to new vertices and can be used in {@link #meshopt_remapVertexBuffer remapVertexBuffer}/{@link #meshopt_remapIndexBuffer remapIndexBuffer}. To remap vertex buffers, you will need to call
     * {@code meshopt_remapVertexBuffer} for each vertex stream. Note that binary equivalence considers all size bytes in each stream, including padding which
     * should be zero-initialized.</p>
     *
     * @param destination must contain enough space for the resulting remap table ({@code vertex_count} elements)
     * @param indices     can be {@code NULL} if the input is unindexed
     */
    @NativeType("size_t")
    public static long meshopt_generateVertexRemapMulti(@NativeType("unsigned int *") IntBuffer destination, @Nullable @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long index_count, @NativeType("struct meshopt_Stream const *") MeshoptStream.Buffer streams) {
        long vertex_count = destination.remaining();
        if (CHECKS) {
            checkSafe(indices, index_count);
            Struct.validate(streams.address(), streams.remaining(), MeshoptStream.SIZEOF, MeshoptStream::validate);
        }
        return nmeshopt_generateVertexRemapMulti(memAddress(destination), memAddressSafe(indices), index_count, vertex_count, streams.address(), streams.remaining());
    }

    // --- [ meshopt_remapVertexBuffer ] ---

    /**
     * Unsafe version of: {@link #meshopt_remapVertexBuffer remapVertexBuffer}
     *
     * @param vertex_count should be the initial vertex count and not the value returned by {@code meshopt_generateVertexRemap}
     */
    public static native void nmeshopt_remapVertexBuffer(long destination, long vertices, long vertex_count, long vertex_size, long remap);

    /**
     * Generates vertex buffer from the source vertex buffer and remap table generated by {@link #meshopt_generateVertexRemap generateVertexRemap}.
     *
     * @param destination must contain enough space for the resulting vertex buffer ({@code unique_vertex_count} elements, returned by {@code meshopt_generateVertexRemap})
     */
    public static void meshopt_remapVertexBuffer(@NativeType("void *") ByteBuffer destination, @NativeType("void const *") ByteBuffer vertices, @NativeType("size_t") long vertex_size, @NativeType("unsigned int const *") IntBuffer remap) {
        long vertex_count = remap.remaining();
        if (CHECKS) {
            check(vertices, vertex_count * vertex_size);
        }
        nmeshopt_remapVertexBuffer(memAddress(destination), memAddress(vertices), vertex_count, vertex_size, memAddress(remap));
    }

    // --- [ meshopt_remapIndexBuffer ] ---

    /** Unsafe version of: {@link #meshopt_remapIndexBuffer remapIndexBuffer} */
    public static native void nmeshopt_remapIndexBuffer(long destination, long indices, long index_count, long remap);

    /**
     * Generates index buffer from the source index buffer and remap table generated by {@link #meshopt_generateVertexRemap generateVertexRemap}.
     *
     * @param destination must contain enough space for the resulting index buffer ({@code index_count} elements)
     * @param indices     can be {@code NULL} if the input is unindexed
     */
    public static void meshopt_remapIndexBuffer(@NativeType("unsigned int *") IntBuffer destination, @Nullable @NativeType("unsigned int const *") IntBuffer indices, @NativeType("unsigned int const *") IntBuffer remap) {
        if (CHECKS) {
            checkSafe(indices, destination.remaining());
        }
        nmeshopt_remapIndexBuffer(memAddress(destination), memAddressSafe(indices), destination.remaining(), memAddress(remap));
    }

    // --- [ meshopt_generateShadowIndexBuffer ] ---

    /** Unsafe version of: {@link #meshopt_generateShadowIndexBuffer generateShadowIndexBuffer} */
    public static native void nmeshopt_generateShadowIndexBuffer(long destination, long indices, long index_count, long vertices, long vertex_count, long vertex_size, long vertex_stride);

    /**
     * Generates index buffer that can be used for more efficient rendering when only a subset of the vertex attributes is necessary.
     * 
     * <p>All vertices that are binary equivalent (wrt first {@code vertex_size} bytes) map to the first vertex in the original vertex buffer. This makes it
     * possible to use the index buffer for Z pre-pass or shadowmap rendering, while using the original index buffer for regular rendering. Note that binary
     * equivalence considers all {@code vertex_size} bytes, including padding which should be zero-initialized.</p>
     *
     * @param destination must contain enough space for the resulting index buffer ({@code index_count} elements)
     */
    public static void meshopt_generateShadowIndexBuffer(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("void const *") ByteBuffer vertices, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size, @NativeType("size_t") long vertex_stride) {
        if (CHECKS) {
            check(indices, destination.remaining());
            check(vertices, vertex_count * vertex_stride);
        }
        nmeshopt_generateShadowIndexBuffer(memAddress(destination), memAddress(indices), destination.remaining(), memAddress(vertices), vertex_count, vertex_size, vertex_stride);
    }

    // --- [ meshopt_generateShadowIndexBufferMulti ] ---

    /** Unsafe version of: {@link #meshopt_generateShadowIndexBufferMulti generateShadowIndexBufferMulti} */
    public static native void nmeshopt_generateShadowIndexBufferMulti(long destination, long indices, long index_count, long vertex_count, long streams, long stream_count);

    /**
     * Generates index buffer that can be used for more efficient rendering when only a subset of the vertex attributes is necessary.
     * 
     * <p>All vertices that are binary equivalent (wrt specified {@code streams}) map to the first vertex in the original vertex buffer. This makes it possible
     * to use the index buffer for Z pre-pass or shadowmap rendering, while using the original index buffer for regular rendering. Note that binary
     * equivalence considers all size bytes in each stream, including padding which should be zero-initialized.</p>
     *
     * @param destination must contain enough space for the resulting index buffer ({@code index_count} elements)
     */
    public static void meshopt_generateShadowIndexBufferMulti(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count, @NativeType("struct meshopt_Stream const *") MeshoptStream.Buffer streams) {
        if (CHECKS) {
            check(indices, destination.remaining());
            Struct.validate(streams.address(), streams.remaining(), MeshoptStream.SIZEOF, MeshoptStream::validate);
        }
        nmeshopt_generateShadowIndexBufferMulti(memAddress(destination), memAddress(indices), destination.remaining(), vertex_count, streams.address(), streams.remaining());
    }

    // --- [ meshopt_generateAdjacencyIndexBuffer ] ---

    /** Unsafe version of: {@link #meshopt_generateAdjacencyIndexBuffer generateAdjacencyIndexBuffer} */
    public static native void nmeshopt_generateAdjacencyIndexBuffer(long destination, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride);

    /**
     * Generate index buffer that can be used as a geometry shader input with triangle adjacency topology.
     * 
     * <p>Each triangle is converted into a 6-vertex patch with the following layout:</p>
     * 
     * <ul>
     * <li>0, 2, 4: original triangle vertices</li>
     * <li>1, 3, 5: vertices adjacent to edges 02, 24 and 40</li>
     * </ul>
     * 
     * <p>The resulting patch can be rendered with geometry shaders using e.g. {@code VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY}. This can be used to
     * implement algorithms like silhouette detection/expansion and other forms of GS-driven rendering.</p>
     *
     * @param destination      must contain enough space for the resulting index buffer ({@code index_count*2} elements)
     * @param vertex_positions should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}
     */
    public static void meshopt_generateAdjacencyIndexBuffer(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride) {
        if (CHECKS) {
            check(destination, indices.remaining() << 1);
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_generateAdjacencyIndexBuffer(memAddress(destination), memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride);
    }

    // --- [ meshopt_generateTessellationIndexBuffer ] ---

    /** Unsafe version of: {@link #meshopt_generateTessellationIndexBuffer generateTessellationIndexBuffer} */
    public static native void nmeshopt_generateTessellationIndexBuffer(long destination, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride);

    /**
     * Generate index buffer that can be used for PN-AEN tessellation with crack-free displacement.
     * 
     * <p>Each triangle is converted into a 12-vertex patch with the following layout:</p>
     * 
     * <ul>
     * <li>0, 1, 2: original triangle vertices</li>
     * <li>3, 4: opposing edge for edge 0, 1</li>
     * <li>5, 6: opposing edge for edge 1, 2</li>
     * <li>7, 8: opposing edge for edge 2, 0</li>
     * <li>9, 10, 11: dominant vertices for corners 0, 1, 2</li>
     * </ul>
     * 
     * <p>The resulting patch can be rendered with hardware tessellation using PN-AEN and displacement mapping. See "Tessellation on Any Budget" (John McDonald,
     * GDC 2011) for implementation details.</p>
     *
     * @param destination      must contain enough space for the resulting index buffer ({@code index_count*4} elements)
     * @param vertex_positions should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}
     */
    public static void meshopt_generateTessellationIndexBuffer(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride) {
        if (CHECKS) {
            check(destination, indices.remaining() << 2);
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_generateTessellationIndexBuffer(memAddress(destination), memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride);
    }

    // --- [ meshopt_optimizeVertexCache ] ---

    /** Unsafe version of: {@link #meshopt_optimizeVertexCache optimizeVertexCache} */
    public static native void nmeshopt_optimizeVertexCache(long destination, long indices, long index_count, long vertex_count);

    /**
     * Vertex transform cache optimizer.
     * 
     * <p>Reorders {@code indices} to reduce the number of GPU vertex shader invocations. If index buffer contains multiple ranges for multiple draw calls, this
     * function needs to be called on each range individually.</p>
     *
     * @param destination must contain enough space for the resulting index buffer ({@code index_count} elements)
     */
    public static void meshopt_optimizeVertexCache(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count) {
        if (CHECKS) {
            check(indices, destination.remaining());
        }
        nmeshopt_optimizeVertexCache(memAddress(destination), memAddress(indices), destination.remaining(), vertex_count);
    }

    // --- [ meshopt_optimizeVertexCacheStrip ] ---

    /** Unsafe version of: {@link #meshopt_optimizeVertexCacheStrip optimizeVertexCacheStrip} */
    public static native void nmeshopt_optimizeVertexCacheStrip(long destination, long indices, long index_count, long vertex_count);

    /**
     * Vertex transform cache optimizer for strip-like caches.
     * 
     * <p>Produces inferior results to {@link #meshopt_optimizeVertexCache optimizeVertexCache} from the GPU vertex cache perspective. However, the resulting index order is more optimal if the
     * goal is to reduce the triangle strip length or improve compression efficiency.</p>
     */
    public static void meshopt_optimizeVertexCacheStrip(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count) {
        if (CHECKS) {
            check(indices, destination.remaining());
        }
        nmeshopt_optimizeVertexCacheStrip(memAddress(destination), memAddress(indices), destination.remaining(), vertex_count);
    }

    // --- [ meshopt_optimizeVertexCacheFifo ] ---

    /** Unsafe version of: {@link #meshopt_optimizeVertexCacheFifo optimizeVertexCacheFifo} */
    public static native void nmeshopt_optimizeVertexCacheFifo(long destination, long indices, long index_count, long vertex_count, int cache_size);

    /**
     * Vertex transform cache optimizer for FIFO caches.
     * 
     * <p>Reorders indices to reduce the number of GPU vertex shader invocations. Generally takes ~3x less time to optimize meshes but produces inferior results
     * compared to {@link #meshopt_optimizeVertexCache optimizeVertexCache}. If index buffer contains multiple ranges for multiple draw calls, this function needs to be called on each range
     * individually.</p>
     *
     * @param destination must contain enough space for the resulting index buffer ({@code index_count} elements)
     * @param cache_size  should be less than the actual GPU cache size to avoid cache thrashing
     */
    public static void meshopt_optimizeVertexCacheFifo(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count, @NativeType("unsigned int") int cache_size) {
        if (CHECKS) {
            check(indices, destination.remaining());
        }
        nmeshopt_optimizeVertexCacheFifo(memAddress(destination), memAddress(indices), destination.remaining(), vertex_count, cache_size);
    }

    // --- [ meshopt_optimizeOverdraw ] ---

    /** Unsafe version of: {@link #meshopt_optimizeOverdraw optimizeOverdraw} */
    public static native void nmeshopt_optimizeOverdraw(long destination, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, float threshold);

    /**
     * Overdraw optimizer.
     * 
     * <p>Reorders indices to reduce the number of GPU vertex shader invocations and the pixel overdraw. If index buffer contains multiple ranges for multiple
     * draw calls, this function needs to be called on each range individually.</p>
     *
     * @param destination      must contain enough space for the resulting index buffer ({@code index_count} elements)
     * @param indices          must contain index data that is the result of {@link #meshopt_optimizeVertexCache optimizeVertexCache} (<b>not</b> the original mesh indices!)
     * @param vertex_positions should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}
     * @param threshold        indicates how much the overdraw optimizer can degrade vertex cache efficiency (1.05 = up to 5%) to reduce overdraw more efficiently
     */
    public static void meshopt_optimizeOverdraw(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, float threshold) {
        if (CHECKS) {
            check(indices, destination.remaining());
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_optimizeOverdraw(memAddress(destination), memAddress(indices), destination.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, threshold);
    }

    // --- [ meshopt_optimizeVertexFetch ] ---

    /** Unsafe version of: {@link #meshopt_optimizeVertexFetch optimizeVertexFetch} */
    public static native long nmeshopt_optimizeVertexFetch(long destination, long indices, long index_count, long vertices, long vertex_count, long vertex_size);

    /**
     * Vertex fetch cache optimizer.
     * 
     * <p>Reorders vertices and changes indices to reduce the amount of GPU memory fetches during vertex processing. Returns the number of unique vertices, which
     * is the same as input vertex count unless some vertices are unused. This function works for a single vertex stream; for multiple vertex streams, use
     * {@link #meshopt_optimizeVertexFetchRemap optimizeVertexFetchRemap} + {@link #meshopt_remapVertexBuffer remapVertexBuffer} for each stream.</p>
     *
     * @param destination must contain enough space for the resulting vertex buffer ({@code vertex_count} elements)
     * @param indices     is used both as an input and as an output index buffer
     */
    @NativeType("size_t")
    public static long meshopt_optimizeVertexFetch(@NativeType("void *") ByteBuffer destination, @NativeType("unsigned int *") IntBuffer indices, @NativeType("void const *") ByteBuffer vertices, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size) {
        if (CHECKS) {
            check(destination, vertex_count * vertex_size);
            check(vertices, vertex_count * vertex_size);
        }
        return nmeshopt_optimizeVertexFetch(memAddress(destination), memAddress(indices), indices.remaining(), memAddress(vertices), vertex_count, vertex_size);
    }

    // --- [ meshopt_optimizeVertexFetchRemap ] ---

    /** Unsafe version of: {@link #meshopt_optimizeVertexFetchRemap optimizeVertexFetchRemap} */
    public static native long nmeshopt_optimizeVertexFetchRemap(long destination, long indices, long index_count, long vertex_count);

    /**
     * Vertex fetch cache optimizer.
     * 
     * <p>Generates vertex remap to reduce the amount of GPU memory fetches during vertex processing. Returns the number of unique vertices, which is the same as
     * input vertex count unless some vertices are unused. The resulting remap table should be used to reorder vertex/index buffers using
     * {@link #meshopt_remapVertexBuffer remapVertexBuffer}/{@link #meshopt_remapIndexBuffer remapIndexBuffer}.</p>
     *
     * @param destination must contain enough space for the resulting remap table ({@code vertex_count} elements)
     */
    @NativeType("size_t")
    public static long meshopt_optimizeVertexFetchRemap(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices) {
        return nmeshopt_optimizeVertexFetchRemap(memAddress(destination), memAddress(indices), indices.remaining(), destination.remaining());
    }

    // --- [ meshopt_encodeIndexBuffer ] ---

    /** Unsafe version of: {@link #meshopt_encodeIndexBuffer encodeIndexBuffer} */
    public static native long nmeshopt_encodeIndexBuffer(long buffer, long buffer_size, long indices, long index_count);

    /**
     * Index buffer encoder.
     * 
     * <p>Encodes index data into an array of bytes that is generally much smaller (&lt;1.5 bytes/triangle) and compresses better (&lt;1 bytes/triangle) compared
     * to original. Input index buffer must represent a triangle list. Returns encoded data size on success, 0 on error; the only error condition is if buffer
     * doesn't have enough space. For maximum efficiency the index buffer being encoded has to be optimized for vertex cache and vertex fetch first.</p>
     *
     * @param buffer must contain enough space for the encoded index buffer (use {@link #meshopt_encodeIndexBufferBound encodeIndexBufferBound} to compute worst case size)
     */
    @NativeType("size_t")
    public static long meshopt_encodeIndexBuffer(@NativeType("unsigned char *") ByteBuffer buffer, @NativeType("unsigned int const *") IntBuffer indices) {
        return nmeshopt_encodeIndexBuffer(memAddress(buffer), buffer.remaining(), memAddress(indices), indices.remaining());
    }

    // --- [ meshopt_encodeIndexBufferBound ] ---

    @NativeType("size_t")
    public static native long meshopt_encodeIndexBufferBound(@NativeType("size_t") long index_count, @NativeType("size_t") long vertex_count);

    // --- [ meshopt_encodeIndexVersion ] ---

    /**
     * Set index encoder format version.
     *
     * @param version must specify the data format version to encode; valid values are 0 (decodable by all library versions) and 1 (decodable by 0.14+)
     */
    public static native void meshopt_encodeIndexVersion(int version);

    // --- [ meshopt_decodeIndexBuffer ] ---

    /** Unsafe version of: {@link #meshopt_decodeIndexBuffer decodeIndexBuffer} */
    public static native int nmeshopt_decodeIndexBuffer(long destination, long index_count, long index_size, long buffer, long buffer_size);

    /**
     * Index buffer decoder.
     * 
     * <p>Decodes index data from an array of bytes generated by {@link #meshopt_encodeIndexBuffer encodeIndexBuffer}. Returns 0 if decoding was successful, and an error code otherwise. The
     * decoder is safe to use for untrusted input, but it may produce garbage data (e.g. out of range indices).</p>
     *
     * @param destination must contain enough space for the resulting index buffer ({@code index_count} elements)
     */
    public static int meshopt_decodeIndexBuffer(@NativeType("void *") ByteBuffer destination, @NativeType("size_t") long index_count, @NativeType("size_t") long index_size, @NativeType("unsigned char const *") ByteBuffer buffer) {
        if (CHECKS) {
            check(destination, index_count * index_size);
        }
        return nmeshopt_decodeIndexBuffer(memAddress(destination), index_count, index_size, memAddress(buffer), buffer.remaining());
    }

    // --- [ meshopt_encodeIndexSequence ] ---

    /** Unsafe version of: {@link #meshopt_encodeIndexSequence encodeIndexSequence} */
    public static native long nmeshopt_encodeIndexSequence(long buffer, long buffer_size, long indices, long index_count);

    /**
     * Index sequence encoder.
     * 
     * <p>Encodes index sequence into an array of bytes that is generally smaller and compresses better compared to original. Input index sequence can represent
     * arbitrary topology; for triangle lists {@link #meshopt_encodeIndexBuffer encodeIndexBuffer} is likely to be better. Returns encoded data size on success, 0 on error; the only error
     * condition is if buffer doesn't have enough space.</p>
     *
     * @param buffer must contain enough space for the encoded index sequence (use {@link #meshopt_encodeIndexSequenceBound encodeIndexSequenceBound} to compute worst case size)
     */
    @NativeType("size_t")
    public static long meshopt_encodeIndexSequence(@NativeType("unsigned char *") ByteBuffer buffer, @NativeType("unsigned int const *") IntBuffer indices) {
        return nmeshopt_encodeIndexSequence(memAddress(buffer), buffer.remaining(), memAddress(indices), indices.remaining());
    }

    // --- [ meshopt_encodeIndexSequenceBound ] ---

    @NativeType("size_t")
    public static native long meshopt_encodeIndexSequenceBound(@NativeType("size_t") long index_count, @NativeType("size_t") long vertex_count);

    // --- [ meshopt_decodeIndexSequence ] ---

    /** Unsafe version of: {@link #meshopt_decodeIndexSequence decodeIndexSequence} */
    public static native int nmeshopt_decodeIndexSequence(long destination, long index_count, long index_size, long buffer, long buffer_size);

    /**
     * Index sequence decoder.
     * 
     * <p>Decodes index data from an array of bytes generated by {@link #meshopt_encodeIndexSequence encodeIndexSequence}. Returns 0 if decoding was successful, and an error code otherwise. The
     * decoder is safe to use for untrusted input, but it may produce garbage data (e.g. out of range indices).</p>
     *
     * @param destination must contain enough space for the resulting index sequence ({@code index_count} elements)
     */
    public static int meshopt_decodeIndexSequence(@NativeType("void *") ByteBuffer destination, @NativeType("size_t") long index_count, @NativeType("size_t") long index_size, @NativeType("unsigned char const *") ByteBuffer buffer) {
        if (CHECKS) {
            check(destination, index_count * index_size);
        }
        return nmeshopt_decodeIndexSequence(memAddress(destination), index_count, index_size, memAddress(buffer), buffer.remaining());
    }

    // --- [ meshopt_encodeVertexBuffer ] ---

    /** Unsafe version of: {@link #meshopt_encodeVertexBuffer encodeVertexBuffer} */
    public static native long nmeshopt_encodeVertexBuffer(long buffer, long buffer_size, long vertices, long vertex_count, long vertex_size);

    /**
     * Vertex buffer encoder.
     * 
     * <p>Encodes vertex data into an array of bytes that is generally smaller and compresses better compared to original. Returns encoded data size on success,
     * 0 on error; the only error condition is if buffer doesn't have enough space. This function works for a single vertex stream; for multiple vertex
     * streams, call {@code meshopt_encodeVertexBuffer} for each stream. Note that all {@code vertex_size} bytes of each vertex are encoded verbatim,
     * including padding which should be zero-initialized.</p>
     *
     * @param buffer must contain enough space for the encoded vertex buffer (use {@link #meshopt_encodeVertexBufferBound encodeVertexBufferBound} to compute worst case size)
     */
    @NativeType("size_t")
    public static long meshopt_encodeVertexBuffer(@NativeType("unsigned char *") ByteBuffer buffer, @NativeType("void const *") ByteBuffer vertices, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size) {
        if (CHECKS) {
            check(vertices, vertex_count * vertex_size);
        }
        return nmeshopt_encodeVertexBuffer(memAddress(buffer), buffer.remaining(), memAddress(vertices), vertex_count, vertex_size);
    }

    // --- [ meshopt_encodeVertexBufferBound ] ---

    @NativeType("size_t")
    public static native long meshopt_encodeVertexBufferBound(@NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size);

    // --- [ meshopt_encodeVertexVersion ] ---

    /**
     * Set vertex encoder format version.
     *
     * @param version must specify the data format version to encode; valid values are 0 (decodable by all library versions)
     */
    public static native void meshopt_encodeVertexVersion(int version);

    // --- [ meshopt_decodeVertexBuffer ] ---

    /** Unsafe version of: {@link #meshopt_decodeVertexBuffer decodeVertexBuffer} */
    public static native int nmeshopt_decodeVertexBuffer(long destination, long vertex_count, long vertex_size, long buffer, long buffer_size);

    /**
     * Vertex buffer decoder.
     * 
     * <p>Decodes vertex data from an array of bytes generated by {@link #meshopt_encodeVertexBuffer encodeVertexBuffer}. Returns 0 if decoding was successful, and an error code otherwise. The
     * decoder is safe to use for untrusted input, but it may produce garbage data.</p>
     *
     * @param destination must contain enough space for the resulting vertex buffer ({@code vertex_count * vertex_size} bytes)
     */
    public static int meshopt_decodeVertexBuffer(@NativeType("void *") ByteBuffer destination, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size, @NativeType("unsigned char const *") ByteBuffer buffer) {
        if (CHECKS) {
            check(destination, vertex_count * vertex_size);
        }
        return nmeshopt_decodeVertexBuffer(memAddress(destination), vertex_count, vertex_size, memAddress(buffer), buffer.remaining());
    }

    // --- [ meshopt_decodeFilterOct ] ---

    /** Unsafe version of: {@link #meshopt_decodeFilterOct decodeFilterOct} */
    public static native void nmeshopt_decodeFilterOct(long buffer, long count, long stride);

    /**
     * Experimental: Decodes octahedral encoding of a unit vector with K-bit (K &le; 16) signed X/Y as an input; Z must store 1.0f.
     * 
     * <p>Each component is stored as an 8-bit or 16-bit normalized integer; stride must be equal to 4 or 8. W is preserved as is.</p>
     */
    public static void meshopt_decodeFilterOct(@NativeType("void *") ByteBuffer buffer, @NativeType("size_t") long count, @NativeType("size_t") long stride) {
        if (CHECKS) {
            check(buffer, count * stride);
        }
        nmeshopt_decodeFilterOct(memAddress(buffer), count, stride);
    }

    /**
     * Experimental: Decodes octahedral encoding of a unit vector with K-bit (K &le; 16) signed X/Y as an input; Z must store 1.0f.
     * 
     * <p>Each component is stored as an 8-bit or 16-bit normalized integer; stride must be equal to 4 or 8. W is preserved as is.</p>
     */
    public static void meshopt_decodeFilterOct(@NativeType("void *") ShortBuffer buffer, @NativeType("size_t") long count, @NativeType("size_t") long stride) {
        if (CHECKS) {
            check(buffer, (count * stride) >> 1);
        }
        nmeshopt_decodeFilterOct(memAddress(buffer), count, stride);
    }

    // --- [ meshopt_decodeFilterQuat ] ---

    /** Unsafe version of: {@link #meshopt_decodeFilterQuat decodeFilterQuat} */
    public static native void nmeshopt_decodeFilterQuat(long buffer, long count, long stride);

    /**
     * Experimental: Decodes 3-component quaternion encoding with K-bit (4 &le; K &le; 16) component encoding and a 2-bit component index indicating which
     * component to reconstruct.
     * 
     * <p>Each component is stored as an 16-bit integer; stride must be equal to 8.</p>
     */
    public static void meshopt_decodeFilterQuat(@NativeType("void *") ByteBuffer buffer, @NativeType("size_t") long count, @NativeType("size_t") long stride) {
        if (CHECKS) {
            check(buffer, count * stride);
        }
        nmeshopt_decodeFilterQuat(memAddress(buffer), count, stride);
    }

    /**
     * Experimental: Decodes 3-component quaternion encoding with K-bit (4 &le; K &le; 16) component encoding and a 2-bit component index indicating which
     * component to reconstruct.
     * 
     * <p>Each component is stored as an 16-bit integer; stride must be equal to 8.</p>
     */
    public static void meshopt_decodeFilterQuat(@NativeType("void *") ShortBuffer buffer, @NativeType("size_t") long count, @NativeType("size_t") long stride) {
        if (CHECKS) {
            check(buffer, (count * stride) >> 1);
        }
        nmeshopt_decodeFilterQuat(memAddress(buffer), count, stride);
    }

    // --- [ meshopt_decodeFilterExp ] ---

    /** Unsafe version of: {@link #meshopt_decodeFilterExp decodeFilterExp} */
    public static native void nmeshopt_decodeFilterExp(long buffer, long count, long stride);

    /**
     * Experimental: Decodes exponential encoding of floating-point data with 8-bit exponent and 24-bit integer mantissa as {@code 2^E*M}.
     * 
     * <p>Each 32-bit component is decoded in isolation; stride must be divisible by 4.</p>
     */
    public static void meshopt_decodeFilterExp(@NativeType("void *") ByteBuffer buffer, @NativeType("size_t") long count, @NativeType("size_t") long stride) {
        if (CHECKS) {
            check(buffer, count * stride);
        }
        nmeshopt_decodeFilterExp(memAddress(buffer), count, stride);
    }

    /**
     * Experimental: Decodes exponential encoding of floating-point data with 8-bit exponent and 24-bit integer mantissa as {@code 2^E*M}.
     * 
     * <p>Each 32-bit component is decoded in isolation; stride must be divisible by 4.</p>
     */
    public static void meshopt_decodeFilterExp(@NativeType("void *") IntBuffer buffer, @NativeType("size_t") long count, @NativeType("size_t") long stride) {
        if (CHECKS) {
            check(buffer, (count * stride) >> 2);
        }
        nmeshopt_decodeFilterExp(memAddress(buffer), count, stride);
    }

    // --- [ meshopt_encodeFilterOct ] ---

    /** Unsafe version of: {@link #meshopt_encodeFilterOct encodeFilterOct} */
    public static native void nmeshopt_encodeFilterOct(long destination, long count, long stride, int bits, long data);

    /**
     * Experimental: Encodes unit vectors with K-bit (K &le; 16) signed X/Y as an output.
     * 
     * <p>Each component is stored as an 8-bit or 16-bit normalized integer; {@code stride} must be equal to 4 or 8. {@code W} is preserved as is. Input data
     * must contain 4 floats for every vector ({@code count*4} total).</p>
     */
    public static void meshopt_encodeFilterOct(@NativeType("void *") ByteBuffer destination, @NativeType("size_t") long count, @NativeType("size_t") long stride, int bits, @NativeType("float const *") FloatBuffer data) {
        if (CHECKS) {
            check(destination, count * 4 * (stride >> 2));
            check(data, count * 4);
        }
        nmeshopt_encodeFilterOct(memAddress(destination), count, stride, bits, memAddress(data));
    }

    /**
     * Experimental: Encodes unit vectors with K-bit (K &le; 16) signed X/Y as an output.
     * 
     * <p>Each component is stored as an 8-bit or 16-bit normalized integer; {@code stride} must be equal to 4 or 8. {@code W} is preserved as is. Input data
     * must contain 4 floats for every vector ({@code count*4} total).</p>
     */
    public static void meshopt_encodeFilterOct(@NativeType("void *") ShortBuffer destination, @NativeType("size_t") long count, @NativeType("size_t") long stride, int bits, @NativeType("float const *") FloatBuffer data) {
        if (CHECKS) {
            check(destination, (count * 4 * (stride >> 2)) >> 1);
            check(data, count * 4);
        }
        nmeshopt_encodeFilterOct(memAddress(destination), count, stride, bits, memAddress(data));
    }

    // --- [ meshopt_encodeFilterQuat ] ---

    /** Unsafe version of: {@link #meshopt_encodeFilterQuat encodeFilterQuat} */
    public static native void nmeshopt_encodeFilterQuat(long destination, long count, long stride, int bits, long data);

    /**
     * Experimental: Encodes unit quaternions with K-bit (4 &le; K &le; 16) component encoding.
     * 
     * <p>Each component is stored as an 16-bit integer; {@code stride} must be equal to 8. Input data must contain 4 floats for every quaternion
     * ({@code count*4} total).</p>
     */
    public static void meshopt_encodeFilterQuat(@NativeType("void *") ByteBuffer destination, @NativeType("size_t") long count, @NativeType("size_t") long stride, int bits, @NativeType("float const *") FloatBuffer data) {
        if (CHECKS) {
            check(destination, count * 4 * 2);
            check(data, count * 4);
        }
        nmeshopt_encodeFilterQuat(memAddress(destination), count, stride, bits, memAddress(data));
    }

    /**
     * Experimental: Encodes unit quaternions with K-bit (4 &le; K &le; 16) component encoding.
     * 
     * <p>Each component is stored as an 16-bit integer; {@code stride} must be equal to 8. Input data must contain 4 floats for every quaternion
     * ({@code count*4} total).</p>
     */
    public static void meshopt_encodeFilterQuat(@NativeType("void *") ShortBuffer destination, @NativeType("size_t") long count, @NativeType("size_t") long stride, int bits, @NativeType("float const *") FloatBuffer data) {
        if (CHECKS) {
            check(destination, (count * 4 * 2) >> 1);
            check(data, count * 4);
        }
        nmeshopt_encodeFilterQuat(memAddress(destination), count, stride, bits, memAddress(data));
    }

    // --- [ meshopt_encodeFilterExp ] ---

    /** Unsafe version of: {@link #meshopt_encodeFilterExp encodeFilterExp} */
    public static native void nmeshopt_encodeFilterExp(long destination, long count, long stride, int bits, long data);

    /**
     * Experimental: Encodes arbitrary (finite) floating-point data with 8-bit exponent and K-bit integer mantissa (1 &le; K &le; 24).
     * 
     * <p>Mantissa is shared between all components of a given vector as defined by {@code stride}; {@code stride} must be divisible by 4. Input data must
     * contain {@code stride/4} floats for every vector ({@code count*stride/4} total). When individual (scalar) encoding is desired, simply pass
     * {@code stride=4} and adjust {@code count} accordingly.</p>
     */
    public static void meshopt_encodeFilterExp(@NativeType("void *") ByteBuffer destination, @NativeType("size_t") long count, @NativeType("size_t") long stride, int bits, @NativeType("float const *") FloatBuffer data) {
        if (CHECKS) {
            check(destination, count * (stride >> 2) * 4);
            check(data, count * (stride >> 2));
        }
        nmeshopt_encodeFilterExp(memAddress(destination), count, stride, bits, memAddress(data));
    }

    /**
     * Experimental: Encodes arbitrary (finite) floating-point data with 8-bit exponent and K-bit integer mantissa (1 &le; K &le; 24).
     * 
     * <p>Mantissa is shared between all components of a given vector as defined by {@code stride}; {@code stride} must be divisible by 4. Input data must
     * contain {@code stride/4} floats for every vector ({@code count*stride/4} total). When individual (scalar) encoding is desired, simply pass
     * {@code stride=4} and adjust {@code count} accordingly.</p>
     */
    public static void meshopt_encodeFilterExp(@NativeType("void *") IntBuffer destination, @NativeType("size_t") long count, @NativeType("size_t") long stride, int bits, @NativeType("float const *") FloatBuffer data) {
        if (CHECKS) {
            check(destination, (count * (stride >> 2) * 4) >> 2);
            check(data, count * (stride >> 2));
        }
        nmeshopt_encodeFilterExp(memAddress(destination), count, stride, bits, memAddress(data));
    }

    // --- [ meshopt_simplify ] ---

    /** Unsafe version of: {@link #meshopt_simplify simplify} */
    public static native long nmeshopt_simplify(long destination, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long target_index_count, float target_error, long result_error);

    /**
     * Experimental: Mesh simplifier. Reduces the number of triangles in the mesh, attempting to preserve mesh appearance as much as possible.
     * 
     * <p>The algorithm tries to preserve mesh topology and can stop short of the target goal based on topology constraints or target error. If not all
     * attributes from the input mesh are required, it's recommended to reindex the mesh using {@link #meshopt_generateShadowIndexBuffer generateShadowIndexBuffer} prior to simplification. Returns
     * the number of indices after simplification, with destination containing new index data. The resulting index buffer references vertices from the
     * original vertex buffer. If the original vertex data isn't required, creating a compact vertex buffer using {@link #meshopt_optimizeVertexFetch optimizeVertexFetch} is recommended.</p>
     *
     * @param destination      must contain enough space for the target index buffer, worst case is {@code index_count} elements (<b>not</b> {@code target_index_count})!
     * @param vertex_positions should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}
     * @param target_error     represents the error relative to mesh extents that can be tolerated, e.g. {@code 0.01 = 1% deformation}
     * @param result_error     can be {@code NULL}; when it's not {@code NULL}, it will contain the resulting (relative) error after simplification
     */
    @NativeType("size_t")
    public static long meshopt_simplify(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("size_t") long target_index_count, float target_error, @Nullable @NativeType("float *") FloatBuffer result_error) {
        if (CHECKS) {
            check(indices, destination.remaining());
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
            checkSafe(result_error, 1);
        }
        return nmeshopt_simplify(memAddress(destination), memAddress(indices), destination.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, target_index_count, target_error, memAddressSafe(result_error));
    }

    // --- [ meshopt_simplifySloppy ] ---

    /** Unsafe version of: {@link #meshopt_simplifySloppy simplifySloppy} */
    public static native long nmeshopt_simplifySloppy(long destination, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long target_index_count, float target_error, long result_error);

    /**
     * Experimental: Mesh simplifier (sloppy). Reduces the number of triangles in the mesh, sacrificing mesh appearance for simplification performance.
     * 
     * <p>The algorithm doesn't preserve mesh topology but can stop short of the target goal based on target error. Returns the number of indices after
     * simplification, with destination containing new index data. The resulting index buffer references vertices from the original vertex buffer. If the
     * original vertex data isn't required, creating a compact vertex buffer using {@link #meshopt_optimizeVertexFetch optimizeVertexFetch} is recommended.</p>
     *
     * @param destination      must contain enough space for the target index buffer, worst case is {@code index_count} elements (<b>not</b> {@code target_index_count})!
     * @param vertex_positions should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}
     * @param target_error     represents the error relative to mesh extents that can be tolerated, e.g. {@code 0.01 = 1% deformation}
     * @param result_error     can be {@code NULL}; when it's not {@code NULL}, it will contain the resulting (relative) error after simplification
     */
    @NativeType("size_t")
    public static long meshopt_simplifySloppy(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("size_t") long target_index_count, float target_error, @Nullable @NativeType("float *") FloatBuffer result_error) {
        if (CHECKS) {
            check(indices, destination.remaining());
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
            checkSafe(result_error, 1);
        }
        return nmeshopt_simplifySloppy(memAddress(destination), memAddress(indices), destination.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, target_index_count, target_error, memAddressSafe(result_error));
    }

    // --- [ meshopt_simplifyPoints ] ---

    /** Unsafe version of: {@link #meshopt_simplifyPoints simplifyPoints} */
    public static native long nmeshopt_simplifyPoints(long destination, long vertex_positions, long vertex_count, long vertex_positions_stride, long target_vertex_count);

    /**
     * Experimental: Point cloud simplifier. Reduces the number of points in the cloud to reach the given target.
     * 
     * <p>Returns the number of points after simplification, with {@code destination} containing new index data. The resulting index buffer references vertices
     * from the original vertex buffer. If the original vertex data isn't required, creating a compact vertex buffer using {@link #meshopt_optimizeVertexFetch optimizeVertexFetch} is
     * recommended.</p>
     *
     * @param destination      must contain enough space for the target index buffer ({@code target_vertex_count} elements)
     * @param vertex_positions should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}
     */
    @NativeType("size_t")
    public static long meshopt_simplifyPoints(@NativeType("unsigned int *") IntBuffer destination, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("size_t") long target_vertex_count) {
        if (CHECKS) {
            check(destination, target_vertex_count);
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        return nmeshopt_simplifyPoints(memAddress(destination), memAddress(vertex_positions), vertex_count, vertex_positions_stride, target_vertex_count);
    }

    // --- [ meshopt_simplifyScale ] ---

    /** Unsafe version of: {@link #meshopt_simplifyScale simplifyScale} */
    public static native float nmeshopt_simplifyScale(long vertex_positions, long vertex_count, long vertex_positions_stride);

    /**
     * Experimental: Returns the error scaling factor used by the simplifier to convert between absolute and relative extents.
     * 
     * <p>Absolute error must be <b>divided</b> by the scaling factor before passing it to {@link #meshopt_simplify simplify} as {@code target_error}. Relative error returned by
     * {@code meshopt_simplify} via {@code result_error} must be <b>multiplied</b> by the scaling factor to get absolute error.</p>
     */
    public static float meshopt_simplifyScale(@NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride) {
        if (CHECKS) {
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        return nmeshopt_simplifyScale(memAddress(vertex_positions), vertex_count, vertex_positions_stride);
    }

    // --- [ meshopt_stripify ] ---

    /** Unsafe version of: {@link #meshopt_stripify stripify} */
    public static native long nmeshopt_stripify(long destination, long indices, long index_count, long vertex_count, int restart_index);

    /**
     * Mesh stripifier. Converts a previously vertex cache optimized triangle list to triangle strip, stitching strips using restart index or degenerate
     * triangles.
     * 
     * <p>Returns the number of indices in the resulting strip, with destination containing new index data. For maximum efficiency the index buffer being
     * converted has to be optimized for vertex cache first. Using restart indices can result in ~10% smaller index buffers, but on some GPUs restart indices
     * may result in decreased performance.</p>
     *
     * @param destination   must contain enough space for the target index buffer, worst case can be computed with {@link #meshopt_stripifyBound stripifyBound}
     * @param restart_index should be {@code 0xffff} or {@code 0xffffffff} depending on index size, or 0 to use degenerate triangles
     */
    @NativeType("size_t")
    public static long meshopt_stripify(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count, @NativeType("unsigned int") int restart_index) {
        return nmeshopt_stripify(memAddress(destination), memAddress(indices), indices.remaining(), vertex_count, restart_index);
    }

    // --- [ meshopt_stripifyBound ] ---

    @NativeType("size_t")
    public static native long meshopt_stripifyBound(@NativeType("size_t") long index_count);

    // --- [ meshopt_unstripify ] ---

    /** Unsafe version of: {@link #meshopt_unstripify unstripify} */
    public static native long nmeshopt_unstripify(long destination, long indices, long index_count, int restart_index);

    /**
     * Mesh unstripifier. Converts a triangle strip to a triangle list.
     * 
     * <p>Returns the number of indices in the resulting list, with destination containing new index data.</p>
     *
     * @param destination must contain enough space for the target index buffer, worst case can be computed with {@link #meshopt_unstripifyBound unstripifyBound}
     */
    @NativeType("size_t")
    public static long meshopt_unstripify(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("unsigned int") int restart_index) {
        return nmeshopt_unstripify(memAddress(destination), memAddress(indices), indices.remaining(), restart_index);
    }

    // --- [ meshopt_unstripifyBound ] ---

    @NativeType("size_t")
    public static native long meshopt_unstripifyBound(@NativeType("size_t") long index_count);

    // --- [ meshopt_analyzeVertexCache ] ---

    /** Unsafe version of: {@link #meshopt_analyzeVertexCache analyzeVertexCache} */
    public static native void nmeshopt_analyzeVertexCache(long indices, long index_count, long vertex_count, int cache_size, int warp_size, int primgroup_size, long __result);

    /**
     * Vertex transform cache analyzer.
     * 
     * <p>Returns cache hit statistics using a simplified FIFO model. Results may not match actual GPU performance.</p>
     */
    @NativeType("struct meshopt_VertexCacheStatistics")
    public static MeshoptVertexCacheStatistics meshopt_analyzeVertexCache(@NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count, @NativeType("unsigned int") int cache_size, @NativeType("unsigned int") int warp_size, @NativeType("unsigned int") int primgroup_size, @NativeType("struct meshopt_VertexCacheStatistics") MeshoptVertexCacheStatistics __result) {
        nmeshopt_analyzeVertexCache(memAddress(indices), indices.remaining(), vertex_count, cache_size, warp_size, primgroup_size, __result.address());
        return __result;
    }

    // --- [ meshopt_analyzeOverdraw ] ---

    /** Unsafe version of: {@link #meshopt_analyzeOverdraw analyzeOverdraw} */
    public static native void nmeshopt_analyzeOverdraw(long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long __result);

    /**
     * Overdraw analyzer. Returns overdraw statistics using a software rasterizer.
     * 
     * <p>Results may not match actual GPU performance.</p>
     *
     * @param vertex_positions should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}
     */
    @NativeType("struct meshopt_OverdrawStatistics")
    public static MeshoptOverdrawStatistics meshopt_analyzeOverdraw(@NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("struct meshopt_OverdrawStatistics") MeshoptOverdrawStatistics __result) {
        if (CHECKS) {
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_analyzeOverdraw(memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, __result.address());
        return __result;
    }

    // --- [ meshopt_analyzeVertexFetch ] ---

    /** Unsafe version of: {@link #meshopt_analyzeVertexFetch analyzeVertexFetch} */
    public static native void nmeshopt_analyzeVertexFetch(long indices, long index_count, long vertex_count, long vertex_size, long __result);

    /**
     * Vertex fetch cache analyzer. Returns cache hit statistics using a simplified direct mapped model.
     * 
     * <p>Results may not match actual GPU performance.</p>
     */
    @NativeType("struct meshopt_VertexFetchStatistics")
    public static MeshoptVertexFetchStatistics meshopt_analyzeVertexFetch(@NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size, @NativeType("struct meshopt_VertexFetchStatistics") MeshoptVertexFetchStatistics __result) {
        nmeshopt_analyzeVertexFetch(memAddress(indices), indices.remaining(), vertex_count, vertex_size, __result.address());
        return __result;
    }

    // --- [ meshopt_buildMeshlets ] ---

    /** Unsafe version of: {@link #meshopt_buildMeshlets buildMeshlets} */
    public static native long nmeshopt_buildMeshlets(long meshlets, long meshlet_vertices, long meshlet_triangles, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long max_vertices, long max_triangles, float cone_weight);

    /**
     * Meshlet builder. Splits the mesh into a set of meshlets where each meshlet has a micro index buffer indexing into meshlet vertices that refer to the
     * original vertex buffer.
     * 
     * <p>The resulting data can be used to render meshes using NVidia programmable mesh shading pipeline, or in other cluster-based renderers. When using
     * {@code buildMeshlets}, vertex positions need to be provided to minimize the size of the resulting clusters. When using {@link #meshopt_buildMeshletsScan buildMeshletsScan}, for
     * maximum efficiency the index buffer being converted has to be optimized for vertex cache first.</p>
     *
     * @param meshlets          must contain enough space for all meshlets, worst case size can be computed with {@link #meshopt_buildMeshletsBound buildMeshletsBound}
     * @param meshlet_vertices  must contain enough space for all meshlets, worst case size is equal to {@code max_meshlets * max_vertices}
     * @param meshlet_triangles must contain enough space for all meshlets, worst case size is equal to {@code max_meshlets * max_triangles * 3}
     * @param vertex_positions  should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}
     * @param max_vertices      must not exceed implementation limits ({@code max_vertices} &le; 255 - not 256!)
     * @param max_triangles     must not exceed implementation limits ({@code max_triangles} &le; 512)
     * @param cone_weight       should be set to 0 when cone culling is not used, and a value between 0 and 1 otherwise to balance between cluster size and cone culling efficiency
     */
    @NativeType("size_t")
    public static long meshopt_buildMeshlets(@NativeType("struct meshopt_Meshlet *") MeshoptMeshlet.Buffer meshlets, @NativeType("unsigned int *") IntBuffer meshlet_vertices, @NativeType("unsigned char *") ByteBuffer meshlet_triangles, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("size_t") long max_vertices, @NativeType("size_t") long max_triangles, float cone_weight) {
        if (CHECKS) {
            check(meshlet_vertices, meshlets.remaining() * max_vertices);
            check(meshlet_triangles, meshlets.remaining() * max_triangles * 3);
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        return nmeshopt_buildMeshlets(meshlets.address(), memAddress(meshlet_vertices), memAddress(meshlet_triangles), memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, max_vertices, max_triangles, cone_weight);
    }

    // --- [ meshopt_buildMeshletsScan ] ---

    /** Unsafe version of: {@link #meshopt_buildMeshletsScan buildMeshletsScan} */
    public static native long nmeshopt_buildMeshletsScan(long meshlets, long meshlet_vertices, long meshlet_triangles, long indices, long index_count, long vertex_count, long max_vertices, long max_triangles);

    /** See {@link #meshopt_buildMeshlets buildMeshlets}. */
    @NativeType("size_t")
    public static long meshopt_buildMeshletsScan(@NativeType("struct meshopt_Meshlet *") MeshoptMeshlet.Buffer meshlets, @NativeType("unsigned int *") IntBuffer meshlet_vertices, @NativeType("unsigned char *") ByteBuffer meshlet_triangles, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count, @NativeType("size_t") long max_vertices, @NativeType("size_t") long max_triangles) {
        if (CHECKS) {
            check(meshlet_vertices, meshlets.remaining() * max_vertices);
            check(meshlet_triangles, meshlets.remaining() * max_triangles * 3);
        }
        return nmeshopt_buildMeshletsScan(meshlets.address(), memAddress(meshlet_vertices), memAddress(meshlet_triangles), memAddress(indices), indices.remaining(), vertex_count, max_vertices, max_triangles);
    }

    // --- [ meshopt_buildMeshletsBound ] ---

    /** See {@link #meshopt_buildMeshlets buildMeshlets}. */
    @NativeType("size_t")
    public static native long meshopt_buildMeshletsBound(@NativeType("size_t") long index_count, @NativeType("size_t") long max_vertices, @NativeType("size_t") long max_triangles);

    // --- [ meshopt_computeClusterBounds ] ---

    /**
     * Unsafe version of: {@link #meshopt_computeClusterBounds computeClusterBounds}
     *
     * @param index_count {@code index_count/3} should be less than or equal to 512 (the function assumes clusters of limited size)
     */
    public static native void nmeshopt_computeClusterBounds(long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long __result);

    /**
     * Cluster bounds generator. Creates bounding volumes that can be used for frustum, backface and occlusion culling.
     * 
     * <p>For backface culling with orthographic projection, use the following formula to reject backfacing clusters: {@code dot(view, cone_axis) >= cone_cutoff}</p>
     * 
     * <p>For perspective projection, you can the formula that needs cone apex in addition to axis &amp; cutoff:
     * {@code dot(normalize(cone_apex - camera_position), cone_axis) >= cone_cutoff}.</p>
     * 
     * <p>Alternatively, you can use the formula that doesn't need cone apex and uses bounding sphere instead:
     * {@code dot(normalize(center - camera_position), cone_axis) >= cone_cutoff + radius / length(center - camera_position)} or an equivalent formula that
     * doesn't have a singularity at center = camera_position:
     * {@code dot(center - camera_position, cone_axis) >= cone_cutoff * length(center - camera_position) + radius}</p>
     * 
     * <p>The formula that uses the apex is slightly more accurate but needs the apex; if you are already using bounding sphere to do frustum/occlusion culling,
     * the formula that doesn't use the apex may be preferable.</p>
     *
     * @param vertex_positions should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}
     */
    @NativeType("struct meshopt_Bounds")
    public static MeshoptBounds meshopt_computeClusterBounds(@NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("struct meshopt_Bounds") MeshoptBounds __result) {
        if (CHECKS) {
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_computeClusterBounds(memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, __result.address());
        return __result;
    }

    // --- [ meshopt_computeMeshletBounds ] ---

    /** Unsafe version of: {@link #meshopt_computeMeshletBounds computeMeshletBounds} */
    public static native void nmeshopt_computeMeshletBounds(long meshlet_vertices, long meshlet_triangles, long triangle_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long __result);

    /** See {@link #meshopt_computeClusterBounds computeClusterBounds}. */
    @NativeType("struct meshopt_Bounds")
    public static MeshoptBounds meshopt_computeMeshletBounds(@NativeType("unsigned int const *") IntBuffer meshlet_vertices, @NativeType("unsigned char const *") ByteBuffer meshlet_triangles, @NativeType("size_t") long triangle_count, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("struct meshopt_Bounds") MeshoptBounds __result) {
        if (CHECKS) {
            check(meshlet_triangles, triangle_count * 3);
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_computeMeshletBounds(memAddress(meshlet_vertices), memAddress(meshlet_triangles), triangle_count, memAddress(vertex_positions), vertex_count, vertex_positions_stride, __result.address());
        return __result;
    }

    // --- [ meshopt_spatialSortRemap ] ---

    /** Unsafe version of: {@link #meshopt_spatialSortRemap spatialSortRemap} */
    public static native void nmeshopt_spatialSortRemap(long destination, long vertex_positions, long vertex_count, long vertex_positions_stride);

    /**
     * Experimental: Spatial sorter. Generates a remap table that can be used to reorder points for spatial locality.
     * 
     * <p>Resulting remap table maps old vertices to new vertices and can be used in {@link #meshopt_remapVertexBuffer remapVertexBuffer}.</p>
     *
     * @param destination must contain enough space for the resulting remap table ({@code vertex_count} elements)
     */
    public static void meshopt_spatialSortRemap(@NativeType("unsigned int *") IntBuffer destination, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_positions_stride) {
        long vertex_count = destination.remaining();
        if (CHECKS) {
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_spatialSortRemap(memAddress(destination), memAddress(vertex_positions), vertex_count, vertex_positions_stride);
    }

    // --- [ meshopt_spatialSortTriangles ] ---

    /** Unsafe version of: {@link #meshopt_spatialSortTriangles spatialSortTriangles} */
    public static native void nmeshopt_spatialSortTriangles(long destination, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride);

    /**
     * Experimental: Spatial sorter. Reorders triangles for spatial locality, and generates a new index buffer.
     * 
     * <p>The resulting index buffer can be used with other functions like {@link #meshopt_optimizeVertexCache optimizeVertexCache}.</p>
     *
     * @param destination      must contain enough space for the resulting index buffer ({@code index_count} elements)
     * @param vertex_positions should have {@code float3} position in the first 12 bytes of each vertex - similar to {@code glVertexPointer}
     */
    public static void meshopt_spatialSortTriangles(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride) {
        if (CHECKS) {
            check(indices, destination.remaining());
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_spatialSortTriangles(memAddress(destination), memAddress(indices), destination.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride);
    }

    // --- [ meshopt_setAllocator ] ---

    /** Unsafe version of: {@link #meshopt_setAllocator setAllocator} */
    public static native void nmeshopt_setAllocator(long allocate, long deallocate);

    /**
     * Set allocation callbacks.
     * 
     * <p>These callbacks will be used instead of the default operator new/operator delete for all temporary allocations in the library. Note that all algorithms
     * only allocate memory for temporary use. {@code allocate}/{@code deallocate} are always called in a stack-like order - last pointer to be allocated is
     * deallocated first.</p>
     */
    public static void meshopt_setAllocator(@NativeType("void * (*) (size_t)") MeshoptAllocateI allocate, @NativeType("void (*) (void *)") MeshoptDeallocateI deallocate) {
        nmeshopt_setAllocator(allocate.address(), deallocate.address());
    }

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
    }

}