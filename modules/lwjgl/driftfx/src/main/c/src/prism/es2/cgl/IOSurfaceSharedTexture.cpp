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

#include <jni.h>

#include <GL/glew.h>

#include "../../../SharedTexture.h"
#include "IOSurfaceSharedTexture.h"

#include <IOSurface/IOSurface.h>
#include <OpenGL/CGLIOSurface.h>
#include <OpenGL/OpenGL.h>

#include "../../../gl/cgl/cgl.h"
#include "../../../gl/cgl/CGLGLContext.h"

#include "../ES2PrismBridge.h"

#include <DriftFX/GL/GLDebug.h>
#include <DriftFX/math/Vec2.h>

#include <utils/Logger.h>

#include <gl/GLLog.h>
#include <gl/cgl/CGLLog.h>

#include <string>
#include <sstream>
#include <iostream>

#include <MainMemorySharedTexture.h>

using namespace driftfx::gl;
using namespace driftfx::math;
using namespace driftfx::internal;
using namespace driftfx::internal::gl;
using namespace driftfx::internal::gl::cgl;
using namespace driftfx::internal::prism::es2;
using namespace driftfx::internal::prism::es2::cgl;


int IOSurfaceSharedTexture::OnTextureCreated(PrismBridge* bridge, Frame* frame, jobject fxTexture) {
	frame->Begin("IOSurfaceSharedTexture#OnTextureCreated");
	ES2PrismBridge* es2Bridge = static_cast<ES2PrismBridge*>(bridge);

	GLContext* fxShared = es2Bridge->GetFXSharedGLContext();

	if (!fxShared->IsCurrent()) {
		fxShared->SetCurrent();
	}

	GLuint textureName = es2Bridge->GetGLTextureName(fxTexture);

	CGLGLContext* fx = static_cast<CGLGLContext*>(fxShared);

	unsigned int width = frame->GetSize().x;
	unsigned int height = frame->GetSize().y;

	SharedTexture* sharedTex = frame->GetSharedTexture();

	IOSurfaceSharedTexture* sharedTexture = static_cast<IOSurfaceSharedTexture*>(sharedTex);
	//void* ioSurfaceHandle = sharedTexture->GetIOSurfaceHandle();
	// TODO we should use the io surface by id (IOSurfaceGetID instead of the pointer)
	//IOSurfaceRef ioSurface = (IOSurfaceRef) (void*) ioSurfaceHandle;

	// CONNECT ioSurface to temporary texture

	IOSurfaceID surfaceID = sharedTexture->GetIOSurfaceID();
	IOSurfaceRef ioSurface = IOSurfaceLookup(surfaceID);

	LogDebug(frame->ToString());

	LogDebug("Connecting to ioSurface: id=" << surfaceID << ", pointer=" << ioSurface << ", width=" << width << ", height=" << height);

	if (ioSurface != nullptr) {

//		GLsizei w = (GLsizei) IOSurfaceGetWidth(ioSurface);
//		GLsizei h = (GLsizei) IOSurfaceGetHeight(ioSurface);

//		LogDebug(" w: " << width << " <-> " << w);
//		LogDebug(" h: " << height << " <-> " << h);

		GLuint tmpTex;

		GLCALL( glGenTextures(1, &tmpTex) );

		GLCALL( glBindTexture(GL_TEXTURE_RECTANGLE, tmpTex) );
		CGLCALL( CGLTexImageIOSurface2D(fx->GetCGLContextObj(), GL_TEXTURE_RECTANGLE, GL_RGBA, width, height, GL_BGRA, GL_UNSIGNED_INT_8_8_8_8_REV, ioSurface, 0) );
		GLCALL( glBindTexture(GL_TEXTURE_RECTANGLE, 0) );

		// COPY OVER
		// Note: we need to copy the texture here, because iosurface works with GL_TEXTURE_RECTANGLE, while javafx can only work with GL_TEXTURE_2D
		ES2PrismBridge::CopyTexture(tmpTex, textureName, width, height);

		GLCALL( glDeleteTextures(1, &tmpTex) );

		LogDebug("Releasing IOSurface id=" << surfaceID);
		releaseIOSurface(ioSurface);

		frame->End("IOSurfaceSharedTexture#OnTextureCreated");

		return 0;

	}
	frame->End("IOSurfaceSharedTexture#OnTextureCreated");

	return -1;
}


IOSurfaceSharedTexture::IOSurfaceSharedTexture(GLContext* context, math::Vec2ui size) :
	SharedTexture(context, size)
		{

	if (!glContext->IsCurrent()) {
		std::ostringstream s;
		s << "IOSurfaceSharedTexture: context " << glContext->GetName() << " must be current";
		LogError(s.str());
	}

	Allocate();
}

IOSurfaceSharedTexture::~IOSurfaceSharedTexture() {

	Release();
}

ShareData* IOSurfaceSharedTexture::CreateShareData() {
	IOSurfaceShareData* data = new IOSurfaceShareData();
	data->ioSurfaceID = ioSurfaceID;
	return data;
}

void IOSurfaceSharedTexture::Allocate() {
	glTexture = static_cast<GLTexture*>(glContext->CreateTexture(size.x, size.y));

	ioSurface = createIOSurface(size.x, size.y);
	ioSurfaceID = IOSurfaceGetID(ioSurface);

	CGLGLContext* cglCtx = static_cast<CGLGLContext*>(glContext);

	CGLError success;
	GLCALL( glBindTexture(GL_TEXTURE_RECTANGLE, glTexture->Name()) );
	CGLCALL( success = CGLTexImageIOSurface2D(cglCtx->GetCGLContextObj(), GL_TEXTURE_RECTANGLE, GL_RGBA, size.x, size.y, GL_BGRA, GL_UNSIGNED_INT_8_8_8_8_REV, ioSurface, 0) );
	GLCALL( glBindTexture(GL_TEXTURE_RECTANGLE, 0) );
	//IOSurfaceLock(ioSurface, kIOSurfaceLockAvoidSync, NULL);

}

void IOSurfaceSharedTexture::Release() {
	LogDebug("Releasing IOSurface id: " << ioSurfaceID << ", handle: " << ioSurface);
	if (ioSurface != nullptr) {
		releaseIOSurface(ioSurface);
		ioSurface = nullptr;
	}
	delete glTexture;
}

bool IOSurfaceSharedTexture::BeforeRender() {
	return true;
}

bool IOSurfaceSharedTexture::AfterRender() {
//	SignalFrameReady();
//	WaitForFrameReady();
	glBindFramebuffer(GL_FRAMEBUFFER, 0);
	glBindTexture(GL_TEXTURE_RECTANGLE, 0);
	glFlush();
	return true;
}

void* IOSurfaceSharedTexture::GetIOSurfaceHandle() {
	return (void*) ioSurface;
}

IOSurfaceID IOSurfaceSharedTexture::GetIOSurfaceID() {
	return ioSurfaceID;
}
