/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glGetPerfMonitorGroupsAMDPROC) (uintptr_t, jint, uintptr_t);
typedef void (APIENTRY *glGetPerfMonitorCountersAMDPROC) (jint, uintptr_t, uintptr_t, jint, uintptr_t);
typedef void (APIENTRY *glGetPerfMonitorGroupStringAMDPROC) (jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetPerfMonitorCounterStringAMDPROC) (jint, jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetPerfMonitorCounterInfoAMDPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGenPerfMonitorsAMDPROC) (jint, uintptr_t);
typedef void (APIENTRY *glDeletePerfMonitorsAMDPROC) (jint, uintptr_t);
typedef void (APIENTRY *glSelectPerfMonitorCountersAMDPROC) (jint, jboolean, jint, jint, uintptr_t);
typedef void (APIENTRY *glBeginPerfMonitorAMDPROC) (jint);
typedef void (APIENTRY *glEndPerfMonitorAMDPROC) (jint);
typedef void (APIENTRY *glGetPerfMonitorCounterDataAMDPROC) (jint, jint, jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_AMDPerformanceMonitor_nglGetPerfMonitorGroupsAMD__JIJ(JNIEnv *__env, jclass clazz, jlong numGroupsAddress, jint groupsSize, jlong groupsAddress) {
    glGetPerfMonitorGroupsAMDPROC glGetPerfMonitorGroupsAMD = (glGetPerfMonitorGroupsAMDPROC)tlsGetFunction(360);
    uintptr_t numGroups = (uintptr_t)numGroupsAddress;
    uintptr_t groups = (uintptr_t)groupsAddress;
    UNUSED_PARAM(clazz)
    glGetPerfMonitorGroupsAMD(numGroups, groupsSize, groups);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_AMDPerformanceMonitor_nglGetPerfMonitorCountersAMD__IJJIJ(JNIEnv *__env, jclass clazz, jint group, jlong numCountersAddress, jlong maxActiveCountersAddress, jint counterSize, jlong countersAddress) {
    glGetPerfMonitorCountersAMDPROC glGetPerfMonitorCountersAMD = (glGetPerfMonitorCountersAMDPROC)tlsGetFunction(361);
    uintptr_t numCounters = (uintptr_t)numCountersAddress;
    uintptr_t maxActiveCounters = (uintptr_t)maxActiveCountersAddress;
    uintptr_t counters = (uintptr_t)countersAddress;
    UNUSED_PARAM(clazz)
    glGetPerfMonitorCountersAMD(group, numCounters, maxActiveCounters, counterSize, counters);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_AMDPerformanceMonitor_nglGetPerfMonitorGroupStringAMD__IIJJ(JNIEnv *__env, jclass clazz, jint group, jint bufSize, jlong lengthAddress, jlong groupStringAddress) {
    glGetPerfMonitorGroupStringAMDPROC glGetPerfMonitorGroupStringAMD = (glGetPerfMonitorGroupStringAMDPROC)tlsGetFunction(362);
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t groupString = (uintptr_t)groupStringAddress;
    UNUSED_PARAM(clazz)
    glGetPerfMonitorGroupStringAMD(group, bufSize, length, groupString);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_AMDPerformanceMonitor_nglGetPerfMonitorCounterStringAMD__IIIJJ(JNIEnv *__env, jclass clazz, jint group, jint counter, jint bufSize, jlong lengthAddress, jlong counterStringAddress) {
    glGetPerfMonitorCounterStringAMDPROC glGetPerfMonitorCounterStringAMD = (glGetPerfMonitorCounterStringAMDPROC)tlsGetFunction(363);
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t counterString = (uintptr_t)counterStringAddress;
    UNUSED_PARAM(clazz)
    glGetPerfMonitorCounterStringAMD(group, counter, bufSize, length, counterString);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_AMDPerformanceMonitor_nglGetPerfMonitorCounterInfoAMD__IIIJ(JNIEnv *__env, jclass clazz, jint group, jint counter, jint pname, jlong dataAddress) {
    glGetPerfMonitorCounterInfoAMDPROC glGetPerfMonitorCounterInfoAMD = (glGetPerfMonitorCounterInfoAMDPROC)tlsGetFunction(364);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetPerfMonitorCounterInfoAMD(group, counter, pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_AMDPerformanceMonitor_nglGenPerfMonitorsAMD__IJ(JNIEnv *__env, jclass clazz, jint n, jlong monitorsAddress) {
    glGenPerfMonitorsAMDPROC glGenPerfMonitorsAMD = (glGenPerfMonitorsAMDPROC)tlsGetFunction(365);
    uintptr_t monitors = (uintptr_t)monitorsAddress;
    UNUSED_PARAM(clazz)
    glGenPerfMonitorsAMD(n, monitors);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_AMDPerformanceMonitor_nglDeletePerfMonitorsAMD__IJ(JNIEnv *__env, jclass clazz, jint n, jlong monitorsAddress) {
    glDeletePerfMonitorsAMDPROC glDeletePerfMonitorsAMD = (glDeletePerfMonitorsAMDPROC)tlsGetFunction(366);
    uintptr_t monitors = (uintptr_t)monitorsAddress;
    UNUSED_PARAM(clazz)
    glDeletePerfMonitorsAMD(n, monitors);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_AMDPerformanceMonitor_nglSelectPerfMonitorCountersAMD__IZIIJ(JNIEnv *__env, jclass clazz, jint monitor, jboolean enable, jint group, jint numCounters, jlong counterListAddress) {
    glSelectPerfMonitorCountersAMDPROC glSelectPerfMonitorCountersAMD = (glSelectPerfMonitorCountersAMDPROC)tlsGetFunction(367);
    uintptr_t counterList = (uintptr_t)counterListAddress;
    UNUSED_PARAM(clazz)
    glSelectPerfMonitorCountersAMD(monitor, enable, group, numCounters, counterList);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_AMDPerformanceMonitor_glBeginPerfMonitorAMD(JNIEnv *__env, jclass clazz, jint monitor) {
    glBeginPerfMonitorAMDPROC glBeginPerfMonitorAMD = (glBeginPerfMonitorAMDPROC)tlsGetFunction(368);
    UNUSED_PARAM(clazz)
    glBeginPerfMonitorAMD(monitor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_AMDPerformanceMonitor_glEndPerfMonitorAMD(JNIEnv *__env, jclass clazz, jint monitor) {
    glEndPerfMonitorAMDPROC glEndPerfMonitorAMD = (glEndPerfMonitorAMDPROC)tlsGetFunction(369);
    UNUSED_PARAM(clazz)
    glEndPerfMonitorAMD(monitor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_AMDPerformanceMonitor_nglGetPerfMonitorCounterDataAMD__IIIJJ(JNIEnv *__env, jclass clazz, jint monitor, jint pname, jint dataSize, jlong dataAddress, jlong bytesWrittenAddress) {
    glGetPerfMonitorCounterDataAMDPROC glGetPerfMonitorCounterDataAMD = (glGetPerfMonitorCounterDataAMDPROC)tlsGetFunction(370);
    uintptr_t data = (uintptr_t)dataAddress;
    uintptr_t bytesWritten = (uintptr_t)bytesWrittenAddress;
    UNUSED_PARAM(clazz)
    glGetPerfMonitorCounterDataAMD(monitor, pname, dataSize, data, bytesWritten);
}

EXTERN_C_EXIT
