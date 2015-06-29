/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_conservative_raster = "NVConservativeRaster".nativeClassGL("NV_conservative_raster", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds a "conservative" rasterization mode where any pixel that is partially covered, even if no sample location is covered, is treated as
		fully covered and a corresponding fragment will be shaded.

		A new control is also added to modify window coordinate snapping precision.

		These controls can be used to implement "binning" to a low-resolution render target, for example to determine which tiles of a sparse texture need to
		be populated. An app can construct a framebuffer where there is one pixel per tile in the sparse texture, and adjust the number of subpixel bits such
		that snapping occurs to the same effective grid as when rendering to the sparse texture. Then triangles should cover (at least) the same pixels in the
		low-res framebuffer as they do tiles in the sparse texture.
		"""

	IntConstant(
		"Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled.",

		"CONSERVATIVE_RASTERIZATION_NV" _ 0x9346
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

		"SUBPIXEL_PRECISION_BIAS_X_BITS_NV" _ 0x9347,
		"SUBPIXEL_PRECISION_BIAS_Y_BITS_NV" _ 0x9348,
		"MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV" _ 0x9349
	)

	GLvoid(
		"SubpixelPrecisionBiasNV",
		"""
		Sets the #SUBPIXEL_PRECISION_BIAS_X_BITS_NV and #SUBPIXEL_PRECISION_BIAS_Y_BITS_NV values.

		The vertex's window x and y coordinates may be optionally converted to fixed-point values with {@code N} fractional bits. If
		#CONSERVATIVE_RASTERIZATION_NV is disabled, then {@code N} is the implementation-dependent value of GL11#SUBPIXEL_BITS. If
		#CONSERVATIVE_RASTERIZATION_NV is enabled, {@code N} is computed as the sum of the value of GL11#SUBPIXEL_BITS and programmable values of
		#SUBPIXEL_PRECISION_BIAS_X_BITS_NV and #SUBPIXEL_PRECISION_BIAS_Y_BITS_NV.

		When these values are non-zero, the invariance requirement may not apply because the subpixel precision may not be the same at all window coordinates.
		""",

		GLuint.IN("xbits", "the #SUBPIXEL_PRECISION_BIAS_X_BITS_NV value. The initial value is zero."),
		GLuint.IN("ybits", "the #SUBPIXEL_PRECISION_BIAS_Y_BITS_NV value. The initial value is zero.")
	)
}