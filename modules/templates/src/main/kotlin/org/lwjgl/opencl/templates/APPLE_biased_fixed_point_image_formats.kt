/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val APPLE_biased_fixed_point_image_formats = "APPLEBiasedFixedPointImageFormats".nativeClassCL("APPLE_biased_fixed_point_image_formats", APPLE) {
	documentation =
		"""
		Native bindings to the $extensionName extension.

		This selector may be passed to CL10#CreateImage2D() in the cl_image_format.image_channel_data_type field. It defines a biased signed 1.14 fixed point
		storage format, with range [-1, 3). The conversion from float to this fixed point format is defined as follows:
		${codeBlock("""
ushort float_to_sfixed14( float x ){
	int i = convert_int_sat_rte( x * 0x1.0p14f );         // scale [-1, 3.0) to [-16384, 3*16384), round to nearest integer
	i = add_sat( i, 0x4000 );                             // apply bias, to convert to [0, 65535) range
	return convert_ushort_sat(i);                         // clamp to destination size
}
""")}
		The inverse conversion is the reverse process. The formats are currently only available on the CPU with the CL10#RGBA channel layout.
		"""

	IntConstant(
		"",

		"SFIXED14_APPLE" _ 0x10000008,
		"BIASED_HALF_APPLE" _ 0x10000009
	)
}