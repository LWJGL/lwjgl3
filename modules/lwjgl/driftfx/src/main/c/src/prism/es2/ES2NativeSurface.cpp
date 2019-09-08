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

#include "ES2NativeSurface.h"
#include "../PrismBridge.h"

#include <utils/Logger.h>

using namespace driftfx;
using namespace driftfx::gl;

using namespace driftfx::internal::prism::es2;

ES2NativeSurface::ES2NativeSurface(long surfaceId, JNINativeSurface* api) :
	NativeSurface(surfaceId, api) {

//	GLContext* fxContext = static_cast<GLContext*>(PrismBridge::Get()->GetFxContext());
//	sharedFXContext = fxContext->CreateSharedContext();

	LogDebug("ES2NativeSurface Constructor done.");
}

ES2NativeSurface::~ES2NativeSurface() {

}

Context* ES2NativeSurface::GetFxContext() {
	return PrismBridge::Get()->GetFxContext();
}

