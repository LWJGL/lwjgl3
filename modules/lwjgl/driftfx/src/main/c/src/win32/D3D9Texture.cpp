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
#include <utils/Logger.h>
#include "D3D9Texture.h"

#include <string>
#include <iostream>

#include "D3D9ExContext.h"

using namespace std;

using namespace driftfx::internal::win32;

D3D9Texture::D3D9Texture(D3D9ExContext *context, int width, int height) :
	Texture(width, height),
	context(context),
	texture(nullptr),
	textureShareHandle(nullptr) {

	DWORD usage = D3DUSAGE_NONSECURE | D3DUSAGE_DYNAMIC;
	//usage = 0;
	HRESULT hr = context->d3d9Device->CreateTexture(
			width, height,
			0, usage,
			D3DFMT_A8R8G8B8, D3DPOOL_DEFAULT, &texture, &textureShareHandle);

	switch (hr) {
	case D3D_OK: { // nice
		LogDebug("Created D3D9Texture " << hex << texture << ", shareHandle: " << hex << textureShareHandle << " (" << dec << width << "x" << dec << height << ")");
		break;
	}
	case D3DERR_INVALIDCALL: LogError( "D3DERR_INVALIDCALL" ); break;
	case D3DERR_OUTOFVIDEOMEMORY: LogError( "D3DERR_OUTOFVIDEOMEMORY" ); break;
	case E_OUTOFMEMORY: LogError( "E_OUTOFMEMORY" ); break;
	default: LogError( "Unknown DirectX Error " << to_string(hr) );
	}

	if ( texture == NULL ) {
		LogError( "Unknown DirectX Error; Got no texture" );
	}

}


D3D9Texture::~D3D9Texture() {
	LogDebug("Disposing D3D9Texture on thread " << texture << ", shareHandle: " << textureShareHandle);

	// we only call release once! sometimes a second call causes an EXCEPTION_ACCESS_VIOLATION
	// drivers which mess up the AddRef in their DX_interop calls will cause issues here
	int count = texture->Release();
	if (count != 0) {
		LogError("After releasing the D3D Texture the refcount was " << count << ". Most likely your driver messed up the ref count within the DX_interop extension. Consider to use another transfer mode");
	}

	texture = NULL;
	textureShareHandle = NULL;
}

IDirect3DTexture9* D3D9Texture::GetTexture() {
	return texture;
}

HANDLE D3D9Texture::GetShareHandle() {
	return textureShareHandle;
}
