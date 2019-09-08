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

#ifndef DRIFTFX_INTERNAL_FRAMEMANAGER_H_
#define DRIFTFX_INTERNAL_FRAMEMANAGER_H_


// windows header conflicts with chronos min -.-
#ifdef min
#undef min
#endif

#include <map>
#include <vector>
#include <mutex>
#include <chrono>

#include <DriftFX/DriftFXSurface.h>
#include <DriftFX/math/Vec2.h>

#include <SurfaceData.h>


namespace driftfx {
namespace internal {

class SharedTexture;

class ShareData {
public:
	unsigned int type;
};

struct Timing {
	std::string tag;
	long begin;
	long end;
};

class Frame : public RenderTarget {
public:
	Frame(long surfaceId, long long frameId, SurfaceData surfaceData, math::Vec2ui size);
	virtual ~Frame();

	virtual void SetSharedTexture(SharedTexture* texture);
	virtual void SetPresentationHint(PresentationHint hint);

	virtual ShareData* GetData();

	virtual SharedTexture* GetSharedTexture();

	// from RenderTarget
	virtual unsigned int GetGLTexture();
	virtual unsigned int GetWidth();
	virtual unsigned int GetHeight();


	virtual long GetSurfaceId();
	virtual long long GetFrameId();
	virtual SurfaceData GetSurfaceData();
	virtual math::Vec2ui GetSize();
	virtual PresentationHint GetPresentationHint();

	virtual std::string ToString();
	virtual std::string TimeReport();


	virtual void Begin(std::string tag);
	virtual void End(std::string tag);

	virtual std::vector<Timing> GetReport();


	std::chrono::steady_clock::time_point acquireBegin = std::chrono::steady_clock::time_point::min();
	std::chrono::steady_clock::time_point acquireEnd = std::chrono::steady_clock::time_point::min();
	std::chrono::steady_clock::time_point presentBegin = std::chrono::steady_clock::time_point::min();
	std::chrono::steady_clock::time_point presentEnd = std::chrono::steady_clock::time_point::min();
	std::chrono::steady_clock::time_point fxPresentBegin = std::chrono::steady_clock::time_point::min();
	std::chrono::steady_clock::time_point fxPresentEnd = std::chrono::steady_clock::time_point::min();

private:
	long surfaceId;
	long long frameId;
	SurfaceData surfaceData;
	math::Vec2ui size;
	PresentationHint presentationHint;
	SharedTexture* sharedTexture;

	ShareData* frameData;

	std::map<std::string, Timing> openTimings;
	std::vector<Timing> timings;
};

class FrameManager {

public:
	FrameManager(long surfaceId);
	virtual ~FrameManager();


	Frame* CreateFrame(SurfaceData surfaceData, math::Vec2ui size);

	Frame* GetFrame(long long frameId);

	void DisposeFrame(long long frameId);


	void DisposePendingFrames();

private:
	long surfaceId;
	long long nextFrameId;

	std::mutex framesMutex;
	std::map<long long, Frame*> frames;

	std::mutex toDisposeMutex;
	std::vector<Frame*> toDispose;

};


}
}

#endif /* DRIFTFX_SRC_FRAMEMANAGER_H_ */
