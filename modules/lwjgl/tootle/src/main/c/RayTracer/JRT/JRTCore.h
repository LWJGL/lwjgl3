/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _JRT_CORE_H_
#define _JRT_CORE_H_

#include "JRTCommon.h"
#include "JRTTriangleIntersection.h"

struct JRTHitInfo
{
    // the triangle that was hit
    const JRTMesh* pMesh;
    UINT nIndex;

    Vec3f mPosition;
    Vec3f mNormal;
};

struct TootleRayHit
{
    float t;
    UINT nFaceID;
};

class JRTCSGNode;
class JRTMesh;
class JRTKDTree;
class JRTBoundingBox;

class JRTCore
{
public:

    static JRTCore* Build(const std::vector<JRTMesh*>& rPrims);

    ~JRTCore();

    bool FindAllHits(const Vec3f& rOrigin, const Vec3f& rDirection, TootleRayHit** ppHitArray, UINT* pnHits);

    void CullBackfaces(const Vec3f& rViewDir, bool bCullCCW);

    /// Locates the position at which the given ray hits the scene bounding box.
    /// Returns false if the ray misses the bounding box
    bool GetSceneBBHit(const Vec3f& rOrigin, const Vec3f& rDirection, Vec3f* pHitPt);

    const JRTBoundingBox& GetSceneBB() const ;

private:

    JRTCore();

    TootleRayHit* m_pHitArray;
    UINT          m_nArraySize;

    JRTKDTree* m_pTree;
};

#endif