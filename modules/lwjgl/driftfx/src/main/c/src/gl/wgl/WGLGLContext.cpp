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
#include "WGLGLContext.h"

#include <utils/Logger.h>

#include <iomanip>
#include <iostream>
#include <sstream>
using namespace std;

#include "../../win32/Error.h"

using namespace driftfx::gl;

using namespace driftfx::internal::gl::wgl;

namespace driftfx {
namespace internal {
namespace gl {
namespace wgl {


void setupPixelFormat(HDC hDC) {

	PIXELFORMATDESCRIPTOR pfd = {
			sizeof(PIXELFORMATDESCRIPTOR),
			1,
			PFD_DRAW_TO_WINDOW | PFD_SUPPORT_OPENGL | PFD_DOUBLEBUFFER,
			PFD_TYPE_RGBA,
			32,
			0, 0, 0, 0, 0, 0,
			0,
			0,
			0,
			0, 0, 0, 0,
			24,
			8,
			0,
			PFD_MAIN_PLANE,
			0,
			0, 0, 0
	};

	int pixelFormat;

	pixelFormat = ChoosePixelFormat(hDC, &pfd);
	if (pixelFormat == 0) {
		LogError("ChoosePixelFormat failed.")
		exit(1);
	}

	if (SetPixelFormat(hDC, pixelFormat, &pfd) != TRUE) {
		LogError("SetPixelFormat failed.")
	}

}

HPALETTE setupPalette(HDC hDC) {
	int pixelFormat = GetPixelFormat(hDC);
	PIXELFORMATDESCRIPTOR pfd;
	LOGPALETTE *pPal;
	int paletteSize;

	DescribePixelFormat(hDC, pixelFormat, sizeof(PIXELFORMATDESCRIPTOR), &pfd);

	if (pfd.dwFlags & PFD_NEED_PALETTE) {
		paletteSize = 1 << pfd.cColorBits;
	}
	else {
		return 0;
	}

	pPal = (LOGPALETTE*) malloc(sizeof(LOGPALETTE) + paletteSize * sizeof(PALETTEENTRY));
	pPal->palVersion = 0x300;
	pPal->palNumEntries = paletteSize;

	{
		int redMask = (1 << pfd.cRedBits) - 1;
		int greenMask = (1 << pfd.cGreenBits) - 1;
		int blueMask = (1 << pfd.cBlueBits) - 1;
		int i;

		for (i = 0; i < paletteSize; ++i) {
			pPal->palPalEntry[i].peRed =
					(((i >> pfd.cRedShift) & redMask) * 255) / redMask;
			pPal->palPalEntry[i].peGreen =
					(((i >> pfd.cGreenShift) & greenMask) * 255) / greenMask;
			pPal->palPalEntry[i].peBlue =
					(((i >> pfd.cBlueShift) & blueMask) * 255) / blueMask;
		}
	}

	HPALETTE hPalette = CreatePalette(pPal);
	free(pPal);

	if (hPalette) {
		SelectPalette(hDC, hPalette, FALSE);
		RealizePalette(hDC);
	}

	return hPalette;
}

}
}
}
}

WGLGLContext::WGLGLContext(std::string name) : WGLGLContext(name, nullptr) {
}

WGLGLContext::WGLGLContext(std::string name, WGLGLContext *shared) : InternalGLContext(name), shared(shared) {

	HINSTANCE hInst = GetModuleHandle(NULL);

	//LogDebug("WGLContext Constructor, using hInst = " << hInst)

	// register window class
	WNDCLASS wndClass;
	wndClass.style = CS_OWNDC | CS_HREDRAW | CS_VREDRAW;
	wndClass.lpfnWndProc = WindowProc;
	wndClass.cbClsExtra = 0;
	wndClass.cbWndExtra = 0;
	wndClass.hInstance = hInst;
	wndClass.hIcon = LoadIcon(NULL, IDI_APPLICATION);
	wndClass.hCursor = LoadCursor(NULL, IDC_ARROW);
	wndClass.hbrBackground = (HBRUSH) GetStockObject(BLACK_BRUSH);
	wndClass.lpszMenuName = NULL;
	wndClass.lpszClassName = "OpenGL";
	RegisterClass(&wndClass);


	hWnd = CreateWindow(
			"OpenGL", "Hidden OpenGL Window",
			WS_OVERLAPPEDWINDOW | WS_CLIPCHILDREN | WS_CLIPSIBLINGS,
			0, 0, 1, 1,
			NULL, NULL, hInst, this);
}

GLContext* WGLGLContext::CreateSharedContext() {
	return CreateSharedContext("shared");
}
GLContext* WGLGLContext::CreateSharedContext(std::string name) {
	ostringstream s;
	s << GetName() << "/" << name;
	return new WGLGLContext(s.str(), this);
}

WGLGLContext::~WGLGLContext() {
	DestroyWindow(hWnd);
}

void WGLGLContext::createGL(HWND hWnd) {
	//LogDebug("hWnd = " << hWnd)

	HGLRC sharedHGLRC = nullptr;
	if (shared != nullptr) {
		sharedHGLRC = shared->hGLRC;
		//LogInfo("sharing with OpenGL Context = " << sharedHGLRC)
	}

	WERR(hDC = GetDC(hWnd);)
	setupPixelFormat(hDC);
	hPalette = setupPalette(hDC);

	//LogDebug("hDC = " << hDC)


	//cout << "Creating Temp OpenGL Context" << endl;
	WERR(HGLRC hTempContext = wglCreateContext(hDC);)
	//cout << " Temp OpenGL Context = " << hTempContext << endl;

	WERR(wglMakeCurrent(hDC, hTempContext);)
	// glewInit always seems to produce an 0x7f windows error
	glewInit();
	{
		DWORD err = GetLastError(); SetLastError(0);
		if (err == 0x7f) {
			// ok
		}
		else
		{
			LogError("glewInit error code: " << hex << err);
		}
	}
	//cout << " * Temp OpenGL Context: " << glGetString( (GLenum) GL_VERSION ) << endl;

	int attribList[] = {
			WGL_CONTEXT_MAJOR_VERSION_ARB, 4,
			WGL_CONTEXT_MINOR_VERSION_ARB, 1,
			WGL_CONTEXT_FLAGS_ARB, WGL_CONTEXT_FORWARD_COMPATIBLE_BIT_ARB | WGL_CONTEXT_DEBUG_BIT_ARB,
			WGL_CONTEXT_PROFILE_MASK_ARB, WGL_CONTEXT_CORE_PROFILE_BIT_ARB,
			0
	};

//	PFNWGLCREATECONTEXTATTRIBSARBPROC wglCreateContextAttribsARB = NULL;
//	WERR(wglCreateContextAttribsARB = (PFNWGLCREATECONTEXTATTRIBSARBPROC) wglGetProcAddress("wglCreateContextAttribsARB");)

	//cout << "Creating OpenGL Context" << endl;


	WERR(hGLRC = wglCreateContextAttribsARB(hDC, sharedHGLRC, attribList);)

	//LogDebug("created OpenGL Context = " << hGLRC)

	//WERR(wglMakeCurrent(hDC, hGLRC);)
	SetCurrent();

	// glewInit always seems to produce an 0x7f windows error
	glewInit();
	{
		DWORD err = GetLastError(); SetLastError(0);
		if (err == 0x7f) {
			// ok
		}
		else
		{
			LogError("glewInit error code: " << hex << err);
		}
	}
	//cout << "Deleting Temp OpenGL Context" << endl;
	WERR(bool deleted = wglDeleteContext(hTempContext);)
		//LogDebug("temp context deleted: " << deleted)

		LogInfo("Created OpenGL Context " << hGLRC << ": " << glGetString(GL_VERSION) << " ( shared: " << sharedHGLRC << " )")
		
		
		WERR(;);
}

void WGLGLContext::destroyGL(HWND hWnd) {
	LogDebug("destroyGL")

	if (hGLRC) {
		WERR(wglMakeCurrent(NULL, NULL);)
		WERR(wglDeleteContext(hGLRC);)
	}
	if (hPalette) {
		WERR(DeleteObject(hPalette);)
	}
	WERR(ReleaseDC(hWnd, hDC);)
}

HGLRC WGLGLContext::GetHandle() {
	return hGLRC;
}

LRESULT CALLBACK WGLGLContext::WindowProc(HWND hWnd, UINT message, WPARAM wParam, LPARAM lParam) {

	WGLGLContext* pThis;

	if (message == WM_CREATE) {
		pThis = static_cast<WGLGLContext*>(reinterpret_cast<CREATESTRUCT*>(lParam)->lpCreateParams);
		SetWindowLongPtr(hWnd, GWLP_USERDATA, reinterpret_cast<LONG_PTR>(pThis));
	}
	else {
		pThis = reinterpret_cast<WGLGLContext*>(GetWindowLongPtr(hWnd, GWLP_USERDATA));
	}

	//cout << "WindoProc pThis = " << pThis << endl;

	switch (message) {
	case WM_CREATE:
	{
		//cout << "calling createGL" << endl;
		pThis->createGL(hWnd);
		return 0;
	}
	case WM_DESTROY:
		//cout << "calling destroyGL" << endl;
		pThis->destroyGL(hWnd);
		return 0;
	}

	//cout << "delegating to DefWindowProc" << endl;

	return DefWindowProc(hWnd, message, wParam, lParam);
}


void WGLGLContext::SetCurrent() {
	WERR(bool success = wglMakeCurrent(hDC, hGLRC);)
}

void WGLGLContext::UnsetCurrent() {
	wglMakeCurrent(NULL, NULL);
}

bool WGLGLContext::IsCurrent() {
	return hGLRC == wglGetCurrentContext();
}

