/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"

static jclass XErrorHandlerClass;
static jmethodID XErrorHandlerInvoke;

static int XErrorHandlerProc(
	Display* display,
	XErrorEvent* error_event
) {
	int __result;

	ENTER_ENV()

	__result = (*env)->CallStaticIntMethod(
		env, XErrorHandlerClass, XErrorHandlerInvoke,
		(jlong)(intptr_t)display, (jlong)(intptr_t)error_event
	);

	EXIT_ENV()

	return __result;
}

// setCallback(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_XErrorHandler_setCallback(JNIEnv *env, jclass clazz,
	jobject method
) {
	XErrorHandlerClass = clazz;
	XErrorHandlerInvoke = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&XErrorHandlerProc;
}