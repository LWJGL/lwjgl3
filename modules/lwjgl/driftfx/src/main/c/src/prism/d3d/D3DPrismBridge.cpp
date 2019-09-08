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

#include <utils/Logger.h>

#include "include/java8/D3DContext.h"
#include "D3DPrismBridge.h"
#include "D3DSharedTexture.h"
#include "D3DNativeSurface.h"

#include "NativeSurfaceRegistry.h"
#include "gl/wgl/WGLGLContext.h"
#include "win32/Error.h"

#include <utils/JNIHelper.h>

#include <iostream>
using namespace std;

using namespace driftfx::gl;

using namespace driftfx::internal;
using namespace driftfx::internal::gl::wgl;
using namespace driftfx::internal::prism;
using namespace driftfx::internal::prism::d3d;

void D3DPrismBridge::Initialize(jlong pContext) {
	PrismBridge::bridge = new D3DPrismBridge(pContext);
}

void D3DPrismBridge::Destroy() {
	delete static_cast<D3DPrismBridge*>(PrismBridge::bridge);
}

void * driftfx::internal::prism::d3d::D3DPrismBridge::GetD3DResourceHandle(jobject fxTexture)
{
	// TODO we could handle this purely in native code via jni calls
	JNIEnv* env = JNIHelper::GetJNIEnv(true);

	jclass cls = env->FindClass("org/eclipse/fx/drift/internal/GraphicsPipelineUtil$D3D");
	cls = (jclass)env->NewGlobalRef(cls);

	jmethodID getTextureHandle = env->GetStaticMethodID(cls, "getTextureHandle", "(Lcom/sun/prism/Texture;)J");

	//LogDebug("Calling now with " << cls << " / " << getTextureName << " / " << fxTexture);
	jlong val = env->CallStaticLongMethod(cls, getTextureHandle, fxTexture);
	//LogDebug(" Got " << val);
	return (void*)val;
}


void driftfx::internal::prism::d3d::D3DPrismBridge::UploadPixels(D3D9Texture* texture, byte* pixels) {
	auto width = texture->GetWidth();
	auto height = texture->GetHeight();

	//LogDebug("Upload Pixels " << hex << texture->GetShareHandle() << " w: " << dec << texture->GetWidth() << ", h: " << dec << texture->GetHeight());
	D3DLOCKED_RECT tmp;
	auto start = chrono::steady_clock::now();
	WERR(texture->GetTexture()->LockRect(0, &tmp, NULL, D3DLOCK_DISCARD));

	byte* rowBits = (byte*)tmp.pBits;
	int sourcePitch = width * 4 * sizeof(byte);
	for (unsigned int h = 0; h < height; h++) {

		int offset = h * sourcePitch;
		memcpy(rowBits, (pixels + offset), sourcePitch);
		rowBits += tmp.Pitch;
	}

	WERR(texture->GetTexture()->UnlockRect(0));
	auto end = chrono::steady_clock::now();
	LogDebug("Uploading " << dec << texture->GetWidth() * texture->GetHeight() << "px needed " << chrono::duration_cast<chrono::nanoseconds>(end - start).count() << "ns");

	// it seems if we lock the texture again in readonly it gets ready...
	// if we do not do this here it sometimes won't have any content..
	auto startSync = chrono::steady_clock::now();
	WERR(texture->GetTexture()->LockRect(0, &tmp, NULL, D3DLOCK_READONLY));

	//byte* data = (byte*) tmp.pBits;
	//LogDebug("1st D3D pixel: " << hex << (int)data[0] << (int)data[1] << (int)data[2] << (int)data[3]);

	WERR(texture->GetTexture()->UnlockRect(0));
	auto endSync = chrono::steady_clock::now();
	LogDebug("Relocking d3d tex for sync needed " << chrono::duration_cast<chrono::nanoseconds>(endSync - startSync).count() << "ns");
}

D3DPrismBridge::D3DPrismBridge(jlong pContext) :
	PrismBridge(nullptr) {
	LogDebug("D3DPrismBridge(" << pContext << ")")
	java8::D3DContext *context = (java8::D3DContext*) pContext;
	jfxContext = new D3D9ExContext("javafx", context->pd3dObjectEx, context->pd3dDeviceEx);
	defaultContext = new WGLGLContext("root");

	WGLGLContext* def = static_cast<WGLGLContext*>(defaultContext);
	LogDebug("def = " << def)
	WGLGLContext* test1 = new WGLGLContext("dummy", def);
	LogDebug("test1 = " << test1)
//	WGLContext* test2 = new WGLContext(test1);
//	LogDebug("test2 = " << test2)
}

int D3DPrismBridge::RecreateFXTexture(void* fxTexture, HANDLE shareHandle) {
	java8::D3DResource* d3dResource = (java8::D3DResource*) fxTexture;

	d3dResource->pSurface->Release();
	d3dResource->pTexture->Release();
	d3dResource->pResource->Release();

	d3dResource->pSurface = nullptr;
	d3dResource->pTexture = nullptr;
	d3dResource->pResource = nullptr;

	IDirect3DTexture9* pTexture = nullptr;

	HANDLE sh = (HANDLE) shareHandle;
	//sh = nullptr;

	int w = d3dResource->desc.Width;
	int h = d3dResource->desc.Height;

	WERR(;);

	LogDebug("RecreateFXTexture( w: " << dec << w << ", h: " << dec << h << ", shareHandle: " << hex << sh << " )")
	HRESULT res = jfxContext->Device()->CreateTexture(
			w, h,
			0, D3DUSAGE_DYNAMIC,
			D3DFMT_A8R8G8B8,
			D3DPOOL_DEFAULT,
			&pTexture,
			&sh);
	LogDebug(" Handle: " << hex << pTexture);

	if (FAILED(res)) {
		LogError(HRESULT_CODE(res) << ": " << ToString(HRESULT_CODE(res)));
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

D3DPrismBridge::~D3DPrismBridge() {
	LogDebug("~D3DPrismBridge()")
	delete jfxContext;
	delete defaultContext;
}

D3D9ExContext* D3DPrismBridge::GetJfxContext() {
	return jfxContext;
}

GLContext* D3DPrismBridge::CreateSharedContext() {
	LogDebug("CreateSharedContext()");
	return defaultContext->CreateSharedContext();
}

NativeSurface* D3DPrismBridge::CreateNativeSurface(long surfaceId, JNINativeSurface* api) {
	return new D3DNativeSurface(surfaceId, api);
}

