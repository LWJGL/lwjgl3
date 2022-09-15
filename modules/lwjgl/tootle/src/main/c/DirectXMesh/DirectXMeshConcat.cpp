//-------------------------------------------------------------------------------------
// DirectXMeshConcat.cpp
//
// DirectX Mesh Geometry Library - Concatenate mesh
//
// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.
//
// http://go.microsoft.com/fwlink/?LinkID=324981
//-------------------------------------------------------------------------------------

#include "DirectXMeshP.h"

using namespace DirectX;

//=====================================================================================
// Entry-points
//=====================================================================================

_Use_decl_annotations_
HRESULT __cdecl DirectX::ConcatenateMesh(
    size_t nFaces,
    size_t nVerts,
    uint32_t* faceDestMap,
    uint32_t* vertexDestMap,
    size_t& totalFaces,
    size_t& totalVerts) noexcept
{
    if (!nFaces || !nVerts || !faceDestMap || !vertexDestMap)
        return E_INVALIDARG;

    if (nVerts >= UINT32_MAX)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_E_ARITHMETIC_OVERFLOW;

    uint64_t newFaceCount = uint64_t(totalFaces) + nFaces;
    uint64_t newVertCount = uint64_t(totalVerts) + nVerts;

    if (newFaceCount >= UINT32_MAX || newVertCount >= UINT32_MAX)
        return E_FAIL;

    auto const baseFace = static_cast<uint32_t>(totalFaces);
    for (uint32_t j = 0; j < nFaces; ++j)
    {
        faceDestMap[j] = baseFace + j;
    }

    auto const baseVert = static_cast<uint32_t>(totalVerts);
    for (uint32_t j = 0; j < nVerts; ++j)
    {
        vertexDestMap[j] = baseVert + j;
    }

    totalFaces = static_cast<size_t>(newFaceCount);
    totalVerts = static_cast<size_t>(newVertCount);

    return S_OK;
}
