/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "lwjgl_malloc.h"
#define STBIW_MALLOC(sz)    org_lwjgl_malloc(sz)
#define STBIW_REALLOC(p,sz) org_lwjgl_realloc(p,sz)
#define STBIW_FREE(p)       org_lwjgl_free(p)
#define STBIW_ASSERT(x)
#define STB_IMAGE_WRITE_IMPLEMENTATION
#define STB_IMAGE_WRITE_STATIC
#ifdef LWJGL_WINDOWS
    #define STBIW_WINDOWS_UTF8
    #define STBI_MSC_SECURE_CRT
#endif
#include "stb_image_write.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1png(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jlong dataAddress, jint stride_in_bytes) {
    char const *filename = (char const *)(intptr_t)filenameAddress;
    void const *data = (void const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_write_png(filename, w, h, comp, data, stride_in_bytes);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1png_1compression_1level(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&stbi_write_png_compression_level;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1force_1png_1filter(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&stbi_write_force_png_filter;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1zlib_1compress(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&stbi_zlib_compress;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1bmp(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jlong dataAddress) {
    char const *filename = (char const *)(intptr_t)filenameAddress;
    void const *data = (void const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_write_bmp(filename, w, h, comp, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1tga(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jlong dataAddress) {
    char const *filename = (char const *)(intptr_t)filenameAddress;
    void const *data = (void const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_write_tga(filename, w, h, comp, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1tga_1with_1rle(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)&stbi_write_tga_with_rle;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr__JIIIJ(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jlong dataAddress) {
    char const *filename = (char const *)(intptr_t)filenameAddress;
    float const *data = (float const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_write_hdr(filename, w, h, comp, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1jpg(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jlong dataAddress, jint quality) {
    char const *filename = (char const *)(intptr_t)filenameAddress;
    void const *data = (void const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_write_jpg(filename, w, h, comp, data, quality);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1png_1to_1func(JNIEnv *__env, jclass clazz, jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jlong dataAddress, jint stride_in_bytes) {
    stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
    void *context = (void *)(intptr_t)contextAddress;
    void const *data = (void const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_write_png_to_func(func, context, w, h, comp, data, stride_in_bytes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1bmp_1to_1func(JNIEnv *__env, jclass clazz, jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jlong dataAddress) {
    stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
    void *context = (void *)(intptr_t)contextAddress;
    void const *data = (void const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_write_bmp_to_func(func, context, w, h, comp, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1tga_1to_1func(JNIEnv *__env, jclass clazz, jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jlong dataAddress) {
    stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
    void *context = (void *)(intptr_t)contextAddress;
    void const *data = (void const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_write_tga_to_func(func, context, w, h, comp, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr_1to_1func__JJIIIJ(JNIEnv *__env, jclass clazz, jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jlong dataAddress) {
    stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
    void *context = (void *)(intptr_t)contextAddress;
    float const *data = (float const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_write_hdr_to_func(func, context, w, h, comp, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1jpg_1to_1func(JNIEnv *__env, jclass clazz, jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jlong dataAddress, jint quality) {
    stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
    void *context = (void *)(intptr_t)contextAddress;
    void const *data = (void const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbi_write_jpg_to_func(func, context, w, h, comp, data, quality);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1flip_1vertically_1on_1write(JNIEnv *__env, jclass clazz, jint flip_boolean) {
    UNUSED_PARAMS(__env, clazz)
    stbi_flip_vertically_on_write(flip_boolean);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr__JIII_3F(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint w, jint h, jint comp, jfloatArray dataAddress) {
    char const *filename = (char const *)(intptr_t)filenameAddress;
    jint __result;
    jfloat *data = (*__env)->GetFloatArrayElements(__env, dataAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbi_write_hdr(filename, w, h, comp, (float const *)data);
    (*__env)->ReleaseFloatArrayElements(__env, dataAddress, data, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageWrite_nstbi_1write_1hdr_1to_1func__JJIII_3F(JNIEnv *__env, jclass clazz, jlong funcAddress, jlong contextAddress, jint w, jint h, jint comp, jfloatArray dataAddress) {
    stbi_write_func *func = (stbi_write_func *)(intptr_t)funcAddress;
    void *context = (void *)(intptr_t)contextAddress;
    jint __result;
    jfloat *data = (*__env)->GetFloatArrayElements(__env, dataAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbi_write_hdr_to_func(func, context, w, h, comp, (float const *)data);
    (*__env)->ReleaseFloatArrayElements(__env, dataAddress, data, 0);
    return __result;
}

EXTERN_C_EXIT
