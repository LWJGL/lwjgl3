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

#include "MainMemorySharedTexture.h"

#include <DriftFX/math/Vec2.h>

#include <GL/glew.h>
#include "gl/GLLog.h"
#include <DriftFX/GL/GLContext.h>

#include <FrameManager.h>

#include <utils/Logger.h>

#include <iostream>

#include <memory.h>

using namespace std;

using namespace driftfx;
using namespace driftfx::gl;
using namespace driftfx::math;
using namespace driftfx::internal;




MainMemorySharedTexture::MainMemorySharedTexture(GLContext* context, math::Vec2ui size)
: SharedTexture(context, size),
  memSize(size.x * size.y * 4),
  pointer(nullptr) {

	Allocate();
}

MainMemorySharedTexture::~MainMemorySharedTexture() {
	Release();
}

ShareData* MainMemorySharedTexture::CreateShareData() {
	MainMemoryShareData* data = new MainMemoryShareData();
	data->pointer = pointer;
	data->length = memSize;
	return data;
}

void MainMemorySharedTexture::Allocate() {
	auto begin = std::chrono::steady_clock::now();

	// prepare the texture
	glTexture = static_cast<GLTexture*>(glContext->CreateTexture(size.x, size.y));

	GLCALL( glBindTexture(GL_TEXTURE_2D, glTexture->Name()) );
	GLCALL( glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, size.x, size.y, 0, GL_BGRA, GL_UNSIGNED_BYTE, 0) );
	GLCALL( glBindTexture(GL_TEXTURE_2D, 0) );

	// prepare the memory
	pointer = malloc(memSize);

	auto duration = std::chrono::duration_cast<std::chrono::nanoseconds>(std::chrono::steady_clock::now() - begin);
	LogDebug("allocation needed " << duration.count() << "ns");
}

void MainMemorySharedTexture::Release() {
	// release texture
	delete glTexture;
	// release memory
	free(pointer);
	pointer = nullptr;
}

bool MainMemorySharedTexture::BeforeRender() {
	return true;
}

bool MainMemorySharedTexture::AfterRender() {
	SignalFrameReady();

	// TODO move the download operation to another thread
	DownloadToMemory();

	return true;
}

void DownloadToMemoryNaive(unsigned int tex, unsigned int size, void* pointer) {

#ifdef WIN32
	GLuint format = GL_BGRA;
#else
	GLuint format = GL_RGBA;
#endif

	GLCALL( glBindTexture(GL_TEXTURE_2D, tex) );
	GLCALL( glGetTexImage(GL_TEXTURE_2D, 0, format, GL_UNSIGNED_INT_8_8_8_8_REV, pointer) );
	GLCALL( glBindTexture(GL_TEXTURE_2D, 0) );
}

void DownloadToMemoryBuf(unsigned int tex, unsigned int size, void* pointer) {
	GLuint buf;
	GLCALL( glGenBuffers(1, &buf) );
	GLCALL( glBindBuffer(GL_PIXEL_PACK_BUFFER, buf) );
	GLCALL( glBufferData(GL_PIXEL_PACK_BUFFER, size, 0, GL_STATIC_READ) );

#ifdef WIN32
	GLuint format = GL_BGRA;
#else
	GLuint format = GL_RGBA;
#endif

	GLCALL( glBindTexture(GL_TEXTURE_2D, tex) );
	GLCALL( glGetTexImage(GL_TEXTURE_2D, 0, format, GL_UNSIGNED_INT_8_8_8_8_REV, 0) );
	GLCALL( glBindTexture(GL_TEXTURE_2D, 0) );


	void* glBuf;
	GLCALL( glBuf = glMapBuffer(GL_PIXEL_PACK_BUFFER, GL_READ_ONLY) );
	memcpy(pointer, glBuf, size);
	GLCALL( glUnmapBuffer(GL_PIXEL_PACK_BUFFER) );

	GLCALL( glBindBuffer(GL_PIXEL_PACK_BUFFER, 0) );
	GLCALL( glDeleteBuffers(1, &buf) );
}

void MainMemorySharedTexture::DownloadToMemory() {
	WaitForFrameReady();
	// download pixel data
	auto begin = std::chrono::steady_clock::now();
	DownloadToMemoryBuf(GetTexture()->Name(), memSize, pointer);
	auto duration = std::chrono::duration_cast<std::chrono::nanoseconds>(std::chrono::steady_clock::now() - begin);
	LogDebug("download frame needed " << duration.count() << "ns");


}
