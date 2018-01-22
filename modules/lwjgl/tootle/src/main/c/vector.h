/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef VECTOR_H
#define VECTOR_H

#include <cmath>
#include "matrix.h"

// A vector is just a matrix with one column
// I wanted to use partial template specialization,
// but my compiler doesn't like it :o(

// shorthand declarations
typedef Matrix<2, 1, float> Vector2;
typedef Matrix<3, 1, float> Vector3;
typedef Matrix<4, 1, float> Vector4;
typedef Matrix<5, 1, float> Vector5;
typedef Matrix<6, 1, float> Vector6;
typedef Matrix<7, 1, float> Vector7;
typedef Matrix<8, 1, float> Vector8;
typedef Matrix<9, 1, float> Vector9;

template <class V>
inline Matrix<3, 1, V> Cross(const Matrix<3, 1, V>& u, const Matrix<3, 1, V>& v)
{
    return Matrix<3, 1, V>(u[1] * v[2] - u[2] * v[1],
                           u[2] * v[0] - u[0] * v[2],
                           u[0] * v[1] - u[1] * v[0]);
}

template <int M, class V>
inline V Dot(const Matrix<M, 1, V>& u, const Matrix<M, 1, V>& v)
{
    float s = 0;

    for (int i = 0; i < M; i++)
    {
        s += u[i] * v[i];
    }

    return s;
}

template <int M, class V>
inline V Norm2(const Matrix<M, 1, V>& v)
{
    return Dot(v, v);
}

template <int M, class V>
inline Matrix<M, 1, V>& Normalize(Matrix<M, 1, V>& v)
{
    v /= Norm(v);
    return v;
}

template <int M, class V>
inline Matrix<M, 1, V> Normalize(const Matrix<M, 1, V>& v)
{
    Matrix<M, 1, V> u = v;
    u /= Norm(u);
    return u;
}

template <int M, class V>
inline V Norm(const Matrix<M, 1, V>& v)
{
    return sqrt(Norm2(v));
}

template <int M, class V>
inline V Phase(const Matrix<M, 1, V>& v)
{
    return atan2(v[1], v[0]);
}

template <int N, class V>
inline Matrix<N, N, V> Outer(const Matrix<N, 1, V>& a, const Matrix<N, 1, V>& b)
{
    int i, j;
    Matrix<N, N, V> r;

    for (i = 0; i < N; i++)
        for (j = i; j < N; j++)
        {
            r(i, j) = a(i) * b(j);
        }

    for (i = 0; i < N; i++)
        for (j = 0; j < i; j++)
        {
            r(i, j) = r(j, i);
        }

    return r;
}

template <class V>
inline Matrix<3, 3, V> Cross(const Matrix<3, 1, V>& t)
{
    V r[] = {0, -t[2], t[1], t[2], 0, -t[0], -t[1], t[0], 0};
    return Matrix<3, 3, V>(r);
}

template <class V>
inline Matrix<3, 3, V> Rodrigues(const Matrix<3, 1, V>& w)
{
    V a = Norm(w);
    Matrix3 I = Identity<3, V>();

    if (Zero(a)) { return I; }

    Vector3 n = w / a;
    V c = (V) cos(a);
    V s = (V) sin(a);
    return c * I + (I - c * I) * Outer(n, n) + s * Cross(n);
}

#endif // VECTOR_H
