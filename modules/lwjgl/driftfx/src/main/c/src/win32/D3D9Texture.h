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
#ifndef SHAREDSURFACE_WIN32_D3D9TEXTURE_H_
#define SHAREDSURFACE_WIN32_D3D9TEXTURE_H_

#define D3D_DEBUG_INFO
#include <d3d9.h>

#include <DriftFX/Texture.h>

namespace driftfx {
namespace internal {
namespace win32 {

class D3D9ExContext;
class D3D9Texture : public Texture {
	friend D3D9ExContext;

public:
	D3D9Texture(D3D9ExContext *context, int width, int height);
	virtual ~D3D9Texture();

	IDirect3DTexture9* GetTexture();
	HANDLE GetShareHandle();

protected:
	D3D9ExContext *context;

	IDirect3DTexture9 *texture;
	HANDLE textureShareHandle;

};

}
}
}

#endif /* SHAREDSURFACE_WIN32_D3D9TEXTURE_H_ */
