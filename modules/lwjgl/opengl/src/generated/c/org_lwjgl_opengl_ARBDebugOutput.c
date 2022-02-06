/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDebugMessageControlARBPROC) (jint, jint, jint, jint, uintptr_t, jboolean);
typedef void (APIENTRY *glDebugMessageInsertARBPROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glDebugMessageCallbackARBPROC) (uintptr_t, uintptr_t);
typedef jint (APIENTRY *glGetDebugMessageLogARBPROC) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDebugOutput_nglDebugMessageControlARB__IIIIJZ(JNIEnv *__env, jclass clazz, jint source, jint type, jint severity, jint count, jlong idsAddress, jboolean enabled) {
    glDebugMessageControlARBPROC glDebugMessageControlARB = (glDebugMessageControlARBPROC)tlsGetFunction(1133);
    uintptr_t ids = (uintptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageControlARB(source, type, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDebugOutput_nglDebugMessageInsertARB(JNIEnv *__env, jclass clazz, jint source, jint type, jint id, jint severity, jint length, jlong bufAddress) {
    glDebugMessageInsertARBPROC glDebugMessageInsertARB = (glDebugMessageInsertARBPROC)tlsGetFunction(1134);
    uintptr_t buf = (uintptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageInsertARB(source, type, id, severity, length, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDebugOutput_nglDebugMessageCallbackARB(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress) {
    glDebugMessageCallbackARBPROC glDebugMessageCallbackARB = (glDebugMessageCallbackARBPROC)tlsGetFunction(1135);
    uintptr_t callback = (uintptr_t)callbackAddress;
    uintptr_t userParam = (uintptr_t)userParamAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageCallbackARB(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBDebugOutput_nglGetDebugMessageLogARB__IIJJJJJJ(JNIEnv *__env, jclass clazz, jint count, jint bufSize, jlong sourcesAddress, jlong typesAddress, jlong idsAddress, jlong severitiesAddress, jlong lengthsAddress, jlong messageLogAddress) {
    glGetDebugMessageLogARBPROC glGetDebugMessageLogARB = (glGetDebugMessageLogARBPROC)tlsGetFunction(1136);
    uintptr_t sources = (uintptr_t)sourcesAddress;
    uintptr_t types = (uintptr_t)typesAddress;
    uintptr_t ids = (uintptr_t)idsAddress;
    uintptr_t severities = (uintptr_t)severitiesAddress;
    uintptr_t lengths = (uintptr_t)lengthsAddress;
    uintptr_t messageLog = (uintptr_t)messageLogAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetDebugMessageLogARB(count, bufSize, sources, types, ids, severities, lengths, messageLog);
}

EXTERN_C_EXIT
