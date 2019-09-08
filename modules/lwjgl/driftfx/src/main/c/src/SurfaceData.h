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

#ifndef DRIFTFX_INTERNAL_SURFACEDATA_H_
#define DRIFTFX_INTERNAL_SURFACEDATA_H_

#include <DriftFX/math/Vec2.h>

namespace driftfx {
namespace internal {

struct SurfaceData {
	math::Vec2d size;
	math::Vec2d screenScale;
	math::Vec2d userScale;
	unsigned int transferMode;

	SurfaceData() noexcept :
		size(1, 1),
		screenScale(1, 1),
		userScale(1, 1),
		transferMode(0) {}
	SurfaceData(const SurfaceData& s) noexcept = default;
};

}
}

#endif
