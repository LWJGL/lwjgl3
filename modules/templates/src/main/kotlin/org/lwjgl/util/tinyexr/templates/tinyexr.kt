/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.tinyexr.templates

import org.lwjgl.generator.*
import org.lwjgl.util.tinyexr.*

val tinyexr = "TinyEXR".nativeClass(TINYEXR_PACKAGE, prefix = "TINYEXR", prefixMethod = "", library = "lwjgl_tinyexr") {
    nativeDirective("""#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4711))
#endif""", beforeIncludes = true)

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
        "ERROR_INVALID_PARAMETER".."-5",
        "ERROR_CANT_OPEN_FILE".."-6",
        "ERROR_UNSUPPORTED_FORMAT".."-7",
        "ERROR_INVALID_HEADER".."-8"
    )

    IntConstant(
        "Pixel types.",

        "PIXELTYPE_UINT".."0",
        "PIXELTYPE_HALF".."1",
        "PIXELTYPE_FLOAT".."2"
    )

    IntConstant(
        "",

        "MAX_ATTRIBUTES".."128"
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

    void(
        "InitEXRHeader",
        "Initialize ##EXRHeader struct.",

        EXRHeader_p.OUT("exr_header", "")
    )

    void(
        "InitEXRImage",
        "Initialize ##EXRImage struct.",

        EXRImage_p.OUT("exr_image", "")
    )

    int(
        "FreeEXRHeader",
        "Free's internal data of ##EXRHeader struct",

        EXRHeader_p.OUT("exr_header", "")
    )

    int(
        "FreeEXRImage",
        "Free's internal data of ##EXRImage struct",

        EXRImage_p.IN("exr_image", "")
    )

    int(
        "ParseEXRVersionFromFile",
        "Parse EXR version header of a file.",

        EXRVersion_p.OUT("version", ""),
        const..charASCII_p.IN("filename", "")
    )

    int(
        "ParseEXRVersionFromMemory",
        "Parse EXR version header from memory-mapped EXR data.",

        EXRVersion_p.OUT("version", ""),
        const..unsigned_char_p.IN("memory", ""),
        AutoSize("memory")..size_t.IN("size", "")
    )

    int(
        "ParseEXRHeaderFromFile",
        "Parse single-part OpenEXR header from a file and initialize ##EXRHeader.",

        EXRHeader_p.OUT("header", ""),
        const..EXRVersion_p.IN("version", ""),
        const..charASCII_p.IN("filename", ""),
        Check(1)..const..charASCII_pp.IN("err", "")
    )

    int(
        "ParseEXRHeaderFromMemory",
        "Parse single-part OpenEXR header from a memory and initialize ##EXRHeader.",

        EXRHeader_p.OUT("header", ""),
        const..EXRVersion_p.IN("version", ""),
        const..unsigned_char_p.IN("memory", ""),
        AutoSize("memory")..size_t.IN("size", ""),
        Check(1)..const..charASCII_pp.IN("err", "")
    )

    int(
        "ParseEXRMultipartHeaderFromFile",
        "Parse multi-part OpenEXR headers from a file and initialize ##EXRHeader* array.",

        Check(1)..EXRHeader_p.p.p.OUT("headers", ""),
        Check(1)..int_p.OUT("num_headers", ""),
        const..EXRVersion_p.IN("version", ""),
        const..charASCII_p.IN("filename", ""),
        Check(1)..const..charASCII_pp.IN("err", "")
    )

    int(
        "ParseEXRMultipartHeaderFromMemory",
        "Parse multi-part OpenEXR headers from a memory and initialize ##EXRHeader* array.",

        Check(1)..EXRHeader_p.p.p.OUT("headers", ""),
        Check(1)..int_p.OUT("num_headers", ""),
        const..EXRVersion_p.IN("version", ""),
        const..unsigned_char_p.IN("memory", ""),
        AutoSize("memory")..size_t.IN("size", ""),
        Check(1)..const..charASCII_pp.IN("err", "")
    )

    int(
        "LoadEXRImageFromFile",
        """
        Loads single-part OpenEXR image from a file.

        Application must setup #ParseEXRHeaderFromFile() before calling this function.

        Application can free EXRImage using #FreeEXRImage().
        """,

        EXRImage_p.OUT("image", ""),
        const..EXRHeader_p.IN("header", ""),
        const..charASCII_p.IN("filename", ""),
        Check(1)..const..charASCII_pp.IN("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    int(
        "LoadEXRImageFromMemory",
        """
        Loads single-part OpenEXR image from a memory.

        Application must setup ##EXRHeader with #ParseEXRHeaderFromMemory() before calling this function.

        Application can free EXRImage using #FreeEXRImage().
        """,

        EXRImage_p.OUT("image", ""),
        const..EXRHeader_p.IN("header", ""),
        const..unsigned_char_p.IN("memory", ""),
        AutoSize("memory")..size_t.IN("size", ""),
        Check(1)..const..charASCII_pp.IN("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    int(
        "LoadEXRMultipartImageFromFile",
        """
        Loads multi-part OpenEXR image from a file.

        Application must setup #ParseEXRMultipartHeaderFromFile() before calling this function.

        Application can free EXRImage using #FreeEXRImage().
        """,

        EXRImage_p.OUT("images", ""),
        const..EXRHeader_p.p.IN("headers", ""),
        AutoSize("images", "headers")..unsigned_int.IN("num_parts", ""),
        const..charASCII_p.IN("filename", ""),
        Check(1)..const..charASCII_pp.IN("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    int(
        "LoadEXRMultipartImageFromMemory",
        """
        Loads multi-part OpenEXR image from a memory.

        Application must setup ##EXRHeader* array with #ParseEXRMultipartHeaderFromMemory() before calling this function.

        Application can free EXRImage using #FreeEXRImage().
        """,

        EXRImage_p.OUT("images", ""),
        const..EXRHeader_p.p.IN("headers", ""),
        AutoSize("images", "headers")..unsigned_int.IN("num_parts", ""),
        const..unsigned_char_p.IN("memory", ""),
        AutoSize("memory")..size_t.IN("size", ""),
        Check(1)..const..charASCII_pp.IN("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    int(
        "SaveEXRImageToFile",
        "Saves multi-channel, single-frame OpenEXR image to a file.",

        const..EXRImage_p.IN("image", ""),
        const..EXRHeader_p.IN("exr_header", ""),
        const..charASCII_p.IN("filename", ""),
        Check(1)..const..charASCII_pp.IN("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    size_t(
        "SaveEXRImageToMemory",
        """
        Saves multi-channel, single-frame OpenEXR image to a memory.

        Image is compressed using {@code EXRImage.compression} value.
        """,

        const..EXRImage_p.IN("image", ""),
        const..EXRHeader_p.IN("exr_header", ""),
        Check(1)..unsigned_char_p.p.OUT("memory", ""),
        Check(1)..const..charASCII_pp.IN("err", ""),

        returnDoc = "the number of bytes if success or negative value and may set error string in {@code err} when there's an error"
    )

    int(
        "LoadDeepEXR",
        """
        Loads single-frame OpenEXR deep image.

        Application must free memory of variables in {@code DeepImage(image, offset_table)}.
        """,

        DeepImage_p.OUT("out_image", ""),
        const..charASCII_p.IN("filename", ""),
        Check(1)..const..charASCII_pp.IN("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    /*int(
        "SaveDeepEXR",
        "Saves single-frame OpenEXR deep image.",

        const..DeepImage_p.IN("in_image", ""),
        const..charASCII_p.IN("filename", ""),
        Check(1)..const..charASCII_pp.IN("err", ""),

        returnDoc = "negative value and may set error string in {@code err} when there's an error"
    )

    int(
        "LoadMultiPartDeepEXR",
        """
        Loads multi-part OpenEXR deep image.

        Application must free memory of variables in {@code DeepImage(image, offset_table)}.
        """,

        DeepImage_p.p.OUT("out_image", ""),
        AutoSize("out_image")..int.IN("num_parts", ""),
        const..charASCII_p.IN("filename", ""),
        Check(1)..const..charASCII_pp.IN("err", "")
    )*/
}