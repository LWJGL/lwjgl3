/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef COLOR_H
#define COLOR_H

#include "matrix.h"

// shorthand declarations
typedef Matrix<3, 1, float> Color;

inline Color operator*(const Color& u, const Color& v)
{
    return Color(u[0] * v[0], u[1] * v[1], u[2] * v[2]);
}

#endif // COLOR_H
