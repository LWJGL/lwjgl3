/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_shader_explicit_vertex_parameter = "AMDShaderExplicitVertexParameter".nativeClassVK("AMD_shader_explicit_vertex_parameter", postfix = AMD) {
	documentation =
		"""
		When the {@code VK_AMD_shader_explicit_vertex_parameter} device extension is enabled  the application $can pass a SPIR-V module to
		#CreateShaderModule() that uses the {@code SPV_AMD_shader_explicit_vertex_parameter} SPIR-V extension.

		When the {@code VK_AMD_shader_explicit_vertex_parameter} device extension is enabled the {@code CustomInterpAMD} interpolation decoration $can also be
		used with fragment shader inputs which indicate that the decorated inputs $can only be accessed by the extended instruction
		{@code InterpolateAtVertexAMD} and allows accessing the value of the inputs for individual vertices of the primitive.

		When the {@code VK_AMD_shader_explicit_vertex_parameter} device extension is enabled inputs $can be also decorated with the {@code CustomInterpAMD}
		interpolation decoration, including fragment shader inputs that are signed or unsigned integers, integer vectors, or any double-precision
		floating-point type. Inputs decorated with {@code CustomInterpAMD} $can only be accessed by the extended instruction {@code InterpolateAtVertexAMD} and
		allows accessing the value of the input for individual vertices of the primitive.

		The {@code BaryCoordNoPerspAMD} decoration $can be used to decorate a fragment shader input variable. This variable will contain the (I,J) pair of the
		barycentric coordinates corresponding to the fragment evaluated using linear interpolation at the pixel's center. The K coordinate of the barycentric
		coordinates $can be derived given the identity I + J + K = 1.0.

		The {@code BaryCoordNoPerspCentroidAMD} decoration $can be used to decorate a fragment shader input variable. This variable will contain the (I,J) pair
		of the barycentric coordinates corresponding to the fragment evaluated using linear interpolation at the centroid. The K coordinate of the barycentric
		coordinates $can be derived given the identity I + J + K = 1.0.

		The {@code BaryCoordNoPerspCentroidAMD} decoration $can be used to decorate a fragment shader input variable. This variable will contain the (I,J) pair
		of the barycentric coordinates corresponding to the fragment evaluated using linear interpolation at each covered sample. The K coordinate of the
		barycentric coordinates $can be derived given the identity I + J + K = 1.0.

		The {@code BaryCoordPullModelAMD} decoration $can be used to decorate a fragment shader input variable. This variable will contain (1/W, 1/I, 1/J)
		evaluated at the pixel center and $can be used to calculate gradients and then interpolate I, J, and W at any desired sample location.

		The {@code BaryCoordSmoothAMD} decoration $can be used to decorate a fragment shader input variable. This variable will contain the (I,J) pair of the
		barycentric coordinates corresponding to the fragment evaluated using perspective interpolation at the pixel's center. The K coordinate of the
		barycentric coordinates $can be derived given the identity I + J + K = 1.0.

		The {@code BaryCoordSmoothCentroidAMD} decoration $can be used to decorate a fragment shader input variable. This variable will contain the (I,J) pair
		of the barycentric coordinates corresponding to the fragment evaluated using perspective interpolation at the centroid. The K coordinate of the
		barycentric coordinates can: be derived given the identity I + J + K = 1.0.

		The {@code BaryCoordSmoothCentroidAMD} decoration $can be used to decorate a fragment shader input variable. This variable will contain the (I,J) pair
		of the barycentric coordinates corresponding to the fragment evaluated using perspective interpolation at each covered sample. The K coordinate of the
		barycentric coordinates can: be derived given the identity I + J + K = 1.0.
		"""

	IntConstant(
		"The extension specification version.",

		"AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_EXTENSION_NAME".."VK_AMD_shader_explicit_vertex_parameter"
	)
}