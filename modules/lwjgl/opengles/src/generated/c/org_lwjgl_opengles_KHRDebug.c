/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDebugMessageControlKHRPROC) (jint, jint, jint, jint, uintptr_t, jboolean);
typedef void (APIENTRY *glDebugMessageInsertKHRPROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glDebugMessageCallbackKHRPROC) (uintptr_t, uintptr_t);
typedef jint (APIENTRY *glGetDebugMessageLogKHRPROC) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetPointervKHRPROC) (jint, uintptr_t);
typedef void (APIENTRY *glPushDebugGroupKHRPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glPopDebugGroupKHRPROC) (void);
typedef void (APIENTRY *glObjectLabelKHRPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetObjectLabelKHRPROC) (jint, jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glObjectPtrLabelKHRPROC) (uintptr_t, jint, uintptr_t);
typedef void (APIENTRY *glGetObjectPtrLabelKHRPROC) (uintptr_t, jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglDebugMessageControlKHR__IIIIJZ(JNIEnv *__env, jclass clazz, jint source, jint type, jint severity, jint count, jlong idsAddress, jboolean enabled) {
    glDebugMessageControlKHRPROC glDebugMessageControlKHR = (glDebugMessageControlKHRPROC)tlsGetFunction(577);
    uintptr_t ids = (uintptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageControlKHR(source, type, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglDebugMessageInsertKHR(JNIEnv *__env, jclass clazz, jint source, jint type, jint id, jint severity, jint length, jlong messageAddress) {
    glDebugMessageInsertKHRPROC glDebugMessageInsertKHR = (glDebugMessageInsertKHRPROC)tlsGetFunction(578);
    uintptr_t message = (uintptr_t)messageAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageInsertKHR(source, type, id, severity, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglDebugMessageCallbackKHR(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress) {
    glDebugMessageCallbackKHRPROC glDebugMessageCallbackKHR = (glDebugMessageCallbackKHRPROC)tlsGetFunction(579);
    uintptr_t callback = (uintptr_t)callbackAddress;
    uintptr_t userParam = (uintptr_t)userParamAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageCallbackKHR(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_KHRDebug_nglGetDebugMessageLogKHR__IIJJJJJJ(JNIEnv *__env, jclass clazz, jint count, jint bufsize, jlong sourcesAddress, jlong typesAddress, jlong idsAddress, jlong severitiesAddress, jlong lengthsAddress, jlong messageLogAddress) {
    glGetDebugMessageLogKHRPROC glGetDebugMessageLogKHR = (glGetDebugMessageLogKHRPROC)tlsGetFunction(580);
    uintptr_t sources = (uintptr_t)sourcesAddress;
    uintptr_t types = (uintptr_t)typesAddress;
    uintptr_t ids = (uintptr_t)idsAddress;
    uintptr_t severities = (uintptr_t)severitiesAddress;
    uintptr_t lengths = (uintptr_t)lengthsAddress;
    uintptr_t messageLog = (uintptr_t)messageLogAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetDebugMessageLogKHR(count, bufsize, sources, types, ids, severities, lengths, messageLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglGetPointervKHR(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetPointervKHRPROC glGetPointervKHR = (glGetPointervKHRPROC)tlsGetFunction(581);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetPointervKHR(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglPushDebugGroupKHR(JNIEnv *__env, jclass clazz, jint source, jint id, jint length, jlong messageAddress) {
    glPushDebugGroupKHRPROC glPushDebugGroupKHR = (glPushDebugGroupKHRPROC)tlsGetFunction(582);
    uintptr_t message = (uintptr_t)messageAddress;
    UNUSED_PARAM(clazz)
    glPushDebugGroupKHR(source, id, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_glPopDebugGroupKHR(JNIEnv *__env, jclass clazz) {
    glPopDebugGroupKHRPROC glPopDebugGroupKHR = (glPopDebugGroupKHRPROC)tlsGetFunction(583);
    UNUSED_PARAM(clazz)
    glPopDebugGroupKHR();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglObjectLabelKHR(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint length, jlong labelAddress) {
    glObjectLabelKHRPROC glObjectLabelKHR = (glObjectLabelKHRPROC)tlsGetFunction(584);
    uintptr_t label = (uintptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glObjectLabelKHR(identifier, name, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglGetObjectLabelKHR__IIIJJ(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint bufSize, jlong lengthAddress, jlong labelAddress) {
    glGetObjectLabelKHRPROC glGetObjectLabelKHR = (glGetObjectLabelKHRPROC)tlsGetFunction(585);
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t label = (uintptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glGetObjectLabelKHR(identifier, name, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglObjectPtrLabelKHR(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint length, jlong labelAddress) {
    glObjectPtrLabelKHRPROC glObjectPtrLabelKHR = (glObjectPtrLabelKHRPROC)tlsGetFunction(586);
    uintptr_t ptr = (uintptr_t)ptrAddress;
    uintptr_t label = (uintptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glObjectPtrLabelKHR(ptr, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglGetObjectPtrLabelKHR__JIJJ(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint bufSize, jlong lengthAddress, jlong labelAddress) {
    glGetObjectPtrLabelKHRPROC glGetObjectPtrLabelKHR = (glGetObjectPtrLabelKHRPROC)tlsGetFunction(587);
    uintptr_t ptr = (uintptr_t)ptrAddress;
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t label = (uintptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glGetObjectPtrLabelKHR(ptr, bufSize, length, label);
}

EXTERN_C_EXIT
