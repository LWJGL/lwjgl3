/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_gpu_shader5 = "ARBGPUShader5".nativeClassGL("ARB_gpu_shader5") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides a set of new features to the OpenGL Shading Language and related APIs to support capabilities of new GPUs, extending the
		capabilities of version 1.50 of the OpenGL Shading Language. Shaders using the new functionality provided by this extension should enable this
		functionality via the construct:
		${codeBlock("\\#extension GL_ARB_gpu_shader5 : require     (or enable)")}
		This extension provides a variety of new features for all shader types, including:
		${ul(
			"""
			support for indexing into arrays of samplers using non-constant indices, as long as the index doesn't diverge if multiple shader invocations are run
			in lockstep;
			""",
		    "extending the uniform block capability of OpenGL 3.1 and 3.2 to allow shaders to index into an array of uniform blocks;",
		    """
		    support for implicitly converting signed integer types to unsigned types, as well as more general implicit conversion and function overloading
		    infrastructure to support new data types introduced by other extensions;
		    """,
		    """
		    a "precise" qualifier allowing computations to be carried out exactly as specified in the shader source to avoid optimization-induced invariance
		    issues (which might cause cracking in tessellation);
		    """,
			"""
			new built-in functions supporting:
			${ul(
				"fused floating-point multiply-add operations;",
			    """
			    splitting a floating-point number into a significand and exponent (frexp), or building a floating-point number from a significand and exponent
			    (ldexp);
			    """,
			    """
			    integer bitfield manipulation, including functions to find the position of the most or least significant set bit, count the number of one bits,
			    and bitfield insertion, extraction, and reversal;
			    """,
			    "packing and unpacking vectors of small fixed-point data types into a larger scalar; and",
			    "convert floating-point values to or from their integer bit encodings;"
			)}
			""",
		    """
		    extending the textureGather() built-in functions provided by ${ARB_texture_gather.link}:
		    ${ul(
			    "allowing shaders to select any single component of a multi-component texture to produce the gathered 2x2 footprint;",
		        "allowing shaders to perform a per-sample depth comparison when gathering the 2x2 footprint using for shadow sampler types;",
		        "allowing shaders to use arbitrary offsets computed at run-time to select a 2x2 footprint to gather from; and",
		        "allowing shaders to use separate independent offsets for each of the four texels returned, instead of requiring a fixed 2x2 footprint."
		    )}
		    """
		)}

		This extension also provides some new capabilities for individual shader types, including:
		${ul(
			"""
			support for instanced geometry shaders, where a geometry shader may be run multiple times for each primitive, including a built-in
			{@code gl_InvocationID} to identify the invocation number;
			""",
		    """
		    support for emitting vertices in a geometry program where each vertex emitted may be directed independently at a specified vertex stream (as
		    provided by ${registryLinkTo("ARB", "transform_feedback3")}), and where each shader output is associated with a stream;
		    """,
		    "support for reading a mask of covered samples in a fragment shader; and",
		    """
		    support for interpolating a fragment shader input at a programmable offset relative to the pixel center, a programmable sample number, or at the
		    centroid.
		    """
		)}

		Requires ${GL32.link} and GLSL 1.50. ${GL40.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramiv.",

		"GEOMETRY_SHADER_INVOCATIONS" _ 0x887F
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.",

		"MAX_GEOMETRY_SHADER_INVOCATIONS" _ 0x8E5A,
		"MIN_FRAGMENT_INTERPOLATION_OFFSET" _ 0x8E5B,
		"MAX_FRAGMENT_INTERPOLATION_OFFSET" _ 0x8E5C,
		"FRAGMENT_INTERPOLATION_OFFSET_BITS" _ 0x8E5D,
		"MAX_VERTEX_STREAMS" _ 0x8E71
	)
}