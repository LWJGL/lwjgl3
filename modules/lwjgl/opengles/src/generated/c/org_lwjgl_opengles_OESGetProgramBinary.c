/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glGetProgramBinaryOESPROC) (jint, jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glProgramBinaryOESPROC) (jint, jint, intptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESGetProgramBinary_nglGetProgramBinaryOES__IIJJJ(JNIEnv *__env, jclass clazz, jint program, jint bufSize, jlong lengthAddress, jlong binaryFormatAddress, jlong binaryAddress) {
    glGetProgramBinaryOESPROC glGetProgramBinaryOES = (glGetProgramBinaryOESPROC)tlsGetFunction(788);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t binaryFormat = (intptr_t)binaryFormatAddress;
    intptr_t binary = (intptr_t)binaryAddress;
    UNUSED_PARAM(clazz)
    glGetProgramBinaryOES(program, bufSize, length, binaryFormat, binary);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESGetProgramBinary_nglProgramBinaryOES(JNIEnv *__env, jclass clazz, jint program, jint binaryFormat, jlong binaryAddress, jint length) {
    glProgramBinaryOESPROC glProgramBinaryOES = (glProgramBinaryOESPROC)tlsGetFunction(789);
    intptr_t binary = (intptr_t)binaryAddress;
    UNUSED_PARAM(clazz)
    glProgramBinaryOES(program, binaryFormat, binary, length);
}

EXTERN_C_EXIT
