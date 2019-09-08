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

// DirectX
#define D3D_DEBUG_INFO
#include <d3d9.h>
//#include <d3dx9.h>

#include <DriftFX/Texture.h>

#include "D3D9ExContext.h"
#include "D3D9Texture.h"

#include <iostream>
using namespace std;


using namespace driftfx;

using namespace driftfx::internal::win32;

D3D9ExContext::D3D9ExContext(std::string name, IDirect3D9Ex* d3d9, IDirect3DDevice9Ex* device) :
		name(name),
		d3d9(d3d9),
		d3d9Device(device),
		hWnd(nullptr) {
	cout << "D3D0ExContext created!" << endl;
}

D3D9ExContext::D3D9ExContext(std::string name) :
	name(name),
	d3d9(nullptr),
	d3d9Device(nullptr),
	hWnd(nullptr) {

	HINSTANCE hInst = GetModuleHandle(NULL);

	// create window

	const char* className = "Direct3D";
	const char* windowName = "Direct3DWindow";
	int winX = 0; int winY = 0; int winHeight = 300; int winWidth = 400;
	WNDCLASS wndClass;
	wndClass.style = CS_OWNDC | CS_HREDRAW | CS_VREDRAW;
	wndClass.lpfnWndProc = WndProc;
	wndClass.cbClsExtra = 0;
	wndClass.cbWndExtra = 0;
	wndClass.hInstance = hInst;
	wndClass.hIcon = LoadIcon(NULL, IDI_APPLICATION);
	wndClass.hCursor = LoadCursor(NULL, IDC_ARROW);
	wndClass.hbrBackground = (HBRUSH) GetStockObject(BLACK_BRUSH);
	wndClass.lpszMenuName = NULL;
	wndClass.lpszClassName = className;
	RegisterClass(&wndClass);

	hWnd = CreateWindow(
			className, windowName,
			WS_OVERLAPPEDWINDOW | WS_CLIPCHILDREN | WS_CLIPSIBLINGS,
			winX, winY, winWidth, winHeight,
			NULL, NULL, hInst, NULL);

	UpdateWindow(hWnd);

	// create directx

	Direct3DCreate9Ex(D3D_SDK_VERSION, &d3d9);

	D3DPRESENT_PARAMETERS d3dpp;
	ZeroMemory(&d3dpp, sizeof(d3dpp));
	d3dpp.Windowed = true;
	d3dpp.SwapEffect = D3DSWAPEFFECT_DISCARD;
	d3dpp.hDeviceWindow = hWnd;

	d3d9->CreateDeviceEx(
			D3DADAPTER_DEFAULT,
			D3DDEVTYPE_HAL,
			hWnd,
			D3DCREATE_SOFTWARE_VERTEXPROCESSING,
			&d3dpp,
			NULL,
			&d3d9Device);

	LogDebug("D3D Context created: " << d3d9Device);
}


D3D9ExContext::~D3D9ExContext() {
	// we do not want to release the passed in pointers; they are managed by javafx
	//d3d9->Release();
	if (hWnd != nullptr) {
		d3d9Device->Release();
		d3d9->Release();
	}
}

std::string D3D9ExContext::GetName() {
	return name;
}

LRESULT APIENTRY D3D9ExContext::WndProc(HWND hWnd, UINT message, WPARAM wParam, LPARAM lParam) {
	switch (message) {
	case WM_DESTROY:
		PostQuitMessage(0);
		return 0;
	}
	return DefWindowProc(hWnd, message, wParam, lParam);
}


IDirect3D9Ex* D3D9ExContext::GetD3D9() {
	return d3d9;
}

IDirect3DDevice9Ex* D3D9ExContext::Device() {
	return d3d9Device;
}


Texture* D3D9ExContext::CreateTexture(int width, int height) {
	D3D9Texture *t = new D3D9Texture(this, width, height);

	return t;
}
