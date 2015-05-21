/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.stb.templates

import org.lwjgl.generator.*
import org.lwjgl.stb.*

val stb_image_write = "STBImageWrite".nativeClass(packageName = STB_PACKAGE, prefix = "STBI", prefixMethod = "stbi_") {
	includeSTBAPI(
		"""#define STB_IMAGE_WRITE_IMPLEMENTATION
#include "stb_image_write.h"""")

	documentation =
		"""
		Native bindings to stb_image_write.h from the <a href="https://github.com/nothings/stb">stb library</a>.

		<h3>ABOUT</h3>

		This header file is a library for writing images to C stdio.

		The PNG output is not optimal; it is 20-50% larger than the file written by a decent optimizing implementation. This library is designed for source
		code compactness and simplicitly, not optimal image file size or run-time performance.

		<h3>USAGE</h3>

		There are four functions, one for each image file format:
		${codeBlock("""
int stbi_write_png(char const *filename, int w, int h, int comp, const void *data, int stride_in_bytes);
int stbi_write_bmp(char const *filename, int w, int h, int comp, const void *data);
int stbi_write_tga(char const *filename, int w, int h, int comp, const void *data);
int stbi_write_hdr(char const *filename, int w, int h, int comp, const void *data);""")}
		The functions create an image file defined by the parameters. The image is a rectangle of pixels stored from left-to-right, top-to-bottom. Each pixel
		contains {@code comp} channels of data stored interleaved with 8-bits per channel, in the following order: 1=Y, 2=YA, 3=RGB, 4=RGBA. (Y is monochrome
		color.) The rectangle is {@code w} pixels wide and {@code h} pixels tall. The {@code *data} pointer points to the first byte of the top-left-most
		pixel.
		"""

	val write = int(
		"write_png",
		"""
		Writes a PNR image file.

		PNG creates output files with the same number of components as the input.

		PNG supports writing rectangles of data even when the bytes storing rows of data are not consecutive in memory (e.g. sub-rectangles of a larger image),
		by supplying the stride between the beginning of adjacent rows. The other formats do not. (Thus you cannot write a native-format BMP through the BMP
		writer, both because it is in BGR order and because it may have padding at the end of the line.)
		""",

		const _ charASCII_p.IN("filename", "the image file path"),
		int.IN("w", "the image width, in pixels"),
		int.IN("h", "the image height, in pixels"),
		int.IN("comp", "the number of channels in each pixel"),
		Check("w * h * comp") _ const _ void_p.IN("data", "the image data"),
		int.IN("stride_in_bytes", "the distance in bytes from the first byte of a row of pixels to the first byte of the next row of pixels"),

	    returnDoc = "1 on success, 0 on failure"
	)

	int(
		"write_bmp",
		"""
		Writes a BMP image file.

		The BMP format expands Y to RGB in the file format and does not output alpha.
		""",

		write["filename"],
		write["w"],
		write["h"],
		write["comp"],
		write["data"]
	)

	int(
		"write_tga",
		"Writes a TGA image file.",

		write["filename"],
		write["w"],
		write["h"],
		write["comp"],
		write["data"]
	)

	int(
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
		Check("w * h * comp") _ const _ float_p.IN("data", "the image data")
	)
}