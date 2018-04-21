/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glReleaseShaderCompilerPROC) (void);
typedef void (APIENTRY *glShaderBinaryPROC) (jint, intptr_t, jint, intptr_t, jint);
typedef void (APIENTRY *glGetShaderPrecisionFormatPROC) (jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glDepthRangefPROC) (jfloat, jfloat);
typedef void (APIENTRY *glClearDepthfPROC) (jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBES2Compatibility_glReleaseShaderCompiler(JNIEnv *__env, jclass clazz) {
    glReleaseShaderCompilerPROC glReleaseShaderCompiler = (glReleaseShaderCompilerPROC)tlsGetFunction(770);
    UNUSED_PARAM(clazz)
    glReleaseShaderCompiler();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBES2Compatibility_nglShaderBinary__IJIJI(JNIEnv *__env, jclass clazz, jint count, jlong shadersAddress, jint binaryformat, jlong binaryAddress, jint length) {
    glShaderBinaryPROC glShaderBinary = (glShaderBinaryPROC)tlsGetFunction(771);
    intptr_t shaders = (intptr_t)shadersAddress;
    intptr_t binary = (intptr_t)binaryAddress;
    UNUSED_PARAM(clazz)
    glShaderBinary(count, shaders, binaryformat, binary, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBES2Compatibility_nglGetShaderPrecisionFormat__IIJJ(JNIEnv *__env, jclass clazz, jint shadertype, jint precisiontype, jlong rangeAddress, jlong precisionAddress) {
    glGetShaderPrecisionFormatPROC glGetShaderPrecisionFormat = (glGetShaderPrecisionFormatPROC)tlsGetFunction(772);
    intptr_t range = (intptr_t)rangeAddress;
    intptr_t precision = (intptr_t)precisionAddress;
    UNUSED_PARAM(clazz)
    glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBES2Compatibility_glDepthRangef(JNIEnv *__env, jclass clazz, jfloat zNear, jfloat zFar) {
    glDepthRangefPROC glDepthRangef = (glDepthRangefPROC)tlsGetFunction(773);
    UNUSED_PARAM(clazz)
    glDepthRangef(zNear, zFar);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBES2Compatibility_glClearDepthf(JNIEnv *__env, jclass clazz, jfloat depth) {
    glClearDepthfPROC glClearDepthf = (glClearDepthfPROC)tlsGetFunction(774);
    UNUSED_PARAM(clazz)
    glClearDepthf(depth);
}

EXTERN_C_EXIT
