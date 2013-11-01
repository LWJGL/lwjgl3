/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "WindowsLWJGL.h"

DECLARE_CALLBACK(EnumObjects);

static int CALLBACK EnumObjectsProc(LPVOID logObject, LPARAM data) {
	JNIEnv *env = getEnv();
	return (int)(*env)->CallIntMethod(env, (jobject)data, EnumObjectsInvoke, (jlong)(intptr_t)logObject);
}

CALLBACK_SETUP(org_lwjgl_system_windows_EnumObjectsProc, EnumObjects)
