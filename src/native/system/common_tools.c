/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include <jni.h>
#include "common_tools.h"

static JavaVM *jvm;

JNIEnv *getThreadEnv(void) {
	JNIEnv *env;
	(*jvm)->GetEnv(jvm, (void **)&env, JNI_VERSION_1_4);
	return env;
}

JNIEnv *attachCurrentThread(void) {
    JNIEnv *env;
    (*jvm)->AttachCurrentThread(jvm, (void **)&env, NULL);
    return env;
}

void detachCurrentThread(void) {
    (*jvm)->DetachCurrentThread(jvm);
}

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {
    jvm = vm;
    return JNI_VERSION_1_4;
}

JNIEXPORT void JNICALL JNI_OnUnload(JavaVM *vm, void *reserved) {
}