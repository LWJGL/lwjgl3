/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _JML_FUNCS_H_
#define _JML_FUNCS_H_


#include <stdlib.h>
#include <math.h>

#include "JMLVec2.h"
#include "JMLVec3.h"
#include "JMLMatrix.h"
#include "JMLSSEVec.h"

const float PI = 3.1415926f;
const float E = 2.718281828f;
#define Max(f1,f2) ((f1>f2) ? f1 : f2 )
#define Min(f1,f2) ((f1<f2) ? f1 : f2 )

namespace JML
{
// scalar
inline float DegreeToRad(float fDegrees) { return fDegrees * (PI / 180.0f); };
inline float RadToDegree(float fRads) { return fRads * (180.0f / PI); };


// Vec2f
inline float DotProduct(const Vec2f& v1, const Vec2f& v2)  { return v1.x * v2.x + v1.y * v2.y; };
inline float Length(const Vec2f& v1)  { return sqrt(DotProduct(v1, v1)); };
inline Vec2f Normalize(const Vec2f& v1) { return v1 / Length(v1); };

// Vec2d
inline double DotProduct(const Vec2d& v1, const Vec2d& v2) { return v1.x * v2.x + v1.y * v2.y; };
inline double Length(const Vec2d& v1) { return sqrt(DotProduct(v1, v1)); };
inline Vec2d Normalize(const Vec2d& v1) { return v1 / Length(v1); };

// Vec3f
inline float DotProduct(const Vec3f& v1, const Vec3f& v2)  { return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z; };
inline float Length(const Vec3f& v1)  { return sqrt(DotProduct(v1, v1)); };
inline Vec3f Normalize(const Vec3f& v1) { return v1 / Length(v1); };
inline Vec3f Cross(const Vec3f& v1, const Vec3f& v2)
{
    float x = (v1.y * v2.z) - (v1.z * v2.y);
    float y = (v1.z * v2.x) - (v1.x * v2.z);
    float z = (v1.x * v2.y) - (v1.y * v2.x);
    return Vec3f(x, y, z);
};

inline Vec3f Min3f(const Vec3f& a, const Vec3f& b)
{
    float x = Min(a.x, b.x);
    float y = Min(a.y, b.y);
    float z = Min(a.z, b.z);
    return Vec3f(x, y, z);
};

inline Vec3f Max3f(const Vec3f& a, const Vec3f& b)
{
    float x = Max(a.x, b.x);
    float y = Max(a.y, b.y);
    float z = Max(a.z, b.z);
    return Vec3f(x, y, z);
};

inline Vec3f Lerp(const Vec3f& a, const Vec3f& b, float t)
{
    return (a * (1 - t)) + (b * t);
};

// Vec3d
inline double DotProduct(const Vec3d& v1, const Vec3d& v2)  { return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z; };
inline double Length(const Vec3d& v1)  { return sqrt(DotProduct(v1, v1)); };
inline Vec3d Normalize(const Vec3d& v1) { return v1 / Length(v1); };
inline Vec3d Cross(const Vec3d& v1, const Vec3d& v2)
{
    double x = (v1.y * v2.z) - (v1.z * v2.y);
    double y = (v1.z * v2.x) - (v1.x * v2.z);
    double z = (v1.x * v2.y) - (v1.y * v2.x);
    return Vec3d(x, y, z);
};

/// Returns a random float between 0 and 1
float RandomFloat();

inline float FastRCP(float v)
{
    __m128 a   = _mm_load_ss(&v);
    __m128 Ra0 = _mm_rcp_ps(a);
    __m128 result = _mm_sub_ps(_mm_add_ps(Ra0, Ra0), _mm_mul_ps(_mm_mul_ps(Ra0, a), Ra0));
    float x;
    _mm_store_ss(&x, result);
    return x;
};

/// Transformation of a point (w=1) by an arbitrary matrix, multiplies from right
/// It is safe for pPoint to equal pPointOut
void TransformPoint(const Vec3f* pPoint, const Matrix4f* pMatrix, Vec3f* pPointOut);

/// Point transformation, optimized for a matrix with last row 0 0 0 1, multiplies from right
void FastTransformPoint(const Vec3f* pPoint, const Matrix4f* pMatrix, Vec3f* pPointOut);

/// Transformation of a vector (w=0) by an arbitrary matrix, multiplies from right
/// The bottom row of the matrix is ignored
void TransformVector(const Vec3f* pVector, const Matrix4f* rMatrix, Vec3f* pVecOut);

/// Vector transformation, optimized for a matrix with last row 0 0 0 1, multiplies from right
//void FastTransformVector( const Vec3f* pVector, const Matrix4f* rMatrix, Vec3f* pVecOut );


void Vec4TransformPoint(const SSEVec4& rPoint, const Matrix4f* pMatrix, SSEVec4& rVecOut);

void Vec4TransformVectorTranspose(const SSEVec4& rVector, const Matrix4f* pMatrix, SSEVec4& rVecOut);


Vec3f BarycentricLerp3f(const Vec3f& v1, const Vec3f& v2, const Vec3f& v3, const float barycentrics[3]);

Vec2f BarycentricLerp2f(const Vec2f& v1, const Vec2f& v2, const Vec2f& v3, const float barycentrics[3]);

/// Returns a scaling matrix
Matrix4f MatrixScale(float x, float y, float z);

/// Returns a translation matrix
Matrix4f MatrixTranslate(float x, float y, float z);

Matrix4f MatrixIdentity();

/// Returns a rotation matrix about the given axis.  Rotation is clockwise
Matrix4f MatrixRotate(float x, float y, float z, float fAngleInRads);

/// Returns a left-handed viewing transformation for the given camera parameters
Matrix4f MatrixLookAt(const Vec3f& rEye, const Vec3f& rAt, const Vec3f& rUp);

/// Returns a rotation matrix which aligns the given vector along the positive Z axis
Matrix4f MatrixAlignZToVector(const Vec3f& rVec);


Matrix4f MatrixCoordinateFrame(const Vec3f& rXAxis, const Vec3f& rYAxis, const Vec3f& rZAxis);


inline Vec3d Vec3fToVec3d(const Vec3f& vec)
{
    return Vec3d(vec.x, vec.y, vec.z);
}

inline Vec3f Vec3dToVec3f(const Vec3d& vec)
{
    return Vec3f((float)vec.x, (float)vec.y, (float)vec.z);
}

};



#endif