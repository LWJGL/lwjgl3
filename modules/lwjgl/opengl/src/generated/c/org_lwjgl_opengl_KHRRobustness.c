/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef jint (APIENTRY *glGetGraphicsResetStatusPROC) (void);
typedef void (APIENTRY *glReadnPixelsPROC) (jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetnUniformfvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetnUniformivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetnUniformuivPROC) (jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_KHRRobustness_glGetGraphicsResetStatus(JNIEnv *__env, jclass clazz) {
    glGetGraphicsResetStatusPROC glGetGraphicsResetStatus = (glGetGraphicsResetStatusPROC)tlsGetFunction(1024);
    UNUSED_PARAM(clazz)
    return (jint)glGetGraphicsResetStatus();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRRobustness_nglReadnPixels__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jint bufSize, jlong pixelsAddress) {
    glReadnPixelsPROC glReadnPixels = (glReadnPixelsPROC)tlsGetFunction(1033);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRRobustness_nglGetnUniformfv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformfvPROC glGetnUniformfv = (glGetnUniformfvPROC)tlsGetFunction(1040);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformfv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRRobustness_nglGetnUniformiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformivPROC glGetnUniformiv = (glGetnUniformivPROC)tlsGetFunction(1042);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformiv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_KHRRobustness_nglGetnUniformuiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformuivPROC glGetnUniformuiv = (glGetnUniformuivPROC)tlsGetFunction(1043);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformuiv(program, location, bufSize, params);
}

EXTERN_C_EXIT
