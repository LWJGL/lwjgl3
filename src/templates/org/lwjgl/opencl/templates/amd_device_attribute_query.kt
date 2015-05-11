/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val amd_device_attribute_query = "AMDDeviceAttributeQuery".nativeClassCL("amd_device_attribute_query", AMD) {
	documentation =
		"""
		Native bindings to the $extensionLink extension.

		This extension provides a means to query AMD-specific device attributes.
		"""

	IntConstant(
		"Accepted as the {@code param_name} parameter of CL10#GetDeviceInfo().",

		"DEVICE_PROFILING_TIMER_OFFSET_AMD" _ 0x4036,

		"DEVICE_GLOBAL_FREE_MEMORY_AMD" _ 0x4039,
		"DEVICE_SIMD_PER_COMPUTE_UNIT_AMD" _ 0x4040,
		"DEVICE_SIMD_WIDTH_AMD" _ 0x4041,
		"DEVICE_SIMD_INSTRUCTION_WIDTH_AMD" _ 0x4042,
		"DEVICE_WAVEFRONT_WIDTH_AMD" _ 0x4043,
		"DEVICE_GLOBAL_MEM_CHANNELS_AMD" _ 0x4044,
		"DEVICE_GLOBAL_MEM_CHANNEL_BANKS_AMD" _ 0x4045,
		"DEVICE_GLOBAL_MEM_CHANNEL_BANK_WIDTH_AMD" _ 0x4046,
		"DEVICE_LOCAL_MEM_SIZE_PER_COMPUTE_UNIT_AMD" _ 0x4047,
		"DEVICE_LOCAL_MEM_BANKS_AMD" _ 0x4048
	)
}