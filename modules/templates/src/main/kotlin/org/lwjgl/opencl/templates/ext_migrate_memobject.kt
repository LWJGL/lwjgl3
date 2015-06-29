/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val ext_migrate_memobject = "EXTMigrateMemobject".nativeClassCL("ext_migrate_memobject", EXT) {
	nativeImport (
		"OpenCL.h"
	)

	documentation =
		"""
		Native bindings to the $extensionLink extension.

		This extension defines a mechanism for assigning which device an OpenCL memory object resides.
		"""

	IntConstant(
		"This flag specifies that the specified set of memory objects are to be migrated to the host, regardless of the target command queue.",

		"MIGRATE_MEM_OBJECT_HOST_EXT" _ 0x1
	)

	IntConstant(
		"Returned in the {@code param_value} parameter of the clGetEventInfo when {@code param_name} is CL10#EVENT_COMMAND_TYPE.",

		"COMMAND_MIGRATE_MEM_OBJECT_EXT" _ 0x4040
	)

	cl_int(
		"EnqueueMigrateMemObjectEXT",
		"""
		Provides the application with a way to indicate which device a set of memory objects should be associated. Typically, memory objects are implicitly
		migrated to a device for which enqueued commands, using the memory object, are targeted. clEnqueueMigrateMemObjectEXT allows this migration to be
		explicitly performed ahead of the dependent commands. This permits an application to overlap the placement of memory objects with other unrelated
		operations. Once the OpenCL event, returned from clEnqueueMigrateMemObject, has been marked CL10#COMPLETE the memory objects specified in
		{@code mem_objects} have been successfully migrated to the device associated with {@code command_queue}. The migrated memory object shall remain
		resident on the device until another command is enqueued that either implicitly or explicitly migrates it away. As well, clEnqueueMigrateMemObjectEXT
		can be used to direct the initial placement of a memory object, after creation, possibly avoiding the initial overhead of instantiating the object on
		the first enqueued command to use it.

		The user is responsible for managing the event dependencies, associated with this command, in order to avoid overlapping access to memory objects.
		Improperly specified event dependencies passed to clEnqueueMigrateMemObject could result in undefined results.
		""",

		cl_command_queue.IN("command_queue", "a valid command queue"),
		AutoSize("mem_objects") _ cl_uint.IN("num_mem_objects", "the number of memory objects specified in the {@code mem_objects} argument"),
		const _ cl_mem_p.IN("mem_objects", "the memory objects to migrate to the OpenCL device associated with {@code command_queue}"),
		cl_mem_migration_flags_ext.IN("flags", "a bitfield that is used to specify migration options", "0 #MIGRATE_MEM_OBJECT_HOST_EXT"),
		NEWL,
		EWL,
		EVENT
	)

}