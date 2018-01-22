/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include "JRTCommon.h"
#include "JRTCoreUtils.h"
#include "JRTMesh.h"


// These arrays are used to implement the UCOMP, VCOMP, WCOMP macros

// coordinate to drop:   X  Y  Z
const int INDEX1[3] = { 1, 0, 0 };  // projection coord 1
const int INDEX2[3] = { 2, 2, 1 };  // projection coord 2
//     projection plane:       YZ XZ XY

TriPlaneState TriPlaneTest(const JRTTriangle& tri, Axis split_component, float split_value)
{
    bool front = false, back = false;

    if (tri.GetV1()[split_component] < split_value)
    {
        back = true;
    }
    else
    {
        front = true;
    }

    if (tri.GetV2()[split_component] < split_value)
    {
        back = true;
    }
    else
    {
        front = true;
    }

    if (tri.GetV3()[split_component] < split_value)
    {
        back = true;
    }
    else
    {
        front = true;
    }


    if (front && back)
    {
        return STRADDLE;
    }
    else if (front)
    {
        return IN_FRONT;
    }
    else
    {
        return IN_BACK;
    }
}