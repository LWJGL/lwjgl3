/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tootle;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Bindings to <a target="_blank" href="https://github.com/GPUOpen-Tools/amd-tootle">AMD Tootle</a>.
 * 
 * <p>AMD Tootle (Triangle Order Optimization Tool) is a 3D triangle mesh optimization library that improves on existing mesh preprocessing techniques. By
 * using AMD Tootle, developers can optimize their models for pixel overdraw as well as vertex cache performance. This can provide significant performance
 * improvements in pixel limited situations, with no penalty in vertex-limited scenarios, and no runtime cost.</p>
 * 
 * <h3>Features</h3>
 * 
 * <ul>
 * <li><b>Vertex cache optimization</b>: Triangles are re-ordered to optimize for the post-transform vertex cache in modern GPUs. This will yield
 * significant performance improvements in vertex-tranform limited scenes.</li>
 * <li><b>Overdraw optimization</b>: To reduce the pixel cost of rendering a mesh, the AMD Tootle library further re-orders the triangles in the mesh to
 * reduce pixel overdraw. Significant reductions in pixel overdraw (2x or higher) can be achieved. This can yield significant performance improvements
 * in pixel-limited scenes, and incurs no penalty in vertex-limited scenarios.</li>
 * <li><b>Vertex prefetch cache optimization</b>: Triangle indices are re-indexed in the order of their occurrence in the triangle list. The vertex buffer
 * is re-ordered to match these new indices. Thus, vertices are accessed close to each other in memory. This optimization exploits the input vertex
 * cache because vertices are typically fetched in a cacheline (that may contains more than one vertex data).</li>
 * </ul>
 * 
 * <p>The Direct3D optimizers are currently not supported.</p>
 */
public class Tootle {

    /** The default vertex cache size. */
    public static final int TOOTLE_DEFAULT_VCACHE_SIZE = 16;

    /** The maximum allowed number of faces in the mesh. */
    public static final int TOOTLE_MAX_FACES = 0x7FFFFFFF;

    /** The maximum allowed number of vertices in the mesh. */
    public static final int TOOTLE_MAX_VERTICES = 0x7FFFFFFF;

    /**
     * The parameter for {@link #TootleFastOptimize FastOptimize} to create more clusters (lower number generates more clusters).
     * 
     * <p>This parameter decides where to put extra breaks to create more clusters (refer to the SIGGRAPH 2007 paper for the full description of the parameter).</p>
     */
    public static final float TOOTLE_DEFAULT_ALPHA = 0.75f;

    /**
     * Enumeration for Tootle return codes. ({@code TootleResult})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TOOTLE_OK OK} - All is well</li>
     * <li>{@link #TOOTLE_INVALID_ARGS INVALID_ARGS} - Illegal arguments were passed.</li>
     * <li>{@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY} - Tootle ran out of memory while trying to complete the call.</li>
     * <li>{@link #TOOTLE_3D_API_ERROR 3D_API_ERROR} - Errors occurred while setting up the 3D API. This generally means that D3D isn't installed properly.</li>
     * <li>{@link #TOOTLE_INTERNAL_ERROR INTERNAL_ERROR} - Something happened that really, really shouldn't.</li>
     * <li>{@link #TOOTLE_NOT_INITIALIZED NOT_INITIALIZED} - Tootle was not initialized before a function call.</li>
     * </ul>
     */
    public static final int
        TOOTLE_OK              = 1,
        TOOTLE_INVALID_ARGS    = 2,
        TOOTLE_OUT_OF_MEMORY   = 3,
        TOOTLE_3D_API_ERROR    = 4,
        TOOTLE_INTERNAL_ERROR  = 5,
        TOOTLE_NOT_INITIALIZED = 6;

    /**
     * Enumeration for face winding order. ({@code TootleFaceWinding})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TOOTLE_CCW CCW} - Face is ordered counter-clockwise</li>
     * <li>{@link #TOOTLE_CW CW} - Face is ordered clockwise</li>
     * </ul>
     */
    public static final int
        TOOTLE_CCW = 1,
        TOOTLE_CW  = 2;

    /**
     * Enumeration for the algorithm for vertex optimization. ({@code TootleVCacheOptimizer})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TOOTLE_VCACHE_AUTO VCACHE_AUTO} - If vertex cache size is less than 7, use LSTRIPS algorithm otherwise TIPSY.</li>
     * <li>{@link #TOOTLE_VCACHE_DIRECT3D VCACHE_DIRECT3D} - Use D3DXOptimizeFaces to optimize faces.</li>
     * <li>{@link #TOOTLE_VCACHE_LSTRIPS VCACHE_LSTRIPS} - Build a list like triangle strips to optimize faces.</li>
     * <li>{@link #TOOTLE_VCACHE_TIPSY VCACHE_TIPSY} - Use TIPSY (the algorithm from SIGGRAPH 2007) to optimize faces.</li>
     * </ul>
     */
    public static final int
        TOOTLE_VCACHE_AUTO     = 1,
        TOOTLE_VCACHE_DIRECT3D = 2,
        TOOTLE_VCACHE_LSTRIPS  = 3,
        TOOTLE_VCACHE_TIPSY    = 4;

    /**
     * Enumeration for the algorithm for overdraw optimization. ({@code TootleOverdrawOptimizer})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #TOOTLE_OVERDRAW_AUTO OVERDRAW_AUTO} - Use either Direct3D or raytracing to reorder clusters (depending on the number of clusters).</li>
     * <li>{@link #TOOTLE_OVERDRAW_DIRECT3D OVERDRAW_DIRECT3D} - Use Direct3D rendering to reorder clusters to optimize overdraw (slow {@code O(N^2)}).</li>
     * <li>{@link #TOOTLE_OVERDRAW_RAYTRACE OVERDRAW_RAYTRACE} - Use CPU raytracing to reorder clusters to optimize overdraw (slow {@code O(N^2)}).</li>
     * <li>{@link #TOOTLE_OVERDRAW_FAST OVERDRAW_FAST} - Use a fast approximation algorithm (from SIGGRAPH 2007) to reorder clusters.</li>
     * </ul>
     */
    public static final int
        TOOTLE_OVERDRAW_AUTO     = 1,
        TOOTLE_OVERDRAW_DIRECT3D = 2,
        TOOTLE_OVERDRAW_RAYTRACE = 3,
        TOOTLE_OVERDRAW_FAST     = 4;

    static { Library.loadSystem(System::load, System::loadLibrary, Tootle.class, "org.lwjgl.tootle", Platform.mapLibraryNameBundled("lwjgl_tootle")); }

    protected Tootle() {
        throw new UnsupportedOperationException();
    }

    // --- [ TootleInit ] ---

    /** Performs one-time initialization required by Tootle. */
    @NativeType("TootleResult")
    public static native int TootleInit();

    // --- [ TootleOptimizeVCache ] ---

    /**
     * Unsafe version of: {@link #TootleOptimizeVCache OptimizeVCache}
     *
     * @param nFaces the number of faces in the index buffer. This must be non-zero and less than {@link #TOOTLE_MAX_FACES MAX_FACES}.
     */
    public static native int nTootleOptimizeVCache(long pnIB, int nFaces, int nVertices, int nCacheSize, long pnIBOut, long pnFaceRemapOut, int eVCacheOptimizer);

    /**
     * This function performs vertex cache optimization on an index buffer.  It returns a face re-mapping if requested.
     *
     * @param pnIB             the index buffer to optimize.  Must be a triangle list.
     * @param nVertices        the number of vertices in the model. This must non-zero and less than {@link #TOOTLE_MAX_VERTICES MAX_VERTICES}.
     * @param nCacheSize       the number of vertices that will fit in cache. If the application does not know or care about the vertex cache size, then it should pass
     *                         {@link #TOOTLE_DEFAULT_VCACHE_SIZE DEFAULT_VCACHE_SIZE}. This value must be non-zero.
     * @param pnIBOut          a pointer that will be filled with an optimized index buffer. May be {@code NULL}. May equal {@code pnIB}.
     * @param pnFaceRemapOut   a pointer to an array that will be filled with a face re-mapping. May be {@code NULL}. This is an array of {@code nFaces} elements.
     *                         
     *                         <p>Element {@code i} in the array will contain the position of input face {@code i} in the output face ordering.</p>
     * @param eVCacheOptimizer the selection for choosing the algorithm to optimize vertex cache. One of:<br><table><tr><td>{@link #TOOTLE_VCACHE_AUTO VCACHE_AUTO}</td><td>{@link #TOOTLE_VCACHE_DIRECT3D VCACHE_DIRECT3D}</td><td>{@link #TOOTLE_VCACHE_LSTRIPS VCACHE_LSTRIPS}</td><td>{@link #TOOTLE_VCACHE_TIPSY VCACHE_TIPSY}</td></tr></table>
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}
     */
    @NativeType("TootleResult")
    public static int TootleOptimizeVCache(@NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVertices, @NativeType("unsigned int") int nCacheSize, @Nullable @NativeType("unsigned int *") IntBuffer pnIBOut, @Nullable @NativeType("unsigned int *") IntBuffer pnFaceRemapOut, @NativeType("TootleVCacheOptimizer") int eVCacheOptimizer) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            checkSafe(pnIBOut, pnIB.remaining());
            checkSafe(pnFaceRemapOut, nFaces);
        }
        return nTootleOptimizeVCache(memAddress(pnIB), nFaces, nVertices, nCacheSize, memAddressSafe(pnIBOut), memAddressSafe(pnFaceRemapOut), eVCacheOptimizer);
    }

    // --- [ TootleClusterMesh ] ---

    /**
     * Unsafe version of: {@link #TootleClusterMesh ClusterMesh}
     *
     * @param nVertices number of vertices. This must be non-zero and less than {@link #TOOTLE_MAX_VERTICES MAX_VERTICES}.
     * @param nFaces    number of faces. This must be non-zero and less than {@link #TOOTLE_MAX_FACES MAX_FACES}.
     */
    public static native int nTootleClusterMesh(long pVB, long pnIB, int nVertices, int nFaces, int nVBStride, int nTargetClusters, long pnClusteredIBOut, long pnFaceClustersOut, long pnFaceRemapOut);

    /**
     * This function partitions a mesh into a set of connected, roughly planar clusters. It generates a new mesh that is re-arranged in cluster order. This
     * clustering is required as a pre-cursor to overdraw optimization. This function returns a mesh that is clustered. That is, the faces are sorted in
     * ascending order by cluster ID. The number of clusters in the mesh will be equal to {@code pFaceClustersOut[ nFaces-1 ] + 1}.
     *
     * @param pVB               a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
     *                          value (X,Y,Z).
     * @param pnIB              an index buffer. Must be a triangle list.
     * @param nVBStride         the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}.
     * @param nTargetClusters   a target number of clusters. The clustering algorithm will create at least this many clusters, but not more than {@code nFaces}. This value is only
     *                          a hint. More clusters may be created if Tootle considers it necessary. (for example, if there are numerous connected components in the mesh).
     *                          
     *                          <p>Passing 0 for this value causes Tootle to use an automatic method to determine when to stop creating clusters.</p>
     * @param pnClusteredIBOut  an array that will receive a copy of the index buffer, sorted by cluster ID. May not be {@code NULL}. May equal {@code pnIB}.
     * @param pnFaceClustersOut an array of {@code nFaces+1} unsigned ints, that will be filled with the cluster ID that was assigned to each face in the output index buffer. The
     *                          last element of the array contains the number of cluster. This is of a full format type. May not be {@code NULL}.
     * @param pnFaceRemapOut    an array that will receive a face re-mapping. May be {@code NULL}. If not {@code NULL}, must be an array of size {@code nFaces}. The {@code i}'th element of the
     *                          output array contains the position of input face i in the new face ordering.
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}
     */
    @NativeType("TootleResult")
    public static int TootleClusterMesh(@NativeType("void const *") ByteBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("unsigned int") int nTargetClusters, @NativeType("unsigned int *") IntBuffer pnClusteredIBOut, @NativeType("unsigned int *") IntBuffer pnFaceClustersOut, @Nullable @NativeType("unsigned int *") IntBuffer pnFaceRemapOut) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnClusteredIBOut, pnIB.remaining());
            check(pnFaceClustersOut, nFaces + 1);
            checkSafe(pnFaceRemapOut, nFaces);
        }
        return nTootleClusterMesh(memAddress(pVB), memAddress(pnIB), pVB.remaining() / nVBStride, nFaces, nVBStride, nTargetClusters, memAddress(pnClusteredIBOut), memAddress(pnFaceClustersOut), memAddressSafe(pnFaceRemapOut));
    }

    /**
     * This function partitions a mesh into a set of connected, roughly planar clusters. It generates a new mesh that is re-arranged in cluster order. This
     * clustering is required as a pre-cursor to overdraw optimization. This function returns a mesh that is clustered. That is, the faces are sorted in
     * ascending order by cluster ID. The number of clusters in the mesh will be equal to {@code pFaceClustersOut[ nFaces-1 ] + 1}.
     *
     * @param pVB               a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
     *                          value (X,Y,Z).
     * @param pnIB              an index buffer. Must be a triangle list.
     * @param nVBStride         the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}.
     * @param nTargetClusters   a target number of clusters. The clustering algorithm will create at least this many clusters, but not more than {@code nFaces}. This value is only
     *                          a hint. More clusters may be created if Tootle considers it necessary. (for example, if there are numerous connected components in the mesh).
     *                          
     *                          <p>Passing 0 for this value causes Tootle to use an automatic method to determine when to stop creating clusters.</p>
     * @param pnClusteredIBOut  an array that will receive a copy of the index buffer, sorted by cluster ID. May not be {@code NULL}. May equal {@code pnIB}.
     * @param pnFaceClustersOut an array of {@code nFaces+1} unsigned ints, that will be filled with the cluster ID that was assigned to each face in the output index buffer. The
     *                          last element of the array contains the number of cluster. This is of a full format type. May not be {@code NULL}.
     * @param pnFaceRemapOut    an array that will receive a face re-mapping. May be {@code NULL}. If not {@code NULL}, must be an array of size {@code nFaces}. The {@code i}'th element of the
     *                          output array contains the position of input face i in the new face ordering.
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}
     */
    @NativeType("TootleResult")
    public static int TootleClusterMesh(@NativeType("void const *") FloatBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("unsigned int") int nTargetClusters, @NativeType("unsigned int *") IntBuffer pnClusteredIBOut, @NativeType("unsigned int *") IntBuffer pnFaceClustersOut, @Nullable @NativeType("unsigned int *") IntBuffer pnFaceRemapOut) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnClusteredIBOut, pnIB.remaining());
            check(pnFaceClustersOut, nFaces + 1);
            checkSafe(pnFaceRemapOut, nFaces);
        }
        return nTootleClusterMesh(memAddress(pVB), memAddress(pnIB), (int)(((long)pVB.remaining() << 2) / nVBStride), nFaces, nVBStride, nTargetClusters, memAddress(pnClusteredIBOut), memAddress(pnFaceClustersOut), memAddressSafe(pnFaceRemapOut));
    }

    // --- [ TootleFastOptimizeVCacheAndClusterMesh ] ---

    /**
     * Unsafe version of: {@link #TootleFastOptimizeVCacheAndClusterMesh FastOptimizeVCacheAndClusterMesh}
     *
     * @param nFaces the number of faces in the index buffer
     */
    public static native int nTootleFastOptimizeVCacheAndClusterMesh(long pnIB, int nFaces, int nVertices, int nCacheSize, long pnIBOut, long pnClustersOut, long pnNumClustersOut, float fAlpha);

    /**
     * This function performs vertex cache optimization and clustering the mesh based on the algorithm from SIGGRAPH 2007. It produces the re-ordered index
     * buffer and an array of the resulting clusters. The result can be used as inputs to {@link #TootleOptimizeOverdraw OptimizeOverdraw}.
     *
     * @param pnIB             the input index buffer: 3 {@code unsigned int} per triangle.
     * @param nVertices        the number of vertices in the vertex buffer
     * @param nCacheSize       hardware cache size (12 to 24 are good options)
     * @param pnIBOut          the updated index buffer (the output). May not be {@code NULL}. May equal {@code pnIB}.
     * @param pnClustersOut    the output clusters which is an array of {@code nFaces+1} {@code unsigned ints}. It is of a compact format type. Entry {@code i} and {@code i+1}
     *                         mark all face ids in {@code [i, i+1)} to be in cluster {@code i}. The last element of the array contains the number of clusters. May not be {@code NULL}.
     *                         This has to be pre-allocated of size {@code nFaces+1}.
     * @param pnNumClustersOut the total number of clusters in {@code pnClustersOut}
     * @param fAlpha           a linear parameter to compute lambda term from the algorithm. Pass {@link #TOOTLE_DEFAULT_ALPHA DEFAULT_ALPHA} as a default.
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}
     */
    @NativeType("TootleResult")
    public static int TootleFastOptimizeVCacheAndClusterMesh(@NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVertices, @NativeType("unsigned int") int nCacheSize, @NativeType("unsigned int *") IntBuffer pnIBOut, @NativeType("unsigned int *") IntBuffer pnClustersOut, @NativeType("unsigned int *") IntBuffer pnNumClustersOut, float fAlpha) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnIBOut, pnIB.remaining());
            check(pnClustersOut, nFaces + 1);
            check(pnNumClustersOut, 1);
        }
        return nTootleFastOptimizeVCacheAndClusterMesh(memAddress(pnIB), nFaces, nVertices, nCacheSize, memAddress(pnIBOut), memAddress(pnClustersOut), memAddress(pnNumClustersOut), fAlpha);
    }

    // --- [ TootleOptimizeOverdraw ] ---

    /**
     * Unsafe version of: {@link #TootleOptimizeOverdraw OptimizeOverdraw}
     *
     * @param nVertices   the number of vertices in the mesh. This must be non-zero and less than {@link #TOOTLE_MAX_VERTICES MAX_VERTICES}.
     * @param nFaces      the number of faces in the mesh.  This must be non-zero and less than {@link #TOOTLE_MAX_FACES MAX_FACES}.
     * @param nViewpoints the number of viewpoints in the viewpoint array
     */
    public static native int nTootleOptimizeOverdraw(long pVB, long pnIB, int nVertices, int nFaces, int nVBStride, long pfViewpoint, int nViewpoints, int eFrontWinding, long pnFaceClusters, long pnIBOut, long pnClusterRemapOut, int eOverdrawOptimizer);

    /**
     * Given a clustered mesh, this function computes a cluster ordering that minimizes expected overdraw, and sorts the clusters according to this ordering.
     * The input is a mesh whose faces are seperated into clusters. The clustering can be obtained by calling {@link #TootleClusterMesh ClusterMesh}, or the application can supply its
     * own clustering.
     *
     * @param pVB                a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
     *                           value (X,Y,Z).
     * @param pnIB               the mesh index buffer. This must be a triangle list. The faces must be clustered.
     * @param nVBStride          the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}.
     * @param pfViewpoint        an array of viewpoints to use to measure overdraw. Each viewpoint must be a point on or in the unit sphere. When measuring overdraw, the mesh will
     *                           be scaled and translated so that it lies inside the unit sphere. The mesh will be rendered with orthographic projections, with the camera centered
     *                           at the given point looking at the origin. If this argument is {@code NULL}, a default viewpoint set will be used.
     * @param eFrontWinding      the winding order of front-faces in the mesh. One of:<br><table><tr><td>{@link #TOOTLE_CCW CCW}</td><td>{@link #TOOTLE_CW CW}</td></tr></table>
     * @param pnFaceClusters     this array of {@code nFaces+1} size can be either of two types: a full format (the output of {@link #TootleClusterMesh ClusterMesh}) or a compact format (the output of
     *                           {@link #TootleFastOptimizeVCacheAndClusterMesh FastOptimizeVCacheAndClusterMesh}).
     *                           
     *                           <p>The full format is an array of mapping for each face to the cluster ID. The entry {@code i} of this array contains the cluster ID of face
     *                           {@code i}.</p>
     *                           
     *                           <p>The compact format is an array that maps every face ID between entry {@code i} and {@code i+1} to be in cluster {@code i}.</p>
     *                           
     *                           <p>For both formats, the last entry of the array ( {@code pnFaceClusters[ nFaces ]} ) should contains the number of total clusters.</p>
     * @param pnIBOut            an array that will receive the re-ordered index buffer. May be {@code NULL}. May equal {@code pnIB}.
     * @param pnClusterRemapOut  an array that will receive the cluster ordering. May be {@code NULL}. If non-null, the size of the array must be equal to the number of clusters in the
     *                           mesh. {@code pClusterRemapOut[i]} will be set to the ID of the cluster that should come {@code i}'th in the draw order.
     * @param eOverdrawOptimizer the algorithm selection for optimizing overdraw. One of:<br><table><tr><td>{@link #TOOTLE_OVERDRAW_AUTO OVERDRAW_AUTO}</td><td>{@link #TOOTLE_OVERDRAW_DIRECT3D OVERDRAW_DIRECT3D}</td><td>{@link #TOOTLE_OVERDRAW_RAYTRACE OVERDRAW_RAYTRACE}</td><td>{@link #TOOTLE_OVERDRAW_FAST OVERDRAW_FAST}</td></tr></table>
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS} {@link #TOOTLE_3D_API_ERROR 3D_API_ERROR}, {@link #TOOTLE_NOT_INITIALIZED NOT_INITIALIZED}
     */
    @NativeType("TootleResult")
    public static int TootleOptimizeOverdraw(@NativeType("void const *") ByteBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @Nullable @NativeType("float const *") FloatBuffer pfViewpoint, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("unsigned int const *") IntBuffer pnFaceClusters, @Nullable @NativeType("unsigned int *") IntBuffer pnIBOut, @Nullable @NativeType("unsigned int *") IntBuffer pnClusterRemapOut, @NativeType("TootleOverdrawOptimizer") int eOverdrawOptimizer) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            checkSafe(pnIBOut, pnIB.remaining());
            check(pnFaceClusters, nFaces + 1);
            checkSafe(pnClusterRemapOut, pnFaceClusters.get(nFaces));
        }
        return nTootleOptimizeOverdraw(memAddress(pVB), memAddress(pnIB), pVB.remaining() / nVBStride, nFaces, nVBStride, memAddressSafe(pfViewpoint), remainingSafe(pfViewpoint) / 3, eFrontWinding, memAddress(pnFaceClusters), memAddressSafe(pnIBOut), memAddressSafe(pnClusterRemapOut), eOverdrawOptimizer);
    }

    /**
     * Given a clustered mesh, this function computes a cluster ordering that minimizes expected overdraw, and sorts the clusters according to this ordering.
     * The input is a mesh whose faces are seperated into clusters. The clustering can be obtained by calling {@link #TootleClusterMesh ClusterMesh}, or the application can supply its
     * own clustering.
     *
     * @param pVB                a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
     *                           value (X,Y,Z).
     * @param pnIB               the mesh index buffer. This must be a triangle list. The faces must be clustered.
     * @param nVBStride          the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}.
     * @param pfViewpoint        an array of viewpoints to use to measure overdraw. Each viewpoint must be a point on or in the unit sphere. When measuring overdraw, the mesh will
     *                           be scaled and translated so that it lies inside the unit sphere. The mesh will be rendered with orthographic projections, with the camera centered
     *                           at the given point looking at the origin. If this argument is {@code NULL}, a default viewpoint set will be used.
     * @param eFrontWinding      the winding order of front-faces in the mesh. One of:<br><table><tr><td>{@link #TOOTLE_CCW CCW}</td><td>{@link #TOOTLE_CW CW}</td></tr></table>
     * @param pnFaceClusters     this array of {@code nFaces+1} size can be either of two types: a full format (the output of {@link #TootleClusterMesh ClusterMesh}) or a compact format (the output of
     *                           {@link #TootleFastOptimizeVCacheAndClusterMesh FastOptimizeVCacheAndClusterMesh}).
     *                           
     *                           <p>The full format is an array of mapping for each face to the cluster ID. The entry {@code i} of this array contains the cluster ID of face
     *                           {@code i}.</p>
     *                           
     *                           <p>The compact format is an array that maps every face ID between entry {@code i} and {@code i+1} to be in cluster {@code i}.</p>
     *                           
     *                           <p>For both formats, the last entry of the array ( {@code pnFaceClusters[ nFaces ]} ) should contains the number of total clusters.</p>
     * @param pnIBOut            an array that will receive the re-ordered index buffer. May be {@code NULL}. May equal {@code pnIB}.
     * @param pnClusterRemapOut  an array that will receive the cluster ordering. May be {@code NULL}. If non-null, the size of the array must be equal to the number of clusters in the
     *                           mesh. {@code pClusterRemapOut[i]} will be set to the ID of the cluster that should come {@code i}'th in the draw order.
     * @param eOverdrawOptimizer the algorithm selection for optimizing overdraw. One of:<br><table><tr><td>{@link #TOOTLE_OVERDRAW_AUTO OVERDRAW_AUTO}</td><td>{@link #TOOTLE_OVERDRAW_DIRECT3D OVERDRAW_DIRECT3D}</td><td>{@link #TOOTLE_OVERDRAW_RAYTRACE OVERDRAW_RAYTRACE}</td><td>{@link #TOOTLE_OVERDRAW_FAST OVERDRAW_FAST}</td></tr></table>
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS} {@link #TOOTLE_3D_API_ERROR 3D_API_ERROR}, {@link #TOOTLE_NOT_INITIALIZED NOT_INITIALIZED}
     */
    @NativeType("TootleResult")
    public static int TootleOptimizeOverdraw(@NativeType("void const *") FloatBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @Nullable @NativeType("float const *") FloatBuffer pfViewpoint, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("unsigned int const *") IntBuffer pnFaceClusters, @Nullable @NativeType("unsigned int *") IntBuffer pnIBOut, @Nullable @NativeType("unsigned int *") IntBuffer pnClusterRemapOut, @NativeType("TootleOverdrawOptimizer") int eOverdrawOptimizer) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            checkSafe(pnIBOut, pnIB.remaining());
            check(pnFaceClusters, nFaces + 1);
            checkSafe(pnClusterRemapOut, pnFaceClusters.get(nFaces));
        }
        return nTootleOptimizeOverdraw(memAddress(pVB), memAddress(pnIB), (int)(((long)pVB.remaining() << 2) / nVBStride), nFaces, nVBStride, memAddressSafe(pfViewpoint), remainingSafe(pfViewpoint) / 3, eFrontWinding, memAddress(pnFaceClusters), memAddressSafe(pnIBOut), memAddressSafe(pnClusterRemapOut), eOverdrawOptimizer);
    }

    // --- [ TootleCleanup ] ---

    /** Frees all resources held by Tootle. */
    public static native void TootleCleanup();

    // --- [ TootleOptimize ] ---

    /**
     * Unsafe version of: {@link #TootleOptimize Optimize}
     *
     * @param nVertices   number of vertices. This must be non-zero and less than {@link #TOOTLE_MAX_VERTICES MAX_VERTICES}.
     * @param nFaces      number of faces. This must be non-zero and less than {@link #TOOTLE_MAX_FACES MAX_FACES}.
     * @param nViewpoints the number of viewpoints in the viewpoint array
     */
    public static native int nTootleOptimize(long pVB, long pnIB, int nVertices, int nFaces, int nVBStride, int nCacheSize, long pViewpoints, int nViewpoints, int eFrontWinding, long pnIBOut, long pnNumClustersOut, int eVCacheOptimizer, int eOverdrawOptimizer);

    /**
     * This is a utility function that is provided for developers to perform the entire optimization for a mesh.
     * 
     * <p>The function calls the three core functions to create clusters for the mesh ({@link #TootleClusterMesh ClusterMesh}), optimize vertex cache for each cluster
     * ({@link #TootleVCacheClusters VCacheClusters}), and reorder the clusters to optimize overdraw ({@link #TootleOptimizeOverdraw OptimizeOverdraw}). It generates a new indices for faces that is optimized for
     * post-transform vertex cache and overdraw.</p>
     *
     * @param pVB                a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
     *                           value (X,Y,Z).
     * @param pnIB               an index buffer. Must be a triangle list.
     * @param nVBStride          the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}.
     * @param nCacheSize         the number of vertices that will fit in cache. If the application does not know or care about the vertex cache size, then it should pass
     *                           {@link #TOOTLE_DEFAULT_VCACHE_SIZE DEFAULT_VCACHE_SIZE}. This value must be non-zero.
     * @param pViewpoints        an array of viewpoints to use to measure overdraw. Each viewpoint must be a point on or in the unit sphere.  When measuring overdraw, the mesh will
     *                           be scaled and translated so that it lies inside the unit sphere. The mesh will be rendered with orthographic projections, with the camera centered
     *                           at the given point looking at the origin.  If this argument is {@code NULL}, a default viewpoint set will be used.
     * @param eFrontWinding      the winding order of front-faces in the model. One of:<br><table><tr><td>{@link #TOOTLE_CCW CCW}</td><td>{@link #TOOTLE_CW CW}</td></tr></table>
     * @param pnIBOut            a pointer that will be filled with an optimized index buffer. May not be {@code NULL}. May equal {@code pIB}.
     * @param pnNumClustersOut   the number of clusters generated by the algorithm. May be {@code NULL} if the output is not requested.
     * @param eVCacheOptimizer   the selection for choosing the algorithm to optimize vertex cache. One of:<br><table><tr><td>{@link #TOOTLE_VCACHE_AUTO VCACHE_AUTO}</td><td>{@link #TOOTLE_VCACHE_DIRECT3D VCACHE_DIRECT3D}</td><td>{@link #TOOTLE_VCACHE_LSTRIPS VCACHE_LSTRIPS}</td><td>{@link #TOOTLE_VCACHE_TIPSY VCACHE_TIPSY}</td></tr></table>
     * @param eOverdrawOptimizer the algorithm selection for optimizing overdraw. One of:<br><table><tr><td>{@link #TOOTLE_OVERDRAW_AUTO OVERDRAW_AUTO}</td><td>{@link #TOOTLE_OVERDRAW_DIRECT3D OVERDRAW_DIRECT3D}</td><td>{@link #TOOTLE_OVERDRAW_RAYTRACE OVERDRAW_RAYTRACE}</td><td>{@link #TOOTLE_OVERDRAW_FAST OVERDRAW_FAST}</td></tr></table>
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}
     */
    @NativeType("TootleResult")
    public static int TootleOptimize(@NativeType("void const *") ByteBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("unsigned int") int nCacheSize, @Nullable @NativeType("float const *") FloatBuffer pViewpoints, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("unsigned int *") IntBuffer pnIBOut, @Nullable @NativeType("unsigned int *") IntBuffer pnNumClustersOut, @NativeType("TootleVCacheOptimizer") int eVCacheOptimizer, @NativeType("TootleOverdrawOptimizer") int eOverdrawOptimizer) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnIBOut, pnIB.remaining());
            checkSafe(pnNumClustersOut, 1);
        }
        return nTootleOptimize(memAddress(pVB), memAddress(pnIB), pVB.remaining() / nVBStride, nFaces, nVBStride, nCacheSize, memAddressSafe(pViewpoints), remainingSafe(pViewpoints) / 3, eFrontWinding, memAddress(pnIBOut), memAddressSafe(pnNumClustersOut), eVCacheOptimizer, eOverdrawOptimizer);
    }

    /**
     * This is a utility function that is provided for developers to perform the entire optimization for a mesh.
     * 
     * <p>The function calls the three core functions to create clusters for the mesh ({@link #TootleClusterMesh ClusterMesh}), optimize vertex cache for each cluster
     * ({@link #TootleVCacheClusters VCacheClusters}), and reorder the clusters to optimize overdraw ({@link #TootleOptimizeOverdraw OptimizeOverdraw}). It generates a new indices for faces that is optimized for
     * post-transform vertex cache and overdraw.</p>
     *
     * @param pVB                a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
     *                           value (X,Y,Z).
     * @param pnIB               an index buffer. Must be a triangle list.
     * @param nVBStride          the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}.
     * @param nCacheSize         the number of vertices that will fit in cache. If the application does not know or care about the vertex cache size, then it should pass
     *                           {@link #TOOTLE_DEFAULT_VCACHE_SIZE DEFAULT_VCACHE_SIZE}. This value must be non-zero.
     * @param pViewpoints        an array of viewpoints to use to measure overdraw. Each viewpoint must be a point on or in the unit sphere.  When measuring overdraw, the mesh will
     *                           be scaled and translated so that it lies inside the unit sphere. The mesh will be rendered with orthographic projections, with the camera centered
     *                           at the given point looking at the origin.  If this argument is {@code NULL}, a default viewpoint set will be used.
     * @param eFrontWinding      the winding order of front-faces in the model. One of:<br><table><tr><td>{@link #TOOTLE_CCW CCW}</td><td>{@link #TOOTLE_CW CW}</td></tr></table>
     * @param pnIBOut            a pointer that will be filled with an optimized index buffer. May not be {@code NULL}. May equal {@code pIB}.
     * @param pnNumClustersOut   the number of clusters generated by the algorithm. May be {@code NULL} if the output is not requested.
     * @param eVCacheOptimizer   the selection for choosing the algorithm to optimize vertex cache. One of:<br><table><tr><td>{@link #TOOTLE_VCACHE_AUTO VCACHE_AUTO}</td><td>{@link #TOOTLE_VCACHE_DIRECT3D VCACHE_DIRECT3D}</td><td>{@link #TOOTLE_VCACHE_LSTRIPS VCACHE_LSTRIPS}</td><td>{@link #TOOTLE_VCACHE_TIPSY VCACHE_TIPSY}</td></tr></table>
     * @param eOverdrawOptimizer the algorithm selection for optimizing overdraw. One of:<br><table><tr><td>{@link #TOOTLE_OVERDRAW_AUTO OVERDRAW_AUTO}</td><td>{@link #TOOTLE_OVERDRAW_DIRECT3D OVERDRAW_DIRECT3D}</td><td>{@link #TOOTLE_OVERDRAW_RAYTRACE OVERDRAW_RAYTRACE}</td><td>{@link #TOOTLE_OVERDRAW_FAST OVERDRAW_FAST}</td></tr></table>
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}
     */
    @NativeType("TootleResult")
    public static int TootleOptimize(@NativeType("void const *") FloatBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("unsigned int") int nCacheSize, @Nullable @NativeType("float const *") FloatBuffer pViewpoints, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("unsigned int *") IntBuffer pnIBOut, @Nullable @NativeType("unsigned int *") IntBuffer pnNumClustersOut, @NativeType("TootleVCacheOptimizer") int eVCacheOptimizer, @NativeType("TootleOverdrawOptimizer") int eOverdrawOptimizer) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnIBOut, pnIB.remaining());
            checkSafe(pnNumClustersOut, 1);
        }
        return nTootleOptimize(memAddress(pVB), memAddress(pnIB), (int)(((long)pVB.remaining() << 2) / nVBStride), nFaces, nVBStride, nCacheSize, memAddressSafe(pViewpoints), remainingSafe(pViewpoints) / 3, eFrontWinding, memAddress(pnIBOut), memAddressSafe(pnNumClustersOut), eVCacheOptimizer, eOverdrawOptimizer);
    }

    // --- [ TootleFastOptimize ] ---

    /**
     * Unsafe version of: {@link #TootleFastOptimize FastOptimize}
     *
     * @param nVertices the number of vertices in the vertex buffer
     * @param nFaces    the number of faces in the index buffer
     */
    public static native int nTootleFastOptimize(long pVB, long pnIB, int nVertices, int nFaces, int nVBStride, int nCacheSize, int eFrontWinding, long pnIBOut, long pnNumClustersOut, float fAlpha);

    /**
     * This is a utility function that performs the entire optimization using the new algorithm from SIGGRAPH 2007. This function performs vertex cache
     * optimization and clustering, then optimize overdraw on the clusters generated. It generates a new indices for faces that is optimized for
     * post-transform vertex cache and overdraw.
     *
     * @param pVB              a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
     *                         value (X,Y,Z).
     * @param pnIB             the input index buffer: 3 {@code unsigned int} per triangle
     * @param nVBStride        the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}.
     * @param nCacheSize       hardware cache size (12 to 24 are good options)
     * @param eFrontWinding    the winding order of front-faces in the model. One of:<br><table><tr><td>{@link #TOOTLE_CCW CCW}</td><td>{@link #TOOTLE_CW CW}</td></tr></table>
     * @param pnIBOut          the updated index buffer (the output). May not be {@code NULL}. May equal {@code pnIB}.
     * @param pnNumClustersOut the number of output clusters. May be {@code NULL} if not requested.
     * @param fAlpha           a linear parameter to compute lambda term from the algorithm. Pass {@link #TOOTLE_DEFAULT_ALPHA DEFAULT_ALPHA} as a default.
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}
     */
    @NativeType("TootleResult")
    public static int TootleFastOptimize(@NativeType("void const *") ByteBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("unsigned int") int nCacheSize, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("unsigned int *") IntBuffer pnIBOut, @Nullable @NativeType("unsigned int *") IntBuffer pnNumClustersOut, float fAlpha) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnIBOut, pnIB.remaining());
            checkSafe(pnNumClustersOut, 1);
        }
        return nTootleFastOptimize(memAddress(pVB), memAddress(pnIB), pVB.remaining() / nVBStride, nFaces, nVBStride, nCacheSize, eFrontWinding, memAddress(pnIBOut), memAddressSafe(pnNumClustersOut), fAlpha);
    }

    /**
     * This is a utility function that performs the entire optimization using the new algorithm from SIGGRAPH 2007. This function performs vertex cache
     * optimization and clustering, then optimize overdraw on the clusters generated. It generates a new indices for faces that is optimized for
     * post-transform vertex cache and overdraw.
     *
     * @param pVB              a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
     *                         value (X,Y,Z).
     * @param pnIB             the input index buffer: 3 {@code unsigned int} per triangle
     * @param nVBStride        the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}.
     * @param nCacheSize       hardware cache size (12 to 24 are good options)
     * @param eFrontWinding    the winding order of front-faces in the model. One of:<br><table><tr><td>{@link #TOOTLE_CCW CCW}</td><td>{@link #TOOTLE_CW CW}</td></tr></table>
     * @param pnIBOut          the updated index buffer (the output). May not be {@code NULL}. May equal {@code pnIB}.
     * @param pnNumClustersOut the number of output clusters. May be {@code NULL} if not requested.
     * @param fAlpha           a linear parameter to compute lambda term from the algorithm. Pass {@link #TOOTLE_DEFAULT_ALPHA DEFAULT_ALPHA} as a default.
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}
     */
    @NativeType("TootleResult")
    public static int TootleFastOptimize(@NativeType("void const *") FloatBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("unsigned int") int nCacheSize, @NativeType("TootleFaceWinding") int eFrontWinding, @NativeType("unsigned int *") IntBuffer pnIBOut, @Nullable @NativeType("unsigned int *") IntBuffer pnNumClustersOut, float fAlpha) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            check(pnIBOut, pnIB.remaining());
            checkSafe(pnNumClustersOut, 1);
        }
        return nTootleFastOptimize(memAddress(pVB), memAddress(pnIB), (int)(((long)pVB.remaining() << 2) / nVBStride), nFaces, nVBStride, nCacheSize, eFrontWinding, memAddress(pnIBOut), memAddressSafe(pnNumClustersOut), fAlpha);
    }

    // --- [ TootleVCacheClusters ] ---

    /**
     * Unsafe version of: {@link #TootleVCacheClusters VCacheClusters}
     *
     * @param nFaces the number of faces in the index buffer. This must be non-zero and less than {@link #TOOTLE_MAX_FACES MAX_FACES}.
     */
    public static native int nTootleVCacheClusters(long pnIB, int nFaces, int nVertices, int nCacheSize, long pnFaceClusters, long pnIBOut, long pnFaceRemapOut, int eVCacheOptimizer);

    /**
     * This is a utility function to optimize vertex cache on a clustered index buffer. This function simply calls {@link #TootleOptimizeVCache OptimizeVCache} repeatedly. The faces
     * within each cluster will be re-ordered, but the clustering will be maintained.
     *
     * @param pnIB             the index buffer to optimize. Must be a triangle list.
     * @param nVertices        the number of vertices in the model. This must be non-zero and less than {@link #TOOTLE_MAX_VERTICES MAX_VERTICES}.
     * @param nCacheSize       the number of vertices that will fit in cache. If the application does not know or care about the vertex cache size, then it should pass
     *                         {@link #TOOTLE_DEFAULT_VCACHE_SIZE DEFAULT_VCACHE_SIZE}. This value must be non-zero.
     * @param pnFaceClusters   an array giving the cluster ID for each face. All faces in a particular cluster should appear consecutively in the index buffer, as well as in this
     *                         array. It should be of size {@code nFaces+1}.
     * @param pnIBOut          a pointer that will be filled with an optimized index buffer. May be {@code NULL}. May equal {@code pnIB}.
     * @param pnFaceRemapOut   a pointer to an array that will be filled with a face re-mapping. May be {@code NULL}. This is an array of {@code nFaces} elements.
     *                         
     *                         <p>Element {@code i} in the array will contain the position of input face {@code i} in the output face ordering.</p>
     * @param eVCacheOptimizer the selection for choosing the algorithm to optimize vertex cache. One of:<br><table><tr><td>{@link #TOOTLE_VCACHE_AUTO VCACHE_AUTO}</td><td>{@link #TOOTLE_VCACHE_DIRECT3D VCACHE_DIRECT3D}</td><td>{@link #TOOTLE_VCACHE_LSTRIPS VCACHE_LSTRIPS}</td><td>{@link #TOOTLE_VCACHE_TIPSY VCACHE_TIPSY}</td></tr></table>
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}
     */
    @NativeType("TootleResult")
    public static int TootleVCacheClusters(@NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVertices, @NativeType("unsigned int") int nCacheSize, @NativeType("unsigned int const *") IntBuffer pnFaceClusters, @Nullable @NativeType("unsigned int *") IntBuffer pnIBOut, @Nullable @NativeType("unsigned int *") IntBuffer pnFaceRemapOut, @NativeType("TootleVCacheOptimizer") int eVCacheOptimizer) {
        int nFaces = pnIB.remaining() / 3;
        if (CHECKS) {
            checkSafe(pnIBOut, pnIB.remaining());
            check(pnFaceClusters, nFaces + 1);
            checkSafe(pnFaceRemapOut, nFaces);
        }
        return nTootleVCacheClusters(memAddress(pnIB), nFaces, nVertices, nCacheSize, memAddress(pnFaceClusters), memAddressSafe(pnIBOut), memAddressSafe(pnFaceRemapOut), eVCacheOptimizer);
    }

    // --- [ TootleMeasureCacheEfficiency ] ---

    /**
     * Unsafe version of: {@link #TootleMeasureCacheEfficiency MeasureCacheEfficiency}
     *
     * @param nFaces the number of faces in the index buffer. This must be non-zero and less than {@link #TOOTLE_MAX_FACES MAX_FACES}.
     */
    public static native int nTootleMeasureCacheEfficiency(long pnIB, int nFaces, int nCacheSize, long pfEfficiencyOut);

    /**
     * A utility function to simulate vertex processing and measures the cache efficiency of an index buffer.
     * 
     * <p>The return cache efficiency is the ACMR (Average Cache Miss Ratio) of the mesh. It ranges between 0.5 to 3. 0.5 is the best optimal value, 3 is the
     * worst ratio.</p>
     *
     * @param pnIB            the index buffer whose efficiency should be measured. Must be a triangle list.
     * @param nCacheSize      the number of vertices that will fit in cache. If the application doesn't know or care, it should use {@link #TOOTLE_DEFAULT_VCACHE_SIZE DEFAULT_VCACHE_SIZE}.
     * @param pfEfficiencyOut a pointer to receive the vertex cache efficiency. This is defined as the number of cache misses per triangle.
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}
     */
    @NativeType("TootleResult")
    public static int TootleMeasureCacheEfficiency(@NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nCacheSize, @NativeType("float *") FloatBuffer pfEfficiencyOut) {
        if (CHECKS) {
            check(pfEfficiencyOut, 1);
        }
        return nTootleMeasureCacheEfficiency(memAddress(pnIB), pnIB.remaining() / 3, nCacheSize, memAddress(pfEfficiencyOut));
    }

    // --- [ TootleMeasureOverdraw ] ---

    /**
     * Unsafe version of: {@link #TootleMeasureOverdraw MeasureOverdraw}
     *
     * @param nVertices   the number of vertices. This must be non-zero and less than {@link #TOOTLE_MAX_VERTICES MAX_VERTICES}.
     * @param nFaces      the number of indices. This must be non-zero and less than {@link #TOOTLE_MAX_FACES MAX_FACES}.
     * @param nViewpoints the number of viewpoints in the viewpoint array
     */
    public static native int nTootleMeasureOverdraw(long pVB, long pnIB, int nVertices, int nFaces, int nVBStride, long pfViewpoint, int nViewpoints, int eFrontWinding, long pfAvgODOut, long pfMaxODOut, int eOverdrawOptimizer);

    /**
     * A utility function to measure the amount of overdraw that occurs over a set of views. Overdraw is defined as the number of pixels rendered divided by
     * the number of pixels covered by an object, minus one.
     *
     * @param pVB                a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
     *                           value (X,Y,Z).
     * @param pnIB               the index buffer. Must be a triangle list.
     * @param nVBStride          the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}.
     * @param pfViewpoint        an array of viewpoints to use to measure overdraw. Each viewpoint must be a point on or in the unit sphere.  When measuring overdraw, the mesh will
     *                           be scaled and translated so that it lies inside the unit sphere.  The mesh will be rendered with orthographic projections, with the camera centered
     *                           at the given point looking at the origin. If this argument is {@code NULL}, a default viewpoint set will be used.
     * @param eFrontWinding      the winding order of front-faces in the model
     * @param pfAvgODOut         a pointer to a variable to receive the average overdraw per pixel. May be {@code NULL}.
     * @param pfMaxODOut         a pointer to a variable to receive the maximum overdraw per pixel. May be {@code NULL}.
     * @param eOverdrawOptimizer the algorithm selection for optimizing overdraw. One of:<br><table><tr><td>{@link #TOOTLE_OVERDRAW_AUTO OVERDRAW_AUTO}</td><td>{@link #TOOTLE_OVERDRAW_DIRECT3D OVERDRAW_DIRECT3D}</td><td>{@link #TOOTLE_OVERDRAW_RAYTRACE OVERDRAW_RAYTRACE}</td><td>{@link #TOOTLE_OVERDRAW_FAST OVERDRAW_FAST}</td></tr></table>
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}, {@link #TOOTLE_NOT_INITIALIZED NOT_INITIALIZED}
     */
    @NativeType("TootleResult")
    public static int TootleMeasureOverdraw(@NativeType("void const *") ByteBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @Nullable @NativeType("float const *") FloatBuffer pfViewpoint, @NativeType("TootleFaceWinding") int eFrontWinding, @Nullable @NativeType("float *") FloatBuffer pfAvgODOut, @Nullable @NativeType("float *") FloatBuffer pfMaxODOut, @NativeType("TootleOverdrawOptimizer") int eOverdrawOptimizer) {
        if (CHECKS) {
            checkSafe(pfAvgODOut, 1);
            checkSafe(pfMaxODOut, 1);
        }
        return nTootleMeasureOverdraw(memAddress(pVB), memAddress(pnIB), pVB.remaining() / nVBStride, pnIB.remaining() / 3, nVBStride, memAddressSafe(pfViewpoint), remainingSafe(pfViewpoint) / 3, eFrontWinding, memAddressSafe(pfAvgODOut), memAddressSafe(pfMaxODOut), eOverdrawOptimizer);
    }

    /**
     * A utility function to measure the amount of overdraw that occurs over a set of views. Overdraw is defined as the number of pixels rendered divided by
     * the number of pixels covered by an object, minus one.
     *
     * @param pVB                a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
     *                           value (X,Y,Z).
     * @param pnIB               the index buffer. Must be a triangle list.
     * @param nVBStride          the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}.
     * @param pfViewpoint        an array of viewpoints to use to measure overdraw. Each viewpoint must be a point on or in the unit sphere.  When measuring overdraw, the mesh will
     *                           be scaled and translated so that it lies inside the unit sphere.  The mesh will be rendered with orthographic projections, with the camera centered
     *                           at the given point looking at the origin. If this argument is {@code NULL}, a default viewpoint set will be used.
     * @param eFrontWinding      the winding order of front-faces in the model
     * @param pfAvgODOut         a pointer to a variable to receive the average overdraw per pixel. May be {@code NULL}.
     * @param pfMaxODOut         a pointer to a variable to receive the maximum overdraw per pixel. May be {@code NULL}.
     * @param eOverdrawOptimizer the algorithm selection for optimizing overdraw. One of:<br><table><tr><td>{@link #TOOTLE_OVERDRAW_AUTO OVERDRAW_AUTO}</td><td>{@link #TOOTLE_OVERDRAW_DIRECT3D OVERDRAW_DIRECT3D}</td><td>{@link #TOOTLE_OVERDRAW_RAYTRACE OVERDRAW_RAYTRACE}</td><td>{@link #TOOTLE_OVERDRAW_FAST OVERDRAW_FAST}</td></tr></table>
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}, {@link #TOOTLE_NOT_INITIALIZED NOT_INITIALIZED}
     */
    @NativeType("TootleResult")
    public static int TootleMeasureOverdraw(@NativeType("void const *") FloatBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @Nullable @NativeType("float const *") FloatBuffer pfViewpoint, @NativeType("TootleFaceWinding") int eFrontWinding, @Nullable @NativeType("float *") FloatBuffer pfAvgODOut, @Nullable @NativeType("float *") FloatBuffer pfMaxODOut, @NativeType("TootleOverdrawOptimizer") int eOverdrawOptimizer) {
        if (CHECKS) {
            checkSafe(pfAvgODOut, 1);
            checkSafe(pfMaxODOut, 1);
        }
        return nTootleMeasureOverdraw(memAddress(pVB), memAddress(pnIB), (int)(((long)pVB.remaining() << 2) / nVBStride), pnIB.remaining() / 3, nVBStride, memAddressSafe(pfViewpoint), remainingSafe(pfViewpoint) / 3, eFrontWinding, memAddressSafe(pfAvgODOut), memAddressSafe(pfMaxODOut), eOverdrawOptimizer);
    }

    // --- [ TootleOptimizeVertexMemory ] ---

    /**
     * Unsafe version of: {@link #TootleOptimizeVertexMemory OptimizeVertexMemory}
     *
     * @param nVertices the number of vertices in the mesh. This must be non-zero and less than {@link #TOOTLE_MAX_VERTICES MAX_VERTICES}.
     * @param nFaces    the number of faces in the mesh. This must be non-zero and less than {@link #TOOTLE_MAX_FACES MAX_FACES}.
     */
    public static native int nTootleOptimizeVertexMemory(long pVB, long pnIB, int nVertices, int nFaces, int nVBStride, long pVBOut, long pnIBOut, long pnVertexRemapOut);

    /**
     * This function rearranges the vertex buffer's memory location based on the index buffer.
     * 
     * <p>Call this function after you have optimized the index buffer for vertex cache post-tranform and/or overdraw. The idea is to rearrange the memory
     * location for vertex buffer such that it will be optimized for vertex prefetch cache. Typically vertices are fetched in a cacheline (more than one
     * vertex at a time). Thus, the vertex in the next memory location will come for free if they are processed next in line. This is what we want to exploit.
     * It will compute a new Vertex Buffer and Index Buffer (since the vertices have been reordered).</p>
     *
     * @param pVB              a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
     *                         value (X,Y,Z).
     * @param pnIB             the mesh index buffer. This must be a triangle list.
     * @param nVBStride        the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}.
     * @param pVBOut           the output vertex buffer. May be {@code NULL}. May equal {@code pVB}.
     * @param pnIBOut          the output index buffer. May not be {@code NULL}. May equal {@code pnIB}.
     * @param pnVertexRemapOut an array that will receive a vertex re-mapping. May be {@code NULL} if the output is not requested. If not {@code NULL}, must be an array of size
     *                         {@code nVertices}. The {@code i}'th element of the output array contains the position of the input vertex {@code i} in the new vertex re-ordering.
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}
     */
    @NativeType("TootleResult")
    public static int TootleOptimizeVertexMemory(@NativeType("void const *") ByteBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("void *") ByteBuffer pVBOut, @NativeType("unsigned int *") IntBuffer pnIBOut, @Nullable @NativeType("unsigned int *") IntBuffer pnVertexRemapOut) {
        int nVertices = pVB.remaining() / nVBStride;
        if (CHECKS) {
            check(pVBOut, pVB.remaining());
            check(pnIBOut, pnIB.remaining());
            checkSafe(pnVertexRemapOut, nVertices);
        }
        return nTootleOptimizeVertexMemory(memAddress(pVB), memAddress(pnIB), nVertices, pnIB.remaining() / 3, nVBStride, memAddress(pVBOut), memAddress(pnIBOut), memAddressSafe(pnVertexRemapOut));
    }

    /**
     * This function rearranges the vertex buffer's memory location based on the index buffer.
     * 
     * <p>Call this function after you have optimized the index buffer for vertex cache post-tranform and/or overdraw. The idea is to rearrange the memory
     * location for vertex buffer such that it will be optimized for vertex prefetch cache. Typically vertices are fetched in a cacheline (more than one
     * vertex at a time). Thus, the vertex in the next memory location will come for free if they are processed next in line. This is what we want to exploit.
     * It will compute a new Vertex Buffer and Index Buffer (since the vertices have been reordered).</p>
     *
     * @param pVB              a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
     *                         value (X,Y,Z).
     * @param pnIB             the mesh index buffer. This must be a triangle list.
     * @param nVBStride        the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}.
     * @param pVBOut           the output vertex buffer. May be {@code NULL}. May equal {@code pVB}.
     * @param pnIBOut          the output index buffer. May not be {@code NULL}. May equal {@code pnIB}.
     * @param pnVertexRemapOut an array that will receive a vertex re-mapping. May be {@code NULL} if the output is not requested. If not {@code NULL}, must be an array of size
     *                         {@code nVertices}. The {@code i}'th element of the output array contains the position of the input vertex {@code i} in the new vertex re-ordering.
     *
     * @return one of: {@link #TOOTLE_OK OK}, {@link #TOOTLE_OUT_OF_MEMORY OUT_OF_MEMORY}, {@link #TOOTLE_INVALID_ARGS INVALID_ARGS}
     */
    @NativeType("TootleResult")
    public static int TootleOptimizeVertexMemory(@NativeType("void const *") FloatBuffer pVB, @NativeType("unsigned int const *") IntBuffer pnIB, @NativeType("unsigned int") int nVBStride, @NativeType("void *") FloatBuffer pVBOut, @NativeType("unsigned int *") IntBuffer pnIBOut, @Nullable @NativeType("unsigned int *") IntBuffer pnVertexRemapOut) {
        int nVertices = (int)(((long)pVBOut.remaining() << 2) / nVBStride);
        if (CHECKS) {
            check(pVBOut, pVB.remaining());
            check(pnIBOut, pnIB.remaining());
            checkSafe(pnVertexRemapOut, nVertices);
        }
        return nTootleOptimizeVertexMemory(memAddress(pVB), memAddress(pnIB), nVertices, pnIB.remaining() / 3, nVBStride, memAddress(pVBOut), memAddress(pnIBOut), memAddressSafe(pnVertexRemapOut));
    }

}