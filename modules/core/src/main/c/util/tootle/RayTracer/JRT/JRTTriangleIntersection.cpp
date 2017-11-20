/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include "JRTCommon.h"
#include "JRTCoreUtils.h"
#include "JRTTriangleIntersection.h"

#include "JMLSSEVec.h"
#include <assert.h>
#include <math.h>
#include <float.h>



inline void GetProjectedCoords(const double* P, unsigned int max_normal_comp, double& Pu, double& Pv)
{
    Pu = UCOMP(P, max_normal_comp);
    Pv = VCOMP(P, max_normal_comp);
}

inline void GetProjectedCoords(const double* P, unsigned int max_normal_comp, float& Pu, float& Pv)
{
    Pu = (float)UCOMP(P, max_normal_comp);
    Pv = (float)VCOMP(P, max_normal_comp);
}




inline void GetProjectedCoords(const float* P, unsigned int max_normal_comp, double& Pu, double& Pv)
{
    Pu = UCOMP(P, max_normal_comp);
    Pv = VCOMP(P, max_normal_comp);
}



inline void GetProjectedCoords(const float* P, unsigned int max_normal_comp, float& Pu, float& Pv)
{
    Pu = UCOMP(P, max_normal_comp);
    Pv = VCOMP(P, max_normal_comp);
}


inline void GetProjectedCoords(const SSEVec4& phit, unsigned int max_normal_comp, SSEVec4& out)
{
    out[0] = UCOMP(phit, max_normal_comp);
    out[1] = VCOMP(phit, max_normal_comp);
}


float Cross2D(float ux, float uy, float vx, float vy)
{
    // thanks mathworld!!! :)
    return (ux * vy) - (uy * vx);
}


float TriArea2D(float u1, float v1, float u2, float v2)
{
    // thanks mathworld!!! :)
    float v = Cross2D(u1, v1, u2, v2);
    return 0.5f * fabs(v);
}


void PreprocessTri(const float* v1, const float* v2, const float* v3, JRTCoreTriangle* pTri)
{
    // compute triangle normal

    // a = v3-v1
    // b = v2-v1
    double a[3], b[3];

    for (int i = 0; i < 3; i++)
    {
        a[i] = v2[i] - v1[i];
        b[i] = v3[i] - v1[i];
    }

    // normal = a x b
    double normal[3];
    normal[0] = a[1] * b[2] - a[2] * b[1];
    normal[1] = a[2] * b[0] - a[0] * b[2];
    normal[2] = a[0] * b[1] - a[1] * b[0];

    // normalize normal
    double len = sqrt(normal[0] * normal[0] + normal[1] * normal[1] + normal[2] * normal[2]);
    normal[0] /= len;
    normal[1] /= len;
    normal[2] /= len;

    JRT_ASSERT(len > 0);

    // compute d term of plane equation
    // d = -N.P
    double d = 0;

    for (int i = 0; i < 3; i++)
    {
        d -= v1[i] * normal[i];
    }


    // find biggest normal component
    int maxcomp = 0;

    for (int i = 1; i < 3; i++)
    {
        if (fabs(normal[i]) > fabs(normal[maxcomp]))
        {
            maxcomp = i;
        }
    }

    pTri->max_normal_comp = maxcomp;

    // do some stuff, the nature of which I've since forgotten....
    // but its in that one tech report.....
    // shame on me for not commenting as I code

    pTri->Nd = (float) - d;
    pTri->Nu = (float)UCOMP(normal, maxcomp);
    pTri->Nv = (float)VCOMP(normal, maxcomp);

    pTri->Nd /= (float)WCOMP(normal, maxcomp);
    pTri->Nu /= (float)WCOMP(normal, maxcomp);
    pTri->Nv /= (float)WCOMP(normal, maxcomp);

    GetProjectedCoords(v1, maxcomp, pTri->V0u, pTri->V0v);
    GetProjectedCoords(a, maxcomp, pTri->E1u, pTri->E1v);
    GetProjectedCoords(b, maxcomp, pTri->E2u, pTri->E2v);
    double cross = Cross2D(pTri->E1u,  pTri->E1v,  pTri->E2u,  pTri->E2v);

    pTri->E1u /= (float)cross;
    pTri->E2u /= (float)cross;
    pTri->E1v /= (float)cross;
    pTri->E2v /= (float)cross;
}




bool SegTest(float segU1, float segU2, float segV1, float segV2, float Pu, float Pv)
{
    // U = aU1 + (1-a)U2
    // V = aV1 + (1-a)V2
    // assume U2 > U1

    if (segU1 == segU2)
    {
        return false;    //return (segU1 == Pu && (segV1 >= Pv || segV2 >= Pv));
    }

    // locate U = Pu on the segment
    float alpha = (Pu - segU1) / (segU2 - segU1);

    assert(!_isnan(alpha) && _finite(alpha));

    if (alpha <= 0.0f || alpha > 1.0f)
    {
        return false;
    }

    float v = segV1 + alpha * (segV2 - segV1);
    return (v >= Pv);
}

/*
bool RayTriangleIntersect( const JRTCoreTriangle* pTri, const float* origin, const float* direction, float tmin, float tmax, float* tout, float* barycentrics_out )
{
    UINT nIndexW = WCOMPINDEX( pTri->max_normal_comp );
    UINT nIndexU = UCOMPINDEX( pTri->max_normal_comp );
    UINT nIndexV = VCOMPINDEX( pTri->max_normal_comp );

    float Ou = origin[nIndexU];
    float Ov = origin[nIndexV];
    float Ow = origin[nIndexW];

    float Du = direction[nIndexU];
    float Dv = direction[nIndexV];
    float Dw = direction[nIndexW];

    float Nu = pTri->Nu;
    float Nv = pTri->Nv;
    float Nd = pTri->Nd;

    static const float ONE = 1.0f;
    float t;

    _asm
    {
        mov ecx, pTri;

        // Du*Nu
        movss xmm0, DWORD PTR direction[nIndexU];
        movss xmm1, DWORD PTR [ecx];
        mulss xmm0, xmm1;

        // Dv*Nv
        movss xmm1, DWORD PTR[ecx+4];
        movss xmm2, DWORD PTR direction[nIndexV];
        mulss xmm1, xmm2;

        // Du*Nu + Dv*Nv + Dw
        addss xmm0, xmm1;
        addss xmm0, DWORD PTR direction[nIndexW];

        // divide all that by 1, store in xmm1
        movss xmm1, ONE;
        divss xmm1, xmm0;

        // if xmm0 is 0, then we have an inf, and we should get out now (this is a rare case but it happens)
        xorps   xmm2, xmm2;       // xmm2 = 0
        ucomiss xmm0, xmm2;
        je RETURN_FALSE; // forward branch, predicted not taken

        // Ou*Nu
        movss xmm0, DWORD PTR origin[nIndexU];
        movss xmm2, DWORD PTR [ecx];
        mulss xmm0, xmm2;

        // Ou*Nu + Ov*Nv
        movss xmm2, DWORD PTR origin[nIndexV];
        movss xmm3, DWORD PTR [ecx+4];
        mulss xmm2, xmm3;
        addss xmm0, xmm2

        // Ou*Nu + Ov*Nv + Ow, store in xmm0
        movss xmm4, Ow;
        addss xmm0, xmm4;

        // Nd - (Ou*Nu + Ov*Nv + Ow)
        movss xmm2, Nd;
        subss xmm2, xmm0;

        // multiply by 1/NdotD
        mulss xmm2, xmm1;


        // t is now in xmm2

        movss t, xmm2;
        movss xmm1, tmin;   // xmm1 = tmin
        movss xmm0, xmm2;   // xmm0 = t, (xmm2=t from above)
        cmpltss xmm1, xmm0; // xmm1 = (tmin < t)

        movss xmm3, tmax;   // xmm3 = tmax
                            // xmm0 = t (above)
        cmpless xmm0, xmm3; // xmm3 = (t <= tmax)

        // xmm1 == tmin < t && t <= tmax
        // if this is true, continue the test
        andps xmm0, xmm1;

        xorps xmm1, xmm1;
        comiss xmm0, xmm1;

    // we jump here if we're early-outing because N.D == 0
RETURN_FALSE:
        xor al, al;
        ret 0;


RETURN_TRUE:
        mov al, 1;
        ret 0;
    }

}*/


bool RayTriangleIntersect(const JRTCoreTriangle* pTri, const float* origin, const float* direction, float tmin, float tmax, float* tout, float* /*barycentrics_out*/)
{
#ifdef JRT_DETAILED_STATS
    JRTStats::Instance().nTotalTriTests++;
#endif

    // ray-plane intersection
    //  t = - d - NdotO / NdotD

    // triangle normal is stored as two floats, Nu and Nv
    // these are the smallest two components of the normal divided by the largest
    // doing the ray-plane test on this modified normal eliminates two multiplies
    UINT nIndexW = WCOMPINDEX(pTri->max_normal_comp);
    UINT nIndexU = UCOMPINDEX(pTri->max_normal_comp);
    UINT nIndexV = VCOMPINDEX(pTri->max_normal_comp);

    float Du = direction[nIndexU];
    float Dv = direction[nIndexV];
    float Dw = direction[nIndexW];
    float denom = ((Du * pTri->Nu) + (Dv * pTri->Nv) + Dw);
    float NdotD = 1.0f / (float) denom;

    float Ou = origin[nIndexU];
    float Ov = origin[nIndexV];
    float Ow = origin[nIndexW];
    float NdotO = (Ou * pTri->Nu) + (Ov * pTri->Nv) + (Ow);

    float t = (pTri->Nd - NdotO) * NdotD;

    // if t is outside min/max range, or is parallel to plane, exit here
    if (t > tmax || t < tmin || denom == 0.0f)
    {
        return false;
    }


#ifdef JRT_DETAILED_STATS
    JRTStats::Instance().nTotalPastPlaneHit++;
#endif


    assert(!_isnan(t) && _finite(t) && t >= tmin && t <= tmax);

    //see: http://graphics.stanford.edu/courses/cs348b-98/gg/intersect.html

    // compute hit location (projected to 2D)
    float Pu, Pv;
    Pu = Ou + t * Du;
    Pv = Ov + t * Dv;

    // vector from vertex to hitpoint
    Pu -= pTri->V0u;
    Pv -= pTri->V0v;


    float a = Pu * pTri->E2v - Pv * pTri->E2u;


    float b = pTri->E1u * Pv - pTri->E1v * Pu;

    if (a < 0.0f || b < 0.0f || a + b > 1.0f)
    {
        return false;
    }

    *tout = t;
    return true;
}
