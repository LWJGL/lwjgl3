/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tinyexr

import org.lwjgl.generator.*

val EXRVersion = struct(Module.TINYEXR, "EXRVersion") {
    int("version", "this must be 2")
    intb("tiled", "tile format image")
    intb("long_name", "long name attribute")
    intb("non_image", "deep image(EXR 2.0)")
    intb("multipart", "multi-part(EXR 2.0)")
}

val EXRAttribute = struct(Module.TINYEXR, "EXRAttribute") {
    charASCII("name", "")[256]
    charASCII("type", "")[256]
    unsigned_char.p("value", "")
    AutoSize("value", optional = true)..int("size", "")
    padding(4)
}

val EXRChannelInfo = struct(Module.TINYEXR, "EXRChannelInfo") {
    charASCII("name", "")[256]
    int("pixel_type", "")
    int("x_sampling", "")
    int("y_sampling", "")
    unsigned_char("p_linear", "")
    padding(3)
}

val EXRTile = struct(Module.TINYEXR, "EXRTile") {
    int("offset_x", "")
    int("offset_y", "")
    int("level_x", "")
    int("level_y", "")

    int("width", "actual width in a tile")
    int("height", "actual height in a tile")

    unsigned_char.p.p("images", "image[channels][pixels]")
}

val EXRHeader = struct(Module.TINYEXR, "EXRHeader") {
    javaImport("static org.lwjgl.util.tinyexr.TinyEXR.*")

    float("pixel_aspect_ratio", "")
    int("line_order", "")
    int("data_window", "")[4]
    int("display_window", "")[4]
    float("screen_window_center", "")[2]
    float("screen_window_width", "")

    int("chunk_count", "")

    // Properties for tiled format(`tiledesc`).
    intb("tiled", "")
    int("tile_size_x", "")
    int("tile_size_y", "")
    int("tile_level_mode", "")
    int("tile_rounding_mode", "")

    intb("long_name", "")
    intb("non_image", "")
    intb("multipart", "")
    unsigned_int("header_len", "")

    AutoSize("custom_attributes")..int("num_custom_attributes", "number of {@code EXRAttribute} in the {@code custom_attributes} array")
    nullable..EXRAttribute.p(
        "custom_attributes",
        "custom attributes (excludes required attributes, e.g. `channels`, `compression`, etc)"
    )

    EXRChannelInfo.p("channels", "")

    int.p(
        "pixel_types",
        "loaded pixel type (TINYEXR_PIXELTYPE_*) of {@code images} for each channel. This is overwritten with {@code requested_pixel_types} when loading."
    )
    AutoSize("channels", "pixel_types", "requested_pixel_types")..int("num_channels", "")

    int("compression_type", "compression type (TINYEXR_COMPRESSIONTYPE_*)")
    int.p(
        "requested_pixel_types",
        "filled initially by {@code ParseEXRHeaderFrom(Memory|File)}, then users can edit it (only valid for HALF pixel type channel)"
    )
}

/*val EXRMultiPartHeader = struct(Binding.TINYEXR, "EXRMultiPartHeader") {
    AutoSize("headers")..int("num_headers", "")
    EXRHeader_p("headers", "")
}*/

val EXRImage = struct(Module.TINYEXR, "EXRImage") {
    EXRTile.p("tiles", "tiled pixel data. The application must reconstruct image from tiles manually. #NULL if scanline format.")
    nullable..unsigned_char.p.p("images", "{@code image[channels][pixels]}. #NULL if tiled format.")
    int("width", "")
    int("height", "")
    AutoSize("images")..int("num_channels", "")

    // Properties for tile format.
    AutoSize("tiles", optional = true)..int("num_tiles", "")
}

/*val EXRMultiPartImage = struct(Binding.TINYEXR, "EXRMultiPartImage") {
    AutoSize("images")..int("num_images", "")
    EXRImage_p("images", "")
}*/

val DeepImage = struct(Module.TINYEXR, "DeepImage") {
    charUTF8.const.p.p("channel_names", "")
    float.p.p.p("image", "image[channels][scanlines][samples]")
    int.p.p("offset_table", "offset_table[scanline][offsets]")
    AutoSize("channel_names", "image")..int("num_channels", "")
    int("width", "")
    int("height", "")
    padding(4)
}