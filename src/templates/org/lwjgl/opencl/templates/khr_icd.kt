/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_icd = "KHRICD".nativeClassCL("khr_icd", KHR) {
	documentation = "Native bindings to the $extensionLink extension."

	IntConstant(
		"Accepted as {@code param_name} to the function CL10#GetPlatformInfo().",

		"PLATFORM_ICD_SUFFIX_KHR" _ 0x0920
	)

	IntConstant(
		"Returned by CL10#GetPlatformIDs() when no platforms are found.",

		"PLATFORM_NOT_FOUND_KHR" _ -1001
	)

	// clIcdGetPlatformIDsKHR is not exposed through the ICD.

}