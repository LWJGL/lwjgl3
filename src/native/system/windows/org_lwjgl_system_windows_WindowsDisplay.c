/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

static jclass windowsDisplayClass;
static jmethodID javaWindowProc;

static LRESULT CALLBACK lwjglWindowProc(
	HWND hWnd,
	UINT msg,
	WPARAM wParam,
	LPARAM lParam
) {
	JNIEnv *env = getThreadEnv();
	if ( env != NULL /*&& !(*env)->ExceptionOccurred(env)*/ ) // TODO: If the ExceptionOccurred check required?
		return (*env)->CallStaticIntMethod(
			env, windowsDisplayClass, javaWindowProc,
			(jlong)(intptr_t)hWnd, (jint)msg, (jlong)wParam, (jlong)lParam
		);

	return DefWindowProc(hWnd, msg, wParam, lParam);
}

// setJavaWindowProc(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_WindowsDisplay_setJavaWindowProc(JNIEnv *env, jclass clazz,
	jobject method
) {
	windowsDisplayClass = clazz;
	javaWindowProc = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&lwjglWindowProc;
}