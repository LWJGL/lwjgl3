/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDebugMessageControlPROC) (jint, jint, jint, jint, intptr_t, jboolean);
typedef void (APIENTRY *glDebugMessageInsertPROC) (jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glDebugMessageCallbackPROC) (intptr_t, intptr_t);
typedef jint (APIENTRY *glGetDebugMessageLogPROC) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glPushDebugGroupPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glPopDebugGroupPROC) (void);
typedef void (APIENTRY *glObjectLabelPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetObjectLabelPROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glObjectPtrLabelPROC) (intptr_t, jint, intptr_t);
typedef void (APIENTRY *glGetObjectPtrLabelPROC) (intptr_t, jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRDebug_nglDebugMessageControl__IIIIJZ(JNIEnv *__env, jclass clazz, jint source, jint type, jint severity, jint count, jlong idsAddress, jboolean enabled) {
    glDebugMessageControlPROC glDebugMessageControl = (glDebugMessageControlPROC)tlsGetFunction(875);
    intptr_t ids = (intptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageControl(source, type, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRDebug_nglDebugMessageInsert(JNIEnv *__env, jclass clazz, jint source, jint type, jint id, jint severity, jint length, jlong messageAddress) {
    glDebugMessageInsertPROC glDebugMessageInsert = (glDebugMessageInsertPROC)tlsGetFunction(876);
    intptr_t message = (intptr_t)messageAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageInsert(source, type, id, severity, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRDebug_nglDebugMessageCallback(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress) {
    glDebugMessageCallbackPROC glDebugMessageCallback = (glDebugMessageCallbackPROC)tlsGetFunction(877);
    intptr_t callback = (intptr_t)callbackAddress;
    intptr_t userParam = (intptr_t)userParamAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageCallback(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_KHRDebug_nglGetDebugMessageLog__IIJJJJJJ(JNIEnv *__env, jclass clazz, jint count, jint bufsize, jlong sourcesAddress, jlong typesAddress, jlong idsAddress, jlong severitiesAddress, jlong lengthsAddress, jlong messageLogAddress) {
    glGetDebugMessageLogPROC glGetDebugMessageLog = (glGetDebugMessageLogPROC)tlsGetFunction(878);
    intptr_t sources = (intptr_t)sourcesAddress;
    intptr_t types = (intptr_t)typesAddress;
    intptr_t ids = (intptr_t)idsAddress;
    intptr_t severities = (intptr_t)severitiesAddress;
    intptr_t lengths = (intptr_t)lengthsAddress;
    intptr_t messageLog = (intptr_t)messageLogAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRDebug_nglPushDebugGroup(JNIEnv *__env, jclass clazz, jint source, jint id, jint length, jlong messageAddress) {
    glPushDebugGroupPROC glPushDebugGroup = (glPushDebugGroupPROC)tlsGetFunction(879);
    intptr_t message = (intptr_t)messageAddress;
    UNUSED_PARAM(clazz)
    glPushDebugGroup(source, id, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRDebug_glPopDebugGroup(JNIEnv *__env, jclass clazz) {
    glPopDebugGroupPROC glPopDebugGroup = (glPopDebugGroupPROC)tlsGetFunction(880);
    UNUSED_PARAM(clazz)
    glPopDebugGroup();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRDebug_nglObjectLabel(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint length, jlong labelAddress) {
    glObjectLabelPROC glObjectLabel = (glObjectLabelPROC)tlsGetFunction(881);
    intptr_t label = (intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glObjectLabel(identifier, name, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRDebug_nglGetObjectLabel__IIIJJ(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint bufSize, jlong lengthAddress, jlong labelAddress) {
    glGetObjectLabelPROC glGetObjectLabel = (glGetObjectLabelPROC)tlsGetFunction(882);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t label = (intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glGetObjectLabel(identifier, name, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRDebug_nglObjectPtrLabel(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint length, jlong labelAddress) {
    glObjectPtrLabelPROC glObjectPtrLabel = (glObjectPtrLabelPROC)tlsGetFunction(883);
    intptr_t ptr = (intptr_t)ptrAddress;
    intptr_t label = (intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glObjectPtrLabel(ptr, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRDebug_nglGetObjectPtrLabel__JIJJ(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint bufSize, jlong lengthAddress, jlong labelAddress) {
    glGetObjectPtrLabelPROC glGetObjectPtrLabel = (glGetObjectPtrLabelPROC)tlsGetFunction(884);
    intptr_t ptr = (intptr_t)ptrAddress;
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t label = (intptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glGetObjectPtrLabel(ptr, bufSize, length, label);
}

EXTERN_C_EXIT
