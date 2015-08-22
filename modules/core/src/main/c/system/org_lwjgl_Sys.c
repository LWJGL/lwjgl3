/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"

EXTERN_C_ENTER

// getPointerSize()I
JNIEXPORT jint JNICALL Java_org_lwjgl_Sys_getPointerSize(JNIEnv *env, jclass clazz)
{
	UNUSED_PARAMS(env, clazz);
	return (jint)sizeof(void *);
}

EXTERN_C_EXIT
