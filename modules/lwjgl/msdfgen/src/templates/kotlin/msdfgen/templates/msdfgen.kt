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
}