/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include "d3doverdrawwindow.h"
#include "fit.h"

typedef struct _VERTEX
{
    float x, y, z;
} VERTEX;

D3DOverdrawWindow::
D3DOverdrawWindow(void) :
    m_pViewpoint(0),
    m_nViewpointCount(0)
{
    m_pSoup = NULL;
    m_VB = NULL;
    m_VD = NULL;
    m_IB = NULL;
    m_nTris = 0;
    m_nVerts = 0;
    m_fSize = 1;
    m_vCenter = Vector3();
    m_bCullCCW = true;

    for (unsigned int i = 0; i < NUM_QUERIES; i++)
    {
        m_pOcclusionQuery[i] = NULL;
        m_pOcclusionQueryPix[i] = NULL;
    }

}

int
D3DOverdrawWindow::
SetSoup(Soup* pSoup)
{

    // re-create vertex and index buffers
    m_pSoup = pSoup;

    if (!SetVB())
    {
        return 0;
    }

    if (!SetIB())
    {
        return 0;
    }

    // create other device objects as needed
    if (!m_VD)
    {
        if (!SetVD())
        {
            return 0;
        }
    }

    if (!m_pOcclusionQuery[0] || !m_pOcclusionQueryPix[0])
    {
        if (!SetQuery())
        {
            return 0;
        }
    }


    return 1;
}

void
D3DOverdrawWindow::
SetViewpoint(const float* pViewpoint, UINT nViewpoints)
{
    m_pViewpoint = (const Vector3*) pViewpoint;
    m_nViewpointCount = nViewpoints;
}

void
D3DOverdrawWindow::
SetupWorld(void)
{
#ifdef _DX11_1_
    using namespace DirectX;
    DirectX::XMMATRIX T, R, S;
    // make world matrix
    // start with identity
    m_mWorld = XMMatrixIdentity();
    // translate object's center to origin
    T = XMMatrixTranslation(-m_vCenter[0], -m_vCenter[1], -m_vCenter[2]);
    m_mWorld = XMMatrixMultiply(m_mWorld, T);
    // scale so that size is 1
    S = XMMatrixScaling(1 / m_fSize, 1 / m_fSize, 1 / m_fSize);
    m_mWorld = XMMatrixMultiply(m_mWorld, S);
#else
    D3DXMATRIXA16 T, R, S;
    // make world matrix
    // start with identity
    D3DXMatrixIdentity(&m_mWorld);
    // translate object's center to origin
    D3DXMatrixTranslation(&T, -m_vCenter[0], -m_vCenter[1], -m_vCenter[2]);
    D3DXMatrixMultiply(&m_mWorld, &m_mWorld, &T);
    // scale so that size is 1
    D3DXMatrixScaling(&S, 1 / m_fSize, 1 / m_fSize, 1 / m_fSize);
    D3DXMatrixMultiply(&m_mWorld, &m_mWorld, &S);
#endif
}

void
D3DOverdrawWindow::
SetCulling(bool bCullCCW)
{
    m_bCullCCW = bCullCCW;
}

void
D3DOverdrawWindow::
SetupView(int iViewpoint)
{
    Vector3 e(0, 0, 1), u;

    if (m_pViewpoint && iViewpoint >= 0 &&
        iViewpoint < (int) m_nViewpointCount)
    {
        e = m_pViewpoint[iViewpoint];
    }

    if (e[1]*e[1] < e[0]*e[0])
    {
        u = Normalize(Vector3(-e[2], 0, e[0]));
    }
    else
    {
        u = Normalize(Vector3(0, e[2], -e[1]));
    }

#ifdef _DX11_1_
    auto eye = DirectX::XMVectorSet(e[0], e[1], e[2], 0);
    auto at = DirectX::XMVectorZero();
    auto up = DirectX::XMVectorSet(u[0], u[1], u[2], 0);
    m_mViewing = DirectX::XMMatrixLookAtRH(eye, at, up);
#else
    D3DXVECTOR3 eye(e[0], e[1], e[2]);
    D3DXVECTOR3 at(0, 0, 0);
    D3DXVECTOR3 up(u[0], u[1], u[2]);
    D3DXMatrixLookAtRH(&m_mViewing, &eye, &at, &up);
#endif
}

void
D3DOverdrawWindow::
SetupTransforms(void)
{
#ifdef _DX11_1_

    D3DMATRIX d3d_mat;

    //convert XMMatrix to XMFLOAT4X4
    DirectX::XMFLOAT4X4 _float_4x4;
    DirectX::XMStoreFloat4x4(&_float_4x4, m_mViewing);

    //copy DirectX::XMFLOAT4X4 to D3DMATRIX
    std::memcpy(&d3d_mat, &_float_4x4, sizeof(_float_4x4));
    //Set view
    d3d->SetTransform(D3DTS_VIEW, &d3d_mat);


    //convert XMMatrix to XMFLOAT4X4
    DirectX::XMStoreFloat4x4(&_float_4x4, m_mWorld);

    //copy DirectX::XMFLOAT4X4 to D3DMATRIX
    std::memcpy(&d3d_mat, &_float_4x4, sizeof(_float_4x4));
    //set world
    d3d->SetTransform(D3DTS_WORLD, &d3d_mat);

    //convert XMMatrix to XMFLOAT4X4
    DirectX::XMStoreFloat4x4(&_float_4x4, m_mProjection);
    //copy DirectX::XMFLOAT4X4 to D3DMATRIX
    std::memcpy(&d3d_mat, &_float_4x4, sizeof(_float_4x4));
    //set projection
    d3d->SetTransform(D3DTS_PROJECTION, &d3d_mat);

#else

    d3d->SetTransform(D3DTS_VIEW, &m_mViewing);
    d3d->SetTransform(D3DTS_WORLD, &m_mWorld);
    d3d->SetTransform(D3DTS_PROJECTION, &m_mProjection);

#endif
}

void
D3DOverdrawWindow::
SetupViewport(void)
{
    LPDIRECT3DSURFACE9 back;
    d3d->GetBackBuffer(0, 0, D3DBACKBUFFER_TYPE_MONO, &back);
    D3DSURFACE_DESC desc;
    back->GetDesc(&desc);
    back->Release();
    D3DVIEWPORT9 full;
    full.X = full.Y = 0;
    full.Width = desc.Width;
    full.Height = desc.Height;
    full.MinZ = 0;
    full.MaxZ = 1;
    d3d->SetViewport(&full);
}

void
D3DOverdrawWindow::
SetCluster(const std::vector<int>* pCluster, const std::vector<int>* pClusterStart)
{
    m_pCluster = pCluster;
    m_pClusterStart = pClusterStart;
}

void
D3DOverdrawWindow::
SetupDraw(int iViewpoint)
{
    SetupViewport();
    SetupWorld();
    SetupView(iViewpoint);
    SetupProjection();
    SetupTransforms();
    SetupUniforms();
    Clear();
}

void
D3DOverdrawWindow::
SetupUniforms(void)
{
    d3d->SetRenderState(D3DRS_ZENABLE, TRUE);
    d3d->SetRenderState(D3DRS_ZWRITEENABLE, TRUE);
    d3d->SetRenderState(D3DRS_LIGHTING, FALSE);
    d3d->SetRenderState(D3DRS_CULLMODE, D3DCULL_CW);
    d3d->SetRenderState(D3DRS_ZFUNC, D3DCMP_LESS);
    d3d->SetRenderState(D3DRS_COLORWRITEENABLE, FALSE);
}

int
D3DOverdrawWindow::
Graph(std::vector<t_edge>& Edge)
{
    m_iTested = 0;
    m_iRendered = 0;
    d3d->BeginScene();

    for (int i = 0; i < static_cast<int>(m_pClusterStart->size()) - 1; i++)
    {
        for (int j = i + 1; j < static_cast<int>(m_pClusterStart->size()) - 1 ; j++)
        {
            int cij = Loop(i, j);
            //debugf("%d %d -> %d", i, j, cij);

            int cji = Loop(j, i);

            //debugf(("%d %d -> %d", j, i, cji));
            if (cij > cji)
            {
                t_edge e = {j, i, cij - cji};

                Edge.push_back(e);
            }
            else if (cij < cji)
            {
                t_edge e = {i, j, cji - cij};

                Edge.push_back(e);
            }
        }
    }

    /*
    printf("p %d %d\n", m_pClusterStart->GetSize()-1, Edge.GetSize());
    for (int i = 0; i < Edge.GetSize(); i++)
        printf("a %d %d %d\n", Edge[i].from, Edge[i].to, Edge[i].cost);
    */
    d3d->EndScene();
    return 1;
}

int
D3DOverdrawWindow::
Object(float& fOverdraw, float& fOverdrawMax)
{
    d3d->BeginScene();
    bool ok = NormalizedLoop(fOverdraw, fOverdrawMax);
    d3d->EndScene();

    return (ok) ? 1 : 0;
}

int
D3DOverdrawWindow::
Display(void)
{
    return 1;
}

void
D3DOverdrawWindow::
Clear(void)
{
    D3DVIEWPORT9 old;
    d3d->GetViewport(&old);
    LPDIRECT3DSURFACE9 back;
    d3d->GetBackBuffer(0, 0, D3DBACKBUFFER_TYPE_MONO, &back);
    D3DSURFACE_DESC desc;
    back->GetDesc(&desc);
    back->Release();
    D3DVIEWPORT9 full;
    full.X = full.Y = 0;
    full.Width = desc.Width;
    full.Height = desc.Height;
    full.MinZ = 0;
    full.MaxZ = 1;
    d3d->SetViewport(&full);
    d3d->Clear(0, NULL,  D3DCLEAR_TARGET | D3DCLEAR_ZBUFFER,
               //d3d->Clear(0, NULL,  D3DCLEAR_ZBUFFER,
               D3DCOLOR_XRGB(0, 0, 0), 1.0f, 0);
    d3d->SetViewport(&old);
}

void
D3DOverdrawWindow::
DrawCluster(int iCluster)
{
    if (!m_VB || !m_VD | !m_IB) { return; }

    // set render states
    d3d->SetVertexDeclaration(m_VD);
    d3d->SetStreamSource(0, m_VB, 0, sizeof(VERTEX));
    d3d->SetIndices(m_IB);
    d3d->SetRenderState(D3DRS_CULLMODE, (m_bCullCCW) ? D3DCULL_CCW : D3DCULL_CW);
    // Draw selected cluster
    d3d->DrawIndexedPrimitive(D3DPT_TRIANGLELIST, 0, 0, m_nVerts,
                              (*m_pClusterStart)[iCluster] * 3,
                              (*m_pClusterStart)[iCluster + 1] - (*m_pClusterStart)[iCluster]);
}

void
D3DOverdrawWindow::
DrawComplement(int iClusterA, int iClusterB)
{
    int a = min(iClusterA, iClusterB);
    int b = max(iClusterA, iClusterB);

    if (!m_VB || !m_VD | !m_IB) { return; }

    // set render states
    d3d->SetVertexDeclaration(m_VD);
    d3d->SetStreamSource(0, m_VB, 0, sizeof(VERTEX));
    d3d->SetIndices(m_IB);
    d3d->SetRenderState(D3DRS_CULLMODE, (m_bCullCCW) ? D3DCULL_CCW : D3DCULL_CW);
    // Draw selected cluster
    int nTris;

    if ((nTris = (*m_pClusterStart)[a] - (*m_pClusterStart)[0]) > 0)
    {
        d3d->DrawIndexedPrimitive(D3DPT_TRIANGLELIST, 0, 0, m_nVerts, 0, nTris);
    }

    if ((nTris = (*m_pClusterStart)[b] - (*m_pClusterStart)[a + 1]) > 0)
    {
        d3d->DrawIndexedPrimitive(D3DPT_TRIANGLELIST, 0, 0, m_nVerts, (*m_pClusterStart)[a + 1] * 3, nTris);
    }

    if ((nTris = m_nTris - (*m_pClusterStart)[b + 1]) > 0)
    {
        d3d->DrawIndexedPrimitive(D3DPT_TRIANGLELIST, 0, 0, m_nVerts, (*m_pClusterStart)[b + 1] * 3, nTris);
    }
}

HRESULT
D3DOverdrawWindow::
DrawModel(void)
{
    if (!m_VB || !m_VD | !m_IB) { return E_FAIL; }

    // set render states
    d3d->SetVertexDeclaration(m_VD);
    d3d->SetStreamSource(0, m_VB, 0, sizeof(VERTEX));
    d3d->SetIndices(m_IB);
    d3d->SetRenderState(D3DRS_CULLMODE, (m_bCullCCW) ? D3DCULL_CCW : D3DCULL_CW);
    // Draw entire mesh
    return d3d->DrawIndexedPrimitive(D3DPT_TRIANGLELIST, 0, 0,
                                     m_nVerts, 0, m_nTris);
}

int
D3DOverdrawWindow::
Loop(int iClusterA, int iClusterB)
{
    int nOverdraw = 0;
    DWORD numberOfPixelsDrawn;
    int j = 0;
    SetupDraw(0);

    for (unsigned int iViewpoint = 0; iViewpoint < m_nViewpointCount; iViewpoint++)
    {
        SetupView(iViewpoint);
        m_iTested++;

        if (!CheckIsect(iClusterA, iClusterB))
        {
            continue;
        }

        m_iRendered++;
        SetupTransforms();
        d3d->Clear(0, NULL,  D3DCLEAR_ZBUFFER,
                   D3DCOLOR_XRGB(0, 0, 0), 1.0f, 0);

        //Add this to remove triple dependencies
        //DrawComplement(iClusterA, iClusterB);

        // Add an end marker to the command buffer queue.
        m_pOcclusionQuery[j]->Issue(D3DISSUE_BEGIN);
        // Draw scene
        DrawCluster(iClusterA);
        DrawCluster(iClusterB);
        // Add an end marker to the command buffer queue.
        m_pOcclusionQuery[j]->Issue(D3DISSUE_END);
        // Force the driver to execute the commands from the command buffer.
        // Empty the command buffer and wait until the GPU is idle.
        j++;

        if (j == NUM_QUERIES)
        {
            for (j = 0; j < NUM_QUERIES; j++)
            {
                while (S_FALSE == m_pOcclusionQuery[j]->GetData(&numberOfPixelsDrawn,
                                                                sizeof(DWORD), D3DGETDATA_FLUSH))
                    ;

                nOverdraw += numberOfPixelsDrawn;
            }

            j = 0;
        }
    }

    int jnum = j;

    for (int j = 0; j < jnum; j++)
    {
        while (S_FALSE == m_pOcclusionQuery[j]->GetData(&numberOfPixelsDrawn,
                                                        sizeof(DWORD), D3DGETDATA_FLUSH))
            ;

        nOverdraw += numberOfPixelsDrawn;
    }

    return nOverdraw;
}

int
D3DOverdrawWindow::
Loop(void)
{
    int nOverdraw = 0;
    IDirect3DQuery9* pOcclusionQuery;
    DWORD numberOfPixelsDrawn;
    d3d->CreateQuery(D3DQUERYTYPE_OCCLUSION, &pOcclusionQuery);

    for (unsigned int iViewpoint = 0; iViewpoint < m_nViewpointCount;
         iViewpoint++)
    {
        // Add an end marker to the command buffer queue.
        pOcclusionQuery->Issue(D3DISSUE_BEGIN);
        // Draw scene
        SetupDraw(iViewpoint);
        DrawModel();
        d3d->EndScene();
        d3d->Present(NULL, NULL, NULL, NULL);
        // Add an end marker to the command buffer queue.
        pOcclusionQuery->Issue(D3DISSUE_END);

        // Force the driver to execute the commands from the command buffer.
        // Empty the command buffer and wait until the GPU is idle.
        while (S_FALSE == pOcclusionQuery->GetData(&numberOfPixelsDrawn,
                                                   sizeof(DWORD), D3DGETDATA_FLUSH))
            ;

        nOverdraw += numberOfPixelsDrawn;
    }

    pOcclusionQuery->Release();
    return nOverdraw;
}

bool
D3DOverdrawWindow::
NormalizedLoop(float& fOverdraw, float& fOverdrawMax)
{
    int nOverdraw = 0;
    int nOverdrawPix = 0;
    fOverdrawMax = 0;
    DWORD numberOfPixelsDrawn;
    DWORD numberOfPixelsDrawnPix;
    SetupDraw(0);

    for (unsigned int iViewpoint = 0; iViewpoint < m_nViewpointCount; iViewpoint += NUM_QUERIES)
    {
        for (unsigned int j = 0; j < NUM_QUERIES && iViewpoint + j < m_nViewpointCount; j++)
        {
            SetupView(iViewpoint + j);
            SetupTransforms();
            d3d->Clear(0, NULL,  D3DCLEAR_ZBUFFER,
                       D3DCOLOR_XRGB(0, 0, 0), 1.0f, 0);
            // Add an end marker to the command buffer queue.
            m_pOcclusionQuery[j]->Issue(D3DISSUE_BEGIN);

            // Draw scene
            if (FAILED(DrawModel()))
            {
                return false;
            }

            // Add an end marker to the command buffer queue.
            m_pOcclusionQuery[j]->Issue(D3DISSUE_END);

            // Add an end marker to the command buffer queue.
            d3d->SetRenderState(D3DRS_ZFUNC, D3DCMP_EQUAL);
            m_pOcclusionQueryPix[j]->Issue(D3DISSUE_BEGIN);

            // Draw scene
            if (FAILED(DrawModel()))
            {
                return false;
            }

            // Add an end marker to the command buffer queue.
            m_pOcclusionQueryPix[j]->Issue(D3DISSUE_END);
            d3d->SetRenderState(D3DRS_ZFUNC, D3DCMP_LESS);
        }

        for (unsigned int j = 0; j < NUM_QUERIES && iViewpoint + j < m_nViewpointCount; j++)
        {
            // Force the driver to execute the commands from the command buffer.
            // Empty the command buffer and wait until the GPU is idle.
            while (S_FALSE == m_pOcclusionQuery[j]->GetData(&numberOfPixelsDrawn,
                                                            sizeof(DWORD), D3DGETDATA_FLUSH))
                ;

            nOverdraw += numberOfPixelsDrawn;

            while (S_FALSE == m_pOcclusionQueryPix[j]->GetData(&numberOfPixelsDrawnPix,
                                                               sizeof(DWORD), D3DGETDATA_FLUSH))
                ;

            nOverdrawPix += numberOfPixelsDrawnPix;

            if (numberOfPixelsDrawnPix > 0)
            {
                fOverdrawMax = max(fOverdrawMax, numberOfPixelsDrawn / (float)numberOfPixelsDrawnPix);
            }
        }
    }

    if (nOverdrawPix > 0)
    {
        fOverdraw = nOverdraw / (float)nOverdrawPix;
    }
    else
    {
        fOverdraw = 0;
    }

    return true;
}

int
D3DOverdrawWindow::
LostDevice(void)
{
    if (m_VB) { m_VB->Release(); }

    if (m_IB) { m_IB->Release(); }

    if (m_VD) { m_VD->Release(); }

    m_VD = NULL;
    m_VB = NULL;
    m_IB = NULL;

    for (int i = 0; i < NUM_QUERIES; i++)
    {
        if (m_pOcclusionQuery[i])
        {
            m_pOcclusionQuery[i]->Release();
            m_pOcclusionQuery[i] = NULL;
        }

        if (m_pOcclusionQueryPix[i])
        {
            m_pOcclusionQueryPix[i]->Release();
            m_pOcclusionQueryPix[i] = NULL;
        }
    }

    return 1;
}

void
D3DOverdrawWindow::
Reshape(int w, int h)
{
    Superclass::Reshape(w, h);
    SetupViewport();
    PostRedisplay();
}

int
D3DOverdrawWindow::
SetIB(void)
{
    if (d3d == NULL)
    {
        return 1;
    }

    // create index buffer with triangles
    void* p = NULL;
    m_nTris = static_cast<int>(m_pSoup->t().size());

    if (m_IB)
    {
        m_IB->Release();
    }

    if (FAILED(d3d->CreateIndexBuffer(3 * m_nTris * sizeof(int), D3DUSAGE_WRITEONLY, D3DFMT_INDEX32,
                                      D3DPOOL_DEFAULT, &m_IB, NULL))) { return 0; }

    if (FAILED(m_IB->Lock(0, 0, (void**)&p, 0))) { return 0; }

    for (int i = 0; i < m_nTris; i++)
    {
        int* ip = (int*) p;
        ip[0] = m_pSoup->t(i)[0];
        ip[1] = m_pSoup->t(i)[1];
        ip[2] = m_pSoup->t(i)[2];
        p = &ip[3];
    }

    m_IB->Unlock();
    return 1;
}

int
D3DOverdrawWindow::
SetVB(void)
{
    if (d3d == NULL)
    {
        return 1;
    }

    m_nVerts = static_cast<int>(m_pSoup->v().size());

    if (m_VB)
    {
        m_VB->Release();
        m_VB = NULL;
    }

    if (FAILED(d3d->CreateVertexBuffer(sizeof(VERTEX)*m_nVerts, D3DUSAGE_WRITEONLY, 0,
                                       D3DPOOL_DEFAULT, &m_VB, NULL))) { return 0; }

    void* p = NULL;

    if (FAILED(m_VB->Lock(0, 0, (void**)&p, 0))) { return 0; }

    for (int i = 0; i < m_nVerts; i++)
    {
        VERTEX* v = (VERTEX*) p;
        v->x = m_pSoup->v(i)[0];
        v->y = m_pSoup->v(i)[1];
        v->z = m_pSoup->v(i)[2];
        p = &v[1];
    }

    m_VB->Unlock();
    return 1;
}

int
D3DOverdrawWindow::
SetVD(void)
{
    if (d3d == NULL)
    {
        return 1;
    }

    if (m_VD)
    {
        m_VD->Release();
        m_VD = NULL;
    }

    // create the vertex description
    D3DVERTEXELEMENT9 d[] =
    {
        {
            0, 0,  D3DDECLTYPE_FLOAT3,  D3DDECLMETHOD_DEFAULT,
            D3DDECLUSAGE_POSITION, 0
        },
        D3DDECL_END()
    };
    d3d->CreateVertexDeclaration(d, &m_VD);
    return 1;
}

int
D3DOverdrawWindow::
SetQuery(void)
{
    if (d3d == NULL)
    {
        return 1;
    }

    for (int i = 0; i < NUM_QUERIES; i++)
    {
        if (m_pOcclusionQuery[i])
        {
            m_pOcclusionQuery[i]->Release();
            m_pOcclusionQuery[i] = NULL;
        }

        if (m_pOcclusionQueryPix[i])
        {
            m_pOcclusionQueryPix[i]->Release();
            m_pOcclusionQueryPix[i] = NULL;
        }

        d3d->CreateQuery(D3DQUERYTYPE_OCCLUSION, &m_pOcclusionQuery[i]);
        d3d->CreateQuery(D3DQUERYTYPE_OCCLUSION, &m_pOcclusionQueryPix[i]);
    }

    return 1;
}

int
D3DOverdrawWindow::
ResetDevice(void)
{
    Superclass::ResetDevice();

    if (!SetQuery())
    {
        return 0;
    }

    if (!m_pSoup) { return 1; }

    m_pSoup->ComputeNormals(); //TODO: check if we need this

    // create vertex buffer
    if (!SetVB())
    {
        return 0;
    }

    if (!SetIB())
    {
        return 0;
    }

    if (!SetVD())
    {
        return 0;
    }

    return 1;
}

void
D3DOverdrawWindow::
Fit(void)
{
    if (!m_pSoup)
    {
        m_fSize = 1;
        m_vCenter = Vector3();
    }
    else
    {
        BBoxFit(m_pSoup->v(), &m_vCenter, &m_fSize);
    }
}

void
D3DOverdrawWindow::
SetupProjection(void)
{
    int w = GetWidth(), h = GetHeight();

#ifdef _DX11_1_
    if (w < h)
        m_mProjection = DirectX::XMMatrixOrthographicOffCenterRH(
            -0.5f, 0.5f, -0.5f * h / w, 0.5f * h / w, 0, 2);
    else
        m_mProjection = DirectX::XMMatrixOrthographicOffCenterRH(
            -0.5f * w / h, 0.5f * w / h, -0.5f, 0.5f, 0, 2);
#else
    if (w < h)
        D3DXMatrixOrthoOffCenterRH(&m_mProjection,
                                   -0.5f, 0.5f, -0.5f * h / w, 0.5f * h / w, 0, 2);
    else
        D3DXMatrixOrthoOffCenterRH(&m_mProjection,
                                   -0.5f * w / h, 0.5f * w / h, -0.5f, 0.5f, 0, 2);
#endif
}

int
D3DOverdrawWindow::
ReleaseBuffers(void)
{
    LostDevice();
    return 1;
}

int
D3DOverdrawWindow::
CheckIsect(int iClusterA, int iClusterB)
{
#ifdef _DX11_1_
    DirectX::XMMATRIX mWorldView;
    mWorldView = DirectX::XMMatrixMultiply(m_mWorld, m_mViewing);
#else
    D3DXMATRIXA16 mWorldView;
    D3DXMatrixMultiply(&mWorldView, &m_mWorld, &m_mViewing);
#endif

#if 0
    D3DXVECTOR4 vTransA, vTransB;
    D3DXVec3Transform(&vTransA, (D3DXVECTOR3*)&m_vClusterCenter[iClusterA][0], &mWorldView);
    D3DXVec3Transform(&vTransB, (D3DXVECTOR3*)&m_vClusterCenter[iClusterB][0], &mWorldView);
    vTransA /= vTransA.w;
    vTransB /= vTransB.w;
    vTransA.z = 0;
    vTransB.z = 0;

    D3DXVECTOR4 v = vTransA - vTransB;

    if (D3DXVec4Length(&v) > (m_fClusterSize[iClusterA] + m_fClusterSize[iClusterB]) / 2.f)
    {
        return 0;
    }
    else
    {
        return 1;
    }

#else
#ifdef _DX11_1_
    DirectX::XMVECTOR
#else
    D3DXVECTOR4
#endif //_DX11_1_
    vTransA, vTransB;
    float xminA = 2e30f, yminA = 2e30f, xmaxA = -2e30f, ymaxA = -2e30f;
    float xminB = 2e30f, yminB = 2e30f, xmaxB = -2e30f, ymaxB = -2e30f;

    for (int i = -1; i < 2; i += 2)
        for (int j = -1; j < 2; j += 2)
            for (int k = -1; k < 2; k += 2)
            {
                Vector3 v = m_vClusterCenter[iClusterA]
                            + Vector3(m_vClusterDiag[iClusterA][0] / 2.f * i,
                                      m_vClusterDiag[iClusterA][1] / 2.f * j,
                                      m_vClusterDiag[iClusterA][2] / 2.f * k);

#ifdef _DX11_1_
                //vTransA
                auto xmv = DirectX::XMVectorSet(v[0], v[1], v[2], 0);
                vTransA = DirectX::XMVector3Transform(xmv, mWorldView);
                
                auto w = DirectX::XMVectorGetW(vTransA);
                auto x = DirectX::XMVectorGetX(vTransA);
                auto y = DirectX::XMVectorGetY(vTransA);
                auto z = DirectX::XMVectorGetZ(vTransA);
                
                vTransA = DirectX::XMVectorSet(x / w, y / w, z / w, 1);

                x = DirectX::XMVectorGetX(vTransA);
                y = DirectX::XMVectorGetY(vTransA);
                
                xminA = min(xminA, x);
                yminA = min(yminA, y);
                xmaxA = max(xmaxA, x);
                ymaxA = max(ymaxA, y);

                v = m_vClusterCenter[iClusterB]
                    + Vector3(m_vClusterDiag[iClusterB][0] / 2.f * i,
                        m_vClusterDiag[iClusterB][1] / 2.f * j,
                        m_vClusterDiag[iClusterB][2] / 2.f * k);

                //vTransB
                xmv = DirectX::XMVectorSet(v[0], v[1], v[2], 0);
                vTransB = DirectX::XMVector3Transform(xmv, mWorldView);

                w = DirectX::XMVectorGetW(vTransB);
                x = DirectX::XMVectorGetX(vTransB);
                y = DirectX::XMVectorGetY(vTransB);
                z = DirectX::XMVectorGetZ(vTransB);

                vTransB = DirectX::XMVectorSet(x / w, y / w, z / w, 1);

                x = DirectX::XMVectorGetX(vTransB);
                y = DirectX::XMVectorGetY(vTransB);

                xminB = min(xminB, x);
                yminB = min(yminB, y);
                xmaxB = max(xmaxB, x);
                ymaxB = max(ymaxB, y);

#else
                D3DXVec3Transform(&vTransA, (D3DXVECTOR3*)&v[0], &mWorldView);
                vTransA /= vTransA.w;

                xminA = min(xminA, vTransA.x);
                yminA = min(yminA, vTransA.y);
                xmaxA = max(xmaxA, vTransA.x);
                ymaxA = max(ymaxA, vTransA.y);

                v = m_vClusterCenter[iClusterB]
                    + Vector3(m_vClusterDiag[iClusterB][0] / 2.f * i,
                        m_vClusterDiag[iClusterB][1] / 2.f * j,
                        m_vClusterDiag[iClusterB][2] / 2.f * k);

                D3DXVec3Transform(&vTransB, (D3DXVECTOR3*)&v[0], &mWorldView);
                vTransB /= vTransB.w;
                xminB = min(xminB, vTransB.x);
                yminB = min(yminB, vTransB.y);
                xmaxB = max(xmaxB, vTransB.x);
                ymaxB = max(ymaxB, vTransB.y);

#endif //_DX11_1_

            }

    if (xminA > xmaxB || xminB > xmaxA || yminA > ymaxB || yminB > ymaxA)
    {
        return 0;
    }
    else
    {
        return 1;
    }

#endif
}

void
D3DOverdrawWindow::
FitClusters(void)
{

    for (int i = 0; i < static_cast<int>(m_pClusterStart->size()) - 1; i++)
    {
        Vector3 vCenter;
        Vector3 vDiag;
        float fSize;

        // this ugly casting is my fault.  I'm doing it so that we don't need to make a redundant copy of the index-data
        // because if we do that, we have to deal with the possibility of running out of memory. -- JDB
        BBoxFit(m_pSoup->v(), (int*)&m_pSoup->t(0),
                (*m_pClusterStart)[i] * 3,
                (*m_pClusterStart)[i + 1] - (*m_pClusterStart)[i],
                &vCenter, &vDiag, &fSize);
        m_vClusterCenter.push_back(vCenter);
        m_vClusterDiag.push_back(vDiag);
        m_fClusterSize.push_back(fSize);
    }
}
