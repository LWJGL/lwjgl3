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

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRWithLayer(JNIEnv *__env, jclass clazz, jlong out_rgbaAddress, jlong widthAddress, jlong heightAddress, jlong filenameAddress, jlong layer_nameAddress, jlong errAddress) {
    float **out_rgba = (float **)(uintptr_t)out_rgbaAddress;
    int *width = (int *)(uintptr_t)widthAddress;
    int *height = (int *)(uintptr_t)heightAddress;
    char const *filename = (char const *)(uintptr_t)filenameAddress;
    char const *layer_name = (char const *)(uintptr_t)layer_nameAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LoadEXRWithLayer(out_rgba, width, height, filename, layer_name, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nEXRLayers(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong layer_namesAddress, jlong num_layersAddress, jlong errAddress) {
    char const *filename = (char const *)(uintptr_t)filenameAddress;
    char const ***layer_names = (char const ***)(uintptr_t)layer_namesAddress;
    int *num_layers = (int *)(uintptr_t)num_layersAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)EXRLayers(filename, layer_names, num_layers, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nEXRNumLevels(JNIEnv *__env, jclass clazz, jlong exr_imageAddress) {
    EXRImage const *exr_image = (EXRImage const *)(uintptr_t)exr_imageAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)EXRNumLevels(exr_image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nInitEXRHeader(JNIEnv *__env, jclass clazz, jlong exr_headerAddress) {
    EXRHeader *exr_header = (EXRHeader *)(uintptr_t)exr_headerAddress;
    UNUSED_PARAMS(__env, clazz)
    InitEXRHeader(exr_header);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nEXRSetNameAttr(JNIEnv *__env, jclass clazz, jlong exr_headerAddress, jlong nameAddress) {
    EXRHeader *exr_header = (EXRHeader *)(uintptr_t)exr_headerAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    EXRSetNameAttr(exr_header, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nInitEXRImage(JNIEnv *__env, jclass clazz, jlong exr_imageAddress) {
    EXRImage *exr_image = (EXRImage *)(uintptr_t)exr_imageAddress;
    UNUSED_PARAMS(__env, clazz)
    InitEXRImage(exr_image);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRHeader(JNIEnv *__env, jclass clazz, jlong exr_headerAddress) {
    EXRHeader *exr_header = (EXRHeader *)(uintptr_t)exr_headerAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)FreeEXRHeader(exr_header);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRImage(JNIEnv *__env, jclass clazz, jlong exr_imageAddress) {
    EXRImage *exr_image = (EXRImage *)(uintptr_t)exr_imageAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)FreeEXRImage(exr_image);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nFreeEXRErrorMessage(JNIEnv *__env, jclass clazz, jlong msgAddress) {
    char const *msg = (char const *)(uintptr_t)msgAddress;
    UNUSED_PARAMS(__env, clazz)
    FreeEXRErrorMessage(msg);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRVersionFromFile(JNIEnv *__env, jclass clazz, jlong versionAddress, jlong filenameAddress) {
    EXRVersion *version = (EXRVersion *)(uintptr_t)versionAddress;
    char const *filename = (char const *)(uintptr_t)filenameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ParseEXRVersionFromFile(version, filename);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRVersionFromMemory(JNIEnv *__env, jclass clazz, jlong versionAddress, jlong memoryAddress, jlong size) {
    EXRVersion *version = (EXRVersion *)(uintptr_t)versionAddress;
    unsigned char const *memory = (unsigned char const *)(uintptr_t)memoryAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ParseEXRVersionFromMemory(version, memory, (size_t)size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRHeaderFromFile(JNIEnv *__env, jclass clazz, jlong headerAddress, jlong versionAddress, jlong filenameAddress, jlong errAddress) {
    EXRHeader *header = (EXRHeader *)(uintptr_t)headerAddress;
    EXRVersion const *version = (EXRVersion const *)(uintptr_t)versionAddress;
    char const *filename = (char const *)(uintptr_t)filenameAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ParseEXRHeaderFromFile(header, version, filename, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRHeaderFromMemory(JNIEnv *__env, jclass clazz, jlong headerAddress, jlong versionAddress, jlong memoryAddress, jlong size, jlong errAddress) {
    EXRHeader *header = (EXRHeader *)(uintptr_t)headerAddress;
    EXRVersion const *version = (EXRVersion const *)(uintptr_t)versionAddress;
    unsigned char const *memory = (unsigned char const *)(uintptr_t)memoryAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ParseEXRHeaderFromMemory(header, version, memory, (size_t)size, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRMultipartHeaderFromFile(JNIEnv *__env, jclass clazz, jlong headersAddress, jlong num_headersAddress, jlong versionAddress, jlong filenameAddress, jlong errAddress) {
    EXRHeader ***headers = (EXRHeader ***)(uintptr_t)headersAddress;
    int *num_headers = (int *)(uintptr_t)num_headersAddress;
    EXRVersion const *version = (EXRVersion const *)(uintptr_t)versionAddress;
    char const *filename = (char const *)(uintptr_t)filenameAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ParseEXRMultipartHeaderFromFile(headers, num_headers, version, filename, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nParseEXRMultipartHeaderFromMemory(JNIEnv *__env, jclass clazz, jlong headersAddress, jlong num_headersAddress, jlong versionAddress, jlong memoryAddress, jlong size, jlong errAddress) {
    EXRHeader ***headers = (EXRHeader ***)(uintptr_t)headersAddress;
    int *num_headers = (int *)(uintptr_t)num_headersAddress;
    EXRVersion const *version = (EXRVersion const *)(uintptr_t)versionAddress;
    unsigned char const *memory = (unsigned char const *)(uintptr_t)memoryAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ParseEXRMultipartHeaderFromMemory(headers, num_headers, version, memory, (size_t)size, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRImageFromFile(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong headerAddress, jlong filenameAddress, jlong errAddress) {
    EXRImage *image = (EXRImage *)(uintptr_t)imageAddress;
    EXRHeader const *header = (EXRHeader const *)(uintptr_t)headerAddress;
    char const *filename = (char const *)(uintptr_t)filenameAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LoadEXRImageFromFile(image, header, filename, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRImageFromMemory(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong headerAddress, jlong memoryAddress, jlong size, jlong errAddress) {
    EXRImage *image = (EXRImage *)(uintptr_t)imageAddress;
    EXRHeader const *header = (EXRHeader const *)(uintptr_t)headerAddress;
    unsigned char const *memory = (unsigned char const *)(uintptr_t)memoryAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LoadEXRImageFromMemory(image, header, memory, (size_t)size, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRMultipartImageFromFile(JNIEnv *__env, jclass clazz, jlong imagesAddress, jlong headersAddress, jint num_parts, jlong filenameAddress, jlong errAddress) {
    EXRImage *images = (EXRImage *)(uintptr_t)imagesAddress;
    EXRHeader const **headers = (EXRHeader const **)(uintptr_t)headersAddress;
    char const *filename = (char const *)(uintptr_t)filenameAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LoadEXRMultipartImageFromFile(images, headers, (unsigned int)num_parts, filename, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadEXRMultipartImageFromMemory(JNIEnv *__env, jclass clazz, jlong imagesAddress, jlong headersAddress, jint num_parts, jlong memoryAddress, jlong size, jlong errAddress) {
    EXRImage *images = (EXRImage *)(uintptr_t)imagesAddress;
    EXRHeader const **headers = (EXRHeader const **)(uintptr_t)headersAddress;
    unsigned char const *memory = (unsigned char const *)(uintptr_t)memoryAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LoadEXRMultipartImageFromMemory(images, headers, (unsigned int)num_parts, memory, (size_t)size, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nSaveEXRImageToFile(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong exr_headerAddress, jlong filenameAddress, jlong errAddress) {
    EXRImage const *image = (EXRImage const *)(uintptr_t)imageAddress;
    EXRHeader const *exr_header = (EXRHeader const *)(uintptr_t)exr_headerAddress;
    char const *filename = (char const *)(uintptr_t)filenameAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)SaveEXRImageToFile(image, exr_header, filename, err);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nSaveEXRImageToMemory(JNIEnv *__env, jclass clazz, jlong imageAddress, jlong exr_headerAddress, jlong memoryAddress, jlong errAddress) {
    EXRImage const *image = (EXRImage const *)(uintptr_t)imageAddress;
    EXRHeader const *exr_header = (EXRHeader const *)(uintptr_t)exr_headerAddress;
    unsigned char **memory = (unsigned char **)(uintptr_t)memoryAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)SaveEXRImageToMemory(image, exr_header, memory, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nSaveEXRMultipartImageToFile(JNIEnv *__env, jclass clazz, jlong imagesAddress, jlong exr_headersAddress, jint num_parts, jlong filenameAddress, jlong errAddress) {
    EXRImage const *images = (EXRImage const *)(uintptr_t)imagesAddress;
    EXRHeader const **exr_headers = (EXRHeader const **)(uintptr_t)exr_headersAddress;
    char const *filename = (char const *)(uintptr_t)filenameAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)SaveEXRMultipartImageToFile(images, exr_headers, (unsigned int)num_parts, filename, err);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nSaveEXRMultipartImageToMemory(JNIEnv *__env, jclass clazz, jlong imagesAddress, jlong exr_headersAddress, jint num_parts, jlong memoryAddress, jlong errAddress) {
    EXRImage const *images = (EXRImage const *)(uintptr_t)imagesAddress;
    EXRHeader const **exr_headers = (EXRHeader const **)(uintptr_t)exr_headersAddress;
    unsigned char **memory = (unsigned char **)(uintptr_t)memoryAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)SaveEXRMultipartImageToMemory(images, exr_headers, (unsigned int)num_parts, memory, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_tinyexr_TinyEXR_nLoadDeepEXR(JNIEnv *__env, jclass clazz, jlong out_imageAddress, jlong filenameAddress, jlong errAddress) {
    DeepImage *out_image = (DeepImage *)(uintptr_t)out_imageAddress;
    char const *filename = (char const *)(uintptr_t)filenameAddress;
    char const **err = (char const **)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)LoadDeepEXR(out_image, filename, err);
}

EXTERN_C_EXIT
