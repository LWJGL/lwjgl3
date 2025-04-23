/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glGetUnsignedBytevEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetUnsignedBytei_vEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glDeleteMemoryObjectsEXTPROC) (jint, uintptr_t);
typedef jboolean (APIENTRY *glIsMemoryObjectEXTPROC) (jint);
typedef void (APIENTRY *glCreateMemoryObjectsEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMemoryObjectParameterivEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMemoryObjectParameterivEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glTexStorageMem2DEXTPROC) (jint, jint, jint, jint, jint, jint, jlong);
typedef void (APIENTRY *glTexStorageMem2DMultisampleEXTPROC) (jint, jint, jint, jint, jint, jboolean, jint, jlong);
typedef void (APIENTRY *glTexStorageMem3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jlong);
typedef void (APIENTRY *glTexStorageMem3DMultisampleEXTPROC) (jint, jint, jint, jint, jint, jint, jboolean, jint, jlong);
typedef void (APIENTRY *glBufferStorageMemEXTPROC) (jint, uintptr_t, jint, jlong);
typedef void (APIENTRY *glTextureStorageMem2DEXTPROC) (jint, jint, jint, jint, jint, jint, jlong);
typedef void (APIENTRY *glTextureStorageMem2DMultisampleEXTPROC) (jint, jint, jint, jint, jint, jboolean, jint, jlong);
typedef void (APIENTRY *glTextureStorageMem3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jlong);
typedef void (APIENTRY *glTextureStorageMem3DMultisampleEXTPROC) (jint, jint, jint, jint, jint, jint, jboolean, jint, jlong);
typedef void (APIENTRY *glNamedBufferStorageMemEXTPROC) (jint, uintptr_t, jint, jlong);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_nglGetUnsignedBytevEXT(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress) {
    glGetUnsignedBytevEXTPROC glGetUnsignedBytevEXT = (glGetUnsignedBytevEXTPROC)tlsGetFunction(449);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetUnsignedBytevEXT(pname, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_nglGetUnsignedBytei_1vEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetUnsignedBytei_vEXTPROC glGetUnsignedBytei_vEXT = (glGetUnsignedBytei_vEXTPROC)tlsGetFunction(450);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetUnsignedBytei_vEXT(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_nglDeleteMemoryObjectsEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong memoryObjectsAddress) {
    glDeleteMemoryObjectsEXTPROC glDeleteMemoryObjectsEXT = (glDeleteMemoryObjectsEXTPROC)tlsGetFunction(451);
    uintptr_t memoryObjects = (uintptr_t)memoryObjectsAddress;
    UNUSED_PARAM(clazz)
    glDeleteMemoryObjectsEXT(n, memoryObjects);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_glIsMemoryObjectEXT(JNIEnv *__env, jclass clazz, jint memoryObject) {
    glIsMemoryObjectEXTPROC glIsMemoryObjectEXT = (glIsMemoryObjectEXTPROC)tlsGetFunction(452);
    UNUSED_PARAM(clazz)
    return glIsMemoryObjectEXT(memoryObject);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_nglCreateMemoryObjectsEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong memoryObjectsAddress) {
    glCreateMemoryObjectsEXTPROC glCreateMemoryObjectsEXT = (glCreateMemoryObjectsEXTPROC)tlsGetFunction(453);
    uintptr_t memoryObjects = (uintptr_t)memoryObjectsAddress;
    UNUSED_PARAM(clazz)
    glCreateMemoryObjectsEXT(n, memoryObjects);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_nglMemoryObjectParameterivEXT__IIJ(JNIEnv *__env, jclass clazz, jint memoryObject, jint pname, jlong paramsAddress) {
    glMemoryObjectParameterivEXTPROC glMemoryObjectParameterivEXT = (glMemoryObjectParameterivEXTPROC)tlsGetFunction(454);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMemoryObjectParameterivEXT(memoryObject, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_nglGetMemoryObjectParameterivEXT__IIJ(JNIEnv *__env, jclass clazz, jint memoryObject, jint pname, jlong paramsAddress) {
    glGetMemoryObjectParameterivEXTPROC glGetMemoryObjectParameterivEXT = (glGetMemoryObjectParameterivEXTPROC)tlsGetFunction(455);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMemoryObjectParameterivEXT(memoryObject, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_glTexStorageMem2DEXT(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalFormat, jint width, jint height, jint memory, jlong offset) {
    glTexStorageMem2DEXTPROC glTexStorageMem2DEXT = (glTexStorageMem2DEXTPROC)tlsGetFunction(456);
    UNUSED_PARAM(clazz)
    glTexStorageMem2DEXT(target, levels, internalFormat, width, height, memory, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_glTexStorageMem2DMultisampleEXT(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalFormat, jint width, jint height, jboolean fixedSampleLocations, jint memory, jlong offset) {
    glTexStorageMem2DMultisampleEXTPROC glTexStorageMem2DMultisampleEXT = (glTexStorageMem2DMultisampleEXTPROC)tlsGetFunction(457);
    UNUSED_PARAM(clazz)
    glTexStorageMem2DMultisampleEXT(target, samples, internalFormat, width, height, fixedSampleLocations, memory, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_glTexStorageMem3DEXT(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalFormat, jint width, jint height, jint depth, jint memory, jlong offset) {
    glTexStorageMem3DEXTPROC glTexStorageMem3DEXT = (glTexStorageMem3DEXTPROC)tlsGetFunction(458);
    UNUSED_PARAM(clazz)
    glTexStorageMem3DEXT(target, levels, internalFormat, width, height, depth, memory, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_glTexStorageMem3DMultisampleEXT(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalFormat, jint width, jint height, jint depth, jboolean fixedSampleLocations, jint memory, jlong offset) {
    glTexStorageMem3DMultisampleEXTPROC glTexStorageMem3DMultisampleEXT = (glTexStorageMem3DMultisampleEXTPROC)tlsGetFunction(459);
    UNUSED_PARAM(clazz)
    glTexStorageMem3DMultisampleEXT(target, samples, internalFormat, width, height, depth, fixedSampleLocations, memory, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_glBufferStorageMemEXT(JNIEnv *__env, jclass clazz, jint target, jlong size, jint memory, jlong offset) {
    glBufferStorageMemEXTPROC glBufferStorageMemEXT = (glBufferStorageMemEXTPROC)tlsGetFunction(460);
    UNUSED_PARAM(clazz)
    glBufferStorageMemEXT(target, (uintptr_t)size, memory, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_glTextureStorageMem2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint levels, jint internalFormat, jint width, jint height, jint memory, jlong offset) {
    glTextureStorageMem2DEXTPROC glTextureStorageMem2DEXT = (glTextureStorageMem2DEXTPROC)tlsGetFunction(461);
    UNUSED_PARAM(clazz)
    glTextureStorageMem2DEXT(texture, levels, internalFormat, width, height, memory, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_glTextureStorageMem2DMultisampleEXT(JNIEnv *__env, jclass clazz, jint texture, jint samples, jint internalFormat, jint width, jint height, jboolean fixedSampleLocations, jint memory, jlong offset) {
    glTextureStorageMem2DMultisampleEXTPROC glTextureStorageMem2DMultisampleEXT = (glTextureStorageMem2DMultisampleEXTPROC)tlsGetFunction(462);
    UNUSED_PARAM(clazz)
    glTextureStorageMem2DMultisampleEXT(texture, samples, internalFormat, width, height, fixedSampleLocations, memory, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_glTextureStorageMem3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint levels, jint internalFormat, jint width, jint height, jint depth, jint memory, jlong offset) {
    glTextureStorageMem3DEXTPROC glTextureStorageMem3DEXT = (glTextureStorageMem3DEXTPROC)tlsGetFunction(463);
    UNUSED_PARAM(clazz)
    glTextureStorageMem3DEXT(texture, levels, internalFormat, width, height, depth, memory, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_glTextureStorageMem3DMultisampleEXT(JNIEnv *__env, jclass clazz, jint texture, jint samples, jint internalFormat, jint width, jint height, jint depth, jboolean fixedSampleLocations, jint memory, jlong offset) {
    glTextureStorageMem3DMultisampleEXTPROC glTextureStorageMem3DMultisampleEXT = (glTextureStorageMem3DMultisampleEXTPROC)tlsGetFunction(464);
    UNUSED_PARAM(clazz)
    glTextureStorageMem3DMultisampleEXT(texture, samples, internalFormat, width, height, depth, fixedSampleLocations, memory, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMemoryObject_glNamedBufferStorageMemEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jint memory, jlong offset) {
    glNamedBufferStorageMemEXTPROC glNamedBufferStorageMemEXT = (glNamedBufferStorageMemEXTPROC)tlsGetFunction(465);
    UNUSED_PARAM(clazz)
    glNamedBufferStorageMemEXT(buffer, (uintptr_t)size, memory, offset);
}

EXTERN_C_EXIT
