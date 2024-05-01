/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package msdfgen.templates

import msdfgen.*
import org.lwjgl.generator.*

val msdfGen = "MSDFGen".nativeClass(Module.MSDFGEN, prefix = "MSDF", prefixMethod = "msdf_") {
    nativeImport("msdfgen-c.h")
    documentation = ""

    // Constants

    IntConstant("", "FALSE".."0")
    IntConstant("", "TRUE".."1")

    EnumConstant(
        "",

        "SUCCESS".enum("", "0"),
        "ERR_FAILED".enum,
        "ERR_INVALID_ARG".enum,
        "ERR_INVALID_TYPE".enum,
        "ERR_INVALID_SIZE".enum,
        "ERR_INVALID_INDEX".enum
    )

    EnumConstant(
        "",

        "BITMAP_TYPE_SDF".enum("", "0"),
        "BITMAP_TYPE_PSDF".enum,
        "BITMAP_TYPE_MSDF".enum,
        "BITMAP_TYPE_MTSDF".enum
    )

    EnumConstant(
        "",

        "SEGMENT_TYPE_LINEAR".enum("", "0"),
        "SEGMENT_TYPE_QUADRATIC".enum,
        "SEGMENT_TYPE_CUBIC".enum
    )

    EnumConstant(
        "",

        "EDGE_COLOR_BLACK".enum("", "0"),
        "EDGE_COLOR_RED".enum,
        "EDGE_COLOR_GREEN".enum,
        "EDGE_COLOR_YELLOW".enum,
        "EDGE_COLOR_BLUE".enum,
        "EDGE_COLOR_MAGENTA".enum,
        "EDGE_COLOR_CYAN".enum,
        "EDGE_COLOR_WHITE".enum
    )

    EnumConstant(
        "",

        "ERROR_CORRECTION_MODE_DISABLED".enum("", "0"),
        "ERROR_CORRECTION_MODE_INDISCRIMINATE".enum,
        "ERROR_CORRECTION_MODE_EDGE_PRIORITY".enum,
        "ERROR_CORRECTION_MODE_EDGE_ONLY".enum
    )

    EnumConstant(
        "",

        "DISTANCE_CHECK_MODE_NONE".enum("", "0"),
        "DISTANCE_CHECK_MODE_AT_EDGE".enum,
        "DISTANCE_CHECK_MODE_ALWAYS".enum
    )
    
    val returnDoc = "#SUCCESS on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}."

    // msdf_bitmap

    int(
        "bitmap_alloc",
        "Allocates a new MSDF bitmap object to render a shape into using the internal allocator.",

        int("type", "the type of bitmap to allocate", "BITMAP_TYPE_\\w+"),
        int("width", "the width of the bitmap in pixels"),
        int("height", "the height of the bitmap in pixels"),
        msdf_bitmap.p("bitmap", "a pointer to an {@code msdf_bitmap_t} structure to allocate a new bitmap into"),

        returnDoc = returnDoc
    )

    int(
        "bitmap_get_channel_count",
        "Retrieves the number of color channels used by the given bitmap.",

        msdf_bitmap.const.p("bitmap", "a pointer to an {@code msdf_bitmap_t} structure to retrieve the channel count from"),
        Check(1)..int.p("channel_count", "a pointer to a variable which is populated with the number of color channels used by the given bitmap"),

        returnDoc = returnDoc
    )

    int(
        "bitmap_get_pixels",
        "Retrieves the address of the raw pixel data of the given bitmap.",

        msdf_bitmap.const.p("bitmap", "a pointer to an {@code msdf_bitmap_t} structure to retrieve the raw pixel data from"),
        Check(1)..void.p.p("pixels", "a pointer to an address which is populated with the raw pixel data of the given bitmap"),

        returnDoc = returnDoc
    )

    int(
        "bitmap_get_byte_size",
        "Retrieves the size of the pixel data of the given bitmap in bytes.",

        msdf_bitmap.const.p("bitmap", "a pointer to an {@code msdf_bitmap_t} structure to retrieve the size of the raw pixel data from"),
        Check(1)..size_t.p("size", "a pointer to a variable which is populated with the byte size of the raw pixel data of the given bitmap"),

        returnDoc = returnDoc
    )

    void(
        "bitmap_free",
        "Calls the destructor of the given bitmap and frees its memory using the internal allocator.",

        msdf_bitmap.p("bitmap", "a pointer to an {@code msdf_bitmap_t} structure to be freed.")
    )

    // msdf_shape

    int(
        "shape_alloc",
        "Allocates a new MSDF shape object using the internal allocator.",

        Check(1)..msdf_shape_handle.p("shape", "a pointer to an address which is populated with the address of the newly allocated shape."),

        returnDoc = returnDoc
    )

    int(
        "shape_get_bounds",
        "Retrieves the bounds of the given shape.",

        msdf_shape_const_handle("shape", "a pointer to a shape object to retrieve the bounds from"),
        msdf_bounds.p("bounds", "a pointer to a variable which is populated with the bounds of the given shape"),

        returnDoc = returnDoc
    )

    int(
        "shape_add_contour",
        "Adds a new contour to the given shape.",

        msdf_shape_handle("shape", "a pointer to a shape object to add a new contour to"),
        Check(1)..msdf_contour_const_handle.p("contour", "a pointer to a contour handle to be populated with a new contour that was added to the shape"),

        returnDoc = returnDoc
    )

    int(
        "shape_remove_contour",
        "Removes the given contour from the given shape if present.",

        msdf_shape_handle("shape", "a pointer to a shape object to remove the given contour from"),
        msdf_contour_const_handle("contour", "a pointer to the contour to remove from the shape"),

        returnDoc = returnDoc
    )

    int(
        "shape_get_contour_count",
        "Retrieves the number of contours allocated within the given shape object.",

        msdf_shape_const_handle("shape", "a pointer to a shape object from which to retrieve the contour count"),
        Check(1)..size_t.p("size", "a pointer to a variable which is populated with the number of contours of the given shape"),

        returnDoc = returnDoc
    )

    int(
        "shape_get_contour",
        "Retrieves a contour at a given index from the given shape.",

        msdf_shape_const_handle("shape", "a pointer to a shape object from which to retrieve a contour"),
        size_t("index", "the index of the contour to retrieve"),
        Check(1)..msdf_contour_const_handle.p(
            "contour",
            "a pointer to an address which is populated with the address of the contour at the given index if present"
        ),

        returnDoc = returnDoc
    )

    int(
        "shape_get_edge_count",
        "Retrieves the number of edges of the given shape.",

        msdf_shape_const_handle("shape", "a pointer to a shape from which to retrieve the edge count"),
        Check(1)..size_t.p("count", "a pointer to a variable which is populated with the number of edges defined by the given shape"),

        returnDoc = returnDoc
    )

    int(
        "shape_has_inverse_y_axis",
        "Retrieves the inverse-y-axis flag of the given shape.",

        msdf_shape_const_handle("shape", "a pointer to a shape from which to fetch the inverse-y-axis flag"),
        Check(1)..int.p(
            "inverse_y_axis",
            """
            a pointer to a variable which is populated with #TRUE when the y-axis of the given shape is inverted. Otherwise the variable will be set to #FALSE.
            """
        ),

        returnDoc = returnDoc
    )

    int(
        "shape_normalize",
        "Normalizes the given shape.",

        msdf_shape_handle("shape", "a pointer to a shape to normalize"),

        returnDoc = returnDoc
    )

    int(
        "shape_validate",
        "Validates the given shape.",

        msdf_shape_handle("shape", "a pointer to a shape to validate"),
        Check(1)..int.p(
            "result",
            "a pointer to a variable which is populated with #TRUE when the validation was successful. Otherwise the variable will be set to #FALSE."
        ),

        returnDoc = returnDoc
    )

    int(
        "shape_bound",
        "Adjusts the given bounding box to fit the given shape.",

        msdf_shape_const_handle("shape", "a pointer to a shape to fit into the given bounding box"),
        msdf_bounds.p("bounds", "a pointer to a bounding box which should at least fit the given shape"),

        returnDoc = returnDoc
    )

    int(
        "shape_bound_miters",
        "Adjusts the given bounding box to fit the given shape including a mitered border.",

        msdf_shape_const_handle("shape", "a pointer to a shape to fit into the given bounding box"),
        msdf_bounds.p("bounds", "a pointer to a bounding box which should at least fit the given shape including the specified border"),
        double("border", "the size of the border"),
        double("miter_limit", "the miter limit value"),
        int("polarity", "the miter polarity"),

        returnDoc = returnDoc
    )

    int(
        "shape_orient_contours",
        "Orients all contours associated with the given shape before rendering.",

        msdf_shape_handle("shape", "a pointer to a shape whose contours to orient"),

        returnDoc = returnDoc
    )

    int(
        "shape_edge_colors_simple",
        "Colors the edges of the given shape using the default MSDF colors specified by the {@code MSDF_COLOR_} prefixed constants.",

        msdf_shape_handle("shape", "a pointer to a shape whose edges to color with the default MSDF colors"),
        double("angle_threshold", "the threshold angle in degrees"),

        returnDoc = returnDoc
    )

    int(
        "shape_edge_colors_ink_trap",
        """
        Colors the edges of the given shape using the default MSDF colors specified by the {@code MSDF_COLOR_} prefixed constants using the ink trap algorithm.
        """,

        msdf_shape_handle("shape", "a pointer to a shape whose edges to color with the default MSDF colors"),
        double("angle_threshold", "the threshold angle in degrees"),

        returnDoc = returnDoc
    )

    int(
        "shape_edge_colors_by_distance",
        "Colors the edges of the given shape using the default MSDF colors specified by the {@code MSDF_COLOR_} prefixed constants using the distance.",

        msdf_shape_handle("shape", "a pointer to a shape whose edges to color with the default MSDF colors"),
        double("angle_threshold", "the threshold angle in degrees"),

        returnDoc = returnDoc
    )

    int(
        "shape_one_shot_distance",
        "Finds the distance between shape and origin.",

        msdf_shape_const_handle("shape", "a pointer to the shape to find the distance to"),
        msdf_vector2.const.p("origin", "the point to find the distance relative to the given shape to"),
        Check(1)..double.p("distance", "a pointer to a variable to be populated with the calculated distance to the given shape"),

        returnDoc = returnDoc
    )

    void(
        "shape_free",
        "Calls the destructor of the given bitmap and frees its memory using the internal allocator.",

        msdf_shape_handle("shape", "a pointer to a shape object to be freed")
    )

    // msdf_contour

    int(
        "contour_alloc",
        "Allocates a new contour object using the internal allocator.",

        Check(1)..msdf_contour_handle.p("contour", "a pointer to an address which is populated with the address of the newly allocated contour object"),

        returnDoc = returnDoc
    )

    int(
        "contour_add_edge",
        "Adds a new edge to the given contour and returns its associated segment handle.",

        msdf_contour_handle("contour", "a pointer to the contour to add a new edge (segment) to"),
        msdf_segment_handle("segment", "a pointer to the segment to add as an edge"),

        returnDoc = returnDoc
    )

    int(
        "contour_remove_edge",
        "Removes the given edge from the given contour if present.",

        msdf_contour_handle("contour", "a pointer to the contour to remove the given edge (segment) from"),
        msdf_segment_handle("segment", "a pointer to the segment to remove from the given contour"),

        returnDoc = returnDoc
    )

    int(
        "contour_get_edge_count",
        "Retrieves the edge count of the given contour.",

        msdf_contour_const_handle("contour", "a pointer to the contour to retrieve the edge count from"),
        Check(1)..size_t.p("count", "a pointer to a variable which is populated with the edge count of the given contour"),

        returnDoc = returnDoc
    )

    int(
        "contour_get_edge",
        "Retrieves an edge (segment) from the given contour at the given index.",

        msdf_contour_const_handle("contour", "a pointer to the contour from which to retrieve the given edge segment"),
        size_t("index", "the index from which to retrieve the edge segment"),
        Check(1)..msdf_segment_const_handle.p(
            "segment",
            "a pointer to an address which is populated with the address of the edge segment at the given index if present"
        ),

        returnDoc = returnDoc
    )

    int(
        "contour_bound",
        "Adjusts the given bounding box to fit at least the given contour.",

        msdf_contour_const_handle("contour", "a pointer to the contour which should at least fit into the given bounding box"),
        msdf_bounds.p("bounds", "a pointer to the bounding box to fit the given contour into"),

        returnDoc = returnDoc
    )

    int(
        "contour_bound_miters",
        "Adjust the given bounding box to fit at least the given contour including a specified border.",

        msdf_contour_const_handle("contour", "a pointer to the contour which should at least fit into the given bounding box"),
        msdf_bounds.p("bounds", "a pointer to the bounding box to fit the given contour including the specified border"),
        double("border", "the size of the border"),
        double("miter_limit", "the miter limit value"),
        int("polarity", "the miter polarity"),

        returnDoc = returnDoc
    )

    int(
        "contour_get_winding",
        "Retrieves the winding direction of the given contour.",

        msdf_contour_const_handle("contour", "a pointer to the contour of which to retrieve the winding direction"),
        Check(1)..int.p("winding", "a pointer to a variables which is populated with the winding direction of the given contour"),

        returnDoc = returnDoc
    )

    int(
        "contour_reverse",
        "Reverses the order of edges in the given contour.",

        msdf_contour_handle("contour", "a pointer to the contour which to reverse the edge order for"),

        returnDoc = returnDoc
    )

    void(
        "contour_free",
        "Calls the destructor of the given bitmap and frees its memory using the internal allocator.",

        msdf_contour_handle("contour", "a pointer to the contour to free")
    )

    // msdf_segment

    int(
        "segment_alloc",
        "Allocates a new segment of the given type and populates the given address with the address of the newly allocated segment.",

        int("type", "the type of segment to allocate", "SEGMENT_TYPE_\\w+"),
        Check(1)..msdf_segment_handle.p("segment", "a pointer to an address which is populated with the address of the newly allocated segment"),

        returnDoc = returnDoc
    )

    int(
        "segment_get_type",
        "Retrieves the type of the given segment.",

        msdf_segment_const_handle("segment", "a pointer to the segment of which to retrieve the type"),
        Check(1)..int.p("type", "a pointer to a variable which is populated with the type of the given segment"),

        returnDoc = returnDoc
    )

    int(
        "segment_get_point_count",
        "Retrieves the point count of the given segment.",

        msdf_segment_const_handle("segment", "a pointer to the segment of which to retrieve the number of points"),
        Check(1)..size_t.p("count", "a pointer to a variable which is populated with the number of points of the given segment"),

        returnDoc = returnDoc
    )

    int(
        "segment_get_point",
        "Retrieves a point at the given index from the given segment.",

        msdf_segment_const_handle("segment", "a pointer to the segment from which to retrieve a point"),
        size_t("index", "the index of the point to retrieve"),
        msdf_vector2.p("point", "a pointer to a point which is populated with the coordinates of the point at the given index if present"),

        returnDoc = returnDoc
    )

    int(
        "segment_set_point",
        "Sets the coordinates of a point at the given index in the given segment.",

        msdf_segment_handle("segment", "a pointer to the segment of which to set the point"),
        size_t("index", "the index of the point to set"),
        msdf_vector2.const.p("point", "a pointer to a point which is copied to the given index within the segment"),

        returnDoc = returnDoc
    )

    int(
        "segment_get_color",
        "Retrieves the color of the given segment.",

        msdf_segment_const_handle("segment", "a pointer to the segment of which to retrieve the color"),
        Check(1)..int.p(
            "color",
            "a pointer to a variable which is populated with the color of the given segment. Will be one of the constants prefixed with {@code MSDF_COLOR_}."
        ),

        returnDoc = returnDoc
    )

    int(
        "segment_set_color",
        "Sets the color of the given segment.",

        msdf_segment_handle("segment", "a pointer to the segment of which to set the color"),
        int("color", "the color to set", "EDGE_COLOR_\\w+"),

        returnDoc = returnDoc
    )

    int(
        "segment_get_direction",
        "Retrieves the direction of the given segment at the given point.",

        msdf_segment_const_handle("segment", "a pointer to the segment of which to retrieve the direction"),
        double("param", "the point at which to retrieve the segment direction"),
        msdf_vector2.p("direction", "a pointer to a variable which is populated with the direction of the given segment at the given point"),

        returnDoc = returnDoc
    )

    int(
        "segment_get_direction_change",
        "Retrieves the direction change of the given segment at the given point.",

        msdf_segment_const_handle("segment", "a pointer to the segment of which to retrieve the direction change"),
        double("param", "the point at which to retrieve the segment direction change"),
        msdf_vector2.p("direction_change", "a pointer to a variable which is populated with the direction change of the given segment at the given point"),

        returnDoc = returnDoc
    )

    int(
        "segment_point",
        "Retrieves the point on the given edge segment specified by the given parameter.",

        msdf_segment_const_handle("segment", "a pointer to the segment of which to retrieve the edge point"),
        double("param", "the point at which to sample"),
        msdf_vector2.p("point", "a pointer to a variable which is populated with the edge point at the given location from the given segment"),

        returnDoc = returnDoc
    )

    int(
        "segment_bound",
        "Adjusts the given bounding box to fit at least the given segment.",

        msdf_segment_const_handle("segment", "a pointer to the segment which should at least fit in the given bounding box"),
        msdf_bounds.p("bounds", "a pointer to the bounding box which should at least fit the given segment"),

        returnDoc = returnDoc
    )

    int(
        "segment_move_start_point",
        "Moves the start point of the given segment.",

        msdf_segment_handle("segment", "a pointer to the segment of which to adjust the start point"),
        msdf_vector2.const.p("point", "a pointer to the new start point of the given segment"),

        returnDoc = returnDoc
    )

    int(
        "segment_move_end_point",
        "Moves the end point of the given segment.",

        msdf_segment_handle("segment", "a pointer to the segment of which to adjust the end point"),
        msdf_vector2.const.p("point", "a pointer to the new end point of the given segment"),

        returnDoc = returnDoc
    )

    void(
        "segment_free",
        "Calls the destructor of the given segment and frees its memory using the internal allocator.",

        msdf_segment_handle("segment", "a pointer to the segment to free")
    )

    // Main API functions

    int(
        "generate_sdf",
        "",

        msdf_bitmap.p(
            "output",
            "a pointer to a bitmap that was allocated with #bitmap_alloc() to which the given shape is rendered. The bitmap must be of type #BITMAP_TYPE_SDF."
        ),
        msdf_shape_const_handle("shape", "a pointer to the shape to render to the given bitmap"),
        msdf_transform.const.p("transform", "the transform which is applied to the given shape during rendering"),

        returnDoc = returnDoc
    )

    int(
        "generate_psdf",
        "",

        msdf_bitmap.p(
            "output",
            "a pointer to a bitmap that was allocated with #bitmap_alloc() to which the given shape is rendered. The bitmap must be of type #BITMAP_TYPE_PSDF."
        ),
        msdf_shape_const_handle("shape", "a pointer to the shape to render to the given bitmap"),
        msdf_transform.const.p("transform", "the transform which is applied to the given shape during rendering"),

        returnDoc = returnDoc
    )

    int(
        "generate_msdf",
        "",

        msdf_bitmap.p(
            "output",
            "a pointer to a bitmap that was allocated with #bitmap_alloc() to which the given shape is rendered. The bitmap must be of type #BITMAP_TYPE_MSDF."
        ),
        msdf_shape_const_handle("shape", "a pointer to the shape to render to the given bitmap"),
        msdf_transform.const.p("transform", "the transform which is applied to the given shape during rendering"),

        returnDoc = returnDoc
    )

    int(
        "generate_mtsdf",
        "",

        msdf_bitmap.p(
            "output",
            "a pointer to a bitmap that was allocated with #bitmap_alloc() to which the given shape is rendered. The bitmap must be of type #BITMAP_TYPE_MTSDF."
        ),
        msdf_shape_const_handle("shape", "a pointer to the shape to render to the given bitmap"),
        msdf_transform.const.p("transform", "the transform which is applied to the given shape during rendering"),

        returnDoc = returnDoc
    )

    int(
        "generate_sdf_with_config",
        "",

        msdf_bitmap.p(
            "output",
            "a pointer to a bitmap that was allocated with #bitmap_alloc() to which the given shape is rendered. The bitmap must be of type #BITMAP_TYPE_SDF."
        ),
        msdf_shape_const_handle("shape", "a pointer to the shape to render to the given bitmap"),
        msdf_transform.const.p("transform", "the transform which is applied to the given shape during rendering"),
        msdf_config.const.p("config", "a pointer to the config which is applied to the sprite generator before rendering"),

        returnDoc = returnDoc
    )

    int(
        "generate_psdf_with_config",
        "",

        msdf_bitmap.p(
            "output",
            "a pointer to a bitmap that was allocated with #bitmap_alloc() to which the given shape is rendered. The bitmap must be of type #BITMAP_TYPE_PSDF."
        ),
        msdf_shape_const_handle("shape", "a pointer to the shape to render to the given bitmap"),
        msdf_transform.const.p("transform", "the transform which is applied to the given shape during rendering"),
        msdf_config.const.p("config", "a pointer to the config which is applied to the sprite generator before rendering"),

        returnDoc = returnDoc
    )

    int(
        "generate_msdf_with_config",
        "",

        msdf_bitmap.p(
            "output",
            "a pointer to a bitmap that was allocated with #bitmap_alloc() to which the given shape is rendered. The bitmap must be of type #BITMAP_TYPE_MSDF."
        ),
        msdf_shape_const_handle("shape", "a pointer to the shape to render to the given bitmap"),
        msdf_transform.const.p("transform", "the transform which is applied to the given shape during rendering"),
        msdf_multichannel_config.const.p("config", "a pointer to the config which is applied to the sprite generator before rendering"),

        returnDoc = returnDoc
    )

    int(
        "generate_mtsdf_with_config",
        "",

        msdf_bitmap.p(
            "output",
            "a pointer to a bitmap that was allocated with #bitmap_alloc() to which the given shape is rendered. The bitmap must be of type #BITMAP_TYPE_MTSDF."
        ),
        msdf_shape_const_handle("shape", "A pointer to the shape to render to the given bitmap."),
        msdf_transform.const.p("transform", "the transform which is applied to the given shape during rendering"),
        msdf_multichannel_config.const.p("config", "a pointer to the config which is applied to the sprite generator before rendering"),

        returnDoc = returnDoc
    )
}