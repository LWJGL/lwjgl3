/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "lwjgl_malloc.h"
#define STBIR_MALLOC(size,c) org_lwjgl_malloc(size)
#define STBIR_FREE(ptr,c)    org_lwjgl_free(ptr)
#define STBIR_ASSERT(x)
#define STB_IMAGE_RESIZE_IMPLEMENTATION
#define STB_IMAGE_RESIZE_STATIC
#include "stb_image_resize.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageResize_nstbir_1resize_1uint8(JNIEnv *__env, jclass clazz, jlong input_pixelsAddress, jint input_w, jint input_h, jint input_stride_in_bytes, jlong output_pixelsAddress, jint output_w, jint output_h, jint output_stride_in_bytes, jint num_channels) {
    unsigned char const *input_pixels = (unsigned char const *)(intptr_t)input_pixelsAddress;
    unsigned char *output_pixels = (unsigned char *)(intptr_t)output_pixelsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbir_resize_uint8(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, num_channels);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageResize_nstbir_1resize_1float__JIIIJIIII(JNIEnv *__env, jclass clazz, jlong input_pixelsAddress, jint input_w, jint input_h, jint input_stride_in_bytes, jlong output_pixelsAddress, jint output_w, jint output_h, jint output_stride_in_bytes, jint num_channels) {
    float const *input_pixels = (float const *)(intptr_t)input_pixelsAddress;
    float *output_pixels = (float *)(intptr_t)output_pixelsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbir_resize_float(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, num_channels);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageResize_nstbir_1resize_1uint8_1srgb(JNIEnv *__env, jclass clazz, jlong input_pixelsAddress, jint input_w, jint input_h, jint input_stride_in_bytes, jlong output_pixelsAddress, jint output_w, jint output_h, jint output_stride_in_bytes, jint num_channels, jint alpha_channel, jint flags) {
    unsigned char const *input_pixels = (unsigned char const *)(intptr_t)input_pixelsAddress;
    unsigned char *output_pixels = (unsigned char *)(intptr_t)output_pixelsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbir_resize_uint8_srgb(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageResize_nstbir_1resize_1uint8_1srgb_1edgemode(JNIEnv *__env, jclass clazz, jlong input_pixelsAddress, jint input_w, jint input_h, jint input_stride_in_bytes, jlong output_pixelsAddress, jint output_w, jint output_h, jint output_stride_in_bytes, jint num_channels, jint alpha_channel, jint flags, jint edge_wrap_mode) {
    unsigned char const *input_pixels = (unsigned char const *)(intptr_t)input_pixelsAddress;
    unsigned char *output_pixels = (unsigned char *)(intptr_t)output_pixelsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbir_resize_uint8_srgb_edgemode(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, (stbir_edge)edge_wrap_mode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageResize_nstbir_1resize_1uint8_1generic(JNIEnv *__env, jclass clazz, jlong input_pixelsAddress, jint input_w, jint input_h, jint input_stride_in_bytes, jlong output_pixelsAddress, jint output_w, jint output_h, jint output_stride_in_bytes, jint num_channels, jint alpha_channel, jint flags, jint edge_wrap_mode, jint filter, jint space, jlong alloc_contextAddress) {
    unsigned char const *input_pixels = (unsigned char const *)(intptr_t)input_pixelsAddress;
    unsigned char *output_pixels = (unsigned char *)(intptr_t)output_pixelsAddress;
    void *alloc_context = (void *)(intptr_t)alloc_contextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbir_resize_uint8_generic(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, (stbir_edge)edge_wrap_mode, (stbir_filter)filter, (stbir_colorspace)space, alloc_context);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageResize_nstbir_1resize_1uint16_1generic__JIIIJIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jlong input_pixelsAddress, jint input_w, jint input_h, jint input_stride_in_bytes, jlong output_pixelsAddress, jint output_w, jint output_h, jint output_stride_in_bytes, jint num_channels, jint alpha_channel, jint flags, jint edge_wrap_mode, jint filter, jint space, jlong alloc_contextAddress) {
    stbir_uint16 const *input_pixels = (stbir_uint16 const *)(intptr_t)input_pixelsAddress;
    stbir_uint16 *output_pixels = (stbir_uint16 *)(intptr_t)output_pixelsAddress;
    void *alloc_context = (void *)(intptr_t)alloc_contextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbir_resize_uint16_generic(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, (stbir_edge)edge_wrap_mode, (stbir_filter)filter, (stbir_colorspace)space, alloc_context);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageResize_nstbir_1resize_1float_1generic__JIIIJIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jlong input_pixelsAddress, jint input_w, jint input_h, jint input_stride_in_bytes, jlong output_pixelsAddress, jint output_w, jint output_h, jint output_stride_in_bytes, jint num_channels, jint alpha_channel, jint flags, jint edge_wrap_mode, jint filter, jint space, jlong alloc_contextAddress) {
    float const *input_pixels = (float const *)(intptr_t)input_pixelsAddress;
    float *output_pixels = (float *)(intptr_t)output_pixelsAddress;
    void *alloc_context = (void *)(intptr_t)alloc_contextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbir_resize_float_generic(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, (stbir_edge)edge_wrap_mode, (stbir_filter)filter, (stbir_colorspace)space, alloc_context);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageResize_nstbir_1resize(JNIEnv *__env, jclass clazz, jlong input_pixelsAddress, jint input_w, jint input_h, jint input_stride_in_bytes, jlong output_pixelsAddress, jint output_w, jint output_h, jint output_stride_in_bytes, jint datatype, jint num_channels, jint alpha_channel, jint flags, jint edge_mode_horizontal, jint edge_mode_vertical, jint filter_horizontal, jint filter_vertical, jint space, jlong alloc_contextAddress) {
    void const *input_pixels = (void const *)(intptr_t)input_pixelsAddress;
    void *output_pixels = (void *)(intptr_t)output_pixelsAddress;
    void *alloc_context = (void *)(intptr_t)alloc_contextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbir_resize(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, (stbir_datatype)datatype, num_channels, alpha_channel, flags, (stbir_edge)edge_mode_horizontal, (stbir_edge)edge_mode_vertical, (stbir_filter)filter_horizontal, (stbir_filter)filter_vertical, (stbir_colorspace)space, alloc_context);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageResize_nstbir_1resize_1subpixel(JNIEnv *__env, jclass clazz, jlong input_pixelsAddress, jint input_w, jint input_h, jint input_stride_in_bytes, jlong output_pixelsAddress, jint output_w, jint output_h, jint output_stride_in_bytes, jint datatype, jint num_channels, jint alpha_channel, jint flags, jint edge_mode_horizontal, jint edge_mode_vertical, jint filter_horizontal, jint filter_vertical, jint space, jlong alloc_contextAddress, jfloat x_scale, jfloat y_scale, jfloat x_offset, jfloat y_offset) {
    void const *input_pixels = (void const *)(intptr_t)input_pixelsAddress;
    void *output_pixels = (void *)(intptr_t)output_pixelsAddress;
    void *alloc_context = (void *)(intptr_t)alloc_contextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbir_resize_subpixel(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, (stbir_datatype)datatype, num_channels, alpha_channel, flags, (stbir_edge)edge_mode_horizontal, (stbir_edge)edge_mode_vertical, (stbir_filter)filter_horizontal, (stbir_filter)filter_vertical, (stbir_colorspace)space, alloc_context, x_scale, y_scale, x_offset, y_offset);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageResize_nstbir_1resize_1region(JNIEnv *__env, jclass clazz, jlong input_pixelsAddress, jint input_w, jint input_h, jint input_stride_in_bytes, jlong output_pixelsAddress, jint output_w, jint output_h, jint output_stride_in_bytes, jint datatype, jint num_channels, jint alpha_channel, jint flags, jint edge_mode_horizontal, jint edge_mode_vertical, jint filter_horizontal, jint filter_vertical, jint space, jlong alloc_contextAddress, jfloat s0, jfloat t0, jfloat s1, jfloat t1) {
    void const *input_pixels = (void const *)(intptr_t)input_pixelsAddress;
    void *output_pixels = (void *)(intptr_t)output_pixelsAddress;
    void *alloc_context = (void *)(intptr_t)alloc_contextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbir_resize_region(input_pixels, input_w, input_h, input_stride_in_bytes, output_pixels, output_w, output_h, output_stride_in_bytes, (stbir_datatype)datatype, num_channels, alpha_channel, flags, (stbir_edge)edge_mode_horizontal, (stbir_edge)edge_mode_vertical, (stbir_filter)filter_horizontal, (stbir_filter)filter_vertical, (stbir_colorspace)space, alloc_context, s0, t0, s1, t1);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageResize_nstbir_1resize_1float___3FIII_3FIIII(JNIEnv *__env, jclass clazz, jfloatArray input_pixelsAddress, jint input_w, jint input_h, jint input_stride_in_bytes, jfloatArray output_pixelsAddress, jint output_w, jint output_h, jint output_stride_in_bytes, jint num_channels) {
    jint __result;
    jfloat *input_pixels = (*__env)->GetFloatArrayElements(__env, input_pixelsAddress, NULL);
    jfloat *output_pixels = (*__env)->GetFloatArrayElements(__env, output_pixelsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbir_resize_float((float const *)input_pixels, input_w, input_h, input_stride_in_bytes, (float *)output_pixels, output_w, output_h, output_stride_in_bytes, num_channels);
    (*__env)->ReleaseFloatArrayElements(__env, output_pixelsAddress, output_pixels, 0);
    (*__env)->ReleaseFloatArrayElements(__env, input_pixelsAddress, input_pixels, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageResize_nstbir_1resize_1uint16_1generic___3SIII_3SIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jshortArray input_pixelsAddress, jint input_w, jint input_h, jint input_stride_in_bytes, jshortArray output_pixelsAddress, jint output_w, jint output_h, jint output_stride_in_bytes, jint num_channels, jint alpha_channel, jint flags, jint edge_wrap_mode, jint filter, jint space, jlong alloc_contextAddress) {
    void *alloc_context = (void *)(intptr_t)alloc_contextAddress;
    jint __result;
    jshort *input_pixels = (*__env)->GetShortArrayElements(__env, input_pixelsAddress, NULL);
    jshort *output_pixels = (*__env)->GetShortArrayElements(__env, output_pixelsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbir_resize_uint16_generic((stbir_uint16 const *)input_pixels, input_w, input_h, input_stride_in_bytes, (stbir_uint16 *)output_pixels, output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, (stbir_edge)edge_wrap_mode, (stbir_filter)filter, (stbir_colorspace)space, alloc_context);
    (*__env)->ReleaseShortArrayElements(__env, output_pixelsAddress, output_pixels, 0);
    (*__env)->ReleaseShortArrayElements(__env, input_pixelsAddress, input_pixels, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBImageResize_nstbir_1resize_1float_1generic___3FIII_3FIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jfloatArray input_pixelsAddress, jint input_w, jint input_h, jint input_stride_in_bytes, jfloatArray output_pixelsAddress, jint output_w, jint output_h, jint output_stride_in_bytes, jint num_channels, jint alpha_channel, jint flags, jint edge_wrap_mode, jint filter, jint space, jlong alloc_contextAddress) {
    void *alloc_context = (void *)(intptr_t)alloc_contextAddress;
    jint __result;
    jfloat *input_pixels = (*__env)->GetFloatArrayElements(__env, input_pixelsAddress, NULL);
    jfloat *output_pixels = (*__env)->GetFloatArrayElements(__env, output_pixelsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbir_resize_float_generic((float const *)input_pixels, input_w, input_h, input_stride_in_bytes, (float *)output_pixels, output_w, output_h, output_stride_in_bytes, num_channels, alpha_channel, flags, (stbir_edge)edge_wrap_mode, (stbir_filter)filter, (stbir_colorspace)space, alloc_context);
    (*__env)->ReleaseFloatArrayElements(__env, output_pixelsAddress, output_pixels, 0);
    (*__env)->ReleaseFloatArrayElements(__env, input_pixelsAddress, input_pixels, 0);
    return __result;
}

EXTERN_C_EXIT
