/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

static jmethodID wndProcInvoke;

static jmethodID wndProcSyncInvoke;
static jmethodID wndProcAsyncInvoke;

static jclass wndProcStaticSyncInvokeClass;
static jclass wndProcStaticAsyncInvokeClass;

static jmethodID wndProcStaticSyncInvoke;
static jmethodID wndProcStaticAsyncInvoke;

inline static jobject getCallback(HWND hWnd, UINT msg, LPARAM lParam) {
	jobject callback;
	if ( msg == WM_NCCREATE )
		SetWindowLongPtr(hWnd, 0, (intptr_t)(callback = (jobject)(((LPCREATESTRUCT)lParam)->lpCreateParams)));
	else
		callback = (jobject)GetWindowLongPtr(hWnd, 0);
	return callback;
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
	jobject callback = getCallback(hWnd, msg, lParam); \
	if ( callback == NULL ) /* This happens because WM_GETMINMAXINFO is fired before WM_NCCREATE */ \
		return DefWindowProc(hWnd, msg, wParam, lParam); \
\
	return (*env)->CallIntMethod( \
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
	jobject callback = getCallback(hWnd, msg, lParam);
	LRESULT __result;

	ATTACH_THREAD()

   	if ( callback == NULL ) // This happens because WM_GETMINMAXINFO is fired before WM_NCCREATE
   		__result = DefWindowProc(hWnd, msg, wParam, lParam);
	else
		__result = (*env)->CallIntMethod(
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

	return (*env)->CallStaticIntMethod(
		env, wndProcStaticSyncInvokeClass, wndProcStaticSyncInvoke,
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
	__result = (*env)->CallStaticIntMethod(
		env, wndProcStaticAsyncInvokeClass, wndProcStaticAsyncInvoke,
		(jlong)(intptr_t)hWnd, (jint)msg, (jlong)wParam, (jlong)lParam
	);
	DETACH_THREAD()

	return __result;
}

CALLBACK_SETUP(org_lwjgl_system_windows_WindowProc, wndProc)
CALLBACK_SETUP_MULTI(org_lwjgl_system_windows_WindowProc, wndProc, Sync)
CALLBACK_SETUP_MULTI(org_lwjgl_system_windows_WindowProc, wndProc, Async)
CALLBACK_SETUP_MULTI(org_lwjgl_system_windows_WindowProc, wndProc, StaticSync)
CALLBACK_SETUP_MULTI(org_lwjgl_system_windows_WindowProc, wndProc, StaticAsync)