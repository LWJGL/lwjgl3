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



#include "PrismBridge.h"
#include <utils/Logger.h>
#include <SharedTexture.h>
#include <TransferModeManager.h>

#include <map>
#include <iostream>

using namespace driftfx;
using namespace driftfx::gl;

using namespace driftfx::internal;
using namespace driftfx::internal::prism;

PrismBridge* PrismBridge::bridge = nullptr;
std::map<SharedTextureFactoryId, OnTextureCreatedFunc> PrismBridge::handlers;

PrismBridge* PrismBridge::Get() {
	return bridge;
}

PrismBridge::PrismBridge(Context* fxContext) :
		defaultContext(nullptr),
		fxContext(fxContext) {

}

PrismBridge::~PrismBridge() {

}

void PrismBridge::Destroy() {
	delete bridge;
	bridge = nullptr;
}


GLContext* PrismBridge::GetDefaultContext() {
	return defaultContext;
}

Context* PrismBridge::GetFxContext() {
	return fxContext;
}

SharedTextureFactoryId PrismBridge::Register(SharedTextureFactoryId id, OnTextureCreatedFunc func) {
	// WTF? Logger seems here to segvault!!
	auto name = SharedTextureFactory::GetFactoryName(id);
	std::cout << "PrismBridge Registering Shared Texture Handler " << id << " (" << name << ")" << std::endl;
	std::cout << "about to segvault!" << std::endl << std::flush;
	//LogDebug("ABOUT TO SEGVAULT!");
	//LogDebug("Registered prism handler for " << id);
	handlers[id] = func;
	return id;
}

void PrismBridge::EnsurePrismContext() {
	// NOOP here
}

int PrismBridge::OnTextureCreated(Frame* frame, jobject fxTexture) {
	EnsurePrismContext();
	auto modeId = frame->GetSurfaceData().transferMode;
	auto mode = TransferModeManager::Instance()->GetTransferMode(modeId);
	if (mode == nullptr) {
		LogError("TransferMode not available " << modeId);
		return 0;
	}
	else {
		return mode->OnTextureCreated(this, frame, fxTexture);
	}
}
