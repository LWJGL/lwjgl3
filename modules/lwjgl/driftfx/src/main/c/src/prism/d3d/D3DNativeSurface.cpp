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
#include <sstream>

#include <gl/glew.h>
#include <utils/Logger.h>

#include "win32/D3D9ExContext.h"
#include "D3DNativeSurface.h"

using namespace driftfx;
using namespace driftfx::internal;
using namespace driftfx::internal::win32;
using namespace driftfx::internal::prism::d3d;

D3DNativeSurface::D3DNativeSurface(long surfaceId, JNINativeSurface* api) :
	NativeSurface(surfaceId, api),
	fxContext(nullptr) {

}

D3DNativeSurface::~D3DNativeSurface() {

	delete fxContext;
	fxContext = nullptr;
}

void D3DNativeSurface::Initialize() {
	NativeSurface::Initialize();

	LogDebug("init D3DContext");
	std::ostringstream s;
	s << "surface" << surfaceId;
	fxContext = new D3D9ExContext(s.str());
}

void D3DNativeSurface::Cleanup() {
	NativeSurface::Cleanup();

	LogDebug("clean D3DContext");
	delete fxContext;
	fxContext = nullptr;
}


Context* D3DNativeSurface::GetFxContext() {
	return fxContext;
}


//NativeSurface* NativeSurface::Create(JNINativeSurface* api) {
//	return new D3DNativeSurface
//}
