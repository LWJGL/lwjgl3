/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "msdfgen-ext-c.h"

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGenExt_nmsdf_1ft_1set_1load_1callback(JNIEnv *__env, jclass clazz, jlong callbackAddress) {
    void * (*callback) (char const *) = (void * (*) (char const *))(uintptr_t)callbackAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_ft_set_load_callback(callback);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_msdfgen_MSDFGenExt_nmsdf_1ft_1get_1load_1callback(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)msdf_ft_get_load_callback();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGenExt_nmsdf_1ft_1init(JNIEnv *__env, jclass clazz, jlong handleAddress) {
    msdf_ft_handle *handle = (msdf_ft_handle *)(uintptr_t)handleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_ft_init(handle);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGenExt_nmsdf_1ft_1load_1font(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong fileNameAddress, jlong fontAddress) {
    msdf_ft_handle handle = (msdf_ft_handle)(uintptr_t)handleAddress;
    char const *fileName = (char const *)(uintptr_t)fileNameAddress;
    msdf_ft_font_handle *font = (msdf_ft_font_handle *)(uintptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_ft_load_font(handle, fileName, font);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGenExt_nmsdf_1ft_1adopt_1font(JNIEnv *__env, jclass clazz, jlong faceAddress, jlong fontAddress) {
    void *face = (void *)(uintptr_t)faceAddress;
    msdf_ft_font_handle *font = (msdf_ft_font_handle *)(uintptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_ft_adopt_font(face, font);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGenExt_nmsdf_1ft_1load_1font_1data(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong dataAddress, jlong size, jlong fontAddress) {
    msdf_ft_handle handle = (msdf_ft_handle)(uintptr_t)handleAddress;
    void const *data = (void const *)(uintptr_t)dataAddress;
    msdf_ft_font_handle *font = (msdf_ft_font_handle *)(uintptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_ft_load_font_data(handle, data, (size_t)size, font);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGenExt_nmsdf_1ft_1font_1load_1glyph(JNIEnv *__env, jclass clazz, jlong fontAddress, jint cp, jint coordinateScaling, jlong shapeAddress) {
    msdf_ft_font_handle font = (msdf_ft_font_handle)(uintptr_t)fontAddress;
    msdf_shape_handle *shape = (msdf_shape_handle *)(uintptr_t)shapeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_ft_font_load_glyph(font, (unsigned)cp, coordinateScaling, shape);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGenExt_nmsdf_1ft_1font_1load_1glyph_1by_1index(JNIEnv *__env, jclass clazz, jlong fontAddress, jint index, jint coordinateScaling, jlong shapeAddress) {
    msdf_ft_font_handle font = (msdf_ft_font_handle)(uintptr_t)fontAddress;
    msdf_shape_handle *shape = (msdf_shape_handle *)(uintptr_t)shapeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_ft_font_load_glyph_by_index(font, (unsigned)index, coordinateScaling, shape);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGenExt_nmsdf_1ft_1font_1get_1glyph_1index(JNIEnv *__env, jclass clazz, jlong fontAddress, jint cp, jlong indexAddress) {
    msdf_ft_font_handle font = (msdf_ft_font_handle)(uintptr_t)fontAddress;
    unsigned *index = (unsigned *)(uintptr_t)indexAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_ft_font_get_glyph_index(font, (unsigned)cp, index);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGenExt_nmsdf_1ft_1font_1get_1kerning(JNIEnv *__env, jclass clazz, jlong fontAddress, jint cp1, jint cp2, jlong kerningAddress) {
    msdf_ft_font_handle font = (msdf_ft_font_handle)(uintptr_t)fontAddress;
    double *kerning = (double *)(uintptr_t)kerningAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_ft_font_get_kerning(font, (unsigned)cp1, (unsigned)cp2, kerning);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGenExt_nmsdf_1ft_1font_1get_1kerning_1by_1index(JNIEnv *__env, jclass clazz, jlong fontAddress, jint index1, jint index2, jlong kerningAddress) {
    msdf_ft_font_handle font = (msdf_ft_font_handle)(uintptr_t)fontAddress;
    double *kerning = (double *)(uintptr_t)kerningAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_ft_font_get_kerning_by_index(font, (unsigned)index1, (unsigned)index2, kerning);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_msdfgen_MSDFGenExt_nmsdf_1ft_1font_1destroy(JNIEnv *__env, jclass clazz, jlong fontAddress) {
    msdf_ft_font_handle font = (msdf_ft_font_handle)(uintptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    msdf_ft_font_destroy(font);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_msdfgen_MSDFGenExt_nmsdf_1ft_1deinit(JNIEnv *__env, jclass clazz, jlong handleAddress) {
    msdf_ft_handle handle = (msdf_ft_handle)(uintptr_t)handleAddress;
    UNUSED_PARAMS(__env, clazz)
    msdf_ft_deinit(handle);
}

EXTERN_C_EXIT
