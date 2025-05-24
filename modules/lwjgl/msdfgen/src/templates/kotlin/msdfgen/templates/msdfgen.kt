/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package msdfgen.templates

import msdfgen.*
import org.lwjgl.generator.*

val msdfGen = "MSDFGen".nativeClass(Module.MSDFGEN, prefix = "MSDF", prefixMethod = "msdf_") {
    nativeImport("msdfgen-c.h")

    // Constants

    IntConstant("FALSE".."0")
    IntConstant("TRUE".."1")

    EnumConstant(
        "SUCCESS".enum("0"),
        "ERR_FAILED".enum,
        "ERR_INVALID_ARG".enum,
        "ERR_INVALID_TYPE".enum,
        "ERR_INVALID_SIZE".enum,
        "ERR_INVALID_INDEX".enum
    )

    EnumConstant(
        "BITMAP_TYPE_SDF".enum("0"),
        "BITMAP_TYPE_PSDF".enum,
        "BITMAP_TYPE_MSDF".enum,
        "BITMAP_TYPE_MTSDF".enum
    )

    EnumConstant(
        "SEGMENT_TYPE_LINEAR".enum("0"),
        "SEGMENT_TYPE_QUADRATIC".enum,
        "SEGMENT_TYPE_CUBIC".enum
    )

    EnumConstant(
        "EDGE_COLOR_BLACK".enum("0"),
        "EDGE_COLOR_RED".enum,
        "EDGE_COLOR_GREEN".enum,
        "EDGE_COLOR_YELLOW".enum,
        "EDGE_COLOR_BLUE".enum,
        "EDGE_COLOR_MAGENTA".enum,
        "EDGE_COLOR_CYAN".enum,
        "EDGE_COLOR_WHITE".enum
    )

    EnumConstant(
        "ERROR_CORRECTION_MODE_DISABLED".enum("0"),
        "ERROR_CORRECTION_MODE_INDISCRIMINATE".enum,
        "ERROR_CORRECTION_MODE_EDGE_PRIORITY".enum,
        "ERROR_CORRECTION_MODE_EDGE_ONLY".enum
    )

    EnumConstant(
        "DISTANCE_CHECK_MODE_NONE".enum("0"),
        "DISTANCE_CHECK_MODE_AT_EDGE".enum,
        "DISTANCE_CHECK_MODE_ALWAYS".enum
    )
    
    // msdf_bitmap

    int(
        "bitmap_alloc",

        int("type"),
        int("width"),
        int("height"),
        msdf_bitmap.p("bitmap")
    )

    int(
        "bitmap_get_channel_count",

        msdf_bitmap.const.p("bitmap"),
        Check(1)..int.p("channel_count")
    )

    int(
        "bitmap_get_pixels",

        msdf_bitmap.const.p("bitmap"),
        Check(1)..void.p.p("pixels")
    )

    int(
        "bitmap_get_byte_size",

        msdf_bitmap.const.p("bitmap"),
        Check(1)..size_t.p("size")
    )

    void(
        "bitmap_free",

        msdf_bitmap.p("bitmap")
    )

    // msdf_shape

    int(
        "shape_alloc",

        Check(1)..msdf_shape_handle.p("shape")
    )

    int(
        "shape_get_bounds",

        msdf_shape_const_handle("shape"),
        msdf_bounds.p("bounds")
    )

    int(
        "shape_add_contour",

        msdf_shape_handle("shape"),
        Check(1)..msdf_contour_const_handle.p("contour")
    )

    int(
        "shape_remove_contour",

        msdf_shape_handle("shape"),
        msdf_contour_const_handle("contour")
    )

    int(
        "shape_get_contour_count",

        msdf_shape_const_handle("shape"),
        Check(1)..size_t.p("size")
    )

    int(
        "shape_get_contour",

        msdf_shape_const_handle("shape"),
        size_t("index"),
        Check(1)..msdf_contour_const_handle.p("contour")
    )

    int(
        "shape_get_edge_count",

        msdf_shape_const_handle("shape"),
        Check(1)..size_t.p("count")
    )

    int(
        "shape_has_inverse_y_axis",

        msdf_shape_const_handle("shape"),
        Check(1)..int.p("inverse_y_axis")
    )

    int(
        "shape_normalize",

        msdf_shape_handle("shape")
    )

    int(
        "shape_validate",

        msdf_shape_handle("shape"),
        Check(1)..int.p("result")
    )

    int(
        "shape_bound",

        msdf_shape_const_handle("shape"),
        msdf_bounds.p("bounds")
    )

    int(
        "shape_bound_miters",

        msdf_shape_const_handle("shape"),
        msdf_bounds.p("bounds"),
        double("border"),
        double("miter_limit"),
        int("polarity")
    )

    int(
        "shape_orient_contours",

        msdf_shape_handle("shape")
    )

    int(
        "shape_edge_colors_simple",

        msdf_shape_handle("shape"),
        double("angle_threshold")
    )

    int(
        "shape_edge_colors_ink_trap",

        msdf_shape_handle("shape"),
        double("angle_threshold")
    )

    int(
        "shape_edge_colors_by_distance",

        msdf_shape_handle("shape"),
        double("angle_threshold")
    )

    int(
        "shape_one_shot_distance",

        msdf_shape_const_handle("shape"),
        msdf_vector2.const.p("origin"),
        Check(1)..double.p("distance")
    )

    void(
        "shape_free",

        msdf_shape_handle("shape")
    )

    // msdf_contour

    int(
        "contour_alloc",

        Check(1)..msdf_contour_handle.p("contour")
    )

    int(
        "contour_add_edge",

        msdf_contour_handle("contour"),
        msdf_segment_handle("segment")
    )

    int(
        "contour_remove_edge",

        msdf_contour_handle("contour"),
        msdf_segment_handle("segment")
    )

    int(
        "contour_get_edge_count",

        msdf_contour_const_handle("contour"),
        Check(1)..size_t.p("count")
    )

    int(
        "contour_get_edge",

        msdf_contour_const_handle("contour"),
        size_t("index"),
        Check(1)..msdf_segment_const_handle.p("segment")
    )

    int(
        "contour_bound",

        msdf_contour_const_handle("contour"),
        msdf_bounds.p("bounds")
    )

    int(
        "contour_bound_miters",

        msdf_contour_const_handle("contour"),
        msdf_bounds.p("bounds"),
        double("border"),
        double("miter_limit"),
        int("polarity")
    )

    int(
        "contour_get_winding",

        msdf_contour_const_handle("contour"),
        Check(1)..int.p("winding")
    )

    int(
        "contour_reverse",

        msdf_contour_handle("contour")
    )

    void(
        "contour_free",

        msdf_contour_handle("contour")
    )

    // msdf_segment

    int(
        "segment_alloc",

        int("type"),
        Check(1)..msdf_segment_handle.p("segment")
    )

    int(
        "segment_get_type",

        msdf_segment_const_handle("segment"),
        Check(1)..int.p("type")
    )

    int(
        "segment_get_point_count",

        msdf_segment_const_handle("segment"),
        Check(1)..size_t.p("count")
    )

    int(
        "segment_get_point",

        msdf_segment_const_handle("segment"),
        size_t("index"),
        msdf_vector2.p("point")
    )

    int(
        "segment_set_point",

        msdf_segment_handle("segment"),
        size_t("index"),
        msdf_vector2.const.p("point")
    )

    int(
        "segment_get_color",

        msdf_segment_const_handle("segment"),
        Check(1)..int.p("color")
    )

    int(
        "segment_set_color",

        msdf_segment_handle("segment"),
        int("color")
    )

    int(
        "segment_get_direction",

        msdf_segment_const_handle("segment"),
        double("param"),
        msdf_vector2.p("direction")
    )

    int(
        "segment_get_direction_change",

        msdf_segment_const_handle("segment"),
        double("param"),
        msdf_vector2.p("direction_change")
    )

    int(
        "segment_point",

        msdf_segment_const_handle("segment"),
        double("param"),
        msdf_vector2.p("point")
    )

    int(
        "segment_bound",

        msdf_segment_const_handle("segment"),
        msdf_bounds.p("bounds")
    )

    int(
        "segment_move_start_point",

        msdf_segment_handle("segment"),
        msdf_vector2.const.p("point")
    )

    int(
        "segment_move_end_point",

        msdf_segment_handle("segment"),
        msdf_vector2.const.p("point")
    )

    void(
        "segment_free",

        msdf_segment_handle("segment")
    )

    // Main API functions

    int(
        "generate_sdf",

        msdf_bitmap.p("output"),
        msdf_shape_const_handle("shape"),
        msdf_transform.const.p("transform")
    )

    int(
        "generate_psdf",

        msdf_bitmap.p("output"),
        msdf_shape_const_handle("shape"),
        msdf_transform.const.p("transform")
    )

    int(
        "generate_msdf",

        msdf_bitmap.p("output"),
        msdf_shape_const_handle("shape"),
        msdf_transform.const.p("transform")
    )

    int(
        "generate_mtsdf",

        msdf_bitmap.p("output"),
        msdf_shape_const_handle("shape"),
        msdf_transform.const.p("transform")
    )

    int(
        "generate_sdf_with_config",

        msdf_bitmap.p("output"),
        msdf_shape_const_handle("shape"),
        msdf_transform.const.p("transform"),
        msdf_config.const.p("config")
    )

    int(
        "generate_psdf_with_config",

        msdf_bitmap.p("output"),
        msdf_shape_const_handle("shape"),
        msdf_transform.const.p("transform"),
        msdf_config.const.p("config")
    )

    int(
        "generate_msdf_with_config",

        msdf_bitmap.p("output"),
        msdf_shape_const_handle("shape"),
        msdf_transform.const.p("transform"),
        msdf_multichannel_config.const.p("config")
    )

    int(
        "generate_mtsdf_with_config",

        msdf_bitmap.p("output"),
        msdf_shape_const_handle("shape"),
        msdf_transform.const.p("transform"),
        msdf_multichannel_config.const.p("config")
    )

    int(
        "render_sdf",

        msdf_bitmap.p("output"),
        msdf_bitmap.p("sdf")
    )
}