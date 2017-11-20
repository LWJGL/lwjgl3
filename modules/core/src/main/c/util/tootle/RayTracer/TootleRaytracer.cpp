/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/

// define this to make the raytracer dump out debugging images
//#define DEBUG_IMAGES

#include "TootlePCH.h"
#include "JRTCommon.h"
#include "TootleRaytracer.h"
#include "JRTCore.h"
#include "JRTMesh.h"
#include "JRTOrthoCamera.h"
#include "JRTBoundingBox.h"

#ifdef DEBUG_IMAGES
    #include "JRTPPMImage.h"
#endif

// function defined by Tootle that is called to process ray hits for each pixel
extern void ProcessPixel(TootleRayHit*, int);


TootleRaytracer::TootleRaytracer() : m_pMesh(NULL), m_pCore(NULL), m_pFaceClusters(0)
{
}

TootleRaytracer::~TootleRaytracer()
{
}


//=================================================================================================================================
/// Initializes the internal data structures used by the ray tracer.
/// \param pVertexPositions  The vertices of the mesh
/// \param pIndices          The face indices
/// \param pFaceNormals      The triangle normals
/// \param nVertices         The number of vertices
/// \param nIndices          The number of faces.
/// \param pFaceClusters     An array giving the cluster ID for each face
/// \return True if successful, false if out of memory
//=================================================================================================================================
bool TootleRaytracer::Init(const float* pVertexPositions, const UINT* pIndices, const float* pFaceNormals, UINT nVertices,
                           UINT nFaces, const UINT* pFaceClusters)
{
    m_pFaceClusters = pFaceClusters;

    std::vector<JRTMesh*> meshes (1);


    m_pMesh = JRTMesh::CreateMesh((const Vec3f*) pVertexPositions, (const Vec3f*) pFaceNormals, nVertices, nFaces, pIndices);

    if (!m_pMesh)
    {
        return false;
    }

    // fix mesh so its centered on the origin
    // also scale down (doesn't scale up) it so it is inside the radius 1 ball in the origin.
    JRTBoundingBox bb  = m_pMesh->ComputeBoundingBox();
    Vec3f center       = bb.GetCenter();
    Vec3f size         = bb.GetMax() - bb.GetMin();
    float fLongestSide = std::max(size[0], size[1]);
    fLongestSide       = 2.0f * std::max(fLongestSide, size[2]);
    fLongestSide       = std::max(1.0f, fLongestSide);               // make it at least 1

    for (UINT i = 0; i < nVertices; i++)
    {
        float x = m_pMesh->GetVertex(i).x - center.x;
        float y = m_pMesh->GetVertex(i).y - center.y;
        float z = m_pMesh->GetVertex(i).z - center.z;
        m_pMesh->SetVertex(i, Vec3f(x, y, z) / fLongestSide);
    }

    meshes[0] = m_pMesh ;
    m_pCore = JRTCore::Build(meshes);

    if (!m_pCore)
    {
        JRT_SAFE_DELETE(m_pMesh);
        return false;
    }

    return true;
}


//=================================================================================================================================
/// Calculates an overdraw table for a particular set of viewpoints
/// \param pViewpoints  Array of viewpoints to use
/// \param nViewpoints  The size of this array
/// \param nImageSize   The size of the pixel grid on each axis
/// \param pODArray     A table that will hold the computed per-cluster overdraw.  The table must be resized so that it is
///                     nClusters by nClusters and contains 0 in each element.  After this function returns, pODArray[i][j] will
///                     contain the number of pixels in cluster i that are overdrawn by cluster j, summed over all viewpoints
/// \return        True if successful, false if out of memory.
//=================================================================================================================================
bool TootleRaytracer::CalculateOverdraw(const float* pViewpoints, UINT nViewpoints, UINT nImageSize,
                                        bool bCullCCW, TootleOverdrawTable* pODArray)
{
    for (UINT i = 0; i < nViewpoints; i++)
    {
        if (!ProcessViewpoint(pViewpoints, nImageSize, bCullCCW, pODArray))
        {
            return false;
        }

        pViewpoints += 3;
    }

    return true;
}

//=================================================================================================================================
/// Measure the overdraw for a particular set of viewpoints
/// \param pViewpoints  Array of viewpoints to use
/// \param nViewpoints  The size of this array
/// \param nImageSize   The size of the pixel grid on each axis
/// \param bCullCCW     Set to true to cull CCW faces, otherwise cull CW faces.
/// \param fAvgODOut    A variable to receive the average overdraw per pixel.
/// \param fMaxODOut    A variable to receive the maximum overdraw per pixel.
/// \return        True if successful, false if out of memory.
//=================================================================================================================================
bool TootleRaytracer::MeasureOverdraw(const float* pViewpoints,
                                      UINT         nViewpoints,
                                      UINT         nImageSize,
                                      bool         bCullCCW,
                                      float&       fAvgODOut,
                                      float&       fMaxODOut)
{
    assert(pViewpoints);

    if (nViewpoints < 1)
    {
        assert(false);
    }

    fAvgODOut = 0;
    fMaxODOut = 0;

    UINT nTotalPixelHit   = 0;
    UINT nTotalPixelDrawn = 0;
    UINT nPixelHit;
    UINT nPixelDrawn;

    for (UINT i = 0; i < nViewpoints; i++)
    {
        if (!ProcessViewpoint(pViewpoints, nImageSize, bCullCCW, nPixelHit, nPixelDrawn))
        {
            return false;
        }

        nTotalPixelHit   += nPixelHit;
        nTotalPixelDrawn += nPixelDrawn;

        if (nPixelHit > 0)
        {
            fMaxODOut = std::max(fMaxODOut, (float) nPixelDrawn / nPixelHit);
        }

        pViewpoints += 3;
    }

    if (nTotalPixelHit > 0)
    {
        fAvgODOut = (float)(nTotalPixelDrawn) / nTotalPixelHit;
    }
    else
    {
        fAvgODOut = 0;
    }

    return true;
}


//=================================================================================================================================
/// Cleans up raytracer data structures
//=================================================================================================================================
void TootleRaytracer::Cleanup()
{
    m_pFaceClusters = NULL;
    JRT_SAFE_DELETE(m_pCore);
    JRT_SAFE_DELETE(m_pMesh);
}


//=================================================================================================================================
/// Computes overdraw from a particular viewpoint
/// \param pCameraPosition  Camera position to use for this viewpoint.  The camera will be looking at the origin
/// \param nImageSize       Size of the pixel grid on each axis
/// \param bCullCCW         Set to true to cull CCW faces, otherwise cull CW faces.
/// \param pODArray         A table that will be updated with per-cluster overdraw
/// \return            False if out of memory.  True otherwise
//=================================================================================================================================
bool TootleRaytracer::ProcessViewpoint(const float* pCameraPosition, UINT nImageSize, bool bCullCCW, TootleOverdrawTable* pODArray)
{
    assert(pCameraPosition);

    if (nImageSize < 1)
    {
        nImageSize = 1;   // a strange 1x1 image
    }

    // build camera basis vectors
    Vec3f position(pCameraPosition);
    position      = position;
    Vec3f viewDir = Normalize(position) * -1.;
    Vec3f up;

    // Compute the up vector by performing 90 degree 2D rotation on the position vector
    //  (choose two good component vectors).
    if ((position[ 1 ] * position[ 1 ]) < (position[ 0 ] * position[ 0 ]))
    {
        up[ 0 ] = -position[ 2 ];
        up[ 1 ] =  0;
        up[ 2 ] =  position[ 0 ];
    }
    else
    {
        up[ 0 ] =  0;
        up[ 1 ] =  position[ 2 ];
        up[ 2 ] = -position[ 1 ];
    }

    up = Normalize(up);

    // choose viewport size:
    // transform bounding box corners into viewing space
    // as we do this, track the bounding square of the x and y coordinates
    // we will take the size of the larger dimension to be the viewport size
    Vec3f corners[8];
    m_pCore->GetSceneBB().GetCorners(corners);

    Matrix4f mLookAt = MatrixLookAt(position, Vec3f(0, 0, 0), up);
    float xmin = FLT_MAX, xmax = -FLT_MAX, ymin = FLT_MAX, ymax = -FLT_MAX;

    for (int i = 0; i < 8; i++)
    {
        TransformVector(&corners[i], &mLookAt, &corners[i]);
        xmin = Min(xmin, corners[i].x);
        xmax = Max(xmax, corners[i].x);
        ymin = Min(ymin, corners[i].y);
        ymax = Max(ymax, corners[i].y);
    }

    float fViewSize = Max(xmax - xmin, ymax - ymin) * 2;
    //float fViewSize = sqrt(pow(xmax-xmin,2) + pow(ymax-ymin,2)); //Max( xmax - xmin, ymax - ymin );

    // build the camera
    JRTOrthoCamera camera(position, viewDir, up, fViewSize);

    // cull backfaces
    m_pCore->CullBackfaces(viewDir, bCullCCW);

    // iterate over the pixels that we're interested in
    float delta = 1.0f / nImageSize;
    float s = 0;
    float t = 0;

#ifdef DEBUG_IMAGES
    JRTPPMImage img(nImageSize, nImageSize);
#endif

    for (int i = 0; i < (int)nImageSize; i++)
    {
        for (int j = 0; j < (int)nImageSize; j++)
        {
            // compute the camera ray for this pixel
            Vec3f rayOrigin, rayDirection;
            camera.GetRay(s, t, &rayOrigin, &rayDirection);

            // trace through the scene data structures to find all hits
            TootleRayHit* pHitArray = 0;
            UINT nHits = 0;

            if (!m_pCore->FindAllHits(rayOrigin, rayDirection, &pHitArray, &nHits))
            {
                // ran out of memory
                return false;
            }



#ifdef DEBUG_IMAGES
            float clr = nHits / 8.f;

            img.SetPixel(j, i, clr, clr, clr);

            /*if( nHits > 0 )
            {
               UINT nTriIndex = pHitArray[0].nFaceID;
               Vec3f normal = m_pMesh->GetFaceNormal( nTriIndex );
               normal /= 2;
               normal += Vec3f(0.5,0.5,0.5);
               img.SetPixel( j, i, normal.x, normal.y, normal.z );
            }*/

#endif

            ProcessPixel(pHitArray, nHits, pODArray);

            s += delta;
        }

        t += delta;
        s = 0;
    }

#ifdef DEBUG_IMAGES
    static int nFrameNum = 0;
    char filename[100];
    sprintf(filename, "C:\\images\\view_%d.ppm", nFrameNum);
    img.SaveFile(filename);
    nFrameNum++;
#endif

    return true;
}

//=================================================================================================================================
/// Measure overdraw from a particular viewpoint.
///
/// \param pCameraPosition  Camera position to use for this viewpoint.  The camera will be looking at the origin
/// \param nImageSize       Size of the pixel grid on each axis
/// \param bCullCCW         Set to true to cull CCW faces, otherwise cull CW faces.
/// \param fAvgODOut        A variable to receive the average overdraw per pixel.
///
/// \return                 False if out of memory.  True otherwise
//=================================================================================================================================
bool TootleRaytracer::ProcessViewpoint(const float* pCameraPosition,
                                       UINT         nImageSize,
                                       bool         bCullCCW,
                                       UINT&        nPixelHit,
                                       UINT&        nPixelDrawn)
{
    assert(pCameraPosition);

    if (nImageSize < 1)
    {
        nImageSize = 1;   // a strange 1x1 image
    }

    // build camera basis vectors
    Vec3f position(pCameraPosition);
    Vec3f viewDir = Normalize(position) * -1.0;
    Vec3f up;

    // Compute the up vector by performing 90 degree 2D rotation on the position vector
    //  (choose two good component vectors).
    if ((position[ 1 ] * position[ 1 ]) < (position[ 0 ] * position[ 0 ]))
    {
        up[ 0 ] = -position[ 2 ];
        up[ 1 ] =  0;
        up[ 2 ] =  position[ 0 ];
    }
    else
    {
        up[ 0 ] =  0;
        up[ 1 ] =  position[ 2 ];
        up[ 2 ] = -position[ 1 ];
    }

    up = Normalize(up);

    Matrix4f mLookAt = MatrixLookAt(position, Vec3f(0, 0, 0), up);

    // choose viewport size:
    // transform bounding box corners into viewing space
    // as we do this, track the bounding square of the x and y coordinates
    // we will take the size of the larger dimension to be the viewport size
    Vec3f corners[8];
    m_pCore->GetSceneBB().GetCorners(corners);

    float xmin =  FLT_MAX;
    float xmax = -FLT_MAX;
    float ymin =  FLT_MAX;
    float ymax = -FLT_MAX;

    for (int i = 0; i < 8; i++)
    {
        TransformVector(&corners[i], &mLookAt, &corners[i]);
        xmin = Min(xmin, corners[i].x);
        xmax = Max(xmax, corners[i].x);
        ymin = Min(ymin, corners[i].y);
        ymax = Max(ymax, corners[i].y);
    }

    float fViewSize = Max(xmax - xmin, ymax - ymin) * 2;
    //float fViewSize = sqrt(pow(xmax-xmin,2) + pow(ymax-ymin,2)); //Max( xmax - xmin, ymax - ymin );

    // build the camera
    JRTOrthoCamera camera(position, viewDir, up, fViewSize);

    // cull backfaces
    m_pCore->CullBackfaces(viewDir, bCullCCW);

    // iterate over the pixels that we're interested in
    float delta = 1.0f / nImageSize;
    float s = 0;
    float t = 0;
#ifdef DEBUG_IMAGES
    JRTPPMImage img(nImageSize, nImageSize);
#endif

    UINT nPixelDrawnTmp;

    nPixelHit   = 0;
    nPixelDrawn = 0;

    for (int i = 0; i < (int) nImageSize; i++)
    {
        for (int j = 0; j < (int) nImageSize; j++)
        {
            // compute the camera ray for this pixel
            Vec3f rayOrigin, rayDirection;
            camera.GetRay(s, t, &rayOrigin, &rayDirection);

            // trace through the scene data structures to find all hits
            TootleRayHit* pHitArray = 0;
            UINT nHits = 0;

            if (!m_pCore->FindAllHits(rayOrigin, rayDirection, &pHitArray, &nHits))
            {
                // ran out of memory
                return false;
            }

            if (nHits > 0)
            {
                nPixelHit++;

                // compute the number of triangles overdrawn for the pixel
                GetPixelDrawn(pHitArray, nHits, nPixelDrawnTmp);

                nPixelDrawn += nPixelDrawnTmp;
            }

#ifdef DEBUG_IMAGES
            float clr = nHits / 8.f;

            img.SetPixel(j, i, clr, clr, clr);

            /*if( nHits > 0 )
            {
               UINT nTriIndex = pHitArray[0].nFaceID;
               Vec3f normal = m_pMesh->GetFaceNormal( nTriIndex );
               normal /= 2;
               normal += Vec3f(0.5,0.5,0.5);
               img.SetPixel( j, i, normal.x, normal.y, normal.z );
            }*/

#endif

            s += delta;
        }

        t += delta;
        s = 0;
    }

#ifdef DEBUG_IMAGES
    static int nFrameNum = 0;
    char filename[100];
    sprintf(filename, "C:/tmp/images/view_%d.ppm", nFrameNum);
    img.SaveFile(filename);
    nFrameNum++;
#endif

    return true;
}

//=================================================================================================================================
/// \param pRayHits  Array of ray hits that occurred in this pixel.  They will be sorted by depth
/// \param nHits     Number of hits in the array
/// \param pODArray  A table that will be updated to take into account per-cluster overdraw discovered in this pixel
//=================================================================================================================================

void TootleRaytracer::ProcessPixel(TootleRayHit* pRayHits, UINT nHits, TootleOverdrawTable* pODArray)
{

    // we are given a set of ray hits, sorted by depth
    // we can use this to adjust the compute pairwise overdraw between clusters by repeatedly marching
    // from the first hit to the last
    for (UINT i = 0; i < nHits; i++)
    {
        for (UINT j = 0; j < i; j++)
        {
            int a = m_pFaceClusters[pRayHits[i].nFaceID];
            int b = m_pFaceClusters[pRayHits[j].nFaceID];

            if (a != b)
            {
                pODArray->at(b)[a]++;
            }
        }
    }

}

//=================================================================================================================================
/// Compute the number of times for a particular pixel is drawn.
/// \param pRayHits         Array of ray hits that occurred in this pixel.  They will be sorted by depth
/// \param nHits            Number of hits in the array
/// \param nPixelDrawn      The number of times this pixel is drawn by the mesh.
//=================================================================================================================================
void TootleRaytracer::GetPixelDrawn(TootleRayHit* pRayHits, UINT nHits, UINT& nPixelDrawn)
{
    assert(pRayHits);

    // We are given a set of ray hits, sorted by depth
    // We can use this information to compute the overdrawn triangle by comparing all the triangle IDs
    //  hit by the ray on this pixel to the first triangle ID on the list.

    nPixelDrawn = 0;

    if (nHits < 1)
    {
        return;
    }

    nPixelDrawn++;  // there is at least one hit (one triangle will be touching this pixel).
    UINT nMinFaceID = pRayHits[ 0 ].nFaceID;
    UINT nCurrentFaceID;

    for (UINT i = 1; i < nHits; i++)
    {
        nCurrentFaceID = pRayHits[ i ].nFaceID;

        if (nCurrentFaceID < nMinFaceID)
        {
            nMinFaceID = nCurrentFaceID;
            nPixelDrawn++;
        }
    }
}