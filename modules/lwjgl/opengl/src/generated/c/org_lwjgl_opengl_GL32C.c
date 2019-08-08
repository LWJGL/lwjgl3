/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetBufferParameteri64vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glDrawElementsBaseVertexPROC) (jint, jint, jint, intptr_t, jint);
typedef void (APIENTRY *glDrawRangeElementsBaseVertexPROC) (jint, jint, jint, jint, jint, intptr_t, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexPROC) (jint, jint, jint, intptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawElementsBaseVertexPROC) (jint, intptr_t, jint, intptr_t, jint, intptr_t);
typedef void (APIENTRY *glProvokingVertexPROC) (jint);
typedef void (APIENTRY *glTexImage2DMultisamplePROC) (jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTexImage3DMultisamplePROC) (jint, jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glGetMultisamplefvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glSampleMaskiPROC) (jint, jint);
typedef void (APIENTRY *glFramebufferTexturePROC) (jint, jint, jint, jint);
typedef intptr_t (APIENTRY *glFenceSyncPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsSyncPROC) (intptr_t);
typedef void (APIENTRY *glDeleteSyncPROC) (intptr_t);
typedef jint (APIENTRY *glClientWaitSyncPROC) (intptr_t, jint, jlong);
typedef void (APIENTRY *glWaitSyncPROC) (intptr_t, jint, jlong);
typedef void (APIENTRY *glGetInteger64vPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetInteger64i_vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSyncivPROC) (intptr_t, jint, jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_nglGetBufferParameteri64v__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetBufferParameteri64vPROC glGetBufferParameteri64v = (glGetBufferParameteri64vPROC)tlsGetFunction(647);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetBufferParameteri64v(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_nglDrawElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawElementsBaseVertexPROC glDrawElementsBaseVertex = (glDrawElementsBaseVertexPROC)tlsGetFunction(648);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_nglDrawRangeElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawRangeElementsBaseVertexPROC glDrawRangeElementsBaseVertex = (glDrawRangeElementsBaseVertexPROC)tlsGetFunction(649);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_nglDrawElementsInstancedBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount, jint basevertex) {
    glDrawElementsInstancedBaseVertexPROC glDrawElementsInstancedBaseVertex = (glDrawElementsInstancedBaseVertexPROC)tlsGetFunction(650);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_nglMultiDrawElementsBaseVertex__IJIJIJ(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint drawcount, jlong basevertexAddress) {
    glMultiDrawElementsBaseVertexPROC glMultiDrawElementsBaseVertex = (glMultiDrawElementsBaseVertexPROC)tlsGetFunction(651);
    intptr_t count = (intptr_t)countAddress;
    intptr_t indices = (intptr_t)indicesAddress;
    intptr_t basevertex = (intptr_t)basevertexAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsBaseVertex(mode, count, type, indices, drawcount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_glProvokingVertex(JNIEnv *__env, jclass clazz, jint mode) {
    glProvokingVertexPROC glProvokingVertex = (glProvokingVertexPROC)tlsGetFunction(652);
    UNUSED_PARAM(clazz)
    glProvokingVertex(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_glTexImage2DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations) {
    glTexImage2DMultisamplePROC glTexImage2DMultisample = (glTexImage2DMultisamplePROC)tlsGetFunction(653);
    UNUSED_PARAM(clazz)
    glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_glTexImage3DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations) {
    glTexImage3DMultisamplePROC glTexImage3DMultisample = (glTexImage3DMultisamplePROC)tlsGetFunction(654);
    UNUSED_PARAM(clazz)
    glTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_nglGetMultisamplefv__IIJ(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong valAddress) {
    glGetMultisamplefvPROC glGetMultisamplefv = (glGetMultisamplefvPROC)tlsGetFunction(655);
    intptr_t val = (intptr_t)valAddress;
    UNUSED_PARAM(clazz)
    glGetMultisamplefv(pname, index, val);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_glSampleMaski(JNIEnv *__env, jclass clazz, jint index, jint mask) {
    glSampleMaskiPROC glSampleMaski = (glSampleMaskiPROC)tlsGetFunction(656);
    UNUSED_PARAM(clazz)
    glSampleMaski(index, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_glFramebufferTexture(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level) {
    glFramebufferTexturePROC glFramebufferTexture = (glFramebufferTexturePROC)tlsGetFunction(657);
    UNUSED_PARAM(clazz)
    glFramebufferTexture(target, attachment, texture, level);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL32C_glFenceSync(JNIEnv *__env, jclass clazz, jint condition, jint flags) {
    glFenceSyncPROC glFenceSync = (glFenceSyncPROC)tlsGetFunction(658);
    UNUSED_PARAM(clazz)
    return (jlong)glFenceSync(condition, flags);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL32C_nglIsSync(JNIEnv *__env, jclass clazz, jlong syncAddress) {
    glIsSyncPROC glIsSync = (glIsSyncPROC)tlsGetFunction(659);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    return (jboolean)glIsSync(sync);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_nglDeleteSync(JNIEnv *__env, jclass clazz, jlong syncAddress) {
    glDeleteSyncPROC glDeleteSync = (glDeleteSyncPROC)tlsGetFunction(660);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    glDeleteSync(sync);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL32C_nglClientWaitSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout) {
    glClientWaitSyncPROC glClientWaitSync = (glClientWaitSyncPROC)tlsGetFunction(661);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    return (jint)glClientWaitSync(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_nglWaitSync(JNIEnv *__env, jclass clazz, jlong syncAddress, jint flags, jlong timeout) {
    glWaitSyncPROC glWaitSync = (glWaitSyncPROC)tlsGetFunction(662);
    intptr_t sync = (intptr_t)syncAddress;
    UNUSED_PARAM(clazz)
    glWaitSync(sync, flags, timeout);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_nglGetInteger64v__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetInteger64vPROC glGetInteger64v = (glGetInteger64vPROC)tlsGetFunction(663);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetInteger64v(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_nglGetInteger64i_1v__IIJ(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong paramsAddress) {
    glGetInteger64i_vPROC glGetInteger64i_v = (glGetInteger64i_vPROC)tlsGetFunction(664);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetInteger64i_v(pname, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL32C_nglGetSynciv__JIIJJ(JNIEnv *__env, jclass clazz, jlong syncAddress, jint pname, jint bufSize, jlong lengthAddress, jlong valuesAddress) {
    glGetSyncivPROC glGetSynciv = (glGetSyncivPROC)tlsGetFunction(665);
    intptr_t sync = (intptr_t)syncAddress;
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetSynciv(sync, pname, bufSize, length, values);
}

EXTERN_C_EXIT
