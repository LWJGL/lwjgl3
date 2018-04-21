/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDebugMessageControlARBPROC) (jint, jint, jint, jint, intptr_t, jboolean);
typedef void (APIENTRY *glDebugMessageInsertARBPROC) (jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glDebugMessageCallbackARBPROC) (intptr_t, intptr_t);
typedef jint (APIENTRY *glGetDebugMessageLogARBPROC) (jint, jint, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDebugOutput_nglDebugMessageControlARB__IIIIJZ(JNIEnv *__env, jclass clazz, jint source, jint type, jint severity, jint count, jlong idsAddress, jboolean enabled) {
    glDebugMessageControlARBPROC glDebugMessageControlARB = (glDebugMessageControlARBPROC)tlsGetFunction(1097);
    intptr_t ids = (intptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageControlARB(source, type, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDebugOutput_nglDebugMessageInsertARB(JNIEnv *__env, jclass clazz, jint source, jint type, jint id, jint severity, jint length, jlong bufAddress) {
    glDebugMessageInsertARBPROC glDebugMessageInsertARB = (glDebugMessageInsertARBPROC)tlsGetFunction(1098);
    intptr_t buf = (intptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageInsertARB(source, type, id, severity, length, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDebugOutput_nglDebugMessageCallbackARB(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress) {
    glDebugMessageCallbackARBPROC glDebugMessageCallbackARB = (glDebugMessageCallbackARBPROC)tlsGetFunction(1099);
    intptr_t callback = (intptr_t)callbackAddress;
    intptr_t userParam = (intptr_t)userParamAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageCallbackARB(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBDebugOutput_nglGetDebugMessageLogARB__IIJJJJJJ(JNIEnv *__env, jclass clazz, jint count, jint bufSize, jlong sourcesAddress, jlong typesAddress, jlong idsAddress, jlong severitiesAddress, jlong lengthsAddress, jlong messageLogAddress) {
    glGetDebugMessageLogARBPROC glGetDebugMessageLogARB = (glGetDebugMessageLogARBPROC)tlsGetFunction(1100);
    intptr_t sources = (intptr_t)sourcesAddress;
    intptr_t types = (intptr_t)typesAddress;
    intptr_t ids = (intptr_t)idsAddress;
    intptr_t severities = (intptr_t)severitiesAddress;
    intptr_t lengths = (intptr_t)lengthsAddress;
    intptr_t messageLog = (intptr_t)messageLogAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetDebugMessageLogARB(count, bufSize, sources, types, ids, severities, lengths, messageLog);
}

EXTERN_C_EXIT
