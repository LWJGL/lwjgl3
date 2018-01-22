/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include "JRTCommon.h"
#include "JMLFuncs.h"

#include <assert.h>

namespace JML
{

float RandomFloat()
{
    return (float)rand() / (float)RAND_MAX;
}

void TransformPoint(const Vec3f* pPoint, const Matrix4f* pMatrix, Vec3f* pPointOut)
{
    // multiplication from the right, assume point.w = 1
    /*const float* values = pMatrix->GetValues();
    SSEVec4 col1(values);
    SSEVec4 col2(values+4);
    SSEVec4 col3(values+8);
    SSEVec4 col4(values+12);

    col1 *= SSEVec4( pPoint->x );
    col2 *= SSEVec4( pPoint->y );
    col3 *= SSEVec4( pPoint->z );

    SSEVec4 res = col1 + col2 + col3 + col4;

    // branch past the divide-by-W if we can help it
    SSEVec4 W = VEC4_W(res);
    SSEVec4 zero = SSEVecZero();
    SSEVec4 one = SSEVec4(1.0f);
    if( SSEVecIsXNEqual( W, zero ) && SSEVecIsXNEqual( W,one ) )
        res *= SSEVecRCP(W);

    SSEVecStore3f( res, *pPointOut );*/

    float vals[4];
    vals[0] = pPoint->x;
    vals[1] = pPoint->y;
    vals[2] = pPoint->z;
    vals[3] = 1.0f;

    float vals_out[4] = {0};

    for (unsigned int row = 0; row < 4; row++)
    {
        for (unsigned int  col = 0; col < 4; col++)
        {
            vals_out[row] += pMatrix->Get(row, col) * vals[col];
        }
    }

    if (vals_out[3] != 0.0f)
    {
        vals_out[0] /= vals_out[3];
        vals_out[1] /= vals_out[3];
        vals_out[2] /= vals_out[3];
    }

    *pPointOut = Vec3f(vals_out);
}

void FastTransformPoint(const Vec3f* pPoint, const Matrix4f* pMatrix, Vec3f* pPointOut)
{
    // multiplication from the right, assume point.w = 1
    const float* values = pMatrix->GetValues();
    SSEVec4 col1(values);
    SSEVec4 col2(values + 4);
    SSEVec4 col3(values + 8);

    // assume that last matrix row is (0,0,0,1)

    SSEVec4 pt = SSEVecLoad3f(*pPoint);
    col1 *= SSEVec4(pPoint->x);
    col2 *= SSEVec4(pPoint->y);
    col3 *= SSEVec4(pPoint->z);

    SSEVec4 res = col1 + col2 + col3 ;

    // if last row is 0,0,0,1, we never need the divide-by-w, and
    // row 4 has no effect on the answer

    SSEVecStore3f(res, *pPointOut);
}


void TransformVector(const Vec3f* pVector, const Matrix4f* pMatrix, Vec3f* pVecOut)
{

    // multiplication from the right, assume point.w = 0

    /* const float* pVals = rMatrix->GetValues();
     SSEVec4 col1(pVals);
     SSEVec4 col2(pVals + 4);
     SSEVec4 col3(pVals + 8);
     SSEVec4 point = SSEVecLoad3f( *pVector );

     // if the w-term is 0, as with a vector, we omit the last add
     col1 *= VEC4_X(point);
     col1 += col2 * VEC4_Y(point);
     col1 += col3 * VEC4_Z(point);

     // we still need divide-by-W in case bottom row is not 0 0 0 1
     SSEVec4 W = VEC4_W(col1);
     SSEVec4 zero = SSEVecZero();
     SSEVec4 one = SSEVec4(1.0f);
     if( SSEVecIsXNEqual( W, zero ) && SSEVecIsXNEqual( W, one ) )
         col1 *= SSEVecQuickRCP(W);

     SSEVecStore3f( col1, *pVecOut );*/

    float vals[4];
    vals[0] = pVector->x;
    vals[1] = pVector->y;
    vals[2] = pVector->z;
    vals[3] = 0.0f;

    float vals_out[4] = {0};

    for (unsigned int row = 0; row < 4; row++)
    {
        for (unsigned int  col = 0; col < 4; col++)
        {
            vals_out[row] += pMatrix->Get(row, col) * vals[col];
        }
    }

    *pVecOut = Vec3f(vals_out);

}

/*void FastTransformVector( const Vec3f* pVector, const Matrix4f* rMatrix, Vec3f* pVecOut )
{
    // multiplication from the right, assume point.w = 0
    // assume that bottom row is 0 0 0 1
    // this implies that we do not need a divide by w
    const float* pVals = rMatrix->GetValues();
    SSEVec4 col1(pVals);
    SSEVec4 col2(pVals + 4);
    SSEVec4 col3(pVals + 8);
    SSEVec4 point = SSEVecLoad3f( *pVector );

    col1 *= VEC4_X(point);
    col1 += col2 * VEC4_Y(point);
    col1 += col3 * VEC4_Z(point);

    SSEVecStore3f( col1, *pVecOut );
}*/


void Vec4TransformPoint(const SSEVec4& rPoint, const Matrix4f* pMatrix, SSEVec4& rVecOut)
{
    // multiplication from the right, assume point.w = 1
    const float* values = pMatrix->GetValues();
    SSEVec4 col1(values);
    SSEVec4 col2(values + 4);
    SSEVec4 col3(values + 8);
    SSEVec4 col4(values + 12);

    col1 *= VEC4_X(rPoint);
    col2 *= VEC4_Y(rPoint);
    col3 *= VEC4_Z(rPoint);

    SSEVec4 res = col1 + col2 + col3 + col4;

    // branch past the divide-by-W if we can help it
    SSEVec4 W = VEC4_W(res);
    SSEVec4 zero = SSEVecZero();
    SSEVec4 one = SSEVec4(1.0f);

    if (SSEVecIsXNEqual(W, zero) && SSEVecIsXNEqual(W, one))
    {
        res *= SSEVecRCP(W);
    }

    rVecOut = res;
}


void Vec4TransformVector(const SSEVec4& rVector, const Matrix4f* pMatrix, SSEVec4& rVecOut)
{
    // multiply from left, assume w = 0
    const float* pVals = pMatrix->GetValues();
    SSEVec4 col1(pVals);
    SSEVec4 col2(pVals + 4);
    SSEVec4 col3(pVals + 8);

    // if the w-term is 0, as with a vector, we omit the last add
    col1 *= VEC4_X(rVector);
    col1 += col2 * VEC4_Y(rVector);
    col1 += col3 * VEC4_Z(rVector);

    // we still need divide-by-W in case bottom row is not 0 0 0 1
    SSEVec4 W = VEC4_W(col1);
    SSEVec4 zero = SSEVecZero();
    SSEVec4 one = SSEVec4(1.0f);

    if (SSEVecIsXNEqual(W, zero) && SSEVecIsXNEqual(W, one))
    {
        col1 *= SSEVecRCP(W);
    }

    rVecOut = col1;
}


void Vec4TransformVectorTranspose(const SSEVec4& rVector, const Matrix4f* pMatrix, SSEVec4& rVecOut)
{
    // multiplication from the left, assume point.w = 0
    const float* pVals = pMatrix->GetValues();
    SSEVec4 col1(pVals);
    SSEVec4 col2(pVals + 4);
    SSEVec4 col3(pVals + 8);
    SSEVec4 col4(pVals + 12);

    float x = SSEVec3Dot(rVector, col1);
    float y = SSEVec3Dot(rVector, col2);
    float z = SSEVec3Dot(rVector, col3);
    float w = SSEVec3Dot(rVector, col4);

    // we still need divide-by-W in case bottom row is not 0 0 0 1
    if (w != 0.0f && w != 1.0f)
    {
        w = FastRCP(w);
        x *= w;
        y *= w;
        z *= w;
    }

    rVecOut = SSEVec4(x, y, z, 0);

}


Vec3f BarycentricLerp3f(const Vec3f& v1, const Vec3f& v2, const Vec3f& v3, const float barycentrics[3])
{
    // TODO: make this fast using SSE if possible
    return (v1 * barycentrics[0]) + (v2 * barycentrics[1]) + (v3 * barycentrics[2]);
}

Vec2f BarycentricLerp2f(const Vec2f& v1, const Vec2f& v2, const Vec2f& v3, const float barycentrics[3])
{
    // TODO: make this fast using SSE if possible
    return (v1 * barycentrics[0]) + (v2 * barycentrics[1]) + (v3 * barycentrics[2]);
}


Matrix4f MatrixScale(float x, float y, float z)
{
    float values[] =
    {
        x, 0, 0, 0,
        0, y, 0, 0,
        0, 0, z, 0,
        0, 0, 0, 1
    };

    return Matrix4f(values);
}


Matrix4f MatrixTranslate(float x, float y, float z)
{
    Matrix4f xlate;
    xlate.Set(0, 3, x);
    xlate.Set(1, 3, y);
    xlate.Set(2, 3, z);

    return xlate;
}


Matrix4f MatrixIdentity()
{
    return Matrix4f();
}

Matrix4f MatrixRotate(float x, float y, float z, float fAngleInRads)
{
    Vec3f r(x, y, z);
    r = Normalize(r);

    float cosx = cos(fAngleInRads);
    float sinx = sin(fAngleInRads);

    // see Akenine-Moeller Haines, real-time rendering, pg 43
    // originally published by ron goldman
    Matrix4f rotation;
    rotation.Set(0, 0, cosx + ((1 - cosx)*r.x * r.x));
    rotation.Set(0, 1, ((1 - cosx)*r.x * r.y) - (r.z * sinx));
    rotation.Set(0, 2, ((1 - cosx)*r.x * r.z) + (r.y * sinx));

    rotation.Set(1, 0, ((1 - cosx)*r.x * r.y) + r.z * sinx);
    rotation.Set(1, 1, cosx + (1 - cosx)*r.y * r.y);
    rotation.Set(1, 2, ((1 - cosx)*r.y * r.z) - r.x * sinx);

    rotation.Set(2, 0, ((1 - cosx)*r.x * r.z) - r.y * sinx);
    rotation.Set(2, 1, ((1 - cosx)*r.y * r.z) + r.x * sinx);
    rotation.Set(2, 2, cosx + (1 - cosx)*r.z * r.z);

    return rotation;
}

Matrix4f MatrixLookAt(const Vec3f& rEye, const Vec3f& rAt, const Vec3f& rUp)
{
    Vec3f z = Normalize(rAt - rEye);
    Vec3f x = Cross(rUp, z);
    Vec3f y = Cross(z, x);

    Matrix4f mat;
    mat.Set(0, 0, x.x);
    mat.Set(0, 1, x.y);
    mat.Set(0, 2, x.z);
    mat.Set(0, 3, -rEye.x);

    mat.Set(1, 0, y.x);
    mat.Set(1, 1, y.y);
    mat.Set(1, 2, y.z);
    mat.Set(1, 3, -rEye.y);

    mat.Set(2, 0, z.x);
    mat.Set(2, 1, z.y);
    mat.Set(2, 2, z.z);
    mat.Set(2, 3, -rEye.z);


    return mat;

}

Matrix4f MatrixAlignZToVector(const Vec3f& rVec)
{
    Vec3f vn = Normalize(rVec);
    Vec3f up(0, 1, 0);

    if (vn.x == 0.0f && vn.z == 0.0f)
    {
        // vector is aligned to the y axis, use a different vector for the cross
        up = Vec3f(1, 0, 0);
    }

    return MatrixLookAt(Vec3f(0, 0, 0), vn, up);
}

Matrix4f MatrixCoordinateFrame(const Vec3f& x, const Vec3f& y, const Vec3f& z)
{
    Matrix4f mat;
    mat.Set(0, 0, x.x);
    mat.Set(0, 1, x.y);
    mat.Set(0, 2, x.z);
    mat.Set(0, 3, 0);

    mat.Set(1, 0, y.x);
    mat.Set(1, 1, y.y);
    mat.Set(1, 2, y.z);
    mat.Set(1, 3, 0);

    mat.Set(2, 0, z.x);
    mat.Set(2, 1, z.y);
    mat.Set(2, 2, z.z);
    mat.Set(2, 3, 0);
    return mat;
}
};