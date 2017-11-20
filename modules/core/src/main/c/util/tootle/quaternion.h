/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef QUATERNION_H
#define QUATERNION_H

#include "scalar.h"
#include "vector.h"

class Quaternion
{
public:
    // build a quaternion from its components
    Quaternion(float x = 0, float y = 0, float z = 0, float w = 0)
    {
        v[0] = x; v[1] = y; v[2] = z; a = w;
    }
    // builds a unit quaternion from a rotation (OpenGL like rotation)
    Quaternion(float r, const Vector3& u)
    {
        r *= SCALAR_TORADIAN;
        float n = Norm(u);

        if (Zero(n)) { n = 1.0f; }

        float inv_n = 1.0f / n;
        float s = (float)sin(r / 2);
        v[0] = u[0] * s * inv_n; v[1] = u[1] * s * inv_n; v[2] = u[2] * s * inv_n;
        a = (float) cos(r / 2);
    }
    // builds a quaternion from a vector and a scalar
    Quaternion(const Vector3& v, float a)
    {
        this->v[0] = v[0]; this->v[1] = v[1]; this->v[2] = v[2]; this->a = a;
    }
    // makes sure a quaternion can be used as a vector
    operator Vector3() const
    {
        return v;
    }

    // Conjugate a quaternion
    Quaternion operator!() const
    {
        return Quaternion(-v, a);
    }

    Quaternion operator-() const
    {
        return Quaternion(-v[0], -v[1], -v[2], -a);
    }

    Quaternion operator*(const Quaternion& r) const
    {
        return Quaternion(a * r.v + v * r.a + Cross(v, r.v), a * r.a - Dot(v, r.v));
    }

    Quaternion operator*(const float s)
    {
        return Quaternion(s * v[0], s * v[1], s * v[2], s * a);
    }

    Quaternion& operator*=(const Quaternion& r)
    {
        v = a * r.v + v * r.a + Cross(v, r.v);
        a = a * r.a - Dot(v, r.v);
        return *this;
    }

    float GetRotation(float* x, float* y, float* z) const
    {
        float inv_n = (float)(1.0 / sqrt(Norm2(v) + a * a));
        *x = v[0] * inv_n; *y = v[1] * inv_n; *z = v[2] * inv_n;
        return (float)(SCALAR_TODEGREE * 2.0 * acos(a * inv_n));
    }

    float GetRotation(Vector3* v) const
    {
        Vector3& u = *v;
        return GetRotation(&u[0], &u[1], &u[2]);
    }

private:
    // quaternion split in scalar and vector part
    Vector3 v;
    float a;
};

//=======================================================================
// Auxiliar functions
//=======================================================================
inline Quaternion operator*(const float& a, const Quaternion& q)
{
    return q * a;
}

#endif // QUATERNION_H

