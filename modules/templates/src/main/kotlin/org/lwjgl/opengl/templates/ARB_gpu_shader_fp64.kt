/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_gpu_shader_fp64 = "ARBGPUShaderFP64".nativeClassGL("ARB_gpu_shader_fp64") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension allows GLSL shaders to use double-precision floating-point data types, including vectors and matrices of doubles. Doubles may be used as
		inputs, outputs, and uniforms.

		The shading language supports various arithmetic and comparison operators on double-precision scalar, vector, and matrix types, and provides a set of
		built-in functions including:
		${ul(
			"square roots and inverse square roots;",
		    "fused floating-point multiply-add operations;",
		    """
		    splitting a floating-point number into a significand and exponent (frexp), or building a floating-point number from a significand and exponent
		    (ldexp);
		    """,
		    """
		    absolute value, sign tests, various functions to round to an integer value, modulus, minimum, maximum, clamping, blending two values, step
		    functions, and testing for infinity and NaN values;
		    """,
		    "packing and unpacking doubles into a pair of 32-bit unsigned integers;",
		    "matrix component-wise multiplication, and computation of outer products, transposes, determinants, and inverses; and",
		    "vector relational functions."
		)}

		Double-precision versions of angle, trigonometry, and exponential functions are not supported.

		Implicit conversions are supported from integer and single-precision floating-point values to doubles, and this extension uses the relaxed function
		overloading rules specified by the ARB_gpu_shader5 extension to resolve ambiguities.

		This extension provides API functions for specifying double-precision uniforms in the default uniform block, including functions similar to the uniform
		functions added by ${registryLinkTo("EXT", "direct_state_access")} (if supported).

		This extension provides an "LF" suffix for specifying double-precision constants. Floating-point constants without a suffix in GLSL are treated as
		single-precision values for backward compatibility with versions not supporting doubles; similar constants are treated as double-precision values in the
		"C" programming language.

		This extension does not support interpolation of double-precision values; doubles used as fragment shader inputs must be qualified as "flat".
		Additionally, this extension does not allow vertex attributes with 64-bit components. That support is added separately by
		${registryLinkTo("EXT", "vertex_attrib_64bit")}.

		Requires ${GL32.link} and GLSL 1.50. ${GL40.promoted}
		"""

	IntConstant(
		"Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.",

		"DOUBLE_VEC2" _ 0x8FFC,
		"DOUBLE_VEC3" _ 0x8FFD,
		"DOUBLE_VEC4" _ 0x8FFE,
		"DOUBLE_MAT2" _ 0x8F46,
		"DOUBLE_MAT3" _ 0x8F47,
		"DOUBLE_MAT4" _ 0x8F48,
		"DOUBLE_MAT2x3" _ 0x8F49,
		"DOUBLE_MAT2x4" _ 0x8F4A,
		"DOUBLE_MAT3x2" _ 0x8F4B,
		"DOUBLE_MAT3x4" _ 0x8F4C,
		"DOUBLE_MAT4x2" _ 0x8F4D,
		"DOUBLE_MAT4x3" _ 0x8F4E
	)

	GL40 reuse "Uniform1d"
	GL40 reuse "Uniform2d"
	GL40 reuse "Uniform3d"
	GL40 reuse "Uniform4d"
	GL40 reuse "Uniform1dv"
	GL40 reuse "Uniform2dv"
	GL40 reuse "Uniform3dv"
	GL40 reuse "Uniform4dv"

	GL40 reuse "UniformMatrix2dv"
	GL40 reuse "UniformMatrix3dv"
	GL40 reuse "UniformMatrix4dv"
	GL40 reuse "UniformMatrix2x3dv"
	GL40 reuse "UniformMatrix2x4dv"
	GL40 reuse "UniformMatrix3x2dv"
	GL40 reuse "UniformMatrix3x4dv"
	GL40 reuse "UniformMatrix4x2dv"
	GL40 reuse "UniformMatrix4x3dv"

	GL40 reuse "GetUniformdv"

	val program = GLuint.IN("program", "the program object to update")
	
	var src = GL40["Uniform1d"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniform1dEXT",
		"DSA version of #Uniform1d().",

		program,
		src["location"],
		src["x"]
	)

	src = GL40["Uniform2d"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniform2dEXT",
		"DSA version of #Uniform2d().",

		program,
		src["location"],
		src["x"],
		src["y"]
	)

	src = GL40["Uniform3d"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniform3dEXT",
		"DSA version of #Uniform3d().",

		program,
		src["location"],
		src["x"],
		src["y"],
		src["z"]
	)

	src = GL40["Uniform4d"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniform4dEXT",
		"DSA version of #Uniform4d().",

		program,
		src["location"],
		src["x"],
		src["y"],
		src["z"],
		src["w"]
	)

	src = GL40["Uniform1dv"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniform1dvEXT",
		"DSA version of #Uniform1dv().",

		program,
		src["location"],
		src["count"],
		src["value"]
	)

	src = GL40["Uniform2dv"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniform2dvEXT",
		"DSA version of #Uniform2dv().",

		program,
		src["location"],
		src["count"],
		src["value"]
	)

	src = GL40["Uniform3dv"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniform3dvEXT",
		"DSA version of #Uniform3dv().",

		program,
		src["location"],
		src["count"],
		src["value"]
	)

	src = GL40["Uniform4dv"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniform4dvEXT",
		"DSA version of #Uniform4dv().",

		program,
		src["location"],
		src["count"],
		src["value"]
	)

	src = GL40["UniformMatrix2dv"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniformMatrix2dvEXT",
		"DSA version of #UniformMatrix2dv().",

		program,
		src["location"],
		src["count"],
		src["transpose"],
		src["value"]
	)

	src = GL40["UniformMatrix3dv"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniformMatrix3dvEXT",
		"DSA version of #UniformMatrix3dv().",

		program,
		src["location"],
		src["count"],
		src["transpose"],
		src["value"]
	)

	src = GL40["UniformMatrix4dv"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniformMatrix4dvEXT",
		"DSA version of #UniformMatrix4dv().",

		program,
		src["location"],
		src["count"],
		src["transpose"],
		src["value"]
	)

	src = GL40["UniformMatrix2x3dv"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniformMatrix2x3dvEXT",
		"DSA version of #UniformMatrix2x3dv().",

		program,
		src["location"],
		src["count"],
		src["transpose"],
		src["value"]
	)

	src = GL40["UniformMatrix2x4dv"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniformMatrix2x4dvEXT",
		"DSA version of #UniformMatrix2x4dv().",

		program,
		src["location"],
		src["count"],
		src["transpose"],
		src["value"]
	)

	src = GL40["UniformMatrix3x2dv"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniformMatrix3x2dvEXT",
		"DSA version of #UniformMatrix3x2dv().",

		program,
		src["location"],
		src["count"],
		src["transpose"],
		src["value"]
	)

	src = GL40["UniformMatrix3x4dv"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniformMatrix3x4dvEXT",
		"DSA version of #UniformMatrix3x4dv().",

		program,
		src["location"],
		src["count"],
		src["transpose"],
		src["value"]
	)

	src = GL40["UniformMatrix4x2dv"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniformMatrix4x2dvEXT",
		"DSA version of #UniformMatrix4x2dv().",

		program,
		src["location"],
		src["count"],
		src["transpose"],
		src["value"]
	)

	src = GL40["UniformMatrix4x3dv"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"ProgramUniformMatrix4x3dvEXT",
		"DSA version of #UniformMatrix4x3dv().",

		program,
		src["location"],
		src["count"],
		src["transpose"],
		src["value"]
	)
}