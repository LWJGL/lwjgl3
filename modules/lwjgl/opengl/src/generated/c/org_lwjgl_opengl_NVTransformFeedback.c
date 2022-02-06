/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBeginTransformFeedbackNVPROC) (jint);
typedef void (APIENTRY *glEndTransformFeedbackNVPROC) (void);
typedef void (APIENTRY *glTransformFeedbackAttribsNVPROC) (jint, uintptr_t, jint);
typedef void (APIENTRY *glBindBufferRangeNVPROC) (jint, jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glBindBufferOffsetNVPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glBindBufferBaseNVPROC) (jint, jint, jint);
typedef void (APIENTRY *glTransformFeedbackVaryingsNVPROC) (jint, jint, uintptr_t, jint);
typedef void (APIENTRY *glActiveVaryingNVPROC) (jint, uintptr_t);
typedef jint (APIENTRY *glGetVaryingLocationNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetActiveVaryingNVPROC) (jint, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetTransformFeedbackVaryingNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glTransformFeedbackStreamAttribsNVPROC) (jint, uintptr_t, jint, uintptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_glBeginTransformFeedbackNV(JNIEnv *__env, jclass clazz, jint primitiveMode) {
    glBeginTransformFeedbackNVPROC glBeginTransformFeedbackNV = (glBeginTransformFeedbackNVPROC)tlsGetFunction(2156);
    UNUSED_PARAM(clazz)
    glBeginTransformFeedbackNV(primitiveMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_glEndTransformFeedbackNV(JNIEnv *__env, jclass clazz) {
    glEndTransformFeedbackNVPROC glEndTransformFeedbackNV = (glEndTransformFeedbackNVPROC)tlsGetFunction(2157);
    UNUSED_PARAM(clazz)
    glEndTransformFeedbackNV();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglTransformFeedbackAttribsNV__IJI(JNIEnv *__env, jclass clazz, jint count, jlong attribsAddress, jint bufferMode) {
    glTransformFeedbackAttribsNVPROC glTransformFeedbackAttribsNV = (glTransformFeedbackAttribsNVPROC)tlsGetFunction(2158);
    uintptr_t attribs = (uintptr_t)attribsAddress;
    UNUSED_PARAM(clazz)
    glTransformFeedbackAttribsNV(count, attribs, bufferMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_glBindBufferRangeNV(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset, jlong size) {
    glBindBufferRangeNVPROC glBindBufferRangeNV = (glBindBufferRangeNVPROC)tlsGetFunction(2159);
    UNUSED_PARAM(clazz)
    glBindBufferRangeNV(target, index, buffer, (uintptr_t)offset, (uintptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_glBindBufferOffsetNV(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset) {
    glBindBufferOffsetNVPROC glBindBufferOffsetNV = (glBindBufferOffsetNVPROC)tlsGetFunction(2160);
    UNUSED_PARAM(clazz)
    glBindBufferOffsetNV(target, index, buffer, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_glBindBufferBaseNV(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer) {
    glBindBufferBaseNVPROC glBindBufferBaseNV = (glBindBufferBaseNVPROC)tlsGetFunction(2161);
    UNUSED_PARAM(clazz)
    glBindBufferBaseNV(target, index, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglTransformFeedbackVaryingsNV__IIJI(JNIEnv *__env, jclass clazz, jint program, jint count, jlong locationsAddress, jint bufferMode) {
    glTransformFeedbackVaryingsNVPROC glTransformFeedbackVaryingsNV = (glTransformFeedbackVaryingsNVPROC)tlsGetFunction(2162);
    uintptr_t locations = (uintptr_t)locationsAddress;
    UNUSED_PARAM(clazz)
    glTransformFeedbackVaryingsNV(program, count, locations, bufferMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglActiveVaryingNV(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
    glActiveVaryingNVPROC glActiveVaryingNV = (glActiveVaryingNVPROC)tlsGetFunction(2163);
    uintptr_t name = (uintptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glActiveVaryingNV(program, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglGetVaryingLocationNV(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
    glGetVaryingLocationNVPROC glGetVaryingLocationNV = (glGetVaryingLocationNVPROC)tlsGetFunction(2164);
    uintptr_t name = (uintptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetVaryingLocationNV(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglGetActiveVaryingNV__IIIJJJJ(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
    glGetActiveVaryingNVPROC glGetActiveVaryingNV = (glGetActiveVaryingNVPROC)tlsGetFunction(2165);
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t size = (uintptr_t)sizeAddress;
    uintptr_t type = (uintptr_t)typeAddress;
    uintptr_t name = (uintptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetActiveVaryingNV(program, index, bufSize, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglGetTransformFeedbackVaryingNV__IIJ(JNIEnv *__env, jclass clazz, jint program, jint index, jlong locationAddress) {
    glGetTransformFeedbackVaryingNVPROC glGetTransformFeedbackVaryingNV = (glGetTransformFeedbackVaryingNVPROC)tlsGetFunction(2166);
    uintptr_t location = (uintptr_t)locationAddress;
    UNUSED_PARAM(clazz)
    glGetTransformFeedbackVaryingNV(program, index, location);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback_nglTransformFeedbackStreamAttribsNV__IJIJI(JNIEnv *__env, jclass clazz, jint count, jlong attribsAddress, jint nbuffers, jlong bufstreamsAddress, jint bufferMode) {
    glTransformFeedbackStreamAttribsNVPROC glTransformFeedbackStreamAttribsNV = (glTransformFeedbackStreamAttribsNVPROC)tlsGetFunction(2167);
    uintptr_t attribs = (uintptr_t)attribsAddress;
    uintptr_t bufstreams = (uintptr_t)bufstreamsAddress;
    UNUSED_PARAM(clazz)
    glTransformFeedbackStreamAttribsNV(count, attribs, nbuffers, bufstreams, bufferMode);
}

EXTERN_C_EXIT
