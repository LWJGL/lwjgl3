/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "msdfgen_c.h"

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1allocator_1set(JNIEnv *__env, jclass clazz, jlong allocatorAddress) {
    struct msdf_allocator const *allocator = (struct msdf_allocator const *)(uintptr_t)allocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    msdf_allocator_set(allocator);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1bitmap_1alloc(JNIEnv *__env, jclass clazz, jint type, jint width, jint height, jlong bitmapAddress) {
    struct msdf_bitmap **bitmap = (struct msdf_bitmap **)(uintptr_t)bitmapAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_bitmap_alloc(type, width, height, bitmap);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1bitmap_1get_1channel_1count(JNIEnv *__env, jclass clazz, jlong bitmapAddress, jlong channel_countAddress) {
    struct msdf_bitmap const *bitmap = (struct msdf_bitmap const *)(uintptr_t)bitmapAddress;
    int *channel_count = (int *)(uintptr_t)channel_countAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_bitmap_get_channel_count(bitmap, channel_count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1bitmap_1get_1pixels(JNIEnv *__env, jclass clazz, jlong bitmapAddress, jlong pixelsAddress) {
    struct msdf_bitmap const *bitmap = (struct msdf_bitmap const *)(uintptr_t)bitmapAddress;
    void **pixels = (void **)(uintptr_t)pixelsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_bitmap_get_pixels(bitmap, pixels);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1bitmap_1get_1size(JNIEnv *__env, jclass clazz, jlong bitmapAddress, jlong sizeAddress) {
    struct msdf_bitmap const *bitmap = (struct msdf_bitmap const *)(uintptr_t)bitmapAddress;
    size_t *size = (size_t *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_bitmap_get_size(bitmap, size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1bitmap_1free(JNIEnv *__env, jclass clazz, jlong bitmapAddress) {
    struct msdf_bitmap *bitmap = (struct msdf_bitmap *)(uintptr_t)bitmapAddress;
    UNUSED_PARAMS(__env, clazz)
    msdf_bitmap_free(bitmap);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1alloc(JNIEnv *__env, jclass clazz, jlong shapeAddress) {
    msdf_shape_handle *shape = (msdf_shape_handle *)(uintptr_t)shapeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_alloc(shape);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1get_1bounds(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong boundsAddress) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    struct msdf_bounds *bounds = (struct msdf_bounds *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_get_bounds(shape, bounds);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1add_1contour(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong contourAddress) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    msdf_contour_handle *contour = (msdf_contour_handle *)(uintptr_t)contourAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_add_contour(shape, contour);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1get_1contour_1count(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong sizeAddress) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    size_t *size = (size_t *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_get_contour_count(shape, size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1get_1contour(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong index, jlong contourAddress) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    msdf_contour_handle *contour = (msdf_contour_handle *)(uintptr_t)contourAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_get_contour(shape, (size_t)index, contour);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1get_1edge_1count(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong countAddress) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    size_t *count = (size_t *)(uintptr_t)countAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_get_edge_count(shape, count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1has_1inverse_1y_1axis(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong inverse_y_axisAddress) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    int *inverse_y_axis = (int *)(uintptr_t)inverse_y_axisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_has_inverse_y_axis(shape, inverse_y_axis);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1normalize(JNIEnv *__env, jclass clazz, jlong shapeAddress) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_normalize(shape);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1validate(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong resultAddress) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    int *result = (int *)(uintptr_t)resultAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_validate(shape, result);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1bound(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong boundsAddress) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    struct msdf_bounds *bounds = (struct msdf_bounds *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_bound(shape, bounds);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1bound_1miters(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong boundsAddress, jdouble border, jdouble miter_limit, jint polarity) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    struct msdf_bounds *bounds = (struct msdf_bounds *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_bound_miters(shape, bounds, border, miter_limit, polarity);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1free(JNIEnv *__env, jclass clazz, jlong shapeAddress) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    UNUSED_PARAMS(__env, clazz)
    msdf_shape_free(shape);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1alloc(JNIEnv *__env, jclass clazz, jlong contourAddress) {
    msdf_contour_handle *contour = (msdf_contour_handle *)(uintptr_t)contourAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_alloc(contour);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1add_1edge(JNIEnv *__env, jclass clazz, jlong contourAddress, jlong edgeAddress) {
    msdf_contour_handle contour = (msdf_contour_handle)(uintptr_t)contourAddress;
    msdf_edge_holder_handle *edge = (msdf_edge_holder_handle *)(uintptr_t)edgeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_add_edge(contour, edge);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1get_1edge_1count(JNIEnv *__env, jclass clazz, jlong contourAddress, jlong countAddress) {
    msdf_contour_handle contour = (msdf_contour_handle)(uintptr_t)contourAddress;
    size_t *count = (size_t *)(uintptr_t)countAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_get_edge_count(contour, count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1get_1edge(JNIEnv *__env, jclass clazz, jlong contourAddress, jlong index, jlong edgeAddress) {
    msdf_contour_handle contour = (msdf_contour_handle)(uintptr_t)contourAddress;
    msdf_edge_holder_handle *edge = (msdf_edge_holder_handle *)(uintptr_t)edgeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_get_edge(contour, (size_t)index, edge);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1bound(JNIEnv *__env, jclass clazz, jlong contourAddress, jlong boundsAddress) {
    msdf_contour_handle contour = (msdf_contour_handle)(uintptr_t)contourAddress;
    struct msdf_bounds *bounds = (struct msdf_bounds *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_bound(contour, bounds);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1bound_1miters(JNIEnv *__env, jclass clazz, jlong contourAddress, jlong boundsAddress, jdouble border, jdouble miter_limit, jint polarity) {
    msdf_contour_handle contour = (msdf_contour_handle)(uintptr_t)contourAddress;
    struct msdf_bounds *bounds = (struct msdf_bounds *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_bound_miters(contour, bounds, border, miter_limit, polarity);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1get_1winding(JNIEnv *__env, jclass clazz, jlong contourAddress, jlong windingAddress) {
    msdf_contour_handle contour = (msdf_contour_handle)(uintptr_t)contourAddress;
    int *winding = (int *)(uintptr_t)windingAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_get_winding(contour, winding);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1reverse(JNIEnv *__env, jclass clazz, jlong contourAddress) {
    msdf_contour_handle contour = (msdf_contour_handle)(uintptr_t)contourAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_reverse(contour);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1free(JNIEnv *__env, jclass clazz, jlong contourAddress) {
    msdf_contour_handle contour = (msdf_contour_handle)(uintptr_t)contourAddress;
    UNUSED_PARAMS(__env, clazz)
    msdf_contour_free(contour);
}

EXTERN_C_EXIT
