/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val amd_bus_addressable_memory = "AMDBusAddressableMemory".nativeClassCL("amd_bus_addressable_memory", AMD) {
	nativeImport(
		"OpenCL.h"
	)

	documentation =
		"""
		Native bindings to the $extensionLink extension.

		This extension defines an API that allows improved control of the physical memory used by the graphics device.

		It allows to share a memory allocated by the Graphics driver to be used by other device on the bus by exposing a write-only bus address. One example of
		application would be a video capture device which would DMA into the GPU memory.

		It also offers the reverse operation of specifying a buffer allocated on another device to be used for write access by the GPU.
		"""

	IntConstant(
		"""
		Accepted by the {@code flags} parameter of CL10#CreateBuffer().

		This flag specifies that the application wants the OpenCL implementation to create a buffer that can be accessed by remote device DMA.

		#MEM_BUS_ADDRESSABLE_AMD, CL10#MEM_ALLOC_HOST_PTR and CL10#MEM_USE_HOST_PTR are mutually exclusive.
		""",

		"MEM_BUS_ADDRESSABLE_AMD" expr "1<<30"
	)

	IntConstant(
		"""
		Accepted by the {@code flags} parameter of CL10#CreateBuffer().

		This flag specifies that the application wants the OpenCL implementation to create a buffer from an already allocated memory on remote device.

		#MEM_EXTERNAL_PHYSICAL_AMD, CL10#MEM_ALLOC_HOST_PTR, CL10#MEM_COPY_HOST_PTR and CL10#MEM_USE_HOST_PTR are mutually exclusive.

		#MEM_EXTERNAL_PHYSICAL_AMD, CL10#MEM_READ_WRITE and CL10#MEM_READ_ONLY are mutually exclusive.
		""",

		"MEM_EXTERNAL_PHYSICAL_AMD" expr "1<<31"
	)

	IntConstant(
		"New command types for the events returned by the $extensionName functions.",

		"COMMAND_WAIT_SIGNAL_AMD" _ 0x4080,
		"COMMAND_WRITE_SIGNAL_AMD" _ 0x4081,
		"COMMAND_MAKE_BUFFERS_RESIDENT_AMD" _ 0x4082
	)

	cl_int(
		"EnqueueWaitSignalAMD",
		"Instructs the OpenCL to wait until {@code value} is written to {@code buffer} before issuing the next command.",

		cl_command_queue.IN("command_queue", "a command-queue"),
		cl_mem.IN("mem_object", "a memory object"),
		cl_uint.IN("value", "the signal value"),
		NEWL,
		EWL,
		EVENT,

	    returnDoc =
	    """
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
		    "$INVALID_MEM_OBJECT is generated if the {@code buffer} parameter of clEnqueueWaitSignalAMD is not a valid buffer.",
	        "$INVALID_COMMAND_QUEUE is generated if the {@code command_queue} parameter of clEnqueueWaitSignalAMD is not a valid command queue.",
	        """
	        $INVALID_MEM_OBJECT is generated if the {@code buffer} parameter of clEnqueueWaitSignalAMD does not represent a buffer allocated with
	        #MEM_BUS_ADDRESSABLE_AMD.
	        """,
		    "$INVALID_VALUE is generated if the signal address used by clEnqueueWaitSignalAMD of {@code bufffer} is invalid (for example 0)."
	    )}
	    """
	)

	cl_int(
		"EnqueueWriteSignalAMD",
		"""
		This command instructs the OpenCL to write {@code value} to the signal address + {@code offset} of {@code buffer} (which must be a buffer created with
		#MEM_EXTERNAL_PHYSICAL_AMD). This should be done after a write operation by the device into that buffer is complete. Consecutive marker values must
		keep increasing.
		""",

		cl_command_queue.IN("command_queue", "a command-queue"),
		cl_mem.IN("mem_object", "a memory object"),
		cl_uint.IN("value", "the signal value"),
		cl_ulong.IN("offset", "the write offset"),
		NEWL,
		EWL,
		EVENT,

	    returnDoc =
	    """
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
		    "$INVALID_MEM_OBJECT is generated if the {@code buffer} parameter of clEnqueueWriteSignalAMD is not a valid buffer.",
	        "$INVALID_COMMAND_QUEUE is generated if the {@code command_queue} parameter of clEnqueueWriteSignalAMD is not a valid command queue.",
	        """
	        $INVALID_MEM_OBJECT is generated if the {@code buffer} parameter of clEnqueueWriteSignalAMD does not represent a buffer defined as
	        #MEM_EXTERNAL_PHYSICAL_AMD.
	        """,
	        """
	        $INVALID_BUFFER_SIZE is generated if the {@code offset} parameter of clEnqueueWriteSignalAMD would lead to a write beyond the size of
	        {@code buffer}.
	        """,
	        "$INVALID_VALUE is generated if the signal address used by clEnqueueWriteSignalAMD of {@code bufffer} is invalid (for example 0)."
	    )}
	    """
	)

	cl_int(
		"EnqueueMakeBuffersResidentAMD",
		"""
		The application requires the bus address in order to access the buffers from a remote device. As the OS may rearrange buffers to make space for other
		memory allocation, we must make the buffers resident before trying to access them on remote device.

		This function is used to make buffers resident.
		""",

		cl_command_queue.IN("command_queue", "a command-queue"),
		AutoSize("mem_objects", "bus_addresses") _ cl_uint.IN("num_mem_objs", "the number of memory objects in {@code mem_objects}"),
		const _ cl_mem_p.IN("mem_objects", "a pointer to a list of memory objects created with #MEM_BUS_ADDRESSABLE_AMD flag"),
		cl_bool.IN("blocking_make_resident", "indicates if read operation is <em>blocking</em> or <em>non-blocking</em>"),
		cl_bus_address_amd_p.OUT("bus_addresses", "a pointer to a list of ##CLBusAddressAMD structures"),
		NEWL,
		EWL,
		EVENT,

	    returnDoc =
	    """
	    $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
	    ${ul(
		    "$INVALID_OPERATION is generated if any of the pointer parameters of clEnqueueMakeBuffersResidentAMD are $NULL (and count is &gt; 0).",
	        """
	        $INVALID_OPERATION is generated if any of the mem_objects passed to clEnqueueMakeBuffersResidentAMD was not a valid cl_mem object created with
	        #MEM_BUS_ADDRESSABLE_AMD flag.
	        """,
	        """
	        CL10#OUT_OF_HOST_MEMORY is generated if any of the mem_objects passed to clEnqueueMakeBuffersResidentAMD could not be made resident so that the buffer
	        or signal bus addresses will be returned as 0.
	        """
	    )}
	    """
	)
}