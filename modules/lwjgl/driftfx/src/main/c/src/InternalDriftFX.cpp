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

#include "InternalDriftFX.h"
#include "NativeSurfaceRegistry.h"

using namespace driftfx;
using namespace driftfx::internal;

InternalDriftFX* InternalDriftFX::instance = nullptr;

DriftFX::~DriftFX() {
}

InternalDriftFX::~InternalDriftFX() {
}

DriftFX* DriftFX::Get() {
	if (InternalDriftFX::instance == nullptr) {
		InternalDriftFX::instance = new InternalDriftFX();
	}
	return InternalDriftFX::instance;
}

DriftFXSurface* InternalDriftFX::GetSurface(long surfaceId) {
	return NativeSurfaceRegistry::Get()->Get(surfaceId);
}

long InternalDriftFX::CreateSurface(JNINativeSurface* api) {
	return NativeSurfaceRegistry::Get()->Create(api);
}
