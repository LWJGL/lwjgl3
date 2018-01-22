/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef D3DOVERDRAWWINDOW_H
#define D3DOVERDRAWWINDOW_H

#define NUM_QUERIES 100

#include "d3dwindow.h"
#include "soup.h"
#include "feedback.h"

__declspec(align(16)) class D3DOverdrawWindow: public D3DWindow
{
public:
    typedef D3DWindow Superclass;
    D3DOverdrawWindow(void);

    int SetSoup(Soup* pSoup);
    void SetViewpoint(const float* pViewpoint, UINT nViewpoints);
    void SetCluster(const std::vector<int>* pCluster, const std::vector<int>* pClusterStart);

    void SetCulling(bool bCullCCW);

    int LostDevice(void);
    int ResetDevice(void);
    int SetIB(void);
    int SetVB(void);
    int SetVD(void);
    int SetQuery(void);
    virtual int Display(void);
    virtual void Reshape(int w, int h);

    virtual void SetupWorld(void);
    virtual void SetupView(int iViewpoint);
    virtual void SetupProjection(void);
    virtual void SetupViewport(void);
    virtual void SetupTransforms(void);
    virtual void SetupUniforms(void);
    virtual void SetupDraw(int iViewpoint);
    virtual HRESULT DrawModel(void);
    virtual void DrawCluster(int iCluster);
    virtual void DrawComplement(int iClusterA, int iClusterB);
    virtual void Clear(void);
    virtual void Fit(void);
    virtual void FitClusters(void);

    virtual int Graph(std::vector<t_edge>& graph);
    virtual int Object(float& fOverdraw, float& fOverdrawMax);
    virtual int Loop(int iClusterA, int iClusterB);
    virtual int Loop(void);
    virtual bool NormalizedLoop(float& fOverdraw, float& fOverdrawMax);

    int CheckIsect(int iClusterA, int iClusterB);
    int CreateBuffers(void);
    int ReleaseBuffers(void);

    void* operator new(size_t i)
    {
        return _mm_malloc(i,16);
    }

    void operator delete(void* p)
    {
        _mm_free(p);
    }

private:
    Soup* m_pSoup;
    const Vector3* m_pViewpoint;
    UINT m_nViewpointCount;

    const std::vector<int>* m_pCluster;
    const std::vector<int>* m_pClusterStart;
    IDirect3DQuery9* m_pOcclusionQuery[NUM_QUERIES];
    IDirect3DQuery9* m_pOcclusionQueryPix[NUM_QUERIES];

    LPDIRECT3DVERTEXBUFFER9 m_VB;
    LPDIRECT3DINDEXBUFFER9 m_IB;
    LPDIRECT3DVERTEXDECLARATION9 m_VD;
    int m_nVerts, m_nTris;

#ifdef _DX11_1_
    DirectX::XMMATRIX
#else
    D3DXMATRIXA16 
#endif
    m_mViewing, m_mProjection, m_mWorld;

    Vector3 m_vCenter;
    float m_fSize;
    std::vector<Vector3> m_vClusterCenter;
    std::vector<Vector3> m_vClusterDiag;
    std::vector<float> m_fClusterSize;
    int m_iTested;
    int m_iRendered;

    bool m_bCullCCW; // if true, cull counter-clockwise faces, otherwise, cull clockwise faces
};

#endif
