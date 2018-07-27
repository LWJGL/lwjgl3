//-------------------------------------------------------------------------------------
// DirectXMeshVBReader.cpp
//  
// DirectX Mesh Geometry Library - Vertex Buffer Reader
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

class VBReader::Impl
{
public:
    Impl() noexcept :
        mStrides{},
        mBuffers{},
        mVerts{},
        mDefaultStrides{},
        mTempSize(0) {}

    HRESULT Initialize(_In_reads_(nDecl) const InputElementDesc* vbDecl, size_t nDecl);
    HRESULT AddStream(_In_reads_bytes_(stride*nVerts) const void* vb, size_t nVerts, size_t inputSlot, size_t stride);
    HRESULT Read(_Out_writes_(count) XMVECTOR* buffer, _In_z_ const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const;

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
    const void*                             mBuffers[c_MaxSlot];
    size_t                                  mVerts[c_MaxSlot];
    uint32_t                                mDefaultStrides[c_MaxSlot];
    mutable size_t                          mTempSize;
    mutable ScopedAlignedArrayXMVECTOR      mTempBuffer;
};


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT VBReader::Impl::Initialize(const InputElementDesc* vbDecl, size_t nDecl)
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
HRESULT VBReader::Impl::AddStream(const void* vb, size_t nVerts, size_t inputSlot, size_t stride)
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
#define LOAD_VERTS( type, func )\
        for(size_t icount = 0; icount < count; ++icount)\
        {\
            if ((ptr + sizeof(type)) > eptr)\
                return E_UNEXPECTED;\
            *buffer++ = func(reinterpret_cast<const type*>(ptr));\
            ptr += stride;\
        }\
        break;

#define LOAD_VERTS4_X2( type, func, x2bias )\
        for(size_t icount = 0; icount < count; ++icount)\
        {\
            if ((ptr + sizeof(type)) > eptr)\
                return E_UNEXPECTED;\
            XMVECTOR v = func(reinterpret_cast<const type*>(ptr));\
            if (x2bias)\
            {\
                v = XMVectorMultiplyAdd(v, g_XMTwo, g_XMNegativeOne);\
            }\
            *buffer++ = v;\
            ptr += stride;\
        }\
        break;

#define LOAD_VERTS3_X2( type, func, x2bias )\
        for(size_t icount = 0; icount < count; ++icount)\
        {\
            if ((ptr + sizeof(type)) > eptr)\
                return E_UNEXPECTED;\
            XMVECTOR v = func(reinterpret_cast<const type*>(ptr));\
            if (x2bias)\
            {\
                XMVECTOR v2 = XMVectorMultiplyAdd(v, g_XMTwo, g_XMNegativeOne);\
                v = XMVectorSelect(v, v2, g_XMSelect1110);\
            }\
            *buffer++ = v;\
            ptr += stride;\
        }\
        break;

#define LOAD_VERTS2_X2( type, func, x2bias )\
        for(size_t icount = 0; icount < count; ++icount)\
        {\
            if ((ptr + sizeof(type)) > eptr)\
                return E_UNEXPECTED;\
            XMVECTOR v = func(reinterpret_cast<const type*>(ptr));\
            if (x2bias)\
            {\
                XMVECTOR v2 = XMVectorMultiplyAdd(v, g_XMTwo, g_XMNegativeOne);\
                v = XMVectorSelect(v, v2, g_XMSelect1100);\
            }\
            *buffer++ = v;\
            ptr += stride;\
        }\
        break;

_Use_decl_annotations_
HRESULT VBReader::Impl::Read(XMVECTOR* buffer, const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const
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

    auto vb = static_cast<const uint8_t*>(mBuffers[inputSlot]);
    if (!vb)
        return E_FAIL;

    if (count > mVerts[inputSlot])
        return E_BOUNDS;

    uint32_t stride = mStrides[inputSlot];
    if (!stride)
        return E_UNEXPECTED;

    const uint8_t* eptr = vb + stride * mVerts[inputSlot];
    const uint8_t* ptr = vb + mInputDesc[it->second].AlignedByteOffset;

    switch (static_cast<int>(mInputDesc[it->second].Format))
    {
    case DXGI_FORMAT_R32G32B32A32_FLOAT:
        LOAD_VERTS(XMFLOAT4, XMLoadFloat4)

    case DXGI_FORMAT_R32G32B32A32_UINT:
        LOAD_VERTS(XMUINT4, XMLoadUInt4)

    case DXGI_FORMAT_R32G32B32A32_SINT:
        LOAD_VERTS(XMINT4, XMLoadSInt4)

    case DXGI_FORMAT_R32G32B32_FLOAT:
        LOAD_VERTS(XMFLOAT3, XMLoadFloat3)

    case DXGI_FORMAT_R32G32B32_UINT:
        LOAD_VERTS(XMUINT3, XMLoadUInt3)

    case DXGI_FORMAT_R32G32B32_SINT:
        LOAD_VERTS(XMINT3, XMLoadSInt3)

    case DXGI_FORMAT_R16G16B16A16_FLOAT:
        LOAD_VERTS(XMHALF4, XMLoadHalf4)

    case DXGI_FORMAT_R16G16B16A16_UNORM:
        LOAD_VERTS4_X2(XMUSHORTN4, XMLoadUShortN4, x2bias)

    case DXGI_FORMAT_R16G16B16A16_UINT:
        LOAD_VERTS(XMUSHORT4, XMLoadUShort4)

    case DXGI_FORMAT_R16G16B16A16_SNORM:
        LOAD_VERTS(XMSHORTN4, XMLoadShortN4)

    case DXGI_FORMAT_R16G16B16A16_SINT:
        LOAD_VERTS(XMSHORT4, XMLoadShort4)

    case DXGI_FORMAT_R32G32_FLOAT:
        LOAD_VERTS(XMFLOAT2, XMLoadFloat2)

    case DXGI_FORMAT_R32G32_UINT:
        LOAD_VERTS(XMUINT2, XMLoadUInt2)

    case DXGI_FORMAT_R32G32_SINT:
        LOAD_VERTS(XMINT2, XMLoadSInt2)

    case DXGI_FORMAT_R10G10B10A2_UNORM:
        LOAD_VERTS3_X2(XMUDECN4, XMLoadUDecN4, x2bias)

    case DXGI_FORMAT_R10G10B10A2_UINT:
        LOAD_VERTS(XMUDEC4, XMLoadUDec4);

    case DXGI_FORMAT_R11G11B10_FLOAT:
        LOAD_VERTS3_X2(XMFLOAT3PK, XMLoadFloat3PK, x2bias)

    case DXGI_FORMAT_R8G8B8A8_UNORM:
        LOAD_VERTS4_X2(XMUBYTEN4, XMLoadUByteN4, x2bias)

    case DXGI_FORMAT_R8G8B8A8_UINT:
        LOAD_VERTS(XMUBYTE4, XMLoadUByte4)

    case DXGI_FORMAT_R8G8B8A8_SNORM:
        LOAD_VERTS(XMBYTEN4, XMLoadByteN4)

    case DXGI_FORMAT_R8G8B8A8_SINT:
        LOAD_VERTS(XMBYTE4, XMLoadByte4)

    case DXGI_FORMAT_R16G16_FLOAT:
        LOAD_VERTS(XMHALF2, XMLoadHalf2)

    case DXGI_FORMAT_R16G16_UNORM:
        LOAD_VERTS2_X2(XMUSHORTN2, XMLoadUShortN2, x2bias)

    case DXGI_FORMAT_R16G16_UINT:
        LOAD_VERTS(XMUSHORT2, XMLoadUShort2)

    case DXGI_FORMAT_R16G16_SNORM:
        LOAD_VERTS(XMSHORTN2, XMLoadShortN2)

    case DXGI_FORMAT_R16G16_SINT:
        LOAD_VERTS(XMSHORT2, XMLoadShort2)

    case DXGI_FORMAT_R32_FLOAT:
        LOAD_VERTS(float, XMLoadFloat)

    case DXGI_FORMAT_R32_UINT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(uint32_t)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMLoadInt(reinterpret_cast<const uint32_t*>(ptr));
            *buffer++ = XMConvertVectorUIntToFloat(v, 0);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R32_SINT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(int32_t)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMLoadInt(reinterpret_cast<const uint32_t*>(ptr));
            *buffer++ = XMConvertVectorIntToFloat(v, 0);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R8G8_UNORM:
        LOAD_VERTS2_X2(XMUBYTEN2, XMLoadUByteN2, x2bias)

    case DXGI_FORMAT_R8G8_UINT:
        LOAD_VERTS(XMUBYTE2, XMLoadUByte2)

    case DXGI_FORMAT_R8G8_SNORM:
        LOAD_VERTS(XMBYTEN2, XMLoadByteN2)

    case DXGI_FORMAT_R8G8_SINT:
        LOAD_VERTS(XMBYTE2, XMLoadByte2)

    case DXGI_FORMAT_R16_FLOAT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(HALF)) > eptr)
                return E_UNEXPECTED;
            float v = XMConvertHalfToFloat(*reinterpret_cast<const HALF*>(ptr));
            *buffer++ = XMVectorSet(v, 0.f, 0.f, 0.f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R16_UNORM:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(uint16_t)) > eptr)
                return E_UNEXPECTED;
            auto i = *reinterpret_cast<const uint16_t*>(ptr);
            float f = static_cast<float>(i) / 65535.f;
            if (x2bias)
            {
                f = f*2.f - 1.f;
            }
            XMVECTOR v = XMVectorSet(f, 0.f, 0.f, 0.f);
            *buffer++ = v;
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R16_UINT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(uint16_t)) > eptr)
                return E_UNEXPECTED;
            auto i = *reinterpret_cast<const uint16_t*>(ptr);
            *buffer++ = XMVectorSet(static_cast<float>(i), 0.f, 0.f, 0.f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R16_SNORM:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(int16_t)) > eptr)
                return E_UNEXPECTED;
            auto i = *reinterpret_cast<const int16_t*>(ptr);
            *buffer++ = XMVectorSet(static_cast<float>(i) / 32767.f, 0.f, 0.f, 0.f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R16_SINT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(int16_t)) > eptr)
                return E_UNEXPECTED;
            auto i = *reinterpret_cast<const int16_t*>(ptr);
            *buffer++ = XMVectorSet(static_cast<float>(i), 0.f, 0.f, 0.f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R8_UNORM:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(uint8_t)) > eptr)
                return E_UNEXPECTED;
            const uint8_t i = *ptr;
            float f = static_cast<float>(i) / 255.f;
            if (x2bias)
            {
                f = f*2.f - 1.f;
            }
            XMVECTOR v = XMVectorSet(f, 0.f, 0.f, 0.f);
            *buffer++ = v;
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R8_UINT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(uint8_t)) > eptr)
                return E_UNEXPECTED;
            const uint8_t i = *ptr;
            *buffer++ = XMVectorSet(static_cast<float>(i), 0.f, 0.f, 0.f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R8_SNORM:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(int8_t)) > eptr)
                return E_UNEXPECTED;
            auto i = *reinterpret_cast<const int8_t*>(ptr);
            *buffer++ = XMVectorSet(static_cast<float>(i) / 127.f, 0.f, 0.f, 0.f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_R8_SINT:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(int8_t)) > eptr)
                return E_UNEXPECTED;
            auto i = *reinterpret_cast<const int8_t*>(ptr);
            *buffer++ = XMVectorSet(static_cast<float>(i), 0.f, 0.f, 0.f);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_B5G6R5_UNORM:
    {
        static const XMVECTORF32 s_Scale = { { { 1.f / 31.f, 1.f / 63.f, 1.f / 31.f, 1.f } } };
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(XMU565)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMLoadU565(reinterpret_cast<const XMU565*>(ptr));
            v = XMVectorMultiply(v, s_Scale);
            if (x2bias)
            {
                XMVECTOR v2 = XMVectorMultiplyAdd(v, g_XMTwo, g_XMNegativeOne);
                v = XMVectorSelect(v, v2, g_XMSelect1110);
            }
            *buffer++ = XMVectorSwizzle<2, 1, 0, 3>(v);
            ptr += stride;
        }
    }
    break;

    case DXGI_FORMAT_B5G5R5A1_UNORM:
    {
        static const XMVECTORF32 s_Scale = { { { 1.f / 31.f, 1.f / 31.f, 1.f / 31.f, 1.f } } };
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(XMU555)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMLoadU555(reinterpret_cast<const XMU555*>(ptr));
            v = XMVectorMultiply(v, s_Scale);
            if (x2bias)
            {
                XMVECTOR v2 = XMVectorMultiplyAdd(v, g_XMTwo, g_XMNegativeOne);
                v = XMVectorSelect(v, v2, g_XMSelect1110);
            }
            *buffer++ = XMVectorSwizzle<2, 1, 0, 3>(v);
            ptr += stride;
        }
    }
    break;

    case DXGI_FORMAT_B8G8R8A8_UNORM:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(XMUBYTEN4)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMLoadUByteN4(reinterpret_cast<const XMUBYTEN4*>(ptr));
            if (x2bias)
            {
                v = XMVectorMultiplyAdd(v, g_XMTwo, g_XMNegativeOne);
            }
            *buffer++ = XMVectorSwizzle<2, 1, 0, 3>(v);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_B8G8R8X8_UNORM:
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(XMUBYTEN4)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMLoadUByteN4(reinterpret_cast<const XMUBYTEN4*>(ptr));
            if (x2bias)
            {
                XMVECTOR v2 = XMVectorMultiplyAdd(v, g_XMTwo, g_XMNegativeOne);
                v = XMVectorSelect(v, v2, g_XMSelect1110);
            }
            v = XMVectorSwizzle<2, 1, 0, 3>(v);
            *buffer++ = XMVectorSelect(g_XMZero, v, g_XMSelect1110);
            ptr += stride;
        }
        break;

    case DXGI_FORMAT_B4G4R4A4_UNORM:
    {
        static const XMVECTORF32 s_Scale = { { { 1.f / 15.f, 1.f / 15.f, 1.f / 15.f, 1.f / 15.f } } };
        for (size_t icount = 0; icount < count; ++icount)
        {
            if ((ptr + sizeof(XMUNIBBLE4)) > eptr)
                return E_UNEXPECTED;
            XMVECTOR v = XMLoadUNibble4(reinterpret_cast<const XMUNIBBLE4*>(ptr));
            v = XMVectorMultiply(v, s_Scale);
            if (x2bias)
            {
                v = XMVectorMultiplyAdd(v, g_XMTwo, g_XMNegativeOne);
            }
            *buffer++ = XMVectorSwizzle<2, 1, 0, 3>(v);
            ptr += stride;
        }
    }
    break;

    case XBOX_DXGI_FORMAT_R10G10B10_SNORM_A2_UNORM:
        // Xbox One specific format
        LOAD_VERTS(XMXDECN4, XMLoadXDecN4);

    default:
        return E_FAIL;
    }

    return S_OK;
}


//=====================================================================================
// Entry-points
//=====================================================================================

// Public constructor.
VBReader::VBReader() noexcept(false)
    : pImpl(std::make_unique<Impl>())
{
}


// Move constructor.
VBReader::VBReader(VBReader&& moveFrom) noexcept
    : pImpl(std::move(moveFrom.pImpl))
{
}


// Move assignment.
VBReader& VBReader::operator= (VBReader&& moveFrom) noexcept
{
    pImpl = std::move(moveFrom.pImpl);
    return *this;
}


// Public destructor.
VBReader::~VBReader()
{
}


//-------------------------------------------------------------------------------------
#if defined(__d3d11_h__) || defined(__d3d11_x_h__)
_Use_decl_annotations_
HRESULT VBReader::Initialize(const D3D11_INPUT_ELEMENT_DESC* vbDecl, size_t nDecl)
{
    return pImpl->Initialize(reinterpret_cast<const InputElementDesc*>(vbDecl), nDecl);
}
#endif

#if defined(__d3d12_h__) || defined(__d3d12_x_h__)
HRESULT VBReader::Initialize(const D3D12_INPUT_LAYOUT_DESC& vbDecl)
{
    return pImpl->Initialize(reinterpret_cast<const InputElementDesc*>(vbDecl.pInputElementDescs), vbDecl.NumElements);
}
#endif


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT VBReader::AddStream(const void* vb, size_t nVerts, size_t inputSlot, size_t stride)
{
    return pImpl->AddStream(vb, nVerts, inputSlot, stride);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT VBReader::Read(XMVECTOR* buffer, const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const
{
    return pImpl->Read(buffer, semanticName, semanticIndex, count, x2bias);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT VBReader::Read(float* buffer, const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const
{
    XMVECTOR* temp = pImpl->GetTemporaryBuffer(count);
    if (!temp)
        return E_OUTOFMEMORY;

    HRESULT hr = pImpl->Read(temp, semanticName, semanticIndex, count, x2bias);
    if (FAILED(hr))
        return hr;

    float* dptr = buffer;
    for (size_t j = 0; j < count; ++j)
    {
        XMVECTOR v = *(temp)++;
        XMStoreFloat(dptr++, v);
    }

    return S_OK;
}

_Use_decl_annotations_
HRESULT VBReader::Read(XMFLOAT2* buffer, const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const
{
    XMVECTOR* temp = pImpl->GetTemporaryBuffer(count);
    if (!temp)
        return E_OUTOFMEMORY;

    HRESULT hr = pImpl->Read(temp, semanticName, semanticIndex, count, x2bias);
    if (FAILED(hr))
        return hr;

    XMFLOAT2* dptr = buffer;
    for (size_t j = 0; j < count; ++j)
    {
        XMVECTOR v = *(temp)++;
        XMStoreFloat2(dptr++, v);
    }

    return S_OK;
}

_Use_decl_annotations_
HRESULT VBReader::Read(XMFLOAT3* buffer, const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const
{
    XMVECTOR* temp = pImpl->GetTemporaryBuffer(count);
    if (!temp)
        return E_OUTOFMEMORY;

    HRESULT hr = pImpl->Read(temp, semanticName, semanticIndex, count, x2bias);
    if (FAILED(hr))
        return hr;

    XMFLOAT3* dptr = buffer;
    for (size_t j = 0; j < count; ++j)
    {
        XMVECTOR v = *(temp)++;
        XMStoreFloat3(dptr++, v);
    }

    return S_OK;
}

_Use_decl_annotations_
HRESULT VBReader::Read(XMFLOAT4* buffer, const char* semanticName, unsigned int semanticIndex, size_t count, bool x2bias) const
{
    XMVECTOR* temp = pImpl->GetTemporaryBuffer(count);
    if (!temp)
        return E_OUTOFMEMORY;

    HRESULT hr = pImpl->Read(temp, semanticName, semanticIndex, count, x2bias);
    if (FAILED(hr))
        return hr;

    XMFLOAT4* dptr = buffer;
    for (size_t j = 0; j < count; ++j)
    {
        XMVECTOR v = *(temp)++;
        XMStoreFloat4(dptr++, v);
    }

    return S_OK;
}


//-------------------------------------------------------------------------------------
void VBReader::Release()
{
    pImpl->Release();
}


//-------------------------------------------------------------------------------------
#if defined(__d3d11_h__) || defined(__d3d11_x_h__)
_Use_decl_annotations_
const D3D11_INPUT_ELEMENT_DESC* VBReader::GetElement11(const char* semanticName, unsigned int semanticIndex) const
{
    return reinterpret_cast<const D3D11_INPUT_ELEMENT_DESC*>(pImpl->GetElement(semanticName, semanticIndex));
}
#endif

#if defined(__d3d12_h__) || defined(__d3d12_x_h__)
_Use_decl_annotations_
const D3D12_INPUT_ELEMENT_DESC* VBReader::GetElement12(const char* semanticName, unsigned int semanticIndex) const
{
    return reinterpret_cast<const D3D12_INPUT_ELEMENT_DESC*>(pImpl->GetElement(semanticName, semanticIndex));
}
#endif
