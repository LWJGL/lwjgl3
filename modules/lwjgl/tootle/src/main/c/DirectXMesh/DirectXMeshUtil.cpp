//-------------------------------------------------------------------------------------
// DirectXMeshUtil.cpp
//  
// DirectX Mesh Geometry Library - Utilities
//
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// http://go.microsoft.com/fwlink/?LinkID=324981
//-------------------------------------------------------------------------------------

#include "DirectXMeshP.h"

using namespace DirectX;

#if defined(_XBOX_ONE) && defined(_TITLE)
static_assert(XBOX_DXGI_FORMAT_R10G10B10_SNORM_A2_UNORM == DXGI_FORMAT_R10G10B10_SNORM_A2_UNORM, "Xbox One XDK mismatch detected");
#endif

//=====================================================================================
// DXGI Format Utilities
//=====================================================================================

//-------------------------------------------------------------------------------------
// Returns bytes-per-element for a given DXGI format, or 0 on failure
//-------------------------------------------------------------------------------------
_Use_decl_annotations_
size_t DirectX::BytesPerElement(DXGI_FORMAT fmt)
{
    // This list only includes those formats that are valid for use by IB or VB

    switch (static_cast<int>(fmt))
    {
    case DXGI_FORMAT_R32G32B32A32_FLOAT:
    case DXGI_FORMAT_R32G32B32A32_UINT:
    case DXGI_FORMAT_R32G32B32A32_SINT:
        return 16;

    case DXGI_FORMAT_R32G32B32_FLOAT:
    case DXGI_FORMAT_R32G32B32_UINT:
    case DXGI_FORMAT_R32G32B32_SINT:
        return 12;

    case DXGI_FORMAT_R16G16B16A16_FLOAT:
    case DXGI_FORMAT_R16G16B16A16_UNORM:
    case DXGI_FORMAT_R16G16B16A16_UINT:
    case DXGI_FORMAT_R16G16B16A16_SNORM:
    case DXGI_FORMAT_R16G16B16A16_SINT:
    case DXGI_FORMAT_R32G32_FLOAT:
    case DXGI_FORMAT_R32G32_UINT:
    case DXGI_FORMAT_R32G32_SINT:
        return 8;

    case DXGI_FORMAT_R10G10B10A2_UNORM:
    case DXGI_FORMAT_R10G10B10A2_UINT:
    case DXGI_FORMAT_R11G11B10_FLOAT:
    case DXGI_FORMAT_R8G8B8A8_UNORM:
    case DXGI_FORMAT_R8G8B8A8_UINT:
    case DXGI_FORMAT_R8G8B8A8_SNORM:
    case DXGI_FORMAT_R8G8B8A8_SINT:
    case DXGI_FORMAT_R16G16_FLOAT:
    case DXGI_FORMAT_R16G16_UNORM:
    case DXGI_FORMAT_R16G16_UINT:
    case DXGI_FORMAT_R16G16_SNORM:
    case DXGI_FORMAT_R16G16_SINT:
    case DXGI_FORMAT_R32_FLOAT:
    case DXGI_FORMAT_R32_UINT:
    case DXGI_FORMAT_R32_SINT:
    case DXGI_FORMAT_B8G8R8A8_UNORM:
    case DXGI_FORMAT_B8G8R8X8_UNORM:
    case XBOX_DXGI_FORMAT_R10G10B10_SNORM_A2_UNORM:
        return 4;

    case DXGI_FORMAT_R8G8_UNORM:
    case DXGI_FORMAT_R8G8_UINT:
    case DXGI_FORMAT_R8G8_SNORM:
    case DXGI_FORMAT_R8G8_SINT:
    case DXGI_FORMAT_R16_FLOAT:
    case DXGI_FORMAT_R16_UNORM:
    case DXGI_FORMAT_R16_UINT:
    case DXGI_FORMAT_R16_SNORM:
    case DXGI_FORMAT_R16_SINT:
    case DXGI_FORMAT_B5G6R5_UNORM:
    case DXGI_FORMAT_B5G5R5A1_UNORM:
        return 2;

    case DXGI_FORMAT_R8_UNORM:
    case DXGI_FORMAT_R8_UINT:
    case DXGI_FORMAT_R8_SNORM:
    case DXGI_FORMAT_R8_SINT:
        return 1;

    case DXGI_FORMAT_B4G4R4A4_UNORM:
        return 2;

    default:
        // No BC, sRGB, XRBias, SharedExp, Typeless, Depth, or Video formats
        return 0;
    }
}


//=====================================================================================
// Input Layout Descriptor Utilities
//=====================================================================================

//-------------------------------------------------------------------------------------
// Validates a Direct3D Input Layout
//-------------------------------------------------------------------------------------

#if defined(__d3d11_h__) || defined(__d3d11_x_h__)
_Use_decl_annotations_
bool DirectX::IsValid(const D3D11_INPUT_ELEMENT_DESC* vbDecl, size_t nDecl)
{
    if (!vbDecl || !nDecl)
    {
        // Note that 0 is allowed by the runtime for degenerate cases, but is not defined for DirectXMesh
        return false;
    }

    if (nDecl > D3D11_IA_VERTEX_INPUT_STRUCTURE_ELEMENT_COUNT)
    {
        // The upper-limit depends on feature level, so we assume highest value here
        return false;
    }

    for (size_t j = 0; j < nDecl; ++j)
    {
        size_t bpe = BytesPerElement(vbDecl[j].Format);
        if (!bpe)
        {
            // Not a valid DXGI format or it's not valid for VB usage
            return false;
        }

        uint32_t alignment;

        if (bpe == 1)
            alignment = 1;
        else if (bpe == 2)
            alignment = 2;
        else
            alignment = 4;

        if ((vbDecl[j].AlignedByteOffset != D3D11_APPEND_ALIGNED_ELEMENT)
            && (vbDecl[j].AlignedByteOffset % alignment) != 0)
        {
            // Invalid alignment for element
            return false;
        }

        if (vbDecl[j].InputSlot >= D3D11_IA_VERTEX_INPUT_RESOURCE_SLOT_COUNT)
        {
            // The upper-limit depends on feature level, so we assume highest value here
            return false;
        }

        switch (vbDecl[j].InputSlotClass)
        {
        case D3D11_INPUT_PER_VERTEX_DATA:
            if (vbDecl[j].InstanceDataStepRate != 0)
            {
                return false;
            }
            break;

        case D3D11_INPUT_PER_INSTANCE_DATA:
            break;

        default:
            return false;
        }

        if (!vbDecl[j].SemanticName)
        {
            return false;
        }

        // Debug layer also checks for trailing digit in the semantic name, and checks
        // for inconsistent semantic name/slot assignment.
    }

    return true;
}
#endif

#if defined(__d3d12_h__) || defined(__d3d12_x_h__)
bool DirectX::IsValid(const D3D12_INPUT_LAYOUT_DESC& vbDecl)
{
    if (!vbDecl.pInputElementDescs || !vbDecl.NumElements)
    {
        // Note that 0 is allowed by the runtime for degenerate cases, but is not defined for DirectXMesh
        return false;
    }

    if (vbDecl.NumElements > D3D12_IA_VERTEX_INPUT_STRUCTURE_ELEMENT_COUNT)
    {
        return false;
    }

    for (size_t j = 0; j < vbDecl.NumElements; ++j)
    {
        size_t bpe = BytesPerElement(vbDecl.pInputElementDescs[j].Format);
        if (!bpe)
        {
            // Not a valid DXGI format or it's not valid for VB usage
            return false;
        }

        uint32_t alignment;

        if (bpe == 1)
            alignment = 1;
        else if (bpe == 2)
            alignment = 2;
        else
            alignment = 4;

        if ((vbDecl.pInputElementDescs[j].AlignedByteOffset != D3D12_APPEND_ALIGNED_ELEMENT)
            && (vbDecl.pInputElementDescs[j].AlignedByteOffset % alignment) != 0)
        {
            // Invalid alignment for element
            return false;
        }

        if (vbDecl.pInputElementDescs[j].InputSlot >= D3D12_IA_VERTEX_INPUT_RESOURCE_SLOT_COUNT)
        {
            // The upper-limit depends on feature level, so we assume highest value here
            return false;
        }

        switch (vbDecl.pInputElementDescs[j].InputSlotClass)
        {
        case D3D12_INPUT_CLASSIFICATION_PER_VERTEX_DATA:
            if (vbDecl.pInputElementDescs[j].InstanceDataStepRate != 0)
            {
                return false;
            }
            break;

        case D3D12_INPUT_CLASSIFICATION_PER_INSTANCE_DATA:
            break;

        default:
            return false;
        }

        if (!vbDecl.pInputElementDescs[j].SemanticName)
        {
            return false;
        }

        // Debug layer also checks for trailing digit in the semantic name, and checks
        // for inconsistent semantic name/slot assignment.
    }

    return true;
}
#endif

//-------------------------------------------------------------------------------------
// Compute the offsets to each element, and total stride of each slot
//-------------------------------------------------------------------------------------

#if defined(__d3d11_h__) || defined(__d3d11_x_h__)
_Use_decl_annotations_
void DirectX::ComputeInputLayout(
    const D3D11_INPUT_ELEMENT_DESC* vbDecl, size_t nDecl,
    uint32_t* offsets, uint32_t* strides)
{
    assert(IsValid(vbDecl, nDecl));

    if (offsets)
        memset(offsets, 0, sizeof(uint32_t) * nDecl);

    if (strides)
        memset(strides, 0, sizeof(uint32_t) * D3D11_IA_VERTEX_INPUT_RESOURCE_SLOT_COUNT);

    uint32_t prevABO[D3D11_IA_VERTEX_INPUT_RESOURCE_SLOT_COUNT];
    memset(prevABO, 0, sizeof(uint32_t) * D3D11_IA_VERTEX_INPUT_RESOURCE_SLOT_COUNT);

    for (size_t j = 0; j < nDecl; ++j)
    {
        uint32_t slot = vbDecl[j].InputSlot;
        if (slot >= D3D11_IA_VERTEX_INPUT_RESOURCE_SLOT_COUNT)
        {
            // ignore bad input slots
            continue;
        }

        size_t bpe = BytesPerElement(vbDecl[j].Format);
        if (!bpe)
        {
            // ignore invalid format
            continue;
        }

        uint32_t alignment;

        if (bpe == 1)
            alignment = 1;
        else if (bpe == 2)
            alignment = 2;
        else
            alignment = 4;

        uint32_t alignedByteOffset = vbDecl[j].AlignedByteOffset;

        if (alignedByteOffset == D3D11_APPEND_ALIGNED_ELEMENT)
        {
            alignedByteOffset = prevABO[slot];
        }

        if (offsets)
        {
            offsets[j] = alignedByteOffset;
        }

        if (strides)
        {
            uint32_t istride = uint32_t(alignedByteOffset + bpe);
            strides[slot] = std::max<uint32_t>(strides[slot], istride);
        }

        prevABO[slot] = uint32_t(alignedByteOffset + bpe + (bpe % alignment));
    }
}
#endif

#if defined(__d3d12_h__) || defined(__d3d12_x_h__)
_Use_decl_annotations_
void DirectX::ComputeInputLayout(const D3D12_INPUT_LAYOUT_DESC& vbDecl,
    uint32_t* offsets, uint32_t* strides)
{
    assert(IsValid(vbDecl));

    if (offsets)
        memset(offsets, 0, sizeof(uint32_t) * vbDecl.NumElements);

    if (strides)
        memset(strides, 0, sizeof(uint32_t) * D3D12_IA_VERTEX_INPUT_RESOURCE_SLOT_COUNT);

    uint32_t prevABO[D3D12_IA_VERTEX_INPUT_RESOURCE_SLOT_COUNT] = {};

    for (size_t j = 0; j < vbDecl.NumElements; ++j)
    {
        uint32_t slot = vbDecl.pInputElementDescs[j].InputSlot;
        if (slot >= D3D12_IA_VERTEX_INPUT_RESOURCE_SLOT_COUNT)
        {
            // ignore bad input slots
            continue;
        }

        size_t bpe = BytesPerElement(vbDecl.pInputElementDescs[j].Format);
        if (!bpe)
        {
            // ignore invalid format
            continue;
        }

        uint32_t alignment;

        if (bpe == 1)
            alignment = 1;
        else if (bpe == 2)
            alignment = 2;
        else
            alignment = 4;

        uint32_t alignedByteOffset = vbDecl.pInputElementDescs[j].AlignedByteOffset;

        if (alignedByteOffset == D3D12_APPEND_ALIGNED_ELEMENT)
        {
            alignedByteOffset = prevABO[slot];
        }

        if (offsets)
        {
            offsets[j] = alignedByteOffset;
        }

        if (strides)
        {
            uint32_t istride = uint32_t(alignedByteOffset + bpe);
            strides[slot] = std::max<uint32_t>(strides[slot], istride);
        }

        prevABO[slot] = uint32_t(alignedByteOffset + bpe + (bpe % alignment));
    }
}
#endif

//=====================================================================================
// Attribute Utilities
//=====================================================================================
_Use_decl_annotations_
std::vector<std::pair<size_t, size_t>> DirectX::ComputeSubsets(const uint32_t* attributes, size_t nFaces)
{
    std::vector<std::pair<size_t, size_t>> subsets;

    if (!nFaces)
        return subsets;

    if (!attributes)
    {
        subsets.emplace_back(std::pair<size_t, size_t>(0, nFaces));
        return subsets;
    }

    uint32_t lastAttr = attributes[0];
    size_t offset = 0;
    size_t count = 1;

    for (size_t j = 1; j < nFaces; ++j)
    {
        if (attributes[j] != lastAttr)
        {
            subsets.emplace_back(std::pair<size_t, size_t>(offset, count));
            lastAttr = attributes[j];
            offset = j;
            count = 1;
        }
        else
        {
            count += 1;
        }
    }

    if (count > 0)
    {
        subsets.emplace_back(std::pair<size_t, size_t>(offset, count));
    }

    return subsets;
}

//=====================================================================================
// Mesh Optimization Utilities
//=====================================================================================

namespace
{
    template<class index_t>
    void ComputeVertexCacheMissRateImpl(
        _In_reads_(nFaces * 3) const index_t* indices, size_t nFaces, size_t nVerts, size_t cacheSize,
        float& acmr, float& atvr)
    {
        acmr = -1.f;
        atvr = -1.f;

        if (!indices || !nFaces || !nVerts || !cacheSize)
            return;

        if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
            return;

        if (nVerts >= index_t(-1))
            return;

        size_t misses = 0;

        std::unique_ptr<uint32_t[]> fifo(new uint32_t[cacheSize]);
        size_t tail = 0;

        memset(fifo.get(), 0xff, sizeof(uint32_t) * cacheSize);

        for (size_t j = 0; j < (nFaces * 3); ++j)
        {
            if (indices[j] == index_t(-1))
                continue;

            bool found = false;

            for (size_t ptr = 0; ptr < cacheSize; ++ptr)
            {
                if (fifo[ptr] == indices[j])
                {
                    found = true;
                    break;
                }
            }

            if (!found)
            {
                ++misses;
                fifo[tail] = indices[j];
                ++tail;
                if (tail == cacheSize) tail = 0;
            }
        }

        // ideal is 0.5, individual tris have 3.0
        acmr = float(misses) / float(nFaces);

        // ideal is 1.0, worst case is 6.0
        atvr = float(misses) / float(nVerts);
    }
}

//-------------------------------------------------------------------------------------
_Use_decl_annotations_
void DirectX::ComputeVertexCacheMissRate(
    const uint16_t* indices, size_t nFaces, size_t nVerts, size_t cacheSize,
    float& acmr, float& atvr)
{
    ComputeVertexCacheMissRateImpl<uint16_t>(indices, nFaces, nVerts, cacheSize, acmr, atvr);
}

_Use_decl_annotations_
void DirectX::ComputeVertexCacheMissRate(
    const uint32_t* indices, size_t nFaces, size_t nVerts, size_t cacheSize,
    float& acmr, float& atvr)
{
    ComputeVertexCacheMissRateImpl<uint32_t>(indices, nFaces, nVerts, cacheSize, acmr, atvr);
}
