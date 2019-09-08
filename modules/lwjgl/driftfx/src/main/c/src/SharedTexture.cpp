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

#include "SharedTexture.h"

#include <DriftFX/math/Vec2.h>

#include "Common.h"

#include <DriftFX/Context.h>

#include <utils/Logger.h>
#include <gl/GLLog.h>

using namespace driftfx;
using namespace driftfx::math;
using namespace driftfx::gl;
using namespace driftfx::internal;

SharedTexture::SharedTexture(GLContext* glContext, math::Vec2ui size) :
	size(size),
	glContext(glContext),
	glTexture(nullptr),
	frameReady(nullptr) {
}

SharedTexture::~SharedTexture() {
	LogDebug(" * SharedTexture Destructor!")
}

std::string SharedTexture::ToString() {
	std::ostringstream s;
	s << "SharedTexture[" << GetSize().x << " x " << GetSize().y << " ]";
	return s.str();
}

GLTexture* SharedTexture::GetTexture() {
	return glTexture;
}

math::Vec2ui SharedTexture::GetSize() {
	return size;
}

void SharedTexture::SignalFrameReady() {
	GLCALL(frameReady = glFenceSync(GL_SYNC_GPU_COMMANDS_COMPLETE, 0));
}

void SharedTexture::WaitForFrameReady() {
	GLenum state;
	auto begin = std::chrono::steady_clock::now();
	GLCALL(state = glClientWaitSync(frameReady, GL_SYNC_FLUSH_COMMANDS_BIT, 1000000000));
	GLCALL(glDeleteSync(frameReady));
	switch (state) {
	case GL_ALREADY_SIGNALED: LogDebug("frameDone sync already signaled"); break;
	case GL_TIMEOUT_EXPIRED: LogError("frameDone sync timed out!"); break;
	case GL_CONDITION_SATISFIED: LogDebug("frameDone sync awaited"); break;
	case GL_WAIT_FAILED: LogError("frameDone sync failed!"); break;
	}
	auto duration = std::chrono::duration_cast<std::chrono::nanoseconds>(std::chrono::steady_clock::now() - begin);
	LogDebug("wait for frame ready needed " << duration.count() << "ns");

}

SharedTextureFactoryId SharedTextureFactory::NOOP = 0;
SharedTextureFactoryId SharedTextureFactory::PLATFORM_DEFAULT = 1;
SharedTextureFactoryId SharedTextureFactory::FALLBACK = 2;


SharedTextureFactoryId SharedTextureFactory::nextType = 10;
std::map<SharedTextureFactoryId, SharedTextureFactoryData> SharedTextureFactory::factories;

SharedTexture* SharedTextureFactory::CreateSharedTexture(SharedTextureFactoryId type, GLContext* context, Context* fxContext, math::Vec2ui size) {
	LogDebug("CreateSharedTexture " << type);
	auto iter = factories.find(type);
	if (iter != factories.end()) {
		auto data = iter->second;
		auto factory = data.func;

		auto sharedTexture = factory(context, fxContext, size);
		return sharedTexture;
	}
	else {
		// factory not available
		LogError("Cannot create a shared texture of type " << type);
		return nullptr;
	}
}

SharedTextureFactoryId SharedTextureFactory::RegisterSharedTextureType(std::string name, SharedTextureFactoryFunc factory) {
	auto id = ++nextType;
	return RegisterSharedTextureType(id, name, factory);
}
SharedTextureFactoryId SharedTextureFactory::RegisterSharedTextureType(SharedTextureFactoryId id, std::string name, SharedTextureFactoryFunc factory) {
	LogInfo("Registering Shared Texture Factory " << name << " as " << id);
	SharedTextureFactoryData data;
	data.id = id;
	data.name = name;
	data.func = factory;
	factories[id] = data;
	return id;
}
SharedTextureFactoryId SharedTextureFactory::RegisterSharedTextureTypeAlias(SharedTextureFactoryId aliasId, SharedTextureFactoryId id) {
	LogInfo("Registering Shared Texture Factory Alias " << aliasId << " -> " << id);
	if (factories.find(aliasId) != factories.end() ) {
		LogError("Already registerd! " << aliasId);
		return -1;
	}
	else {
		SharedTextureFactoryData origData = factories[id];
		SharedTextureFactoryData data;
		data.id = aliasId;
		data.name = origData.name;
		data.func = origData.func;
		factories[aliasId] = data;
		return aliasId;
	}
}

std::string SharedTextureFactory::GetFactoryName(SharedTextureFactoryId id) {
	auto data = factories[id];
	return data.name;
}
