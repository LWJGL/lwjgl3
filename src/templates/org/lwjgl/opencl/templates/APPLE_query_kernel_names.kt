/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val APPLE_query_kernel_names = "APPLEQueryKernelNames".nativeClassCL("APPLE_query_kernel_names", APPLE) {
	documentation =
		"""
		Native bindings to the $extensionName extension.

		These selectors may be passed to CL10#GetProgramInfo() to obtain information about the kernel functions in a {@code cl_program}. The {@code cl_program}
		must be successfully built with CL10#BuildProgram() for at least one device to succeed. Otherwise $INVALID_PROGRAM_EXECUTABLE is returned.
		"""

	IntConstant(
		"Returns a cl_uint for number of kernels in program.",

		"PROGRAM_NUM_KERNELS_APPLE" _ 0x10000004
	)

	IntConstant(
		"Returns a ';' delimited char[] containing the names of kernels in program.",

		"PROGRAM_KERNEL_NAMES_APPLE" _ 0x10000005
	)
}