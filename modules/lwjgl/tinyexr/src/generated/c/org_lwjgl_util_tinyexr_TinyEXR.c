/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "tinyexr.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nInitEXRHeader(jlong exr_headerAddress) {
    EXRHeader *exr_header = (EXRHeader *)(intptr_t)exr_headerAddress;
    InitEXRHeader(exr_header);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nInitEXRHeader(JNIEnv *__env, jclass clazz, jlong exr_headerAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nInitEXRHeader(exr_headerAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nInitEXRImage(jlong exr_imageAddress) {
    EXRImage *exr_image = (EXRImage *)(intptr_t)exr_imageAddress;
    InitEXRImage(exr_image);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nInitEXRImage(JNIEnv *__env, jclass clazz, jlong exr_imageAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nInitEXRImage(exr_imageAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRHeader(jlong exr_headerAddress) {
    EXRHeader *exr_header = (EXRHeader *)(intptr_t)exr_headerAddress;
    return (jint)FreeEXRHeader(exr_header);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRHeader(JNIEnv *__env, jclass clazz, jlong exr_headerAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRHeader(exr_headerAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRImage(jlong exr_imageAddress) {
    EXRImage *exr_image = (EXRImage *)(intptr_t)exr_imageAddress;
    return (jint)FreeEXRImage(exr_image);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRImage(JNIEnv *__env, jclass clazz, jlong exr_imageAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRImage(exr_imageAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRErrorMessage(jlong msgAddress) {
    char const *msg = (char const *)(intptr_t)msgAddress;
    FreeEXRErrorMessage(msg);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRErrorMessage(JNIEnv *__env, jclass clazz, jlong msgAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRErrorMessage(msgAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRVersionFromFile(jlong versionAddress, jlong filenameAddress) {
    EXRVersion *version = (EXRVersion *)(intptr_t)versionAddress;
    char const *filename = (char const *)(intptr_t)filenameAddress;
    return (jint)ParseEXRVersionFromFile(version, filename);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRVersionFromFile(JNIEnv *__env, jclass clazz, jlong versionAddress, jlong filenameAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRVersionFromFile(versionAddress, filenameAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRVersionFromMemory(jlong versionAddress, jlong memoryAddress, jlong size) {
    EXRVersion *version = (EXRVersion *)(intptr_t)versionAddress;
    unsigned char const *memory = (unsigned char const *)(intptr_t)memoryAddress;
    return (jint)ParseEXRVersionFromMemory(version, memory, (size_t)size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRVersionFromMemory(JNIEnv *__env, jclass clazz, jlong versionAddress, jlong memoryAddress, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRVersionFromMemory(versionAddress, memoryAddress, size);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRHeaderFromFile(jlong headerAddress, jlong versionAddress, jlong filenameAddress, jlong errAddress) {
    EXRHeader *header = (EXRHeader *)(intptr_t)headerAddress;
    EXRVersion const *version = (EXRVersion const *)(intptr_t)versionAddress;
    char const *filename = (char const *)(intptr_t)filenameAddress;
    char const **err = (char const **)(intptr_t)errAddress;
    return (jint)ParseEXRHeaderFromFile(header, version, filename, err);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRHeaderFromFile(JNIEnv *__env, jclass clazz, jlong headerAddress, jlong versionAddress, jlong filenameAddress, jlong errAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRHeaderFromFile(headerAddress, versionAddress, filenameAddress, errAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRHeaderFromMemory(jlong headerAddress, jlong versionAddress, jlong memoryAddress, jlong size, jlong errAddress) {
    EXRHeader *header = (EXRHeader *)(intptr_t)headerAddress;
    EXRVersion const *version = (EXRVersion const *)(intptr_t)versionAddress;
    unsigned char const *memory = (unsigned char const *)(intptr_t)memoryAddress;
    char const **err = (char const **)(intptr_t)errAddress;
    return (jint)ParseEXRHeaderFromMemory(header, version, memory, (size_t)size, err);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRHeaderFromMemory(JNIEnv *__env, jclass clazz, jlong headerAddress, jlong versionAddress, jlong memoryAddress, jlong size, jlong errAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRHeaderFromMemory(headerAddress, versionAddress, memoryAddress, size, errAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRMultipartHeaderFromFile__JJJJJ(jlong headersAddress, jlong num_headersAddress, jlong versionAddress, jlong filenameAddress, jlong errAddress) {
    EXRHeader ***headers = (EXRHeader ***)(intptr_t)headersAddress;
    int *num_headers = (int *)(intptr_t)num_headersAddress;
    EXRVersion const *version = (EXRVersion const *)(intptr_t)versionAddress;
    char const *filename = (char const *)(intptr_t)filenameAddress;
    char const **err = (char const **)(intptr_t)errAddress;
    return (jint)ParseEXRMultipartHeaderFromFile(headers, num_headers, version, filename, err);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRMultipartHeaderFromFile__JJJJJ(JNIEnv *__env, jclass clazz, jlong headersAddress, jlong num_headersAddress, jlong versionAddress, jlong filenameAddress, jlong errAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRMultipartHeaderFromFile__JJJJJ(headersAddress, num_headersAddress, versionAddress, filenameAddress, errAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_tinyexr_TinyEXR_nParseEXRMultipartHeaderFromMemory__JJJJJJ)(jlong headersAddress, jlong num_headersAddress, jlong versionAddress, jlong memoryAddress, jlong size, jlong errAddress) {
    EXRHeader ***headers = (EXRHeader ***)(intptr_t)headersAddress;
    int *num_headers = (int *)(intptr_t)num_headersAddress;
    EXRVersion const *version = (EXRVersion const *)(intptr_t)versionAddress;
    unsigned char const *memory = (unsigned char const *)(intptr_t)memoryAddress;
    char const **err = (char const **)(intptr_t)errAddress;
    return (jint)ParseEXRMultipartHeaderFromMemory(headers, num_headers, version, memory, (size_t)size, err);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRMultipartHeaderFromMemory__JJJJJJ(JNIEnv *__env, jclass clazz, jlong headersAddress, jlong num_headersAddress, jlong versionAddress, jlong memoryAddress, jlong size, jlong errAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_tinyexr_TinyEXR_nParseEXRMultipartHeaderFromMemory__JJJJJJ)(headersAddress, num_headersAddress, versionAddress, memoryAddress, size, errAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRImageFromFile(jlong imageAddress, jlong headerAddress, jlong filenameAddress, jlong errAddress) {
    EXRImage *image = (EXRImage *)(intptr_t)imageAddress;
    EXRHeader const *header = (EXRHeader const *)(intptr_t)headerAddress;
    char const *filename = (char const *)(intptr_t)filenameAddress;
    char const **err = (char const **)(intptr_t)errAddress;
    return (jint)LoadEXRImageFromFile(image, header, filename, err);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRImageFromFile(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong headerAddress, jlong filenameAddress, jlong errAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRImageFromFile(imageAddress, headerAddress, filenameAddress, errAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRImageFromMemory(jlong imageAddress, jlong headerAddress, jlong memoryAddress, jlong size, jlong errAddress) {
    EXRImage *image = (EXRImage *)(intptr_t)imageAddress;
    EXRHeader const *header = (EXRHeader const *)(intptr_t)headerAddress;
    unsigned char const *memory = (unsigned char const *)(intptr_t)memoryAddress;
    char const **err = (char const **)(intptr_t)errAddress;
    return (jint)LoadEXRImageFromMemory(image, header, memory, (size_t)size, err);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRImageFromMemory(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong headerAddress, jlong memoryAddress, jlong size, jlong errAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRImageFromMemory(imageAddress, headerAddress, memoryAddress, size, errAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRMultipartImageFromFile(jlong imagesAddress, jlong headersAddress, jint num_parts, jlong filenameAddress, jlong errAddress) {
    EXRImage *images = (EXRImage *)(intptr_t)imagesAddress;
    EXRHeader const **headers = (EXRHeader const **)(intptr_t)headersAddress;
    char const *filename = (char const *)(intptr_t)filenameAddress;
    char const **err = (char const **)(intptr_t)errAddress;
    return (jint)LoadEXRMultipartImageFromFile(images, headers, (unsigned int)num_parts, filename, err);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRMultipartImageFromFile(JNIEnv *__env, jclass clazz, jlong imagesAddress, jlong headersAddress, jint num_parts, jlong filenameAddress, jlong errAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRMultipartImageFromFile(imagesAddress, headersAddress, num_parts, filenameAddress, errAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRMultipartImageFromMemory)(jlong imagesAddress, jlong headersAddress, jint num_parts, jlong memoryAddress, jlong size, jlong errAddress) {
    EXRImage *images = (EXRImage *)(intptr_t)imagesAddress;
    EXRHeader const **headers = (EXRHeader const **)(intptr_t)headersAddress;
    unsigned char const *memory = (unsigned char const *)(intptr_t)memoryAddress;
    char const **err = (char const **)(intptr_t)errAddress;
    return (jint)LoadEXRMultipartImageFromMemory(images, headers, (unsigned int)num_parts, memory, (size_t)size, err);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRMultipartImageFromMemory(JNIEnv *__env, jclass clazz, jlong imagesAddress, jlong headersAddress, jint num_parts, jlong memoryAddress, jlong size, jlong errAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRMultipartImageFromMemory)(imagesAddress, headersAddress, num_parts, memoryAddress, size, errAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nSaveEXRImageToFile(jlong imageAddress, jlong exr_headerAddress, jlong filenameAddress, jlong errAddress) {
    EXRImage const *image = (EXRImage const *)(intptr_t)imageAddress;
    EXRHeader const *exr_header = (EXRHeader const *)(intptr_t)exr_headerAddress;
    char const *filename = (char const *)(intptr_t)filenameAddress;
    char const **err = (char const **)(intptr_t)errAddress;
    return (jint)SaveEXRImageToFile(image, exr_header, filename, err);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nSaveEXRImageToFile(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong exr_headerAddress, jlong filenameAddress, jlong errAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nSaveEXRImageToFile(imageAddress, exr_headerAddress, filenameAddress, errAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nSaveEXRImageToMemory(jlong imageAddress, jlong exr_headerAddress, jlong memoryAddress, jlong errAddress) {
    EXRImage const *image = (EXRImage const *)(intptr_t)imageAddress;
    EXRHeader const *exr_header = (EXRHeader const *)(intptr_t)exr_headerAddress;
    unsigned char **memory = (unsigned char **)(intptr_t)memoryAddress;
    char const **err = (char const **)(intptr_t)errAddress;
    return (jlong)SaveEXRImageToMemory(image, exr_header, memory, err);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nSaveEXRImageToMemory(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong exr_headerAddress, jlong memoryAddress, jlong errAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nSaveEXRImageToMemory(imageAddress, exr_headerAddress, memoryAddress, errAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nLoadDeepEXR(jlong out_imageAddress, jlong filenameAddress, jlong errAddress) {
    DeepImage *out_image = (DeepImage *)(intptr_t)out_imageAddress;
    char const *filename = (char const *)(intptr_t)filenameAddress;
    char const **err = (char const **)(intptr_t)errAddress;
    return (jint)LoadDeepEXR(out_image, filename, err);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadDeepEXR(JNIEnv *__env, jclass clazz, jlong out_imageAddress, jlong filenameAddress, jlong errAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_tinyexr_TinyEXR_nLoadDeepEXR(out_imageAddress, filenameAddress, errAddress);
}

EXTERN_C_EXIT
