/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include <jni.h>
#include "OpenGL.h"

static jmethodID DEBUGPROCMethod;

static void APIENTRY DEBUGPROCFunction(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, const GLchar* message, GLvoid* userParam) {
	JNIEnv *env = getThreadEnv();
	jboolean async = env == NULL;
	if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL )
            return;
	}

    (*env)->CallVoidMethod(env, (jobject)userParam, DEBUGPROCMethod,
        (jint)source,
        (jint)type,
        (jint)id,
        (jint)severity,
        (jint)length,
        (jlong)(intptr_t)message
    );

	if ( async )
        detachCurrentThread();
}

// setCallback(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_DEBUGPROC_setCallback(JNIEnv *env, jclass clazz,
	jobject method
) {
	DEBUGPROCMethod = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&DEBUGPROCFunction;
}