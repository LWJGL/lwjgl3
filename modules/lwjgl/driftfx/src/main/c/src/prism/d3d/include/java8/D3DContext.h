/*
 * Copyright (c) 2019 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 */
#ifndef PRISM_D3D_INCLUDE_JAVA8_D3DCONTEXT_H_
#define PRISM_D3D_INCLUDE_JAVA8_D3DCONTEXT_H_

#define D3D_DEBUG_INFO
#include <d3d9.h>

namespace java8 {


#define NUM_TEXTURE_CACHE 8

// copied from JAVAFX\modules\graphics\src\main\native-prism-d3d\D3DContext.h
// valid only for JRE8 update 60 to update 152
// needed for memory layout to aquire the real context pointers
struct D3DContext
{
	struct FrameStats {
		int numTrianglesDrawn;
		int numDrawCalls;
		int numBufferLocks;
		int numTextureLocks;
		int numTextureTransferBytes;
		int numSetTexture;
		int numSetPixelShader;
		int numRenderTargetSwitch;
	} stats;

	struct State {
		bool wireframe;
		int cullMode;
	} state;

	IDirect3DVertexShader9 *pPassThroughVS;
	IDirect3DVertexDeclaration9 *pVertexDecl;
	IDirect3DIndexBuffer9 *pIndices;
	struct D3DVertexBufferResource  *pVertexBufferRes;

	D3DMATRIX world;
	D3DMATRIX projection;
	BOOL depthTest;
	float pixadjustx, pixadjusty;

	IDirect3DDevice9        *pd3dDevice;
	IDirect3DDevice9Ex      *pd3dDeviceEx;
	IDirect3DSurface9       *currentSurface;
	IDirect3D9              *pd3dObject;
	IDirect3D9Ex            *pd3dObjectEx;

	D3DPOOL defaulResourcePool;

	struct D3DResourceManager      *pResourceMgr;

	UINT adapterOrdinal;
	BOOL bIsHWRasterizer;

	D3DPRESENT_PARAMETERS   curParams;
	D3DCAPS9                devCaps;

	BOOL    bBeginScenePending;

	struct D3DPhongShader *phongShader;
	struct TextureUpdateCache {
		IDirect3DTexture9 *texture;
		IDirect3DSurface9 *surface;
		int width, height;
	} textureCache[NUM_TEXTURE_CACHE];
};

struct IManagedResource {
	void* virtualTable;

	IManagedResource* pPrev;
	IManagedResource* pNext;
};

struct D3DResource {
	IManagedResource managedResource;
	IDirect3DResource9*  pResource;
	IDirect3DSwapChain9* pSwapChain;
	IDirect3DSurface9*   pSurface;
	IDirect3DSurface9*   pDepthSurface;
	IDirect3DTexture9*   pTexture;

	D3DSURFACE_DESC      desc;
};

struct D3DResourceManager {
	D3DResource*      pBlitOSPSurface;
	D3DContext*       pCtx;
	IManagedResource* pHead;
};

}

#endif /* PRISM_D3D_INCLUDE_JAVA8_D3DCONTEXT_H_ */
