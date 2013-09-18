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

	javaDoc("Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/sync.txt", templateName)} extension.")

	IntConstant.block(
		"Accepted as the {@code pname} parameter of GetInteger64v.",

		"MAX_SERVER_WAIT_TIMEOUT" _ 0x9111
	)

	val SyncProperties = IntConstant.block(
		"Accepted as the {@code pname} parameter of GetSynciv.",

		"OBJECT_TYPE" _ 0x9112,
		"SYNC_CONDITION" _ 0x9113,
		"SYNC_STATUS" _ 0x9114,
		"SYNC_FLAGS" _ 0x9115
	).toJavaDocLinks()

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

	Reuse("GL32") _ GLsync.func(
		"FenceSync",
		"Creates a new sync object and inserts it into the GL command stream.",

		GLenum.IN("condition", "the condition that must be met to set the sync object's state to signaled", "#SYNC_GPU_COMMANDS_COMPLETE"),
		GLbitfield.IN(
			"flags",
			"""
			a bitwise combination of flags controlling the behavior of the sync object. No flags are presently defined for this operation and {@code flags} must
			be zero.
			"""
		)
	)

	Reuse("GL32") _ GLboolean.func(
		"IsSync",
		"Determines if a name corresponds to a sync object.",

		GLsync.IN("sync", "a value that may be the name of a sync object")
	)

	Reuse("GL32") _ GLvoid.func(
		"DeleteSync",
		"Deletes a sync object.",

		GLsync.IN("sync", "the sync object to be deleted")
	)

	Reuse("GL32") _ GLenum.func(
		"ClientWaitSync",
		"""
		Causes the client to block and wait for a sync object to become signaled. If {@code sync} is signaled when {@code glClientWaitSync} is called,
		{@code glClientWaitSync} returns immediately, otherwise it will block and wait for up to timeout nanoseconds for {@code sync} to become signaled.

		The return value is one of four status values:
		${ul(
			"${"ALREADY_SIGNALED".link} indicates that sync was signaled at the time that glClientWaitSync was called.",
			"${"TIMEOUT_EXPIRED".link} indicates that at least timeout nanoseconds passed and sync did not become signaled.",
			"${"CONDITION_SATISFIED".link} indicates that sync was signaled before the timeout expired.",
			"${"WAIT_FAILED".link} indicates that an error occurred. Additionally, an OpenGL error will be generated."
		)}
		""",

		GLsync.IN("sync", "the sync object whose status to wait on"),
		GLbitfield.IN("flags", "a bitfield controlling the command flushing behavior", "0 #SYNC_FLUSH_COMMANDS_BIT"),
		GLuint64.IN("timeout", "the timeout, specified in nanoseconds, for which the implementation should wait for {@code sync} to become signaled")
	)

	Reuse("GL32") _ GLvoid.func(
		"WaitSync",
		"""
		Causes the GL server to block and wait for a sync object to become signaled.

		{@code glWaitSync} will always wait no longer than an implementation-dependent timeout. The duration of this timeout in nanoseconds may be queried by
		with ${"MAX_SERVER_WAIT_TIMEOUT".link}. There is currently no way to determine whether glWaitSync unblocked because the timeout expired or because the
		sync object being waited on was signaled.

		If an error occurs, {@code glWaitSync} does not cause the GL server to block.
		""",

		GLsync.IN("sync", "the sync object whose status to wait on"),
		GLbitfield.IN("flags", "a bitfield controlling the command flushing behavior", "0"),
		GLuint64.IN("timeout", "the timeout that the server should wait before continuing", "#TIMEOUT_IGNORED")
	)

	mods(Reuse("GL32"), ReferenceGL("glGet")) _ GLvoid.func(
		"GetInteger64v",
		"Returns the 64bit integer value or values of a selected parameter.",

		GLenum.IN("pname", "the parameter value to be returned"),
		returnValue _ GLint64_p.OUT("params", "the value or values of the specified parameter")
	)

	Reuse("GL32") _ GLvoid.func(
		"GetSynciv",
		"Queries the properties of a sync object.",

		GLsync.IN("sync", "the sync object whose properties to query"),
		GLenum.IN("pname", "the parameter whose value to retrieve from the sync object specified in {@code sync}", SyncProperties),
		AutoSize("values") _ GLsizei.IN("bufSize", "the size of the buffer whose address is given in {@code values}"),
		mods(Check(1), nullable) _ GLsizei_p.OUT("length", "the address of an variable to receive the number of integers placed in {@code values}"),
		returnValue _ GLint_p.OUT("values", "the address of an array to receive the values of the queried parameter")
	)

}
