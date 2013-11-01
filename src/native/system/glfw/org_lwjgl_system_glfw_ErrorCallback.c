/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "glfw3.h"

DECLARE_CALLBACK_STATIC(GLFWerrorfun)

static void GLFWerrorfunProc(
	int error,
	const char* description
) {
	JNIEnv* env = getEnv();
	(*env)->CallStaticVoidMethod(
		env, GLFWerrorfunClass, GLFWerrorfunInvoke,
		(jint)error, (jlong)(intptr_t)description
	);
}

CALLBACK_SETUP_STATIC(org_lwjgl_system_glfw_ErrorCallback, GLFWerrorfun)
