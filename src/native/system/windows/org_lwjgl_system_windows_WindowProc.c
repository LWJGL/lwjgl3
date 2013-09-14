/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

DECLARE_CALLBACK(wndProc);

DECLARE_CALLBACK(wndProcSync);
DECLARE_CALLBACK(wndProcAsync);

DECLARE_CALLBACK_STATIC(wndProcStaticSync);
DECLARE_CALLBACK_STATIC(wndProcStaticAsync);

#define RETRIEVE_CALLBACK() \
	jobject callback = (jobject)GetWindowLongPtr(hWnd, 0); \
	if ( callback == NULL ) { \
		if ( msg == WM_NCCREATE ) \
			SetWindowLongPtr(hWnd, 0, (intptr_t)(callback = (jobject)(((LPCREATESTRUCT)lParam)->lpCreateParams))); \
		else \
			return DefWindowProc(hWnd, msg, wParam, lParam); \
	}

#define WND_PROC_SYNC(NAME) \
static LRESULT CALLBACK NAME##Proc( \
	HWND hWnd, \
	UINT msg, \
	WPARAM wParam, \
	LPARAM lParam \
) { \
	JNIEnv *env = getEnv(); \
\
	RETRIEVE_CALLBACK() \
\
	return (LRESULT)(*env)->CallLongMethod( \
		env, callback, NAME##Invoke, \
		(jlong)(intptr_t)hWnd, (jint)msg, (jlong)wParam, (jlong)lParam \
	); \
}

WND_PROC_SYNC(wndProc)
WND_PROC_SYNC(wndProcSync)

// May be called from a non-JVM thread.
static LRESULT CALLBACK wndProcAsyncProc(
	HWND hWnd,
	UINT msg,
	WPARAM wParam,
	LPARAM lParam
) {
	JNIEnv* env;
	LRESULT __result;

	RETRIEVE_CALLBACK()

	env = attachCurrentThread();
	__result = (LRESULT)(*env)->CallLongMethod(
		env, callback, wndProcAsyncInvoke,
		(jlong)(intptr_t)hWnd, (jint)msg, (jlong)wParam, (jlong)lParam
	);
	DETACH_THREAD()

	return __result;
}

// Static version, doesn't use extra window memory
static LRESULT CALLBACK wndProcStaticSyncProc(
	HWND hWnd,
	UINT msg,
	WPARAM wParam,
	LPARAM lParam
) {
	JNIEnv *env = getEnv();

	return (LRESULT)(*env)->CallStaticLongMethod(
		env, wndProcStaticSyncClass, wndProcStaticSyncInvoke,
		(jlong)(intptr_t)hWnd, (jint)msg, (jlong)wParam, (jlong)lParam
	);
}

// Static + Async
static LRESULT CALLBACK wndProcStaticAsyncProc(
	HWND hWnd,
	UINT msg,
	WPARAM wParam,
	LPARAM lParam
) {
	LRESULT __result;

	ATTACH_THREAD()
	__result = (LRESULT)(*env)->CallStaticLongMethod(
		env, wndProcStaticAsyncClass, wndProcStaticAsyncInvoke,
		(jlong)(intptr_t)hWnd, (jint)msg, (jlong)wParam, (jlong)lParam
	);
	DETACH_THREAD()

	return __result;
}

CALLBACK_SETUP(org_lwjgl_system_windows_WindowProc, wndProc)
CALLBACK_SETUP_MULTI(org_lwjgl_system_windows_WindowProc, wndProc, Sync)
CALLBACK_SETUP_MULTI(org_lwjgl_system_windows_WindowProc, wndProc, Async)
CALLBACK_SETUP_STATIC_MULTI(org_lwjgl_system_windows_WindowProc, wndProc, StaticSync)
CALLBACK_SETUP_STATIC_MULTI(org_lwjgl_system_windows_WindowProc, wndProc, StaticAsync)