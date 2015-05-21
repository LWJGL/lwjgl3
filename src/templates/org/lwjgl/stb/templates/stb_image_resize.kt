/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.stb.templates

import org.lwjgl.generator.*
import org.lwjgl.stb.*

val stb_image_resize = "STBImageResize".nativeClass(packageName = STB_PACKAGE, prefix = "STBIR", prefixMethod = "stbir_") {
	includeSTBAPI(
		"""#define STB_IMAGE_RESIZE_IMPLEMENTATION
#define STB_IMAGE_RESIZE_STATIC
#include "stb_image_resize.h"""")

	documentation =
		"""
		Native bindings to stb_image_resize.h from the <a href="https://github.com/nothings/stb">stb library</a>.

		Written with emphasis on usability, portability, and efficiency. (No SIMD or threads, so it be easily outperformed by libs that use those.) Only
		scaling and translation is supported, no rotations or shears. Easy API downsamples w/Mitchell filter, upsamples w/cubic interpolation.

		<h3>QUICKSTART</h3>
		${codeBlock("""
stbir_resize_uint8(      input_pixels , in_w , in_h , 0,
                         output_pixels, out_w, out_h, 0, num_channels)
stbir_resize_float(...)
stbir_resize_uint8_srgb( input_pixels , in_w , in_h , 0,
                         output_pixels, out_w, out_h, 0,
                         num_channels , alpha_chan  , 0)
stbir_resize_uint8_srgb_edgemode(
                         input_pixels , in_w , in_h , 0,
                         output_pixels, out_w, out_h, 0,
                         num_channels , alpha_chan  , 0, STBIR_EDGE_CLAMP)
                                                      // WRAP/REFLECT/ZERO""")}
        <h3>ALPHA CHANNEL</h3>

		Most of the resizing functions provide the ability to control how the alpha channel of an image is processed. The important things to know about this:
		${ol(
			"""
			The best mathematically-behaved version of alpha to use is called "premultiplied alpha", in which the other color channels have had the alpha value
			multiplied in. If you use premultiplied alpha, linear filtering (such as image resampling done by this library, or performed in texture units on
			GPUs) does the "right thing". While premultiplied alpha is standard in the movie CGI industry, it is still uncommon in the videogame/real-time
			world. If you linearly filter non-premultiplied alpha, strange effects occur. (For example, the average of 1% opaque bright green and 99% opaque
			black produces 50% transparent dark green when non-premultiplied, whereas premultiplied it produces 50% transparent near-black. The former
			introduces green energy that doesn't exist in the source image.)
			""",
			"""
			Artists should not edit premultiplied-alpha images; artists want non-premultiplied alpha images. Thus, art tools generally output non-premultiplied
			alpha images.
			""",
		    "You will get best results in most cases by converting images to premultiplied alpha before processing them mathematically.",
		    """
			If you pass the flag #FLAG_ALPHA_PREMULTIPLIED, the resizer does not do anything special for the alpha channel; it is resampled identically to
			other channels. This produces the correct results for premultiplied-alpha images, but produces less-than-ideal results for non-premultiplied-alpha
			images.
		    """,
		    """
			If you do not pass the flag #FLAG_ALPHA_PREMULTIPLIED, then the resizer weights the contribution of input pixels based on their alpha values, or,
			equivalently, it multiplies the alpha value into the color channels, resamples, then divides by the resultant alpha value. Input pixels which have
			{@code alpha=0} do not contribute at all to output pixels unless <b>all</b> of the input pixels affecting that output pixel have {@code alpha=0},
			in which case the result for that pixel is the same as it would be without #FLAG_ALPHA_PREMULTIPLIED. However, this is only true for input images
			in integer formats. For input images in float format, input pixels with {@code alpha=0} have no effect, and output pixels which have
			{@code alpha=0} will be 0 in all channels. (For float images, you can manually achieve the same result by adding a tiny epsilon value to the alpha
			channel of every image, and then subtracting or clamping it at the end.)
		    """,
		    """
			You can separately control whether the alpha channel is interpreted as linear or affected by the colorspace. By default it is linear; you almost
			never want to apply the colorspace. (For example, graphics hardware does not apply sRGB conversion to the alpha channel.)
		    """
		)}
		"""

	// Easy-to-use API

	IntConstant(
		"Set this flag if you have no alpha channel, or otherwise provide the index of the alpha channel.",
		"ALPHA_CHANNEL_NONE" _ -1
	)
	IntConstant(
		"""
		Set this flag if your texture has premultiplied alpha. Otherwise, stbir will use alpha-weighted resampling (effectively premultiplying, resampling,
		then unpremultiplying).
		""",
		"FLAG_ALPHA_PREMULTIPLIED" _ -1
	)
	IntConstant(
		"The specified alpha channel should be handled as gamma-corrected value even when doing sRGB operations.",
		"FLAG_ALPHA_USES_COLORSPACE" _ -1
	)

	val EdgeWrapModes = IntConstant(
		"Edge wrap mode.",

		"EDGE_CLAMP" _ 1,
		"EDGE_REFLECT" _ 2,
		"EDGE_WRAP" _ 3,
		"EDGE_ZERO" _ 4
	).javaDocLinks

	val resize_uint8 = int(
		"resize_uint8",
		"""
		Easy-to-use API for resizing images.
		${ul(
			"The colorspace is linear.",
		    "The alpha channel is treated identically to other channels.",
		    """
		    Memory required grows approximately linearly with input and output size, but with discontinuities at {@code input_w == output_w} and
		    {@code input_h == output_h}.
		    """
		)}
		This function uses the default resampling filter defined at compile time. For a different filter, use the medium-complexity API.
		""",

		Check("input_w * input_h * num_channels") _ const _ unsigned_char_p.IN("input_pixels", "the source image data"),
		int.IN("input_w", "the source image width"),
		int.IN("input_h", "the source image height"),
		int.IN(
			"input_stride_in_bytes",
			"the offset between successive rows of the source image data in memory, in bytes. You can specify 0 to mean packed continuously in memory"
		),
		Check("output_w * output_h * num_channels") _ unsigned_char_p.OUT("output_pixels", "returns the scaled image data"),
		int.IN("output_w", "the resized image width"),
		int.IN("output_h", "the resized image height"),
		int.IN(
			"output_stride_in_bytes",
			"the offset between successive rows of the resized image data in memory, in bytes. You can specify 0 to mean packed continuously in memory"
		),
		int.IN("num_channels", "the number of channels in the image (e.g. RGB=3, RGBA=4)"),

	    returnDoc = "1 on success, 0 on failure"
	)

	val resize_float = int(
		"resize_float",
		"Float version of #resize_uint8().",

		Check("input_w * input_h * num_channels") _ const _ float_p.IN("input_pixels", "the source image data"),
		resize_uint8["input_w"],
		resize_uint8["input_h"],
		resize_uint8["input_stride_in_bytes"],
		Check("output_w * output_h * num_channels") _ float_p.OUT("output_pixels", "returns the scaled image data"),
		resize_uint8["output_w"],
		resize_uint8["output_h"],
		resize_uint8["output_stride_in_bytes"],
		resize_uint8["num_channels"],

		returnDoc = "1 on success, 0 on failure"
	)

	val resize_uint8_srgb = int(
		"resize_uint8_srgb",
		"""
		Easy-to-use API for resizing images.
		${ul(
			"The image data is interpreted as gamma-corrected sRGB.",
			"""
		    Memory required grows approximately linearly with input and output size, but with discontinuities at {@code input_w == output_w} and
		    {@code input_h == output_h}.
		    """
		)}
		This function uses the default resampling filter defined at compile time. For a different filter, use the medium-complexity API.
		""",

		resize_uint8["input_pixels"],
		resize_uint8["input_w"],
		resize_uint8["input_h"],
		resize_uint8["input_stride_in_bytes"],
		resize_uint8["output_pixels"],
		resize_uint8["output_w"],
		resize_uint8["output_h"],
		resize_uint8["output_stride_in_bytes"],
		resize_uint8["num_channels"],
		int.IN("alpha_channel", "the alpha channel index, or #ALPHA_CHANNEL_NONE if there is no alpha channel"),
		int.IN(
			"flags",
			"the alpha channel flags. 0 will propably do the right thing if you're not sure what the flags mean",
			"#FLAG_ALPHA_PREMULTIPLIED #FLAG_ALPHA_USES_COLORSPACE"
		),

		returnDoc = "1 on success, 0 on failure"
	)

	val resize_uint8_srgb_edgemode = int(
		"resize_uint8_srgb_edgemode",
		"Same as #resize_uint8_srgb(), but adds the ability to specify how requests to sample off the edge of the image are handled.",

		resize_uint8["input_pixels"],
		resize_uint8["input_w"],
		resize_uint8["input_h"],
		resize_uint8["input_stride_in_bytes"],
		resize_uint8["output_pixels"],
		resize_uint8["output_w"],
		resize_uint8["output_h"],
		resize_uint8["output_stride_in_bytes"],
		resize_uint8["num_channels"],
		resize_uint8_srgb["alpha_channel"],
		resize_uint8_srgb["flags"],
		stbir_edge.IN("edge_wrap_mode", "the edge wrap mode", EdgeWrapModes),

		returnDoc = "1 on success, 0 on failure"
	)

	// Medium-complexity API

	IntConstant("Use same filter type that easy-to-use API chooses.", "FILTER_DEFAULT" _ 0)
	IntConstant("A trapezoid w/1-pixel wide ramps, same result as box for integer scale ratios.", "FILTER_BOX" _ 1)
	IntConstant("On upsampling, produces same results as bilinear texture filtering.", "FILTER_TRIANGLE" _ 2)
	IntConstant("The cubic b-spline (aka Mitchell-Netrevalli with B=1,C=0), gaussian-esque.", "FILTER_CUBICBSPLINE" _ 3)
	IntConstant("An interpolating cubic spline.", "FILTER_CATMULLROM" _ 4)
	IntConstant("Mitchell-Netrevalli filter with B=1/3, C=1/3.", "FILTER_MITCHELL" _ 5)
	val Filters = "#FILTER_DEFAULT #FILTER_BOX #FILTER_TRIANGLE #FILTER_CUBICBSPLINE #FILTER_CATMULLROM #FILTER_MITCHELL"

	val ColorSpaces = IntConstant(
		"Colorspace.",

		"COLORSPACE_LINEAR" _ 0,
		"COLORSPACE_SRGB" _ 1
	).javaDocLinks

	val resize_uint8_generic = int(
		"resize_uint8_generic",
		"Medium-complexity version of #resize_uint8().",

		resize_uint8["input_pixels"],
		resize_uint8["input_w"],
		resize_uint8["input_h"],
		resize_uint8["input_stride_in_bytes"],
		resize_uint8["output_pixels"],
		resize_uint8["output_w"],
		resize_uint8["output_h"],
		resize_uint8["output_stride_in_bytes"],
		resize_uint8["num_channels"],
		resize_uint8_srgb["alpha_channel"],
		resize_uint8_srgb["flags"],
		resize_uint8_srgb_edgemode["edge_wrap_mode"],
		stbir_filter.IN("filter", "the scale filter", Filters),
		stbir_colorspace.IN("space", "the image colorspace", ColorSpaces),
		Expression("0L") _ void_p.IN("alloc_context", "pointer to the allocation context"),

		returnDoc = "1 on success, 0 on failure"
	)

	int(
		"resize_uint16_generic",
		"Short version of #resize_uint8_generic().",

		Check("input_w * input_h * num_channels") _ const _ stbir_uint16_p.IN("input_pixels", "the source image data"),
		resize_uint8["input_w"],
		resize_uint8["input_h"],
		resize_uint8["input_stride_in_bytes"],
		Check("output_w * output_h * num_channels") _ stbir_uint16_p.OUT("output_pixels", "returns the scaled image data"),
		resize_uint8["output_w"],
		resize_uint8["output_h"],
		resize_uint8["output_stride_in_bytes"],
		resize_uint8["num_channels"],
		resize_uint8_srgb["alpha_channel"],
		resize_uint8_srgb["flags"],
		resize_uint8_srgb_edgemode["edge_wrap_mode"],
		resize_uint8_generic["filter"],
		resize_uint8_generic["space"],
		resize_uint8_generic["alloc_context"],

		returnDoc = "1 on success, 0 on failure"
	)

	int(
		"resize_float_generic",
		"Float version of #resize_uint8_generic().",

		resize_float["input_pixels"],
		resize_uint8["input_w"],
		resize_uint8["input_h"],
		resize_uint8["input_stride_in_bytes"],
		resize_float["output_pixels"],
		resize_uint8["output_w"],
		resize_uint8["output_h"],
		resize_uint8["output_stride_in_bytes"],
		resize_uint8["num_channels"],
		resize_uint8_srgb["alpha_channel"],
		resize_uint8_srgb["flags"],
		resize_uint8_srgb_edgemode["edge_wrap_mode"],
		resize_uint8_generic["filter"],
		resize_uint8_generic["space"],
		resize_uint8_generic["alloc_context"],

		returnDoc = "1 on success, 0 on failure"
	)

	// Full-complexity API

	val DataTypes = IntConstant(
		"Data type.",

		"TYPE_UINT8" _ 0,
		"TYPE_UINT16" _ 1,
		"TYPE_UINT32" _ 2,
		"TYPE_FLOAT" _ 3
	).javaDocLinks

	val resize = int(
		"resize",
		"Full-complexity version of #resize_uint8_generic().",

		const _ void_p.IN("input_pixels", "the source image data"),
		resize_uint8["input_w"],
		resize_uint8["input_h"],
		resize_uint8["input_stride_in_bytes"],
		void_p.OUT("output_pixels", "returns the scaled image data"),
		resize_uint8["output_w"],
		resize_uint8["output_h"],
		resize_uint8["output_stride_in_bytes"],
		stbir_datatype.IN("datatype", "the image data type", DataTypes),
		resize_uint8["num_channels"],
		resize_uint8_srgb["alpha_channel"],
		resize_uint8_srgb["flags"],
		stbir_edge.IN("edge_mode_horizontal", "the horizontal edge wrap mode"),
		stbir_edge.IN("edge_mode_vertical", "the vertical edge wrap mode"),
		stbir_filter.IN("filter_horizontal", "the horizontal scale filter"),
		stbir_filter.IN("filter_vertical", "the vertical scale filter"),
		resize_uint8_generic["space"],
		resize_uint8_generic["alloc_context"],

	    returnDoc = "1 on success, 0 on failure"
	)

	int(
		"resize_subpixel",
		"Subpixel version of #resize().",

		resize["input_pixels"],
		resize["input_w"],
		resize["input_h"],
		resize["input_stride_in_bytes"],
		resize["output_pixels"],
		resize["output_w"],
		resize["output_h"],
		resize["output_stride_in_bytes"],
		resize["datatype"],
		resize["num_channels"],
		resize["alpha_channel"],
		resize["flags"],
		resize["edge_mode_horizontal"],
		resize["edge_mode_vertical"],
		resize["filter_horizontal"],
		resize["filter_vertical"],
		resize["space"],
		resize["alloc_context"],
		float.IN("x_scale", "horizontal scale for subpixel correctness"),
		float.IN("y_scale", "vertical scale for subpixel correctness"),
		float.IN("x_offset", "horizontal offset for subpixel correctness"),
		float.IN("y_offset", "vertical offset for subpixel correctness"),

		returnDoc = "1 on success, 0 on failure"
	)

	int(
		"resize_region",
		"Region version of #resize(), using texture coordinates.",

		resize["input_pixels"],
		resize["input_w"],
		resize["input_h"],
		resize["input_stride_in_bytes"],
		resize["output_pixels"],
		resize["output_w"],
		resize["output_h"],
		resize["output_stride_in_bytes"],
		resize["datatype"],
		resize["num_channels"],
		resize["alpha_channel"],
		resize["flags"],
		resize["edge_mode_horizontal"],
		resize["edge_mode_vertical"],
		resize["filter_horizontal"],
		resize["filter_vertical"],
		resize["space"],
		resize["alloc_context"],
		float.IN("s0", "the left texture coordinate of the region to scale"),
		float.IN("t0", "the top texture coordinate of the region to scale"),
		float.IN("s1", "the right texture coordinate of the region to scale"),
		float.IN("t1", "the bottom texture coordinate of the region to scale"),

		returnDoc = "1 on success, 0 on failure"
	)
}