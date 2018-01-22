/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _TRIORDER_H
#define _TRIORDER_H

#define TOOTLE_NONE (2147483647)            // 2^31 -1 (ideally should be 2^32-1 for max unsigned int).  However, int and
// unsigned int are used interchangebly in the library.

/// Perform vertex optimization only
float FanVertOptimizeVCacheOnly(int*              piIndexBufferIn,
                                int*              piIndexBufferOut,
                                int               iNumVertices,
                                int               iNumFaces,
                                int               iCacheSize,
                                int*              piScratch = NULL,
                                int*              piClustersOut = NULL,
                                int*              iNumClusters = NULL);

/// The function below just clusters the mesh. It assumes it is already sorted and pre-clustered
/// with "hard boundaries" during vertex cache optimization using the above function.
/// (please see paper for more details)
void FanVertOptimizeClusterOnly(int*  piIndexBufferIn,
                                int   iNumVertices,
                                int   iNumFaces,
                                int   iCacheSize,
                                float lambda,
                                int*  piClustersIn,
                                int   iNumClusters,
                                int*  piClustersOut,
                                int*  iNumClustersOut,
                                int*  piScratch = NULL);

// The function below just optimizes for overdraw and returns a "remap" array which maps the new cluster IDs to
// the old ones. It is particularly useful for characters composed of multiple draw calls, as this will give an ordering
// of draw calls to attempt to reduce overdraw.
void FanVertOptimizeOverdrawOnly(float*            pfVertexPositionsIn,
                                 int*              piIndexBufferIn,
                                 int*              piIndexBufferOut,
                                 int               iNumVertices,
                                 int               iNumFaces,
                                 TootleFaceWinding eFrontWinding,
                                 int*              piClustersIn,
                                 int               iNumClusters,
                                 int*              piScratch = NULL,
                                 int*              piRemap = NULL);


#endif
