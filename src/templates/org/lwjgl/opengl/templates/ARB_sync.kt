/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.opengl.*

fun ARB_sync() = "ARBSync".nativeClassGL("ARB_sync") {
	nativeImport (
		"OpenGL.h"
	)

	documentation = "Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/sync.txt", templateName)} extension."

	IntConstant.block(
		"Accepted as the {@code pname} parameter of GetInteger64v.",

		"MAX_SERVER_WAIT_TIMEOUT" _ 0x9111
	)

	IntConstant.block(
		"Accepted as the {@code pname} parameter of GetSynciv.",

		"OBJECT_TYPE" _ 0x9112,
		"SYNC_CONDITION" _ 0x9113,
		"SYNC_STATUS" _ 0x9114,
		"SYNC_FLAGS" _ 0x9115
	)

	IntConstant.block(
		"Returned in {@code values} for GetSynciv {@code pname} OBJECT_TYPE.",

		"SYNC_FENCE" _ 0x9116
	)

	IntConstant.block(
		"Returned in {@code values} for GetSynciv {@code pname} SYNC_CONDITION.",

		"SYNC_GPU_COMMANDS_COMPLETE" _ 0x9117
	)

	IntConstant.block(
		"Returned in {@code values} for GetSynciv {@code pname} SYNC_STATUS.",

		"UNSIGNALED" _ 0x9118,
		"SIGNALED" _ 0x9119
	)

	IntConstant.block(
		"Accepted in the {@code flags} parameter of ClientWaitSync.",

		"SYNC_FLUSH_COMMANDS_BIT" _ 0x00000001
	)

	LongConstant.block(
		"Accepted in the {@code timeout} parameter of WaitSync.",

		"TIMEOUT_IGNORED".expr<Long>("0xFFFFFFFFFFFFFFFFl") // TODO: http://youtrack.jetbrains.com/issue/KT-2780
	)

	IntConstant.block(
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
