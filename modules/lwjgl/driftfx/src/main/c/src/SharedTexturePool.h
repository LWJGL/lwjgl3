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

#ifndef DRIFTFX_INTERNAL_SHAREDTEXTUREPOOL_H_
#define DRIFTFX_INTERNAL_SHAREDTEXTUREPOOL_H_

#include <DriftFX/Context.h>
#include <DriftFX/GL/GLContext.h>
#include <DriftFX/math/Vec2.h>

#include <SharedTexture.h>

#include "TransferModeManager.h"

#include <string>
#include <map>
#include <set>
#include <functional>
#include <chrono>

namespace driftfx {
using namespace gl;
namespace internal {

struct Vec2uiCompare {
	bool operator() (const math::Vec2ui& lhs, const math::Vec2ui& rhs) const {
		return  (long) lhs.x * 1000000l + lhs.y < (long) rhs.x * 1000000l + rhs.y;
	}
};

struct TexCompare {
	bool operator() (const SharedTexture* lhs, const SharedTexture* rhs) const {
		return (long long) lhs > (long long) rhs;
	}
};

typedef std::set<SharedTexture*, TexCompare> TexSet;
typedef std::map<math::Vec2ui, TexSet, Vec2uiCompare> TexMap;
typedef std::map<SharedTexture*, std::chrono::steady_clock::time_point> LastUsedMap;

class SharedTexturePool {

public:
	SharedTexturePool(GLContext* glContext, Context* fxContext, ::driftfx::internal::TransferMode* mode);
	virtual ~SharedTexturePool();

	virtual SharedTexture* AcquireTexture(math::Vec2ui size);
	virtual void ReleaseTexture(SharedTexture* texture);

	virtual void DisposeUnusedTextures();

	virtual void LogContent();

private:

	std::mutex unusedTexturesMutex;
	TexMap unusedTextures;
	LastUsedMap lastUsed;

	GLContext* glContext;
	Context* fxContext;
	::driftfx::internal::TransferMode* mode;
};

}
}

#endif /* DRIFTFX_INTERNAL_SHAREDTEXTUREPOOL_H_ */
