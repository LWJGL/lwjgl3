/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include "overdraw.h"
#include "soup.h"

#ifndef _SOFTWARE_ONLY_VERSION
    #include "d3doverdrawwindow.h"
    #include "d3dwm.h"
    #include "gdiwm.h"
#endif

#include "TootleRaytracer.h"

//=================================================================================================================================
//
//          Internal state
//
//=================================================================================================================================

/// Flag to indicate whether or not the overdraw module has been initialized
static bool s_bInitialized = false;

/// The current soup being optimized
static Soup* s_pSoup = NULL;

#ifndef _SOFTWARE_ONLY_VERSION
    /// Overdraw calculation window
    D3DOverdrawWindow* s_pOverdrawWindow;
#endif

/// If number of clusters is higher than this, use the raytracing algorithm
const UINT RAYTRACE_CLUSTER_THRESHOLD = 225;



//=================================================================================================================================
//
//          Internal helper functions
//
//=================================================================================================================================
// compute face normals for the mesh.
static std::vector<float> ComputeFaceNormals(const float*        pfVB,
                                             const unsigned int* pnIB,
                                             unsigned int        nFaces);

//=================================================================================================================================
/// Computes the overdraw graph using the ray tracing implementation
///
/// \param pViewpoints         Array of viewpoints to use for overdraw computation.
/// \param nViewpoints         Size of the viewpoint array
/// \param bCullCCW            Specify true to cull CCW faces, otherwise cull CW faces.
/// \param rClusters           Array identifying the cluster for each face.  Faces are assumed sorted by cluster
/// \param nClusters           The number of clusters in rClusters.
/// \param rGraphOut           An array of edges that will contain the overdraw graph
/// \return TOOTLE_OK, or TOOTLE_OUT_OF_MEMORY
//=================================================================================================================================
TootleResult ODComputeGraphRaytrace(const float*            pViewpoints,
                                    unsigned int            nViewpoints,
                                    bool                    bCullCCW,
                                    const std::vector<int>& rClusters,
                                    UINT                    nClusters,
                                    std::vector<t_edge>&    rGraphOut)
{
    std::vector<Vector3> tn;

    if (!s_pSoup->ComputeTriNormals(tn))
    {
        return TOOTLE_OUT_OF_MEMORY;
    }

    // initialize per-cluster overdraw table
    TootleOverdrawTable fullgraph(nClusters);

    for (int i = 0; i < (int) nClusters; i++)
    {
        fullgraph[i].resize(nClusters);

        for (int j = 0; j < (int) nClusters; j++)
        {
            fullgraph[i][j] = 0;
        }
    }


    // initialize the ray tracer
    TootleRaytracer tr;
    const float* pVB          = &s_pSoup->v(0)[ 0 ];
    const UINT*  pIB          = (const UINT*) &s_pSoup->t(0)[ 0 ];
    const float* pFaceNormals = &tn[0][0];
    const UINT   nVertices    = (UINT) s_pSoup->v().size();
    const UINT   nFaces       = (UINT) s_pSoup->t().size();

    if (!tr.Init(pVB, pIB, pFaceNormals, nVertices, nFaces, (const UINT*) &rClusters[ 0 ]))
    {
        return TOOTLE_OUT_OF_MEMORY;
    }

    // generate the per-cluster overdraw table
    if (!tr.CalculateOverdraw(pViewpoints, nViewpoints, TOOTLE_RAYTRACE_IMAGE_SIZE, bCullCCW, &fullgraph))
    {
        return TOOTLE_OUT_OF_MEMORY;
    }

    // clean up the mess
    tr.Cleanup();

    // extract a directed graph from the overdraw table
    for (int i = 0; i < (int) nClusters; i++)
    {
        for (int j = 0; j < (int) nClusters; j++)
        {
            if (fullgraph[ i ] [ j ] > fullgraph[ j ][ i ])
            {
                t_edge t;
                t.from = i;
                t.to = j;
                t.cost = fullgraph[ i ][ j ] - fullgraph[ j ][ i ];

                rGraphOut.push_back (t);
            }
        }
    }

    return TOOTLE_OK;
}

#ifndef _SOFTWARE_ONLY_VERSION
//=================================================================================================================================
/// Computes the overdraw graph using the Direct3D implementation
///
/// \param pViewpoints    Array of viewpoints to use for overdraw computation.
/// \param nViewpoints    Size of the viewpoint array
/// \param rClusters      Array identifying the cluster for each face.  Faces are assumed sorted by cluster
/// \param rClusterStart  Array giving the index of the first triangle in each cluster.  The size should be one plus the number
///                        of clusters.  The value of the last element of this array is the number of triangles in the mesh
/// \param rGraphOut      An array of edges that will contain the overdraw graph
/// \return TOOTLE_OK, or TOOTLE_OUT_OF_MEMORY
//=================================================================================================================================
static TootleResult ODComputeGraphDirect3D(const float*            pViewpoints,
                                           unsigned int            nViewpoints,
                                           const std::vector<int>& rClusters,
                                           const std::vector<int>& rClusterStart,
                                           std::vector<t_edge>&    rGraphOut)
{
    s_pOverdrawWindow->SetViewpoint(pViewpoints, nViewpoints);

    // tell overdraw window about the clusters
    s_pOverdrawWindow->SetCluster(&rClusters, &rClusterStart);
    s_pOverdrawWindow->FitClusters();

    // we need to call SetSoup() here in case the index buffers have changed
    if (!s_pOverdrawWindow->SetSoup(s_pSoup))
    {
        return TOOTLE_3D_API_ERROR;
    }

    // do it
    if (!s_pOverdrawWindow->Graph(rGraphOut))
    {
        return TOOTLE_OUT_OF_MEMORY;
    }

    return TOOTLE_OK;
}
#endif

//=================================================================================================================================
//
//          Exported functions
//
//=================================================================================================================================


//=================================================================================================================================
/// Initializes the overdraw computation module with a set of viewpoints
/// \return TOOTLE_OK if successful.  May return other results if errors occur
//=================================================================================================================================

TootleResult ODInit()
{
#ifndef _SOFTWARE_ONLY_VERSION

    if (s_bInitialized)
    {
        // should not initialize twice
        return TOOTLE_INTERNAL_ERROR;
    }

    s_pOverdrawWindow = new D3DOverdrawWindow();

    // initialize overdraw window
    GDIWMOpen();

    if (!D3DWMOpen())
    {
        ODCleanup();
        errorf(("Failed to initialize Direct3D.  Make sure that D3D is properly installed."));
        return TOOTLE_3D_API_ERROR;
    }

    if (!D3DWMCreateWindow("Tootle...", s_pOverdrawWindow))
    {
        ODCleanup();
        errorf(("Failed to initialize Direct3D.  Make sure that D3D is properly installed."));
        return TOOTLE_3D_API_ERROR;
    }

    s_bInitialized = true;
#endif
    return TOOTLE_OK;
}

//=================================================================================================================================
/// \return True if ODInit was called successfully, false otherwise
//=================================================================================================================================
bool ODIsInitialized()
{
#ifdef _SOFTWARE_ONLY_VERSION
    return true;
#else
    return s_bInitialized;
#endif
}


//=================================================================================================================================
/// Sets the triangle soup that will be used for the overdraw computations
/// It is not necessary to call this method again when the contents of the soup changes.  This will be done
/// automatically before computing overdraw
///
/// \param pSoup         The soup to use for overdraw computation
/// \param eFrontWinding The front face winding for the soup
/// \return TOOTLE_OK
///         TOOTLE_INTERNAL_ERROR if ODInit() hasn't been called,
///         TOOTLE_3D_API_ERROR if VB/IB allocation fails
//=================================================================================================================================
TootleResult ODSetSoup(Soup* pSoup, TootleFaceWinding eFrontWinding)
{
#ifndef _SOFTWARE_ONLY_VERSION
    if (!s_bInitialized)
    {
        // ODInit has not been called
        return TOOTLE_INTERNAL_ERROR;
    }

    if (!s_pOverdrawWindow->SetSoup(pSoup))
    {
        return TOOTLE_3D_API_ERROR;
    }

    s_pOverdrawWindow->Fit();
#endif
    s_pSoup = pSoup;

#ifndef _SOFTWARE_ONLY_VERSION
    // set face winding for culling

    s_pOverdrawWindow->SetCulling(eFrontWinding != TOOTLE_CCW);    // cull CCW faces if they aren't front facing
#else
    // Unused parameter in this case
    (void)eFrontWinding;
#endif

    return TOOTLE_OK;
}

#ifndef _SOFTWARE_ONLY_VERSION
//=================================================================================================================================
/// Computes object overdraw for the triangle soup
/// \param pViewpoints  The viewpoints to use to measure overdraw
/// \param nViewpoints  The number of viewpoints in the array
/// \param fODAvg  (Output) Average overdraw
/// \param fODMax  (Output) Maximum overdraw
/// \return TOOTLE_OK,
///         TOOTLE_INTERNAL_ERROR if ODInit() has not been called
///         TOOTLE_3D_API_ERROR   if problems occur while measuring overdraw
//=================================================================================================================================
TootleResult ODObjectOverdraw(const float* pViewpoints, unsigned int nViewpoints, float& fODAvg, float& fODMax)
{
    if (!s_bInitialized || !s_pSoup)
    {
        // ODInit has not been called, or soup isn't set
        return TOOTLE_INTERNAL_ERROR;
    }

    s_pOverdrawWindow->SetViewpoint(pViewpoints, nViewpoints);

    // we need to call SetSoup() here in case the index buffers have changed
    if (!s_pOverdrawWindow->SetSoup(s_pSoup))
    {
        return TOOTLE_3D_API_ERROR;
    }

    // compute overdraw
    if (!s_pOverdrawWindow->Object(fODAvg, fODMax))
    {
        return TOOTLE_3D_API_ERROR;
    }

    return TOOTLE_OK;
}
#endif

//=================================================================================================================================
/// Computes the object overdraw for the triangle soup the ray tracing implementation
///
/// \param pfVB           A pointer to the vertex buffer.  The pointer pVB must point to the vertex position.  The vertex
///                        position must be a 3-component floating point value (X,Y,Z).
/// \param pnIB           The index buffer.  Must be a triangle list.
/// \param nVertices      The number of vertices. This must be non-zero and less than TOOTLE_MAX_VERTICES.
/// \param nFaces         The number of indices.  This must be non-zero and less than TOOTLE_MAX_FACES.
/// \param pViewpoints    The viewpoints to use to measure overdraw
/// \param nViewpoints    The number of viewpoints in the array
/// \param bCullCCW       Set to true to cull CCW faces, otherwise cull CW faces.
/// \param fODAvg         (Output) Average overdraw
/// \param fODMax         (Output) Maximum overdraw
/// \return TOOTLE_OK, TOOTLE_OUT_OF_MEMORY
//=================================================================================================================================
TootleResult ODObjectOverdrawRaytrace(const float*        pfVB,
                                      const unsigned int* pnIB,
                                      unsigned int        nVertices,
                                      unsigned int        nFaces,
                                      const float*        pViewpoints,
                                      unsigned int        nViewpoints,
                                      bool                bCullCCW,
                                      float&              fAvgOD,
                                      float&              fMaxOD)
{
    assert(pfVB);
    assert(pnIB);

    const std::vector<float> faceNormals = ComputeFaceNormals(pfVB, pnIB, nFaces);

    TootleRaytracer tr;

    if (!tr.Init (pfVB, pnIB, faceNormals.data (), nVertices, nFaces, NULL))
    {
        return TOOTLE_OUT_OF_MEMORY;
    }


    // generate the per-cluster overdraw table
    if (!tr.MeasureOverdraw(pViewpoints, nViewpoints, TOOTLE_RAYTRACE_IMAGE_SIZE, bCullCCW, fAvgOD, fMaxOD))
    {
        return TOOTLE_OUT_OF_MEMORY;
    }

    // clean up the mess
    tr.Cleanup();

    return TOOTLE_OK;
}

//=================================================================================================================================
/// Calculate face normals for the mesh.
///
/// \param pfVB            A pointer to the vertex buffer.  The pointer pVB must point to the vertex position.  The vertex
///                         position must be a 3-component floating point value (X,Y,Z).
/// \param pnIB            The index buffer.  Must be a triangle list.
/// \param nFaces          The number of indices.  This must be non-zero and less than TOOTLE_MAX_FACES.
/// \param pFaceNormals    The output face normals.  May not be NULL.  Need to be pre-allocated of size 3*nFaces.
/// \param bFrontCWWinding Specify true if the mesh has CW front face winding, false otherwise.
///
/// \return void
//=================================================================================================================================
std::vector<float> ComputeFaceNormals(const float*        pfVB,
                                      const unsigned int* pnIB,
                                      unsigned int        nFaces)
{
    assert(pnIB);

    // triangle index
    unsigned int nFirst;
    unsigned int nSecond;
    unsigned int nThird;

    std::vector<float> result (nFaces * 3);

    for (unsigned int i = 0; i < nFaces; i++)
    {
        nFirst  = pnIB[ 3 * i     ];
        nSecond = pnIB[ 3 * i + 1 ];
        nThird  = pnIB[ 3 * i + 2 ];

        const Vector3 p0(pfVB[ 3 * nFirst  ], pfVB[ 3 * nFirst  + 1 ], pfVB[ 3 * nFirst  + 2 ]);
        const Vector3 p1(pfVB[ 3 * nSecond ], pfVB[ 3 * nSecond + 1 ], pfVB[ 3 * nSecond + 2 ]);
        const Vector3 p2(pfVB[ 3 * nThird  ], pfVB[ 3 * nThird  + 1 ], pfVB[ 3 * nThird  + 2 ]);

        const Vector3 a = p0 - p1, b = p1 - p2;
        const Vector3 vNormal = Normalize(Cross(a, b));

        result [ 3 * i     ] = vNormal[ 0 ];
        result [ 3 * i + 1 ] = vNormal[ 1 ];
        result [ 3 * i + 2 ] = vNormal[ 2 ];
    }

    return result;
}

//=================================================================================================================================
/// \param pViewpoints         Array of viewpoints to use for overdraw computation.
/// \param nViewpoints         Size of the viewpoint array
/// \param bCullCCW            Specify true to cull CCW faces, otherwise cull CW faces.
/// \param rClusters           Array identifying the cluster for each face.  Faces are assumed sorted by cluster
/// \param rClusterStart       Array giving the index of the first triangle in each cluster.  The size should be one plus the number
///                             of clusters.  The value of the last element of this array is the number of triangles in the mesh
/// \param rGraphOut           An array of edges that will contain the overdraw graph
/// \return TOOTLE_OK, TOOTLE_INTERNAL_ERROR, TOOTLE_3D_API_ERROR, TOOTLE_OUT_OF_MEMORY
//=================================================================================================================================
TootleResult ODOverdrawGraph(const float*            pViewpoints,
                             unsigned int            nViewpoints,
                             bool                    bCullCCW,
                             const std::vector<int>& rClusters,
                             const std::vector<int>& rClusterStart,
                             std::vector<t_edge>&    rGraphOut,
                             TootleOverdrawOptimizer eOverdrawOptimizer)
{
#ifdef _SOFTWARE_ONLY_VERSION

    if (!s_pSoup)
    {
        // ODInit has not been called, or soup isn't set
        return TOOTLE_INTERNAL_ERROR;
    }

#else

    if (!s_bInitialized || !s_pSoup)
    {
        // ODInit has not been called, or soup isn't set
        return TOOTLE_INTERNAL_ERROR;
    }

#endif

    // sanity check
    if (rClusters.size() != s_pSoup->t().size())
    {
        return TOOTLE_INTERNAL_ERROR;
    }

    switch (eOverdrawOptimizer)
    {
        case TOOTLE_OVERDRAW_AUTO:
#ifndef _SOFTWARE_ONLY_VERSION

            // if the number of clusters is high enough, then its faster to use software rendering to compute overdraw
            // if it's small, then we want to use the GPU
            if (rClusterStart.size() > RAYTRACE_CLUSTER_THRESHOLD)
            {
                return ODComputeGraphRaytrace(pViewpoints, nViewpoints, bCullCCW,
                                              rClusters, (UINT) rClusterStart.size() - 1, rGraphOut);
            }
            else
            {
                return ODComputeGraphDirect3D(pViewpoints, nViewpoints, rClusters, rClusterStart, rGraphOut);
            }

            break;

        case TOOTLE_OVERDRAW_DIRECT3D:
            return ODComputeGraphDirect3D(pViewpoints, nViewpoints, rClusters, rClusterStart, rGraphOut);
            break;
#endif

        case TOOTLE_OVERDRAW_RAYTRACE:

            return ODComputeGraphRaytrace(pViewpoints, nViewpoints, bCullCCW,
                                          rClusters, (UINT) rClusterStart.size() - 1, rGraphOut);
            break;

        default:
            return TOOTLE_INTERNAL_ERROR;
            break;
    }
}



//=================================================================================================================================
/// Cleans up any memory allocated by the overdraw module
//=================================================================================================================================

void ODCleanup()
{
#ifndef _SOFTWARE_ONLY_VERSION

    if (!s_bInitialized)
    {
        // if we call Cleanup and we're not initialized, this is ok
        return;
    }

    if (s_pOverdrawWindow)
    {
        s_pOverdrawWindow->ReleaseBuffers();
        D3DWMDestroyWindow(s_pOverdrawWindow);
        delete s_pOverdrawWindow;
        s_pOverdrawWindow = NULL;
    }


    D3DWMClose();
    GDIWMClose();

    s_bInitialized = false;
#endif
}
