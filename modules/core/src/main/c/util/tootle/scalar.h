/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef SCALAR_H
#define SCALAR_H

#include <cmath>
#include <climits>

#define SCALAR_MIN (-1e9f)
#define SCALAR_MAX (1e9f)
#define SCALAR_EPSILON (1.0f/SCALAR_MAX)
#define SCALAR_PI (3.14159265358979323846264338327950288419716939937510582f)
#define SCALAR_TODEGREE (180.0f/SCALAR_PI)
#define SCALAR_TORADIAN (SCALAR_PI/180.0f)

#ifndef MAX
    #define MAX(a, b) ((a > b) ? (a) : (b))
#endif

#ifndef MIN
    #define MIN(a, b) ((a < b) ? (a) : (b))
#endif

template <class T>
static inline void Swap(T& a, T& b)
{
    T temp = a;
    a = b;
    b = temp;
}

template <class T>
inline bool Zero(const T& a)
{
    return fabs(a) <= (T)(SCALAR_EPSILON);
}

template <class T, class U>
inline bool Equal(const T& a, const U& b)
{
    return Zero(a - b);
}

template <class T>
inline bool Positive(const T& a)
{
    return a > (T) SCALAR_EPSILON;
}

template <class T>
inline bool Negative(const T& a)
{
    return a < (T)(-SCALAR_EPSILON);
}

typedef unsigned char Uchar;
typedef unsigned short Ushort;
typedef unsigned long Ulong;

inline double Limit(const Uchar& c) { (void) c; return UCHAR_MAX; }
inline double Limit(const Ushort& c) { (void) c; return USHRT_MAX; }
inline double Limit(const Ulong& c) { (void) c; return ULONG_MAX; }
inline double Limit(const float& c) { (void) c; return 1.0; }
inline double Limit(const double& c) { (void) c; return 1.0; }

template <class T, class U>
inline void Translate(T& dest, const U& source)
{ dest = (T)(source * Limit(dest) / Limit(source)); }

// optimizations
inline void Translate(Uchar& dest, const Ushort& source)
{ dest = source >> 8; }
inline void Translate(Ushort& dest, const Uchar& source)
{ dest = source << 8; }

inline void Translate(float& dest, const Ushort& source)
{ dest = source * (1.0f / USHRT_MAX); } ;

inline void Translate(float& dest, const Uchar& source)
{ dest = source * (1.0f / UCHAR_MAX); } ;

template <class V>
inline void Solve(const V& a, const V& b, const V& c, V* x1, V* x2)
{
    V sd = sqrt(b * b - 4 * a * c);
    *x1 = (-b + sd) / (2 * a);
    *x2 = (-b - sd) / (2 * a);
}

#endif // SCALAR_H
