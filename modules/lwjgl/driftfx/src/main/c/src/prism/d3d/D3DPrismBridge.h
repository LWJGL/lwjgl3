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

#ifndef PRISM_D3D_D3DPRISMBRIDGE_H_
#define PRISM_D3D_D3DPRISMBRIDGE_H_

#include <jni.h>

#include "gl/wgl/WGLGLContext.h"
#include "prism/PrismBridge.h"
#include "win32/D3D9ExContext.h"
#include "SharedTexture.h"

#include "NativeSurface.h"

namespace driftfx {
namespace internal {
namespace prism {
namespace d3d {
using namespace win32;

class D3DPrismBridge : public PrismBridge {

public:
	virtual GLContext* CreateSharedContext();

	virtual D3D9ExContext* GetJfxContext();

	virtual NativeSurface* CreateNativeSurface(long surfaceId, JNINativeSurface* api);

	virtual int RecreateFXTexture(void* fxTexture, HANDLE shareHandle);

	static void Initialize(jlong pContext);
	static void Destroy();

	static void* GetD3DResourceHandle(jobject fxTexture);


	static void UploadPixels(D3D9Texture* texture, byte* pixels);


protected:
	D3DPrismBridge(jlong pContext);
	virtual ~D3DPrismBridge();

	D3D9ExContext *jfxContext;

};


}
}
}
}


#endif /* PRISM_D3D_D3DPRISMBRIDGE_H_ */
