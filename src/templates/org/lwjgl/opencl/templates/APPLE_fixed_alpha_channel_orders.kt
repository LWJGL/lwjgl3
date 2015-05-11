/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val APPLE_fixed_alpha_channel_orders = "APPLEFixedAlphaChannelOrders".nativeClassCL("APPLE_fixed_alpha_channel_orders", APPLE) {
	documentation =
		"""
		Native bindings to the $extensionName extension.

		These selectors may be passed to CL10#CreateImage2D() in the cl_image_format.image_channel_order field. They are like CL10#BGRA and CL10#ARGB except
		that the alpha channel to be ignored.  On calls to {@code read_imagef}, the alpha will be 0xff (1.0f) if the sample falls in the image and 0 if it does
		not fall in the image. On calls to {@code write_imagef}, the alpha value is ignored and 0xff (1.0f) is written. These formats are currently only
		available for the CL10#UNORM_INT8 cl_channel_type. They are intended to support legacy image formats.
		"""

	IntConstant(
		"",

		"1RGB_APPLE" _ 0x10000006,
		"BGR1_APPLE" _ 0x10000007
	)
}