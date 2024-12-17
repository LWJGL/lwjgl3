/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb.templates

import org.lwjgl.generator.*
import stb.*

val stb_image_resize = "STBImageResize".nativeClass(Module.STB, prefix = "STBIR", prefixMethod = "stbir_") {
    includeSTBAPI(
        """#include "lwjgl_malloc.h"
#define STBIR_MALLOC(size,user_data) org_lwjgl_malloc(size)
#define STBIR_FREE(ptr,user_data)    org_lwjgl_free(ptr)
#define STBIR_ASSERT(x)
#define STB_IMAGE_RESIZE_IMPLEMENTATION
#define STB_IMAGE_RESIZE_STATIC
#include "stb_image_resize2.h"""")

    EnumConstant(
        "1CHANNEL".enum("1"),
        "2CHANNEL".enum,
        "RGB".enum,
        "BGR".enum("0"),
        "4CHANNEL".enum("5"),
        "RGBA".enum("4"),
        "BGRA".enum("6"),
        "ARGB".enum,
        "ABGR".enum,
        "RA".enum,
        "AR".enum,
        "RGBA_PM".enum,
        "BGRA_PM".enum,
        "ARGB_PM".enum,
        "ABGR_PM".enum,
        "RA_PM".enum,
        "AR_PM".enum,
        "RGBA_NO_AW".enum("11"),
        "BGRA_NO_AW".enum,
        "ARGB_NO_AW".enum,
        "ABGR_NO_AW".enum,
        "RA_NO_AW".enum,
        "AR_NO_AW".enum
    )

    customMethod("""
    private static final int[] stbir_pixel_layout_channels = {
        3, 1, 2, 3, 4,
        4, 4, 4, 4, 2, 2,
        4, 4, 4, 4, 2, 2,
    };

    private static int calculateBufferSize(int width, int height, int stride_in_bytes, int pixel_type, int type_size) {
        return height * (stride_in_bytes == 0 ? width * stbir_pixel_layout_channels[pixel_type] * type_size : stride_in_bytes);
    }""")

    // Simple-complexity API

    Code(javaInit = statement(
        code = "$t${t}int length = calculateBufferSize(output_w, output_h, output_stride_in_bytes, pixel_type, 1);",
        applyTo = ApplyTo.NORMAL
    ))..
    MapPointer("length")..
    OffHeapOnly..
    unsigned_char.p(
        "resize_uint8_srgb",

        Unsafe..unsigned_char.const.p("input_pixels"),
        int("input_w"),
        int("input_h"),
        int("input_stride_in_bytes"),
        Check("length")..nullable..unsigned_char.p("output_pixels"),
        int("output_w"),
        int("output_h"),
        int("output_stride_in_bytes"),
        stbir_pixel_layout("pixel_type")
    )

    Code(javaInit = statement(
        code = "$t${t}int length = calculateBufferSize(output_w, output_h, output_stride_in_bytes, pixel_type, 1);",
        applyTo = ApplyTo.NORMAL
    ))..
    MapPointer("length")..
    OffHeapOnly..
    unsigned_char.p(
        "resize_uint8_linear",

        Unsafe..unsigned_char.const.p("input_pixels"),
        int("input_w"),
        int("input_h"),
        int("input_stride_in_bytes"),
        Check("length")..nullable..unsigned_char.p("output_pixels"),
        int("output_w"),
        int("output_h"),
        int("output_stride_in_bytes"),
        stbir_pixel_layout("pixel_type")
    )

    Code(javaInit = statement(
        code = "$t${t}int length = calculateBufferSize(output_w, output_h, output_stride_in_bytes, pixel_type, 4);",
        applyTo = ApplyTo.NORMAL
    ))..
    MapPointer("length")..
    OffHeapOnly..
    float.p(
        "resize_float_linear",

        Unsafe..float.const.p("input_pixels"),
        int("input_w"),
        int("input_h"),
        int("input_stride_in_bytes"),
        Check("length")..nullable..float.p("output_pixels"),
        int("output_w"),
        int("output_h"),
        int("output_stride_in_bytes"),
        stbir_pixel_layout("pixel_type")
    )

    // Medium-complexity API

    EnumConstant(
        "EDGE_CLAMP".enum("0"),
        "EDGE_REFLECT".enum,
        "EDGE_WRAP".enum,
        "EDGE_ZERO".enum
    )

    EnumConstant(
        "FILTER_DEFAULT".enum("0"),
        "FILTER_BOX".enum,
        "FILTER_TRIANGLE".enum,
        "FILTER_CUBICBSPLINE".enum,
        "FILTER_CATMULLROM".enum,
        "FILTER_MITCHELL".enum,
        "FILTER_POINT_SAMPLE".enum,
        "FILTER_OTHER".enum
    )

    EnumConstant(
        "TYPE_UINT8".enum("0"),
        "TYPE_UINT8_SRGB".enum,
        "TYPE_UINT8_SRGB_ALPHA".enum,
        "TYPE_UINT16".enum,
        "TYPE_FLOAT".enum,
        "TYPE_HALF_FLOAT".enum
    )

    customMethod("""
    private static final int[] stbir_type_size = {
        1, 1, 1, 2, 4, 2
    };""")

    Code(javaInit = statement(
        code = "$t${t}int length = calculateBufferSize(output_w, output_h, output_stride_in_bytes, pixel_layout, stbir_type_size[data_type]);",
        applyTo = ApplyTo.NORMAL
    ))..
    MapPointer("length")..
    OffHeapOnly..
    void.p(
        "resize",

        Unsafe..void.const.p("input_pixels"),
        int("input_w"),
        int("input_h"),
        int("input_stride_in_bytes"),
        Check("length")..nullable..void.p("output_pixels"),
        int("output_w"),
        int("output_h"),
        int("output_stride_in_bytes"),
        stbir_pixel_layout("pixel_layout"),
        stbir_datatype("data_type"),
        stbir_edge("edge"),
        stbir_filter("filter")
    )

    // Extended-complexity API

    void(
        "resize_init",

        STBIR_RESIZE.p("resize"),
        Unsafe..void.const.p("input_pixels"),
        int("input_w"),
        int("input_h"),
        int("input_stride_in_bytes"),
        Check("calculateBufferSize(output_w, output_h, output_stride_in_bytes, pixel_layout, stbir_type_size[data_type])")..nullable..void.p("output_pixels"),
        int("output_w"),
        int("output_h"),
        int("output_stride_in_bytes"),
        stbir_pixel_layout("pixel_layout"),
        stbir_datatype("data_type")
    )

    void(
        "set_datatypes",

        STBIR_RESIZE.p("resize"),
        stbir_datatype("input_type"),
        stbir_datatype("output_type")
    )

    void(
        "set_pixel_callbacks",

        STBIR_RESIZE.p("resize"),
        nullable..stbir_input_callback("input_cb"),
        nullable..stbir_output_callback("output_cb")

    )

    void(
        "set_user_data",

        STBIR_RESIZE.p("resize"),
        nullable..opaque_p("user_data")
    )

    void(
        "set_buffer_ptrs",

        STBIR_RESIZE.p("resize"),
        Unsafe..void.const.p("input_pixels"),
        int("input_stride_in_bytes"),
        Unsafe..nullable..void.p("output_pixels"),
        int("output_stride_in_bytes")
    )

    int(
        "set_pixel_layouts",

        STBIR_RESIZE.p("resize"),
        stbir_pixel_layout("input_pixel_layout"),
        stbir_pixel_layout("output_pixel_layout")
    )

    int(
        "set_edgemodes",

        STBIR_RESIZE.p("resize"),
        stbir_edge("horizontal_edge"),
        stbir_edge("vertical_edge")
    )

    int(
        "set_filters",

        STBIR_RESIZE.p("resize"),
        stbir_filter("horizontal_filter"),
        stbir_filter("vertical_filter")
    )

    int(
        "set_filter_callbacks",

        STBIR_RESIZE.p("resize"),
        nullable..stbir__kernel_callback("horizontal_filter"),
        nullable..stbir__support_callback("horizontal_support"),
        nullable..stbir__kernel_callback("vertical_filter"),
        nullable..stbir__support_callback("vertical_support")
    )

    int(
        "set_pixel_subrect",

        STBIR_RESIZE.p("resize"),
        int("subx"),
        int("suby"),
        int("subw"),
        int("subh")
    )

    int(
        "set_input_subrect",

        STBIR_RESIZE.p("resize"),
        double("s0"),
        double("t0"),
        double("s1"),
        double("t1")
    )

    int(
        "set_output_pixel_subrect",

        STBIR_RESIZE.p("resize"),
        int("subx"),
        int("suby"),
        int("subw"),
        int("subh")
    )

    int(
        "set_non_pm_alpha_speed_over_quality",

        STBIR_RESIZE.p("resize"),
        intb("non_pma_alpha_speed_over_quality")
    )


    int(
        "build_samplers",

        STBIR_RESIZE.p("resize")
    )

    void(
        "free_samplers",

        STBIR_RESIZE.p("resize")
    )

    int(
        "resize_extended",

        STBIR_RESIZE.p("resize")
    )

    int(
        "build_samplers_with_splits",

        STBIR_RESIZE.p("resize"),
        int("try_splits")
    )

    int(
        "resize_extended_split",

        STBIR_RESIZE.p("resize"),
        int("split_start"),
        int("split_count")
    )
}