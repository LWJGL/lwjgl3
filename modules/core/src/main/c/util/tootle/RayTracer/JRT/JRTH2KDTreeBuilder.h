/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _JRT_H2_KDTREE_BUILDER_H_
#define _JRT_H2_KDTREE_BUILDER_H_

#include "JRTCoreUtils.h"
#include "JRTKDTreeBuilder.h"

/// The H2 KDTree builder is a simplified heuristic tree builder
///  The algorithm works thusly:
///     - for each axis
///         - Start at spatial median, classify polys
///         - If all polys on one side, shift split plane
///         - Choose axis with lowest spatial median cost (using SAH)

class JRTH2KDTreeBuilder : public JRTKDTreeBuilder
{
public:

    void BuildTreeImpl(const JRTBoundingBox& rBounds,
                       const std::vector<const JRTTriangle*>& rTris,
                       std::vector<JRTKDNode>& rNodesOut,
                       std::vector<UINT>& rTriIndicesOut);

private:

    struct SplitInfo
    {
        Axis eAxis;
        float fHeuristicValue; ///< Estimated cost of this split.  If 0, it means do not split
        float fPosition;
        std::vector<UINT> TrisFront;
        std::vector<UINT> TrisBack;
    };

    void MakeLeaf(JRTKDNode* pNode,
                  const std::vector<UINT>& rTrisThisNode,
                  std::vector<JRTKDNode>& rNodesOut,
                  std::vector<UINT>& rTriIndicesOut);

    void DoBuildTree(UINT nMaxDepth,
                     JRTKDNode* pNode,
                     const JRTBoundingBox& rBounds,
                     const std::vector<const JRTTriangle*>& rTris,
                     std::vector<UINT>& rTrisThisNode,
                     std::vector<JRTKDNode>& rNodesOut,
                     std::vector<UINT>& rTriIndicesOut);


    void FindBestSplit(Axis eAxis,
                       const JRTBoundingBox& rBounds,
                       const std::vector<const JRTTriangle*>& rTris,
                       const std::vector<UINT>& rTrisThisNode,
                       SplitInfo* pSplitOut);

    void ClassifyTris(Axis eAxis,
                      float fPosition,
                      std::vector<UINT>& rTrisBack,
                      std::vector<UINT>& rTrisFront,
                      UINT& nStraddle,
                      float& fTriMin,
                      float& fTriMax,
                      const std::vector<UINT>& rTrisThisNode);

    float CostFunction(const JRTBoundingBox& rBounds, SplitInfo* pSlitOut);

    // triangle bounding boxes,used to speed classification
    // these are arranged by axis so that they'll cache better
    typedef std::pair<float, float> FloatPair;
    std::vector<FloatPair> m_BBX;
    std::vector<FloatPair> m_BBY;
    std::vector<FloatPair> m_BBZ;
};




#endif