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

#include <chrono>
#include <string>
#include <iostream>

#include "SharedTexture.h"
#include "NoopSharedTexture.h"

#include <DriftFX/math/Vec2.h>

#include <GL/glew.h>
#include "gl/GLLog.h"

#include <utils/Logger.h>

using namespace driftfx;
using namespace driftfx::gl;
using namespace driftfx::math;
using namespace driftfx::internal;

NoopSharedTexture::NoopSharedTexture(GLContext* context, Frame* frame) : SharedTexture(context, frame) {

}

NoopSharedTexture::~NoopSharedTexture() {

}

bool NoopSharedTexture::BeforeRender() {
	// prepare texture
	auto textureSize = frame->GetSize();
	glTexture = static_cast<GLTexture*>(glContext->CreateTexture(textureSize.x, textureSize.y));

	GLCALL( glBindTexture(GL_TEXTURE_2D, glTexture->Name()) );
	GLCALL( glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, textureSize.x, textureSize.y, 0, GL_BGRA, GL_UNSIGNED_BYTE, 0) );

	return true;
}

bool NoopSharedTexture::AfterRender() {
	// destroy texture
	delete glTexture;

	return true;
}

