/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBufferAddressRangeNVPROC) (jint, jint, jlong, uintptr_t);
typedef void (APIENTRY *glVertexFormatNVPROC) (jint, jint, jint);
typedef void (APIENTRY *glNormalFormatNVPROC) (jint, jint);
typedef void (APIENTRY *glColorFormatNVPROC) (jint, jint, jint);
typedef void (APIENTRY *glIndexFormatNVPROC) (jint, jint);
typedef void (APIENTRY *glTexCoordFormatNVPROC) (jint, jint, jint);
typedef void (APIENTRY *glEdgeFlagFormatNVPROC) (jint);
typedef void (APIENTRY *glSecondaryColorFormatNVPROC) (jint, jint, jint);
typedef void (APIENTRY *glFogCoordFormatNVPROC) (jint, jint);
typedef void (APIENTRY *glVertexAttribFormatNVPROC) (jint, jint, jint, jboolean, jint);
typedef void (APIENTRY *glVertexAttribIFormatNVPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glGetIntegerui64i_vNVPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_glBufferAddressRangeNV(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong address, jlong length) {
    glBufferAddressRangeNVPROC glBufferAddressRangeNV = (glBufferAddressRangeNVPROC)tlsGetFunction(2196);
    UNUSED_PARAM(clazz)
    glBufferAddressRangeNV(pname, index, address, (uintptr_t)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_glVertexFormatNV(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride) {
    glVertexFormatNVPROC glVertexFormatNV = (glVertexFormatNVPROC)tlsGetFunction(2197);
    UNUSED_PARAM(clazz)
    glVertexFormatNV(size, type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_glNormalFormatNV(JNIEnv *__env, jclass clazz, jint type, jint stride) {
    glNormalFormatNVPROC glNormalFormatNV = (glNormalFormatNVPROC)tlsGetFunction(2198);
    UNUSED_PARAM(clazz)
    glNormalFormatNV(type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_glColorFormatNV(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride) {
    glColorFormatNVPROC glColorFormatNV = (glColorFormatNVPROC)tlsGetFunction(2199);
    UNUSED_PARAM(clazz)
    glColorFormatNV(size, type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_glIndexFormatNV(JNIEnv *__env, jclass clazz, jint type, jint stride) {
    glIndexFormatNVPROC glIndexFormatNV = (glIndexFormatNVPROC)tlsGetFunction(2200);
    UNUSED_PARAM(clazz)
    glIndexFormatNV(type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_glTexCoordFormatNV(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride) {
    glTexCoordFormatNVPROC glTexCoordFormatNV = (glTexCoordFormatNVPROC)tlsGetFunction(2201);
    UNUSED_PARAM(clazz)
    glTexCoordFormatNV(size, type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_glEdgeFlagFormatNV(JNIEnv *__env, jclass clazz, jint stride) {
    glEdgeFlagFormatNVPROC glEdgeFlagFormatNV = (glEdgeFlagFormatNVPROC)tlsGetFunction(2202);
    UNUSED_PARAM(clazz)
    glEdgeFlagFormatNV(stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_glSecondaryColorFormatNV(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride) {
    glSecondaryColorFormatNVPROC glSecondaryColorFormatNV = (glSecondaryColorFormatNVPROC)tlsGetFunction(2203);
    UNUSED_PARAM(clazz)
    glSecondaryColorFormatNV(size, type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_glFogCoordFormatNV(JNIEnv *__env, jclass clazz, jint type, jint stride) {
    glFogCoordFormatNVPROC glFogCoordFormatNV = (glFogCoordFormatNVPROC)tlsGetFunction(2204);
    UNUSED_PARAM(clazz)
    glFogCoordFormatNV(type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_glVertexAttribFormatNV(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jboolean normalized, jint stride) {
    glVertexAttribFormatNVPROC glVertexAttribFormatNV = (glVertexAttribFormatNVPROC)tlsGetFunction(2205);
    UNUSED_PARAM(clazz)
    glVertexAttribFormatNV(index, size, type, normalized, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_glVertexAttribIFormatNV(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jint stride) {
    glVertexAttribIFormatNVPROC glVertexAttribIFormatNV = (glVertexAttribIFormatNVPROC)tlsGetFunction(2206);
    UNUSED_PARAM(clazz)
    glVertexAttribIFormatNV(index, size, type, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVVertexBufferUnifiedMemory_nglGetIntegerui64i_1vNV__IIJ(JNIEnv *__env, jclass clazz, jint value, jint index, jlong resultAddress) {
    glGetIntegerui64i_vNVPROC glGetIntegerui64i_vNV = (glGetIntegerui64i_vNVPROC)tlsGetFunction(2207);
    uintptr_t result = (uintptr_t)resultAddress;
    UNUSED_PARAM(clazz)
    glGetIntegerui64i_vNV(value, index, result);
}

EXTERN_C_EXIT
