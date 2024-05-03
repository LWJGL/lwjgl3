#pragma once

/*
 * MULTI-CHANNEL SIGNED DISTANCE FIELD GENERATOR
 * ---------------------------------------------
 * A utility by Viktor Chlumsky, (c) 2014 - 2024
 *
 * The technique used to generate multi-channel distance fields in this code
 * has been developed by Viktor Chlumsky in 2014 for his master's thesis,
 * "Shape Decomposition for Multi-Channel Distance Fields". It provides improved
 * quality of sharp corners in glyphs and other 2D shapes compared to monochrome
 * distance fields. To reconstruct an image of the shape, apply the median of three
 * operation on the triplet of sampled signed distance values.
 */

#include <stddef.h>// For size_t

/*
 * A C-API modeled closely after the msdfgen C++ API
 * to allow C-programs and other language runtimes to
 * use the msdfgen library. Originally written for LWJGL.
 *
 * @since 01/05/2024
 * @author Alexander Hinze
 */

#define MSDF_API MSDFGEN_PUBLIC

#define MSDF_FALSE 0
#define MSDF_TRUE 1

#define MSDF_SUCCESS 0
#define MSDF_ERR_FAILED 1
#define MSDF_ERR_INVALID_ARG 2
#define MSDF_ERR_INVALID_TYPE 3
#define MSDF_ERR_INVALID_SIZE 4
#define MSDF_ERR_INVALID_INDEX 5

#define MSDF_BITMAP_TYPE_SDF 0
#define MSDF_BITMAP_TYPE_PSDF 1
#define MSDF_BITMAP_TYPE_MSDF 2
#define MSDF_BITMAP_TYPE_MTSDF 3
#define MSDF_BITMAP_TYPE_MAX MSDF_BITMAP_TYPE_MTSDF

#define MSDF_SEGMENT_TYPE_LINEAR 0
#define MSDF_SEGMENT_TYPE_QUADRATIC 1
#define MSDF_SEGMENT_TYPE_CUBIC 2
#define MSDF_SEGMENT_TYPE_MAX MSDF_SEGMENT_TYPE_CUBIC

#define MSDF_EDGE_COLOR_BLACK 0
#define MSDF_EDGE_COLOR_RED 1
#define MSDF_EDGE_COLOR_GREEN 2
#define MSDF_EDGE_COLOR_YELLOW 3
#define MSDF_EDGE_COLOR_BLUE 4
#define MSDF_EDGE_COLOR_MAGENTA 5
#define MSDF_EDGE_COLOR_CYAN 6
#define MSDF_EDGE_COLOR_WHITE 7

#define MSDF_DEFINE_HANDLE_TYPE(n) typedef struct n* n##_handle// NOLINT

// Macros for allocating default MSDF bitmap types
#define MSDF_ALLOC_SDF_BITMAP(w, h) msdf_bitmap_alloc(MSDF_BITMAP_TYPE_SDF, w, h)
#define MSDF_ALLOC_PSDF_BITMAP(w, h) msdf_bitmap_alloc(MSDF_BITMAP_TYPE_PSDF, w, h)
#define MSDF_ALLOC_MSDF_BITMAP(w, h) msdf_bitmap_alloc(MSDF_BITMAP_TYPE_MSDF, w, h)
#define MSDF_ALLOC_MTSDF_BITMAP(w, h) msdf_bitmap_alloc(MSDF_BITMAP_TYPE_MTSDF, w, h)

#ifdef __cplusplus
extern "C" {
#endif

// Type definitions
typedef void* (*msdf_allocator_alloc_callback_t)(size_t size);
typedef void* (*msdf_allocator_realloc_callback_t)(void* memory, size_t size);
typedef void (*msdf_allocator_free_callback_t)(void* memory);

typedef struct msdf_allocator {
    msdf_allocator_alloc_callback_t alloc_callback;
    msdf_allocator_realloc_callback_t realloc_callback;
    msdf_allocator_free_callback_t free_callback;
} msdf_allocator_t;

typedef struct msdf_vector2 {
    double x;
    double y;
} msdf_vector2_t;

typedef struct msdf_range {
    double lower;
    double upper;
} msdf_range_t;

typedef struct msdf_bounds {
    double l;
    double b;
    double r;
    double t;
} msdf_bounds_t;

typedef struct msdf_transform {
    msdf_vector2_t scale;
    msdf_vector2_t translation;
    msdf_range_t distance_mapping;
} msdf_transform_t;

typedef struct msdf_config {
    int overlap_support;
} msdf_config_t;

typedef struct msdf_multichannel_config {
    int overlap_support;
    int mode;
    int distance_check_mode;
    double min_deviation_ratio;
    double min_improve_ratio;
} msdf_multichannel_config_t;

typedef struct msdf_bitmap {
    int type;
    int width;
    int height;
    void* handle;
} msdf_bitmap_t;

typedef struct msdf_segment {
    int type;
    void* handle;
} msdf_segment_t;

// Opaque handle types
MSDF_DEFINE_HANDLE_TYPE(msdf_shape);
MSDF_DEFINE_HANDLE_TYPE(msdf_contour);
MSDF_DEFINE_HANDLE_TYPE(msdf_edge_holder);

// Exported API functions
MSDF_API void msdf_allocator_set(const msdf_allocator_t* allocator);
MSDF_API const msdf_allocator_t* msdf_allocator_get();

MSDF_API int msdf_bitmap_alloc(int type, int width, int height, msdf_bitmap_t** bitmap);
MSDF_API int msdf_bitmap_get_channel_count(const msdf_bitmap_t* bitmap, int* channel_count);
MSDF_API int msdf_bitmap_get_pixels(const msdf_bitmap_t* bitmap, void** pixels);
MSDF_API int msdf_bitmap_get_size(const msdf_bitmap_t* bitmap, size_t* size);
MSDF_API void msdf_bitmap_free(msdf_bitmap_t* bitmap);

MSDF_API int msdf_shape_alloc(msdf_shape_handle* shape);
MSDF_API int msdf_shape_get_bounds(msdf_shape_handle shape, msdf_bounds_t* bounds);
MSDF_API int msdf_shape_add_contour(msdf_shape_handle shape, msdf_contour_handle* contour);
MSDF_API int msdf_shape_get_contour_count(msdf_shape_handle shape, size_t* contour_count);
MSDF_API int msdf_shape_get_contour(msdf_shape_handle shape, size_t index, msdf_contour_handle* contours);
MSDF_API int msdf_shape_get_edge_count(msdf_shape_handle shape, size_t* edge_count);
MSDF_API int msdf_shape_has_inverse_y_axis(msdf_shape_handle shape, int* inverse_y_axis);
MSDF_API int msdf_shape_normalize(msdf_shape_handle shape);
MSDF_API int msdf_shape_validate(msdf_shape_handle shape, int* result);
MSDF_API int msdf_shape_bound(msdf_shape_handle shape, msdf_bounds_t* bounds);
MSDF_API int msdf_shape_bound_miters(msdf_shape_handle shape, msdf_bounds_t* bounds, double border, double miter_limit, int polarity);
MSDF_API void msdf_shape_free(msdf_shape_handle shape);

MSDF_API int msdf_contour_alloc(msdf_contour_handle* contour);
MSDF_API int msdf_contour_add_edge(msdf_contour_handle contour, msdf_edge_holder_handle* edge);
MSDF_API int msdf_contour_get_edge_count(msdf_contour_handle contour, size_t* edge_count);
MSDF_API int msdf_contour_get_edge(msdf_contour_handle contour, size_t index, msdf_edge_holder_handle* edge);
MSDF_API int msdf_contour_bound(msdf_contour_handle contour, msdf_bounds_t* bounds);
MSDF_API int msdf_contour_bound_miters(msdf_contour_handle contour, msdf_bounds_t* bounds, double border, double miter_limit, int polarity);
MSDF_API int msdf_contour_get_winding(msdf_contour_handle contour, int* winding);
MSDF_API int msdf_contour_reverse(msdf_contour_handle contour);
MSDF_API void msdf_contour_free(msdf_contour_handle contour);

MSDF_API int msdf_edge_alloc(msdf_segment_t* segment, msdf_edge_holder_handle* edge);
MSDF_API void msdf_edge_free(msdf_edge_holder_handle edge);

MSDF_API int msdf_segment_alloc(int type, msdf_segment_t** segment);
MSDF_API int msdf_segment_get_point_count(msdf_segment_t* segment, size_t* point_count);
MSDF_API int msdf_segment_get_point(msdf_segment_t* segment, size_t index, msdf_vector2_t* point);
MSDF_API int msdf_segment_set_point(msdf_segment_t* segment, size_t index, const msdf_vector2_t* point);
MSDF_API int msdf_segment_set_color(msdf_segment_t* segment, int color);
MSDF_API int msdf_segment_get_color(msdf_segment_t* segment, int* color);
MSDF_API int msdf_segment_get_direction(msdf_segment_t* segment, double param, msdf_vector2_t* direction);
MSDF_API int msdf_segment_get_direction_change(msdf_segment_t* segment, double param, msdf_vector2_t* direction_change);
MSDF_API int msdf_segment_point(msdf_segment_t* segment, double param, msdf_vector2_t* point);
MSDF_API int msdf_segment_bound(msdf_segment_t* segment, msdf_bounds_t* bounds);
MSDF_API int msdf_segment_move_start_point(msdf_segment_t* segment, const msdf_vector2_t* point);
MSDF_API int msdf_segment_move_end_point(msdf_segment_t* segment, const msdf_vector2_t* point);
MSDF_API void msdf_segment_free(msdf_segment_t* segment);

MSDF_API int msdf_generate_sdf(msdf_bitmap_t* output, msdf_shape_handle shape, const msdf_transform_t* transform);
MSDF_API int msdf_generate_psdf(msdf_bitmap_t* output, msdf_shape_handle shape, const msdf_transform_t* transform);
MSDF_API int msdf_generate_msdf(msdf_bitmap_t* output, msdf_shape_handle shape, const msdf_transform_t* transform);
MSDF_API int msdf_generate_mtsdf(msdf_bitmap_t* output, msdf_shape_handle shape, const msdf_transform_t* transform);

MSDF_API int msdf_generate_sdf_with_config(msdf_bitmap_t* output,
                                           msdf_shape_handle shape,
                                           const msdf_transform_t* transform,
                                           const msdf_config_t* config);
MSDF_API int msdf_generate_psdf_with_config(msdf_bitmap_t* output,
                                            msdf_shape_handle shape,
                                            const msdf_transform_t* transform,
                                            const msdf_config_t* config);
MSDF_API int msdf_generate_msdf_with_config(msdf_bitmap_t* output,
                                            msdf_shape_handle shape,
                                            const msdf_transform_t* transform,
                                            const msdf_multichannel_config_t* config);
MSDF_API int msdf_generate_mtsdf_with_config(msdf_bitmap_t* output,
                                             msdf_shape_handle shape,
                                             const msdf_transform_t* transform,
                                             const msdf_multichannel_config_t* config);

#ifdef __cplusplus
}
#endif