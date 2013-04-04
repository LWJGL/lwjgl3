/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

static jmethodID wndProcInvoke;

static jmethodID wndProcInvokeSync;
static jmethodID wndProcInvokeAsync;

static jclass wndProcInvokeStaticSyncClass;
static jclass wndProcInvokeStaticAsyncClass;

static jmethodID wndProcInvokeStaticSync;
static jmethodID wndProcInvokeStaticAsync;

static inline jobject getCallback(HWND hWnd, UINT msg, LPARAM lParam) {
	jobject callback;
	if ( msg == WM_NCCREATE )
		SetWindowLongPtr(hWnd, 0, (intptr_t)(callback = (jobject)(((LPCREATESTRUCT)lParam)->lpCreateParams)));
	else
		callback = (jobject)GetWindowLongPtr(hWnd, 0);
	return callback;
}

static LRESULT CALLBACK wndProc(
	HWND hWnd,
	UINT msg,
	WPARAM wParam,
	LPARAM lParam
) {
	JNIEnv *env = getThreadEnv();

	jobject callback = getCallback(hWnd, msg, lParam);
	if ( callback == NULL ) // This happens because WM_GETMINMAXINFO is fired before WM_NCCREATE
		return DefWindowProc(hWnd, msg, wParam, lParam);

	return (*env)->CallIntMethod(
		env, callback, wndProcInvoke,
		(jlong)(intptr_t)hWnd, (jint)msg, (jlong)wParam, (jlong)lParam
	);
}

// Same as above
static LRESULT CALLBACK wndProcSync(
	HWND hWnd,
	UINT msg,
	WPARAM wParam,
	LPARAM lParam
) {
	JNIEnv *env = getThreadEnv();

	jobject callback = getCallback(hWnd, msg, lParam);
	if ( callback == NULL ) // This happens because WM_GETMINMAXINFO is fired before WM_NCCREATE
		return DefWindowProc(hWnd, msg, wParam, lParam);

	return (*env)->CallIntMethod(
		env, callback, wndProcInvokeSync,
		(jlong)(intptr_t)hWnd, (jint)msg, (jlong)wParam, (jlong)lParam
	);
}

// May be called from a non-JVM thread.
static LRESULT CALLBACK wndProcAsync(
	HWND hWnd,
	UINT msg,
	WPARAM wParam,
	LPARAM lParam
) {
	jobject callback;
	JNIEnv *env = attachCurrentThread();
	if ( env == NULL )
		return DefWindowProc(hWnd, msg, wParam, lParam);

	callback = getCallback(hWnd, msg, lParam);
   	if ( callback == NULL ) // This happens because WM_GETMINMAXINFO is fired before WM_NCCREATE
   		return DefWindowProc(hWnd, msg, wParam, lParam);

	return (*env)->CallIntMethod(
		env, callback, wndProcInvoke,
		(jlong)(intptr_t)hWnd, (jint)msg, (jlong)wParam, (jlong)lParam
	);

	detachCurrentThread();
}

// Static version, doesn't use extra window memory
static LRESULT CALLBACK wndProcStaticSync(
	HWND hWnd,
	UINT msg,
	WPARAM wParam,
	LPARAM lParam
) {
	JNIEnv *env = getThreadEnv();

	return (*env)->CallStaticIntMethod(
		env, wndProcInvokeStaticSyncClass, wndProcInvokeStaticSync,
		(jlong)(intptr_t)hWnd, (jint)msg, (jlong)wParam, (jlong)lParam
	);
}

// Static + Async
static LRESULT CALLBACK wndProcStaticAsync(
	HWND hWnd,
	UINT msg,
	WPARAM wParam,
	LPARAM lParam
) {
	JNIEnv *env = attachCurrentThread();
	if ( env == NULL )
		return DefWindowProc(hWnd, msg, wParam, lParam);

	return (*env)->CallStaticIntMethod(
		env, wndProcInvokeStaticAsyncClass, wndProcInvokeStaticAsync,
		(jlong)(intptr_t)hWnd, (jint)msg, (jlong)wParam, (jlong)lParam
	);

	detachCurrentThread();
}

// setCallback(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WindowProc_setCallback(JNIEnv *env, jclass clazz,
	jobject method
) {
	wndProcInvoke = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&wndProc;
}

// setCallbackSync(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WindowProc_setCallbackSync(JNIEnv *env, jclass clazz,
	jobject method
) {
	wndProcInvokeSync = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&wndProcSync;
}

// setCallbackAsync(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WindowProc_setCallbackAsync(JNIEnv *env, jclass clazz,
	jobject method
) {
	wndProcInvokeAsync = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&wndProcAsync;
}

// setCallbackStaticSync(Ljava/lang/Class;Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WindowProc_setCallbackStaticSync(JNIEnv *env, jclass clazz,
	jclass callbackClass, jobject method
) {
	wndProcInvokeStaticSyncClass = callbackClass;
	wndProcInvokeStaticSync = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&wndProcStaticSync;
}

// setCallbackStaticAsync(Ljava/lang/Class;Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WindowProc_setCallbackStaticAsync(JNIEnv *env, jclass clazz,
	jclass callbackClass, jobject method
) {
	wndProcInvokeStaticAsyncClass = callbackClass;
	wndProcInvokeStaticAsync = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&wndProcStaticAsync;
}