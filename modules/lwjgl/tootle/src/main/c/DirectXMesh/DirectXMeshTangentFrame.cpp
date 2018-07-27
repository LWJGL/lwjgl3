//-------------------------------------------------------------------------------------
// DirectXMeshTangentFrame.cpp
//  
// DirectX Mesh Geometry Library - Normals, Tangents, and Bi-Tangents Computation
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
    //---------------------------------------------------------------------------------
    // Compute tangent and bi-tangent for each vertex
    //---------------------------------------------------------------------------------
    template<class index_t>
    HRESULT ComputeTangentFrameImpl(
        _In_reads_(nFaces * 3) const index_t* indices, size_t nFaces,
        _In_reads_(nVerts) const XMFLOAT3* positions,
        _In_reads_(nVerts) const XMFLOAT3* normals,
        _In_reads_(nVerts) const XMFLOAT2* texcoords,
        size_t nVerts,
        _Out_writes_opt_(nVerts) XMFLOAT3* tangents3,
        _Out_writes_opt_(nVerts) XMFLOAT4* tangents4,
        _Out_writes_opt_(nVerts) XMFLOAT3* bitangents)
    {
        if (!indices || !nFaces || !positions || !normals || !texcoords || !nVerts)
            return E_INVALIDARG;

        if (nVerts >= index_t(-1))
            return E_INVALIDARG;

        if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
            return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

        static const float EPSILON = 0.0001f;
        static const XMVECTORF32 s_flips = { { { 1.f, -1.f, -1.f, 1.f } } };

        ScopedAlignedArrayXMVECTOR temp(static_cast<XMVECTOR*>(_aligned_malloc(sizeof(XMVECTOR) * nVerts * 2, 16)));
        if (!temp)
            return E_OUTOFMEMORY;

        memset(temp.get(), 0, sizeof(XMVECTOR) * nVerts * 2);

        XMVECTOR* tangent1 = temp.get();
        XMVECTOR* tangent2 = temp.get() + nVerts;

        for (size_t face = 0; face < nFaces; ++face)
        {
            index_t i0 = indices[face * 3];
            index_t i1 = indices[face * 3 + 1];
            index_t i2 = indices[face * 3 + 2];

            if (i0 == index_t(-1)
                || i1 == index_t(-1)
                || i2 == index_t(-1))
                continue;

            if (i0 >= nVerts
                || i1 >= nVerts
                || i2 >= nVerts)
                return E_UNEXPECTED;

            XMVECTOR t0 = XMLoadFloat2(&texcoords[i0]);
            XMVECTOR t1 = XMLoadFloat2(&texcoords[i1]);
            XMVECTOR t2 = XMLoadFloat2(&texcoords[i2]);

            XMVECTOR s = XMVectorMergeXY(XMVectorSubtract(t1, t0), XMVectorSubtract(t2, t0));

            XMFLOAT4A tmp;
            XMStoreFloat4A(&tmp, s);

            float d = tmp.x * tmp.w - tmp.z * tmp.y;
            d = (fabsf(d) <= EPSILON) ? 1.f : (1.f / d);
            s = XMVectorScale(s, d);
            s = XMVectorMultiply(s, s_flips);

            XMMATRIX m0;
            m0.r[0] = XMVectorPermute<3, 2, 6, 7>(s, g_XMZero);
            m0.r[1] = XMVectorPermute<1, 0, 4, 5>(s, g_XMZero);
            m0.r[2] = m0.r[3] = g_XMZero;

            XMVECTOR p0 = XMLoadFloat3(&positions[i0]);
            XMVECTOR p1 = XMLoadFloat3(&positions[i1]);
            XMVECTOR p2 = XMLoadFloat3(&positions[i2]);

            XMMATRIX m1;
            m1.r[0] = XMVectorSubtract(p1, p0);
            m1.r[1] = XMVectorSubtract(p2, p0);
            m1.r[2] = m1.r[3] = g_XMZero;

            XMMATRIX uv = XMMatrixMultiply(m0, m1);

            tangent1[i0] = XMVectorAdd(tangent1[i0], uv.r[0]);
            tangent1[i1] = XMVectorAdd(tangent1[i1], uv.r[0]);
            tangent1[i2] = XMVectorAdd(tangent1[i2], uv.r[0]);

            tangent2[i0] = XMVectorAdd(tangent2[i0], uv.r[1]);
            tangent2[i1] = XMVectorAdd(tangent2[i1], uv.r[1]);
            tangent2[i2] = XMVectorAdd(tangent2[i2], uv.r[1]);
        }

        for (size_t j = 0; j < nVerts; ++j)
        {
            // Gram-Schmidt orthonormalization
            XMVECTOR b0 = XMLoadFloat3(&normals[j]);
            b0 = XMVector3Normalize(b0);

            XMVECTOR tan1 = tangent1[j];
            XMVECTOR b1 = XMVectorSubtract(tan1, XMVectorMultiply(XMVector3Dot(b0, tan1), b0));
            b1 = XMVector3Normalize(b1);

            XMVECTOR tan2 = tangent2[j];
            XMVECTOR b2 = XMVectorSubtract(XMVectorSubtract(tan2, XMVectorMultiply(XMVector3Dot(b0, tan2), b0)), XMVectorMultiply(XMVector3Dot(b1, tan2), b1));
            b2 = XMVector3Normalize(b2);

            // handle degenerate vectors
            float len1 = XMVectorGetX(XMVector3Length(b1));
            float len2 = XMVectorGetY(XMVector3Length(b2));

            if ((len1 <= EPSILON) || (len2 <= EPSILON))
            {
                if (len1 > 0.5f)
                {
                    // Reset bi-tangent from tangent and normal
                    b2 = XMVector3Cross(b0, b1);
                }
                else if (len2 > 0.5f)
                {
                    // Reset tangent from bi-tangent and normal
                    b1 = XMVector3Cross(b2, b0);
                }
                else
                {
                    // Reset both tangent and bi-tangent from normal
                    XMVECTOR axis;

                    float d0 = fabs(XMVectorGetX(XMVector3Dot(g_XMIdentityR0, b0)));
                    float d1 = fabs(XMVectorGetX(XMVector3Dot(g_XMIdentityR1, b0)));
                    float d2 = fabs(XMVectorGetX(XMVector3Dot(g_XMIdentityR2, b0)));
                    if (d0 < d1)
                    {
                        axis = (d0 < d2) ? g_XMIdentityR0 : g_XMIdentityR2;
                    }
                    else if (d1 < d2)
                    {
                        axis = g_XMIdentityR1;
                    }
                    else
                    {
                        axis = g_XMIdentityR2;
                    }

                    b1 = XMVector3Cross(b0, axis);
                    b2 = XMVector3Cross(b0, b1);
                }
            }

            if (tangents3)
            {
                XMStoreFloat3(&tangents3[j], b1);
            }

            if (tangents4)
            {
                XMVECTOR bi = XMVector3Cross(b0, tan1);
                float w = XMVector3Less(XMVector3Dot(bi, tan2), g_XMZero) ? -1.f : 1.f;

                bi = XMVectorSetW(b1, w);
                XMStoreFloat4(&tangents4[j], bi);
            }

            if (bitangents)
            {
                XMStoreFloat3(&bitangents[j], b2);
            }
        }

        return S_OK;
    }
}

//=====================================================================================
// Entry-points
//=====================================================================================

//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::ComputeTangentFrame(
    const uint16_t* indices, size_t nFaces,
    const XMFLOAT3* positions, const XMFLOAT3* normals, const XMFLOAT2* texcoords,
    size_t nVerts, XMFLOAT3* tangents, XMFLOAT3* bitangents)
{
    if (!tangents && !bitangents)
        return E_INVALIDARG;

    return ComputeTangentFrameImpl<uint16_t>(indices, nFaces, positions, normals, texcoords, nVerts, tangents, nullptr, bitangents);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::ComputeTangentFrame(
    const uint32_t* indices, size_t nFaces,
    const XMFLOAT3* positions, const XMFLOAT3* normals, const XMFLOAT2* texcoords,
    size_t nVerts, XMFLOAT3* tangents, XMFLOAT3* bitangents)
{
    if (!tangents && !bitangents)
        return E_INVALIDARG;

    return ComputeTangentFrameImpl<uint32_t>(indices, nFaces, positions, normals, texcoords, nVerts, tangents, nullptr, bitangents);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::ComputeTangentFrame(
    const uint16_t* indices, size_t nFaces,
    const XMFLOAT3* positions, const XMFLOAT3* normals, const XMFLOAT2* texcoords,
    size_t nVerts, XMFLOAT4* tangents, XMFLOAT3* bitangents)
{
    if (!tangents && !bitangents)
        return E_INVALIDARG;

    return ComputeTangentFrameImpl<uint16_t>(indices, nFaces, positions, normals, texcoords, nVerts, nullptr, tangents, bitangents);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::ComputeTangentFrame(
    const uint32_t* indices, size_t nFaces,
    const XMFLOAT3* positions, const XMFLOAT3* normals, const XMFLOAT2* texcoords,
    size_t nVerts, XMFLOAT4* tangents, XMFLOAT3* bitangents)
{
    if (!tangents && !bitangents)
        return E_INVALIDARG;

    return ComputeTangentFrameImpl<uint32_t>(indices, nFaces, positions, normals, texcoords, nVerts, nullptr, tangents, bitangents);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::ComputeTangentFrame(
    const uint16_t* indices, size_t nFaces,
    const XMFLOAT3* positions, const XMFLOAT3* normals, const XMFLOAT2* texcoords,
    size_t nVerts, XMFLOAT4* tangents)
{
    if (!tangents)
        return E_INVALIDARG;

    return ComputeTangentFrameImpl<uint16_t>(indices, nFaces, positions, normals, texcoords, nVerts, nullptr, tangents, nullptr);
}


//-------------------------------------------------------------------------------------
_Use_decl_annotations_
HRESULT DirectX::ComputeTangentFrame(
    const uint32_t* indices, size_t nFaces,
    const XMFLOAT3* positions, const XMFLOAT3* normals, const XMFLOAT2* texcoords,
    size_t nVerts, XMFLOAT4* tangents)
{
    if (!tangents)
        return E_INVALIDARG;

    return ComputeTangentFrameImpl<uint32_t>(indices, nFaces, positions, normals, texcoords, nVerts, nullptr, tangents, nullptr);
}
