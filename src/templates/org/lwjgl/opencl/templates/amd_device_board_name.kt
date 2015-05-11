/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val amd_device_board_name = "AMDDeviceBoardName".nativeClassCL("amd_device_board_name", AMD) {
	documentation =
		"""
		Native bindings to the $extensionName extension.

		This query enables the developer to get the name of the GPU board and model of the specific device. Currently, this is only for GPU devices.
		"""

	IntConstant(
		"""
		Accepted as the {@code param_name} parameter of CL10#GetDeviceInfo(). Returns the name of the GPU board and model of the specific device.

		Currently, this is only for GPU devices. The returned name is a 128-character value.
		""",

		"DEVICE_BOARD_NAME_AMD" _ 0x4038
	)
}