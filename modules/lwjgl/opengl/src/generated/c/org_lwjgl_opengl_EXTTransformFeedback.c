/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindBufferRangeEXTPROC) (jint, jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glBindBufferOffsetEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glBindBufferBaseEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glBeginTransformFeedbackEXTPROC) (jint);
typedef void (APIENTRY *glEndTransformFeedbackEXTPROC) (void);
typedef void (APIENTRY *glTransformFeedbackVaryingsEXTPROC) (jint, jint, uintptr_t, jint);
typedef void (APIENTRY *glGetTransformFeedbackVaryingEXTPROC) (jint, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_glBindBufferRangeEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset, jlong size) {
    glBindBufferRangeEXTPROC glBindBufferRangeEXT = (glBindBufferRangeEXTPROC)tlsGetFunction(1865);
    UNUSED_PARAM(clazz)
    glBindBufferRangeEXT(target, index, buffer, (uintptr_t)offset, (uintptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_glBindBufferOffsetEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset) {
    glBindBufferOffsetEXTPROC glBindBufferOffsetEXT = (glBindBufferOffsetEXTPROC)tlsGetFunction(1866);
    UNUSED_PARAM(clazz)
    glBindBufferOffsetEXT(target, index, buffer, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_glBindBufferBaseEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer) {
    glBindBufferBaseEXTPROC glBindBufferBaseEXT = (glBindBufferBaseEXTPROC)tlsGetFunction(1867);
    UNUSED_PARAM(clazz)
    glBindBufferBaseEXT(target, index, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_glBeginTransformFeedbackEXT(JNIEnv *__env, jclass clazz, jint primitiveMode) {
    glBeginTransformFeedbackEXTPROC glBeginTransformFeedbackEXT = (glBeginTransformFeedbackEXTPROC)tlsGetFunction(1868);
    UNUSED_PARAM(clazz)
    glBeginTransformFeedbackEXT(primitiveMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_glEndTransformFeedbackEXT(JNIEnv *__env, jclass clazz) {
    glEndTransformFeedbackEXTPROC glEndTransformFeedbackEXT = (glEndTransformFeedbackEXTPROC)tlsGetFunction(1869);
    UNUSED_PARAM(clazz)
    glEndTransformFeedbackEXT();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_nglTransformFeedbackVaryingsEXT(JNIEnv *__env, jclass clazz, jint program, jint count, jlong varyingsAddress, jint bufferMode) {
    glTransformFeedbackVaryingsEXTPROC glTransformFeedbackVaryingsEXT = (glTransformFeedbackVaryingsEXTPROC)tlsGetFunction(1870);
    uintptr_t varyings = (uintptr_t)varyingsAddress;
    UNUSED_PARAM(clazz)
    glTransformFeedbackVaryingsEXT(program, count, varyings, bufferMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_nglGetTransformFeedbackVaryingEXT__IIIJJJJ(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
    glGetTransformFeedbackVaryingEXTPROC glGetTransformFeedbackVaryingEXT = (glGetTransformFeedbackVaryingEXTPROC)tlsGetFunction(1871);
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t size = (uintptr_t)sizeAddress;
    uintptr_t type = (uintptr_t)typeAddress;
    uintptr_t name = (uintptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetTransformFeedbackVaryingEXT(program, index, bufSize, length, size, type, name);
}

EXTERN_C_EXIT
