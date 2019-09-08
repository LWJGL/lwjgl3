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

#include "CGLES2PrismBridge.h"

#include "../../../gl/cgl/CGLGLContext.h"
#include "../../../gl/cgl/cgl.h"

#include <IOSurface/IOSurface.h>
#include <OpenGL/CGLIOSurface.h>

#include <DriftFX/GL/GLDebug.h>

#include <gl/GLLog.h>
#include <gl/cgl/CGLLog.h>


using namespace driftfx::internal::gl::cgl;
using namespace driftfx::internal::prism::es2::cgl;

CGLES2PrismBridge::CGLES2PrismBridge(jlong pContext) :
	ES2PrismBridge(new CGLGLContext("javafx", (CGLContextObj) getCGLContextObj((void*) pContext), false))
{
	defaultContext = new CGLGLContext("drift");
	defaultContext->SetCurrent();
	glewInit();

}

CGLES2PrismBridge::~CGLES2PrismBridge() {
	delete defaultContext;
}


void CGLES2PrismBridge::Initialize(jlong pContext) {
	PrismBridge::bridge = new CGLES2PrismBridge(pContext);
}

int CGLES2PrismBridge::ConnectTextureToIOSurface(int textureName, int width, int height, long ioSurfaceHandle) {

	// SAVE THE STATE!
	if (!fxSharedGLContext->IsCurrent()) { // this should only happen once since java should always use the same thread for this call
		fxSharedGLContext->SetCurrent();
	}
	CGLGLContext* fx = static_cast<CGLGLContext*>(fxSharedGLContext);

	// CONNECT ioSurface to temporary texture
	GLuint tmpTex;

	IOSurfaceRef ioSurface = (IOSurfaceRef) (void*) ioSurfaceHandle;

	GLCALL( glGenTextures(1, &tmpTex) );

	GLCALL( glBindTexture(GL_TEXTURE_RECTANGLE, tmpTex) );
	CGLCALL( CGLTexImageIOSurface2D(fx->GetCGLContextObj(), GL_TEXTURE_RECTANGLE, GL_RGBA, width, height, GL_BGRA, GL_UNSIGNED_INT_8_8_8_8_REV, ioSurface, 0) );
	GLCALL( glBindTexture(GL_TEXTURE_RECTANGLE, 0) );

	// COPY OVER
	// Note: we need to copy the texture here, because iosurface works with GL_TEXTURE_RECTANGLE, while javafx can only work with GL_TEXTURE_2D
	CopyTexture(tmpTex, textureName, width, height);

	GLCALL( glDeleteTextures(1, &tmpTex) );

	return 0;
}
