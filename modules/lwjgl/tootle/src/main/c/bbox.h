/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef _BBOX_
#define _BBOX_

#include "scalar.h"
#include "matrix.h"

template <int N, class V = float> class BBox
{
public:
    BBox(void)
    {
        Reset();
    }
    void Reset(void)
    {
        for (int i = 0; i < N; i++)
        {
            min[i] = SCALAR_MAX;
            max[i] = SCALAR_MIN;
        }

        changed = false;
    }
    BBox(const Matrix<N, 1, V>& _min, const Matrix<N, 1, V>& _max)
    {
        min = _min;
        max = _max;
        center = (max + min) / 2;
        changed = false;
    }
    void Merge(const Matrix<N, 1, V>& p)
    {
        for (int i = 0; i < N; i++)
        {
            if (p[i] < min[i]) { min[i] = p[i]; }

            if (p[i] > max[i]) { max[i] = p[i]; }
        }

        changed = true;
    }
    bool In(const Matrix<N, 1, V>& p) const
    {
        for (int i = 0; i < N; i++)
        {
            if (p[i] <= min[i]) { return false; }

            if (p[i] > max[i]) { return false; }
        }

        return true;
    }
    Matrix<N, 1, V> GetMin(void) const { return min; }
    Matrix<N, 1, V> GetMax(void) const { return max; }
    Matrix<N, 1, V> GetSize() const { return max - min; }
    Matrix<N, 1, V> GetCenter(void)
    {
        if (changed) { center = (max + min) / 2.0; }

        return center;
    }

private:
    Matrix<N, 1, V> min, max;
    Matrix<N, 1, V> center;
    bool changed;
};

typedef BBox<2> BBox2;
typedef BBox<3> BBox3;

#endif // _BBOX_
