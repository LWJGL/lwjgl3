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

#include <iostream>
#include <sstream>

#include <DriftFX/DriftFXSurface.h>
#include <DriftFX/math/Vec2.h>

#include "Common.h"
#include "JNINativeSurface.h"
#include "NativeSurface.h"
#include "SharedTexture.h"
#include "SharedTexturePool.h"
#include "prism/PrismBridge.h"

#include <utils/Logger.h>

#include <cmath>

#include <TransferModeManager.h>


using namespace std;

using namespace driftfx;
using namespace driftfx::math;
using namespace driftfx::gl;

using namespace driftfx::internal;
using namespace driftfx::internal::prism;

NativeSurface::NativeSurface(long surfaceId, JNINativeSurface* api) :
	surfaceId(surfaceId),
	api(api),
	context(nullptr),
	surfaceData(SurfaceData()),
	frameManager(surfaceId),
	texturePool() {
	LogDebug("NativeSurface constructor")

}

NativeSurface::~NativeSurface() {
	LogDebug("NativeSurface" << surfaceId << " destructor")
}

void NativeSurface::Initialize() {
	LogDebug("init GLContext");
	ostringstream s;
	s << "surface" << surfaceId;
	context = PrismBridge::Get()->GetDefaultContext()->CreateSharedContext(s.str());
}

void NativeSurface::Cleanup() {

	// TODO we need to make sure that every SharedTexture is gone
	// however atm fx holds the last texture until we send a new one..

//	// TODO send some kind of signal to tell FX we are going to dispose our textures
//	FrameData* frameData = new FrameData();
//	frameData->d3dSharedHandle = 0;
//	frameData->ioSurfaceHandle = 0;
//	frameData->glTextureName = 0;
//	frameData->textureSize = Vec2ui();
//
//	api->Present(*frameData);
//
//	delete frameData;

	//LogDebug("clean textures");
	//DisposeSharedTextures();

	// NOTE: since textures know their context and set it current upon deletion
	// we must ensure that all textures from a context are deleted before the context is deleted!


	// we need to clean the pools, since our context becomes invalid
	texturePoolMutex.lock();
	std::map<unsigned int, SharedTexturePool*>::iterator it;
	for (it = texturePool.begin(); it != texturePool.end(); it++) {
		auto pool = (*it).second;
		LogDebug("Deleting Texture Pool " << pool);
		delete pool;
	}
	texturePool.clear();
	LogDebug("Cleared pools " << texturePool.size());
	texturePoolMutex.unlock();

	LogDebug("clean GLContext");
	delete context;
	context = nullptr;

}

GLContext* NativeSurface::GetContext() {
	return context;
}

void NativeSurface::UpdateSurface(Vec2d size, Vec2d screenScale, Vec2d userScale, unsigned int transferMode) {
	SurfaceData newSurfaceData;
	newSurfaceData.size = size;
	newSurfaceData.screenScale = screenScale;
	newSurfaceData.userScale = userScale;
	newSurfaceData.transferMode = transferMode;

	surfaceData = newSurfaceData;
}

unsigned int NativeSurface::GetWidth() {
	return GetScaledSize().x;
}

unsigned int NativeSurface::GetHeight() {
	return GetScaledSize().y;
}

RenderTarget* NativeSurface::Acquire() {
	return Acquire(GetWidth(), GetHeight());
}

RenderTarget* NativeSurface::Acquire(driftfx::TransferMode* transferMode) {
	return Acquire(GetWidth(), GetHeight(), transferMode);
}


RenderTarget* NativeSurface::Acquire(Vec2ui size) {
	return Acquire(size, surfaceData.load());
}

RenderTarget* NativeSurface::Acquire(Vec2ui size, driftfx::TransferMode* transferMode) {
	auto data = surfaceData.load();
	auto copy = data;
	copy.transferMode = transferMode->Id();
	return Acquire(size, copy);
}

RenderTarget* NativeSurface::Acquire(unsigned int width, unsigned int height) {
	return Acquire(Vec2ui(width, height), surfaceData.load());
}


RenderTarget* NativeSurface::Acquire(unsigned int width, unsigned int height, driftfx::TransferMode* transferMode) {
	auto data = surfaceData.load();
	auto copy = data;
	copy.transferMode = transferMode->Id();
	return Acquire(Vec2ui(width, height), copy);
}

RenderTarget* NativeSurface::Acquire(math::Vec2ui size, SurfaceData surfaceData) {

	auto begin = std::chrono::steady_clock::now();
	PrismBridge* bridge = PrismBridge::Get();
	// in case the system was destroyed
	if (bridge == nullptr) {
		LogDebug("Could not acquire RenderTarget. Was the system destroyed?");
		return nullptr;
	}

	if (!GetContext()->IsCurrent()) {
		LogInfo("Setting context " << GetContext()->GetName() << " current");
		GetContext()->SetCurrent();
	}

	auto frame = frameManager.CreateFrame(surfaceData, size);
	frame->Begin("NativeSurface#Acquire");
	frame->acquireBegin = begin;

	LogDebug("Acquire " << frame->ToString() << "(" << size.x << ", " << size.y << ")");


	texturePoolMutex.lock();
	// create pool if needed
	if (texturePool.find(surfaceData.transferMode) == texturePool.end()) {
		auto mode = TransferModeManager::Instance()->GetTransferMode(surfaceData.transferMode);
		LogDebug("Creating Shared Texture Pool for surface " << surfaceId << " and mode " << mode->Name());
		auto pool = new SharedTexturePool(GetContext(), GetFxContext(), mode);
		texturePool[surfaceData.transferMode] = pool;
	}
	auto pool = texturePool[surfaceData.transferMode];
	texturePoolMutex.unlock();

	auto tex = pool->AcquireTexture(size);

	pool->DisposeUnusedTextures();

//	auto mode = TransferModeManager::Instance()->GetTransferMode(surfaceData.transferMode);
//
//	LogDebug("Creating it with " << mode->Name());
//
//	auto tex = mode->CreateSharedTexture(GetContext(), GetFxContext(), size);
	frame->SetSharedTexture(tex);

	if (!tex->BeforeRender()) {
		LogError("Failed to acquire surface!");
	}



	frame->acquireEnd = std::chrono::steady_clock::now();
	frame->End("NativeSurface#Acquire");
	frame->Begin("ClientRenderer");
	return frame;
}

void NativeSurface::DisposeFrame(long long frameId) {
	auto frame = frameManager.GetFrame(frameId);
	LogDebug("Frame done. " << frame->TimeReport());
	auto texture = frame->GetSharedTexture();
	auto transferMode = frame->GetSurfaceData().transferMode;
	frame->SetSharedTexture(nullptr);

	texturePoolMutex.lock();
	if (texturePool.find(transferMode) != texturePool.end()) {
		// we only release the frame if the pool is still available
		texturePool[transferMode]->ReleaseTexture(texture);
	}
	else {
		// TODO this destroys at least the macos javafx context state
		// delete texture;
		// for now we leak it..
	}
	texturePoolMutex.unlock();

	frameManager.DisposeFrame(frameId);
}


void NativeSurface::Present(RenderTarget* target, PresentationHint hint) {
	auto begin = std::chrono::steady_clock::now();
	if (target == nullptr) {
		LogDebug("Cannot present nullptr; doing nothing.");
		return;
	}

	auto frame = static_cast<Frame*>(target);
	frame->End("ClientRenderer");
	frame->Begin("NativeSurface#Present");
	frame->presentBegin = begin;
	LogDebug("Present " << frame->ToString());

	auto tex = frame->GetSharedTexture();

	tex->AfterRender();

	frame->SetPresentationHint(hint);

	api->Present(frame);

	//GetFrameManager()->DisposePendingFrames();

	frame->presentEnd = std::chrono::steady_clock::now();
	frame->End("NativeSurface#Present");
}

driftfx::TransferMode* NativeSurface::GetTransferMode() {
	return nullptr;
}

void NativeSurface::SetTransferMode(driftfx::TransferMode* transferMode) {

}


Context* NativeSurface::GetFxContext() {
	return PrismBridge::Get()->GetFxContext();
}

Vec2d NativeSurface::GetSurfaceSize() {
	return surfaceData.load().size;
}

Vec2d NativeSurface::GetScreenScale() {
	return surfaceData.load().screenScale;
}

Vec2d NativeSurface::GetUserScale() {
	return surfaceData.load().userScale;
}

Vec2ui NativeSurface::GetScaledSize() {
	SurfaceData data = surfaceData.load();
	Vec2ui r;
	r.x = (unsigned int) ceil((long double) data.size.x * data.screenScale.x * data.userScale.x);
	r.y = (unsigned int) ceil((long double) data.size.y * data.screenScale.y * data.userScale.y);
	return r;
}

FrameManager* NativeSurface::GetFrameManager() {
	return &frameManager;
}
