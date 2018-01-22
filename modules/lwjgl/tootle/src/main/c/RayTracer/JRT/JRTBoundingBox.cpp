/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include "JRTCommon.h"
#include "JRTBoundingBox.h"
#include <float.h>

JRTBoundingBox::JRTBoundingBox(const float* positions, unsigned int num_points)
{
    m_min = Vec3f(positions[0], positions[1], positions[2]);
    m_max = Vec3f(positions[0], positions[1], positions[2]);

    for (unsigned int i = 1; i < num_points; i++)
    {
        positions += 3;
        Vec3f curr(positions[0], positions[1], positions[2]);
        Expand(curr);
    }
}

JRTBoundingBox::JRTBoundingBox(const Vec3f* positions, unsigned int num_points)
{
    m_min = positions[0];
    m_max = positions[0];

    for (unsigned int i = 1; i < num_points; i++)
    {
        Expand(positions[i]);
    }
}


JRTBoundingBox::JRTBoundingBox(const Vec3f& min, const Vec3f& max)
    : m_min(min), m_max(max)
{

}


void JRTBoundingBox::Expand(const Vec3f& point)
{
    // this is probably slow but I'm too lazy to do it proper
    /*  SSEVec4 mins = SSEVecMIN( SSEVecLoad3f(m_min), SSEVecLoad3f(point) );
      SSEVec4 maxs = SSEVecMAX( SSEVecLoad3f(m_max), SSEVecLoad3f(point) );

      SSEVecStore3f( mins, m_min );
      SSEVecStore3f( maxs, m_max );*/

    for (int i = 0; i < 3; i++)
    {
        m_min[i] = Min(m_min[i], point[i]);
        m_max[i] = Max(m_max[i], point[i]);
    }
}



bool JRTBoundingBox::RayHit(const Vec3f& rOrigin, const Vec3f& rDirection, float* tmin, float* tmax) const
{

    // find t-value of intersection with each BB plane

    // ray-plane intersection for axis-aligned plane is:
    //  (Value - Origin) / Dc  where c is the axis and value is the plane's position on that axis
    //  Note that value is the negative of the D term of the plane eqn.

    SSEVec4 origin = SSEVecLoad3f(rOrigin);
    SSEVec4 direction = SSEVecLoad3f(rDirection);
    SSEVec4 dir_inv = SSEVecRCP(direction);

    // tmins is the intersection tvals for the bounding box 'min' planes
    // tmaxs is the intersection tvals for the bounding box 'max' planes
    SSEVec4 tmins = (SSEVecLoad3f(m_min) - origin) * dir_inv;
    SSEVec4 tmaxs = (SSEVecLoad3f(m_max) - origin) * dir_inv;

    SSEVec4 tminsort = SSEVecMIN(tmins, tmaxs);
    SSEVec4 tmaxsort = SSEVecMAX(tmins, tmaxs);

    *tmin = -FLT_MAX;
    *tmax = FLT_MAX;

    for (int i = 0; i < 3; i++)
    {
        // TODO: this will be slow due to compiler dumping the xmm reg to memory.  FIX it

        // find largest min
        // find the smallest max
        if (direction[i] != 0.0f)
        {
            if (tminsort[i] > *tmin)
            {
                *tmin = tminsort[i];
            }

            if (tmaxsort[i] < *tmax)
            {
                *tmax = tmaxsort[i];
            }
        }
    }

    // do the ranges overlap?
    return *tmin < *tmax;
}



void JRTBoundingBox::Split(unsigned int axis, float value, JRTBoundingBox& front, JRTBoundingBox& back) const
{
    front = *this;
    back = *this;
    front.m_min[axis] = value;
    back.m_max[axis] = value;
}

bool JRTBoundingBox::PointInBox(const float origin[3]) const
{
    /* return (m_min.x < origin[0] && m_min.y < origin[1] && m_min.z < origin[2]) &&
            (m_max.x > origin[0] && m_max.y > origin[1] && m_max.z > origin[2]);*/

    // without short-circuit evaluation, and therefore, without branches
    // just in case the compiler didn't already do it.  Turns out VC++ does
    bool res = (m_min.x < origin[0]);
    res = res && (m_min.y < origin[1]);
    res = res && (m_min.z < origin[2]);
    res = res && (m_max.x > origin[0]);
    res = res && (m_max.y > origin[1]);
    res = res && (m_max.z > origin[2]);
    return res;
}




float JRTBoundingBox::GetVolume() const
{
    Vec3f diff = m_max - m_min;
    return diff.x * diff.y * diff.z;
}


float JRTBoundingBox::GetSurfaceArea() const
{
    Vec3f diff = m_max - m_min;
    float area = (2.0f * diff.x * diff.y) + (2.0f * diff.x * diff.z) + 2.0f * (diff.y * diff.z);
    JRT_ASSERT(area >= 0.0f);
    return area;
}

//=================================================================================================================================
/// Given a point and a plane equation, compute the side of where the point lies (1 if it is the same side as the normal,
///  -1 if it is not the same side, and 0 if the point lies on the plane).
///
/// \param plane      The plane equation.
/// \param rPoint     The point.
///
/// \return 1 if the point lies on the same side of the normal, -1 if it is not the same side, 0 if the point lies on the plane
//=================================================================================================================================
static const int GetWhichSide(const float plane[4], const Vec3f& rPoint)
{
    float fDistance = plane[0] * rPoint[0] + plane[1] * rPoint[1] +
                      plane[2] * rPoint[2] - plane[3];

    if (fDistance < 0.0f)
    {
        return -1;
    }

    if (fDistance > 0.0f)
    {
        return 1;
    }

    return 0;
}

//=================================================================================================================================
/// Construct a plane equation (Ax+By+Cz-D=0) from three points.
///
/// \param rPoint0    The first point.
/// \param rPoint1    The second point.
/// \param rPoint2    The third point.
//=================================================================================================================================
static void ConstructPlane(const Vec3f& rPoint0, const Vec3f& rPoint1, const Vec3f& rPoint2, float fPlane[4])
{
    Vec3f vEdge0 = rPoint1 - rPoint0;
    Vec3f vEdge1 = rPoint2 - rPoint1;

    Vec3f vNormal = Normalize(Cross(vEdge0, vEdge1));
    fPlane[ 0 ] = vNormal[ 0 ];
    fPlane[ 1 ] = vNormal[ 1 ];
    fPlane[ 2 ] = vNormal[ 2 ];
    fPlane[ 3 ] = DotProduct(vNormal, rPoint0);
}

//=================================================================================================================================
/// Intersection test between a triangle and an axis-aligned box.  It was based on a paper
///  from http://fileadmin.cs.lth.se/cs/Personal/Tomas_Akenine-Moller/pubs/tribox.pdf.
///
/// \param pV1        First vertex of the triangle
/// \param pV2        Second vertex of the triangle
/// \param pV3        Third vertex of the triangle
///
/// \return true if the triangle intersects the box, false otherwise
//=================================================================================================================================
bool JRTBoundingBox::TriangleIntersect(const Vec3f* pV1, const Vec3f* pV2, const Vec3f* pV3) const
{
    assert(pV1);
    assert(pV2);
    assert(pV3);

    const Vec3f& rBoxMin = GetMin();
    const Vec3f& rBoxMax = GetMax();

    //------------------------------------------------------------
    // trivial reject case 1 -- triangle verts against BB planes
    //------------------------------------------------------------
    if ((pV1->x < rBoxMin.x && pV2->x < rBoxMin.x && pV3->x < rBoxMin.x) ||
        (pV1->x > rBoxMax.x && pV2->x > rBoxMax.x && pV3->x > rBoxMax.x) ||
        (pV1->y < rBoxMin.y && pV2->y < rBoxMin.y && pV3->y < rBoxMin.y) ||
        (pV1->y > rBoxMax.y && pV2->y > rBoxMax.y && pV3->y > rBoxMax.y) ||
        (pV1->z < rBoxMin.z && pV2->z < rBoxMin.z && pV3->z < rBoxMin.z) ||
        (pV1->z > rBoxMax.z && pV2->z > rBoxMax.z && pV3->z > rBoxMax.z))
    {
        return false;
    }

    //-------------------------------------------------------------
    // trivial reject case 2 -- BBox verts against triangle plane
    //-------------------------------------------------------------
    // we only need to test one bbox diagonal against a particular plane
    // choose box diagonal that is most closely aligned to normal
    Vec3f vMin, vMax;
    float triPlane[4];

    ConstructPlane(*pV1, *pV2, *pV3, triPlane);

    if (triPlane[ 0 ] > 0.0f)
    {
        vMin.x = rBoxMin.x;
        vMax.x = rBoxMax.x;
    }
    else
    {
        vMin.x = rBoxMax.x;
        vMax.x = rBoxMin.x;
    }

    if (triPlane[ 1 ] > 0.0f)
    {
        vMin.y = rBoxMin.y;
        vMax.y = rBoxMax.y;
    }
    else
    {
        vMin.y = rBoxMax.y;
        vMax.y = rBoxMin.y;
    }

    if (triPlane[ 2 ] > 0.0f)
    {
        vMin.z = rBoxMin.z;
        vMax.z = rBoxMax.z;
    }
    else
    {
        vMin.z = rBoxMax.z;
        vMax.z = rBoxMin.z;
    }

    if (GetWhichSide(triPlane, vMin) == GetWhichSide(triPlane, vMax))
    {
        return false;
    }

    //------------------------------------------------------------------------
    // (not-so) trivial reject case 3 -- separating axes
    //------------------------------------------------------------------------
    // see: http://fileadmin.cs.lth.se/cs/Personal/Tomas_Akenine-Moller/pubs/tribox.pdf
    // this implementation is not very efficient, but it's more compact and easier to follow, IMO
    //
    // There are lots of speed gains to be had by exploiting the fact that the bounding box faces are all unit vectors
    //  lots of computation just drops right out

    // translate triangle so its relative to BBox center
    Vec3f vBoxCenter = rBoxMin + ((rBoxMax - rBoxMin) * 0.5f);
    Vec3f vVertices[3];
    vVertices[ 0 ].x = pV1->x - vBoxCenter.x;
    vVertices[ 0 ].y = pV1->y - vBoxCenter.y;
    vVertices[ 0 ].z = pV1->z - vBoxCenter.z;

    vVertices[ 1 ].x = pV2->x - vBoxCenter.x;
    vVertices[ 1 ].y = pV2->y - vBoxCenter.y;
    vVertices[ 1 ].z = pV2->z - vBoxCenter.z;

    vVertices[ 2 ].x = pV3->x - vBoxCenter.x;
    vVertices[ 2 ].y = pV3->y - vBoxCenter.y;
    vVertices[ 2 ].z = pV3->z - vBoxCenter.z;

    // compute resulting triangle edges
    Vec3f vEdges[3] = { vVertices[ 1 ] - vVertices[ 0 ],
                        vVertices[ 2 ] - vVertices[ 1 ],
                        vVertices[ 0 ] - vVertices[ 2 ]
                      };

    // compute bounding box half-lengths
    float fBoxHalfLengths[3] = { (rBoxMax.x - rBoxMin.x) * 0.5f,
                                 (rBoxMax.y - rBoxMin.y) * 0.5f,
                                 (rBoxMax.z - rBoxMin.z) * 0.5f
                               };

    static const Vec3f vBBFaceNormals[ 3 ] = { Vec3f(1, 0, 0),
                                               Vec3f(0, 1, 0),
                                               Vec3f(0, 0, 1)
                                             };

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            // choose a separating axis
            Vec3f vAxis = Cross(vEdges[ j ], vBBFaceNormals[ i ]);

            // project triangle vertices onto axis (relative to box center)
            float fP0 = DotProduct(vAxis, vVertices[ 0 ]);
            float fP1 = DotProduct(vAxis, vVertices[ 1 ]);
            float fP2 = DotProduct(vAxis, vVertices[ 2 ]);

            // compute extents of projected triangle
            float fPMin = std::min(fP0, std::min(fP1, fP2));
            float fPMax = std::max(fP0, std::max(fP1, fP2));

            // compute size of projected box
            float fBoxRadius = 0.0f;

            for (int k = 0; k < 3; k++)
            {
                fBoxRadius += fBoxHalfLengths[ k ] * fabs(vAxis[ k ]);
            }

            if (fPMin > fBoxRadius || fPMax < -fBoxRadius)
            {
                return false;
            }
        }
    }

    return true;
}

bool JRTBoundingBox::IsDegenerate() const
{
    return m_min.x == m_max.x || m_min.y == m_max.y || m_min.z == m_max.z ;
}





JRTBoundingBox JRTBBoxUnion(const JRTBoundingBox& rOne, const JRTBoundingBox& rOther)
{
    JRTBoundingBox ret(rOne);
    ret.Expand(rOther.GetMin());
    ret.Expand(rOther.GetMax());
    return ret;
}


JRTBoundingBox JRTBBoxIntersection(const JRTBoundingBox& rOne, const JRTBoundingBox& rOther)
{
    Vec3f intersectMin = Max3f(rOne.GetMin(), rOther.GetMin());
    Vec3f intersectMax = Min3f(rOne.GetMax(), rOther.GetMax());
    return JRTBoundingBox(intersectMin, intersectMax);
}

void JRTBoundingBox::GetCorners(Vec3f* pCorners) const
{
    Vec3f delta = m_max - m_min;
    Vec3f dx = Vec3f(delta.x, 0, 0);
    Vec3f dy = Vec3f(0, delta.y, 0);
    Vec3f dz = Vec3f(0, 0, delta.z);

    pCorners[0] = m_min;
    pCorners[1] = m_min + dx;
    pCorners[2] = m_min + dx + dz;
    pCorners[3] = m_min + dz;
    pCorners[4] = m_min + dy;
    pCorners[5] = pCorners[1] + dy;
    pCorners[6] = pCorners[2] + dy;
    pCorners[7] = pCorners[3] + dy;
}