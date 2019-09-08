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

#include "FrameManager.h"
#include "SharedTexture.h"

#include <DriftFX/math/Vec2.h>

#include <utils/Logger.h>

#include <map>
#include <string>
#include <sstream>
#include <iomanip>

using namespace driftfx;
using namespace driftfx::internal;

using namespace std;


Frame::Frame(long surfaceId, long long frameId, SurfaceData surfaceData, math::Vec2ui size) :
		surfaceId(surfaceId),
		frameId(frameId),
		surfaceData(surfaceData),
		size(size),
		sharedTexture(nullptr),
		presentationHint(CENTER),
		frameData(nullptr) {

}

Frame::~Frame() {
	if (frameData != nullptr) {
		delete frameData;
		frameData = nullptr;
	}
}

ShareData* Frame::GetData() {
	return this->frameData;
}

void Frame::SetSharedTexture(SharedTexture* texture) {
	sharedTexture = texture;
	if (texture != nullptr) {
		frameData = texture->CreateShareData();
	}
}

SharedTexture* Frame::GetSharedTexture() {
	return sharedTexture;
}

void Frame::SetPresentationHint(PresentationHint hint) {
	presentationHint = hint;
}

unsigned int Frame::GetGLTexture() {
	return sharedTexture->GetTexture()->Name();
}

unsigned int Frame::GetWidth() {
	return size.x;
}
unsigned int Frame::GetHeight() {
	return size.y;
}

void Frame::Begin(std::string tag) {
	auto time = std::chrono::high_resolution_clock::now();
	Timing t;
	t.tag = tag;
	t.begin = time.time_since_epoch().count();
	openTimings[tag] = t;
}

void Frame::End(std::string tag) {
	auto time = std::chrono::high_resolution_clock::now();
	if (openTimings.find(tag) != openTimings.end()) {
		auto t = openTimings[tag];
		openTimings.erase(tag);
		t.end = time.time_since_epoch().count();
		timings.push_back(t);
	}
}

std::vector<Timing> Frame::GetReport() {
	return timings;
}

long Frame::GetSurfaceId() {
	return surfaceId;
}
long long Frame::GetFrameId() {
	return frameId;
}
SurfaceData Frame::GetSurfaceData() {
	return surfaceData;
}
PresentationHint Frame::GetPresentationHint() {
	return presentationHint;
}

std::string Frame::ToString() {
	ostringstream s;
	s << "Frame(" << dec << surfaceId << "." << dec << frameId << ")";
	return s.str();
}

std::string Frame::TimeReport() {
	ostringstream s;
	auto clientDuration = std::chrono::duration_cast<std::chrono::nanoseconds>(presentBegin - acquireEnd);
	auto acquireDuration = std::chrono::duration_cast<std::chrono::nanoseconds>(acquireEnd - acquireBegin);
	auto presentDuration = std::chrono::duration_cast<std::chrono::nanoseconds>(presentEnd - presentBegin);
	auto fxPresentDuration = std::chrono::duration_cast<std::chrono::nanoseconds>(fxPresentEnd - fxPresentBegin);
	s << "Frame(" << dec << surfaceId << "." << dec << frameId << "| acquire: " << acquireDuration.count() << "ns, client: " << clientDuration.count() <<"ns, present: " << presentDuration.count() << "ns, fxPresent: " << fxPresentDuration.count() << "ns)";
	return s.str();
}

math::Vec2ui Frame::GetSize() {
	return size;
}

FrameManager::FrameManager(long surfaceId) :
	surfaceId(surfaceId),
	nextFrameId(0),
	frames(),
	framesMutex() {

}

FrameManager::~FrameManager() {

}

Frame* FrameManager::CreateFrame(SurfaceData surfaceData, math::Vec2ui size) {
	framesMutex.lock();
	long long frameId = nextFrameId++;
	Frame* frame = new Frame(surfaceId, frameId, surfaceData, size);
	frames[frameId] = frame;
	framesMutex.unlock();
	return frame;
}

Frame* FrameManager::GetFrame(long long frameId) {
	framesMutex.lock();
	Frame* result = frames[frameId];
	framesMutex.unlock();
	return result;
}

void FrameManager::DisposeFrame(long long frameId) {
	LogDebug("Dispose Frame #" << frameId);
	framesMutex.lock();
	Frame* frame = frames[frameId];
	frames.erase(frameId);
	delete frame;
//	toDispose.push_back(frame);
	framesMutex.unlock();
}

void FrameManager::DisposePendingFrames() {
//	LogDebug("Disposing pending frames");
//	toDisposeMutex.lock();
//	for (std::vector<Frame*>::iterator it = toDispose.begin(); it != toDispose.end(); ++it) {
//		Frame* f = (*it);
//		LogDebug(" - " << f->ToString());
//		delete f;
//	}
//	toDispose.clear();
//	toDisposeMutex.unlock();
}
