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

#include <GL/glew.h>

#include "GLXSharedTexture.h"

#include <utils/Logger.h>

#include <DriftFX/GL/GLDebug.h>

#include <DriftFX/math/Vec2.h>

#include <prism/PrismBridge.h>
#include <prism/es2/ES2PrismBridge.h>

#include <gl/GLLog.h>

using namespace driftfx::math;
using namespace driftfx::internal;
using namespace driftfx::internal::prism::es2;
using namespace driftfx::internal::prism::es2::glx;

GLXSharedTexture::GLXSharedTexture(GLContext* context, GLContext* fxContext, math::Vec2ui size) :
	SharedTexture(context, size),
	fxContext(fxContext) {

	Allocate();
}

GLXSharedTexture::~GLXSharedTexture() {

	Release();
}

ShareData* GLXSharedTexture::CreateShareData() {
	GLXShareData* data = new GLXShareData();
	data->textureName = glTexture->Name();
	return data;
}

void GLXSharedTexture::Allocate() {
	auto begin = std::chrono::steady_clock::now();

	LogDebug("Allocating GL Texture ctx:" << glContext << ", size: " << &size);
	glTexture = static_cast<GLTexture*>(glContext->CreateTexture(size.x, size.y));
	GLCALL( glBindTexture(GL_TEXTURE_2D, glTexture->Name()) );
	GLCALL( glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, size.x, size.y, 0, GL_BGRA, GL_UNSIGNED_BYTE, NULL) );
	GLCALL( glBindTexture(GL_TEXTURE_2D, 0) );

	auto duration = std::chrono::duration_cast<std::chrono::nanoseconds>(std::chrono::steady_clock::now() - begin);
	LogDebug("allocation needed " << duration.count() << "ns");
}

void GLXSharedTexture::Release() {
	LogDebug("Releasing texture " << glTexture);
	delete glTexture;
	glTexture = nullptr;
}

bool GLXSharedTexture::BeforeRender() {
	return true;
}

bool GLXSharedTexture::AfterRender() {
//	SignalFrameReady();
//	WaitForFrameReady();
	return true;
}






