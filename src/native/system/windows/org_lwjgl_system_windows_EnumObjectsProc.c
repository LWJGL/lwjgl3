/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

static jmethodID EnumObjectsProcInvoke;

static int CALLBACK EnumObjectsProc(LPVOID logObject, LPARAM data) {
	JNIEnv *env = getThreadEnv();
	return (int)(*env)->CallIntMethod(env, (jobject)data, EnumObjectsProcInvoke, (jlong)(intptr_t)logObject);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_windows_EnumObjectsProc_setup(JNIEnv *env, jclass clazz, jobject method) {
	EnumObjectsProcInvoke = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&EnumObjectsProc;
}