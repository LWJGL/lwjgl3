/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun ARB_buffer_storage() = "ARBBufferStorage".nativeClassGL("ARB_buffer_storage") {
	nativeImport (
		"OpenGL.h"
	)

	documentation = "Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/buffer_storage.txt", templateName)} extension."

	val BufferStorageFlags = IntConstant.block(
		"Accepted in the {@code flags} parameter of ${"BufferStorage()".link} and ${"EXTDirectStateAccess#NamedBufferStorageEXT()".link}.",

		"MAP_PERSISTENT_BIT" _ 0x0040,
		"MAP_COHERENT_BIT" _ 0x0080,
		"DYNAMIC_STORAGE_BIT" _ 0x0100,
		"CLIENT_STORAGE_BIT" _ 0x0200
	).toJavaDocLinks()

	IntConstant.block(
		"Accepted by the {@code pname} parameter of {@code GetBufferParameter&#123;i|i64&#125;v}.",

		"BUFFER_IMMUTABLE_STORAGE" _ 0x821F,
		"BUFFER_STORAGE_FLAGS" _ 0x8220
	)

	IntConstant.block(
		"Accepted by the {@code barriers} parameter of ${"GL42#MemoryBarrier()".link}.",

		"CLIENT_MAPPED_BUFFER_BARRIER_BIT" _ 0x00004000
	)

	val BufferStorage = (Reuse("GL44") _ GLvoid.func(
		"BufferStorage",
		"""
		Creates the data store of a buffer object.

		The data store of the buffer object bound to {@code target} is allocated as a result of a call to this function and cannot be de-allocated until the
		buffer is deleted with a call to ${"GL15#DeleteBuffers()".link}. Such a store may not be re-allocated through further calls to {@code BufferStorage}
		or ${"GL15#BufferData()".link}.

		{@code BufferStorage} deletes any existing data store. If any portion of the buffer object is mapped in the current context or any context current to
		another thread, it is as though ${"GL15#UnmapBuffer()".link} is executed in each such context prior to deleting the existing data store.
		""",

		GLenum.IN("target", "the buffer object target", BUFFER_OBJECT_TARGETS),
		AutoSize("data") _ GLsizeiptr.IN("size", "the size of the data store in basic machine units"),
		mods(
			const,
			optional,
			MultiType(
				PointerMapping.DATA_BYTE,
				PointerMapping.DATA_SHORT,
				PointerMapping.DATA_INT,
				PointerMapping.DATA_FLOAT,
				PointerMapping.DATA_DOUBLE
			)
		) _ GLvoid_p.IN(
			"data",
			"""
			the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is $NULL, the data store of the
			buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
			"""
		),
		GLbitfield.IN(
			"flags",
			"""
			the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
			are as follows:
			${ul(
			    """
			    ${"DYNAMIC_STORAGE_BIT".link} &ndash; The contents of the data store may be updated after creation through calls to
			    ${"GL15#BufferSubData()".link}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
			    argument may be used to specify the initial content of the buffer's data store regardless of the presence of the ${"DYNAMIC_STORAGE_BIT".link}.
				Regardless of the presence of this bit, buffers may always be updated with server-side calls such as ${"GL31#CopyBufferSubData()".link} and
				${"GL43#ClearBufferSubData()".link}.
				""",
				"""
				${"GL30#MAP_READ_BIT".link} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
				obtained that may be read from.
				""",
				"""
			    ${"GL30#MAP_WRITE_BIT".link} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
			    space obtained that may be written to.
				""",
				"""
			    ${"MAP_PERSISTENT_BIT".link} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
			    pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.
				""",
				"""
			    ${"MAP_COHERENT_BIT".link} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
			    coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
			    immediately visible to the other with no further action taken by the application. In particular:
			    ${ul(
					"""
					If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the ${"GL42#MemoryBarrier()".link} command with
					the ${"CLIENT_MAPPED_BUFFER_BARRIER_BIT".link} set, then in subsequent commands the server will see the writes.
					""",
					"If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.",
					"""
			        If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call ${"GL42#MemoryBarrier()".link} with the
			        ${"CLIENT_MAPPED_BUFFER_BARRIER_BIT".link} set and then call ${"GL32#FenceSync()".link} with ${"GL32#SYNC_GPU_COMMANDS_COMPLETE".link} (or
			        ${"GL11#Finish()".link}). Then the CPU will see the writes after the sync is complete.
					""",
					"""
			        If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call ${"GL32#FenceSync()".link} with
			        ${"GL32#SYNC_GPU_COMMANDS_COMPLETE".link} (or ${"GL11#Finish()".link}). Then the CPU will see the writes after the sync is complete.
					"""
			    )}
				""",
				"""
			    ${"CLIENT_STORAGE_BIT".link} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
			    implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.
				"""
			)}

			If {@code flags} contains ${"MAP_PERSISTENT_BIT".link}, it must also contain at least one of ${"GL30#MAP_READ_BIT".link} or ${"GL30#MAP_WRITE_BIT".link}.

			It is an error to specify ${"MAP_COHERENT_BIT".link} without also specifying ${"MAP_PERSISTENT_BIT".link}.
			"""
		)
	)).javaDocLink

	DependsOn("GL_EXT_direct_state_access") _ GLvoid.func(
		"NamedBufferStorageEXT",
		"""
		Behaves similarly to $BufferStorage, except that the buffer whose storage is to be defined is specified by {@code buffer} rather than by the current
		binding to @code target}.
		""",

		GLuint.IN("buffer", "the buffer object"),
		GLsizeiptr.IN("size", "the size of the data store in basic machine units"),
		const _ GLvoid_p.IN(
			"data",
			"""
			the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is $NULL, the data store of the
			buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
			"""
		),
		GLbitfield.IN(
			"flags",
			"the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application",
			"GL30#MAP_READ_BIT GL30#MAP_WRITE_BIT".links + BufferStorageFlags
		)
	)

}