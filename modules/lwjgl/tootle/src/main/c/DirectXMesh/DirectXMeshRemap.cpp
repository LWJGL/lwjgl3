//-------------------------------------------------------------------------------------
// DirectXMeshRemap.cpp
//  
// DirectX Mesh Geometry Library - Remap functions for applying face/vertex mappings
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
    const size_t c_MaxStride = 2048;

#if defined(__d3d11_h__) || defined(__d3d11_x_h__)
    static_assert(c_MaxStride == D3D11_REQ_MULTI_ELEMENT_STRUCTURE_SIZE_IN_BYTES, "D3D11 mismatch");
#endif

#if defined(__d3d12_h__) || defined(__d3d12_x_h__)
    static_assert(c_MaxStride == D3D12_REQ_MULTI_ELEMENT_STRUCTURE_SIZE_IN_BYTES, "D3D12 mismatch");
#endif

    //---------------------------------------------------------------------------------
#pragma warning(push)
#pragma warning( disable : 6101 )

    template<class index_t>
    HRESULT ReorderFaces(
        _In_reads_(nFaces * 3) const index_t* ibin, _In_ size_t nFaces,
        _In_reads_opt_(nFaces * 3) const uint32_t* adjin,
        _In_reads_(nFaces) const uint32_t* faceRemap,
        _Out_writes_(nFaces * 3) index_t* ibout,
        _Out_writes_opt_(nFaces * 3) uint32_t* adjout)
    {
        assert(ibin != nullptr && faceRemap != nullptr && ibout != nullptr && ibin != ibout);
        _Analysis_assume_(ibin != nullptr && faceRemap != nullptr && ibout != nullptr && ibin != ibout);

        assert((!adjin && !adjout) || ((adjin && adjout) && adjin != adjout));
        _Analysis_assume_((!adjin && !adjout) || ((adjin && adjout) && adjin != adjout));

        for (size_t j = 0; j < nFaces; ++j)
        {
            uint32_t src = faceRemap[j];

            if (src == UNUSED32)
                continue;

            if (src < nFaces)
            {
                ibout[j * 3] = ibin[src * 3];
                ibout[j * 3 + 1] = ibin[src * 3 + 1];
                ibout[j * 3 + 2] = ibin[src * 3 + 2];

                if (adjin && adjout)
                {
                    adjout[j * 3] = adjin[src * 3];
                    adjout[j * 3 + 1] = adjin[src * 3 + 1];
                    adjout[j * 3 + 2] = adjin[src * 3 + 2];
                }
            }
            else
                return E_FAIL;
        }

        return S_OK;
    }

#pragma warning(pop)


    //---------------------------------------------------------------------------------
    template<class index_t>
    HRESULT SwapFaces(
        _Inout_updates_all_(nFaces * 3) index_t* ib, _In_ size_t nFaces,
        _Inout_updates_all_opt_(nFaces * 3) uint32_t* adj,
        _In_reads_(nFaces) const uint32_t* faceRemap)
    {
        assert(ib != nullptr && faceRemap != nullptr);
        _Analysis_assume_(ib != nullptr && faceRemap != nullptr);

        std::unique_ptr<uint8_t[]> temp(new (std::nothrow) uint8_t[(sizeof(bool) + sizeof(uint32_t)) * nFaces]);
        if (!temp)
            return E_OUTOFMEMORY;

        auto faceRemapInverse = reinterpret_cast<uint32_t*>(temp.get());

        memset(faceRemapInverse, 0xff, sizeof(uint32_t) * nFaces);

        for (uint32_t j = 0; j < nFaces; ++j)
        {
            if (faceRemap[j] != UNUSED32)
            {
                if (faceRemap[j] >= nFaces)
                    return E_UNEXPECTED;

                faceRemapInverse[faceRemap[j]] = j;
            }
        }

        auto moved = reinterpret_cast<bool*>(temp.get() + sizeof(uint32_t) * nFaces);

        memset(moved, 0, sizeof(bool) * nFaces);

        for (size_t j = 0; j < nFaces; ++j)
        {
            if (moved[j])
                continue;

            uint32_t dest = faceRemapInverse[j];

            if (dest == UNUSED32)
                continue;

            if (dest >= nFaces)
                return E_FAIL;

            while (dest != j)
            {
                // Swap face
                index_t i0 = ib[dest * 3];
                index_t i1 = ib[dest * 3 + 1];
                index_t i2 = ib[dest * 3 + 2];

                ib[dest * 3] = ib[j * 3];
                ib[dest * 3 + 1] = ib[j * 3 + 1];
                ib[dest * 3 + 2] = ib[j * 3 + 2];

                ib[j * 3] = i0;
                ib[j * 3 + 1] = i1;
                ib[j * 3 + 2] = i2;

                if (adj)
                {
                    uint32_t a0 = adj[dest * 3];
                    uint32_t a1 = adj[dest * 3 + 1];
                    uint32_t a2 = adj[dest * 3 + 2];

                    adj[dest * 3] = adj[j * 3];
                    adj[dest * 3 + 1] = adj[j * 3 + 1];
                    adj[dest * 3 + 2] = adj[j * 3 + 2];

                    adj[j * 3] = a0;
                    adj[j * 3 + 1] = a1;
                    adj[j * 3 + 2] = a2;
                }

                moved[dest] = true;

                dest = faceRemapInverse[dest];

                if (dest == UNUSED32 || moved[dest])
                    break;

                if (dest >= nFaces)
                    return E_FAIL;
            }
        }

        return S_OK;
    }


    //---------------------------------------------------------------------------------
    HRESULT SwapVertices(
        _Inout_updates_bytes_all_(nVerts*stride) void* vb, size_t stride, size_t nVerts,
        _Inout_updates_all_opt_(nVerts) uint32_t* pointRep, _In_reads_(nVerts) const uint32_t* vertexRemap)
    {
        if (!vb || !stride || !nVerts || !vertexRemap)
            return E_INVALIDARG;

        if (stride > c_MaxStride)
            return E_INVALIDARG;

        std::unique_ptr<uint8_t[]> temp(new (std::nothrow) uint8_t[((sizeof(bool) + sizeof(uint32_t)) * nVerts) + stride]);
        if (!temp)
            return E_OUTOFMEMORY;

        auto vertexRemapInverse = reinterpret_cast<uint32_t*>(temp.get());

        memset(vertexRemapInverse, 0xff, sizeof(uint32_t) * nVerts);

        for (uint32_t j = 0; j < nVerts; ++j)
        {
            if (vertexRemap[j] != UNUSED32)
            {
                if (vertexRemap[j] >= nVerts)
                    return E_UNEXPECTED;

                vertexRemapInverse[vertexRemap[j]] = j;
            }
        }

        auto moved = reinterpret_cast<bool*>(temp.get() + sizeof(uint32_t) * nVerts);
        memset(moved, 0, sizeof(bool) * nVerts);

        auto vbtemp = temp.get() + ((sizeof(bool) + sizeof(uint32_t)) * nVerts);

        auto ptr = static_cast<uint8_t*>(vb);

        for (size_t j = 0; j < nVerts; ++j)
        {
            if (moved[j])
                continue;

            uint32_t dest = vertexRemapInverse[j];

            if (dest == UNUSED32)
                continue;

            if (dest >= nVerts)
                return E_UNEXPECTED;

            bool next = false;

            while (dest != j)
            {
                // Swap vertex
#ifdef _PREFAST_
#pragma prefast(push)
#pragma prefast(disable : 26019, "PREfast noise: Esp:1307")
#endif
                memcpy(vbtemp, ptr + dest*stride, stride);
                memcpy(ptr + dest*stride, ptr + j*stride, stride);
                memcpy(ptr + j*stride, vbtemp, stride);
#ifdef _PREFAST_
#pragma prefast(pop)
#endif

                if (pointRep)
                {
                    std::swap(pointRep[dest], pointRep[j]);
                    // Remap
                    uint32_t pr = pointRep[dest];
                    if (pr < nVerts)
                    {
                        pointRep[dest] = vertexRemapInverse[pr];
                    }
                }

                moved[dest] = true;

                dest = vertexRemapInverse[dest];

                if (dest == UNUSED32 || moved[dest])
                {
                    next = true;
                    break;
                }

                if (dest >= nVerts)
                    return E_FAIL;
            }

            if (next)
                continue;

            if (pointRep)
            {
                // Remap
                uint32_t pr = pointRep[j];
                if (pr < nVerts)
                {
                    pointRep[j] = vertexRemapInverse[pr];
                }
            }
        }

        return S_OK;
    }


    //---------------------------------------------------------------------------------
    template<class index_t>
    HRESULT FinalizeIBImpl(
        _In_reads_(nFaces * 3) const index_t* ibin, size_t nFaces,
        _In_reads_(nVerts) const uint32_t* vertexRemap, size_t nVerts,
        _Out_writes_(nFaces * 3) index_t* ibout)
    {
        if (!ibin || !nFaces || !vertexRemap || !nVerts || !ibout)
            return E_INVALIDARG;

        if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
            return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

        if (nVerts >= index_t(-1))
            return E_INVALIDARG;

        std::unique_ptr<uint32_t[]> vertexRemapInverse(new (std::nothrow) uint32_t[nVerts]);
        if (!vertexRemapInverse)
            return E_OUTOFMEMORY;

        memset(vertexRemapInverse.get(), 0xff, sizeof(uint32_t) * nVerts);

        for (uint32_t j = 0; j < nVerts; ++j)
        {
            if (vertexRemap[j] != UNUSED32)
            {
                if (vertexRemap[j] >= nVerts)
                    return E_UNEXPECTED;

                vertexRemapInverse[vertexRemap[j]] = j;
            }
        }

        for (size_t j = 0; j < (nFaces * 3); ++j)
        {
            index_t i = ibin[j];
            if (i == index_t(-1))
            {
                ibout[j] = index_t(-1);
                continue;
            }

            if (i >= nVerts)
                return E_UNEXPECTED;

            uint32_t dest = vertexRemapInverse[i];
            if (dest == UNUSED32)
            {
                ibout[j] = i;
                continue;
            }

            if (dest < nVerts)
            {
                ibout[j] = index_t(dest);
            }
            else
                return E_FAIL;
        }

        return S_OK;
    }


    //---------------------------------------------------------------------------------
    template<class index_t>
    HRESULT FinalizeIBImpl(
        _Inout_updates_all_(nFaces * 3) index_t* ib, size_t nFaces,
        _In_reads_(nVerts) const uint32_t* vertexRemap, size_t nVerts)
    {
        if (!ib || !nFaces || !vertexRemap || !nVerts)
            return E_INVALIDARG;

        if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
            return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

        if (nVerts >= index_t(-1))
            return E_INVALIDARG;

        std::unique_ptr<uint32_t[]> vertexRemapInverse(new (std::nothrow) uint32_t[nVerts]);
        if (!vertexRemapInverse)
            return E_OUTOFMEMORY;

        memset(vertexRemapInverse.get(), 0xff, sizeof(uint32_t) * nVerts);

        for (uint32_t j = 0; j < nVerts; ++j)
        {
            if (vertexRemap[j] != UNUSED32)
            {
                if (vertexRemap[j] >= nVerts)
                    return E_UNEXPECTED;

                vertexRemapInverse[vertexRemap[j]] = j;
            }
        }

        for (size_t j = 0; j < (nFaces * 3); ++j)
        {
            index_t i = ib[j];
            if (i == index_t(-1))
                continue;

            if (i >= nVerts)
                return E_UNEXPECTED;

            uint32_t dest = vertexRemapInverse[i];
            if (dest == UNUSED32)
                continue;

            if (dest < nVerts)
            {
                ib[j] = index_t(dest);
            }
            else
                return E_FAIL;
        }

        return S_OK;
    }
}

//=====================================================================================
// Entry-points
//=====================================================================================

//-------------------------------------------------------------------------------------
// Applies a face remap reordering to an index buffer
//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::ReorderIB(
    const uint16_t* ibin, size_t nFaces, const uint32_t* faceRemap,
    uint16_t* ibout)
{
    if (!ibin || !nFaces || !faceRemap || !ibout)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    if (ibin == ibout)
        return HRESULT_FROM_WIN32(ERROR_NOT_SUPPORTED);

    return ReorderFaces<uint16_t>(ibin, nFaces, nullptr, faceRemap, ibout, nullptr);
}

_Use_decl_annotations_
HRESULT DirectX::ReorderIB(
    uint16_t* ib, size_t nFaces,
    const uint32_t* faceRemap)
{
    if (!ib || !nFaces || !faceRemap)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    return SwapFaces<uint16_t>(ib, nFaces, nullptr, faceRemap);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::ReorderIB(
    const uint32_t* ibin, size_t nFaces, const uint32_t* faceRemap,
    uint32_t* ibout)
{
    if (!ibin || !nFaces || !faceRemap || !ibout)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    if (ibin == ibout)
        return HRESULT_FROM_WIN32(ERROR_NOT_SUPPORTED);

    return ReorderFaces<uint32_t>(ibin, nFaces, nullptr, faceRemap, ibout, nullptr);
}

_Use_decl_annotations_
HRESULT DirectX::ReorderIB(
    uint32_t* ib, size_t nFaces, const uint32_t* faceRemap)
{
    if (!ib || !nFaces || !faceRemap)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    return SwapFaces<uint32_t>(ib, nFaces, nullptr, faceRemap);
}


//-------------------------------------------------------------------------------------
// Applies a face remap reordering to an index buffer and adjacency
//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::ReorderIBAndAdjacency(
    const uint16_t* ibin, size_t nFaces, const uint32_t* adjin, const uint32_t* faceRemap,
    uint16_t* ibout, uint32_t* adjout)
{
    if (!ibin || !nFaces || !adjin || !faceRemap || !ibout || !adjout)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    if ((ibin == ibout) || (adjin == adjout))
        return HRESULT_FROM_WIN32(ERROR_NOT_SUPPORTED);

    return ReorderFaces<uint16_t>(ibin, nFaces, adjin, faceRemap, ibout, adjout);
}

_Use_decl_annotations_
HRESULT DirectX::ReorderIBAndAdjacency(
    uint16_t* ib, size_t nFaces, uint32_t* adj,
    const uint32_t* faceRemap)
{
    if (!ib || !nFaces || !adj || !faceRemap)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    return SwapFaces<uint16_t>(ib, nFaces, adj, faceRemap);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::ReorderIBAndAdjacency(
    const uint32_t* ibin, size_t nFaces, const uint32_t* adjin, const uint32_t* faceRemap,
    uint32_t* ibout, uint32_t* adjout)
{
    if (!ibin || !nFaces || !adjin || !faceRemap || !ibout || !adjout)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    if ((ibin == ibout) || (adjin == adjout))
        return HRESULT_FROM_WIN32(ERROR_NOT_SUPPORTED);

    return ReorderFaces<uint32_t>(ibin, nFaces, adjin, faceRemap, ibout, adjout);
}

_Use_decl_annotations_
HRESULT DirectX::ReorderIBAndAdjacency(
    uint32_t* ib, size_t nFaces, uint32_t* adj,
    const uint32_t* faceRemap)
{
    if (!ib || !nFaces || !adj || !faceRemap)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    return SwapFaces<uint32_t>(ib, nFaces, adj, faceRemap);
}


//-------------------------------------------------------------------------------------
// Applies a vertex remap, filling out a new index buffer
//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::FinalizeIB(
    const uint16_t* ibin, size_t nFaces,
    const uint32_t* vertexRemap, size_t nVerts,
    uint16_t* ibout)
{
    return FinalizeIBImpl<uint16_t>(ibin, nFaces, vertexRemap, nVerts, ibout);
}

_Use_decl_annotations_
HRESULT DirectX::FinalizeIB(
    uint16_t* ib, size_t nFaces,
    const uint32_t* vertexRemap, size_t nVerts)
{
    return FinalizeIBImpl<uint16_t>(ib, nFaces, vertexRemap, nVerts);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::FinalizeIB(
    const uint32_t* ibin, size_t nFaces,
    const uint32_t* vertexRemap, size_t nVerts,
    uint32_t* ibout)
{
    return FinalizeIBImpl<uint32_t>(ibin, nFaces, vertexRemap, nVerts, ibout);
}

_Use_decl_annotations_
HRESULT DirectX::FinalizeIB(
    uint32_t* ib, size_t nFaces,
    const uint32_t* vertexRemap, size_t nVerts)
{
    return FinalizeIBImpl<uint32_t>(ib, nFaces, vertexRemap, nVerts);
}


//-------------------------------------------------------------------------------------
// Applies a vertex remap and/or a vertex duplication set to a vertex buffer
//-------------------------------------------------------------------------------------
#pragma warning(push)
#pragma warning( disable : 6101 )

_Use_decl_annotations_
HRESULT DirectX::FinalizeVB(
    const void* vbin, size_t stride, size_t nVerts,
    const uint32_t* dupVerts, size_t nDupVerts,
    const uint32_t* vertexRemap, void* vbout)
{
    if (!vbin || !stride || !nVerts || !vbout)
        return E_INVALIDARG;

    if (!dupVerts && !vertexRemap)
        return E_INVALIDARG;

    if (dupVerts && !nDupVerts)
        return E_INVALIDARG;

    if (!dupVerts && nDupVerts > 0)
        return E_INVALIDARG;

    if (nVerts >= UINT32_MAX)
        return E_INVALIDARG;

    if (stride > c_MaxStride)
        return E_INVALIDARG;

    if ((uint64_t(nVerts) + uint64_t(nDupVerts)) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    if (vbin == vbout)
        return HRESULT_FROM_WIN32(ERROR_NOT_SUPPORTED);

    size_t newVerts = nVerts + nDupVerts;

    auto sptr = static_cast<const uint8_t*>(vbin);
    auto dptr = static_cast<uint8_t*>(vbout);

#ifdef _DEBUG
    memset(vbout, 0, newVerts * stride);
#endif

    for (size_t j = 0; j < newVerts; ++j)
    {
        uint32_t src = (vertexRemap) ? vertexRemap[j] : uint32_t(j);

        if (src == UNUSED32)
        {
            // remap entry is unused
        }
        else if (src >= newVerts)
        {
            return E_FAIL;
        }
        else if (src < nVerts)
        {
            memcpy(dptr, sptr + src * stride, stride);
        }
        else if (dupVerts)
        {
            uint32_t dup = dupVerts[src - nVerts];
            memcpy(dptr, sptr + dup * stride, stride);
        }
        else
            return E_FAIL;

        dptr += stride;
    }

    return S_OK;
}

#pragma warning(pop)

_Use_decl_annotations_
HRESULT DirectX::FinalizeVB(
    void* vb, size_t stride,
    size_t nVerts, const uint32_t* vertexRemap)
{
    if (nVerts >= UINT32_MAX)
        return E_INVALIDARG;

    return SwapVertices(vb, stride, nVerts, nullptr, vertexRemap);
}


//-------------------------------------------------------------------------------------
// Applies a vertex remap and/or a vertex duplication set to a vertex buffer and
// point representatives
//-------------------------------------------------------------------------------------
#pragma warning(push)
#pragma warning( disable : 6101 )

_Use_decl_annotations_
HRESULT DirectX::FinalizeVBAndPointReps(
    const void* vbin, size_t stride, size_t nVerts, const uint32_t* prin,
    const uint32_t* dupVerts, size_t nDupVerts, const uint32_t* vertexRemap,
    void* vbout, uint32_t* prout)
{
    if (!vbin || !stride || !nVerts || !prin || !vbout || !prout)
        return E_INVALIDARG;

    if (!dupVerts && !vertexRemap)
        return E_INVALIDARG;

    if (dupVerts && !nDupVerts)
        return E_INVALIDARG;

    if (!dupVerts && nDupVerts > 0)
        return E_INVALIDARG;

    if (nVerts >= UINT32_MAX)
        return E_INVALIDARG;

    if (stride > c_MaxStride)
        return E_INVALIDARG;

    if ((uint64_t(nVerts) + uint64_t(nDupVerts)) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    if (vbin == vbout)
        return HRESULT_FROM_WIN32(ERROR_NOT_SUPPORTED);

    size_t newVerts = nVerts + nDupVerts;

    std::unique_ptr<uint32_t[]> vertexRemapInverse;   
    if (vertexRemap)
    {
        vertexRemapInverse.reset(new (std::nothrow) uint32_t[newVerts]);
        if (!vertexRemapInverse)
            return E_OUTOFMEMORY;

        memset(vertexRemapInverse.get(), 0xff, sizeof(uint32_t) * newVerts);

        for (uint32_t j = 0; j < newVerts; ++j)
        {
            if (vertexRemap[j] != UNUSED32)
            {
                if (vertexRemap[j] >= newVerts)
                    return E_INVALIDARG;

                vertexRemapInverse[vertexRemap[j]] = j;
            }
        }
    }

    auto sptr = static_cast<const uint8_t*>(vbin);
    auto dptr = static_cast<uint8_t*>(vbout);

#ifdef _DEBUG
    memset(vbout, 0, newVerts * stride);
#endif

    std::unique_ptr<uint32_t[]> pointRep(new uint32_t[nVerts + nDupVerts]);
    memcpy(pointRep.get(), prin, sizeof(uint32_t) * nVerts);
    for (size_t i = 0; i < nDupVerts; ++i)
    {
        pointRep[i + nVerts] = prin[dupVerts[i]];
    }

    for (size_t j = 0; j < newVerts; ++j)
    {
        uint32_t src = (vertexRemap) ? vertexRemap[j] : uint32_t(j);

        if (src == UNUSED32)
        {
            // remap entry is unused
        }
        else if (src >= newVerts)
        {
            return E_FAIL;
        }
        else if (src < nVerts)
        {
            memcpy(dptr, sptr + src * stride, stride);

            uint32_t pr = pointRep[src];
            if (pr < newVerts)
            {
                prout[j] = (vertexRemapInverse) ? vertexRemapInverse[pr] : pr;
            }
        }
        else if (dupVerts)
        {
            uint32_t dup = dupVerts[src - nVerts];
            memcpy(dptr, sptr + dup * stride, stride);

            uint32_t pr = pointRep[src];
            if (pr < newVerts)
            {
                prout[j] = (vertexRemapInverse) ? vertexRemapInverse[pr] : pr;
            }
        }
        else
            return E_FAIL;

        dptr += stride;
    }

    if (vertexRemap)
    {
        // clean up point reps for any removed vertices
        for (uint32_t i = 0; i < newVerts; ++i)
        {
            if (vertexRemap[i] == UNUSED32)
            {
                pointRep[i] = UNUSED32;
            }
        }
    }

    return S_OK;
}

#pragma warning(pop)

_Use_decl_annotations_
HRESULT DirectX::FinalizeVBAndPointReps(
    void* vb, size_t stride, size_t nVerts,
    uint32_t* pointRep, const uint32_t* vertexRemap)
{
    if (nVerts >= UINT32_MAX)
        return E_INVALIDARG;

    if (!pointRep || !vertexRemap)
        return E_INVALIDARG;

    HRESULT hr = SwapVertices(vb, stride, nVerts, pointRep, vertexRemap);

    // clean up point reps for any removed vertices
    for (uint32_t i = 0; i < nVerts; ++i)
    {
        if (vertexRemap[i] == UNUSED32)
        {
            pointRep[i] = UNUSED32;
        }
    }

    return hr;
}


//-------------------------------------------------------------------------------------
// Applies a vertex remap which contains a known number of unused entries at the end
//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::CompactVB(
    const void* vbin, size_t stride, size_t nVerts,
    size_t trailingUnused,
    const uint32_t* vertexRemap, void* vbout)
{
    if (!vbin || !stride || !nVerts || !vbout || !vertexRemap)
        return E_INVALIDARG;

    if (nVerts >= UINT32_MAX || trailingUnused >= UINT32_MAX)
        return E_INVALIDARG;

    if (stride > c_MaxStride)
        return E_INVALIDARG;

    if (trailingUnused >= nVerts)
        return E_INVALIDARG;

    if (vbin == vbout)
        return HRESULT_FROM_WIN32(ERROR_NOT_SUPPORTED);

    size_t newVerts = nVerts - trailingUnused;

    auto sptr = static_cast<const uint8_t*>(vbin);
    auto dptr = static_cast<uint8_t*>(vbout);

#ifdef _DEBUG
    memset(vbout, 0, newVerts * stride);
#endif

    for (size_t j = 0; j < newVerts; ++j)
    {
        uint32_t src = vertexRemap[j];

        if (src == UNUSED32)
        {
            // remap entry is unused
        }
        else if (src < nVerts)
        {
            memcpy(dptr, sptr + src * stride, stride);
        }
        else
            return E_FAIL;

        dptr += stride;
    }

    return S_OK;
}

