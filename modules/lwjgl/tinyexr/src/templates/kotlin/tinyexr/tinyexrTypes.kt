/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tinyexr

import org.lwjgl.generator.*

val EXRVersion = struct(Module.TINYEXR, "EXRVersion") {
    int("version")
    intb("tiled")
    intb("long_name")
    intb("non_image")
    intb("multipart")
}

val EXRAttribute = struct(Module.TINYEXR, "EXRAttribute") {
    charASCII("name")[256]
    charASCII("type")[256]
    unsigned_char.p("value")
    AutoSize("value", optional = true)..int("size")
    padding(4)
}

val EXRChannelInfo = struct(Module.TINYEXR, "EXRChannelInfo") {
    charASCII("name")[256]
    int("pixel_type")
    int("x_sampling")
    int("y_sampling")
    unsigned_char("p_linear")
    padding(3)
}

val EXRTile = struct(Module.TINYEXR, "EXRTile") {
    int("offset_x")
    int("offset_y")
    int("level_x")
    int("level_y")

    int("width")
    int("height")

    unsigned_char.p.p("images")
}

val EXRBox2i = struct(Module.TINYEXR, "EXRBox2i") {
    int("min_x")
    int("min_y")
    int("max_x")
    int("max_y")
}

val EXRHeader = struct(Module.TINYEXR, "EXRHeader") {
    javaImport("static org.lwjgl.util.tinyexr.TinyEXR.*")

    float("pixel_aspect_ratio")
    int("line_order")
    EXRBox2i("data_window")
    EXRBox2i("display_window")
    float("screen_window_center")[2]
    float("screen_window_width")

    int("chunk_count")

    // Properties for tiled format(`tiledesc`).
    intb("tiled")
    int("tile_size_x")
    int("tile_size_y")
    int("tile_level_mode")
    int("tile_rounding_mode")

    intb("long_name")
    intb("non_image")
    intb("multipart")
    unsigned_int("header_len")

    AutoSize("custom_attributes")..int("num_custom_attributes")
    nullable..EXRAttribute.p("custom_attributes")

    EXRChannelInfo.p("channels")

    int.p("pixel_types")
    AutoSize("channels", "pixel_types", "requested_pixel_types")..int("num_channels")

    int("compression_type")
    int.p("requested_pixel_types")
    charUTF8("name")[256]
}

/*val EXRMultiPartHeader = struct(Binding.TINYEXR, "EXRMultiPartHeader") {
    AutoSize("headers")..int("num_headers")
    EXRHeader_p("headers")
}*/

private val _EXRImage = struct(Module.TINYEXR, "EXRImage", nativeName = "struct _EXRImage")
val EXRImage = struct(Module.TINYEXR, "EXRImage") {
    EXRTile.p("tiles")
    nullable.._EXRImage.p("next_level")
    int("level_x")
    int("level_y")

    nullable..unsigned_char.p.p("images")
    int("width")
    int("height")
    AutoSize("images")..int("num_channels")

    // Properties for tile format.
    AutoSize("tiles", optional = true)..int("num_tiles")
}

/*val EXRMultiPartImage = struct(Binding.TINYEXR, "EXRMultiPartImage") {
    AutoSize("images")..int("num_images")
    EXRImage_p("images")
}*/

val DeepImage = struct(Module.TINYEXR, "DeepImage") {
    charUTF8.const.p.p("channel_names")
    float.p.p.p("image")
    int.p.p("offset_table")
    AutoSize("channel_names", "image")..int("num_channels")
    int("width")
    int("height")
    padding(4)
}