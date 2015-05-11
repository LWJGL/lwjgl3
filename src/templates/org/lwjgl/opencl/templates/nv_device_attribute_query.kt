/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val nv_device_attribute_query = "NVDeviceAttributeQuery".nativeClassCL("nv_device_attribute_query", NV) {

	documentation =
		"""
		Native bindings to the $extensionLink extension.

		This extension provides a mechanism to query device attributes specific to <strong>NVIDIA</strong> hardware. This will enable the programmer to
		optimize OpenCL kernels based on the specifics of the hardware.
		"""

	IntConstant(
		"Returns the major revision number that defines the CUDA compute capability of the device.",
		"DEVICE_COMPUTE_CAPABILITY_MAJOR_NV" _ 0x4000
	)

	IntConstant(
		"Returns the minor revision number that defines the CUDA compute capability of the device.",
		"DEVICE_COMPUTE_CAPABILITY_MINOR_NV" _ 0x4001
	)

	IntConstant(
		"Maximum number of 32-bit registers available to a work-group; this number is shared by all work-groups simultaneously resident on a multiprocessor.",
		"DEVICE_REGISTERS_PER_BLOCK_NV" _ 0x4002
	)

	IntConstant(
		"Warp size in work-items.",
		"DEVICE_WARP_SIZE_NV" _ 0x4003
	)

	IntConstant(
		"Returns $TRUE if the device can concurrently copy memory between host and device while executing a kernel, or $FALSE if not.",
		"DEVICE_GPU_OVERLAP_NV" _ 0x4004
	)

	IntConstant(
		"Returns $TRUE if there is a run time limit for kernels executed on the device, or $FALSE if not.",
		"DEVICE_KERNEL_EXEC_TIMEOUT_NV" _ 0x4005
	)

	IntConstant(
		"Returns $TRUE if the device is integrated with the memory subsystem, or $FALSE if not.",
		"DEVICE_INTEGRATED_MEMORY_NV" _ 0x4006
	)

}