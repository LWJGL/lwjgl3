/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package msdfgen.templates

import msdfgen.*
import org.lwjgl.generator.*

val msdfGen = "MSDFGen".nativeClass(Module.MSDFGEN, prefix = "msdf", prefixMethod = "msdf_") {
    nativeImport("msdfgen-c.h")
    javaImport("static org.lwjgl.system.Checks.*")
    cpp = true
    documentation = ""

    // Constants

    IntConstant("", "MSDF_FALSE".."0")
    IntConstant("", "MSDF_TRUE".."1")

    IntConstant("", "MSDF_SUCCESS".."0")
    IntConstant("", "MSDF_ERR_FAILED".."1")
    IntConstant("", "MSDF_ERR_INVALID_ARG".."2")
    IntConstant("", "MSDF_ERR_INVALID_TYPE".."3")
    IntConstant("", "MSDF_ERR_INVALID_SIZE".."4")
    IntConstant("", "MSDF_ERR_INVALID_INDEX".."5")

    IntConstant("", "MSDF_BITMAP_TYPE_SDF".."0")
    IntConstant("", "MSDF_BITMAP_TYPE_PSDF".."1")
    IntConstant("", "MSDF_BITMAP_TYPE_MSDF".."2")
    IntConstant("", "MSDF_BITMAP_TYPE_MTSDF".."3")

    IntConstant("", "MSDF_SEGMENT_TYPE_LINEAR".."0")
    IntConstant("", "MSDF_SEGMENT_TYPE_QUADRATIC".."1")
    IntConstant("", "MSDF_SEGMENT_TYPE_CUBIC".."2")

    IntConstant("", "MSDF_EDGE_COLOR_BLACK".."0")
    IntConstant("", "MSDF_EDGE_COLOR_RED".."1")
    IntConstant("", "MSDF_EDGE_COLOR_GREEN".."2")
    IntConstant("", "MSDF_EDGE_COLOR_YELLOW".."3")
    IntConstant("", "MSDF_EDGE_COLOR_BLUE".."4")
    IntConstant("", "MSDF_EDGE_COLOR_MAGENTA".."5")
    IntConstant("", "MSDF_EDGE_COLOR_CYAN".."6")
    IntConstant("", "MSDF_EDGE_COLOR_WHITE".."7")

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
        Unsafe..void.p.p("pixels", "A pointer to an address which is populated with the raw pixel data of the given bitmap."),
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
        msdf_shape_const_handle("shape", "A pointer to a shape object to retrieve the bounds from."),
        Unsafe..msdf_bounds.p("bounds", "A pointer to a variable which is populated with the bounds of the given shape."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_add_contour",
        "Adds a new contour to the given shape.",
        msdf_shape_handle("shape", "A pointer to a shape object to add a new contour to."),
        Unsafe..msdf_contour_handle.p("contour", "A pointer to an address which is populated with the address of the newly created contour."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_get_contour_count",
        "Retrieves the number of contours allocated within the given shape object.",
        msdf_shape_const_handle("shape", "A pointer to a shape object from which to retrieve the contour count."),
        Unsafe..size_t.p("size", "A pointer to a variable which is populated with the number of contours of the given shape."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_get_contour",
        "Retrieves a contour at a given index from the given shape.",
        msdf_shape_const_handle("shape", "A pointer to a shape object from which to retrieve a contour."),
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
        msdf_shape_const_handle("shape", "A pointer to a shape from which to retrieve the edge count."),
        Unsafe..size_t.p("count", "A pointer to a variable which is populated with the number of edges defined by the given shape."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_has_inverse_y_axis",
        "Retrieves the inverse-y-axis flag of the given shape.",
        msdf_shape_const_handle("shape", "A pointer to a shape from which to fetch the inverse-y-axis flag."),
        Unsafe..int.p(
            "inverse_y_axis",
            "A pointer to a variable which is populated with MSDF_TRUE when the y-axis of the given shape is inverted. Otherwise the variable will be set to MSDF_FALSE."
        ),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_normalize",
        "Normalizes the given shape.",
        msdf_shape_handle("shape", "A pointer to a shape to normalize."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_validate",
        "Validates the given shape.",
        msdf_shape_handle("shape", "A pointer to a shape to validate."),
        Unsafe..int.p(
            "result",
            "A pointer to a variable which is populated with MSDF_TRUE when the validation was successful. Otherwise the variable will be set to MSDF_FALSE."
        ),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_bound",
        "Adjusts the given bounding box to fit the given shape.",
        msdf_shape_const_handle("shape", "A pointer to a shape to fit into the given bounding box."),
        Unsafe..msdf_bounds.p("bounds", "A pointer to a bounding box which should at least fit the given shape."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "shape_bound_miters",
        "Adjusts the given bounding box to fit the given shape including a mitered border.",
        msdf_shape_const_handle("shape", "A pointer to a shape to fit into the given bounding box."),
        Unsafe..msdf_bounds.p("bounds", "A pointer to a bounding box which should at least fit the given shape including the specified border."),
        double("border", "The size of the border."),
        double("miter_limit", "The miter limit value."),
        int("polarity", "The miter polarity."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    void(
        "shape_free",
        "Calls the destructor of the given bitmap and frees its memory using the internal allocator.",
        msdf_shape_handle("shape", "A pointer to a shape object to be freed.")
    )

    // msdf_contour

    int(
        "contour_alloc",
        "Allocates a new contour object using the internal allocator.",
        Unsafe..msdf_contour_handle.p("contour", "A pointer to an address which is populated with the address of the newly allocated contour object."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "contour_add_edge",
        "Adds a new edge to the given contour and returns its associated segment handle.",
        msdf_contour_handle("contour", "A pointer to the contour to add a new edge (segment) to."),
        Unsafe..msdf_segment_handle.p("segment", "A pointer to an address which is populated with the address of the newly added edge segment."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "contour_get_edge_count",
        "Retrieves the edge count of the given contour.",
        msdf_contour_const_handle("contour", "A pointer to the contour to retrieve the edge count from."),
        Unsafe..size_t.p("count", "A pointer to a variable which is populated with the edge count of the given contour."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "contour_get_edge",
        "Retrieves an edge (segment) from the given contour at the given index.",
        msdf_contour_const_handle("contour", "A pointer to the contour from which to retrieve the given edge segment."),
        size_t("index", "The index from which to retrieve the edge segment."),
        Unsafe..msdf_segment_const_handle.p(
            "segment",
            "A pointer to an address which is populated with the address of the edge segment at the given index if present."
        ),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "contour_bound",
        "Adjusts the given bounding box to fit at least the given contour.",
        msdf_contour_const_handle("contour", "A pointer to the contour which should at least fit into the given bounding box."),
        Unsafe..msdf_bounds.p("bounds", "A pointer to the bounding box to fit the given contour into."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "contour_bound_miters",
        "Adjust the given bounding box to fit at least the given contour including a specified border.",
        msdf_contour_const_handle("contour", "A pointer to the contour which should at least fit into the given bounding box."),
        Unsafe..msdf_bounds.p("bounds", "A pointer to the bounding box to fit the given contour including the specified border."),
        double("border", "The size of the border."),
        double("miter_limit", "The miter limit value."),
        int("polarity", "The miter polarity."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "contour_get_winding",
        "Retrieves the winding direction of the given contour.",
        msdf_contour_const_handle("contour", "A pointer to the contour of which to retrieve the winding direction."),
        Unsafe..int.p("winding", "A pointer to a variables which is populated with the winding direction of the given contour."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "contour_reverse",
        "Reverses the order of edges in the given contour.",
        msdf_contour_handle("contour", "A pointer to the contour which to reverse the edge order for."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    void(
        "contour_free",
        "Calls the destructor of the given bitmap and frees its memory using the internal allocator.",
        msdf_contour_handle("contour", "A pointer to the contour to free.")
    )

    // msdf_segment

    int(
        "segment_alloc",
        "Allocates a new segment of the given type and populates the given address with the address of the newly allocated segment.",
        int("type", "The type of segment to allocate. Can be one of MSDF_SEGMENT_TYPE_LINEAR, MSDF_SEGMENT_TYPE_QUADRATIC or MSDF_SEGMENT_TYPE_CUBIC."),
        Unsafe..msdf_segment_handle.p("segment", "A pointer to an address which is populated with the address of the newly allocated segment."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "segment_get_type",
        "Retrieves the type of the given segment.",
        msdf_segment_const_handle("segment", "A pointer to the segment of which to retrieve the type."),
        Unsafe..int.p("type", "A pointer to a variable which is populated with the type of the given segment."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "segment_get_point_count",
        "Retrieves the point count of the given segment.",
        msdf_segment_const_handle("segment", "A pointer to the segment of which to retrieve the number of points."),
        Unsafe..size_t.p("count", "A pointer to a variable which is populated with the number of points of the given segment."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "segment_get_point",
        "Retrieves a point at the given index from the given segment.",
        msdf_segment_const_handle("segment", "A pointer to the segment from which to retrieve a point."),
        size_t("index", "The index of the point to retrieve."),
        Unsafe..msdf_vector2.p("point", "A pointer to a point which is populated with the coordinates of the point at the given index if present."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "segment_set_point",
        "Sets the coordinates of a point at the given index in the given segment.",
        msdf_segment_handle("segment", "A pointer to the segment of which to set the point."),
        size_t("index", "The index of the point to set."),
        Unsafe..msdf_vector2.const.p("point", "A pointer to a point which is copied to the given index within the segment."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "segment_get_color",
        "Retrieves the color of the given segment.",
        msdf_segment_const_handle("segment", "A pointer to the segment of which to retrieve the color."),
        Unsafe..int.p(
            "color",
            "A pointer to a variable which is populated with the color of the given segment. Will be one of the constants prefixed with MSDF_COLOR_."
        ),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "segment_set_color",
        "Sets the color of the given segment.",
        msdf_segment_handle("segment", "A pointer to the segment of which to set the color."),
        int("color", "The color to set. Can be any MSDF_COLOR_ value."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "segment_get_direction",
        "Retrieves the direction of the given segment at the given point.",
        msdf_segment_const_handle("segment", "A pointer to the segment of which to retrieve the direction."),
        double("param", "The point at which to retrieve the segment direction."),
        Unsafe..msdf_vector2.p("direction", "A pointer to a variable which is populated with the direction of the given segment at the given point."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "segment_get_direction_change",
        "Retrieves the direction change of the given segment at the given point.",
        msdf_segment_const_handle("segment", "A pointer to the segment of which to retrieve the direction change."),
        double("param", "The point at which to retrieve the segment direction change."),
        Unsafe..msdf_vector2.p(
            "direction_change",
            "A pointer to a variable which is populated with the direction change of the given segment at the given point."
        ),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "segment_point",
        "Retrieves the point on the given edge segment specified by the given parameter.",
        msdf_segment_const_handle("segment", "A pointer to the segment of which to retrieve the edge point."),
        double("param", "The point at which to sample."),
        Unsafe..msdf_vector2.p("point", "A pointer to a variable which is populated with the edge point at the given location from the given segment."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "segment_bound",
        "Adjusts the given bounding box to fit at least the given segment.",
        msdf_segment_const_handle("segment", "A pointer to the segment which should at least fit in the given bounding box."),
        Unsafe..msdf_bounds.p("bounds", "A pointer to the bounding box which should at least fit the given segment."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "segment_move_start_point",
        "Moves the start point of the given segment.",
        msdf_segment_handle("segment", "A pointer to the segment of which to adjust the start point."),
        Unsafe..msdf_vector2.const.p("point", "A pointer to the new start point of the given segment."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "segment_move_end_point",
        "Moves the end point of the given segment.",
        msdf_segment_handle("segment", "A pointer to the segment of which to adjust the end point."),
        Unsafe..msdf_vector2.const.p("point", "A pointer to the new end point of the given segment."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    void(
        "segment_free",
        "Calls the destructor of the given segment and frees its memory using the internal allocator.",
        msdf_segment_handle("segment", "A pointer to the segment to free.")
    )

    // Main API functions

    int(
        "generate_sdf",
        "",
        Unsafe..msdf_bitmap.p(
            "output",
            "A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_SDF."
        ),
        msdf_shape_const_handle("shape", "A pointer to the shape to render to the given bitmap."),
        Unsafe..msdf_transform.const.p("transform", "The transform which is applied to the given shape during rendering."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "generate_psdf",
        "",
        Unsafe..msdf_bitmap.p(
            "output",
            "A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_PSDF."
        ),
        msdf_shape_const_handle("shape", "A pointer to the shape to render to the given bitmap."),
        Unsafe..msdf_transform.const.p("transform", "The transform which is applied to the given shape during rendering."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "generate_msdf",
        "",
        Unsafe..msdf_bitmap.p(
            "output",
            "A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_MSDF."
        ),
        msdf_shape_const_handle("shape", "A pointer to the shape to render to the given bitmap."),
        Unsafe..msdf_transform.const.p("transform", "The transform which is applied to the given shape during rendering."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "generate_mtsdf",
        "",
        Unsafe..msdf_bitmap.p(
            "output",
            "A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_MTSDF."
        ),
        msdf_shape_const_handle("shape", "A pointer to the shape to render to the given bitmap."),
        Unsafe..msdf_transform.const.p("transform", "The transform which is applied to the given shape during rendering."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "generate_sdf_with_config",
        "",
        Unsafe..msdf_bitmap.p(
            "output",
            "A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_SDF."
        ),
        msdf_shape_const_handle("shape", "A pointer to the shape to render to the given bitmap."),
        Unsafe..msdf_transform.const.p("transform", "The transform which is applied to the given shape during rendering."),
        Unsafe..msdf_config.const.p("config", "A pointer to the config which is applied to the sprite generator before rendering."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "generate_psdf_with_config",
        "",
        Unsafe..msdf_bitmap.p(
            "output",
            "A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_PSDF."
        ),
        msdf_shape_const_handle("shape", "A pointer to the shape to render to the given bitmap."),
        Unsafe..msdf_transform.const.p("transform", "The transform which is applied to the given shape during rendering."),
        Unsafe..msdf_config.const.p("config", "A pointer to the config which is applied to the sprite generator before rendering."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "generate_msdf_with_config",
        "",
        Unsafe..msdf_bitmap.p(
            "output",
            "A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_MSDF."
        ),
        msdf_shape_const_handle("shape", "A pointer to the shape to render to the given bitmap."),
        Unsafe..msdf_transform.const.p("transform", "The transform which is applied to the given shape during rendering."),
        Unsafe..msdf_multichannel_config.const.p("config", "A pointer to the config which is applied to the sprite generator before rendering."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
    int(
        "generate_mtsdf_with_config",
        "",
        Unsafe..msdf_bitmap.p(
            "output",
            "A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_MTSDF."
        ),
        msdf_shape_const_handle("shape", "A pointer to the shape to render to the given bitmap."),
        Unsafe..msdf_transform.const.p("transform", "The transform which is applied to the given shape during rendering."),
        Unsafe..msdf_multichannel_config.const.p("config", "A pointer to the config which is applied to the sprite generator before rendering."),
        returnDoc = "MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_."
    )
}