/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBeginPerfQueryINTELPROC) (jint);
typedef void (APIENTRY *glCreatePerfQueryINTELPROC) (jint, uintptr_t);
typedef void (APIENTRY *glDeletePerfQueryINTELPROC) (jint);
typedef void (APIENTRY *glEndPerfQueryINTELPROC) (jint);
typedef void (APIENTRY *glGetFirstPerfQueryIdINTELPROC) (uintptr_t);
typedef void (APIENTRY *glGetNextPerfQueryIdINTELPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetPerfCounterInfoINTELPROC) (jint, jint, jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetPerfQueryDataINTELPROC) (jint, jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetPerfQueryIdByNameINTELPROC) (uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetPerfQueryInfoINTELPROC) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELPerformanceQuery_glBeginPerfQueryINTEL(JNIEnv *__env, jclass clazz, jint queryHandle) {
    glBeginPerfQueryINTELPROC glBeginPerfQueryINTEL = (glBeginPerfQueryINTELPROC)tlsGetFunction(1892);
    UNUSED_PARAM(clazz)
    glBeginPerfQueryINTEL(queryHandle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELPerformanceQuery_nglCreatePerfQueryINTEL__IJ(JNIEnv *__env, jclass clazz, jint queryId, jlong queryHandleAddress) {
    glCreatePerfQueryINTELPROC glCreatePerfQueryINTEL = (glCreatePerfQueryINTELPROC)tlsGetFunction(1893);
    uintptr_t queryHandle = (uintptr_t)queryHandleAddress;
    UNUSED_PARAM(clazz)
    glCreatePerfQueryINTEL(queryId, queryHandle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELPerformanceQuery_glDeletePerfQueryINTEL(JNIEnv *__env, jclass clazz, jint queryHandle) {
    glDeletePerfQueryINTELPROC glDeletePerfQueryINTEL = (glDeletePerfQueryINTELPROC)tlsGetFunction(1894);
    UNUSED_PARAM(clazz)
    glDeletePerfQueryINTEL(queryHandle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELPerformanceQuery_glEndPerfQueryINTEL(JNIEnv *__env, jclass clazz, jint queryHandle) {
    glEndPerfQueryINTELPROC glEndPerfQueryINTEL = (glEndPerfQueryINTELPROC)tlsGetFunction(1895);
    UNUSED_PARAM(clazz)
    glEndPerfQueryINTEL(queryHandle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELPerformanceQuery_nglGetFirstPerfQueryIdINTEL__J(JNIEnv *__env, jclass clazz, jlong queryIdAddress) {
    glGetFirstPerfQueryIdINTELPROC glGetFirstPerfQueryIdINTEL = (glGetFirstPerfQueryIdINTELPROC)tlsGetFunction(1896);
    uintptr_t queryId = (uintptr_t)queryIdAddress;
    UNUSED_PARAM(clazz)
    glGetFirstPerfQueryIdINTEL(queryId);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELPerformanceQuery_nglGetNextPerfQueryIdINTEL__IJ(JNIEnv *__env, jclass clazz, jint queryId, jlong nextQueryIdAddress) {
    glGetNextPerfQueryIdINTELPROC glGetNextPerfQueryIdINTEL = (glGetNextPerfQueryIdINTELPROC)tlsGetFunction(1897);
    uintptr_t nextQueryId = (uintptr_t)nextQueryIdAddress;
    UNUSED_PARAM(clazz)
    glGetNextPerfQueryIdINTEL(queryId, nextQueryId);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELPerformanceQuery_nglGetPerfCounterInfoINTEL__IIIJIJJJJJJ(JNIEnv *__env, jclass clazz, jint queryId, jint counterId, jint counterNameLength, jlong counterNameAddress, jint counterDescLength, jlong counterDescAddress, jlong counterOffsetAddress, jlong counterDataSizeAddress, jlong counterTypeEnumAddress, jlong counterDataTypeEnumAddress, jlong rawCounterMaxValueAddress) {
    glGetPerfCounterInfoINTELPROC glGetPerfCounterInfoINTEL = (glGetPerfCounterInfoINTELPROC)tlsGetFunction(1898);
    uintptr_t counterName = (uintptr_t)counterNameAddress;
    uintptr_t counterDesc = (uintptr_t)counterDescAddress;
    uintptr_t counterOffset = (uintptr_t)counterOffsetAddress;
    uintptr_t counterDataSize = (uintptr_t)counterDataSizeAddress;
    uintptr_t counterTypeEnum = (uintptr_t)counterTypeEnumAddress;
    uintptr_t counterDataTypeEnum = (uintptr_t)counterDataTypeEnumAddress;
    uintptr_t rawCounterMaxValue = (uintptr_t)rawCounterMaxValueAddress;
    UNUSED_PARAM(clazz)
    glGetPerfCounterInfoINTEL(queryId, counterId, counterNameLength, counterName, counterDescLength, counterDesc, counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELPerformanceQuery_nglGetPerfQueryDataINTEL__IIIJJ(JNIEnv *__env, jclass clazz, jint queryHandle, jint flags, jint dataSize, jlong dataAddress, jlong bytesWrittenAddress) {
    glGetPerfQueryDataINTELPROC glGetPerfQueryDataINTEL = (glGetPerfQueryDataINTELPROC)tlsGetFunction(1899);
    uintptr_t data = (uintptr_t)dataAddress;
    uintptr_t bytesWritten = (uintptr_t)bytesWrittenAddress;
    UNUSED_PARAM(clazz)
    glGetPerfQueryDataINTEL(queryHandle, flags, dataSize, data, bytesWritten);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELPerformanceQuery_nglGetPerfQueryIdByNameINTEL__JJ(JNIEnv *__env, jclass clazz, jlong queryNameAddress, jlong queryIdAddress) {
    glGetPerfQueryIdByNameINTELPROC glGetPerfQueryIdByNameINTEL = (glGetPerfQueryIdByNameINTELPROC)tlsGetFunction(1900);
    uintptr_t queryName = (uintptr_t)queryNameAddress;
    uintptr_t queryId = (uintptr_t)queryIdAddress;
    UNUSED_PARAM(clazz)
    glGetPerfQueryIdByNameINTEL(queryName, queryId);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_INTELPerformanceQuery_nglGetPerfQueryInfoINTEL__IIJJJJJ(JNIEnv *__env, jclass clazz, jint queryId, jint queryNameLength, jlong queryNameAddress, jlong dataSizeAddress, jlong noCountersAddress, jlong noInstancesAddress, jlong capsMaskAddress) {
    glGetPerfQueryInfoINTELPROC glGetPerfQueryInfoINTEL = (glGetPerfQueryInfoINTELPROC)tlsGetFunction(1901);
    uintptr_t queryName = (uintptr_t)queryNameAddress;
    uintptr_t dataSize = (uintptr_t)dataSizeAddress;
    uintptr_t noCounters = (uintptr_t)noCountersAddress;
    uintptr_t noInstances = (uintptr_t)noInstancesAddress;
    uintptr_t capsMask = (uintptr_t)capsMaskAddress;
    UNUSED_PARAM(clazz)
    glGetPerfQueryInfoINTEL(queryId, queryNameLength, queryName, dataSize, noCounters, noInstances, capsMask);
}

EXTERN_C_EXIT
