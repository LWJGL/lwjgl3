/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _JML_VEC3_H_
#define _JML_VEC3_H_


namespace JML
{
/// \brief A template class for two-component vectors.
/**
    The template argument must be a numeric type
*/
template<class T>
class Vec3
{
public:

    T x;
    T y;
    T z;

    // *****************************************
    //     Constructors
    // *****************************************

    /// Default constructor
    Vec3() : x((T)0), y((T)0), z((T)0) {};

    /// Value constructor
    Vec3(const T& vx, const T& vy, const T& vz) : x(vx), y(vy), z(vz) {};

    /// Copy constructor
    Vec3(const Vec3<T>& val) : x(val.x), y(val.y), z(val.z) {};

    /// Single value constructor.  Sets all components to the given value
    Vec3(const T& v) : x(v), y(v), z(v) {};

    /// Array constructor.  Assumes a 3-component array
    Vec3(const T* v) : x(v[0]), y(v[1]), z(v[2]) {};

    // *****************************************
    //     Conversions/Assignment/Indexing
    // *****************************************

    /// cast to T*
    operator const T* () const { return (const T*)this; };

    /// cast to T*
    operator T* () { return (T*)this; };

    /// Assignment
    const Vec3<T>& operator=(const Vec3<T>& rhs)  { x = rhs.x; y = rhs.y; z = rhs.z; return *this; };

    // *****************************************
    //    Comparison
    // *****************************************

    /// Equality comparison
    bool operator==(const Vec3<T>& rhs) const { return (x == rhs.x && y == rhs.y && z == rhs.z); };

    /// Inequality comparision
    bool operator!=(const Vec3<T>& rhs) const { return (x != rhs.x || y != rhs.y || z != rhs.z); };

    // *****************************************
    //    Arithmetic
    // *****************************************

    /// Addition
    const Vec3<T> operator+(const Vec3<T>& rhs) const { return Vec3<T>(x + rhs.x, y + rhs.y, z + rhs.z); };

    /// Subtraction
    const Vec3<T> operator-(const Vec3<T>& rhs) const { return Vec3<T>(x - rhs.x, y - rhs.y, z - rhs.z);};

    /// Multiply by scalar
    const Vec3<T> operator*(const T& v) const { return Vec3<T>(x * v, y * v, z * v); };

    /// Divide by scalar
    const Vec3<T> operator/(const T& v) const { return Vec3<T>(x / v, y / v, z / v); };

    /// Divide by vector
    const Vec3<T> operator/(const Vec3<T>& rhs) const { return Vec3<T>(x / rhs.x, y / rhs.y, z / rhs.z); };

    /// Addition in-place
    Vec3<T>& operator+= (const Vec3<T>& rhs) { x += rhs.x; y += rhs.y; z += rhs.z; return *this; };

    /// Subtract in-place
    Vec3<T>& operator-= (const Vec3<T>& rhs) { x -= rhs.x; y -= rhs.y; z -= rhs.z; return *this; };

    /// Scalar multiply in-place
    Vec3<T>& operator*= (const T& v) { x *= v; y *= v; z *= v; return *this; };

    /// Scalar divide in-place
    Vec3<T>& operator/= (const T& v) { x /= v; y /= v; z /= v; return *this; };
};

/// stream output
template <class T>
std::ostream& operator<<(std::ostream& sout, const Vec3<T>& vec)
{
    sout << "<" << vec.x << "," << vec.y << "," << vec.z << ">";
    return sout;
};

typedef Vec3<float>  Vec3f;
typedef Vec3<double> Vec3d;
typedef Vec3<int>    Vec3i;

};

#endif