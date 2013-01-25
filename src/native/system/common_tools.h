/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#ifndef __LWJGL_COMMON_TOOLS_H__
#define __LWJGL_COMMON_TOOLS_H__

#include <jni.h>

extern JNIEnv *getThreadEnv();
extern JNIEnv *attachCurrentThread();
extern void detachCurrentThread();

#endif