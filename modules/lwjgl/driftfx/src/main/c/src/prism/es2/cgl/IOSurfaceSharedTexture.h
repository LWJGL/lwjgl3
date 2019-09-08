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
#ifndef PRISM_ES2_CGL_IOSURFACESHAREDTEXTURE_H_
#define PRISM_ES2_CGL_IOSURFACESHAREDTEXTURE_H_

#include <jni.h>
#include <prism/PrismBridge.h>
#include "../../../SharedTexture.h"
#include <IOSurface/IOSurface.h>
#include <DriftFX/math/Vec2.h>

namespace driftfx {
namespace internal {
namespace prism {
namespace es2 {
namespace cgl {

class IOSurfaceShareData: public ShareData {
	public:
	IOSurfaceID ioSurfaceID;
};

class IOSurfaceSharedTexture : public SharedTexture {

private:
	IOSurfaceRef ioSurface;
	IOSurfaceID ioSurfaceID;


public:
	static int OnTextureCreated(PrismBridge* bridge, Frame* frame, jobject fxTexture);

	IOSurfaceSharedTexture(gl::GLContext* context, math::Vec2ui size);
	virtual ~IOSurfaceSharedTexture();

	virtual bool BeforeRender();
	virtual bool AfterRender();

	virtual void* GetIOSurfaceHandle();

	virtual IOSurfaceID GetIOSurfaceID();

	virtual ShareData* CreateShareData();

protected:

	virtual void Allocate();
	virtual void Release();
};

}
}
}
}
}

#endif /* PRISM_ES2_CGL_IOSURFACESHAREDTEXTURE_H_ */
