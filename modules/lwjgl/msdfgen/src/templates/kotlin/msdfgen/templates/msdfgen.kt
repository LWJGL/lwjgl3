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
        "",
        Unsafe..msdf_allocator.const.p("allocator", "")
    )
    Unsafe..msdf_allocator.const.p(
        "allocator_get",
        ""
    )

    // msdf_bitmap

    int(
        "bitmap_alloc",
        "",
        int("type", ""),
        int("width", ""),
        int("height", ""),
        Unsafe..msdf_bitmap.p.p("bitmap", "")
    )
    int(
        "bitmap_get_channel_count",
        "",
        Unsafe..msdf_bitmap.const.p("bitmap", ""),
        Unsafe..int.p("channel_count", "")
    )
    int(
        "bitmap_get_pixels",
        "",
        Unsafe..msdf_bitmap.const.p("bitmap", ""),
        Unsafe..void.p.p("pixels", "")
    )
    int(
        "bitmap_get_size",
        "",
        Unsafe..msdf_bitmap.const.p("bitmap", ""),
        Unsafe..size_t.p("size", "")
    )
    void(
        "bitmap_free",
        "",
        Unsafe..msdf_bitmap.p("bitmap", "")
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
        Unsafe..msdf_shape_handle("shape", ""),
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
        Unsafe..msdf_shape_handle("shape", ""),
        Unsafe..size_t.p("size", "")
    )
    int(
        "shape_get_contour",
        "",
        Unsafe..msdf_shape_handle("shape", ""),
        size_t("index", ""),
        Unsafe..msdf_contour_handle.p("contour", "")
    )
    int(
        "shape_get_edge_count",
        "",
        Unsafe..msdf_shape_handle("shape", ""),
        Unsafe..size_t.p("count", "")
    )
    int(
        "shape_has_inverse_y_axis",
        "",
        Unsafe..msdf_shape_handle("shape", ""),
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
        Unsafe..msdf_shape_handle("shape", ""),
        Unsafe..msdf_bounds.p("bounds", "")
    )
    int(
        "shape_bound_miters",
        "",
        Unsafe..msdf_shape_handle("shape", ""),
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
        Unsafe..msdf_edge_holder_handle.p("edge", "")
    )
    int(
        "contour_get_edge_count",
        "",
        Unsafe..msdf_contour_handle("contour", ""),
        Unsafe..size_t.p("count", "")
    )
    int(
        "contour_get_edge",
        "",
        Unsafe..msdf_contour_handle("contour", ""),
        size_t("index", ""),
        Unsafe..msdf_edge_holder_handle.p("edge", "")
    )
    int(
        "contour_bound",
        "",
        Unsafe..msdf_contour_handle("contour", ""),
        Unsafe..msdf_bounds.p("bounds", "")
    )
    int(
        "contour_bound_miters",
        "",
        Unsafe..msdf_contour_handle("contour", ""),
        Unsafe..msdf_bounds.p("bounds", ""),
        double("border", ""),
        double("miter_limit", ""),
        int("polarity", "")
    )
    int(
        "contour_get_winding",
        "",
        Unsafe..msdf_contour_handle("contour", ""),
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

    // msdf_edge

    int(
        "edge_alloc",
        "",
        Unsafe..msdf_segment.p("segment", ""),
        Unsafe..msdf_edge_holder_handle.p("edge", "")
    )
    void(
        "edge_free",
        "",
        Unsafe..msdf_edge_holder_handle("edge", "")
    )

    // msdf_segment

    int(
        "segment_alloc",
        "",
        int("type", ""),
        Unsafe..msdf_segment.p.p("segment", "")
    )
    int(
        "segment_get_point_count",
        "",
        Unsafe..msdf_segment.const.p("segment", ""),
        Unsafe..size_t.p("count", "")
    )
    int(
        "segment_get_point",
        "",
        Unsafe..msdf_segment.const.p("segment", ""),
        size_t("index", ""),
        Unsafe..msdf_vector2.p("point", "")
    )
    int(
        "segment_set_point",
        "",
        Unsafe..msdf_segment.p("segment", ""),
        size_t("index", ""),
        Unsafe..msdf_vector2.const.p("point", "")
    )
    int(
        "segment_get_color",
        "",
        Unsafe..msdf_segment.const.p("segment", ""),
        Unsafe..int.p("color", "")
    )
    int(
        "segment_set_color",
        "",
        Unsafe..msdf_segment.p("segment", ""),
        int("color", "")
    )
    int(
        "segment_get_direction",
        "",
        Unsafe..msdf_segment.const.p("segment", ""),
        double("param", ""),
        Unsafe..msdf_vector2.p("direction", "")
    )
    int(
        "segment_get_direction_change",
        "",
        Unsafe..msdf_segment.const.p("segment", ""),
        double("param", ""),
        Unsafe..msdf_vector2.p("direction_change", "")
    )
    int(
        "segment_point",
        "",
        Unsafe..msdf_segment.const.p("segment", ""),
        double("param", ""),
        Unsafe..msdf_vector2.p("point", "")
    )
    int(
        "segment_bound",
        "",
        Unsafe..msdf_segment.const.p("segment", ""),
        Unsafe..msdf_bounds.p("bounds", "")
    )
    int(
        "segment_move_start_point",
        "",
        Unsafe..msdf_segment.p("segment", ""),
        Unsafe..msdf_vector2.const.p("point", "")
    )
    int(
        "segment_move_end_point",
        "",
        Unsafe..msdf_segment.p("segment", ""),
        Unsafe..msdf_vector2.const.p("point", "")
    )
    void(
        "segment_free",
        "",
        Unsafe..msdf_segment.p("segment", "")
    )
}