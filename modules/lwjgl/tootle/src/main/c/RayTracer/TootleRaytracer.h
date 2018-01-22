/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/

#ifndef _TOOTLE_RAYTRACER_H_
#define _TOOTLE_RAYTRACER_H_


class JRTCore;
class JRTMesh;
class JRTOrthoCamera;

#include <vector>

struct TootleRayHit;

/// An overdraw table is a table that determines, for a pair of faces, how much one face overdraws the other
typedef std::vector< std::vector<unsigned int> > TootleOverdrawTable;


/// \brief A class which resolves triangle visibility for Tootle, using ray tracing.
class TootleRaytracer
{
public:
    TootleRaytracer();

    ~TootleRaytracer();

    /// Initializes the ray tracer and builds all of the necessary data structures
    bool Init(const float* pVertexPositions, const unsigned int* pIndices, const float* pFaceNormals, unsigned int nVertices,
              unsigned int nFaces, const unsigned int* pFaceClusters);

    /// Computes an overdraw table for a set of viewpoints.
    bool CalculateOverdraw(const float* pViewpoints, unsigned int nViewpoints, unsigned int nImageSize,
                           bool bCullCCW, TootleOverdrawTable* pODArray);

    // Measure the overdraw for a set of viewpoints.
    bool MeasureOverdraw(const float* pViewpoints, UINT nViewpoints, UINT nImageSize, bool bCullCCW, float& fAvgODOut, float& fMaxODOut);

    /// Cleans up the internal data structures
    void Cleanup();

private:


    /// Renders the scene from a particular camera position and updates the overdraw array
    bool ProcessViewpoint(const float* pCameraPosition, unsigned int nImageSize, bool bCullCCW, TootleOverdrawTable* pODArray);

    /// Renders the scene from a particular camera position and measures the overdraw
    bool ProcessViewpoint(const float* pCameraPosition, unsigned int nImageSize, bool bCullCCW,
                          unsigned int& nPixelHit, unsigned int& nPixelDrawn);

    /// Updates the overdraw table with overdraw that occurs for a particular pixel in the test image
    void ProcessPixel(TootleRayHit* pRayHit, unsigned int nHits, TootleOverdrawTable* pODArray);

    /// Compute the number of times for a particular pixel is drawn by the mesh
    void GetPixelDrawn(TootleRayHit* pRayHits, UINT nHits, UINT& nPixelOverdrawn);

    const unsigned int*    m_pFaceClusters;
    JRTCore* m_pCore;
    JRTMesh* m_pMesh;
};

#endif