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

    documentation = "Native bindings to stb_image_resize2.h from the ${url("https://github.com/nothings/stb", "stb library")}."

    EnumConstant(
        """
        {@code stbir_pixel_layout} specifies:
        ${ul(
            "number of channels",
            "order of channels",
            "whether color is premultiplied by alpha"
        )}
        """,

        "BGR".enum("", "0"),
        "1CHANNEL".enum,
        "2CHANNEL".enum,
        "RGB".enum,
        "RGBA".enum,
        "4CHANNEL".enum,
        "BGRA".enum,
        "ARGB".enum,
        "ABGR".enum,
        "RA".enum,
        "AR".enum,
        "RGBA_PM".enum,
        "BGRA_PM".enum,
        "ARGB_PM".enum,
        "ABGR_PM".enum,
        "RA_PM".enum,
        "AR_PM".enum
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
        "",

        Unsafe..unsigned_char.const.p("input_pixels", ""),
        int("input_w", ""),
        int("input_h", ""),
        int("input_stride_in_bytes", ""),
        Check("length")..nullable..unsigned_char.p("output_pixels", ""),
        int("output_w", ""),
        int("output_h", ""),
        int("output_stride_in_bytes", ""),
        stbir_pixel_layout("pixel_type", "")
    )

    Code(javaInit = statement(
        code = "$t${t}int length = calculateBufferSize(output_w, output_h, output_stride_in_bytes, pixel_type, 1);",
        applyTo = ApplyTo.NORMAL
    ))..
    MapPointer("length")..
    OffHeapOnly..
    unsigned_char.p(
        "resize_uint8_linear",
        "",

        Unsafe..unsigned_char.const.p("input_pixels", ""),
        int("input_w", ""),
        int("input_h", ""),
        int("input_stride_in_bytes", ""),
        Check("length")..nullable..unsigned_char.p("output_pixels", ""),
        int("output_w", ""),
        int("output_h", ""),
        int("output_stride_in_bytes", ""),
        stbir_pixel_layout("pixel_type", "")
    )

    Code(javaInit = statement(
        code = "$t${t}int length = calculateBufferSize(output_w, output_h, output_stride_in_bytes, pixel_type, 4);",
        applyTo = ApplyTo.NORMAL
    ))..
    MapPointer("length")..
    OffHeapOnly..
    float.p(
        "resize_float_linear",
        "",

        Unsafe..float.const.p("input_pixels", ""),
        int("input_w", ""),
        int("input_h", ""),
        int("input_stride_in_bytes", ""),
        Check("length")..nullable..float.p("output_pixels", ""),
        int("output_w", ""),
        int("output_h", ""),
        int("output_stride_in_bytes", ""),
        stbir_pixel_layout("pixel_type", "")
    )

    // Medium-complexity API

    EnumConstant(
        "{@code stbir_edge}",

        "EDGE_CLAMP".enum("", "0"),
        "EDGE_REFLECT".enum,
        "EDGE_WRAP".enum("This edge mode is slower and uses more memory."),
        "EDGE_ZERO".enum
    )

    EnumConstant(
        "{@code stbir_filter}",

        "FILTER_DEFAULT".enum("Use same filter type that easy-to-use API chooses.", "0"),
        "FILTER_BOX".enum("A trapezoid w/1-pixel wide ramps, same result as box for integer scale ratios."),
        "FILTER_TRIANGLE".enum("On upsampling, produces same results as bilinear texture filtering."),
        "FILTER_CUBICBSPLINE".enum("The cubic b-spline (aka Mitchell-Netrevalli with {@code B=1,C=0}), gaussian-esque."),
        "FILTER_CATMULLROM".enum("An interpolating cubic spline."),
        "FILTER_MITCHELL".enum("Mitchell-Netrevalli filter with {@code B=1/3,C=1/3}."),
        "FILTER_POINT_SAMPLE".enum("Simple point sampling."),
        "FILTER_OTHER".enum("User callback specified.")
    )

    EnumConstant(
        "{@code stbir_datatype}",

        "TYPE_UINT8".enum("", "0"),
        "TYPE_UINT8_SRGB".enum,
        "TYPE_UINT8_SRGB_ALPHA".enum("Alpha channel, when present, should also be SRGB (this is very unusual)."),
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
        "",

        Unsafe..void.const.p("input_pixels", ""),
        int("input_w", ""),
        int("input_h", ""),
        int("input_stride_in_bytes", ""),
        Check("length")..nullable..void.p("output_pixels", ""),
        int("output_w", ""),
        int("output_h", ""),
        int("output_stride_in_bytes", ""),
        stbir_pixel_layout("pixel_layout", ""),
        stbir_datatype("data_type", ""),
        stbir_edge("edge", ""),
        stbir_filter("filter", "")
    )

    // Extended-complexity API

    void(
        "resize_init",
        "",

        STBIR_RESIZE.p("resize", ""),
        Unsafe..void.const.p("input_pixels", ""),
        int("input_w", ""),
        int("input_h", ""),
        int("input_stride_in_bytes", ""),
        Check("calculateBufferSize(output_w, output_h, output_stride_in_bytes, pixel_layout, stbir_type_size[data_type])")..nullable..void.p("output_pixels", ""),
        int("output_w", ""),
        int("output_h", ""),
        int("output_stride_in_bytes", ""),
        stbir_pixel_layout("pixel_layout", ""),
        stbir_datatype("data_type", "")
    )

    void(
        "set_datatypes",
        "",

        STBIR_RESIZE.p("resize", ""),
        stbir_datatype("input_type", ""),
        stbir_datatype("output_type", "")
    )

    void(
        "set_pixel_callbacks",
        "",

        STBIR_RESIZE.p("resize", ""),
        nullable..stbir_input_callback("input_cb", ""),
        nullable..stbir_output_callback("output_cb", "")

    )

    void(
        "set_user_data",
        "",

        STBIR_RESIZE.p("resize", ""),
        nullable..opaque_p("user_data", "")
    )

    void(
        "set_buffer_ptrs",
        "",

        STBIR_RESIZE.p("resize", ""),
        Unsafe..void.const.p("input_pixels", ""),
        int("input_stride_in_bytes", ""),
        Unsafe..nullable..void.p("output_pixels", ""),
        int("output_stride_in_bytes", "")
    )

    int(
        "set_pixel_layouts",
        "Sets new buffer layouts.",

        STBIR_RESIZE.p("resize", ""),
        stbir_pixel_layout("input_pixel_layout", ""),
        stbir_pixel_layout("output_pixel_layout", "")
    )

    int(
        "set_edgemodes",
        "",

        STBIR_RESIZE.p("resize", ""),
        stbir_edge("horizontal_edge", ""),
        stbir_edge("vertical_edge", "")
    )

    int(
        "set_filters",
        "",

        STBIR_RESIZE.p("resize", ""),
        stbir_filter("horizontal_filter", ""),
        stbir_filter("vertical_filter", "")
    )

    int(
        "set_filter_callbacks",
        "",

        STBIR_RESIZE.p("resize", ""),
        nullable..stbir__kernel_callback("horizontal_filter", ""),
        nullable..stbir__support_callback("horizontal_support", ""),
        nullable..stbir__kernel_callback("vertical_filter", ""),
        nullable..stbir__support_callback("vertical_support", "")
    )

    int(
        "set_pixel_subrect",
        "Sets input sub-region (full region by default).",

        STBIR_RESIZE.p("resize", ""),
        int("subx", ""),
        int("suby", ""),
        int("subw", ""),
        int("subh", "")
    )

    int(
        "set_input_subrect",
        "",

        STBIR_RESIZE.p("resize", ""),
        double("s0", ""),
        double("t0", ""),
        double("s1", ""),
        double("t1", "")
    )

    int(
        "set_output_pixel_subrect",
        "Sets output sub-region (full region by default).",

        STBIR_RESIZE.p("resize", ""),
        int("subx", ""),
        int("suby", ""),
        int("subw", ""),
        int("subh", "")
    )

    int(
        "set_non_pm_alpha_speed_over_quality",
        """
        When inputting AND outputting non-premultiplied alpha pixels, we use a slower but higher quality technique that fills the zero alpha pixel's RGB values
        with something plausible. If you don't care about areas of zero alpha, you can call this function to get about a 25% speed improvement for #RGBA to
        {@code STBIR_RGBA} types of resizes.
        """,

        STBIR_RESIZE.p("resize", ""),
        intb("non_pma_alpha_speed_over_quality", "")
    )


    int(
        "build_samplers",
        "Builds the samplers and does one allocation.",

        STBIR_RESIZE.p("resize", "")
    )

    void(
        "free_samplers",
        "You MUST call this, if you call #build_samplers() or #build_samplers_with_splits().",

        STBIR_RESIZE.p("resize", "")
    )

    int(
        "resize_extended",
        "The main function to perform the resize synchronously on one thread.",

        STBIR_RESIZE.p("resize", "")
    )

    int(
        "build_samplers_with_splits",
        """
        Build samplers for threading.

        You can pass in the number of threads you'd like to use ({@code try_splits}). It returns the number of splits (threads) that you can call it with. It
        might be less if the image resize can't be split up that many ways.
        """,

        STBIR_RESIZE.p("resize", ""),
        int("try_splits", "")
    )

    int(
        "resize_extended_split",
        """
        This function does a split of the resizing (you call this fuction for each split, on multiple threads). A split is a piece of the output resize pixel
        space.

        Note that you MUST call #build_samplers_with_splits() before {@code stbir_resize_extended_split}!

        Usually, you will always call {@code stbir_resize_extended_split} with {@code split_start} as the {@code thread_index} and "1" for the
        {@code split_count}. But, if you have a weird situation where you MIGHT want 8 threads, but sometimes only 4 threads, you can use 0,2,4,6 for the
        {@code split_start}'s and use "2" for the {@code split_count} each time to turn in into a 4 thread resize. (This is unusual).
        """,

        STBIR_RESIZE.p("resize", ""),
        int("split_start", ""),
        int("split_count", "")
    )
}