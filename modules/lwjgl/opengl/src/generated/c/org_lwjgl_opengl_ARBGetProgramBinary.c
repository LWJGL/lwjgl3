/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetProgramBinaryPROC) (jint, jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glProgramBinaryPROC) (jint, jint, intptr_t, jint);
typedef void (APIENTRY *glProgramParameteriPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGetProgramBinary_nglGetProgramBinary__IIJJJ(JNIEnv *__env, jclass clazz, jint program, jint bufSize, jlong lengthAddress, jlong binaryFormatAddress, jlong binaryAddress) {
    glGetProgramBinaryPROC glGetProgramBinary = (glGetProgramBinaryPROC)tlsGetFunction(775);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t binaryFormat = (intptr_t)binaryFormatAddress;
    intptr_t binary = (intptr_t)binaryAddress;
    UNUSED_PARAM(clazz)
    glGetProgramBinary(program, bufSize, length, binaryFormat, binary);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGetProgramBinary_nglProgramBinary(JNIEnv *__env, jclass clazz, jint program, jint binaryFormat, jlong binaryAddress, jint length) {
    glProgramBinaryPROC glProgramBinary = (glProgramBinaryPROC)tlsGetFunction(776);
    intptr_t binary = (intptr_t)binaryAddress;
    UNUSED_PARAM(clazz)
    glProgramBinary(program, binaryFormat, binary, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGetProgramBinary_glProgramParameteri(JNIEnv *__env, jclass clazz, jint program, jint pname, jint value) {
    glProgramParameteriPROC glProgramParameteri = (glProgramParameteriPROC)tlsGetFunction(777);
    UNUSED_PARAM(clazz)
    glProgramParameteri(program, pname, value);
}

EXTERN_C_EXIT
