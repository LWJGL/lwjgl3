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

#include "msdfgen-config.h"

/*
 * A C-API modeled closely after the msdfgen C++ API
 * to allow C-programs and other language runtimes to
 * use the msdfgen library. Originally written for LWJGL.
 *
 * @since 01/05/2024
 * @author Alexander Hinze
 */

// Common definitions
#define MSDF_API MSDFGEN_PUBLIC
#define MSDF_FALSE 0
#define MSDF_TRUE 1

// Success and error codes
#define MSDF_SUCCESS 0
#define MSDF_ERR_FAILED 1
#define MSDF_ERR_INVALID_ARG 2
#define MSDF_ERR_INVALID_TYPE 3
#define MSDF_ERR_INVALID_SIZE 4
#define MSDF_ERR_INVALID_INDEX 5

// Bitmap types used with msdf_bitmap_alloc
#define MSDF_BITMAP_TYPE_SDF 0
#define MSDF_BITMAP_TYPE_PSDF 1
#define MSDF_BITMAP_TYPE_MSDF 2
#define MSDF_BITMAP_TYPE_MTSDF 3
#define MSDF_BITMAP_TYPE_MAX MSDF_BITMAP_TYPE_MTSDF

// Segment types used with msdf_segment_alloc/msdf_segment_get_type
#define MSDF_SEGMENT_TYPE_LINEAR 0
#define MSDF_SEGMENT_TYPE_QUADRATIC 1
#define MSDF_SEGMENT_TYPE_CUBIC 2
#define MSDF_SEGMENT_TYPE_MAX MSDF_SEGMENT_TYPE_CUBIC

// Segment/edge colors used with msdf_segment_set_color/msdf_segment_get_color
#define MSDF_EDGE_COLOR_BLACK 0
#define MSDF_EDGE_COLOR_RED 1
#define MSDF_EDGE_COLOR_GREEN 2
#define MSDF_EDGE_COLOR_YELLOW 3
#define MSDF_EDGE_COLOR_BLUE 4
#define MSDF_EDGE_COLOR_MAGENTA 5
#define MSDF_EDGE_COLOR_CYAN 6
#define MSDF_EDGE_COLOR_WHITE 7

// Error correction modes for generator config
#define MSDF_ERROR_CORRECTION_MODE_DISABLED 0
#define MSDF_ERROR_CORRECTION_MODE_INDISCRIMINATE 1
#define MSDF_ERROR_CORRECTION_MODE_EDGE_PRIORITY 2
#define MSDF_ERROR_CORRECTION_MODE_EDGE_ONLY 3

// Distance check mode for generator config
#define MSDF_DISTANCE_CHECK_MODE_NONE 0
#define MSDF_DISTANCE_CHECK_MODE_AT_EDGE 1
#define MSDF_DISTANCE_CHECK_MODE_ALWAYS 2

// NOLINTBEGIN
#define MSDF_DEFINE_HANDLE_TYPE(n) \
    typedef struct n* n##_handle;  \
    typedef const struct n* n##_const_handle
// NOLINTEND

// Macros for allocating default MSDF bitmap types
#define MSDF_ALLOC_SDF_BITMAP(w, h) msdf_bitmap_alloc(MSDF_BITMAP_TYPE_SDF, w, h)
#define MSDF_ALLOC_PSDF_BITMAP(w, h) msdf_bitmap_alloc(MSDF_BITMAP_TYPE_PSDF, w, h)
#define MSDF_ALLOC_MSDF_BITMAP(w, h) msdf_bitmap_alloc(MSDF_BITMAP_TYPE_MSDF, w, h)
#define MSDF_ALLOC_MTSDF_BITMAP(w, h) msdf_bitmap_alloc(MSDF_BITMAP_TYPE_MTSDF, w, h)

#ifdef __cplusplus
extern "C" {
#endif

// -------------------- Type definitions

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

// -------------------- Opaque handle types

MSDF_DEFINE_HANDLE_TYPE(msdf_shape);
MSDF_DEFINE_HANDLE_TYPE(msdf_contour);
MSDF_DEFINE_HANDLE_TYPE(msdf_segment);

// -------------------- Exported API functions

// msdf_bitmap

/**
 * Allocates a new MSDF bitmap object to render a shape into using the internal allocator.
 * @param type The type of bitmap to allocate. Can be one of @code MSDF_BITMAP_TYPE_SDF@endcode, @code MSDF_BITMAP_TYPE_PSDF@endcode,
 *  @code MSDF_BITMAP_TYPE_MSDF@endcode or @code MSDF_BITMAP_TYPE_MTSDF@endcode.
 * @param width The width of the bitmap in pixels.
 * @param height The height of the bitmap in pixels.
 * @param bitmap A pointer to an @code msdf_bitmap_t@endcode structure to allocate a new bitmap into.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_bitmap_alloc(int type, int width, int height, msdf_bitmap_t* bitmap);

/**
 * Retrieves the number of color channels used by the given bitmap.
 * @param bitmap A pointer to an @code msdf_bitmap_t@endcode structure to retrieve the channel count from.
 * @param channel_count A pointer to a variable which is populated with the number of color channels used by the given bitmap.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_bitmap_get_channel_count(const msdf_bitmap_t* bitmap, int* channel_count);

/**
 * Retrieves the address of the raw pixel data of the given bitmap.
 * @param bitmap A pointer to an @code msdf_bitmap_t@endcode structure to retrieve the raw pixel data from.
 * @param pixels A pointer to an address which is populated with the raw pixel data of the given bitmap.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_bitmap_get_pixels(const msdf_bitmap_t* bitmap, void** pixels);

/**
 * Retrieves the size of the pixel data of the given bitmap in bytes.
 * @param bitmap A pointer to an @code msdf_bitmap_t@endcode structure to retrieve the size of the raw pixel data from.
 * @param size A pointer to a variable which is populated with the byte size of the raw pixel data of the given bitmap.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_bitmap_get_byte_size(const msdf_bitmap_t* bitmap, size_t* size);

/**
 * Calls the destructor of the given bitmap and frees its memory using the
 * internal allocator.
 * @param bitmap A pointer to an @code msdf_bitmap_t@endcode structure to be freed.
 */
MSDF_API void msdf_bitmap_free(msdf_bitmap_t* bitmap);

// msdf_shape

/**
 * Allocates a new MSDF shape object using the internal allocator.
 * @param shape A pointer to an address which is populated with the address of the newly allocated shape.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_alloc(msdf_shape_handle* shape);

/**
 * Retrieves the bounds of the given shape.
 * @param shape A pointer to a shape object to retrieve the bounds from.
 * @param bounds A pointer to a variable which is populated with the bounds of the given shape.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_get_bounds(msdf_shape_const_handle shape, msdf_bounds_t* bounds);

/**
 * Adds a new contour to the given shape.
 * @param shape A pointer to a shape object to add a new contour to.
 * @param contour A pointer to a contour handle to be populated with a new contour that was added to the shape.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_add_contour(msdf_shape_handle shape, msdf_contour_const_handle* contour);

/**
 * Removes the given contour from the given shape if present.
 * @param shape A pointer to a shape object to remove the given contour from.
 * @param contour A pointer to the contour to remove from the shape.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_remove_contour(msdf_shape_handle shape, msdf_contour_const_handle contour);

/**
 * Retrieves the number of contours allocated within the given shape object.
 * @param shape A pointer to a shape object from which to retrieve the contour count.
 * @param contour_count A pointer to a variable which is populated with the number of contours of the given shape.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_get_contour_count(msdf_shape_const_handle shape, size_t* contour_count);

/**
 * Retrieves a contour at a given index from the given shape.
 * @param shape A pointer to a shape object from which to retrieve a contour.
 * @param index The index of the contour to retrieve.
 * @param contour A pointer to an address which is populated with the address of the contour at the given index if present.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_get_contour(msdf_shape_const_handle shape, size_t index, msdf_contour_const_handle* contour);

/**
 * Retrieves the number of edges of the given shape.
 * @param shape A pointer to a shape from which to retrieve the edge count.
 * @param edge_count A pointer to a variable which is populated with the number of edges defined by the given shape.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_get_edge_count(msdf_shape_const_handle shape, size_t* edge_count);

/**
 * Retrieves the inverse-y-axis flag of the given shape.
 * @param shape A pointer to a shape from which to fetch the inverse-y-axis flag.
 * @param inverse_y_axis A pointer to a variable which is populated with @code MSDF_TRUE@endcode when the
 *  y-axis of the given shape is inverted. Otherwise the variable will be set to @code MSDF_FALSE@endcode.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_has_inverse_y_axis(msdf_shape_const_handle shape, int* inverse_y_axis);

/**
 * Normalizes the given shape.
 * @param shape A pointer to a shape to normalize.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_normalize(msdf_shape_handle shape);

/**
 * Validates the given shape.
 * @param shape A pointer to a shape to validate.
 * @param result A pointer to a variable which is populated with @code MSDF_TRUE@endcode when the
 *  validation was successful. Otherwise the variable will be set to @code MSDF_FALSE@endcode.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_validate(msdf_shape_handle shape, int* result);

/**
 * Adjusts the given bounding box to fit the given shape.
 * @param shape A pointer to a shape to fit into the given bounding box.
 * @param bounds A pointer to a bounding box which should at least fit the given shape.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_bound(msdf_shape_const_handle shape, msdf_bounds_t* bounds);

/**
 * Adjusts the given bounding box to fit the given shape including a mitered border.
 * @param shape A pointer to a shape to fit into the given bounding box.
 * @param bounds A pointer to a bounding box which should at least fit the given shape including the specified border.
 * @param border The size of the border.
 * @param miter_limit The miter limit value.
 * @param polarity The miter polarity.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_bound_miters(msdf_shape_const_handle shape, msdf_bounds_t* bounds, double border, double miter_limit, int polarity);

/**
 * Orients all contours associated with the given shape before rendering.
 * @param shape A pointer to a shape whose contours to orient.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_orient_contours(msdf_shape_handle shape);

/**
 * Colors the edges of the given shape using the default MSDF colors specified by the
 * MSDF_COLOR_ prefixed constants.
 * @param shape A pointer to a shape whose edges to color with the default MSDF colors.
 * @param angle_threshold The threshold angle in degrees.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_edge_colors_simple(msdf_shape_handle shape, double angle_threshold);

/**
 * Colors the edges of the given shape using the default MSDF colors specified by the
 * MSDF_COLOR_ prefixed constants using the ink trap algorithm.
 * @param shape A pointer to a shape whose edges to color with the default MSDF colors.
 * @param angle_threshold The threshold angle in degrees.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_edge_colors_ink_trap(msdf_shape_handle shape, double angle_threshold);

/**
 * Colors the edges of the given shape using the default MSDF colors specified by the
 * MSDF_COLOR_ prefixed constants using the distance.
 * @param shape A pointer to a shape whose edges to color with the default MSDF colors.
 * @param angle_threshold The threshold angle in degrees.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_edge_colors_by_distance(msdf_shape_handle shape, double angle_threshold);

/**
 * Finds the distance between shape and origin.
 * Does not allocate result cache used to optimize performance of multiple queries.
 * @param shape A pointer to the shape to find the distance to.
 * @param origin The point to find the distance relative to the given shape to.
 * @param distance A pointer to a variable to be populated with the calculated distance to the given shape.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_shape_one_shot_distance(msdf_shape_const_handle shape, const msdf_vector2_t* origin, double* distance);

/**
 * Calls the destructor of the given bitmap and frees its memory using the
 * internal allocator.
 * @param shape A pointer to a shape object to be freed.
 */
MSDF_API void msdf_shape_free(msdf_shape_handle shape);

// msdf_contour

/**
 * Allocates a new contour object using the internal allocator.
 * @param contour A pointer to an address which is populated with the address of the newly allocated contour object.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_contour_alloc(msdf_contour_handle* contour);

/**
 * Adds a new edge to the given contour and returns its associated segment handle.
 * @param contour A pointer to the contour to add a new edge (segment) to.
 * @param segment A pointer to the segment to add as an edge. This segment must be heap-allocated
 *  and may not be freed before the contour object that owns it.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_contour_add_edge(msdf_contour_handle contour, msdf_segment_handle segment);

/**
 * Removes the given edge from the given contour if present.
 * @param contour A pointer to the contour to remove the given edge (segment) from.
 * @param segment A pointer to the segment to remove from the given contour.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_contour_remove_edge(msdf_contour_handle contour, msdf_segment_handle segment);

/**
 * Retrieves the edge count of the given contour.
 * @param contour A pointer to the contour to retrieve the edge count from.
 * @param edge_count A pointer to a variable which is populated with the edge count of the given contour.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_contour_get_edge_count(msdf_contour_const_handle contour, size_t* edge_count);

/**
 * Retrieves an edge (segment) from the given contour at the given index.
 * @param contour A pointer to the contour from which to retrieve the given edge segment.
 * @param index The index from which to retrieve the edge segment.
 * @param segment A pointer to an address which is populated with the address of the
 *  edge segment at the given index if present.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_contour_get_edge(msdf_contour_const_handle contour, size_t index, msdf_segment_const_handle* segment);

/**
 * Adjusts the given bounding box to fit at least the given contour.
 * @param contour A pointer to the contour which should at least fit into the given bounding box.
 * @param bounds A pointer to the bounding box to fit the given contour into.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_contour_bound(msdf_contour_const_handle contour, msdf_bounds_t* bounds);

/**
 * Adjust the given bounding box to fit at least the given contour including a specified border.
 * @param contour A pointer to the contour which should at least fit into the given bounding box.
 * @param bounds A pointer to the bounding box to fit the given contour including the specified border.
 * @param border The size of the border.
 * @param miter_limit The miter limit value.
 * @param polarity The miter polarity.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int
    msdf_contour_bound_miters(msdf_contour_const_handle contour, msdf_bounds_t* bounds, double border, double miter_limit, int polarity);

/**
 * Retrieves the winding direction of the given contour.
 * @param contour A pointer to the contour of which to retrieve the winding direction.
 * @param winding A pointer to a variables which is populated with the winding direction of the given contour.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_contour_get_winding(msdf_contour_const_handle contour, int* winding);

/**
 * Reverses the order of edges in the given contour.
 * @param contour A pointer to the contour which to reverse the edge order for.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_contour_reverse(msdf_contour_handle contour);

/**
 * Calls the destructor of the given bitmap and frees its memory using the
 * internal allocator.
 * @param contour A pointer to the contour to free.
 */
MSDF_API void msdf_contour_free(msdf_contour_handle contour);

// msdf_segment

/**
 * Allocates a new segment of the given type and populates the given address
 * with the address of the newly allocated segment.
 * @param type The type of segment to allocate. Can be one of @code MSDF_SEGMENT_TYPE_LINEAR@endcode,
 *  @code MSDF_SEGMENT_TYPE_QUADRATIC@endcode or @code MSDF_SEGMENT_TYPE_CUBIC@endcode.
 * @param segment A pointer to an address which is populated with the address of the newly
 *  allocated segment.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_segment_alloc(int type, msdf_segment_handle* segment);

/**
 * Retrieves the type of the given segment.
 * @param segment A pointer to the segment of which to retrieve the type.
 * @param type A pointer to a variable which is populated with the type of the given segment.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_segment_get_type(msdf_segment_const_handle segment, int* type);

/**
 * Retrieves the point count of the given segment.
 * @param segment A pointer to the segment of which to retrieve the number of points.
 * @param point_count A pointer to a variable which is populated with the number of points of the given segment.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_segment_get_point_count(msdf_segment_const_handle segment, size_t* point_count);

/**
 * Retrieves a point at the given index from the given segment.
 * @param segment A pointer to the segment from which to retrieve a point.
 * @param index The index of the point to retrieve.
 * @param point A pointer to a point which is populated with the coordinates of the point
 *  at the given index if present.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_segment_get_point(msdf_segment_const_handle segment, size_t index, msdf_vector2_t* point);

/**
 * Sets the coordinates of a point at the given index in the given segment.
 * @param segment A pointer to the segment of which to set the point.
 * @param index The index of the point to set.
 * @param point A pointer to a point which is copied to the given index within the segment.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_segment_set_point(msdf_segment_handle segment, size_t index, const msdf_vector2_t* point);

/**
 * Sets the color of the given segment.
 * @param segment A pointer to the segment of which to set the color.
 * @param color The color to set. Can be any @code MSDF_COLOR_@endcode value.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_segment_set_color(msdf_segment_handle segment, int color);

/**
 * Retrieves the color of the given segment.
 * @param segment A pointer to the segment of which to retrieve the color.
 * @param color A pointer to a variable which is populated with the color of the given segment.
 *  Will be one of the constants prefixed with @code MSDF_COLOR_@endcode.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_segment_get_color(msdf_segment_const_handle segment, int* color);

/**
 * Retrieves the direction of the given segment at the given point.
 * @param segment A pointer to the segment of which to retrieve the direction.
 * @param param The point at which to retrieve the segment direction.
 * @param direction A pointer to a variable which is populated with the direction of the given
 *  segment at the given point.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_segment_get_direction(msdf_segment_const_handle segment, double param, msdf_vector2_t* direction);

/**
 * Retrieves the direction change of the given segment at the given point.
 * @param segment A pointer to the segment of which to retrieve the direction change.
 * @param param The point at which to retrieve the segment direction change.
 * @param direction_change A pointer to a variable which is populated with the direction change
 *  of the given segment at the given point.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_segment_get_direction_change(msdf_segment_const_handle segment, double param, msdf_vector2_t* direction_change);

/**
 * Retrieves the point on the given edge segment specified by the given parameter.
 * @param segment A pointer to the segment of which to retrieve the edge point.
 * @param param The point at which to sample.
 * @param point A pointer to a variable which is populated with the edge point
 *  at the given location from the given segment.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_segment_point(msdf_segment_const_handle segment, double param, msdf_vector2_t* point);

/**
 * Adjusts the given bounding box to fit at least the given segment.
 * @param segment A pointer to the segment which should at least fit in the given bounding box.
 * @param bounds A pointer to the bounding box which should at least fit the given segment.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_segment_bound(msdf_segment_const_handle segment, msdf_bounds_t* bounds);

/**
 * Moves the start point of the given segment.
 * @param segment A pointer to the segment of which to adjust the start point.
 * @param point A pointer to the new start point of the given segment.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_segment_move_start_point(msdf_segment_handle segment, const msdf_vector2_t* point);

/**
 * Moves the end point of the given segment.
 * @param segment A pointer to the segment of which to adjust the end point.
 * @param point A pointer to the new end point of the given segment.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_segment_move_end_point(msdf_segment_handle segment, const msdf_vector2_t* point);

/**
 * Calls the destructor of the given segment and frees its memory using the
 * internal allocator.
 * @param segment A pointer to the segment to free.
 */
MSDF_API void msdf_segment_free(msdf_segment_handle segment);

// Error correction functions

MSDF_API int msdf_error_correction(msdf_bitmap_t* bitmap, msdf_shape_const_handle shape, const msdf_transform_t* transform);

MSDF_API int msdf_error_correction_fast_distance(msdf_bitmap_t* bitmap, const msdf_transform_t* transform);

MSDF_API int msdf_error_correction_fast_edge(msdf_bitmap_t* bitmap, const msdf_transform_t* transform);

// msdfgen-core API functions

/**
 * @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
 *  the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_SDF@endcode.
 * @param shape A pointer to the shape to render to the given bitmap.
 * @param transform The transform which is applied to the given shape during rendering.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_generate_sdf(msdf_bitmap_t* output, msdf_shape_const_handle shape, const msdf_transform_t* transform);

/**
 * @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
 *  the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_PSDF@endcode.
 * @param shape A pointer to the shape to render to the given bitmap.
 * @param transform The transform which is applied to the given shape during rendering.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_generate_psdf(msdf_bitmap_t* output, msdf_shape_const_handle shape, const msdf_transform_t* transform);

/**
 * @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
 *  the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_MSDF@endcode.
 * @param shape A pointer to the shape to render to the given bitmap.
 * @param transform The transform which is applied to the given shape during rendering.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_generate_msdf(msdf_bitmap_t* output, msdf_shape_const_handle shape, const msdf_transform_t* transform);

/**
 * @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
 *  the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_MTSDF@endcode.
 * @param shape A pointer to the shape to render to the given bitmap.
 * @param transform The transform which is applied to the given shape during rendering.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_generate_mtsdf(msdf_bitmap_t* output, msdf_shape_const_handle shape, const msdf_transform_t* transform);

/**
 * @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
 *  the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_SDF@endcode.
 * @param shape A pointer to the shape to render to the given bitmap.
 * @param transform The transform which is applied to the given shape during rendering.
 * @param config A pointer to the config which is applied to the sprite generator before rendering.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_generate_sdf_with_config(msdf_bitmap_t* output,
                                           msdf_shape_const_handle shape,
                                           const msdf_transform_t* transform,
                                           const msdf_config_t* config);

/**
 * @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
 *  the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_PSDF@endcode.
 * @param shape A pointer to the shape to render to the given bitmap.
 * @param transform The transform which is applied to the given shape during rendering.
 * @param config A pointer to the config which is applied to the sprite generator before rendering.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_generate_psdf_with_config(msdf_bitmap_t* output,
                                            msdf_shape_const_handle shape,
                                            const msdf_transform_t* transform,
                                            const msdf_config_t* config);

/**
 * @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
 *  the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_MSDF@endcode.
 * @param shape A pointer to the shape to render to the given bitmap.
 * @param transform The transform which is applied to the given shape during rendering.
 * @param config A pointer to the config which is applied to the sprite generator before rendering.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_generate_msdf_with_config(msdf_bitmap_t* output,
                                            msdf_shape_const_handle shape,
                                            const msdf_transform_t* transform,
                                            const msdf_multichannel_config_t* config);

/**
 * @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
 *  the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_MTSDF@endcode.
 * @param shape A pointer to the shape to render to the given bitmap.
 * @param transform The transform which is applied to the given shape during rendering.
 * @param config A pointer to the config which is applied to the sprite generator before rendering.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_generate_mtsdf_with_config(msdf_bitmap_t* output,
                                             msdf_shape_const_handle shape,
                                             const msdf_transform_t* transform,
                                             const msdf_multichannel_config_t* config);


MSDF_API int msdf_render_sdf(msdf_bitmap_t* output, msdf_bitmap_t* sdf);

#ifdef MSDFGEN_EXTENSIONS

#endif

#ifdef __cplusplus
}
#endif