/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.stb.templates

import org.lwjgl.generator.*
import org.lwjgl.stb.*

val stb_image = "STBImage".nativeClass(packageName = STB_PACKAGE, prefix = "STBI_", library = STB_LIBRARY) {
    includeSTBAPI(
        """#include "lwjgl_malloc.h"
#define STBI_MALLOC(sz)    org_lwjgl_malloc(sz)
#define STBI_REALLOC(p,sz) org_lwjgl_realloc(p,sz)
#define STBI_FREE(p)       org_lwjgl_free(p)
#define STBI_FAILURE_USERMSG
#define STBI_ASSERT(x)
#define STB_IMAGE_IMPLEMENTATION
#define STB_IMAGE_STATIC
#include "stb_image.h"""")

    documentation =
        """
        Native bindings to stb_image.h from the ${url("https://github.com/nothings/stb", "stb library")}.

        <h3>Quick notes</h3>

        Primarily of interest to game developers and other people who can avoid problematic images and only need the trivial interface. Supported formats:
        ${ul(
            "JPEG baseline & progressive (12 bpc/arithmetic not supported, same as stock IJG lib",
            "PNG 1/2/4/8/16-bit-per-channel",
            "TGA (not sure what subset, if a subset)",
            "BMP non-1bpp, non-RLE",
            "PSD (composited view only, no extra channels, 8/16 bit-per-channel)",
            "GIF (*desired_channels always reports as 4-channel)",
            "HDR (radiance rgbE format)",
            "PIC (Softimage PIC)",
            "PNM (PPM and PGM binary only)"
        )}

        Animated GIF still needs a proper API, but ${url("http://gist.github.com/urraka/685d9a6340b26b830d49", "here")}'s one way to do it.

        Features:
        ${ul(
            "decode from memory <s>or through FILE (define STBI_NO_STDIO to remove code)</s>",
            "decode from arbitrary I/O callbacks",
            "SIMD acceleration on x86/x64 (SSE2) and ARM (NEON)"
        )}

        Limitations:
        ${ul(
            "no 16-bit-per-channel PNG",
            "no 12-bit-per-channel JPEG",
            "no JPEGs with arithmetic coding",
            "no 1-bit BMP",
            "GIF always returns *channels_in_file=4"
        )}

        Basic usage (see HDR discussion below for HDR usage):
        ${codeBlock("""
int x,y,n;
unsigned char *data = stbi_load(filename, &x, &y, &n, 0);
// ... process data if not NULL ...
// ... x = width, y = height, n = # 8-bit components per pixel ...
// ... replace '0' with '1'..'4' to force that many components per pixel
// ... but 'n' will always be the number that it would have been if you said 0
stbi_image_free(data)""")}

        <h3>HDR image support</h3>

        stb_image now supports loading HDR images in general, and currently the Radiance .HDR file format, although the support is provided generically. You
        can still load any file through the existing interface; if you attempt to load an HDR file, it will be automatically remapped to LDR, assuming gamma
        2.2 and an arbitrary scale factor defaulting to 1; both of these constants can be reconfigured through this interface:
        ${codeBlock("""
stbi_hdr_to_ldr_gamma(2.2f);
stbi_hdr_to_ldr_scale(1.0f);"""
        )}
        (note, do not use <em>inverse</em> constants; stbi_image will invert them appropriately).

        Additionally, there is a new, parallel interface for loading files as (linear) floats to preserve the full dynamic range:
        ${codeBlock("""
float *data = stbi_loadf(filename, &x, &y, &n, 0);""")}
        If you load LDR images through this interface, those images will be promoted to floating point values, run through the inverse of constants
        corresponding to the above:
        ${codeBlock("""
stbi_ldr_to_hdr_scale(1.0f);
stbi_ldr_to_hdr_gamma(2.2f);""")}
        Finally, given a filename (or an open file or memory block) containing image data, you can query for the "most appropriate" interface to use (that is,
        whether the image is HDR or not), using:
        ${codeBlock("""
stbi_is_hdr(char *filename);""")}

        <h3>iPhone PNG support</h3>
        By default we convert iphone-formatted PNGs back to RGB, even though they are internally encoded differently. You can disable this conversion by
        calling #convert_iphone_png_to_rgb()(0), in which case you will always just get the native iphone "format" through (which is BGR stored in RGB).

        Call #set_unpremultiply_on_load()(1) as well to force a divide per pixel to remove any premultiplied alpha *only* if the image file explicitly says
        there's premultiplied data (currently only happens in iPhone images, and only if iPhone convert-to-rgb processing is on).
        """

    EnumConstant(
        "Component count.",

        "default" enum "Default component count, used as an argument to {@code desired_channels}.",
        "grey".enum,
        "grey_alpha".enum,
        "rgb".enum,
        "rgb_alpha".enum
    )

    val load = stbi_uc_p(
        "load",
        """
        Loads an image from the specified file.

        The return value from an image loader is an {@code 'unsigned char *'} which points to the pixel data, or #NULL on an allocation failure or if the image
        is corrupt or invalid. The pixel data consists of {@code *y} scanlines of {@code *x} pixels, with each pixel consisting of N interleaved 8-bit
        components; the first pixel pointed to is top-left-most in the image. There is no padding between image scanlines or between pixels, regardless of
        format. The number of components N is {@code 'desired_channels'} if {@code desired_channels} is non-zero, or {@code *channels_in_file} otherwise. If {@code desired_channels} is non-zero,
        {@code *channels_in_file} has the number of components that <i>would</i> have been output otherwise. E.g. if you set {@code desired_channels} to 4, you will always get
        RGBA output, but you can check {@code *channels_in_file} to see if it's trivially opaque because e.g. there were only 3 channels in the source image.

        An output image with N components has the following components interleaved in this order in each pixel:
        ${codeBlock("""
N=\#channels_in_file     components
  1                     grey
  2                     grey, alpha
  3                     red, green, blue
  4                     red, green, blue, alpha""")}
        If image loading fails for any reason, the return value will be #NULL, and {@code *x}, {@code *y}, {@code *channels_in_file} will be unchanged. The function
        #failure_reason() can be queried for an extremely brief, end-user unfriendly explanation of why the load failed.

        Paletted PNG, BMP, GIF, and PIC images are automatically depalettized.
        """,

        const..charASCII_p.IN("filename", "the file name"),
        Check(1)..AutoSizeResult..int_p.OUT("x", "outputs the image width in pixels"),
        Check(1)..AutoSizeResult..int_p.OUT("y", "outputs the image height in pixels"),
        Check(1)..AutoSizeResult("(desired_channels != 0 ? desired_channels : \$original)")..int_p.OUT("channels_in_file", "outputs number of components in image"),
        int.IN("desired_channels", "0 or 1..4 to force that many components per pixel", "0 1 2 3 4")
    )

    stbi_uc_p(
        "load_from_memory",
        "In-memory version of #load().",

        const..stbi_uc_p.IN("buffer", "the buffer from which to load the image data"),
        AutoSize("buffer")..int.IN("len", "the buffer length, in bytes"),
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    stbi_uc_p(
        "load_from_callbacks",
        """
        Callback version of #load().

        I/O callbacks allow you to read from arbitrary sources, like packaged files or some other source. Data read from callbacks are processed through a
        small internal buffer (currently 128 bytes) to try to reduce overhead.

        The three functions you must define are "read" (reads some bytes of data), "skip" (skips some bytes of data), "eof" (reports if the stream is at the
        end).
        """,

        const..stbi_io_callbacks_p.IN("clbk", "an ##STBIIOCallbacks struct"),
        nullable..opaque_p.IN("user", "a pointer to user data"),
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    stbi_us_p(
        "load_16",
        "16-bits-per-channel version of #load().",

        const..charASCII_p.IN("filename", "the file name"),
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    float_p(
        "loadf",
        "Floating-point version of #load().",

        const..charASCII_p.IN("filename", "the file name"),
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    float_p(
        "loadf_from_memory",
        "Floating-point version of #load_from_memory().",

        const..stbi_uc_p.IN("buffer", "the buffer from which to load the image data"),
        AutoSize("buffer")..int.IN("len", "the buffer length, in bytes"),
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    float_p(
        "loadf_from_callbacks",
        "Floating-point version of #load_from_callbacks().",

        const..stbi_io_callbacks_p.IN("clbk", "an ##STBIIOCallbacks struct"),
        nullable..opaque_p.IN("user", "a pointer to user data"),
        load["x"],
        load["y"],
        load["channels_in_file"],
        load["desired_channels"]
    )

    void(
        "hdr_to_ldr_gamma",
        "Changes the gamma value used when converting HDR images to LDR. The default value is 2.2f",

        float.IN("gamma", "the gamma value")
    )

    void(
        "hdr_to_ldr_scale",
        "Changes the scale factor used when converting HDR images to LDR. The default value is 1.0f",

        float.IN("scale", "the scale factor")
    )

    void(
        "ldr_to_hdr_gamma",
        "Changes the gamma value used when converting LDR images to HDR. The default value is 2.2f",

        float.IN("gamma", "the gamma value")
    )

    void(
        "ldr_to_hdr_scale",
        "Changes the scale value used when converting LDR images to HDR. The default value is 1.0f",

        float.IN("scale", "the scale factor")
    )

    intb(
        "is_hdr",
        "Checks if the specified file contains an HDR image.",

        const..charASCII_p.IN("filename", "the file name"),

        returnDoc = "1 if the image is HDR, 0 otherwise"
    )

    intb(
        "is_hdr_from_memory",
        "In-memory version of #is_hdr().",

        const..stbi_uc_p.IN("buffer", "the buffer from which to read the image data"),
        AutoSize("buffer")..int.IN("len", "the buffer length, in bytes")
    )

    intb(
        "is_hdr_from_callbacks",
        "Callback version of #is_hdr().",

        const..stbi_io_callbacks_p.IN("clbk", "an ##STBIIOCallbacks struct"),
        nullable..opaque_p.IN("user", "a pointer to user data")
    )

    const..charASCII_p(
        "failure_reason",
        "Returns a brief reason for failure."
    )

    OffHeapOnly..void(
        "image_free",
        "Frees a loaded image",

        MultiType(PointerMapping.DATA_FLOAT)..Unsafe..void_p.IN("retval_from_stbi_load", "an stb image")
    )

    intb(
        "info",
        "Returns image dimensions &amp; components without fully decoding the image.",

        const..charASCII_p.IN("filename", "the file name"),
        Check(1)..int_p.OUT("x", "outputs the image width in pixels"),
        Check(1)..int_p.OUT("y", "outputs the image height in pixels"),
        Check(1)..int_p.OUT("comp", "outputs number of components in image"),

        returnDoc = "1 on success, 0 on failure"
    )

    intb(
        "info_from_memory",
        "In-memory version of #info().",

        const..stbi_uc_p.IN("buffer", "the buffer from which to read the image data"),
        AutoSize("buffer")..int.IN("len", "the buffer length, in bytes"),
        Check(1)..int_p.OUT("x", "outputs the image width in pixels"),
        Check(1)..int_p.OUT("y", "outputs the image height in pixels"),
        Check(1)..int_p.OUT("comp", "outputs number of components in image")
    )

    intb(
        "info_from_callbacks",
        "Callback version of #info().",

        const..stbi_io_callbacks_p.IN("clbk", "an ##STBIIOCallbacks struct"),
        nullable..opaque_p.IN("user", "a pointer to user data"),
        Check(1)..int_p.OUT("x", "outputs the image width in pixels"),
        Check(1)..int_p.OUT("y", "outputs the image height in pixels"),
        Check(1)..int_p.OUT("comp", "outputs number of components in image")
    )

    void(
        "set_unpremultiply_on_load",
        """
        For image formats that explicitly notate that they have premultiplied alpha, we just return the colors as stored in the file. Set this flag to force
        unpremultiplication. Results are undefined if the unpremultiply overflows.
        """,

        intb.IN("flag_true_if_should_unpremultiply", "the unpremultiply flag")
    )

    void(
        "convert_iphone_png_to_rgb",
        "Indicate whether we should process iPhone images back to canonical format, or just pass them through \"as-is\".",

        intb.IN("flag_true_if_should_convert", "the convert iPhone PNG to RGB flag")
    )

    void(
        "set_flip_vertically_on_load",
        "Flips the image vertically, so the first pixel in the output array is the bottom left.",

        intb.IN("flag_true_if_should_flip", "the flip vertically on load flag")
    )

    char_p(
        "zlib_decode_malloc_guesssize",
        "ZLIB client - used by PNG, available for other purposes",

        const..char_p.IN("buffer", ""),
        AutoSize("buffer")..int.IN("len", ""),
        int.IN("initial_size", ""),
        AutoSizeResult..int_p.OUT("outlen", "")
    )

    char_p(
        "zlib_decode_malloc_guesssize_headerflag",
        "ZLIB client - used by PNG, available for other purposes",

        const..char_p.IN("buffer", ""),
        AutoSize("buffer")..int.IN("len", ""),
        int.IN("initial_size", ""),
        AutoSizeResult..int_p.OUT("outlen", ""),
        intb.IN("parse_header", "")
    )

    char_p(
        "zlib_decode_malloc",
        "ZLIB client - used by PNG, available for other purposes",

        const..char_p.IN("buffer", ""),
        AutoSize("buffer")..int.IN("len", ""),
        AutoSizeResult..int_p.OUT("outlen", "")
    )

    int(
        "zlib_decode_buffer",
        "ZLIB client - used by PNG, available for other purposes",

        char_p.OUT("obuffer", ""),
        AutoSize("obuffer")..int.IN("olen", ""),
        const..char_p.IN("ibuffer", ""),
        AutoSize("ibuffer")..int.IN("ilen", "")
    )

    char_p(
        "zlib_decode_noheader_malloc",
        "ZLIB client - used by PNG, available for other purposes",

        const..char_p.IN("buffer", ""),
        AutoSize("buffer")..int.IN("len", ""),
        AutoSizeResult..int_p.OUT("outlen", "")
    )

    int(
        "zlib_decode_noheader_buffer",
        "ZLIB client - used by PNG, available for other purposes",

        char_p.OUT("obuffer", ""),
        AutoSize("obuffer")..int.IN("olen", ""),
        const..char_p.IN("ibuffer", ""),
        AutoSize("ibuffer")..int.IN("ilen", "")
    )
}