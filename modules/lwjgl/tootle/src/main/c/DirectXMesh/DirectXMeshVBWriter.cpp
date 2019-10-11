//-------------------------------------------------------------------------------------
// DirectXMeshVBWriter.cpp
//  
// DirectX Mesh Geometry Library - Vertex Buffer Writer
//
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// http://go.microsoft.com/fwlink/?LinkID=324981
//-------------------------------------------------------------------------------------

#include "DirectXMeshP.h"

using namespace DirectX;
using namespace DirectX::PackedVector;

namespace
{
    const size_t c_MaxSlot = 32;
    const size_t c_MaxStride = 2048;

    enum INPUT_CLASSIFICATION
    {
        PER_VERTEX_DATA = 0,
        PER_INSTANCE_DATA = 1
    };

    struct InputElementDesc
    {
        const char*             SemanticName;
        unsigned int            SemanticIndex;
        DXGI_FORMAT             Format;
        unsigned int            InputSlot;
        unsigned int            AlignedByteOffset;
        INPUT_CLASSIFICATION    InputSlotClass;
        unsigned int            InstanceDataStepRate;
    };

#if defined(__d3d11_h__) || defined(__d3d11_x_h__)
    static_assert(sizeof(InputElementDesc) == sizeof(D3D11_INPUT_ELEMENT_DESC), "D3D11 mismatch");
    static_assert(static_cast<int>(PER_VERTEX_DATA) == static_cast<int>(D3D11_INPUT_PER_VERTEX_DATA), "D3D11 mismatch");
    static_assert(static_cast<int>(PER_INSTANCE_DATA) == static_cast<int>(D3D11_INPUT_PER_INSTANCE_DATA), "D3D11 mismatch");
    static_assert(c_MaxSlot == D3D11_IA_VERTEX_INPUT_RESOURCE_SLOT_COUNT, "D3D11 mismatch");
    static_assert(c_MaxStride == D3D11_REQ_MULTI_ELEMENT_STRUCTURE_SIZE_IN_BYTES, "D3D11 mismatch");
#endif

#if defined(__d3d12_h__) || defined(__d3d12_x_h__)
    static_assert(sizeof(InputElementDesc) == sizeof(D3D12_INPUT_ELEMENT_DESC), "D3D12 mismatch");
    static_assert(static_cast<int>(PER_VERTEX_DATA) == static_cast<int>(D3D12_INPUT_CLASSIFICATION_PER_VERTEX_DATA), "D3D12 mismatch");
    static_assert(static_cast<int>(PER_INSTANCE_DATA) == static_cast<int>(D3D12_INPUT_CLASSIFICATION_PER_INSTANCE_DATA), "D3D12 mismatch");
    static_assert(c_MaxSlot == D3D12_IA_VERTEX_INPUT_RESOURCE_SLOT_COUNT, "D3D12 mismatch");
    static_assert(c_MaxStride == D3D12_REQ_MULTI_ELEMENT_STRUCTURE_SIZE_IN_BYTES, "D3D12 mismatch");
#endif
}

class VBWriter::Impl
{
public:
    Impl() noexcept :
        mStrides{},
        mBuffers{},
        mVerts{},
        mDefaultStrides{},
        mTempSize(0) {}

    HRESULT Initialize(_In_reads_(nDecl) const InputElementDesc* vbDecl, size_t nDecl);
    HRESULT AddStream(_Out_writes_bytes_(stride*nVerts) void* vb, size_t nVerts, size_t inputSlot, size_t stride);
    HRESULT Write(_In_reads_(count) const XMVECTOR* buffer, _In_z_ const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const;

    void Release()
    {
        mInputDesc.clear();
        mSemantics.clear();
        memset(mStrides, 0, sizeof(mStrides));
        memset(mBuffers, 0, sizeof(mBuffers));
        memset(mVerts, 0, sizeof(mVerts));
        memset(mDefaultStrides, 0, sizeof(mDefaultStrides));
        mTempBuffer.reset();
    }

    const InputElementDesc* GetElement(_In_z_ const char* semanticName, _In_ unsigned int semanticIndex) const
    {
        auto range = mSemantics.equal_range(semanticName);

        auto it = range.first;
        for (; it != range.second; ++it)
        {
            if (mInputDesc[it->second].SemanticIndex == semanticIndex)
                break;
        }

        if (it == range.second)
            return nullptr;

        return &mInputDesc[it->second];
    }

    XMVECTOR* GetTemporaryBuffer(size_t count) const
    {
        if (!mTempBuffer || (mTempSize < count))
        {
            mTempSize = count;

            for (size_t j = 0; j < c_MaxSlot; ++j)
            {
                if (mVerts[j] > mTempSize)
                    mTempSize = mVerts[j];
            }

            mTempBuffer.reset(static_cast<XMVECTOR*>(_aligned_malloc(sizeof(XMVECTOR) * mTempSize, 16)));
            if (!mTempBuffer)
                mTempSize = 0;
        }

        return mTempBuffer.get();
    }

private:
    typedef std::multimap<std::string, uint32_t> SemanticMap;

    std::vector<InputElementDesc>           mInputDesc;
    SemanticMap                             mSemantics;
    uint32_t                                mStrides[c_MaxSlot];
    void*                                   mBuffers[c_MaxSlot];
    size_t                                  mVerts[c_MaxSlot];
    uint32_t                                mDefaultStrides[c_MaxSlot];
    mutable size_t                          mTempSize;
    mutable ScopedAlignedArrayXMVECTOR      mTempBuffer;
};

//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT VBWriter::Impl::Initialize(const InputElementDesc* vbDecl, size_t nDecl)
{
    Release();

    uint32_t offsets[c_MaxSlot] = {};

#if defined(__d3d12_h__) || defined(__d3d12_x_h__)
    {
        if (nDecl > D3D12_IA_VERTEX_INPUT_STRUCTURE_ELEMENT_COUNT)
            return E_INVALIDARG;

        D3D12_INPUT_LAYOUT_DESC desc = { reinterpret_cast<const D3D12_INPUT_ELEMENT_DESC*>(vbDecl), UINT(nDecl) };
        if (!IsValid(desc))
            return E_INVALIDARG;

        ComputeInputLayout(desc, offsets, mDefaultStrides);
    }
#else
    if (!IsValid(reinterpret_cast<const D3D11_INPUT_ELEMENT_DESC*>(vbDecl), nDecl))
        return E_INVALIDARG;

    assert(nDecl <= D3D11_IA_VERTEX_INPUT_STRUCTURE_ELEMENT_COUNT);
    _Analysis_assume_(nDecl <= D3D11_IA_VERTEX_INPUT_STRUCTURE_ELEMENT_COUNT);

    ComputeInputLayout(reinterpret_cast<const D3D11_INPUT_ELEMENT_DESC*>(vbDecl), nDecl, offsets, mDefaultStrides);
#endif

    for (uint32_t j = 0; j < nDecl; ++j)
    {
        if (vbDecl[j].InputSlotClass == PER_INSTANCE_DATA)
        {
            // Does not currently support instance data layouts
            Release();
            return HRESULT_FROM_WIN32(ERROR_NOT_SUPPORTED);
        }

        mInputDesc.push_back(vbDecl[j]);

        mInputDesc[j].AlignedByteOffset = offsets[j];

        auto decl = SemanticMap::value_type(vbDecl[j].SemanticName, j);
        mSemantics.insert(decl);

        // Add common aliases
        if (_stricmp(vbDecl[j].SemanticName, "POSITION") == 0)
        {
            auto decl2 = SemanticMap::value_type("SV_Position", j);
            mSemantics.insert(decl2);
        }
        else if (_stricmp(vbDecl[j].SemanticName, "SV_Position") == 0)
        {
            auto decl2 = SemanticMap::value_type("POSITION", j);
            mSemantics.insert(decl2);
        }
    }

    return S_OK;
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT VBWriter::Impl::AddStream(void* vb, size_t nVerts, size_t inputSlot, size_t stride)
{
    if (!vb || !nVerts)
        return E_INVALIDARG;

    if (nVerts >= UINT32_MAX)
        return E_INVALIDARG;

    if (inputSlot >= c_MaxSlot)
        return E_INVALIDARG;

    if (stride > c_MaxStride)
        return E_INVALIDARG;

    mStrides[inputSlot] = (stride > 0) ? uint32_t(stride) : mDefaultStrides[inputSlot];
    mBuffers[inputSlot] = vb;
    mVerts[inputSlot] = nVerts;

    return S_OK;
}


//-------------------------------------------------------------------------------------
#define STORE_VERTS( type, func )\
        for(size_t icount = 0; icount < count; ++icount)\
        {\
            if ((ptr + sizeof(type)) > eptr)\
                return E_UNEXPECTED;\
            func(reinterpret_cast<type*>(ptr), *buffer++);\
            ptr += stride;\
        }\
        break;

#define STORE_VERTS_X2( type, func, x2bias )\
        for(size_t icount = 0; icount < count; ++icount)\
        {\
            if ((ptr + sizeof(type)) > eptr)\
                return E_UNEXPECTED;\
            XMVECTOR v = *buffer++;\
            if (x2bias)\
            {\
                v = XMVectorClamp(v, g_XMNegativeOne, g_XMOne);\
                v = XMVectorMultiplyAdd(v, g_XMOneHalf, g_XMOneHalf);\
            }\
            func(reinterpret_cast<type*>(ptr), v);\
            ptr += stride;\
        }\
        break;

_Use_decl_annotations_
HRESULT VBWriter::Impl::Write(const XMVECTOR* buffer, const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const
{
    if (!buffer || !semanticName || !count)
        return E_INVALIDARG;

    auto range = mSemantics.equal_range(semanticName);

    auto it = range.first;
    for (; it != range.second; ++it)
    {
        if (mInputDesc[it->second].SemanticIndex == semanticIndex)
            break;
    }

    if (it == range.second)
        return HRESULT_FROM_WIN32(ERROR_INVALID_NAME);

    uint32_t inputSlot = mInputDesc[it->second].InputSlot;

    auto vb = static_cast<uint8_t*>(mBuffers[inputSlot]);
    if (!vb)
        return E_FAIL;

    if (count > mVerts[inputSlot])
        return E_BOUNDS;

    uint32_t stride = mStrides[inputSlot];
    if (!stride)
        return E_UNEXPECTED;

    const uint8_t* eptr = vb + stride * mVerts[inputSlot];
    uint8_t* ptr = vb + mInputDesc[it->second].AlignedByteOffset;

    switch (static_cast<int>(mInputDesc[it->second].Format))
    {
    case DXGI_FORMAT_R32G32B32A32_FLOAT:
        STORE_VERTS(XMFLOAT4, XMStoreFloat4)

    case DXGI_FORMAT_R32G32B32A32_UINT:
        STORE_VERTS(XMUINT4, XMStoreUInt4)

    case DXGI_FORMAT_R32G32B32A32_SINT:
        STORE_VERTS(XMINT4, XMStoreSInt4)

    case DXGI_FORMAT_R32G32B32_FLOAT:
        STORE_VERTS(XMFLOAT3, XMStoreFloat3)

    case DXGI_FORMAT_R32G32B32_UINT:
        STORE_VERTS(XMUINT3, XMStoreUInt3)

    case DXGI_FORMAT_R32G32B32_SINT:
        STORE_VERTS(XMINT3, XMStoreSInt3)

    case DXGI_FORMAT_R16G16B16A16_FLOAT:
        STORE_VERTS(XMHALF4, XMStoreHalf4)

    case DXGI_FORMAT_R16G16B16A16_UNORM:
        STORE_VERTS_X2(XMUSHORTN4, XMStoreUShortN4, x2bias)

    case DXGI_FORMAT_R16G16B16A16_UINT:
        STORE_VERTS(XMUSHORT4, XMStoreUShort4)

    case DXGI_FORMAT_R16G16B16A16_SNORM:
        STORE_VERTS(XMSHORTN4, XMStoreShortN4)

    case DXGI_FORMAT_R16G16B16A16_SINT:
        STORE_VERTS(XMSHORT4, XMStoreShort4)

    case DXGI_FORMAT_R32G32_FLOAT:
        STORE_VERTS(XMFLOAT2, XMStoreFloat2)

    case DXGI_FORMAT_R32G32_UINT:
        STORE_VERTS(XMUINT2, XMStoreUInt2)

    case DXGI_FORMAT_R32G32_SINT:
        STORE_VERTS(XMINT2, XMStoreSInt2)

    case DXGI_FORMAT_R10G10B10A2_UNORM:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(XMUDECN4)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = *buffer++;
            if (x2bias)
            {
                XMVECTOR v2 = XMVectorClamp(v, g_XMNegativeOne, g_XMOne);
                v2 = XMVectorMultiplyAdd(v2, g_XMOneHalf, g_XMOneHalf);
                v = XMVectorSelect(v, v2, g_XMSelect1110);
            }
            XMStoreUDecN4(reinterpret_cast<XMUDECN4*>(ptr), v);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R10G10B10A2_UINT:
        STORE_VERTS(XMUDEC4, XMStoreUDec4)

    case DXGI_FORMAT_R11G11B10_FLOAT:
        STORE_VERTS_X2(XMFLOAT3PK, XMStoreFloat3PK, x2bias)

    case DXGI_FORMAT_R8G8B8A8_UNORM:
        STORE_VERTS_X2(XMUBYTEN4, XMStoreUByteN4, x2bias)

    case DXGI_FORMAT_R8G8B8A8_UINT:
        STORE_VERTS(XMUBYTE4, XMStoreUByte4)

    case DXGI_FORMAT_R8G8B8A8_SNORM:
        STORE_VERTS(XMBYTEN4, XMStoreByteN4)

    case DXGI_FORMAT_R8G8B8A8_SINT:
        STORE_VERTS(XMBYTE4, XMStoreByte4)

    case DXGI_FORMAT_R16G16_FLOAT:
        STORE_VERTS(XMHALF2, XMStoreHalf2)

    case DXGI_FORMAT_R16G16_UNORM:
        STORE_VERTS_X2(XMUSHORTN2, XMStoreUShortN2, x2bias)

    case DXGI_FORMAT_R16G16_UINT:
        STORE_VERTS(XMUSHORT2, XMStoreUShort2)

    case DXGI_FORMAT_R16G16_SNORM:
        STORE_VERTS(XMSHORTN2, XMStoreShortN2)

    case DXGI_FORMAT_R16G16_SINT:
        STORE_VERTS(XMSHORT2, XMStoreShort2)

    case DXGI_FORMAT_R32_FLOAT:
        STORE_VERTS(float, XMStoreFloat)

    case DXGI_FORMAT_R32_UINT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(uint32_t)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMConvertVectorFloatToUInt(*buffer++, 0);
            XMStoreInt(reinterpret_cast<uint32_t*>(ptr), v);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R32_SINT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(int32_t)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMConvertVectorFloatToInt(*buffer++, 0);
            XMStoreInt(reinterpret_cast<uint32_t*>(ptr), v);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R8G8_UNORM:
        STORE_VERTS_X2(XMUBYTEN2, XMStoreUByteN2, x2bias)

    case DXGI_FORMAT_R8G8_UINT:
        STORE_VERTS(XMUBYTE2, XMStoreUByte2)

    case DXGI_FORMAT_R8G8_SNORM:
        STORE_VERTS(XMBYTEN2, XMStoreByteN2)

    case DXGI_FORMAT_R8G8_SINT:
        STORE_VERTS(XMBYTE2, XMStoreByte2)

    case DXGI_FORMAT_R16_FLOAT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(HALF)) > eptr)
                return E_UNEXPECTED;
            float f = XMVectorGetX(*buffer++);
            *reinterpret_cast<HALF*>(ptr) = XMConvertFloatToHalf(f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R16_UNORM:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(uint16_t)) > eptr)
                return E_UNEXPECTED;
            float f = XMVectorGetX(*buffer++);
            if (x2bias)
            {
                f = std::max<float>(std::min<float>(f, 1.f), -1.f);
                f = f * 0.5f + 0.5f;
            }
            else
            {
                f = std::max<float>(std::min<float>(f, 1.f), 0.f);
            }
            *reinterpret_cast<uint16_t*>(ptr) = static_cast<uint16_t>(f*65535.f + 0.5f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R16_UINT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(uint16_t)) > eptr)
                return E_UNEXPECTED;
            float f = XMVectorGetX(*buffer++);
            f = std::max<float>(std::min<float>(f, 65535.f), 0.f);
            *reinterpret_cast<uint16_t*>(ptr) = static_cast<uint16_t>(f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R16_SNORM:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(int16_t)) > eptr)
                return E_UNEXPECTED;
            float f = XMVectorGetX(*buffer++);
            f = std::max<float>(std::min<float>(f, 1.f), -1.f);
            *reinterpret_cast<int16_t*>(ptr) = static_cast<int16_t>(f * 32767.f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R16_SINT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(int16_t)) > eptr)
                return E_UNEXPECTED;
            float f = XMVectorGetX(*buffer++);
            f = std::max<float>(std::min<float>(f, 32767.f), -32767.f);
            *reinterpret_cast<int16_t*>(ptr) = static_cast<int16_t>(f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R8_UNORM:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(uint8_t)) > eptr)
                return E_UNEXPECTED;
            float f = XMVectorGetX(*buffer++);
            if (x2bias)
            {
                f = std::max<float>(std::min<float>(f, 1.f), -1.f);
                f = f * 0.5f + 0.5f;
            }
            else
            {
                f = std::max<float>(std::min<float>(f, 1.f), 0.f);
            }
            *ptr = static_cast<uint8_t>(f * 255.f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R8_UINT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(uint8_t)) > eptr)
                return E_UNEXPECTED;
            float f = XMVectorGetX(*buffer++);
            f = std::max<float>(std::min<float>(f, 255.f), 0.f);
            *ptr = static_cast<uint8_t>(f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R8_SNORM:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(int8_t)) > eptr)
                return E_UNEXPECTED;
            float f = XMVectorGetX(*buffer++);
            f = std::max<float>(std::min<float>(f, 1.f), -1.f);
            *reinterpret_cast<int8_t*>(ptr) = static_cast<int8_t>(f * 127.f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R8_SINT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(int8_t)) > eptr)
                return E_UNEXPECTED;
            float f = XMVectorGetX(*buffer++);
            f = std::max<float>(std::min<float>(f, 127.f), -127.f);
            *reinterpret_cast<int8_t*>(ptr) = static_cast<int8_t>(f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_B5G6R5_UNORM:
    {
        static const XMVECTORF32 s_Scale = { { { 31.f, 63.f, 31.f, 1.f } } };
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(XMU565)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMVectorSwizzle<2, 1, 0, 3>(*buffer++);
            if (x2bias)
            {
                v = XMVectorClamp(v, g_XMNegativeOne, g_XMOne);
                v = XMVectorMultiplyAdd(v, g_XMOneHalf, g_XMOneHalf);
            }
            v = XMVectorMultiply(v, s_Scale);
            XMStoreU565(reinterpret_cast<XMU565*>(ptr), v);
            ptr += stride;
        }
    }
    break;

    case DXGI_FORMAT_B5G5R5A1_UNORM:
    {
        static const XMVECTORF32 s_Scale = { { { 31.f, 31.f, 31.f, 1.f } } };
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(XMU555)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMVectorSwizzle<2, 1, 0, 3>(*buffer++);
            if (x2bias)
            {
                XMVECTOR v2 = XMVectorClamp(v, g_XMNegativeOne, g_XMOne);
                v2 = XMVectorMultiplyAdd(v2, g_XMOneHalf, g_XMOneHalf);
                v = XMVectorSelect(v, v2, g_XMSelect1110);
            }
            v = XMVectorMultiply(v, s_Scale);
            XMStoreU555(reinterpret_cast<XMU555*>(ptr), v);
            reinterpret_cast<XMU555*>(ptr)->w = (XMVectorGetW(v) > 0.5f) ? 1u : 0u;
            ptr += stride;
        }
    }
    break;

    case DXGI_FORMAT_B8G8R8A8_UNORM:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(XMUBYTEN4)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMVectorSwizzle<2, 1, 0, 3>(*buffer++);
            if (x2bias)
            {
                v = XMVectorClamp(v, g_XMNegativeOne, g_XMOne);
                v = XMVectorMultiplyAdd(v, g_XMOneHalf, g_XMOneHalf);
            }
            XMStoreUByteN4(reinterpret_cast<XMUBYTEN4*>(ptr), v);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_B8G8R8X8_UNORM:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(XMUBYTEN4)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMVectorSwizzle<2, 1, 0, 3>(*buffer++);
            if (x2bias)
            {
                v = XMVectorClamp(v, g_XMNegativeOne, g_XMOne);
                v = XMVectorMultiplyAdd(v, g_XMOneHalf, g_XMOneHalf);
            }
            v = XMVectorSelect(g_XMZero, v, g_XMSelect1110);
            XMStoreUByteN4(reinterpret_cast<XMUBYTEN4*>(ptr), v);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_B4G4R4A4_UNORM:
    {
        static const XMVECTORF32 s_Scale = { { { 15.f, 15.f, 15.f, 15.f } } };
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(XMUNIBBLE4)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMVectorSwizzle<2, 1, 0, 3>(*buffer++);
            if (x2bias)
            {
                v = XMVectorClamp(v, g_XMNegativeOne, g_XMOne);
                v = XMVectorMultiplyAdd(v, g_XMOneHalf, g_XMOneHalf);
            }
            v = XMVectorMultiply(v, s_Scale);
            XMStoreUNibble4(reinterpret_cast<XMUNIBBLE4*>(ptr), v);
            ptr += stride;
        }
    }
    break;

    case XBOX_DXGI_FORMAT_R10G10B10_SNORM_A2_UNORM:
        // Xbox One specific format
        STORE_VERTS(XMXDECN4, XMStoreXDecN4)

    default:
        return E_FAIL;
    }

    return S_OK;
}


//=====================================================================================
// Entry-points
//=====================================================================================

// Public constructor.
VBWriter::VBWriter() noexcept(false)
    : pImpl(std::make_unique<Impl>())
{
}


// Move constructor.
VBWriter::VBWriter(VBWriter&& moveFrom) noexcept
    : pImpl(std::move(moveFrom.pImpl))
{
}


// Move assignment.
VBWriter& VBWriter::operator= (VBWriter&& moveFrom) noexcept
{
    pImpl = std::move(moveFrom.pImpl);
    return *this;
}


// Public destructor.
VBWriter::~VBWriter()
{
}


//-------------------------------------------------------------------------------------
#if defined(__d3d11_h__) || defined(__d3d11_x_h__)
_Use_decl_annotations_
HRESULT VBWriter::Initialize(const D3D11_INPUT_ELEMENT_DESC* vbDecl, size_t nDecl)
{
    return pImpl->Initialize(reinterpret_cast<const InputElementDesc*>(vbDecl), nDecl);
}
#endif

#if defined(__d3d12_h__) || defined(__d3d12_x_h__)
HRESULT VBWriter::Initialize(const D3D12_INPUT_LAYOUT_DESC& vbDecl)
{
    return pImpl->Initialize(reinterpret_cast<const InputElementDesc*>(vbDecl.pInputElementDescs), vbDecl.NumElements);
}
#endif


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT VBWriter::AddStream(void* vb, size_t nVerts, size_t inputSlot, size_t stride)
{
    return pImpl->AddStream(vb, nVerts, inputSlot, stride);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT VBWriter::Write(const XMVECTOR* buffer, const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const
{
    return pImpl->Write(buffer, semanticName, semanticIndex, count, x2bias);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT VBWriter::Write(const float* buffer, const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const
{
    XMVECTOR* temp = pImpl->GetTemporaryBuffer(count);
    if (!temp)
        return E_OUTOFMEMORY;

    XMVECTOR* dptr = temp;
    const float* sptr = buffer;
    for (size_t j = 0; j < count; ++j)
    {
        XMVECTOR v = XMLoadFloat(sptr++);
        *(dptr)++ = v;
    }

    return pImpl->Write(temp, semanticName, semanticIndex, count, x2bias);
}

_Use_decl_annotations_
HRESULT VBWriter::Write(const XMFLOAT2* buffer, const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const
{
    XMVECTOR* temp = pImpl->GetTemporaryBuffer(count);
    if (!temp)
        return E_OUTOFMEMORY;

    XMVECTOR* dptr = temp;
    const XMFLOAT2* sptr = buffer;
    for (size_t j = 0; j < count; ++j)
    {
        XMVECTOR v = XMLoadFloat2(sptr++);
        *(dptr)++ = v;
    }

    return pImpl->Write(temp, semanticName, semanticIndex, count, x2bias);
}

_Use_decl_annotations_
HRESULT VBWriter::Write(const XMFLOAT3* buffer, const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const
{
    XMVECTOR* temp = pImpl->GetTemporaryBuffer(count);
    if (!temp)
        return E_OUTOFMEMORY;

    XMVECTOR* dptr = temp;
    const XMFLOAT3* sptr = buffer;
    for (size_t j = 0; j < count; ++j)
    {
        XMVECTOR v = XMLoadFloat3(sptr++);
        *(dptr)++ = v;
    }

    return pImpl->Write(temp, semanticName, semanticIndex, count, x2bias);
}

_Use_decl_annotations_
HRESULT VBWriter::Write(const XMFLOAT4* buffer, const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const
{
    XMVECTOR* temp = pImpl->GetTemporaryBuffer(count);
    if (!temp)
        return E_OUTOFMEMORY;

    XMVECTOR* dptr = temp;
    const XMFLOAT4* sptr = buffer;
    for (size_t j = 0; j < count; ++j)
    {
        XMVECTOR v = XMLoadFloat4(sptr++);
        *(dptr)++ = v;
    }

    return pImpl->Write(temp, semanticName, semanticIndex, count, x2bias);
}


//-------------------------------------------------------------------------------------
void VBWriter::Release()
{
    pImpl->Release();
}


//-------------------------------------------------------------------------------------
#if defined(__d3d11_h__) || defined(__d3d11_x_h__)
_Use_decl_annotations_
const D3D11_INPUT_ELEMENT_DESC* VBWriter::GetElement11(const char* semanticName, unsigned int semanticIndex) const
{
    return reinterpret_cast<const D3D11_INPUT_ELEMENT_DESC*>(pImpl->GetElement(semanticName, semanticIndex));
}
#endif

#if defined(__d3d12_h__) || defined(__d3d12_x_h__)
_Use_decl_annotations_
const D3D12_INPUT_ELEMENT_DESC* VBWriter::GetElement12(const char* semanticName, unsigned int semanticIndex) const
{
    return reinterpret_cast<const D3D12_INPUT_ELEMENT_DESC*>(pImpl->GetElement(semanticName, semanticIndex));
}
#endif
