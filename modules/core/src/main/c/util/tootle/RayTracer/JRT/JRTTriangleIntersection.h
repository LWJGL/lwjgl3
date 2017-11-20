/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _JRT_TRIANGLE_INTERSECTION_H_
#define _JRT_TRIANGLE_INTERSECTION_H_

#include "JRTCommon.h"

// Note to self: P4 cache lines: 64 bytes

class JRTMesh;


// JRTCoreTriangle is a struct which stores all of the information needed to perform
// ray-triangle intersection.  Some preprocessing is performed on the triangles to optimize the
// intersection calculation.
struct JRTCoreTriangle
{
    // Nu and Nv are the smaller two components of the normal, divided by
    // the largest component of the normal.  This eliminates some multiplies
    // from the intersection code (Ingo wald thought of this, not me)
    float Nu;
    float Nv;

    // Nd is equal to -d, where d is the D term of the plane equation (ax + by + cz + d = 0)
    float Nd;

    // largest component of normal  0 = x, 1 = y, 2 = z
    // this determines what plane to project into to compute barycentrics
    UINT max_normal_comp;

    JRTMesh* pMesh; // pointer back to the mesh
    UINT nTriIndex; // index of this triangle in the mesh

    // one of the vertices, projected into the 2D plane of choice
    float V0u;
    float V0v;

    // the two vectors from V0 to the other vertices, projected
    // and scaled by 1/E1xE2
    float E1u;
    float E1v;  // first is vector from v0 to v1

    float E2u;  // second is vector from v0 to v2
    float E2v;
};




/**
    This function performs some pre-processing on a triangle to get it read for use by the
    ray-triangle intersector.  This function does all kinds of magical pre-computation which allows
    the actual intersection code to be good and fast.

    The first three arguments are pointers to the vertex positions of the triangle (3-component float arrays).

    The last argument is a pointer to a Preprocessed triangle structure that will be filled with
    the pre-computed triangle information that the intersector uses.
*/
void PreprocessTri(const float* v1, const float* v2, const float* v3, JRTCoreTriangle* triOut1);



/**
    Ray-Triangle Intersection routine:
        Arguments:
            tri - preprocessed triangle to be tested for intersection
            origin - ray origin
            direction - ray direction
            tmin, tmax - t value intervals to test for
            tout - pointer to a variable to receive the t value
                   may NOT be null
            barycentrics - pointer to an array to receive the barycentric coordinates of the hit point,
                           may be NULL

        If there is an intersection with t values ranging between tmin and tmax, then
         *tout and barycentrics are set, and true is returned

        If there is no such intersection, then the values of *tout and barycentrics do not change
          and false is returned
*/
bool RayTriangleIntersect(const JRTCoreTriangle* pTriInfo, const float* origin, const float* direction, float tmin, float tmax, float* tout, float barcentrics_out[3]);






#endif