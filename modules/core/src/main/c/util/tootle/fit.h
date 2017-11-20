/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef FIT_H
#define FIT_H

#include "vector.h"

bool
RobustFit(const std::vector<Vector3>& vertex, Vector3* ucenter, float* usize);

bool
BBoxFit(const std::vector<Vector3>& vertex, Vector3* ucenter, float* usize);

bool
BBoxFit(const std::vector<Vector3>& vertex, const int* ind, int iStart, int nTris, Vector3* ucenter, Vector3* udiag, float* usize);

#endif
