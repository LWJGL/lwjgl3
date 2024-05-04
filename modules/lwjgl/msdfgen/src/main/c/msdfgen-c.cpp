/*
 * MULTI-CHANNEL SIGNED DISTANCE FIELD GENERATOR
 * ---------------------------------------------
 * A utility by Viktor Chlumsky, (c) 2014 - 2024
 *
 * The technique used to generate multi-channel distance fields in this code
 * has been developed by Viktor Chlumsky in 2014 for his master's thesis,
 * "Shape Decomposition for Multi-Channel Distance Fields". It provides improved
 * quality of sharp corners in glyphs and other 2D shapes compared to monochrome
 * distance fields. To reconstruct an image of the shape, apply the median of
 * three operation on the triplet of sampled signed distance values.
 *
 */

#include "msdfgen-c.h"
#include "msdfgen.h"

#include <utility>

/*
 * A C-API implementation modeled closely after the msdfgen C++ API
 * to allow C-programs and other language runtimes to
 * use the msdfgen library. Originally written for LWJGL.
 *
 * @since 01/05/2024
 * @author Alexander Hinze
 */

namespace {
    static_assert(sizeof(msdfgen::Point2) == sizeof(msdfgen::Vector2));
    static_assert(sizeof(msdfgen::Vector2) == sizeof(msdf_vector2_t));
    static_assert(sizeof(msdfgen::Range) == sizeof(msdfgen::Point2));

    using SDFBitmap = msdfgen::Bitmap<float>;
    using SDFBitmapRef = msdfgen::BitmapRef<float>;
    using PSDFBitmap = msdfgen::Bitmap<float>;
    using PSDFBitmapRef = msdfgen::BitmapRef<float>;
    using MSDFBitmap = msdfgen::Bitmap<float, 3>;
    using MSDFBitmapRef = msdfgen::BitmapRef<float, 3>;
    using MTSDFBitmap = msdfgen::Bitmap<float, 4>;
    using MTSDFBitmapRef = msdfgen::BitmapRef<float, 4>;

    msdf_allocator_t g_allocator = {malloc, realloc, free};

    template<typename T>
    [[nodiscard]] auto msdf_alloc(const size_t count = 1) noexcept -> T* {
        return static_cast<T*>(g_allocator.alloc_callback(sizeof(T) * count));
    }

    auto msdf_free(void* memory) {
        g_allocator.free_callback(memory);
    }

    template<typename T, typename... TArgs>
    [[nodiscard]] auto msdf_new(TArgs&&... args) noexcept -> T* {
        auto* memory = static_cast<T*>(g_allocator.alloc_callback(sizeof(T)));
        new(memory) T(std::forward<TArgs>(args)...);
        return memory;
    }

    template<typename T>
    auto msdf_delete(T* memory) noexcept -> void {
        if(memory == nullptr) {
            return;
        }
        memory->~T();
        g_allocator.free_callback(memory);
    }
}// namespace

extern "C" {

// msdf_allocator

MSDF_API void msdf_allocator_set(const msdf_allocator_t* allocator) {
    g_allocator = *allocator;
}

MSDF_API const msdf_allocator_t* msdf_allocator_get() {
    return &g_allocator;
}

// msdf_bitmap

MSDF_API int msdf_bitmap_alloc(const int type, const int width, const int height, msdf_bitmap_t* bitmap) {
    if(width < 0 || height < 0) {
        return MSDF_ERR_INVALID_SIZE;
    }
    if(bitmap == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    bitmap->type = type;
    bitmap->width = width;
    bitmap->height = height;
    switch(type) {
        case MSDF_BITMAP_TYPE_SDF:
            bitmap->handle = msdf_new<SDFBitmap>(width, height);
            break;
        case MSDF_BITMAP_TYPE_PSDF:
            bitmap->handle = msdf_new<PSDFBitmap>(width, height);
            break;
        case MSDF_BITMAP_TYPE_MSDF:
            bitmap->handle = msdf_new<MSDFBitmap>(width, height);
            break;
        case MSDF_BITMAP_TYPE_MTSDF:
            bitmap->handle = msdf_new<MTSDFBitmap>(width, height);
            break;
        default:
            return MSDF_ERR_INVALID_ARG;
    }
    return MSDF_SUCCESS;
}

MSDF_API int msdf_bitmap_get_channel_count(const msdf_bitmap_t* bitmap, int* channel_count) {
    if(bitmap == nullptr || channel_count == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    switch(bitmap->type) {
        case MSDF_BITMAP_TYPE_MSDF:
            *channel_count = 3;
            break;
        case MSDF_BITMAP_TYPE_MTSDF:
            *channel_count = 4;
            break;
        default:
            *channel_count = 1;
            break;
    }
    return MSDF_SUCCESS;
}

MSDF_API int msdf_bitmap_get_byte_size(const msdf_bitmap_t* bitmap, size_t* size) {
    if(bitmap == nullptr || size == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    int channel_count;
    if(msdf_bitmap_get_channel_count(bitmap, &channel_count) != MSDF_SUCCESS) {
        return MSDF_ERR_FAILED;
    }
    // << 2 because we only support floats right now, sizeof(float) is always 4
    *size = static_cast<size_t>(bitmap->width) * static_cast<size_t>(bitmap->height) * static_cast<size_t>(channel_count) << 2;
    return MSDF_SUCCESS;
}

MSDF_API int msdf_bitmap_get_pixels(const msdf_bitmap_t* bitmap, void** pixels) {
    if(bitmap == nullptr || pixels == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    switch(bitmap->type) {
        case MSDF_BITMAP_TYPE_SDF:
            *pixels = static_cast<SDFBitmapRef>(*static_cast<SDFBitmap*>(bitmap->handle)).pixels;
            break;
        case MSDF_BITMAP_TYPE_PSDF:
            *pixels = static_cast<PSDFBitmapRef>(*static_cast<PSDFBitmap*>(bitmap->handle)).pixels;
            break;
        case MSDF_BITMAP_TYPE_MSDF:
            *pixels = static_cast<MSDFBitmapRef>(*static_cast<MSDFBitmap*>(bitmap->handle)).pixels;
            break;
        case MSDF_BITMAP_TYPE_MTSDF:
            *pixels = static_cast<MTSDFBitmapRef>(*static_cast<MTSDFBitmap*>(bitmap->handle)).pixels;
            break;
        default:
            return MSDF_ERR_INVALID_TYPE;
    }
    return MSDF_SUCCESS;
}

MSDF_API void msdf_bitmap_free(msdf_bitmap_t* bitmap) {
    if(bitmap == nullptr) {
        return;
    }
    switch(bitmap->type) {
        case MSDF_BITMAP_TYPE_SDF:
            msdf_delete(static_cast<SDFBitmap*>(bitmap->handle));
            break;
        case MSDF_BITMAP_TYPE_PSDF:
            msdf_delete(static_cast<PSDFBitmap*>(bitmap->handle));
            break;
        case MSDF_BITMAP_TYPE_MSDF:
            msdf_delete(static_cast<MSDFBitmap*>(bitmap->handle));
            break;
        case MSDF_BITMAP_TYPE_MTSDF:
            msdf_delete(static_cast<MTSDFBitmap*>(bitmap->handle));
            break;
        default:
            return;
    }
}

// msdf_shape

MSDF_API int msdf_shape_alloc(msdf_shape_handle* shape) {
    if(shape == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *shape = reinterpret_cast<msdf_shape_handle>(msdf_new<msdfgen::Shape>());
    return MSDF_SUCCESS;
}

MSDF_API int msdf_shape_get_bounds(msdf_shape_const_handle shape, msdf_bounds_t* bounds) {
    if(shape == nullptr || bounds == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *reinterpret_cast<msdfgen::Shape::Bounds*>(bounds) = reinterpret_cast<const msdfgen::Shape*>(shape)->getBounds();
    return MSDF_SUCCESS;
}

MSDF_API int msdf_shape_add_contour(msdf_shape_handle shape, msdf_contour_handle* contour) {
    if(shape == nullptr || contour == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *contour = reinterpret_cast<msdf_contour_handle>(&reinterpret_cast<msdfgen::Shape*>(shape)->addContour());
    return MSDF_SUCCESS;
}

MSDF_API int msdf_shape_get_contour_count(msdf_shape_const_handle shape, size_t* contour_count) {
    if(shape == nullptr || contour_count == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *contour_count = reinterpret_cast<const msdfgen::Shape*>(shape)->contours.size();
    return MSDF_SUCCESS;
}

MSDF_API int msdf_shape_get_contour(msdf_shape_const_handle shape, const size_t index, msdf_contour_const_handle* contour) {
    if(shape == nullptr || contour == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *contour = reinterpret_cast<msdf_contour_const_handle>(&reinterpret_cast<const msdfgen::Shape*>(shape)->contours[index]);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_shape_get_edge_count(msdf_shape_const_handle shape, size_t* edge_count) {
    if(shape == nullptr || edge_count == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *edge_count = reinterpret_cast<const msdfgen::Shape*>(shape)->edgeCount();
    return MSDF_SUCCESS;
}

MSDF_API int msdf_shape_has_inverse_y_axis(msdf_shape_const_handle shape, int* inverse_y_axis) {
    if(shape == nullptr || inverse_y_axis == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *inverse_y_axis = reinterpret_cast<const msdfgen::Shape*>(shape)->inverseYAxis ? MSDF_TRUE : MSDF_FALSE;
    return MSDF_SUCCESS;
}

MSDF_API int msdf_shape_normalize(msdf_shape_handle shape) {
    if(shape == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    reinterpret_cast<msdfgen::Shape*>(shape)->normalize();
    return MSDF_SUCCESS;
}

MSDF_API int msdf_shape_validate(msdf_shape_handle shape, int* result) {
    if(shape == nullptr || result == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *result = reinterpret_cast<msdfgen::Shape*>(shape)->validate();
    return MSDF_SUCCESS;
}

MSDF_API int msdf_shape_bound(msdf_shape_const_handle shape, msdf_bounds_t* bounds) {
    if(shape == nullptr || bounds == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    reinterpret_cast<const msdfgen::Shape*>(shape)->bound(bounds->l, bounds->b, bounds->r, bounds->t);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_shape_bound_miters(msdf_shape_const_handle shape,
                                     msdf_bounds_t* bounds,
                                     const double border,
                                     const double miter_limit,
                                     const int polarity) {
    if(shape == nullptr || bounds == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    reinterpret_cast<const msdfgen::Shape*>(shape)->boundMiters(bounds->l, bounds->b, bounds->r, bounds->t, border, miter_limit, polarity);
    return MSDF_SUCCESS;
}

MSDF_API void msdf_shape_free(msdf_shape_handle shape) {
    msdf_delete(reinterpret_cast<msdfgen::Shape*>(shape));
}

// msdf_contour

MSDF_API int msdf_contour_alloc(msdf_contour_handle* contour) {
    if(contour == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *contour = reinterpret_cast<msdf_contour_handle>(msdf_new<msdfgen::Contour>());
    return MSDF_SUCCESS;
}

MSDF_API int msdf_contour_add_edge(msdf_contour_handle contour, msdf_segment_handle* segment) {
    if(contour == nullptr || segment == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    msdfgen::EdgeSegment* p_segment = reinterpret_cast<msdfgen::Contour*>(contour)->addEdge();
    *segment = reinterpret_cast<msdf_segment_handle>(p_segment);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_contour_get_edge_count(msdf_contour_const_handle contour, size_t* edge_count) {
    if(contour == nullptr || edge_count == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *edge_count = reinterpret_cast<const msdfgen::Contour*>(contour)->edges.size();
    return MSDF_SUCCESS;
}

MSDF_API int msdf_contour_get_edge(msdf_contour_const_handle contour, const size_t index, msdf_segment_const_handle* segment) {
    if(contour == nullptr || segment == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    const msdfgen::EdgeSegment* p_segment = reinterpret_cast<const msdfgen::Contour*>(contour)->edges[index];
    *segment = reinterpret_cast<msdf_segment_const_handle>(p_segment);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_contour_bound(msdf_contour_const_handle contour, msdf_bounds_t* bounds) {
    if(contour == nullptr || bounds == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    reinterpret_cast<const msdfgen::Contour*>(contour)->bound(bounds->l, bounds->b, bounds->r, bounds->t);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_contour_bound_miters(msdf_contour_const_handle contour,
                                       msdf_bounds_t* bounds,
                                       const double border,
                                       const double miter_limit,
                                       const int polarity) {
    if(contour == nullptr || bounds == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    reinterpret_cast<const msdfgen::Contour*>(contour)->boundMiters(bounds->l, bounds->b, bounds->r, bounds->t, border, miter_limit, polarity);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_contour_get_winding(msdf_contour_const_handle contour, int* winding) {
    if(contour == nullptr || winding == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *winding = reinterpret_cast<const msdfgen::Contour*>(contour)->winding();
    return MSDF_SUCCESS;
}

MSDF_API int msdf_contour_reverse(msdf_contour_handle contour) {
    if(contour == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    reinterpret_cast<msdfgen::Contour*>(contour)->reverse();
    return MSDF_SUCCESS;
}

MSDF_API void msdf_contour_free(msdf_contour_handle contour) {
    msdf_delete(reinterpret_cast<msdfgen::Contour*>(contour));
}

// msdf_segment

MSDF_API int msdf_segment_alloc(const int type, msdf_segment_handle* segment) {
    if(type < 0 || type >= MSDF_SEGMENT_TYPE_MAX) {
        return MSDF_ERR_INVALID_TYPE;
    }
    if(segment == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    switch(type) {
        case MSDF_SEGMENT_TYPE_LINEAR:
            *segment = reinterpret_cast<msdf_segment_handle>(msdf_new<msdfgen::LinearSegment>(msdfgen::Point2 {}, msdfgen::Point2 {}));
            break;
        case MSDF_SEGMENT_TYPE_QUADRATIC:
            *segment = reinterpret_cast<msdf_segment_handle>(
                msdf_new<msdfgen::QuadraticSegment>(msdfgen::Point2 {}, msdfgen::Point2 {}, msdfgen::Point2 {}));
            break;
        case MSDF_SEGMENT_TYPE_CUBIC:
            *segment = reinterpret_cast<msdf_segment_handle>(
                msdf_new<msdfgen::CubicSegment>(msdfgen::Point2 {}, msdfgen::Point2 {}, msdfgen::Point2 {}, msdfgen::Point2 {}));
            break;
        default:
            return MSDF_ERR_INVALID_ARG;
    }
    return MSDF_SUCCESS;
}

MSDF_API int msdf_segment_get_type(msdf_segment_const_handle segment, int* type) {
    if(segment == nullptr || type == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    switch(reinterpret_cast<const msdfgen::EdgeSegment*>(segment)->type()) {
        case msdfgen::LinearSegment::EdgeType::EDGE_TYPE:
            *type = MSDF_SEGMENT_TYPE_LINEAR;
            break;
        case msdfgen::QuadraticSegment::EdgeType::EDGE_TYPE:
            *type = MSDF_SEGMENT_TYPE_QUADRATIC;
            break;
        case msdfgen::CubicSegment::EdgeType::EDGE_TYPE:
            *type = MSDF_SEGMENT_TYPE_CUBIC;
            break;
        default:
            return MSDF_ERR_INVALID_TYPE;
    }
    return MSDF_SUCCESS;
}

MSDF_API int msdf_segment_get_point_count(msdf_segment_const_handle segment, size_t* point_count) {
    if(segment == nullptr || point_count == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    switch(reinterpret_cast<const msdfgen::EdgeSegment*>(segment)->type()) {
        case msdfgen::LinearSegment::EdgeType::EDGE_TYPE:
            *point_count = 2;
            break;
        case msdfgen::QuadraticSegment::EdgeType::EDGE_TYPE:
            *point_count = 3;
            break;
        case msdfgen::CubicSegment::EdgeType::EDGE_TYPE:
            *point_count = 4;
            break;
        default:
            *point_count = 0;
            break;
    }
    return MSDF_SUCCESS;
}

MSDF_API int msdf_segment_get_point(msdf_segment_const_handle segment, const size_t index, msdf_vector2_t* point) {
    if(segment == nullptr || point == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    size_t point_count;
    if(msdf_segment_get_point_count(segment, &point_count) != MSDF_SUCCESS) {
        return MSDF_ERR_FAILED;
    }
    if(index >= point_count) {
        return MSDF_ERR_INVALID_INDEX;
    }
    const auto* p_segment = reinterpret_cast<const msdfgen::EdgeSegment*>(segment);
    switch(p_segment->type()) {
        case msdfgen::LinearSegment::EdgeType::EDGE_TYPE:
            *reinterpret_cast<msdfgen::Point2*>(point) = dynamic_cast<const msdfgen::LinearSegment*>(p_segment)->p[index];
            break;
        case msdfgen::QuadraticSegment::EdgeType::EDGE_TYPE:
            *reinterpret_cast<msdfgen::Point2*>(point) = dynamic_cast<const msdfgen::QuadraticSegment*>(p_segment)->p[index];
            break;
        case msdfgen::CubicSegment::EdgeType::EDGE_TYPE:
            *reinterpret_cast<msdfgen::Point2*>(point) = dynamic_cast<const msdfgen::CubicSegment*>(p_segment)->p[index];
            break;
        default:
            return MSDF_ERR_INVALID_ARG;
    }
    return MSDF_SUCCESS;
}

MSDF_API int msdf_segment_set_point(msdf_segment_handle segment, const size_t index, const msdf_vector2_t* point) {
    if(segment == nullptr || point == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    size_t point_count;
    if(msdf_segment_get_point_count(segment, &point_count) != MSDF_SUCCESS) {
        return MSDF_ERR_FAILED;
    }
    if(index >= point_count) {
        return MSDF_ERR_INVALID_INDEX;
    }
    auto* p_segment = reinterpret_cast<msdfgen::EdgeSegment*>(segment);
    switch(p_segment->type()) {
        case msdfgen::LinearSegment::EdgeType::EDGE_TYPE:
            dynamic_cast<msdfgen::LinearSegment*>(p_segment)->p[index] = *reinterpret_cast<const msdfgen::Point2*>(point);
            break;
        case msdfgen::QuadraticSegment::EdgeType::EDGE_TYPE:
            dynamic_cast<msdfgen::QuadraticSegment*>(p_segment)->p[index] = *reinterpret_cast<const msdfgen::Point2*>(point);
            break;
        case msdfgen::CubicSegment::EdgeType::EDGE_TYPE:
            dynamic_cast<msdfgen::CubicSegment*>(p_segment)->p[index] = *reinterpret_cast<const msdfgen::Point2*>(point);
            break;
        default:
            return MSDF_ERR_INVALID_ARG;
    }
    return MSDF_SUCCESS;
}

MSDF_API int msdf_segment_set_color(msdf_segment_handle segment, int color) {
    if(segment == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    reinterpret_cast<msdfgen::EdgeSegment*>(segment)->color = static_cast<msdfgen::EdgeColor>(color);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_segment_get_color(msdf_segment_const_handle segment, int* color) {
    if(segment == nullptr || color == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *color = static_cast<int>(reinterpret_cast<const msdfgen::EdgeSegment*>(segment)->color);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_segment_get_direction(msdf_segment_const_handle segment, const double param, msdf_vector2_t* direction) {
    if(segment == nullptr || direction == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *reinterpret_cast<msdfgen::Vector2*>(direction) = reinterpret_cast<const msdfgen::EdgeSegment*>(segment)->direction(param);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_segment_get_direction_change(msdf_segment_const_handle segment, double param, msdf_vector2_t* direction_change) {
    if(segment == nullptr || direction_change == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *reinterpret_cast<msdfgen::Vector2*>(direction_change) = reinterpret_cast<const msdfgen::EdgeSegment*>(segment)->directionChange(param);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_segment_point(msdf_segment_const_handle segment, const double param, msdf_vector2_t* point) {
    if(segment == nullptr || point == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *reinterpret_cast<msdfgen::Point2*>(point) = reinterpret_cast<const msdfgen::EdgeSegment*>(segment)->point(param);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_segment_bound(msdf_segment_const_handle segment, msdf_bounds_t* bounds) {
    if(segment == nullptr || bounds == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    reinterpret_cast<const msdfgen::EdgeSegment*>(segment)->bound(bounds->l, bounds->b, bounds->r, bounds->t);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_segment_move_start_point(msdf_segment_handle segment, const msdf_vector2_t* point) {
    if(segment == nullptr || point == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    reinterpret_cast<msdfgen::EdgeSegment*>(segment)->moveStartPoint(*reinterpret_cast<const msdfgen::Point2*>(point));
    return MSDF_SUCCESS;
}

MSDF_API int msdf_segment_move_end_point(msdf_segment_handle segment, const msdf_vector2_t* point) {
    if(segment == nullptr || point == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    reinterpret_cast<msdfgen::EdgeSegment*>(segment)->moveEndPoint(*reinterpret_cast<const msdfgen::Point2*>(point));
    return MSDF_SUCCESS;
}

MSDF_API void msdf_segment_free(msdf_segment_handle segment) {
    if(segment == nullptr) {
        return;
    }
    auto* p_segment = reinterpret_cast<msdfgen::EdgeSegment*>(segment);
    switch(p_segment->type()) {
        case msdfgen::LinearSegment::EdgeType::EDGE_TYPE:
            msdf_delete(dynamic_cast<msdfgen::LinearSegment*>(p_segment));
            break;
        case msdfgen::QuadraticSegment::EdgeType::EDGE_TYPE:
            msdf_delete(dynamic_cast<msdfgen::QuadraticSegment*>(p_segment));
            break;
        case msdfgen::CubicSegment::EdgeType::EDGE_TYPE:
            msdf_delete(dynamic_cast<msdfgen::CubicSegment*>(p_segment));
            break;
        default:
            return;
    }
}

// Main msdfgen APIs

int msdf_generate_sdf(msdf_bitmap_t* output, msdf_shape_const_handle shape, const msdf_transform_t* transform) {
    if(output == nullptr || shape == nullptr || transform == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    if(output->type != MSDF_BITMAP_TYPE_SDF) {
        return MSDF_ERR_INVALID_TYPE;
    }
    const msdfgen::Projection projection(*reinterpret_cast<const msdfgen::Vector2*>(&transform->scale),
                                         *reinterpret_cast<const msdfgen::Vector2*>(&transform->translation));
    const msdfgen::SDFTransformation actual_transform(projection, *reinterpret_cast<const msdfgen::Range*>(&transform->distance_mapping));
    msdfgen::generateSDF(*static_cast<SDFBitmap*>(output->handle), *reinterpret_cast<const msdfgen::Shape*>(shape), actual_transform);
    return MSDF_SUCCESS;
}

int msdf_generate_psdf(msdf_bitmap_t* output, msdf_shape_const_handle shape, const msdf_transform_t* transform) {
    if(output == nullptr || shape == nullptr || transform == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    if(output->type != MSDF_BITMAP_TYPE_PSDF) {
        return MSDF_ERR_INVALID_TYPE;
    }
    const msdfgen::Projection projection(*reinterpret_cast<const msdfgen::Vector2*>(&transform->scale),
                                         *reinterpret_cast<const msdfgen::Vector2*>(&transform->translation));
    const msdfgen::SDFTransformation actual_transform(projection, *reinterpret_cast<const msdfgen::Range*>(&transform->distance_mapping));
    msdfgen::generatePSDF(*static_cast<PSDFBitmap*>(output->handle), *reinterpret_cast<const msdfgen::Shape*>(shape), actual_transform);
    return MSDF_SUCCESS;
}

int msdf_generate_msdf(msdf_bitmap_t* output, msdf_shape_const_handle shape, const msdf_transform_t* transform) {
    if(output == nullptr || shape == nullptr || transform == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    if(output->type != MSDF_BITMAP_TYPE_MSDF) {
        return MSDF_ERR_INVALID_TYPE;
    }
    const msdfgen::Projection projection(*reinterpret_cast<const msdfgen::Vector2*>(&transform->scale),
                                         *reinterpret_cast<const msdfgen::Vector2*>(&transform->translation));
    const msdfgen::SDFTransformation actual_transform(projection, *reinterpret_cast<const msdfgen::Range*>(&transform->distance_mapping));
    msdfgen::generateMSDF(*static_cast<MSDFBitmap*>(output->handle), *reinterpret_cast<const msdfgen::Shape*>(shape), actual_transform);
    return MSDF_SUCCESS;
}

int msdf_generate_mtsdf(msdf_bitmap_t* output, msdf_shape_const_handle shape, const msdf_transform_t* transform) {
    if(output == nullptr || shape == nullptr || transform == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    if(output->type != MSDF_BITMAP_TYPE_MTSDF) {
        return MSDF_ERR_INVALID_TYPE;
    }
    const msdfgen::Projection projection(*reinterpret_cast<const msdfgen::Vector2*>(&transform->scale),
                                         *reinterpret_cast<const msdfgen::Vector2*>(&transform->translation));
    const msdfgen::SDFTransformation actual_transform(projection, *reinterpret_cast<const msdfgen::Range*>(&transform->distance_mapping));
    msdfgen::generateMTSDF(*static_cast<MTSDFBitmap*>(output->handle), *reinterpret_cast<const msdfgen::Shape*>(shape), actual_transform);
    return MSDF_SUCCESS;
}

int msdf_generate_sdf_with_config(msdf_bitmap_t* output,
                                  msdf_shape_const_handle shape,
                                  const msdf_transform_t* transform,
                                  const msdf_config_t* config) {
    if(output == nullptr || shape == nullptr || transform == nullptr || config == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    if(output->type != MSDF_BITMAP_TYPE_SDF) {
        return MSDF_ERR_INVALID_TYPE;
    }
    const msdfgen::Projection projection(*reinterpret_cast<const msdfgen::Vector2*>(&transform->scale),
                                         *reinterpret_cast<const msdfgen::Vector2*>(&transform->translation));
    const msdfgen::SDFTransformation actual_transform(projection, *reinterpret_cast<const msdfgen::Range*>(&transform->distance_mapping));
    const msdfgen::GeneratorConfig actual_config(config->overlap_support == MSDF_TRUE);
    msdfgen::generateSDF(*static_cast<SDFBitmap*>(output->handle), *reinterpret_cast<const msdfgen::Shape*>(shape), actual_transform,
                         actual_config);
    return MSDF_SUCCESS;
}

int msdf_generate_psdf_with_config(msdf_bitmap_t* output,
                                   msdf_shape_const_handle shape,
                                   const msdf_transform_t* transform,
                                   const msdf_config_t* config) {
    if(output == nullptr || shape == nullptr || transform == nullptr || config == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    if(output->type != MSDF_BITMAP_TYPE_PSDF) {
        return MSDF_ERR_INVALID_TYPE;
    }
    const msdfgen::Projection projection(*reinterpret_cast<const msdfgen::Vector2*>(&transform->scale),
                                         *reinterpret_cast<const msdfgen::Vector2*>(&transform->translation));
    const msdfgen::SDFTransformation actual_transform(projection, *reinterpret_cast<const msdfgen::Range*>(&transform->distance_mapping));
    const msdfgen::GeneratorConfig actual_config(config->overlap_support == MSDF_TRUE);
    msdfgen::generatePSDF(*static_cast<PSDFBitmap*>(output->handle), *reinterpret_cast<const msdfgen::Shape*>(shape), actual_transform,
                          actual_config);
    return MSDF_SUCCESS;
}

int msdf_generate_msdf_with_config(msdf_bitmap_t* output,
                                   msdf_shape_const_handle shape,
                                   const msdf_transform_t* transform,
                                   const msdf_multichannel_config_t* config) {
    if(output == nullptr || shape == nullptr || transform == nullptr || config == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    if(output->type != MSDF_BITMAP_TYPE_MSDF) {
        return MSDF_ERR_INVALID_TYPE;
    }
    const msdfgen::Projection projection(*reinterpret_cast<const msdfgen::Vector2*>(&transform->scale),
                                         *reinterpret_cast<const msdfgen::Vector2*>(&transform->translation));
    const msdfgen::SDFTransformation actual_transform(projection, *reinterpret_cast<const msdfgen::Range*>(&transform->distance_mapping));
    const msdfgen::ErrorCorrectionConfig error_correction_config(
        static_cast<msdfgen::ErrorCorrectionConfig::Mode>(config->mode),
        static_cast<msdfgen::ErrorCorrectionConfig::DistanceCheckMode>(config->distance_check_mode), config->min_deviation_ratio,
        config->min_improve_ratio);
    const msdfgen::MSDFGeneratorConfig actual_config(config->overlap_support == MSDF_TRUE, error_correction_config);
    msdfgen::generateMSDF(*static_cast<MSDFBitmap*>(output->handle), *reinterpret_cast<const msdfgen::Shape*>(shape), actual_transform,
                          actual_config);
    return MSDF_SUCCESS;
}

int msdf_generate_mtsdf_with_config(msdf_bitmap_t* output,
                                    msdf_shape_const_handle shape,
                                    const msdf_transform_t* transform,
                                    const msdf_multichannel_config_t* config) {
    if(output == nullptr || shape == nullptr || transform == nullptr || config == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    if(output->type != MSDF_BITMAP_TYPE_MTSDF) {
        return MSDF_ERR_INVALID_TYPE;
    }
    const msdfgen::Projection projection(*reinterpret_cast<const msdfgen::Vector2*>(&transform->scale),
                                         *reinterpret_cast<const msdfgen::Vector2*>(&transform->translation));
    const msdfgen::SDFTransformation actual_transform(projection, *reinterpret_cast<const msdfgen::Range*>(&transform->distance_mapping));
    const msdfgen::ErrorCorrectionConfig error_correction_config(
        static_cast<msdfgen::ErrorCorrectionConfig::Mode>(config->mode),
        static_cast<msdfgen::ErrorCorrectionConfig::DistanceCheckMode>(config->distance_check_mode), config->min_deviation_ratio,
        config->min_improve_ratio);
    const msdfgen::MSDFGeneratorConfig actual_config(config->overlap_support == MSDF_TRUE, error_correction_config);
    msdfgen::generateMTSDF(*static_cast<MTSDFBitmap*>(output->handle), *reinterpret_cast<const msdfgen::Shape*>(shape), actual_transform,
                           actual_config);
    return MSDF_SUCCESS;
}
}