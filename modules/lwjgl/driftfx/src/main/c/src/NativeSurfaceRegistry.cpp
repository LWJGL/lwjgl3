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

#include "prism/PrismBridge.h"
#include "NativeSurfaceRegistry.h"

using namespace std;

using namespace driftfx::internal;
using namespace driftfx::internal::prism;

NativeSurfaceRegistry* NativeSurfaceRegistry::instance = nullptr;

NativeSurfaceRegistry::NativeSurfaceRegistry() :
		mutex(),
		registry(),
		nextSurfaceId(1) {

}

NativeSurfaceRegistry::~NativeSurfaceRegistry() {

}

NativeSurfaceRegistry* NativeSurfaceRegistry::Get() {
	if (instance == nullptr) {
		instance = new NativeSurfaceRegistry();
	}
	return instance;
}

long NativeSurfaceRegistry::Create(JNINativeSurface* api) {
	mutex.lock();
	long surfaceId = nextSurfaceId++;
	NativeSurface* surface = PrismBridge::Get()->CreateNativeSurface(surfaceId, api);
	registry[surfaceId] = surface;
	mutex.unlock();
	return surfaceId;
}

void NativeSurfaceRegistry::Destroy(long surfaceId) {
	mutex.lock();
	NativeSurface* surface = registry[surfaceId];
	delete surface;
	registry.erase(surfaceId);
	mutex.unlock();
}

NativeSurface* NativeSurfaceRegistry::Get(long surfaceId) {
	mutex.lock();
	NativeSurface* surface = registry[surfaceId];
	mutex.unlock();
	return surface;
}

