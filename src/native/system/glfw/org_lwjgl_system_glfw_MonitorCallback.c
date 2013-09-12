/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "glfw3.h"

static jclass GLFWmonitorfunClass;
static jmethodID GLFWmonitorfunInvoke;

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

// setCallback(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_MonitorCallback_setCallback(JNIEnv *env, jclass clazz,
	jobject method
) {
	GLFWmonitorfunClass = clazz;
	GLFWmonitorfunInvoke = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&GLFWmonitorfunProc;
}