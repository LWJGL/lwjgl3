/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDebugMessageEnableAMDPROC) (jint, jint, jint, uintptr_t, jboolean);
typedef void (APIENTRY *glDebugMessageInsertAMDPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glDebugMessageCallbackAMDPROC) (uintptr_t, uintptr_t);
typedef jint (APIENTRY *glGetDebugMessageLogAMDPROC) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDebugOutput_nglDebugMessageEnableAMD__IIIJZ(JNIEnv *__env, jclass clazz, jint category, jint severity, jint count, jlong idsAddress, jboolean enabled) {
    glDebugMessageEnableAMDPROC glDebugMessageEnableAMD = (glDebugMessageEnableAMDPROC)tlsGetFunction(1048);
    uintptr_t ids = (uintptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageEnableAMD(category, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDebugOutput_nglDebugMessageInsertAMD(JNIEnv *__env, jclass clazz, jint category, jint severity, jint id, jint length, jlong bufAddress) {
    glDebugMessageInsertAMDPROC glDebugMessageInsertAMD = (glDebugMessageInsertAMDPROC)tlsGetFunction(1049);
    uintptr_t buf = (uintptr_t)bufAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageInsertAMD(category, severity, id, length, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDebugOutput_nglDebugMessageCallbackAMD(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress) {
    glDebugMessageCallbackAMDPROC glDebugMessageCallbackAMD = (glDebugMessageCallbackAMDPROC)tlsGetFunction(1050);
    uintptr_t callback = (uintptr_t)callbackAddress;
    uintptr_t userParam = (uintptr_t)userParamAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageCallbackAMD(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_AMDDebugOutput_nglGetDebugMessageLogAMD__IIJJJJJ(JNIEnv *__env, jclass clazz, jint count, jint bufsize, jlong categoriesAddress, jlong severitiesAddress, jlong idsAddress, jlong lengthsAddress, jlong messageLogAddress) {
    glGetDebugMessageLogAMDPROC glGetDebugMessageLogAMD = (glGetDebugMessageLogAMDPROC)tlsGetFunction(1051);
    uintptr_t categories = (uintptr_t)categoriesAddress;
    uintptr_t severities = (uintptr_t)severitiesAddress;
    uintptr_t ids = (uintptr_t)idsAddress;
    uintptr_t lengths = (uintptr_t)lengthsAddress;
    uintptr_t messageLog = (uintptr_t)messageLogAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetDebugMessageLogAMD(count, bufsize, categories, severities, ids, lengths, messageLog);
}

EXTERN_C_EXIT
