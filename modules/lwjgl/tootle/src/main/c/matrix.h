/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef MATRIX_H
#define MATRIX_H

#include <cstdio>
#include "scalar.h"

// WARNING: matrix entries are stored in !COLUMN! major order for
// compatibility with LAPACK!
template <int M, int N, class V = float>
class Matrix
{
public:
    // constructors
    Matrix(void)
    {
        for (int i = 0; i < M * N; i++)
        {
            m[i] = 0;
        }
    }

    // for a Vector2
    // (partial template specialization doesn't work in my compiler)
    Matrix(V a, V b)
    {
        Matrix<M, N, V>& t = *this;
        t(0, 0) = a; t(1, 0) = b;
    }

    // for a Vector3, actually
    Matrix(V a, V b, V c)
    {
        Matrix<M, N, V>& t = *this;
        t(0, 0) = a; t(1, 0) = b; t(2, 0) = c;
    }

    // this is can either be for a Vector4 or a Matrix2
    // (partial template specialization doesn't work in my compiler)
    Matrix(V a, V b, V c, V d)
    {
        Matrix<M, N, V>& t = *this;

        if (N != 1)
        {
            t(0, 0) = a; t(0, 1) = b;
            t(1, 0) = c; t(1, 1) = d;
        }
        else
        {
            t(0, 0) = a; t(1, 0) = b; t(2, 0) = c; t(3, 0) = d;
        }
    }

    // for a Matrix3
    Matrix(V a, V b, V c, V d, V e, V f, V g, V h, V i)
    {
        Matrix<M, N, V>& t = *this;
        t(0, 0) = a; t(0, 1) = b; t(0, 2) = c;
        t(1, 0) = d; t(1, 1) = e; t(1, 2) = f;
        t(2, 0) = g; t(2, 1) = h; t(2, 2) = i;
    }

    // load from array
    template <class U>
    Matrix(U* data, int skip = 1)
    {
        Import(*this, data, skip);
    }

    // member access methods
    const V& operator[](int c) const
    {
        return m[c];
    }

    V& operator[](int c)
    {
        return m[c];
    }

    const V& operator()(int i, int j) const
    {
        return m[j * M + i];
    }

    V& operator()(int i, int j)
    {
        return m[j * M + i];
    }

    // these are for vectors
    V& operator()(int i)
    {
        return m[i];
    }

    const V& operator()(int i) const
    {
        return m[i];
    }

    // operators
    Matrix<M, N, V> operator-() const
    {
        Matrix<M, N, V> r(m);

        for (int i = 0; i < M * N; i++)
        {
            r[i] = -r[i];
        }

        return r;
    }

    Matrix<M, N, V> operator-(const Matrix<M, N, V>& n) const
    {
        Matrix<M, N, V> r(m);

        for (int i = 0; i < M * N; i++)
        {
            r[i] -= n[i];
        }

        return r;
    }

    Matrix<M, N, V> operator-(const V& a) const
    {
        Matrix<M, N, V> r(m);

        for (int i = 0; i < M * N; i++)
        {
            r[i] -= a;
        }

        return r;
    }

    Matrix<M, N, V>& operator-=(const Matrix<M, N, V>& n)
    {
        for (int i = 0; i < M * N; i++)
        {
            m[i] -= n[i];
        }

        return *this;
    }

    Matrix<M, N, V>& operator-=(const V& a)
    {
        for (int i = 0; i < M * N; i++)
        {
            m[i] -= a;
        }

        return *this;
    }

    Matrix<M, N, V> operator+(const Matrix<M, N, V>& n) const
    {
        Matrix<M, N, V> r(m);

        for (int i = 0; i < M * N; i++)
        {
            r[i] += n[i];
        }

        return r;
    }

    Matrix<M, N, V> operator+(const V& a) const
    {
        Matrix<M, N, V> r(m);

        for (int i = 0; i < M * N; i++)
        {
            r[i] += a;
        }

        return r;
    }

    Matrix<M, N, V>& operator+=(const Matrix<M, N, V>& n)
    {
        for (int i = 0; i < M * N; i++)
        {
            m[i] += n[i];
        }

        return *this;
    }

    Matrix<M, N, V>& operator+=(const V& a)
    {
        for (int i = 0; i < M * N; i++)
        {
            m[i] += a;
        }

        return *this;
    }

    Matrix<M, N, V> operator/(const V a) const
    {
        Matrix<M, N, V> r(m);
        V inv_a = (V) 1.0 / a;

        for (int i = 0; i < M * N; i++)
        {
            r[i] *= inv_a;
        }

        return r;
    }

    template <int P, int Q>
    void Load(int is, int js, const Matrix<P, Q, V>& n)
    {
        Matrix<M, N, V>& t = *this;

        for (int i = is; i < is + P && i < M; i++)
            for (int j = js; j < js + Q && j < N; j++)
            {
                t(i, j) = n(i - is, j - js);
            }
    }

    template <int P, int Q>
    void Store(int is, int js, Matrix<P, Q, V>& n)
    {
        Matrix<M, N, V>& t = *this;

        for (int i = is; i < is + P && i < M; i++)
            for (int j = js; j < js + Q && j < N; j++)
            {
                n(i - is, j - js) = t(i, j);
            }
    }

    Matrix<M, N, V> operator*(const V a) const
    {
        Matrix<M, N, V> r(m);

        for (int i = 0; i < M * N; i++)
        {
            r[i] *= a;
        }

        return r;
    }

    Matrix<M, N, V>& operator/=(const V a)
    {
        V inv_a = (V) 1.0 / a;

        for (int i = 0; i < M * N; i++)
        {
            m[i] *= inv_a;
        }

        return *this;
    }

    Matrix<M, N, V>& operator*=(const V a)
    {
        for (int i = 0; i < M * N; i++)
        {
            m[i] *= a;
        }

        return *this;
    }

    bool operator==(const Matrix<M, N, V>& n)
    {
        for (int i = 0; i < M * N; i++)
        {
            if (!Equal(m[i], n[i])) { return false; }
        }

        return true;
    }

    bool operator!=(const Matrix<M, N, V>& n)
    {
        return !(*this == n);
    }

    int GetM(void) const
    {
        return M;
    }

    int GetN(void) const
    {
        return N;
    }

private:
    template <class U>
    static inline void
    Import(Matrix<M, N, V>& m, U* data, int skip)
    {
        for (int i = 0; i < m.GetM(); i++)
        {
            for (int j = 0; j < m.GetN(); j++)
            {
                m(i, j) = (V) data[0];
                data += skip;
            }
        }
    }

protected:
    V m[M * N];
};

// shorthand declarations
typedef Matrix<2, 2> Matrix2;
typedef Matrix<3, 3> Matrix3;
typedef Matrix<4, 4> Matrix4;

// matrix product
template <int M, int N, int P, class V>
inline Matrix<M, P, V> operator*(const Matrix<M, N, V>& m,
                                 const Matrix<N, P, V>& n)
{
    Matrix<M, P> r;

    for (int i = 0; i < M; i++)
    {
        for (int j = 0; j < P; j++)
        {
            for (int k = 0; k < N; k++)
            {
                r(i, j) += m(i, k) * n(k, j);
            }
        }
    }

    return r;
}

// comutative product by a scalar
template <int M, int N, class V, class A>
inline Matrix<M, N, V> operator*(const A& a, const Matrix<M, N, V>& u)
{
    return u * a;
}

// the identity matrix
template <int N, class V>
inline Matrix<N, N, V> Identity(void)
{
    Matrix<N, N> r;

    for (int i = 0; i < N * N; i += N + 1)
    {
        r[i] = 1;
    }

    return r;
}

// norms
template <int M, int N, class V>
inline V Frobenius2(const Matrix<M, N, V>& m)
{
    V s = 0;

    for (int i = 0; i < M * N; i++)
    {
        s += m[i] * m[i];
    }

    return s;
}

template <int M, int N, class V>
inline V Frobenius(const Matrix<M, N, V>& m)
{
    V s = 0;

    for (int i = 0; i < M * N; i++)
    {
        s += m[i] * m[i];
    }

    return sqrt(s);
}

template <int M, int N, class V>
inline Matrix<N, M, V> Transpose(const Matrix<M, N, V>& m)
{
    Matrix<N, M, V> t;

    for (int i = 0; i < N; i++)
        for (int j = 0; j < M; j++)
        {
            t(i, j) = m(j, i);
        }

    return t;
}

template <int M, int N, class V>
static inline void Print(const Matrix<M, N, V>& m)
{
    for (int i = 0; i < M; i++)
    {
        for (int j = 0; j < N; j++)
        {
            printf("%.3f ", (double) m(i, j));
        }

        printf("\n");
    }
}

template <int N, class V>
inline Matrix<N, N, V> Diagonal(const Matrix<N, 1, V>& d)
{
    Matrix<N, N, V> m;

    for (int i = 0; i < N; i++)
    {
        m(i, i) = d(i);
    }

    return m;
}

template <int N, class V>
inline Matrix<N, 1, V> Diagonal(const Matrix<N, N, V>& m)
{
    Matrix<N, 1, V> d;

    for (int i = 0; i < N; i++)
    {
        d(i) = m(i, i);
    }

    return d;
}

// this should just go away and be replaced by something in la.h
template <class V>
inline Matrix<2, 2, V> Inverse(const Matrix<2, 2, V>& m)
{
    V a = m(0, 0), b = m(0, 1), c = m(1, 0), d = m(1, 1);
    V n[4] = { d, -b, -c, a };
    return Matrix<2, 2, V>(n) / (a * d - c * b);
}

// this should just go away and be replaced by something in la.h
template <class V>
inline void Eigen(const Matrix<2, 2, V>& m, V* l1, V* l2,
                  Matrix<2, 1, V>* v1 = NULL, Matrix<2, 1, V>* v2 = NULL)
{
    V a = m(0, 0), b = m(0, 1), c = m(1, 0), d = m(1, 1);
    Solve((V) 1, -(a + d), a * d - c * b, l1, l2);

    if (v1) { *v1 = Matrix<2, 1, V>(b, *l1 - a); }

    if (v2) { *v2 = Matrix<2, 1, V>(b, *l2 - a); }
}

// this should just go away and be replaced by something in la.h
template <class V>
inline Matrix<2, 1, V> Solve(const Matrix<2, 2, V>& m, const Matrix<2, 1, V>& b)
{
    return Inverse(m) * b;
}

#endif
