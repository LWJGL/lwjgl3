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

	LogDebug("Connecting to ioSurface: id=" << surfaceID << ", pointer=" << ioSurface);

	if (ioSurface != nullptr) {

		GLuint tmpTex;

		GLCALL( glGenTextures(1, &tmpTex) );

		GLCALL( glBindTexture(GL_TEXTURE_RECTANGLE, tmpTex) );
		CGLCALL( CGLTexImageIOSurface2D(fx->GetCGLContextObj(), GL_TEXTURE_RECTANGLE, GL_RGBA, width, height, GL_BGRA, GL_UNSIGNED_INT_8_8_8_8_REV, ioSurface, 0) );
		GLCALL( glBindTexture(GL_TEXTURE_RECTANGLE, 0) );

		// COPY OVER
		// Note: we need to copy the texture here, because iosurface works with GL_TEXTURE_RECTANGLE, while javafx can only work with GL_TEXTURE_2D
		// ES2PrismBridge::CopyTexture(shareData->textureName, targetTex, size.x, size.y);

		GLuint fbos[2];

		GLCALL( glGenFramebuffers(2, &fbos[0]) );

		GLCALL( glBindFramebuffer(GL_READ_FRAMEBUFFER, fbos[0]) );
		GLCALL( glFramebufferTexture(GL_READ_FRAMEBUFFER, GL_COLOR_ATTACHMENT0, tmpTex, 0) );

		GLCALL( glBindFramebuffer(GL_DRAW_FRAMEBUFFER, fbos[1]); );
		GLCALL( glFramebufferTexture(GL_DRAW_FRAMEBUFFER, GL_COLOR_ATTACHMENT0, textureName, 0) );

		GLCALL( glClearColor(0, 0, 0, 0) );
		GLCALL( glClear(GL_COLOR_BUFFER_BIT) );

		GLCALL( glBlitFramebuffer(0, 0, width, height, 0, 0, width, height, GL_COLOR_BUFFER_BIT, GL_LINEAR) );


		GLCALL( glFlush() );

		GLCALL( glDeleteFramebuffers(2, &fbos[0]) );

		// The fence operation happens on the java side

		GLCALL( glDeleteTextures(1, &tmpTex) );

		LogDebug("Releasing IOSurface id=" << surfaceID);
		releaseIOSurface(ioSurface);

		return 0;

	}

	return -1;
}


IOSurfaceSharedTexture::IOSurfaceSharedTexture(GLContext* context, Frame* frame) :
	SharedTexture(context, frame)
		{
	auto textureSize = frame->GetSize();
	ioSurface = createIOSurface(textureSize.x, textureSize.y);
	ioSurfaceID = IOSurfaceGetID(ioSurface);

	IOSurfaceShareData* data = new IOSurfaceShareData();
	data->ioSurfaceID = ioSurfaceID;
	frame->SetData(data);

	if (!glContext->IsCurrent()) {
		std::ostringstream s;
		s << "IOSurfaceSharedTexture: context " << glContext->GetName() << " must be current";
		LogError(s.str());
	}


}

IOSurfaceSharedTexture::~IOSurfaceSharedTexture() {
	LogDebug("Releasing IOSurface id: " << ioSurfaceID << ", handle: " << ioSurface);

	if (ioSurface != nullptr) {
		releaseIOSurface(ioSurface);
		ioSurface = nullptr;
	}


//	if (!glContext->IsCurrent()) {
//		LogInfo("Forcing context switch to " << glContext->GetName());
//		glContext->SetCurrent();
//	}

}

bool IOSurfaceSharedTexture::BeforeRender() {

	auto textureSize = frame->GetSize();
	glTexture = static_cast<GLTexture*>(glContext->CreateTexture(textureSize.x, textureSize.y));

	CGLGLContext* cglCtx = static_cast<CGLGLContext*>(glContext);

	CGLError success;
	GLCALL( glBindTexture(GL_TEXTURE_RECTANGLE, glTexture->Name()) );
	CGLCALL( success = CGLTexImageIOSurface2D(cglCtx->GetCGLContextObj(), GL_TEXTURE_RECTANGLE, GL_RGBA, textureSize.x, textureSize.y, GL_BGRA, GL_UNSIGNED_INT_8_8_8_8_REV, ioSurface, 0) );
	GLCALL( glBindTexture(GL_TEXTURE_RECTANGLE, 0) );
	//IOSurfaceLock(ioSurface, kIOSurfaceLockAvoidSync, NULL);
	return success == kCGLNoError;
}
bool IOSurfaceSharedTexture::AfterRender() {
	glBindFramebuffer(GL_FRAMEBUFFER, 0);
	glBindTexture(GL_TEXTURE_RECTANGLE, 0);
	glFlush();
	//IOSurfaceUnlock(ioSurface, kIOSurfaceLockAvoidSync, NULL);
	delete glTexture;
//	releaseIOSurface(ioSurface);
//	ioSurface = nullptr;
	return true;
}

void* IOSurfaceSharedTexture::GetIOSurfaceHandle() {
	return (void*) ioSurface;
}

IOSurfaceID IOSurfaceSharedTexture::GetIOSurfaceID() {
	return ioSurfaceID;
}
