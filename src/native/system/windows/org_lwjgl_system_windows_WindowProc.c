/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

DECLARE_CALLBACK(wndProc);
DECLARE_CALLBACK(wndProcInstance);

DECLARE_CALLBACK_STATIC(wndProcStatic);

#define WND_PROC_SYNC(NAME) \
static LRESULT CALLBACK NAME##Proc( \
	HWND hWnd, \
	UINT msg, \
	WPARAM wParam, \
	LPARAM lParam \
) { \
	JNIEnv *env; \
\
	jobject callback = (jobject)GetWindowLongPtr(hWnd, 0); \
	if ( callback == NULL ) { \
		if ( msg == WM_NCCREATE ) \
			SetWindowLongPtr(hWnd, 0, (intptr_t)(callback = (jobject)(((LPCREATESTRUCT)lParam)->lpCreateParams))); \
		else \
			return DefWindowProc(hWnd, msg, wParam, lParam); \
	}\
\
	env = getEnv(); \
	return (LRESULT)(*env)->CallLongMethod( \
		env, callback, NAME##Invoke, \
		(jlong)(intptr_t)hWnd, (jint)msg, (jlong)wParam, (jlong)lParam \
	); \
}

WND_PROC_SYNC(wndProc)
WND_PROC_SYNC(wndProcInstance)

// Static version, doesn't use extra window memory
static LRESULT CALLBACK wndProcStaticProc(
	HWND hWnd,
	UINT msg,
	WPARAM wParam,
	LPARAM lParam
) {
	JNIEnv *env = getEnv();

	return (LRESULT)(*env)->CallStaticLongMethod(
		env, wndProcStaticClass, wndProcStaticInvoke,
		(jlong)(intptr_t)hWnd, (jint)msg, (jlong)wParam, (jlong)lParam
	);
}

CALLBACK_SETUP(org_lwjgl_system_windows_WindowProc, wndProc)
CALLBACK_SETUP_MULTI(org_lwjgl_system_windows_WindowProc, wndProc, Instance)
CALLBACK_SETUP_STATIC_MULTI(org_lwjgl_system_windows_WindowProc, wndProc, Static)
