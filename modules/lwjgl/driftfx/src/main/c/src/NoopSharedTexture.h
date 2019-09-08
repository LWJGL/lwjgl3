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

#ifndef DRIFTFX_INTERNAL_NOOPSHAREDTEXTURE_H_
#define DRIFTFX_INTERNAL_NOOPSHAREDTEXTURE_H_

#include <DriftFX/GL/GLContext.h>
#include <DriftFX/math/Vec2.h>

#include "SharedTexture.h"

#include <GL/glew.h>

namespace driftfx {
namespace internal {

class NoopSharedTexture : public SharedTexture {
public:
	NoopSharedTexture(GLContext* context, math::Vec2ui size);
	virtual ~NoopSharedTexture();

	virtual bool BeforeRender();
	virtual bool AfterRender();

	virtual ShareData* CreateShareData();
protected:
	virtual void Allocate();
	virtual void Release();
};


}
}

#endif
