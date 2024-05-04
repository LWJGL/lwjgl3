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
        "Allocates a new MSDF shape object using the internal allocator.",
        Unsafe..msdf_shape_handle.p("shape", "A pointer to an address which is populated with the address of the newly allocated shape."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_get_bounds",
        "Retrieves the bounds of the given shape.",
        Unsafe..msdf_shape_const_handle("shape", "A pointer to a shape object to retrieve the bounds from."),
        Unsafe..msdf_bounds.p("bounds", "A pointer to a variable which is populated with the bounds of the given shape."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_add_contour",
        "Adds a new contour to the given shape.",
        Unsafe..msdf_shape_handle("shape", "A pointer to a shape object to add a new contour to."),
        Unsafe..msdf_contour_handle.p("contour", "A pointer to an address which is populated with the address of the newly created contour."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_get_contour_count",
        "Retrieves the number of contours allocated within the given shape object.",
        Unsafe..msdf_shape_const_handle("shape", "A pointer to a shape object from which to retrieve the contour count."),
        Unsafe..size_t.p("size", "A pointer to a variable which is populated with the number of contours of the given shape."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_get_contour",
        "Retrieves a contour at a given index from the given shape.",
        Unsafe..msdf_shape_const_handle("shape", "A pointer to a shape object from which to retrieve a contour."),
        size_t("index", "The index of the contour to retrieve."),
        Unsafe..msdf_contour_const_handle.p(
            "contour",
            "A pointer to an address which is populated with the address of the contour at the given index if present."
        ),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_get_edge_count",
        "Retrieves the number of edges of the given shape.",
        Unsafe..msdf_shape_const_handle("shape", "A pointer to a shape from which to retrieve the edge count."),
        Unsafe..size_t.p("count", "A pointer to a variable which is populated with the number of edges defined by the given shape."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_has_inverse_y_axis",
        "Retrieves the inverse-y-axis flag of the given shape.",
        Unsafe..msdf_shape_const_handle("shape", "A pointer to a shape from which to fetch the inverse-y-axis flag."),
        Unsafe..int.p(
            "inverse_y_axis",
            "A pointer to a variable which is populated with MSDF_TRUE when the y-axis of the given shape is inverted. Otherwise the variable will be set to MSDF_FALSE."
        ),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_normalize",
        "Normalizes the given shape.",
        Unsafe..msdf_shape_handle("shape", "A pointer to a shape to normalize."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_validate",
        "Validates the given shape.",
        Unsafe..msdf_shape_handle("shape", "A pointer to a shape to validate."),
        Unsafe..int.p(
            "result",
            "A pointer to a variable which is populated with MSDF_TRUE when the validation was successful. Otherwise the variable will be set to MSDF_FALSE."
        ),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_bound",
        "Adjusts the given bounding box to fit the given shape.",
        Unsafe..msdf_shape_const_handle("shape", "A pointer to a shape to fit into the given bounding box."),
        Unsafe..msdf_bounds.p("bounds", "A pointer to a bounding box which should at least fit the given shape."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_bound_miters",
        "Adjusts the given bounding box to fit the given shape including a mitered border.",
        Unsafe..msdf_shape_const_handle("shape", "A pointer to a shape to fit into the given bounding box."),
        Unsafe..msdf_bounds.p("bounds", "A pointer to a bounding box which should at least fit the given shape including the specified border."),
        double("border", "The size of the border."),
        double("miter_limit", "The miter limit value."),
        int("polarity", "The miter polarity."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    void(
        "shape_free",
        "Calls the destructor of the given bitmap and frees its memory using the internal allocator.",
        Unsafe..msdf_shape_handle("shape", "A pointer to a shape object to be freed.")
    )

    // msdf_contour

    int(
        "contour_alloc",
        "Allocates a new contour object using the internal allocator.",
        Unsafe..msdf_contour_handle.p("contour", "A pointer to an address which is populated with the address of the newly allocated contour object.")
    )
    int(
        "contour_add_edge",
        "Adds a new edge to the given contour and returns its associated segment handle.",
        Unsafe..msdf_contour_handle("contour", "A pointer to the contour to add a new edge (segment) to."),
        Unsafe..msdf_segment_handle.p("segment", "A pointer to an address which is populated with the address of the newly added edge segment.")
    )
    int(
        "contour_get_edge_count",
        "Retrieves the edge count of the given contour.",
        Unsafe..msdf_contour_const_handle("contour", "A pointer to the contour to retrieve the edge count from."),
        Unsafe..size_t.p("count", "A pointer to a variable which is populated with the edge count of the given contour.")
    )
    int(
        "contour_get_edge",
        "Retrieves an edge (segment) from the given contour at the given index.",
        Unsafe..msdf_contour_const_handle("contour", "A pointer to the contour from which to retrieve the given edge segment."),
        size_t("index", "The index from which to retrieve the edge segment."),
        Unsafe..msdf_segment_const_handle.p(
            "segment",
            "A pointer to an address which is populated with the address of the edge segment at the given index if present."
        )
    )
    int(
        "contour_bound",
        "Adjusts the given bounding box to fit at least the given contour.",
        Unsafe..msdf_contour_const_handle("contour", "A pointer to the contour which should at least fit into the given bounding box."),
        Unsafe..msdf_bounds.p("bounds", "A pointer to the bounding box to fit the given contour into.")
    )
    int(
        "contour_bound_miters",
        "Adjust the given bounding box to fit at least the given contour including a specified border.",
        Unsafe..msdf_contour_const_handle("contour", "A pointer to the contour which should at least fit into the given bounding box."),
        Unsafe..msdf_bounds.p("bounds", "A pointer to the bounding box to fit the given contour including the specified border."),
        double("border", "The size of the border."),
        double("miter_limit", "The miter limit value."),
        int("polarity", "The miter polarity.")
    )
    int(
        "contour_get_winding",
        "Retrieves the winding direction of the given contour.",
        Unsafe..msdf_contour_const_handle("contour", "A pointer to the contour of which to retrieve the winding direction."),
        Unsafe..int.p("winding", "A pointer to a variables which is populated with the winding direction of the given contour.")
    )
    int(
        "contour_reverse",
        "Reverses the order of edges in the given contour.",
        Unsafe..msdf_contour_handle("contour", "A pointer to the contour which to reverse the edge order for.")
    )
    void(
        "contour_free",
        "Calls the destructor of the given bitmap and frees its memory using the internal allocator.",
        Unsafe..msdf_contour_handle("contour", "A pointer to the contour to free.")
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