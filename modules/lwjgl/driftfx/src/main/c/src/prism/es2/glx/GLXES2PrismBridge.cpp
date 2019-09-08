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

#include "../ES2PrismBridge.h"
#include "GLXES2PrismBridge.h"

#include "gl/glx/GLXGLContext.h"

using namespace driftfx::internal::gl::glx;
using namespace driftfx::internal::prism::es2;
using namespace driftfx::internal::prism::es2::glx;

GLXES2PrismBridge::GLXES2PrismBridge(jlong pContext) :
	ES2PrismBridge(new GLXGLContext("javafx", (GLXContext) pContext))
{
	defaultContext = fxGLContext->CreateSharedContext("drift");
	defaultContext->SetCurrent();
	glewInit();
	defaultContext->UnsetCurrent();
}

GLXES2PrismBridge::~GLXES2PrismBridge() {

}

void GLXES2PrismBridge::Initialize(jlong pContext) {
	PrismBridge::bridge = new GLXES2PrismBridge(pContext);
}
