/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _SSE_VECTOR_H_
#define _SSE_VECTOR_H_

#include <xmmintrin.h>
#include <iostream>
#include <math.h>

#ifdef _LINUX
    class SSEVec4
#else
    class __declspec(align(16)) SSEVec4
#endif
{
public:

    union
    {
        __m128 vec128;
#ifdef _LINUX
        float f32[4];
#endif
    };

    // constructors
    inline SSEVec4() {} ;
    inline SSEVec4(float x, float y, float z, float w) :  vec128(_mm_setr_ps(x, y, z, w)) {};
    inline SSEVec4(__m128 vec) : vec128(vec) {}
    inline SSEVec4(const float* data) : vec128(_mm_load_ps(data)) {};
    inline SSEVec4(float scalar) : vec128(_mm_load1_ps(&scalar)) {};

    // copy and assignment
    inline SSEVec4(const SSEVec4& init) : vec128(init.vec128) {};
    inline const SSEVec4& operator=(const SSEVec4& lhs) { vec128 = lhs.vec128; return *this;};

    // conversion to m128 type for direct use in _mm intrinsics
    inline operator __m128() { return vec128; };
    inline operator const __m128() const { return vec128; };

    // indexing
#ifdef _LINUX
    inline const float& operator[](int i) const { return f32[i]; };
    inline float& operator[](int i) { return f32[i]; };
#else
    inline const float& operator[](int i) const { return vec128.m128_f32[i]; };
    inline float& operator[](int i) { return vec128.m128_f32[i]; };
#endif

    // addition
    inline SSEVec4 operator+(const SSEVec4& rhs) const { return SSEVec4(_mm_add_ps(vec128, rhs.vec128)); };
    inline SSEVec4& operator+=(const SSEVec4& rhs) { vec128 = _mm_add_ps(vec128, rhs.vec128); return *this; };

    // multiplication
    inline SSEVec4 operator*(const SSEVec4& rhs) const { return SSEVec4(_mm_mul_ps(vec128, rhs.vec128)); };
    inline SSEVec4& operator*=(const SSEVec4& rhs) { vec128 = _mm_mul_ps(vec128, rhs.vec128); return *this; };

    // scalar multiplication
    //inline SSEVec4 operator*( float rhs ) const { return SSEVec4( _mm_mul_ps(vec128, _mm_load1_ps(&rhs)) ); };
    //inline SSEVec4& operator*=( float rhs )  { vec128 = _mm_mul_ps(vec128, _mm_load1_ps(&rhs)); return *this; };


    // subtraction
    inline SSEVec4 operator-(const SSEVec4& rhs) const { return SSEVec4(_mm_sub_ps(vec128, rhs.vec128)); };
    inline SSEVec4& operator-= (const SSEVec4& rhs) { vec128 = _mm_sub_ps(vec128, rhs.vec128); return *this; };

    // division
    inline SSEVec4 operator/(const SSEVec4& rhs) const { return SSEVec4(_mm_div_ps(vec128, rhs.vec128)); };
    inline SSEVec4& operator/= (const SSEVec4& rhs) { vec128 = _mm_div_ps(vec128, rhs.vec128); return *this; };

    // scalar division
    inline SSEVec4 operator/(float rhs)   const { return SSEVec4(_mm_div_ps(vec128, _mm_load1_ps(&rhs))); };
    inline SSEVec4& operator/=(float rhs)  { vec128 = _mm_div_ps(vec128, _mm_load1_ps(&rhs)); return *this; };

    // comparison
    // these return 0 or 0xffffffff in each component
    inline SSEVec4 operator< (const SSEVec4& rhs) const { return SSEVec4(_mm_cmplt_ps(vec128, rhs.vec128)); };
    inline SSEVec4 operator> (const SSEVec4& rhs) const { return SSEVec4(_mm_cmpgt_ps(vec128, rhs.vec128)); };
    inline SSEVec4 operator<=(const SSEVec4& rhs) const { return SSEVec4(_mm_cmple_ps(vec128, rhs.vec128)); };
    inline SSEVec4 operator>=(const SSEVec4& rhs) const { return SSEVec4(_mm_cmpge_ps(vec128, rhs.vec128)); };
    inline SSEVec4 operator==(const SSEVec4& rhs) const { return SSEVec4(_mm_cmpeq_ps(vec128, rhs.vec128)); };

    // bitwise operators
    inline SSEVec4 operator|(const SSEVec4& rhs) const { return SSEVec4(_mm_or_ps(vec128, rhs.vec128)); };
    inline SSEVec4 operator&(const SSEVec4& rhs) const { return SSEVec4(_mm_and_ps(vec128, rhs.vec128)); };
    inline SSEVec4 operator^(const SSEVec4& rhs) const { return SSEVec4(_mm_xor_ps(vec128, rhs.vec128)); };
    inline const SSEVec4& operator|=(const SSEVec4& rhs) { vec128 = _mm_or_ps(vec128, rhs.vec128); return *this; };
    inline const SSEVec4& operator&=(const SSEVec4& rhs) { vec128 = _mm_and_ps(vec128, rhs.vec128); return *this; };

    // for some horrible reason,there's no bitwise not instruction for SSE,
    // so we have to do xor with 0xfffffff in order to fake it.
    // TO get a 0xffffffff, we execute 0=0
    inline SSEVec4 operator~() const
    {
        __m128 zero = _mm_setzero_ps();
        __m128 is_true = _mm_cmpeq_ps(zero, zero);
        return _mm_xor_ps(is_true, vec128);
    };

};

// swizzling macros
#define VEC4_SWIZZLE( vec, x, y, z, w ) SSEVec4( _mm_shuffle_ps( vec.vec128,vec.vec128, _MM_SHUFFLE(x,y,z,w) ) )
#define VEC4_X( vec ) VEC4_SWIZZLE(vec,0,0,0,0)
#define VEC4_Y( vec ) VEC4_SWIZZLE(vec,1,1,1,1)
#define VEC4_Z( vec ) VEC4_SWIZZLE(vec,2,2,2,2)
#define VEC4_W( vec ) VEC4_SWIZZLE(vec,3,3,3,3)

// a shuffling macro.  I don't like Microsoft's, theirs is backwards
#define VEC4_SHUFFLE(x,y,z,w) _MM_SHUFFLE(w,z,y,x)


inline float SSEVec3Dot(const SSEVec4& a, const SSEVec4& b)
{
    SSEVec4 tmp = a * b;
    SSEVec4 sum = VEC4_Y(tmp) + VEC4_Z(tmp);
    sum += tmp;
    float ret;
    _mm_store_ss(&ret, sum);
    return ret;
};


// functions for SQRT, RSQ, RCP, MIN, MAX

inline SSEVec4 SSEVecQuickRCP(const SSEVec4& v) { return SSEVec4(_mm_rcp_ps(v.vec128)); };

// RCP with newton-raphson iteration.  
inline SSEVec4 SSEVecRCP(const SSEVec4& a)
{
    __m128 Ra0 = _mm_rcp_ps(a.vec128);
    return SSEVec4(_mm_sub_ps(_mm_add_ps(Ra0, Ra0), _mm_mul_ps(_mm_mul_ps(Ra0, a.vec128), Ra0)));
};

inline SSEVec4 SSEVecQuickRSQ(const SSEVec4& v)  { return SSEVec4(_mm_rsqrt_ps(v.vec128)); };

// RSQ with newton-raphson iteration.
inline SSEVec4 SSEVecRSQ(const SSEVec4& a)
{
    static const SSEVec4 fvecf0pt5(0.5f);
    static const SSEVec4 fvecf3pt0(3.0f);
    SSEVec4 Ra0 = _mm_rsqrt_ps(a.vec128);
    return (fvecf0pt5 * Ra0) * (fvecf3pt0 - (a  * Ra0) * Ra0);
};

inline float SSEVec3Length(const SSEVec4& value)
{
    float len = SSEVec3Dot(value, value);
    return sqrt(len);
};


inline SSEVec4 SSEVec3Normalize(const SSEVec4& value)
{
    // TODO:  write a FastRSQ scalar function and use that here
    float len = SSEVec3Dot(value, value);
    float lenrsq = 1.0f / sqrt(len) ;
    return value * SSEVec4(lenrsq);
};

inline SSEVec4 SSEVecSQRT(const SSEVec4& v) { return SSEVec4(_mm_sqrt_ps(v.vec128)); };
inline SSEVec4 SSEVecMIN(const SSEVec4& v1, const SSEVec4& v2) { return SSEVec4(_mm_min_ps(v1.vec128, v2.vec128)); };
inline SSEVec4 SSEVecMAX(const SSEVec4& v1, const SSEVec4& v2) { return SSEVec4(_mm_max_ps(v1.vec128, v2.vec128)); };

inline SSEVec4 SSEVecZero() { return _mm_setzero_ps(); };

// comparison functions that return an integer boolean value
// this makes direct use of the corresponding intrinsic and
// allows more efficient branching
// If you dont use these VC++.NET 2K3 will tend to dump the SSE regs
// out to the stack and suck them back in to implement a compare
inline int SSEVecIsXEqual(const SSEVec4& a, const SSEVec4& b)
{
    return _mm_ucomieq_ss(a, b);
};
inline int SSEVecIsXNEqual(const SSEVec4& a, const SSEVec4& b)
{
    return _mm_ucomineq_ss(a, b);
};


// these return true if the corresponding component is 0xffffffff
inline int SSEVecIsXSet(const SSEVec4& vec)
{
    // HACK: -- comparisons dont work right when nans are involved
    // and comparisons also return nan on true.  To fix it, we're turning nan into 1.0f
    // which will work when comparing against zero
    return SSEVecIsXNEqual(vec & SSEVec4(1.0f), SSEVecZero());
};

inline int SSEVecIsYSet(const SSEVec4& vec) { return SSEVecIsXSet(VEC4_Y(vec)); };
inline int SSEVecIsZSet(const SSEVec4& vec) { return SSEVecIsXSet(VEC4_Z(vec)); };
inline int SSEVecIsWSet(const SSEVec4& vec) { return SSEVecIsXSet(VEC4_W(vec)); };


/// returns true if any component of the argument is 0xffffffff
inline int SSEVecIsAnySet(const SSEVec4& states)
{
    SSEVec4 x(VEC4_X(states));
    SSEVec4 y(VEC4_Y(states));
    SSEVec4 z(VEC4_Z(states));
    SSEVec4 w(VEC4_W(states));

    SSEVec4 res = x | y | z | w;

    return SSEVecIsXSet(res);
};


// loading helpers
inline SSEVec4 SSEVecLoadf(float f) { return _mm_load_ss(&f); };
inline SSEVec4 SSEVecLoad2f(const float* f) { return _mm_loadl_pi(SSEVecZero(), (__m64*)f); };
inline SSEVec4 SSEVecLoad3f(const float* f)
{
    // load first two components and zero second two
    SSEVec4 tmp = SSEVecLoad2f((float*)f);

    // load the third
    SSEVec4 tmp2 = SSEVecLoadf(*(f + 2));
    return _mm_shuffle_ps(tmp, tmp2, VEC4_SHUFFLE(0, 1, 0, 1));
};



// storing helpers
inline void SSEVecStore2f(const SSEVec4& vec, float* pOut)
{
    _mm_storel_pi((__m64*)pOut, vec.vec128);
};

inline void SSEVecStore3f(const SSEVec4& vec, float* pOut)
{
    _mm_storel_pi((__m64*)pOut, vec.vec128);
    _mm_store_ss((pOut + 2), VEC4_Z(vec));
};



// executes a conditional move
// target = (condition) ? val : target;
inline SSEVec4 SSEVecSelect(const SSEVec4& condition, const SSEVec4& val, const SSEVec4& target)
{
    SSEVec4 res = SSEVecZero();
    res = res | (val & condition);
    SSEVec4 inv_cond = ~condition;
    res = res | (target & inv_cond);
    return res;

};

// stream output thingie for vectors
inline std::ostream& operator<<(std::ostream& out, const SSEVec4& vec)
{
    out << "<" << vec[0] << "," << vec[1] << "," << vec[2] << "," << vec[3] << ">";
    return out;
};


#endif
