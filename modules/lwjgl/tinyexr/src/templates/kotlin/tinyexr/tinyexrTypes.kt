/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tinyexr

import org.lwjgl.generator.*

fun config() {
    packageInfo(
        Module.TINYEXR,
        """
        Contains bindings to the ${url("https://github.com/syoyo/tinyexr", "Tiny OpenEXR")} image library.

        tinyexr is a small, single header-only library to load and save OpenEXR(.exr) images.
        """
    )
}

val EXRVersion = struct(Module.TINYEXR, "EXRVersion") {
    int.member("version", "this must be 2")
    intb.member("tiled", "tile format image")
    intb.member("long_name", "long name attribute")
    intb.member("non_image", "deep image(EXR 2.0)")
    intb.member("multipart", "multi-part(EXR 2.0)")
}

val EXRAttribute = struct(Module.TINYEXR, "EXRAttribute") {
    charASCII.array("name", "", size = 256)
    charASCII.array("type", "", size = 256)
    unsigned_char.p.member("value", "")
    AutoSize("value", optional = true)..int.member("size", "")
    padding(4)
}

val EXRChannelInfo = struct(Module.TINYEXR, "EXRChannelInfo") {
    charASCII.array("name", "", size = 256)
    int.member("pixel_type", "")
    int.member("x_sampling", "")
    int.member("y_sampling", "")
    unsigned_char.member("p_linear", "")
    padding(3)
}

val EXRTile = struct(Module.TINYEXR, "EXRTile") {
    int.member("offset_x", "")
    int.member("offset_y", "")
    int.member("level_x", "")
    int.member("level_y", "")

    int.member("width", "actual width in a tile")
    int.member("height", "actual height in a tile")

    unsigned_char.p.p.member("images", "image[channels][pixels]")
}

val EXRHeader = struct(Module.TINYEXR, "EXRHeader") {
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

    AutoSize("custom_attributes")..int.member("num_custom_attributes", "number of {@code EXRAttribute} in the {@code custom_attributes} array")
    nullable..EXRAttribute.p.buffer(
        "custom_attributes",
        "custom attributes (excludes required attributes, e.g. `channels`, `compression`, etc)"
    )

    EXRChannelInfo.p.buffer("channels", "")

    int.p.member(
        "pixel_types",
        "loaded pixel type (TINYEXR_PIXELTYPE_*) of {@code images} for each channel. This is overwritten with {@code requested_pixel_types} when loading."
    )
    AutoSize("channels", "pixel_types", "requested_pixel_types")..int.member("num_channels", "")

    int.member("compression_type", "compression type (TINYEXR_COMPRESSIONTYPE_*)")
    int.p.member(
        "requested_pixel_types",
        "filled initially by {@code ParseEXRHeaderFrom(Memory|File)}, then users can edit it (only valid for HALF pixel type channel)"
    )
}

/*val EXRMultiPartHeader = struct(Binding.TINYEXR, "EXRMultiPartHeader") {
    AutoSize("headers")..int.member("num_headers", "")
    EXRHeader_p.member("headers", "")
}*/

val EXRImage = struct(Module.TINYEXR, "EXRImage") {
    EXRTile.p.buffer("tiles", "tiled pixel data. The application must reconstruct image from tiles manually. #NULL if scanline format.")
    nullable..unsigned_char.p.p.member("images", "{@code image[channels][pixels]}. #NULL if tiled format.")
    int.member("width", "")
    int.member("height", "")
    AutoSize("images")..int.member("num_channels", "")

    // Properties for tile format.
    AutoSize("tiles", optional = true)..int.member("num_tiles", "")
}

/*val EXRMultiPartImage = struct(Binding.TINYEXR, "EXRMultiPartImage") {
    AutoSize("images")..int.member("num_images", "")
    EXRImage_p.member("images", "")
}*/

val DeepImage = struct(Module.TINYEXR, "DeepImage") {
    charUTF8.const.p.p.member("channel_names", "")
    float.p.p.p.member("image", "image[channels][scanlines][samples]")
    int.p.p.member("offset_table", "offset_table[scanline][offsets]")
    AutoSize("channel_names", "image")..int.member("num_channels", "")
    int.member("width", "")
    int.member("height", "")
    padding(4)
}