/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb.templates

import org.lwjgl.generator.*
import stb.*

val stb_image_write = "STBImageWrite".nativeClass(Module.STB, prefix = "STBI", prefixMethod = "stbi_") {
    includeSTBAPI(
        """#include "lwjgl_malloc.h"
#define STBIW_MALLOC(sz)    org_lwjgl_malloc(sz)
#define STBIW_REALLOC(p,sz) org_lwjgl_realloc(p,sz)
#define STBIW_FREE(p)       org_lwjgl_free(p)
#define STBIW_ASSERT(x)
#define STB_IMAGE_WRITE_IMPLEMENTATION
#define STB_IMAGE_WRITE_STATIC
#ifdef LWJGL_WINDOWS
    #define STBIW_WINDOWS_UTF8
    #define STBI_MSC_SECURE_CRT
#endif
#include "stb_image_write.h"""")

    val write = intb(
        "write_png",

        charUTF8.const.p("filename"),
        int("w"),
        int("h"),
        int("comp"),
        Check("(stride_in_bytes != 0 ? stride_in_bytes : w * comp) * h")..void.const.p("data"),
        int("stride_in_bytes")
    )

    macro..Address..int.p(
        "write_png_compression_level",
        void()
    )

    macro..Address..int.p(
        "write_force_png_filter",
        void()
    )

    macro..Address..stbi_zlib_compress.p(
        "zlib_compress",
        void()
    )

    intb(
        "write_bmp",

        write["filename"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..void.const.p("data")
    )

    intb(
        "write_tga",

        write["filename"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..void.const.p("data")
    )

    macro..Address..int.p(
        "write_tga_with_rle",
        void()
    )

    val write_hdr = intb(
        "write_hdr",

        write["filename"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..float.const.p("data")
    )

    val write_jpg = intb(
        "write_jpg",

        write["filename"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..void.const.p("data"),
        int("quality")

    )

    val write_to_func = intb(
        "write_png_to_func",

        stbi_write_func("func"),
        nullable..opaque_p("context"),
        write["w"],
        write["h"],
        write["comp"],
        write["data"],
        write["stride_in_bytes"]
    )

    intb(
        "write_bmp_to_func",

        write_to_func["func"],
        write_to_func["context"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..void.const.p("data")
    )

    intb(
        "write_tga_to_func",

        write_to_func["func"],
        write_to_func["context"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..void.const.p("data")
    )

    intb(
        "write_hdr_to_func",

        write_to_func["func"],
        write_to_func["context"],
        write["w"],
        write["h"],
        write["comp"],
        write_hdr["data"]
    )

    int(
        "write_jpg_to_func",

        write_to_func["func"],
        write_to_func["context"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..void.const.p("data"),
        write_jpg["quality"]
    )

    void(
        "flip_vertically_on_write",

        intb("flip_boolean")
    )
}