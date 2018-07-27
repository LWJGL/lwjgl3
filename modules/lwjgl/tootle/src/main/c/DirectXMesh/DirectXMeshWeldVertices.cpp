//-------------------------------------------------------------------------------------
// DirectXMeshWeldVertices.cpp
//  
// DirectX Mesh Geometry Library - Vertex welding
//
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// http://go.microsoft.com/fwlink/?LinkID=324981
//-------------------------------------------------------------------------------------

#include "DirectXMeshP.h"

using namespace DirectX;

namespace
{
    template<class index_t>
    HRESULT WeldVerticesImpl(
            _Inout_updates_all_(nFaces * 3) index_t* indices, size_t nFaces,
            size_t nVerts, _In_reads_(nVerts) const uint32_t* pointRep,
            _Out_writes_opt_(nVerts) uint32_t* vertexRemap,
            std::function<bool __cdecl(uint32_t v0, uint32_t v1)>& weldTest)
    {
        std::unique_ptr<uint32_t[]> temp(new (std::nothrow) uint32_t[nVerts * 2]);
        if (!temp)
            return E_OUTOFMEMORY;

        auto vertexRemapInverse = temp.get();

        auto wedgeList = temp.get() + nVerts;

        for (uint32_t j = 0; j < nVerts; ++j)
        {
            vertexRemapInverse[j] = j;
            wedgeList[j] = j;

            if (vertexRemap)
                vertexRemap[j] = j;
        }

        // Generate wedge list
        bool identity = true;

        for (uint32_t j = 0; j < nVerts; ++j)
        {
            uint32_t pr = pointRep[j];
            if (pr == UNUSED32)
                continue;

            if (pr >= nVerts)
                return E_UNEXPECTED;

            if (pr != j)
            {
                identity = false;

                wedgeList[j] = wedgeList[pr];
                wedgeList[pr] = j;
            }
        }

        if (identity)
        {
            // No candidates for welding, so return now
            return S_FALSE;
        }

        bool weld = false;

        for (uint32_t vert = 0; vert < nVerts; ++vert)
        {
            if (pointRep[vert] == vert && wedgeList[vert] != vert)
            {
                uint32_t curOuter = vert;
                do
                {
                    // if a remapping for the vertex hasn't been found, check to see if it matches any other vertices
                    assert(curOuter < nVerts);
                    _Analysis_assume_(curOuter < nVerts);
                    if (vertexRemapInverse[curOuter] == curOuter)
                    {
                        uint32_t curInner = wedgeList[vert];
                        assert(curInner < nVerts);
                        _Analysis_assume_(curInner < nVerts);
                        do
                        {
                            // don't check for equalivalence if indices the same (had better be equal then)
                            // and/or if the one being checked is already being remapped
                            if ((curInner != curOuter) && (vertexRemapInverse[curInner] == curInner))
                            {
                                // if the two vertices are equal, then remap one to the other
                                if (weldTest(curOuter, curInner))
                                {
                                    // remap the inner vertices to the outer...
                                    vertexRemapInverse[curInner] = curOuter;

                                    weld = true;
                                }
                            }

                            curInner = wedgeList[curInner];
                        } while (curInner != vert);
                    }

                    curOuter = wedgeList[curOuter];
                } while (curOuter != vert);
            }
        }

        if (!weld)
            return S_FALSE;

        // Apply map to indices
        for (uint32_t j = 0; j < nFaces * 3; ++j)
        {
            index_t i = indices[j];
            if (i == index_t(-1))
                continue;

            indices[j] = index_t(vertexRemapInverse[i]);
        }

        // Generate inverse map if requested
        if (vertexRemap)
        {
            memset(vertexRemap, 0xff, sizeof(uint32_t) * nVerts);

            for (uint32_t j = 0; j < nVerts; ++j)
            {
                if (vertexRemapInverse[j] != UNUSED32)
                {
                    vertexRemap[vertexRemapInverse[j]] = j;
                }
            }
        }

        return S_OK;
    }
}

//=====================================================================================
// Entry-points
//=====================================================================================

_Use_decl_annotations_
HRESULT DirectX::WeldVertices(
    uint16_t* indices, size_t nFaces,
    size_t nVerts, const uint32_t* pointRep,
    uint32_t* vertexRemap,
    std::function<bool __cdecl(uint32_t v0, uint32_t v1)> weldTest)
{
    if (!indices || !nFaces || !nVerts || !pointRep)
        return E_INVALIDARG;

    if (nVerts >= UINT16_MAX)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    return WeldVerticesImpl<uint16_t>(indices, nFaces, nVerts, pointRep, vertexRemap, weldTest);
}

_Use_decl_annotations_
HRESULT DirectX::WeldVertices(
    uint32_t* indices, size_t nFaces,
    size_t nVerts, const uint32_t* pointRep,
    uint32_t* vertexRemap,
    std::function<bool __cdecl(uint32_t v0, uint32_t v1)> weldTest)
{
    if (!indices || !nFaces || !nVerts || !pointRep)
        return E_INVALIDARG;

    if (nVerts >= UINT32_MAX)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    return WeldVerticesImpl<uint32_t>(indices, nFaces, nVerts, pointRep, vertexRemap, weldTest);
}
