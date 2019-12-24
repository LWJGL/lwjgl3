/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tinyexr.templates

import org.lwjgl.generator.*
import tinyexr.*

val tinyexr = "TinyEXR".nativeClass(Module.TINYEXR, prefix = "TINYEXR", prefixMethod = "") {
    nativeDirective("""DISABLE_WARNINGS()
#include "tinyexr.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to the ${url("https://github.com/syoyo/tinyexr", "Tiny OpenEXR")} image library.

        tinyexr is a small, single header-only library to load and save OpenEXR(.exr) images.
        """

    IntConstant(
        "Error codes.",

        "SUCCESS".."0",
        "ERROR_INVALID_MAGIC_NUMBER".."-1",
        "ERROR_INVALID_EXR_VERSION".."-2",
        "ERROR_INVALID_ARGUMENT".."-3",
        "ERROR_INVALID_DATA".."-4",
        "ERROR_INVALID_FILE".."-5",
        "ERROR_INVALID_PARAMETER".."-6",
        "ERROR_CANT_OPEN_FILE".."-7",
        "ERROR_UNSUPPORTED_FORMAT".."-8",
        "ERROR_INVALID_HEADER".."-9",
        "ERROR_UNSUPPORTED_FEATURE".."-10",
        "ERROR_CANT_WRITE_FILE".."-11",
        "ERROR_SERIALZATION_FAILED".."-12",
        "ERROR_LAYER_NOT_FOUND".."-13"
    )

    IntConstant(
        "Pixel types.",

        "PIXELTYPE_UINT".."0",
        "PIXELTYPE_HALF".."1",
        "PIXELTYPE_FLOAT".."2"
    )

    IntConstant(
        "",

        "MAX_HEADER_ATTRIBUTES".."1024",
        "MAX_CUSTOM_ATTRIBUTES".."128"
    )

    IntConstant(
        "Compression types.",

        "COMPRESSIONTYPE_NONE".."0",
        "COMPRESSIONTYPE_RLE".."1",
        "COMPRESSIONTYPE_ZIPS".."2",
        "COMPRESSIONTYPE_ZIP".."3",
        "COMPRESSIONTYPE_PIZ".."4",
        "COMPRESSIONTYPE_ZFP".."128"
    )

    IntConstant(
        "ZFP compression types.",

        "ZFP_COMPRESSIONTYPE_RATE".."0",
        "ZFP_COMPRESSIONTYPE_PRECISION".."1",
        "ZFP_COMPRESSIONTYPE_ACCURACY".."2"
    )

    IntConstant(
        "Tile level types.",

        "TILE_ONE_LEVEL".."0",
        "TILE_MIPMAP_LEVELS".."1",
        "TILE_RIPMAP_LEVELS".."2"
    )

    IntConstant(
        "Tile rounding types.",

        "TILE_ROUND_DOWN".."0",
        "TILE_ROUND_UP".."1"
    )

    int(
        "LoadEXRWithLayer",
        """
        Loads single-frame OpenEXR image by specifing layer name.

        Assume EXR image contains A(single channel alpha) or RGB(A) channels. Application must free image data as returned by {@code out_rgba}. Result image
        format is: float x RGBA x width x height.
        """,

        Check(1)..float.p.p("out_rgba", ""),
        Check(1)..int.p("width", ""),
        Check(1)..int.p("height", ""),
        charASCII.const.p("filename", ""),
        charASCII.const.p("layer_name", ""),
        Check(1)..charASCII.const.p.p("err", ""),

        returnDoc =
        """
        negative value and may set error string in {@code err} when there's an error. When the specified layer name is not found in the EXR file, the function
        will return #ERROR_LAYER_NOT_FOUND.
        """
    )

    int(
        "EXRLayers",
        "Get layer infos from EXR file.",

        charASCII.const.p("filename", ""),
        Check(1)..charASCII.const.p.p.p("layer_names", "list of layer names. Application must free memory after using this."),
        Check(1)..int.p("num_layers", "the number of layers"),
        Check(1)..charASCII.const.p.p("err", "Error string(wll be filled when the function returns error code). Free it using FreeEXRErrorMessage after using this value."),

        returnDoc = "#SUCCESS upon success."
    )

    void(
        "InitEXRHeader",
        "Initialize ##EXRHeader struct.",

        EXRHeader.p("exr_header", "")
    )

    void(
        "InitEXRImage",
        "Initialize ##EXRImage struct.",

        EXRImage.p("exr_image", "")
    )

    int(
        "FreeEXRHeader",
        "Free's internal data of ##EXRHeader struct",

        EXRHeader.p("exr_header", "")
    )

    int(
        "FreeEXRImage",
        "Free's internal data of ##EXRImage struct",

        EXRImage.p("exr_image", "")
    )

    void(
        "FreeEXRErrorMessage",
        "Free's error message",

        Unsafe..char.const.p("msg", "")
    )

    int(
        "ParseEXRVersionFromFile",
        "Parse EXR version header of a file.",

        EXRVersion.p("version", ""),
        charASCII.const.p("filename", "")
    )

    int(
        "ParseEXRVersionFromMemory",
        "Parse EXR version header from memory-mapped EXR data.",

        EXRVersion.p("version", ""),
        unsigned_char.const.p("memory", ""),
        AutoSize("memory")..size_t("size", "")
    )

    int(
        "ParseEXRHeaderFromFile",
        """
        Parse single-part OpenEXR header from a file and initialize ##EXRHeader.

        When there was an error message, Application must free {@code err} with #FreeEXRErrorMessage().
        """,

        EXRHeader.p("header", ""),
        EXRVersion.const.p("version", ""),
        charASCII.const.p("filename", ""),
        Check(1)..charASCII.const.p.p("err", "")
    )

    int(
        "ParseEXRHeaderFromMemory",
        """
        Parse single-part OpenEXR header from a memory and initialize ##EXRHeader.

        When there was an error message, Application must free {@code err} with #FreeEXRErrorMessage().
        """,

        EXRHeader.p("header", ""),
        EXRVersion.const.p("version", ""),
        unsigned_char.const.p("memory", ""),
        AutoSize("memory")..size_t("size", ""),
        Check(1)..charASCII.const.p.p("err", "")
    )

    int(
        "ParseEXRMultipartHeaderFromFile",
        """
        Parse multi-part OpenEXR headers from a file and initialize ##EXRHeader* array.

        When there was an error message, Application must free {@code err} with #FreeEXRErrorMessage().
        """,

        Check(1)..EXRHeader.p.p.p("headers", ""),
        Check(1)..int.p("num_headers", ""),
        EXRVersion.const.p("version", ""),
        charASCII.const.p("filename", ""),
        Check(1)..charASCII.const.p.p("err", "")
    )

    int(
        "ParseEXRMultipartHeaderFromMemory",
        """
        Parse multi-part OpenEXR headers from a memory and initialize ##EXRHeader* array.

        When there was an error message, Application must free {@code err} with #FreeEXRErrorMessage().
        """,

        Check(1)..EXRHeader.p.p.p("headers", ""),
        Check(1)..int.p("num_headers", ""),
        EXRVersion.const.p("version", ""),
        unsigned_char.const.p("memory", ""),
        AutoSize("memory")..size_t("size", ""),
        Check(1)..charASCII.const.p.p("err", "")
    )

    int(
        "LoadEXRImageFromFile",
        """
        Loads single-part OpenEXR image from a file.

        Application must setup #ParseEXRHeaderFromFile() before calling this function.

        Application can free EXRImage using #FreeEXRImage(). When there was an error message, Application must free {@code err} with #FreeEXRErrorMessage().
        """,

        EXRImage.p("image", ""),
        EXRHeader.const.p("header", ""),
        charASCII.const.p("filename", ""),
        Check(1)..charASCII.const.p.p("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    int(
        "LoadEXRImageFromMemory",
        """
        Loads single-part OpenEXR image from a memory.

        Application must setup ##EXRHeader with #ParseEXRHeaderFromMemory() before calling this function.

        Application can free EXRImage using #FreeEXRImage(). When there was an error message, Application must free {@code err} with #FreeEXRErrorMessage().
        """,

        EXRImage.p("image", ""),
        EXRHeader.const.p("header", ""),
        unsigned_char.const.p("memory", ""),
        AutoSize("memory")..size_t("size", ""),
        Check(1)..charASCII.const.p.p("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    int(
        "LoadEXRMultipartImageFromFile",
        """
        Loads multi-part OpenEXR image from a file.

        Application must setup #ParseEXRMultipartHeaderFromFile() before calling this function.

        Application can free EXRImage using #FreeEXRImage(). When there was an error message, Application must free {@code err} with #FreeEXRErrorMessage().
        """,

        EXRImage.p("images", ""),
        EXRHeader.const.p.p("headers", ""),
        AutoSize("images", "headers")..unsigned_int("num_parts", ""),
        charASCII.const.p("filename", ""),
        Check(1)..charASCII.const.p.p("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    int(
        "LoadEXRMultipartImageFromMemory",
        """
        Loads multi-part OpenEXR image from a memory.

        Application must setup ##EXRHeader* array with #ParseEXRMultipartHeaderFromMemory() before calling this function.

        Application can free EXRImage using #FreeEXRImage(). When there was an error message, Application must free {@code err} with #FreeEXRErrorMessage().
        """,

        EXRImage.p("images", ""),
        EXRHeader.const.p.p("headers", ""),
        AutoSize("images", "headers")..unsigned_int("num_parts", ""),
        unsigned_char.const.p("memory", ""),
        AutoSize("memory")..size_t("size", ""),
        Check(1)..charASCII.const.p.p("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    int(
        "SaveEXRImageToFile",
        """
        Saves multi-channel, single-frame OpenEXR image to a file.

        When there was an error message, Application must free {@code err} with #FreeEXRErrorMessage().
        """,

        EXRImage.const.p("image", ""),
        EXRHeader.const.p("exr_header", ""),
        charASCII.const.p("filename", ""),
        Check(1)..charASCII.const.p.p("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    size_t(
        "SaveEXRImageToMemory",
        """
        Saves multi-channel, single-frame OpenEXR image to a memory.

        Image is compressed using {@code EXRImage.compression} value.

        When there was an error message, Application must free {@code err} with #FreeEXRErrorMessage().
        """,

        EXRImage.const.p("image", ""),
        EXRHeader.const.p("exr_header", ""),
        Check(1)..unsigned_char.p.p("memory", ""),
        Check(1)..charASCII.const.p.p("err", ""),

        returnDoc = "the number of bytes if success or zero and may set error string in {@code err} when there's an error"
    )

    int(
        "LoadDeepEXR",
        """
        Loads single-frame OpenEXR deep image.

        Application must free memory of variables in {@code DeepImage(image, offset_table)}.

        When there was an error message, Application must free {@code err} with #FreeEXRErrorMessage().
        """,

        DeepImage.p("out_image", ""),
        charASCII.const.p("filename", ""),
        Check(1)..charASCII.const.p.p("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    /*int(
        "SaveDeepEXR",
        "Saves single-frame OpenEXR deep image.",

        const..DeepImage_p("in_image", ""),
        const..charASCII_p("filename", ""),
        Check(1)..const..charASCII_pp("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    int(
        "LoadMultiPartDeepEXR",
        """
        Loads multi-part OpenEXR deep image.

        Application must free memory of variables in {@code DeepImage(image, offset_table)}.
        """,

        DeepImage_p.p("out_image", ""),
        AutoSize("out_image")..int("num_parts", ""),
        const..charASCII_p("filename", ""),
        Check(1)..const..charASCII_pp("err", "")
    )*/
}