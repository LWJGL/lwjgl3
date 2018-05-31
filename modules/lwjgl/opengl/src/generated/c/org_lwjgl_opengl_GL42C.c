/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetActiveAtomicCounterBufferivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glTexStorage1DPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTexStorage2DPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTexStorage3DPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glDrawTransformFeedbackInstancedPROC) (jint, jint, jint);
typedef void (APIENTRY *glDrawTransformFeedbackStreamInstancedPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glDrawArraysInstancedBaseInstancePROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseInstancePROC) (jint, jint, jint, intptr_t, jint, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexBaseInstancePROC) (jint, jint, jint, intptr_t, jint, jint, jint);
typedef void (APIENTRY *glBindImageTexturePROC) (jint, jint, jint, jboolean, jint, jint, jint);
typedef void (APIENTRY *glMemoryBarrierPROC) (jint);
typedef void (APIENTRY *glGetInternalformativPROC) (jint, jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42C_nglGetActiveAtomicCounterBufferiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint bufferIndex, jint pname, jlong paramsAddress) {
    glGetActiveAtomicCounterBufferivPROC glGetActiveAtomicCounterBufferiv = (glGetActiveAtomicCounterBufferivPROC)tlsGetFunction(858);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42C_glTexStorage1D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width) {
    glTexStorage1DPROC glTexStorage1D = (glTexStorage1DPROC)tlsGetFunction(859);
    UNUSED_PARAM(clazz)
    glTexStorage1D(target, levels, internalformat, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42C_glTexStorage2D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height) {
    glTexStorage2DPROC glTexStorage2D = (glTexStorage2DPROC)tlsGetFunction(860);
    UNUSED_PARAM(clazz)
    glTexStorage2D(target, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42C_glTexStorage3D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jint depth) {
    glTexStorage3DPROC glTexStorage3D = (glTexStorage3DPROC)tlsGetFunction(861);
    UNUSED_PARAM(clazz)
    glTexStorage3D(target, levels, internalformat, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42C_glDrawTransformFeedbackInstanced(JNIEnv *__env, jclass clazz, jint mode, jint id, jint primcount) {
    glDrawTransformFeedbackInstancedPROC glDrawTransformFeedbackInstanced = (glDrawTransformFeedbackInstancedPROC)tlsGetFunction(862);
    UNUSED_PARAM(clazz)
    glDrawTransformFeedbackInstanced(mode, id, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42C_glDrawTransformFeedbackStreamInstanced(JNIEnv *__env, jclass clazz, jint mode, jint id, jint stream, jint primcount) {
    glDrawTransformFeedbackStreamInstancedPROC glDrawTransformFeedbackStreamInstanced = (glDrawTransformFeedbackStreamInstancedPROC)tlsGetFunction(863);
    UNUSED_PARAM(clazz)
    glDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42C_glDrawArraysInstancedBaseInstance(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count, jint primcount, jint baseinstance) {
    glDrawArraysInstancedBaseInstancePROC glDrawArraysInstancedBaseInstance = (glDrawArraysInstancedBaseInstancePROC)tlsGetFunction(864);
    UNUSED_PARAM(clazz)
    glDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42C_nglDrawElementsInstancedBaseInstance(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jint baseinstance) {
    glDrawElementsInstancedBaseInstancePROC glDrawElementsInstancedBaseInstance = (glDrawElementsInstancedBaseInstancePROC)tlsGetFunction(865);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42C_nglDrawElementsInstancedBaseVertexBaseInstance(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jint basevertex, jint baseinstance) {
    glDrawElementsInstancedBaseVertexBaseInstancePROC glDrawElementsInstancedBaseVertexBaseInstance = (glDrawElementsInstancedBaseVertexBaseInstancePROC)tlsGetFunction(866);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42C_glBindImageTexture(JNIEnv *__env, jclass clazz, jint unit, jint texture, jint level, jboolean layered, jint layer, jint access, jint format) {
    glBindImageTexturePROC glBindImageTexture = (glBindImageTexturePROC)tlsGetFunction(867);
    UNUSED_PARAM(clazz)
    glBindImageTexture(unit, texture, level, layered, layer, access, format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42C_glMemoryBarrier(JNIEnv *__env, jclass clazz, jint barriers) {
    glMemoryBarrierPROC glMemoryBarrier = (glMemoryBarrierPROC)tlsGetFunction(868);
    UNUSED_PARAM(clazz)
    glMemoryBarrier(barriers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL42C_nglGetInternalformativ__IIIIJ(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint pname, jint bufSize, jlong paramsAddress) {
    glGetInternalformativPROC glGetInternalformativ = (glGetInternalformativPROC)tlsGetFunction(869);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetInternalformativ(target, internalformat, pname, bufSize, params);
}

EXTERN_C_EXIT
