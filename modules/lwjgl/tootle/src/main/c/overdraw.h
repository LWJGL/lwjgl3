/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _TOOTLE_OVERDRAW_MODULE_H_
#define _TOOTLE_OVERDRAW_MODULE_H_

#include "tootlelib.h"
#include "vector.h"
#include "feedback.h"
#include <vector>

#define TOOTLE_RAYTRACE_IMAGE_SIZE 512    // the image size used to optimize and measure overdraw using ray tracing implementation

class Soup;

TootleResult ODInit();

/// Determines whether or not ODInit has been called
bool ODIsInitialized();

TootleResult ODSetSoup(Soup* pSoup, TootleFaceWinding eWinding);

TootleResult ODObjectOverdraw(const float* pViewpoints, unsigned int nViewpoints, float& fODAvg, float& fODMax);
TootleResult ODObjectOverdrawRaytrace(const float*        pfVB,
                                      const unsigned int* pnIB,
                                      unsigned int        nVertices,
                                      unsigned int        nFaces,
                                      const float*        pViewpoints,
                                      unsigned int        nViewpoints,
                                      bool                bCullCCW,
                                      float&              fAvgOD,
                                      float&              fMaxOD);

TootleResult ODOverdrawGraph(const float*            pViewpoints,
                             unsigned int            nViewpoints,
                             bool                    bCullCCW,
                             const std::vector<int>&       rClusters,
                             const std::vector<int>&       rClusterOut,
                             std::vector<t_edge>&          rGraphOut,
                             TootleOverdrawOptimizer eOverdrawOptimizer);

void ODCleanup();

#endif
