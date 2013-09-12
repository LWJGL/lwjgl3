/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "glfw3.h"

static jclass GLFWerrorfunClass;
static jmethodID GLFWerrorInvoke;

static void GLFWerror(
	int error,
	const char* description
) {
	JNIEnv* env = getEnv();
	(*env)->CallStaticVoidMethod(
		env, GLFWerrorfunClass, GLFWerrorInvoke,
		(jint)error, (jlong)(intptr_t)description
	);
}

// setCallback(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_ErrorCallback_setCallback(JNIEnv *env, jclass clazz,
	jobject method
) {
	GLFWerrorfunClass = clazz;
	GLFWerrorInvoke = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&GLFWerror;
}