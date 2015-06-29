/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.opengl.*

val ARB_sync = "ARBSync".nativeClassGL("ARB_sync") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension introduces the concept of "sync objects". Sync objects are a synchronization primitive - a representation of events whose completion
		status can be tested or waited upon. One specific type of sync object, the "fence sync object", is supported in this extension, and additional types can
		easily be added in the future.

		Fence sync objects have corresponding fences, which are inserted into the OpenGL command stream at the time the sync object is created. A sync object
		can be queried for a given condition. The only condition supported for fence sync objects is completion of the corresponding fence command. Fence
		completion allows applications to request a partial Finish, wherein all commands prior to the fence will be forced to complete before control is
		returned to the calling process.

		These new mechanisms allow for synchronization between the host CPU and the GPU, which may be accessing the same resources (typically memory), as well
		as between multiple GL contexts bound to multiple threads in the host CPU.

		Requires ${GL31.core}. ${GL32.promoted}
		"""

	IntConstant(
		"Accepted as the {@code pname} parameter of GetInteger64v.",

		"MAX_SERVER_WAIT_TIMEOUT" _ 0x9111
	)

	IntConstant(
		"Accepted as the {@code pname} parameter of GetSynciv.",

		"OBJECT_TYPE" _ 0x9112,
		"SYNC_CONDITION" _ 0x9113,
		"SYNC_STATUS" _ 0x9114,
		"SYNC_FLAGS" _ 0x9115
	)

	IntConstant(
		"Returned in {@code values} for GetSynciv {@code pname} OBJECT_TYPE.",

		"SYNC_FENCE" _ 0x9116
	)

	IntConstant(
		"Returned in {@code values} for GetSynciv {@code pname} SYNC_CONDITION.",

		"SYNC_GPU_COMMANDS_COMPLETE" _ 0x9117
	)

	IntConstant(
		"Returned in {@code values} for GetSynciv {@code pname} SYNC_STATUS.",

		"UNSIGNALED" _ 0x9118,
		"SIGNALED" _ 0x9119
	)

	IntConstant(
		"Accepted in the {@code flags} parameter of ClientWaitSync.",

		"SYNC_FLUSH_COMMANDS_BIT" _ 0x00000001
	)

	LongConstant(
		"Accepted in the {@code timeout} parameter of WaitSync.",

		"TIMEOUT_IGNORED" expr "0xFFFFFFFFFFFFFFFFl" // TODO: http://youtrack.jetbrains.com/issue/KT-2780
	)

	IntConstant(
		"Returned by ClientWaitSync.",

		"ALREADY_SIGNALED" _ 0x911A,
		"TIMEOUT_EXPIRED" _ 0x911B,
		"CONDITION_SATISFIED" _ 0x911C,
		"WAIT_FAILED" _ 0x911D
	)

	GL32 reuse "FenceSync"
	GL32 reuse "IsSync"
	GL32 reuse "DeleteSync"
	GL32 reuse "ClientWaitSync"
	GL32 reuse "WaitSync"
	GL32 reuse "GetInteger64v"
	GL32 reuse "GetSynciv"

}
