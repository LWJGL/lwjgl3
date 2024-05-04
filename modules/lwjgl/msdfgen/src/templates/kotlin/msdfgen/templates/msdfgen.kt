/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package msdfgen.templates

import msdfgen.*
import org.lwjgl.generator.*

val msdfGen = "MSDFGen".nativeClass(Module.MSDFGEN, prefix = "msdf", prefixMethod = "msdf_") {
    nativeImport("msdfgen_c.h")
    javaImport("static org.lwjgl.system.Checks.*")
    documentation = ""

    // msdf_allocator

    void(
        "allocator_set",
        "Sets the allocation callbacks to use for allocating API objects.",
        Unsafe..msdf_allocator.const.p("allocator", "The address of an msdf_allocator_t structure to copy the callback pointers from.")
    )
    Unsafe..msdf_allocator.const.p(
        "allocator_get",
        "Retrieves the address of the allocator used by the C API to allocate underlying objects.",
        "The address of the allocator used by the C API to allocate underlying objects."
    )

    // msdf_bitmap

    int(
        "bitmap_alloc",
        "Allocates a new MSDF bitmap object to render a shape into using the internal allocator.",
        int(
            "type",
            "The type of bitmap to allocate. Can be one of MSDF_BITMAP_TYPE_SDF, MSDF_BITMAP_TYPE_PSDF, MSDF_BITMAP_TYPE_MSDF or MSDF_BITMAP_TYPE_MTSDF."
        ),
        int("width", "The width of the bitmap in pixels."),
        int("height", "The height of the bitmap in pixels."),
        Unsafe..msdf_bitmap.p("bitmap", "A pointer to an msdf_bitmap_t structure to allocate a new bitmap into."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "bitmap_get_channel_count",
        "Retrieves the number of color channels used by the given bitmap.",
        Unsafe..msdf_bitmap.const.p("bitmap", "A pointer to an msdf_bitmap_t structure to retrieve the channel count from."),
        Unsafe..int.p("channel_count", "A pointer to a variable which is populated with the number of color channels used by the given bitmap."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "bitmap_get_pixels",
        "Retrieves the address of the raw pixel data of the given bitmap.",
        Unsafe..msdf_bitmap.const.p("bitmap", "A pointer to an msdf_bitmap_t structure to retrieve the raw pixel data from."),
        Unsafe..void.p.p("pixels", "A pointer to an address which is populated with the raw pixel data of the given bitmap."), ,
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "bitmap_get_byte_size",
        "Retrieves the size of the pixel data of the given bitmap in bytes.",
        Unsafe..msdf_bitmap.const.p("bitmap", "A pointer to an msdf_bitmap_t structure to retrieve the size of the raw pixel data from."),
        Unsafe..size_t.p("size", "A pointer to a variable which is populated with the byte size of the raw pixel data of the given bitmap."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    void(
        "bitmap_free",
        "Calls the destructor of the given bitmap and frees its memory using the internal allocator.",
        Unsafe..msdf_bitmap.p("bitmap", "A pointer to an msdf_bitmap_t structure to be freed.")
    )

    // msdf_shape

    int(
        "shape_alloc",
        "",
        Unsafe..msdf_shape_handle.p("shape", "")
    )
    int(
        "shape_get_bounds",
        "",
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..msdf_bounds.p("bounds", "")
    )
    int(
        "shape_add_contour",
        "",
        Unsafe..msdf_shape_handle("shape", ""),
        Unsafe..msdf_contour_handle.p("contour", "")
    )
    int(
        "shape_get_contour_count",
        "",
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..size_t.p("size", "")
    )
    int(
        "shape_get_contour",
        "",
        Unsafe..msdf_shape_const_handle("shape", ""),
        size_t("index", ""),
        Unsafe..msdf_contour_const_handle.p("contour", "")
    )
    int(
        "shape_get_edge_count",
        "",
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..size_t.p("count", "")
    )
    int(
        "shape_has_inverse_y_axis",
        "",
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..int.p("inverse_y_axis", "")
    )
    int(
        "shape_normalize",
        "",
        Unsafe..msdf_shape_handle("shape", "")
    )
    int(
        "shape_validate",
        "",
        Unsafe..msdf_shape_handle("shape", ""),
        Unsafe..int.p("result", "")
    )
    int(
        "shape_bound",
        "",
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..msdf_bounds.p("bounds", "")
    )
    int(
        "shape_bound_miters",
        "",
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..msdf_bounds.p("bounds", ""),
        double("border", ""),
        double("miter_limit", ""),
        int("polarity", "")
    )
    void(
        "shape_free",
        "",
        Unsafe..msdf_shape_handle("shape", "")
    )

    // msdf_contour

    int(
        "contour_alloc",
        "",
        Unsafe..msdf_contour_handle.p("contour", "")
    )
    int(
        "contour_add_edge",
        "",
        Unsafe..msdf_contour_handle("contour", ""),
        Unsafe..msdf_segment_handle.p("segment", "")
    )
    int(
        "contour_get_edge_count",
        "",
        Unsafe..msdf_contour_const_handle("contour", ""),
        Unsafe..size_t.p("count", "")
    )
    int(
        "contour_get_edge",
        "",
        Unsafe..msdf_contour_const_handle("contour", ""),
        size_t("index", ""),
        Unsafe..msdf_segment_const_handle.p("segment", "")
    )
    int(
        "contour_bound",
        "",
        Unsafe..msdf_contour_const_handle("contour", ""),
        Unsafe..msdf_bounds.p("bounds", "")
    )
    int(
        "contour_bound_miters",
        "",
        Unsafe..msdf_contour_const_handle("contour", ""),
        Unsafe..msdf_bounds.p("bounds", ""),
        double("border", ""),
        double("miter_limit", ""),
        int("polarity", "")
    )
    int(
        "contour_get_winding",
        "",
        Unsafe..msdf_contour_const_handle("contour", ""),
        Unsafe..int.p("winding", "")
    )
    int(
        "contour_reverse",
        "",
        Unsafe..msdf_contour_handle("contour", "")
    )
    void(
        "contour_free",
        "",
        Unsafe..msdf_contour_handle("contour", "")
    )

    // msdf_segment

    int(
        "segment_alloc",
        "",
        int("type", ""),
        Unsafe..msdf_segment_handle.p("segment", "")
    )
    int(
        "segment_get_point_count",
        "",
        Unsafe..msdf_segment_const_handle("segment", ""),
        Unsafe..size_t.p("count", "")
    )
    int(
        "segment_get_point",
        "",
        Unsafe..msdf_segment_const_handle("segment", ""),
        size_t("index", ""),
        Unsafe..msdf_vector2.p("point", "")
    )
    int(
        "segment_set_point",
        "",
        Unsafe..msdf_segment_handle("segment", ""),
        size_t("index", ""),
        Unsafe..msdf_vector2.const.p("point", "")
    )
    int(
        "segment_get_color",
        "",
        Unsafe..msdf_segment_const_handle("segment", ""),
        Unsafe..int.p("color", "")
    )
    int(
        "segment_set_color",
        "",
        Unsafe..msdf_segment_handle("segment", ""),
        int("color", "")
    )
    int(
        "segment_get_direction",
        "",
        Unsafe..msdf_segment_const_handle("segment", ""),
        double("param", ""),
        Unsafe..msdf_vector2.p("direction", "")
    )
    int(
        "segment_get_direction_change",
        "",
        Unsafe..msdf_segment_const_handle("segment", ""),
        double("param", ""),
        Unsafe..msdf_vector2.p("direction_change", "")
    )
    int(
        "segment_point",
        "",
        Unsafe..msdf_segment_const_handle("segment", ""),
        double("param", ""),
        Unsafe..msdf_vector2.p("point", "")
    )
    int(
        "segment_bound",
        "",
        Unsafe..msdf_segment_const_handle("segment", ""),
        Unsafe..msdf_bounds.p("bounds", "")
    )
    int(
        "segment_move_start_point",
        "",
        Unsafe..msdf_segment_handle("segment", ""),
        Unsafe..msdf_vector2.const.p("point", "")
    )
    int(
        "segment_move_end_point",
        "",
        Unsafe..msdf_segment_handle("segment", ""),
        Unsafe..msdf_vector2.const.p("point", "")
    )
    void(
        "segment_free",
        "",
        Unsafe..msdf_segment_handle("segment", "")
    )

    // Main API functions

    int(
        "generate_sdf",
        "",
        Unsafe..msdf_bitmap.p("output", ""),
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..msdf_transform.const.p("transform", "")
    )
    int(
        "generate_psdf",
        "",
        Unsafe..msdf_bitmap.p("output", ""),
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..msdf_transform.const.p("transform", "")
    )
    int(
        "generate_msdf",
        "",
        Unsafe..msdf_bitmap.p("output", ""),
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..msdf_transform.const.p("transform", "")
    )
    int(
        "generate_mtsdf",
        "",
        Unsafe..msdf_bitmap.p("output", ""),
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..msdf_transform.const.p("transform", "")
    )
    int(
        "generate_sdf_with_config",
        "",
        Unsafe..msdf_bitmap.p("output", ""),
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..msdf_transform.const.p("transform", ""),
        Unsafe..msdf_config.const.p("config", "")
    )
    int(
        "generate_psdf_with_config",
        "",
        Unsafe..msdf_bitmap.p("output", ""),
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..msdf_transform.const.p("transform", ""),
        Unsafe..msdf_config.const.p("config", "")
    )
    int(
        "generate_msdf_with_config",
        "",
        Unsafe..msdf_bitmap.p("output", ""),
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..msdf_transform.const.p("transform", ""),
        Unsafe..msdf_multichannel_config.const.p("config", "")
    )
    int(
        "generate_mtsdf_with_config",
        "",
        Unsafe..msdf_bitmap.p("output", ""),
        Unsafe..msdf_shape_const_handle("shape", ""),
        Unsafe..msdf_transform.const.p("transform", ""),
        Unsafe..msdf_multichannel_config.const.p("config", "")
    )
}