/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#include "common_tools.h"

#ifndef __ANDROID__
DISABLE_WARNINGS()
#include <jvmti.h>
ENABLE_WARNINGS()
#endif

#ifndef __ANDROID__
extern jvmtiEnv* jvmti;
#endif

static JNIEnv* getJNIEnv(jboolean *async) {
    return getEnv(async);
}

EXTERN_C_ENTER

// getJNIEnvPROC()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_getJNIEnvPROC(JNIEnv *env, jclass clazz) {
	UNUSED_PARAMS(env, clazz)

    return (jlong)(intptr_t)&getJNIEnv;
}

// getJNIEnv()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_getThreadJNIEnv(JNIEnv *env, jclass clazz) {
	UNUSED_PARAM(clazz)

    return (jlong)(intptr_t)*env;
}

// setJNIEnv(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_ThreadLocalUtil_setThreadJNIEnv(JNIEnv *env, jclass clazz, jlong function_tableAddress) {
	UNUSED_PARAM(clazz)
#ifndef __ANDROID__
    jniNativeInterface *function_table = (jniNativeInterface *)(intptr_t)function_tableAddress;
    *env = function_table;
#else
    UNUSED_PARAM(env)
    UNUSED_PARAM(function_tableAddress)
#endif
}

// jvmtiGetJNIFunctionTable()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_jvmtiGetJNIFunctionTable(JNIEnv *env, jclass clazz) {
	UNUSED_PARAMS(env, clazz)

#ifndef __ANDROID__
	jniNativeInterface *function_table = NULL;
    (*jvmti)->GetJNIFunctionTable(jvmti, &function_table);
    return (jlong)(intptr_t)function_table;
#else
	return 0L;
#endif
}

// jvmtiDeallocate(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_ThreadLocalUtil_jvmtiDeallocate(JNIEnv *env, jclass clazz, jlong memAddress) {
	UNUSED_PARAMS(env, clazz)
#ifndef __ANDROID__
	unsigned char *mem = (unsigned char *)(intptr_t)memAddress;
    (*jvmti)->Deallocate(jvmti, mem);
#else
  UNUSED_PARAM(memAddress)
#endif
}

EXTERN_C_EXIT
