/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#ifndef __LWJGL_COMMON_TOOLS_H__
#define __LWJGL_COMMON_TOOLS_H__

#include <jni.h>

extern JNIEnv *getThreadEnv(void);
extern JNIEnv *attachCurrentThread(void);
extern void detachCurrentThread(void);

#ifdef _MSC_VER
	#define inline __inline
#endif

#endif