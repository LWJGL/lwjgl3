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

#include "D3DSharedTexture.h"
#include <FrameManager.h>


#include "SharedTexture.h"
#include "win32/Error.h"
#include "win32/D3D9ExContext.h"
#include <win32/D3D9Texture.h>
#include "gl/wgl/WGLGLContext.h"


#include <prism/PrismBridge.h>
#include <prism/d3d/include/java8/D3DContext.h>
#include <prism/d3d/D3DPrismBridge.h>


#include <utils/Logger.h>

#include <iostream>


namespace driftfx {
namespace internal {
namespace prism {
namespace d3d {


class NVDXInteropTransferMode : public TransferMode {
public:
	SharedTexture* CreateSharedTexture(GLContext* glContext, Context* fxContext, math::Vec2ui size) {
       	D3D9ExContext* d3dContext = static_cast<D3D9ExContext*>(fxContext);
	    return new D3DSharedTexture(glContext, d3dContext, size);
    }
	int OnTextureCreated(prism::PrismBridge* bridge, Frame* frame, jobject fxTexture) {
		return D3DSharedTexture::OnTextureCreated(bridge, frame, fxTexture);
    }
	virtual bool isPlatformDefault() {
		return true;
	}
protected:
	NVDXInteropTransferMode() : TransferMode("NVDXInterop") {}
	static TransferModeId registered;
};

TransferModeId NVDXInteropTransferMode::registered = TransferModeManager::Instance()->RegisterTransferMode(new NVDXInteropTransferMode());


}
}
}
}
