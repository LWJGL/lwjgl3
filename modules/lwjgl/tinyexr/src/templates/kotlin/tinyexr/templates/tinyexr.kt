/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package tinyexr.templates

import org.lwjgl.generator.*
import tinyexr.*

val tinyexr = "TinyEXR".nativeClass(Module.TINYEXR, prefix = "TINYEXR", prefixMethod = "") {
    nativeDirective("""DISABLE_WARNINGS()
#define TINYEXR_USE_COMPILER_FP16 1
#include "tinyexr.h"
ENABLE_WARNINGS()""")

    IntConstant(
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
        "ERROR_SERIALIZATION_FAILED".."-12",
        "ERROR_LAYER_NOT_FOUND".."-13",
        "ERROR_DATA_TOO_LARGE".."-14"
    )

    IntConstant(
        "PIXELTYPE_UINT".."0",
        "PIXELTYPE_HALF".."1",
        "PIXELTYPE_FLOAT".."2"
    )

    IntConstant(
        "MAX_HEADER_ATTRIBUTES".."1024",
        "MAX_CUSTOM_ATTRIBUTES".."128"
    )

    IntConstant(
        "COMPRESSIONTYPE_NONE".."0",
        "COMPRESSIONTYPE_RLE".."1",
        "COMPRESSIONTYPE_ZIPS".."2",
        "COMPRESSIONTYPE_ZIP".."3",
        "COMPRESSIONTYPE_PIZ".."4",
        "COMPRESSIONTYPE_ZFP".."128"
    )

    IntConstant(
        "ZFP_COMPRESSIONTYPE_RATE".."0",
        "ZFP_COMPRESSIONTYPE_PRECISION".."1",
        "ZFP_COMPRESSIONTYPE_ACCURACY".."2"
    )

    IntConstant(
        "TILE_ONE_LEVEL".."0",
        "TILE_MIPMAP_LEVELS".."1",
        "TILE_RIPMAP_LEVELS".."2"
    )

    IntConstant(
        "TILE_ROUND_DOWN".."0",
        "TILE_ROUND_UP".."1"
    )

    int(
        "LoadEXRWithLayer",

        Check(1)..float.p.p("out_rgba"),
        Check(1)..int.p("width"),
        Check(1)..int.p("height"),
        charUTF8.const.p("filename"),
        charUTF8.const.p("layer_name"),
        Check(1)..charASCII.const.p.p("err")
    )

    int(
        "EXRLayers",

        charUTF8.const.p("filename"),
        Check(1)..charUTF8.const.p.p.p("layer_names"),
        Check(1)..int.p("num_layers"),
        Check(1)..charASCII.const.p.p("err")
    )

    int(
        "IsEXRFromMemory",

        unsigned_char.const.p("memory"),
        AutoSize("memory")..size_t("size")
    )

    int(
        "EXRNumLevels",

        EXRImage.const.p("exr_image")
    )

    void(
        "InitEXRHeader",

        EXRHeader.p("exr_header")
    )

    void(
        "EXRSetNameAttr",

        EXRHeader.p("exr_header"),
        charUTF8.const.p("name")
    )

    void(
        "InitEXRImage",

        EXRImage.p("exr_image")
    )

    int(
        "FreeEXRHeader",

        EXRHeader.p("exr_header")
    )

    int(
        "FreeEXRImage",

        EXRImage.p("exr_image")
    )

    void(
        "FreeEXRErrorMessage",

        Unsafe..char.const.p("msg")
    )

    int(
        "ParseEXRVersionFromFile",

        EXRVersion.p("version"),
        charUTF8.const.p("filename")
    )

    int(
        "ParseEXRVersionFromMemory",

        EXRVersion.p("version"),
        unsigned_char.const.p("memory"),
        AutoSize("memory")..size_t("size")
    )

    int(
        "ParseEXRHeaderFromFile",

        EXRHeader.p("header"),
        EXRVersion.const.p("version"),
        charUTF8.const.p("filename"),
        Check(1)..charASCII.const.p.p("err")
    )

    int(
        "ParseEXRHeaderFromMemory",

        EXRHeader.p("header"),
        EXRVersion.const.p("version"),
        unsigned_char.const.p("memory"),
        AutoSize("memory")..size_t("size"),
        Check(1)..charASCII.const.p.p("err")
    )

    int(
        "ParseEXRMultipartHeaderFromFile",

        Check(1)..EXRHeader.p.p.p("headers"),
        Check(1)..int.p("num_headers"),
        EXRVersion.const.p("version"),
        charUTF8.const.p("filename"),
        Check(1)..charASCII.const.p.p("err")
    )

    int(
        "ParseEXRMultipartHeaderFromMemory",

        Check(1)..EXRHeader.p.p.p("headers"),
        Check(1)..int.p("num_headers"),
        EXRVersion.const.p("version"),
        unsigned_char.const.p("memory"),
        AutoSize("memory")..size_t("size"),
        Check(1)..charASCII.const.p.p("err")
    )

    int(
        "LoadEXRImageFromFile",

        EXRImage.p("image"),
        EXRHeader.const.p("header"),
        charUTF8.const.p("filename"),
        Check(1)..charASCII.const.p.p("err")
    )

    int(
        "LoadEXRImageFromMemory",

        EXRImage.p("image"),
        EXRHeader.const.p("header"),
        unsigned_char.const.p("memory"),
        AutoSize("memory")..size_t("size"),
        Check(1)..charASCII.const.p.p("err")
    )

    int(
        "LoadEXRMultipartImageFromFile",

        EXRImage.p("images"),
        EXRHeader.const.p.p("headers"),
        AutoSize("images", "headers")..unsigned_int("num_parts"),
        charUTF8.const.p("filename"),
        Check(1)..charASCII.const.p.p("err")
    )

    int(
        "LoadEXRMultipartImageFromMemory",

        EXRImage.p("images"),
        EXRHeader.const.p.p("headers"),
        AutoSize("images", "headers")..unsigned_int("num_parts"),
        unsigned_char.const.p("memory"),
        AutoSize("memory")..size_t("size"),
        Check(1)..charASCII.const.p.p("err")
    )

    int(
        "SaveEXRImageToFile",

        EXRImage.const.p("image"),
        EXRHeader.const.p("exr_header"),
        charUTF8.const.p("filename"),
        Check(1)..charASCII.const.p.p("err")
    )

    size_t(
        "SaveEXRImageToMemory",

        EXRImage.const.p("image"),
        EXRHeader.const.p("exr_header"),
        Check(1)..unsigned_char.p.p("memory"),
        Check(1)..charASCII.const.p.p("err")
    )


    int(
        "SaveEXRMultipartImageToFile",

        EXRImage.const.p("images"),
        EXRHeader.const.p.p("exr_headers"),
        AutoSize("images", "exr_headers")..unsigned_int("num_parts"),
        charUTF8.const.p("filename"),
        Check(1)..charASCII.const.p.p("err")
    )


    size_t(
        "SaveEXRMultipartImageToMemory",

        EXRImage.const.p("images"),
        EXRHeader.const.p.p("exr_headers"),
        AutoSize("images", "exr_headers")..unsigned_int("num_parts"),
        Check(1)..unsigned_char.p.p("memory"),
        Check(1)..charASCII.const.p.p("err")
    )

    int(
        "LoadDeepEXR",

        DeepImage.p("out_image"),
        charUTF8.const.p("filename"),
        Check(1)..charASCII.const.p.p("err")
    )

    /*int(
        "SaveDeepEXR",

        const..DeepImage_p("in_image"),
        const..charUTF8_p("filename"),
        Check(1)..const..charASCII_pp("err")
    )

    int(
        "LoadMultiPartDeepEXR",

        DeepImage_p.p("out_image"),
        AutoSize("out_image")..int("num_parts"),
        const..charUTF8_p("filename"),
        Check(1)..const..charASCII_pp("err")
    )*/
}