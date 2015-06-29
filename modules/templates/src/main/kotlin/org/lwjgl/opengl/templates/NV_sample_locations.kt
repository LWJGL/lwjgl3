/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_sample_locations = "NVSampleLocations".nativeClassGL("NV_sample_locations", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

				This extension allows an application to modify the locations of samples within a pixel used in multisample rasterization. Additionally, it allows
		applications to specify different sample locations for each pixel in a group of adjacent pixels, which may increase antialiasing quality (particularly
		if a custom resolve shader is used that takes advantage of these different locations).

		It is common for implementations to optimize the storage of depth values by storing values that can be used to reconstruct depth at each sample
		location, rather than storing separate depth values for each sample. For example, the depth values from a single triangle can be represented using
		plane equations. When the depth value for a sample is needed, it is automatically evaluated at the sample location. Modifying the sample locations
		causes the reconstruction to no longer evaluate the same depth values as when the samples were originally generated. This extension provides a command
		to "resolve" and store per-sample depth values using the currently programmed sample locations, which allows the application to manage this issue
		if/when necessary.

		The programmable sample locations are used during rasterization and for evaluation of depth functions during normal geometric rendering. The
		programmable locations are associated with a framebuffer object rather than an individual depth buffer, so if the depth buffer is used as a texture the
		texture sampling may be done at the standard sample locations. Additionally, commands that do not render geometric primitives (e.g. ReadPixels,
		BlitFramebuffer, CopyTexSubImage2D, etc.) may use the standard sample locations to resolve depth functions rather than the programmable locations. If a
		single depth buffer is used at different times with different sample locations, the depth functions may be interpreted using the current sample
		locations.
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

		"SAMPLE_LOCATION_SUBPIXEL_BITS_NV" _ 0x933D,
		"SAMPLE_LOCATION_PIXEL_GRID_WIDTH_NV" _ 0x933E,
		"SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_NV" _ 0x933F,
		"PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_NV" _ 0x9340
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetMultisamplefv.",

		"SAMPLE_LOCATION_NV" _ 0x8E50,
		"PROGRAMMABLE_SAMPLE_LOCATION_NV" _ 0x9341
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of FramebufferParameteri, GetFramebufferParameteriv.",

		"FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_NV" _ 0x9342,
		"FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_NV" _ 0x9343
	)

	GLvoid(
		"FramebufferSampleLocationsfvNV",
		"Updates the programmable sample locations",

		GLenum.IN("target", "the framebuffer whose programmable sample locations are modified"),
		GLuint.IN("start", "the index of the first sample location to modify"),
		AutoSize("v") shr 1 _ GLsizei.IN("count", "the number of sample locations to modify"),
		const _ GLfloat_p.IN("v", "a pair of floating point values in the range [0,1] for each sample location")
	)

	GLvoid(
		"NamedFramebufferSampleLocationsfvNV",
		"Updates the programmable sample locations",

		GLuint.IN("framebuffer", "the framebuffer whose programmable sample locations are modified"),
		GLuint.IN("start", "the index of the first sample location to modify"),
		AutoSize("v") shr 1 _ GLsizei.IN("count", "the number of sample locations to modify"),
		const _ GLfloat_p.IN("v", "a pair of floating point values in the range [0,1] for each sample location")
	)

	GLvoid(
		"ResolveDepthValuesNV",
		"""
		Evaluates depth values for all samples in the current depth buffer (subject to the pixel ownership and scissor tests) and stores each value in the
		depth buffer. This can be used to ensure that later accesses will use depth values consistent with the sample locations used when the samples were
		generated. If the current framebuffer has no depth buffer, ResolveDepthValuesNV will have no effect.
		"""
	)
}