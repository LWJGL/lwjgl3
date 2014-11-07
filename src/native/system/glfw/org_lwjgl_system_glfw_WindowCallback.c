/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "glfw3.h"

DECLARE_CALLBACK(GLFWwindowposfun)
DECLARE_CALLBACK(GLFWwindowsizefun)
DECLARE_CALLBACK(GLFWwindowclosefun)
DECLARE_CALLBACK(GLFWwindowrefreshfun)
DECLARE_CALLBACK(GLFWwindowfocusfun)
DECLARE_CALLBACK(GLFWwindowiconifyfun)
DECLARE_CALLBACK(GLFWframebuffersizefun)
DECLARE_CALLBACK(GLFWkeyfun)
DECLARE_CALLBACK(GLFWcharfun)
DECLARE_CALLBACK(GLFWcharmodsfun)
DECLARE_CALLBACK(GLFWmousebuttonfun)
DECLARE_CALLBACK(GLFWcursorposfun)
DECLARE_CALLBACK(GLFWcursorenterfun)
DECLARE_CALLBACK(GLFWscrollfun)
DECLARE_CALLBACK(GLFWdropfun)

static void GLFWwindowposfunProc(GLFWwindow* window, int xpos, int ypos) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWwindowposfunInvoke, (jlong)(intptr_t)window, (jint)xpos, (jint)ypos);
}

static void GLFWwindowsizefunProc(GLFWwindow* window, int width, int height) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWwindowsizefunInvoke, (jlong)(intptr_t)window, (jint)width, (jint)height);
}

static void GLFWwindowclosefunProc(GLFWwindow* window) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWwindowclosefunInvoke, (jlong)(intptr_t)window);
}

static void GLFWwindowrefreshfunProc(GLFWwindow* window) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWwindowrefreshfunInvoke, (jlong)(intptr_t)window);
}

static void GLFWwindowfocusfunProc(GLFWwindow* window, int focus) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWwindowfocusfunInvoke, (jlong)(intptr_t)window, (jint)focus);
}

static void GLFWwindowiconifyfunProc(GLFWwindow* window, int iconified) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWwindowiconifyfunInvoke, (jlong)(intptr_t)window, (jint)iconified);
}

static void GLFWframebuffersizefunProc(GLFWwindow* window, int width, int height) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWframebuffersizefunInvoke, (jlong)(intptr_t)window, (jint)width, (jint)height);
}

static void GLFWkeyfunProc(GLFWwindow* window, int key, int scancode, int action, int mods) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWkeyfunInvoke, (jlong)(intptr_t)window, (jint)key, (jint)scancode, (jint)action, (jint)mods);
}

static void GLFWcharfunProc(GLFWwindow* window, int codepoint) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWcharfunInvoke, (jlong)(intptr_t)window, (jint)codepoint);
}

static void GLFWcharmodsfunProc(GLFWwindow* window, unsigned int codepoint, int mods) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWcharmodsfunInvoke, (jlong)(intptr_t)window, (jint)codepoint, (jint)mods);
}

static void GLFWmousebuttonfunProc(GLFWwindow* window, int button, int action, int mods) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWmousebuttonfunInvoke, (jlong)(intptr_t)window, (jint)button, (jint)action, (jint)mods);
}

static void GLFWcursorposfunProc(GLFWwindow* window, double xpos, double ypos) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWcursorposfunInvoke, (jlong)(intptr_t)window, (jdouble)xpos, (jdouble)ypos);
}

static void GLFWcursorenterfunProc(GLFWwindow* window, int entered) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWcursorenterfunInvoke, (jlong)(intptr_t)window, (jint)entered);
}

static void GLFWscrollfunProc(GLFWwindow* window, double xpos, double ypos) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWscrollfunInvoke, (jlong)(intptr_t)window, (jdouble)xpos, (jdouble)ypos);
}

static void GLFWdropfunProc(GLFWwindow* window, int count, const char** names) {
	jobject callback = (jobject)glfwGetWindowUserPointer(window);

	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, callback, GLFWdropfunInvoke, (jlong)(intptr_t)window, (jint)count, (jlong)(intptr_t)names);
}

#define GETINVOKE() \
	(*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, i++))

#define SETPROC(proc) \
	procs[i++] = (intptr_t)&proc

// setCallbacks([Ljava/lang/reflect/Method;J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_glfw_WindowCallback_setCallbacks(JNIEnv *env, jclass clazz,
	jobjectArray methods, jlong procsAddress
) {
	intptr_t *procs = (intptr_t *)(intptr_t)procsAddress;

	jint i = 0;

	UNUSED_PARAM(clazz)

	GLFWwindowposfunInvoke = GETINVOKE();
	GLFWwindowsizefunInvoke = GETINVOKE();
   	GLFWwindowclosefunInvoke = GETINVOKE();
	GLFWwindowrefreshfunInvoke = GETINVOKE();
    GLFWwindowfocusfunInvoke = GETINVOKE();
    GLFWwindowiconifyfunInvoke = GETINVOKE();
    GLFWframebuffersizefunInvoke = GETINVOKE();
	GLFWkeyfunInvoke = GETINVOKE();
   	GLFWcharfunInvoke = GETINVOKE();
   	GLFWcharmodsfunInvoke = GETINVOKE();
	GLFWmousebuttonfunInvoke = GETINVOKE();
    GLFWcursorposfunInvoke = GETINVOKE();
	GLFWcursorenterfunInvoke = GETINVOKE();
   	GLFWscrollfunInvoke = GETINVOKE();
   	GLFWdropfunInvoke = GETINVOKE();

	i = 0;

	SETPROC(GLFWwindowposfunProc);
   	SETPROC(GLFWwindowsizefunProc);
	SETPROC(GLFWwindowclosefunProc);
    SETPROC(GLFWwindowrefreshfunProc);
    SETPROC(GLFWwindowfocusfunProc);
	SETPROC(GLFWwindowiconifyfunProc);
	SETPROC(GLFWframebuffersizefunProc);
	SETPROC(GLFWkeyfunProc);
	SETPROC(GLFWcharfunProc);
	SETPROC(GLFWcharmodsfunProc);
    SETPROC(GLFWmousebuttonfunProc);
	SETPROC(GLFWcursorposfunProc);
	SETPROC(GLFWcursorenterfunProc);
    SETPROC(GLFWscrollfunProc);
    SETPROC(GLFWdropfunProc);
}
