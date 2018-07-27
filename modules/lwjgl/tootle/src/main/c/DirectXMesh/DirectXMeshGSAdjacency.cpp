//-------------------------------------------------------------------------------------
// DirectXMeshGSAdjacency.cpp
//  
// DirectX Mesh Geometry Library - Geometry Shader adjacency computation
//
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// http://go.microsoft.com/fwlink/?LinkID=324981
//-------------------------------------------------------------------------------------

#include "DirectXMeshP.h"

using namespace DirectX;

//
// Generates an IB triangle list with adjacency (D3D11_PRIMITIVE_TOPOLOGY_TRIANGLELIST_ADJ)
// http://msdn.microsoft.com/en-us/library/windows/desktop/bb205124.aspx
//

namespace
{
    template<class index_t>
    HRESULT GenerateGSAdjacencyImpl(
        _In_reads_(nFaces * 3) const index_t* indices, _In_ size_t nFaces,
        _In_reads_(nVerts) const uint32_t* pointRep,
        _In_reads_(nFaces * 3) const uint32_t* adjacency, _In_ size_t nVerts,
        _Out_writes_(nFaces * 6) index_t* indicesAdj)
    {
        if (!indices || !nFaces || !pointRep || !adjacency || !nVerts || !indicesAdj)
            return E_INVALIDARG;

        if (nVerts >= index_t(-1))
            return E_INVALIDARG;

        if (indices == indicesAdj)
        {
            // Does not support in-place conversion of the index buffer
            return HRESULT_FROM_WIN32(ERROR_NOT_SUPPORTED);
        }

        if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
            return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

        size_t inputi = 0;
        size_t outputi = 0;

        for (size_t face = 0; face < nFaces; ++face)
        {
            for (uint32_t point = 0; point < 3; ++point)
            {
                assert(outputi < (nFaces * 6));
                _Analysis_assume_(outputi < (nFaces * 6));

                indicesAdj[outputi] = indices[inputi];
                ++outputi;
                ++inputi;

                assert(outputi < (nFaces * 6));
                _Analysis_assume_(outputi < (nFaces * 6));

                uint32_t a = adjacency[face * 3 + point];
                if (a == UNUSED32)
                {
                    indicesAdj[outputi] = indices[face * 3 + ((point + 2) % 3)];
                }
                else
                {
                    uint32_t v1 = indices[face * 3 + point];
                    uint32_t v2 = indices[face * 3 + ((point + 1) % 3)];

                    if (v1 == index_t(-1) || v2 == index_t(-1))
                    {
                        indicesAdj[outputi] = index_t(-1);
                    }
                    else
                    {
                        if (v1 >= nVerts
                            || v2 >= nVerts)
                            return E_UNEXPECTED;

                        v1 = pointRep[v1];
                        v2 = pointRep[v2];

                        uint32_t vOther = UNUSED32;

                        // find other vertex
                        for (uint32_t k = 0; k < 3; ++k)
                        {
                            assert(a < nFaces);
                            _Analysis_assume_(a < nFaces);
                            uint32_t ak = indices[a * 3 + k];
                            if (ak == index_t(-1))
                                break;

                            if (ak >= nVerts)
                                return E_UNEXPECTED;

                            if (pointRep[ak] == v1)
                                continue;

                            if (pointRep[ak] == v2)
                                continue;

                            vOther = ak;
                        }

                        if (vOther == UNUSED32)
                        {
                            indicesAdj[outputi] = indices[face * 3 + ((point + 2) % 3)];

                        }
                        else
                        {
                            indicesAdj[outputi] = index_t(vOther);
                        }
                    }
                }
                ++outputi;
            }
        }

        assert(inputi == (nFaces * 3));
        assert(outputi == (nFaces * 6));

        return S_OK;
    }
}

//=====================================================================================
// Entry-points
//=====================================================================================

//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::GenerateGSAdjacency(
    const uint16_t* indices, size_t nFaces,
    const uint32_t* pointRep,
    const uint32_t* adjacency, size_t nVerts,
    uint16_t* indicesAdj)
{
    return GenerateGSAdjacencyImpl<uint16_t>(indices, nFaces, pointRep, adjacency, nVerts, indicesAdj);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::GenerateGSAdjacency(
    const uint32_t* indices, size_t nFaces,
    const uint32_t* pointRep,
    const uint32_t* adjacency, size_t nVerts,
    uint32_t* indicesAdj)
{
    return GenerateGSAdjacencyImpl<uint32_t>(indices, nFaces, pointRep, adjacency, nVerts, indicesAdj);
}
