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
#include <GL/wglew.h>

#include "D3DSharedFallbackTexture.h"

#include <utils/Logger.h>

#include "gl/InternalGLContext.h"

#include "SharedTexture.h"
#include "win32/Error.h"
#include "win32/D3D9ExContext.h"
#include "gl/wgl/WGLGLContext.h"

#include <DriftFX/math/Vec2.h>

#include <prism/PrismBridge.h>

#include <iostream>

#include <prism/d3d/D3DSharedTexture.h>
#include <prism/d3d/D3DPrismBridge.h>

using namespace std;

using namespace driftfx;
using namespace driftfx::math;

using namespace driftfx::internal;
using namespace driftfx::internal::gl;
using namespace driftfx::internal::gl::wgl;

using namespace driftfx::internal::prism;
using namespace driftfx::internal::prism::d3d;


void D3DSharedFallbackTexture::DownloadPixels(GLTexture* texture, byte* pixels) {
	auto start = chrono::steady_clock::now();
	glBindTexture(GL_TEXTURE_2D, texture->Name());
	glGetTexImage(GL_TEXTURE_2D, 0, GL_BGRA, GL_UNSIGNED_BYTE, pixels);
	glBindTexture(GL_TEXTURE_2D, 0); // TODO should we restore the previously bound texture?
	auto end = chrono::steady_clock::now();
	LogDebug("Downloading " << dec << texture->GetWidth() * texture->GetHeight() << "px needed " << chrono::duration_cast<chrono::nanoseconds>(end - start).count() << "ns");


	/*
	auto s1 = chrono::steady_clock::now();
	GLuint buf;
	InternalGLContext::GenBuffers(1, &buf);
	LogDebug("my buf: " << dec << buf);


	InternalGLContext::BindBuffer(GL_PIXEL_PACK_BUFFER, buf);
	glBindTexture(GL_TEXTURE_2D, texture->Name());
	InternalGLContext::GetTexImage(GL_TEXTURE_2D, 0, GL_RGBA, GL_UNSIGNED_BYTE, (GLvoid*) 0);
	GLsync pixelTransferDone = glFenceSync(GL_SYNC_GPU_COMMANDS_COMPLETE, 0);
	// Now i suspect texture is in pbo?

	auto status = glClientWaitSync(pixelTransferDone, 0, 1000000);
	if (status == GL_ALREADY_SIGNALED) LogDebug("GL_ALREADY_SIGNALED!!");
	if (status == GL_CONDITION_SATISFIED) LogDebug("GL_CONDITION_SATISFIED!!");
	if (status == GL_WAIT_FAILED) LogDebug("GL_WAIT_FAILED!!");
	if (status == GL_TIMEOUT_EXPIRED) LogDebug("GL_TIMEOUT_EXPIRED!!");
	byte *data = (byte*) InternalGLContext::MapBuffer(GL_PIXEL_PACK_BUFFER, GL_READ_ONLY);
	if (data != NULL) {
		LogDebug("1st pixel: " << hex << (int)data[0] << (int)data[1] << (int)data[2] << (int)data[3]);
		InternalGLContext::UnmapBuffer(GL_PIXEL_PACK_BUFFER);
	}
	InternalGLContext::BindBuffer(GL_PIXEL_PACK_BUFFER, 0);
	glBindTexture(GL_TEXTURE_2D, 0); // TODO should we restore the previously bound texture?
	
	InternalGLContext::DeleteBuffers(1, &buf);
	auto e1 = chrono::steady_clock::now();
	LogDebug("Mapping " << dec << texture->GetWidth() * texture->GetHeight() << "px needed " << chrono::duration_cast<chrono::nanoseconds>(e1 - s1).count() << "ns");
	*/
}


D3DSharedFallbackTexture::D3DSharedFallbackTexture(GLContext* glContext, D3D9ExContext* d3dContext, math::Vec2ui size) :
	SharedTexture(glContext, size),
	d3dContext(d3dContext),
	d3dTexture(nullptr) {
	d3dTexture = new D3D9Texture(d3dContext, size.x, size.y);
	
	Allocate();
}

D3DSharedFallbackTexture::~D3DSharedFallbackTexture() {
	Release();
	delete d3dTexture;
}

void D3DSharedFallbackTexture::Allocate() {

}

void D3DSharedFallbackTexture::Release() {

}

ShareData* D3DSharedFallbackTexture::CreateShareData() {
	WDDMShareData* frameData = new WDDMShareData();
	frameData->shareHandle = d3dTexture->GetShareHandle();
	return frameData;
}

bool D3DSharedFallbackTexture::BeforeRender() {
	glTexture = new GLTexture(glContext, size.x, size.y);
	glBindTexture(GL_TEXTURE_2D, glTexture->Name());
	glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, size.x, size.y, 0, GL_BGRA, GL_UNSIGNED_BYTE, 0);
	glBindTexture(GL_TEXTURE_2D, 0); // TODO should we restore the previously bound texture?
	return true;
}

bool D3DSharedFallbackTexture::AfterRender() {

	size_t size = sizeof(byte) * 4 * this->size.x * this->size.y;
	LogDebug("Using size: " << dec <<  size);

	byte* pixels = (byte*) malloc(size);

	DownloadPixels(glTexture, pixels);
	delete glTexture;

	D3DPrismBridge::UploadPixels(d3dTexture, pixels);

	free(pixels);

	return true;
}
