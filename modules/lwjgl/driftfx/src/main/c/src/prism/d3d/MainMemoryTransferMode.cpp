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

#include <functional>
#include <iostream>
#include <iomanip>
#include <chrono>

#include <prism/PrismBridge.h>
#include <SharedTexture.h>
#include <MainMemorySharedTexture.h>

#include <utils/Logger.h>

#include "D3DPrismBridge.h"

#include <win32/Error.h>

#include <prism/d3d/include/java8/D3DContext.h>

#include <TransferModeManager.h>

namespace driftfx {
namespace internal {
namespace prism {
namespace d3d {

class MainMemoryTransferMode : public TransferMode {
public:
	SharedTexture* CreateSharedTexture(GLContext* glContext, Context* fxContext, math::Vec2ui size) {
		return new MainMemorySharedTexture(glContext, size);
	}
	int OnTextureCreated(prism::PrismBridge* bridge, Frame* frame, jobject fxTexture) {
				LogDebug("OnTextureCreated(" << bridge << ", " << frame << ", " << fxTexture << ")");

		ShareData* data = frame->GetData();
		MainMemoryShareData* mmdata = (MainMemoryShareData*)data;


		auto pixels = (byte*) mmdata->pointer;

		D3DPrismBridge* d3dBridge = static_cast<D3DPrismBridge*>(bridge);

		void* resourceHandle = d3dBridge->GetD3DResourceHandle(fxTexture);
		java8::D3DResource* d3dResource = (java8::D3DResource*) resourceHandle;

		IDirect3DTexture9* texture = d3dResource->pTexture;
	
		
		// upload to D3D texture
		auto size = frame->GetSize();
		
		D3DLOCKED_RECT tmp;
		auto start = std::chrono::steady_clock::now();
		WERR(texture->LockRect(0, &tmp, NULL, D3DLOCK_DISCARD));

		byte* rowBits = (byte*)tmp.pBits;
		int sourcePitch = size.x * 4 * sizeof(byte);
		for (unsigned int h = 0; h < size.y; h++) {

			int offset = h * sourcePitch;
			memcpy(rowBits, (pixels + offset), sourcePitch);
			rowBits += tmp.Pitch;
		}

		WERR(texture->UnlockRect(0));
		auto end = std::chrono::steady_clock::now();
		LogDebug("Uploading " << std::dec << size.x * size.y << "px needed " << std::chrono::duration_cast<std::chrono::nanoseconds>(end - start).count() << "ns");

		auto startSync = std::chrono::steady_clock::now();
		WERR(texture->LockRect(0, &tmp, NULL, D3DLOCK_READONLY));

		WERR(texture->UnlockRect(0));
		auto endSync = std::chrono::steady_clock::now();
		LogDebug("Relocking d3d tex for sync needed " << std::chrono::duration_cast<std::chrono::nanoseconds>(endSync - startSync).count() << "ns");

		return 0;
	}
	virtual bool isFallback() {
		return true;
	}
protected:
	MainMemoryTransferMode() : TransferMode("MainMemory") {}
	static TransferModeId registered;
};

TransferModeId MainMemoryTransferMode::registered = TransferModeManager::Instance()->RegisterTransferMode(new MainMemoryTransferMode());


}
}
}
}
