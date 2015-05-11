/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_spir = "KHRSPIR".nativeClassCL("khr_spir", KHR) {
	documentation =
		"""
		Native bindings to the $extensionLink extension.

		This extension adds support to create an OpenCL program object from a Standard Portable Intermediate Representation (SPIR) instance. SPIR is a vendor
		neutral non-source representation for OpenCL C programs.

		<h3>Compiler Options</h3>
		The compile option {@code -x spir} must be specified to indicate that the binary is in SPIR format, and the compile option {@code -spir-std} must be
		used to specify the version of the SPIR specification that describes the format and meaning of the binary. For example, if the binary is as described
		in SPIR version 1.2, then {@code -spir-std=1.2} must be specified. Failing to specify these compile options may result in implementation defined
		behavior.
		"""

	IntConstant(
		"""
		Accepted by CL10#GetDeviceInfo(). Returns a space separated list of SPIR versions supported by the device. For example returning “1.2 2.0” in this
		query implies that SPIR version 1.2 and 2.0 are supported by the implementation.
		""",

		"DEVICE_SPIR_VERSIONS" _ 0x40E0
	)

	IntConstant(
		"""
		Returned by CL10#GetProgramBuildInfo() when {@code param_name} is CL12#PROGRAM_BINARY_TYPE.

		An intermediate (non-source) representation for the program is loaded as a binary. The program must be further processed with CL12#CompileProgram() or
		CL10#BuildProgram(). If processed with CL12#CompileProgram(), the result will be a binary of type CL12#PROGRAM_BINARY_TYPE_COMPILED_OBJECT or
		CL12#PROGRAM_BINARY_TYPE_LIBRARY. If processed with CL10#BuildProgram(), the result will be a binary of type CL12#PROGRAM_BINARY_TYPE_EXECUTABLE.
		""",

		"PROGRAM_BINARY_TYPE_INTERMEDIATE" _ 0x40E1
	)
}