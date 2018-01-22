/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
/// \brief The interface for the Tootle library.
****************************************************************************************/
#ifndef _TOOTLE_LIB_H_
#define _TOOTLE_LIB_H_

#ifdef _LINUX
    #define TOOTLE_DLL
#else
    #define TOOTLE_DLL __declspec(dllexport)
#endif

/// \defgroup Tootle Tootle
// @{

/// The default vertex cache size
#define TOOTLE_DEFAULT_VCACHE_SIZE  16

/// The maximum allowed number of faces in the mesh
#define TOOTLE_MAX_FACES            0x7fffffff

/// The maximum allowed number of vertices in the mesh
#define TOOTLE_MAX_VERTICES         0x7fffffff

/// The parameter for TootleFastOptimize to create more clusters (lower number generates more clusters).
/// This parameter decides where to put extra breaks to create more clusters (refer to the SIGGRAPH 2007 paper
/// for the full description of the parameter.
#define TOOTLE_DEFAULT_ALPHA        0.75f

/// Enumeration for Tootle return codes
enum TootleResult
{
    NA_TOOTLE_RESULT,          ///< Default invalid choice
    TOOTLE_OK,                 ///< All is well
    TOOTLE_INVALID_ARGS,       ///< Illegal arguments were passed.
    TOOTLE_OUT_OF_MEMORY,      ///< Tootle ran out of memory while trying to complete the call
    TOOTLE_3D_API_ERROR,       ///< Errors occurred while setting up the 3D API.  This generally means that D3D isn't
    ///< installed properly
    TOOTLE_INTERNAL_ERROR ,    ///< Something happened that really, really shouldn't
    TOOTLE_NOT_INITIALIZED     ///< Tootle was not initialized before a function call
};

/// Enumeration for face winding order
enum TootleFaceWinding
{
    NA_TOOTLE_FACE_WINDING,    ///< Default invalid choice
    TOOTLE_CCW,                ///< Face is ordered counter-clockwise
    TOOTLE_CW                  ///< Face is ordered clockwise
};

/// Enumeration for the algorithm for vertex optimization
enum TootleVCacheOptimizer
{
    NA_TOOTLE_VCACHE_OPTIMIZER,   ///< Default invalid choice
    TOOTLE_VCACHE_AUTO,           ///< If vertex cache size is less than 7, use TSTRIPS algorithm otherwise TIPSY.
    TOOTLE_VCACHE_DIRECT3D,       ///< Use D3DXOptimizeFaces to optimize faces.
    TOOTLE_VCACHE_LSTRIPS,        ///< Build a list like triangle strips to optimize faces.
    TOOTLE_VCACHE_TIPSY           ///< Use TIPSY (the algorithm from SIGGRAPH 2007) to optimize faces.
};

/// Enumeration for the algorithm for overdraw optimization.
enum TootleOverdrawOptimizer
{
    NA_TOOTLE_OVERDRAW_OPTIMIZER,  ///< Default invalid choice.
    TOOTLE_OVERDRAW_AUTO,          ///< Use either Direct3D or raytracing to reorder clusters (depending on the number of clusters).
    TOOTLE_OVERDRAW_DIRECT3D,      ///< Use Direct3D rendering to reorder clusters to optimize overdraw (slow O(N^2)).
    TOOTLE_OVERDRAW_RAYTRACE,      ///< Use CPU raytracing to reorder clusters to optimize overdraw (slow O(N^2)).
    TOOTLE_OVERDRAW_FAST           ///< Use a fast approximation algorithm (from SIGGRAPH 2007) to reorder clusters.
};

//=================================================================================================================================
/// \brief Performs one-time initialization required by Tootle
//=================================================================================================================================
TootleResult TOOTLE_DLL TootleInit();

//=================================================================================================================================
/// This function performs vertex cache optimization on an index buffer.  It returns a face re-mapping if requested.
///  There are several choices for the vertex cache optimization:
///  (1) TOOTLE_VCACHE_AUTO     : if vertex cache size input is less than 7, it will use TSTRIPS otherwise TIPSY.
///  (2) TOOTLE_VCACHE_DIRECT3D : use D3DXOptimizeFaces to optimize indices.
///  (3) TOOTLE_VCACHE_LSTRIPS  : use LSTRIPS (a list like triangle strips) to optimize indices.
///  (4) TOOTLE_VCACHE_TIPSY    : use TIPSY (a new algorithm from SIGGRAPH 2007) to optimize indices.
///
/// \param pnIB             The index buffer to optimize.  Must be a triangle list.
/// \param nFaces           The number of faces in the index buffer.  This must non-zero and less than TOOTLE_MAX_FACES.
/// \param nVertices        The number of vertices in the model.  This must non-zero and less than TOOTLE_MAX_VERTICES.
/// \param nCacheSize       The number of vertices that will fit in cache.  If the application does not know or care about the
///                          vertex cache size, then it should pass TOOTLE_DEFAULT_VCACHE_SIZE.  This value must be non-zero.
/// \param pnIBOut          A pointer that will be filled with an optimized index buffer.  May be NULL.  May equal pnIB.
/// \param pnFaceRemapOut   A pointer to an array that will be filled with a face re-mapping.  May be NULL.  This is an array of
///                          nFaces elements.
///                          Element i in the array will contain the position of input face i in the output face ordering.
/// \param eVCacheOptimizer The selection for choosing the algorithm to optimize vertex cache.  There are four choices:
///                          TOOTLE_VCACHE_AUTO, TOOTLE_VCACHE_DIRECT3D, TOOTLE_VCACHE_LSTRIPS or TOOTLE_VCACHE_TIPSY.
///
/// \return                 Possible return codes:  TOOTLE_OK, TOOTLE_OUT_OF_MEMORY, TOOTLE_INVALID_ARGS
//=================================================================================================================================
TootleResult TOOTLE_DLL TootleOptimizeVCache(const unsigned int*   pnIB,
                                             unsigned int          nFaces,
                                             unsigned int          nVertices,
                                             unsigned int          nCacheSize,
                                             unsigned int*         pnIBOut,
                                             unsigned int*         pnFaceRemapOut,
                                             TootleVCacheOptimizer eVCacheOptimizer = TOOTLE_VCACHE_AUTO);

//=================================================================================================================================
///  This function partitions a mesh into a set of connected, roughly planar clusters.  It generates a new mesh that is re-arranged
///  in cluster order.  This clustering is required as a pre-cursor to overdraw optimization. This function returns a mesh that
///  is clustered.  That is, the faces are sorted in ascending order by cluster ID.  The number of clusters in the mesh will be
///  equal to pFaceClustersOut[ nFaces-1 ] + 1
///
/// \param pVB               A pointer to the vertex buffer.  The pointer pVB must point to the vertex position.  The vertex
///                           position must be a 3-component floating point value (X,Y,Z).
/// \param pnIB               An index buffer.  Must be a triangle list.
/// \param nVertices         Number of vertices.  This must be non-zero and less than TOOTLE_MAX_VERTICES.
/// \param nFaces            Number of faces.  This must be non-zero and less than TOOTLE_MAX_FACES.
/// \param nVBStride         The distance between successive vertices in the vertex buffer, in bytes.  This must be at least
///                           3*sizeof(float).
/// \param nTargetClusters   A target number of clusters.  The clustering algorithm will create at least this many clusters,
///                            but not more than nFaces.  This value is only a hint.  More clusters may be created if Tootle
///                           considers it necessary. (for example, if there are numerous connected components in the mesh).
///                           Passing 0 for this value causes Tootle to use an automatic method to determine when to stop creating
///                            clusters.
/// \param pnClusteredIBOut  An array that will receive a copy of the index buffer, sorted by cluster ID.
///                           May not be NULL.  May equal pIB.
/// \param pnFaceClustersOut An array of nFaces+1 unsigned ints, that will be filled with the cluster ID that was assigned to
///                           each face in the output index buffer.  The last element of the array contains the number of
///                           cluster. This is of a full format type.  May not be NULL.
/// \param pnFaceRemapOut    An array that will receive a face re-mapping.  May be NULL.  If not NULL, must be an array of size
///                           nFaces. The i'th element of the output array contains the position of input face i in the new face
///                           ordering.
/// \return  Possible return codes:  TOOTLE_INVALID_ARGS, TOOTLE_OUT_OF_MEMORY, TOOTLE_OK
//=================================================================================================================================
TootleResult TOOTLE_DLL TootleClusterMesh(const void*         pVB,
                                          const unsigned int* pnIB,
                                          unsigned int        nVertices,
                                          unsigned int        nFaces,
                                          unsigned int        nVBStride,
                                          unsigned int        nTargetClusters,
                                          unsigned int*       pnClusteredIBOut,
                                          unsigned int*       pnFaceClustersOut,
                                          unsigned int*       pnFaceRemapOut);

//=================================================================================================================================
/// This function performs vertex cache optimization and clustering the mesh based on the algorithm from SIGGRAPH 2007.
///  It produces the re-ordered index buffer and an array of the resulting clusters.
///  The result can be used as inputs to TootleOptimizeOverdraw.
///
/// \param pnIB             The input index buffer: 3 unsigned int per triangle.
/// \param nFaces           The number of faces in the index buffer.
/// \param nVertices        The number of vertices in the vertex buffer.
/// \param nCacheSize       Hardware cache size (12 to 24 are good options).
/// \param pnIBOut          The updated index buffer (the output).  May not be NULL.
/// \param pnClustersOut    The output clusters which is an array of nFaces+1 unsigned ints.  It is of a compact format type.
///                          Entry i and i+1 mark the all face ids in [i, i+1) to be in cluster i.  The last element of the array
///                          contains the number of clusters. May not be NULL.  This has to be pre-allocated of size nFaces+1.
/// \param pnNumClustersOut The total number of clusters in pnClustersOut.
/// \param fAlpha           a linear parameter to compute lambda term from the algorithm.  Pass TOOTLE_DEFAULT_ALPHA as a default.
///
/// \return  Possible return codes:  TOOTLE_INVALID_ARGS, TOOTLE_OUT_OF_MEMORY or TOOTLE_OK
//=================================================================================================================================
TootleResult TOOTLE_DLL TootleFastOptimizeVCacheAndClusterMesh(const unsigned int* pnIB,
                                                               unsigned int        nFaces,
                                                               unsigned int        nVertices,
                                                               unsigned int        nCacheSize,
                                                               unsigned int*       pnIBOut,
                                                               unsigned int*       pnClustersOut,
                                                               unsigned int*       pnNumClustersOut,
                                                               float               fAlpha = TOOTLE_DEFAULT_ALPHA);

//=================================================================================================================================
/// Given a clustered mesh, this function computes a cluster ordering that minimizes expected overdraw, and sorts the clusters
///  according to this ordering.  The input is a mesh whose faces are seperated into clusters.  The clustering can be obtained by
///  calling TootleClusterMesh, or the application can supply its own clustering.
///
/// \param pVB                A pointer to the vertex buffer.  The pointer pVB must point to the vertex position.  The vertex
///                            position must be a 3-component floating point value (X,Y,Z).
/// \param pnIB               The mesh index buffer.  This must be a triangle list.  The faces must be clustered
/// \param nVertices          The number of vertices in the mesh.  This must be non-zero and less than TOOTLE_MAX_VERTICES.
/// \param nFaces             The number of faces in the mesh.  This must be non-zero and less than TOOTLE_MAX_FACES.
/// \param nVBStride          The distance between successive vertices in the vertex buffer, in bytes.  This must be at least
///                            3*sizeof(float).
/// \param pfViewpoint        An array of viewpoints to use to measure overdraw.  Each viewpoint must be a point on or in the
///                            unit sphere.  When measuring overdraw, the mesh will be scaled and translated so that it lies
///                            inside the unit sphere.  The mesh will be rendered with orthographic projections, with the camera
///                            centered at the given point looking at the origin.  If this argument is NULL, a default viewpoint
///                            set will be used.
/// \param nViewpoints        The number of viewpoints in the viewpoint array.
/// \param eFrontWinding      The winding order of front-faces in the mesh.
/// \param pnFaceClusters     This array of nFaces+1 size can be either of two types: a full format (the output of
///                            TootleClusterMesh) or a compact format (the output of TootleFastOptimizeVCacheAndClusterMesh).
///                            The full format is an array of mapping for each face to the cluster ID.  The entry i of this
///                            array contains the cluster ID of face i.
///                            The compact format is an array that maps every face ID between entry i and i+1 to be in cluster i.
///                            For both format, the last entry of the array ( pnFaceClusters[ nFaces ] ) should contains the number
///                            of total clusters.
/// \param pnIBOut            An array that will receive the re-ordered index buffer.  May be NULL.  May equal pnIB.
/// \param pnClusterRemapOut  An array that will receive the cluster ordering.  May be NULL.  If non-null, the size of the array
///                            must be equal to the number of clusters in the mesh.  pClusterRemapOut[i] will be set to the ID
///                            of the cluster that should come i'th in the draw order.
/// \param eOverdrawOptimizer The algorithm selection for optimizing overdraw.  Pass either TOOTLE_OVERDRAW_FAST (default),
///                            TOOTLE_OVERDRAW_AUTO, TOOTLE_OVERDRAW_DIRECT3D, or TOOTLE_OVERDRAW_RAYTRACE.
/// \return Possible return codes:  TOOTLE_OK, TOOTLE_INVALID_ARGS, TOOTLE_OUT_OF_MEMORY, TOOTLE_3D_API_ERROR, or
///                                  TOOTLE_NOT_INITIALIZED
//=================================================================================================================================
TootleResult TOOTLE_DLL TootleOptimizeOverdraw(const void*             pVB,
                                               const unsigned int*     pnIB,
                                               unsigned int            nVertices,
                                               unsigned int            nFaces,
                                               unsigned int            nVBStride,
                                               const float*            pfViewpoint,
                                               unsigned int            nViewpoints,
                                               TootleFaceWinding       eFrontWinding,
                                               const unsigned int*     pnFaceClusters,
                                               unsigned int*           pnIBOut,
                                               unsigned int*           pnClusterRemapOut,
                                               TootleOverdrawOptimizer eOverdrawOptimizer = TOOTLE_OVERDRAW_FAST);

//=================================================================================================================================
/// Frees all resources held by Tootle
//=================================================================================================================================
void TOOTLE_DLL TootleCleanup();

//=================================================================================================================================
/// This is a utility function that is provided for developers to perform the entire optimization for a mesh.
///  The function calls the three core functions to create clusters for the mesh (TootleClusterMesh), optimize vertex cache
///  for each cluster (TootleVCacheClusters), and reorder the clusters to optimize overdraw (TootleOptimizeOverdraw).
///  It generates a new indices for faces that is optimized for post-transform vertex cache and overdraw.
///  For the eVCacheOptimizer, it controls the selection of the vertex cache optimization algorithm which are:
///  (1) TOOTLE_VCACHE_AUTO     : if vertex cache size input is less than 7, it will use TSTRIPS otherwise TIPSY.
///  (2) TOOTLE_VCACHE_DIRECT3D : use D3DXOptimizeFaces to optimize indices.
///  (3) TOOTLE_VCACHE_LSTRIPS  : use LSTRIPS (triangle strips) to optimize indices.
///  (4) TOOTLE_VCACHE_TIPSY    : use TIPSY (a new algorithm from SIGGRAPH 2007) to optimize indices.
///
/// \param pVB                A pointer to the vertex buffer.  The pointer pVB must point to the vertex position.  The vertex
///                            position must be a 3-component floating point value (X,Y,Z).
/// \param pnIB               An index buffer.  Must be a triangle list.
/// \param nVertices          Number of vertices.  This must be non-zero and less than TOOTLE_MAX_VERTICES.
/// \param nFaces             Number of faces.  This must be non-zero and less than TOOTLE_MAX_FACES.
/// \param nVBStride          The distance between successive vertices in the vertex buffer, in bytes.  This must be at least
///                            3*sizeof(float).
/// \param nCacheSize         The number of vertices that will fit in cache.  If the application does not know or care about the
///                            vertex cache size, then it should pass TOOTLE_DEFAULT_VCACHE_SIZE.  This value must be non-zero.
/// \param pViewpoints        An array of viewpoints to use to measure overdraw.  Each viewpoint must be a point on or in the
///                            unit sphere.  When measuring overdraw, the mesh will be scaled and translated so that it lies
///                            inside the unit sphere.  The mesh will be rendered with orthographic projections, with the camera
///                            centered at the given point looking at the origin.  If this argument is NULL, a default viewpoint
///                            set will be used.
/// \param nViewpoints        The number of viewpoints in the viewpoint array.
/// \param eFrontWinding      The winding order of front-faces in the model.
/// \param eVCacheOptimizer   The selection for choosing the algorithm to optimize vertex cache.  There are four choices:
///                            TOOTLE_VCACHE_AUTO, TOOTLE_VCACHE_DIRECT3D, TOOTLE_VCACHE_LSTRIPS or TOOTLE_VCACHE_TIPSY.
/// \param pnIBOut            A pointer that will be filled with an optimized index buffer.  May not be NULL.  May equal pIB.
/// \param pnNumClustersOut   The number of clusters generated by the algorithm.  May be NULL if the output is not requested.
/// \param eOverdrawOptimizer The algorithm selection for optimizing overdraw.  Pass either TOOTLE_OVERDRAW_FAST (default),
///                            TOOTLE_OVERDRAW_AUTO, TOOTLE_OVERDRAW_DIRECT3D, or TOOTLE_OVERDRAW_RAYTRACE.
///
/// \return  Possible return codes:  TOOTLE_INVALID_ARGS, TOOTLE_OUT_OF_MEMORY, TOOTLE_OK
//=================================================================================================================================
TootleResult TOOTLE_DLL TootleOptimize(const void*             pVB,
                                       const unsigned int*     pnIB,
                                       unsigned int            nVertices,
                                       unsigned int            nFaces,
                                       unsigned int            nVBStride,
                                       unsigned int            nCacheSize,
                                       const float*            pViewpoints,
                                       unsigned int            nViewpoints,
                                       TootleFaceWinding       eFrontWinding,
                                       unsigned int*           pnIBOut,
                                       unsigned int*           pnNumClustersOut,
                                       TootleVCacheOptimizer   eVCacheOptimizer   = TOOTLE_VCACHE_AUTO,
                                       TootleOverdrawOptimizer eOverdrawOptimizer = TOOTLE_OVERDRAW_FAST);

//=================================================================================================================================
/// This is a utility function that performs the entire optimization using the new algorithm from SIGGRAPH 2007.
///  This function performs vertex cache optimization and clustering, then optimize overdraw on the clusters generated.
///  It generates a new indices for faces that is optimized for post-transform vertex cache and overdraw.
///
/// \param pVB              A pointer to the vertex buffer.  The pointer pVB must point to the vertex position.  The vertex
///                          position must be a 3-component floating point value (X,Y,Z).
/// \param pnIB             The input index buffer: 3 unsigned int per triangle.
/// \param nVertices        The number of vertices in the vertex buffer.
/// \param nFaces           The number of faces in the index buffer.
/// \param nVBStride        The distance between successive vertices in the vertex buffer, in bytes.  This must be at least
///                          3*sizeof(float).
/// \param nCacheSize       Hardware cache size (12 to 24 are good options).
/// \param eFrontWinding    The winding order of front-faces in the model.
/// \param pnIBOut          The updated index buffer (the output).  May not be NULL.
/// \param pnNumClustersOut The number of output clusters.  May be NULL if not requested.
/// \param fAlpha           a linear parameter to compute lambda term from the algorithm.  Pass TOOTLE_DEFAULT_ALPHA as a default.
///
/// \return  Possible return codes:  TOOTLE_INVALID_ARGS, TOOTLE_OUT_OF_MEMORY or TOOTLE_OK
//=================================================================================================================================
TootleResult TOOTLE_DLL TootleFastOptimize(const void*         pVB,
                                           const unsigned int* pnIB,
                                           unsigned int        nVertices,
                                           unsigned int        nFaces,
                                           unsigned int        nVBStride,
                                           unsigned int        nCacheSize,
                                           TootleFaceWinding   eFrontWinding,
                                           unsigned int*       pnIBOut,
                                           unsigned int*       pnNumClustersOut,
                                           float               fAlpha = TOOTLE_DEFAULT_ALPHA);

//=================================================================================================================================
/// This is a utility function to optimize vertex cache on a clustered index buffer.  This function simply calls
///  TootleOptimizeVCache repeatedly.  The faces within each cluster will be re-ordered, but the clustering will be maintained
///  For the eVCacheOptimizer, it controls the selection of the vertex cache optimization algorithm which are:
///  (1) TOOTLE_VCACHE_AUTO     : if vertex cache size input is less than 7, it will use TSTRIPS otherwise TIPSY.
///  (2) TOOTLE_VCACHE_DIRECT3D : use D3DXOptimizeFaces to optimize indices.
///  (3) TOOTLE_VCACHE_TSTRIPS  : use TSTRIPS (triangle strips) to optimize indices.
///  (4) TOOTLE_VCACHE_TIPSY    : use TIPSY (a new algorithm from SIGGRAPH 2007) to optimize indices.
///
/// \param pnIB             The index buffer to optimize.  Must be a triangle list.
/// \param nFaces           The number of faces in the index buffer.  This must be non-zero and less than TOOTLE_MAX_FACES.
/// \param nVertices        The number of vertices in the model.  This must be non-zero and less than TOOTLE_MAX_VERTICES.
/// \param nCacheSize       The number of vertices that will fit in cache.  If the application does not know or care about the
///                          vertex cache size, then it should pass TOOTLE_DEFAULT_VCACHE_SIZE.  This value must be non-zero.
/// \param pnFaceClusters   An array giving the cluster ID for each face.  All faces in a particular cluster should appear
///                          consecutively in the index buffer, as well as in this array.  It should be of size nFaces+1.
/// \param pnIBOut          A pointer that will be filled with an optimized index buffer.  May be NULL.  May equal pnIB.
/// \param pnFaceRemapOut   A pointer to an array that will be filled with a face re-mapping.  May be NULL.  This is an array of
///                          nFaces elements.
///                          Element i in the array will contain the position of input face i in the output face ordering.
/// \param eVCacheOptimizer The selection for choosing the algorithm to optimize vertex cache.  There are four choices:
///                          TOOTLE_VCACHE_AUTO, TOOTLE_VCACHE_DIRECT3D, TOOTLE_VCACHE_LSTRIPS or TOOTLE_VCACHE_TIPSY.
/// \return                 Possible return codes:  TOOTLE_OK, TOOTLE_OUT_OF_MEMORY, TOOTLE_INVALID_ARGS
//=================================================================================================================================
TootleResult TOOTLE_DLL TootleVCacheClusters(const unsigned int*   pnIB,
                                             unsigned int          nFaces,
                                             unsigned int          nVertices,
                                             unsigned int          nCacheSize,
                                             const unsigned int*   pnFaceClusters,
                                             unsigned int*         pnIBOut,
                                             unsigned int*         pnFaceRemapOut,
                                             TootleVCacheOptimizer eVCacheOptimizer = TOOTLE_VCACHE_AUTO);

//=================================================================================================================================
/// A utility function to simulate vertex processing and measures the cache efficiency of an index buffer.
///  The return cache efficiency is the ACMR (Average Cache Miss Ratio) of the mesh.  It ranges between 0.5 to 3.
///  0.5 is the best optimal value, 3 is the worst ratio.
///
/// \param pnIB            The index buffer whose efficiency should be measured.  Must be a triangle list.
/// \param nFaces          The number of faces in the index buffer.  This must be non-zero and less than TOOTLE_MAX_FACES.
/// \param nCacheSize      The number of vertices that will fit in cache. If the application doesn't know or care, it should use
///                         TOOTLE_DEFAULT_VCACHE_SIZE.
/// \param pfEfficiencyOut A pointer to receive the vertex cache efficiency.  This is defined as the number of cache misses per
///                         triangle.
/// \return  Possible return codes:  TOOTLE_OK, TOOTLE_OUT_OF_MEMORY, TOOTLE_INVALID_ARGS
//=================================================================================================================================
TootleResult TOOTLE_DLL TootleMeasureCacheEfficiency(const unsigned int* pnIB,
                                                     unsigned int        nFaces,
                                                     unsigned int        nCacheSize,
                                                     float*              pfEfficiencyOut);

//=================================================================================================================================
/// A utility function to measure the amount of overdraw that occurs over a set of views.  Overdraw is defined as the number of
/// pixels rendered divided by the number of pixels covered by an object, minus one.
///
/// \param pVB                A pointer to the vertex buffer.  The pointer pVB must point to the vertex position.  The vertex
///                            position must be a 3-component floating point value (X,Y,Z).
/// \param pnIB               The index buffer.  Must be a triangle list.
/// \param nVertices          The number of vertices. This must be non-zero and less than TOOTLE_MAX_VERTICES.
/// \param nFaces             The number of indices.  This must be non-zero and less than TOOTLE_MAX_FACES.
/// \param nVBStride          The distance between successive vertices in the vertex buffer, in bytes.  This must be at least
///                            3*sizeof(float).
/// \param pfViewpoint        An array of viewpoints to use to measure overdraw.  Each viewpoint must be a point on or in the
///                            unit sphere.  When measuring overdraw, the mesh will be scaled and translated so that it lies inside
///                            the unit sphere.  The mesh will be rendered with orthographic projections, with the camera centered
///                            at the given point looking at the origin.  If this argument is NULL, a default viewpoint set
///                            will be used.
/// \param nViewpoints        The number of viewpoints in the viewpoint array.
/// \param eFrontWinding      The winding order of front-faces in the model.
/// \param pfAvgODOut         A pointer to a variable to receive the average overdraw per pixel.  May be NULL.
/// \param pfMaxODOut         A pointer to a variable to receive the maximum overdraw per pixel.  May be NULL.
/// \param eOverdrawOptimizer The algorithm selection for optimizing overdraw.  Pass either TOOTLE_OVERDRAW_DIRECT3D (default) or
///                            TOOTLE_OVERDRAW_RAYTRACE.  If you pass any other tokens, it will default to
///                            TOOTLE_OVERDRAW_DIRECT3D.  For software only build, it will automatically choose
///                            TOOTLE_OVERDRAW_RAYTRACE.
///
/// \return Possible return codes:  TOOTLE_INVALID_ARGS, TOOTLE_OUT_OF_MEMORY, TOOTLE_NOT_INITIALIZED, or TOOTLE_OK.
//=================================================================================================================================
TootleResult TOOTLE_DLL TootleMeasureOverdraw(const void*             pVB,
                                              const unsigned int*     pnIB,
                                              unsigned int            nVertices,
                                              unsigned int            nFaces,
                                              unsigned int            nVBStride,
                                              const float*            pfViewpoint,
                                              unsigned int            nViewpoints,
                                              TootleFaceWinding       eFrontWinding,
                                              float*                  pfAvgODOut,
                                              float*                  pfMaxODOut,
                                              TootleOverdrawOptimizer eOverdrawOptimizer = TOOTLE_OVERDRAW_DIRECT3D);

//=================================================================================================================================
/// This function rearrange the vertex buffer's memory location based on the index buffer.
///  Call this function after you have optimized the index buffer for vertex cache post-tranform and/or overdraw.
///  The idea is to rearrange the memory location for vertex buffer such that it will be optimized for vertex prefetch cache.
///  Typically vertices are fetched in a cacheline (more than one vertex at a time).  Thus, the vertex in the next memory location
///  will come for free if they are processed next in line.  This is what we want to exploit.
///  It will compute a new Vertex Buffer and Index Buffer (since the vertices have been reordered).
///
/// \param pVB                  A pointer to the vertex buffer.  The pointer pVB must point to the vertex position.  The vertex
///                              position must be a 3-component floating point value (X,Y,Z).
/// \param pnIB                 The mesh index buffer.  This must be a triangle list.
/// \param nVertices            The number of vertices in the mesh.  This must be non-zero and less than TOOTLE_MAX_VERTICES.
/// \param nFaces               The number of faces in the mesh.  This must be non-zero and less than TOOTLE_MAX_FACES.
/// \param nVBStride            The distance between successive vertices in the vertex buffer, in bytes.  This must be at least
///                              3*sizeof(float).
/// \param pVBOut               The output vertex buffer. May not be NULL.  May equal pVB.
/// \param pnIBOut              The output index buffer.  May not be NULL.  May equal pnIB.
/// \param pnVertexRemapOut     An array that will receive a vertex re-mapping.  May be NULL if the output is not requested.
///                              If not NULL, must be an array of size nVertices.  The i'th element of the output array contains
///                               the position of the input vertex i in the new vertex re-ordering.
///
/// \return Possible return codes: TOOTLE_INVALID_ARGS, TOOTLE_OUT_OF_MEMORY, or TOOTLE_OK
//=================================================================================================================================
TootleResult TOOTLE_DLL TootleOptimizeVertexMemory(const void*         pVB,
                                                   const unsigned int* pnIB,
                                                   unsigned int        nVertices,
                                                   unsigned int        nFaces,
                                                   unsigned int        nVBStride,
                                                   void*               pVBOut,
                                                   unsigned int*       pnIBOut,
                                                   unsigned int*       pnVertexRemapOut);

// @}

#endif
