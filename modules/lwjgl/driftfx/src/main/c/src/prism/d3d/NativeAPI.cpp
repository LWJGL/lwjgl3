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

#include <jni.h>
#include <iostream>
using namespace std;

#include "include/java8/D3DContext.h"
#include "D3DPrismBridge.h"

#include "win32/D3D9Texture.h"

#include <utils/Logger.h>
#include <DriftFX/Texture.h>

using namespace driftfx;

using namespace driftfx::internal::win32;
using namespace driftfx::internal::prism;
using namespace driftfx::internal::prism::d3d;


extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nInitializeD3DPipeline(JNIEnv *env, jclass cls, jlong pContext) {
	LogDebug("nInitializeD3DPipeline(" << pContext << ")");
	D3DPrismBridge::Initialize(pContext);
}

extern "C" JNIEXPORT void JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nDestroyD3DPipeline(JNIEnv *env, jclass cls) {
	LogDebug("nDestroyD3DPipeline()");
	D3DPrismBridge::Destroy();
}

extern "C" JNIEXPORT jint JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nD3DRecreateTextureAsShared(JNIEnv* env, jclass cls, jobject fxTexture, jlong shareHandle) {
	jclass d3dTextureCls = env->FindClass("com/sun/prism/d3d/D3DTexture");
	if (!d3dTextureCls) return -1;
	jboolean isd3d = env->IsInstanceOf(fxTexture, d3dTextureCls);
	if (!isd3d) return -1;

	jmethodID getContextMth = env->GetMethodID(d3dTextureCls, "getContext", "()Lcom/sun/prism/d3d/D3DContext;");
	if (!getContextMth) return -1;
	jobject contextObj = env->CallObjectMethod(fxTexture, getContextMth);

	jclass d3dContextCls = env->FindClass("com/sun/prism/d3d/D3DContext");
	if (!d3dContextCls) return -1;
	jmethodID getContextHandleMth = env->GetMethodID(d3dContextCls, "getContextHandle", "()J");
	if (!getContextHandleMth) return -1;
	jlong contextHandle = env->CallLongMethod(contextObj, getContextHandleMth);
	if (!contextHandle) return -1;

	jmethodID getNativeSourceHandleMth = env->GetMethodID(d3dTextureCls, "getNativeSourceHandle", "()J");
	if (!getNativeSourceHandleMth) return -1;
	jlong fxResourceHandle = env->CallLongMethod(fxTexture, getNativeSourceHandleMth);
	if (!fxResourceHandle) return -1;


	D3DPrismBridge* bridge = static_cast<D3DPrismBridge*>(PrismBridge::Get());

	LogDebug("RECREATE TEXTURE")
	return bridge->RecreateFXTexture((void*) fxResourceHandle, (HANDLE) (void*) shareHandle);
}


extern "C" JNIEXPORT jlong JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nGetD3DTextureHandle(JNIEnv* env, jclass cls, jlong textureResourceHandle) {
	java8::D3DResource* fxTex = (java8::D3DResource*) (void*) textureResourceHandle;
	LogDebug("pointer: " << fxTex->pTexture);
	return (jlong) fxTex->pTexture;
}

extern "C" JNIEXPORT jlong JNICALL Java_org_eclipse_fx_drift_internal_NativeAPI_nD3DRecreateTexture(JNIEnv* env, jclass cls, jlong textureResourceHandle) {
	LogDebug("nD3DRecreateTexture " << textureResourceHandle)
	D3DPrismBridge* bridge = static_cast<D3DPrismBridge*>(PrismBridge::Get());

	java8::D3DResource* fxTex = (java8::D3DResource*) (void*) textureResourceHandle;

	fxTex->pSurface->Release();
	fxTex->pTexture->Release();
	fxTex->pResource->Release();

	fxTex->pSurface = nullptr;
	fxTex->pTexture = nullptr;
	fxTex->pResource = nullptr;

	HANDLE pSharedHandle = nullptr;

	Texture* newTex = bridge->GetJfxContext()->CreateTexture(fxTex->desc.Width, fxTex->desc.Height);
	D3D9Texture* n = static_cast<D3D9Texture*>(newTex);

	fxTex->pResource = n->GetTexture();
	fxTex->pResource->AddRef();
	fxTex->pTexture = (IDirect3DTexture9*)fxTex->pResource;
	fxTex->pTexture->GetSurfaceLevel(0, &fxTex->pSurface);
	if (fxTex->pSurface != nullptr) {
		fxTex->pSurface->GetDesc(&fxTex->desc);
	}
	LogDebug("newTex = " << fxTex->pTexture);
	return (jlong) newTex;
}
