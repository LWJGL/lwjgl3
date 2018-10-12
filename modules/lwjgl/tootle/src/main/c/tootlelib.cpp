/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include <assert.h>
#include "TootlePCH.h"

#ifndef _SOFTWARE_ONLY_VERSION
    #include "gdiwm.h"
    #include "d3dwm.h"
#endif

#include "soup.h"
#include "clustering.h"
#include "error.h"
#include "overdraw.h"

#include "tootlelib.h"
#include "triorder.h"
#include "viewpoints.h"
#include "Stripifier.h"

#ifdef _DX11_1_
#include "directxmesh.h"
#endif

#define AMD_TOOTLE_API_FUNCTION_BEGIN try {
#define AMD_TOOTLE_API_FUNCTION_END     \
    }                                   \
    catch (const std::bad_alloc&)       \
    {                                   \
        return TOOTLE_OUT_OF_MEMORY;    \
    }                                   \
    catch (const std::exception&)       \
    {                                   \
        return TOOTLE_INTERNAL_ERROR;   \
    }                                   \
    catch (...)                         \
    {                                   \
        return TOOTLE_INTERNAL_ERROR;   \
    }

//=================================================================================================================================
//
//          Static functions
//
//=================================================================================================================================

// compute face mapping from one index to another index
static TootleResult FindFaceMappingFromIndex(const unsigned int* pnIB,
                                             const unsigned int* pnIB2,
                                             const unsigned int  nIndex,
                                             const unsigned int  nFaces,
                                             unsigned int*       nFaceMapOut);

#ifndef _SOFTWARE_ONLY_VERSION
// optimize vertex cache using D3DXOptimizeFaces
static TootleResult TootleOptimizeVCacheDirect3D(const unsigned int*   pnIB,
                                                 unsigned int          nFaces,
                                                 unsigned int          nVertices,
                                                 unsigned int          nCacheSize,
                                                 unsigned int*         pnIBOut,
                                                 unsigned int*         pnFaceRemapOut);
#endif

// optimize vertex cache using triangle strips (not exactly triangle strips but list like triangle strips)
static TootleResult TootleOptimizeVCacheLStrips(const unsigned int*   pnIB,
                                                unsigned int          nFaces,
                                                unsigned int          nVertices,
                                                unsigned int          nCacheSize,
                                                unsigned int*         pnIBOut,
                                                unsigned int*         pnFaceRemapOut);

// optimize vertex cache using tipsy algorithm from SIGGRAPH 2007
static TootleResult TootleOptimizeVCacheTipsy(const unsigned int*   pnIB,
                                              unsigned int          nFaces,
                                              unsigned int          nVertices,
                                              unsigned int          nCacheSize,
                                              unsigned int*         pnIBOut,
                                              unsigned int*         pnFaceRemapOut);

// optimize overdraw by reordering clusters based on Direct3D rendering
static TootleResult TootleOptimizeOverdrawDirect3DAndRaytrace(const void*             pVB,
                                                              const unsigned int*     pnIB,
                                                              unsigned int            nVertices,
                                                              unsigned int            nFaces,
                                                              unsigned int            nVBStride,
                                                              const float*            pfViewpoint,
                                                              unsigned int            nViewpoints,
                                                              TootleFaceWinding       eFrontWinding,
                                                              TootleOverdrawOptimizer eOverdrawOptimizer,
                                                              const unsigned int*     pnFaceClusters,
                                                              unsigned int*           pnIBOut,
                                                              unsigned int*           pnClusterRemapOut);

// optimize overdraw by sorting the clusters based on the algorithm in SIGGRAPH 2007
static TootleResult TootleOptimizeOverdrawFastApproximation(const void*         pVB,
                                                            const unsigned int* pnIB,
                                                            unsigned int        nVertices,
                                                            unsigned int        nFaces,
                                                            unsigned int        nVBStride,
                                                            TootleFaceWinding   eFrontWinding,
                                                            const unsigned int* pnFaceClusters,
                                                            unsigned int*       pnIBOut,
                                                            unsigned int*       pnClusterRemapOut);

#ifndef _SOFTWARE_ONLY_VERSION
// measure overdraw using Direct3D calls
static TootleResult TootleMeasureOverdrawDirect3D(const void*         pVB,
                                                  const unsigned int* pnIB,
                                                  unsigned int        nVertices,
                                                  unsigned int        nFaces,
                                                  unsigned int        nVBStride,
                                                  const float*        pfViewpoint,
                                                  unsigned int        nViewpoints,
                                                  TootleFaceWinding   eFrontWinding,
                                                  float*              pfAvgODOut,
                                                  float*              pfMaxODOut);
#endif

// measure overdraw using software rendering via raytracing
static TootleResult TootleMeasureOverdrawRaytrace(const void*         pVB,
                                                  const unsigned int* pnIB,
                                                  unsigned int        nVertices,
                                                  unsigned int        nFaces,
                                                  unsigned int        nVBStride,
                                                  const float*        pfViewpoint,
                                                  unsigned int        nViewpoints,
                                                  TootleFaceWinding   eFrontWinding,
                                                  float*              pfAvgODOut,
                                                  float*              pfMaxODOut);


// converting the cluster array IDs from the full (v1.2 tootle) format to a compact format (v2.0 tootle).
static TootleResult ConvertClusterArrayFromFullToCompact(unsigned int* pnID, unsigned int nLength);

// converting the cluster array IDs from the compact (v2.0 tootle) format to a full format (v1.2 tootle).
static TootleResult ConvertClusterArrayFromCompactToFull(unsigned int* pnID, unsigned int nLength);

// check whether the cluster array IDs is of type full format (v1.2 tootle).
static bool IsClusterArrayFullFormat(const unsigned int* pnID, unsigned int nFaces);

// check whether the cluster array IDs is of type compact format (v2.0 tootle).
static bool IsClusterArrayCompactFormat(const unsigned int* pnID, unsigned int nFaces);

TootleResult TOOTLE_DLL TootleInit()
{
    AMD_TOOTLE_API_FUNCTION_BEGIN

    // initialize overdraw module
    if (!ODIsInitialized())
    {
        return ODInit();
    }

    return TOOTLE_OK;

    AMD_TOOTLE_API_FUNCTION_END
}

static TootleResult FindFaceMappingFromIndex(const unsigned int* pnIB,
                                             const unsigned int* pnIB2,
                                             const unsigned int  nIndex,
                                             const unsigned int  nFaces,
                                             unsigned int*       pnFaceMapOut)
{
    // sanity checks
    assert(pnIB);
    assert(pnIB2);
    assert(pnFaceMapOut);

    /* LWJGL: bug?
    if (nIndex == 0 || nIndex > TOOTLE_MAX_FACES)
    {
        errorf(("FindFaceMappingFromIndex: nIndex is invalid"));
        return TOOTLE_INVALID_ARGS;
    }*/

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("FindFaceMappingFromIndex: nFaces is invalid"));
        return TOOTLE_INVALID_ARGS;
    }

    const unsigned int nVert1 = pnIB[3 * nIndex];
    const unsigned int nVert2 = pnIB[3 * nIndex + 1];
    const unsigned int nVert3 = pnIB[3 * nIndex + 2];

    for (UINT i = 0; i < nFaces; i++)
    {
        if (pnIB2[3 * i]   == nVert1 &&
            pnIB2[3 * i + 1] == nVert2 &&
            pnIB2[3 * i + 2] == nVert3)
        {
            *pnFaceMapOut = i;

            return TOOTLE_OK;
        }
    }

    return TOOTLE_INTERNAL_ERROR;
}

TootleResult TOOTLE_DLL TootleOptimizeVCache(const unsigned int*   pnIB,
                                             unsigned int          nFaces,
                                             unsigned int          nVertices,
                                             unsigned int          nCacheSize,
                                             unsigned int*         pnIBOut,
                                             unsigned int*         pnFaceRemapOut,
                                             TootleVCacheOptimizer eVCacheOptimizer)
{
    AMD_TOOTLE_API_FUNCTION_BEGIN

    // sanity checks on the input parameters
    assert(pnIB);

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleOptimizeVCache: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleOptimizeVCache: Invalid value of nVertices"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nCacheSize == 0)
    {
        errorf(("TootleOptimizeVCache: nCacheSize = 0"));

        return TOOTLE_INVALID_ARGS;
    }

    unsigned int* pnIBOutTmp = pnIBOut;

    // if source and destination buffer are the same, we need a local copy
    if (pnIBOut)
    {
        if (pnIB == pnIBOut)
        {
            pnIBOutTmp = new unsigned int[ 3 * nFaces ];
        }
    }

    TootleResult result;

    // based on eVCacheOptimizer, we run the appropriate algorithm
    switch (eVCacheOptimizer)
    {
        case TOOTLE_VCACHE_AUTO:

            // This is the default behavior in the old tootle library (<= version 1.2).
            // It calls Tstrips algorithm if the vertex cache size is less than 7, otherwise
            // it used to call the Direct3D version (this is now changed to Tipsy for this version).
            if (nCacheSize <= 6)
            {
                result = TootleOptimizeVCacheLStrips(pnIB, nFaces, nVertices, nCacheSize, pnIBOutTmp, pnFaceRemapOut);
            }
            else
            {
                result = TootleOptimizeVCacheTipsy(pnIB, nFaces, nVertices, nCacheSize, pnIBOutTmp, pnFaceRemapOut);
            }

            break;

        case TOOTLE_VCACHE_DIRECT3D:
#ifdef _SOFTWARE_ONLY_VERSION
            fprintf(stderr, "TootleOptimizeVCache: No Direct3D support for this version.\n");
            result = TOOTLE_INTERNAL_ERROR;
#else
            result = TootleOptimizeVCacheDirect3D(pnIB, nFaces, nVertices, nCacheSize, pnIBOutTmp, pnFaceRemapOut);
#endif
            break;

        case TOOTLE_VCACHE_LSTRIPS:
            result = TootleOptimizeVCacheLStrips(pnIB, nFaces, nVertices, nCacheSize, pnIBOutTmp, pnFaceRemapOut);
            break;

        case TOOTLE_VCACHE_TIPSY:
            result = TootleOptimizeVCacheTipsy(pnIB, nFaces, nVertices, nCacheSize, pnIBOutTmp, pnFaceRemapOut);
            break;

        default:
            errorf(("TootleOptimizeVCache: Invalid eVCacheOptimizer"));
            result = TOOTLE_INVALID_ARGS;
            break;
    };

    // copy the output back
    if (pnIBOut &&
        pnIBOutTmp != pnIBOut)
    {
        memcpy(pnIBOut, pnIBOutTmp, nFaces * 3 * sizeof(unsigned int));
        delete [] pnIBOutTmp;
    }

    return result;

    AMD_TOOTLE_API_FUNCTION_END
}

#ifndef _SOFTWARE_ONLY_VERSION
static TootleResult TootleOptimizeVCacheDirect3D(const unsigned int* pnIB,
                                                 unsigned int        nFaces,
                                                 unsigned int        nVertices,
                                                 unsigned int        nCacheSize,
                                                 unsigned int*       pnIBOut,
                                                 unsigned int*       pnFaceRemapOut)
{
    // sanity checks
    assert(pnIB);

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleOptimizeVCacheDirect3D: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleOptimizeVCacheDirect3D: Invalid value of nVertices"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nCacheSize == 0)
    {
        errorf(("TootleOptimizeVCacheDirect3D: nCacheSize = 0"));

        return TOOTLE_INVALID_ARGS;
    }

    auto pFaceRemap = 
#ifdef _DX11_1_
                    new uint32_t[nFaces];
#else
                    new DWORD[ nFaces ];
#endif
    HRESULT hres = D3D_OK;

    if (nFaces == 1)
    {
        // D3DX doesn't like it if we optimize a single face (we'll get an internal error), so just pass through
        *pFaceRemap = 0;
    }
    else
    {
#ifdef _DX11_1_

        hres = DirectX::OptimizeFaces(pnIB, nFaces, nullptr, pFaceRemap);
#else
        // use D3DX for optimization
        hres = D3DXOptimizeFaces(pnIB, nFaces, nVertices, true, pFaceRemap);
#endif
    }

    if (hres == D3D_OK)
    {
        // re-order faces
        if (pnIBOut)
        {
            for (UINT i = 0; i < nFaces; i++)
            {
                for (UINT j = 0; j < 3; j++)
                {
                    pnIBOut[(3 * i) + j ] = pnIB[(3 * pFaceRemap[i]) + j ];
                }
            }
        }

        // copy face re-mapping if user wants it
        if (pnFaceRemapOut)
        {
            memcpy(pnFaceRemapOut, pFaceRemap, sizeof(UINT)*nFaces);
        }
    }

    delete[] pFaceRemap;

    switch (hres)
    {
        case D3D_OK:
            return TOOTLE_OK;

        case E_OUTOFMEMORY:
            return TOOTLE_OUT_OF_MEMORY;

        default:
            return TOOTLE_INTERNAL_ERROR;
    }
}
#endif

static TootleResult TootleOptimizeVCacheLStrips(const unsigned int* pnIB,
                                                unsigned int        nFaces,
                                                unsigned int        nVertices,
                                                unsigned int        nCacheSize,
                                                unsigned int*       pnIBOut,
                                                unsigned int*       pnFaceRemapOut)
{
    // sanity checks
    assert(pnIB);

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleOptimizeVCacheLStrips: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleOptimizeVCacheLStrips: Invalid value of nVertices"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nCacheSize == 0)
    {
        errorf(("TootleOptimizeVCacheLStrips: nCacheSize = 0"));

        return TOOTLE_INVALID_ARGS;
    }

    unsigned int* pnStripResult = new unsigned int[ nFaces * 3 ];

    Stripifier::Process(pnIB, nFaces, pnStripResult, pnFaceRemapOut);

    // re-order faces
    if (pnIBOut)
    {
        for (UINT i = 0; i < nFaces * 3; i++)
        {
            pnIBOut[ i ] = pnStripResult[ i ];
        }
    }

    TootleResult result = TOOTLE_OK;

    delete[] pnStripResult;

    return result;
}

static TootleResult TootleOptimizeVCacheTipsy(const unsigned int* pnIB,
                                              unsigned int        nFaces,
                                              unsigned int        nVertices,
                                              unsigned int        nCacheSize,
                                              unsigned int*       pnIBOut,
                                              unsigned int*       pnFaceRemapOut)
{
    // sanity checks
    assert(pnIB);

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleOptimizeVCacheTipsy: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleOptimizeVCacheTipsy: Invalid value of nVertices"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nCacheSize == 0)
    {
        errorf(("TootleOptimizeVCacheTipsy: nCacheSize = 0"));

        return TOOTLE_INVALID_ARGS;
    }

    FanVertOptimizeVCacheOnly((int*) pnIB, (int*) pnIBOut, nVertices, nFaces, nCacheSize, NULL, NULL, NULL);

    // if the face remapping is requested, compute it for the caller.
    // Perhaps, this information should be generated as the indices get built in FanVertOptimizeVCache to be
    //  more efficient.
    if (pnFaceRemapOut)
    {
        UINT nFaceMap;
        TootleResult result;

        for (UINT i = 0; i < nFaces; i++)
        {
            result = FindFaceMappingFromIndex(pnIB, pnIBOut, i, nFaces, &nFaceMap);

            if (result != TOOTLE_OK)
            {
                return result;
            }

            pnFaceRemapOut[i] = nFaceMap;
        }
    }

    return TOOTLE_OK;
}

TootleResult TOOTLE_DLL TootleClusterMesh(const void*         pVB,
                                          const unsigned int* pnIB,
                                          unsigned int        nVertices,
                                          unsigned int        nFaces,
                                          unsigned int        nVBStride,
                                          unsigned int        nTargetClusters,
                                          unsigned int*       pnClusteredIBOut,
                                          unsigned int*       pnFaceClustersOut,
                                          unsigned int*       pnFaceRemapOut)
{
    AMD_TOOTLE_API_FUNCTION_BEGIN

    // sanity checks
    assert(pVB);
    assert(pnIB);
    assert(pnClusteredIBOut);
    assert(pnFaceClustersOut);

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleClusterMesh: Invalid value of nVertices"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleClusterMesh: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVBStride < 3 * sizeof(float))
    {
        errorf(("TootleClusterMesh: nVBStride less than 3*sizeof(float)"));

        return TOOTLE_INVALID_ARGS;
    }

    // because Pedro's clustering implementation is so heavily tied to the Soup/Mesh classes, it's easier just to
    // construct a soup here eventually we should re-work the code to avoid this redundant copying.

    Soup soup;

    if (!MakeSoup(pVB, pnIB, nVertices, nFaces, nVBStride, &soup))
    {
        return TOOTLE_OUT_OF_MEMORY;
    }

    // cluster the mesh
    UINT nClusters = nTargetClusters;
    std::vector<int> clusterIDs;
    ClusterResult result = Cluster(&soup, nClusters, clusterIDs);

    switch (result)
    {
        case CLUSTER_OK:              break;

        case CLUSTER_OUT_OF_MEMORY:   return TOOTLE_OUT_OF_MEMORY;

        default:                      return TOOTLE_INTERNAL_ERROR;
    }

    // create an array to hold the face re-mapping
    // use the output array if the user provided one, otherwise, allocate a new one
    UINT* pnRemap = pnFaceRemapOut;

    if (!pnRemap)
    {
        pnRemap = new UINT[ nFaces ];
    }

    if (!SortFacesByCluster(soup, clusterIDs, pnRemap))
    {
        return TOOTLE_OUT_OF_MEMORY;
    }

    if (pnRemap != pnFaceRemapOut)
    {
        // don't need this temporary array anymore
        delete[] pnRemap;
    }

    // copy clustered mesh to output array

    // once again, we're memcpying int to unsigned int.
    // This should be ok because, if clustering worked, all cluster IDs will be positive
    // We should still fix it eventually though
    memcpy(pnFaceClustersOut, &clusterIDs[0], sizeof(int)*clusterIDs.size());
    memcpy(pnClusteredIBOut, &soup.t(0), sizeof(int)*soup.t().size() * 3);

    // Append the number of cluster to the last element of the array.
    // This is to ensure we can mix and match the full (old tootle) and compact (new tootle) format.
    pnFaceClustersOut[nFaces] = 1 + pnFaceClustersOut[nFaces - 1];

    return TOOTLE_OK;

    AMD_TOOTLE_API_FUNCTION_END
}

TootleResult TOOTLE_DLL TootleFastOptimizeVCacheAndClusterMesh(const unsigned int* pnIB,
                                                               unsigned int        nFaces,
                                                               unsigned int        nVertices,
                                                               unsigned int        nCacheSize,
                                                               unsigned int*       pnIBOut,
                                                               unsigned int*       pnClustersOut,
                                                               unsigned int*       pnNumClustersOut,
                                                               float               fAlpha)
{
    AMD_TOOTLE_API_FUNCTION_BEGIN

    // sanity checks
    assert(pnIB);
    assert(pnIBOut);
    assert(pnClustersOut);

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleFastOptimizeVCacheAndClusterMesh: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleFastOptimizeVCacheAndClusterMesh: Invalid value of nVertices"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nCacheSize == 0)
    {
        errorf(("TootleOptimizeVCacheAndClusterMesh: nCacheSize = 0"));

        return TOOTLE_INVALID_ARGS;
    }

    unsigned int* pnOutput = pnIBOut;

    // if source and destination buffer are the same, we need a local copy
    if (pnIBOut)
    {
        if (pnIB == pnIBOut)
        {
            pnOutput = new unsigned int[ 3 * nFaces ];
        }
    }

    float         fACMR;
    unsigned int* pnClustersOutTmp;
    unsigned int  pnNumClustersOutTmp;

    pnClustersOutTmp = new unsigned int [ nFaces + 1 ];

    // OPTIMIZE VERTEX CACHE
    fACMR = FanVertOptimizeVCacheOnly((int*) pnIB, (int*) pnOutput, nVertices, nFaces, nCacheSize, NULL,
                                      (int*) pnClustersOutTmp, (int*) &pnNumClustersOutTmp);

    // copy the output back
    if (pnIBOut &&
        pnOutput != pnIBOut)
    {
        memcpy(pnIBOut, pnOutput, nFaces * 3 * sizeof(unsigned int));
        delete [] pnOutput;
    }

    float fLambda;
    fLambda = fAlpha + (1.0f - fAlpha) * fACMR;

    // PERFORM LINEAR CLUSTERING based on the output of Vertex Cache Optimization algorithm (hard boundaries) and
    //  fLambda (soft boundaries).
    FanVertOptimizeClusterOnly((int*) pnIBOut, nVertices, nFaces, nCacheSize, fLambda, (int*) pnClustersOutTmp,
                               pnNumClustersOutTmp, (int*) pnClustersOut, (int*) pnNumClustersOut, NULL);

    delete[] pnClustersOutTmp;

    return TOOTLE_OK;

    AMD_TOOTLE_API_FUNCTION_END
}

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
                                               TootleOverdrawOptimizer eOverdrawOptimizer)
{
    AMD_TOOTLE_API_FUNCTION_BEGIN

    // sanity checks
    assert(pVB);
    assert(pnIB);
    assert(pnFaceClusters);

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleOptimizeOverdraw: Invalid value of nVertices"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleOptimizeOverdraw: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVBStride < 3 * sizeof(float))
    {
        errorf(("TootleOptimizeOverdraw: nVBStride less than 3*sizeof(float)"));

        return TOOTLE_INVALID_ARGS;
    }

    // make sure that they're not being stupid and passing us bad enum values
    if (eFrontWinding != TOOTLE_CCW && eFrontWinding != TOOTLE_CW)
    {
        errorf(("TootleOptimizeOverdraw: Invalid face winding."));

        return TOOTLE_INVALID_ARGS;
    }

    // Select the overdraw optimization algorithm based on the input parameter.
    switch (eOverdrawOptimizer)
    {
        case TOOTLE_OVERDRAW_DIRECT3D:
#ifdef _SOFTWARE_ONLY_VERSION
            fprintf(stderr, "TootleOptimizeOverdraw: No Direct3D support for this version.\n");
            return TOOTLE_INTERNAL_ERROR;
#endif

        case TOOTLE_OVERDRAW_AUTO:
        case TOOTLE_OVERDRAW_RAYTRACE:
            return TootleOptimizeOverdrawDirect3DAndRaytrace(pVB, pnIB, nVertices, nFaces, nVBStride, pfViewpoint, nViewpoints,
                                                             eFrontWinding, eOverdrawOptimizer, pnFaceClusters, pnIBOut,
                                                             pnClusterRemapOut);
            break;

        case TOOTLE_OVERDRAW_FAST:
            return TootleOptimizeOverdrawFastApproximation(pVB, pnIB, nVertices, nFaces, nVBStride,
                                                           eFrontWinding, pnFaceClusters, pnIBOut, pnClusterRemapOut);
            break;

        default:
            errorf(("TootleOptimizeOverdraw: eOverdrawOptimizer is invalid."));

            return TOOTLE_INVALID_ARGS;
    }

    AMD_TOOTLE_API_FUNCTION_END
}

static TootleResult TootleOptimizeOverdrawDirect3DAndRaytrace(const void*             pVB,
                                                              const unsigned int*     pnIB,
                                                              unsigned int            nVertices,
                                                              unsigned int            nFaces,
                                                              unsigned int            nVBStride,
                                                              const float*            pfViewpoint,
                                                              unsigned int            nViewpoints,
                                                              TootleFaceWinding       eFrontWinding,
                                                              TootleOverdrawOptimizer eOverdrawOptimizer,
                                                              const unsigned int*     pnFaceClusters,
                                                              unsigned int*           pnIBOut,
                                                              unsigned int*           pnClusterRemapOut)
{
    // sanity checks
    assert(pVB);
    assert(pnIB);
    assert(pnFaceClusters);

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleOptimizeOverdrawDirect3D: Invalid value of nVertices"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleOptimizeOverdrawDirect3D: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVBStride < 3 * sizeof(float))
    {
        errorf(("TootleOptimizeOverdraw: nVBStride less than 3*sizeof(float)"));

        return TOOTLE_INVALID_ARGS;
    }

    // make sure that they're not being stupid and passing us bad enum values
    if (eFrontWinding != TOOTLE_CCW && eFrontWinding != TOOTLE_CW)
    {
        errorf(("TootleOptimizeOverdrawDirect3D: Invalid face winding."));
        return TOOTLE_INVALID_ARGS;
    }

#ifndef _SOFTWARE_ONLY_VERSION

    if (!ODIsInitialized())
    {
        return TOOTLE_NOT_INITIALIZED;
    }

#endif

    // perform check whether pnFaceCluster is in the full format.
    if (!IsClusterArrayFullFormat(pnFaceClusters, nFaces))
    {
        ConvertClusterArrayFromCompactToFull((unsigned int*) pnFaceClusters, nFaces);
    }

    // make sure that cluster array is sorted, as required
    bool bOrdered = true;

    if (pnFaceClusters[0] != 0)
    {
        bOrdered = false;
    }

    for (UINT i = 1;  i < nFaces; i++)
    {
        int x = pnFaceClusters[i] - pnFaceClusters[i - 1];

        if (x < 0 || x > 1)
        {
            bOrdered = false;
            break;
        }
    }

    if (!bOrdered)
    {
        errorf(("TootleOptimizeOverdrawDirect3D: Cluster array is not ordered."));

        return TOOTLE_INVALID_ARGS;
    }

    // if there is only one cluster, do nothing, just pass through
    // if we don't do this, various pieces of code will break
    UINT nClusters = 1 + pnFaceClusters[nFaces - 1];

    if (nClusters == 1)
    {
        if (pnClusterRemapOut)
        {
            *pnClusterRemapOut = 0;
        }

        if (pnIBOut)
        {
            memcpy(pnIBOut, pnIB, sizeof(unsigned int)*nFaces * 3);
        }

        return TOOTLE_OK;
    }

    // use default viewpoints if they were omitted
    if (!pfViewpoint)
    {
        pfViewpoint = pDefaultViewpoint;
        nViewpoints = nDefaultViewpoints;
    }

    // make some soup
    Soup soup;

    if (!MakeSoup(pVB, pnIB, nVertices, nFaces, nVBStride, &soup))
    {
        return TOOTLE_OUT_OF_MEMORY;
    }

    // give soup to overdraw module
    TootleResult result;

    result = ODSetSoup(&soup, eFrontWinding);

    if (result != TOOTLE_OK)
    {
        return result;
    }

    // build one of std::vector<> things for the cluster array
    std::vector<int> cluster;

    for (UINT i = 0; i < nFaces; i++)
    {
        cluster.push_back (pnFaceClusters [i]);
    }

    //build array containing the index of the first face in each cluster
    std::vector<int> ClusterStart;
    UINT iLast = nClusters;

    for (UINT i = 0; i < nFaces; i++)
    {
        if (pnFaceClusters[i] != iLast)
        {
            iLast = pnFaceClusters[i];

            ClusterStart.push_back (i);
        }
    }

    // last element needs to contain the number of faces in the mesh. Various pieces of code depend on this
    ClusterStart.push_back (nFaces);

    //compute the overdraw graph
    std::vector<t_edge> graph;
    result = ODOverdrawGraph(pfViewpoint, nViewpoints,
                             (eFrontWinding != TOOTLE_CCW),    // cull CCW faces if they aren't front facing
                             cluster, ClusterStart, graph, eOverdrawOptimizer);

    if (result != TOOTLE_OK)
    {
        return result;
    }

    //reorder clusters
    std::vector<int> order (nClusters);

    if (graph.size() != 0)
    {
        if (!feedback(nClusters, static_cast<int> (graph.size()), &graph[0], &order[0]))
        {
            return TOOTLE_OUT_OF_MEMORY;
        }
    }
    else
    {
        // this means that there is no overdraw anywhere on the model, so just keep the current cluster order
        for (UINT i = 0; i < nClusters; i++)
        {
            order[i] = i;
        }

    }

    //reorder triangles in soup based on cluster reordering
    std::vector<Soup::Triangle> tt = soup.t();

    int j = 0;

    for (int i = 0; i < static_cast<int>(order.size()); i++)
    {
        for (int k = ClusterStart[order[i]]; k < ClusterStart[order[i] + 1]; k++)
        {
            soup.t(j) = tt[k];
            cluster[j] = i; //number clusters sequentially in the file
            j++;
        }
    }

    // copy to output arrays
    if (pnIBOut)
    {
        // TODO:  Someday we should fix this memcpy of int to unsigned int
        memcpy(pnIBOut, (unsigned int*)&soup.t(0), sizeof(int)*nFaces * 3);
    }

    if (pnClusterRemapOut)
    {
        memcpy(pnClusterRemapOut, &(order[0]), sizeof(UINT) * nClusters);
    }

    return TOOTLE_OK;
}

static TootleResult TootleOptimizeOverdrawFastApproximation(const void*         pVB,
                                                            const unsigned int* pnIB,
                                                            unsigned int        nVertices,
                                                            unsigned int        nFaces,
                                                            unsigned int        nVBStride,
                                                            TootleFaceWinding   eFrontWinding,
                                                            const unsigned int* pnFaceClusters,
                                                            unsigned int*       pnIBOut,
                                                            unsigned int*       pnClusterRemapOut)
{
    // sanity checks
    assert(pVB);
    assert(pnIB);
    assert(pnFaceClusters);
    assert(pnIBOut);

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleOptimizeOverdrawFastApproximation: nVertices is invalid."));

        return TOOTLE_INVALID_ARGS;
    }

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleOptimizeOverdrawFastApproximation: nFaces is invalid."));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVBStride < 3 * sizeof(float))
    {
        errorf(("TootleOptimizeOverdrawFastApproximation: nVBStride less than 3*sizeof(float)"));

        return TOOTLE_INVALID_ARGS;
    }

    // make sure that they're not being stupid and passing us bad enum values
    if (eFrontWinding != TOOTLE_CCW && eFrontWinding != TOOTLE_CW)
    {
        errorf(("TootleOptimizeOverdrawFastApproximation: Invalid face winding."));

        return TOOTLE_INVALID_ARGS;
    }

    // perform check whether pnFaceCluster is in the compact format.
    if (!IsClusterArrayCompactFormat(pnFaceClusters, nFaces))
    {
        ConvertClusterArrayFromFullToCompact((unsigned int*) pnFaceClusters, nFaces);
    }

    unsigned int* pnOutput = pnIBOut;

    // if source and destination buffer are the same, we need a local copy
    if (pnIBOut)
    {
        if (pnIB == pnIBOut)
        {
            pnOutput = new unsigned int[ 3 * nFaces ];
        }
    }

    float* pfVB = new float[ nVertices * 3 ];

    // make a packed version of the vertex buffer.
    unsigned int nVertexPositionSize = 3 * sizeof(float);
    const char*  pVBuffer            = (const char*) pVB;

    for (unsigned int i = 0; i < nVertices; i++)
    {
        memcpy(&pfVB[ 3 * i ], pVBuffer, nVertexPositionSize);

        pVBuffer += nVBStride;
    }

    FanVertOptimizeOverdrawOnly(pfVB, (int*) pnIB, (int*) pnOutput, nVertices, nFaces,
                                eFrontWinding, (int*) pnFaceClusters, pnFaceClusters[ nFaces ],
                                NULL, (int*) pnClusterRemapOut);

    // copy the output back
    if (pnIBOut &&
        pnOutput != pnIBOut)
    {
        memcpy(pnIBOut, pnOutput, nFaces * 3 * sizeof(unsigned int));
        delete[] pnOutput;
    }

    delete[] pfVB;

    return TOOTLE_OK;
}

//=================================================================================================================================
/// This method should be called when the application is finished Tootling.
/// Failure to call this function when the application is finished Tootling will result in resource leaks
//=================================================================================================================================
void TOOTLE_DLL TootleCleanup()
{
    try 
    {
        // clean up overdraw module
        if (ODIsInitialized ()) {
            ODCleanup ();
        }
    }
    catch (...)         
    {
    }
}

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
                                       TootleVCacheOptimizer   eVCacheOptimizer,
                                       TootleOverdrawOptimizer eOverdrawOptimizer)
{
    AMD_TOOTLE_API_FUNCTION_BEGIN

    // sanity checks
    assert(pVB);
    assert(pnIB);
    assert(pnIBOut);

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleOptimize: Invalid value of nVertices"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleOptimize: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nCacheSize == 0)
    {
        errorf(("TootleOptimize: nCacheSize = 0"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVBStride < 3 * sizeof(float))
    {
        errorf(("TootleOptimize: nVBStride is less than 3*sizeof(float)"));

        return TOOTLE_INVALID_ARGS;
    }

    // make sure that they're not being stupid and passing us bad enum values
    if (eFrontWinding != TOOTLE_CCW && eFrontWinding != TOOTLE_CW)
    {
        errorf(("Invalid face winding."));

        return TOOTLE_INVALID_ARGS;
    }

    // allocate an array to hold the cluster ID for each face
    unsigned int* pnFaceClusters = new unsigned int[ nFaces + 1 ];

    TootleResult result;
    // cluster the mesh, and sort faces by cluster
    result = TootleClusterMesh(pVB, pnIB, nVertices, nFaces, nVBStride, 0, pnIBOut, pnFaceClusters, NULL);

    if (result != TOOTLE_OK)
    {
        return result;
    }

    // perform vertex cache optimization on the clustered mesh
    result = TootleVCacheClusters(pnIBOut, nFaces, nVertices, nCacheSize, pnFaceClusters, pnIBOut, NULL, eVCacheOptimizer);

    if (result != TOOTLE_OK)
    {
        return result;
    }

    // optimize the draw order
    result = TootleOptimizeOverdraw(pVB, pnIBOut, nVertices, nFaces, nVBStride, pViewpoints, nViewpoints, eFrontWinding,
                                    pnFaceClusters, pnIBOut, NULL, eOverdrawOptimizer);

    if (result != TOOTLE_OK)
    {
        return result;
    }

    // if the resulting number of clusters is requested, return it to the caller
    if (pnNumClustersOut)
    {
        *pnNumClustersOut = pnFaceClusters[ nFaces ];
    }

    delete [] pnFaceClusters;

    return TOOTLE_OK;

    AMD_TOOTLE_API_FUNCTION_END
}

TootleResult TOOTLE_DLL TootleFastOptimize(const void*         pVB,
                                           const unsigned int* pnIB,
                                           unsigned int        nVertices,
                                           unsigned int        nFaces,
                                           unsigned int        nVBStride,
                                           unsigned int        nCacheSize,
                                           TootleFaceWinding   eFrontWinding,
                                           unsigned int*       pnIBOut,
                                           unsigned int*       pnNumClustersOut,
                                           float               fAlpha)
{
    AMD_TOOTLE_API_FUNCTION_BEGIN

    // sanity checks
    assert(pVB);
    assert(pnIB);
    assert(pnIBOut);

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleFastOptimize: Invalid value of nVertices"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleFastOptimize: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVBStride < 3 * sizeof(float))
    {
        errorf(("TootleFastOptimize: nVBStride is less than 3*sizeof(float)"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nCacheSize == 0)
    {
        errorf(("TootleFastOptimize: nCacheSize = 0"));

        return TOOTLE_INVALID_ARGS;
    }

    unsigned int* pnClustersTmp;
    unsigned int  pnNumClustersTmp;

    pnClustersTmp = new unsigned int[ nFaces + 1 ];

    TootleResult result;

    // OPTIMIVE VERTEX CACHE AND CLUSTERS
    result = TootleFastOptimizeVCacheAndClusterMesh(pnIB, nFaces, nVertices, nCacheSize, pnIBOut,
                                                    pnClustersTmp, &pnNumClustersTmp, fAlpha);

    if (result != TOOTLE_OK)
    {
        // an error detected
        delete[] pnClustersTmp;
        return result;
    }

    // OPTIMIZE OVERDRAW
    result = TootleOptimizeOverdraw(pVB, pnIBOut, nVertices, nFaces, nVBStride, NULL, 0,
                                    eFrontWinding, pnClustersTmp, pnIBOut, NULL, TOOTLE_OVERDRAW_FAST);

    delete[] pnClustersTmp;

    if (pnNumClustersOut)
    {
        *pnNumClustersOut = pnNumClustersTmp;
    }

    return result;

    AMD_TOOTLE_API_FUNCTION_END
}

TootleResult TOOTLE_DLL TootleVCacheClusters(const unsigned int*   pnIB,
                                             unsigned int          nFaces,
                                             unsigned int          nVertices,
                                             unsigned int          nCacheSize,
                                             const unsigned int*   pnFaceClusters,
                                             unsigned int*         pnIBOut,
                                             unsigned int*         pnFaceRemapOut,
                                             TootleVCacheOptimizer eVCacheOptimizer)
{

    AMD_TOOTLE_API_FUNCTION_BEGIN

    // sanity checks
    assert(pnIB);

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleVCacheClusters: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleVCacheClusters: Invalid value of nVertices"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nCacheSize == 0)
    {
        errorf(("TootleVCacheClusters: nCacheSize = 0"));

        return TOOTLE_INVALID_ARGS;
    }

    if (eVCacheOptimizer != TOOTLE_VCACHE_AUTO     &&
        eVCacheOptimizer != TOOTLE_VCACHE_DIRECT3D &&
        eVCacheOptimizer != TOOTLE_VCACHE_LSTRIPS  &&
        eVCacheOptimizer != TOOTLE_VCACHE_TIPSY)
    {
        errorf(("TootleVCacheClusters: Invalid selection for vertex cache optimization algorithm"));

        return TOOTLE_INVALID_ARGS;
    }

    // VCache within clusters
    UINT nClusterStart = 0;
    TootleResult result;

    for (UINT i = 0; i < nFaces; i++)
    {
        if (i == nFaces - 1 || (pnFaceClusters[i + 1] != pnFaceClusters[i]))
        {
            UINT nClusterFaces = 1 + (i - nClusterStart);

            const UINT* pnClusterIB = &pnIB[ 3 * nClusterStart ];
            UINT* pnClusterIBOut = (pnIBOut) ? &pnIBOut[ 3 * nClusterStart ] : 0;
            UINT* pnClusterRemapOut = (pnFaceRemapOut) ? &pnFaceRemapOut[ 3 * nClusterStart ] : 0;

            result = TootleOptimizeVCache(pnClusterIB, nClusterFaces, nVertices, nCacheSize,
                                          pnClusterIBOut, pnClusterRemapOut, eVCacheOptimizer);

            if (result != TOOTLE_OK)
            {
                return result;
            }

            nClusterStart = i + 1;
        }
    }

    return TOOTLE_OK;

    AMD_TOOTLE_API_FUNCTION_END
}

TootleResult TOOTLE_DLL TootleMeasureCacheEfficiency(const unsigned int* pnIB,
                                                     unsigned int        nFaces,
                                                     unsigned int        nCacheSize,
                                                     float*              pfEfficiencyOut)
{
    AMD_TOOTLE_API_FUNCTION_BEGIN

    // sanity checks
    assert(pnIB);
    assert(pfEfficiencyOut);

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleMeasureCacheEfficiency: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nCacheSize == 0)
    {
        errorf(("TootleMeasureCacheEfficiency: nCacheSize = 0"));

        return TOOTLE_INVALID_ARGS;
    }

    // allocate ourselves a vertex cache
    unsigned int* pnCache = new unsigned int[nCacheSize];

    // initialize cache to EMPTY
    UINT nEmpty = 0xffffffff;

    for (UINT i = 0; i < nCacheSize; i++)
    {
        pnCache[i] = nEmpty;
    }

    // simulate vertex processing
    UINT nFetches = 0;
    UINT nCacheIndex = 0;
    UINT nIndices = 3 * nFaces;

    for (UINT i = 0; i < nIndices; i++)
    {
        UINT nVert = pnIB[i];

        // search for this vertex in the cache
        bool bFound = false;

        for (UINT j = 0; j < nCacheSize; j++)
        {
            if (nVert == pnCache[j])
            {
                bFound = true;
                break;
            }
        }

        // it's not there, so put it there
        if (!bFound)
        {
            nFetches++;
            pnCache[nCacheIndex] = pnIB[i];
            nCacheIndex = (nCacheIndex + 1);

            if (nCacheIndex == nCacheSize)
            {
                nCacheIndex = 0;
            }
        }
    }

    delete [] pnCache;

    // I don't know why anyone would pass NULL for this, but just in case...
    if (pfEfficiencyOut)
    {
        *pfEfficiencyOut = (float) nFetches / (float) nFaces;
    }

    return TOOTLE_OK;

    AMD_TOOTLE_API_FUNCTION_END
}

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
                                              TootleOverdrawOptimizer eOverdrawOptimizer)
{
    AMD_TOOTLE_API_FUNCTION_BEGIN

    // sanity checks
    assert(pVB);
    assert(pnIB);

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleMeasureOverdraw: nCacheSize = 0"));


        return TOOTLE_INVALID_ARGS;
    }

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleMeasureOverdraw: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVBStride < 3 * sizeof(float))
    {
        errorf(("TootleMeasureOverdraw: nVBStride less than 3*sizeof(float)"));

        return TOOTLE_INVALID_ARGS;
    }

#ifdef _SOFTWARE_ONLY_VERSION
    (void)(eOverdrawOptimizer);  // satisfy unused parameter warning message
    return TootleMeasureOverdrawRaytrace(pVB, pnIB, nVertices, nFaces, nVBStride, pfViewpoint, nViewpoints,
                                         eFrontWinding, pfAvgODOut, pfMaxODOut);
#else

    switch (eOverdrawOptimizer)
    {
        case TOOTLE_OVERDRAW_RAYTRACE:
            return TootleMeasureOverdrawRaytrace(pVB, pnIB, nVertices, nFaces, nVBStride, pfViewpoint, nViewpoints,
                                                 eFrontWinding, pfAvgODOut, pfMaxODOut);

        case TOOTLE_OVERDRAW_AUTO:
        case TOOTLE_OVERDRAW_FAST:
        case TOOTLE_OVERDRAW_DIRECT3D:
        default:
            return TootleMeasureOverdrawDirect3D(pVB, pnIB, nVertices, nFaces, nVBStride, pfViewpoint, nViewpoints,
                                                 eFrontWinding, pfAvgODOut, pfMaxODOut);
    }

#endif

    AMD_TOOTLE_API_FUNCTION_END
}

#ifndef _SOFTWARE_ONLY_VERSION
TootleResult TootleMeasureOverdrawDirect3D(const void*         pVB,
                                           const unsigned int* pnIB,
                                           unsigned int        nVertices,
                                           unsigned int        nFaces,
                                           unsigned int        nVBStride,
                                           const float*        pfViewpoint,
                                           unsigned int        nViewpoints,
                                           TootleFaceWinding   eFrontWinding,
                                           float*              pfAvgODOut,
                                           float*              pfMaxODOut)
{
    AMD_TOOTLE_API_FUNCTION_BEGIN

    // sanity checks
    assert(pVB);
    assert(pnIB);

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleMeasureOverdraw: nCacheSize = 0"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleMeasureOverdraw: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVBStride < 3 * sizeof(float))
    {
        errorf(("TootleMeasureOverdraw: nVBStride less than 3*sizeof(float)"));

        return TOOTLE_INVALID_ARGS;
    }

    if (!ODIsInitialized())
    {
        return TOOTLE_NOT_INITIALIZED;
    }

    // make sure that they're not being stupid and passing us bad enum values
    if (eFrontWinding != TOOTLE_CCW && eFrontWinding != TOOTLE_CW)
    {
        errorf(("Invalid face winding."));

        return TOOTLE_INVALID_ARGS;
    }

    // use default viewpoints if they were omitted
    if (!pfViewpoint)
    {
        pfViewpoint = pDefaultViewpoint;
        nViewpoints = nDefaultViewpoints;
    }

    // cook us up some soup
    Soup soup;

    if (!MakeSoup(pVB, pnIB, nVertices, nFaces, nVBStride, &soup))
    {
        return TOOTLE_OUT_OF_MEMORY;
    }

    // send soup to overdraw module
    TootleResult result = ODSetSoup(&soup, eFrontWinding);

    if (result == TOOTLE_OK)
    {
        // measure overdraw
        float fAvgOD, fMaxOD;
        result = ODObjectOverdraw(pfViewpoint, nViewpoints, fAvgOD, fMaxOD);

        if (result != TOOTLE_OK)
        {
            return result;
        }

        // set output variables
        if (pfAvgODOut)
        {
            *pfAvgODOut = fAvgOD - 1.0f;
        }

        if (pfMaxODOut)
        {
            *pfMaxODOut = fMaxOD - 1.0f;
        }
    }

    return result;

    AMD_TOOTLE_API_FUNCTION_END
}
#endif

TootleResult TootleMeasureOverdrawRaytrace(const void*         pVB,
                                           const unsigned int* pnIB,
                                           unsigned int        nVertices,
                                           unsigned int        nFaces,
                                           unsigned int        nVBStride,
                                           const float*        pfViewpoint,
                                           unsigned int        nViewpoints,
                                           TootleFaceWinding   eFrontWinding,
                                           float*              pfAvgODOut,
                                           float*              pfMaxODOut)
{
    AMD_TOOTLE_API_FUNCTION_BEGIN

    // sanity checks
    assert(pVB);
    assert(pnIB);

    if (nVertices == 0 || nVertices > TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleMeasureOverdraw: nCacheSize = 0"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleMeasureOverdraw: Invalid value of nFaces"));

        return TOOTLE_INVALID_ARGS;
    }

    if (nVBStride < 3 * sizeof(float))
    {
        errorf(("TootleMeasureOverdraw: nVBStride less than 3*sizeof(float)"));

        return TOOTLE_INVALID_ARGS;
    }

    // make sure that they're not being stupid and passing us bad enum values
    if (eFrontWinding != TOOTLE_CCW && eFrontWinding != TOOTLE_CW)
    {
        errorf(("Invalid face winding."));
     
        return TOOTLE_INVALID_ARGS;
    }

    // use default viewpoints if they were omitted
    if (!pfViewpoint)
    {
        pfViewpoint = pDefaultViewpoint;
        nViewpoints = nDefaultViewpoints;
    }

    // create a non-interleaved vertex buffer
    float* pfVB = new float[ 3 * nVertices ];

    const char* pVBuffer = (const char*) pVB;

    for (unsigned int i = 0; i < nVertices; i++)
    {
        memcpy(&pfVB[3 * i], pVBuffer, sizeof(float) * 3);
        pVBuffer += nVBStride;
    }

    TootleResult result;
    float fAvgOD;
    float fMaxOD;

    result = ODObjectOverdrawRaytrace(pfVB, pnIB, nVertices, nFaces, pfViewpoint, nViewpoints,
                                      (eFrontWinding != TOOTLE_CCW),    // cull CCW faces if they aren't front facing
                                      fAvgOD, fMaxOD);

    if (pfAvgODOut)
    {
        *pfAvgODOut = fAvgOD - 1.0f;
    }

    if (pfMaxODOut)
    {
        *pfMaxODOut = fMaxOD - 1.0f;
    }

    // clean up
    delete[] pfVB;

    return result;

    AMD_TOOTLE_API_FUNCTION_END
}

//=================================================================================================================================
/// A helper function to convert the cluster array ID from the full format to the compact format.
///  The compact format is used by old tootle (i3D version) while the full format is used by the new tootle (SIGGRAPH version).
///
/// \param pnID    The cluster array of size nFaces+1.  Must be of type compact.
/// \param nFaces  The total number of faces of the mesh.
///
/// \return Possible return codes:  TOOTLE_INVALID_ARGS, TOOTLE_INTERNAL_ERROR, TOOTLE_OUT_OF_MEMORY, or TOOTLE_OK.
//=================================================================================================================================
static TootleResult ConvertClusterArrayFromFullToCompact(unsigned int* pnID, unsigned int nFaces)
{
    // sanity checks
    assert(pnID);

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("ConvertClusterArrayFromFullToCompact: nFaces is invalid"));

        return TOOTLE_INVALID_ARGS;
    }

    // if less then two triangles, then just return from the function.
    if (nFaces < 2)
    {
        return TOOTLE_OK;
    }

    // check whether the cluster array is of a full format.
    if (!IsClusterArrayFullFormat(pnID, nFaces))
    {
        errorf(("ConvertClusterIDFromFullToCompact: pnID is not a full format"));
        
        return TOOTLE_INTERNAL_ERROR;
    }

    unsigned int nNumCluster;

    nNumCluster = 1 + pnID[ nFaces - 1 ];

    // sanity check on the number of cluster
    if (nNumCluster > nFaces)
    {
        errorf(("ConvertClusterArrayFromFullToCompact: nNumCluster > nFaces"));
        
        return TOOTLE_INTERNAL_ERROR;
    }

    if (nNumCluster >= TOOTLE_NONE)
    {
        errorf(("ConvertClusterIDFromFullToCompact: nNumCluster >= TOOTLE_NONE (max int)"));
        
        return TOOTLE_INTERNAL_ERROR;
    }

    unsigned int nStart;
    unsigned int nCount;

    // The starting cluster has to be zero.
    if (pnID[ 0 ] != 0)
    {
        errorf(("ConvertClusterIDFromFullToCompact: pnID[0] != 0"));
        
        return TOOTLE_INTERNAL_ERROR;
    }

    // Compacting the cluster array
    unsigned int i;

    nCount = 0;
    nStart = 0;

    for (i = 1; i < nFaces; i++)
    {
        if (pnID[ i ] != nCount)
        {
            nStart = i;
            nCount++;
            pnID[ nCount ] = nStart;
        }
    }

    // Append the cluster array with the total size
    nCount++;
    pnID[ nCount ] = i;

    // Fill the rest of the array with NONE
    nCount++;

    for (; nCount < nFaces; nCount++)
    {
        pnID[ nCount ] = TOOTLE_NONE;
    }

    // The last element of the array should be the total number of clusters.
    pnID[ nFaces ] = nNumCluster;

    return TOOTLE_OK;
}

//=================================================================================================================================
/// A helper function to convert the cluster array ID from the compact format to the full format.
///  The compact format is used by old tootle (i3D version) while the full format is used by the new tootle (SIGGRAPH version).
/// \param pnID    The cluster array of size nFaces+1.  Must be of type compact.
/// \param nFaces  The total number of faces of the mesh.
///
/// \return Possible return codes:  TOOTLE_INVALID_ARGS, TOOTLE_INTERNAL_ERROR, TOOTLE_OUT_OF_MEMORY, or TOOTLE_OK.
//=================================================================================================================================
static TootleResult ConvertClusterArrayFromCompactToFull(unsigned int* pnID, unsigned int nFaces)
{
    // sanity checks
    assert(pnID);

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("ConvertClusterArrayFromCompactToFull: nFaces is invalid"));

        return TOOTLE_INVALID_ARGS;
    }

    // if less then two triangles, then just return from the function.
    if (nFaces < 2)
    {
        return TOOTLE_OK;
    }

    // check if the cluster array is of compact format.
    if (!IsClusterArrayCompactFormat(pnID, nFaces))
    {
        errorf(("ConvertClusterArrayFromCompactToFull: pnID is not a compact format"));
        
        return TOOTLE_INTERNAL_ERROR;
    }

    unsigned int nNumCluster;

    nNumCluster = pnID[ nFaces ];

    // sanity check on the number of cluster
    if (nNumCluster > nFaces)
    {
        errorf(("ConvertClusterArrayFromCompactToFull: nNumCluster > nLength"));
        
        return TOOTLE_INTERNAL_ERROR;
    }

    // Make a local copy of the compact form array
    unsigned int* pnTmp = new unsigned int[ nNumCluster + 1 ];

    memcpy(pnTmp, pnID, (nNumCluster + 1) * sizeof(unsigned int));

    unsigned int i;
    unsigned int j;
    unsigned int nStart;

    // Compute the full format.
    nStart = 0;

    for (i = 1; i <= nNumCluster; i++)
    {
        if (pnTmp[i] > nFaces)
        {
            errorf(("ConvertClusterArrayFromCompactToFull: pnTmp[i] > nLength"));
            
            return TOOTLE_INTERNAL_ERROR;
        }

        for (j = nStart; j < pnTmp[i]; j++)
        {
            pnID[j] = i - 1;
        }

        nStart = pnTmp[i];
    }

    // Append the last entry of the array by the number of total clusters
    pnID[ nFaces ] = nNumCluster;

    delete[] pnTmp;

    return TOOTLE_OK;
}

//=================================================================================================================================
/// A helper function to check whether the cluster array is of a full format type.
///  The full format is used by the old tootle (i3D version).
///  This function does not check whether the array is valid.
///
/// \param pnID    The cluster array of size nFaces+1.  Must be of type compact.
/// \param nFaces  The total number of faces of the mesh.
///
/// \return Possible return codes:  true if the cluster array is of a full format type, false otherwise
//=================================================================================================================================
static bool IsClusterArrayFullFormat(const unsigned int* pnID, unsigned int nFaces)
{
    assert(pnID);
    assert(nFaces > 0);

    if (pnID[ nFaces ] == (1 + pnID[ nFaces - 1 ]))
    {
        return true;
    }
    else
    {
        return false;
    }
}

//=================================================================================================================================
/// A helper function to check whether the cluster array is of a compact format type.
///  The compact format is used by the new tootle (SIGGRAPH version).
///  This function does not check whether the array is valid.
///
/// \param pnID    The cluster array of size nFaces+1.  Must be of type compact.
/// \param nFaces  The total number of faces of the mesh.
///
/// \return Possible return codes:  true if the cluster array is of a full format type, false otherwise
//=================================================================================================================================
static bool IsClusterArrayCompactFormat(const unsigned int* pnID, unsigned int nFaces)
{
    assert(pnID);
    assert(nFaces > 0);

    unsigned int nNumCluster;

    nNumCluster = pnID[ nFaces ];

    // a special case of all the faces are in a separate cluster (it is both a compact and full form)
    if (nNumCluster == nFaces)
    {
        return true;
    }
    else
    {
        if (nNumCluster == (1 + pnID[ nFaces - 1 ]))
        {
            return false;  // a full format
        }
        else
        {
            return true;
        }
    }
}

TootleResult TOOTLE_DLL TootleOptimizeVertexMemory(const void*         pVB,
                                                   const unsigned int* pnIB,
                                                   unsigned int        nVertices,
                                                   unsigned int        nFaces,
                                                   unsigned int        nVBStride,
                                                   void*               pVBOut,
                                                   unsigned int*       pnIBOut,
                                                   unsigned int*       pnVertexRemapOut)
{
    AMD_TOOTLE_API_FUNCTION_BEGIN
 
    // sanity checks
    assert(pVB);
    assert(pnIB);

    // We also check whether nVertices is not equal to TOOTLE_MAX_VERTICES since
    //  we will use TOOTLE_MAX_VERTICES as a flag to denote that the vertex has not been mapped.
    if (nVertices == 0 || nVertices >= TOOTLE_MAX_VERTICES)
    {
        errorf(("TootleOptimizeVertexMemory: nVertices is invalid")) ;

        return TOOTLE_INVALID_ARGS;
    }

    if (nFaces == 0 || nFaces > TOOTLE_MAX_FACES)
    {
        errorf(("TootleOptimizeVertexMemory: nFaces is invalid")) ;

        return TOOTLE_INVALID_ARGS;
    }

    if (nVBStride < 3 * sizeof(float))
    {
        errorf(("TootleOptimizeVertexMemory: nVBStride is less than 3*sizeof(float)"));

        return TOOTLE_INVALID_ARGS;
    }

    // make a local copy for pVBOut and pnIBOut if they are the same as pVB and pnIB.
    char*         pVBOutTmp = (char*) pVBOut;
    unsigned int* pnIBOutTmp = pnIBOut;


    if (pVBOut == NULL || pVB == pVBOut)
    {
        pVBOutTmp = new char[ nVertices * nVBStride ];
    }

    if (pnIBOut == NULL || pnIB == pnIBOut)
    {
        pnIBOutTmp = new unsigned int[ 3 * nFaces ];
    }

    // create an array of vertex id map.
    unsigned int* pnVIDRemap = pnVertexRemapOut;
    if (pnVertexRemapOut == NULL)
    {
        pnVIDRemap = new unsigned int[ nVertices ];
    }

    unsigned int i;

    // mark all vertices map as hasn't been touched/remapped.
    for (i = 0; i < nVertices; i++)
    {
        pnVIDRemap[ i ] = TOOTLE_MAX_VERTICES;
    }

    // REMAP THE VERTICES based on the vertex ids in indices array
    unsigned int nVID;
    unsigned int nVIDCount = 0;
    unsigned int nFaces3  = nFaces * 3;
    bool bWarning         = true;

    for (i = 0; i < nFaces3; i++)
    {
        nVID = pnIB[ i ];

        // check whether the vertex has been mapped
        if (nVID < nVertices)
        {
            if (pnVIDRemap[ nVID ] == TOOTLE_MAX_VERTICES)
            {
                pnVIDRemap[ nVID ] = nVIDCount++;
            }

            pnIBOutTmp[ i ] = pnVIDRemap[ nVID ];
        }
        else
        {
            if (bWarning)
            {
                fprintf(stderr, "TootleOptimizeVertexMemory's warning: triangle indices are referencing out-of-bounds vertex buffer.\n");
                bWarning = false;
            }
            pnIBOutTmp[ i ] = nVID;
        }
    }

    // Make sure we map all the vertices.
    // It is possible for some of the vertices not to be referenced by the triangle indices.
    // In this case, we just assign them to the end of the vertex buffer.
    for (i = 0; i < nVertices; i++)
    {
        if (pnVIDRemap[ i ] == TOOTLE_MAX_VERTICES)
        {
            pnVIDRemap[ i ] = nVIDCount++;
        }
    }

    // check the result (make sure we have mapped all the vertices)
    assert(nVIDCount == nVertices);

    for (i = 0; i < nVertices; i++)
    {
        assert(pnVIDRemap[ i ] != TOOTLE_MAX_VERTICES);
    }

    // if pVBOut is requested by the user, fill it with the right data
    if (pVBOut != NULL)
    {
        // rearrange the vertex buffer based on the remapping
        const char* pVBuffer = (char*) pVB;

        for (i = 0; i < nVertices; i++)
        {
            nVID = pnVIDRemap[ i ];

            memcpy(&pVBOutTmp[ nVID * nVBStride ], pVBuffer, nVBStride);

            pVBuffer += nVBStride;
        }

        // copy the result if the user is supplying the same pointer for pVB and pVBOut
        if (pVBOut != pVBOutTmp)
        {
            memcpy(pVBOut, pVBOutTmp, nVertices * nVBStride);
        }
    }

    // delete pVBOutTmp if it is created locally
    if (pVBOut != pVBOutTmp)
    {
        delete[] pVBOutTmp;
    }

    if (pnIBOut != pnIBOutTmp && pnIBOut != NULL)
    {
        memcpy(pnIBOut, pnIBOutTmp, 3 * nFaces * sizeof(unsigned int));
    }

    if (pnIBOut != pnIBOutTmp)
    {
        delete[] pnIBOutTmp;
    }

    // if no vertex id remap is asked by the caller
    if (pnVertexRemapOut == NULL)
    {
        delete [] pnVIDRemap;
    }

    return TOOTLE_OK;

    AMD_TOOTLE_API_FUNCTION_END
}
