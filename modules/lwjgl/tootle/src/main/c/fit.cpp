/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include <algorithm>

#include "bbox.h"
#include "error.h"

#include "fit.h"

bool
RobustFit(const std::vector<Vector3>& vertex, Vector3* ucenter, float* usize)
{
    Vector3 center;
    float size;
    int nvertex;

    if ((nvertex = static_cast<int> (vertex.size())) == 0) { return false; }

    // solve for x, y and z independently
    std::vector<float> a, b, c;

    a.resize (nvertex); b.resize (nvertex); c.resize (nvertex);

    // copy coordinates to temp buffers
    for (int i = 0; i < nvertex; i++)
    {
        a[i] = vertex[i][0];
        b[i] = vertex[i][1];
        c[i] = vertex[i][2];
    }

    // center is median independently in  3 dimensions
    std::nth_element(&a[0], &a[nvertex / 2], &a[nvertex]);
    std::nth_element(&b[0], &b[nvertex / 2], &b[nvertex]);
    std::nth_element(&c[0], &c[nvertex / 2], &c[nvertex]);
    center[0] = a[nvertex / 2];
    center[1] = b[nvertex / 2];
    center[2] = c[nvertex / 2];

    // get median distance to median center
    for (int i = 0; i < nvertex; i++)
    {
        a[i] = Norm(vertex[i] - center);
    }

    b = a;
    std::nth_element(&b[0], &b[nvertex / 2], &b[nvertex]);
    float distance = b[nvertex / 2];

    // compute median deviation from median distance to median center
    for (int i = 0; i < nvertex; i++)
    {
        b[i] = fabs(a[i] - distance);
    }

    c = b;
    std::nth_element(&c[0], &c[nvertex / 2], &c[nvertex]);
    float deviation = c[nvertex / 2];
    // discard points that are too far away from center
    BBox3 box;

    for (int i = 0; i < nvertex; i++)
    {
        if (b[i] <= 2 * deviation)
        {
            box.Merge(vertex[i]);
        }
    }

    size = Norm(box.GetSize());

    if (usize) { *usize = size; }

    if (ucenter) { *ucenter = center; }

    return true;
}

bool
BBoxFit(const std::vector<Vector3>& vertex, Vector3* ucenter, float* usize)
{
    Vector3 center;
    float size;
    int nvertex;

    if ((nvertex = static_cast<int> (vertex.size())) == 0) { return false; }

    BBox3 box;

    for (int i = 0; i < nvertex; i++)
    {
        box.Merge(vertex[i]);
    }

    Vector3 s = box.GetSize();
    size = Norm(s);
    center = box.GetMin() + s / 2;

    if (usize) { *usize = size; }

    if (ucenter) { *ucenter = center; }

    return true;
}

bool
BBoxFit(const std::vector<Vector3>& vertex, const int* ind, int iStart, int nTris,
        Vector3* ucenter, Vector3* udiag, float* usize)
{
    Vector3 center;
    Vector3 diag;
    float size;
    int nvertex;

    if ((nvertex = static_cast<int> (vertex.size())) == 0) { return false; }

    BBox3 box;

    for (int i = iStart; i < iStart + nTris * 3; i++)
    {
        int c = ind[i];
        box.Merge(vertex[c]);
    }

    diag = box.GetSize();
    size = Norm(diag);
    center = box.GetMin() + diag / 2;

    if (usize) { *usize = size; }

    if (udiag) { *udiag = diag; }

    if (ucenter) { *ucenter = center; }

    return true;
}
