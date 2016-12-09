/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include <jvmti.h>
ENABLE_WARNINGS()

extern jvmtiEnv* jvmti;

EXTERN_C_ENTER

// getJNIEnv()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_getThreadJNIEnv(JNIEnv *env, jclass clazz) {
	UNUSED_PARAM(clazz)

    return (jlong)(intptr_t)*env;
}

// setJNIEnv(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_ThreadLocalUtil_setThreadJNIEnv(JNIEnv *env, jclass clazz, jlong function_tableAddress) {
	UNUSED_PARAM(clazz)

    jniNativeInterface *function_table = (jniNativeInterface *)(intptr_t)function_tableAddress;
    *env = function_table;
}

// jvmtiGetJNIFunctionTable()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_jvmtiGetJNIFunctionTable(JNIEnv *env, jclass clazz) {
	UNUSED_PARAMS(env, clazz)

	jniNativeInterface *function_table = NULL;
    (*jvmti)->GetJNIFunctionTable(jvmti, &function_table);
    return (jlong)(intptr_t)function_table;
}

// jvmtiDeallocate(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_ThreadLocalUtil_jvmtiDeallocate(JNIEnv *env, jclass clazz, jlong memAddress) {
	UNUSED_PARAMS(env, clazz)

	unsigned char *mem = (unsigned char *)(intptr_t)memAddress;
    (*jvmti)->Deallocate(jvmti, mem);
}

EXTERN_C_EXIT
