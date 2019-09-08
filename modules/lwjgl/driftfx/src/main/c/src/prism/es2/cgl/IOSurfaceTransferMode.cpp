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

#include <TransferModeManager.h>
#include <FrameManager.h>

#include "IOSurfaceSharedTexture.h"


#include <prism/PrismBridge.h>

#include <utils/Logger.h>

#include <iostream>



namespace driftfx {
namespace internal {
namespace prism {
namespace es2 {
namespace cgl {


class IOSurfaceTransferMode : public TransferMode {
public:
	SharedTexture* CreateSharedTexture(GLContext* glContext, Context* fxContext, math::Vec2ui size) {
    	return new IOSurfaceSharedTexture(glContext, size);
	}
	int OnTextureCreated(prism::PrismBridge* bridge, Frame* frame, jobject fxTexture) {
		return IOSurfaceSharedTexture::OnTextureCreated(bridge, frame, fxTexture);
    }
    virtual bool isPlatformDefault() {
		return true;
	}
protected:
	IOSurfaceTransferMode() : TransferMode("IOSurface") {}
	static TransferModeId registered;
};

TransferModeId IOSurfaceTransferMode::registered = TransferModeManager::Instance()->RegisterTransferMode(new IOSurfaceTransferMode());


}
}
}
}
}
