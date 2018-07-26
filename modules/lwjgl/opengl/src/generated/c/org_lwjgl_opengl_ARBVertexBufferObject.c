/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindBufferARBPROC) (jint, jint);
typedef void (APIENTRY *glDeleteBuffersARBPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenBuffersARBPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsBufferARBPROC) (jint);
typedef void (APIENTRY *glBufferDataARBPROC) (jint, intptr_t, intptr_t, jint);
typedef void (APIENTRY *glBufferSubDataARBPROC) (jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glGetBufferSubDataARBPROC) (jint, intptr_t, intptr_t, intptr_t);
typedef intptr_t (APIENTRY *glMapBufferARBPROC) (jint, jint);
typedef jboolean (APIENTRY *glUnmapBufferARBPROC) (jint);
typedef void (APIENTRY *glGetBufferParameterivARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetBufferPointervARBPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_glBindBufferARB(JNIEnv *__env, jclass clazz, jint target, jint buffer) {
    glBindBufferARBPROC glBindBufferARB = (glBindBufferARBPROC)tlsGetFunction(1367);
    UNUSED_PARAM(clazz)
    glBindBufferARB(target, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglDeleteBuffersARB__IJ(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress) {
    glDeleteBuffersARBPROC glDeleteBuffersARB = (glDeleteBuffersARBPROC)tlsGetFunction(1368);
    intptr_t buffers = (intptr_t)buffersAddress;
    UNUSED_PARAM(clazz)
    glDeleteBuffersARB(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglGenBuffersARB__IJ(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress) {
    glGenBuffersARBPROC glGenBuffersARB = (glGenBuffersARBPROC)tlsGetFunction(1369);
    intptr_t buffers = (intptr_t)buffersAddress;
    UNUSED_PARAM(clazz)
    glGenBuffersARB(n, buffers);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_glIsBufferARB(JNIEnv *__env, jclass clazz, jint buffer) {
    glIsBufferARBPROC glIsBufferARB = (glIsBufferARBPROC)tlsGetFunction(1370);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsBufferARB(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglBufferDataARB__IJJI(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint usage) {
    glBufferDataARBPROC glBufferDataARB = (glBufferDataARBPROC)tlsGetFunction(1371);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glBufferDataARB(target, (intptr_t)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglBufferSubDataARB__IJJJ(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jlong dataAddress) {
    glBufferSubDataARBPROC glBufferSubDataARB = (glBufferSubDataARBPROC)tlsGetFunction(1372);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glBufferSubDataARB(target, (intptr_t)offset, (intptr_t)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglGetBufferSubDataARB__IJJJ(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jlong dataAddress) {
    glGetBufferSubDataARBPROC glGetBufferSubDataARB = (glGetBufferSubDataARBPROC)tlsGetFunction(1373);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetBufferSubDataARB(target, (intptr_t)offset, (intptr_t)size, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglMapBufferARB(JNIEnv *__env, jclass clazz, jint target, jint access) {
    glMapBufferARBPROC glMapBufferARB = (glMapBufferARBPROC)tlsGetFunction(1374);
    UNUSED_PARAM(clazz)
    return (jlong)glMapBufferARB(target, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_glUnmapBufferARB(JNIEnv *__env, jclass clazz, jint target) {
    glUnmapBufferARBPROC glUnmapBufferARB = (glUnmapBufferARBPROC)tlsGetFunction(1375);
    UNUSED_PARAM(clazz)
    return (jboolean)glUnmapBufferARB(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglGetBufferParameterivARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetBufferParameterivARBPROC glGetBufferParameterivARB = (glGetBufferParameterivARBPROC)tlsGetFunction(1376);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetBufferParameterivARB(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBufferObject_nglGetBufferPointervARB(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetBufferPointervARBPROC glGetBufferPointervARB = (glGetBufferPointervARBPROC)tlsGetFunction(1377);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetBufferPointervARB(target, pname, params);
}

EXTERN_C_EXIT
