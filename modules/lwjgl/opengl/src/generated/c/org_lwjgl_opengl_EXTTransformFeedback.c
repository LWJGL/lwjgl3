/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindBufferRangeEXTPROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glBindBufferOffsetEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glBindBufferBaseEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glBeginTransformFeedbackEXTPROC) (jint);
typedef void (APIENTRY *glEndTransformFeedbackEXTPROC) (void);
typedef void (APIENTRY *glTransformFeedbackVaryingsEXTPROC) (jint, jint, intptr_t, jint);
typedef void (APIENTRY *glGetTransformFeedbackVaryingEXTPROC) (jint, jint, jint, intptr_t, intptr_t, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_glBindBufferRangeEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset, jlong size) {
    glBindBufferRangeEXTPROC glBindBufferRangeEXT = (glBindBufferRangeEXTPROC)tlsGetFunction(1826);
    UNUSED_PARAM(clazz)
    glBindBufferRangeEXT(target, index, buffer, (intptr_t)offset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_glBindBufferOffsetEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset) {
    glBindBufferOffsetEXTPROC glBindBufferOffsetEXT = (glBindBufferOffsetEXTPROC)tlsGetFunction(1827);
    UNUSED_PARAM(clazz)
    glBindBufferOffsetEXT(target, index, buffer, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_glBindBufferBaseEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer) {
    glBindBufferBaseEXTPROC glBindBufferBaseEXT = (glBindBufferBaseEXTPROC)tlsGetFunction(1828);
    UNUSED_PARAM(clazz)
    glBindBufferBaseEXT(target, index, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_glBeginTransformFeedbackEXT(JNIEnv *__env, jclass clazz, jint primitiveMode) {
    glBeginTransformFeedbackEXTPROC glBeginTransformFeedbackEXT = (glBeginTransformFeedbackEXTPROC)tlsGetFunction(1829);
    UNUSED_PARAM(clazz)
    glBeginTransformFeedbackEXT(primitiveMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_glEndTransformFeedbackEXT(JNIEnv *__env, jclass clazz) {
    glEndTransformFeedbackEXTPROC glEndTransformFeedbackEXT = (glEndTransformFeedbackEXTPROC)tlsGetFunction(1830);
    UNUSED_PARAM(clazz)
    glEndTransformFeedbackEXT();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_nglTransformFeedbackVaryingsEXT(JNIEnv *__env, jclass clazz, jint program, jint count, jlong varyingsAddress, jint bufferMode) {
    glTransformFeedbackVaryingsEXTPROC glTransformFeedbackVaryingsEXT = (glTransformFeedbackVaryingsEXTPROC)tlsGetFunction(1831);
    intptr_t varyings = (intptr_t)varyingsAddress;
    UNUSED_PARAM(clazz)
    glTransformFeedbackVaryingsEXT(program, count, varyings, bufferMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTransformFeedback_nglGetTransformFeedbackVaryingEXT__IIIJJJJ(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
    glGetTransformFeedbackVaryingEXTPROC glGetTransformFeedbackVaryingEXT = (glGetTransformFeedbackVaryingEXTPROC)tlsGetFunction(1832);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t size = (intptr_t)sizeAddress;
    intptr_t type = (intptr_t)typeAddress;
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetTransformFeedbackVaryingEXT(program, index, bufSize, length, size, type, name);
}

EXTERN_C_EXIT
