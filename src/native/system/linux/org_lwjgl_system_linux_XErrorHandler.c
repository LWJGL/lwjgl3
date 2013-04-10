/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <stdlib.h>

static jclass XErrorHandlerClass;
static jmethodID XErrorHandlerInvoke;

static int XErrorHandlerProc(
	Display* display,
	XErrorEvent* error_event
) {
	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL ) {
            fprintf (stderr, "[LWJGL] Failed to attach to JVM in XErrorHandler callback.");
            exit(-1);
            return 0; // ignored
		}
    }

	int __result = (*env)->CallStaticIntMethod(
		env, XErrorHandlerClass, XErrorHandlerInvoke,
		(jlong)(intptr_t)display, (jlong)(intptr_t)error_event
	);

	if ( async )
		detachCurrentThread();

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