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
#ifndef SHAREDSURFACE_WIN32_D3D9EXCONTEXT_H_
#define SHAREDSURFACE_WIN32_D3D9EXCONTEXT_H_

#define D3D_DEBUG_INFO
#include <d3d9.h>

#include <DriftFX/Context.h>
#include <DriftFX/Texture.h>

namespace driftfx {
namespace internal {
namespace win32 {

class D3D9Texture;
class D3D9ExContext : public Context {
	friend D3D9Texture;

public:
	D3D9ExContext(std::string name);
	D3D9ExContext(std::string name, IDirect3D9Ex *d3d9, IDirect3DDevice9Ex *device);

	virtual ~D3D9ExContext();

	virtual Texture* CreateTexture(int width, int height);

	virtual IDirect3D9Ex* GetD3D9();
	virtual IDirect3DDevice9Ex* Device();

	virtual std::string GetName();

private:
	std::string name;

	IDirect3D9Ex* d3d9;
	IDirect3DDevice9Ex* d3d9Device;

	HWND hWnd;

	static LRESULT APIENTRY WndProc(HWND hWnd, UINT message, WPARAM wParam, LPARAM lParam);

};

}
}
}

#endif /* SHAREDSURFACE_WIN32_D3D9EXCONTEXT_H_ */
