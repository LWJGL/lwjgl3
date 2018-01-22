/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include "JRTCommon.h"
#include "JRTKDTree.h"
#include "JRTMesh.h"


const UINT JRTKDTree::MAX_TREE_DEPTH = 28;

JRTKDTree::JRTKDTree() : m_treeBounds(Vec3f(0, 0, 0), Vec3f(0, 0, 0)),
    m_pIndexArray(NULL), m_nIndexCount(0), m_nTriangleCount(0), m_pNodeArray(0), m_pTriArray(0), m_pMailboxes(0), m_bBackFacing(0)
{

}

JRTKDTree::~JRTKDTree()
{
    if (m_pNodeArray)
    {
        _aligned_free(m_pNodeArray);
    }

    if (m_pTriArray)
    {
        _aligned_free(m_pTriArray);
    }

    delete[] m_pMailboxes;
    delete[] m_pIndexArray;
    delete[] m_bBackFacing;
}

/// \param rOrigin  Ray origin
/// \param rDirection   Ray direction
/// \param pHit     Pointer to a hit info structure that will be set if the ray hits something
/// \param pExcludeMesh
///     Mesh containing the 'exclude' triangle
/// \param nExcludeTri
///     Index of the 'exclude' triangle within pExcludeMesh.  The 'exclude' triangle is
///     ignored during ray traversal to avoid artifacts such as shadow acne, as well as for efficiency
/// \param pNodeStateArray
///     An array of booleans which is used to track CSG node status.  The CSG algorithm requires
///     that we know, at all times during traversal, whether the ray is inside or outside each individual CSG node
///     This array is indexed by CSG node ID.  It should be initialized for the ray origin in advance

bool JRTKDTree::FindFirstHit(const Vec3f& rOrigin, const Vec3f& rDirection, JRTHitInfo* pHit, const JRTMesh* pExcludeMesh, UINT nExcludeTri, bool* /*pNodeStateArray*/)
{

    pHit->pMesh = NULL;
    pHit->nIndex = 0;

    // bounding box test to determine ray traversal ranges, and handle trivial rejections
    float tmin, tmax;

    if (!m_treeBounds.RayHit(rOrigin, rDirection, &tmin, &tmax))
    {
        return false;
    }

    if (tmax <= 0)
    {
        return false;
    }

    if (tmin < 0)
    {
        tmin = 0;
    }

    const float EPSILON = 0.00001f;
    tmax += EPSILON;

    // assign a new ID to this ray
    UINT nRayID = m_nNextRayID;
    m_nNextRayID++;

    if (m_nNextRayID == 0)
    {
        // handle overflow.  The mailboxes are initialized to 0, so to be fully correct
        // we can't have any mailboxes have ID 0
        m_nNextRayID = 1;
    }


    float t_CurrentHit = tmax;
    bool have_hit = false;

    // compute ray direction inverse here to avoid a divide during traversal
    Vec3f inv_direction = Vec3f(1.0f / rDirection.x, 1.0f / rDirection.y, 1.0f / rDirection.z);

    static float barycentrics[3];

    // rather than using recursion, we're using iteration and handling the stack ourselves
    static float   tmin_stack[MAX_TREE_DEPTH];
    static float   tmax_stack[MAX_TREE_DEPTH];
    static UINT    node_stack[MAX_TREE_DEPTH];
    static UINT    stack_offs = 0;

    // set up the traversal stack
    UINT start_node = 0;
    stack_offs = 0;
    node_stack[stack_offs] = start_node;
    tmin_stack[stack_offs] = tmin;
    tmax_stack[stack_offs] = tmax;
    stack_offs++;

    // keep going until the stack is empty again
    while (stack_offs > 0)
    {
        stack_offs--;

        // pop node off of the stack
        // TODO(OPTIMIZATION):  re-arrange stack to use structures for more localized memory access
        UINT curr_node = node_stack[stack_offs];
        tmin = tmin_stack[stack_offs];
        tmax = tmax_stack[stack_offs];

        // walk the tree down to a leaf
        JRTKDNode* node = &m_pNodeArray[curr_node];

        while (!node->IsLeaf())
        {
#ifdef JRT_DETAILED_STATS
            JRTStats::Instance().nNodeVisits++;
#endif

            // for now, this is just a straight implementation of all the assorted cases
            // TODO:  optimize this properly

            UBYTE axis = node->inner.axis;
            UINT front = node->inner.front_offset;
            UINT back = front + 1;

            float ov = rOrigin[ axis ];
            float dv = rDirection[ axis ];

            // where does ray hit this node's split plane??
            // the math:   t = (-d - NdotO) / NdotD
            //    If the plane cuts through a particular position on the axis (e.g. x=1)
            //    then the D term of the plane equation is the negative of that position
            //   Because the planes are axis-aligned, it suffices to use one component of the origin
            //   and direction to compute the dot product
            float thit = (node->inner.position - rOrigin[ axis ]) * inv_direction[ axis ];


            if (ov > node->inner.position)
            {
                // on front side of split plane
                if (dv >= 0)
                {
                    // pointing away from split plane

                    JRT_ASSERT(thit < 0 || !_finite(thit));
                    // traverse front only
                    curr_node = front;
                }
                else
                {
                    // pointing towards split plane

                    JRT_ASSERT(thit > 0);

                    // t test
                    if (thit > tmax)
                    {
                        // traverse front only
                        curr_node = front;
                    }
                    else if (thit < tmin)
                    {
                        // traverse back only
                        curr_node = back;
                    }
                    else // implied tmin < thit < tmax
                    {
                        // front then back

                        // add the second subtree to our traversal stack
                        // we will test it later...
                        node_stack[stack_offs] = back;
                        tmin_stack[stack_offs] = thit;
                        tmax_stack[stack_offs] = tmax;
                        stack_offs++;

                        // visit the first node in our traversal ordering first
                        tmax = thit;
                        curr_node = front;

                    }
                }
            }
            else if (ov < node->inner.position)
            {
                // on back side of split plane
                if (dv <= 0)
                {
                    JRT_ASSERT(thit < 0 || !_finite(thit));
                    // back only
                    curr_node = back;
                }
                else
                {
                    JRT_ASSERT(thit > 0);

                    // t test
                    if (thit < tmin)
                    {
                        // front only
                        curr_node = front;
                    }
                    else if (thit > tmax)
                    {
                        // back only
                        curr_node = back;
                    }
                    else // implied tmin < thit < tmax
                    {
                        // back then front

                        // add the second subtree to our little stack
                        // we will test it later...
                        node_stack[stack_offs] = front;
                        tmin_stack[stack_offs] = thit;
                        tmax_stack[stack_offs] = tmax;
                        stack_offs++;

                        tmax = thit;
                        curr_node = back;
                    }
                }
            }
            else // ov == node->inner.position
            {
                // in split plane
                if (dv > 0)
                {
                    // front only
                    curr_node = front;
                }
                else if (dv < 0)
                {
                    // back only
                    curr_node = back;
                }
                else
                {
                    // both (arbitrary order)

                    // add the second subtree to our little stack
                    // we will test it later...
                    node_stack[stack_offs] = back;
                    tmin_stack[stack_offs] = tmin;
                    tmax_stack[stack_offs] = tmax;
                    stack_offs++;

                    curr_node = front;
                }
            }

            JRT_ASSERT(stack_offs <= MAX_TREE_DEPTH);
            JRT_ASSERT(curr_node < m_nNodeCount);
            node = &m_pNodeArray[curr_node];

        }   // while( !node->IsLeaf() )


        // ***********************************************
        // at a leaf.....
        // locate triangle hits if any
        // ***********************************************

        if (node->leaf.triangle_count > 0)
        {
            float tval;

            int triangle_end = node->leaf.triangle_start + node->leaf.triangle_count;

            for (int tri = node->leaf.triangle_start; tri < triangle_end; tri++)
            {
                UINT triIndex = m_pIndexArray[tri];

                // mailbox test
                if (m_pMailboxes[ triIndex ] == nRayID)
                {
#ifdef JRT_DETAILED_STATS
                    JRTStats::Instance().nMailboxHits++;
#endif
                    continue;
                }

                const JRTCoreTriangle* pTri = &m_pTriArray[triIndex];

                if (RayTriangleIntersect(pTri, rOrigin, rDirection, tmin, t_CurrentHit, &tval, barycentrics))
                {
                    // See if this is the exclude triangle:
                    // I've found that it tends to be faster to do this exclusion test after the intersection test
                    // rather than before it.  The exclusion test is still necessary to prevent shadow acne etc.
                    if (pTri->pMesh == pExcludeMesh && pTri->nTriIndex == nExcludeTri)
                    {
                        continue;
                    }

                    // ****************************************
                    // here means we have hit the triangle
                    // ****************************************

                    JRT_ASSERT(tval >= tmin && tval <= t_CurrentHit);

                    // set mailbox
                    m_pMailboxes[ triIndex ] = nRayID;


                    // TODO:  replace this with code that adds hit info to a list

                    // calculate hit position
                    Vec3f hitPt = rOrigin + rDirection * tval;

                    have_hit = true;
                    t_CurrentHit = tval;
                    pHit->pMesh = pTri->pMesh;
                    pHit->nIndex = pTri->nTriIndex;
                    pHit->mPosition = hitPt;

                    // get the normal
                    pTri->pMesh->GetInterpolants(pTri->nTriIndex, barycentrics, &pHit->mNormal, NULL);


                }
            }


        }   // END if node->triangle_count > 0

        // **********************************************************************************
        // DONE VISITING NODE:
        // if we haven't found a hit, we will jump back to the last node where both subtrees get
        // traversed.  We will then trace the other subtree........
        // **********************************************************************************

    }   //  END while( stack_offs > 0 )

    // we fell out of the tree... no more hits
    return false;

}

void JRTKDTree::CullBackfaces(const Vec3f& rViewDir, bool bCullCCW)
{
    Vec3f viewDir;

    // depending on what is set as the backfaces, cull appropriately
    if (bCullCCW)
    {
        viewDir = rViewDir * -1.0;
    }
    else
    {
        viewDir = rViewDir;
    }

    for (UINT i = 0; i < m_nTriangleCount; i++)
    {
        UINT nTriIndex = m_pTriArray[i].nTriIndex;
        m_bBackFacing[i] = (DotProduct(viewDir, m_pTriArray[i].pMesh->GetFaceNormal(nTriIndex)) >= 0);
    }
}


/// This method traces the given ray through the KD tree and locates all ray hits.  The hits are placed
/// into the given array, which may be re-sized if necessary
/// \param rOrigin Ray origin
/// \param rDirection Ray direction
/// \param ppHitArray  An output array which will hold the ray hits.  The array will be re-sized as needed
/// \param pnArraySize  A pointer to the array size
/// \return The number of hits that were found.  Returns JRTKDTree::OUT_OF_MEMORY if out of memory
UINT JRTKDTree::FindAllHits(const Vec3f& rOrigin, const Vec3f& rDirection, TootleRayHit** ppHitArray, UINT* pnArraySize)
{
    // bounding box test to determine ray traversal ranges, and handle trivial rejections
    float tmin, tmax;

    if (!m_treeBounds.RayHit(rOrigin, rDirection, &tmin, &tmax))
    {
        return 0;
    }

    if (tmax <= 0)
    {
        return 0;
    }

    if (tmin < 0)
    {
        tmin = 0;
    }

    const float EPSILON = 0.00001f;
    tmax += EPSILON;

    UINT nHitsFound = 0;

    // assign a new ID to this ray
    UINT nRayID = m_nNextRayID;
    m_nNextRayID++;

    if (m_nNextRayID == 0)
    {
        // handle overflow.  The mailboxes are initialized to 0, so to be fully correct
        // we can't have any mailboxes have ID 0
        m_nNextRayID = 1;
    }


    float GlobalTMax = tmax; // where the ray finally leaves the tree

    // compute ray direction inverse here to avoid a divide during traversal
    Vec3f inv_direction = Vec3f(1.0f / rDirection.x, 1.0f / rDirection.y, 1.0f / rDirection.z);

    static float barycentrics[3];

    // rather than using recursion, we're using iteration and handling the stack ourselves
    //static float   tmin_stack[MAX_TREE_DEPTH];
    //static float   tmax_stack[MAX_TREE_DEPTH];
    //static UINT    node_stack[MAX_TREE_DEPTH];

    struct StackFrame
    {
        float tmin;
        float tmax;
        UINT  NextNode;
    };

    static StackFrame traversal_stack [MAX_TREE_DEPTH];

    // set up the traversal stack
    //node_stack[0] = 0;
    //tmin_stack[0] = tmin;
    //tmax_stack[0] = tmax;

    traversal_stack[0].tmin = tmin;
    traversal_stack[0].tmax = tmax;
    traversal_stack[0].NextNode = 0;

    // keep going until the stack is empty again
    StackFrame* pFrame = &traversal_stack[1];

    while (pFrame != traversal_stack /*stack_offs > 0*/)
    {
        //stack_offs--;

        // pop node off of the stack
        // TODO(OPTIMIZATION):  re-arrange stack to use structures for more localized memory access
        //UINT curr_node = node_stack[stack_offs];
        //tmin = tmin_stack[stack_offs];
        //tmax = tmax_stack[stack_offs];

        pFrame--;
        UINT curr_node = pFrame->NextNode;
        tmin = pFrame->tmin;
        tmax = pFrame->tmax;

        // walk the tree down to a leaf
        JRTKDNode* node = &m_pNodeArray[curr_node];

        while (!node->IsLeaf())
        {
#ifdef JRT_DETAILED_STATS
            JRTStats::Instance().nNodeVisits++;
#endif

            // for now, this is just a straight implementation of all the assorted cases
            // TODO:  optimize this properly

            UBYTE axis = node->inner.axis;
            UINT front = node->inner.front_offset;
            UINT back = front + 1;

            float ov = rOrigin[ axis ];
            float dv = rDirection[ axis ];

            // where does ray hit this node's split plane??
            // the math:   t = (-d - NdotO) / NdotD
            //    If the plane cuts through a particular position on the axis (e.g. x=1)
            //    then the D term of the plane equation is the negative of that position
            //   Because the planes are axis-aligned, it suffices to use one component of the origin
            //   and direction to compute the dot product
            float thit = (node->inner.position - ov) * inv_direction[ axis ];

            /*
             // our attempt to optimize the set of IFs below
             float side = ov - node->inner.position;
             dv *= side;

             if( ov < node->inner.position )
             {
                std::swap<UINT>( front, back );
             }

             if( dv >= 0 )
             {
                curr_node = front;
             }
             else
             {
                 // t test
                   if( thit > tmax )
                   {
                      // traverse front only
                      curr_node = front;
                   }
                   else if( thit < tmin )
                   {
                      // traverse back only
                      curr_node = back;
                   }
                   else // implied tmin < thit < tmax
                   {
                      // front then back

                      // add the second subtree to our traversal stack
                      // we will test it later...
                      //node_stack[stack_offs] = back;
                      //tmin_stack[stack_offs] = thit;
                      //tmax_stack[stack_offs] = tmax;
                      //stack_offs++;

                      pFrame->NextNode = back;
                      pFrame->tmin = thit;
                      pFrame->tmax = tmax;
                      pFrame++;
                      // visit the first node in our traversal ordering first
                      tmax=thit;
                      curr_node = front;

                   }
             }*/


            if (ov > node->inner.position)
            {
                // on front side of split plane
                if (dv >= 0)
                {
                    // pointing away from split plane

                    JRT_ASSERT(thit < 0 || !_finite(thit));
                    // traverse front only
                    curr_node = front;
                }
                else
                {
                    // pointing towards split plane


                    JRT_ASSERT(thit > 0);

                    // t test
                    if (thit > tmax)
                    {
                        // traverse front only
                        curr_node = front;
                    }
                    else if (thit < tmin)
                    {
                        // traverse back only
                        curr_node = back;
                    }
                    else // implied tmin < thit < tmax
                    {
                        // front then back

                        // add the second subtree to our traversal stack
                        // we will test it later...
                        //node_stack[stack_offs] = back;
                        //tmin_stack[stack_offs] = thit;
                        //tmax_stack[stack_offs] = tmax;
                        //stack_offs++;

                        pFrame->NextNode = back;
                        pFrame->tmin = thit;
                        pFrame->tmax = tmax;
                        pFrame++;
                        // visit the first node in our traversal ordering first
                        tmax = thit;
                        curr_node = front;

                    }
                }
            }
            else if (ov < node->inner.position)
            {
                // on back side of split plane
                if (dv <= 0)
                {
                    JRT_ASSERT(thit < 0 || !_finite(thit));
                    // back only
                    curr_node = back;
                }
                else
                {
                    // where does ray hit this node's split plane??
                    JRT_ASSERT(thit > 0);

                    // t test
                    if (thit < tmin)
                    {
                        // front only
                        curr_node = front;
                    }
                    else if (thit > tmax)
                    {
                        // back only
                        curr_node = back;
                    }
                    else // implied tmin < thit < tmax
                    {
                        // back then front

                        // add the second subtree to our little stack
                        // we will test it later...
                        pFrame->NextNode = front;
                        pFrame->tmin = thit;
                        pFrame->tmax = tmax;
                        pFrame++;
                        tmax = thit;
                        curr_node = back;
                    }
                }
            }
            else // ov == node->inner.position
            {
                // in split plane
                if (dv > 0)
                {
                    // front only
                    curr_node = front;
                }
                else if (dv < 0)
                {
                    // back only
                    curr_node = back;
                }
                else
                {
                    // both (arbitrary order)

                    // add the second subtree to our little stack
                    // we will test it later...
                    pFrame->NextNode = front;
                    pFrame->tmin = tmin;
                    pFrame->tmax = tmax;
                    pFrame++;
                    curr_node = front;
                }
            }

            //JRT_ASSERT( stack_offs <= MAX_TREE_DEPTH );
            JRT_ASSERT(curr_node < m_nNodeCount);
            node = &m_pNodeArray[curr_node];

        }   // while( !node->IsLeaf() )


        // ***********************************************
        // at a leaf.....
        // locate triangle hits if any
        // ***********************************************

        if (node->leaf.triangle_count > 0)
        {
            float tval;

            int triangle_end = node->leaf.triangle_start + node->leaf.triangle_count;

            for (int tri = node->leaf.triangle_start; tri < triangle_end; tri++)
            {
                UINT triIndex = m_pIndexArray[tri];

                // mailbox and backfacing test
                if (m_bBackFacing[ triIndex ] || m_pMailboxes[ triIndex ] == nRayID)
                {
                    continue;
                }

                const JRTCoreTriangle* pTri = &m_pTriArray[triIndex];

                if (RayTriangleIntersect(pTri, rOrigin, rDirection, tmin, GlobalTMax, &tval, NULL))
                {

                    // ****************************************
                    // here means we have hit the triangle
                    // ****************************************

                    JRT_ASSERT(tval >= tmin && tval <= GlobalTMax);

                    // set mailbox
                    m_pMailboxes[ triIndex ] = nRayID;

                    // record the hit
                    (*ppHitArray)[ nHitsFound ].nFaceID = pTri->nTriIndex;
                    (*ppHitArray)[ nHitsFound ].t = tval;
                    nHitsFound++;

                    // grow hit array if needed
                    if (*pnArraySize == nHitsFound)
                    {
                        // grow array
                        UINT nOldArraySize = *pnArraySize;
                        *pnArraySize = 2 * (*pnArraySize);
                        TootleRayHit* pTemp = new TootleRayHit[ *pnArraySize ];

                        memcpy(pTemp, *ppHitArray, nOldArraySize * sizeof(TootleRayHit));
                        delete[] *ppHitArray;
                        *ppHitArray = pTemp;
                    }
                }
            }


        }   // END if node->triangle_count > 0

        // **********************************************************************************
        // DONE VISITING NODE:
        // if we haven't found a hit, we will jump back to the last node where both subtrees get
        // traversed.  We will then trace the other subtree........
        // **********************************************************************************

    }   //  END while( stack_offs > 0 )

    // we fell out of the tree... no more hits
    return nHitsFound;
}


UINT JRTKDTree::GetMaxDepth() const
{
    return RecurseMaxDepth(0);
}


UINT JRTKDTree::GetLeafCount() const
{
    UINT nLeafs = 0;

    for (UINT i = 0; i < GetNodeCount(); i++)
    {
        if (m_pNodeArray[i].IsLeaf())
        {
            nLeafs++;
        }
    }

    return nLeafs;
}


UINT JRTKDTree::GetMemoryUsage() const
{
    return sizeof(JRTKDNode) * m_nNodeCount +
           (sizeof(JRTCoreTriangle)) * m_nTriangleCount +
           sizeof(UINT) * m_nIndexCount;
}


UINT JRTKDTree::RecurseMaxDepth(UINT nNode) const
{
    if (m_pNodeArray[nNode].IsLeaf())
    {
        return 0;
    }
    else
    {
        JRTKDNode* pNode = &m_pNodeArray[nNode];
        UINT front = pNode->inner.front_offset;
        UINT back = pNode->inner.front_offset + 1;
        UINT frontDepth = 1 + RecurseMaxDepth(front);
        UINT backDepth =  1 + RecurseMaxDepth(back);
        return  Max(frontDepth , backDepth);
    }
}
