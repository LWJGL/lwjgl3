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

#ifndef PRISM_PRISMBRIDGE_H_
#define PRISM_PRISMBRIDGE_H_

#include <jni.h>
#include <set>
#include <map>
#include <functional>

#include <DriftFX/Context.h>
#include <DriftFX/GL/GLContext.h>
#include <DriftFX/DriftFXSurface.h>

#include "../JNINativeSurface.h"

#include "../NativeSurface.h"
#include "../SharedTexture.h"

namespace driftfx {
using namespace driftfx::gl;
namespace internal {
namespace prism {

class PrismBridge;
typedef std::function<int(PrismBridge*, Frame*, jobject)> OnTextureCreatedFunc;

class PrismBridge {

public:
	static PrismBridge* Get();

	virtual GLContext* GetDefaultContext();

	virtual Context* GetFxContext();

	virtual NativeSurface* CreateNativeSurface(long surfaceId, JNINativeSurface* api) = 0;

	virtual int OnTextureCreated(Frame* frame, jobject fxTexture);

	static void Destroy();

	static SharedTextureFactoryId Register(SharedTextureFactoryId id, OnTextureCreatedFunc func);

protected:
	PrismBridge(Context* fxContext);
	virtual ~PrismBridge();

	static PrismBridge* bridge;

	GLContext* defaultContext;

	Context* fxContext;

	static std::map<SharedTextureFactoryId, OnTextureCreatedFunc> handlers;

	virtual void EnsurePrismContext();
};

}
}
}

#endif /* PRISM_PRISMBRIDGE_H_ */
