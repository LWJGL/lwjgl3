//-------------------------------------------------------------------------------------
// DirectXMeshOptimize.cpp
//  
// DirectX Mesh Geometry Library - Mesh optimization
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
    HRESULT OptimizeVerticesImpl(
        _In_reads_(nFaces * 3) const index_t* indices, size_t nFaces,
        size_t nVerts, _Out_writes_(nVerts) uint32_t* vertexRemap,
        _Out_opt_ size_t* trailingUnused)
    {
        if (!indices || !nFaces || !nVerts || !vertexRemap)
            return E_INVALIDARG;

        if (nVerts >= index_t(-1))
            return E_INVALIDARG;

        if (trailingUnused)
        {
            *trailingUnused = 0;
        }

        if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
            return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

        std::unique_ptr<uint32_t[]> tempRemap(new (std::nothrow) uint32_t[nVerts]);
        if (!tempRemap)
            return E_OUTOFMEMORY;

        memset(tempRemap.get(), 0xff, sizeof(uint32_t) * nVerts);

        uint32_t curvertex = 0;
        for (size_t j = 0; j < (nFaces * 3); ++j)
        {
            index_t curindex = indices[j];
            if (curindex == index_t(-1))
                continue;

            if (curindex >= nVerts)
                return E_UNEXPECTED;

            if (tempRemap[curindex] == UNUSED32)
            {
                tempRemap[curindex] = curvertex;
                ++curvertex;
            }
        }

        // inverse lookup
        memset(vertexRemap, 0xff, sizeof(uint32_t) * nVerts);

        size_t unused = 0;

        for (uint32_t j = 0; j < nVerts; ++j)
        {
            uint32_t vertindex = tempRemap[j];
            if (vertindex == UNUSED32)
            {
                ++unused;
            }
            else
            {
                if (vertindex >= nVerts)
                    return E_UNEXPECTED;

                vertexRemap[vertindex] = j;
            }
        }

        if (trailingUnused)
        {
            *trailingUnused = unused;
        }

        return S_OK;
    }
}

//=====================================================================================
// Entry-points
//=====================================================================================

_Use_decl_annotations_
HRESULT DirectX::AttributeSort(
    size_t nFaces, uint32_t* attributes, uint32_t* faceRemap)
{
    if (!nFaces || !attributes || !faceRemap)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    typedef std::pair<uint32_t, uint32_t> intpair_t;

    std::vector<intpair_t> list;
    list.reserve(nFaces);
    for (uint32_t j = 0; j < nFaces; ++j)
    {
        list.emplace_back(intpair_t(attributes[j], j));
    }

    std::stable_sort(list.begin(), list.end(), [](const intpair_t& a, const intpair_t& b) -> bool
    {
        return (a.first < b.first);
    });

    auto it = list.begin();
    for (uint32_t j = 0; j < nFaces; ++j, ++it)
    {
        attributes[j] = it->first;
        faceRemap[j] = it->second;
    }

    return S_OK;
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::OptimizeVertices(
    const uint16_t* indices, size_t nFaces,
    size_t nVerts, uint32_t* vertexRemap, size_t* trailingUnused)
{
    return OptimizeVerticesImpl<uint16_t>(indices, nFaces, nVerts, vertexRemap, trailingUnused);
}

_Use_decl_annotations_
HRESULT DirectX::OptimizeVertices(
    const uint32_t* indices, size_t nFaces,
    size_t nVerts, uint32_t* vertexRemap, size_t* trailingUnused)
{
    return OptimizeVerticesImpl<uint32_t>(indices, nFaces, nVerts, vertexRemap, trailingUnused);
}
