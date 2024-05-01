/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "msdfgen-c.h"

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1bitmap_1alloc(JNIEnv *__env, jclass clazz, jint type, jint width, jint height, jlong bitmapAddress) {
    struct msdf_bitmap *bitmap = (struct msdf_bitmap *)(uintptr_t)bitmapAddress;
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

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1bitmap_1get_1byte_1size(JNIEnv *__env, jclass clazz, jlong bitmapAddress, jlong sizeAddress) {
    struct msdf_bitmap const *bitmap = (struct msdf_bitmap const *)(uintptr_t)bitmapAddress;
    size_t *size = (size_t *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_bitmap_get_byte_size(bitmap, size);
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
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    struct msdf_bounds *bounds = (struct msdf_bounds *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_get_bounds(shape, bounds);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1add_1contour(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong contourAddress) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    msdf_contour_const_handle *contour = (msdf_contour_const_handle *)(uintptr_t)contourAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_add_contour(shape, contour);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1remove_1contour(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong contourAddress) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    msdf_contour_const_handle contour = (msdf_contour_const_handle)(uintptr_t)contourAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_remove_contour(shape, contour);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1get_1contour_1count(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong sizeAddress) {
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    size_t *size = (size_t *)(uintptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_get_contour_count(shape, size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1get_1contour(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong index, jlong contourAddress) {
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    msdf_contour_const_handle *contour = (msdf_contour_const_handle *)(uintptr_t)contourAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_get_contour(shape, (size_t)index, contour);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1get_1edge_1count(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong countAddress) {
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    size_t *count = (size_t *)(uintptr_t)countAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_get_edge_count(shape, count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1has_1inverse_1y_1axis(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong inverse_y_axisAddress) {
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
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
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    struct msdf_bounds *bounds = (struct msdf_bounds *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_bound(shape, bounds);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1bound_1miters(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong boundsAddress, jdouble border, jdouble miter_limit, jint polarity) {
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    struct msdf_bounds *bounds = (struct msdf_bounds *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_bound_miters(shape, bounds, border, miter_limit, polarity);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1orient_1contours(JNIEnv *__env, jclass clazz, jlong shapeAddress) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_orient_contours(shape);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1edge_1colors_1simple(JNIEnv *__env, jclass clazz, jlong shapeAddress, jdouble angle_threshold) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_edge_colors_simple(shape, angle_threshold);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1edge_1colors_1ink_1trap(JNIEnv *__env, jclass clazz, jlong shapeAddress, jdouble angle_threshold) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_edge_colors_ink_trap(shape, angle_threshold);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1edge_1colors_1by_1distance(JNIEnv *__env, jclass clazz, jlong shapeAddress, jdouble angle_threshold) {
    msdf_shape_handle shape = (msdf_shape_handle)(uintptr_t)shapeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_edge_colors_by_distance(shape, angle_threshold);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1shape_1one_1shot_1distance(JNIEnv *__env, jclass clazz, jlong shapeAddress, jlong originAddress, jlong distanceAddress) {
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    struct msdf_vector2 const *origin = (struct msdf_vector2 const *)(uintptr_t)originAddress;
    double *distance = (double *)(uintptr_t)distanceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_shape_one_shot_distance(shape, origin, distance);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1add_1edge(JNIEnv *__env, jclass clazz, jlong contourAddress, jlong segmentAddress) {
    msdf_contour_handle contour = (msdf_contour_handle)(uintptr_t)contourAddress;
    msdf_segment_handle segment = (msdf_segment_handle)(uintptr_t)segmentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_add_edge(contour, segment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1remove_1edge(JNIEnv *__env, jclass clazz, jlong contourAddress, jlong segmentAddress) {
    msdf_contour_handle contour = (msdf_contour_handle)(uintptr_t)contourAddress;
    msdf_segment_handle segment = (msdf_segment_handle)(uintptr_t)segmentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_remove_edge(contour, segment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1get_1edge_1count(JNIEnv *__env, jclass clazz, jlong contourAddress, jlong countAddress) {
    msdf_contour_const_handle contour = (msdf_contour_const_handle)(uintptr_t)contourAddress;
    size_t *count = (size_t *)(uintptr_t)countAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_get_edge_count(contour, count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1get_1edge(JNIEnv *__env, jclass clazz, jlong contourAddress, jlong index, jlong segmentAddress) {
    msdf_contour_const_handle contour = (msdf_contour_const_handle)(uintptr_t)contourAddress;
    msdf_segment_const_handle *segment = (msdf_segment_const_handle *)(uintptr_t)segmentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_get_edge(contour, (size_t)index, segment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1bound(JNIEnv *__env, jclass clazz, jlong contourAddress, jlong boundsAddress) {
    msdf_contour_const_handle contour = (msdf_contour_const_handle)(uintptr_t)contourAddress;
    struct msdf_bounds *bounds = (struct msdf_bounds *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_bound(contour, bounds);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1bound_1miters(JNIEnv *__env, jclass clazz, jlong contourAddress, jlong boundsAddress, jdouble border, jdouble miter_limit, jint polarity) {
    msdf_contour_const_handle contour = (msdf_contour_const_handle)(uintptr_t)contourAddress;
    struct msdf_bounds *bounds = (struct msdf_bounds *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_contour_bound_miters(contour, bounds, border, miter_limit, polarity);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1contour_1get_1winding(JNIEnv *__env, jclass clazz, jlong contourAddress, jlong windingAddress) {
    msdf_contour_const_handle contour = (msdf_contour_const_handle)(uintptr_t)contourAddress;
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

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1alloc(JNIEnv *__env, jclass clazz, jint type, jlong segmentAddress) {
    msdf_segment_handle *segment = (msdf_segment_handle *)(uintptr_t)segmentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_segment_alloc(type, segment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1get_1type(JNIEnv *__env, jclass clazz, jlong segmentAddress, jlong typeAddress) {
    msdf_segment_const_handle segment = (msdf_segment_const_handle)(uintptr_t)segmentAddress;
    int *type = (int *)(uintptr_t)typeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_segment_get_type(segment, type);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1get_1point_1count(JNIEnv *__env, jclass clazz, jlong segmentAddress, jlong countAddress) {
    msdf_segment_const_handle segment = (msdf_segment_const_handle)(uintptr_t)segmentAddress;
    size_t *count = (size_t *)(uintptr_t)countAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_segment_get_point_count(segment, count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1get_1point(JNIEnv *__env, jclass clazz, jlong segmentAddress, jlong index, jlong pointAddress) {
    msdf_segment_const_handle segment = (msdf_segment_const_handle)(uintptr_t)segmentAddress;
    struct msdf_vector2 *point = (struct msdf_vector2 *)(uintptr_t)pointAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_segment_get_point(segment, (size_t)index, point);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1set_1point(JNIEnv *__env, jclass clazz, jlong segmentAddress, jlong index, jlong pointAddress) {
    msdf_segment_handle segment = (msdf_segment_handle)(uintptr_t)segmentAddress;
    struct msdf_vector2 const *point = (struct msdf_vector2 const *)(uintptr_t)pointAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_segment_set_point(segment, (size_t)index, point);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1get_1color(JNIEnv *__env, jclass clazz, jlong segmentAddress, jlong colorAddress) {
    msdf_segment_const_handle segment = (msdf_segment_const_handle)(uintptr_t)segmentAddress;
    int *color = (int *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_segment_get_color(segment, color);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1set_1color(JNIEnv *__env, jclass clazz, jlong segmentAddress, jint color) {
    msdf_segment_handle segment = (msdf_segment_handle)(uintptr_t)segmentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_segment_set_color(segment, color);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1get_1direction(JNIEnv *__env, jclass clazz, jlong segmentAddress, jdouble param, jlong directionAddress) {
    msdf_segment_const_handle segment = (msdf_segment_const_handle)(uintptr_t)segmentAddress;
    struct msdf_vector2 *direction = (struct msdf_vector2 *)(uintptr_t)directionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_segment_get_direction(segment, param, direction);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1get_1direction_1change(JNIEnv *__env, jclass clazz, jlong segmentAddress, jdouble param, jlong direction_changeAddress) {
    msdf_segment_const_handle segment = (msdf_segment_const_handle)(uintptr_t)segmentAddress;
    struct msdf_vector2 *direction_change = (struct msdf_vector2 *)(uintptr_t)direction_changeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_segment_get_direction_change(segment, param, direction_change);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1point(JNIEnv *__env, jclass clazz, jlong segmentAddress, jdouble param, jlong pointAddress) {
    msdf_segment_const_handle segment = (msdf_segment_const_handle)(uintptr_t)segmentAddress;
    struct msdf_vector2 *point = (struct msdf_vector2 *)(uintptr_t)pointAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_segment_point(segment, param, point);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1bound(JNIEnv *__env, jclass clazz, jlong segmentAddress, jlong boundsAddress) {
    msdf_segment_const_handle segment = (msdf_segment_const_handle)(uintptr_t)segmentAddress;
    struct msdf_bounds *bounds = (struct msdf_bounds *)(uintptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_segment_bound(segment, bounds);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1move_1start_1point(JNIEnv *__env, jclass clazz, jlong segmentAddress, jlong pointAddress) {
    msdf_segment_handle segment = (msdf_segment_handle)(uintptr_t)segmentAddress;
    struct msdf_vector2 const *point = (struct msdf_vector2 const *)(uintptr_t)pointAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_segment_move_start_point(segment, point);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1move_1end_1point(JNIEnv *__env, jclass clazz, jlong segmentAddress, jlong pointAddress) {
    msdf_segment_handle segment = (msdf_segment_handle)(uintptr_t)segmentAddress;
    struct msdf_vector2 const *point = (struct msdf_vector2 const *)(uintptr_t)pointAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_segment_move_end_point(segment, point);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1segment_1free(JNIEnv *__env, jclass clazz, jlong segmentAddress) {
    msdf_segment_handle segment = (msdf_segment_handle)(uintptr_t)segmentAddress;
    UNUSED_PARAMS(__env, clazz)
    msdf_segment_free(segment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1generate_1sdf(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong shapeAddress, jlong transformAddress) {
    struct msdf_bitmap *output = (struct msdf_bitmap *)(uintptr_t)outputAddress;
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    struct msdf_transform const *transform = (struct msdf_transform const *)(uintptr_t)transformAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_generate_sdf(output, shape, transform);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1generate_1psdf(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong shapeAddress, jlong transformAddress) {
    struct msdf_bitmap *output = (struct msdf_bitmap *)(uintptr_t)outputAddress;
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    struct msdf_transform const *transform = (struct msdf_transform const *)(uintptr_t)transformAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_generate_psdf(output, shape, transform);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1generate_1msdf(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong shapeAddress, jlong transformAddress) {
    struct msdf_bitmap *output = (struct msdf_bitmap *)(uintptr_t)outputAddress;
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    struct msdf_transform const *transform = (struct msdf_transform const *)(uintptr_t)transformAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_generate_msdf(output, shape, transform);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1generate_1mtsdf(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong shapeAddress, jlong transformAddress) {
    struct msdf_bitmap *output = (struct msdf_bitmap *)(uintptr_t)outputAddress;
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    struct msdf_transform const *transform = (struct msdf_transform const *)(uintptr_t)transformAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_generate_mtsdf(output, shape, transform);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1generate_1sdf_1with_1config(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong shapeAddress, jlong transformAddress, jlong configAddress) {
    struct msdf_bitmap *output = (struct msdf_bitmap *)(uintptr_t)outputAddress;
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    struct msdf_transform const *transform = (struct msdf_transform const *)(uintptr_t)transformAddress;
    struct msdf_config const *config = (struct msdf_config const *)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_generate_sdf_with_config(output, shape, transform, config);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1generate_1psdf_1with_1config(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong shapeAddress, jlong transformAddress, jlong configAddress) {
    struct msdf_bitmap *output = (struct msdf_bitmap *)(uintptr_t)outputAddress;
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    struct msdf_transform const *transform = (struct msdf_transform const *)(uintptr_t)transformAddress;
    struct msdf_config const *config = (struct msdf_config const *)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_generate_psdf_with_config(output, shape, transform, config);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1generate_1msdf_1with_1config(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong shapeAddress, jlong transformAddress, jlong configAddress) {
    struct msdf_bitmap *output = (struct msdf_bitmap *)(uintptr_t)outputAddress;
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    struct msdf_transform const *transform = (struct msdf_transform const *)(uintptr_t)transformAddress;
    struct msdf_multichannel_config const *config = (struct msdf_multichannel_config const *)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_generate_msdf_with_config(output, shape, transform, config);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_msdfgen_MSDFGen_nmsdf_1generate_1mtsdf_1with_1config(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong shapeAddress, jlong transformAddress, jlong configAddress) {
    struct msdf_bitmap *output = (struct msdf_bitmap *)(uintptr_t)outputAddress;
    msdf_shape_const_handle shape = (msdf_shape_const_handle)(uintptr_t)shapeAddress;
    struct msdf_transform const *transform = (struct msdf_transform const *)(uintptr_t)transformAddress;
    struct msdf_multichannel_config const *config = (struct msdf_multichannel_config const *)(uintptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)msdf_generate_mtsdf_with_config(output, shape, transform, config);
}

EXTERN_C_EXIT
