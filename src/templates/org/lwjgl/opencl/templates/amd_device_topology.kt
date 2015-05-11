/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val amd_device_topology = "AMDDeviceTopology".nativeClassCL("amd_device_topology", AMD) {
	documentation =
		"""
		Native bindings to the $extensionName extension.

		This extension enables the developer to get a description of the topology used to connect the device to the host.
		"""

	IntConstant(
		"""
		Accepted as the {@code param_name} parameter of CL10#GetDeviceInfo(). Returns a description of the topology used to connect the device to the
		host, using the following 32-bytes union of structures:
		${codeBlock("""
typedef union
{
	struct { cl_uint type; cl_uint data[5]; } raw;
	struct { cl_uint type; cl_char unused[17]; cl_char bus; cl_char device; cl_char function; } pcie;
} cl_device_topology_amd;
		""")}
		The type of the structure returned can be queried by reading the first unsigned int of the returned data. The developer can use this type to cast the
		returned union into the right structure type.

		Currently, the only supported type in the structure above is #DEVICE_TOPOLOGY_TYPE_PCIE_AMD. The information returned contains the PCI
		Bus/Device/Function of the device, and is similar to the result of the lspci command in Linux. It enables the developer to match between the OpenCL
		device ID and the physical PCI connection of the card.
		""",

		"DEVICE_TOPOLOGY_AMD" _ 0x4037
	)

	IntConstant(
		"Indicates the type of the struct returned by #DEVICE_TOPOLOGY_AMD.",

		"DEVICE_TOPOLOGY_TYPE_PCIE_AMD" _ 1
	)
}