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

#include <GL/glew.h>
#include <GL/wglew.h>
#include <jni.h>

#include "D3DSharedTexture.h"

#include <utils/Logger.h>

#include <DriftFX/math/Vec2.h>


#include "SharedTexture.h"
#include "win32/Error.h"
#include "win32/D3D9ExContext.h"
#include "gl/wgl/WGLGLContext.h"

#include <prism/PrismBridge.h>

#include <iostream>

#include "Configuration.h"

#include <win32/D3D9Texture.h>

#include <prism/d3d/include/java8/D3DContext.h>

#include <prism/d3d/D3DPrismBridge.h>

#include <FrameManager.h>

using namespace std;

using namespace driftfx;
using namespace driftfx::math;

using namespace driftfx::internal;
using namespace driftfx::internal::gl::wgl;

using namespace driftfx::internal::prism;
using namespace driftfx::internal::prism::d3d;


mutex D3DSharedTexture::sharedDevicesMutex;
map<pair<IDirect3DDevice9Ex*, HGLRC>, HANDLE> D3DSharedTexture::sharedDevices;
map<HANDLE, int> D3DSharedTexture::sharedDevicesUsageCount;

HANDLE D3DSharedTexture::OpenSharedDevice(D3D9ExContext* d3dContext, GLContext* glContext) {
	//LogDebug("OpenSharedDevice( " << d3dContext << ", " << glContext << ")");
	IDirect3DDevice9Ex* d3dDevice = d3dContext->Device();
	HGLRC glContxtHandle = static_cast<WGLGLContext*>(glContext)->GetHandle();

	if (!glContext->IsCurrent()) {
		LogError("NV_DX_interop: OpenSharedDevice called with wrong current gl context; This is FATAL!");
	}

	sharedDevicesMutex.lock();

	pair<IDirect3DDevice9Ex*, HGLRC> key = make_pair(d3dDevice, glContxtHandle);

	if (sharedDevices.count( key ) != 1) {
		//LogDebug("NV_DX_interop: Opening Device " << d3dDevice);
		HANDLE nh;
		WERR(nh = wglDXOpenDeviceNV(d3dDevice);)
		sharedDevices[key] = nh;
		LogDebug("               -> " << nh);
	}

	HANDLE h = sharedDevices[key];

	if (sharedDevicesUsageCount.count( h ) == 0) {
		sharedDevicesUsageCount[h] = 0;
	}

	sharedDevicesUsageCount[h] = sharedDevicesUsageCount[h] + 1;

	sharedDevicesMutex.unlock();
	//LogDebug("OpenSharedDevice returns " << h);
	return h;
}

void D3DSharedTexture::CloseSharedDevice(D3D9ExContext* d3dContext, GLContext* glContext) {
	IDirect3DDevice9Ex* d3dDevice = d3dContext->Device();
	HGLRC glContxtHandle = static_cast<WGLGLContext*>(glContext)->GetHandle();

	if (!glContext->IsCurrent()) {
		LogError("NV_DX_interop: CloseSharedDevice called with wrong current gl context; This is FATAL!");
	}

	sharedDevicesMutex.lock();

	pair<IDirect3DDevice9Ex*, HGLRC> key = make_pair(d3dDevice, glContxtHandle);

	if (sharedDevices.count( key ) == 1) {
		HANDLE h = sharedDevices[key];
		int usages = sharedDevicesUsageCount[h];
		usages -= 1;

		if (usages == 0) {
			//LogDebug("NV_DX_interop: Closing Device: " << d3dDevice);
			WERR(wglDXCloseDeviceNV(h););
			sharedDevices.erase(key);
			sharedDevicesUsageCount.erase(h);
			//LogDebug("               -> closed.");
		}
		else {
			sharedDevicesUsageCount[h] = usages;
			LogDebug("NV_DX_interop: Not Closing Device: " << d3dDevice << " still used by " << usages << " others");
		}
	}
	else {
		LogError("NV_DX_interop: No open device found!");
	}

	sharedDevicesMutex.unlock();
}

D3DSharedTexture::D3DSharedTexture(GLContext* glContext, D3D9ExContext* d3dContext, Vec2ui size) :
	SharedTexture(glContext, size),
	d3dContext(d3dContext),
	d3dTexture(nullptr),
	hDevice(nullptr),
	hObject(nullptr) {

	Allocate();
}

D3DSharedTexture::~D3DSharedTexture() {
	LogDebug("destroying d3d texture");

	Release();
}

ShareData* D3DSharedTexture::CreateShareData() {
	WDDMShareData* frameData = new WDDMShareData();
	frameData->shareHandle = d3dTexture->GetShareHandle();
	return frameData;
}

void D3DSharedTexture::Allocate() {
	d3dTexture = new D3D9Texture(d3dContext, size.x, size.y);
	glTexture = new GLTexture(glContext, size.x, size.y);

	hDevice = OpenSharedDevice(d3dContext, glContext);
	WERR(wglDXSetResourceShareHandleNV(d3dTexture->GetTexture(), d3dTexture->GetShareHandle()); );
	WERR(hObject = wglDXRegisterObjectNV(hDevice, d3dTexture->GetTexture(), glTexture->Name(), GL_TEXTURE_2D, WGL_ACCESS_READ_WRITE_NV); );
}

void D3DSharedTexture::Release() {
	WERR(wglDXUnregisterObjectNV(hDevice, hObject); );
	delete glTexture; glTexture = nullptr;
	CloseSharedDevice(d3dContext, glContext);

	delete d3dTexture; d3dTexture = nullptr;
}

bool D3DSharedTexture::BeforeRender() {
	bool success = false;
	WERR(success = wglDXLockObjectsNV(hDevice, 1, &hObject); );
	return success;
}


bool D3DSharedTexture::AfterRender() {
	bool success = false;
	WERR(success = wglDXUnlockObjectsNV(hDevice, 1, &hObject); );
	return success;
}

long long D3DSharedTexture::GetShareHandle() {
	return (long long) d3dTexture->GetShareHandle();
}

int D3DSharedTexture::OnTextureCreated(PrismBridge* bridge, Frame* frame, jobject fxTexture) {
	
	ShareData* data = frame->GetData();
	WDDMShareData* wddmData = (WDDMShareData*)data;

	HANDLE shareHandle = wddmData->shareHandle;
	
	// recreate the javafx d3d texture as shared texture


	auto d3dBridge = static_cast<D3DPrismBridge*>(bridge);
	auto jfxContext = d3dBridge->GetJfxContext();

	// find the internal handle of the d3d resource
	auto d3dHandle = D3DPrismBridge::GetD3DResourceHandle(fxTexture);

	java8::D3DResource* d3dResource = (java8::D3DResource*) d3dHandle;

	d3dResource->pSurface->Release();
	d3dResource->pTexture->Release();
	d3dResource->pResource->Release();

	d3dResource->pSurface = nullptr;
	d3dResource->pTexture = nullptr;
	d3dResource->pResource = nullptr;

	IDirect3DTexture9* pTexture = nullptr;

	/*auto sharedTex = frame->GetSharedTexture();
	auto d3dSharedTex = static_cast<D3DSharedTexture*>(sharedTex);
	auto shareHandle = d3dSharedTex->GetShareHandle();

	HANDLE sh = (HANDLE)shareHandle;*/
	//sh = nullptr;

	int w = d3dResource->desc.Width;
	int h = d3dResource->desc.Height;

	WERR(;);

	LogDebug(frame->ToString() << "recreate shared fx texture ( w: " << dec << w << ", h: " << dec << h << ", shareHandle: " << hex << shareHandle << " )")
		HRESULT res = jfxContext->Device()->CreateTexture(
			w, h,
			0, D3DUSAGE_DYNAMIC,
			D3DFMT_A8R8G8B8,
			D3DPOOL_DEFAULT,
			&pTexture,
			&shareHandle);
	LogDebug(" Handle: " << hex << pTexture);

	if (FAILED(res)) {
		LogError(HRESULT_CODE(res) << ": " << ::ToString(HRESULT_CODE(res)));
		return res;
	}

	d3dResource->pResource = pTexture;
	d3dResource->pResource->AddRef();
	d3dResource->pTexture = (IDirect3DTexture9*)d3dResource->pResource;
	d3dResource->pTexture->GetSurfaceLevel(0, &d3dResource->pSurface);
	if (d3dResource->pSurface != nullptr) {
		d3dResource->pSurface->GetDesc(&d3dResource->desc);
	}

	return 0;
}
//
//#include "D3DSharedFallbackTexture.h"
//
//SharedTexture* SharedTexture::Create(GLContext* glContext, Context* fxContext, SurfaceData surfaceData, Vec2ui textureSize) {
//	D3D9ExContext* d3dContext = static_cast<D3D9ExContext*>(fxContext);
//	
//	if (Configuration::IsUseWinFallback()) {
//		return new D3DSharedFallbackTexture(glContext, d3dContext, surfaceData, textureSize);
//	}
//	else {
//		return new D3DSharedTexture(glContext, d3dContext, surfaceData, textureSize);
//	}
//
//
//}

