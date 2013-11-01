/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "glfw3.h"

DECLARE_CALLBACK_STATIC(GLFWmonitorfun)

static void GLFWmonitorfunProc(
	GLFWmonitor* monitor,
	int event
) {
	JNIEnv* env = getEnv();
	(*env)->CallStaticVoidMethod(
		env, GLFWmonitorfunClass, GLFWmonitorfunInvoke,
		(jlong)(intptr_t)monitor, (jint)event
	);
}

CALLBACK_SETUP_STATIC(org_lwjgl_system_glfw_MonitorCallback, GLFWmonitorfun)
