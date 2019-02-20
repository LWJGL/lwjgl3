/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tootle.templates

import org.lwjgl.generator.*
import tootle.*

val Tootle = "Tootle".nativeClass(Module.TOOTLE, prefix = "TOOTLE", prefixMethod = "Tootle") {
    nativeImport("tootlelib.h")

    cpp = true
    documentation =
        """
        Bindings to ${url("https://github.com/GPUOpen-Tools/amd-tootle", "AMD Tootle")}.

        AMD Tootle (Triangle Order Optimization Tool) is a 3D triangle mesh optimization library that improves on existing mesh preprocessing techniques. By
        using AMD Tootle, developers can optimize their models for pixel overdraw as well as vertex cache performance. This can provide significant performance
        improvements in pixel limited situations, with no penalty in vertex-limited scenarios, and no runtime cost.

        <h3>Features</h3>
        ${ul(
            """
            <b>Vertex cache optimization</b>: Triangles are re-ordered to optimize for the post-transform vertex cache in modern GPUs. This will yield
            significant performance improvements in vertex-tranform limited scenes.
            """,
            """
            <b>Overdraw optimization</b>: To reduce the pixel cost of rendering a mesh, the AMD Tootle library further re-orders the triangles in the mesh to
            reduce pixel overdraw. Significant reductions in pixel overdraw (2x or higher) can be achieved. This can yield significant performance improvements
            in pixel-limited scenes, and incurs no penalty in vertex-limited scenarios.
            """,
            """
            <b>Vertex prefetch cache optimization</b>: Triangle indices are re-indexed in the order of their occurrence in the triangle list. The vertex buffer
            is re-ordered to match these new indices. Thus, vertices are accessed close to each other in memory. This optimization exploits the input vertex
            cache because vertices are typically fetched in a cacheline (that may contains more than one vertex data).
            """
        )}

        The Direct3D optimizers are currently not supported.
        """

    IntConstant("The default vertex cache size.", "DEFAULT_VCACHE_SIZE".."16")
    IntConstant("The maximum allowed number of faces in the mesh.", "MAX_FACES"..0x7fffffff)
    IntConstant("The maximum allowed number of vertices in the mesh.", "MAX_VERTICES"..0x7fffffff)

    FloatConstant(
        """
        The parameter for #FastOptimize() to create more clusters (lower number generates more clusters).
        
        This parameter decides where to put extra breaks to create more clusters (refer to the SIGGRAPH 2007 paper for the full description of the parameter).
        """,
        "DEFAULT_ALPHA"..0.75f
    )

    EnumConstant(
        "Enumeration for Tootle return codes. ({@code TootleResult})",

        "OK".enum("All is well", "1"),
        "INVALID_ARGS".enum("Illegal arguments were passed."),
        "OUT_OF_MEMORY".enum("Tootle ran out of memory while trying to complete the call."),
        "3D_API_ERROR".enum("Errors occurred while setting up the 3D API. This generally means that D3D isn't installed properly."),
        "INTERNAL_ERROR".enum("Something happened that really, really shouldn't."),
        "NOT_INITIALIZED".enum("Tootle was not initialized before a function call.")
    )

    val TootleFaceWindings = EnumConstant(
        "Enumeration for face winding order. ({@code TootleFaceWinding})",

        "CCW".enum("Face is ordered counter-clockwise", "1"),
        "CW".enum("Face is ordered clockwise")
    ).javaDocLinks

    val TootleVCacheOptimizers = EnumConstant(
        "Enumeration for the algorithm for vertex optimization. ({@code TootleVCacheOptimizer})",

        "VCACHE_AUTO".enum("If vertex cache size is less than 7, use LSTRIPS algorithm otherwise TIPSY.", "1"),
        "VCACHE_DIRECT3D".enum("Use D3DXOptimizeFaces to optimize faces."),
        "VCACHE_LSTRIPS".enum("Build a list like triangle strips to optimize faces."),
        "VCACHE_TIPSY".enum("Use TIPSY (the algorithm from SIGGRAPH 2007) to optimize faces.")
    ).javaDocLinks

    val TootleOverdrawOptimizers = EnumConstant(
        "Enumeration for the algorithm for overdraw optimization. ({@code TootleOverdrawOptimizer})",

        "OVERDRAW_AUTO".enum("Use either Direct3D or raytracing to reorder clusters (depending on the number of clusters).", "1"),
        "OVERDRAW_DIRECT3D".enum("Use Direct3D rendering to reorder clusters to optimize overdraw (slow {@code O(N^2)})."),
        "OVERDRAW_RAYTRACE".enum("Use CPU raytracing to reorder clusters to optimize overdraw (slow {@code O(N^2)})."),
        "OVERDRAW_FAST".enum("Use a fast approximation algorithm (from SIGGRAPH 2007) to reorder clusters.")
    ).javaDocLinks

    TootleResult(
        "Init",
        "Performs one-time initialization required by Tootle.",
        void()
    )

    TootleResult(
        "OptimizeVCache",
        "This function performs vertex cache optimization on an index buffer.  It returns a face re-mapping if requested.",

        unsigned_int.const.p("pnIB", "the index buffer to optimize.  Must be a triangle list."),
        UseVariable..AutoSize(3, "pnIB", "pnIBOut")..unsigned_int("nFaces", "the number of faces in the index buffer. This must be non-zero and less than #MAX_FACES."),
        unsigned_int("nVertices", "the number of vertices in the model. This must non-zero and less than #MAX_VERTICES."),
        unsigned_int(
            "nCacheSize",
            """
            the number of vertices that will fit in cache. If the application does not know or care about the vertex cache size, then it should pass
            #DEFAULT_VCACHE_SIZE. This value must be non-zero.
            """
        ),
        nullable..unsigned_int.p(
            "pnIBOut",
            "a pointer that will be filled with an optimized index buffer. May be #NULL. May equal {@code pnIB}."
        ),
        Check("nFaces")..nullable..unsigned_int.p(
            "pnFaceRemapOut",
            """
            a pointer to an array that will be filled with a face re-mapping. May be #NULL. This is an array of {@code nFaces} elements.

            Element {@code i} in the array will contain the position of input face {@code i} in the output face ordering.
            """
        ),
        TootleVCacheOptimizer("eVCacheOptimizer", "the selection for choosing the algorithm to optimize vertex cache", TootleVCacheOptimizers),

        returnDoc = "one of: #OK, #OUT_OF_MEMORY, #INVALID_ARGS"
    )

    TootleResult(
        "ClusterMesh",
        """
        This function partitions a mesh into a set of connected, roughly planar clusters. It generates a new mesh that is re-arranged in cluster order. This
        clustering is required as a pre-cursor to overdraw optimization. This function returns a mesh that is clustered. That is, the faces are sorted in
        ascending order by cluster ID. The number of clusters in the mesh will be equal to {@code pFaceClustersOut[ nFaces-1 ] + 1}.
        """,

        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p(
            "pVB",
            """
            a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
            value (X,Y,Z).
            """
        ),
        unsigned_int.const.p("pnIB", "an index buffer. Must be a triangle list."),
        AutoSizeDiv("nVBStride", "pVB")..unsigned_int("nVertices", "number of vertices. This must be non-zero and less than #MAX_VERTICES."),
        UseVariable..AutoSize(3, "pnIB", "pnClusteredIBOut")..unsigned_int("nFaces", "number of faces. This must be non-zero and less than #MAX_FACES."),
        unsigned_int(
            "nVBStride",
            "the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}."
        ),
        unsigned_int(
            "nTargetClusters",
            """
            a target number of clusters. The clustering algorithm will create at least this many clusters, but not more than {@code nFaces}. This value is only
            a hint. More clusters may be created if Tootle considers it necessary. (for example, if there are numerous connected components in the mesh).

            Passing 0 for this value causes Tootle to use an automatic method to determine when to stop creating clusters.
            """
        ),
        unsigned_int.p(
            "pnClusteredIBOut",
            "an array that will receive a copy of the index buffer, sorted by cluster ID. May not be #NULL. May equal {@code pnIB}."
        ),
        Check("nFaces + 1")..unsigned_int.p(
            "pnFaceClustersOut",
            """
            an array of {@code nFaces+1} unsigned ints, that will be filled with the cluster ID that was assigned to each face in the output index buffer. The
            last element of the array contains the number of cluster. This is of a full format type. May not be #NULL.
            """
        ),
        Check("nFaces")..nullable..unsigned_int.p(
            "pnFaceRemapOut",
            """
            an array that will receive a face re-mapping. May be #NULL. If not #NULL, must be an array of size {@code nFaces}. The {@code i}'th element of the
            output array contains the position of input face i in the new face ordering.
            """
        ),

        returnDoc = "one of: #OK, #OUT_OF_MEMORY, #INVALID_ARGS"
    )

    TootleResult(
        "FastOptimizeVCacheAndClusterMesh",
        """
        This function performs vertex cache optimization and clustering the mesh based on the algorithm from SIGGRAPH 2007. It produces the re-ordered index
        buffer and an array of the resulting clusters. The result can be used as inputs to #OptimizeOverdraw().
        """,

        unsigned_int.const.p("pnIB", "the input index buffer: 3 {@code unsigned int} per triangle."),
        UseVariable..AutoSize(3, "pnIB", "pnIBOut")..unsigned_int("nFaces", "the number of faces in the index buffer"),
        unsigned_int("nVertices", "the number of vertices in the vertex buffer"),
        unsigned_int("nCacheSize", "hardware cache size (12 to 24 are good options)"),
        unsigned_int.p("pnIBOut", "the updated index buffer (the output). May not be #NULL. May equal {@code pnIB}."),
        Check("nFaces + 1")..unsigned_int.p(
            "pnClustersOut",
            """
            the output clusters which is an array of {@code nFaces+1} {@code unsigned ints}. It is of a compact format type. Entry {@code i} and {@code i+1}
            mark all face ids in {@code [i, i+1)} to be in cluster {@code i}. The last element of the array contains the number of clusters. May not be #NULL.
            This has to be pre-allocated of size {@code nFaces+1}.
            """
        ),
        Check(1)..unsigned_int.p("pnNumClustersOut", "the total number of clusters in {@code pnClustersOut}"),
        float("fAlpha", "a linear parameter to compute lambda term from the algorithm. Pass #DEFAULT_ALPHA as a default."),

        returnDoc = "one of: #OK, #OUT_OF_MEMORY, #INVALID_ARGS"
    )

    TootleResult(
        "OptimizeOverdraw",
        """
        Given a clustered mesh, this function computes a cluster ordering that minimizes expected overdraw, and sorts the clusters according to this ordering.
        The input is a mesh whose faces are seperated into clusters. The clustering can be obtained by calling #ClusterMesh(), or the application can supply its
        own clustering.
        """,

        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p(
            "pVB",
            """
            a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
            value (X,Y,Z).
            """),
        unsigned_int.const.p("pnIB", "the mesh index buffer. This must be a triangle list. The faces must be clustered."),
        AutoSizeDiv("nVBStride", "pVB")..unsigned_int(
            "nVertices",
            "the number of vertices in the mesh. This must be non-zero and less than #MAX_VERTICES."
        ),
        UseVariable..AutoSize(3, "pnIB", "pnIBOut")..unsigned_int(
            "nFaces",
            "the number of faces in the mesh.  This must be non-zero and less than #MAX_FACES."
        ),
        unsigned_int("nVBStride", "the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}."),
        nullable..float.const.p(
            "pfViewpoint",
            """
            an array of viewpoints to use to measure overdraw. Each viewpoint must be a point on or in the unit sphere. When measuring overdraw, the mesh will
            be scaled and translated so that it lies inside the unit sphere. The mesh will be rendered with orthographic projections, with the camera centered
            at the given point looking at the origin. If this argument is #NULL, a default viewpoint set will be used.
            """
        ),
        AutoSize(3, "pfViewpoint")..unsigned_int("nViewpoints", "the number of viewpoints in the viewpoint array"),
        TootleFaceWinding("eFrontWinding", "the winding order of front-faces in the mesh", TootleFaceWindings),
        Check("nFaces + 1")..unsigned_int.const.p(
            "pnFaceClusters",
            """
            this array of {@code nFaces+1} size can be either of two types: a full format (the output of #ClusterMesh()) or a compact format (the output of
            #FastOptimizeVCacheAndClusterMesh()).

            The full format is an array of mapping for each face to the cluster ID. The entry {@code i} of this array contains the cluster ID of face
            {@code i}.

            The compact format is an array that maps every face ID between entry {@code i} and {@code i+1} to be in cluster {@code i}.

            For both formats, the last entry of the array ( {@code pnFaceClusters[ nFaces ]} ) should contains the number of total clusters.
            """
        ),
        nullable..unsigned_int.p("pnIBOut", "an array that will receive the re-ordered index buffer. May be #NULL. May equal {@code pnIB}."),
        Check("pnFaceClusters.get(nFaces)")..nullable..unsigned_int.p(
            "pnClusterRemapOut",
            """
            an array that will receive the cluster ordering. May be #NULL. If non-null, the size of the array must be equal to the number of clusters in the
            mesh. {@code pClusterRemapOut[i]} will be set to the ID of the cluster that should come {@code i}'th in the draw order.
            """
        ),
        TootleOverdrawOptimizer("eOverdrawOptimizer", "the algorithm selection for optimizing overdraw", TootleOverdrawOptimizers),

        returnDoc = "one of: #OK, #OUT_OF_MEMORY, #INVALID_ARGS #3D_API_ERROR, #NOT_INITIALIZED"
    )

    void(
        "Cleanup",
        "Frees all resources held by Tootle."
    )

    TootleResult(
        "Optimize",
        """
        This is a utility function that is provided for developers to perform the entire optimization for a mesh.

        The function calls the three core functions to create clusters for the mesh (#ClusterMesh()), optimize vertex cache for each cluster
        (#VCacheClusters()), and reorder the clusters to optimize overdraw (#OptimizeOverdraw()). It generates a new indices for faces that is optimized for
        post-transform vertex cache and overdraw.
        """,

        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p(
            "pVB",
            """
            a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
            value (X,Y,Z).
            """
        ),
        unsigned_int.const.p("pnIB", "an index buffer. Must be a triangle list."),
        AutoSizeDiv("nVBStride", "pVB")..unsigned_int("nVertices", "number of vertices. This must be non-zero and less than #MAX_VERTICES."),
        UseVariable..AutoSize(3, "pnIB", "pnIBOut")..unsigned_int("nFaces", "number of faces. This must be non-zero and less than #MAX_FACES."),
        unsigned_int(
            "nVBStride",
            "the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}."
        ),
        unsigned_int(
            "nCacheSize",
            """
            the number of vertices that will fit in cache. If the application does not know or care about the vertex cache size, then it should pass
            #DEFAULT_VCACHE_SIZE. This value must be non-zero.
            """
        ),
        nullable..float.const.p(
            "pViewpoints",
            """
            an array of viewpoints to use to measure overdraw. Each viewpoint must be a point on or in the unit sphere.  When measuring overdraw, the mesh will
            be scaled and translated so that it lies inside the unit sphere. The mesh will be rendered with orthographic projections, with the camera centered
            at the given point looking at the origin.  If this argument is #NULL, a default viewpoint set will be used.
            """
        ),
        AutoSize(3, "pViewpoints")..unsigned_int("nViewpoints", "the number of viewpoints in the viewpoint array"),
        TootleFaceWinding("eFrontWinding", "the winding order of front-faces in the model", TootleFaceWindings),
        unsigned_int.p("pnIBOut", "a pointer that will be filled with an optimized index buffer. May not be #NULL. May equal {@code pIB}."),
        Check(1)..nullable..unsigned_int.p("pnNumClustersOut", "the number of clusters generated by the algorithm. May be #NULL if the output is not requested."),
        TootleVCacheOptimizer("eVCacheOptimizer", "the selection for choosing the algorithm to optimize vertex cache", TootleVCacheOptimizers),
        TootleOverdrawOptimizer("eOverdrawOptimizer", "the algorithm selection for optimizing overdraw", TootleOverdrawOptimizers),

        returnDoc = "one of: #OK, #OUT_OF_MEMORY, #INVALID_ARGS"
    )

    TootleResult(
        "FastOptimize",
        """
        This is a utility function that performs the entire optimization using the new algorithm from SIGGRAPH 2007. This function performs vertex cache
        optimization and clustering, then optimize overdraw on the clusters generated. It generates a new indices for faces that is optimized for
        post-transform vertex cache and overdraw.
        """,

        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p(
            "pVB",
            """
            a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
            value (X,Y,Z).
            """
        ),
        unsigned_int.const.p("pnIB", "the input index buffer: 3 {@code unsigned int} per triangle"),
        AutoSizeDiv("nVBStride", "pVB")..unsigned_int("nVertices", "the number of vertices in the vertex buffer"),
        UseVariable..AutoSize(3, "pnIB", "pnIBOut")..unsigned_int("nFaces", "the number of faces in the index buffer"),
        unsigned_int(
            "nVBStride",
            "the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}."
        ),
        unsigned_int("nCacheSize", "hardware cache size (12 to 24 are good options)"),
        TootleFaceWinding("eFrontWinding", "the winding order of front-faces in the model", TootleFaceWindings),
        unsigned_int.p("pnIBOut", "the updated index buffer (the output). May not be #NULL. May equal {@code pnIB}."),
        Check(1)..nullable..unsigned_int.p("pnNumClustersOut", "the number of output clusters. May be #NULL if not requested."),
        float("fAlpha", "a linear parameter to compute lambda term from the algorithm. Pass #DEFAULT_ALPHA as a default."),

        returnDoc = "one of: #OK, #OUT_OF_MEMORY, #INVALID_ARGS"
    )

    TootleResult(
        "VCacheClusters",
        """
        This is a utility function to optimize vertex cache on a clustered index buffer. This function simply calls #OptimizeVCache() repeatedly. The faces
        within each cluster will be re-ordered, but the clustering will be maintained.
        """,

        unsigned_int.const.p("pnIB", "the index buffer to optimize. Must be a triangle list."),
        UseVariable..AutoSize(3, "pnIB", "pnIBOut")..unsigned_int("nFaces", "the number of faces in the index buffer. This must be non-zero and less than #MAX_FACES."),
        unsigned_int("nVertices", "the number of vertices in the model. This must be non-zero and less than #MAX_VERTICES."),
        unsigned_int(
            "nCacheSize",
            """
            the number of vertices that will fit in cache. If the application does not know or care about the vertex cache size, then it should pass
            #DEFAULT_VCACHE_SIZE. This value must be non-zero.
            """
        ),
        Check("nFaces + 1")..unsigned_int.const.p(
            "pnFaceClusters",
            """
            an array giving the cluster ID for each face. All faces in a particular cluster should appear consecutively in the index buffer, as well as in this
            array. It should be of size {@code nFaces+1}.
            """
        ),
        nullable..unsigned_int.p("pnIBOut", "a pointer that will be filled with an optimized index buffer. May be #NULL. May equal {@code pnIB}."),
        Check("nFaces")..nullable..unsigned_int.p(
            "pnFaceRemapOut",
            """
            a pointer to an array that will be filled with a face re-mapping. May be #NULL. This is an array of {@code nFaces} elements.

            Element {@code i} in the array will contain the position of input face {@code i} in the output face ordering.
            """
        ),
        TootleVCacheOptimizer("eVCacheOptimizer", "the selection for choosing the algorithm to optimize vertex cache", TootleVCacheOptimizers),

        returnDoc = "one of: #OK, #OUT_OF_MEMORY, #INVALID_ARGS"
    )

    TootleResult(
        "MeasureCacheEfficiency",
        """
        A utility function to simulate vertex processing and measures the cache efficiency of an index buffer.

        The return cache efficiency is the ACMR (Average Cache Miss Ratio) of the mesh. It ranges between 0.5 to 3. 0.5 is the best optimal value, 3 is the
        worst ratio.
        """,

        unsigned_int.const.p("pnIB", "the index buffer whose efficiency should be measured. Must be a triangle list."),
        AutoSize(3, "pnIB")..unsigned_int("nFaces", "the number of faces in the index buffer. This must be non-zero and less than #MAX_FACES."),
        unsigned_int(
            "nCacheSize",
            "the number of vertices that will fit in cache. If the application doesn't know or care, it should use #DEFAULT_VCACHE_SIZE."
        ),
        Check(1)..float.p("pfEfficiencyOut", "a pointer to receive the vertex cache efficiency. This is defined as the number of cache misses per triangle."),

        returnDoc = "one of: #OK, #OUT_OF_MEMORY, #INVALID_ARGS"
    )

    TootleResult(
        "MeasureOverdraw",
        """
        A utility function to measure the amount of overdraw that occurs over a set of views. Overdraw is defined as the number of pixels rendered divided by
        the number of pixels covered by an object, minus one.
        """,

        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p(
            "pVB",
            """
            a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
            value (X,Y,Z).
            """
        ),
        unsigned_int.const.p("pnIB", "the index buffer. Must be a triangle list."),
        AutoSizeDiv("nVBStride", "pVB")..unsigned_int("nVertices", "the number of vertices. This must be non-zero and less than #MAX_VERTICES."),
        AutoSize(3, "pnIB")..unsigned_int("nFaces", "the number of indices. This must be non-zero and less than #MAX_FACES."),
        unsigned_int(
            "nVBStride",
            "the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}."
        ),
        nullable..float.const.p(
            "pfViewpoint",
            """
            an array of viewpoints to use to measure overdraw. Each viewpoint must be a point on or in the unit sphere.  When measuring overdraw, the mesh will
            be scaled and translated so that it lies inside the unit sphere.  The mesh will be rendered with orthographic projections, with the camera centered
            at the given point looking at the origin. If this argument is #NULL, a default viewpoint set will be used.
            """
        ),
        AutoSize(3, "pfViewpoint")..unsigned_int("nViewpoints", "the number of viewpoints in the viewpoint array"),
        TootleFaceWinding("eFrontWinding", "the winding order of front-faces in the model"),
        Check(1)..nullable..float.p("pfAvgODOut", "a pointer to a variable to receive the average overdraw per pixel. May be #NULL."),
        Check(1)..nullable..float.p("pfMaxODOut", "a pointer to a variable to receive the maximum overdraw per pixel. May be #NULL."),
        TootleOverdrawOptimizer("eOverdrawOptimizer", "the algorithm selection for optimizing overdraw", TootleOverdrawOptimizers),

        returnDoc = "one of: #OK, #OUT_OF_MEMORY, #INVALID_ARGS, #NOT_INITIALIZED"
    )

    TootleResult(
        "OptimizeVertexMemory",
        """
        This function rearranges the vertex buffer's memory location based on the index buffer.

        Call this function after you have optimized the index buffer for vertex cache post-tranform and/or overdraw. The idea is to rearrange the memory
        location for vertex buffer such that it will be optimized for vertex prefetch cache. Typically vertices are fetched in a cacheline (more than one
        vertex at a time). Thus, the vertex in the next memory location will come for free if they are processed next in line. This is what we want to exploit.
        It will compute a new Vertex Buffer and Index Buffer (since the vertices have been reordered).
        """,

        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.const.p(
            "pVB",
            """
            a pointer to the vertex buffer. The pointer {@code pVB} must point to the vertex position. The vertex position must be a 3-component floating point
            value (X,Y,Z).
            """
        ),
        unsigned_int.const.p("pnIB", "the mesh index buffer. This must be a triangle list."),
        UseVariable..AutoSizeDiv("nVBStride", "pVB", "pVBOut")..unsigned_int("nVertices", "the number of vertices in the mesh. This must be non-zero and less than #MAX_VERTICES."),
        AutoSize(3, "pnIB", "pnIBOut")..unsigned_int("nFaces", "the number of faces in the mesh. This must be non-zero and less than #MAX_FACES."),
        unsigned_int(
            "nVBStride",
            "the distance between successive vertices in the vertex buffer, in bytes. This must be at least {@code 3*sizeof(float)}."
        ),
        MultiType(
            PointerMapping.DATA_FLOAT
        )..void.p("pVBOut", "the output vertex buffer. May be #NULL. May equal {@code pVB}."),
        unsigned_int.p("pnIBOut", "the output index buffer. May not be #NULL. May equal {@code pnIB}."),
        Check("nVertices")..nullable..unsigned_int.p(
            "pnVertexRemapOut",
            """
            an array that will receive a vertex re-mapping. May be #NULL if the output is not requested. If not #NULL, must be an array of size
            {@code nVertices}. The {@code i}'th element of the output array contains the position of the input vertex {@code i} in the new vertex re-ordering.
            """
        ),

        returnDoc = "one of: #OK, #OUT_OF_MEMORY, #INVALID_ARGS"
    )
}