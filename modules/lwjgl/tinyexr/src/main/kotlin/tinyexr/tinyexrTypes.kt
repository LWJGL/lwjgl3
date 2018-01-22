/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.tinyexr

import org.lwjgl.generator.*

val TINYEXR_PACKAGE = "org.lwjgl.util.tinyexr"

fun config() {
    packageInfo(
        TINYEXR_PACKAGE,
        """
        Contains bindings to the ${url("https://github.com/syoyo/tinyexr", "Tiny OpenEXR")} image library.

        tinyexr is a small, single header-only library to load and save OpenEXR(.exr) images.
        """
    )
}

val EXRVersion_p = struct(TINYEXR_PACKAGE, "EXRVersion") {
    int.member("version", "this must be 2")
    intb.member("tiled", "tile format image")
    intb.member("long_name", "long name attribute")
    intb.member("non_image", "deep image(EXR 2.0)")
    intb.member("multipart", "multi-part(EXR 2.0)")
}.p

val EXRAttribute = struct(TINYEXR_PACKAGE, "EXRAttribute") {
    charASCII.array("name", "", size = 256)
    charASCII.array("type", "", size = 256)
    unsigned_char_p.member("value", "")
    AutoSize("value", optional = true)..int.member("size", "")
    padding(4)
}

val EXRChannelInfo_p = struct(TINYEXR_PACKAGE, "EXRChannelInfo") {
    charASCII.array("name", "", size = 256)
    int.member("pixel_type", "")
    int.member("x_sampling", "")
    int.member("y_sampling", "")
    unsigned_char.member("p_linear", "")
    padding(3)
}.p

val EXRTile_p = struct(TINYEXR_PACKAGE, "EXRTile") {
    int.member("offset_x", "")
    int.member("offset_y", "")
    int.member("level_x", "")
    int.member("level_y", "")

    int.member("width", "actual width in a tile")
    int.member("height", "actual height in a tile")

    unsigned_char_p.p.member("images", "image[channels][pixels]")
}.p

val EXRHeader_p = struct(TINYEXR_PACKAGE, "EXRHeader") {
    javaImport("static org.lwjgl.util.tinyexr.TinyEXR.*")

    float.member("pixel_aspect_ratio", "")
    int.member("line_order", "")
    int.array("data_window", "", size = 4)
    int.array("display_window", "", size = 4)
    float.array("screen_window_center", "", size = 2)
    float.member("screen_window_width", "")

    int.member("chunk_count", "")

    // Properties for tiled format(`tiledesc`).
    intb.member("tiled", "")
    int.member("tile_size_x", "")
    int.member("tile_size_y", "")
    int.member("tile_level_mode", "")
    int.member("tile_rounding_mode", "")

    intb.member("long_name", "")
    intb.member("non_image", "")
    intb.member("multipart", "")
    unsigned_int.member("header_len", "")

    AutoSize("custom_attributes")..int.member("num_custom_attributes", "")
    EXRAttribute.array(
        "custom_attributes",
        "custom attributes (excludes required attributes, e.g. `channels`, `compression`, etc)",
        size = "TINYEXR_MAX_ATTRIBUTES"
    )

    EXRChannelInfo_p.buffer("channels", "")

    int_p.member(
        "pixel_types",
        "loaded pixel type (TINYEXR_PIXELTYPE_*) of {@code images} for each channel. This is overwritten with {@code requested_pixel_types} when loading."
    )
    AutoSize("channels", "pixel_types", "requested_pixel_types")..int.member("num_channels", "")

    int.member("compression_type", "compression type (TINYEXR_COMPRESSIONTYPE_*)")
    int_p.member(
        "requested_pixel_types",
        "filled initially by {@code ParseEXRHeaderFrom(Memory|File)}, then users can edit it (only valid for HALF pixel type channel)"
    )
}.p

/*val EXRMultiPartHeader = struct(TINYEXR_PACKAGE, "EXRMultiPartHeader") {
    AutoSize("headers")..int.member("num_headers", "")
    EXRHeader_p.member("headers", "")
}*/

val EXRImage_p = struct(TINYEXR_PACKAGE, "EXRImage") {
    EXRTile_p.buffer("tiles", "tiled pixel data. The application must reconstruct image from tiles manually. #NULL if scanline format.")
    nullable..unsigned_char_p.p.member("images", "{@code image[channels][pixels]}. #NULL if tiled format.")
    int.member("width", "")
    int.member("height", "")
    AutoSize("images")..int.member("num_channels", "")

    // Properties for tile format.
    AutoSize("tiles", optional = true)..int.member("num_tiles", "")
}.p

/*val EXRMultiPartImage = struct(TINYEXR_PACKAGE, "EXRMultiPartImage") {
    AutoSize("images")..int.member("num_images", "")
    EXRImage_p.member("images", "")
}*/

val DeepImage_p = struct(TINYEXR_PACKAGE, "DeepImage") {
    const..charUTF8_pp.member("channel_names", "")
    float_pp.p.member("image", "image[channels][scanlines][samples]")
    int_p.p.member("offset_table", "offset_table[scanline][offsets]")
    AutoSize("channel_names", "image")..int.member("num_channels", "")
    int.member("width", "")
    int.member("height", "")
    padding(4)
}.p