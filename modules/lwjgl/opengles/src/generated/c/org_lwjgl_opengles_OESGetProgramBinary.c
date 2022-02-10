/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glGetProgramBinaryOESPROC) (jint, jint, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glProgramBinaryOESPROC) (jint, jint, uintptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESGetProgramBinary_nglGetProgramBinaryOES__IIJJJ(JNIEnv *__env, jclass clazz, jint program, jint bufSize, jlong lengthAddress, jlong binaryFormatAddress, jlong binaryAddress) {
    glGetProgramBinaryOESPROC glGetProgramBinaryOES = (glGetProgramBinaryOESPROC)tlsGetFunction(799);
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t binaryFormat = (uintptr_t)binaryFormatAddress;
    uintptr_t binary = (uintptr_t)binaryAddress;
    UNUSED_PARAM(clazz)
    glGetProgramBinaryOES(program, bufSize, length, binaryFormat, binary);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESGetProgramBinary_nglProgramBinaryOES(JNIEnv *__env, jclass clazz, jint program, jint binaryFormat, jlong binaryAddress, jint length) {
    glProgramBinaryOESPROC glProgramBinaryOES = (glProgramBinaryOESPROC)tlsGetFunction(800);
    uintptr_t binary = (uintptr_t)binaryAddress;
    UNUSED_PARAM(clazz)
    glProgramBinaryOES(program, binaryFormat, binary, length);
}

EXTERN_C_EXIT
