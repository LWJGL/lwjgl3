/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include "JRTCommon.h"
#include "JRTKDTree.h"
#include "JRTBoundingBox.h"
#include "JRTMesh.h"
#include "JRTHeuristicKDTreeBuilder.h"
#include "JRTCoreUtils.h"

#include <algorithm>


/// Cost of an intersection test relative to a node visit
static const float INTERSECT_COST = 1.;


typedef JRTHeuristicKDTreeBuilder::Split Split;
typedef JRTHeuristicKDTreeBuilder::TriangleBB TriangleBB;
typedef JRTHeuristicKDTreeBuilder::SplitVec SplitVec;

/// This function is simply a predicate used with std::sort
bool SplitLess(const Split& s1, const Split& s2)
{
    // if we have a degenerate bounding box, force splits to be ordered min, then max
    if (s1.value == s2.value && s1.nTriBB == s2.nTriBB)
    {
        return (!s1.bMaxSplit && s2.bMaxSplit);
    }
    else
    {
        return s1.value < s2.value;
    }
}


bool BBLessX(const TriangleBB* bb1, const TriangleBB* bb2)
{
    return bb1->box.GetMin().x < bb2->box.GetMin().x;
}

bool BBLessY(const TriangleBB* bb1, const TriangleBB* bb2)
{
    return bb1->box.GetMin().y < bb2->box.GetMin().y;
}

bool BBLessZ(const TriangleBB* bb1, const TriangleBB* bb2)
{
    return bb1->box.GetMin().z < bb2->box.GetMin().z;
}


void SortBBs(UINT eAxis, std::vector<TriangleBB*>& rBBs)
{
    // sort BBs along the axis
    switch (eAxis)
    {
        case X_AXIS: std::sort(rBBs.begin(), rBBs.end(), BBLessX); break;

        case Y_AXIS: std::sort(rBBs.begin(), rBBs.end(), BBLessY); break;

        case Z_AXIS: std::sort(rBBs.begin(), rBBs.end(), BBLessZ); break;
    }
}


void JRTHeuristicKDTreeBuilder::ExtractSplits(UINT eAxis, const std::vector<TriangleBB>& rBBs, std::vector<Split>& rSplits, const JRTBoundingBox& rSceneBounds)
{
    //rSplits.reserve( 2*rBBs.size() );
    // assumes BBs are sorted by this axis

    Vec3f sceneSize = rSceneBounds.GetMax() - rSceneBounds.GetMin();

    srand(0);

    // collect the splits into seperate min and max face arrays
    for (UINT i = 0; i < rBBs.size(); i++)
    {

        /* if( rBBs[i].pTri->GetMesh()->GetTriangleCount() > 120 )
         {
             if( i%2 == 0 )
                 continue;
         }*/


        Split minSplit;
        minSplit.value = rBBs[i].box.GetMin()[eAxis];
        minSplit.bMaxSplit = false;
        minSplit.nTriBB = i;
        rSplits.push_back(minSplit);

        Split maxSplit;
        maxSplit.value = rBBs[i].box.GetMax()[eAxis];
        maxSplit.bMaxSplit = true;
        maxSplit.nTriBB = i;
        rSplits.push_back(maxSplit);
    }

    // now sort them
    std::sort(rSplits.begin(), rSplits.end(), SplitLess);
}


void BuildBBs(const std::vector<const JRTTriangle*>& rTris, std::vector<TriangleBB>& rBBs)
{


    for (UINT i = 0; i < rTris.size(); i++)
    {
        TriangleBB curr;
        curr.pTri = rTris[i];

        Vec3f verts[3];
        verts[0] = rTris[i]->GetV1();
        verts[1] = rTris[i]->GetV2();
        verts[2] = rTris[i]->GetV3();
        curr.box = JRTBoundingBox((const float*)&verts[0], 3);
        curr.nIndex = i;

        rBBs.push_back(curr);
    }
}


void PartitionBBs(UINT eAxis,
                  float fPosition,
                  const std::vector<TriangleBB*>& rBBs,
                  std::vector<TriangleBB*>& rBack,
                  std::vector<TriangleBB*>& rFront)
{
    rBack.reserve(rBBs.size());
    rFront.reserve(rBBs.size());

    for (UINT i = 0; i < rBBs.size(); i++)
    {
        if (rBBs[i]->box.GetMin()[eAxis] >= fPosition)
        {
            // its in front
            rFront.push_back(rBBs[i]);
        }
        else if (rBBs[i]->box.GetMax()[eAxis] < fPosition)
        {
            // its in back
            rBack.push_back(rBBs[i]);
        }
        else
        {
            // it straddles
            rFront.push_back(rBBs[i]);
            rBack.push_back(rBBs[i]);
        }
    }
}



void PartitionSplits(float /*fValue*/, UINT /*eAxis*/,  const SplitVec& rSplits, const std::vector<TriangleBB>& rBBs, SplitVec& rBack, SplitVec& rFront)
{
    rFront.reserve(rSplits.size());
    rBack.reserve(rSplits.size());

    for (UINT i = 0; i < rSplits.size(); i++)
    {
        switch (rBBs[rSplits[i]->nTriBB].planeState)
        {
            case IN_FRONT:
                // its in front
                rFront.push_back(rSplits[i]);
                break;

            case IN_BACK:
                // its in back
                rBack.push_back(rSplits[i]);
                break;

            default: // STRADDLE
                // it straddles
                rFront.push_back(rSplits[i]);
                rBack.push_back(rSplits[i]);
        }

    }
}


void JRTHeuristicKDTreeBuilder::LocateBestSplit(float /*fNodeBBInvArea*/, const JRTBoundingBox& rNodeBounds, const SplitVec splits[3], UINT axis, UINT nTriCount, float& fBestCost, bool& bSplit, UINT& eSplitAxis, float& fSplitValue)
{
    JRTBoundingBox frontBounds = rNodeBounds, backBounds = rNodeBounds;

    // std::ofstream foo("foo.csv");

    const SplitVec& rSplitVec = splits[axis];
    float fNodeMin = rNodeBounds.GetMin()[axis];
    float fNodeMax = rNodeBounds.GetMax()[axis];
    UINT nSplits = (UINT)rSplitVec.size();

    if (nSplits == 0)
    {
        bSplit = false;
        eSplitAxis = X_AXIS;
        return;
    }

    // find the best split along the current axis
    // to do this, we sweep the bounding box planes in left-to-right order
    // - for each 'opening' plane, we compute the cost, and then increment the # of triangles
    //     on the 'behind' side of the plane (since the triangle will be behind all subsequent planes)
    //  For each 'closing' plane, we decrement the number of tris in front before computing the cost
    UINT nTrisBehind = 0;
    UINT nTrisInFront = nTriCount;
    UINT i = 0;

    // advance forwards past any splits which are before the bounding box start
    i = 0;

    while (i < nSplits && rSplitVec[i]->value <= fNodeMin)
    {
        if (rSplitVec[i]->bMaxSplit)
        {
            nTrisInFront--;
        }
        else
        {
            nTrisBehind++;
        }

        i++;
    }

    // figure out which split to stop at, start at the end and go backwards
    while (nSplits > 0 && rSplitVec[nSplits - 1]->value >= fNodeMax)
    {
        nSplits--;
    }

    // precompute some stuff that we'll use to compute surface areas
    Vec3f bbSize = rNodeBounds.GetMax() - rNodeBounds.GetMin();

    float bbSizeU = UCOMP(bbSize, axis);
    float bbSizeV = VCOMP(bbSize, axis);

    float sa_const = bbSizeU * bbSizeV;

    // surface area of root bounding box.  we omit the multiplies by two since they cancel out
    float farea = bbSizeU * bbSizeV + bbSize[axis] * bbSizeU + bbSize[axis] * bbSizeV;

    // pre-compute the divide
    if (farea == 0.0f)
    {
        farea = 0.00000001f;
    }

    farea = 1.0f / farea;

    bool bHaveSplit = false;

    // iterate over all of the splits that lie inside the node bounding box
    for (i = i; i < nSplits; i++)
    {
        Split* localSplit = rSplitVec[i];

        nTrisInFront -= (localSplit->bMaxSplit) ? 1 : 0;
        nTrisBehind += (localSplit->bMaxSplit) ? 0 : 1;

        // evaluate the cost of this split using the surface area heuristic
        
        // compute surface area for each side of the box.  Note that we deliberately leave
        // off the multiply by two since it cancels out
        float back_area = sa_const + (bbSizeU + bbSizeV) * (localSplit->value - fNodeMin);
        float front_area = sa_const + (bbSizeU + bbSizeV) * (fNodeMax - localSplit->value);
        float cost = 1.0f + INTERSECT_COST * farea * ((back_area * nTrisBehind) + (front_area * nTrisInFront));

        if (cost < fBestCost)
        {
            fBestCost = cost;
            fSplitValue = localSplit->value;
            bHaveSplit = true;
            JRT_ASSERT(fSplitValue >= rNodeBounds.GetMin()[axis] &&
                       fSplitValue <= rNodeBounds.GetMax()[axis]);
        }

    }

    if (bHaveSplit)
    {
        bSplit = true;
        eSplitAxis = (Axis)axis;
    }

    //foo.close();
}


void JRTHeuristicKDTreeBuilder::ClassifyBBs(JRTHeuristicKDTreeBuilder::SplitVec& rSplits, std::vector<TriangleBB>& rBBs, UINT eAxis, float fValue)
{
    for (UINT i = 0; i < rSplits.size(); i++)
    {
        // classify only on max-splits for efficiency
        if (rSplits[i]->bMaxSplit)
        {
            TriangleBB* pBB = & rBBs[ rSplits[i]->nTriBB ];

            if (pBB->box.GetMin()[eAxis] >= fValue)
            {
                // its in front
                pBB->planeState = IN_FRONT;
            }
            else if (pBB->box.GetMax()[eAxis] < fValue)
            {
                // its in back
                pBB->planeState = IN_BACK;
            }
            else
            {
                // it straddles
                pBB->planeState = STRADDLE;
            }
        }
    }
}


void JRTHeuristicKDTreeBuilder::BuildTreeRecursive(UINT nDepthLimit,
                                                   const JRTBoundingBox& rNodeBounds,
                                                   SplitVec splits[3],
                                                   std::vector<TriangleBB*>& rBBsThisNode,
                                                   JRTKDNode* pNode,
                                                   std::vector<JRTKDNode>& rNodesOut,
                                                   std::vector<UINT>& rTrisOut)
{
    UINT nTriCount = (UINT)rBBsThisNode.size();

    JRT_ASSERT(splits[0].size() == splits[1].size() && splits[1].size() == splits[2].size());

    // initialize best cost to cost of not splitting
    float fBestCost = INTERSECT_COST * nTriCount;

    // find the optimal split
    bool bSplit = false;
    float fSplitValue;
    UINT eSplitAxis = X_AXIS;


    float fNodeBBInvArea = 1.0f / Max(0.0000001f, rNodeBounds.GetSurfaceArea());

    for (UINT axis = X_AXIS; axis <= Z_AXIS; axis++)
    {
        LocateBestSplit(fNodeBBInvArea, rNodeBounds, splits, axis, nTriCount, fBestCost, bSplit, eSplitAxis, fSplitValue);
    }


    if (!bSplit || nDepthLimit == 0)
    {
        // we either don't want to split, or can't split, so make a leaf
        pNode->leaf.is_leaf = true;
        pNode->leaf.triangle_count = 0;
        pNode->leaf.triangle_start = (UINT)rTrisOut.size();

        for (UINT i = 0; i < rBBsThisNode.size(); i++)
        {
            // do robust tri-box clipping at the leaves
            const Vec3f* pV1 = &rBBsThisNode[i]->pTri->GetV1();
            const Vec3f* pV2 = &rBBsThisNode[i]->pTri->GetV2();
            const Vec3f* pV3 = &rBBsThisNode[i]->pTri->GetV3();

            if (rNodeBounds.TriangleIntersect(pV1, pV2, pV3))
            {
                rTrisOut.push_back(rBBsThisNode[i]->nIndex);
                pNode->leaf.triangle_count++;
            }
        }
    }
    else
    {
        // make a non-leaf

        pNode->inner.axis = eSplitAxis;
        pNode->inner.is_leaf = false;
        pNode->inner.position = fSplitValue;

        JRT_ASSERT(fSplitValue > rNodeBounds.GetMin()[eSplitAxis] &&
                   fSplitValue < rNodeBounds.GetMax()[eSplitAxis]);

        ClassifyBBs(splits[0], m_bbs, eSplitAxis, fSplitValue);

        // partition the splits
        SplitVec frontSplits[3];
        SplitVec backSplits[3];

        for (int j = X_AXIS; j <= Z_AXIS; j++)
        {
            PartitionSplits(fSplitValue, eSplitAxis, splits[j], m_bbs, backSplits[j], frontSplits[j]);

            // clear old split vec to save memory
            splits[j].clear();
        }

        // partition BBs
        std::vector<TriangleBB*> backBBs;
        std::vector<TriangleBB*> frontBBs;
        PartitionBBs(eSplitAxis, fSplitValue, rBBsThisNode, backBBs, frontBBs);

        rBBsThisNode.clear(); // save memory

        // create new nodes
        // by convention, always create front child right before back child
        pNode->inner.front_offset = (UINT)rNodesOut.size();
        UINT nFront = (UINT)rNodesOut.size();
        UINT nBack = nFront + 1;
        rNodesOut.push_back(JRTKDNode());
        rNodesOut.push_back(JRTKDNode());

        // split the node bounding box
        JRTBoundingBox front_bounds, back_bounds;
        rNodeBounds.Split(eSplitAxis, fSplitValue, front_bounds, back_bounds);

        // recursively build the subtrees
        BuildTreeRecursive(nDepthLimit - 1, front_bounds, frontSplits, frontBBs,  &rNodesOut[ nFront ], rNodesOut, rTrisOut);
        BuildTreeRecursive(nDepthLimit - 1, back_bounds,  backSplits,  backBBs, &rNodesOut[ nBack ], rNodesOut, rTrisOut);
    }
}




void JRTHeuristicKDTreeBuilder::BuildTreeImpl(const JRTBoundingBox& rBounds,
                                              const std::vector<const JRTTriangle*>& rTris,
                                              std::vector<JRTKDNode>& rNodesOut,
                                              std::vector<UINT>&      rTrisOut)
{

    rNodesOut.push_back(JRTKDNode());        // create root node

    // extract triangle BBs
    BuildBBs(rTris, m_bbs);

    // extract split planes
    std::vector<Split> splits[3];

    for (int i = 0; i < 3; i++)
    {
        ExtractSplits(i, m_bbs, splits[i], rBounds);
    }

    // build vectors of pointers to these split planes for shuffling around
    SplitVec splitPtrs[3];

    for (int i = 0; i < 3; i++)
    {
        splitPtrs[i].resize(splits[i].size());

        for (int j = 0; j < (int)splits[i].size(); j++)
        {
            splitPtrs[i][j] = &splits[i][j];
        }
    }

    // build vectors of pointers to BBs, also for shuffling around
    std::vector<TriangleBB*> bbPtrs;

    for (int i = 0; i < (int)m_bbs.size(); i++)
    {
        bbPtrs.push_back(&m_bbs[i]);
    }

    BuildTreeRecursive(JRTKDTree::MAX_TREE_DEPTH, rBounds,  splitPtrs, bbPtrs,  &rNodesOut[0], rNodesOut, rTrisOut);



}

