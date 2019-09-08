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

NoopSharedTexture::NoopSharedTexture(GLContext* context, math::Vec2ui size) : SharedTexture(context, size) {
	Allocate();
}

NoopSharedTexture::~NoopSharedTexture() {
	Release();
}

ShareData* NoopSharedTexture::CreateShareData() {
	return nullptr;
}

void NoopSharedTexture::Allocate() {
	glTexture = static_cast<GLTexture*>(glContext->CreateTexture(size.x, size.y));
	GLCALL( glBindTexture(GL_TEXTURE_2D, glTexture->Name()) );
	GLCALL( glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, size.x, size.y, 0, GL_BGRA, GL_UNSIGNED_BYTE, 0) );
}
void NoopSharedTexture::Release() {
	delete glTexture;
}

bool NoopSharedTexture::BeforeRender() {
	return true;
}

bool NoopSharedTexture::AfterRender() {
	return true;
}

