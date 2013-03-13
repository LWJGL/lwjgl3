/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "glfw3.h"

static jclass GLFWerrorfunClass;
static jmethodID GLFWerrorfunInvoke;

static void GLFWerrorfunProc(
	int error,
	const char* description
) {
	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL )
            return;
    }

	(*env)->CallStaticVoidMethod(
		env, GLFWerrorfunClass, GLFWerrorfunInvoke,
		(jint)error, (jlong)(intptr_t)description
	);

	if ( async )
		detachCurrentThread();
}

// setCallback(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_glfw_ErrorCallback_setCallback(JNIEnv *env, jclass clazz,
	jobject method
) {
	GLFWerrorfunClass = clazz;
	GLFWerrorfunInvoke = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&GLFWerrorfunProc;
}