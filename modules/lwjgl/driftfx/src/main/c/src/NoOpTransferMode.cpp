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

#include "NoopSharedTexture.h"

namespace driftfx {
namespace internal {

class NoOpTransferMode : public TransferMode {

public:
	SharedTexture* CreateSharedTexture(GLContext* glContext, Context* fxContext, math::Vec2ui size) {
		return new NoopSharedTexture(glContext, size);
	}
	int OnTextureCreated(prism::PrismBridge* bridge, Frame* frame, jobject fxTexture) {
		return 0;
	}
protected:
	NoOpTransferMode() : TransferMode("NoOp") {}
	static TransferModeId registered;
};

TransferModeId NoOpTransferMode::registered = TransferModeManager::Instance()->RegisterTransferMode(new NoOpTransferMode());

}
}
