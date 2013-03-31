/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

fun khr_icd() = "KHRICD".nativeClassCL("khr_icd", "KHR") {
	nativeImport (
		"OpenCL.h"
	)

	javaDoc("Native bindings to the ${link("http://www.khronos.org/registry/cl/extensions/khr/cl_$templateName.txt", templateName)} extension.")

	IntConstant.block(
		"Accepted as {@code param_name} to the function clGetPlatformInfo.",

		"PLATFORM_ICD_SUFFIX_KHR" _ 0x0920
	)

	IntConstant.block(
		"Returned by clGetPlatformIDs when no platforms are found.",

		"PLATFORM_NOT_FOUND_KHR" _ -1001
	)

}