/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb.templates

import org.lwjgl.generator.*
import stb.*

val stb_image = "STBImage".nativeClass(Module.STB, prefix = "STBI_") {
    includeSTBAPI(
        """#include "lwjgl_malloc.h"
#define STBI_MALLOC(sz)    org_lwjgl_malloc(sz)
#define STBI_REALLOC(p,sz) org_lwjgl_realloc(p,sz)
#define STBI_FREE(p)       org_lwjgl_free(p)
#define STBI_FAILURE_USERMSG
#define STBI_ASSERT(x)
#define STB_IMAGE_IMPLEMENTATION
#define STB_IMAGE_STATIC
#ifdef LWJGL_WINDOWS
    #define STBI_WINDOWS_UTF8
#endif
#include "stb_image.h"""")

    EnumConstant(
        "default".enum,
        "grey".enum,
        "grey_alpha".enum,
        "rgb".enum,
        "rgb_alpha".enum
    )

    val load = stbi_uc.p(
        "load",

        charUTF8.const.p("filename"),
        Check(1)..AutoSizeResult..int.p("x"),
        Check(1)..AutoSizeResult..int.p("y"),
        Check(1)..AutoSizeResult("(desired_channels != 0 ? desired_channels : \$original)")..int.p("channels_in_file"),
        int("desired_channels")
    )

    val load_from_memory = stbi_uc.p(
        "load_from_memory",

        stbi_uc.const.p("buffer"),
        AutoSize("buffer")..int("len"),
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    val load_from_callbacks = stbi_uc.p(
        "load_from_callbacks",

        stbi_io_callbacks.const.p("clbk"),
        nullable..opaque_p("user"),
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    stbi_uc.p(
        "load_gif_from_memory",

        load_from_memory["buffer"],
        load_from_memory["len"],
        Check(1)..int.p.p("delays"),
        load["x"],
        load["y"],
        Check(1)..AutoSizeResult..int.p("z"),
        load["channels_in_file"],
        load["desired_channels"]
    )

    stbi_us.p(
        "load_16",

        load["filename"],
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    stbi_us.p(
        "load_16_from_memory",

        load_from_memory["buffer"],
        load_from_memory["len"],
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    stbi_us.p(
        "load_16_from_callbacks",

        load_from_callbacks["clbk"],
        load_from_callbacks["user"],
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    float.p(
        "loadf",

        load["filename"],
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    float.p(
        "loadf_from_memory",

        load_from_memory["buffer"],
        load_from_memory["len"],
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    float.p(
        "loadf_from_callbacks",

        load_from_callbacks["clbk"],
        load_from_callbacks["user"],
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    void(
        "hdr_to_ldr_gamma",

        float("gamma")
    )

    void(
        "hdr_to_ldr_scale",

        float("scale")
    )

    void(
        "ldr_to_hdr_gamma",

        float("gamma")
    )

    void(
        "ldr_to_hdr_scale",

        float("scale")
    )

    intb(
        "is_hdr",

        load["filename"]
    )

    intb(
        "is_hdr_from_memory",

        load_from_memory["buffer"],
        load_from_memory["len"]
    )

    intb(
        "is_hdr_from_callbacks",

        load_from_callbacks["clbk"],
        load_from_callbacks["user"]
    )

    charASCII.const.p("failure_reason", void())

    OffHeapOnly..void(
        "image_free",

        MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_FLOAT)..Unsafe..void.p("retval_from_stbi_load")
    )

    intb(
        "info",

        load["filename"],
        Check(1)..int.p("x"),
        Check(1)..int.p("y"),
        Check(1)..int.p("comp")
    )

    intb(
        "info_from_memory",

        load_from_memory["buffer"],
        load_from_memory["len"],
        Check(1)..int.p("x"),
        Check(1)..int.p("y"),
        Check(1)..int.p("comp")
    )

    intb(
        "info_from_callbacks",

        load_from_callbacks["clbk"],
        load_from_callbacks["user"],
        Check(1)..int.p("x"),
        Check(1)..int.p("y"),
        Check(1)..int.p("comp")
    )

    intb(
        "is_16_bit",

        load["filename"]
    )

    intb(
        "is_16_bit_from_memory",

        load_from_memory["buffer"],
        load_from_memory["len"]
    )

    intb(
        "is_16_bit_from_callbacks",

        load_from_callbacks["clbk"],
        load_from_callbacks["user"]
    )

    void(
        "set_unpremultiply_on_load",

        intb("flag_true_if_should_unpremultiply")
    )

    void(
        "convert_iphone_png_to_rgb",

        intb("flag_true_if_should_convert")
    )

    void(
        "set_flip_vertically_on_load",

        intb("flag_true_if_should_flip")
    )

    void(
        "set_unpremultiply_on_load_thread",

        intb("flag_true_if_should_unpremultiply")
    )

    void(
        "convert_iphone_png_to_rgb_thread",

        intb("flag_true_if_should_convert")
    )

    void(
        "set_flip_vertically_on_load_thread",

        int("flag_true_if_should_flip")
    )

    char.p(
        "zlib_decode_malloc_guesssize",

        char.const.p("buffer"),
        AutoSize("buffer")..int("len"),
        int("initial_size"),
        AutoSizeResult..int.p("outlen")
    )

    char.p(
        "zlib_decode_malloc_guesssize_headerflag",

        char.const.p("buffer"),
        AutoSize("buffer")..int("len"),
        int("initial_size"),
        AutoSizeResult..int.p("outlen"),
        intb("parse_header")
    )

    char.p(
        "zlib_decode_malloc",

        char.const.p("buffer"),
        AutoSize("buffer")..int("len"),
        AutoSizeResult..int.p("outlen")
    )

    int(
        "zlib_decode_buffer",

        char.p("obuffer"),
        AutoSize("obuffer")..int("olen"),
        char.const.p("ibuffer"),
        AutoSize("ibuffer")..int("ilen")
    )

    char.p(
        "zlib_decode_noheader_malloc",

        char.const.p("buffer"),
        AutoSize("buffer")..int("len"),
        AutoSizeResult..int.p("outlen")
    )

    int(
        "zlib_decode_noheader_buffer",

        char.p("obuffer"),
        AutoSize("obuffer")..int("olen"),
        char.const.p("ibuffer"),
        AutoSize("ibuffer")..int("ilen")
    )
}