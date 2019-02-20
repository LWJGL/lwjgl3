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

    documentation =
        """
        Native bindings to stb_image_write.h from the ${url("https://github.com/nothings/stb", "stb library")}.

        <h3>ABOUT</h3>

        This header file is a library for writing images to C stdio.

        The PNG output is not optimal; it is 20-50% larger than the file written by a decent optimizing implementation; though providing a custom zlib compress
        function (see #zlib_compress()) can mitigate that. This library is designed for source code compactness and simplicity, not optimal image
        file size or run-time performance.

        <h3>USAGE</h3>

        There are five functions, one for each image file format:
        ${codeBlock("""
int stbi_write_png(char const *filename, int w, int h, int comp, const void *data, int stride_in_bytes);
int stbi_write_bmp(char const *filename, int w, int h, int comp, const void *data);
int stbi_write_tga(char const *filename, int w, int h, int comp, const void *data);
int stbi_write_hdr(char const *filename, int w, int h, int comp, const void *data);
int stbi_write_jpg(char const *filename, int w, int h, int comp, const float *data, int quality);

void stbi_flip_vertically_on_write(int flag); // flag is non-zero to flip data vertically""")}
        There are also five equivalent functions that use an arbitrary write function. You are expected to open/close your file-equivalent before and after
        calling these:
        ${codeBlock("""
int stbi_write_png_to_func(stbi_write_func *func, void *context, int w, int h, int comp, const void  *data, int stride_in_bytes);
int stbi_write_bmp_to_func(stbi_write_func *func, void *context, int w, int h, int comp, const void  *data);
int stbi_write_tga_to_func(stbi_write_func *func, void *context, int w, int h, int comp, const void  *data);
int stbi_write_hdr_to_func(stbi_write_func *func, void *context, int w, int h, int comp, const float *data);
int stbi_write_jpg_to_func(stbi_write_func *func, void *context, int x, int y, int comp, const void *data, int quality);""")}
        where the callback is:
        ${codeBlock("""
void stbi_write_func(void *context, void *data, int size);""")}
        You can configure it with these global variables:
        ${codeBlock("""
int stbi_write_tga_with_rle;             // defaults to true; set to 0 to disable RLE
int stbi_write_png_compression_level;    // defaults to 8; set to higher for more compression
int stbi_write_force_png_filter;         // defaults to -1; set to 0..5 to force a filter mode""")}
        The functions create an image file defined by the parameters. The image is a rectangle of pixels stored from left-to-right, top-to-bottom. Each pixel
        contains {@code comp} channels of data stored interleaved with 8-bits per channel, in the following order: 1=Y, 2=YA, 3=RGB, 4=RGBA. (Y is monochrome
        color.) The rectangle is {@code w} pixels wide and {@code h} pixels tall. The {@code *data} pointer points to the first byte of the top-left-most
        pixel.
        """

    val write = intb(
        "write_png",
        """
        Writes a PNR image file.

        PNG creates output files with the same number of components as the input.

        PNG supports writing rectangles of data even when the bytes storing rows of data are not consecutive in memory (e.g. sub-rectangles of a larger image),
        by supplying the stride between the beginning of adjacent rows. The other formats do not. (Thus you cannot write a native-format BMP through the BMP
        writer, both because it is in BGR order and because it may have padding at the end of the line.)

        PNG allows you to set the deflate compression level by setting the global variable #write_png_compression_level() (it defaults to 8).
        """,

        charUTF8.const.p("filename", "the image file path"),
        int("w", "the image width, in pixels"),
        int("h", "the image height, in pixels"),
        int("comp", "the number of channels in each pixel"),
        Check("(stride_in_bytes != 0 ? stride_in_bytes : w * comp) * h")..void.const.p("data", "the image data"),
        int("stride_in_bytes", "the distance in bytes from the first byte of a row of pixels to the first byte of the next row of pixels"),

        returnDoc = "1 on success, 0 on failure"
    )

    macro..Address..int.p(
        "write_png_compression_level",
        "Returns the address of the global variable {@code stbi_write_png_compression_level}.",
        void()
    )

    macro..Address..int.p(
        "write_force_png_filter",
        "Returns the address of the global variable {@code stbi_write_force_png_filter}.",
        void()
    )

    macro..Address..stbi_zlib_compress.p(
        "zlib_compress",
        """
        Returns the address of the global variable {@code stbi_zlib_compress}.

        The address of an ##STBIZlibCompress instance may be set to this variable, in order to override the Zlib compression implementation.
        """,
        void()
    )

    intb(
        "write_bmp",
        """
        Writes a BMP image file.

        The BMP format expands Y to RGB in the file format and does not output alpha.
        """,

        write["filename"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..void.const.p("data", "the image data"),

        returnDoc = "1 on success, 0 on failure"
    )

    intb(
        "write_tga",
        """
        Writes a TGA image file.

        TGA supports RLE or non-RLE compressed data. To use non-RLE-compressed data, set the global variable {@code stbi_write_tga_with_rle} to 0. The variable
        can be accessed with #write_tga_with_rle().
        """,

        write["filename"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..void.const.p("data", "the image data"),

        returnDoc = "1 on success, 0 on failure"
    )

    macro..Address..int.p(
        "write_tga_with_rle",
        "Returns the address of the global variable {@code stbi_write_tga_with_rle}.",
        void()
    )

    val write_hdr = intb(
        "write_hdr",
        """
        Writes an HDR image file.

        HDR expects linear float data. Since the format is always 32-bit rgb(e) data, alpha (if provided) is discarded, and for monochrome data it is
        replicated across all three channels.
        """,

        write["filename"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..float.const.p("data", "the image data"),

        returnDoc = "1 on success, 0 on failure"
    )

    val write_jpg = intb(
        "write_jpg",
        """
        Writes a JPEG image file.

        JPEG does ignore alpha channels in input data; quality is between 1 and 100. Higher quality looks better but results in a bigger image. JPEG baseline
        (no JPEG progressive).
        """,

        write["filename"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..void.const.p("data", "the image data"),
        int("quality", "the compression quality"),

        returnDoc = "1 on success, 0 on failure"

    )

    val write_to_func = intb(
        "write_png_to_func",
        "Callback version of #write_png().",

        stbi_write_func("func", "the callback function"),
        nullable..opaque_p("context", "a context that will be passed to {@code func}"),
        write["w"],
        write["h"],
        write["comp"],
        write["data"],
        write["stride_in_bytes"],

        returnDoc = "1 on success, 0 on failure"
    )

    intb(
        "write_bmp_to_func",
        "Callback version of #write_bmp().",

        write_to_func["func"],
        write_to_func["context"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..void.const.p("data", "the image data"),

        returnDoc = "1 on success, 0 on failure"
    )

    intb(
        "write_tga_to_func",
        "Callback version of #write_tga().",

        write_to_func["func"],
        write_to_func["context"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..void.const.p("data", "the image data"),

        returnDoc = "1 on success, 0 on failure"
    )

    intb(
        "write_hdr_to_func",
        "Callback version of #write_hdr().",

        write_to_func["func"],
        write_to_func["context"],
        write["w"],
        write["h"],
        write["comp"],
        write_hdr["data"],

        returnDoc = "1 on success, 0 on failure"
    )

    int(
        "write_jpg_to_func",
        "Callback version of #write_jpg().",

        write_to_func["func"],
        write_to_func["context"],
        write["w"],
        write["h"],
        write["comp"],
        Check("w * h * comp")..void.const.p("data", "the image data"),
        write_jpg["quality"],

        returnDoc = "1 on success, 0 on failure"
    )

    void(
        "flip_vertically_on_write",
        "Configures if the written image should flipped vertically.",

        intb("flip_boolean", "true to flip data vertically")
    )
}