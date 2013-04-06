/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

fun amd_bus_addressable_memory() = "AMDBusAddressableMemory".nativeClassCL("amd_bus_addressable_memory", AMD) {
	nativeImport(
		"OpenCL.h"
	)

	javaDoc(
		"""
		Native bindings to the $extensionName extension.

		This extension defines an API for peer-to-peer transfers between AMD GPUs and other PCIe device, such as third-party SDI I/O devices. Peer-to-peer
		transfers have extremely low latencies by not having to use the host's main memory or the CPU. This extension allows sharing a memory allocated by the
		graphics driver to be used by other devices on the PCIe bus (peer-to-peer transfers) by exposing a write-only bus address. It also allows memory
		allocated on other PCIe devices (non-AMD GPU) to be directly accessed by AMD GPUs. One possible use of this is for a video capture device to directly
		write into the GPU memory using its DMA. This extension is supported only on AMD FirePro™ professional graphics cards.
		"""
	)

	IntConstant.block(
		"cl_mem flag - bitfield",

		"MEM_BUS_ADDRESSABLE_AMD".expr<Int>("1 << 30"),
		"MEM_EXTERNAL_PHYSICAL_AMD".expr<Int>("1 << 31")
	)

	IntConstant.block(
		"Commands",

		"COMMAND_WAIT_SIGNAL_AMD" _ 0x4080,
		"COMMAND_WRITE_SIGNAL_AMD" _ 0x4081,
		"COMMAND_MAKE_BUFFERS_RESIDENT_AMD" _ 0x4082
	)

	// TODO: Update documentation if possible

	cl_int.func(
		"EnqueueWaitSignalAMD",
		"Enqueues a wait signal.",

		cl_command_queue.IN("command_queue", "a command-queue"),
		cl_mem.IN("mem_object", "a memory object"),
		cl_uint.IN("value", "the signal value"),
		NEWL,
		EWL,
		EVENT
	)

	cl_int.func(
		"EnqueueWriteSignalAMD",
		"Enqueues a write signal.",

		cl_command_queue.IN("command_queue", "a command-queue"),
		cl_mem.IN("mem_object", "a memory object"),
		cl_uint.IN("value", "the signal value"),
		cl_ulong.IN("offset", "the write offset"),
		NEWL,
		EWL,
		EVENT
	)

	cl_int.func(
		"EnqueueMakeBuffersResidentAMD",
		"Enqueues a command to make buffers resident.",

		cl_command_queue.IN("command_queue", "a command-queue"),
		AutoSize("mem_objects") _ cl_uint.IN("num_mem_objs", "the number of memory objects in {@code mem_objects}"),
		cl_mem_p.IN("mem_objects", "a pointer to a list of memory objects"),
		cl_bool.IN("blocking_make_resident", "indicates if read operation is <em>blocking</em> or <em>non-blocking</em>"),
		// TODO: This is OUT right?
		cl_bus_address_amd_p.OUT("bus_addresses", "a {@link cl_bus_address_amd} structure"),
		NEWL,
		EWL,
		EVENT
	)

}