/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "glfw3.h"

static jmethodID GLFWwindowposfunInvoke;
static jmethodID GLFWwindowsizefunInvoke;
static jmethodID GLFWwindowclosefunInvoke;
static jmethodID GLFWwindowrefreshfunInvoke;
static jmethodID GLFWwindowfocusfunInvoke;
static jmethodID GLFWwindowiconifyfunInvoke;
static jmethodID GLFWkeyfunInvoke;
static jmethodID GLFWcharfunInvoke;
static jmethodID GLFWmousebuttonfunInvoke;
static jmethodID GLFWcursorposfunInvoke;
static jmethodID GLFWcursorenterfunInvoke;
static jmethodID GLFWscrollfunInvoke;

static void GLFWwindowposfunProc(GLFWwindow* window, int xpos, int ypos) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL ) return;
    }

	(*env)->CallVoidMethod(env, callback, GLFWwindowposfunInvoke, (jlong)(intptr_t)window, (jint)xpos, (jint)ypos);

	if ( async ) detachCurrentThread();
}

static void GLFWwindowsizefunProc(GLFWwindow* window, int width, int height) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL ) return;
    }

	(*env)->CallVoidMethod(env, callback, GLFWwindowsizefunInvoke, (jlong)(intptr_t)window, (jint)width, (jint)height);

	if ( async ) detachCurrentThread();
}

static void GLFWwindowclosefunProc(GLFWwindow* window) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL ) return;
    }

	(*env)->CallVoidMethod(env, callback, GLFWwindowclosefunInvoke, (jlong)(intptr_t)window);

	if ( async ) detachCurrentThread();
}

static void GLFWwindowrefreshfunProc(GLFWwindow* window) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL ) return;
    }

	(*env)->CallVoidMethod(env, callback, GLFWwindowrefreshfunInvoke, (jlong)(intptr_t)window);

	if ( async ) detachCurrentThread();
}

static void GLFWwindowfocusfunProc(GLFWwindow* window, int focus) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL ) return;
    }

	(*env)->CallVoidMethod(env, callback, GLFWwindowfocusfunInvoke, (jlong)(intptr_t)window, (jint)focus);

	if ( async ) detachCurrentThread();
}

static void GLFWwindowiconifyfunProc(GLFWwindow* window, int iconified) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL ) return;
    }

	(*env)->CallVoidMethod(env, callback, GLFWwindowiconifyfunInvoke, (jlong)(intptr_t)window, (jint)iconified);

	if ( async ) detachCurrentThread();
}

static void GLFWkeyfunProc(GLFWwindow* window, int key, int action) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL ) return;
    }

	(*env)->CallVoidMethod(env, callback, GLFWkeyfunInvoke, (jlong)(intptr_t)window, (jint)key, (jint)action);

	if ( async ) detachCurrentThread();
}

static void GLFWcharfunProc(GLFWwindow* window, int character) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL ) return;
    }

	(*env)->CallVoidMethod(env, callback, GLFWcharfunInvoke, (jlong)(intptr_t)window, (jint)character);

	if ( async ) detachCurrentThread();
}

static void GLFWmousebuttonfunProc(GLFWwindow* window, int button, int action) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL ) return;
    }

	(*env)->CallVoidMethod(env, callback, GLFWmousebuttonfunInvoke, (jlong)(intptr_t)window, (jint)button, (jint)action);

	if ( async ) detachCurrentThread();
}

static void GLFWcursorposfunProc(GLFWwindow* window, double xpos, double ypos) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL ) return;
    }

	(*env)->CallVoidMethod(env, callback, GLFWcursorposfunInvoke, (jlong)(intptr_t)window, (jdouble)xpos, (jdouble)ypos);

	if ( async ) detachCurrentThread();
}

static void GLFWcursorenterfunProc(GLFWwindow* window, int entered) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL ) return;
    }

	(*env)->CallVoidMethod(env, callback, GLFWcursorenterfunInvoke, (jlong)(intptr_t)window, (jint)entered);

	if ( async ) detachCurrentThread();
}

static void GLFWscrollfunProc(GLFWwindow* window, double xpos, double ypos) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv *env = getThreadEnv();
    jboolean async = env == NULL;
    if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL ) return;
    }

	(*env)->CallVoidMethod(env, callback, GLFWscrollfunInvoke, (jlong)(intptr_t)window, (jdouble)xpos, (jdouble)ypos);

	if ( async ) detachCurrentThread();
}

// setCallbacks([Ljava/lang/reflect/Method;J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_WindowCallback_setCallbacks(JNIEnv *env, jclass clazz,
	jobjectArray methods, jlong procsAddress
) {
	intptr_t *procs = (intptr_t *)procsAddress;

	jint i = 0;
	GLFWwindowposfunInvoke = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, i++));
	GLFWwindowsizefunInvoke = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, i++));
   	GLFWwindowclosefunInvoke = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, i++));
	GLFWwindowrefreshfunInvoke = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, i++));
    GLFWwindowfocusfunInvoke = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, i++));
    GLFWwindowiconifyfunInvoke = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, i++));
	GLFWkeyfunInvoke = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, i++));
   	GLFWcharfunInvoke = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, i++));
	GLFWmousebuttonfunInvoke = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, i++));
    GLFWcursorposfunInvoke = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, i++));
	GLFWcursorenterfunInvoke = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, i++));
   	GLFWscrollfunInvoke = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, i));

	i = 0;
	procs[i++] = (intptr_t)&GLFWwindowposfunProc;
   	procs[i++] = (intptr_t)&GLFWwindowsizefunProc;
	procs[i++] = (intptr_t)&GLFWwindowclosefunProc;
    procs[i++] = (intptr_t)&GLFWwindowrefreshfunProc;
    procs[i++] = (intptr_t)&GLFWwindowfocusfunProc;
	procs[i++] = (intptr_t)&GLFWwindowiconifyfunProc;
	procs[i++] = (intptr_t)&GLFWkeyfunProc;
	procs[i++] = (intptr_t)&GLFWcharfunProc;
    procs[i++] = (intptr_t)&GLFWmousebuttonfunProc;
	procs[i++] = (intptr_t)&GLFWcursorposfunProc;
	procs[i++] = (intptr_t)&GLFWcursorenterfunProc;
    procs[i] = (intptr_t)&GLFWscrollfunProc;
}