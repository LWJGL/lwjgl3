/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glGetDriverControlsQCOMPROC) (uintptr_t, jint, uintptr_t);
typedef void (APIENTRY *glGetDriverControlStringQCOMPROC) (jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glEnableDriverControlQCOMPROC) (jint);
typedef void (APIENTRY *glDisableDriverControlQCOMPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMDriverControl_nglGetDriverControlsQCOM__JIJ(JNIEnv *__env, jclass clazz, jlong numAddress, jint size, jlong driverControlsAddress) {
    glGetDriverControlsQCOMPROC glGetDriverControlsQCOM = (glGetDriverControlsQCOMPROC)tlsGetFunction(841);
    uintptr_t num = (uintptr_t)numAddress;
    uintptr_t driverControls = (uintptr_t)driverControlsAddress;
    UNUSED_PARAM(clazz)
    glGetDriverControlsQCOM(num, size, driverControls);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMDriverControl_nglGetDriverControlStringQCOM__IIJJ(JNIEnv *__env, jclass clazz, jint driverControl, jint bufSize, jlong lengthAddress, jlong driverControlStringAddress) {
    glGetDriverControlStringQCOMPROC glGetDriverControlStringQCOM = (glGetDriverControlStringQCOMPROC)tlsGetFunction(842);
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t driverControlString = (uintptr_t)driverControlStringAddress;
    UNUSED_PARAM(clazz)
    glGetDriverControlStringQCOM(driverControl, bufSize, length, driverControlString);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMDriverControl_glEnableDriverControlQCOM(JNIEnv *__env, jclass clazz, jint driverControl) {
    glEnableDriverControlQCOMPROC glEnableDriverControlQCOM = (glEnableDriverControlQCOMPROC)tlsGetFunction(843);
    UNUSED_PARAM(clazz)
    glEnableDriverControlQCOM(driverControl);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMDriverControl_glDisableDriverControlQCOM(JNIEnv *__env, jclass clazz, jint driverControl) {
    glDisableDriverControlQCOMPROC glDisableDriverControlQCOM = (glDisableDriverControlQCOMPROC)tlsGetFunction(844);
    UNUSED_PARAM(clazz)
    glDisableDriverControlQCOM(driverControl);
}

EXTERN_C_EXIT
