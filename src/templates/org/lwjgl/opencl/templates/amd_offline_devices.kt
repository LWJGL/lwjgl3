/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val amd_offline_devices = "AMDOfflineDevices".nativeClassCL("amd_offline_devices", AMD) {

	documentation = "Native bindings to the $extensionName extension."

	IntConstant(
		"""
		To generate binary images offline, it is necessary to access the compiler for every device that the runtime supports, even if the device is currently
		not installed on the system. When, during context creation, #CONTEXT_OFFLINE_DEVICES_AMD is passed in the context properties, all supported
		devices, whether online or offline, are reported and can be used to create OpenCL binary images.
		""",

		"CONTEXT_OFFLINE_DEVICES_AMD" _ 0x403F
	)

}