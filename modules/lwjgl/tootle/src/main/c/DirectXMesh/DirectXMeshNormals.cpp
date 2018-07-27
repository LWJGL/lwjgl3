//-------------------------------------------------------------------------------------
// DirectXMeshNormals.cpp
//  
// DirectX Mesh Geometry Library - Normal computation
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
    // Compute normals with equal weighting
    //---------------------------------------------------------------------------------
    template<class index_t>
    HRESULT ComputeNormalsEqualWeight(
        _In_reads_(nFaces * 3) const index_t* indices, size_t nFaces,
        _In_reads_(nVerts) const XMFLOAT3* positions, size_t nVerts,
        bool cw, _Out_writes_(nVerts) XMFLOAT3* normals)
    {
        ScopedAlignedArrayXMVECTOR temp(static_cast<XMVECTOR*>(_aligned_malloc(sizeof(XMVECTOR) * nVerts, 16)));
        if (!temp)
            return E_OUTOFMEMORY;

        XMVECTOR* vertNormals = temp.get();
        memset(vertNormals, 0, sizeof(XMVECTOR) * nVerts);

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

            XMVECTOR p1 = XMLoadFloat3(&positions[i0]);
            XMVECTOR p2 = XMLoadFloat3(&positions[i1]);
            XMVECTOR p3 = XMLoadFloat3(&positions[i2]);

            XMVECTOR u = XMVectorSubtract(p2, p1);
            XMVECTOR v = XMVectorSubtract(p3, p1);

            XMVECTOR faceNormal = XMVector3Normalize(XMVector3Cross(u, v));

            vertNormals[i0] = XMVectorAdd(vertNormals[i0], faceNormal);
            vertNormals[i1] = XMVectorAdd(vertNormals[i1], faceNormal);
            vertNormals[i2] = XMVectorAdd(vertNormals[i2], faceNormal);
        }

        // Store results
        if (cw)
        {
            for (size_t vert = 0; vert < nVerts; ++vert)
            {
                XMVECTOR n = XMVector3Normalize(vertNormals[vert]);
                n = XMVectorNegate(n);
                XMStoreFloat3(&normals[vert], n);
            }
        }
        else
        {
            for (size_t vert = 0; vert < nVerts; ++vert)
            {
                XMVECTOR n = XMVector3Normalize(vertNormals[vert]);
                XMStoreFloat3(&normals[vert], n);
            }
        }

        return S_OK;
    }


    //---------------------------------------------------------------------------------
    // Compute normals with weighting by angle
    //---------------------------------------------------------------------------------
    template<class index_t>
    HRESULT ComputeNormalsWeightedByAngle(
        _In_reads_(nFaces * 3) const index_t* indices, size_t nFaces,
        _In_reads_(nVerts) const XMFLOAT3* positions, size_t nVerts,
        bool cw, _Out_writes_(nVerts) XMFLOAT3* normals)
    {
        ScopedAlignedArrayXMVECTOR temp(static_cast<XMVECTOR*>(_aligned_malloc(sizeof(XMVECTOR) * nVerts, 16)));
        if (!temp)
            return E_OUTOFMEMORY;

        XMVECTOR* vertNormals = temp.get();
        memset(vertNormals, 0, sizeof(XMVECTOR) * nVerts);

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

            XMVECTOR p0 = XMLoadFloat3(&positions[i0]);
            XMVECTOR p1 = XMLoadFloat3(&positions[i1]);
            XMVECTOR p2 = XMLoadFloat3(&positions[i2]);

            XMVECTOR u = XMVectorSubtract(p1, p0);
            XMVECTOR v = XMVectorSubtract(p2, p0);

            XMVECTOR faceNormal = XMVector3Normalize(XMVector3Cross(u, v));

            // Corner 0 -> 1 - 0, 2 - 0
            XMVECTOR a = XMVector3Normalize(u);
            XMVECTOR b = XMVector3Normalize(v);
            XMVECTOR w0 = XMVector3Dot(a, b);
            w0 = XMVectorClamp(w0, g_XMNegativeOne, g_XMOne);
            w0 = XMVectorACos(w0);

            // Corner 1 -> 2 - 1, 0 - 1
            XMVECTOR c = XMVector3Normalize(XMVectorSubtract(p2, p1));
            XMVECTOR d = XMVector3Normalize(XMVectorSubtract(p0, p1));
            XMVECTOR w1 = XMVector3Dot(c, d);
            w1 = XMVectorClamp(w1, g_XMNegativeOne, g_XMOne);
            w1 = XMVectorACos(w1);

            // Corner 2 -> 0 - 2, 1 - 2
            XMVECTOR e = XMVector3Normalize(XMVectorSubtract(p0, p2));
            XMVECTOR f = XMVector3Normalize(XMVectorSubtract(p1, p2));
            XMVECTOR w2 = XMVector3Dot(e, f);
            w2 = XMVectorClamp(w2, g_XMNegativeOne, g_XMOne);
            w2 = XMVectorACos(w2);

            vertNormals[i0] = XMVectorMultiplyAdd(faceNormal, w0, vertNormals[i0]);
            vertNormals[i1] = XMVectorMultiplyAdd(faceNormal, w1, vertNormals[i1]);
            vertNormals[i2] = XMVectorMultiplyAdd(faceNormal, w2, vertNormals[i2]);
        }

        // Store results
        if (cw)
        {
            for (size_t vert = 0; vert < nVerts; ++vert)
            {
                XMVECTOR n = XMVector3Normalize(vertNormals[vert]);
                n = XMVectorNegate(n);
                XMStoreFloat3(&normals[vert], n);
            }
        }
        else
        {
            for (size_t vert = 0; vert < nVerts; ++vert)
            {
                XMVECTOR n = XMVector3Normalize(vertNormals[vert]);
                XMStoreFloat3(&normals[vert], n);
            }
        }

        return S_OK;
    }


    //---------------------------------------------------------------------------------
    // Compute normals with weighting by face area
    //---------------------------------------------------------------------------------
    template<class index_t>
    HRESULT ComputeNormalsWeightedByArea(
        _In_reads_(nFaces * 3) const index_t* indices, size_t nFaces,
        _In_reads_(nVerts) const XMFLOAT3* positions, size_t nVerts,
        bool cw, _Out_writes_(nVerts) XMFLOAT3* normals)
    {
        ScopedAlignedArrayXMVECTOR temp(static_cast<XMVECTOR*>(_aligned_malloc(sizeof(XMVECTOR) * nVerts, 16)));
        if (!temp)
            return E_OUTOFMEMORY;

        XMVECTOR* vertNormals = temp.get();
        memset(vertNormals, 0, sizeof(XMVECTOR) * nVerts);

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

            XMVECTOR p0 = XMLoadFloat3(&positions[i0]);
            XMVECTOR p1 = XMLoadFloat3(&positions[i1]);
            XMVECTOR p2 = XMLoadFloat3(&positions[i2]);

            XMVECTOR u = XMVectorSubtract(p1, p0);
            XMVECTOR v = XMVectorSubtract(p2, p0);

            XMVECTOR faceNormal = XMVector3Normalize(XMVector3Cross(u, v));

            // Corner 0 -> 1 - 0, 2 - 0
            XMVECTOR w0 = XMVector3Cross(u, v);
            w0 = XMVector3Length(w0);

            // Corner 1 -> 2 - 1, 0 - 1
            XMVECTOR c = XMVectorSubtract(p2, p1);
            XMVECTOR d = XMVectorSubtract(p0, p1);
            XMVECTOR w1 = XMVector3Cross(c, d);
            w1 = XMVector3Length(w1);

            // Corner 2 -> 0 - 2, 1 - 2
            XMVECTOR e = XMVectorSubtract(p0, p2);
            XMVECTOR f = XMVectorSubtract(p1, p2);
            XMVECTOR w2 = XMVector3Cross(e, f);
            w2 = XMVector3Length(w2);

            vertNormals[i0] = XMVectorMultiplyAdd(faceNormal, w0, vertNormals[i0]);
            vertNormals[i1] = XMVectorMultiplyAdd(faceNormal, w1, vertNormals[i1]);
            vertNormals[i2] = XMVectorMultiplyAdd(faceNormal, w2, vertNormals[i2]);
        }

        // Store results
        if (cw)
        {
            for (size_t vert = 0; vert < nVerts; ++vert)
            {
                XMVECTOR n = XMVector3Normalize(vertNormals[vert]);
                n = XMVectorNegate(n);
                XMStoreFloat3(&normals[vert], n);
            }
        }
        else
        {
            for (size_t vert = 0; vert < nVerts; ++vert)
            {
                XMVECTOR n = XMVector3Normalize(vertNormals[vert]);
                XMStoreFloat3(&normals[vert], n);
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
HRESULT DirectX::ComputeNormals(
    const uint16_t* indices, size_t nFaces,
    const XMFLOAT3* positions, size_t nVerts,
    DWORD flags,
    XMFLOAT3* normals)
{
    if (!indices || !positions || !nFaces || !nVerts || !normals)
        return E_INVALIDARG;

    if (nVerts >= UINT16_MAX)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    bool cw = (flags & CNORM_WIND_CW) ? true : false;

    if (flags & CNORM_WEIGHT_BY_AREA)
    {
        return ComputeNormalsWeightedByArea<uint16_t>(indices, nFaces, positions, nVerts, cw, normals);
    }
    else if (flags & CNORM_WEIGHT_EQUAL)
    {
        return ComputeNormalsEqualWeight<uint16_t>(indices, nFaces, positions, nVerts, cw, normals);
    }
    else
    {
        return ComputeNormalsWeightedByAngle<uint16_t>(indices, nFaces, positions, nVerts, cw, normals);
    }
}

_Use_decl_annotations_
HRESULT DirectX::ComputeNormals(
    const uint32_t* indices, size_t nFaces,
    const XMFLOAT3* positions, size_t nVerts,
    DWORD flags,
    XMFLOAT3* normals)
{
    if (!indices || !positions || !nFaces || !nVerts || !normals)
        return E_INVALIDARG;

    if (nVerts >= UINT32_MAX)
        return E_INVALIDARG;

    if ((uint64_t(nFaces) * 3) >= UINT32_MAX)
        return HRESULT_FROM_WIN32(ERROR_ARITHMETIC_OVERFLOW);

    bool cw = (flags & CNORM_WIND_CW) ? true : false;

    if (flags & CNORM_WEIGHT_BY_AREA)
    {
        return ComputeNormalsWeightedByArea<uint32_t>(indices, nFaces, positions, nVerts, cw, normals);
    }
    else if (flags & CNORM_WEIGHT_EQUAL)
    {
        return ComputeNormalsEqualWeight<uint32_t>(indices, nFaces, positions, nVerts, cw, normals);
    }
    else
    {
        return ComputeNormalsWeightedByAngle<uint32_t>(indices, nFaces, positions, nVerts, cw, normals);
    }
}
