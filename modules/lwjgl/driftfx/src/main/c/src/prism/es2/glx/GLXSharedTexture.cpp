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

GLXSharedTexture::GLXSharedTexture(GLContext* context, GLContext* fxContext, Frame* frame) :
	SharedTexture(context, frame),
	fxContext(fxContext) {

	auto textureSize = frame->GetSize();
	glTexture = static_cast<GLTexture*>(glContext->CreateTexture(textureSize.x, textureSize.y));


}

GLXSharedTexture::~GLXSharedTexture() {
	LogDebug("destroying tex " << glTexture->Name());
	delete glTexture;
}

bool GLXSharedTexture::BeforeRender() {
	auto textureSize = frame->GetSize();

	GLCALL( glBindTexture(GL_TEXTURE_2D, glTexture->Name()) );
	GLCALL( glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, textureSize.x, textureSize.y, 0, GL_BGRA, GL_UNSIGNED_BYTE, NULL) );
	GLCALL( glBindTexture(GL_TEXTURE_2D, 0) );

	GLXShareData* data = new GLXShareData();
	data->textureName = glTexture->Name();
	frame->SetData(data);

	return true;
}

bool GLXSharedTexture::AfterRender() {
	std::cout << "FOO" << std::endl << std::flush;
	SignalFrameReady();
	std::cout << "BAR" << std::endl << std::flush;
	WaitForFrameReady();
	return true;
}






