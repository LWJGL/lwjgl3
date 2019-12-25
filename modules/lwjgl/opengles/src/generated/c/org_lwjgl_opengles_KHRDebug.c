/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDebugMessageControlKHRPROC) (jint, jint, jint, jint, intptr_t, jboolean);
typedef void (APIENTRY *glDebugMessageInsertKHRPROC) (jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glDebugMessageCallbackKHRPROC) (intptr_t, intptr_t);
typedef jint (APIENTRY *glGetDebugMessageLogKHRPROC) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glGetPointervKHRPROC) (jint, intptr_t);
typedef void (APIENTRY *glPushDebugGroupKHRPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glPopDebugGroupKHRPROC) (void);
typedef void (APIENTRY *glObjectLabelKHRPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetObjectLabelKHRPROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glObjectPtrLabelKHRPROC) (intptr_t, jint, intptr_t);
typedef void (APIENTRY *glGetObjectPtrLabelKHRPROC) (intptr_t, jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglDebugMessageControlKHR__IIIIJZ(JNIEnv *__env, jclass clazz, jint source, jint type, jint severity, jint count, jlong idsAddress, jboolean enabled) {
    glDebugMessageControlKHRPROC glDebugMessageControlKHR = (glDebugMessageControlKHRPROC)tlsGetFunction(575);
    intptr_t ids = (intptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageControlKHR(source, type, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglDebugMessageInsertKHR(JNIEnv *__env, jclass clazz, jint source, jint type, jint id, jint severity, jint length, jlong messageAddress) {
    glDebugMessageInsertKHRPROC glDebugMessageInsertKHR = (glDebugMessageInsertKHRPROC)tlsGetFunction(576);
    intptr_t message = (intptr_t)messageAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageInsertKHR(source, type, id, severity, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglDebugMessageCallbackKHR(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress) {
    glDebugMessageCallbackKHRPROC glDebugMessageCallbackKHR = (glDebugMessageCallbackKHRPROC)tlsGetFunction(577);
    intptr_t callback = (intptr_t)callbackAddress;
    intptr_t userParam = (intptr_t)userParamAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageCallbackKHR(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_KHRDebug_nglGetDebugMessageLogKHR__IIJJJJJJ(JNIEnv *__env, jclass clazz, jint count, jint bufsize, jlong sourcesAddress, jlong typesAddress, jlong idsAddress, jlong severitiesAddress, jlong lengthsAddress, jlong messageLogAddress) {
    glGetDebugMessageLogKHRPROC glGetDebugMessageLogKHR = (glGetDebugMessageLogKHRPROC)tlsGetFunction(578);
    intptr_t sources = (intptr_t)sourcesAddress;
    intptr_t types = (intptr_t)typesAddress;
    intptr_t ids = (intptr_t)idsAddress;
    intptr_t severities = (intptr_t)severitiesAddress;
    intptr_t lengths = (intptr_t)lengthsAddress;
    intptr_t messageLog = (intptr_t)messageLogAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetDebugMessageLogKHR(count, bufsize, sources, types, ids, severities, lengths, messageLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglGetPointervKHR(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetPointervKHRPROC glGetPointervKHR = (glGetPointervKHRPROC)tlsGetFunction(579);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetPointervKHR(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglPushDebugGroupKHR(JNIEnv *__env, jclass clazz, jint source, jint id, jint length, jlong messageAddress) {
    glPushDebugGroupKHRPROC glPushDebugGroupKHR = (glPushDebugGroupKHRPROC)tlsGetFunction(580);
    intptr_t message = (intptr_t)messageAddress;
    UNUSED_PARAM(clazz)
    glPushDebugGroupKHR(source, id, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_glPopDebugGroupKHR(JNIEnv *__env, jclass clazz) {
    glPopDebugGroupKHRPROC glPopDebugGroupKHR = (glPopDebugGroupKHRPROC)tlsGetFunction(581);
    UNUSED_PARAM(clazz)
    glPopDebugGroupKHR();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglObjectLabelKHR(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint length, jlong labelAddress) {
    glObjectLabelKHRPROC glObjectLabelKHR = (glObjectLabelKHRPROC)tlsGetFunction(582);
    intptr_t label = (intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glObjectLabelKHR(identifier, name, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglGetObjectLabelKHR__IIIJJ(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint bufSize, jlong lengthAddress, jlong labelAddress) {
    glGetObjectLabelKHRPROC glGetObjectLabelKHR = (glGetObjectLabelKHRPROC)tlsGetFunction(583);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t label = (intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glGetObjectLabelKHR(identifier, name, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglObjectPtrLabelKHR(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint length, jlong labelAddress) {
    glObjectPtrLabelKHRPROC glObjectPtrLabelKHR = (glObjectPtrLabelKHRPROC)tlsGetFunction(584);
    intptr_t ptr = (intptr_t)ptrAddress;
    intptr_t label = (intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glObjectPtrLabelKHR(ptr, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRDebug_nglGetObjectPtrLabelKHR__JIJJ(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint bufSize, jlong lengthAddress, jlong labelAddress) {
    glGetObjectPtrLabelKHRPROC glGetObjectPtrLabelKHR = (glGetObjectPtrLabelKHRPROC)tlsGetFunction(585);
    intptr_t ptr = (intptr_t)ptrAddress;
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t label = (intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glGetObjectPtrLabelKHR(ptr, bufSize, length, label);
}

EXTERN_C_EXIT
