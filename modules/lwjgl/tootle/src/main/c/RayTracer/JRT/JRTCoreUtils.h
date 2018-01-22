/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _JRT_CORE_UTILS_H_
#define _JRT_CORE_UTILS_H_

enum Axis
{
    X_AXIS = 0,
    Y_AXIS = 1,
    Z_AXIS = 2
};

inline void SWAP(float& a, float& b) { float tmp = a; a = b; b = tmp; };


// macros for projecting points onto axis-aligned planes
#define UCOMP(P, axis)  P[ INDEX1[axis] ]
#define VCOMP(P, axis)  P[ INDEX2[axis] ]
#define WCOMP(P, axis)  P[ axis ];

#define UCOMPINDEX(axis) INDEX1[axis];
#define VCOMPINDEX(axis) INDEX2[axis];
#define WCOMPINDEX(axis) axis;

// these arrays define which coordinates to select when projecting into a plane aligned to a particular axis
extern const int INDEX1[3];
extern const int INDEX2[3];

//
//    TriPlaneTest
//        Returns a value indicating whether a triangle is in front of,
//        behind, or crossing an axis-aligned split plane
//
enum TriPlaneState
{
    IN_FRONT,
    IN_BACK,
    STRADDLE
};

class JRTTriangle;

TriPlaneState TriPlaneTest(const JRTTriangle& tri, Axis split_component, float split_value);

#endif