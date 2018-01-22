/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _FRT_BOUNDING_BOX_H_
#define _FRT_BOUNDING_BOX_H_

#include "JMLSSEVec.h"

typedef SSEVec4 SSEVector;

class JRTBoundingBox
{
public:

    JRTBoundingBox(const float* points, unsigned int num_points);

    JRTBoundingBox(const Vec3f* points, unsigned int num_points);

    JRTBoundingBox(const Vec3f& min = Vec3f(0, 0, 0), const Vec3f& max = Vec3f(1, 1, 1));

    inline const Vec3f& GetMin() const { return m_min; };
    inline const Vec3f& GetMax() const { return m_max; };

    inline Vec3f& GetMin() { return m_min; };
    inline Vec3f& GetMax() { return m_max; };

    Vec3f GetCenter() const { return (m_max + m_min) / 2 ; };

    void Expand(const Vec3f& point);

    bool RayHit(const Vec3f& origin, const Vec3f& endPoint, float* tmin_out, float* tmax_out) const;


    void Split(unsigned int axis, float value, JRTBoundingBox& front, JRTBoundingBox& back) const;


    bool PointInBox(const float origin[3]) const;

    JRTBoundingBox Union(const JRTBoundingBox& rOther) const;

    /// Checks for intersection between this box and another, and optionally returns the intersection
    /// \param rOther
    ///     The other box to test for intersection with
    /// \param pBBOut
    ///     Pointer to receive a bounding box containing the intersection of the two boxes
    /// \return True if the boxes intersect, false if not
    bool Intersection(const JRTBoundingBox& rOther, JRTBoundingBox* pBBOut) const;

    float GetVolume() const;

    float GetSurfaceArea() const;

    bool TriangleIntersect(const Vec3f* pV1, const Vec3f* pV2, const Vec3f* pV3) const;

    bool IsDegenerate() const;

    void GetCorners(Vec3f* pCorners) const;

private:

    Vec3f m_min;
    Vec3f m_max;
};

JRTBoundingBox JRTBBoxUnion(const JRTBoundingBox& rFirst, const JRTBoundingBox& rSecond);
JRTBoundingBox JRTBBoxIntersection(const JRTBoundingBox& rFirst, const JRTBoundingBox& rSecond);
JRTBoundingBox JRTBBoxDifference(const JRTBoundingBox& rFirst, const JRTBoundingBox& rSecond);

#endif