/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

typedef jint (APIENTRY *xrSetInputDeviceStateVector2fEXTPROC) (intptr_t, jlong, jlong, XrVector2f);
typedef jint (APIENTRY *xrSetInputDeviceLocationEXTPROC) (intptr_t, jlong, jlong, intptr_t, XrPosef);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_openxr_EXTConformanceAutomation_nxrSetInputDeviceStateVector2fEXT(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong topLevelPath, jlong inputSourcePath, jlong stateAddress, jlong __functionAddress) {
    xrSetInputDeviceStateVector2fEXTPROC xrSetInputDeviceStateVector2fEXT = (xrSetInputDeviceStateVector2fEXTPROC)(intptr_t)__functionAddress;
    intptr_t session = (intptr_t)sessionAddress;
    XrVector2f *state = (XrVector2f *)(intptr_t)stateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)xrSetInputDeviceStateVector2fEXT(session, topLevelPath, inputSourcePath, *state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_openxr_EXTConformanceAutomation_nxrSetInputDeviceLocationEXT(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong topLevelPath, jlong inputSourcePath, jlong spaceAddress, jlong poseAddress, jlong __functionAddress) {
    xrSetInputDeviceLocationEXTPROC xrSetInputDeviceLocationEXT = (xrSetInputDeviceLocationEXTPROC)(intptr_t)__functionAddress;
    intptr_t session = (intptr_t)sessionAddress;
    intptr_t space = (intptr_t)spaceAddress;
    XrPosef *pose = (XrPosef *)(intptr_t)poseAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)xrSetInputDeviceLocationEXT(session, topLevelPath, inputSourcePath, space, *pose);
}

EXTERN_C_EXIT
