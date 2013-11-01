/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"

DECLARE_CALLBACK_STATIC(XErrorHandler)

static int XErrorHandlerProc(
	Display* display,
	XErrorEvent* error_event
) {
	JNIEnv* env = getEnv();

	return (*env)->CallStaticIntMethod(
		env, XErrorHandlerClass, XErrorHandlerInvoke,
		(jlong)(intptr_t)display, (jlong)(intptr_t)error_event
	);
}

CALLBACK_SETUP_STATIC(org_lwjgl_system_linux_XErrorHandler, XErrorHandler)
